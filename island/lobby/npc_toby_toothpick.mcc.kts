import com.noxcrew.mcc.commons.base.i18n.I18n
import com.noxcrew.mcc.commons.base.inject

mccScript {
    val i18n: I18n by inject()

// Foreman of construction area to left of HUB. Foremerly a space explorer.
    playerNPC(
        absoluteVec(404.5, 34.0, 630.0),
        "Foreman Toby",
        "ewogICJ0aW1lc3RhbXAiIDogMTYzMjg0NzI4NzY4MywKICAicHJvZmlsZUlkIiA6ICIxYWZhZjc2NWI1ZGY0NjA3YmY3ZjY1ZGYzYWIwODhhOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3lfQmxvb2RBbmdlbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kNjAyNzg2ZWIxNTI3ZTIxN2NlYWQzMTIxYjgzNTA1ZjYwOTQ0Nzc4MmQ3ZGY1NWMzYjk2NmI5Y2Y4NDMxMmU5IgogICAgfQogIH0KfQ==",
        "nO9E1ncHE5W7fL+i3psH3oYPmsDKXwFP6bfOwRqRm5CCcpXoHs+iURWdyPYRLKpQZPnsyIP19RDSySBpA/eMRHX1L2lTSiO5qOZo2G+j+5N9pXJ0JFYVL4VmJ5SkgSPxHiDoYCSYs5TL0GYixTPYdsrNGPq5plsqp5PRpJ9cFl9YOzQC6GlRUVj+UlfJOvu53ojAzX7eCLCHvlopM2LQGrXa+XWZdymmRcZqQfk/7N/6/IZfTujpBMGxMa2HLX0gd+42YUYH0duH6y+fSh+qC5xffjR73ogR68HN3KlfpW3O91v0ONse6yz2Wq9J2wS2509QPpM7bmlQTtdu9NkRoxqaNkcFMgNxuXtkgVSIWIGK8O6LE6ZyhBVSrUDrM9KkbcxSZhAgBgJeXvISmNtpCqkdYAPuyb8WGWpzEEIQ9wnCGRP/2IBFsD2Kp6HDN7t+QUL2+F28Mqq9WqBzkH0T1tOVxQly0X1+1D3VojTgi3pOidpCBN5ygrFsg2WIF1Hcve57KwHfpgXqwKtps7N/TPjdMa9foTRq0G9OjFsDYOHmJkDimd10ngrhvc0RzjnG8jZNGAW8BL1UQhsa2KdltGCsUSfQGSl6Ucemw6FwTe6Oxej38kcQ1ROmD/15g82EMWJ/BhuI03y9YmxE4WXUyKyTfbHKNa/zI9YGD58P/CA="
    ) {
        rotation(145.0, 0.0)
        lookClosePerPlayer(6)
        cooldown(1.seconds)

        type("ambient")
    }
}
