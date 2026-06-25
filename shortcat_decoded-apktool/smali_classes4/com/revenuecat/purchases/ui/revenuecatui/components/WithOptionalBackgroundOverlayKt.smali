.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/WithOptionalBackgroundOverlayKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
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
        "Lkotlin/Function0;",
        "LTd/L;",
        "content",
        "WithOptionalBackgroundOverlay",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lkotlin/jvm/functions/Function2;LY/m;II)V",
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
.method public static final WithOptionalBackgroundOverlay(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lkotlin/jvm/functions/Function2;LY/m;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;",
            "Landroidx/compose/ui/e;",
            "Ls0/E1;",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v8, p4

    .line 6
    .line 7
    move/from16 v9, p6

    .line 8
    .line 9
    const-string v2, "state"

    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "content"

    .line 15
    .line 16
    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v2, -0x431d1bc4

    .line 20
    .line 21
    .line 22
    move-object/from16 v3, p5

    .line 23
    .line 24
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    and-int/lit8 v3, p7, 0x1

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    or-int/lit8 v3, v9, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v3, v9, 0x6

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v5, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    const/4 v3, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v3, 0x2

    .line 48
    :goto_0
    or-int/2addr v3, v9

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v3, v9

    .line 51
    :goto_1
    and-int/lit8 v4, p7, 0x2

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    or-int/lit8 v3, v3, 0x30

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_3
    and-int/lit8 v4, v9, 0x30

    .line 59
    .line 60
    if-nez v4, :cond_6

    .line 61
    .line 62
    and-int/lit8 v4, v9, 0x40

    .line 63
    .line 64
    if-nez v4, :cond_4

    .line 65
    .line 66
    invoke-interface {v5, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-interface {v5, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    :goto_2
    if-eqz v4, :cond_5

    .line 76
    .line 77
    const/16 v4, 0x20

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    const/16 v4, 0x10

    .line 81
    .line 82
    :goto_3
    or-int/2addr v3, v4

    .line 83
    :cond_6
    :goto_4
    and-int/lit8 v4, p7, 0x4

    .line 84
    .line 85
    if-eqz v4, :cond_8

    .line 86
    .line 87
    or-int/lit16 v3, v3, 0x180

    .line 88
    .line 89
    :cond_7
    move-object/from16 v6, p2

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_8
    and-int/lit16 v6, v9, 0x180

    .line 93
    .line 94
    if-nez v6, :cond_7

    .line 95
    .line 96
    move-object/from16 v6, p2

    .line 97
    .line 98
    invoke-interface {v5, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_9

    .line 103
    .line 104
    const/16 v7, 0x100

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_9
    const/16 v7, 0x80

    .line 108
    .line 109
    :goto_5
    or-int/2addr v3, v7

    .line 110
    :goto_6
    and-int/lit8 v7, p7, 0x8

    .line 111
    .line 112
    if-eqz v7, :cond_b

    .line 113
    .line 114
    or-int/lit16 v3, v3, 0xc00

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
    invoke-interface {v5, v10}, LY/m;->U(Ljava/lang/Object;)Z

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
    or-int/2addr v3, v11

    .line 137
    :goto_8
    and-int/lit8 v11, p7, 0x10

    .line 138
    .line 139
    if-eqz v11, :cond_d

    .line 140
    .line 141
    or-int/lit16 v3, v3, 0x6000

    .line 142
    .line 143
    goto :goto_a

    .line 144
    :cond_d
    and-int/lit16 v11, v9, 0x6000

    .line 145
    .line 146
    if-nez v11, :cond_f

    .line 147
    .line 148
    invoke-interface {v5, v8}, LY/m;->F(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    if-eqz v11, :cond_e

    .line 153
    .line 154
    const/16 v11, 0x4000

    .line 155
    .line 156
    goto :goto_9

    .line 157
    :cond_e
    const/16 v11, 0x2000

    .line 158
    .line 159
    :goto_9
    or-int/2addr v3, v11

    .line 160
    :cond_f
    :goto_a
    and-int/lit16 v11, v3, 0x2493

    .line 161
    .line 162
    const/16 v12, 0x2492

    .line 163
    .line 164
    if-ne v11, v12, :cond_11

    .line 165
    .line 166
    invoke-interface {v5}, LY/m;->i()Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    if-nez v11, :cond_10

    .line 171
    .line 172
    goto :goto_c

    .line 173
    :cond_10
    invoke-interface {v5}, LY/m;->K()V

    .line 174
    .line 175
    .line 176
    move-object v3, v6

    .line 177
    :goto_b
    move-object v4, v10

    .line 178
    goto/16 :goto_10

    .line 179
    .line 180
    :cond_11
    :goto_c
    if-eqz v4, :cond_12

    .line 181
    .line 182
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_12
    move-object v4, v6

    .line 186
    :goto_d
    if-eqz v7, :cond_13

    .line 187
    .line 188
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    move-object v10, v6

    .line 193
    :cond_13
    invoke-static {}, LY/w;->L()Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_14

    .line 198
    .line 199
    const/4 v6, -0x1

    .line 200
    const-string v7, "com.revenuecat.purchases.ui.revenuecatui.components.WithOptionalBackgroundOverlay (WithOptionalBackgroundOverlay.kt:18)"

    .line 201
    .line 202
    invoke-static {v2, v3, v6, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :cond_14
    instance-of v2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Video;

    .line 206
    .line 207
    if-eqz v2, :cond_15

    .line 208
    .line 209
    const v2, -0x32426cff

    .line 210
    .line 211
    .line 212
    invoke-interface {v5, v2}, LY/m;->V(I)V

    .line 213
    .line 214
    .line 215
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/WithOptionalBackgroundOverlayKt$WithOptionalBackgroundOverlay$1;

    .line 216
    .line 217
    invoke-direct {v2, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/WithOptionalBackgroundOverlayKt$WithOptionalBackgroundOverlay$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    const/16 v6, 0x36

    .line 221
    .line 222
    const v7, 0x144487ec

    .line 223
    .line 224
    .line 225
    const/4 v11, 0x1

    .line 226
    invoke-static {v7, v11, v2, v5, v6}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    and-int/lit8 v6, v3, 0xe

    .line 231
    .line 232
    or-int/lit16 v6, v6, 0x6000

    .line 233
    .line 234
    and-int/lit8 v7, v3, 0x70

    .line 235
    .line 236
    or-int/2addr v6, v7

    .line 237
    and-int/lit16 v7, v3, 0x380

    .line 238
    .line 239
    or-int/2addr v6, v7

    .line 240
    and-int/lit16 v3, v3, 0x1c00

    .line 241
    .line 242
    or-int/2addr v6, v3

    .line 243
    const/4 v7, 0x0

    .line 244
    move-object v3, v4

    .line 245
    move-object v4, v2

    .line 246
    move-object v2, v3

    .line 247
    move-object v3, v10

    .line 248
    invoke-static/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ViewWithVideoBackgroundKt;->ViewWithVideoBackground(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lie/o;LY/m;II)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v5}, LY/m;->O()V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_f

    .line 255
    .line 256
    :cond_15
    move-object v2, v4

    .line 257
    instance-of v0, v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;

    .line 258
    .line 259
    if-eqz v0, :cond_1a

    .line 260
    .line 261
    move-object v0, v1

    .line 262
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;

    .line 263
    .line 264
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;->getColorOverlay()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    if-eqz v4, :cond_1a

    .line 269
    .line 270
    const v4, -0x323d4bfa    # -4.0832224E8f

    .line 271
    .line 272
    .line 273
    invoke-interface {v5, v4}, LY/m;->V(I)V

    .line 274
    .line 275
    .line 276
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    .line 277
    .line 278
    invoke-virtual {v4}, Ll0/e$a;->o()Ll0/e;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    const/4 v6, 0x0

    .line 283
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-static {v5, v6}, LY/h;->a(LY/m;I)I

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    invoke-interface {v5}, LY/m;->r()LY/I;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    invoke-static {v5, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 296
    .line 297
    .line 298
    move-result-object v12

    .line 299
    sget-object v13, LK0/g;->M:LK0/g$a;

    .line 300
    .line 301
    invoke-virtual {v13}, LK0/g$a;->a()Lie/a;

    .line 302
    .line 303
    .line 304
    move-result-object v14

    .line 305
    invoke-interface {v5}, LY/m;->j()LY/d;

    .line 306
    .line 307
    .line 308
    move-result-object v15

    .line 309
    if-nez v15, :cond_16

    .line 310
    .line 311
    invoke-static {}, LY/h;->d()V

    .line 312
    .line 313
    .line 314
    :cond_16
    invoke-interface {v5}, LY/m;->I()V

    .line 315
    .line 316
    .line 317
    invoke-interface {v5}, LY/m;->e()Z

    .line 318
    .line 319
    .line 320
    move-result v15

    .line 321
    if-eqz v15, :cond_17

    .line 322
    .line 323
    invoke-interface {v5, v14}, LY/m;->h(Lie/a;)V

    .line 324
    .line 325
    .line 326
    goto :goto_e

    .line 327
    :cond_17
    invoke-interface {v5}, LY/m;->s()V

    .line 328
    .line 329
    .line 330
    :goto_e
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    .line 331
    .line 332
    .line 333
    move-result-object v14

    .line 334
    invoke-virtual {v13}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 335
    .line 336
    .line 337
    move-result-object v15

    .line 338
    invoke-static {v14, v4, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v13}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-static {v14, v11, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v13}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-interface {v14}, LY/m;->e()Z

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    if-nez v11, :cond_18

    .line 357
    .line 358
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v15

    .line 366
    invoke-static {v11, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    if-nez v11, :cond_19

    .line 371
    .line 372
    :cond_18
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object v11

    .line 376
    invoke-interface {v14, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    invoke-interface {v14, v7, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 384
    .line 385
    .line 386
    :cond_19
    invoke-virtual {v13}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    invoke-static {v14, v12, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 391
    .line 392
    .line 393
    sget-object v4, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 394
    .line 395
    sget-object v7, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 396
    .line 397
    invoke-interface {v4, v7}, LC/c;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle$Image;->getColorOverlay()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-static {v4, v0, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/BackgroundKt;->background(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Ls0/E1;)Landroidx/compose/ui/e;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0, v5, v6}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 410
    .line 411
    .line 412
    shr-int/lit8 v0, v3, 0xc

    .line 413
    .line 414
    and-int/lit8 v0, v0, 0xe

    .line 415
    .line 416
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-interface {v8, v5, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    invoke-interface {v5}, LY/m;->x()V

    .line 424
    .line 425
    .line 426
    invoke-interface {v5}, LY/m;->O()V

    .line 427
    .line 428
    .line 429
    goto :goto_f

    .line 430
    :cond_1a
    const v0, -0x3233e36c    # -4.2805312E8f

    .line 431
    .line 432
    .line 433
    invoke-interface {v5, v0}, LY/m;->V(I)V

    .line 434
    .line 435
    .line 436
    shr-int/lit8 v0, v3, 0xc

    .line 437
    .line 438
    and-int/lit8 v0, v0, 0xe

    .line 439
    .line 440
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-interface {v8, v5, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    invoke-interface {v5}, LY/m;->O()V

    .line 448
    .line 449
    .line 450
    :goto_f
    invoke-static {}, LY/w;->L()Z

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    if-eqz v0, :cond_1b

    .line 455
    .line 456
    invoke-static {}, LY/w;->T()V

    .line 457
    .line 458
    .line 459
    :cond_1b
    move-object v3, v2

    .line 460
    goto/16 :goto_b

    .line 461
    .line 462
    :goto_10
    invoke-interface {v5}, LY/m;->k()LY/B1;

    .line 463
    .line 464
    .line 465
    move-result-object v10

    .line 466
    if-eqz v10, :cond_1c

    .line 467
    .line 468
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/WithOptionalBackgroundOverlayKt$WithOptionalBackgroundOverlay$3;

    .line 469
    .line 470
    move/from16 v7, p7

    .line 471
    .line 472
    move-object v2, v1

    .line 473
    move-object v5, v8

    .line 474
    move v6, v9

    .line 475
    move-object/from16 v1, p0

    .line 476
    .line 477
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/WithOptionalBackgroundOverlayKt$WithOptionalBackgroundOverlay$3;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyle;Landroidx/compose/ui/e;Ls0/E1;Lkotlin/jvm/functions/Function2;II)V

    .line 478
    .line 479
    .line 480
    invoke-interface {v10, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 481
    .line 482
    .line 483
    :cond_1c
    return-void
.end method
