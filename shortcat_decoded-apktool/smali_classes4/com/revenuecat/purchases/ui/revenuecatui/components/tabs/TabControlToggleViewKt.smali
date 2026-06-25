.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f\u00b2\u0006\u000c\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Landroidx/compose/ui/e;",
        "modifier",
        "LTd/L;",
        "TabControlToggleView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V",
        "",
        "checked",
        "TabControlToggleView_Preview",
        "(ZLY/m;I)V",
        "TabControlToggleView_Gradient_Preview",
        "(LY/m;I)V",
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
.method public static final TabControlToggleView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const-string v0, "style"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "state"

    .line 13
    .line 14
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x13a49a7a

    .line 18
    .line 19
    .line 20
    move-object/from16 v3, p3

    .line 21
    .line 22
    invoke-interface {v3, v0}, LY/m;->g(I)LY/m;

    .line 23
    .line 24
    .line 25
    move-result-object v12

    .line 26
    and-int/lit8 v3, p5, 0x1

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    or-int/lit8 v3, v4, 0x6

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    and-int/lit8 v3, v4, 0x6

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    invoke-interface {v12, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const/4 v3, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v3, 0x2

    .line 46
    :goto_0
    or-int/2addr v3, v4

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v3, v4

    .line 49
    :goto_1
    and-int/lit8 v5, p5, 0x2

    .line 50
    .line 51
    const/16 v6, 0x20

    .line 52
    .line 53
    if-eqz v5, :cond_3

    .line 54
    .line 55
    or-int/lit8 v3, v3, 0x30

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    and-int/lit8 v5, v4, 0x30

    .line 59
    .line 60
    if-nez v5, :cond_5

    .line 61
    .line 62
    invoke-interface {v12, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    move v5, v6

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    const/16 v5, 0x10

    .line 71
    .line 72
    :goto_2
    or-int/2addr v3, v5

    .line 73
    :cond_5
    :goto_3
    and-int/lit8 v5, p5, 0x4

    .line 74
    .line 75
    if-eqz v5, :cond_7

    .line 76
    .line 77
    or-int/lit16 v3, v3, 0x180

    .line 78
    .line 79
    :cond_6
    move-object/from16 v7, p2

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_7
    and-int/lit16 v7, v4, 0x180

    .line 83
    .line 84
    if-nez v7, :cond_6

    .line 85
    .line 86
    move-object/from16 v7, p2

    .line 87
    .line 88
    invoke-interface {v12, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_8

    .line 93
    .line 94
    const/16 v8, 0x100

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_8
    const/16 v8, 0x80

    .line 98
    .line 99
    :goto_4
    or-int/2addr v3, v8

    .line 100
    :goto_5
    and-int/lit16 v8, v3, 0x93

    .line 101
    .line 102
    const/16 v9, 0x92

    .line 103
    .line 104
    if-ne v8, v9, :cond_a

    .line 105
    .line 106
    invoke-interface {v12}, LY/m;->i()Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-nez v8, :cond_9

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_9
    invoke-interface {v12}, LY/m;->K()V

    .line 114
    .line 115
    .line 116
    move-object v3, v7

    .line 117
    move-object/from16 v26, v12

    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_a
    :goto_6
    if-eqz v5, :cond_b

    .line 122
    .line 123
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 124
    .line 125
    move-object v13, v5

    .line 126
    goto :goto_7

    .line 127
    :cond_b
    move-object v13, v7

    .line 128
    :goto_7
    invoke-static {}, LY/w;->L()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_c

    .line 133
    .line 134
    const/4 v5, -0x1

    .line 135
    const-string v7, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleView (TabControlToggleView.kt:32)"

    .line 136
    .line 137
    invoke-static {v0, v3, v5, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_c
    const v0, 0xefd8d9c

    .line 141
    .line 142
    .line 143
    invoke-interface {v12, v0}, LY/m;->V(I)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget-object v5, LY/m;->a:LY/m$a;

    .line 151
    .line 152
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    if-ne v0, v7, :cond_d

    .line 157
    .line 158
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView$checked$2$1;

    .line 159
    .line 160
    invoke-direct {v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView$checked$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v0}, LY/U1;->d(Lie/a;)LY/h2;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-interface {v12, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_d
    check-cast v0, LY/h2;

    .line 171
    .line 172
    invoke-interface {v12}, LY/m;->O()V

    .line 173
    .line 174
    .line 175
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt;->TabControlToggleView$lambda$1(LY/h2;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    const v7, 0xefd9d37

    .line 180
    .line 181
    .line 182
    invoke-interface {v12, v7}, LY/m;->V(I)V

    .line 183
    .line 184
    .line 185
    and-int/lit8 v3, v3, 0x70

    .line 186
    .line 187
    const/4 v7, 0x0

    .line 188
    if-ne v3, v6, :cond_e

    .line 189
    .line 190
    const/4 v3, 0x1

    .line 191
    goto :goto_8

    .line 192
    :cond_e
    move v3, v7

    .line 193
    :goto_8
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    if-nez v3, :cond_f

    .line 198
    .line 199
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-ne v6, v3, :cond_10

    .line 204
    .line 205
    :cond_f
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView$1$1;

    .line 206
    .line 207
    invoke-direct {v6, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v12, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_10
    move-object v3, v6

    .line 214
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 215
    .line 216
    invoke-interface {v12}, LY/m;->O()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 220
    .line 221
    .line 222
    move-result-object v14

    .line 223
    const/16 v17, 0x6

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/4 v15, 0x0

    .line 228
    const/16 v16, 0x0

    .line 229
    .line 230
    invoke-static/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 231
    .line 232
    .line 233
    move-result-object v30

    .line 234
    move-object/from16 v31, v13

    .line 235
    .line 236
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchDefaults;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchDefaults;

    .line 237
    .line 238
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->getThumbColorOn()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-static {v6, v12, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->getTrackColorOn()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    invoke-static {v8, v12, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->getThumbColorOff()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-static {v9, v12, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;->getTrackColorOff()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    invoke-static {v9, v12, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    const/high16 v28, 0x180000

    .line 271
    .line 272
    const v29, 0xffcc

    .line 273
    .line 274
    .line 275
    move-object/from16 v26, v12

    .line 276
    .line 277
    move-object v12, v7

    .line 278
    move-object v7, v8

    .line 279
    const/4 v8, 0x0

    .line 280
    const-wide/16 v9, 0x0

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    const-wide/16 v14, 0x0

    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    const-wide/16 v19, 0x0

    .line 288
    .line 289
    const/16 v21, 0x0

    .line 290
    .line 291
    const/16 v22, 0x0

    .line 292
    .line 293
    const/16 v23, 0x0

    .line 294
    .line 295
    const-wide/16 v24, 0x0

    .line 296
    .line 297
    const/16 v27, 0x0

    .line 298
    .line 299
    invoke-virtual/range {v5 .. v29}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchDefaults;->colors-lRJcREg(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;JLY/m;III)Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchColors;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    const/4 v13, 0x0

    .line 304
    const/16 v14, 0x58

    .line 305
    .line 306
    const/4 v9, 0x0

    .line 307
    const/4 v11, 0x0

    .line 308
    move v5, v0

    .line 309
    move-object v6, v3

    .line 310
    move-object/from16 v12, v26

    .line 311
    .line 312
    move-object/from16 v7, v30

    .line 313
    .line 314
    invoke-static/range {v5 .. v14}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchKt;->Switch(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;ZLcom/revenuecat/purchases/ui/revenuecatui/composables/SwitchColors;LB/m;LY/m;II)V

    .line 315
    .line 316
    .line 317
    invoke-static {}, LY/w;->L()Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eqz v0, :cond_11

    .line 322
    .line 323
    invoke-static {}, LY/w;->T()V

    .line 324
    .line 325
    .line 326
    :cond_11
    move-object/from16 v3, v31

    .line 327
    .line 328
    :goto_9
    invoke-interface/range {v26 .. v26}, LY/m;->k()LY/B1;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    if-eqz v6, :cond_12

    .line 333
    .line 334
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView$2;

    .line 335
    .line 336
    move/from16 v5, p5

    .line 337
    .line 338
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;II)V

    .line 339
    .line 340
    .line 341
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 342
    .line 343
    .line 344
    :cond_12
    return-void
.end method

.method private static final TabControlToggleView$lambda$1(LY/h2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final TabControlToggleView_Gradient_Preview(LY/m;I)V
    .locals 10

    .line 1
    const v0, -0x307d031b

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v4}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v4}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    const/4 p0, -0x1

    .line 29
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleView_Gradient_Preview (TabControlToggleView.kt:86)"

    .line 30
    .line 31
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    new-instance p0, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 35
    .line 36
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 37
    .line 38
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-static {v1, v2}, Ls0/s0;->k(J)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {p0, v1, v2}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 51
    .line 52
    invoke-virtual {v0}, Ls0/r0$a;->f()J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    invoke-static {v2, v3}, Ls0/s0;->k(J)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/high16 v3, 0x420c0000    # 35.0f

    .line 61
    .line 62
    invoke-direct {v1, v2, v3}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 66
    .line 67
    invoke-virtual {v0}, Ls0/r0$a;->b()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    invoke-static {v5, v6}, Ls0/s0;->k(J)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/high16 v3, 0x42c80000    # 100.0f

    .line 76
    .line 77
    invoke-direct {v2, v0, v3}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;-><init>(IF)V

    .line 78
    .line 79
    .line 80
    filled-new-array {p0, v1, v2}, [Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;

    .line 89
    .line 90
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 91
    .line 92
    new-instance v2, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;

    .line 93
    .line 94
    invoke-direct {v2, p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;-><init>(Ljava/util/List;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const/4 v3, 0x0

    .line 102
    const/4 v5, 0x2

    .line 103
    invoke-direct {v0, v2, v3, v5, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 104
    .line 105
    .line 106
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 107
    .line 108
    new-instance v6, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;

    .line 109
    .line 110
    invoke-direct {v6, p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;-><init>(Ljava/util/List;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-direct {v2, v6, v3, v5, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 118
    .line 119
    .line 120
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 121
    .line 122
    new-instance v7, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;

    .line 123
    .line 124
    const/high16 v8, 0x42b40000    # 90.0f

    .line 125
    .line 126
    invoke-direct {v7, v8, p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;-><init>(FLjava/util/List;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-direct {v6, v7, v3, v5, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 134
    .line 135
    .line 136
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 137
    .line 138
    new-instance v9, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;

    .line 139
    .line 140
    invoke-direct {v9, v8, p0}, Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;-><init>(FLjava/util/List;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyle(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-direct {v7, p0, v3, v5, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v1, v0, v2, v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V

    .line 151
    .line 152
    .line 153
    const/4 p0, 0x0

    .line 154
    const/4 v0, 0x1

    .line 155
    invoke-static {v3, v4, p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewEmptyState(Ljava/lang/Integer;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    const/4 v5, 0x0

    .line 160
    const/4 v6, 0x4

    .line 161
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt;->TabControlToggleView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 162
    .line 163
    .line 164
    invoke-static {}, LY/w;->L()Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-eqz p0, :cond_3

    .line 169
    .line 170
    invoke-static {}, LY/w;->T()V

    .line 171
    .line 172
    .line 173
    :cond_3
    :goto_1
    invoke-interface {v4}, LY/m;->k()LY/B1;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-eqz p0, :cond_4

    .line 178
    .line 179
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView_Gradient_Preview$1;

    .line 180
    .line 181
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView_Gradient_Preview$1;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    :cond_4
    return-void
.end method

.method private static final TabControlToggleView_Preview(ZLY/m;I)V
    .locals 9

    .line 1
    const v0, 0xf7368cc

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    and-int/lit8 p1, p2, 0x6

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-interface {v4, p0}, LY/m;->a(Z)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p1, v1

    .line 22
    :goto_0
    or-int/2addr p1, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move p1, p2

    .line 25
    :goto_1
    and-int/lit8 v2, p1, 0x3

    .line 26
    .line 27
    if-ne v2, v1, :cond_3

    .line 28
    .line 29
    invoke-interface {v4}, LY/m;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    invoke-interface {v4}, LY/m;->K()V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    const/4 v1, -0x1

    .line 48
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleView_Preview (TabControlToggleView.kt:59)"

    .line 49
    .line 50
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_4
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;

    .line 54
    .line 55
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 56
    .line 57
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 58
    .line 59
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    invoke-static {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    invoke-static {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v0}, Ls0/r0$a;->b()J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-direct {p1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)V

    .line 84
    .line 85
    .line 86
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 87
    .line 88
    invoke-virtual {v0}, Ls0/r0$a;->b()J

    .line 89
    .line 90
    .line 91
    move-result-wide v5

    .line 92
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 93
    .line 94
    .line 95
    move-result-wide v5

    .line 96
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v5

    .line 108
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-direct {v2, v3, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)V

    .line 113
    .line 114
    .line 115
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 116
    .line 117
    invoke-virtual {v0}, Ls0/r0$a;->l()J

    .line 118
    .line 119
    .line 120
    move-result-wide v5

    .line 121
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 122
    .line 123
    .line 124
    move-result-wide v5

    .line 125
    invoke-static {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v0}, Ls0/r0$a;->f()J

    .line 130
    .line 131
    .line 132
    move-result-wide v6

    .line 133
    invoke-static {v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v6

    .line 137
    invoke-static {v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-direct {v3, v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)V

    .line 142
    .line 143
    .line 144
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 145
    .line 146
    invoke-virtual {v0}, Ls0/r0$a;->f()J

    .line 147
    .line 148
    .line 149
    move-result-wide v6

    .line 150
    invoke-static {v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v6

    .line 154
    invoke-static {v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {v0}, Ls0/r0$a;->l()J

    .line 159
    .line 160
    .line 161
    move-result-wide v7

    .line 162
    invoke-static {v7, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->constructor-impl(J)J

    .line 163
    .line 164
    .line 165
    move-result-wide v7

    .line 166
    invoke-static {v7, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;->box-impl(J)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle$Solid;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-direct {v5, v6, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)V

    .line 171
    .line 172
    .line 173
    invoke-direct {v1, p1, v2, v3, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)V

    .line 174
    .line 175
    .line 176
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    const/4 v0, 0x0

    .line 181
    invoke-static {p1, v4, v0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewEmptyState(Ljava/lang/Integer;LY/m;II)Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    const/4 v5, 0x0

    .line 186
    const/4 v6, 0x4

    .line 187
    const/4 v3, 0x0

    .line 188
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt;->TabControlToggleView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabControlToggleComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V

    .line 189
    .line 190
    .line 191
    invoke-static {}, LY/w;->L()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_5

    .line 196
    .line 197
    invoke-static {}, LY/w;->T()V

    .line 198
    .line 199
    .line 200
    :cond_5
    :goto_3
    invoke-interface {v4}, LY/m;->k()LY/B1;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-eqz p1, :cond_6

    .line 205
    .line 206
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView_Preview$1;

    .line 207
    .line 208
    invoke-direct {v0, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt$TabControlToggleView_Preview$1;-><init>(ZI)V

    .line 209
    .line 210
    .line 211
    invoke-interface {p1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    :cond_6
    return-void
.end method

.method public static final synthetic access$TabControlToggleView_Gradient_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt;->TabControlToggleView_Gradient_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$TabControlToggleView_Preview(ZLY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabControlToggleViewKt;->TabControlToggleView_Preview(ZLY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
