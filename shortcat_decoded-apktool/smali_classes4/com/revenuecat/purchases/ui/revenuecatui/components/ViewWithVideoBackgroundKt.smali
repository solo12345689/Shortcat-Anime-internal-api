.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/ViewWithVideoBackgroundKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;",
        "background",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Ls0/E1;",
        "shape",
        "Lkotlin/Function1;",
        "LC/c;",
        "LTd/L;",
        "content",
        "ViewWithVideoBackground",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lie/o;LY/m;II)V",
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
.method public static final ViewWithVideoBackground(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lie/o;LY/m;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;",
            "Landroidx/compose/ui/e;",
            "Ls0/E1;",
            "Lie/o;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p4

    .line 6
    .line 7
    move/from16 v9, p6

    .line 8
    .line 9
    const-string v0, "state"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "content"

    .line 15
    .line 16
    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, 0x5ea1b057

    .line 20
    .line 21
    .line 22
    move-object/from16 v2, p5

    .line 23
    .line 24
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    and-int/lit8 v2, p7, 0x1

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    or-int/lit8 v2, v9, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v2, v9, 0x6

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    invoke-interface {v4, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v2, 0x2

    .line 48
    :goto_0
    or-int/2addr v2, v9

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v2, v9

    .line 51
    :goto_1
    and-int/lit8 v3, p7, 0x2

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    or-int/lit8 v2, v2, 0x30

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_3
    and-int/lit8 v3, v9, 0x30

    .line 59
    .line 60
    if-nez v3, :cond_6

    .line 61
    .line 62
    and-int/lit8 v3, v9, 0x40

    .line 63
    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    invoke-interface {v4, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-interface {v4, v7}, LY/m;->F(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    :goto_2
    if-eqz v3, :cond_5

    .line 76
    .line 77
    const/16 v3, 0x20

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    const/16 v3, 0x10

    .line 81
    .line 82
    :goto_3
    or-int/2addr v2, v3

    .line 83
    :cond_6
    :goto_4
    and-int/lit8 v3, p7, 0x4

    .line 84
    .line 85
    if-eqz v3, :cond_8

    .line 86
    .line 87
    or-int/lit16 v2, v2, 0x180

    .line 88
    .line 89
    :cond_7
    move-object/from16 v5, p2

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_8
    and-int/lit16 v5, v9, 0x180

    .line 93
    .line 94
    if-nez v5, :cond_7

    .line 95
    .line 96
    move-object/from16 v5, p2

    .line 97
    .line 98
    invoke-interface {v4, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_9

    .line 103
    .line 104
    const/16 v6, 0x100

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_9
    const/16 v6, 0x80

    .line 108
    .line 109
    :goto_5
    or-int/2addr v2, v6

    .line 110
    :goto_6
    and-int/lit8 v6, p7, 0x8

    .line 111
    .line 112
    if-eqz v6, :cond_b

    .line 113
    .line 114
    or-int/lit16 v2, v2, 0xc00

    .line 115
    .line 116
    :cond_a
    move-object/from16 v10, p3

    .line 117
    .line 118
    goto :goto_8

    .line 119
    :cond_b
    and-int/lit16 v10, v9, 0xc00

    .line 120
    .line 121
    if-nez v10, :cond_a

    .line 122
    .line 123
    move-object/from16 v10, p3

    .line 124
    .line 125
    invoke-interface {v4, v10}, LY/m;->U(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-eqz v11, :cond_c

    .line 130
    .line 131
    const/16 v11, 0x800

    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_c
    const/16 v11, 0x400

    .line 135
    .line 136
    :goto_7
    or-int/2addr v2, v11

    .line 137
    :goto_8
    and-int/lit8 v11, p7, 0x10

    .line 138
    .line 139
    if-eqz v11, :cond_e

    .line 140
    .line 141
    or-int/lit16 v2, v2, 0x6000

    .line 142
    .line 143
    :cond_d
    :goto_9
    move v11, v2

    .line 144
    goto :goto_b

    .line 145
    :cond_e
    and-int/lit16 v11, v9, 0x6000

    .line 146
    .line 147
    if-nez v11, :cond_d

    .line 148
    .line 149
    invoke-interface {v4, v8}, LY/m;->F(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    if-eqz v11, :cond_f

    .line 154
    .line 155
    const/16 v11, 0x4000

    .line 156
    .line 157
    goto :goto_a

    .line 158
    :cond_f
    const/16 v11, 0x2000

    .line 159
    .line 160
    :goto_a
    or-int/2addr v2, v11

    .line 161
    goto :goto_9

    .line 162
    :goto_b
    and-int/lit16 v2, v11, 0x2493

    .line 163
    .line 164
    const/16 v12, 0x2492

    .line 165
    .line 166
    if-ne v2, v12, :cond_11

    .line 167
    .line 168
    invoke-interface {v4}, LY/m;->i()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-nez v2, :cond_10

    .line 173
    .line 174
    goto :goto_c

    .line 175
    :cond_10
    invoke-interface {v4}, LY/m;->K()V

    .line 176
    .line 177
    .line 178
    move-object v0, v4

    .line 179
    move-object v3, v5

    .line 180
    move-object v4, v10

    .line 181
    goto/16 :goto_10

    .line 182
    .line 183
    :cond_11
    :goto_c
    if-eqz v3, :cond_12

    .line 184
    .line 185
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 186
    .line 187
    move-object v12, v2

    .line 188
    goto :goto_d

    .line 189
    :cond_12
    move-object v12, v5

    .line 190
    :goto_d
    if-eqz v6, :cond_13

    .line 191
    .line 192
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    move-object/from16 v24, v2

    .line 197
    .line 198
    goto :goto_e

    .line 199
    :cond_13
    move-object/from16 v24, v10

    .line 200
    .line 201
    :goto_e
    invoke-static {}, LY/w;->L()Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_14

    .line 206
    .line 207
    const/4 v2, -0x1

    .line 208
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.components.ViewWithVideoBackground (ViewWithVideoBackground.kt:25)"

    .line 209
    .line 210
    invoke-static {v0, v11, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_14
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 214
    .line 215
    invoke-virtual {v0}, Ll0/e$a;->o()Ll0/e;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    const/4 v2, 0x0

    .line 220
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v4, v2}, LY/h;->a(LY/m;I)I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    invoke-interface {v4}, LY/m;->r()LY/I;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-static {v4, v12}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    sget-object v10, LK0/g;->M:LK0/g$a;

    .line 237
    .line 238
    invoke-virtual {v10}, LK0/g$a;->a()Lie/a;

    .line 239
    .line 240
    .line 241
    move-result-object v13

    .line 242
    invoke-interface {v4}, LY/m;->j()LY/d;

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    if-nez v14, :cond_15

    .line 247
    .line 248
    invoke-static {}, LY/h;->d()V

    .line 249
    .line 250
    .line 251
    :cond_15
    invoke-interface {v4}, LY/m;->I()V

    .line 252
    .line 253
    .line 254
    invoke-interface {v4}, LY/m;->e()Z

    .line 255
    .line 256
    .line 257
    move-result v14

    .line 258
    if-eqz v14, :cond_16

    .line 259
    .line 260
    invoke-interface {v4, v13}, LY/m;->h(Lie/a;)V

    .line 261
    .line 262
    .line 263
    goto :goto_f

    .line 264
    :cond_16
    invoke-interface {v4}, LY/m;->s()V

    .line 265
    .line 266
    .line 267
    :goto_f
    invoke-static {v4}, LY/m2;->b(LY/m;)LY/m;

    .line 268
    .line 269
    .line 270
    move-result-object v13

    .line 271
    invoke-virtual {v10}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    invoke-static {v13, v0, v14}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v10}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v13, v5, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v10}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-interface {v13}, LY/m;->e()Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-nez v5, :cond_17

    .line 294
    .line 295
    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v14

    .line 303
    invoke-static {v5, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    if-nez v5, :cond_18

    .line 308
    .line 309
    :cond_17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-interface {v13, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-interface {v13, v3, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 321
    .line 322
    .line 323
    :cond_18
    invoke-virtual {v10}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-static {v13, v6, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 328
    .line 329
    .line 330
    sget-object v10, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 331
    .line 332
    const v0, 0x50cce64

    .line 333
    .line 334
    .line 335
    invoke-interface {v4, v0}, LY/m;->V(I)V

    .line 336
    .line 337
    .line 338
    instance-of v0, v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;

    .line 339
    .line 340
    if-eqz v0, :cond_19

    .line 341
    .line 342
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getLocale()Lc1/d;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Lc1/d;->b()Ljava/util/Locale;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/LocalizationKt;->toLocaleId(Ljava/util/Locale;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-static {v0}, Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    move-object v3, v7

    .line 359
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;

    .line 360
    .line 361
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;->getSources()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-static {v0, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    new-array v5, v2, [Lkotlin/Pair;

    .line 370
    .line 371
    invoke-static {v0, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMapKt;->nonEmptyMapOf(Lkotlin/Pair;[Lkotlin/Pair;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;

    .line 372
    .line 373
    .line 374
    move-result-object v14

    .line 375
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;->getLocale()Lc1/d;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Lc1/d;->b()Ljava/util/Locale;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/LocalizationKt;->toLocaleId(Ljava/util/Locale;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-static {v0}, Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;->getFallbackImage()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-static {v0, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    new-array v2, v2, [Lkotlin/Pair;

    .line 400
    .line 401
    invoke-static {v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMapKt;->nonEmptyMapOf(Lkotlin/Pair;[Lkotlin/Pair;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;

    .line 402
    .line 403
    .line 404
    move-result-object v15

    .line 405
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;->getLoop()Z

    .line 406
    .line 407
    .line 408
    move-result v18

    .line 409
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;->getMuteAudio()Z

    .line 410
    .line 411
    .line 412
    move-result v19

    .line 413
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 414
    .line 415
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 416
    .line 417
    invoke-direct {v0, v2, v2}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;->getColorOverlay()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 421
    .line 422
    .line 423
    move-result-object v27

    .line 424
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;->getContentScale()LI0/f;

    .line 425
    .line 426
    .line 427
    move-result-object v28

    .line 428
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object v34

    .line 432
    const/4 v2, 0x0

    .line 433
    const/4 v3, 0x3

    .line 434
    const/4 v5, 0x0

    .line 435
    invoke-static {v2, v2, v3, v5}, Landroidx/compose/foundation/layout/p;->c(FFILjava/lang/Object;)LC/A;

    .line 436
    .line 437
    .line 438
    move-result-object v22

    .line 439
    invoke-static {v2, v2, v3, v5}, Landroidx/compose/foundation/layout/p;->c(FFILjava/lang/Object;)LC/A;

    .line 440
    .line 441
    .line 442
    move-result-object v23

    .line 443
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;

    .line 444
    .line 445
    const/high16 v35, 0x50000

    .line 446
    .line 447
    const/16 v36, 0x0

    .line 448
    .line 449
    const/16 v16, 0x0

    .line 450
    .line 451
    const/16 v17, 0x1

    .line 452
    .line 453
    const/16 v21, 0x1

    .line 454
    .line 455
    const/16 v25, 0x0

    .line 456
    .line 457
    const/16 v26, 0x0

    .line 458
    .line 459
    const/16 v29, 0x0

    .line 460
    .line 461
    const/16 v30, 0x0

    .line 462
    .line 463
    const/16 v31, 0x0

    .line 464
    .line 465
    const/16 v32, 0x0

    .line 466
    .line 467
    const/16 v33, 0x1

    .line 468
    .line 469
    move-object/from16 v20, v0

    .line 470
    .line 471
    invoke-direct/range {v13 .. v36}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;ZZZZLcom/revenuecat/purchases/paywalls/components/properties/Size;ZLC/A;LC/A;Ls0/E1;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LI0/f;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;Ljava/lang/Integer;Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 472
    .line 473
    .line 474
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 475
    .line 476
    invoke-interface {v10, v0}, LC/c;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    shl-int/lit8 v0, v11, 0x3

    .line 481
    .line 482
    and-int/lit8 v5, v0, 0x70

    .line 483
    .line 484
    const/16 v6, 0x8

    .line 485
    .line 486
    const/4 v3, 0x0

    .line 487
    move-object v0, v13

    .line 488
    invoke-static/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoComponentViewKt;->VideoComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/VideoComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/storage/FileRepository;LY/m;II)V

    .line 489
    .line 490
    .line 491
    :cond_19
    invoke-interface {v4}, LY/m;->O()V

    .line 492
    .line 493
    .line 494
    shr-int/lit8 v0, v11, 0x9

    .line 495
    .line 496
    and-int/lit8 v0, v0, 0x70

    .line 497
    .line 498
    const/4 v1, 0x6

    .line 499
    or-int/2addr v0, v1

    .line 500
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-interface {v8, v10, v4, v0}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    invoke-interface {v4}, LY/m;->x()V

    .line 508
    .line 509
    .line 510
    invoke-static {}, LY/w;->L()Z

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    if-eqz v0, :cond_1a

    .line 515
    .line 516
    invoke-static {}, LY/w;->T()V

    .line 517
    .line 518
    .line 519
    :cond_1a
    move-object v0, v4

    .line 520
    move-object v3, v12

    .line 521
    move-object/from16 v4, v24

    .line 522
    .line 523
    :goto_10
    invoke-interface {v0}, LY/m;->k()LY/B1;

    .line 524
    .line 525
    .line 526
    move-result-object v10

    .line 527
    if-eqz v10, :cond_1b

    .line 528
    .line 529
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ViewWithVideoBackgroundKt$ViewWithVideoBackground$2;

    .line 530
    .line 531
    move-object/from16 v1, p0

    .line 532
    .line 533
    move-object v2, v7

    .line 534
    move-object v5, v8

    .line 535
    move v6, v9

    .line 536
    move/from16 v7, p7

    .line 537
    .line 538
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ViewWithVideoBackgroundKt$ViewWithVideoBackground$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lie/o;II)V

    .line 539
    .line 540
    .line 541
    invoke-interface {v10, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 542
    .line 543
    .line 544
    :cond_1b
    return-void
.end method
