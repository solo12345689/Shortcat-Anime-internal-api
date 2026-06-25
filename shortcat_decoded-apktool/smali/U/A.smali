.class public abstract LU/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lie/a;Landroidx/compose/ui/e;ZLU/y;LB/m;Lkotlin/jvm/functions/Function2;LY/m;II)V
    .locals 23

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    const v0, -0x441f35f2

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p6

    .line 9
    .line 10
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v12

    .line 14
    and-int/lit8 v1, p8, 0x1

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    or-int/lit8 v1, v7, 0x6

    .line 20
    .line 21
    move v3, v1

    .line 22
    move-object/from16 v1, p0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v1, v7, 0x6

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    move-object/from16 v1, p0

    .line 30
    .line 31
    invoke-interface {v12, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v3, v2

    .line 40
    :goto_0
    or-int/2addr v3, v7

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object/from16 v1, p0

    .line 43
    .line 44
    move v3, v7

    .line 45
    :goto_1
    and-int/lit8 v4, p8, 0x2

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    or-int/lit8 v3, v3, 0x30

    .line 50
    .line 51
    :cond_3
    move-object/from16 v5, p1

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    and-int/lit8 v5, v7, 0x30

    .line 55
    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    move-object/from16 v5, p1

    .line 59
    .line 60
    invoke-interface {v12, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_5

    .line 65
    .line 66
    const/16 v8, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    const/16 v8, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr v3, v8

    .line 72
    :goto_3
    and-int/lit8 v8, p8, 0x4

    .line 73
    .line 74
    if-eqz v8, :cond_7

    .line 75
    .line 76
    or-int/lit16 v3, v3, 0x180

    .line 77
    .line 78
    :cond_6
    move/from16 v9, p2

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_7
    and-int/lit16 v9, v7, 0x180

    .line 82
    .line 83
    if-nez v9, :cond_6

    .line 84
    .line 85
    move/from16 v9, p2

    .line 86
    .line 87
    invoke-interface {v12, v9}, LY/m;->a(Z)Z

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    if-eqz v10, :cond_8

    .line 92
    .line 93
    const/16 v10, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_8
    const/16 v10, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v3, v10

    .line 99
    :goto_5
    and-int/lit16 v10, v7, 0xc00

    .line 100
    .line 101
    if-nez v10, :cond_b

    .line 102
    .line 103
    and-int/lit8 v10, p8, 0x8

    .line 104
    .line 105
    if-nez v10, :cond_9

    .line 106
    .line 107
    move-object/from16 v10, p3

    .line 108
    .line 109
    invoke-interface {v12, v10}, LY/m;->U(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    if-eqz v11, :cond_a

    .line 114
    .line 115
    const/16 v11, 0x800

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_9
    move-object/from16 v10, p3

    .line 119
    .line 120
    :cond_a
    const/16 v11, 0x400

    .line 121
    .line 122
    :goto_6
    or-int/2addr v3, v11

    .line 123
    goto :goto_7

    .line 124
    :cond_b
    move-object/from16 v10, p3

    .line 125
    .line 126
    :goto_7
    and-int/lit8 v11, p8, 0x10

    .line 127
    .line 128
    if-eqz v11, :cond_d

    .line 129
    .line 130
    or-int/lit16 v3, v3, 0x6000

    .line 131
    .line 132
    :cond_c
    move-object/from16 v13, p4

    .line 133
    .line 134
    goto :goto_9

    .line 135
    :cond_d
    and-int/lit16 v13, v7, 0x6000

    .line 136
    .line 137
    if-nez v13, :cond_c

    .line 138
    .line 139
    move-object/from16 v13, p4

    .line 140
    .line 141
    invoke-interface {v12, v13}, LY/m;->U(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    if-eqz v14, :cond_e

    .line 146
    .line 147
    const/16 v14, 0x4000

    .line 148
    .line 149
    goto :goto_8

    .line 150
    :cond_e
    const/16 v14, 0x2000

    .line 151
    .line 152
    :goto_8
    or-int/2addr v3, v14

    .line 153
    :goto_9
    and-int/lit8 v14, p8, 0x20

    .line 154
    .line 155
    const/high16 v15, 0x30000

    .line 156
    .line 157
    if-eqz v14, :cond_f

    .line 158
    .line 159
    or-int/2addr v3, v15

    .line 160
    goto :goto_b

    .line 161
    :cond_f
    and-int v14, v7, v15

    .line 162
    .line 163
    if-nez v14, :cond_11

    .line 164
    .line 165
    invoke-interface {v12, v6}, LY/m;->F(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    if-eqz v14, :cond_10

    .line 170
    .line 171
    const/high16 v14, 0x20000

    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_10
    const/high16 v14, 0x10000

    .line 175
    .line 176
    :goto_a
    or-int/2addr v3, v14

    .line 177
    :cond_11
    :goto_b
    const v14, 0x12493

    .line 178
    .line 179
    .line 180
    and-int/2addr v14, v3

    .line 181
    const v15, 0x12492

    .line 182
    .line 183
    .line 184
    if-ne v14, v15, :cond_13

    .line 185
    .line 186
    invoke-interface {v12}, LY/m;->i()Z

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    if-nez v14, :cond_12

    .line 191
    .line 192
    goto :goto_d

    .line 193
    :cond_12
    invoke-interface {v12}, LY/m;->K()V

    .line 194
    .line 195
    .line 196
    move-object v2, v5

    .line 197
    move-object v4, v10

    .line 198
    move-object v5, v13

    .line 199
    :goto_c
    move v3, v9

    .line 200
    goto/16 :goto_13

    .line 201
    .line 202
    :cond_13
    :goto_d
    invoke-interface {v12}, LY/m;->G()V

    .line 203
    .line 204
    .line 205
    and-int/lit8 v14, v7, 0x1

    .line 206
    .line 207
    const/4 v15, 0x6

    .line 208
    if-eqz v14, :cond_16

    .line 209
    .line 210
    invoke-interface {v12}, LY/m;->N()Z

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-eqz v14, :cond_14

    .line 215
    .line 216
    goto :goto_f

    .line 217
    :cond_14
    invoke-interface {v12}, LY/m;->K()V

    .line 218
    .line 219
    .line 220
    and-int/lit8 v4, p8, 0x8

    .line 221
    .line 222
    if-eqz v4, :cond_15

    .line 223
    .line 224
    and-int/lit16 v3, v3, -0x1c01

    .line 225
    .line 226
    :cond_15
    move v8, v3

    .line 227
    move-object v4, v5

    .line 228
    :goto_e
    move v3, v9

    .line 229
    move-object v5, v10

    .line 230
    move-object/from16 v16, v13

    .line 231
    .line 232
    goto :goto_11

    .line 233
    :cond_16
    :goto_f
    if-eqz v4, :cond_17

    .line 234
    .line 235
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 236
    .line 237
    goto :goto_10

    .line 238
    :cond_17
    move-object v4, v5

    .line 239
    :goto_10
    if-eqz v8, :cond_18

    .line 240
    .line 241
    const/4 v5, 0x1

    .line 242
    move v9, v5

    .line 243
    :cond_18
    and-int/lit8 v5, p8, 0x8

    .line 244
    .line 245
    if-eqz v5, :cond_19

    .line 246
    .line 247
    sget-object v5, LU/z;->a:LU/z;

    .line 248
    .line 249
    invoke-virtual {v5, v12, v15}, LU/z;->b(LY/m;I)LU/y;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    and-int/lit16 v3, v3, -0x1c01

    .line 254
    .line 255
    move-object v10, v5

    .line 256
    :cond_19
    if-eqz v11, :cond_1a

    .line 257
    .line 258
    const/4 v5, 0x0

    .line 259
    move v8, v3

    .line 260
    move-object/from16 v16, v5

    .line 261
    .line 262
    move v3, v9

    .line 263
    move-object v5, v10

    .line 264
    goto :goto_11

    .line 265
    :cond_1a
    move v8, v3

    .line 266
    goto :goto_e

    .line 267
    :goto_11
    invoke-interface {v12}, LY/m;->y()V

    .line 268
    .line 269
    .line 270
    invoke-static {}, LY/w;->L()Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-eqz v9, :cond_1b

    .line 275
    .line 276
    const/4 v9, -0x1

    .line 277
    const-string v10, "androidx.compose.material3.IconButton (IconButton.kt:88)"

    .line 278
    .line 279
    invoke-static {v0, v8, v9, v10}, LY/w;->U(IIILjava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :cond_1b
    invoke-static {v4}, LU/C;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    sget-object v9, LX/g;->a:LX/g;

    .line 287
    .line 288
    invoke-virtual {v9}, LX/g;->c()F

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/s;->r(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {v9}, LX/g;->b()LX/l;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    invoke-static {v10, v12, v15}, LU/V;->d(LX/l;LY/m;I)Ls0/E1;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-static {v0, v10}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 305
    .line 306
    .line 307
    move-result-object v17

    .line 308
    invoke-virtual {v5, v3}, LU/y;->a(Z)J

    .line 309
    .line 310
    .line 311
    move-result-wide v18

    .line 312
    const/16 v21, 0x2

    .line 313
    .line 314
    const/16 v22, 0x0

    .line 315
    .line 316
    const/16 v20, 0x0

    .line 317
    .line 318
    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    sget-object v10, LR0/h;->b:LR0/h$a;

    .line 323
    .line 324
    invoke-virtual {v10}, LR0/h$a;->a()I

    .line 325
    .line 326
    .line 327
    move-result v15

    .line 328
    invoke-virtual {v9}, LX/g;->c()F

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    int-to-float v2, v2

    .line 333
    div-float/2addr v9, v2

    .line 334
    invoke-static {v9}, Li1/h;->n(F)F

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    const/16 v13, 0x36

    .line 339
    .line 340
    const/4 v14, 0x4

    .line 341
    move v2, v8

    .line 342
    const/4 v8, 0x0

    .line 343
    const-wide/16 v10, 0x0

    .line 344
    .line 345
    invoke-static/range {v8 .. v14}, Landroidx/compose/material3/a;->d(ZFJLY/m;II)Lx/G;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    invoke-static {v15}, LR0/h;->j(I)LR0/h;

    .line 350
    .line 351
    .line 352
    move-result-object v18

    .line 353
    const/16 v20, 0x8

    .line 354
    .line 355
    const/16 v21, 0x0

    .line 356
    .line 357
    const/16 v17, 0x0

    .line 358
    .line 359
    move-object v13, v0

    .line 360
    move-object/from16 v19, v1

    .line 361
    .line 362
    move-object v15, v8

    .line 363
    move-object/from16 v14, v16

    .line 364
    .line 365
    move/from16 v16, v3

    .line 366
    .line 367
    invoke-static/range {v13 .. v21}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;LB/m;Lx/G;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    move/from16 v9, v16

    .line 372
    .line 373
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    .line 374
    .line 375
    invoke-virtual {v1}, Ll0/e$a;->e()Ll0/e;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    const/4 v3, 0x0

    .line 380
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-static {v12, v3}, LY/h;->a(LY/m;I)I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    invoke-interface {v12}, LY/m;->r()LY/I;

    .line 389
    .line 390
    .line 391
    move-result-object v8

    .line 392
    invoke-static {v12, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    sget-object v10, LK0/g;->M:LK0/g$a;

    .line 397
    .line 398
    invoke-virtual {v10}, LK0/g$a;->a()Lie/a;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    invoke-interface {v12}, LY/m;->j()LY/d;

    .line 403
    .line 404
    .line 405
    move-result-object v13

    .line 406
    if-nez v13, :cond_1c

    .line 407
    .line 408
    invoke-static {}, LY/h;->d()V

    .line 409
    .line 410
    .line 411
    :cond_1c
    invoke-interface {v12}, LY/m;->I()V

    .line 412
    .line 413
    .line 414
    invoke-interface {v12}, LY/m;->e()Z

    .line 415
    .line 416
    .line 417
    move-result v13

    .line 418
    if-eqz v13, :cond_1d

    .line 419
    .line 420
    invoke-interface {v12, v11}, LY/m;->h(Lie/a;)V

    .line 421
    .line 422
    .line 423
    goto :goto_12

    .line 424
    :cond_1d
    invoke-interface {v12}, LY/m;->s()V

    .line 425
    .line 426
    .line 427
    :goto_12
    invoke-static {v12}, LY/m2;->b(LY/m;)LY/m;

    .line 428
    .line 429
    .line 430
    move-result-object v11

    .line 431
    invoke-virtual {v10}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 432
    .line 433
    .line 434
    move-result-object v13

    .line 435
    invoke-static {v11, v1, v13}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v10}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-static {v11, v8, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v10}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-interface {v11}, LY/m;->e()Z

    .line 450
    .line 451
    .line 452
    move-result v8

    .line 453
    if-nez v8, :cond_1e

    .line 454
    .line 455
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v8

    .line 459
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 460
    .line 461
    .line 462
    move-result-object v13

    .line 463
    invoke-static {v8, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v8

    .line 467
    if-nez v8, :cond_1f

    .line 468
    .line 469
    :cond_1e
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v8

    .line 473
    invoke-interface {v11, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    invoke-interface {v11, v3, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 481
    .line 482
    .line 483
    :cond_1f
    invoke-virtual {v10}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-static {v11, v0, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 488
    .line 489
    .line 490
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 491
    .line 492
    invoke-virtual {v5, v9}, LU/y;->b(Z)J

    .line 493
    .line 494
    .line 495
    move-result-wide v0

    .line 496
    invoke-static {}, LU/s;->a()LY/b1;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-static {v0, v1}, Ls0/r0;->m(J)Ls0/r0;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v3, v0}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    sget v1, LY/c1;->i:I

    .line 509
    .line 510
    shr-int/lit8 v2, v2, 0xc

    .line 511
    .line 512
    and-int/lit8 v2, v2, 0x70

    .line 513
    .line 514
    or-int/2addr v1, v2

    .line 515
    invoke-static {v0, v6, v12, v1}, LY/H;->c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 516
    .line 517
    .line 518
    invoke-interface {v12}, LY/m;->x()V

    .line 519
    .line 520
    .line 521
    invoke-static {}, LY/w;->L()Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    if-eqz v0, :cond_20

    .line 526
    .line 527
    invoke-static {}, LY/w;->T()V

    .line 528
    .line 529
    .line 530
    :cond_20
    move-object v2, v4

    .line 531
    move-object v4, v5

    .line 532
    move-object v5, v14

    .line 533
    goto/16 :goto_c

    .line 534
    .line 535
    :goto_13
    invoke-interface {v12}, LY/m;->k()LY/B1;

    .line 536
    .line 537
    .line 538
    move-result-object v9

    .line 539
    if-eqz v9, :cond_21

    .line 540
    .line 541
    new-instance v0, LU/A$a;

    .line 542
    .line 543
    move-object/from16 v1, p0

    .line 544
    .line 545
    move/from16 v8, p8

    .line 546
    .line 547
    invoke-direct/range {v0 .. v8}, LU/A$a;-><init>(Lie/a;Landroidx/compose/ui/e;ZLU/y;LB/m;Lkotlin/jvm/functions/Function2;II)V

    .line 548
    .line 549
    .line 550
    invoke-interface {v9, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 551
    .line 552
    .line 553
    :cond_21
    return-void
.end method
