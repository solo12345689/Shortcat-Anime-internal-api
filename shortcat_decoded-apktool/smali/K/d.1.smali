.class public abstract LK/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LU0/e;Landroidx/compose/ui/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Ls0/t0;LY/m;II)V
    .locals 46

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v14, p11

    .line 4
    .line 5
    move/from16 v15, p12

    .line 6
    .line 7
    const v0, -0x3f70023c

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p10

    .line 11
    .line 12
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, v15, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v14, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v14, 0x6

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v14

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v14

    .line 39
    :goto_1
    and-int/lit8 v6, v15, 0x2

    .line 40
    .line 41
    if-eqz v6, :cond_4

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    :cond_3
    move-object/from16 v7, p1

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    and-int/lit8 v7, v14, 0x30

    .line 49
    .line 50
    if-nez v7, :cond_3

    .line 51
    .line 52
    move-object/from16 v7, p1

    .line 53
    .line 54
    invoke-interface {v2, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_5

    .line 59
    .line 60
    const/16 v8, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    const/16 v8, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v3, v8

    .line 66
    :goto_3
    and-int/lit8 v8, v15, 0x4

    .line 67
    .line 68
    if-eqz v8, :cond_7

    .line 69
    .line 70
    or-int/lit16 v3, v3, 0x180

    .line 71
    .line 72
    :cond_6
    move-object/from16 v9, p2

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_7
    and-int/lit16 v9, v14, 0x180

    .line 76
    .line 77
    if-nez v9, :cond_6

    .line 78
    .line 79
    move-object/from16 v9, p2

    .line 80
    .line 81
    invoke-interface {v2, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_8

    .line 86
    .line 87
    const/16 v10, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_8
    const/16 v10, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v3, v10

    .line 93
    :goto_5
    and-int/lit8 v10, v15, 0x8

    .line 94
    .line 95
    if-eqz v10, :cond_a

    .line 96
    .line 97
    or-int/lit16 v3, v3, 0xc00

    .line 98
    .line 99
    :cond_9
    move-object/from16 v11, p3

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_a
    and-int/lit16 v11, v14, 0xc00

    .line 103
    .line 104
    if-nez v11, :cond_9

    .line 105
    .line 106
    move-object/from16 v11, p3

    .line 107
    .line 108
    invoke-interface {v2, v11}, LY/m;->F(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-eqz v12, :cond_b

    .line 113
    .line 114
    const/16 v12, 0x800

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_b
    const/16 v12, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v3, v12

    .line 120
    :goto_7
    and-int/lit8 v12, v15, 0x10

    .line 121
    .line 122
    if-eqz v12, :cond_d

    .line 123
    .line 124
    or-int/lit16 v3, v3, 0x6000

    .line 125
    .line 126
    :cond_c
    move/from16 v13, p4

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_d
    and-int/lit16 v13, v14, 0x6000

    .line 130
    .line 131
    if-nez v13, :cond_c

    .line 132
    .line 133
    move/from16 v13, p4

    .line 134
    .line 135
    invoke-interface {v2, v13}, LY/m;->c(I)Z

    .line 136
    .line 137
    .line 138
    move-result v16

    .line 139
    if-eqz v16, :cond_e

    .line 140
    .line 141
    const/16 v16, 0x4000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_e
    const/16 v16, 0x2000

    .line 145
    .line 146
    :goto_8
    or-int v3, v3, v16

    .line 147
    .line 148
    :goto_9
    and-int/lit8 v16, v15, 0x20

    .line 149
    .line 150
    const/high16 v17, 0x30000

    .line 151
    .line 152
    if-eqz v16, :cond_f

    .line 153
    .line 154
    or-int v3, v3, v17

    .line 155
    .line 156
    move/from16 v4, p5

    .line 157
    .line 158
    goto :goto_b

    .line 159
    :cond_f
    and-int v17, v14, v17

    .line 160
    .line 161
    move/from16 v4, p5

    .line 162
    .line 163
    if-nez v17, :cond_11

    .line 164
    .line 165
    invoke-interface {v2, v4}, LY/m;->a(Z)Z

    .line 166
    .line 167
    .line 168
    move-result v17

    .line 169
    if-eqz v17, :cond_10

    .line 170
    .line 171
    const/high16 v17, 0x20000

    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_10
    const/high16 v17, 0x10000

    .line 175
    .line 176
    :goto_a
    or-int v3, v3, v17

    .line 177
    .line 178
    :cond_11
    :goto_b
    and-int/lit8 v17, v15, 0x40

    .line 179
    .line 180
    const/high16 v18, 0x180000

    .line 181
    .line 182
    if-eqz v17, :cond_12

    .line 183
    .line 184
    or-int v3, v3, v18

    .line 185
    .line 186
    move/from16 v5, p6

    .line 187
    .line 188
    goto :goto_d

    .line 189
    :cond_12
    and-int v18, v14, v18

    .line 190
    .line 191
    move/from16 v5, p6

    .line 192
    .line 193
    if-nez v18, :cond_14

    .line 194
    .line 195
    invoke-interface {v2, v5}, LY/m;->c(I)Z

    .line 196
    .line 197
    .line 198
    move-result v19

    .line 199
    if-eqz v19, :cond_13

    .line 200
    .line 201
    const/high16 v19, 0x100000

    .line 202
    .line 203
    goto :goto_c

    .line 204
    :cond_13
    const/high16 v19, 0x80000

    .line 205
    .line 206
    :goto_c
    or-int v3, v3, v19

    .line 207
    .line 208
    :cond_14
    :goto_d
    and-int/lit16 v0, v15, 0x80

    .line 209
    .line 210
    const/high16 v20, 0xc00000

    .line 211
    .line 212
    if-eqz v0, :cond_16

    .line 213
    .line 214
    or-int v3, v3, v20

    .line 215
    .line 216
    :cond_15
    move/from16 v20, v0

    .line 217
    .line 218
    move/from16 v0, p7

    .line 219
    .line 220
    goto :goto_f

    .line 221
    :cond_16
    and-int v20, v14, v20

    .line 222
    .line 223
    if-nez v20, :cond_15

    .line 224
    .line 225
    move/from16 v20, v0

    .line 226
    .line 227
    move/from16 v0, p7

    .line 228
    .line 229
    invoke-interface {v2, v0}, LY/m;->c(I)Z

    .line 230
    .line 231
    .line 232
    move-result v21

    .line 233
    if-eqz v21, :cond_17

    .line 234
    .line 235
    const/high16 v21, 0x800000

    .line 236
    .line 237
    goto :goto_e

    .line 238
    :cond_17
    const/high16 v21, 0x400000

    .line 239
    .line 240
    :goto_e
    or-int v3, v3, v21

    .line 241
    .line 242
    :goto_f
    and-int/lit16 v0, v15, 0x100

    .line 243
    .line 244
    const/high16 v21, 0x6000000

    .line 245
    .line 246
    if-eqz v0, :cond_19

    .line 247
    .line 248
    or-int v3, v3, v21

    .line 249
    .line 250
    :cond_18
    move/from16 v21, v0

    .line 251
    .line 252
    move-object/from16 v0, p8

    .line 253
    .line 254
    goto :goto_11

    .line 255
    :cond_19
    and-int v21, v14, v21

    .line 256
    .line 257
    if-nez v21, :cond_18

    .line 258
    .line 259
    move/from16 v21, v0

    .line 260
    .line 261
    move-object/from16 v0, p8

    .line 262
    .line 263
    invoke-interface {v2, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v22

    .line 267
    if-eqz v22, :cond_1a

    .line 268
    .line 269
    const/high16 v22, 0x4000000

    .line 270
    .line 271
    goto :goto_10

    .line 272
    :cond_1a
    const/high16 v22, 0x2000000

    .line 273
    .line 274
    :goto_10
    or-int v3, v3, v22

    .line 275
    .line 276
    :goto_11
    and-int/lit16 v0, v15, 0x200

    .line 277
    .line 278
    const/high16 v22, 0x30000000

    .line 279
    .line 280
    if-eqz v0, :cond_1c

    .line 281
    .line 282
    or-int v3, v3, v22

    .line 283
    .line 284
    :cond_1b
    move/from16 v22, v0

    .line 285
    .line 286
    move-object/from16 v0, p9

    .line 287
    .line 288
    goto :goto_13

    .line 289
    :cond_1c
    and-int v22, v14, v22

    .line 290
    .line 291
    if-nez v22, :cond_1b

    .line 292
    .line 293
    move/from16 v22, v0

    .line 294
    .line 295
    move-object/from16 v0, p9

    .line 296
    .line 297
    invoke-interface {v2, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v23

    .line 301
    if-eqz v23, :cond_1d

    .line 302
    .line 303
    const/high16 v23, 0x20000000

    .line 304
    .line 305
    goto :goto_12

    .line 306
    :cond_1d
    const/high16 v23, 0x10000000

    .line 307
    .line 308
    :goto_12
    or-int v3, v3, v23

    .line 309
    .line 310
    :goto_13
    const v23, 0x12492493

    .line 311
    .line 312
    .line 313
    and-int v0, v3, v23

    .line 314
    .line 315
    const v1, 0x12492492

    .line 316
    .line 317
    .line 318
    if-ne v0, v1, :cond_1f

    .line 319
    .line 320
    invoke-interface {v2}, LY/m;->i()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-nez v0, :cond_1e

    .line 325
    .line 326
    goto :goto_14

    .line 327
    :cond_1e
    invoke-interface {v2}, LY/m;->K()V

    .line 328
    .line 329
    .line 330
    move/from16 v8, p7

    .line 331
    .line 332
    move-object/from16 v10, p9

    .line 333
    .line 334
    move-object v14, v2

    .line 335
    move v6, v4

    .line 336
    move v0, v5

    .line 337
    move-object v3, v9

    .line 338
    move-object v4, v11

    .line 339
    move v5, v13

    .line 340
    move-object/from16 v2, p0

    .line 341
    .line 342
    move-object/from16 v9, p8

    .line 343
    .line 344
    goto/16 :goto_1c

    .line 345
    .line 346
    :cond_1f
    :goto_14
    if-eqz v6, :cond_20

    .line 347
    .line 348
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 349
    .line 350
    move-object/from16 v23, v0

    .line 351
    .line 352
    goto :goto_15

    .line 353
    :cond_20
    move-object/from16 v23, v7

    .line 354
    .line 355
    :goto_15
    if-eqz v8, :cond_21

    .line 356
    .line 357
    sget-object v0, LU0/Y0;->d:LU0/Y0$a;

    .line 358
    .line 359
    invoke-virtual {v0}, LU0/Y0$a;->a()LU0/Y0;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    move-object v9, v0

    .line 364
    :cond_21
    const/4 v0, 0x0

    .line 365
    if-eqz v10, :cond_22

    .line 366
    .line 367
    move-object v11, v0

    .line 368
    :cond_22
    if-eqz v12, :cond_23

    .line 369
    .line 370
    sget-object v1, Lg1/v;->a:Lg1/v$a;

    .line 371
    .line 372
    invoke-virtual {v1}, Lg1/v$a;->a()I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    move v13, v1

    .line 377
    :cond_23
    const/4 v1, 0x1

    .line 378
    if-eqz v16, :cond_24

    .line 379
    .line 380
    move v4, v1

    .line 381
    :cond_24
    if-eqz v17, :cond_25

    .line 382
    .line 383
    const v5, 0x7fffffff

    .line 384
    .line 385
    .line 386
    :cond_25
    move v6, v5

    .line 387
    if-eqz v20, :cond_26

    .line 388
    .line 389
    move v7, v1

    .line 390
    goto :goto_16

    .line 391
    :cond_26
    move/from16 v7, p7

    .line 392
    .line 393
    :goto_16
    if-eqz v21, :cond_27

    .line 394
    .line 395
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    move-object/from16 v20, v5

    .line 400
    .line 401
    goto :goto_17

    .line 402
    :cond_27
    move-object/from16 v20, p8

    .line 403
    .line 404
    :goto_17
    if-eqz v22, :cond_28

    .line 405
    .line 406
    move-object v12, v0

    .line 407
    goto :goto_18

    .line 408
    :cond_28
    move-object/from16 v12, p9

    .line 409
    .line 410
    :goto_18
    invoke-static {}, LY/w;->L()Z

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-eqz v5, :cond_29

    .line 415
    .line 416
    const/4 v5, -0x1

    .line 417
    const-string v8, "androidx.compose.foundation.text.BasicText (BasicText.kt:191)"

    .line 418
    .line 419
    const v10, -0x3f70023c

    .line 420
    .line 421
    .line 422
    invoke-static {v10, v3, v5, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 423
    .line 424
    .line 425
    :cond_29
    invoke-static {v7, v6}, LK/n;->b(II)V

    .line 426
    .line 427
    .line 428
    invoke-static {}, LQ/B;->a()LY/b1;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    invoke-interface {v2, v5}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    invoke-static {v5}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    const v5, -0x5e710e46

    .line 440
    .line 441
    .line 442
    invoke-interface {v2, v5}, LY/m;->V(I)V

    .line 443
    .line 444
    .line 445
    invoke-interface {v2}, LY/m;->O()V

    .line 446
    .line 447
    .line 448
    invoke-static/range {p0 .. p0}, LK/b;->b(LU0/e;)Z

    .line 449
    .line 450
    .line 451
    move-result v19

    .line 452
    invoke-static/range {p0 .. p0}, LP/h;->a(LU0/e;)Z

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    const/4 v8, 0x0

    .line 457
    move v10, v3

    .line 458
    move-object v3, v11

    .line 459
    const/4 v11, 0x0

    .line 460
    if-nez v19, :cond_2e

    .line 461
    .line 462
    if-nez v5, :cond_2e

    .line 463
    .line 464
    const v0, -0x5e6e6a35

    .line 465
    .line 466
    .line 467
    invoke-interface {v2, v0}, LY/m;->V(I)V

    .line 468
    .line 469
    .line 470
    const v44, 0x1ffff

    .line 471
    .line 472
    .line 473
    const/16 v45, 0x0

    .line 474
    .line 475
    const/16 v24, 0x0

    .line 476
    .line 477
    const/16 v25, 0x0

    .line 478
    .line 479
    const/16 v26, 0x0

    .line 480
    .line 481
    const/16 v27, 0x0

    .line 482
    .line 483
    const/16 v28, 0x0

    .line 484
    .line 485
    const/16 v29, 0x0

    .line 486
    .line 487
    const/16 v30, 0x0

    .line 488
    .line 489
    const/16 v31, 0x0

    .line 490
    .line 491
    const/16 v32, 0x0

    .line 492
    .line 493
    const/16 v33, 0x0

    .line 494
    .line 495
    const-wide/16 v34, 0x0

    .line 496
    .line 497
    const/16 v36, 0x0

    .line 498
    .line 499
    const/16 v37, 0x0

    .line 500
    .line 501
    const/16 v38, 0x0

    .line 502
    .line 503
    const-wide/16 v39, 0x0

    .line 504
    .line 505
    const-wide/16 v41, 0x0

    .line 506
    .line 507
    const/16 v43, 0x0

    .line 508
    .line 509
    invoke-static/range {v23 .. v45}, Landroidx/compose/ui/graphics/f;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-static {}, Landroidx/compose/ui/platform/w0;->g()LY/b1;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-interface {v2, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    check-cast v1, LY0/u$b;

    .line 522
    .line 523
    const/4 v10, 0x0

    .line 524
    move/from16 v22, v13

    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    move-object/from16 v21, v9

    .line 528
    .line 529
    const/4 v9, 0x0

    .line 530
    move-object v14, v2

    .line 531
    move v5, v4

    .line 532
    move v15, v8

    .line 533
    move-object/from16 v2, v21

    .line 534
    .line 535
    move/from16 v4, v22

    .line 536
    .line 537
    move-object v8, v1

    .line 538
    move-object/from16 v1, p0

    .line 539
    .line 540
    invoke-static/range {v0 .. v13}, LK/d;->j(Landroidx/compose/ui/e;LU0/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILY0/u$b;Ljava/util/List;Lkotlin/jvm/functions/Function1;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    move-object v2, v1

    .line 545
    sget-object v1, LK/k;->a:LK/k;

    .line 546
    .line 547
    invoke-static {v14, v15}, LY/h;->a(LY/m;I)I

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    invoke-static {v14, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-interface {v14}, LY/m;->r()LY/I;

    .line 556
    .line 557
    .line 558
    move-result-object v8

    .line 559
    sget-object v9, LK0/g;->M:LK0/g$a;

    .line 560
    .line 561
    invoke-virtual {v9}, LK0/g$a;->a()Lie/a;

    .line 562
    .line 563
    .line 564
    move-result-object v10

    .line 565
    invoke-interface {v14}, LY/m;->j()LY/d;

    .line 566
    .line 567
    .line 568
    move-result-object v11

    .line 569
    if-nez v11, :cond_2a

    .line 570
    .line 571
    invoke-static {}, LY/h;->d()V

    .line 572
    .line 573
    .line 574
    :cond_2a
    invoke-interface {v14}, LY/m;->I()V

    .line 575
    .line 576
    .line 577
    invoke-interface {v14}, LY/m;->e()Z

    .line 578
    .line 579
    .line 580
    move-result v11

    .line 581
    if-eqz v11, :cond_2b

    .line 582
    .line 583
    invoke-interface {v14, v10}, LY/m;->h(Lie/a;)V

    .line 584
    .line 585
    .line 586
    goto :goto_19

    .line 587
    :cond_2b
    invoke-interface {v14}, LY/m;->s()V

    .line 588
    .line 589
    .line 590
    :goto_19
    invoke-static {v14}, LY/m2;->b(LY/m;)LY/m;

    .line 591
    .line 592
    .line 593
    move-result-object v10

    .line 594
    invoke-virtual {v9}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 595
    .line 596
    .line 597
    move-result-object v11

    .line 598
    invoke-static {v10, v1, v11}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v9}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-static {v10, v8, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v9}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-static {v10, v0, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v9}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-interface {v10}, LY/m;->e()Z

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-nez v1, :cond_2c

    .line 624
    .line 625
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    invoke-static {v1, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    if-nez v1, :cond_2d

    .line 638
    .line 639
    :cond_2c
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-interface {v10, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-interface {v10, v1, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 651
    .line 652
    .line 653
    :cond_2d
    invoke-interface {v14}, LY/m;->x()V

    .line 654
    .line 655
    .line 656
    invoke-interface {v14}, LY/m;->O()V

    .line 657
    .line 658
    .line 659
    goto/16 :goto_1b

    .line 660
    .line 661
    :cond_2e
    move-object v14, v2

    .line 662
    move v5, v4

    .line 663
    move v15, v8

    .line 664
    move-object/from16 v21, v9

    .line 665
    .line 666
    move/from16 v22, v13

    .line 667
    .line 668
    move-object/from16 v2, p0

    .line 669
    .line 670
    const v4, -0x5e60a490

    .line 671
    .line 672
    .line 673
    invoke-interface {v14, v4}, LY/m;->V(I)V

    .line 674
    .line 675
    .line 676
    and-int/lit8 v4, v10, 0xe

    .line 677
    .line 678
    const/4 v8, 0x4

    .line 679
    if-ne v4, v8, :cond_2f

    .line 680
    .line 681
    goto :goto_1a

    .line 682
    :cond_2f
    move v1, v15

    .line 683
    :goto_1a
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v4

    .line 687
    if-nez v1, :cond_30

    .line 688
    .line 689
    sget-object v1, LY/m;->a:LY/m$a;

    .line 690
    .line 691
    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    if-ne v4, v1, :cond_31

    .line 696
    .line 697
    :cond_30
    const/4 v1, 0x2

    .line 698
    invoke-static {v2, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 699
    .line 700
    .line 701
    move-result-object v4

    .line 702
    invoke-interface {v14, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    :cond_31
    check-cast v4, LY/C0;

    .line 706
    .line 707
    invoke-static {v4}, LK/d;->c(LY/C0;)LU0/e;

    .line 708
    .line 709
    .line 710
    move-result-object v17

    .line 711
    invoke-static {}, Landroidx/compose/ui/platform/w0;->g()LY/b1;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-interface {v14, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    move-object/from16 v26, v0

    .line 720
    .line 721
    check-cast v26, LY0/u$b;

    .line 722
    .line 723
    invoke-interface {v14, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    if-nez v0, :cond_32

    .line 732
    .line 733
    sget-object v0, LY/m;->a:LY/m$a;

    .line 734
    .line 735
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    if-ne v1, v0, :cond_33

    .line 740
    .line 741
    :cond_32
    new-instance v1, LK/d$b;

    .line 742
    .line 743
    invoke-direct {v1, v4}, LK/d$b;-><init>(LY/C0;)V

    .line 744
    .line 745
    .line 746
    invoke-interface {v14, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    :cond_33
    move-object/from16 v29, v1

    .line 750
    .line 751
    check-cast v29, Lkotlin/jvm/functions/Function1;

    .line 752
    .line 753
    shr-int/lit8 v0, v10, 0x3

    .line 754
    .line 755
    and-int/lit16 v0, v0, 0x38e

    .line 756
    .line 757
    shr-int/lit8 v1, v10, 0xc

    .line 758
    .line 759
    const v4, 0xe000

    .line 760
    .line 761
    .line 762
    and-int/2addr v1, v4

    .line 763
    or-int/2addr v0, v1

    .line 764
    shl-int/lit8 v1, v10, 0x9

    .line 765
    .line 766
    const/high16 v4, 0x70000

    .line 767
    .line 768
    and-int/2addr v1, v4

    .line 769
    or-int/2addr v0, v1

    .line 770
    shl-int/lit8 v1, v10, 0x6

    .line 771
    .line 772
    const/high16 v4, 0x380000

    .line 773
    .line 774
    and-int/2addr v4, v1

    .line 775
    or-int/2addr v0, v4

    .line 776
    const/high16 v4, 0x1c00000

    .line 777
    .line 778
    and-int/2addr v4, v1

    .line 779
    or-int/2addr v0, v4

    .line 780
    const/high16 v4, 0xe000000

    .line 781
    .line 782
    and-int/2addr v4, v1

    .line 783
    or-int/2addr v0, v4

    .line 784
    const/high16 v4, 0x70000000

    .line 785
    .line 786
    and-int/2addr v1, v4

    .line 787
    or-int v31, v0, v1

    .line 788
    .line 789
    shr-int/lit8 v0, v10, 0x15

    .line 790
    .line 791
    and-int/lit16 v0, v0, 0x380

    .line 792
    .line 793
    const/16 v33, 0x0

    .line 794
    .line 795
    move/from16 v32, v0

    .line 796
    .line 797
    move-object/from16 v18, v3

    .line 798
    .line 799
    move/from16 v24, v6

    .line 800
    .line 801
    move/from16 v25, v7

    .line 802
    .line 803
    move-object/from16 v27, v11

    .line 804
    .line 805
    move-object/from16 v28, v12

    .line 806
    .line 807
    move-object/from16 v30, v14

    .line 808
    .line 809
    move-object/from16 v16, v23

    .line 810
    .line 811
    move/from16 v23, v5

    .line 812
    .line 813
    invoke-static/range {v16 .. v33}, LK/d;->e(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;LY/m;III)V

    .line 814
    .line 815
    .line 816
    move-object/from16 v23, v16

    .line 817
    .line 818
    invoke-interface {v14}, LY/m;->O()V

    .line 819
    .line 820
    .line 821
    :goto_1b
    invoke-static {}, LY/w;->L()Z

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    if-eqz v0, :cond_34

    .line 826
    .line 827
    invoke-static {}, LY/w;->T()V

    .line 828
    .line 829
    .line 830
    :cond_34
    move-object v4, v3

    .line 831
    move v0, v6

    .line 832
    move v8, v7

    .line 833
    move-object v10, v12

    .line 834
    move-object/from16 v9, v20

    .line 835
    .line 836
    move-object/from16 v3, v21

    .line 837
    .line 838
    move-object/from16 v7, v23

    .line 839
    .line 840
    move v6, v5

    .line 841
    move/from16 v5, v22

    .line 842
    .line 843
    :goto_1c
    invoke-interface {v14}, LY/m;->k()LY/B1;

    .line 844
    .line 845
    .line 846
    move-result-object v13

    .line 847
    if-eqz v13, :cond_35

    .line 848
    .line 849
    move-object v2, v7

    .line 850
    move v7, v0

    .line 851
    new-instance v0, LK/d$c;

    .line 852
    .line 853
    move-object/from16 v1, p0

    .line 854
    .line 855
    move/from16 v11, p11

    .line 856
    .line 857
    move/from16 v12, p12

    .line 858
    .line 859
    invoke-direct/range {v0 .. v12}, LK/d$c;-><init>(LU0/e;Landroidx/compose/ui/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Ls0/t0;II)V

    .line 860
    .line 861
    .line 862
    invoke-interface {v13, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 863
    .line 864
    .line 865
    :cond_35
    return-void
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILs0/t0;LY/m;II)V
    .locals 43

    .line 1
    move/from16 v10, p10

    .line 2
    .line 3
    move/from16 v11, p11

    .line 4
    .line 5
    const v0, -0x46bd8e2e

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
    or-int/lit8 v2, v10, 0x6

    .line 19
    .line 20
    move-object/from16 v13, p0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v10, 0x6

    .line 24
    .line 25
    move-object/from16 v13, p0

    .line 26
    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1, v13}, LY/m;->U(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x2

    .line 38
    :goto_0
    or-int/2addr v2, v10

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v2, v10

    .line 41
    :goto_1
    and-int/lit8 v3, v11, 0x2

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    or-int/lit8 v2, v2, 0x30

    .line 46
    .line 47
    :cond_3
    move-object/from16 v4, p1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    and-int/lit8 v4, v10, 0x30

    .line 51
    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    move-object/from16 v4, p1

    .line 55
    .line 56
    invoke-interface {v1, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    const/16 v5, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_5
    const/16 v5, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v2, v5

    .line 68
    :goto_3
    and-int/lit8 v5, v11, 0x4

    .line 69
    .line 70
    if-eqz v5, :cond_7

    .line 71
    .line 72
    or-int/lit16 v2, v2, 0x180

    .line 73
    .line 74
    :cond_6
    move-object/from16 v6, p2

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_7
    and-int/lit16 v6, v10, 0x180

    .line 78
    .line 79
    if-nez v6, :cond_6

    .line 80
    .line 81
    move-object/from16 v6, p2

    .line 82
    .line 83
    invoke-interface {v1, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_8

    .line 88
    .line 89
    const/16 v7, 0x100

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_8
    const/16 v7, 0x80

    .line 93
    .line 94
    :goto_4
    or-int/2addr v2, v7

    .line 95
    :goto_5
    and-int/lit8 v7, v11, 0x8

    .line 96
    .line 97
    if-eqz v7, :cond_a

    .line 98
    .line 99
    or-int/lit16 v2, v2, 0xc00

    .line 100
    .line 101
    :cond_9
    move-object/from16 v8, p3

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_a
    and-int/lit16 v8, v10, 0xc00

    .line 105
    .line 106
    if-nez v8, :cond_9

    .line 107
    .line 108
    move-object/from16 v8, p3

    .line 109
    .line 110
    invoke-interface {v1, v8}, LY/m;->F(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_b

    .line 115
    .line 116
    const/16 v9, 0x800

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_b
    const/16 v9, 0x400

    .line 120
    .line 121
    :goto_6
    or-int/2addr v2, v9

    .line 122
    :goto_7
    and-int/lit8 v9, v11, 0x10

    .line 123
    .line 124
    if-eqz v9, :cond_d

    .line 125
    .line 126
    or-int/lit16 v2, v2, 0x6000

    .line 127
    .line 128
    :cond_c
    move/from16 v12, p4

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_d
    and-int/lit16 v12, v10, 0x6000

    .line 132
    .line 133
    if-nez v12, :cond_c

    .line 134
    .line 135
    move/from16 v12, p4

    .line 136
    .line 137
    invoke-interface {v1, v12}, LY/m;->c(I)Z

    .line 138
    .line 139
    .line 140
    move-result v14

    .line 141
    if-eqz v14, :cond_e

    .line 142
    .line 143
    const/16 v14, 0x4000

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_e
    const/16 v14, 0x2000

    .line 147
    .line 148
    :goto_8
    or-int/2addr v2, v14

    .line 149
    :goto_9
    and-int/lit8 v14, v11, 0x20

    .line 150
    .line 151
    const/high16 v15, 0x30000

    .line 152
    .line 153
    if-eqz v14, :cond_10

    .line 154
    .line 155
    or-int/2addr v2, v15

    .line 156
    :cond_f
    move/from16 v15, p5

    .line 157
    .line 158
    goto :goto_b

    .line 159
    :cond_10
    and-int/2addr v15, v10

    .line 160
    if-nez v15, :cond_f

    .line 161
    .line 162
    move/from16 v15, p5

    .line 163
    .line 164
    invoke-interface {v1, v15}, LY/m;->a(Z)Z

    .line 165
    .line 166
    .line 167
    move-result v16

    .line 168
    if-eqz v16, :cond_11

    .line 169
    .line 170
    const/high16 v16, 0x20000

    .line 171
    .line 172
    goto :goto_a

    .line 173
    :cond_11
    const/high16 v16, 0x10000

    .line 174
    .line 175
    :goto_a
    or-int v2, v2, v16

    .line 176
    .line 177
    :goto_b
    and-int/lit8 v16, v11, 0x40

    .line 178
    .line 179
    const/high16 v17, 0x180000

    .line 180
    .line 181
    if-eqz v16, :cond_12

    .line 182
    .line 183
    or-int v2, v2, v17

    .line 184
    .line 185
    move/from16 v0, p6

    .line 186
    .line 187
    goto :goto_d

    .line 188
    :cond_12
    and-int v17, v10, v17

    .line 189
    .line 190
    move/from16 v0, p6

    .line 191
    .line 192
    if-nez v17, :cond_14

    .line 193
    .line 194
    invoke-interface {v1, v0}, LY/m;->c(I)Z

    .line 195
    .line 196
    .line 197
    move-result v18

    .line 198
    if-eqz v18, :cond_13

    .line 199
    .line 200
    const/high16 v18, 0x100000

    .line 201
    .line 202
    goto :goto_c

    .line 203
    :cond_13
    const/high16 v18, 0x80000

    .line 204
    .line 205
    :goto_c
    or-int v2, v2, v18

    .line 206
    .line 207
    :cond_14
    :goto_d
    and-int/lit16 v0, v11, 0x80

    .line 208
    .line 209
    const/high16 v18, 0xc00000

    .line 210
    .line 211
    if-eqz v0, :cond_16

    .line 212
    .line 213
    or-int v2, v2, v18

    .line 214
    .line 215
    :cond_15
    move/from16 v18, v0

    .line 216
    .line 217
    move/from16 v0, p7

    .line 218
    .line 219
    goto :goto_f

    .line 220
    :cond_16
    and-int v18, v10, v18

    .line 221
    .line 222
    if-nez v18, :cond_15

    .line 223
    .line 224
    move/from16 v18, v0

    .line 225
    .line 226
    move/from16 v0, p7

    .line 227
    .line 228
    invoke-interface {v1, v0}, LY/m;->c(I)Z

    .line 229
    .line 230
    .line 231
    move-result v19

    .line 232
    if-eqz v19, :cond_17

    .line 233
    .line 234
    const/high16 v19, 0x800000

    .line 235
    .line 236
    goto :goto_e

    .line 237
    :cond_17
    const/high16 v19, 0x400000

    .line 238
    .line 239
    :goto_e
    or-int v2, v2, v19

    .line 240
    .line 241
    :goto_f
    and-int/lit16 v0, v11, 0x100

    .line 242
    .line 243
    const/high16 v19, 0x6000000

    .line 244
    .line 245
    if-eqz v0, :cond_19

    .line 246
    .line 247
    or-int v2, v2, v19

    .line 248
    .line 249
    :cond_18
    move/from16 v19, v0

    .line 250
    .line 251
    move-object/from16 v0, p8

    .line 252
    .line 253
    goto :goto_11

    .line 254
    :cond_19
    and-int v19, v10, v19

    .line 255
    .line 256
    if-nez v19, :cond_18

    .line 257
    .line 258
    move/from16 v19, v0

    .line 259
    .line 260
    move-object/from16 v0, p8

    .line 261
    .line 262
    invoke-interface {v1, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v20

    .line 266
    if-eqz v20, :cond_1a

    .line 267
    .line 268
    const/high16 v20, 0x4000000

    .line 269
    .line 270
    goto :goto_10

    .line 271
    :cond_1a
    const/high16 v20, 0x2000000

    .line 272
    .line 273
    :goto_10
    or-int v2, v2, v20

    .line 274
    .line 275
    :goto_11
    const v20, 0x2492493

    .line 276
    .line 277
    .line 278
    and-int v0, v2, v20

    .line 279
    .line 280
    move/from16 p9, v3

    .line 281
    .line 282
    const v3, 0x2492492

    .line 283
    .line 284
    .line 285
    if-ne v0, v3, :cond_1c

    .line 286
    .line 287
    invoke-interface {v1}, LY/m;->i()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-nez v0, :cond_1b

    .line 292
    .line 293
    goto :goto_12

    .line 294
    :cond_1b
    invoke-interface {v1}, LY/m;->K()V

    .line 295
    .line 296
    .line 297
    move/from16 v7, p6

    .line 298
    .line 299
    move-object/from16 v9, p8

    .line 300
    .line 301
    move-object v2, v4

    .line 302
    move-object v3, v6

    .line 303
    move-object v4, v8

    .line 304
    move v5, v12

    .line 305
    move v6, v15

    .line 306
    move/from16 v8, p7

    .line 307
    .line 308
    goto/16 :goto_19

    .line 309
    .line 310
    :cond_1c
    :goto_12
    if-eqz p9, :cond_1d

    .line 311
    .line 312
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 313
    .line 314
    move-object/from16 v20, v0

    .line 315
    .line 316
    goto :goto_13

    .line 317
    :cond_1d
    move-object/from16 v20, v4

    .line 318
    .line 319
    :goto_13
    if-eqz v5, :cond_1e

    .line 320
    .line 321
    sget-object v0, LU0/Y0;->d:LU0/Y0$a;

    .line 322
    .line 323
    invoke-virtual {v0}, LU0/Y0$a;->a()LU0/Y0;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    move-object v6, v0

    .line 328
    :cond_1e
    const/4 v0, 0x0

    .line 329
    if-eqz v7, :cond_1f

    .line 330
    .line 331
    move-object v8, v0

    .line 332
    :cond_1f
    if-eqz v9, :cond_20

    .line 333
    .line 334
    sget-object v3, Lg1/v;->a:Lg1/v$a;

    .line 335
    .line 336
    invoke-virtual {v3}, Lg1/v$a;->a()I

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    move v12, v3

    .line 341
    :cond_20
    const/4 v3, 0x1

    .line 342
    if-eqz v14, :cond_21

    .line 343
    .line 344
    move v15, v3

    .line 345
    :cond_21
    if-eqz v16, :cond_22

    .line 346
    .line 347
    const v4, 0x7fffffff

    .line 348
    .line 349
    .line 350
    goto :goto_14

    .line 351
    :cond_22
    move/from16 v4, p6

    .line 352
    .line 353
    :goto_14
    if-eqz v18, :cond_23

    .line 354
    .line 355
    goto :goto_15

    .line 356
    :cond_23
    move/from16 v3, p7

    .line 357
    .line 358
    :goto_15
    if-eqz v19, :cond_24

    .line 359
    .line 360
    goto :goto_16

    .line 361
    :cond_24
    move-object/from16 v0, p8

    .line 362
    .line 363
    :goto_16
    invoke-static {}, LY/w;->L()Z

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    if-eqz v5, :cond_25

    .line 368
    .line 369
    const/4 v5, -0x1

    .line 370
    const-string v7, "androidx.compose.foundation.text.BasicText (BasicText.kt:96)"

    .line 371
    .line 372
    const v9, -0x46bd8e2e

    .line 373
    .line 374
    .line 375
    invoke-static {v9, v2, v5, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 376
    .line 377
    .line 378
    :cond_25
    invoke-static {v3, v4}, LK/n;->b(II)V

    .line 379
    .line 380
    .line 381
    invoke-static {}, LQ/B;->a()LY/b1;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-interface {v1, v2}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-static {v2}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    const v2, -0x5eb16ea6

    .line 393
    .line 394
    .line 395
    invoke-interface {v1, v2}, LY/m;->V(I)V

    .line 396
    .line 397
    .line 398
    invoke-interface {v1}, LY/m;->O()V

    .line 399
    .line 400
    .line 401
    if-eqz v8, :cond_26

    .line 402
    .line 403
    const v2, -0x5eaf9054

    .line 404
    .line 405
    .line 406
    invoke-interface {v1, v2}, LY/m;->V(I)V

    .line 407
    .line 408
    .line 409
    const v41, 0x1ffff

    .line 410
    .line 411
    .line 412
    const/16 v42, 0x0

    .line 413
    .line 414
    const/16 v21, 0x0

    .line 415
    .line 416
    const/16 v22, 0x0

    .line 417
    .line 418
    const/16 v23, 0x0

    .line 419
    .line 420
    const/16 v24, 0x0

    .line 421
    .line 422
    const/16 v25, 0x0

    .line 423
    .line 424
    const/16 v26, 0x0

    .line 425
    .line 426
    const/16 v27, 0x0

    .line 427
    .line 428
    const/16 v28, 0x0

    .line 429
    .line 430
    const/16 v29, 0x0

    .line 431
    .line 432
    const/16 v30, 0x0

    .line 433
    .line 434
    const-wide/16 v31, 0x0

    .line 435
    .line 436
    const/16 v33, 0x0

    .line 437
    .line 438
    const/16 v34, 0x0

    .line 439
    .line 440
    const/16 v35, 0x0

    .line 441
    .line 442
    const-wide/16 v36, 0x0

    .line 443
    .line 444
    const-wide/16 v38, 0x0

    .line 445
    .line 446
    const/16 v40, 0x0

    .line 447
    .line 448
    invoke-static/range {v20 .. v42}, Landroidx/compose/ui/graphics/f;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 449
    .line 450
    .line 451
    move-result-object v21

    .line 452
    new-instance v22, LU0/e;

    .line 453
    .line 454
    const/4 v2, 0x6

    .line 455
    const/4 v5, 0x0

    .line 456
    const/4 v7, 0x0

    .line 457
    const/4 v9, 0x0

    .line 458
    move/from16 p5, v2

    .line 459
    .line 460
    move-object/from16 p6, v5

    .line 461
    .line 462
    move-object/from16 p3, v7

    .line 463
    .line 464
    move-object/from16 p4, v9

    .line 465
    .line 466
    move-object/from16 p2, v13

    .line 467
    .line 468
    move-object/from16 p1, v22

    .line 469
    .line 470
    invoke-direct/range {p1 .. p6}, LU0/e;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 471
    .line 472
    .line 473
    invoke-static {}, Landroidx/compose/ui/platform/w0;->g()LY/b1;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-interface {v1, v2}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    move-object/from16 v29, v2

    .line 482
    .line 483
    check-cast v29, LY0/u$b;

    .line 484
    .line 485
    const/16 v31, 0x0

    .line 486
    .line 487
    const/16 v34, 0x0

    .line 488
    .line 489
    const/16 v30, 0x0

    .line 490
    .line 491
    const/16 v32, 0x0

    .line 492
    .line 493
    move-object/from16 v33, v0

    .line 494
    .line 495
    move/from16 v28, v3

    .line 496
    .line 497
    move/from16 v27, v4

    .line 498
    .line 499
    move-object/from16 v23, v6

    .line 500
    .line 501
    move-object/from16 v24, v8

    .line 502
    .line 503
    move/from16 v25, v12

    .line 504
    .line 505
    move/from16 v26, v15

    .line 506
    .line 507
    invoke-static/range {v21 .. v34}, LK/d;->j(Landroidx/compose/ui/e;LU0/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILY0/u$b;Ljava/util/List;Lkotlin/jvm/functions/Function1;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    move-object/from16 v14, v23

    .line 512
    .line 513
    move/from16 v16, v25

    .line 514
    .line 515
    move/from16 v17, v26

    .line 516
    .line 517
    move/from16 v18, v27

    .line 518
    .line 519
    move/from16 v19, v28

    .line 520
    .line 521
    move-object/from16 v2, v33

    .line 522
    .line 523
    invoke-interface {v1}, LY/m;->O()V

    .line 524
    .line 525
    .line 526
    move-object/from16 v4, v20

    .line 527
    .line 528
    move-object/from16 v20, v2

    .line 529
    .line 530
    goto :goto_17

    .line 531
    :cond_26
    move-object v2, v0

    .line 532
    move/from16 v19, v3

    .line 533
    .line 534
    move/from16 v18, v4

    .line 535
    .line 536
    move-object v14, v6

    .line 537
    move/from16 v16, v12

    .line 538
    .line 539
    move/from16 v17, v15

    .line 540
    .line 541
    const v0, -0x5ea4eadf

    .line 542
    .line 543
    .line 544
    invoke-interface {v1, v0}, LY/m;->V(I)V

    .line 545
    .line 546
    .line 547
    const v41, 0x1ffff

    .line 548
    .line 549
    .line 550
    const/16 v42, 0x0

    .line 551
    .line 552
    const/16 v21, 0x0

    .line 553
    .line 554
    const/16 v22, 0x0

    .line 555
    .line 556
    const/16 v23, 0x0

    .line 557
    .line 558
    const/16 v24, 0x0

    .line 559
    .line 560
    const/16 v25, 0x0

    .line 561
    .line 562
    const/16 v26, 0x0

    .line 563
    .line 564
    const/16 v27, 0x0

    .line 565
    .line 566
    const/16 v28, 0x0

    .line 567
    .line 568
    const/16 v29, 0x0

    .line 569
    .line 570
    const/16 v30, 0x0

    .line 571
    .line 572
    const-wide/16 v31, 0x0

    .line 573
    .line 574
    const/16 v33, 0x0

    .line 575
    .line 576
    const/16 v34, 0x0

    .line 577
    .line 578
    const/16 v35, 0x0

    .line 579
    .line 580
    const-wide/16 v36, 0x0

    .line 581
    .line 582
    const-wide/16 v38, 0x0

    .line 583
    .line 584
    const/16 v40, 0x0

    .line 585
    .line 586
    invoke-static/range {v20 .. v42}, Landroidx/compose/ui/graphics/f;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    move-object/from16 v4, v20

    .line 591
    .line 592
    new-instance v12, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;

    .line 593
    .line 594
    invoke-static {}, Landroidx/compose/ui/platform/w0;->g()LY/b1;

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    invoke-interface {v1, v3}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    move-object v15, v3

    .line 603
    check-cast v15, LY0/u$b;

    .line 604
    .line 605
    const/16 v21, 0x0

    .line 606
    .line 607
    move-object/from16 v13, p0

    .line 608
    .line 609
    move-object/from16 v20, v2

    .line 610
    .line 611
    invoke-direct/range {v12 .. v21}, Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;-><init>(Ljava/lang/String;LU0/Y0;LY0/u$b;IZIILs0/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 612
    .line 613
    .line 614
    invoke-interface {v0, v12}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-interface {v1}, LY/m;->O()V

    .line 619
    .line 620
    .line 621
    :goto_17
    sget-object v2, LK/k;->a:LK/k;

    .line 622
    .line 623
    const/4 v3, 0x0

    .line 624
    invoke-static {v1, v3}, LY/h;->a(LY/m;I)I

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    invoke-static {v1, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-interface {v1}, LY/m;->r()LY/I;

    .line 633
    .line 634
    .line 635
    move-result-object v5

    .line 636
    sget-object v6, LK0/g;->M:LK0/g$a;

    .line 637
    .line 638
    invoke-virtual {v6}, LK0/g$a;->a()Lie/a;

    .line 639
    .line 640
    .line 641
    move-result-object v7

    .line 642
    invoke-interface {v1}, LY/m;->j()LY/d;

    .line 643
    .line 644
    .line 645
    move-result-object v9

    .line 646
    if-nez v9, :cond_27

    .line 647
    .line 648
    invoke-static {}, LY/h;->d()V

    .line 649
    .line 650
    .line 651
    :cond_27
    invoke-interface {v1}, LY/m;->I()V

    .line 652
    .line 653
    .line 654
    invoke-interface {v1}, LY/m;->e()Z

    .line 655
    .line 656
    .line 657
    move-result v9

    .line 658
    if-eqz v9, :cond_28

    .line 659
    .line 660
    invoke-interface {v1, v7}, LY/m;->h(Lie/a;)V

    .line 661
    .line 662
    .line 663
    goto :goto_18

    .line 664
    :cond_28
    invoke-interface {v1}, LY/m;->s()V

    .line 665
    .line 666
    .line 667
    :goto_18
    invoke-static {v1}, LY/m2;->b(LY/m;)LY/m;

    .line 668
    .line 669
    .line 670
    move-result-object v7

    .line 671
    invoke-virtual {v6}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 672
    .line 673
    .line 674
    move-result-object v9

    .line 675
    invoke-static {v7, v2, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v6}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    invoke-static {v7, v5, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v6}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    invoke-static {v7, v0, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v6}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-interface {v7}, LY/m;->e()Z

    .line 697
    .line 698
    .line 699
    move-result v2

    .line 700
    if-nez v2, :cond_29

    .line 701
    .line 702
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 707
    .line 708
    .line 709
    move-result-object v5

    .line 710
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v2

    .line 714
    if-nez v2, :cond_2a

    .line 715
    .line 716
    :cond_29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    invoke-interface {v7, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    invoke-interface {v7, v2, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 728
    .line 729
    .line 730
    :cond_2a
    invoke-interface {v1}, LY/m;->x()V

    .line 731
    .line 732
    .line 733
    invoke-static {}, LY/w;->L()Z

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-eqz v0, :cond_2b

    .line 738
    .line 739
    invoke-static {}, LY/w;->T()V

    .line 740
    .line 741
    .line 742
    :cond_2b
    move-object v2, v4

    .line 743
    move-object v4, v8

    .line 744
    move-object v3, v14

    .line 745
    move/from16 v5, v16

    .line 746
    .line 747
    move/from16 v6, v17

    .line 748
    .line 749
    move/from16 v7, v18

    .line 750
    .line 751
    move/from16 v8, v19

    .line 752
    .line 753
    move-object/from16 v9, v20

    .line 754
    .line 755
    :goto_19
    invoke-interface {v1}, LY/m;->k()LY/B1;

    .line 756
    .line 757
    .line 758
    move-result-object v12

    .line 759
    if-eqz v12, :cond_2c

    .line 760
    .line 761
    new-instance v0, LK/d$a;

    .line 762
    .line 763
    move-object/from16 v1, p0

    .line 764
    .line 765
    invoke-direct/range {v0 .. v11}, LK/d$a;-><init>(Ljava/lang/String;Landroidx/compose/ui/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILs0/t0;II)V

    .line 766
    .line 767
    .line 768
    invoke-interface {v12, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 769
    .line 770
    .line 771
    :cond_2c
    return-void
.end method

.method private static final c(LY/C0;)LU0/e;
    .locals 0

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, LU0/e;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final d(LY/C0;LU0/e;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final e(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;LY/m;III)V
    .locals 43

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v15, p15

    move/from16 v0, p16

    move/from16 v1, p17

    const v5, 0x2673e498

    move-object/from16 v6, p14

    .line 1
    invoke-interface {v6, v5}, LY/m;->g(I)LY/m;

    move-result-object v6

    and-int/lit8 v7, v1, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v7, v15, 0x6

    move v10, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v15, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v6, v7}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x4

    goto :goto_0

    :cond_1
    const/4 v10, 0x2

    :goto_0
    or-int/2addr v10, v15

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v10, v15

    :goto_1
    and-int/lit8 v11, v1, 0x2

    if-eqz v11, :cond_3

    or-int/lit8 v10, v10, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v15, 0x30

    if-nez v11, :cond_5

    invoke-interface {v6, v2}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x20

    goto :goto_2

    :cond_4
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v10, v11

    :cond_5
    :goto_3
    and-int/lit8 v11, v1, 0x4

    if-eqz v11, :cond_6

    or-int/lit16 v10, v10, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v15, 0x180

    if-nez v11, :cond_8

    invoke-interface {v6, v3}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v10, v11

    :cond_8
    :goto_5
    and-int/lit8 v11, v1, 0x8

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-eqz v11, :cond_9

    or-int/lit16 v10, v10, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v15, 0xc00

    if-nez v11, :cond_b

    invoke-interface {v6, v4}, LY/m;->a(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    move/from16 v11, v17

    goto :goto_6

    :cond_a
    move/from16 v11, v16

    :goto_6
    or-int/2addr v10, v11

    :cond_b
    :goto_7
    and-int/lit8 v11, v1, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v10, v10, 0x6000

    :cond_c
    move-object/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v15, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v6, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_e

    const/16 v19, 0x4000

    goto :goto_8

    :cond_e
    const/16 v19, 0x2000

    :goto_8
    or-int v10, v10, v19

    :goto_9
    and-int/lit8 v19, v1, 0x20

    const/high16 v20, 0x30000

    if-eqz v19, :cond_f

    or-int v10, v10, v20

    move-object/from16 v14, p5

    goto :goto_b

    :cond_f
    and-int v19, v15, v20

    move-object/from16 v14, p5

    if-nez v19, :cond_11

    invoke-interface {v6, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_10

    const/high16 v20, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v20, 0x10000

    :goto_a
    or-int v10, v10, v20

    :cond_11
    :goto_b
    and-int/lit8 v20, v1, 0x40

    const/high16 v21, 0x180000

    if-eqz v20, :cond_12

    or-int v10, v10, v21

    move/from16 v8, p6

    goto :goto_d

    :cond_12
    and-int v20, v15, v21

    move/from16 v8, p6

    if-nez v20, :cond_14

    invoke-interface {v6, v8}, LY/m;->c(I)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v10, v10, v20

    :cond_14
    :goto_d
    and-int/lit16 v9, v1, 0x80

    const/high16 v21, 0xc00000

    if-eqz v9, :cond_16

    or-int v10, v10, v21

    :cond_15
    move/from16 v9, p7

    goto :goto_f

    :cond_16
    and-int v9, v15, v21

    if-nez v9, :cond_15

    move/from16 v9, p7

    invoke-interface {v6, v9}, LY/m;->a(Z)Z

    move-result v21

    if-eqz v21, :cond_17

    const/high16 v21, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v21, 0x400000

    :goto_e
    or-int v10, v10, v21

    :goto_f
    and-int/lit16 v13, v1, 0x100

    const/high16 v22, 0x6000000

    if-eqz v13, :cond_19

    or-int v10, v10, v22

    :cond_18
    move/from16 v13, p8

    goto :goto_11

    :cond_19
    and-int v13, v15, v22

    if-nez v13, :cond_18

    move/from16 v13, p8

    invoke-interface {v6, v13}, LY/m;->c(I)Z

    move-result v22

    if-eqz v22, :cond_1a

    const/high16 v22, 0x4000000

    goto :goto_10

    :cond_1a
    const/high16 v22, 0x2000000

    :goto_10
    or-int v10, v10, v22

    :goto_11
    and-int/lit16 v5, v1, 0x200

    const/high16 v23, 0x30000000

    if-eqz v5, :cond_1c

    or-int v10, v10, v23

    :cond_1b
    move/from16 v5, p9

    goto :goto_13

    :cond_1c
    and-int v5, v15, v23

    if-nez v5, :cond_1b

    move/from16 v5, p9

    invoke-interface {v6, v5}, LY/m;->c(I)Z

    move-result v23

    if-eqz v23, :cond_1d

    const/high16 v23, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v23, 0x10000000

    :goto_12
    or-int v10, v10, v23

    :goto_13
    and-int/lit16 v4, v1, 0x400

    if-eqz v4, :cond_1e

    or-int/lit8 v4, v0, 0x6

    move/from16 v23, v4

    move-object/from16 v4, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_20

    move-object/from16 v4, p10

    invoke-interface {v6, v4}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1f

    const/16 v23, 0x4

    goto :goto_14

    :cond_1f
    const/16 v23, 0x2

    :goto_14
    or-int v23, v0, v23

    goto :goto_15

    :cond_20
    move-object/from16 v4, p10

    move/from16 v23, v0

    :goto_15
    and-int/lit16 v4, v1, 0x800

    if-eqz v4, :cond_21

    or-int/lit8 v23, v23, 0x30

    :goto_16
    move/from16 v4, v23

    goto :goto_18

    :cond_21
    and-int/lit8 v4, v0, 0x30

    if-nez v4, :cond_23

    move-object/from16 v4, p11

    invoke-interface {v6, v4}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_22

    const/16 v18, 0x20

    goto :goto_17

    :cond_22
    const/16 v18, 0x10

    :goto_17
    or-int v23, v23, v18

    goto :goto_16

    :cond_23
    move-object/from16 v4, p11

    goto :goto_16

    :goto_18
    and-int/lit16 v5, v1, 0x1000

    if-eqz v5, :cond_25

    or-int/lit16 v4, v4, 0x180

    :cond_24
    move-object/from16 v5, p12

    goto :goto_1a

    :cond_25
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_24

    move-object/from16 v5, p12

    invoke-interface {v6, v5}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_26

    const/16 v19, 0x100

    goto :goto_19

    :cond_26
    const/16 v19, 0x80

    :goto_19
    or-int v4, v4, v19

    :goto_1a
    and-int/lit16 v5, v1, 0x2000

    if-eqz v5, :cond_28

    or-int/lit16 v4, v4, 0xc00

    :cond_27
    move-object/from16 v5, p13

    goto :goto_1b

    :cond_28
    and-int/lit16 v5, v0, 0xc00

    if-nez v5, :cond_27

    move-object/from16 v5, p13

    invoke-interface {v6, v5}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_29

    move/from16 v16, v17

    :cond_29
    or-int v4, v4, v16

    :goto_1b
    const v16, 0x12492493

    and-int v0, v10, v16

    const v1, 0x12492492

    if-ne v0, v1, :cond_2b

    and-int/lit16 v0, v4, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_2b

    invoke-interface {v6}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_2a

    goto :goto_1c

    .line 2
    :cond_2a
    invoke-interface {v6}, LY/m;->K()V

    move-object v5, v12

    goto/16 :goto_2e

    :cond_2b
    :goto_1c
    if-eqz v11, :cond_2c

    .line 3
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    move-result-object v0

    goto :goto_1d

    :cond_2c
    move-object v0, v12

    :goto_1d
    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_2d

    const-string v1, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:536)"

    const v11, 0x2673e498

    .line 4
    invoke-static {v11, v10, v4, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2d
    invoke-static {v2}, LP/h;->a(LU0/e;)Z

    move-result v1

    const/4 v11, 0x0

    if-eqz v1, :cond_31

    const v1, -0x24ea1f1f

    invoke-interface {v6, v1}, LY/m;->V(I)V

    and-int/lit8 v1, v10, 0x70

    const/16 v12, 0x20

    if-ne v1, v12, :cond_2e

    const/4 v1, 0x1

    goto :goto_1e

    :cond_2e
    const/4 v1, 0x0

    .line 6
    :goto_1e
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v12

    if-nez v1, :cond_2f

    .line 7
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v12, v1, :cond_30

    .line 8
    :cond_2f
    new-instance v12, LK/c0;

    invoke-direct {v12, v2}, LK/c0;-><init>(LU0/e;)V

    .line 9
    invoke-interface {v6, v12}, LY/m;->u(Ljava/lang/Object;)V

    .line 10
    :cond_30
    check-cast v12, LK/c0;

    .line 11
    invoke-interface {v6}, LY/m;->O()V

    goto :goto_1f

    :cond_31
    const v1, -0x24e93cae

    .line 12
    invoke-interface {v6, v1}, LY/m;->V(I)V

    invoke-interface {v6}, LY/m;->O()V

    move-object v12, v11

    .line 13
    :goto_1f
    invoke-static {v2}, LP/h;->a(LU0/e;)Z

    move-result v1

    if-eqz v1, :cond_35

    const v1, -0x24e653f3

    invoke-interface {v6, v1}, LY/m;->V(I)V

    and-int/lit8 v1, v10, 0x70

    const/16 v4, 0x20

    if-ne v1, v4, :cond_32

    const/4 v1, 0x1

    goto :goto_20

    :cond_32
    const/4 v1, 0x0

    .line 14
    :goto_20
    invoke-interface {v6, v12}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    .line 15
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_33

    .line 16
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_34

    .line 17
    :cond_33
    new-instance v4, LK/d$j;

    invoke-direct {v4, v12, v2}, LK/d$j;-><init>(LK/c0;LU0/e;)V

    .line 18
    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 19
    :cond_34
    check-cast v4, Lie/a;

    .line 20
    invoke-interface {v6}, LY/m;->O()V

    goto :goto_22

    :cond_35
    const v1, -0x24e4ad55

    .line 21
    invoke-interface {v6, v1}, LY/m;->V(I)V

    and-int/lit8 v1, v10, 0x70

    const/16 v4, 0x20

    if-ne v1, v4, :cond_36

    const/4 v1, 0x1

    goto :goto_21

    :cond_36
    const/4 v1, 0x0

    .line 22
    :goto_21
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_37

    .line 23
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_38

    .line 24
    :cond_37
    new-instance v4, LK/d$k;

    invoke-direct {v4, v2}, LK/d$k;-><init>(LU0/e;)V

    .line 25
    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 26
    :cond_38
    check-cast v4, Lie/a;

    invoke-interface {v6}, LY/m;->O()V

    :goto_22
    if-eqz p3, :cond_39

    .line 27
    invoke-static {v2, v0}, LK/b;->c(LU0/e;Ljava/util/Map;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_23

    .line 28
    :cond_39
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v11, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    :goto_23
    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v39, v16

    check-cast v39, Ljava/util/List;

    invoke-virtual {v1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz p3, :cond_3b

    const v11, -0x24e02e56

    .line 30
    invoke-interface {v6, v11}, LY/m;->V(I)V

    .line 31
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v11

    .line 32
    sget-object v17, LY/m;->a:LY/m$a;

    move-object/from16 v40, v0

    invoke-virtual/range {v17 .. v17}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v11, v0, :cond_3a

    move-object/from16 v41, v4

    const/4 v0, 0x2

    const/4 v4, 0x0

    .line 33
    invoke-static {v4, v4, v0, v4}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object v11

    .line 34
    invoke-interface {v6, v11}, LY/m;->u(Ljava/lang/Object;)V

    goto :goto_24

    :cond_3a
    move-object/from16 v41, v4

    const/4 v4, 0x0

    .line 35
    :goto_24
    check-cast v11, LY/C0;

    .line 36
    invoke-interface {v6}, LY/m;->O()V

    goto :goto_25

    :cond_3b
    move-object/from16 v40, v0

    move-object/from16 v41, v4

    move-object v4, v11

    const v0, -0x24def58e

    .line 37
    invoke-interface {v6, v0}, LY/m;->V(I)V

    invoke-interface {v6}, LY/m;->O()V

    :goto_25
    if-eqz p3, :cond_3e

    const v0, -0x24dda945

    .line 38
    invoke-interface {v6, v0}, LY/m;->V(I)V

    .line 39
    invoke-interface {v6, v11}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    .line 40
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3c

    .line 41
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_3d

    .line 42
    :cond_3c
    new-instance v4, LK/d$i;

    invoke-direct {v4, v11}, LK/d$i;-><init>(LY/C0;)V

    .line 43
    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 44
    :cond_3d
    move-object v0, v4

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 45
    invoke-interface {v6}, LY/m;->O()V

    goto :goto_26

    :cond_3e
    const v0, -0x24dcb04e

    .line 46
    invoke-interface {v6, v0}, LY/m;->V(I)V

    invoke-interface {v6}, LY/m;->O()V

    move-object v0, v4

    :goto_26
    const v37, 0x1ffff

    const/16 v38, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    move-object/from16 v16, v7

    .line 47
    invoke-static/range {v16 .. v38}, Landroidx/compose/ui/graphics/f;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v20

    .line 48
    invoke-interface/range {v41 .. v41}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v21, v4

    check-cast v21, LU0/e;

    .line 49
    invoke-interface {v6, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit16 v7, v10, 0x380

    move-object/from16 v30, v0

    const/16 v0, 0x100

    if-ne v7, v0, :cond_3f

    const/4 v0, 0x1

    goto :goto_27

    :cond_3f
    const/4 v0, 0x0

    :goto_27
    or-int/2addr v0, v4

    .line 50
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_40

    .line 51
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_41

    .line 52
    :cond_40
    new-instance v4, LK/d$d;

    invoke-direct {v4, v12, v3}, LK/d$d;-><init>(LK/c0;Lkotlin/jvm/functions/Function1;)V

    .line 53
    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 54
    :cond_41
    move-object/from16 v23, v4

    check-cast v23, Lkotlin/jvm/functions/Function1;

    move/from16 v27, p9

    move-object/from16 v28, p10

    move-object/from16 v31, p11

    move-object/from16 v32, p12

    move-object/from16 v33, v5

    move/from16 v24, v8

    move/from16 v25, v9

    move/from16 v26, v13

    move-object/from16 v22, v14

    move-object/from16 v29, v39

    .line 55
    invoke-static/range {v20 .. v33}, LK/d;->j(Landroidx/compose/ui/e;LU0/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILY0/u$b;Ljava/util/List;Lkotlin/jvm/functions/Function1;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    move-result-object v0

    if-nez p3, :cond_44

    const v4, -0x24cc35a3

    .line 56
    invoke-interface {v6, v4}, LY/m;->V(I)V

    .line 57
    invoke-interface {v6, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v4

    .line 58
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_42

    .line 59
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_43

    .line 60
    :cond_42
    new-instance v5, LK/d$e;

    invoke-direct {v5, v12}, LK/d$e;-><init>(LK/c0;)V

    .line 61
    invoke-interface {v6, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 62
    :cond_43
    check-cast v5, Lie/a;

    .line 63
    new-instance v4, LK/z;

    invoke-direct {v4, v5}, LK/z;-><init>(Lie/a;)V

    .line 64
    invoke-interface {v6}, LY/m;->O()V

    :goto_28
    const/4 v5, 0x0

    goto :goto_29

    :cond_44
    const v4, -0x24c9c1c4

    .line 65
    invoke-interface {v6, v4}, LY/m;->V(I)V

    .line 66
    invoke-interface {v6, v12}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v4

    .line 67
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_45

    .line 68
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_46

    .line 69
    :cond_45
    new-instance v5, LK/d$f;

    invoke-direct {v5, v12}, LK/d$f;-><init>(LK/c0;)V

    .line 70
    invoke-interface {v6, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 71
    :cond_46
    check-cast v5, Lie/a;

    .line 72
    invoke-interface {v6, v11}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v4

    .line 73
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_47

    .line 74
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_48

    .line 75
    :cond_47
    new-instance v7, LK/d$g;

    invoke-direct {v7, v11}, LK/d$g;-><init>(LY/C0;)V

    .line 76
    invoke-interface {v6, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 77
    :cond_48
    check-cast v7, Lie/a;

    .line 78
    new-instance v4, LK/d0;

    invoke-direct {v4, v5, v7}, LK/d0;-><init>(Lie/a;Lie/a;)V

    .line 79
    invoke-interface {v6}, LY/m;->O()V

    goto :goto_28

    .line 80
    :goto_29
    invoke-static {v6, v5}, LY/h;->a(LY/m;I)I

    move-result v7

    .line 81
    invoke-interface {v6}, LY/m;->r()LY/I;

    move-result-object v5

    .line 82
    invoke-static {v6, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    .line 83
    sget-object v8, LK0/g;->M:LK0/g$a;

    invoke-virtual {v8}, LK0/g$a;->a()Lie/a;

    move-result-object v9

    .line 84
    invoke-interface {v6}, LY/m;->j()LY/d;

    move-result-object v11

    if-nez v11, :cond_49

    invoke-static {}, LY/h;->d()V

    .line 85
    :cond_49
    invoke-interface {v6}, LY/m;->I()V

    .line 86
    invoke-interface {v6}, LY/m;->e()Z

    move-result v11

    if-eqz v11, :cond_4a

    .line 87
    invoke-interface {v6, v9}, LY/m;->h(Lie/a;)V

    goto :goto_2a

    .line 88
    :cond_4a
    invoke-interface {v6}, LY/m;->s()V

    .line 89
    :goto_2a
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v9

    .line 90
    invoke-virtual {v8}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v9, v4, v11}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 91
    invoke-virtual {v8}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v5, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 92
    invoke-virtual {v8}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    .line 93
    invoke-interface {v9}, LY/m;->e()Z

    move-result v5

    if-nez v5, :cond_4b

    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4c

    .line 94
    :cond_4b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 95
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 96
    :cond_4c
    invoke-virtual {v8}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v0, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    if-nez v12, :cond_4d

    const v0, -0x1eb99bdb

    .line 97
    invoke-interface {v6, v0}, LY/m;->V(I)V

    invoke-interface {v6}, LY/m;->O()V

    goto :goto_2b

    :cond_4d
    const v0, 0x200a875c

    invoke-interface {v6, v0}, LY/m;->V(I)V

    const/4 v5, 0x0

    invoke-virtual {v12, v6, v5}, LK/c0;->b(LY/m;I)V

    invoke-interface {v6}, LY/m;->O()V

    sget-object v0, LTd/L;->a:LTd/L;

    :goto_2b
    if-nez v1, :cond_4e

    const v0, -0x1eb8d21d

    .line 98
    invoke-interface {v6, v0}, LY/m;->V(I)V

    :goto_2c
    invoke-interface {v6}, LY/m;->O()V

    goto :goto_2d

    :cond_4e
    const v0, -0x1eb8d21c

    invoke-interface {v6, v0}, LY/m;->V(I)V

    shr-int/lit8 v0, v10, 0x3

    and-int/lit8 v0, v0, 0xe

    .line 99
    invoke-static {v2, v1, v6, v0}, LK/b;->a(LU0/e;Ljava/util/List;LY/m;I)V

    .line 100
    sget-object v0, LTd/L;->a:LTd/L;

    goto :goto_2c

    .line 101
    :goto_2d
    invoke-interface {v6}, LY/m;->x()V

    .line 102
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_4f

    invoke-static {}, LY/w;->T()V

    :cond_4f
    move-object/from16 v5, v40

    .line 103
    :goto_2e
    invoke-interface {v6}, LY/m;->k()LY/B1;

    move-result-object v0

    if-eqz v0, :cond_50

    move-object v1, v0

    new-instance v0, LK/d$h;

    move/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v42, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v17}, LK/d$h;-><init>(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;III)V

    move-object/from16 v1, v42

    invoke-interface {v1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_50
    return-void
.end method

.method public static final synthetic f(LY/C0;LU0/e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LK/d;->d(LY/C0;LU0/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic g(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;LY/m;III)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p17}, LK/d;->e(Landroidx/compose/ui/e;LU0/e;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;LU0/Y0;IZIILY0/u$b;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;LY/m;III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h(Ljava/util/List;Lie/a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LK/d;->i(Ljava/util/List;Lie/a;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final i(Ljava/util/List;Lie/a;)Ljava/util/List;
    .locals 10

    .line 1
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    new-instance p1, LK/g0;

    .line 14
    .line 15
    invoke-direct {p1}, LK/g0;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    :goto_0
    if-ge v2, v1, :cond_0

    .line 33
    .line 34
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, LI0/A;

    .line 39
    .line 40
    invoke-interface {v3}, LI0/l;->j()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier"

    .line 45
    .line 46
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    check-cast v4, LK/h0;

    .line 50
    .line 51
    invoke-virtual {v4}, LK/h0;->a()LK/i0;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v4, p1}, LK/i0;->a(LK/g0;)LK/f0;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v5, Li1/b;->b:Li1/b$a;

    .line 60
    .line 61
    invoke-virtual {v4}, LK/f0;->c()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    invoke-virtual {v4}, LK/f0;->c()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-virtual {v4}, LK/f0;->a()I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    invoke-virtual {v4}, LK/f0;->a()I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    invoke-virtual {v5, v6, v7, v8, v9}, Li1/b$a;->b(IIII)J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    invoke-interface {v3, v5, v6}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v5, Lkotlin/Pair;

    .line 86
    .line 87
    invoke-virtual {v4}, LK/f0;->b()Lie/a;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-direct {v5, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    return-object v0

    .line 101
    :cond_1
    const/4 p0, 0x0

    .line 102
    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/e;LU0/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILY0/u$b;Ljava/util/List;Lkotlin/jvm/functions/Function1;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;
    .locals 15

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;

    .line 2
    .line 3
    const/4 v11, 0x0

    .line 4
    const/4 v14, 0x0

    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-object/from16 v4, p3

    .line 10
    .line 11
    move/from16 v5, p4

    .line 12
    .line 13
    move/from16 v6, p5

    .line 14
    .line 15
    move/from16 v7, p6

    .line 16
    .line 17
    move/from16 v8, p7

    .line 18
    .line 19
    move-object/from16 v3, p8

    .line 20
    .line 21
    move-object/from16 v9, p9

    .line 22
    .line 23
    move-object/from16 v10, p10

    .line 24
    .line 25
    move-object/from16 v12, p12

    .line 26
    .line 27
    move-object/from16 v13, p13

    .line 28
    .line 29
    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;-><init>(LU0/e;LU0/Y0;LY0/u$b;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;LP/g;Ls0/t0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    .line 32
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 33
    .line 34
    invoke-interface {p0, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
