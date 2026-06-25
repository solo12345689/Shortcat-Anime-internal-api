.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ae\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a[\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "",
        "videoUri",
        "Landroidx/compose/ui/e;",
        "modifier",
        "",
        "showControls",
        "autoPlay",
        "loop",
        "muteAudio",
        "LI0/f;",
        "contentScale",
        "Lkotlin/Function0;",
        "LTd/L;",
        "onReady",
        "VideoView",
        "(Ljava/lang/String;Landroidx/compose/ui/e;ZZZZLI0/f;Lie/a;LY/m;II)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;",
        "scaleType",
        "Video",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;LY/m;II)V",
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
.method private static final Video(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;LY/m;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;",
            "Ljava/lang/String;",
            "ZZZZ",
            "Landroidx/compose/ui/e;",
            "Lie/a;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    move/from16 v11, p9

    .line 8
    .line 9
    move/from16 v12, p10

    .line 10
    .line 11
    const v0, -0x11cad429

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p8

    .line 15
    .line 16
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    and-int/lit8 v1, v12, 0x1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    or-int/lit8 v1, v11, 0x6

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v6, v8}, LY/m;->U(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v11

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v11

    .line 43
    :goto_1
    and-int/lit8 v7, v12, 0x2

    .line 44
    .line 45
    if-eqz v7, :cond_3

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x30

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    and-int/lit8 v7, v11, 0x30

    .line 51
    .line 52
    if-nez v7, :cond_5

    .line 53
    .line 54
    invoke-interface {v6, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    const/16 v7, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const/16 v7, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v1, v7

    .line 66
    :cond_5
    :goto_3
    and-int/lit8 v7, v12, 0x4

    .line 67
    .line 68
    if-eqz v7, :cond_7

    .line 69
    .line 70
    or-int/lit16 v1, v1, 0x180

    .line 71
    .line 72
    :cond_6
    move/from16 v7, p2

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_7
    and-int/lit16 v7, v11, 0x180

    .line 76
    .line 77
    if-nez v7, :cond_6

    .line 78
    .line 79
    move/from16 v7, p2

    .line 80
    .line 81
    invoke-interface {v6, v7}, LY/m;->a(Z)Z

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    if-eqz v13, :cond_8

    .line 86
    .line 87
    const/16 v13, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_8
    const/16 v13, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v1, v13

    .line 93
    :goto_5
    and-int/lit8 v13, v12, 0x8

    .line 94
    .line 95
    if-eqz v13, :cond_9

    .line 96
    .line 97
    or-int/lit16 v1, v1, 0xc00

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_9
    and-int/lit16 v13, v11, 0xc00

    .line 101
    .line 102
    if-nez v13, :cond_b

    .line 103
    .line 104
    invoke-interface {v6, v3}, LY/m;->a(Z)Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-eqz v13, :cond_a

    .line 109
    .line 110
    const/16 v13, 0x800

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_a
    const/16 v13, 0x400

    .line 114
    .line 115
    :goto_6
    or-int/2addr v1, v13

    .line 116
    :cond_b
    :goto_7
    and-int/lit8 v13, v12, 0x10

    .line 117
    .line 118
    if-eqz v13, :cond_d

    .line 119
    .line 120
    or-int/lit16 v1, v1, 0x6000

    .line 121
    .line 122
    :cond_c
    move/from16 v13, p4

    .line 123
    .line 124
    goto :goto_9

    .line 125
    :cond_d
    and-int/lit16 v13, v11, 0x6000

    .line 126
    .line 127
    if-nez v13, :cond_c

    .line 128
    .line 129
    move/from16 v13, p4

    .line 130
    .line 131
    invoke-interface {v6, v13}, LY/m;->a(Z)Z

    .line 132
    .line 133
    .line 134
    move-result v16

    .line 135
    if-eqz v16, :cond_e

    .line 136
    .line 137
    const/16 v16, 0x4000

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_e
    const/16 v16, 0x2000

    .line 141
    .line 142
    :goto_8
    or-int v1, v1, v16

    .line 143
    .line 144
    :goto_9
    and-int/lit8 v16, v12, 0x20

    .line 145
    .line 146
    const/high16 v17, 0x30000

    .line 147
    .line 148
    if-eqz v16, :cond_f

    .line 149
    .line 150
    or-int v1, v1, v17

    .line 151
    .line 152
    move/from16 v5, p5

    .line 153
    .line 154
    goto :goto_b

    .line 155
    :cond_f
    and-int v16, v11, v17

    .line 156
    .line 157
    move/from16 v5, p5

    .line 158
    .line 159
    if-nez v16, :cond_11

    .line 160
    .line 161
    invoke-interface {v6, v5}, LY/m;->a(Z)Z

    .line 162
    .line 163
    .line 164
    move-result v16

    .line 165
    if-eqz v16, :cond_10

    .line 166
    .line 167
    const/high16 v16, 0x20000

    .line 168
    .line 169
    goto :goto_a

    .line 170
    :cond_10
    const/high16 v16, 0x10000

    .line 171
    .line 172
    :goto_a
    or-int v1, v1, v16

    .line 173
    .line 174
    :cond_11
    :goto_b
    and-int/lit8 v16, v12, 0x40

    .line 175
    .line 176
    const/high16 v17, 0x180000

    .line 177
    .line 178
    if-eqz v16, :cond_12

    .line 179
    .line 180
    or-int v1, v1, v17

    .line 181
    .line 182
    move-object/from16 v14, p6

    .line 183
    .line 184
    goto :goto_d

    .line 185
    :cond_12
    and-int v17, v11, v17

    .line 186
    .line 187
    move-object/from16 v14, p6

    .line 188
    .line 189
    if-nez v17, :cond_14

    .line 190
    .line 191
    invoke-interface {v6, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v18

    .line 195
    if-eqz v18, :cond_13

    .line 196
    .line 197
    const/high16 v18, 0x100000

    .line 198
    .line 199
    goto :goto_c

    .line 200
    :cond_13
    const/high16 v18, 0x80000

    .line 201
    .line 202
    :goto_c
    or-int v1, v1, v18

    .line 203
    .line 204
    :cond_14
    :goto_d
    and-int/lit16 v15, v12, 0x80

    .line 205
    .line 206
    const/high16 v19, 0xc00000

    .line 207
    .line 208
    if-eqz v15, :cond_15

    .line 209
    .line 210
    or-int v1, v1, v19

    .line 211
    .line 212
    move-object/from16 v10, p7

    .line 213
    .line 214
    goto :goto_f

    .line 215
    :cond_15
    and-int v19, v11, v19

    .line 216
    .line 217
    move-object/from16 v10, p7

    .line 218
    .line 219
    if-nez v19, :cond_17

    .line 220
    .line 221
    invoke-interface {v6, v10}, LY/m;->F(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v19

    .line 225
    if-eqz v19, :cond_16

    .line 226
    .line 227
    const/high16 v19, 0x800000

    .line 228
    .line 229
    goto :goto_e

    .line 230
    :cond_16
    const/high16 v19, 0x400000

    .line 231
    .line 232
    :goto_e
    or-int v1, v1, v19

    .line 233
    .line 234
    :cond_17
    :goto_f
    const v19, 0x492493

    .line 235
    .line 236
    .line 237
    and-int v9, v1, v19

    .line 238
    .line 239
    const v4, 0x492492

    .line 240
    .line 241
    .line 242
    if-ne v9, v4, :cond_19

    .line 243
    .line 244
    invoke-interface {v6}, LY/m;->i()Z

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    if-nez v4, :cond_18

    .line 249
    .line 250
    goto :goto_11

    .line 251
    :cond_18
    invoke-interface {v6}, LY/m;->K()V

    .line 252
    .line 253
    .line 254
    move-object v7, v14

    .line 255
    :goto_10
    move-object v8, v10

    .line 256
    goto/16 :goto_1f

    .line 257
    .line 258
    :cond_19
    :goto_11
    if-eqz v16, :cond_1a

    .line 259
    .line 260
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 261
    .line 262
    move-object/from16 v20, v4

    .line 263
    .line 264
    goto :goto_12

    .line 265
    :cond_1a
    move-object/from16 v20, v14

    .line 266
    .line 267
    :goto_12
    const/4 v4, 0x0

    .line 268
    if-eqz v15, :cond_1b

    .line 269
    .line 270
    move-object v10, v4

    .line 271
    :cond_1b
    invoke-static {}, LY/w;->L()Z

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    if-eqz v9, :cond_1c

    .line 276
    .line 277
    const/4 v9, -0x1

    .line 278
    const-string v14, "com.revenuecat.purchases.ui.revenuecatui.components.video.Video (VideoView.kt:382)"

    .line 279
    .line 280
    invoke-static {v0, v1, v9, v14}, LY/w;->U(IIILjava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :cond_1c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    const-string v9, "video_"

    .line 289
    .line 290
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const/16 v9, 0x5f

    .line 297
    .line 298
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v15

    .line 308
    const/4 v0, 0x0

    .line 309
    new-array v13, v0, [Ljava/lang/Object;

    .line 310
    .line 311
    sget-object v16, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$savedState$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$savedState$1;

    .line 312
    .line 313
    const/16 v9, 0x4000

    .line 314
    .line 315
    const/16 v18, 0xc00

    .line 316
    .line 317
    const/16 v19, 0x2

    .line 318
    .line 319
    const/4 v14, 0x0

    .line 320
    move-object/from16 v17, v6

    .line 321
    .line 322
    const/16 v6, 0x800

    .line 323
    .line 324
    invoke-static/range {v13 .. v19}, Lh0/d;->e([Ljava/lang/Object;Lh0/v;Ljava/lang/String;Lie/a;LY/m;II)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v13

    .line 328
    move-object/from16 v14, v17

    .line 329
    .line 330
    check-cast v13, Ljava/util/Map;

    .line 331
    .line 332
    const v9, -0x79b21767

    .line 333
    .line 334
    .line 335
    invoke-interface {v14, v9}, LY/m;->V(I)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    sget-object v16, LY/m;->a:LY/m$a;

    .line 343
    .line 344
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    if-ne v9, v0, :cond_1d

    .line 349
    .line 350
    const/4 v0, 0x2

    .line 351
    invoke-static {v4, v4, v0, v4}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-interface {v14, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :cond_1d
    check-cast v9, LY/C0;

    .line 359
    .line 360
    invoke-interface {v14}, LY/m;->O()V

    .line 361
    .line 362
    .line 363
    invoke-interface {v9}, LY/C0;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    const v4, -0x79b1f778

    .line 368
    .line 369
    .line 370
    invoke-interface {v14, v4}, LY/m;->V(I)V

    .line 371
    .line 372
    .line 373
    and-int/lit16 v4, v1, 0x1c00

    .line 374
    .line 375
    if-ne v4, v6, :cond_1e

    .line 376
    .line 377
    const/16 v19, 0x1

    .line 378
    .line 379
    goto :goto_13

    .line 380
    :cond_1e
    const/16 v19, 0x0

    .line 381
    .line 382
    :goto_13
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    if-nez v19, :cond_1f

    .line 387
    .line 388
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v11

    .line 392
    if-ne v6, v11, :cond_20

    .line 393
    .line 394
    :cond_1f
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$1$1;

    .line 395
    .line 396
    const/4 v11, 0x0

    .line 397
    invoke-direct {v6, v9, v3, v11}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$1$1;-><init>(LY/C0;ZLZd/e;)V

    .line 398
    .line 399
    .line 400
    invoke-interface {v14, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_20
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 404
    .line 405
    invoke-interface {v14}, LY/m;->O()V

    .line 406
    .line 407
    .line 408
    const/4 v11, 0x0

    .line 409
    invoke-static {v0, v6, v14, v11}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 410
    .line 411
    .line 412
    invoke-interface {v9}, LY/C0;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    const v6, -0x79b1dc76

    .line 417
    .line 418
    .line 419
    invoke-interface {v14, v6}, LY/m;->V(I)V

    .line 420
    .line 421
    .line 422
    invoke-interface {v14, v13}, LY/m;->F(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    invoke-interface {v14, v15}, LY/m;->U(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    or-int/2addr v6, v11

    .line 431
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v11

    .line 435
    if-nez v6, :cond_21

    .line 436
    .line 437
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    if-ne v11, v6, :cond_22

    .line 442
    .line 443
    :cond_21
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$2$1;

    .line 444
    .line 445
    invoke-direct {v11, v9, v13, v15}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$2$1;-><init>(LY/C0;Ljava/util/Map;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-interface {v14, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    :cond_22
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 452
    .line 453
    invoke-interface {v14}, LY/m;->O()V

    .line 454
    .line 455
    .line 456
    const/4 v6, 0x0

    .line 457
    invoke-static {v0, v11, v14, v6}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 458
    .line 459
    .line 460
    invoke-static/range {v20 .. v20}, Lp0/g;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    sget-object v11, Ll0/e;->a:Ll0/e$a;

    .line 465
    .line 466
    invoke-virtual {v11}, Ll0/e$a;->e()Ll0/e;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 471
    .line 472
    .line 473
    move-result-object v11

    .line 474
    invoke-static {v14, v6}, LY/h;->a(LY/m;I)I

    .line 475
    .line 476
    .line 477
    move-result v19

    .line 478
    invoke-interface {v14}, LY/m;->r()LY/I;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    invoke-static {v14, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    sget-object v21, LK0/g;->M:LK0/g$a;

    .line 487
    .line 488
    invoke-virtual/range {v21 .. v21}, LK0/g$a;->a()Lie/a;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    invoke-interface {v14}, LY/m;->j()LY/d;

    .line 493
    .line 494
    .line 495
    move-result-object v22

    .line 496
    if-nez v22, :cond_23

    .line 497
    .line 498
    invoke-static {}, LY/h;->d()V

    .line 499
    .line 500
    .line 501
    :cond_23
    invoke-interface {v14}, LY/m;->I()V

    .line 502
    .line 503
    .line 504
    invoke-interface {v14}, LY/m;->e()Z

    .line 505
    .line 506
    .line 507
    move-result v22

    .line 508
    if-eqz v22, :cond_24

    .line 509
    .line 510
    invoke-interface {v14, v2}, LY/m;->h(Lie/a;)V

    .line 511
    .line 512
    .line 513
    goto :goto_14

    .line 514
    :cond_24
    invoke-interface {v14}, LY/m;->s()V

    .line 515
    .line 516
    .line 517
    :goto_14
    invoke-static {v14}, LY/m2;->b(LY/m;)LY/m;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual/range {v21 .. v21}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-static {v2, v11, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v21 .. v21}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-static {v2, v6, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v21 .. v21}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-interface {v2}, LY/m;->e()Z

    .line 540
    .line 541
    .line 542
    move-result v6

    .line 543
    if-nez v6, :cond_25

    .line 544
    .line 545
    invoke-interface {v2}, LY/m;->D()Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v6

    .line 549
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v11

    .line 553
    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    if-nez v6, :cond_26

    .line 558
    .line 559
    :cond_25
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    invoke-interface {v2, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    invoke-interface {v2, v6, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 571
    .line 572
    .line 573
    :cond_26
    invoke-virtual/range {v21 .. v21}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-static {v2, v0, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 578
    .line 579
    .line 580
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 581
    .line 582
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 583
    .line 584
    const/4 v2, 0x0

    .line 585
    const/4 v3, 0x0

    .line 586
    const/4 v11, 0x1

    .line 587
    invoke-static {v0, v2, v11, v3}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 588
    .line 589
    .line 590
    move-result-object v17

    .line 591
    const v0, -0x2f5dc685

    .line 592
    .line 593
    .line 594
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 595
    .line 596
    .line 597
    invoke-interface {v14, v13}, LY/m;->F(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    invoke-interface {v14, v15}, LY/m;->U(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    or-int/2addr v0, v2

    .line 606
    const/16 v6, 0x800

    .line 607
    .line 608
    if-ne v4, v6, :cond_27

    .line 609
    .line 610
    move v2, v11

    .line 611
    goto :goto_15

    .line 612
    :cond_27
    const/4 v2, 0x0

    .line 613
    :goto_15
    or-int/2addr v0, v2

    .line 614
    and-int/lit8 v2, v1, 0x70

    .line 615
    .line 616
    const/16 v3, 0x20

    .line 617
    .line 618
    if-ne v2, v3, :cond_28

    .line 619
    .line 620
    move v2, v11

    .line 621
    goto :goto_16

    .line 622
    :cond_28
    const/4 v2, 0x0

    .line 623
    :goto_16
    or-int/2addr v0, v2

    .line 624
    and-int/lit16 v2, v1, 0x380

    .line 625
    .line 626
    const/16 v3, 0x100

    .line 627
    .line 628
    if-ne v2, v3, :cond_29

    .line 629
    .line 630
    move v2, v11

    .line 631
    goto :goto_17

    .line 632
    :cond_29
    const/4 v2, 0x0

    .line 633
    :goto_17
    or-int/2addr v0, v2

    .line 634
    const/high16 v2, 0x70000

    .line 635
    .line 636
    and-int/2addr v2, v1

    .line 637
    const/high16 v3, 0x20000

    .line 638
    .line 639
    if-ne v2, v3, :cond_2a

    .line 640
    .line 641
    move v2, v11

    .line 642
    goto :goto_18

    .line 643
    :cond_2a
    const/4 v2, 0x0

    .line 644
    :goto_18
    or-int/2addr v0, v2

    .line 645
    and-int/lit8 v2, v1, 0xe

    .line 646
    .line 647
    const/4 v3, 0x4

    .line 648
    if-ne v2, v3, :cond_2b

    .line 649
    .line 650
    move v2, v11

    .line 651
    goto :goto_19

    .line 652
    :cond_2b
    const/4 v2, 0x0

    .line 653
    :goto_19
    or-int/2addr v0, v2

    .line 654
    const v2, 0xe000

    .line 655
    .line 656
    .line 657
    and-int/2addr v2, v1

    .line 658
    const/16 v3, 0x4000

    .line 659
    .line 660
    if-ne v2, v3, :cond_2c

    .line 661
    .line 662
    move v2, v11

    .line 663
    goto :goto_1a

    .line 664
    :cond_2c
    const/4 v2, 0x0

    .line 665
    :goto_1a
    or-int/2addr v0, v2

    .line 666
    const/high16 v2, 0x1c00000

    .line 667
    .line 668
    and-int/2addr v1, v2

    .line 669
    const/high16 v2, 0x800000

    .line 670
    .line 671
    if-ne v1, v2, :cond_2d

    .line 672
    .line 673
    move v3, v11

    .line 674
    goto :goto_1b

    .line 675
    :cond_2d
    const/4 v3, 0x0

    .line 676
    :goto_1b
    or-int/2addr v0, v3

    .line 677
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    if-nez v0, :cond_2f

    .line 682
    .line 683
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    if-ne v3, v0, :cond_2e

    .line 688
    .line 689
    goto :goto_1c

    .line 690
    :cond_2e
    move v11, v2

    .line 691
    move-object v7, v9

    .line 692
    move-object v2, v15

    .line 693
    move v15, v1

    .line 694
    move-object v1, v13

    .line 695
    const/4 v13, 0x0

    .line 696
    goto :goto_1d

    .line 697
    :cond_2f
    :goto_1c
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$3$1$1;

    .line 698
    .line 699
    move-object/from16 v4, p1

    .line 700
    .line 701
    move/from16 v3, p3

    .line 702
    .line 703
    move v11, v2

    .line 704
    move v6, v5

    .line 705
    move v5, v7

    .line 706
    move-object v7, v9

    .line 707
    move-object v2, v15

    .line 708
    move/from16 v9, p4

    .line 709
    .line 710
    move v15, v1

    .line 711
    move-object v1, v13

    .line 712
    const/4 v13, 0x0

    .line 713
    invoke-direct/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$3$1$1;-><init>(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;ZZLY/C0;Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;ZLie/a;)V

    .line 714
    .line 715
    .line 716
    invoke-interface {v14, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    move-object v3, v0

    .line 720
    :goto_1d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 721
    .line 722
    invoke-interface {v14}, LY/m;->O()V

    .line 723
    .line 724
    .line 725
    const v0, -0x2f5cf46f

    .line 726
    .line 727
    .line 728
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 729
    .line 730
    .line 731
    invoke-interface {v14, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    invoke-interface {v14, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v4

    .line 739
    or-int/2addr v0, v4

    .line 740
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v4

    .line 744
    if-nez v0, :cond_30

    .line 745
    .line 746
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    if-ne v4, v0, :cond_31

    .line 751
    .line 752
    :cond_30
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$3$2$1;

    .line 753
    .line 754
    invoke-direct {v4, v7, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$3$2$1;-><init>(LY/C0;Ljava/util/Map;Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    invoke-interface {v14, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    :cond_31
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 761
    .line 762
    invoke-interface {v14}, LY/m;->O()V

    .line 763
    .line 764
    .line 765
    const v0, -0x2f5d06d9

    .line 766
    .line 767
    .line 768
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 769
    .line 770
    .line 771
    if-ne v15, v11, :cond_32

    .line 772
    .line 773
    const/4 v0, 0x1

    .line 774
    goto :goto_1e

    .line 775
    :cond_32
    move v0, v13

    .line 776
    :goto_1e
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    if-nez v0, :cond_33

    .line 781
    .line 782
    invoke-virtual/range {v16 .. v16}, LY/m$a;->a()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    if-ne v1, v0, :cond_34

    .line 787
    .line 788
    :cond_33
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$3$3$1;

    .line 789
    .line 790
    invoke-direct {v1, v7, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$3$3$1;-><init>(LY/C0;Lie/a;)V

    .line 791
    .line 792
    .line 793
    invoke-interface {v14, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    :cond_34
    move-object v5, v1

    .line 797
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 798
    .line 799
    invoke-interface {v14}, LY/m;->O()V

    .line 800
    .line 801
    .line 802
    const/16 v7, 0x30

    .line 803
    .line 804
    const/4 v8, 0x4

    .line 805
    move-object v1, v3

    .line 806
    const/4 v3, 0x0

    .line 807
    move-object v6, v14

    .line 808
    move-object/from16 v2, v17

    .line 809
    .line 810
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/viewinterop/e;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LY/m;II)V

    .line 811
    .line 812
    .line 813
    invoke-interface {v6}, LY/m;->x()V

    .line 814
    .line 815
    .line 816
    invoke-static {}, LY/w;->L()Z

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    if-eqz v0, :cond_35

    .line 821
    .line 822
    invoke-static {}, LY/w;->T()V

    .line 823
    .line 824
    .line 825
    :cond_35
    move-object/from16 v7, v20

    .line 826
    .line 827
    goto/16 :goto_10

    .line 828
    .line 829
    :goto_1f
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 830
    .line 831
    .line 832
    move-result-object v11

    .line 833
    if-eqz v11, :cond_36

    .line 834
    .line 835
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;

    .line 836
    .line 837
    move-object/from16 v1, p0

    .line 838
    .line 839
    move-object/from16 v2, p1

    .line 840
    .line 841
    move/from16 v3, p2

    .line 842
    .line 843
    move/from16 v4, p3

    .line 844
    .line 845
    move/from16 v5, p4

    .line 846
    .line 847
    move/from16 v6, p5

    .line 848
    .line 849
    move/from16 v9, p9

    .line 850
    .line 851
    move v10, v12

    .line 852
    invoke-direct/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$Video$4;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;II)V

    .line 853
    .line 854
    .line 855
    invoke-interface {v11, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 856
    .line 857
    .line 858
    :cond_36
    return-void
.end method

.method public static final VideoView(Ljava/lang/String;Landroidx/compose/ui/e;ZZZZLI0/f;Lie/a;LY/m;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/e;",
            "ZZZZ",
            "LI0/f;",
            "Lie/a;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v11, p9

    .line 4
    .line 5
    move/from16 v12, p10

    .line 6
    .line 7
    const-string v0, "videoUri"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v0, -0x290f01bb

    .line 13
    .line 14
    .line 15
    move-object/from16 v2, p8

    .line 16
    .line 17
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    and-int/lit8 v2, v12, 0x1

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    or-int/lit8 v2, v11, 0x6

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    and-int/lit8 v2, v11, 0x6

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v8, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v2, 0x2

    .line 41
    :goto_0
    or-int/2addr v2, v11

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move v2, v11

    .line 44
    :goto_1
    and-int/lit8 v3, v12, 0x2

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    or-int/lit8 v2, v2, 0x30

    .line 49
    .line 50
    :cond_3
    move-object/from16 v4, p1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    and-int/lit8 v4, v11, 0x30

    .line 54
    .line 55
    if-nez v4, :cond_3

    .line 56
    .line 57
    move-object/from16 v4, p1

    .line 58
    .line 59
    invoke-interface {v8, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_5

    .line 64
    .line 65
    const/16 v5, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    const/16 v5, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v2, v5

    .line 71
    :goto_3
    and-int/lit8 v5, v12, 0x4

    .line 72
    .line 73
    if-eqz v5, :cond_7

    .line 74
    .line 75
    or-int/lit16 v2, v2, 0x180

    .line 76
    .line 77
    :cond_6
    move/from16 v6, p2

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_7
    and-int/lit16 v6, v11, 0x180

    .line 81
    .line 82
    if-nez v6, :cond_6

    .line 83
    .line 84
    move/from16 v6, p2

    .line 85
    .line 86
    invoke-interface {v8, v6}, LY/m;->a(Z)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_8

    .line 91
    .line 92
    const/16 v7, 0x100

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_8
    const/16 v7, 0x80

    .line 96
    .line 97
    :goto_4
    or-int/2addr v2, v7

    .line 98
    :goto_5
    and-int/lit8 v7, v12, 0x8

    .line 99
    .line 100
    if-eqz v7, :cond_a

    .line 101
    .line 102
    or-int/lit16 v2, v2, 0xc00

    .line 103
    .line 104
    :cond_9
    move/from16 v9, p3

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_a
    and-int/lit16 v9, v11, 0xc00

    .line 108
    .line 109
    if-nez v9, :cond_9

    .line 110
    .line 111
    move/from16 v9, p3

    .line 112
    .line 113
    invoke-interface {v8, v9}, LY/m;->a(Z)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_b

    .line 118
    .line 119
    const/16 v10, 0x800

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_b
    const/16 v10, 0x400

    .line 123
    .line 124
    :goto_6
    or-int/2addr v2, v10

    .line 125
    :goto_7
    and-int/lit8 v10, v12, 0x10

    .line 126
    .line 127
    if-eqz v10, :cond_d

    .line 128
    .line 129
    or-int/lit16 v2, v2, 0x6000

    .line 130
    .line 131
    :cond_c
    move/from16 v13, p4

    .line 132
    .line 133
    goto :goto_9

    .line 134
    :cond_d
    and-int/lit16 v13, v11, 0x6000

    .line 135
    .line 136
    if-nez v13, :cond_c

    .line 137
    .line 138
    move/from16 v13, p4

    .line 139
    .line 140
    invoke-interface {v8, v13}, LY/m;->a(Z)Z

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    if-eqz v14, :cond_e

    .line 145
    .line 146
    const/16 v14, 0x4000

    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_e
    const/16 v14, 0x2000

    .line 150
    .line 151
    :goto_8
    or-int/2addr v2, v14

    .line 152
    :goto_9
    and-int/lit8 v14, v12, 0x20

    .line 153
    .line 154
    const/high16 v15, 0x30000

    .line 155
    .line 156
    if-eqz v14, :cond_10

    .line 157
    .line 158
    or-int/2addr v2, v15

    .line 159
    :cond_f
    move/from16 v15, p5

    .line 160
    .line 161
    goto :goto_b

    .line 162
    :cond_10
    and-int/2addr v15, v11

    .line 163
    if-nez v15, :cond_f

    .line 164
    .line 165
    move/from16 v15, p5

    .line 166
    .line 167
    invoke-interface {v8, v15}, LY/m;->a(Z)Z

    .line 168
    .line 169
    .line 170
    move-result v16

    .line 171
    if-eqz v16, :cond_11

    .line 172
    .line 173
    const/high16 v16, 0x20000

    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_11
    const/high16 v16, 0x10000

    .line 177
    .line 178
    :goto_a
    or-int v2, v2, v16

    .line 179
    .line 180
    :goto_b
    and-int/lit8 v16, v12, 0x40

    .line 181
    .line 182
    const/high16 v17, 0x180000

    .line 183
    .line 184
    if-eqz v16, :cond_12

    .line 185
    .line 186
    or-int v2, v2, v17

    .line 187
    .line 188
    move-object/from16 v0, p6

    .line 189
    .line 190
    goto :goto_d

    .line 191
    :cond_12
    and-int v17, v11, v17

    .line 192
    .line 193
    move-object/from16 v0, p6

    .line 194
    .line 195
    if-nez v17, :cond_14

    .line 196
    .line 197
    invoke-interface {v8, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v18

    .line 201
    if-eqz v18, :cond_13

    .line 202
    .line 203
    const/high16 v18, 0x100000

    .line 204
    .line 205
    goto :goto_c

    .line 206
    :cond_13
    const/high16 v18, 0x80000

    .line 207
    .line 208
    :goto_c
    or-int v2, v2, v18

    .line 209
    .line 210
    :cond_14
    :goto_d
    and-int/lit16 v0, v12, 0x80

    .line 211
    .line 212
    const/high16 v18, 0xc00000

    .line 213
    .line 214
    if-eqz v0, :cond_16

    .line 215
    .line 216
    or-int v2, v2, v18

    .line 217
    .line 218
    :cond_15
    move/from16 v18, v0

    .line 219
    .line 220
    move-object/from16 v0, p7

    .line 221
    .line 222
    goto :goto_f

    .line 223
    :cond_16
    and-int v18, v11, v18

    .line 224
    .line 225
    if-nez v18, :cond_15

    .line 226
    .line 227
    move/from16 v18, v0

    .line 228
    .line 229
    move-object/from16 v0, p7

    .line 230
    .line 231
    invoke-interface {v8, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v19

    .line 235
    if-eqz v19, :cond_17

    .line 236
    .line 237
    const/high16 v19, 0x800000

    .line 238
    .line 239
    goto :goto_e

    .line 240
    :cond_17
    const/high16 v19, 0x400000

    .line 241
    .line 242
    :goto_e
    or-int v2, v2, v19

    .line 243
    .line 244
    :goto_f
    const v19, 0x492493

    .line 245
    .line 246
    .line 247
    and-int v0, v2, v19

    .line 248
    .line 249
    const v1, 0x492492

    .line 250
    .line 251
    .line 252
    if-ne v0, v1, :cond_19

    .line 253
    .line 254
    invoke-interface {v8}, LY/m;->i()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-nez v0, :cond_18

    .line 259
    .line 260
    goto :goto_10

    .line 261
    :cond_18
    invoke-interface {v8}, LY/m;->K()V

    .line 262
    .line 263
    .line 264
    move-object/from16 v7, p6

    .line 265
    .line 266
    move-object v2, v4

    .line 267
    move v3, v6

    .line 268
    move-object v0, v8

    .line 269
    move v4, v9

    .line 270
    move v5, v13

    .line 271
    move v6, v15

    .line 272
    move-object/from16 v8, p7

    .line 273
    .line 274
    goto/16 :goto_18

    .line 275
    .line 276
    :cond_19
    :goto_10
    if-eqz v3, :cond_1a

    .line 277
    .line 278
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 279
    .line 280
    goto :goto_11

    .line 281
    :cond_1a
    move-object v0, v4

    .line 282
    :goto_11
    if-eqz v5, :cond_1b

    .line 283
    .line 284
    const/4 v1, 0x1

    .line 285
    move v6, v1

    .line 286
    :cond_1b
    const/4 v1, 0x0

    .line 287
    if-eqz v7, :cond_1c

    .line 288
    .line 289
    move v3, v1

    .line 290
    goto :goto_12

    .line 291
    :cond_1c
    move v3, v9

    .line 292
    :goto_12
    if-eqz v10, :cond_1d

    .line 293
    .line 294
    move v4, v1

    .line 295
    goto :goto_13

    .line 296
    :cond_1d
    move v4, v13

    .line 297
    :goto_13
    if-eqz v14, :cond_1e

    .line 298
    .line 299
    move v5, v1

    .line 300
    goto :goto_14

    .line 301
    :cond_1e
    move v5, v15

    .line 302
    :goto_14
    if-eqz v16, :cond_1f

    .line 303
    .line 304
    sget-object v1, LI0/f;->a:LI0/f$a;

    .line 305
    .line 306
    invoke-virtual {v1}, LI0/f$a;->b()LI0/f;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    move-object v13, v1

    .line 311
    goto :goto_15

    .line 312
    :cond_1f
    move-object/from16 v13, p6

    .line 313
    .line 314
    :goto_15
    if-eqz v18, :cond_20

    .line 315
    .line 316
    const/4 v1, 0x0

    .line 317
    move-object v7, v1

    .line 318
    goto :goto_16

    .line 319
    :cond_20
    move-object/from16 v7, p7

    .line 320
    .line 321
    :goto_16
    invoke-static {}, LY/w;->L()Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    if-eqz v1, :cond_21

    .line 326
    .line 327
    const/4 v1, -0x1

    .line 328
    const-string v9, "com.revenuecat.purchases.ui.revenuecatui.components.video.VideoView (VideoView.kt:45)"

    .line 329
    .line 330
    const v10, -0x290f01bb

    .line 331
    .line 332
    .line 333
    invoke-static {v10, v2, v1, v9}, LY/w;->U(IIILjava/lang/String;)V

    .line 334
    .line 335
    .line 336
    :cond_21
    sget-object v1, LI0/f;->a:LI0/f$a;

    .line 337
    .line 338
    invoke-virtual {v1}, LI0/f$a;->b()LI0/f;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    if-eqz v1, :cond_22

    .line 347
    .line 348
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;->FIT:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;

    .line 349
    .line 350
    goto :goto_17

    .line 351
    :cond_22
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;->FILL:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;

    .line 352
    .line 353
    :goto_17
    shl-int/lit8 v9, v2, 0x3

    .line 354
    .line 355
    and-int/lit8 v9, v9, 0x70

    .line 356
    .line 357
    and-int/lit16 v10, v2, 0x380

    .line 358
    .line 359
    or-int/2addr v9, v10

    .line 360
    and-int/lit16 v10, v2, 0x1c00

    .line 361
    .line 362
    or-int/2addr v9, v10

    .line 363
    const v10, 0xe000

    .line 364
    .line 365
    .line 366
    and-int/2addr v10, v2

    .line 367
    or-int/2addr v9, v10

    .line 368
    const/high16 v10, 0x70000

    .line 369
    .line 370
    and-int/2addr v10, v2

    .line 371
    or-int/2addr v9, v10

    .line 372
    shl-int/lit8 v10, v2, 0xf

    .line 373
    .line 374
    const/high16 v14, 0x380000

    .line 375
    .line 376
    and-int/2addr v10, v14

    .line 377
    or-int/2addr v9, v10

    .line 378
    const/high16 v10, 0x1c00000

    .line 379
    .line 380
    and-int/2addr v2, v10

    .line 381
    or-int/2addr v9, v2

    .line 382
    const/4 v10, 0x0

    .line 383
    move v2, v6

    .line 384
    move-object v6, v0

    .line 385
    move-object v0, v1

    .line 386
    move-object/from16 v1, p0

    .line 387
    .line 388
    invoke-static/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt;->Video(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;LY/m;II)V

    .line 389
    .line 390
    .line 391
    invoke-static {}, LY/w;->L()Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_23

    .line 396
    .line 397
    invoke-static {}, LY/w;->T()V

    .line 398
    .line 399
    .line 400
    :cond_23
    move v0, v3

    .line 401
    move v3, v2

    .line 402
    move-object v2, v6

    .line 403
    move v6, v5

    .line 404
    move v5, v4

    .line 405
    move v4, v0

    .line 406
    move-object v0, v8

    .line 407
    move-object v8, v7

    .line 408
    move-object v7, v13

    .line 409
    :goto_18
    invoke-interface {v0}, LY/m;->k()LY/B1;

    .line 410
    .line 411
    .line 412
    move-result-object v13

    .line 413
    if-eqz v13, :cond_24

    .line 414
    .line 415
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$VideoView$1;

    .line 416
    .line 417
    move-object/from16 v1, p0

    .line 418
    .line 419
    move v9, v11

    .line 420
    move v10, v12

    .line 421
    invoke-direct/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt$VideoView$1;-><init>(Ljava/lang/String;Landroidx/compose/ui/e;ZZZZLI0/f;Lie/a;II)V

    .line 422
    .line 423
    .line 424
    invoke-interface {v13, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 425
    .line 426
    .line 427
    :cond_24
    return-void
.end method

.method public static final synthetic access$Video(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;LY/m;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/VideoViewKt;->Video(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$ScaleType;Ljava/lang/String;ZZZZLandroidx/compose/ui/e;Lie/a;LY/m;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
