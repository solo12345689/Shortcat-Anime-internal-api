.class public abstract LC/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(LC/D;IIIIILandroidx/compose/ui/layout/l;Ljava/util/List;[Landroidx/compose/ui/layout/s;II[II)LI0/C;
    .locals 55

    .line 1
    move/from16 v8, p1

    .line 2
    .line 3
    move/from16 v9, p3

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    move/from16 v10, p5

    .line 8
    .line 9
    move-object/from16 v11, p7

    .line 10
    .line 11
    move/from16 v12, p10

    .line 12
    .line 13
    int-to-long v13, v10

    .line 14
    sub-int v15, v12, p9

    .line 15
    .line 16
    new-array v0, v15, [I

    .line 17
    .line 18
    const/16 v16, 0x0

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    move/from16 v2, p9

    .line 22
    .line 23
    move v3, v1

    .line 24
    move v6, v3

    .line 25
    move v7, v6

    .line 26
    move/from16 v17, v7

    .line 27
    .line 28
    move/from16 v18, v17

    .line 29
    .line 30
    move/from16 v19, v16

    .line 31
    .line 32
    :goto_0
    const v5, 0x7fffffff

    .line 33
    .line 34
    .line 35
    if-ge v2, v12, :cond_7

    .line 36
    .line 37
    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v20

    .line 41
    move/from16 v21, v2

    .line 42
    .line 43
    move-object/from16 v2, v20

    .line 44
    .line 45
    check-cast v2, LI0/A;

    .line 46
    .line 47
    invoke-static {v2}, LC/C;->c(LI0/l;)LC/F;

    .line 48
    .line 49
    .line 50
    move-result-object v20

    .line 51
    invoke-static/range {v20 .. v20}, LC/C;->e(LC/F;)F

    .line 52
    .line 53
    .line 54
    move-result v22

    .line 55
    if-nez v6, :cond_1

    .line 56
    .line 57
    invoke-static/range {v20 .. v20}, LC/C;->f(LC/F;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    move/from16 v23, v1

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_1
    :goto_1
    const/4 v6, 0x1

    .line 68
    move/from16 v23, v6

    .line 69
    .line 70
    :goto_2
    cmpl-float v6, v22, v16

    .line 71
    .line 72
    if-lez v6, :cond_2

    .line 73
    .line 74
    add-float v5, v19, v22

    .line 75
    .line 76
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    move/from16 v19, v5

    .line 79
    .line 80
    move/from16 v26, v15

    .line 81
    .line 82
    move/from16 v1, v17

    .line 83
    .line 84
    move-object/from16 v17, v0

    .line 85
    .line 86
    move-object/from16 v0, p0

    .line 87
    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_2
    if-ne v4, v5, :cond_3

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    if-eqz v20, :cond_4

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v20}, LC/F;->c()LC/q;

    .line 96
    .line 97
    .line 98
    :cond_4
    :goto_3
    sub-int v6, v9, v17

    .line 99
    .line 100
    aget-object v7, p8, v21

    .line 101
    .line 102
    if-nez v7, :cond_6

    .line 103
    .line 104
    if-ne v9, v5, :cond_5

    .line 105
    .line 106
    :goto_4
    move v7, v6

    .line 107
    goto :goto_5

    .line 108
    :cond_5
    invoke-static {v6, v1}, Loe/j;->e(II)I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    goto :goto_4

    .line 113
    :goto_5
    const/16 v6, 0x10

    .line 114
    .line 115
    move/from16 v20, v7

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    move/from16 v22, v1

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    move-object/from16 v24, v2

    .line 122
    .line 123
    const/4 v2, 0x0

    .line 124
    move/from16 v25, v3

    .line 125
    .line 126
    move v3, v5

    .line 127
    const/4 v5, 0x0

    .line 128
    move/from16 v26, v15

    .line 129
    .line 130
    move/from16 v27, v17

    .line 131
    .line 132
    move/from16 v28, v19

    .line 133
    .line 134
    move-object/from16 v15, v24

    .line 135
    .line 136
    move-object/from16 v17, v0

    .line 137
    .line 138
    move-object/from16 v0, p0

    .line 139
    .line 140
    invoke-static/range {v0 .. v7}, LC/D;->e(LC/D;IIIIZILjava/lang/Object;)J

    .line 141
    .line 142
    .line 143
    move-result-wide v1

    .line 144
    invoke-interface {v15, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    goto :goto_6

    .line 149
    :cond_6
    move/from16 v25, v3

    .line 150
    .line 151
    move/from16 v20, v6

    .line 152
    .line 153
    move/from16 v26, v15

    .line 154
    .line 155
    move/from16 v27, v17

    .line 156
    .line 157
    move/from16 v28, v19

    .line 158
    .line 159
    move-object/from16 v17, v0

    .line 160
    .line 161
    move-object/from16 v0, p0

    .line 162
    .line 163
    :goto_6
    invoke-interface {v0, v7}, LC/D;->d(Landroidx/compose/ui/layout/s;)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-interface {v0, v7}, LC/D;->f(Landroidx/compose/ui/layout/s;)I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    sub-int v3, v21, p9

    .line 172
    .line 173
    aput v1, v17, v3

    .line 174
    .line 175
    sub-int v6, v20, v1

    .line 176
    .line 177
    const/4 v3, 0x0

    .line 178
    invoke-static {v6, v3}, Loe/j;->e(II)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    add-int/2addr v1, v3

    .line 187
    move/from16 v15, v27

    .line 188
    .line 189
    add-int/2addr v1, v15

    .line 190
    move/from16 v5, v18

    .line 191
    .line 192
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    aput-object v7, p8, v21

    .line 197
    .line 198
    move/from16 v18, v2

    .line 199
    .line 200
    move v7, v3

    .line 201
    move/from16 v3, v25

    .line 202
    .line 203
    move/from16 v19, v28

    .line 204
    .line 205
    :goto_7
    add-int/lit8 v2, v21, 0x1

    .line 206
    .line 207
    move/from16 v4, p4

    .line 208
    .line 209
    move-object/from16 v0, v17

    .line 210
    .line 211
    move/from16 v6, v23

    .line 212
    .line 213
    move/from16 v15, v26

    .line 214
    .line 215
    move/from16 v17, v1

    .line 216
    .line 217
    const/4 v1, 0x0

    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_7
    move/from16 v25, v3

    .line 221
    .line 222
    move/from16 v26, v15

    .line 223
    .line 224
    move/from16 v15, v17

    .line 225
    .line 226
    move/from16 v1, v18

    .line 227
    .line 228
    move/from16 v28, v19

    .line 229
    .line 230
    move-object/from16 v17, v0

    .line 231
    .line 232
    move-object/from16 v0, p0

    .line 233
    .line 234
    if-nez v25, :cond_8

    .line 235
    .line 236
    sub-int v5, v15, v7

    .line 237
    .line 238
    move v4, v1

    .line 239
    move/from16 v18, v6

    .line 240
    .line 241
    const/4 v1, 0x0

    .line 242
    const/4 v2, 0x0

    .line 243
    goto/16 :goto_11

    .line 244
    .line 245
    :cond_8
    if-eq v9, v5, :cond_9

    .line 246
    .line 247
    move v7, v9

    .line 248
    goto :goto_8

    .line 249
    :cond_9
    move v7, v8

    .line 250
    :goto_8
    add-int/lit8 v3, v25, -0x1

    .line 251
    .line 252
    int-to-long v2, v3

    .line 253
    mul-long/2addr v2, v13

    .line 254
    sub-int v10, v7, v15

    .line 255
    .line 256
    move/from16 v18, v6

    .line 257
    .line 258
    int-to-long v5, v10

    .line 259
    sub-long/2addr v5, v2

    .line 260
    move v10, v1

    .line 261
    const-wide/16 v0, 0x0

    .line 262
    .line 263
    invoke-static {v5, v6, v0, v1}, Loe/j;->f(JJ)J

    .line 264
    .line 265
    .line 266
    move-result-wide v5

    .line 267
    long-to-float v0, v5

    .line 268
    move/from16 v20, v10

    .line 269
    .line 270
    move/from16 v1, v28

    .line 271
    .line 272
    div-float v10, v0, v1

    .line 273
    .line 274
    move/from16 v0, p9

    .line 275
    .line 276
    move-wide/from16 v23, v5

    .line 277
    .line 278
    :goto_9
    const-string v4, "weightedSize "

    .line 279
    .line 280
    move-object/from16 v21, v4

    .line 281
    .line 282
    const-string v4, "weightUnitSpace "

    .line 283
    .line 284
    move/from16 v27, v10

    .line 285
    .line 286
    const-string v10, "totalWeight "

    .line 287
    .line 288
    move-object/from16 v28, v4

    .line 289
    .line 290
    const-string v4, "remainingToTarget "

    .line 291
    .line 292
    move/from16 v29, v1

    .line 293
    .line 294
    const-string v1, "arrangementSpacingTotal "

    .line 295
    .line 296
    move-object/from16 v30, v10

    .line 297
    .line 298
    const-string v10, "fixedSpace "

    .line 299
    .line 300
    move-wide/from16 v31, v5

    .line 301
    .line 302
    const-string v5, "weightChildrenCount "

    .line 303
    .line 304
    const-string v6, "arrangementSpacingPx "

    .line 305
    .line 306
    move-object/from16 v33, v4

    .line 307
    .line 308
    const-string v4, "targetSpace "

    .line 309
    .line 310
    move-wide/from16 v34, v2

    .line 311
    .line 312
    const-string v2, "mainAxisMin "

    .line 313
    .line 314
    if-ge v0, v12, :cond_a

    .line 315
    .line 316
    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    check-cast v3, LI0/A;

    .line 321
    .line 322
    invoke-static {v3}, LC/C;->c(LI0/l;)LC/F;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-static {v3}, LC/C;->e(LC/F;)F

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    mul-float v11, v27, v3

    .line 331
    .line 332
    :try_start_0
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 333
    .line 334
    .line 335
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    int-to-long v1, v1

    .line 337
    sub-long v23, v23, v1

    .line 338
    .line 339
    add-int/lit8 v0, v0, 0x1

    .line 340
    .line 341
    move-object/from16 v11, p7

    .line 342
    .line 343
    move/from16 v10, v27

    .line 344
    .line 345
    move/from16 v1, v29

    .line 346
    .line 347
    move-wide/from16 v5, v31

    .line 348
    .line 349
    move-wide/from16 v2, v34

    .line 350
    .line 351
    goto :goto_9

    .line 352
    :catch_0
    move-exception v0

    .line 353
    new-instance v12, Ljava/lang/IllegalArgumentException;

    .line 354
    .line 355
    move-object/from16 v16, v0

    .line 356
    .line 357
    new-instance v0, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    move-object/from16 p0, v12

    .line 363
    .line 364
    const-string v12, "This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax "

    .line 365
    .line 366
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    move/from16 v2, v25

    .line 394
    .line 395
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    move-wide/from16 v1, v34

    .line 408
    .line 409
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    move-object/from16 v1, v33

    .line 413
    .line 414
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    move-wide/from16 v1, v31

    .line 418
    .line 419
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    move-object/from16 v1, v30

    .line 423
    .line 424
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    move/from16 v1, v29

    .line 428
    .line 429
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    move-object/from16 v1, v28

    .line 433
    .line 434
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    move/from16 v1, v27

    .line 438
    .line 439
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    const-string v1, "itemWeight "

    .line 443
    .line 444
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    move-object/from16 v3, v21

    .line 451
    .line 452
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    move-object/from16 v1, p0

    .line 463
    .line 464
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    move-object/from16 v0, v16

    .line 468
    .line 469
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    throw v0

    .line 474
    :cond_a
    move-object/from16 v3, v21

    .line 475
    .line 476
    move/from16 v11, v25

    .line 477
    .line 478
    move-object/from16 v25, v28

    .line 479
    .line 480
    move/from16 v28, v29

    .line 481
    .line 482
    move-object/from16 v36, v30

    .line 483
    .line 484
    move-object/from16 v21, v2

    .line 485
    .line 486
    move/from16 v2, p9

    .line 487
    .line 488
    move/from16 v37, v20

    .line 489
    .line 490
    const/4 v0, 0x0

    .line 491
    :goto_a
    if-ge v2, v12, :cond_11

    .line 492
    .line 493
    aget-object v20, p8, v2

    .line 494
    .line 495
    if-nez v20, :cond_10

    .line 496
    .line 497
    move-object/from16 v20, v5

    .line 498
    .line 499
    move-object/from16 v5, p7

    .line 500
    .line 501
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v29

    .line 505
    move/from16 v30, v2

    .line 506
    .line 507
    move-object/from16 v2, v29

    .line 508
    .line 509
    check-cast v2, LI0/A;

    .line 510
    .line 511
    invoke-static {v2}, LC/C;->c(LI0/l;)LC/F;

    .line 512
    .line 513
    .line 514
    move-result-object v29

    .line 515
    move-object/from16 v38, v2

    .line 516
    .line 517
    invoke-static/range {v29 .. v29}, LC/C;->e(LC/F;)F

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    move/from16 v39, v0

    .line 522
    .line 523
    move-object/from16 v40, v1

    .line 524
    .line 525
    const v1, 0x7fffffff

    .line 526
    .line 527
    .line 528
    move/from16 v0, p4

    .line 529
    .line 530
    if-ne v0, v1, :cond_b

    .line 531
    .line 532
    goto :goto_b

    .line 533
    :cond_b
    if-eqz v29, :cond_c

    .line 534
    .line 535
    invoke-virtual/range {v29 .. v29}, LC/F;->c()LC/q;

    .line 536
    .line 537
    .line 538
    :cond_c
    :goto_b
    cmpl-float v1, v2, v16

    .line 539
    .line 540
    if-lez v1, :cond_f

    .line 541
    .line 542
    invoke-static/range {v23 .. v24}, Lke/a;->b(J)I

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    move/from16 v42, v2

    .line 547
    .line 548
    move-object/from16 v41, v3

    .line 549
    .line 550
    int-to-long v2, v1

    .line 551
    sub-long v23, v23, v2

    .line 552
    .line 553
    mul-float v2, v27, v42

    .line 554
    .line 555
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    add-int/2addr v3, v1

    .line 560
    const/4 v0, 0x0

    .line 561
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    :try_start_1
    invoke-static/range {v29 .. v29}, LC/C;->b(LC/F;)Z

    .line 566
    .line 567
    .line 568
    move-result v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    .line 569
    if-eqz v0, :cond_d

    .line 570
    .line 571
    const v0, 0x7fffffff

    .line 572
    .line 573
    .line 574
    if-eq v3, v0, :cond_e

    .line 575
    .line 576
    move/from16 v19, v1

    .line 577
    .line 578
    move v1, v3

    .line 579
    :goto_c
    move/from16 v29, v2

    .line 580
    .line 581
    goto :goto_d

    .line 582
    :cond_d
    const v0, 0x7fffffff

    .line 583
    .line 584
    .line 585
    :cond_e
    move/from16 v19, v1

    .line 586
    .line 587
    const/4 v1, 0x0

    .line 588
    goto :goto_c

    .line 589
    :goto_d
    const/4 v2, 0x0

    .line 590
    const/4 v5, 0x1

    .line 591
    move/from16 v49, v19

    .line 592
    .line 593
    move-object/from16 v52, v25

    .line 594
    .line 595
    move/from16 v47, v27

    .line 596
    .line 597
    move/from16 v50, v29

    .line 598
    .line 599
    move-wide/from16 v45, v31

    .line 600
    .line 601
    move-object/from16 v53, v33

    .line 602
    .line 603
    move-wide/from16 v43, v34

    .line 604
    .line 605
    move-object/from16 v12, v38

    .line 606
    .line 607
    move-object/from16 v54, v40

    .line 608
    .line 609
    move-object/from16 v51, v41

    .line 610
    .line 611
    move/from16 v48, v42

    .line 612
    .line 613
    move-object/from16 v19, v10

    .line 614
    .line 615
    move/from16 v25, v11

    .line 616
    .line 617
    move/from16 v27, v15

    .line 618
    .line 619
    move-object/from16 v15, v20

    .line 620
    .line 621
    move-object/from16 v11, v21

    .line 622
    .line 623
    move/from16 v20, v0

    .line 624
    .line 625
    move-object v10, v4

    .line 626
    move-object/from16 v0, p0

    .line 627
    .line 628
    move/from16 v4, p4

    .line 629
    .line 630
    :try_start_2
    invoke-interface/range {v0 .. v5}, LC/D;->a(IIIIZ)J

    .line 631
    .line 632
    .line 633
    move-result-wide v1
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 634
    invoke-interface {v12, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    invoke-interface {v0, v1}, LC/D;->d(Landroidx/compose/ui/layout/s;)I

    .line 639
    .line 640
    .line 641
    move-result v2

    .line 642
    invoke-interface {v0, v1}, LC/D;->f(Landroidx/compose/ui/layout/s;)I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    sub-int v4, v30, p9

    .line 647
    .line 648
    aput v2, v17, v4

    .line 649
    .line 650
    add-int v2, v39, v2

    .line 651
    .line 652
    move/from16 v4, v37

    .line 653
    .line 654
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 655
    .line 656
    .line 657
    move-result v3

    .line 658
    aput-object v1, p8, v30

    .line 659
    .line 660
    move/from16 v39, v2

    .line 661
    .line 662
    move/from16 v37, v3

    .line 663
    .line 664
    move-object/from16 v12, v19

    .line 665
    .line 666
    move/from16 v5, v25

    .line 667
    .line 668
    move-wide/from16 v34, v43

    .line 669
    .line 670
    move-wide/from16 v31, v45

    .line 671
    .line 672
    move-object/from16 v3, v51

    .line 673
    .line 674
    move-object/from16 v33, v53

    .line 675
    .line 676
    :goto_e
    const/4 v1, 0x0

    .line 677
    goto/16 :goto_10

    .line 678
    .line 679
    :catch_1
    move-exception v0

    .line 680
    goto :goto_f

    .line 681
    :catch_2
    move-exception v0

    .line 682
    move/from16 v49, v1

    .line 683
    .line 684
    move/from16 v50, v2

    .line 685
    .line 686
    move-object/from16 v19, v10

    .line 687
    .line 688
    move-object/from16 v52, v25

    .line 689
    .line 690
    move/from16 v47, v27

    .line 691
    .line 692
    move-wide/from16 v45, v31

    .line 693
    .line 694
    move-object/from16 v53, v33

    .line 695
    .line 696
    move-wide/from16 v43, v34

    .line 697
    .line 698
    move-object/from16 v54, v40

    .line 699
    .line 700
    move-object/from16 v51, v41

    .line 701
    .line 702
    move/from16 v48, v42

    .line 703
    .line 704
    move-object v10, v4

    .line 705
    move/from16 v25, v11

    .line 706
    .line 707
    move/from16 v27, v15

    .line 708
    .line 709
    move-object/from16 v15, v20

    .line 710
    .line 711
    move-object/from16 v11, v21

    .line 712
    .line 713
    :goto_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 714
    .line 715
    new-instance v2, Ljava/lang/StringBuilder;

    .line 716
    .line 717
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 718
    .line 719
    .line 720
    const-string v4, "This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax "

    .line 721
    .line 722
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    move/from16 v5, v25

    .line 750
    .line 751
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    move-object/from16 v12, v19

    .line 755
    .line 756
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    move/from16 v4, v27

    .line 760
    .line 761
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    move-object/from16 v4, v54

    .line 765
    .line 766
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    move-wide/from16 v4, v43

    .line 770
    .line 771
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    move-object/from16 v4, v53

    .line 775
    .line 776
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    move-wide/from16 v4, v45

    .line 780
    .line 781
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    move-object/from16 v4, v36

    .line 785
    .line 786
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    move/from16 v4, v28

    .line 790
    .line 791
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    move-object/from16 v4, v52

    .line 795
    .line 796
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    move/from16 v4, v47

    .line 800
    .line 801
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    const-string v4, "weight "

    .line 805
    .line 806
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    move/from16 v4, v48

    .line 810
    .line 811
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    move-object/from16 v4, v51

    .line 815
    .line 816
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    move/from16 v10, v50

    .line 820
    .line 821
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    const-string v4, "crossAxisDesiredSize "

    .line 825
    .line 826
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 827
    .line 828
    .line 829
    const/4 v4, 0x0

    .line 830
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 831
    .line 832
    .line 833
    const-string v4, "remainderUnit "

    .line 834
    .line 835
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    move/from16 v4, v49

    .line 839
    .line 840
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    const-string v4, "childMainAxisSize "

    .line 844
    .line 845
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    throw v0

    .line 863
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 864
    .line 865
    const-string v1, "All weights <= 0 should have placeables"

    .line 866
    .line 867
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    throw v0

    .line 871
    :cond_10
    move/from16 v39, v0

    .line 872
    .line 873
    move-object/from16 v54, v1

    .line 874
    .line 875
    move/from16 v30, v2

    .line 876
    .line 877
    move-object v12, v10

    .line 878
    move-object/from16 v52, v25

    .line 879
    .line 880
    move/from16 v47, v27

    .line 881
    .line 882
    const v20, 0x7fffffff

    .line 883
    .line 884
    .line 885
    move-object/from16 v0, p0

    .line 886
    .line 887
    move-object v10, v4

    .line 888
    move/from16 v27, v15

    .line 889
    .line 890
    move/from16 v4, v37

    .line 891
    .line 892
    move-object v15, v5

    .line 893
    move v5, v11

    .line 894
    move-object/from16 v11, v21

    .line 895
    .line 896
    goto/16 :goto_e

    .line 897
    .line 898
    :goto_10
    add-int/lit8 v2, v30, 0x1

    .line 899
    .line 900
    move-object v4, v10

    .line 901
    move-object/from16 v21, v11

    .line 902
    .line 903
    move-object v10, v12

    .line 904
    move/from16 v0, v39

    .line 905
    .line 906
    move-object/from16 v25, v52

    .line 907
    .line 908
    move-object/from16 v1, v54

    .line 909
    .line 910
    move/from16 v12, p10

    .line 911
    .line 912
    move v11, v5

    .line 913
    move-object v5, v15

    .line 914
    move/from16 v15, v27

    .line 915
    .line 916
    move/from16 v27, v47

    .line 917
    .line 918
    goto/16 :goto_a

    .line 919
    .line 920
    :cond_11
    const/4 v1, 0x0

    .line 921
    move v2, v0

    .line 922
    move/from16 v27, v15

    .line 923
    .line 924
    move/from16 v4, v37

    .line 925
    .line 926
    move-object/from16 v0, p0

    .line 927
    .line 928
    int-to-long v2, v2

    .line 929
    add-long v2, v2, v34

    .line 930
    .line 931
    long-to-int v2, v2

    .line 932
    sub-int v3, v9, v27

    .line 933
    .line 934
    const/4 v5, 0x0

    .line 935
    invoke-static {v2, v5, v3}, Loe/j;->m(III)I

    .line 936
    .line 937
    .line 938
    move-result v2

    .line 939
    move/from16 v5, v27

    .line 940
    .line 941
    :goto_11
    if-eqz v18, :cond_17

    .line 942
    .line 943
    move/from16 v7, p9

    .line 944
    .line 945
    move/from16 v10, p10

    .line 946
    .line 947
    const/4 v3, 0x0

    .line 948
    const/4 v6, 0x0

    .line 949
    :goto_12
    if-ge v7, v10, :cond_16

    .line 950
    .line 951
    aget-object v9, p8, v7

    .line 952
    .line 953
    invoke-static {v9}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 954
    .line 955
    .line 956
    invoke-static {v9}, LC/C;->d(Landroidx/compose/ui/layout/s;)LC/F;

    .line 957
    .line 958
    .line 959
    move-result-object v11

    .line 960
    invoke-static {v11}, LC/C;->a(LC/F;)LC/l;

    .line 961
    .line 962
    .line 963
    move-result-object v11

    .line 964
    if-eqz v11, :cond_12

    .line 965
    .line 966
    invoke-virtual {v11, v9}, LC/l;->b(Landroidx/compose/ui/layout/s;)Ljava/lang/Integer;

    .line 967
    .line 968
    .line 969
    move-result-object v11

    .line 970
    goto :goto_13

    .line 971
    :cond_12
    move-object v11, v1

    .line 972
    :goto_13
    if-eqz v11, :cond_15

    .line 973
    .line 974
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 975
    .line 976
    .line 977
    move-result v12

    .line 978
    invoke-interface {v0, v9}, LC/D;->f(Landroidx/compose/ui/layout/s;)I

    .line 979
    .line 980
    .line 981
    move-result v9

    .line 982
    const/high16 v13, -0x80000000

    .line 983
    .line 984
    if-eq v12, v13, :cond_13

    .line 985
    .line 986
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 987
    .line 988
    .line 989
    move-result v11

    .line 990
    goto :goto_14

    .line 991
    :cond_13
    const/4 v11, 0x0

    .line 992
    :goto_14
    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    .line 993
    .line 994
    .line 995
    move-result v3

    .line 996
    if-eq v12, v13, :cond_14

    .line 997
    .line 998
    goto :goto_15

    .line 999
    :cond_14
    move v12, v9

    .line 1000
    :goto_15
    sub-int/2addr v9, v12

    .line 1001
    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    .line 1002
    .line 1003
    .line 1004
    move-result v6

    .line 1005
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 1006
    .line 1007
    goto :goto_12

    .line 1008
    :cond_16
    move v1, v6

    .line 1009
    goto :goto_16

    .line 1010
    :cond_17
    move/from16 v10, p10

    .line 1011
    .line 1012
    const/4 v1, 0x0

    .line 1013
    const/4 v3, 0x0

    .line 1014
    :goto_16
    add-int/2addr v5, v2

    .line 1015
    const/4 v2, 0x0

    .line 1016
    invoke-static {v5, v2}, Loe/j;->e(II)I

    .line 1017
    .line 1018
    .line 1019
    move-result v5

    .line 1020
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 1021
    .line 1022
    .line 1023
    move-result v5

    .line 1024
    add-int/2addr v1, v3

    .line 1025
    move/from16 v6, p2

    .line 1026
    .line 1027
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    .line 1028
    .line 1029
    .line 1030
    move-result v1

    .line 1031
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 1032
    .line 1033
    .line 1034
    move-result v6

    .line 1035
    move/from16 v1, v26

    .line 1036
    .line 1037
    new-array v4, v1, [I

    .line 1038
    .line 1039
    move v7, v2

    .line 1040
    :goto_17
    if-ge v7, v1, :cond_18

    .line 1041
    .line 1042
    aput v2, v4, v7

    .line 1043
    .line 1044
    add-int/lit8 v7, v7, 0x1

    .line 1045
    .line 1046
    goto :goto_17

    .line 1047
    :cond_18
    move-object/from16 v7, p6

    .line 1048
    .line 1049
    move-object/from16 v8, v17

    .line 1050
    .line 1051
    invoke-interface {v0, v5, v8, v4, v7}, LC/D;->b(I[I[ILandroidx/compose/ui/layout/l;)V

    .line 1052
    .line 1053
    .line 1054
    move-object/from16 v1, p8

    .line 1055
    .line 1056
    move/from16 v9, p9

    .line 1057
    .line 1058
    move/from16 v8, p12

    .line 1059
    .line 1060
    move-object v2, v7

    .line 1061
    move-object/from16 v7, p11

    .line 1062
    .line 1063
    invoke-interface/range {v0 .. v10}, LC/D;->c([Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;I[III[IIII)LI0/C;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    return-object v0
.end method

.method public static synthetic b(LC/D;IIIIILandroidx/compose/ui/layout/l;Ljava/util/List;[Landroidx/compose/ui/layout/s;II[IIILjava/lang/Object;)LI0/C;
    .locals 15

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    and-int/lit16 v1, v0, 0x400

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move-object v13, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v13, p11

    .line 11
    .line 12
    :goto_0
    and-int/lit16 v0, v0, 0x800

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    move v14, v0

    .line 18
    :goto_1
    move-object v2, p0

    .line 19
    move/from16 v3, p1

    .line 20
    .line 21
    move/from16 v4, p2

    .line 22
    .line 23
    move/from16 v5, p3

    .line 24
    .line 25
    move/from16 v6, p4

    .line 26
    .line 27
    move/from16 v7, p5

    .line 28
    .line 29
    move-object/from16 v8, p6

    .line 30
    .line 31
    move-object/from16 v9, p7

    .line 32
    .line 33
    move-object/from16 v10, p8

    .line 34
    .line 35
    move/from16 v11, p9

    .line 36
    .line 37
    move/from16 v12, p10

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move/from16 v14, p12

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :goto_2
    invoke-static/range {v2 .. v14}, LC/E;->a(LC/D;IIIIILandroidx/compose/ui/layout/l;Ljava/util/List;[Landroidx/compose/ui/layout/s;II[II)LI0/C;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
