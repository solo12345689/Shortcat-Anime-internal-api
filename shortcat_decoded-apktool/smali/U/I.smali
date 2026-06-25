.class final LU/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/B;


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;

.field private final b:Z

.field private final c:F

.field private final d:LC/A;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZFLC/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU/I;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iput-boolean p2, p0, LU/I;->b:Z

    .line 7
    .line 8
    iput p3, p0, LU/I;->c:F

    .line 9
    .line 10
    iput-object p4, p0, LU/I;->d:LC/A;

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic a(LU/I;)F
    .locals 0

    .line 1
    iget p0, p0, LU/I;->c:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic b(LU/I;)LC/A;
    .locals 0

    .line 1
    iget-object p0, p0, LU/I;->d:LC/A;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(LU/I;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LU/I;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method private final d(LI0/m;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v6, 0x0

    .line 14
    :goto_0
    if-ge v6, v4, :cond_1

    .line 15
    .line 16
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    move-object v9, v8

    .line 21
    check-cast v9, LI0/l;

    .line 22
    .line 23
    invoke-static {v9}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    const-string v10, "Leading"

    .line 28
    .line 29
    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    if-eqz v9, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v8, 0x0

    .line 40
    :goto_1
    check-cast v8, LI0/l;

    .line 41
    .line 42
    const v4, 0x7fffffff

    .line 43
    .line 44
    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    invoke-interface {v8, v4}, LI0/l;->q0(I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    invoke-static {v2, v6}, LU/H;->g(II)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-interface {v3, v8, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    check-cast v8, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v6, v2

    .line 71
    const/4 v8, 0x0

    .line 72
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    const/4 v10, 0x0

    .line 77
    :goto_3
    if-ge v10, v9, :cond_4

    .line 78
    .line 79
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    move-object v12, v11

    .line 84
    check-cast v12, LI0/l;

    .line 85
    .line 86
    invoke-static {v12}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    const-string v13, "Trailing"

    .line 91
    .line 92
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    if-eqz v12, :cond_3

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    const/4 v11, 0x0

    .line 103
    :goto_4
    check-cast v11, LI0/l;

    .line 104
    .line 105
    if-eqz v11, :cond_5

    .line 106
    .line 107
    invoke-interface {v11, v4}, LI0/l;->q0(I)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    invoke-static {v6, v9}, LU/H;->g(II)I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-interface {v3, v11, v9}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    check-cast v9, Ljava/lang/Number;

    .line 124
    .line 125
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    goto :goto_5

    .line 130
    :cond_5
    const/4 v9, 0x0

    .line 131
    :goto_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    const/4 v11, 0x0

    .line 136
    :goto_6
    if-ge v11, v10, :cond_7

    .line 137
    .line 138
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    move-object v13, v12

    .line 143
    check-cast v13, LI0/l;

    .line 144
    .line 145
    invoke-static {v13}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    const-string v14, "Label"

    .line 150
    .line 151
    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_6

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_7
    const/4 v12, 0x0

    .line 162
    :goto_7
    check-cast v12, LI0/l;

    .line 163
    .line 164
    if-eqz v12, :cond_8

    .line 165
    .line 166
    iget v10, v0, LU/I;->c:F

    .line 167
    .line 168
    invoke-static {v6, v2, v10}, Lk1/b;->c(IIF)I

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    invoke-interface {v3, v12, v10}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    check-cast v10, Ljava/lang/Number;

    .line 181
    .line 182
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    move v13, v10

    .line 187
    goto :goto_8

    .line 188
    :cond_8
    const/4 v13, 0x0

    .line 189
    :goto_8
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    const/4 v11, 0x0

    .line 194
    :goto_9
    if-ge v11, v10, :cond_a

    .line 195
    .line 196
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    move-object v14, v12

    .line 201
    check-cast v14, LI0/l;

    .line 202
    .line 203
    invoke-static {v14}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    const-string v15, "Prefix"

    .line 208
    .line 209
    invoke-static {v14, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v14

    .line 213
    if-eqz v14, :cond_9

    .line 214
    .line 215
    goto :goto_a

    .line 216
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_a
    const/4 v12, 0x0

    .line 220
    :goto_a
    check-cast v12, LI0/l;

    .line 221
    .line 222
    if-eqz v12, :cond_b

    .line 223
    .line 224
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-interface {v3, v12, v10}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    check-cast v10, Ljava/lang/Number;

    .line 233
    .line 234
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    invoke-interface {v12, v4}, LI0/l;->q0(I)I

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    invoke-static {v6, v11}, LU/H;->g(II)I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    goto :goto_b

    .line 247
    :cond_b
    const/4 v10, 0x0

    .line 248
    :goto_b
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    const/4 v12, 0x0

    .line 253
    :goto_c
    if-ge v12, v11, :cond_d

    .line 254
    .line 255
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v14

    .line 259
    move-object v15, v14

    .line 260
    check-cast v15, LI0/l;

    .line 261
    .line 262
    invoke-static {v15}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v15

    .line 266
    const-string v5, "Suffix"

    .line 267
    .line 268
    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_c

    .line 273
    .line 274
    goto :goto_d

    .line 275
    :cond_c
    add-int/lit8 v12, v12, 0x1

    .line 276
    .line 277
    goto :goto_c

    .line 278
    :cond_d
    const/4 v14, 0x0

    .line 279
    :goto_d
    check-cast v14, LI0/l;

    .line 280
    .line 281
    if-eqz v14, :cond_e

    .line 282
    .line 283
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-interface {v3, v14, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    check-cast v5, Ljava/lang/Number;

    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    invoke-interface {v14, v4}, LI0/l;->q0(I)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    invoke-static {v6, v4}, LU/H;->g(II)I

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    move v11, v5

    .line 306
    goto :goto_e

    .line 307
    :cond_e
    const/4 v11, 0x0

    .line 308
    :goto_e
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    const/4 v5, 0x0

    .line 313
    :goto_f
    if-ge v5, v4, :cond_16

    .line 314
    .line 315
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    move-object v14, v12

    .line 320
    check-cast v14, LI0/l;

    .line 321
    .line 322
    invoke-static {v14}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v14

    .line 326
    const-string v15, "TextField"

    .line 327
    .line 328
    invoke-static {v14, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v14

    .line 332
    if-eqz v14, :cond_15

    .line 333
    .line 334
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    invoke-interface {v3, v12, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    check-cast v4, Ljava/lang/Number;

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    const/4 v5, 0x0

    .line 353
    :goto_10
    if-ge v5, v4, :cond_10

    .line 354
    .line 355
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v14

    .line 359
    move-object v15, v14

    .line 360
    check-cast v15, LI0/l;

    .line 361
    .line 362
    invoke-static {v15}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v15

    .line 366
    const-string v7, "Hint"

    .line 367
    .line 368
    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v7

    .line 372
    if-eqz v7, :cond_f

    .line 373
    .line 374
    goto :goto_11

    .line 375
    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 376
    .line 377
    goto :goto_10

    .line 378
    :cond_10
    const/4 v14, 0x0

    .line 379
    :goto_11
    check-cast v14, LI0/l;

    .line 380
    .line 381
    if-eqz v14, :cond_11

    .line 382
    .line 383
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    invoke-interface {v3, v14, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    check-cast v4, Ljava/lang/Number;

    .line 392
    .line 393
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    move v14, v4

    .line 398
    goto :goto_12

    .line 399
    :cond_11
    const/4 v14, 0x0

    .line 400
    :goto_12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    const/4 v5, 0x0

    .line 405
    :goto_13
    if-ge v5, v4, :cond_13

    .line 406
    .line 407
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    move-object v7, v6

    .line 412
    check-cast v7, LI0/l;

    .line 413
    .line 414
    invoke-static {v7}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    const-string v15, "Supporting"

    .line 419
    .line 420
    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    if-eqz v7, :cond_12

    .line 425
    .line 426
    move-object v7, v6

    .line 427
    goto :goto_14

    .line 428
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 429
    .line 430
    goto :goto_13

    .line 431
    :cond_13
    const/4 v7, 0x0

    .line 432
    :goto_14
    check-cast v7, LI0/l;

    .line 433
    .line 434
    if-eqz v7, :cond_14

    .line 435
    .line 436
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-interface {v3, v7, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    check-cast v1, Ljava/lang/Number;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    move v15, v5

    .line 451
    goto :goto_15

    .line 452
    :cond_14
    const/4 v15, 0x0

    .line 453
    :goto_15
    iget v1, v0, LU/I;->c:F

    .line 454
    .line 455
    invoke-static {}, LW/j;->s()J

    .line 456
    .line 457
    .line 458
    move-result-wide v17

    .line 459
    invoke-interface/range {p1 .. p1}, Li1/d;->getDensity()F

    .line 460
    .line 461
    .line 462
    move-result v19

    .line 463
    iget-object v2, v0, LU/I;->d:LC/A;

    .line 464
    .line 465
    move/from16 v16, v1

    .line 466
    .line 467
    move-object/from16 v20, v2

    .line 468
    .line 469
    invoke-static/range {v8 .. v20}, LU/H;->c(IIIIIIIIFJFLC/A;)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    return v1

    .line 474
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 475
    .line 476
    goto/16 :goto_f

    .line 477
    .line 478
    :cond_16
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 479
    .line 480
    const-string v2, "Collection contains no element matching the predicate."

    .line 481
    .line 482
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    throw v1
.end method

.method private final e(LI0/m;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v5, v3, :cond_13

    .line 14
    .line 15
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    move-object v7, v6

    .line 20
    check-cast v7, LI0/l;

    .line 21
    .line 22
    invoke-static {v7}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const-string v8, "TextField"

    .line 27
    .line 28
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_12

    .line 33
    .line 34
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v2, v6, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move v5, v4

    .line 53
    :goto_1
    const/4 v6, 0x0

    .line 54
    if-ge v5, v3, :cond_1

    .line 55
    .line 56
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    move-object v8, v7

    .line 61
    check-cast v8, LI0/l;

    .line 62
    .line 63
    invoke-static {v8}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const-string v10, "Label"

    .line 68
    .line 69
    invoke-static {v8, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_0

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    move-object v7, v6

    .line 80
    :goto_2
    check-cast v7, LI0/l;

    .line 81
    .line 82
    if-eqz v7, :cond_2

    .line 83
    .line 84
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {v2, v7, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    move v10, v3

    .line 99
    goto :goto_3

    .line 100
    :cond_2
    move v10, v4

    .line 101
    :goto_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    move v5, v4

    .line 106
    :goto_4
    if-ge v5, v3, :cond_4

    .line 107
    .line 108
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    move-object v8, v7

    .line 113
    check-cast v8, LI0/l;

    .line 114
    .line 115
    invoke-static {v8}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    const-string v11, "Trailing"

    .line 120
    .line 121
    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_3

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_4
    move-object v7, v6

    .line 132
    :goto_5
    check-cast v7, LI0/l;

    .line 133
    .line 134
    if-eqz v7, :cond_5

    .line 135
    .line 136
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-interface {v2, v7, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    goto :goto_6

    .line 151
    :cond_5
    move v3, v4

    .line 152
    :goto_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    move v7, v4

    .line 157
    :goto_7
    if-ge v7, v5, :cond_7

    .line 158
    .line 159
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    move-object v11, v8

    .line 164
    check-cast v11, LI0/l;

    .line 165
    .line 166
    invoke-static {v11}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    const-string v12, "Leading"

    .line 171
    .line 172
    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    if-eqz v11, :cond_6

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_7
    move-object v8, v6

    .line 183
    :goto_8
    check-cast v8, LI0/l;

    .line 184
    .line 185
    if-eqz v8, :cond_8

    .line 186
    .line 187
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-interface {v2, v8, v5}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    check-cast v5, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    goto :goto_9

    .line 202
    :cond_8
    move v5, v4

    .line 203
    :goto_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    move v8, v4

    .line 208
    :goto_a
    if-ge v8, v7, :cond_a

    .line 209
    .line 210
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    move-object v12, v11

    .line 215
    check-cast v12, LI0/l;

    .line 216
    .line 217
    invoke-static {v12}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const-string v13, "Prefix"

    .line 222
    .line 223
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    if-eqz v12, :cond_9

    .line 228
    .line 229
    goto :goto_b

    .line 230
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 231
    .line 232
    goto :goto_a

    .line 233
    :cond_a
    move-object v11, v6

    .line 234
    :goto_b
    check-cast v11, LI0/l;

    .line 235
    .line 236
    if-eqz v11, :cond_b

    .line 237
    .line 238
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-interface {v2, v11, v7}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    check-cast v7, Ljava/lang/Number;

    .line 247
    .line 248
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    goto :goto_c

    .line 253
    :cond_b
    move v7, v4

    .line 254
    :goto_c
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 255
    .line 256
    .line 257
    move-result v8

    .line 258
    move v11, v4

    .line 259
    :goto_d
    if-ge v11, v8, :cond_d

    .line 260
    .line 261
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    move-object v13, v12

    .line 266
    check-cast v13, LI0/l;

    .line 267
    .line 268
    invoke-static {v13}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    const-string v14, "Suffix"

    .line 273
    .line 274
    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v13

    .line 278
    if-eqz v13, :cond_c

    .line 279
    .line 280
    goto :goto_e

    .line 281
    :cond_c
    add-int/lit8 v11, v11, 0x1

    .line 282
    .line 283
    goto :goto_d

    .line 284
    :cond_d
    move-object v12, v6

    .line 285
    :goto_e
    check-cast v12, LI0/l;

    .line 286
    .line 287
    if-eqz v12, :cond_e

    .line 288
    .line 289
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    invoke-interface {v2, v12, v8}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    check-cast v8, Ljava/lang/Number;

    .line 298
    .line 299
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    goto :goto_f

    .line 304
    :cond_e
    move v8, v4

    .line 305
    :goto_f
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    move v12, v4

    .line 310
    :goto_10
    if-ge v12, v11, :cond_10

    .line 311
    .line 312
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    move-object v14, v13

    .line 317
    check-cast v14, LI0/l;

    .line 318
    .line 319
    invoke-static {v14}, LW/j;->l(LI0/l;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v14

    .line 323
    const-string v15, "Hint"

    .line 324
    .line 325
    invoke-static {v14, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    if-eqz v14, :cond_f

    .line 330
    .line 331
    move-object v6, v13

    .line 332
    goto :goto_11

    .line 333
    :cond_f
    add-int/lit8 v12, v12, 0x1

    .line 334
    .line 335
    goto :goto_10

    .line 336
    :cond_10
    :goto_11
    check-cast v6, LI0/l;

    .line 337
    .line 338
    if-eqz v6, :cond_11

    .line 339
    .line 340
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-interface {v2, v6, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    check-cast v1, Ljava/lang/Number;

    .line 349
    .line 350
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    :cond_11
    move v11, v4

    .line 355
    iget v12, v0, LU/I;->c:F

    .line 356
    .line 357
    invoke-static {}, LW/j;->s()J

    .line 358
    .line 359
    .line 360
    move-result-wide v13

    .line 361
    invoke-interface/range {p1 .. p1}, Li1/d;->getDensity()F

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    iget-object v1, v0, LU/I;->d:LC/A;

    .line 366
    .line 367
    move-object/from16 v16, v1

    .line 368
    .line 369
    move v6, v3

    .line 370
    invoke-static/range {v5 .. v16}, LU/H;->d(IIIIIIIFJFLC/A;)I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    return v1

    .line 375
    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 376
    .line 377
    goto/16 :goto_0

    .line 378
    .line 379
    :cond_13
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 380
    .line 381
    const-string v2, "Collection contains no element matching the predicate."

    .line 382
    .line 383
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v1
.end method


# virtual methods
.method public maxIntrinsicHeight(LI0/m;Ljava/util/List;I)I
    .locals 1

    .line 1
    sget-object v0, LU/I$a;->a:LU/I$a;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, LU/I;->d(LI0/m;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public maxIntrinsicWidth(LI0/m;Ljava/util/List;I)I
    .locals 1

    .line 1
    sget-object v0, LU/I$b;->a:LU/I$b;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, LU/I;->e(LI0/m;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
    .locals 42

    .line 1
    move-object/from16 v12, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iget-object v1, v12, LU/I;->d:LC/A;

    .line 8
    .line 9
    invoke-interface {v1}, LC/A;->c()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v13, v1}, Li1/d;->s0(F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v8, 0xa

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    move-wide/from16 v2, p3

    .line 25
    .line 26
    invoke-static/range {v2 .. v9}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v14

    .line 30
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    move v4, v3

    .line 36
    :goto_0
    if-ge v4, v2, :cond_1

    .line 37
    .line 38
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    move-object v7, v6

    .line 43
    check-cast v7, LI0/A;

    .line 44
    .line 45
    invoke-static {v7}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const-string v8, "Leading"

    .line 50
    .line 51
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v6, 0x0

    .line 62
    :goto_1
    check-cast v6, LI0/A;

    .line 63
    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    invoke-interface {v6, v14, v15}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 v2, 0x0

    .line 72
    :goto_2
    invoke-static {v2}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v2}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    move v8, v3

    .line 89
    :goto_3
    if-ge v8, v7, :cond_4

    .line 90
    .line 91
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    move-object v10, v9

    .line 96
    check-cast v10, LI0/A;

    .line 97
    .line 98
    invoke-static {v10}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    const-string v11, "Trailing"

    .line 103
    .line 104
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_3

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    const/4 v9, 0x0

    .line 115
    :goto_4
    check-cast v9, LI0/A;

    .line 116
    .line 117
    if-eqz v9, :cond_5

    .line 118
    .line 119
    neg-int v7, v4

    .line 120
    const/16 v18, 0x2

    .line 121
    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    move/from16 v16, v7

    .line 127
    .line 128
    invoke-static/range {v14 .. v19}, Li1/c;->k(JIIILjava/lang/Object;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    invoke-interface {v9, v7, v8}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    goto :goto_5

    .line 137
    :cond_5
    const/4 v7, 0x0

    .line 138
    :goto_5
    invoke-static {v7}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    add-int/2addr v4, v8

    .line 143
    invoke-static {v7}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    move v9, v3

    .line 156
    :goto_6
    if-ge v9, v8, :cond_7

    .line 157
    .line 158
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    move-object v11, v10

    .line 163
    check-cast v11, LI0/A;

    .line 164
    .line 165
    invoke-static {v11}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    const-string v3, "Prefix"

    .line 170
    .line 171
    invoke-static {v11, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_6

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 179
    .line 180
    const/4 v3, 0x0

    .line 181
    goto :goto_6

    .line 182
    :cond_7
    const/4 v10, 0x0

    .line 183
    :goto_7
    check-cast v10, LI0/A;

    .line 184
    .line 185
    if-eqz v10, :cond_8

    .line 186
    .line 187
    neg-int v3, v4

    .line 188
    const/16 v18, 0x2

    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    move/from16 v16, v3

    .line 195
    .line 196
    invoke-static/range {v14 .. v19}, Li1/c;->k(JIIILjava/lang/Object;)J

    .line 197
    .line 198
    .line 199
    move-result-wide v8

    .line 200
    invoke-interface {v10, v8, v9}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    goto :goto_8

    .line 205
    :cond_8
    const/4 v3, 0x0

    .line 206
    :goto_8
    invoke-static {v3}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    add-int/2addr v4, v8

    .line 211
    invoke-static {v3}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    const/4 v9, 0x0

    .line 224
    :goto_9
    if-ge v9, v8, :cond_a

    .line 225
    .line 226
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    move-object v11, v10

    .line 231
    check-cast v11, LI0/A;

    .line 232
    .line 233
    invoke-static {v11}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    const-string v5, "Suffix"

    .line 238
    .line 239
    invoke-static {v11, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-eqz v5, :cond_9

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_9
    add-int/lit8 v9, v9, 0x1

    .line 247
    .line 248
    goto :goto_9

    .line 249
    :cond_a
    const/4 v10, 0x0

    .line 250
    :goto_a
    check-cast v10, LI0/A;

    .line 251
    .line 252
    if-eqz v10, :cond_b

    .line 253
    .line 254
    neg-int v5, v4

    .line 255
    const/16 v18, 0x2

    .line 256
    .line 257
    const/16 v19, 0x0

    .line 258
    .line 259
    const/16 v17, 0x0

    .line 260
    .line 261
    move/from16 v16, v5

    .line 262
    .line 263
    invoke-static/range {v14 .. v19}, Li1/c;->k(JIIILjava/lang/Object;)J

    .line 264
    .line 265
    .line 266
    move-result-wide v8

    .line 267
    invoke-interface {v10, v8, v9}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    goto :goto_b

    .line 272
    :cond_b
    const/4 v5, 0x0

    .line 273
    :goto_b
    invoke-static {v5}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    add-int/2addr v4, v8

    .line 278
    invoke-static {v5}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    iget-object v8, v12, LU/I;->d:LC/A;

    .line 287
    .line 288
    invoke-interface {v13}, LI0/m;->getLayoutDirection()Li1/t;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    invoke-interface {v8, v9}, LC/A;->b(Li1/t;)F

    .line 293
    .line 294
    .line 295
    move-result v8

    .line 296
    invoke-interface {v13, v8}, Li1/d;->s0(F)I

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    iget-object v9, v12, LU/I;->d:LC/A;

    .line 301
    .line 302
    invoke-interface {v13}, LI0/m;->getLayoutDirection()Li1/t;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    invoke-interface {v9, v10}, LC/A;->a(Li1/t;)F

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    invoke-interface {v13, v9}, Li1/d;->s0(F)I

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    add-int/2addr v8, v9

    .line 315
    neg-int v4, v4

    .line 316
    sub-int v9, v4, v8

    .line 317
    .line 318
    neg-int v8, v8

    .line 319
    iget v10, v12, LU/I;->c:F

    .line 320
    .line 321
    invoke-static {v9, v8, v10}, Lk1/b;->c(IIF)I

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    neg-int v9, v1

    .line 326
    invoke-static {v14, v15, v8, v9}, Li1/c;->j(JII)J

    .line 327
    .line 328
    .line 329
    move-result-wide v10

    .line 330
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    move/from16 v16, v1

    .line 335
    .line 336
    const/4 v1, 0x0

    .line 337
    :goto_c
    if-ge v1, v8, :cond_d

    .line 338
    .line 339
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v17

    .line 343
    move-object/from16 v18, v17

    .line 344
    .line 345
    check-cast v18, LI0/A;

    .line 346
    .line 347
    move/from16 v19, v1

    .line 348
    .line 349
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    move-object/from16 v29, v2

    .line 354
    .line 355
    const-string v2, "Label"

    .line 356
    .line 357
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-eqz v1, :cond_c

    .line 362
    .line 363
    goto :goto_d

    .line 364
    :cond_c
    add-int/lit8 v1, v19, 0x1

    .line 365
    .line 366
    move-object/from16 v2, v29

    .line 367
    .line 368
    goto :goto_c

    .line 369
    :cond_d
    move-object/from16 v29, v2

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    :goto_d
    move-object/from16 v1, v17

    .line 374
    .line 375
    check-cast v1, LI0/A;

    .line 376
    .line 377
    if-eqz v1, :cond_e

    .line 378
    .line 379
    invoke-interface {v1, v10, v11}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    move-object v8, v1

    .line 384
    goto :goto_e

    .line 385
    :cond_e
    const/4 v8, 0x0

    .line 386
    :goto_e
    if-eqz v8, :cond_f

    .line 387
    .line 388
    invoke-virtual {v8}, Landroidx/compose/ui/layout/s;->W0()I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    int-to-float v1, v1

    .line 393
    invoke-virtual {v8}, Landroidx/compose/ui/layout/s;->P0()I

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    int-to-float v2, v2

    .line 398
    invoke-static {v1, v2}, Lr0/m;->a(FF)J

    .line 399
    .line 400
    .line 401
    move-result-wide v1

    .line 402
    goto :goto_f

    .line 403
    :cond_f
    sget-object v1, Lr0/l;->b:Lr0/l$a;

    .line 404
    .line 405
    invoke-virtual {v1}, Lr0/l$a;->b()J

    .line 406
    .line 407
    .line 408
    move-result-wide v1

    .line 409
    :goto_f
    iget-object v10, v12, LU/I;->a:Lkotlin/jvm/functions/Function1;

    .line 410
    .line 411
    invoke-static {v1, v2}, Lr0/l;->c(J)Lr0/l;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-interface {v10, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    const/4 v2, 0x0

    .line 423
    :goto_10
    if-ge v2, v1, :cond_11

    .line 424
    .line 425
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v10

    .line 429
    move-object v11, v10

    .line 430
    check-cast v11, LI0/A;

    .line 431
    .line 432
    invoke-static {v11}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v11

    .line 436
    move/from16 v17, v1

    .line 437
    .line 438
    const-string v1, "Supporting"

    .line 439
    .line 440
    invoke-static {v11, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_10

    .line 445
    .line 446
    goto :goto_11

    .line 447
    :cond_10
    add-int/lit8 v2, v2, 0x1

    .line 448
    .line 449
    move/from16 v1, v17

    .line 450
    .line 451
    goto :goto_10

    .line 452
    :cond_11
    const/4 v10, 0x0

    .line 453
    :goto_11
    check-cast v10, LI0/A;

    .line 454
    .line 455
    if-eqz v10, :cond_12

    .line 456
    .line 457
    invoke-static/range {p3 .. p4}, Li1/b;->n(J)I

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    invoke-interface {v10, v1}, LI0/l;->Z(I)I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    goto :goto_12

    .line 466
    :cond_12
    const/4 v1, 0x0

    .line 467
    :goto_12
    invoke-static {v8}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    div-int/lit8 v2, v2, 0x2

    .line 472
    .line 473
    iget-object v11, v12, LU/I;->d:LC/A;

    .line 474
    .line 475
    invoke-interface {v11}, LC/A;->d()F

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    invoke-interface {v13, v11}, Li1/d;->s0(F)I

    .line 480
    .line 481
    .line 482
    move-result v11

    .line 483
    invoke-static {v2, v11}, Ljava/lang/Math;->max(II)I

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    sub-int/2addr v9, v2

    .line 488
    sub-int/2addr v9, v1

    .line 489
    move v11, v2

    .line 490
    move-wide/from16 v1, p3

    .line 491
    .line 492
    invoke-static {v1, v2, v4, v9}, Li1/c;->j(JII)J

    .line 493
    .line 494
    .line 495
    move-result-wide v17

    .line 496
    const/16 v23, 0xb

    .line 497
    .line 498
    const/16 v24, 0x0

    .line 499
    .line 500
    const/16 v19, 0x0

    .line 501
    .line 502
    const/16 v20, 0x0

    .line 503
    .line 504
    const/16 v21, 0x0

    .line 505
    .line 506
    const/16 v22, 0x0

    .line 507
    .line 508
    invoke-static/range {v17 .. v24}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 509
    .line 510
    .line 511
    move-result-wide v1

    .line 512
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    move-object/from16 v38, v3

    .line 517
    .line 518
    const/4 v9, 0x0

    .line 519
    :goto_13
    const-string v3, "Collection contains no element matching the predicate."

    .line 520
    .line 521
    if-ge v9, v4, :cond_1c

    .line 522
    .line 523
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v17

    .line 527
    move/from16 v18, v4

    .line 528
    .line 529
    move-object/from16 v4, v17

    .line 530
    .line 531
    check-cast v4, LI0/A;

    .line 532
    .line 533
    move-object/from16 v39, v5

    .line 534
    .line 535
    invoke-static {v4}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    move-object/from16 v40, v7

    .line 540
    .line 541
    const-string v7, "TextField"

    .line 542
    .line 543
    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    if-eqz v5, :cond_1b

    .line 548
    .line 549
    invoke-interface {v4, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 550
    .line 551
    .line 552
    move-result-object v7

    .line 553
    const/16 v36, 0xe

    .line 554
    .line 555
    const/16 v37, 0x0

    .line 556
    .line 557
    const/16 v32, 0x0

    .line 558
    .line 559
    const/16 v33, 0x0

    .line 560
    .line 561
    const/16 v34, 0x0

    .line 562
    .line 563
    const/16 v35, 0x0

    .line 564
    .line 565
    move-wide/from16 v30, v1

    .line 566
    .line 567
    invoke-static/range {v30 .. v37}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 568
    .line 569
    .line 570
    move-result-wide v1

    .line 571
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 572
    .line 573
    .line 574
    move-result v4

    .line 575
    const/4 v5, 0x0

    .line 576
    :goto_14
    if-ge v5, v4, :cond_14

    .line 577
    .line 578
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v9

    .line 582
    move-object/from16 v17, v9

    .line 583
    .line 584
    check-cast v17, LI0/A;

    .line 585
    .line 586
    move/from16 v18, v4

    .line 587
    .line 588
    invoke-static/range {v17 .. v17}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v4

    .line 592
    move/from16 v17, v5

    .line 593
    .line 594
    const-string v5, "Hint"

    .line 595
    .line 596
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v4

    .line 600
    if-eqz v4, :cond_13

    .line 601
    .line 602
    goto :goto_15

    .line 603
    :cond_13
    add-int/lit8 v5, v17, 0x1

    .line 604
    .line 605
    move/from16 v4, v18

    .line 606
    .line 607
    goto :goto_14

    .line 608
    :cond_14
    const/4 v9, 0x0

    .line 609
    :goto_15
    check-cast v9, LI0/A;

    .line 610
    .line 611
    if-eqz v9, :cond_15

    .line 612
    .line 613
    invoke-interface {v9, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    move-object v9, v1

    .line 618
    goto :goto_16

    .line 619
    :cond_15
    const/4 v9, 0x0

    .line 620
    :goto_16
    invoke-static {v7}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 621
    .line 622
    .line 623
    move-result v1

    .line 624
    invoke-static {v9}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 625
    .line 626
    .line 627
    move-result v2

    .line 628
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    add-int/2addr v1, v11

    .line 633
    add-int v1, v1, v16

    .line 634
    .line 635
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    invoke-static/range {v29 .. v29}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 640
    .line 641
    .line 642
    move-result v16

    .line 643
    invoke-static/range {v40 .. v40}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 644
    .line 645
    .line 646
    move-result v17

    .line 647
    invoke-static/range {v38 .. v38}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 648
    .line 649
    .line 650
    move-result v18

    .line 651
    invoke-static/range {v39 .. v39}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 652
    .line 653
    .line 654
    move-result v19

    .line 655
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->W0()I

    .line 656
    .line 657
    .line 658
    move-result v20

    .line 659
    invoke-static {v8}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 660
    .line 661
    .line 662
    move-result v21

    .line 663
    invoke-static {v9}, LW/j;->v(Landroidx/compose/ui/layout/s;)I

    .line 664
    .line 665
    .line 666
    move-result v22

    .line 667
    iget v2, v12, LU/I;->c:F

    .line 668
    .line 669
    invoke-interface {v13}, Li1/d;->getDensity()F

    .line 670
    .line 671
    .line 672
    move-result v26

    .line 673
    iget-object v4, v12, LU/I;->d:LC/A;

    .line 674
    .line 675
    move-wide/from16 v24, p3

    .line 676
    .line 677
    move/from16 v23, v2

    .line 678
    .line 679
    move-object/from16 v27, v4

    .line 680
    .line 681
    invoke-static/range {v16 .. v27}, LU/H;->d(IIIIIIIFJFLC/A;)I

    .line 682
    .line 683
    .line 684
    move-result v33

    .line 685
    neg-int v1, v1

    .line 686
    const/16 v18, 0x1

    .line 687
    .line 688
    const/16 v19, 0x0

    .line 689
    .line 690
    const/16 v16, 0x0

    .line 691
    .line 692
    move/from16 v17, v1

    .line 693
    .line 694
    invoke-static/range {v14 .. v19}, Li1/c;->k(JIIILjava/lang/Object;)J

    .line 695
    .line 696
    .line 697
    move-result-wide v30

    .line 698
    const/16 v36, 0x9

    .line 699
    .line 700
    const/16 v37, 0x0

    .line 701
    .line 702
    const/16 v32, 0x0

    .line 703
    .line 704
    const/16 v34, 0x0

    .line 705
    .line 706
    const/16 v35, 0x0

    .line 707
    .line 708
    invoke-static/range {v30 .. v37}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 709
    .line 710
    .line 711
    move-result-wide v1

    .line 712
    move/from16 v4, v33

    .line 713
    .line 714
    if-eqz v10, :cond_16

    .line 715
    .line 716
    invoke-interface {v10, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 717
    .line 718
    .line 719
    move-result-object v5

    .line 720
    move-object v11, v5

    .line 721
    goto :goto_17

    .line 722
    :cond_16
    const/4 v11, 0x0

    .line 723
    :goto_17
    invoke-static {v11}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    invoke-static/range {v29 .. v29}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 728
    .line 729
    .line 730
    move-result v16

    .line 731
    invoke-static/range {v40 .. v40}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 732
    .line 733
    .line 734
    move-result v17

    .line 735
    invoke-static/range {v38 .. v38}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 736
    .line 737
    .line 738
    move-result v18

    .line 739
    invoke-static/range {v39 .. v39}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 740
    .line 741
    .line 742
    move-result v19

    .line 743
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->P0()I

    .line 744
    .line 745
    .line 746
    move-result v20

    .line 747
    invoke-static {v8}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 748
    .line 749
    .line 750
    move-result v21

    .line 751
    invoke-static {v9}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 752
    .line 753
    .line 754
    move-result v22

    .line 755
    invoke-static {v11}, LW/j;->t(Landroidx/compose/ui/layout/s;)I

    .line 756
    .line 757
    .line 758
    move-result v23

    .line 759
    iget v2, v12, LU/I;->c:F

    .line 760
    .line 761
    invoke-interface {v13}, Li1/d;->getDensity()F

    .line 762
    .line 763
    .line 764
    move-result v27

    .line 765
    iget-object v5, v12, LU/I;->d:LC/A;

    .line 766
    .line 767
    move-wide/from16 v25, p3

    .line 768
    .line 769
    move/from16 v24, v2

    .line 770
    .line 771
    move-object/from16 v28, v5

    .line 772
    .line 773
    invoke-static/range {v16 .. v28}, LU/H;->c(IIIIIIIIFJFLC/A;)I

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    sub-int v1, v2, v1

    .line 778
    .line 779
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 780
    .line 781
    .line 782
    move-result v5

    .line 783
    const/4 v6, 0x0

    .line 784
    :goto_18
    if-ge v6, v5, :cond_1a

    .line 785
    .line 786
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v10

    .line 790
    check-cast v10, LI0/A;

    .line 791
    .line 792
    invoke-static {v10}, Landroidx/compose/ui/layout/h;->a(LI0/A;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v14

    .line 796
    const-string v15, "Container"

    .line 797
    .line 798
    invoke-static {v14, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v14

    .line 802
    if-eqz v14, :cond_19

    .line 803
    .line 804
    const v0, 0x7fffffff

    .line 805
    .line 806
    .line 807
    if-eq v4, v0, :cond_17

    .line 808
    .line 809
    move v3, v4

    .line 810
    goto :goto_19

    .line 811
    :cond_17
    const/4 v3, 0x0

    .line 812
    :goto_19
    if-eq v1, v0, :cond_18

    .line 813
    .line 814
    move v0, v1

    .line 815
    goto :goto_1a

    .line 816
    :cond_18
    const/4 v0, 0x0

    .line 817
    :goto_1a
    invoke-static {v3, v4, v0, v1}, Li1/c;->a(IIII)J

    .line 818
    .line 819
    .line 820
    move-result-wide v0

    .line 821
    invoke-interface {v10, v0, v1}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 822
    .line 823
    .line 824
    move-result-object v10

    .line 825
    new-instance v0, LU/I$c;

    .line 826
    .line 827
    move v1, v2

    .line 828
    move v2, v4

    .line 829
    move-object/from16 v3, v29

    .line 830
    .line 831
    move-object/from16 v5, v38

    .line 832
    .line 833
    move-object/from16 v6, v39

    .line 834
    .line 835
    move-object/from16 v4, v40

    .line 836
    .line 837
    invoke-direct/range {v0 .. v13}, LU/I$c;-><init>(IILandroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/s;LU/I;Landroidx/compose/ui/layout/l;)V

    .line 838
    .line 839
    .line 840
    move/from16 v41, v2

    .line 841
    .line 842
    move v2, v1

    .line 843
    move/from16 v1, v41

    .line 844
    .line 845
    const/4 v5, 0x4

    .line 846
    const/4 v6, 0x0

    .line 847
    const/4 v3, 0x0

    .line 848
    move-object v4, v0

    .line 849
    move-object/from16 v0, p1

    .line 850
    .line 851
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    return-object v0

    .line 856
    :cond_19
    move/from16 v33, v4

    .line 857
    .line 858
    move-object/from16 v4, v40

    .line 859
    .line 860
    add-int/lit8 v6, v6, 0x1

    .line 861
    .line 862
    move-object/from16 v12, p0

    .line 863
    .line 864
    move-object/from16 v13, p1

    .line 865
    .line 866
    move/from16 v4, v33

    .line 867
    .line 868
    goto :goto_18

    .line 869
    :cond_1a
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 870
    .line 871
    invoke-direct {v0, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v0

    .line 875
    :cond_1b
    move-wide/from16 v30, v1

    .line 876
    .line 877
    move-object/from16 v4, v40

    .line 878
    .line 879
    add-int/lit8 v9, v9, 0x1

    .line 880
    .line 881
    move-object/from16 v12, p0

    .line 882
    .line 883
    move-object/from16 v13, p1

    .line 884
    .line 885
    move-object v7, v4

    .line 886
    move/from16 v4, v18

    .line 887
    .line 888
    move-object/from16 v5, v39

    .line 889
    .line 890
    goto/16 :goto_13

    .line 891
    .line 892
    :cond_1c
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 893
    .line 894
    invoke-direct {v0, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    throw v0
.end method

.method public minIntrinsicHeight(LI0/m;Ljava/util/List;I)I
    .locals 1

    .line 1
    sget-object v0, LU/I$d;->a:LU/I$d;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, LU/I;->d(LI0/m;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public minIntrinsicWidth(LI0/m;Ljava/util/List;I)I
    .locals 1

    .line 1
    sget-object v0, LU/I$e;->a:LU/I$e;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, LU/I;->e(LI0/m;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
