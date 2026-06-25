.class public abstract LD/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LD/B;LC/A;ZLC/b$m;Ll0/e$b;Lz/n;ZLkotlin/jvm/functions/Function1;LY/m;II)V
    .locals 29

    .line 1
    move/from16 v10, p10

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    const v0, -0x2c266969

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p9

    .line 9
    .line 10
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, v11, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v10, 0x6

    .line 19
    .line 20
    move v4, v3

    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v10, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    invoke-interface {v1, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v4, 0x2

    .line 39
    :goto_0
    or-int/2addr v4, v10

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v3, p0

    .line 42
    .line 43
    move v4, v10

    .line 44
    :goto_1
    and-int/lit8 v5, v10, 0x30

    .line 45
    .line 46
    if-nez v5, :cond_5

    .line 47
    .line 48
    and-int/lit8 v5, v11, 0x2

    .line 49
    .line 50
    if-nez v5, :cond_3

    .line 51
    .line 52
    move-object/from16 v5, p1

    .line 53
    .line 54
    invoke-interface {v1, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_4

    .line 59
    .line 60
    const/16 v6, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object/from16 v5, p1

    .line 64
    .line 65
    :cond_4
    const/16 v6, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v4, v6

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    move-object/from16 v5, p1

    .line 70
    .line 71
    :goto_3
    and-int/lit8 v6, v11, 0x4

    .line 72
    .line 73
    if-eqz v6, :cond_7

    .line 74
    .line 75
    or-int/lit16 v4, v4, 0x180

    .line 76
    .line 77
    :cond_6
    move-object/from16 v7, p2

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_7
    and-int/lit16 v7, v10, 0x180

    .line 81
    .line 82
    if-nez v7, :cond_6

    .line 83
    .line 84
    move-object/from16 v7, p2

    .line 85
    .line 86
    invoke-interface {v1, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_8

    .line 91
    .line 92
    const/16 v8, 0x100

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_8
    const/16 v8, 0x80

    .line 96
    .line 97
    :goto_4
    or-int/2addr v4, v8

    .line 98
    :goto_5
    and-int/lit8 v8, v11, 0x8

    .line 99
    .line 100
    if-eqz v8, :cond_a

    .line 101
    .line 102
    or-int/lit16 v4, v4, 0xc00

    .line 103
    .line 104
    :cond_9
    move/from16 v9, p3

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_a
    and-int/lit16 v9, v10, 0xc00

    .line 108
    .line 109
    if-nez v9, :cond_9

    .line 110
    .line 111
    move/from16 v9, p3

    .line 112
    .line 113
    invoke-interface {v1, v9}, LY/m;->a(Z)Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-eqz v12, :cond_b

    .line 118
    .line 119
    const/16 v12, 0x800

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_b
    const/16 v12, 0x400

    .line 123
    .line 124
    :goto_6
    or-int/2addr v4, v12

    .line 125
    :goto_7
    and-int/lit16 v12, v10, 0x6000

    .line 126
    .line 127
    if-nez v12, :cond_e

    .line 128
    .line 129
    and-int/lit8 v12, v11, 0x10

    .line 130
    .line 131
    if-nez v12, :cond_c

    .line 132
    .line 133
    move-object/from16 v12, p4

    .line 134
    .line 135
    invoke-interface {v1, v12}, LY/m;->U(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_d

    .line 140
    .line 141
    const/16 v13, 0x4000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_c
    move-object/from16 v12, p4

    .line 145
    .line 146
    :cond_d
    const/16 v13, 0x2000

    .line 147
    .line 148
    :goto_8
    or-int/2addr v4, v13

    .line 149
    goto :goto_9

    .line 150
    :cond_e
    move-object/from16 v12, p4

    .line 151
    .line 152
    :goto_9
    and-int/lit8 v13, v11, 0x20

    .line 153
    .line 154
    const/high16 v14, 0x30000

    .line 155
    .line 156
    if-eqz v13, :cond_10

    .line 157
    .line 158
    or-int/2addr v4, v14

    .line 159
    :cond_f
    move-object/from16 v14, p5

    .line 160
    .line 161
    goto :goto_b

    .line 162
    :cond_10
    and-int/2addr v14, v10

    .line 163
    if-nez v14, :cond_f

    .line 164
    .line 165
    move-object/from16 v14, p5

    .line 166
    .line 167
    invoke-interface {v1, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    if-eqz v15, :cond_11

    .line 172
    .line 173
    const/high16 v15, 0x20000

    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_11
    const/high16 v15, 0x10000

    .line 177
    .line 178
    :goto_a
    or-int/2addr v4, v15

    .line 179
    :goto_b
    const/high16 v15, 0x180000

    .line 180
    .line 181
    and-int/2addr v15, v10

    .line 182
    if-nez v15, :cond_14

    .line 183
    .line 184
    and-int/lit8 v15, v11, 0x40

    .line 185
    .line 186
    if-nez v15, :cond_12

    .line 187
    .line 188
    move-object/from16 v15, p6

    .line 189
    .line 190
    invoke-interface {v1, v15}, LY/m;->U(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v16

    .line 194
    if-eqz v16, :cond_13

    .line 195
    .line 196
    const/high16 v16, 0x100000

    .line 197
    .line 198
    goto :goto_c

    .line 199
    :cond_12
    move-object/from16 v15, p6

    .line 200
    .line 201
    :cond_13
    const/high16 v16, 0x80000

    .line 202
    .line 203
    :goto_c
    or-int v4, v4, v16

    .line 204
    .line 205
    goto :goto_d

    .line 206
    :cond_14
    move-object/from16 v15, p6

    .line 207
    .line 208
    :goto_d
    and-int/lit16 v0, v11, 0x80

    .line 209
    .line 210
    const/high16 v17, 0xc00000

    .line 211
    .line 212
    if-eqz v0, :cond_16

    .line 213
    .line 214
    or-int v4, v4, v17

    .line 215
    .line 216
    :cond_15
    move/from16 v17, v0

    .line 217
    .line 218
    move/from16 v0, p7

    .line 219
    .line 220
    goto :goto_f

    .line 221
    :cond_16
    and-int v17, v10, v17

    .line 222
    .line 223
    if-nez v17, :cond_15

    .line 224
    .line 225
    move/from16 v17, v0

    .line 226
    .line 227
    move/from16 v0, p7

    .line 228
    .line 229
    invoke-interface {v1, v0}, LY/m;->a(Z)Z

    .line 230
    .line 231
    .line 232
    move-result v18

    .line 233
    if-eqz v18, :cond_17

    .line 234
    .line 235
    const/high16 v18, 0x800000

    .line 236
    .line 237
    goto :goto_e

    .line 238
    :cond_17
    const/high16 v18, 0x400000

    .line 239
    .line 240
    :goto_e
    or-int v4, v4, v18

    .line 241
    .line 242
    :goto_f
    and-int/lit16 v0, v11, 0x100

    .line 243
    .line 244
    const/high16 v18, 0x6000000

    .line 245
    .line 246
    if-eqz v0, :cond_19

    .line 247
    .line 248
    or-int v4, v4, v18

    .line 249
    .line 250
    :cond_18
    move-object/from16 v0, p8

    .line 251
    .line 252
    goto :goto_11

    .line 253
    :cond_19
    and-int v0, v10, v18

    .line 254
    .line 255
    if-nez v0, :cond_18

    .line 256
    .line 257
    move-object/from16 v0, p8

    .line 258
    .line 259
    invoke-interface {v1, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v18

    .line 263
    if-eqz v18, :cond_1a

    .line 264
    .line 265
    const/high16 v18, 0x4000000

    .line 266
    .line 267
    goto :goto_10

    .line 268
    :cond_1a
    const/high16 v18, 0x2000000

    .line 269
    .line 270
    :goto_10
    or-int v4, v4, v18

    .line 271
    .line 272
    :goto_11
    const v18, 0x2492493

    .line 273
    .line 274
    .line 275
    and-int v0, v4, v18

    .line 276
    .line 277
    move/from16 p9, v2

    .line 278
    .line 279
    const v2, 0x2492492

    .line 280
    .line 281
    .line 282
    if-ne v0, v2, :cond_1c

    .line 283
    .line 284
    invoke-interface {v1}, LY/m;->i()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-nez v0, :cond_1b

    .line 289
    .line 290
    goto :goto_12

    .line 291
    :cond_1b
    invoke-interface {v1}, LY/m;->K()V

    .line 292
    .line 293
    .line 294
    move/from16 v8, p7

    .line 295
    .line 296
    move-object/from16 v25, v1

    .line 297
    .line 298
    move-object v1, v3

    .line 299
    move-object v2, v5

    .line 300
    move-object v3, v7

    .line 301
    move v4, v9

    .line 302
    move-object v5, v12

    .line 303
    move-object v6, v14

    .line 304
    move-object v7, v15

    .line 305
    goto/16 :goto_19

    .line 306
    .line 307
    :cond_1c
    :goto_12
    invoke-interface {v1}, LY/m;->G()V

    .line 308
    .line 309
    .line 310
    and-int/lit8 v0, v10, 0x1

    .line 311
    .line 312
    const v2, -0x380001

    .line 313
    .line 314
    .line 315
    const v18, -0xe001

    .line 316
    .line 317
    .line 318
    if-eqz v0, :cond_21

    .line 319
    .line 320
    invoke-interface {v1}, LY/m;->N()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_1d

    .line 325
    .line 326
    goto :goto_14

    .line 327
    :cond_1d
    invoke-interface {v1}, LY/m;->K()V

    .line 328
    .line 329
    .line 330
    and-int/lit8 v0, v11, 0x2

    .line 331
    .line 332
    if-eqz v0, :cond_1e

    .line 333
    .line 334
    and-int/lit8 v4, v4, -0x71

    .line 335
    .line 336
    :cond_1e
    and-int/lit8 v0, v11, 0x10

    .line 337
    .line 338
    if-eqz v0, :cond_1f

    .line 339
    .line 340
    and-int v4, v4, v18

    .line 341
    .line 342
    :cond_1f
    and-int/lit8 v0, v11, 0x40

    .line 343
    .line 344
    if-eqz v0, :cond_20

    .line 345
    .line 346
    and-int/2addr v4, v2

    .line 347
    :cond_20
    move/from16 v18, p7

    .line 348
    .line 349
    move-object v13, v5

    .line 350
    move-object/from16 v21, v12

    .line 351
    .line 352
    move-object/from16 v20, v14

    .line 353
    .line 354
    move-object/from16 v17, v15

    .line 355
    .line 356
    move-object v12, v3

    .line 357
    :goto_13
    move-object v14, v7

    .line 358
    move v15, v9

    .line 359
    goto/16 :goto_18

    .line 360
    .line 361
    :cond_21
    :goto_14
    if-eqz p9, :cond_22

    .line 362
    .line 363
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 364
    .line 365
    goto :goto_15

    .line 366
    :cond_22
    move-object v0, v3

    .line 367
    :goto_15
    and-int/lit8 v3, v11, 0x2

    .line 368
    .line 369
    move/from16 p9, v2

    .line 370
    .line 371
    const/4 v2, 0x0

    .line 372
    if-eqz v3, :cond_23

    .line 373
    .line 374
    const/4 v3, 0x3

    .line 375
    invoke-static {v2, v2, v1, v2, v3}, LD/C;->c(IILY/m;II)LD/B;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    and-int/lit8 v4, v4, -0x71

    .line 380
    .line 381
    move-object v5, v3

    .line 382
    :cond_23
    if-eqz v6, :cond_24

    .line 383
    .line 384
    int-to-float v3, v2

    .line 385
    invoke-static {v3}, Li1/h;->n(F)F

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    invoke-static {v3}, Landroidx/compose/foundation/layout/p;->a(F)LC/A;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    move-object v7, v3

    .line 394
    :cond_24
    if-eqz v8, :cond_25

    .line 395
    .line 396
    move v9, v2

    .line 397
    :cond_25
    and-int/lit8 v2, v11, 0x10

    .line 398
    .line 399
    if-eqz v2, :cond_27

    .line 400
    .line 401
    sget-object v2, LC/b;->a:LC/b;

    .line 402
    .line 403
    if-nez v9, :cond_26

    .line 404
    .line 405
    invoke-virtual {v2}, LC/b;->h()LC/b$m;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    goto :goto_16

    .line 410
    :cond_26
    invoke-virtual {v2}, LC/b;->a()LC/b$m;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    :goto_16
    and-int v4, v4, v18

    .line 415
    .line 416
    move-object v12, v2

    .line 417
    :cond_27
    if-eqz v13, :cond_28

    .line 418
    .line 419
    sget-object v2, Ll0/e;->a:Ll0/e$a;

    .line 420
    .line 421
    invoke-virtual {v2}, Ll0/e$a;->k()Ll0/e$b;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    move-object v14, v2

    .line 426
    :cond_28
    and-int/lit8 v2, v11, 0x40

    .line 427
    .line 428
    if-eqz v2, :cond_29

    .line 429
    .line 430
    sget-object v2, Lz/w;->a:Lz/w;

    .line 431
    .line 432
    const/4 v3, 0x6

    .line 433
    invoke-virtual {v2, v1, v3}, Lz/w;->a(LY/m;I)Lz/n;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    and-int v3, v4, p9

    .line 438
    .line 439
    move-object v15, v2

    .line 440
    move v4, v3

    .line 441
    :cond_29
    if-eqz v17, :cond_2a

    .line 442
    .line 443
    const/4 v2, 0x1

    .line 444
    move/from16 v18, v2

    .line 445
    .line 446
    :goto_17
    move-object v13, v5

    .line 447
    move-object/from16 v21, v12

    .line 448
    .line 449
    move-object/from16 v20, v14

    .line 450
    .line 451
    move-object/from16 v17, v15

    .line 452
    .line 453
    move-object v12, v0

    .line 454
    goto :goto_13

    .line 455
    :cond_2a
    move/from16 v18, p7

    .line 456
    .line 457
    goto :goto_17

    .line 458
    :goto_18
    invoke-interface {v1}, LY/m;->y()V

    .line 459
    .line 460
    .line 461
    invoke-static {}, LY/w;->L()Z

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    if-eqz v0, :cond_2b

    .line 466
    .line 467
    const/4 v0, -0x1

    .line 468
    const-string v2, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)"

    .line 469
    .line 470
    const v3, -0x2c266969

    .line 471
    .line 472
    .line 473
    invoke-static {v3, v4, v0, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 474
    .line 475
    .line 476
    :cond_2b
    and-int/lit8 v0, v4, 0xe

    .line 477
    .line 478
    or-int/lit16 v0, v0, 0x6000

    .line 479
    .line 480
    and-int/lit8 v2, v4, 0x70

    .line 481
    .line 482
    or-int/2addr v0, v2

    .line 483
    and-int/lit16 v2, v4, 0x380

    .line 484
    .line 485
    or-int/2addr v0, v2

    .line 486
    and-int/lit16 v2, v4, 0x1c00

    .line 487
    .line 488
    or-int/2addr v0, v2

    .line 489
    shr-int/lit8 v2, v4, 0x3

    .line 490
    .line 491
    const/high16 v3, 0x70000

    .line 492
    .line 493
    and-int/2addr v3, v2

    .line 494
    or-int/2addr v0, v3

    .line 495
    const/high16 v3, 0x380000

    .line 496
    .line 497
    and-int/2addr v2, v3

    .line 498
    or-int/2addr v0, v2

    .line 499
    shl-int/lit8 v2, v4, 0x9

    .line 500
    .line 501
    const/high16 v3, 0xe000000

    .line 502
    .line 503
    and-int/2addr v2, v3

    .line 504
    or-int/2addr v0, v2

    .line 505
    shl-int/lit8 v2, v4, 0xf

    .line 506
    .line 507
    const/high16 v3, 0x70000000

    .line 508
    .line 509
    and-int/2addr v2, v3

    .line 510
    or-int v26, v0, v2

    .line 511
    .line 512
    shr-int/lit8 v0, v4, 0x12

    .line 513
    .line 514
    and-int/lit16 v0, v0, 0x380

    .line 515
    .line 516
    const/16 v28, 0xc80

    .line 517
    .line 518
    const/16 v16, 0x1

    .line 519
    .line 520
    const/16 v19, 0x0

    .line 521
    .line 522
    const/16 v22, 0x0

    .line 523
    .line 524
    const/16 v23, 0x0

    .line 525
    .line 526
    move-object/from16 v24, p8

    .line 527
    .line 528
    move/from16 v27, v0

    .line 529
    .line 530
    move-object/from16 v25, v1

    .line 531
    .line 532
    invoke-static/range {v12 .. v28}, LD/p;->a(Landroidx/compose/ui/e;LD/B;LC/A;ZZLz/n;ZILl0/e$b;LC/b$m;Ll0/e$c;LC/b$e;Lkotlin/jvm/functions/Function1;LY/m;III)V

    .line 533
    .line 534
    .line 535
    invoke-static {}, LY/w;->L()Z

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    if-eqz v0, :cond_2c

    .line 540
    .line 541
    invoke-static {}, LY/w;->T()V

    .line 542
    .line 543
    .line 544
    :cond_2c
    move-object v1, v12

    .line 545
    move-object v2, v13

    .line 546
    move-object v3, v14

    .line 547
    move v4, v15

    .line 548
    move-object/from16 v7, v17

    .line 549
    .line 550
    move/from16 v8, v18

    .line 551
    .line 552
    move-object/from16 v6, v20

    .line 553
    .line 554
    move-object/from16 v5, v21

    .line 555
    .line 556
    :goto_19
    invoke-interface/range {v25 .. v25}, LY/m;->k()LY/B1;

    .line 557
    .line 558
    .line 559
    move-result-object v12

    .line 560
    if-eqz v12, :cond_2d

    .line 561
    .line 562
    new-instance v0, LD/b$a;

    .line 563
    .line 564
    move-object/from16 v9, p8

    .line 565
    .line 566
    invoke-direct/range {v0 .. v11}, LD/b$a;-><init>(Landroidx/compose/ui/e;LD/B;LC/A;ZLC/b$m;Ll0/e$b;Lz/n;ZLkotlin/jvm/functions/Function1;II)V

    .line 567
    .line 568
    .line 569
    invoke-interface {v12, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 570
    .line 571
    .line 572
    :cond_2d
    return-void
.end method
