.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\n\u00a8\u0006\u0010\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Landroidx/compose/ui/e;",
        "modifier",
        "LTd/L;",
        "IconComponentView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V",
        "IconComponentView_Preview",
        "(LY/m;I)V",
        "IconComponentView_Margin_Preview",
        "Ls0/E1;",
        "composeShape",
        "Landroidx/compose/ui/graphics/d;",
        "colorFilter",
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
.method public static final synthetic IconComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;LY/m;II)V
    .locals 19

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
    const v0, 0x5a8f9f67

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
    move-result-object v9

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
    invoke-interface {v9, v1}, LY/m;->U(Ljava/lang/Object;)Z

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
    if-eqz v5, :cond_3

    .line 52
    .line 53
    or-int/lit8 v3, v3, 0x30

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    and-int/lit8 v5, v4, 0x30

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    invoke-interface {v9, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    const/16 v5, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    const/16 v5, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr v3, v5

    .line 72
    :cond_5
    :goto_3
    and-int/lit8 v5, p5, 0x4

    .line 73
    .line 74
    if-eqz v5, :cond_7

    .line 75
    .line 76
    or-int/lit16 v3, v3, 0x180

    .line 77
    .line 78
    :cond_6
    move-object/from16 v6, p2

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_7
    and-int/lit16 v6, v4, 0x180

    .line 82
    .line 83
    if-nez v6, :cond_6

    .line 84
    .line 85
    move-object/from16 v6, p2

    .line 86
    .line 87
    invoke-interface {v9, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_8

    .line 92
    .line 93
    const/16 v7, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_8
    const/16 v7, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v3, v7

    .line 99
    :goto_5
    and-int/lit16 v7, v3, 0x93

    .line 100
    .line 101
    const/16 v8, 0x92

    .line 102
    .line 103
    if-ne v7, v8, :cond_a

    .line 104
    .line 105
    invoke-interface {v9}, LY/m;->i()Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-nez v7, :cond_9

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_9
    invoke-interface {v9}, LY/m;->K()V

    .line 113
    .line 114
    .line 115
    move-object v3, v6

    .line 116
    goto/16 :goto_d

    .line 117
    .line 118
    :cond_a
    :goto_6
    if-eqz v5, :cond_b

    .line 119
    .line 120
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 121
    .line 122
    move-object v10, v5

    .line 123
    goto :goto_7

    .line 124
    :cond_b
    move-object v10, v6

    .line 125
    :goto_7
    invoke-static {}, LY/w;->L()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_c

    .line 130
    .line 131
    const/4 v5, -0x1

    .line 132
    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.IconComponentView (IconComponentView.kt:45)"

    .line 133
    .line 134
    invoke-static {v0, v3, v5, v6}, LY/w;->U(IIILjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_c
    and-int/lit8 v0, v3, 0x7e

    .line 138
    .line 139
    invoke-static {v1, v2, v9, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentStateKt;->rememberUpdatedIconComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getVisible()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_e

    .line 148
    .line 149
    invoke-static {}, LY/w;->L()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_d

    .line 154
    .line 155
    invoke-static {}, LY/w;->T()V

    .line 156
    .line 157
    .line 158
    :cond_d
    invoke-interface {v9}, LY/m;->k()LY/B1;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    if-eqz v6, :cond_22

    .line 163
    .line 164
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$1;

    .line 165
    .line 166
    move/from16 v5, p5

    .line 167
    .line 168
    move-object v3, v10

    .line 169
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;II)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_e
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getBorder()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const v2, 0xe2ca278

    .line 181
    .line 182
    .line 183
    invoke-interface {v9, v2}, LY/m;->V(I)V

    .line 184
    .line 185
    .line 186
    const/4 v2, 0x0

    .line 187
    const/4 v3, 0x0

    .line 188
    if-nez v1, :cond_f

    .line 189
    .line 190
    move-object v1, v2

    .line 191
    goto :goto_8

    .line 192
    :cond_f
    invoke-static {v1, v9, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyleKt;->rememberBorderStyle(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    :goto_8
    invoke-interface {v9}, LY/m;->O()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getShadow()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const v5, 0xe2cac98

    .line 204
    .line 205
    .line 206
    invoke-interface {v9, v5}, LY/m;->V(I)V

    .line 207
    .line 208
    .line 209
    if-nez v4, :cond_10

    .line 210
    .line 211
    move-object v4, v2

    .line 212
    goto :goto_9

    .line 213
    :cond_10
    invoke-static {v4, v9, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyleKt;->rememberShadowStyle(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyle;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    :goto_9
    invoke-interface {v9}, LY/m;->O()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getShape()Ls0/E1;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    const v6, 0xe2cb4e2

    .line 225
    .line 226
    .line 227
    invoke-interface {v9, v6}, LY/m;->V(I)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v9, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    if-nez v5, :cond_11

    .line 239
    .line 240
    sget-object v5, LY/m;->a:LY/m$a;

    .line 241
    .line 242
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    if-ne v6, v5, :cond_12

    .line 247
    .line 248
    :cond_11
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$composeShape$2$1;

    .line 249
    .line 250
    invoke-direct {v5, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$composeShape$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v5}, LY/U1;->d(Lie/a;)LY/h2;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-interface {v9, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_12
    check-cast v6, LY/h2;

    .line 261
    .line 262
    invoke-interface {v9}, LY/m;->O()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getBackgroundColorStyles()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    const v7, 0xe2cc65f

    .line 270
    .line 271
    .line 272
    invoke-interface {v9, v7}, LY/m;->V(I)V

    .line 273
    .line 274
    .line 275
    if-nez v5, :cond_13

    .line 276
    .line 277
    move-object v5, v2

    .line 278
    goto :goto_a

    .line 279
    :cond_13
    invoke-static {v5, v9, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    :goto_a
    invoke-interface {v9}, LY/m;->O()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getTintColor()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    const v8, 0xe2ccd7f

    .line 291
    .line 292
    .line 293
    invoke-interface {v9, v8}, LY/m;->V(I)V

    .line 294
    .line 295
    .line 296
    if-nez v7, :cond_14

    .line 297
    .line 298
    goto :goto_b

    .line 299
    :cond_14
    invoke-static {v7, v9, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    :goto_b
    invoke-interface {v9}, LY/m;->O()V

    .line 304
    .line 305
    .line 306
    const v7, 0xe2cd30a

    .line 307
    .line 308
    .line 309
    invoke-interface {v9, v7}, LY/m;->V(I)V

    .line 310
    .line 311
    .line 312
    invoke-interface {v9, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    if-nez v7, :cond_15

    .line 321
    .line 322
    sget-object v7, LY/m;->a:LY/m$a;

    .line 323
    .line 324
    invoke-virtual {v7}, LY/m$a;->a()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    if-ne v8, v7, :cond_16

    .line 329
    .line 330
    :cond_15
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$colorFilter$2$1;

    .line 331
    .line 332
    invoke-direct {v7, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$colorFilter$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v7}, LY/U1;->d(Lie/a;)LY/h2;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    invoke-interface {v9, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_16
    check-cast v8, LY/h2;

    .line 343
    .line 344
    invoke-interface {v9}, LY/m;->O()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getSizePlusMargin()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    const/4 v14, 0x6

    .line 352
    const/4 v15, 0x0

    .line 353
    const/4 v12, 0x0

    .line 354
    const/4 v13, 0x0

    .line 355
    invoke-static/range {v10 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    move-object v12, v10

    .line 360
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getMargin()LC/A;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/p;->h(Landroidx/compose/ui/e;LC/A;)Landroidx/compose/ui/e;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    sget-object v7, Ll0/e;->a:Ll0/e$a;

    .line 369
    .line 370
    invoke-virtual {v7}, Ll0/e$a;->o()Ll0/e;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    invoke-static {v9, v3}, LY/h;->a(LY/m;I)I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    invoke-interface {v9}, LY/m;->r()LY/I;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    invoke-static {v9, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    sget-object v11, LK0/g;->M:LK0/g$a;

    .line 391
    .line 392
    invoke-virtual {v11}, LK0/g$a;->a()Lie/a;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    invoke-interface {v9}, LY/m;->j()LY/d;

    .line 397
    .line 398
    .line 399
    move-result-object v14

    .line 400
    if-nez v14, :cond_17

    .line 401
    .line 402
    invoke-static {}, LY/h;->d()V

    .line 403
    .line 404
    .line 405
    :cond_17
    invoke-interface {v9}, LY/m;->I()V

    .line 406
    .line 407
    .line 408
    invoke-interface {v9}, LY/m;->e()Z

    .line 409
    .line 410
    .line 411
    move-result v14

    .line 412
    if-eqz v14, :cond_18

    .line 413
    .line 414
    invoke-interface {v9, v13}, LY/m;->h(Lie/a;)V

    .line 415
    .line 416
    .line 417
    goto :goto_c

    .line 418
    :cond_18
    invoke-interface {v9}, LY/m;->s()V

    .line 419
    .line 420
    .line 421
    :goto_c
    invoke-static {v9}, LY/m2;->b(LY/m;)LY/m;

    .line 422
    .line 423
    .line 424
    move-result-object v13

    .line 425
    invoke-virtual {v11}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 426
    .line 427
    .line 428
    move-result-object v14

    .line 429
    invoke-static {v13, v7, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v11}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    invoke-static {v13, v10, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v11}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    invoke-interface {v13}, LY/m;->e()Z

    .line 444
    .line 445
    .line 446
    move-result v10

    .line 447
    if-nez v10, :cond_19

    .line 448
    .line 449
    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 454
    .line 455
    .line 456
    move-result-object v14

    .line 457
    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v10

    .line 461
    if-nez v10, :cond_1a

    .line 462
    .line 463
    :cond_19
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    invoke-interface {v13, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-interface {v13, v3, v7}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 475
    .line 476
    .line 477
    :cond_1a
    invoke-virtual {v11}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-static {v13, v2, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 482
    .line 483
    .line 484
    sget-object v2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 485
    .line 486
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getUrl()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    sget-object v13, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 491
    .line 492
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getSize()Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 493
    .line 494
    .line 495
    move-result-object v14

    .line 496
    const/16 v17, 0x6

    .line 497
    .line 498
    const/16 v18, 0x0

    .line 499
    .line 500
    const/4 v15, 0x0

    .line 501
    const/16 v16, 0x0

    .line 502
    .line 503
    invoke-static/range {v13 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    const v7, -0xacdd615

    .line 508
    .line 509
    .line 510
    invoke-interface {v9, v7}, LY/m;->V(I)V

    .line 511
    .line 512
    .line 513
    invoke-interface {v9, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v10

    .line 521
    if-nez v7, :cond_1b

    .line 522
    .line 523
    sget-object v7, LY/m;->a:LY/m$a;

    .line 524
    .line 525
    invoke-virtual {v7}, LY/m$a;->a()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    if-ne v10, v7, :cond_1c

    .line 530
    .line 531
    :cond_1b
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$2$1$1;

    .line 532
    .line 533
    invoke-direct {v10, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$2$1$1;-><init>(LY/h2;)V

    .line 534
    .line 535
    .line 536
    invoke-interface {v9, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    :cond_1c
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 540
    .line 541
    invoke-interface {v9}, LY/m;->O()V

    .line 542
    .line 543
    .line 544
    invoke-static {v3, v4, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    const v4, -0xacdcc51

    .line 549
    .line 550
    .line 551
    invoke-interface {v9, v4}, LY/m;->V(I)V

    .line 552
    .line 553
    .line 554
    invoke-interface {v9, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v7

    .line 562
    if-nez v4, :cond_1d

    .line 563
    .line 564
    sget-object v4, LY/m;->a:LY/m$a;

    .line 565
    .line 566
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    if-ne v7, v4, :cond_1e

    .line 571
    .line 572
    :cond_1d
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$2$2$1;

    .line 573
    .line 574
    invoke-direct {v7, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$2$2$1;-><init>(LY/h2;)V

    .line 575
    .line 576
    .line 577
    invoke-interface {v9, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    :cond_1e
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 581
    .line 582
    invoke-interface {v9}, LY/m;->O()V

    .line 583
    .line 584
    .line 585
    invoke-static {v3, v5, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    invoke-static {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt;->IconComponentView$lambda$3(LY/h2;)Ls0/E1;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    invoke-static {v3, v4}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    const v4, -0xacdbe15

    .line 598
    .line 599
    .line 600
    invoke-interface {v9, v4}, LY/m;->V(I)V

    .line 601
    .line 602
    .line 603
    invoke-interface {v9, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    if-nez v4, :cond_1f

    .line 612
    .line 613
    sget-object v4, LY/m;->a:LY/m$a;

    .line 614
    .line 615
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v4

    .line 619
    if-ne v5, v4, :cond_20

    .line 620
    .line 621
    :cond_1f
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$2$3$1;

    .line 622
    .line 623
    invoke-direct {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$2$3$1;-><init>(LY/h2;)V

    .line 624
    .line 625
    .line 626
    invoke-interface {v9, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    :cond_20
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 630
    .line 631
    invoke-interface {v9}, LY/m;->O()V

    .line 632
    .line 633
    .line 634
    invoke-static {v3, v1, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/ModifierExtensionsKt;->applyIfNotNull(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentState;->getPadding()LC/A;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/p;->h(Landroidx/compose/ui/e;LC/A;)Landroidx/compose/ui/e;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-static {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt;->IconComponentView$lambda$5(LY/h2;)Landroidx/compose/ui/graphics/d;

    .line 647
    .line 648
    .line 649
    move-result-object v8

    .line 650
    const/4 v10, 0x0

    .line 651
    const/16 v11, 0x7c

    .line 652
    .line 653
    const/4 v3, 0x0

    .line 654
    const/4 v4, 0x0

    .line 655
    const/4 v5, 0x0

    .line 656
    const/4 v6, 0x0

    .line 657
    const/4 v7, 0x0

    .line 658
    move-object v1, v2

    .line 659
    move-object v2, v0

    .line 660
    invoke-static/range {v1 .. v11}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt;->RemoteImage(Ljava/lang/String;Landroidx/compose/ui/e;Ljava/lang/String;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V

    .line 661
    .line 662
    .line 663
    invoke-interface {v9}, LY/m;->x()V

    .line 664
    .line 665
    .line 666
    invoke-static {}, LY/w;->L()Z

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    if-eqz v0, :cond_21

    .line 671
    .line 672
    invoke-static {}, LY/w;->T()V

    .line 673
    .line 674
    .line 675
    :cond_21
    move-object v3, v12

    .line 676
    :goto_d
    invoke-interface {v9}, LY/m;->k()LY/B1;

    .line 677
    .line 678
    .line 679
    move-result-object v6

    .line 680
    if-eqz v6, :cond_22

    .line 681
    .line 682
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$3;

    .line 683
    .line 684
    move-object/from16 v1, p0

    .line 685
    .line 686
    move-object/from16 v2, p1

    .line 687
    .line 688
    move/from16 v4, p4

    .line 689
    .line 690
    move/from16 v5, p5

    .line 691
    .line 692
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView$3;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/IconComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;II)V

    .line 693
    .line 694
    .line 695
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 696
    .line 697
    .line 698
    :cond_22
    return-void
.end method

.method private static final IconComponentView$lambda$3(LY/h2;)Ls0/E1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")",
            "Ls0/E1;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/E1;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final IconComponentView$lambda$5(LY/h2;)Landroidx/compose/ui/graphics/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")",
            "Landroidx/compose/ui/graphics/d;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/compose/ui/graphics/d;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final IconComponentView_Margin_Preview(LY/m;I)V
    .locals 3
    .annotation runtime Lcom/emergetools/snapshots/annotations/EmergeSnapshotConfig;
        precision = 0.99f
    .end annotation

    .line 1
    const v0, -0xaa008ab

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.IconComponentView_Margin_Preview (IconComponentView.kt:107)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    const/4 v0, 0x1

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {v1, p0, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewImageLoader(ILY/m;II)Lv4/d;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/ComposableSingletons$IconComponentViewKt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/ComposableSingletons$IconComponentViewKt;

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/ComposableSingletons$IconComponentViewKt;->getLambda-2$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/16 v2, 0x30

    .line 46
    .line 47
    invoke-static {v0, v1, p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt;->ProvidePreviewImageLoader(Lv4/d;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, LY/w;->L()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {}, LY/w;->T()V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView_Margin_Preview$1;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView_Margin_Preview$1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method private static final IconComponentView_Preview(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x5ac68dbe

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.IconComponentView_Preview (IconComponentView.kt:88)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    const/4 v0, 0x1

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {v1, p0, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PreviewHelpersKt;->previewImageLoader(ILY/m;II)Lv4/d;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/ComposableSingletons$IconComponentViewKt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/ComposableSingletons$IconComponentViewKt;

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/ComposableSingletons$IconComponentViewKt;->getLambda-1$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/16 v2, 0x30

    .line 46
    .line 47
    invoke-static {v0, v1, p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ImagePreviewsKt;->ProvidePreviewImageLoader(Lv4/d;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, LY/w;->L()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-static {}, LY/w;->T()V

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView_Preview$1;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt$IconComponentView_Preview$1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public static final synthetic access$IconComponentView$lambda$3(LY/h2;)Ls0/E1;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt;->IconComponentView$lambda$3(LY/h2;)Ls0/E1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$IconComponentView_Margin_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt;->IconComponentView_Margin_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$IconComponentView_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/iconcomponent/IconComponentViewKt;->IconComponentView_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
