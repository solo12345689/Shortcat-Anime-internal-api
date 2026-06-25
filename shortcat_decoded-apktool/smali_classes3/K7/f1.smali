.class public LK7/f1;
.super Lcom/facebook/react/uimanager/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManager;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/c;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, -0x1

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :sswitch_0
    const-string v0, "colorSpace"

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x4

    .line 24
    goto :goto_0

    .line 25
    :sswitch_1
    const-string v0, "debug"

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v2, 0x3

    .line 35
    goto :goto_0

    .line 36
    :sswitch_2
    const-string v0, "pointerEvents"

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v2, 0x2

    .line 46
    goto :goto_0

    .line 47
    :sswitch_3
    const-string v0, "androidWarmup"

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const/4 v2, 0x1

    .line 57
    goto :goto_0

    .line 58
    :sswitch_4
    const-string v0, "opaque"

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    move v2, v1

    .line 68
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/c;->a(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/c;->a:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 76
    .line 77
    check-cast p2, LK7/g1;

    .line 78
    .line 79
    if-nez p3, :cond_5

    .line 80
    .line 81
    const/4 p3, 0x0

    .line 82
    goto :goto_1

    .line 83
    :cond_5
    check-cast p3, Ljava/lang/String;

    .line 84
    .line 85
    :goto_1
    invoke-interface {p2, p1, p3}, LK7/g1;->setColorSpace(Landroid/view/View;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/c;->a:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 90
    .line 91
    check-cast p2, LK7/g1;

    .line 92
    .line 93
    if-nez p3, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    check-cast p3, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    :goto_2
    invoke-interface {p2, p1, v1}, LK7/g1;->setDebug(Landroid/view/View;Z)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/c;->a:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 107
    .line 108
    check-cast p2, LK7/g1;

    .line 109
    .line 110
    check-cast p3, Ljava/lang/String;

    .line 111
    .line 112
    invoke-interface {p2, p1, p3}, LK7/g1;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/c;->a:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 117
    .line 118
    check-cast p2, LK7/g1;

    .line 119
    .line 120
    if-nez p3, :cond_7

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    check-cast p3, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    :goto_3
    invoke-interface {p2, p1, v1}, LK7/g1;->setAndroidWarmup(Landroid/view/View;Z)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/c;->a:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 134
    .line 135
    check-cast p2, LK7/g1;

    .line 136
    .line 137
    if-nez p3, :cond_8

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_8
    check-cast p3, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    :goto_4
    invoke-interface {p2, p1, v1}, LK7/g1;->setOpaque(Landroid/view/View;Z)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    nop

    .line 151
    :sswitch_data_0
    .sparse-switch
        -0x3c3dfbdf -> :sswitch_4
        -0x370298d1 -> :sswitch_3
        -0x117e564a -> :sswitch_2
        0x5b09653 -> :sswitch_1
        0x4c33f763 -> :sswitch_0
    .end sparse-switch

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
