.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlButtonViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Landroidx/compose/ui/e;",
        "modifier",
        "LTd/L;",
        "TabControlButtonView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final TabControlButtonView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p4

    .line 6
    .line 7
    const-string v3, "style"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "state"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v3, -0x616e25e4

    .line 18
    .line 19
    .line 20
    move-object/from16 v4, p3

    .line 21
    .line 22
    invoke-interface {v4, v3}, LY/m;->g(I)LY/m;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    and-int/lit8 v4, p5, 0x1

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    or-int/lit8 v4, v0, 0x6

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    and-int/lit8 v4, v0, 0x6

    .line 35
    .line 36
    if-nez v4, :cond_2

    .line 37
    .line 38
    invoke-interface {v7, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    move v4, v5

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v4, 0x2

    .line 47
    :goto_0
    or-int/2addr v4, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v4, v0

    .line 50
    :goto_1
    and-int/lit8 v6, p5, 0x2

    .line 51
    .line 52
    const/16 v8, 0x20

    .line 53
    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    or-int/lit8 v4, v4, 0x30

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    and-int/lit8 v6, v0, 0x30

    .line 60
    .line 61
    if-nez v6, :cond_5

    .line 62
    .line 63
    invoke-interface {v7, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    move v6, v8

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/16 v6, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v4, v6

    .line 74
    :cond_5
    :goto_3
    and-int/lit8 v6, p5, 0x4

    .line 75
    .line 76
    if-eqz v6, :cond_7

    .line 77
    .line 78
    or-int/lit16 v4, v4, 0x180

    .line 79
    .line 80
    :cond_6
    move-object/from16 v9, p2

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_7
    and-int/lit16 v9, v0, 0x180

    .line 84
    .line 85
    if-nez v9, :cond_6

    .line 86
    .line 87
    move-object/from16 v9, p2

    .line 88
    .line 89
    invoke-interface {v7, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-eqz v10, :cond_8

    .line 94
    .line 95
    const/16 v10, 0x100

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_8
    const/16 v10, 0x80

    .line 99
    .line 100
    :goto_4
    or-int/2addr v4, v10

    .line 101
    :goto_5
    and-int/lit16 v10, v4, 0x93

    .line 102
    .line 103
    const/16 v11, 0x92

    .line 104
    .line 105
    if-ne v10, v11, :cond_a

    .line 106
    .line 107
    invoke-interface {v7}, LY/m;->i()Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-nez v10, :cond_9

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_9
    invoke-interface {v7}, LY/m;->K()V

    .line 115
    .line 116
    .line 117
    move-object v3, v9

    .line 118
    goto/16 :goto_8

    .line 119
    .line 120
    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    .line 121
    .line 122
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 123
    .line 124
    move-object v9, v6

    .line 125
    :cond_b
    invoke-static {}, LY/w;->L()Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_c

    .line 130
    .line 131
    const/4 v6, -0x1

    .line 132
    const-string v10, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlButtonView (TabControlButtonView.kt:16)"

    .line 133
    .line 134
    invoke-static {v3, v4, v6, v10}, LY/w;->U(IIILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_c
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;->getStack()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    move v6, v4

    .line 142
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlButtonViewKt$TabControlButtonView$1;

    .line 143
    .line 144
    const/4 v10, 0x0

    .line 145
    invoke-direct {v4, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlButtonViewKt$TabControlButtonView$1;-><init>(LZd/e;)V

    .line 146
    .line 147
    .line 148
    const v10, 0x4cbb5d3

    .line 149
    .line 150
    .line 151
    invoke-interface {v7, v10}, LY/m;->V(I)V

    .line 152
    .line 153
    .line 154
    and-int/lit8 v10, v6, 0x70

    .line 155
    .line 156
    const/4 v11, 0x0

    .line 157
    const/4 v12, 0x1

    .line 158
    if-ne v10, v8, :cond_d

    .line 159
    .line 160
    move v8, v12

    .line 161
    goto :goto_7

    .line 162
    :cond_d
    move v8, v11

    .line 163
    :goto_7
    and-int/lit8 v6, v6, 0xe

    .line 164
    .line 165
    if-ne v6, v5, :cond_e

    .line 166
    .line 167
    move v11, v12

    .line 168
    :cond_e
    or-int v5, v8, v11

    .line 169
    .line 170
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-nez v5, :cond_f

    .line 175
    .line 176
    sget-object v5, LY/m;->a:LY/m$a;

    .line 177
    .line 178
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    if-ne v6, v5, :cond_10

    .line 183
    .line 184
    :cond_f
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlButtonViewKt$TabControlButtonView$2$1;

    .line 185
    .line 186
    invoke-direct {v6, v2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlButtonViewKt$TabControlButtonView$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v7, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_10
    move-object v13, v6

    .line 193
    check-cast v13, Lie/a;

    .line 194
    .line 195
    invoke-interface {v7}, LY/m;->O()V

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x7

    .line 199
    const/4 v15, 0x0

    .line 200
    move v5, v10

    .line 201
    const/4 v10, 0x0

    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    move-object v10, v9

    .line 209
    or-int/lit16 v8, v5, 0x180

    .line 210
    .line 211
    const/16 v9, 0x10

    .line 212
    .line 213
    move-object v5, v6

    .line 214
    const/4 v6, 0x0

    .line 215
    move-object/from16 v16, v3

    .line 216
    .line 217
    move-object v3, v2

    .line 218
    move-object/from16 v2, v16

    .line 219
    .line 220
    invoke-static/range {v2 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->StackComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V

    .line 221
    .line 222
    .line 223
    invoke-static {}, LY/w;->L()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_11

    .line 228
    .line 229
    invoke-static {}, LY/w;->T()V

    .line 230
    .line 231
    .line 232
    :cond_11
    move-object v3, v10

    .line 233
    :goto_8
    invoke-interface {v7}, LY/m;->k()LY/B1;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    if-eqz v6, :cond_12

    .line 238
    .line 239
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlButtonViewKt$TabControlButtonView$3;

    .line 240
    .line 241
    move-object/from16 v2, p1

    .line 242
    .line 243
    move/from16 v4, p4

    .line 244
    .line 245
    move/from16 v5, p5

    .line 246
    .line 247
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlButtonViewKt$TabControlButtonView$3;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;II)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 251
    .line 252
    .line 253
    :cond_12
    return-void
.end method
