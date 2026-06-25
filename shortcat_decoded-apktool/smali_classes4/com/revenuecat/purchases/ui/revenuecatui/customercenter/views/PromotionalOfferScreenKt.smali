.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aS\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;",
        "promotionalOfferData",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;",
        "appearance",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "localization",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "LTd/L;",
        "onAccept",
        "Lkotlin/Function0;",
        "onDismiss",
        "Landroidx/compose/ui/e;",
        "modifier",
        "PromotionalOfferScreen",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Lie/a;Landroidx/compose/ui/e;LY/m;II)V",
        "PromotionalOfferViewPreview",
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
.method public static final synthetic PromotionalOfferScreen(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Lie/a;Landroidx/compose/ui/e;LY/m;II)V
    .locals 48

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move/from16 v7, p7

    .line 12
    .line 13
    const-string v0, "promotionalOfferData"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "appearance"

    .line 19
    .line 20
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "localization"

    .line 24
    .line 25
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "onAccept"

    .line 29
    .line 30
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "onDismiss"

    .line 34
    .line 35
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const v0, -0x31643c61

    .line 39
    .line 40
    .line 41
    move-object/from16 v6, p6

    .line 42
    .line 43
    invoke-interface {v6, v0}, LY/m;->g(I)LY/m;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    and-int/lit8 v8, p8, 0x1

    .line 48
    .line 49
    const/4 v9, 0x2

    .line 50
    if-eqz v8, :cond_0

    .line 51
    .line 52
    or-int/lit8 v8, v7, 0x6

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    and-int/lit8 v8, v7, 0x6

    .line 56
    .line 57
    if-nez v8, :cond_2

    .line 58
    .line 59
    invoke-interface {v6, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_1

    .line 64
    .line 65
    const/4 v8, 0x4

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move v8, v9

    .line 68
    :goto_0
    or-int/2addr v8, v7

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v8, v7

    .line 71
    :goto_1
    and-int/lit8 v10, p8, 0x2

    .line 72
    .line 73
    if-eqz v10, :cond_3

    .line 74
    .line 75
    or-int/lit8 v8, v8, 0x30

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    and-int/lit8 v10, v7, 0x30

    .line 79
    .line 80
    if-nez v10, :cond_5

    .line 81
    .line 82
    invoke-interface {v6, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_4

    .line 87
    .line 88
    const/16 v10, 0x20

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    const/16 v10, 0x10

    .line 92
    .line 93
    :goto_2
    or-int/2addr v8, v10

    .line 94
    :cond_5
    :goto_3
    and-int/lit8 v10, p8, 0x4

    .line 95
    .line 96
    if-eqz v10, :cond_6

    .line 97
    .line 98
    or-int/lit16 v8, v8, 0x180

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_6
    and-int/lit16 v10, v7, 0x180

    .line 102
    .line 103
    if-nez v10, :cond_8

    .line 104
    .line 105
    invoke-interface {v6, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-eqz v10, :cond_7

    .line 110
    .line 111
    const/16 v10, 0x100

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    const/16 v10, 0x80

    .line 115
    .line 116
    :goto_4
    or-int/2addr v8, v10

    .line 117
    :cond_8
    :goto_5
    and-int/lit8 v10, p8, 0x8

    .line 118
    .line 119
    if-eqz v10, :cond_9

    .line 120
    .line 121
    or-int/lit16 v8, v8, 0xc00

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_9
    and-int/lit16 v10, v7, 0xc00

    .line 125
    .line 126
    if-nez v10, :cond_b

    .line 127
    .line 128
    invoke-interface {v6, v4}, LY/m;->F(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-eqz v10, :cond_a

    .line 133
    .line 134
    const/16 v10, 0x800

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_a
    const/16 v10, 0x400

    .line 138
    .line 139
    :goto_6
    or-int/2addr v8, v10

    .line 140
    :cond_b
    :goto_7
    and-int/lit8 v10, p8, 0x10

    .line 141
    .line 142
    if-eqz v10, :cond_c

    .line 143
    .line 144
    or-int/lit16 v8, v8, 0x6000

    .line 145
    .line 146
    goto :goto_9

    .line 147
    :cond_c
    and-int/lit16 v10, v7, 0x6000

    .line 148
    .line 149
    if-nez v10, :cond_e

    .line 150
    .line 151
    invoke-interface {v6, v5}, LY/m;->F(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-eqz v10, :cond_d

    .line 156
    .line 157
    const/16 v10, 0x4000

    .line 158
    .line 159
    goto :goto_8

    .line 160
    :cond_d
    const/16 v10, 0x2000

    .line 161
    .line 162
    :goto_8
    or-int/2addr v8, v10

    .line 163
    :cond_e
    :goto_9
    and-int/lit8 v10, p8, 0x20

    .line 164
    .line 165
    const/high16 v14, 0x30000

    .line 166
    .line 167
    if-eqz v10, :cond_10

    .line 168
    .line 169
    or-int/2addr v8, v14

    .line 170
    :cond_f
    move-object/from16 v14, p5

    .line 171
    .line 172
    goto :goto_b

    .line 173
    :cond_10
    and-int/2addr v14, v7

    .line 174
    if-nez v14, :cond_f

    .line 175
    .line 176
    move-object/from16 v14, p5

    .line 177
    .line 178
    invoke-interface {v6, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    if-eqz v15, :cond_11

    .line 183
    .line 184
    const/high16 v15, 0x20000

    .line 185
    .line 186
    goto :goto_a

    .line 187
    :cond_11
    const/high16 v15, 0x10000

    .line 188
    .line 189
    :goto_a
    or-int/2addr v8, v15

    .line 190
    :goto_b
    const v15, 0x12493

    .line 191
    .line 192
    .line 193
    and-int/2addr v15, v8

    .line 194
    const v12, 0x12492

    .line 195
    .line 196
    .line 197
    if-ne v15, v12, :cond_13

    .line 198
    .line 199
    invoke-interface {v6}, LY/m;->i()Z

    .line 200
    .line 201
    .line 202
    move-result v12

    .line 203
    if-nez v12, :cond_12

    .line 204
    .line 205
    goto :goto_c

    .line 206
    :cond_12
    invoke-interface {v6}, LY/m;->K()V

    .line 207
    .line 208
    .line 209
    move-object v8, v6

    .line 210
    move-object v6, v14

    .line 211
    goto/16 :goto_14

    .line 212
    .line 213
    :cond_13
    :goto_c
    if-eqz v10, :cond_14

    .line 214
    .line 215
    sget-object v10, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 216
    .line 217
    goto :goto_d

    .line 218
    :cond_14
    move-object v10, v14

    .line 219
    :goto_d
    invoke-static {}, LY/w;->L()Z

    .line 220
    .line 221
    .line 222
    move-result v12

    .line 223
    if-eqz v12, :cond_15

    .line 224
    .line 225
    const/4 v12, -0x1

    .line 226
    const-string v14, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreen (PromotionalOfferScreen.kt:40)"

    .line 227
    .line 228
    invoke-static {v0, v8, v12, v14}, LY/w;->U(IIILjava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_15
    const/4 v0, 0x0

    .line 232
    invoke-static {v6, v0}, Lx/m;->a(LY/m;I)Z

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    sget-object v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$textColor$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$textColor$1;

    .line 237
    .line 238
    invoke-static {v2, v12, v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigDataExtensionsKt;->getColorForTheme(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;ZLkotlin/jvm/functions/Function1;)Ls0/r0;

    .line 239
    .line 240
    .line 241
    move-result-object v33

    .line 242
    sget-object v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$buttonBackgroundColor$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$buttonBackgroundColor$1;

    .line 243
    .line 244
    invoke-static {v2, v12, v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigDataExtensionsKt;->getColorForTheme(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;ZLkotlin/jvm/functions/Function1;)Ls0/r0;

    .line 245
    .line 246
    .line 247
    move-result-object v34

    .line 248
    sget-object v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$buttonTextColor$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$buttonTextColor$1;

    .line 249
    .line 250
    invoke-static {v2, v12, v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigDataExtensionsKt;->getColorForTheme(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;ZLkotlin/jvm/functions/Function1;)Ls0/r0;

    .line 251
    .line 252
    .line 253
    move-result-object v35

    .line 254
    sget-object v12, Ll0/e;->a:Ll0/e$a;

    .line 255
    .line 256
    invoke-virtual {v12}, Ll0/e$a;->g()Ll0/e$b;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    const/4 v14, 0x0

    .line 261
    const/4 v15, 0x1

    .line 262
    const/4 v13, 0x0

    .line 263
    invoke-static {v10, v14, v15, v13}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    const/16 v15, 0x18

    .line 268
    .line 269
    int-to-float v15, v15

    .line 270
    invoke-static {v15}, Li1/h;->n(F)F

    .line 271
    .line 272
    .line 273
    move-result v15

    .line 274
    invoke-static {v11, v15, v14, v9, v13}, Landroidx/compose/foundation/layout/p;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    sget-object v11, LC/b;->a:LC/b;

    .line 279
    .line 280
    invoke-virtual {v11}, LC/b;->h()LC/b$m;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    const/16 v15, 0x30

    .line 285
    .line 286
    invoke-static {v11, v12, v6, v15}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-static {v6, v0}, LY/h;->a(LY/m;I)I

    .line 291
    .line 292
    .line 293
    move-result v12

    .line 294
    invoke-interface {v6}, LY/m;->r()LY/I;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    invoke-static {v6, v9}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    sget-object v19, LK0/g;->M:LK0/g$a;

    .line 303
    .line 304
    invoke-virtual/range {v19 .. v19}, LK0/g$a;->a()Lie/a;

    .line 305
    .line 306
    .line 307
    move-result-object v14

    .line 308
    invoke-interface {v6}, LY/m;->j()LY/d;

    .line 309
    .line 310
    .line 311
    move-result-object v21

    .line 312
    if-nez v21, :cond_16

    .line 313
    .line 314
    invoke-static {}, LY/h;->d()V

    .line 315
    .line 316
    .line 317
    :cond_16
    invoke-interface {v6}, LY/m;->I()V

    .line 318
    .line 319
    .line 320
    invoke-interface {v6}, LY/m;->e()Z

    .line 321
    .line 322
    .line 323
    move-result v21

    .line 324
    if-eqz v21, :cond_17

    .line 325
    .line 326
    invoke-interface {v6, v14}, LY/m;->h(Lie/a;)V

    .line 327
    .line 328
    .line 329
    goto :goto_e

    .line 330
    :cond_17
    invoke-interface {v6}, LY/m;->s()V

    .line 331
    .line 332
    .line 333
    :goto_e
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    invoke-virtual/range {v19 .. v19}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v14, v11, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v19 .. v19}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-static {v14, v13, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v19 .. v19}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-interface {v14}, LY/m;->e()Z

    .line 356
    .line 357
    .line 358
    move-result v11

    .line 359
    if-nez v11, :cond_18

    .line 360
    .line 361
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v11

    .line 365
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    invoke-static {v11, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    if-nez v11, :cond_19

    .line 374
    .line 375
    :cond_18
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    invoke-interface {v14, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    invoke-interface {v14, v11, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 387
    .line 388
    .line 389
    :cond_19
    invoke-virtual/range {v19 .. v19}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {v14, v9, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 394
    .line 395
    .line 396
    sget-object v0, LC/j;->a:LC/j;

    .line 397
    .line 398
    sget-object v21, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 399
    .line 400
    int-to-float v9, v15

    .line 401
    invoke-static {v9}, Li1/h;->n(F)F

    .line 402
    .line 403
    .line 404
    move-result v23

    .line 405
    const/16 v9, 0x10

    .line 406
    .line 407
    int-to-float v9, v9

    .line 408
    invoke-static {v9}, Li1/h;->n(F)F

    .line 409
    .line 410
    .line 411
    move-result v25

    .line 412
    const/16 v26, 0x5

    .line 413
    .line 414
    const/16 v27, 0x0

    .line 415
    .line 416
    const/16 v22, 0x0

    .line 417
    .line 418
    const/16 v24, 0x0

    .line 419
    .line 420
    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 421
    .line 422
    .line 423
    move-result-object v11

    .line 424
    const/16 v12, 0x64

    .line 425
    .line 426
    int-to-float v12, v12

    .line 427
    invoke-static {v12}, Li1/h;->n(F)F

    .line 428
    .line 429
    .line 430
    move-result v12

    .line 431
    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/s;->r(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 432
    .line 433
    .line 434
    move-result-object v11

    .line 435
    const/4 v12, 0x6

    .line 436
    const/4 v13, 0x0

    .line 437
    invoke-static {v11, v6, v12, v13}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AppIconKt;->AppIcon(Landroidx/compose/ui/e;LY/m;II)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;->getConfiguredPromotionalOffer()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    invoke-virtual {v11}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;->getTitle()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v11

    .line 448
    sget-object v12, LU/D;->a:LU/D;

    .line 449
    .line 450
    sget v13, LU/D;->b:I

    .line 451
    .line 452
    invoke-virtual {v12, v6, v13}, LU/D;->c(LY/m;I)LU/o0;

    .line 453
    .line 454
    .line 455
    move-result-object v14

    .line 456
    invoke-virtual {v14}, LU/o0;->h()LU0/Y0;

    .line 457
    .line 458
    .line 459
    move-result-object v28

    .line 460
    const v14, -0x19c92c82

    .line 461
    .line 462
    .line 463
    invoke-interface {v6, v14}, LY/m;->V(I)V

    .line 464
    .line 465
    .line 466
    if-nez v33, :cond_1a

    .line 467
    .line 468
    invoke-virtual {v12, v6, v13}, LU/D;->a(LY/m;I)LU/l;

    .line 469
    .line 470
    .line 471
    move-result-object v14

    .line 472
    invoke-virtual {v14}, LU/l;->p()J

    .line 473
    .line 474
    .line 475
    move-result-wide v14

    .line 476
    goto :goto_f

    .line 477
    :cond_1a
    invoke-virtual/range {v33 .. v33}, Ls0/r0;->A()J

    .line 478
    .line 479
    .line 480
    move-result-wide v14

    .line 481
    :goto_f
    invoke-interface {v6}, LY/m;->O()V

    .line 482
    .line 483
    .line 484
    invoke-static {v9}, Li1/h;->n(F)F

    .line 485
    .line 486
    .line 487
    move-result v23

    .line 488
    const/16 v26, 0xd

    .line 489
    .line 490
    const/16 v27, 0x0

    .line 491
    .line 492
    const/16 v22, 0x0

    .line 493
    .line 494
    const/16 v24, 0x0

    .line 495
    .line 496
    const/16 v25, 0x0

    .line 497
    .line 498
    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 499
    .line 500
    .line 501
    move-result-object v17

    .line 502
    move-object/from16 v37, v21

    .line 503
    .line 504
    const/16 v31, 0x0

    .line 505
    .line 506
    const v32, 0xfff8

    .line 507
    .line 508
    .line 509
    move-object/from16 v19, v12

    .line 510
    .line 511
    move/from16 v21, v13

    .line 512
    .line 513
    const-wide/16 v12, 0x0

    .line 514
    .line 515
    move/from16 v22, v8

    .line 516
    .line 517
    move-object v8, v11

    .line 518
    move-wide/from16 v46, v14

    .line 519
    .line 520
    move-object v15, v10

    .line 521
    move-wide/from16 v10, v46

    .line 522
    .line 523
    const/4 v14, 0x0

    .line 524
    move-object/from16 v23, v15

    .line 525
    .line 526
    const/4 v15, 0x0

    .line 527
    const/16 v24, 0x4000

    .line 528
    .line 529
    const/16 v16, 0x0

    .line 530
    .line 531
    move/from16 v25, v9

    .line 532
    .line 533
    move-object/from16 v9, v17

    .line 534
    .line 535
    const/16 v26, 0x0

    .line 536
    .line 537
    const-wide/16 v17, 0x0

    .line 538
    .line 539
    move-object/from16 v27, v19

    .line 540
    .line 541
    const/16 v19, 0x0

    .line 542
    .line 543
    const/16 v29, 0x0

    .line 544
    .line 545
    const/16 v20, 0x0

    .line 546
    .line 547
    move/from16 v38, v21

    .line 548
    .line 549
    move/from16 v30, v22

    .line 550
    .line 551
    const-wide/16 v21, 0x0

    .line 552
    .line 553
    move-object/from16 v39, v23

    .line 554
    .line 555
    const/16 v23, 0x0

    .line 556
    .line 557
    move/from16 v40, v24

    .line 558
    .line 559
    const/16 v24, 0x0

    .line 560
    .line 561
    move/from16 v41, v25

    .line 562
    .line 563
    const/16 v25, 0x0

    .line 564
    .line 565
    move-object/from16 v42, v26

    .line 566
    .line 567
    const/16 v26, 0x0

    .line 568
    .line 569
    move-object/from16 v43, v27

    .line 570
    .line 571
    const/16 v27, 0x0

    .line 572
    .line 573
    move/from16 v44, v30

    .line 574
    .line 575
    const/16 v30, 0x30

    .line 576
    .line 577
    move-object/from16 p6, v0

    .line 578
    .line 579
    move-object/from16 v29, v6

    .line 580
    .line 581
    move/from16 v2, v38

    .line 582
    .line 583
    move-object/from16 v0, v43

    .line 584
    .line 585
    move/from16 v6, v44

    .line 586
    .line 587
    const/16 v7, 0x800

    .line 588
    .line 589
    invoke-static/range {v8 .. v32}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 590
    .line 591
    .line 592
    move-object/from16 v8, v29

    .line 593
    .line 594
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;->getConfiguredPromotionalOffer()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;

    .line 595
    .line 596
    .line 597
    move-result-object v9

    .line 598
    invoke-virtual {v9}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;->getSubtitle()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v9

    .line 602
    invoke-virtual {v0, v8, v2}, LU/D;->c(LY/m;I)LU/o0;

    .line 603
    .line 604
    .line 605
    move-result-object v10

    .line 606
    invoke-virtual {v10}, LU/o0;->b()LU0/Y0;

    .line 607
    .line 608
    .line 609
    move-result-object v28

    .line 610
    const v10, -0x19c90902

    .line 611
    .line 612
    .line 613
    invoke-interface {v8, v10}, LY/m;->V(I)V

    .line 614
    .line 615
    .line 616
    if-nez v33, :cond_1b

    .line 617
    .line 618
    invoke-virtual {v0, v8, v2}, LU/D;->a(LY/m;I)LU/l;

    .line 619
    .line 620
    .line 621
    move-result-object v10

    .line 622
    invoke-virtual {v10}, LU/l;->p()J

    .line 623
    .line 624
    .line 625
    move-result-wide v10

    .line 626
    goto :goto_10

    .line 627
    :cond_1b
    invoke-virtual/range {v33 .. v33}, Ls0/r0;->A()J

    .line 628
    .line 629
    .line 630
    move-result-wide v10

    .line 631
    :goto_10
    invoke-interface {v8}, LY/m;->O()V

    .line 632
    .line 633
    .line 634
    invoke-static/range {v41 .. v41}, Li1/h;->n(F)F

    .line 635
    .line 636
    .line 637
    move-result v23

    .line 638
    const/16 v26, 0xd

    .line 639
    .line 640
    const/16 v27, 0x0

    .line 641
    .line 642
    const/16 v22, 0x0

    .line 643
    .line 644
    const/16 v24, 0x0

    .line 645
    .line 646
    const/16 v25, 0x0

    .line 647
    .line 648
    move-object/from16 v21, v37

    .line 649
    .line 650
    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 651
    .line 652
    .line 653
    move-result-object v12

    .line 654
    const/16 v31, 0x0

    .line 655
    .line 656
    const v32, 0xfff8

    .line 657
    .line 658
    .line 659
    move-object/from16 v29, v8

    .line 660
    .line 661
    move-object v8, v9

    .line 662
    move-object v9, v12

    .line 663
    const-wide/16 v12, 0x0

    .line 664
    .line 665
    const/4 v14, 0x0

    .line 666
    const/4 v15, 0x0

    .line 667
    const/16 v16, 0x0

    .line 668
    .line 669
    const-wide/16 v17, 0x0

    .line 670
    .line 671
    const/16 v19, 0x0

    .line 672
    .line 673
    const/16 v20, 0x0

    .line 674
    .line 675
    const-wide/16 v21, 0x0

    .line 676
    .line 677
    const/16 v23, 0x0

    .line 678
    .line 679
    const/16 v24, 0x0

    .line 680
    .line 681
    const/16 v25, 0x0

    .line 682
    .line 683
    const/16 v26, 0x0

    .line 684
    .line 685
    const/16 v30, 0x30

    .line 686
    .line 687
    invoke-static/range {v8 .. v32}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 688
    .line 689
    .line 690
    move-object/from16 v8, v29

    .line 691
    .line 692
    const/16 v25, 0x2

    .line 693
    .line 694
    const/16 v26, 0x0

    .line 695
    .line 696
    const/high16 v23, 0x3f800000    # 1.0f

    .line 697
    .line 698
    move-object/from16 v21, p6

    .line 699
    .line 700
    move-object/from16 v22, v37

    .line 701
    .line 702
    invoke-static/range {v21 .. v26}, LC/i;->c(LC/i;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 703
    .line 704
    .line 705
    move-result-object v9

    .line 706
    move-object/from16 v10, v22

    .line 707
    .line 708
    const/4 v11, 0x0

    .line 709
    invoke-static {v9, v8, v11}, LC/K;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 710
    .line 711
    .line 712
    const v9, -0x19c8ef64

    .line 713
    .line 714
    .line 715
    invoke-interface {v8, v9}, LY/m;->V(I)V

    .line 716
    .line 717
    .line 718
    and-int/lit16 v9, v6, 0x1c00

    .line 719
    .line 720
    if-ne v9, v7, :cond_1c

    .line 721
    .line 722
    const/4 v15, 0x1

    .line 723
    goto :goto_11

    .line 724
    :cond_1c
    move v15, v11

    .line 725
    :goto_11
    invoke-interface {v8, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v7

    .line 729
    or-int/2addr v7, v15

    .line 730
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v9

    .line 734
    if-nez v7, :cond_1d

    .line 735
    .line 736
    sget-object v7, LY/m;->a:LY/m$a;

    .line 737
    .line 738
    invoke-virtual {v7}, LY/m$a;->a()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v7

    .line 742
    if-ne v9, v7, :cond_1e

    .line 743
    .line 744
    :cond_1d
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$1$1$1;

    .line 745
    .line 746
    invoke-direct {v9, v4, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;)V

    .line 747
    .line 748
    .line 749
    invoke-interface {v8, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    :cond_1e
    move-object v7, v9

    .line 753
    check-cast v7, Lie/a;

    .line 754
    .line 755
    invoke-interface {v8}, LY/m;->O()V

    .line 756
    .line 757
    .line 758
    const/4 v9, 0x0

    .line 759
    const/4 v12, 0x0

    .line 760
    const/4 v13, 0x1

    .line 761
    invoke-static {v10, v12, v13, v9}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 762
    .line 763
    .line 764
    move-result-object v14

    .line 765
    invoke-static/range {v41 .. v41}, Li1/h;->n(F)F

    .line 766
    .line 767
    .line 768
    move-result v18

    .line 769
    const/16 v19, 0x7

    .line 770
    .line 771
    const/16 v20, 0x0

    .line 772
    .line 773
    const/4 v15, 0x0

    .line 774
    const/16 v16, 0x0

    .line 775
    .line 776
    const/16 v17, 0x0

    .line 777
    .line 778
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 779
    .line 780
    .line 781
    move-result-object v20

    .line 782
    sget-object v13, LU/i;->a:LU/i;

    .line 783
    .line 784
    const v14, -0x19c8cd7b

    .line 785
    .line 786
    .line 787
    invoke-interface {v8, v14}, LY/m;->V(I)V

    .line 788
    .line 789
    .line 790
    if-nez v34, :cond_1f

    .line 791
    .line 792
    invoke-virtual {v0, v8, v2}, LU/D;->a(LY/m;I)LU/l;

    .line 793
    .line 794
    .line 795
    move-result-object v14

    .line 796
    invoke-virtual {v14}, LU/l;->C()J

    .line 797
    .line 798
    .line 799
    move-result-wide v14

    .line 800
    goto :goto_12

    .line 801
    :cond_1f
    invoke-virtual/range {v34 .. v34}, Ls0/r0;->A()J

    .line 802
    .line 803
    .line 804
    move-result-wide v14

    .line 805
    :goto_12
    invoke-interface {v8}, LY/m;->O()V

    .line 806
    .line 807
    .line 808
    const v9, -0x19c8c21f

    .line 809
    .line 810
    .line 811
    invoke-interface {v8, v9}, LY/m;->V(I)V

    .line 812
    .line 813
    .line 814
    if-nez v35, :cond_20

    .line 815
    .line 816
    invoke-virtual {v0, v8, v2}, LU/D;->a(LY/m;I)LU/l;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    invoke-virtual {v0}, LU/l;->s()J

    .line 821
    .line 822
    .line 823
    move-result-wide v16

    .line 824
    goto :goto_13

    .line 825
    :cond_20
    invoke-virtual/range {v35 .. v35}, Ls0/r0;->A()J

    .line 826
    .line 827
    .line 828
    move-result-wide v16

    .line 829
    :goto_13
    invoke-interface {v8}, LY/m;->O()V

    .line 830
    .line 831
    .line 832
    sget v0, LU/i;->o:I

    .line 833
    .line 834
    shl-int/lit8 v0, v0, 0xc

    .line 835
    .line 836
    const/16 v19, 0xc

    .line 837
    .line 838
    move-object/from16 v29, v8

    .line 839
    .line 840
    move-object/from16 v21, v10

    .line 841
    .line 842
    move-object v8, v13

    .line 843
    move-wide v9, v14

    .line 844
    const-wide/16 v13, 0x0

    .line 845
    .line 846
    move/from16 v36, v11

    .line 847
    .line 848
    move/from16 v45, v12

    .line 849
    .line 850
    move-wide/from16 v11, v16

    .line 851
    .line 852
    const-wide/16 v15, 0x0

    .line 853
    .line 854
    move/from16 v18, v0

    .line 855
    .line 856
    move-object/from16 v0, v21

    .line 857
    .line 858
    move-object/from16 v17, v29

    .line 859
    .line 860
    move/from16 v4, v45

    .line 861
    .line 862
    const/4 v2, 0x0

    .line 863
    invoke-virtual/range {v8 .. v19}, LU/i;->b(JJJJLY/m;II)LU/h;

    .line 864
    .line 865
    .line 866
    move-result-object v12

    .line 867
    move-object/from16 v8, v17

    .line 868
    .line 869
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$1$2;

    .line 870
    .line 871
    invoke-direct {v9, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$1$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;)V

    .line 872
    .line 873
    .line 874
    const v10, 0x4464af9

    .line 875
    .line 876
    .line 877
    const/16 v11, 0x36

    .line 878
    .line 879
    const/4 v13, 0x1

    .line 880
    invoke-static {v10, v13, v9, v8, v11}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 881
    .line 882
    .line 883
    move-result-object v17

    .line 884
    const v19, 0x30000030

    .line 885
    .line 886
    .line 887
    move-object/from16 v9, v20

    .line 888
    .line 889
    const/16 v20, 0x1ec

    .line 890
    .line 891
    const/4 v10, 0x0

    .line 892
    move v13, v11

    .line 893
    const/4 v11, 0x0

    .line 894
    move v14, v13

    .line 895
    const/4 v13, 0x0

    .line 896
    move v15, v14

    .line 897
    const/4 v14, 0x0

    .line 898
    move/from16 v16, v15

    .line 899
    .line 900
    const/4 v15, 0x0

    .line 901
    move/from16 v18, v16

    .line 902
    .line 903
    const/16 v16, 0x0

    .line 904
    .line 905
    move-object/from16 v46, v8

    .line 906
    .line 907
    move-object v8, v7

    .line 908
    move/from16 v7, v18

    .line 909
    .line 910
    move-object/from16 v18, v46

    .line 911
    .line 912
    invoke-static/range {v8 .. v20}, LU/k;->a(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;LU/h;LU/j;Lx/g;LC/A;LB/m;Lie/o;LY/m;II)V

    .line 913
    .line 914
    .line 915
    move-object/from16 v8, v18

    .line 916
    .line 917
    const v9, -0x19c89da6

    .line 918
    .line 919
    .line 920
    invoke-interface {v8, v9}, LY/m;->V(I)V

    .line 921
    .line 922
    .line 923
    const v9, 0xe000

    .line 924
    .line 925
    .line 926
    and-int/2addr v6, v9

    .line 927
    const/16 v9, 0x4000

    .line 928
    .line 929
    if-ne v6, v9, :cond_21

    .line 930
    .line 931
    const/16 v36, 0x1

    .line 932
    .line 933
    :cond_21
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v6

    .line 937
    if-nez v36, :cond_22

    .line 938
    .line 939
    sget-object v9, LY/m;->a:LY/m$a;

    .line 940
    .line 941
    invoke-virtual {v9}, LY/m$a;->a()Ljava/lang/Object;

    .line 942
    .line 943
    .line 944
    move-result-object v9

    .line 945
    if-ne v6, v9, :cond_23

    .line 946
    .line 947
    :cond_22
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$1$3$1;

    .line 948
    .line 949
    invoke-direct {v6, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$1$3$1;-><init>(Lie/a;)V

    .line 950
    .line 951
    .line 952
    invoke-interface {v8, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    :cond_23
    check-cast v6, Lie/a;

    .line 956
    .line 957
    invoke-interface {v8}, LY/m;->O()V

    .line 958
    .line 959
    .line 960
    const/4 v13, 0x1

    .line 961
    invoke-static {v0, v4, v13, v2}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 962
    .line 963
    .line 964
    move-result-object v14

    .line 965
    invoke-static/range {v41 .. v41}, Li1/h;->n(F)F

    .line 966
    .line 967
    .line 968
    move-result v18

    .line 969
    const/16 v19, 0x7

    .line 970
    .line 971
    const/16 v20, 0x0

    .line 972
    .line 973
    const/4 v15, 0x0

    .line 974
    const/16 v16, 0x0

    .line 975
    .line 976
    const/16 v17, 0x0

    .line 977
    .line 978
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 979
    .line 980
    .line 981
    move-result-object v9

    .line 982
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$1$4;

    .line 983
    .line 984
    invoke-direct {v0, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$1$4;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 985
    .line 986
    .line 987
    const v2, -0xf5817b4

    .line 988
    .line 989
    .line 990
    invoke-static {v2, v13, v0, v8, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 991
    .line 992
    .line 993
    move-result-object v17

    .line 994
    const v19, 0x30000030

    .line 995
    .line 996
    .line 997
    const/16 v20, 0x1fc

    .line 998
    .line 999
    const/4 v10, 0x0

    .line 1000
    const/4 v11, 0x0

    .line 1001
    const/4 v12, 0x0

    .line 1002
    const/4 v13, 0x0

    .line 1003
    const/4 v14, 0x0

    .line 1004
    const/4 v15, 0x0

    .line 1005
    const/16 v16, 0x0

    .line 1006
    .line 1007
    move-object/from16 v18, v8

    .line 1008
    .line 1009
    move-object v8, v6

    .line 1010
    invoke-static/range {v8 .. v20}, LU/k;->c(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;LU/h;LU/j;Lx/g;LC/A;LB/m;Lie/o;LY/m;II)V

    .line 1011
    .line 1012
    .line 1013
    move-object/from16 v8, v18

    .line 1014
    .line 1015
    invoke-interface {v8}, LY/m;->x()V

    .line 1016
    .line 1017
    .line 1018
    invoke-static {}, LY/w;->L()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v0

    .line 1022
    if-eqz v0, :cond_24

    .line 1023
    .line 1024
    invoke-static {}, LY/w;->T()V

    .line 1025
    .line 1026
    .line 1027
    :cond_24
    move-object/from16 v6, v39

    .line 1028
    .line 1029
    :goto_14
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v9

    .line 1033
    if-eqz v9, :cond_25

    .line 1034
    .line 1035
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$2;

    .line 1036
    .line 1037
    move-object/from16 v2, p1

    .line 1038
    .line 1039
    move-object/from16 v4, p3

    .line 1040
    .line 1041
    move/from16 v7, p7

    .line 1042
    .line 1043
    move/from16 v8, p8

    .line 1044
    .line 1045
    invoke-direct/range {v0 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferScreen$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Lie/a;Landroidx/compose/ui/e;II)V

    .line 1046
    .line 1047
    .line 1048
    invoke-interface {v9, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 1049
    .line 1050
    .line 1051
    :cond_25
    return-void
.end method

.method public static final PromotionalOfferViewPreview(LY/m;I)V
    .locals 20

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x20f38cfd

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v8

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v8}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v8}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferViewPreview (PromotionalOfferScreen.kt:109)"

    .line 34
    .line 35
    invoke-static {v1, v0, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x3

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-static {v1, v2, v2, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getManagementScreen()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_5

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;->getPaths()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 74
    .line 75
    invoke-virtual {v5}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getType()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    sget-object v7, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;->REFUND_REQUEST:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 80
    .line 81
    if-ne v6, v7, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 85
    .line 86
    const-string v1, "Collection contains no element matching the predicate."

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_5
    move-object v5, v4

    .line 93
    :goto_1
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getPromotionalOffer()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;

    .line 104
    .line 105
    const/16 v15, 0x3c

    .line 106
    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    const-string v9, "rc-cancel-offer"

    .line 110
    .line 111
    const-string v10, "monthly"

    .line 112
    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    const/4 v14, 0x0

    .line 117
    invoke-static/range {v9 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/PreviewDataCreatorsKt;->previewSubscriptionOption$default(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/InstallmentsInfo;ILjava/lang/Object;)Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    new-instance v9, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 122
    .line 123
    sget-object v12, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;->MISSING_PURCHASE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 124
    .line 125
    const/16 v18, 0xf8

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    const-string v10, "1"

    .line 130
    .line 131
    const-string v11, "Check for previous purchases"

    .line 132
    .line 133
    const/4 v15, 0x0

    .line 134
    const/16 v17, 0x0

    .line 135
    .line 136
    invoke-direct/range {v9 .. v19}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 137
    .line 138
    .line 139
    const-string v7, "1 month for $7.99, then $9.99/mth"

    .line 140
    .line 141
    invoke-direct {v5, v1, v6, v9, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    .line 145
    .line 146
    invoke-static {v1, v2, v2, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v6}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getAppearance()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-static {v1, v2, v2, v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    move-object v2, v5

    .line 163
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferViewPreview$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferViewPreview$1;

    .line 164
    .line 165
    move-object v3, v6

    .line 166
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferViewPreview$2;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferViewPreview$2;

    .line 167
    .line 168
    const/16 v9, 0x6c00

    .line 169
    .line 170
    const/16 v10, 0x20

    .line 171
    .line 172
    const/4 v7, 0x0

    .line 173
    invoke-static/range {v2 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt;->PromotionalOfferScreen(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lkotlin/jvm/functions/Function1;Lie/a;Landroidx/compose/ui/e;LY/m;II)V

    .line 174
    .line 175
    .line 176
    invoke-static {}, LY/w;->L()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_6

    .line 181
    .line 182
    invoke-static {}, LY/w;->T()V

    .line 183
    .line 184
    .line 185
    :cond_6
    :goto_2
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    if-eqz v1, :cond_7

    .line 190
    .line 191
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferViewPreview$3;

    .line 192
    .line 193
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PromotionalOfferScreenKt$PromotionalOfferViewPreview$3;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    return-void
.end method
