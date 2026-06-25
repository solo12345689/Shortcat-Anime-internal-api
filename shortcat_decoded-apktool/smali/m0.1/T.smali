.class public abstract Lm0/T;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Landroid/view/ViewStructure;LR0/n;Landroid/view/autofill/AutofillId;Ljava/lang/String;LS0/b;)V
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lm0/x;->a:Lm0/x;

    .line 4
    .line 5
    sget-object v2, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    sget-object v3, LR0/l;->a:LR0/l;

    .line 8
    .line 9
    invoke-interface/range {p1 .. p1}, LR0/n;->e()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    const/4 v10, 0x2

    .line 14
    const/16 v13, 0x8

    .line 15
    .line 16
    const-wide/16 v16, 0x80

    .line 17
    .line 18
    if-eqz v4, :cond_13

    .line 19
    .line 20
    invoke-virtual {v4}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->t()Lt/P;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_13

    .line 25
    .line 26
    iget-object v5, v4, Lt/c0;->b:[Ljava/lang/Object;

    .line 27
    .line 28
    const-wide/16 v18, 0xff

    .line 29
    .line 30
    iget-object v7, v4, Lt/c0;->c:[Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v4, v4, Lt/c0;->a:[J

    .line 33
    .line 34
    array-length v8, v4

    .line 35
    sub-int/2addr v8, v10

    .line 36
    move/from16 v30, v10

    .line 37
    .line 38
    if-ltz v8, :cond_11

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/16 v20, 0x7

    .line 42
    .line 43
    const/16 v21, 0x0

    .line 44
    .line 45
    const/16 v22, 0x0

    .line 46
    .line 47
    const/16 v23, 0x0

    .line 48
    .line 49
    const/16 v24, 0x0

    .line 50
    .line 51
    const/16 v25, 0x0

    .line 52
    .line 53
    const/16 v26, 0x0

    .line 54
    .line 55
    const/16 v27, 0x0

    .line 56
    .line 57
    const/16 v28, 0x0

    .line 58
    .line 59
    const/16 v29, 0x0

    .line 60
    .line 61
    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    :goto_0
    aget-wide v10, v4, v9

    .line 67
    .line 68
    move-object/from16 v33, v7

    .line 69
    .line 70
    not-long v6, v10

    .line 71
    shl-long v6, v6, v20

    .line 72
    .line 73
    and-long/2addr v6, v10

    .line 74
    and-long v6, v6, v31

    .line 75
    .line 76
    cmp-long v6, v6, v31

    .line 77
    .line 78
    if-eqz v6, :cond_10

    .line 79
    .line 80
    sub-int v6, v9, v8

    .line 81
    .line 82
    not-int v6, v6

    .line 83
    ushr-int/lit8 v6, v6, 0x1f

    .line 84
    .line 85
    rsub-int/lit8 v6, v6, 0x8

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    :goto_1
    if-ge v7, v6, :cond_f

    .line 89
    .line 90
    and-long v34, v10, v18

    .line 91
    .line 92
    cmp-long v34, v34, v16

    .line 93
    .line 94
    if-gez v34, :cond_d

    .line 95
    .line 96
    shl-int/lit8 v34, v9, 0x3

    .line 97
    .line 98
    add-int v34, v34, v7

    .line 99
    .line 100
    aget-object v35, v5, v34

    .line 101
    .line 102
    aget-object v12, v33, v34

    .line 103
    .line 104
    move-object/from16 v15, v35

    .line 105
    .line 106
    check-cast v15, LR0/B;

    .line 107
    .line 108
    move/from16 v35, v13

    .line 109
    .line 110
    invoke-virtual {v2}, LR0/x;->c()LR0/B;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-eqz v13, :cond_0

    .line 119
    .line 120
    const-string v13, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType"

    .line 121
    .line 122
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    move-object/from16 v21, v12

    .line 126
    .line 127
    check-cast v21, Lm0/I;

    .line 128
    .line 129
    goto/16 :goto_2

    .line 130
    .line 131
    :cond_0
    invoke-virtual {v2}, LR0/x;->d()LR0/B;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_1

    .line 140
    .line 141
    const-string v13, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 142
    .line 143
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    check-cast v12, Ljava/util/List;

    .line 147
    .line 148
    invoke-static {v12}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    check-cast v12, Ljava/lang/String;

    .line 153
    .line 154
    if-eqz v12, :cond_e

    .line 155
    .line 156
    invoke-virtual {v0, v1, v12}, Lm0/x;->p(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_2

    .line 160
    .line 161
    :cond_1
    invoke-virtual {v2}, LR0/x;->e()LR0/B;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    if-eqz v13, :cond_2

    .line 170
    .line 171
    const-string v13, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType"

    .line 172
    .line 173
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    move-object/from16 v24, v12

    .line 177
    .line 178
    check-cast v24, Lm0/K;

    .line 179
    .line 180
    goto/16 :goto_2

    .line 181
    .line 182
    :cond_2
    invoke-virtual {v2}, LR0/x;->g()LR0/B;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    if-eqz v13, :cond_3

    .line 191
    .line 192
    const-string v13, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString"

    .line 193
    .line 194
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v29, v12

    .line 198
    .line 199
    check-cast v29, LU0/e;

    .line 200
    .line 201
    goto/16 :goto_2

    .line 202
    .line 203
    :cond_3
    invoke-virtual {v2}, LR0/x;->i()LR0/B;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    const-string v14, "null cannot be cast to non-null type kotlin.Boolean"

    .line 212
    .line 213
    if-eqz v13, :cond_4

    .line 214
    .line 215
    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    check-cast v12, Ljava/lang/Boolean;

    .line 219
    .line 220
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    invoke-virtual {v0, v1, v12}, Lm0/x;->u(Landroid/view/ViewStructure;Z)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_2

    .line 228
    .line 229
    :cond_4
    invoke-virtual {v2}, LR0/x;->z()LR0/B;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    if-eqz v13, :cond_5

    .line 238
    .line 239
    const-string v13, "null cannot be cast to non-null type kotlin.Int"

    .line 240
    .line 241
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    move-object/from16 v28, v12

    .line 245
    .line 246
    check-cast v28, Ljava/lang/Integer;

    .line 247
    .line 248
    goto/16 :goto_2

    .line 249
    .line 250
    :cond_5
    invoke-virtual {v2}, LR0/x;->B()LR0/B;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    if-eqz v13, :cond_6

    .line 259
    .line 260
    const/16 v27, 0x1

    .line 261
    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :cond_6
    invoke-virtual {v2}, LR0/x;->D()LR0/B;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    if-eqz v13, :cond_7

    .line 273
    .line 274
    const-string v13, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role"

    .line 275
    .line 276
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v26, v12

    .line 280
    .line 281
    check-cast v26, LR0/h;

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_7
    invoke-virtual {v2}, LR0/x;->F()LR0/B;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    if-eqz v13, :cond_8

    .line 293
    .line 294
    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    move-object/from16 v25, v12

    .line 298
    .line 299
    check-cast v25, Ljava/lang/Boolean;

    .line 300
    .line 301
    goto :goto_2

    .line 302
    :cond_8
    invoke-virtual {v2}, LR0/x;->M()LR0/B;

    .line 303
    .line 304
    .line 305
    move-result-object v13

    .line 306
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v13

    .line 310
    if-eqz v13, :cond_9

    .line 311
    .line 312
    const-string v13, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState"

    .line 313
    .line 314
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    move-object/from16 v23, v12

    .line 318
    .line 319
    check-cast v23, LT0/a;

    .line 320
    .line 321
    goto :goto_2

    .line 322
    :cond_9
    invoke-virtual {v3}, LR0/l;->l()LR0/B;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    invoke-static {v15, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v12

    .line 330
    if-eqz v12, :cond_a

    .line 331
    .line 332
    const/4 v12, 0x1

    .line 333
    invoke-virtual {v0, v1, v12}, Lm0/x;->o(Landroid/view/ViewStructure;Z)V

    .line 334
    .line 335
    .line 336
    goto :goto_2

    .line 337
    :cond_a
    const/4 v12, 0x1

    .line 338
    invoke-virtual {v3}, LR0/l;->n()LR0/B;

    .line 339
    .line 340
    .line 341
    move-result-object v13

    .line 342
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v13

    .line 346
    if-eqz v13, :cond_b

    .line 347
    .line 348
    invoke-virtual {v0, v1, v12}, Lm0/x;->x(Landroid/view/ViewStructure;Z)V

    .line 349
    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_b
    invoke-virtual {v3}, LR0/l;->t()LR0/B;

    .line 353
    .line 354
    .line 355
    move-result-object v13

    .line 356
    invoke-static {v15, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    if-eqz v13, :cond_c

    .line 361
    .line 362
    invoke-virtual {v0, v1, v12}, Lm0/x;->t(Landroid/view/ViewStructure;Z)V

    .line 363
    .line 364
    .line 365
    goto :goto_2

    .line 366
    :cond_c
    invoke-virtual {v3}, LR0/l;->z()LR0/B;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    invoke-static {v15, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v12

    .line 374
    if-eqz v12, :cond_e

    .line 375
    .line 376
    const/16 v22, 0x1

    .line 377
    .line 378
    goto :goto_2

    .line 379
    :cond_d
    move/from16 v35, v13

    .line 380
    .line 381
    :cond_e
    :goto_2
    shr-long v10, v10, v35

    .line 382
    .line 383
    add-int/lit8 v7, v7, 0x1

    .line 384
    .line 385
    move/from16 v13, v35

    .line 386
    .line 387
    goto/16 :goto_1

    .line 388
    .line 389
    :cond_f
    move v7, v13

    .line 390
    if-ne v6, v7, :cond_12

    .line 391
    .line 392
    :cond_10
    if-eq v9, v8, :cond_12

    .line 393
    .line 394
    add-int/lit8 v9, v9, 0x1

    .line 395
    .line 396
    move-object/from16 v7, v33

    .line 397
    .line 398
    const/16 v13, 0x8

    .line 399
    .line 400
    goto/16 :goto_0

    .line 401
    .line 402
    :cond_11
    const/16 v20, 0x7

    .line 403
    .line 404
    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    const/16 v21, 0x0

    .line 410
    .line 411
    const/16 v22, 0x0

    .line 412
    .line 413
    const/16 v23, 0x0

    .line 414
    .line 415
    const/16 v24, 0x0

    .line 416
    .line 417
    const/16 v25, 0x0

    .line 418
    .line 419
    const/16 v26, 0x0

    .line 420
    .line 421
    const/16 v27, 0x0

    .line 422
    .line 423
    const/16 v28, 0x0

    .line 424
    .line 425
    const/16 v29, 0x0

    .line 426
    .line 427
    :cond_12
    move-object/from16 v6, v23

    .line 428
    .line 429
    goto :goto_3

    .line 430
    :cond_13
    move/from16 v30, v10

    .line 431
    .line 432
    const-wide/16 v18, 0xff

    .line 433
    .line 434
    const/16 v20, 0x7

    .line 435
    .line 436
    const-wide v31, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    const/4 v6, 0x0

    .line 442
    const/16 v21, 0x0

    .line 443
    .line 444
    const/16 v22, 0x0

    .line 445
    .line 446
    const/16 v24, 0x0

    .line 447
    .line 448
    const/16 v25, 0x0

    .line 449
    .line 450
    const/16 v26, 0x0

    .line 451
    .line 452
    const/16 v27, 0x0

    .line 453
    .line 454
    const/16 v28, 0x0

    .line 455
    .line 456
    const/16 v29, 0x0

    .line 457
    .line 458
    :goto_3
    invoke-static/range {p1 .. p1}, LR0/o;->a(LR0/n;)Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    if-eqz v3, :cond_19

    .line 463
    .line 464
    invoke-virtual {v3}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->t()Lt/P;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    if-eqz v3, :cond_19

    .line 469
    .line 470
    iget-object v4, v3, Lt/c0;->b:[Ljava/lang/Object;

    .line 471
    .line 472
    iget-object v5, v3, Lt/c0;->c:[Ljava/lang/Object;

    .line 473
    .line 474
    iget-object v3, v3, Lt/c0;->a:[J

    .line 475
    .line 476
    array-length v7, v3

    .line 477
    add-int/lit8 v7, v7, -0x2

    .line 478
    .line 479
    if-ltz v7, :cond_19

    .line 480
    .line 481
    const/4 v8, 0x0

    .line 482
    const/4 v9, 0x0

    .line 483
    :goto_4
    aget-wide v10, v3, v8

    .line 484
    .line 485
    not-long v12, v10

    .line 486
    shl-long v12, v12, v20

    .line 487
    .line 488
    and-long/2addr v12, v10

    .line 489
    and-long v12, v12, v31

    .line 490
    .line 491
    cmp-long v12, v12, v31

    .line 492
    .line 493
    if-eqz v12, :cond_18

    .line 494
    .line 495
    sub-int v12, v8, v7

    .line 496
    .line 497
    not-int v12, v12

    .line 498
    ushr-int/lit8 v12, v12, 0x1f

    .line 499
    .line 500
    const/16 v35, 0x8

    .line 501
    .line 502
    rsub-int/lit8 v13, v12, 0x8

    .line 503
    .line 504
    const/4 v12, 0x0

    .line 505
    :goto_5
    if-ge v12, v13, :cond_17

    .line 506
    .line 507
    and-long v14, v10, v18

    .line 508
    .line 509
    cmp-long v14, v14, v16

    .line 510
    .line 511
    if-gez v14, :cond_16

    .line 512
    .line 513
    shl-int/lit8 v14, v8, 0x3

    .line 514
    .line 515
    add-int/2addr v14, v12

    .line 516
    aget-object v15, v4, v14

    .line 517
    .line 518
    aget-object v14, v5, v14

    .line 519
    .line 520
    check-cast v15, LR0/B;

    .line 521
    .line 522
    move-object/from16 v23, v2

    .line 523
    .line 524
    invoke-virtual/range {v23 .. v23}, LR0/x;->f()LR0/B;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    invoke-static {v15, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-eqz v2, :cond_14

    .line 533
    .line 534
    const/4 v2, 0x0

    .line 535
    invoke-virtual {v0, v1, v2}, Lm0/x;->s(Landroid/view/ViewStructure;Z)V

    .line 536
    .line 537
    .line 538
    goto :goto_6

    .line 539
    :cond_14
    invoke-virtual/range {v23 .. v23}, LR0/x;->J()LR0/B;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    invoke-static {v15, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    if-eqz v2, :cond_15

    .line 548
    .line 549
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>"

    .line 550
    .line 551
    invoke-static {v14, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    move-object v9, v14

    .line 555
    check-cast v9, Ljava/util/List;

    .line 556
    .line 557
    :cond_15
    :goto_6
    const/16 v2, 0x8

    .line 558
    .line 559
    goto :goto_7

    .line 560
    :cond_16
    move-object/from16 v23, v2

    .line 561
    .line 562
    goto :goto_6

    .line 563
    :goto_7
    shr-long/2addr v10, v2

    .line 564
    add-int/lit8 v12, v12, 0x1

    .line 565
    .line 566
    move-object/from16 v2, v23

    .line 567
    .line 568
    goto :goto_5

    .line 569
    :cond_17
    move-object/from16 v23, v2

    .line 570
    .line 571
    const/16 v2, 0x8

    .line 572
    .line 573
    if-ne v13, v2, :cond_1a

    .line 574
    .line 575
    goto :goto_8

    .line 576
    :cond_18
    move-object/from16 v23, v2

    .line 577
    .line 578
    const/16 v2, 0x8

    .line 579
    .line 580
    :goto_8
    if-eq v8, v7, :cond_1a

    .line 581
    .line 582
    add-int/lit8 v8, v8, 0x1

    .line 583
    .line 584
    move-object/from16 v2, v23

    .line 585
    .line 586
    goto :goto_4

    .line 587
    :cond_19
    const/4 v9, 0x0

    .line 588
    :cond_1a
    invoke-interface/range {p1 .. p1}, LI0/t;->y()I

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    invoke-interface/range {p1 .. p1}, LR0/n;->g()LR0/n;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    if-nez v3, :cond_1b

    .line 601
    .line 602
    const/4 v2, 0x0

    .line 603
    :cond_1b
    if-eqz v2, :cond_1c

    .line 604
    .line 605
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    :goto_9
    move-object/from16 v3, p2

    .line 610
    .line 611
    goto :goto_a

    .line 612
    :cond_1c
    const/4 v2, -0x1

    .line 613
    goto :goto_9

    .line 614
    :goto_a
    invoke-virtual {v0, v1, v3, v2}, Lm0/x;->i(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    .line 615
    .line 616
    .line 617
    const/4 v4, 0x0

    .line 618
    const/4 v5, 0x0

    .line 619
    move-object/from16 v3, p3

    .line 620
    .line 621
    const/16 v36, 0x0

    .line 622
    .line 623
    invoke-virtual/range {v0 .. v5}, Lm0/x;->v(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    if-eqz v21, :cond_1d

    .line 627
    .line 628
    invoke-static/range {v21 .. v21}, Lm0/J;->b(Lm0/I;)I

    .line 629
    .line 630
    .line 631
    move-result v2

    .line 632
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    .line 634
    .line 635
    move-result-object v15

    .line 636
    goto :goto_b

    .line 637
    :cond_1d
    if-eqz v22, :cond_1e

    .line 638
    .line 639
    const/16 v37, 0x1

    .line 640
    .line 641
    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 642
    .line 643
    .line 644
    move-result-object v15

    .line 645
    goto :goto_b

    .line 646
    :cond_1e
    if-eqz v6, :cond_1f

    .line 647
    .line 648
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 649
    .line 650
    .line 651
    move-result-object v15

    .line 652
    goto :goto_b

    .line 653
    :cond_1f
    const/4 v15, 0x0

    .line 654
    :goto_b
    if-eqz v15, :cond_20

    .line 655
    .line 656
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    invoke-virtual {v0, v1, v2}, Lm0/x;->j(Landroid/view/ViewStructure;I)V

    .line 661
    .line 662
    .line 663
    :cond_20
    if-eqz v24, :cond_21

    .line 664
    .line 665
    invoke-static/range {v24 .. v24}, Lm0/L;->b(Lm0/K;)[Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    if-eqz v2, :cond_21

    .line 670
    .line 671
    invoke-virtual {v0, v1, v2}, Lm0/x;->h(Landroid/view/ViewStructure;[Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    :cond_21
    invoke-virtual/range {p4 .. p4}, LS0/b;->d()LS0/a;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-interface/range {p1 .. p1}, LI0/t;->y()I

    .line 679
    .line 680
    .line 681
    move-result v3

    .line 682
    new-instance v4, Lm0/T$a;

    .line 683
    .line 684
    invoke-direct {v4, v0, v1}, Lm0/T$a;-><init>(Lm0/x;Landroid/view/ViewStructure;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2, v3, v4}, LS0/a;->l(ILie/p;)Z

    .line 688
    .line 689
    .line 690
    if-eqz v25, :cond_22

    .line 691
    .line 692
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 693
    .line 694
    .line 695
    move-result v2

    .line 696
    invoke-virtual {v0, v1, v2}, Lm0/x;->y(Landroid/view/ViewStructure;Z)V

    .line 697
    .line 698
    .line 699
    :cond_22
    if-eqz v6, :cond_24

    .line 700
    .line 701
    const/4 v12, 0x1

    .line 702
    invoke-virtual {v0, v1, v12}, Lm0/x;->l(Landroid/view/ViewStructure;Z)V

    .line 703
    .line 704
    .line 705
    sget-object v2, LT0/a;->a:LT0/a;

    .line 706
    .line 707
    if-ne v6, v2, :cond_23

    .line 708
    .line 709
    const/4 v2, 0x1

    .line 710
    goto :goto_c

    .line 711
    :cond_23
    move/from16 v2, v36

    .line 712
    .line 713
    :goto_c
    invoke-virtual {v0, v1, v2}, Lm0/x;->m(Landroid/view/ViewStructure;Z)V

    .line 714
    .line 715
    .line 716
    goto :goto_e

    .line 717
    :cond_24
    if-eqz v25, :cond_26

    .line 718
    .line 719
    sget-object v2, LR0/h;->b:LR0/h$a;

    .line 720
    .line 721
    invoke-virtual {v2}, LR0/h$a;->h()I

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    if-nez v26, :cond_25

    .line 726
    .line 727
    move/from16 v2, v36

    .line 728
    .line 729
    goto :goto_d

    .line 730
    :cond_25
    invoke-virtual/range {v26 .. v26}, LR0/h;->p()I

    .line 731
    .line 732
    .line 733
    move-result v3

    .line 734
    invoke-static {v3, v2}, LR0/h;->m(II)Z

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    :goto_d
    if-nez v2, :cond_26

    .line 739
    .line 740
    const/4 v12, 0x1

    .line 741
    invoke-virtual {v0, v1, v12}, Lm0/x;->l(Landroid/view/ViewStructure;Z)V

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    invoke-virtual {v0, v1, v2}, Lm0/x;->m(Landroid/view/ViewStructure;Z)V

    .line 749
    .line 750
    .line 751
    :cond_26
    :goto_e
    sget-object v2, Lm0/K;->a:Lm0/K$a;

    .line 752
    .line 753
    invoke-virtual {v2}, Lm0/K$a;->a()Lm0/K;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    invoke-static {v2}, Lm0/L;->b(Lm0/K;)[Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    invoke-static {v2}, LUd/n;->X([Ljava/lang/Object;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    check-cast v2, Ljava/lang/String;

    .line 766
    .line 767
    if-eqz v24, :cond_27

    .line 768
    .line 769
    invoke-static/range {v24 .. v24}, Lm0/L;->b(Lm0/K;)[Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    if-eqz v3, :cond_27

    .line 774
    .line 775
    invoke-static {v3, v2}, LUd/n;->R([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v2

    .line 779
    const/4 v12, 0x1

    .line 780
    if-ne v2, v12, :cond_27

    .line 781
    .line 782
    const/4 v2, 0x1

    .line 783
    goto :goto_f

    .line 784
    :cond_27
    move/from16 v2, v36

    .line 785
    .line 786
    :goto_f
    if-nez v27, :cond_29

    .line 787
    .line 788
    if-eqz v2, :cond_28

    .line 789
    .line 790
    goto :goto_10

    .line 791
    :cond_28
    move/from16 v2, v36

    .line 792
    .line 793
    goto :goto_11

    .line 794
    :cond_29
    :goto_10
    const/4 v2, 0x1

    .line 795
    :goto_11
    if-eqz v2, :cond_2a

    .line 796
    .line 797
    const/4 v12, 0x1

    .line 798
    invoke-virtual {v0, v1, v12}, Lm0/x;->q(Landroid/view/ViewStructure;Z)V

    .line 799
    .line 800
    .line 801
    :cond_2a
    invoke-interface/range {p1 .. p1}, LR0/n;->q()Z

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    if-eqz v3, :cond_2b

    .line 806
    .line 807
    const/4 v3, 0x4

    .line 808
    goto :goto_12

    .line 809
    :cond_2b
    move/from16 v3, v36

    .line 810
    .line 811
    :goto_12
    invoke-virtual {v0, v1, v3}, Lm0/x;->A(Landroid/view/ViewStructure;I)V

    .line 812
    .line 813
    .line 814
    if-eqz v9, :cond_2d

    .line 815
    .line 816
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 817
    .line 818
    .line 819
    move-result v3

    .line 820
    const-string v4, ""

    .line 821
    .line 822
    move/from16 v6, v36

    .line 823
    .line 824
    :goto_13
    if-ge v6, v3, :cond_2c

    .line 825
    .line 826
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v5

    .line 830
    check-cast v5, LU0/e;

    .line 831
    .line 832
    new-instance v7, Ljava/lang/StringBuilder;

    .line 833
    .line 834
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v5}, LU0/e;->j()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v4

    .line 844
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    const/16 v4, 0xa

    .line 848
    .line 849
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v4

    .line 856
    add-int/lit8 v6, v6, 0x1

    .line 857
    .line 858
    goto :goto_13

    .line 859
    :cond_2c
    invoke-virtual {v0, v1, v4}, Lm0/x;->z(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    .line 860
    .line 861
    .line 862
    const-string v3, "android.widget.TextView"

    .line 863
    .line 864
    invoke-virtual {v0, v1, v3}, Lm0/x;->n(Landroid/view/ViewStructure;Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    :cond_2d
    invoke-interface/range {p1 .. p1}, LR0/n;->n()Ljava/util/List;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 872
    .line 873
    .line 874
    move-result v3

    .line 875
    if-eqz v3, :cond_2e

    .line 876
    .line 877
    if-eqz v26, :cond_2e

    .line 878
    .line 879
    invoke-virtual/range {v26 .. v26}, LR0/h;->p()I

    .line 880
    .line 881
    .line 882
    move-result v3

    .line 883
    invoke-static {v3}, Landroidx/compose/ui/platform/m1;->e(I)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v3

    .line 887
    if-eqz v3, :cond_2e

    .line 888
    .line 889
    invoke-virtual {v0, v1, v3}, Lm0/x;->n(Landroid/view/ViewStructure;Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    :cond_2e
    if-eqz v22, :cond_31

    .line 893
    .line 894
    const-string v3, "android.widget.EditText"

    .line 895
    .line 896
    invoke-virtual {v0, v1, v3}, Lm0/x;->n(Landroid/view/ViewStructure;Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 900
    .line 901
    const/16 v4, 0x1c

    .line 902
    .line 903
    if-lt v3, v4, :cond_2f

    .line 904
    .line 905
    if-eqz v28, :cond_2f

    .line 906
    .line 907
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Number;->intValue()I

    .line 908
    .line 909
    .line 910
    move-result v3

    .line 911
    sget-object v4, Lm0/B;->a:Lm0/B;

    .line 912
    .line 913
    invoke-virtual {v4, v1, v3}, Lm0/B;->a(Landroid/view/ViewStructure;I)V

    .line 914
    .line 915
    .line 916
    :cond_2f
    if-eqz v29, :cond_30

    .line 917
    .line 918
    invoke-virtual/range {v29 .. v29}, LU0/e;->j()Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v3

    .line 922
    invoke-virtual {v0, v3}, Lm0/x;->b(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;

    .line 923
    .line 924
    .line 925
    move-result-object v3

    .line 926
    invoke-virtual {v0, v1, v3}, Lm0/x;->k(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V

    .line 927
    .line 928
    .line 929
    :cond_30
    if-eqz v2, :cond_31

    .line 930
    .line 931
    const/16 v2, 0x81

    .line 932
    .line 933
    invoke-virtual {v0, v1, v2}, Lm0/x;->w(Landroid/view/ViewStructure;I)V

    .line 934
    .line 935
    .line 936
    :cond_31
    return-void
.end method
