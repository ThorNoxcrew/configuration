#!/usr/bin/env python

import signal
import subprocess
import sys
import time
import urllib.request
import os

proxy = subprocess.Popen("kubectl --namespace ops port-forward service/consul-server 8500:8500", env=os.environ, shell=True)
socket_open = False
attempts = 0

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

subprocess.call(" ".join(sys.argv[1:]), env=os.environ, shell=True)
proxy.send_signal(signal.SIGINT)
proxy.communicate()