.class public abstract Lv/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function2;Lv/t;Lie/o;LY/m;II)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move-object/from16 v8, p5

    .line 8
    .line 9
    move-object/from16 v1, p6

    .line 10
    .line 11
    move-object/from16 v9, p7

    .line 12
    .line 13
    move/from16 v10, p9

    .line 14
    .line 15
    move/from16 v11, p10

    .line 16
    .line 17
    const v2, -0x352a56be    # -7001249.0f

    .line 18
    .line 19
    .line 20
    move-object/from16 v3, p8

    .line 21
    .line 22
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    and-int/lit8 v3, v11, 0x1

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    or-int/lit8 v3, v10, 0x6

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    and-int/lit8 v3, v10, 0x6

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    invoke-interface {v4, v0}, LY/m;->U(Ljava/lang/Object;)Z

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
    or-int/2addr v3, v10

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v3, v10

    .line 49
    :goto_1
    and-int/lit8 v5, v11, 0x2

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
    and-int/lit8 v5, v10, 0x30

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    invoke-interface {v4, v6}, LY/m;->F(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v11, 0x4

    .line 73
    .line 74
    if-eqz v5, :cond_6

    .line 75
    .line 76
    or-int/lit16 v3, v3, 0x180

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_6
    and-int/lit16 v5, v10, 0x180

    .line 80
    .line 81
    if-nez v5, :cond_8

    .line 82
    .line 83
    invoke-interface {v4, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    const/16 v5, 0x100

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    const/16 v5, 0x80

    .line 93
    .line 94
    :goto_4
    or-int/2addr v3, v5

    .line 95
    :cond_8
    :goto_5
    and-int/lit8 v5, v11, 0x8

    .line 96
    .line 97
    if-eqz v5, :cond_9

    .line 98
    .line 99
    or-int/lit16 v3, v3, 0xc00

    .line 100
    .line 101
    move-object/from16 v13, p3

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_9
    and-int/lit16 v5, v10, 0xc00

    .line 105
    .line 106
    move-object/from16 v13, p3

    .line 107
    .line 108
    if-nez v5, :cond_b

    .line 109
    .line 110
    invoke-interface {v4, v13}, LY/m;->U(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_a

    .line 115
    .line 116
    const/16 v5, 0x800

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_a
    const/16 v5, 0x400

    .line 120
    .line 121
    :goto_6
    or-int/2addr v3, v5

    .line 122
    :cond_b
    :goto_7
    and-int/lit8 v5, v11, 0x10

    .line 123
    .line 124
    if-eqz v5, :cond_c

    .line 125
    .line 126
    or-int/lit16 v3, v3, 0x6000

    .line 127
    .line 128
    move-object/from16 v14, p4

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_c
    and-int/lit16 v5, v10, 0x6000

    .line 132
    .line 133
    move-object/from16 v14, p4

    .line 134
    .line 135
    if-nez v5, :cond_e

    .line 136
    .line 137
    invoke-interface {v4, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_d

    .line 142
    .line 143
    const/16 v5, 0x4000

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_d
    const/16 v5, 0x2000

    .line 147
    .line 148
    :goto_8
    or-int/2addr v3, v5

    .line 149
    :cond_e
    :goto_9
    and-int/lit8 v5, v11, 0x20

    .line 150
    .line 151
    const/high16 v15, 0x30000

    .line 152
    .line 153
    if-eqz v5, :cond_f

    .line 154
    .line 155
    or-int/2addr v3, v15

    .line 156
    goto :goto_b

    .line 157
    :cond_f
    and-int v5, v10, v15

    .line 158
    .line 159
    if-nez v5, :cond_11

    .line 160
    .line 161
    invoke-interface {v4, v8}, LY/m;->F(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_10

    .line 166
    .line 167
    const/high16 v5, 0x20000

    .line 168
    .line 169
    goto :goto_a

    .line 170
    :cond_10
    const/high16 v5, 0x10000

    .line 171
    .line 172
    :goto_a
    or-int/2addr v3, v5

    .line 173
    :cond_11
    :goto_b
    and-int/lit8 v5, v11, 0x40

    .line 174
    .line 175
    const/high16 v20, 0x200000

    .line 176
    .line 177
    const/high16 v16, 0x180000

    .line 178
    .line 179
    if-eqz v5, :cond_12

    .line 180
    .line 181
    :goto_c
    or-int v3, v3, v16

    .line 182
    .line 183
    goto :goto_e

    .line 184
    :cond_12
    and-int v16, v10, v16

    .line 185
    .line 186
    if-nez v16, :cond_15

    .line 187
    .line 188
    and-int v16, v10, v20

    .line 189
    .line 190
    if-nez v16, :cond_13

    .line 191
    .line 192
    invoke-interface {v4, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v16

    .line 196
    goto :goto_d

    .line 197
    :cond_13
    invoke-interface {v4, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v16

    .line 201
    :goto_d
    if-eqz v16, :cond_14

    .line 202
    .line 203
    const/high16 v16, 0x100000

    .line 204
    .line 205
    goto :goto_c

    .line 206
    :cond_14
    const/high16 v16, 0x80000

    .line 207
    .line 208
    goto :goto_c

    .line 209
    :cond_15
    :goto_e
    and-int/lit16 v15, v11, 0x80

    .line 210
    .line 211
    const/high16 v16, 0xc00000

    .line 212
    .line 213
    if-eqz v15, :cond_17

    .line 214
    .line 215
    or-int v3, v3, v16

    .line 216
    .line 217
    :cond_16
    :goto_f
    move v15, v3

    .line 218
    goto :goto_11

    .line 219
    :cond_17
    and-int v15, v10, v16

    .line 220
    .line 221
    if-nez v15, :cond_16

    .line 222
    .line 223
    invoke-interface {v4, v9}, LY/m;->F(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    if-eqz v15, :cond_18

    .line 228
    .line 229
    const/high16 v15, 0x800000

    .line 230
    .line 231
    goto :goto_10

    .line 232
    :cond_18
    const/high16 v15, 0x400000

    .line 233
    .line 234
    :goto_10
    or-int/2addr v3, v15

    .line 235
    goto :goto_f

    .line 236
    :goto_11
    const v3, 0x492493

    .line 237
    .line 238
    .line 239
    and-int/2addr v3, v15

    .line 240
    const v12, 0x492492

    .line 241
    .line 242
    .line 243
    if-ne v3, v12, :cond_1a

    .line 244
    .line 245
    invoke-interface {v4}, LY/m;->i()Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-nez v3, :cond_19

    .line 250
    .line 251
    goto :goto_12

    .line 252
    :cond_19
    invoke-interface {v4}, LY/m;->K()V

    .line 253
    .line 254
    .line 255
    move-object v10, v1

    .line 256
    move-object v5, v4

    .line 257
    goto/16 :goto_1f

    .line 258
    .line 259
    :cond_1a
    :goto_12
    if-eqz v5, :cond_1b

    .line 260
    .line 261
    const/4 v1, 0x0

    .line 262
    :cond_1b
    invoke-static {}, LY/w;->L()Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    const/4 v5, -0x1

    .line 267
    if-eqz v3, :cond_1c

    .line 268
    .line 269
    const-string v3, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)"

    .line 270
    .line 271
    invoke-static {v2, v15, v5, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 272
    .line 273
    .line 274
    :cond_1c
    invoke-virtual {v0}, Lw/o0;->o()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-interface {v6, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    check-cast v2, Ljava/lang/Boolean;

    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-nez v2, :cond_1e

    .line 289
    .line 290
    invoke-virtual {v0}, Lw/o0;->h()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-interface {v6, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    check-cast v2, Ljava/lang/Boolean;

    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-nez v2, :cond_1e

    .line 305
    .line 306
    invoke-virtual {v0}, Lw/o0;->s()Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-nez v2, :cond_1e

    .line 311
    .line 312
    invoke-virtual {v0}, Lw/o0;->i()Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-eqz v2, :cond_1d

    .line 317
    .line 318
    goto :goto_13

    .line 319
    :cond_1d
    const v2, 0x6ab53bda

    .line 320
    .line 321
    .line 322
    invoke-interface {v4, v2}, LY/m;->V(I)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v4}, LY/m;->O()V

    .line 326
    .line 327
    .line 328
    move-object v10, v1

    .line 329
    move-object v5, v4

    .line 330
    goto/16 :goto_1e

    .line 331
    .line 332
    :cond_1e
    :goto_13
    const v2, 0x6a9260d1

    .line 333
    .line 334
    .line 335
    invoke-interface {v4, v2}, LY/m;->V(I)V

    .line 336
    .line 337
    .line 338
    and-int/lit8 v2, v15, 0xe

    .line 339
    .line 340
    or-int/lit8 v3, v2, 0x30

    .line 341
    .line 342
    and-int/lit8 v12, v3, 0xe

    .line 343
    .line 344
    xor-int/lit8 v5, v12, 0x6

    .line 345
    .line 346
    move/from16 v18, v15

    .line 347
    .line 348
    const/16 v21, 0x1

    .line 349
    .line 350
    const/4 v15, 0x4

    .line 351
    if-le v5, v15, :cond_1f

    .line 352
    .line 353
    invoke-interface {v4, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    if-nez v5, :cond_20

    .line 358
    .line 359
    :cond_1f
    and-int/lit8 v3, v3, 0x6

    .line 360
    .line 361
    if-ne v3, v15, :cond_21

    .line 362
    .line 363
    :cond_20
    move/from16 v3, v21

    .line 364
    .line 365
    goto :goto_14

    .line 366
    :cond_21
    const/4 v3, 0x0

    .line 367
    :goto_14
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    if-nez v3, :cond_22

    .line 372
    .line 373
    sget-object v3, LY/m;->a:LY/m$a;

    .line 374
    .line 375
    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    if-ne v5, v3, :cond_23

    .line 380
    .line 381
    :cond_22
    invoke-virtual {v0}, Lw/o0;->h()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    invoke-interface {v4, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    :cond_23
    invoke-virtual {v0}, Lw/o0;->s()Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-eqz v3, :cond_24

    .line 393
    .line 394
    invoke-virtual {v0}, Lw/o0;->h()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    :cond_24
    const v3, -0x1bd001fd

    .line 399
    .line 400
    .line 401
    invoke-interface {v4, v3}, LY/m;->V(I)V

    .line 402
    .line 403
    .line 404
    invoke-static {}, LY/w;->L()Z

    .line 405
    .line 406
    .line 407
    move-result v15

    .line 408
    if-eqz v15, :cond_25

    .line 409
    .line 410
    const-string v15, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)"

    .line 411
    .line 412
    move-object/from16 v22, v1

    .line 413
    .line 414
    move/from16 v23, v2

    .line 415
    .line 416
    const/4 v1, -0x1

    .line 417
    const/4 v2, 0x0

    .line 418
    invoke-static {v3, v2, v1, v15}, LY/w;->U(IIILjava/lang/String;)V

    .line 419
    .line 420
    .line 421
    goto :goto_15

    .line 422
    :cond_25
    move-object/from16 v22, v1

    .line 423
    .line 424
    move/from16 v23, v2

    .line 425
    .line 426
    :goto_15
    and-int/lit8 v1, v18, 0x7e

    .line 427
    .line 428
    invoke-static {v0, v6, v5, v4, v1}, Lv/d;->j(Lw/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;LY/m;I)Lv/l;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-static {}, LY/w;->L()Z

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    if-eqz v5, :cond_26

    .line 437
    .line 438
    invoke-static {}, LY/w;->T()V

    .line 439
    .line 440
    .line 441
    :cond_26
    invoke-interface {v4}, LY/m;->O()V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0}, Lw/o0;->o()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v5

    .line 448
    invoke-interface {v4, v3}, LY/m;->V(I)V

    .line 449
    .line 450
    .line 451
    invoke-static {}, LY/w;->L()Z

    .line 452
    .line 453
    .line 454
    move-result v15

    .line 455
    if-eqz v15, :cond_27

    .line 456
    .line 457
    const-string v15, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)"

    .line 458
    .line 459
    move-object/from16 v24, v2

    .line 460
    .line 461
    const/4 v2, -0x1

    .line 462
    const/4 v10, 0x0

    .line 463
    invoke-static {v3, v10, v2, v15}, LY/w;->U(IIILjava/lang/String;)V

    .line 464
    .line 465
    .line 466
    goto :goto_16

    .line 467
    :cond_27
    move-object/from16 v24, v2

    .line 468
    .line 469
    :goto_16
    invoke-static {v0, v6, v5, v4, v1}, Lv/d;->j(Lw/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;LY/m;I)Lv/l;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-static {}, LY/w;->L()Z

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    if-eqz v1, :cond_28

    .line 478
    .line 479
    invoke-static {}, LY/w;->T()V

    .line 480
    .line 481
    .line 482
    :cond_28
    invoke-interface {v4}, LY/m;->O()V

    .line 483
    .line 484
    .line 485
    or-int/lit16 v5, v12, 0xc00

    .line 486
    .line 487
    const-string v3, "EnterExitTransition"

    .line 488
    .line 489
    move-object/from16 v10, v22

    .line 490
    .line 491
    move/from16 v12, v23

    .line 492
    .line 493
    move-object/from16 v1, v24

    .line 494
    .line 495
    invoke-static/range {v0 .. v5}, Lw/p0;->a(Lw/o0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LY/m;I)Lw/o0;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    shr-int/lit8 v0, v18, 0xf

    .line 500
    .line 501
    and-int/lit8 v0, v0, 0xe

    .line 502
    .line 503
    invoke-static {v8, v4, v0}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v1}, Lw/o0;->h()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-virtual {v1}, Lw/o0;->o()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    invoke-interface {v8, v2, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    invoke-interface {v4, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    invoke-interface {v4, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    or-int/2addr v3, v5

    .line 528
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    if-nez v3, :cond_29

    .line 533
    .line 534
    sget-object v3, LY/m;->a:LY/m$a;

    .line 535
    .line 536
    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    if-ne v5, v3, :cond_2a

    .line 541
    .line 542
    :cond_29
    new-instance v5, Lv/d$c;

    .line 543
    .line 544
    const/4 v3, 0x0

    .line 545
    invoke-direct {v5, v1, v0, v3}, Lv/d$c;-><init>(Lw/o0;LY/h2;LZd/e;)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v4, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    :cond_2a
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 552
    .line 553
    const/4 v0, 0x0

    .line 554
    invoke-static {v2, v5, v4, v0}, LY/U1;->l(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)LY/h2;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-static {v1}, Lv/d;->i(Lw/o0;)Z

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    if-eqz v3, :cond_2c

    .line 563
    .line 564
    invoke-static {v2}, Lv/d;->c(LY/h2;)Z

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    if-nez v2, :cond_2b

    .line 569
    .line 570
    goto :goto_17

    .line 571
    :cond_2b
    const v0, 0x6ab5249a

    .line 572
    .line 573
    .line 574
    invoke-interface {v4, v0}, LY/m;->V(I)V

    .line 575
    .line 576
    .line 577
    invoke-interface {v4}, LY/m;->O()V

    .line 578
    .line 579
    .line 580
    move-object v5, v4

    .line 581
    goto/16 :goto_1d

    .line 582
    .line 583
    :cond_2c
    :goto_17
    const v2, 0x6a9ffbb7

    .line 584
    .line 585
    .line 586
    invoke-interface {v4, v2}, LY/m;->V(I)V

    .line 587
    .line 588
    .line 589
    const/4 v15, 0x4

    .line 590
    if-ne v12, v15, :cond_2d

    .line 591
    .line 592
    move/from16 v2, v21

    .line 593
    .line 594
    goto :goto_18

    .line 595
    :cond_2d
    move v2, v0

    .line 596
    :goto_18
    invoke-interface {v4}, LY/m;->D()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    if-nez v2, :cond_2e

    .line 601
    .line 602
    sget-object v2, LY/m;->a:LY/m$a;

    .line 603
    .line 604
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    if-ne v3, v2, :cond_2f

    .line 609
    .line 610
    :cond_2e
    new-instance v3, Lv/f;

    .line 611
    .line 612
    invoke-direct {v3, v1}, Lv/f;-><init>(Lw/o0;)V

    .line 613
    .line 614
    .line 615
    invoke-interface {v4, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    :cond_2f
    check-cast v3, Lv/f;

    .line 619
    .line 620
    shr-int/lit8 v2, v18, 0x6

    .line 621
    .line 622
    and-int/lit8 v5, v2, 0x70

    .line 623
    .line 624
    or-int/lit16 v5, v5, 0x6000

    .line 625
    .line 626
    and-int/lit16 v2, v2, 0x380

    .line 627
    .line 628
    or-int/2addr v2, v5

    .line 629
    const/16 v19, 0x4

    .line 630
    .line 631
    const/4 v15, 0x0

    .line 632
    const-string v16, "Built-in"

    .line 633
    .line 634
    move-object v12, v1

    .line 635
    move-object/from16 v17, v4

    .line 636
    .line 637
    move/from16 v1, v18

    .line 638
    .line 639
    move/from16 v18, v2

    .line 640
    .line 641
    const/high16 v2, 0x100000

    .line 642
    .line 643
    invoke-static/range {v12 .. v19}, Landroidx/compose/animation/f;->g(Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/a;Ljava/lang/String;LY/m;II)Landroidx/compose/ui/e;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    move-object/from16 v5, v17

    .line 648
    .line 649
    if-eqz v10, :cond_34

    .line 650
    .line 651
    const v12, 0x6aa57161    # 1.0000409E26f

    .line 652
    .line 653
    .line 654
    invoke-interface {v5, v12}, LY/m;->V(I)V

    .line 655
    .line 656
    .line 657
    sget-object v12, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 658
    .line 659
    const/high16 v13, 0x380000

    .line 660
    .line 661
    and-int/2addr v13, v1

    .line 662
    if-eq v13, v2, :cond_31

    .line 663
    .line 664
    and-int v2, v1, v20

    .line 665
    .line 666
    if-eqz v2, :cond_30

    .line 667
    .line 668
    invoke-interface {v5, v10}, LY/m;->F(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v2

    .line 672
    if-eqz v2, :cond_30

    .line 673
    .line 674
    goto :goto_19

    .line 675
    :cond_30
    move v15, v0

    .line 676
    goto :goto_1a

    .line 677
    :cond_31
    :goto_19
    move/from16 v15, v21

    .line 678
    .line 679
    :goto_1a
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    if-nez v15, :cond_32

    .line 684
    .line 685
    sget-object v13, LY/m;->a:LY/m$a;

    .line 686
    .line 687
    invoke-virtual {v13}, LY/m$a;->a()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v13

    .line 691
    if-ne v2, v13, :cond_33

    .line 692
    .line 693
    :cond_32
    new-instance v2, Lv/d$a;

    .line 694
    .line 695
    invoke-direct {v2, v10}, Lv/d$a;-><init>(Lv/t;)V

    .line 696
    .line 697
    .line 698
    invoke-interface {v5, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    :cond_33
    check-cast v2, Lie/o;

    .line 702
    .line 703
    invoke-static {v12, v2}, Landroidx/compose/ui/layout/i;->a(Landroidx/compose/ui/e;Lie/o;)Landroidx/compose/ui/e;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    invoke-interface {v5}, LY/m;->O()V

    .line 708
    .line 709
    .line 710
    goto :goto_1b

    .line 711
    :cond_34
    const v2, 0x5e47d710    # 3.59999898E18f

    .line 712
    .line 713
    .line 714
    invoke-interface {v5, v2}, LY/m;->V(I)V

    .line 715
    .line 716
    .line 717
    invoke-interface {v5}, LY/m;->O()V

    .line 718
    .line 719
    .line 720
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 721
    .line 722
    :goto_1b
    invoke-interface {v4, v2}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-interface {v7, v2}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v4

    .line 734
    sget-object v12, LY/m;->a:LY/m$a;

    .line 735
    .line 736
    invoke-virtual {v12}, LY/m$a;->a()Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v12

    .line 740
    if-ne v4, v12, :cond_35

    .line 741
    .line 742
    new-instance v4, Lv/c;

    .line 743
    .line 744
    invoke-direct {v4, v3}, Lv/c;-><init>(Lv/f;)V

    .line 745
    .line 746
    .line 747
    invoke-interface {v5, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    :cond_35
    check-cast v4, Lv/c;

    .line 751
    .line 752
    invoke-static {v5, v0}, LY/h;->a(LY/m;I)I

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    invoke-interface {v5}, LY/m;->r()LY/I;

    .line 757
    .line 758
    .line 759
    move-result-object v12

    .line 760
    invoke-static {v5, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    sget-object v13, LK0/g;->M:LK0/g$a;

    .line 765
    .line 766
    invoke-virtual {v13}, LK0/g$a;->a()Lie/a;

    .line 767
    .line 768
    .line 769
    move-result-object v14

    .line 770
    invoke-interface {v5}, LY/m;->j()LY/d;

    .line 771
    .line 772
    .line 773
    move-result-object v15

    .line 774
    if-nez v15, :cond_36

    .line 775
    .line 776
    invoke-static {}, LY/h;->d()V

    .line 777
    .line 778
    .line 779
    :cond_36
    invoke-interface {v5}, LY/m;->I()V

    .line 780
    .line 781
    .line 782
    invoke-interface {v5}, LY/m;->e()Z

    .line 783
    .line 784
    .line 785
    move-result v15

    .line 786
    if-eqz v15, :cond_37

    .line 787
    .line 788
    invoke-interface {v5, v14}, LY/m;->h(Lie/a;)V

    .line 789
    .line 790
    .line 791
    goto :goto_1c

    .line 792
    :cond_37
    invoke-interface {v5}, LY/m;->s()V

    .line 793
    .line 794
    .line 795
    :goto_1c
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    .line 796
    .line 797
    .line 798
    move-result-object v14

    .line 799
    invoke-virtual {v13}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 800
    .line 801
    .line 802
    move-result-object v15

    .line 803
    invoke-static {v14, v4, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v13}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    invoke-static {v14, v12, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v13}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    invoke-interface {v14}, LY/m;->e()Z

    .line 818
    .line 819
    .line 820
    move-result v12

    .line 821
    if-nez v12, :cond_38

    .line 822
    .line 823
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v12

    .line 827
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 828
    .line 829
    .line 830
    move-result-object v15

    .line 831
    invoke-static {v12, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v12

    .line 835
    if-nez v12, :cond_39

    .line 836
    .line 837
    :cond_38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 838
    .line 839
    .line 840
    move-result-object v12

    .line 841
    invoke-interface {v14, v12}, LY/m;->u(Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-interface {v14, v0, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 849
    .line 850
    .line 851
    :cond_39
    invoke-virtual {v13}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-static {v14, v2, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 856
    .line 857
    .line 858
    shr-int/lit8 v0, v1, 0x12

    .line 859
    .line 860
    and-int/lit8 v0, v0, 0x70

    .line 861
    .line 862
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    invoke-interface {v9, v3, v5, v0}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    invoke-interface {v5}, LY/m;->x()V

    .line 870
    .line 871
    .line 872
    invoke-interface {v5}, LY/m;->O()V

    .line 873
    .line 874
    .line 875
    :goto_1d
    invoke-interface {v5}, LY/m;->O()V

    .line 876
    .line 877
    .line 878
    :goto_1e
    invoke-static {}, LY/w;->L()Z

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    if-eqz v0, :cond_3a

    .line 883
    .line 884
    invoke-static {}, LY/w;->T()V

    .line 885
    .line 886
    .line 887
    :cond_3a
    :goto_1f
    invoke-interface {v5}, LY/m;->k()LY/B1;

    .line 888
    .line 889
    .line 890
    move-result-object v12

    .line 891
    if-eqz v12, :cond_3b

    .line 892
    .line 893
    new-instance v0, Lv/d$b;

    .line 894
    .line 895
    move-object/from16 v1, p0

    .line 896
    .line 897
    move-object/from16 v4, p3

    .line 898
    .line 899
    move-object/from16 v5, p4

    .line 900
    .line 901
    move-object v2, v6

    .line 902
    move-object v3, v7

    .line 903
    move-object v6, v8

    .line 904
    move-object v8, v9

    .line 905
    move-object v7, v10

    .line 906
    move v10, v11

    .line 907
    move/from16 v9, p9

    .line 908
    .line 909
    invoke-direct/range {v0 .. v10}, Lv/d$b;-><init>(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function2;Lv/t;Lie/o;II)V

    .line 910
    .line 911
    .line 912
    invoke-interface {v12, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 913
    .line 914
    .line 915
    :cond_3b
    return-void
.end method

.method private static final b(LY/h2;)Lkotlin/jvm/functions/Function2;
    .locals 0

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final c(LY/h2;)Z
    .locals 0

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

.method public static final d(LC/i;ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V
    .locals 22

    .line 1
    move/from16 v8, p8

    .line 2
    .line 3
    const v0, 0x694ab2be

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p7

    .line 7
    .line 8
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v15

    .line 12
    and-int/lit8 v1, p9, 0x1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    or-int/lit8 v1, v8, 0x30

    .line 17
    .line 18
    move/from16 v2, p1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v1, v8, 0x30

    .line 22
    .line 23
    move/from16 v2, p1

    .line 24
    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v15, v2}, LY/m;->a(Z)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_0
    or-int/2addr v1, v8

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v8

    .line 41
    :goto_1
    and-int/lit8 v3, p9, 0x2

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    or-int/lit16 v1, v1, 0x180

    .line 46
    .line 47
    :cond_3
    move-object/from16 v4, p2

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_4
    and-int/lit16 v4, v8, 0x180

    .line 51
    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    move-object/from16 v4, p2

    .line 55
    .line 56
    invoke-interface {v15, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    const/16 v5, 0x100

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_5
    const/16 v5, 0x80

    .line 66
    .line 67
    :goto_2
    or-int/2addr v1, v5

    .line 68
    :goto_3
    and-int/lit8 v5, p9, 0x4

    .line 69
    .line 70
    if-eqz v5, :cond_7

    .line 71
    .line 72
    or-int/lit16 v1, v1, 0xc00

    .line 73
    .line 74
    :cond_6
    move-object/from16 v6, p3

    .line 75
    .line 76
    goto :goto_5

    .line 77
    :cond_7
    and-int/lit16 v6, v8, 0xc00

    .line 78
    .line 79
    if-nez v6, :cond_6

    .line 80
    .line 81
    move-object/from16 v6, p3

    .line 82
    .line 83
    invoke-interface {v15, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_8

    .line 88
    .line 89
    const/16 v7, 0x800

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_8
    const/16 v7, 0x400

    .line 93
    .line 94
    :goto_4
    or-int/2addr v1, v7

    .line 95
    :goto_5
    and-int/lit8 v7, p9, 0x8

    .line 96
    .line 97
    if-eqz v7, :cond_a

    .line 98
    .line 99
    or-int/lit16 v1, v1, 0x6000

    .line 100
    .line 101
    :cond_9
    move-object/from16 v9, p4

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_a
    and-int/lit16 v9, v8, 0x6000

    .line 105
    .line 106
    if-nez v9, :cond_9

    .line 107
    .line 108
    move-object/from16 v9, p4

    .line 109
    .line 110
    invoke-interface {v15, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-eqz v10, :cond_b

    .line 115
    .line 116
    const/16 v10, 0x4000

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_b
    const/16 v10, 0x2000

    .line 120
    .line 121
    :goto_6
    or-int/2addr v1, v10

    .line 122
    :goto_7
    and-int/lit8 v10, p9, 0x10

    .line 123
    .line 124
    const/high16 v11, 0x30000

    .line 125
    .line 126
    if-eqz v10, :cond_d

    .line 127
    .line 128
    or-int/2addr v1, v11

    .line 129
    :cond_c
    move-object/from16 v11, p5

    .line 130
    .line 131
    goto :goto_9

    .line 132
    :cond_d
    and-int/2addr v11, v8

    .line 133
    if-nez v11, :cond_c

    .line 134
    .line 135
    move-object/from16 v11, p5

    .line 136
    .line 137
    invoke-interface {v15, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v12

    .line 141
    if-eqz v12, :cond_e

    .line 142
    .line 143
    const/high16 v12, 0x20000

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_e
    const/high16 v12, 0x10000

    .line 147
    .line 148
    :goto_8
    or-int/2addr v1, v12

    .line 149
    :goto_9
    and-int/lit8 v12, p9, 0x20

    .line 150
    .line 151
    const/high16 v13, 0x180000

    .line 152
    .line 153
    if-eqz v12, :cond_f

    .line 154
    .line 155
    or-int/2addr v1, v13

    .line 156
    move-object/from16 v14, p6

    .line 157
    .line 158
    goto :goto_b

    .line 159
    :cond_f
    and-int v12, v8, v13

    .line 160
    .line 161
    move-object/from16 v14, p6

    .line 162
    .line 163
    if-nez v12, :cond_11

    .line 164
    .line 165
    invoke-interface {v15, v14}, LY/m;->F(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    if-eqz v12, :cond_10

    .line 170
    .line 171
    const/high16 v12, 0x100000

    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_10
    const/high16 v12, 0x80000

    .line 175
    .line 176
    :goto_a
    or-int/2addr v1, v12

    .line 177
    :cond_11
    :goto_b
    const v12, 0x92491

    .line 178
    .line 179
    .line 180
    and-int/2addr v12, v1

    .line 181
    const v13, 0x92490

    .line 182
    .line 183
    .line 184
    if-ne v12, v13, :cond_13

    .line 185
    .line 186
    invoke-interface {v15}, LY/m;->i()Z

    .line 187
    .line 188
    .line 189
    move-result v12

    .line 190
    if-nez v12, :cond_12

    .line 191
    .line 192
    goto :goto_c

    .line 193
    :cond_12
    invoke-interface {v15}, LY/m;->K()V

    .line 194
    .line 195
    .line 196
    move-object v3, v4

    .line 197
    move-object v4, v6

    .line 198
    move-object v5, v9

    .line 199
    move-object v6, v11

    .line 200
    goto/16 :goto_10

    .line 201
    .line 202
    :cond_13
    :goto_c
    if-eqz v3, :cond_14

    .line 203
    .line 204
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 205
    .line 206
    goto :goto_d

    .line 207
    :cond_14
    move-object v3, v4

    .line 208
    :goto_d
    const/4 v4, 0x0

    .line 209
    const/4 v12, 0x3

    .line 210
    const/4 v13, 0x0

    .line 211
    if-eqz v5, :cond_15

    .line 212
    .line 213
    invoke-static {v13, v4, v12, v13}, Landroidx/compose/animation/f;->m(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    const/16 v20, 0xf

    .line 218
    .line 219
    const/16 v21, 0x0

    .line 220
    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/16 v19, 0x0

    .line 228
    .line 229
    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/f;->k(Lw/G;Ll0/e$c;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-virtual {v5, v6}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    move-object v6, v5

    .line 238
    :cond_15
    if-eqz v7, :cond_16

    .line 239
    .line 240
    invoke-static {v13, v4, v12, v13}, Landroidx/compose/animation/f;->o(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/j;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    const/16 v20, 0xf

    .line 245
    .line 246
    const/16 v21, 0x0

    .line 247
    .line 248
    const/16 v16, 0x0

    .line 249
    .line 250
    const/16 v17, 0x0

    .line 251
    .line 252
    const/16 v18, 0x0

    .line 253
    .line 254
    const/16 v19, 0x0

    .line 255
    .line 256
    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/f;->u(Lw/G;Ll0/e$c;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/j;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-virtual {v4, v5}, Landroidx/compose/animation/j;->c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    move-object v13, v4

    .line 265
    goto :goto_e

    .line 266
    :cond_16
    move-object v13, v9

    .line 267
    :goto_e
    if-eqz v10, :cond_17

    .line 268
    .line 269
    const-string v4, "AnimatedVisibility"

    .line 270
    .line 271
    goto :goto_f

    .line 272
    :cond_17
    move-object v4, v11

    .line 273
    :goto_f
    invoke-static {}, LY/w;->L()Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-eqz v5, :cond_18

    .line 278
    .line 279
    const/4 v5, -0x1

    .line 280
    const-string v7, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)"

    .line 281
    .line 282
    invoke-static {v0, v1, v5, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :cond_18
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    shr-int/lit8 v5, v1, 0x3

    .line 290
    .line 291
    and-int/lit8 v7, v5, 0xe

    .line 292
    .line 293
    shr-int/lit8 v9, v1, 0xc

    .line 294
    .line 295
    and-int/lit8 v9, v9, 0x70

    .line 296
    .line 297
    or-int/2addr v7, v9

    .line 298
    const/4 v9, 0x0

    .line 299
    invoke-static {v0, v4, v15, v7, v9}, Lw/p0;->d(Ljava/lang/Object;Ljava/lang/String;LY/m;II)Lw/o0;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    sget-object v10, Lv/d$f;->a:Lv/d$f;

    .line 304
    .line 305
    and-int/lit16 v0, v1, 0x380

    .line 306
    .line 307
    or-int/lit8 v0, v0, 0x30

    .line 308
    .line 309
    and-int/lit16 v7, v1, 0x1c00

    .line 310
    .line 311
    or-int/2addr v0, v7

    .line 312
    const v7, 0xe000

    .line 313
    .line 314
    .line 315
    and-int/2addr v1, v7

    .line 316
    or-int/2addr v0, v1

    .line 317
    const/high16 v1, 0x70000

    .line 318
    .line 319
    and-int/2addr v1, v5

    .line 320
    or-int v16, v0, v1

    .line 321
    .line 322
    move-object v11, v3

    .line 323
    move-object v12, v6

    .line 324
    invoke-static/range {v9 .. v16}, Lv/d;->f(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/o;LY/m;I)V

    .line 325
    .line 326
    .line 327
    invoke-static {}, LY/w;->L()Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_19

    .line 332
    .line 333
    invoke-static {}, LY/w;->T()V

    .line 334
    .line 335
    .line 336
    :cond_19
    move-object v6, v4

    .line 337
    move-object v3, v11

    .line 338
    move-object v4, v12

    .line 339
    move-object v5, v13

    .line 340
    :goto_10
    invoke-interface {v15}, LY/m;->k()LY/B1;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    if-eqz v10, :cond_1a

    .line 345
    .line 346
    new-instance v0, Lv/d$g;

    .line 347
    .line 348
    move-object/from16 v1, p0

    .line 349
    .line 350
    move-object/from16 v7, p6

    .line 351
    .line 352
    move/from16 v9, p9

    .line 353
    .line 354
    invoke-direct/range {v0 .. v9}, Lv/d$g;-><init>(LC/i;ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;II)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v10, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 358
    .line 359
    .line 360
    :cond_1a
    return-void
.end method

.method public static final e(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V
    .locals 22

    .line 1
    move/from16 v7, p7

    .line 2
    .line 3
    const v0, 0x7c7f8c4e

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p6

    .line 7
    .line 8
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v14

    .line 12
    and-int/lit8 v1, p8, 0x1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    or-int/lit8 v1, v7, 0x6

    .line 17
    .line 18
    move v2, v1

    .line 19
    move/from16 v1, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v1, v7, 0x6

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    move/from16 v1, p0

    .line 27
    .line 28
    invoke-interface {v14, v1}, LY/m;->a(Z)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v2, 0x2

    .line 37
    :goto_0
    or-int/2addr v2, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move/from16 v1, p0

    .line 40
    .line 41
    move v2, v7

    .line 42
    :goto_1
    and-int/lit8 v3, p8, 0x2

    .line 43
    .line 44
    if-eqz v3, :cond_4

    .line 45
    .line 46
    or-int/lit8 v2, v2, 0x30

    .line 47
    .line 48
    :cond_3
    move-object/from16 v4, p1

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_4
    and-int/lit8 v4, v7, 0x30

    .line 52
    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    move-object/from16 v4, p1

    .line 56
    .line 57
    invoke-interface {v14, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_5

    .line 62
    .line 63
    const/16 v5, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_5
    const/16 v5, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v2, v5

    .line 69
    :goto_3
    and-int/lit8 v5, p8, 0x4

    .line 70
    .line 71
    if-eqz v5, :cond_7

    .line 72
    .line 73
    or-int/lit16 v2, v2, 0x180

    .line 74
    .line 75
    :cond_6
    move-object/from16 v6, p2

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_7
    and-int/lit16 v6, v7, 0x180

    .line 79
    .line 80
    if-nez v6, :cond_6

    .line 81
    .line 82
    move-object/from16 v6, p2

    .line 83
    .line 84
    invoke-interface {v14, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_8

    .line 89
    .line 90
    const/16 v8, 0x100

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_8
    const/16 v8, 0x80

    .line 94
    .line 95
    :goto_4
    or-int/2addr v2, v8

    .line 96
    :goto_5
    and-int/lit8 v8, p8, 0x8

    .line 97
    .line 98
    if-eqz v8, :cond_a

    .line 99
    .line 100
    or-int/lit16 v2, v2, 0xc00

    .line 101
    .line 102
    :cond_9
    move-object/from16 v9, p3

    .line 103
    .line 104
    goto :goto_7

    .line 105
    :cond_a
    and-int/lit16 v9, v7, 0xc00

    .line 106
    .line 107
    if-nez v9, :cond_9

    .line 108
    .line 109
    move-object/from16 v9, p3

    .line 110
    .line 111
    invoke-interface {v14, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-eqz v10, :cond_b

    .line 116
    .line 117
    const/16 v10, 0x800

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_b
    const/16 v10, 0x400

    .line 121
    .line 122
    :goto_6
    or-int/2addr v2, v10

    .line 123
    :goto_7
    and-int/lit8 v10, p8, 0x10

    .line 124
    .line 125
    if-eqz v10, :cond_d

    .line 126
    .line 127
    or-int/lit16 v2, v2, 0x6000

    .line 128
    .line 129
    :cond_c
    move-object/from16 v11, p4

    .line 130
    .line 131
    goto :goto_9

    .line 132
    :cond_d
    and-int/lit16 v11, v7, 0x6000

    .line 133
    .line 134
    if-nez v11, :cond_c

    .line 135
    .line 136
    move-object/from16 v11, p4

    .line 137
    .line 138
    invoke-interface {v14, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-eqz v12, :cond_e

    .line 143
    .line 144
    const/16 v12, 0x4000

    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_e
    const/16 v12, 0x2000

    .line 148
    .line 149
    :goto_8
    or-int/2addr v2, v12

    .line 150
    :goto_9
    and-int/lit8 v12, p8, 0x20

    .line 151
    .line 152
    const/high16 v13, 0x30000

    .line 153
    .line 154
    if-eqz v12, :cond_f

    .line 155
    .line 156
    or-int/2addr v2, v13

    .line 157
    move-object/from16 v13, p5

    .line 158
    .line 159
    goto :goto_b

    .line 160
    :cond_f
    and-int v12, v7, v13

    .line 161
    .line 162
    move-object/from16 v13, p5

    .line 163
    .line 164
    if-nez v12, :cond_11

    .line 165
    .line 166
    invoke-interface {v14, v13}, LY/m;->F(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    if-eqz v12, :cond_10

    .line 171
    .line 172
    const/high16 v12, 0x20000

    .line 173
    .line 174
    goto :goto_a

    .line 175
    :cond_10
    const/high16 v12, 0x10000

    .line 176
    .line 177
    :goto_a
    or-int/2addr v2, v12

    .line 178
    :cond_11
    :goto_b
    const v12, 0x12493

    .line 179
    .line 180
    .line 181
    and-int/2addr v12, v2

    .line 182
    const v15, 0x12492

    .line 183
    .line 184
    .line 185
    if-ne v12, v15, :cond_13

    .line 186
    .line 187
    invoke-interface {v14}, LY/m;->i()Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-nez v12, :cond_12

    .line 192
    .line 193
    goto :goto_c

    .line 194
    :cond_12
    invoke-interface {v14}, LY/m;->K()V

    .line 195
    .line 196
    .line 197
    move-object v2, v4

    .line 198
    move-object v3, v6

    .line 199
    move-object v4, v9

    .line 200
    move-object v5, v11

    .line 201
    goto/16 :goto_11

    .line 202
    .line 203
    :cond_13
    :goto_c
    if-eqz v3, :cond_14

    .line 204
    .line 205
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 206
    .line 207
    goto :goto_d

    .line 208
    :cond_14
    move-object v3, v4

    .line 209
    :goto_d
    const/4 v4, 0x0

    .line 210
    const/4 v12, 0x3

    .line 211
    const/4 v15, 0x0

    .line 212
    if-eqz v5, :cond_15

    .line 213
    .line 214
    invoke-static {v15, v4, v12, v15}, Landroidx/compose/animation/f;->m(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    const/16 v20, 0xf

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const/16 v18, 0x0

    .line 227
    .line 228
    const/16 v19, 0x0

    .line 229
    .line 230
    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/f;->i(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-virtual {v5, v6}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    goto :goto_e

    .line 239
    :cond_15
    move-object v5, v6

    .line 240
    :goto_e
    if-eqz v8, :cond_16

    .line 241
    .line 242
    const/16 v20, 0xf

    .line 243
    .line 244
    const/16 v21, 0x0

    .line 245
    .line 246
    const/16 v16, 0x0

    .line 247
    .line 248
    const/16 v17, 0x0

    .line 249
    .line 250
    const/16 v18, 0x0

    .line 251
    .line 252
    const/16 v19, 0x0

    .line 253
    .line 254
    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/f;->s(Lw/G;Ll0/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/j;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-static {v15, v4, v12, v15}, Landroidx/compose/animation/f;->o(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/j;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v6, v4}, Landroidx/compose/animation/j;->c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    move-object v12, v4

    .line 267
    goto :goto_f

    .line 268
    :cond_16
    move-object v12, v9

    .line 269
    :goto_f
    if-eqz v10, :cond_17

    .line 270
    .line 271
    const-string v4, "AnimatedVisibility"

    .line 272
    .line 273
    goto :goto_10

    .line 274
    :cond_17
    move-object v4, v11

    .line 275
    :goto_10
    invoke-static {}, LY/w;->L()Z

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    if-eqz v6, :cond_18

    .line 280
    .line 281
    const/4 v6, -0x1

    .line 282
    const-string v8, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)"

    .line 283
    .line 284
    invoke-static {v0, v2, v6, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :cond_18
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    and-int/lit8 v6, v2, 0xe

    .line 292
    .line 293
    shr-int/lit8 v8, v2, 0x9

    .line 294
    .line 295
    and-int/lit8 v8, v8, 0x70

    .line 296
    .line 297
    or-int/2addr v6, v8

    .line 298
    const/4 v8, 0x0

    .line 299
    invoke-static {v0, v4, v14, v6, v8}, Lw/p0;->d(Ljava/lang/Object;Ljava/lang/String;LY/m;II)Lw/o0;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    sget-object v9, Lv/d$d;->a:Lv/d$d;

    .line 304
    .line 305
    shl-int/lit8 v0, v2, 0x3

    .line 306
    .line 307
    and-int/lit16 v6, v0, 0x380

    .line 308
    .line 309
    or-int/lit8 v6, v6, 0x30

    .line 310
    .line 311
    and-int/lit16 v10, v0, 0x1c00

    .line 312
    .line 313
    or-int/2addr v6, v10

    .line 314
    const v10, 0xe000

    .line 315
    .line 316
    .line 317
    and-int/2addr v0, v10

    .line 318
    or-int/2addr v0, v6

    .line 319
    const/high16 v6, 0x70000

    .line 320
    .line 321
    and-int/2addr v2, v6

    .line 322
    or-int v15, v0, v2

    .line 323
    .line 324
    move-object v10, v3

    .line 325
    move-object v11, v5

    .line 326
    invoke-static/range {v8 .. v15}, Lv/d;->f(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/o;LY/m;I)V

    .line 327
    .line 328
    .line 329
    invoke-static {}, LY/w;->L()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_19

    .line 334
    .line 335
    invoke-static {}, LY/w;->T()V

    .line 336
    .line 337
    .line 338
    :cond_19
    move-object v5, v4

    .line 339
    move-object v2, v10

    .line 340
    move-object v3, v11

    .line 341
    move-object v4, v12

    .line 342
    :goto_11
    invoke-interface {v14}, LY/m;->k()LY/B1;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    if-eqz v9, :cond_1a

    .line 347
    .line 348
    new-instance v0, Lv/d$e;

    .line 349
    .line 350
    move-object/from16 v6, p5

    .line 351
    .line 352
    move/from16 v8, p8

    .line 353
    .line 354
    invoke-direct/range {v0 .. v8}, Lv/d$e;-><init>(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;II)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v9, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 358
    .line 359
    .line 360
    :cond_1a
    return-void
.end method

.method public static final f(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/o;LY/m;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v11, p2

    .line 6
    .line 7
    move/from16 v12, p7

    .line 8
    .line 9
    const v2, 0x19a0f3eb

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p6

    .line 13
    .line 14
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 15
    .line 16
    .line 17
    move-result-object v8

    .line 18
    and-int/lit8 v3, v12, 0x6

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v8, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    move v3, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v3, 0x2

    .line 32
    :goto_0
    or-int/2addr v3, v12

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v3, v12

    .line 35
    :goto_1
    and-int/lit8 v5, v12, 0x30

    .line 36
    .line 37
    const/16 v6, 0x20

    .line 38
    .line 39
    if-nez v5, :cond_3

    .line 40
    .line 41
    invoke-interface {v8, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    move v5, v6

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v5, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v3, v5

    .line 52
    :cond_3
    and-int/lit16 v5, v12, 0x180

    .line 53
    .line 54
    if-nez v5, :cond_5

    .line 55
    .line 56
    invoke-interface {v8, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    const/16 v5, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v5, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v3, v5

    .line 68
    :cond_5
    and-int/lit16 v5, v12, 0xc00

    .line 69
    .line 70
    if-nez v5, :cond_7

    .line 71
    .line 72
    move-object/from16 v5, p3

    .line 73
    .line 74
    invoke-interface {v8, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    const/16 v7, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v7, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v3, v7

    .line 86
    goto :goto_5

    .line 87
    :cond_7
    move-object/from16 v5, p3

    .line 88
    .line 89
    :goto_5
    and-int/lit16 v7, v12, 0x6000

    .line 90
    .line 91
    if-nez v7, :cond_9

    .line 92
    .line 93
    move-object/from16 v7, p4

    .line 94
    .line 95
    invoke-interface {v8, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_8

    .line 100
    .line 101
    const/16 v9, 0x4000

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/16 v9, 0x2000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v3, v9

    .line 107
    goto :goto_7

    .line 108
    :cond_9
    move-object/from16 v7, p4

    .line 109
    .line 110
    :goto_7
    const/high16 v9, 0x30000

    .line 111
    .line 112
    and-int v10, v12, v9

    .line 113
    .line 114
    if-nez v10, :cond_b

    .line 115
    .line 116
    move-object/from16 v10, p5

    .line 117
    .line 118
    invoke-interface {v8, v10}, LY/m;->F(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-eqz v13, :cond_a

    .line 123
    .line 124
    const/high16 v13, 0x20000

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_a
    const/high16 v13, 0x10000

    .line 128
    .line 129
    :goto_8
    or-int/2addr v3, v13

    .line 130
    goto :goto_9

    .line 131
    :cond_b
    move-object/from16 v10, p5

    .line 132
    .line 133
    :goto_9
    const v13, 0x12493

    .line 134
    .line 135
    .line 136
    and-int/2addr v13, v3

    .line 137
    const v14, 0x12492

    .line 138
    .line 139
    .line 140
    if-ne v13, v14, :cond_d

    .line 141
    .line 142
    invoke-interface {v8}, LY/m;->i()Z

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    if-nez v13, :cond_c

    .line 147
    .line 148
    goto :goto_a

    .line 149
    :cond_c
    invoke-interface {v8}, LY/m;->K()V

    .line 150
    .line 151
    .line 152
    goto :goto_c

    .line 153
    :cond_d
    :goto_a
    invoke-static {}, LY/w;->L()Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-eqz v13, :cond_e

    .line 158
    .line 159
    const/4 v13, -0x1

    .line 160
    const-string v14, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)"

    .line 161
    .line 162
    invoke-static {v2, v3, v13, v14}, LY/w;->U(IIILjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_e
    and-int/lit8 v2, v3, 0x70

    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x1

    .line 169
    if-ne v2, v6, :cond_f

    .line 170
    .line 171
    move v6, v14

    .line 172
    goto :goto_b

    .line 173
    :cond_f
    move v6, v13

    .line 174
    :goto_b
    and-int/lit8 v15, v3, 0xe

    .line 175
    .line 176
    if-ne v15, v4, :cond_10

    .line 177
    .line 178
    move v13, v14

    .line 179
    :cond_10
    or-int v4, v6, v13

    .line 180
    .line 181
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    if-nez v4, :cond_11

    .line 186
    .line 187
    sget-object v4, LY/m;->a:LY/m$a;

    .line 188
    .line 189
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    if-ne v6, v4, :cond_12

    .line 194
    .line 195
    :cond_11
    new-instance v6, Lv/d$h;

    .line 196
    .line 197
    invoke-direct {v6, v1, v0}, Lv/d$h;-><init>(Lkotlin/jvm/functions/Function1;Lw/o0;)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v8, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_12
    check-cast v6, Lie/o;

    .line 204
    .line 205
    invoke-static {v11, v6}, Landroidx/compose/ui/layout/i;->a(Landroidx/compose/ui/e;Lie/o;)Landroidx/compose/ui/e;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    sget-object v5, Lv/d$i;->a:Lv/d$i;

    .line 210
    .line 211
    or-int v6, v15, v9

    .line 212
    .line 213
    or-int/2addr v2, v6

    .line 214
    and-int/lit16 v6, v3, 0x1c00

    .line 215
    .line 216
    or-int/2addr v2, v6

    .line 217
    const v6, 0xe000

    .line 218
    .line 219
    .line 220
    and-int/2addr v6, v3

    .line 221
    or-int/2addr v2, v6

    .line 222
    const/high16 v6, 0x1c00000

    .line 223
    .line 224
    shl-int/lit8 v3, v3, 0x6

    .line 225
    .line 226
    and-int/2addr v3, v6

    .line 227
    or-int v9, v2, v3

    .line 228
    .line 229
    const/16 v10, 0x40

    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    move-object/from16 v3, p3

    .line 233
    .line 234
    move-object v2, v4

    .line 235
    move-object v4, v7

    .line 236
    move-object/from16 v7, p5

    .line 237
    .line 238
    invoke-static/range {v0 .. v10}, Lv/d;->a(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function2;Lv/t;Lie/o;LY/m;II)V

    .line 239
    .line 240
    .line 241
    invoke-static {}, LY/w;->L()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_13

    .line 246
    .line 247
    invoke-static {}, LY/w;->T()V

    .line 248
    .line 249
    .line 250
    :cond_13
    :goto_c
    invoke-interface {v8}, LY/m;->k()LY/B1;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    if-eqz v8, :cond_14

    .line 255
    .line 256
    new-instance v0, Lv/d$j;

    .line 257
    .line 258
    move-object/from16 v1, p0

    .line 259
    .line 260
    move-object/from16 v2, p1

    .line 261
    .line 262
    move-object/from16 v4, p3

    .line 263
    .line 264
    move-object/from16 v5, p4

    .line 265
    .line 266
    move-object/from16 v6, p5

    .line 267
    .line 268
    move-object v3, v11

    .line 269
    move v7, v12

    .line 270
    invoke-direct/range {v0 .. v7}, Lv/d$j;-><init>(Lw/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lie/o;I)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 274
    .line 275
    .line 276
    :cond_14
    return-void
.end method

.method public static final synthetic g(LY/h2;)Lkotlin/jvm/functions/Function2;
    .locals 0

    .line 1
    invoke-static {p0}, Lv/d;->b(LY/h2;)Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lw/o0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lv/d;->i(Lw/o0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final i(Lw/o0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lv/l;->c:Lv/l;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lw/o0;->o()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private static final j(Lw/o0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;LY/m;I)Lv/l;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)"

    .line 9
    .line 10
    const v2, 0x158d233e

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p4, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const p4, -0x35c429c8

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, p4, p0}, LY/m;->H(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lw/o0;->s()Z

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    if-eqz p4, :cond_3

    .line 27
    .line 28
    const p4, 0x7d3f3e2b

    .line 29
    .line 30
    .line 31
    invoke-interface {p3, p4}, LY/m;->V(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p3}, LY/m;->O()V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    sget-object p0, Lv/l;->b:Lv/l;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    sget-object p0, Lv/l;->c:Lv/l;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    sget-object p0, Lv/l;->a:Lv/l;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const p4, 0x7d42cf94

    .line 75
    .line 76
    .line 77
    invoke-interface {p3, p4}, LY/m;->V(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    sget-object v0, LY/m;->a:LY/m$a;

    .line 85
    .line 86
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne p4, v0, :cond_4

    .line 91
    .line 92
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    const/4 v0, 0x2

    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-static {p4, v1, v0, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    invoke-interface {p3, p4}, LY/m;->u(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    check-cast p4, LY/C0;

    .line 104
    .line 105
    invoke-virtual {p0}, Lw/o0;->h()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-interface {p4, p0}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_6

    .line 137
    .line 138
    sget-object p0, Lv/l;->b:Lv/l;

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_6
    invoke-interface {p4}, LY/C0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-eqz p0, :cond_7

    .line 152
    .line 153
    sget-object p0, Lv/l;->c:Lv/l;

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_7
    sget-object p0, Lv/l;->a:Lv/l;

    .line 157
    .line 158
    :goto_0
    invoke-interface {p3}, LY/m;->O()V

    .line 159
    .line 160
    .line 161
    :goto_1
    invoke-interface {p3}, LY/m;->S()V

    .line 162
    .line 163
    .line 164
    invoke-static {}, LY/w;->L()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_8

    .line 169
    .line 170
    invoke-static {}, LY/w;->T()V

    .line 171
    .line 172
    .line 173
    :cond_8
    return-object p0
.end method
