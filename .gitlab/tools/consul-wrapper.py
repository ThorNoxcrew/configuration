#!/usr/bin/env python

import signal
import subprocess
import sys
import time
import urllib.request
import os

def is_port_in_use(port: int) -> bool:
    import socket
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        return s.connect_ex(('localhost', port)) == 0

attempts = 0

while True:
    try:
        if not is_port_in_use(int(8500)):
            print("[wrapper] Port is available, attempting to portforward...")
            global proxy
            proxy = subprocess.Popen("kubectl port-forward -n ops svc/consul-server --address 127.0.0.1 8500:8500", env=os.environ, shell=True)
            attempts = 0
            break
        else:
            raise Exception
    except:
        print("[wrapper] Port is already in use")

    attempts = attempts + 1
    if attempts > 20:
        print("[wrapper] Failed to start consul wrapper...")
        exit(1)
    time.sleep(2)

socket_open = False

while True:
    time.sleep(2)
    try:
        if urllib.request.urlopen("http://127.0.0.1:8500").getcode() == 200:
            socket_open = True
        else:
            raise Exception
    except:
        print("[wrapper] Port is not open")
        sys.stdout.flush()
    attempts = attempts + 1
    if attempts > 20 or socket_open:
        break

if proxy.returncode != None or not socket_open:
    print("[wrapper] Failed to start consul wrapper...")
    exit(1)

wrapped_cmd = subprocess.Popen(" ".join(sys.argv[1:]), env=os.environ, shell=True)
wrapped_cmd_streamdata = wrapped_cmd.communicate()[0]
wrapped_cmd_rc = wrapped_cmd.returncode
print("Wrapped command returned code {}".format(wrapped_cmd_rc))
proxy.send_signal(signal.SIGINT)
proxy.communicate()
sys.exit(wrapped_cmd_rc)
