.class public final LY0/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;LY0/L;I)Ljava/util/List;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    move-object v5, v4

    .line 23
    check-cast v5, LY0/t;

    .line 24
    .line 25
    invoke-interface {v5}, LY0/t;->b()LY0/L;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-static {v6, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    invoke-interface {v5}, LY0/t;->c()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-static {v5, p3}, LY0/H;->f(II)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    move v3, v2

    .line 72
    :goto_1
    if-ge v3, v1, :cond_4

    .line 73
    .line 74
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    move-object v5, v4

    .line 79
    check-cast v5, LY0/t;

    .line 80
    .line 81
    invoke-interface {v5}, LY0/t;->c()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-static {v5, p3}, LY0/H;->f(II)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_3

    .line 90
    .line 91
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-eqz p3, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    move-object p1, v0

    .line 105
    :goto_2
    sget-object p3, LY0/L;->b:LY0/L$a;

    .line 106
    .line 107
    invoke-virtual {p3}, LY0/L$a;->j()LY0/L;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p2, v0}, LY0/L;->u(LY0/L;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    const/4 v1, 0x0

    .line 116
    if-gez v0, :cond_f

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    move-object v0, v1

    .line 123
    move v3, v2

    .line 124
    :goto_3
    if-ge v3, p3, :cond_b

    .line 125
    .line 126
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, LY0/t;

    .line 131
    .line 132
    invoke-interface {v4}, LY0/t;->b()LY0/L;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v4, p2}, LY0/L;->u(LY0/L;)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-gez v5, :cond_7

    .line 141
    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    invoke-virtual {v4, v1}, LY0/L;->u(LY0/L;)I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-lez v5, :cond_9

    .line 149
    .line 150
    :cond_6
    move-object v1, v4

    .line 151
    goto :goto_4

    .line 152
    :cond_7
    invoke-virtual {v4, p2}, LY0/L;->u(LY0/L;)I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-lez v5, :cond_a

    .line 157
    .line 158
    if-eqz v0, :cond_8

    .line 159
    .line 160
    invoke-virtual {v4, v0}, LY0/L;->u(LY0/L;)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-gez v5, :cond_9

    .line 165
    .line 166
    :cond_8
    move-object v0, v4

    .line 167
    :cond_9
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_a
    move-object v0, v4

    .line 171
    move-object v1, v0

    .line 172
    :cond_b
    if-nez v1, :cond_c

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_c
    move-object v0, v1

    .line 176
    :goto_5
    new-instance p2, Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result p3

    .line 182
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 186
    .line 187
    .line 188
    move-result p3

    .line 189
    :goto_6
    if-ge v2, p3, :cond_e

    .line 190
    .line 191
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    move-object v3, v1

    .line 196
    check-cast v3, LY0/t;

    .line 197
    .line 198
    invoke-interface {v3}, LY0/t;->b()LY0/L;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_d

    .line 207
    .line 208
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_e
    return-object p2

    .line 215
    :cond_f
    invoke-virtual {p3}, LY0/L$a;->k()LY0/L;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {p2, v0}, LY0/L;->u(LY0/L;)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-lez v0, :cond_19

    .line 224
    .line 225
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 226
    .line 227
    .line 228
    move-result p3

    .line 229
    move-object v0, v1

    .line 230
    move v3, v2

    .line 231
    :goto_7
    if-ge v3, p3, :cond_15

    .line 232
    .line 233
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    check-cast v4, LY0/t;

    .line 238
    .line 239
    invoke-interface {v4}, LY0/t;->b()LY0/L;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v4, p2}, LY0/L;->u(LY0/L;)I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-gez v5, :cond_11

    .line 248
    .line 249
    if-eqz v1, :cond_10

    .line 250
    .line 251
    invoke-virtual {v4, v1}, LY0/L;->u(LY0/L;)I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-lez v5, :cond_13

    .line 256
    .line 257
    :cond_10
    move-object v1, v4

    .line 258
    goto :goto_8

    .line 259
    :cond_11
    invoke-virtual {v4, p2}, LY0/L;->u(LY0/L;)I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    if-lez v5, :cond_14

    .line 264
    .line 265
    if-eqz v0, :cond_12

    .line 266
    .line 267
    invoke-virtual {v4, v0}, LY0/L;->u(LY0/L;)I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-gez v5, :cond_13

    .line 272
    .line 273
    :cond_12
    move-object v0, v4

    .line 274
    :cond_13
    :goto_8
    add-int/lit8 v3, v3, 0x1

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_14
    move-object v0, v4

    .line 278
    move-object v1, v0

    .line 279
    :cond_15
    if-nez v0, :cond_16

    .line 280
    .line 281
    move-object v0, v1

    .line 282
    :cond_16
    new-instance p2, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 285
    .line 286
    .line 287
    move-result p3

    .line 288
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 292
    .line 293
    .line 294
    move-result p3

    .line 295
    :goto_9
    if-ge v2, p3, :cond_18

    .line 296
    .line 297
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    move-object v3, v1

    .line 302
    check-cast v3, LY0/t;

    .line 303
    .line 304
    invoke-interface {v3}, LY0/t;->b()LY0/L;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_17

    .line 313
    .line 314
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    :cond_17
    add-int/lit8 v2, v2, 0x1

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_18
    return-object p2

    .line 321
    :cond_19
    invoke-virtual {p3}, LY0/L$a;->k()LY0/L;

    .line 322
    .line 323
    .line 324
    move-result-object p3

    .line 325
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    move-object v4, v1

    .line 330
    move-object v5, v4

    .line 331
    move v3, v2

    .line 332
    :goto_a
    if-ge v3, v0, :cond_20

    .line 333
    .line 334
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    check-cast v6, LY0/t;

    .line 339
    .line 340
    invoke-interface {v6}, LY0/t;->b()LY0/L;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    if-eqz p3, :cond_1a

    .line 345
    .line 346
    invoke-virtual {v6, p3}, LY0/L;->u(LY0/L;)I

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    if-lez v7, :cond_1a

    .line 351
    .line 352
    goto :goto_b

    .line 353
    :cond_1a
    invoke-virtual {v6, p2}, LY0/L;->u(LY0/L;)I

    .line 354
    .line 355
    .line 356
    move-result v7

    .line 357
    if-gez v7, :cond_1c

    .line 358
    .line 359
    if-eqz v4, :cond_1b

    .line 360
    .line 361
    invoke-virtual {v6, v4}, LY0/L;->u(LY0/L;)I

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    if-lez v7, :cond_1e

    .line 366
    .line 367
    :cond_1b
    move-object v4, v6

    .line 368
    goto :goto_b

    .line 369
    :cond_1c
    invoke-virtual {v6, p2}, LY0/L;->u(LY0/L;)I

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    if-lez v7, :cond_1f

    .line 374
    .line 375
    if-eqz v5, :cond_1d

    .line 376
    .line 377
    invoke-virtual {v6, v5}, LY0/L;->u(LY0/L;)I

    .line 378
    .line 379
    .line 380
    move-result v7

    .line 381
    if-gez v7, :cond_1e

    .line 382
    .line 383
    :cond_1d
    move-object v5, v6

    .line 384
    :cond_1e
    :goto_b
    add-int/lit8 v3, v3, 0x1

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_1f
    move-object v4, v6

    .line 388
    move-object v5, v4

    .line 389
    :cond_20
    if-nez v5, :cond_21

    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_21
    move-object v4, v5

    .line 393
    :goto_c
    new-instance p3, Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 400
    .line 401
    .line 402
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    move v3, v2

    .line 407
    :goto_d
    if-ge v3, v0, :cond_23

    .line 408
    .line 409
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    move-object v6, v5

    .line 414
    check-cast v6, LY0/t;

    .line 415
    .line 416
    invoke-interface {v6}, LY0/t;->b()LY0/L;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    if-eqz v6, :cond_22

    .line 425
    .line 426
    invoke-interface {p3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    :cond_22
    add-int/lit8 v3, v3, 0x1

    .line 430
    .line 431
    goto :goto_d

    .line 432
    :cond_23
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_2e

    .line 437
    .line 438
    sget-object p3, LY0/L;->b:LY0/L$a;

    .line 439
    .line 440
    invoke-virtual {p3}, LY0/L$a;->k()LY0/L;

    .line 441
    .line 442
    .line 443
    move-result-object p3

    .line 444
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    move-object v3, v1

    .line 449
    move v4, v2

    .line 450
    :goto_e
    if-ge v4, v0, :cond_2a

    .line 451
    .line 452
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    check-cast v5, LY0/t;

    .line 457
    .line 458
    invoke-interface {v5}, LY0/t;->b()LY0/L;

    .line 459
    .line 460
    .line 461
    move-result-object v5

    .line 462
    if-eqz p3, :cond_24

    .line 463
    .line 464
    invoke-virtual {v5, p3}, LY0/L;->u(LY0/L;)I

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    if-gez v6, :cond_24

    .line 469
    .line 470
    goto :goto_f

    .line 471
    :cond_24
    invoke-virtual {v5, p2}, LY0/L;->u(LY0/L;)I

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    if-gez v6, :cond_26

    .line 476
    .line 477
    if-eqz v1, :cond_25

    .line 478
    .line 479
    invoke-virtual {v5, v1}, LY0/L;->u(LY0/L;)I

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    if-lez v6, :cond_28

    .line 484
    .line 485
    :cond_25
    move-object v1, v5

    .line 486
    goto :goto_f

    .line 487
    :cond_26
    invoke-virtual {v5, p2}, LY0/L;->u(LY0/L;)I

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-lez v6, :cond_29

    .line 492
    .line 493
    if-eqz v3, :cond_27

    .line 494
    .line 495
    invoke-virtual {v5, v3}, LY0/L;->u(LY0/L;)I

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    if-gez v6, :cond_28

    .line 500
    .line 501
    :cond_27
    move-object v3, v5

    .line 502
    :cond_28
    :goto_f
    add-int/lit8 v4, v4, 0x1

    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_29
    move-object v1, v5

    .line 506
    move-object v3, v1

    .line 507
    :cond_2a
    if-nez v3, :cond_2b

    .line 508
    .line 509
    goto :goto_10

    .line 510
    :cond_2b
    move-object v1, v3

    .line 511
    :goto_10
    new-instance p2, Ljava/util/ArrayList;

    .line 512
    .line 513
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 514
    .line 515
    .line 516
    move-result p3

    .line 517
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 518
    .line 519
    .line 520
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 521
    .line 522
    .line 523
    move-result p3

    .line 524
    :goto_11
    if-ge v2, p3, :cond_2d

    .line 525
    .line 526
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    move-object v3, v0

    .line 531
    check-cast v3, LY0/t;

    .line 532
    .line 533
    invoke-interface {v3}, LY0/t;->b()LY0/L;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    if-eqz v3, :cond_2c

    .line 542
    .line 543
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    :cond_2c
    add-int/lit8 v2, v2, 0x1

    .line 547
    .line 548
    goto :goto_11

    .line 549
    :cond_2d
    return-object p2

    .line 550
    :cond_2e
    return-object p3
.end method
