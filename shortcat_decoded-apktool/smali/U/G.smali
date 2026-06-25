.class public final LU/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LU/G;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU/G;

    .line 2
    .line 3
    invoke-direct {v0}, LU/G;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU/G;->a:LU/G;

    .line 7
    .line 8
    const/16 v0, 0x38

    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    invoke-static {v0}, Li1/h;->n(F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, LU/G;->b:F

    .line 16
    .line 17
    const/16 v0, 0x118

    .line 18
    .line 19
    int-to-float v0, v0

    .line 20
    invoke-static {v0}, Li1/h;->n(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput v0, LU/G;->c:F

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    int-to-float v0, v0

    .line 28
    invoke-static {v0}, Li1/h;->n(F)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sput v0, LU/G;->d:F

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    int-to-float v0, v0

    .line 36
    invoke-static {v0}, Li1/h;->n(F)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sput v0, LU/G;->e:F

    .line 41
    .line 42
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(LU/G;FFFFILjava/lang/Object;)LC/A;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    invoke-static {}, LW/j;->r()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 10
    .line 11
    if-eqz p6, :cond_1

    .line 12
    .line 13
    invoke-static {}, LW/j;->r()F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 18
    .line 19
    if-eqz p6, :cond_2

    .line 20
    .line 21
    invoke-static {}, LW/j;->r()F

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 26
    .line 27
    if-eqz p5, :cond_3

    .line 28
    .line 29
    invoke-static {}, LW/j;->r()F

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LU/G;->d(FFFF)LC/A;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method


# virtual methods
.method public final a(ZZLB/k;Landroidx/compose/ui/e;LU/f0;Ls0/E1;FFLY/m;II)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    move/from16 v10, p10

    .line 10
    .line 11
    move/from16 v11, p11

    .line 12
    .line 13
    const v4, 0x3db82288

    .line 14
    .line 15
    .line 16
    move-object/from16 v5, p9

    .line 17
    .line 18
    invoke-interface {v5, v4}, LY/m;->g(I)LY/m;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    and-int/lit8 v5, v11, 0x1

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    or-int/lit8 v5, v10, 0x6

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v5, v10, 0x6

    .line 30
    .line 31
    if-nez v5, :cond_2

    .line 32
    .line 33
    invoke-interface {v8, v2}, LY/m;->a(Z)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    const/4 v5, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v5, 0x2

    .line 42
    :goto_0
    or-int/2addr v5, v10

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v5, v10

    .line 45
    :goto_1
    and-int/lit8 v6, v11, 0x2

    .line 46
    .line 47
    if-eqz v6, :cond_3

    .line 48
    .line 49
    or-int/lit8 v5, v5, 0x30

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    and-int/lit8 v6, v10, 0x30

    .line 53
    .line 54
    if-nez v6, :cond_5

    .line 55
    .line 56
    invoke-interface {v8, v3}, LY/m;->a(Z)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_4

    .line 61
    .line 62
    const/16 v6, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/16 v6, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v5, v6

    .line 68
    :cond_5
    :goto_3
    and-int/lit8 v6, v11, 0x4

    .line 69
    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    or-int/lit16 v5, v5, 0x180

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_6
    and-int/lit16 v6, v10, 0x180

    .line 76
    .line 77
    if-nez v6, :cond_8

    .line 78
    .line 79
    invoke-interface {v8, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_7

    .line 84
    .line 85
    const/16 v6, 0x100

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_7
    const/16 v6, 0x80

    .line 89
    .line 90
    :goto_4
    or-int/2addr v5, v6

    .line 91
    :cond_8
    :goto_5
    and-int/lit8 v6, v11, 0x8

    .line 92
    .line 93
    if-eqz v6, :cond_a

    .line 94
    .line 95
    or-int/lit16 v5, v5, 0xc00

    .line 96
    .line 97
    :cond_9
    move-object/from16 v7, p4

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_a
    and-int/lit16 v7, v10, 0xc00

    .line 101
    .line 102
    if-nez v7, :cond_9

    .line 103
    .line 104
    move-object/from16 v7, p4

    .line 105
    .line 106
    invoke-interface {v8, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_b

    .line 111
    .line 112
    const/16 v9, 0x800

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_b
    const/16 v9, 0x400

    .line 116
    .line 117
    :goto_6
    or-int/2addr v5, v9

    .line 118
    :goto_7
    and-int/lit16 v9, v10, 0x6000

    .line 119
    .line 120
    if-nez v9, :cond_e

    .line 121
    .line 122
    and-int/lit8 v9, v11, 0x10

    .line 123
    .line 124
    if-nez v9, :cond_c

    .line 125
    .line 126
    move-object/from16 v9, p5

    .line 127
    .line 128
    invoke-interface {v8, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    if-eqz v12, :cond_d

    .line 133
    .line 134
    const/16 v12, 0x4000

    .line 135
    .line 136
    goto :goto_8

    .line 137
    :cond_c
    move-object/from16 v9, p5

    .line 138
    .line 139
    :cond_d
    const/16 v12, 0x2000

    .line 140
    .line 141
    :goto_8
    or-int/2addr v5, v12

    .line 142
    goto :goto_9

    .line 143
    :cond_e
    move-object/from16 v9, p5

    .line 144
    .line 145
    :goto_9
    const/high16 v12, 0x30000

    .line 146
    .line 147
    and-int/2addr v12, v10

    .line 148
    if-nez v12, :cond_11

    .line 149
    .line 150
    and-int/lit8 v12, v11, 0x20

    .line 151
    .line 152
    if-nez v12, :cond_f

    .line 153
    .line 154
    move-object/from16 v12, p6

    .line 155
    .line 156
    invoke-interface {v8, v12}, LY/m;->U(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    if-eqz v13, :cond_10

    .line 161
    .line 162
    const/high16 v13, 0x20000

    .line 163
    .line 164
    goto :goto_a

    .line 165
    :cond_f
    move-object/from16 v12, p6

    .line 166
    .line 167
    :cond_10
    const/high16 v13, 0x10000

    .line 168
    .line 169
    :goto_a
    or-int/2addr v5, v13

    .line 170
    goto :goto_b

    .line 171
    :cond_11
    move-object/from16 v12, p6

    .line 172
    .line 173
    :goto_b
    const/high16 v13, 0x180000

    .line 174
    .line 175
    and-int/2addr v13, v10

    .line 176
    if-nez v13, :cond_14

    .line 177
    .line 178
    and-int/lit8 v13, v11, 0x40

    .line 179
    .line 180
    if-nez v13, :cond_12

    .line 181
    .line 182
    move/from16 v13, p7

    .line 183
    .line 184
    invoke-interface {v8, v13}, LY/m;->b(F)Z

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    if-eqz v14, :cond_13

    .line 189
    .line 190
    const/high16 v14, 0x100000

    .line 191
    .line 192
    goto :goto_c

    .line 193
    :cond_12
    move/from16 v13, p7

    .line 194
    .line 195
    :cond_13
    const/high16 v14, 0x80000

    .line 196
    .line 197
    :goto_c
    or-int/2addr v5, v14

    .line 198
    goto :goto_d

    .line 199
    :cond_14
    move/from16 v13, p7

    .line 200
    .line 201
    :goto_d
    const/high16 v14, 0xc00000

    .line 202
    .line 203
    and-int/2addr v14, v10

    .line 204
    if-nez v14, :cond_17

    .line 205
    .line 206
    and-int/lit16 v14, v11, 0x80

    .line 207
    .line 208
    if-nez v14, :cond_15

    .line 209
    .line 210
    move/from16 v14, p8

    .line 211
    .line 212
    invoke-interface {v8, v14}, LY/m;->b(F)Z

    .line 213
    .line 214
    .line 215
    move-result v15

    .line 216
    if-eqz v15, :cond_16

    .line 217
    .line 218
    const/high16 v15, 0x800000

    .line 219
    .line 220
    goto :goto_e

    .line 221
    :cond_15
    move/from16 v14, p8

    .line 222
    .line 223
    :cond_16
    const/high16 v15, 0x400000

    .line 224
    .line 225
    :goto_e
    or-int/2addr v5, v15

    .line 226
    goto :goto_f

    .line 227
    :cond_17
    move/from16 v14, p8

    .line 228
    .line 229
    :goto_f
    and-int/lit16 v15, v11, 0x100

    .line 230
    .line 231
    const/high16 v16, 0x6000000

    .line 232
    .line 233
    if-eqz v15, :cond_18

    .line 234
    .line 235
    or-int v5, v5, v16

    .line 236
    .line 237
    goto :goto_11

    .line 238
    :cond_18
    and-int v15, v10, v16

    .line 239
    .line 240
    if-nez v15, :cond_1a

    .line 241
    .line 242
    invoke-interface {v8, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v15

    .line 246
    if-eqz v15, :cond_19

    .line 247
    .line 248
    const/high16 v15, 0x4000000

    .line 249
    .line 250
    goto :goto_10

    .line 251
    :cond_19
    const/high16 v15, 0x2000000

    .line 252
    .line 253
    :goto_10
    or-int/2addr v5, v15

    .line 254
    :cond_1a
    :goto_11
    const v15, 0x2492493

    .line 255
    .line 256
    .line 257
    and-int/2addr v15, v5

    .line 258
    const v4, 0x2492492

    .line 259
    .line 260
    .line 261
    if-ne v15, v4, :cond_1c

    .line 262
    .line 263
    invoke-interface {v8}, LY/m;->i()Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-nez v4, :cond_1b

    .line 268
    .line 269
    goto :goto_12

    .line 270
    :cond_1b
    invoke-interface {v8}, LY/m;->K()V

    .line 271
    .line 272
    .line 273
    move v5, v13

    .line 274
    move-object v13, v8

    .line 275
    move v8, v5

    .line 276
    move-object v5, v7

    .line 277
    move-object v6, v9

    .line 278
    move-object v7, v12

    .line 279
    move v9, v14

    .line 280
    goto/16 :goto_1a

    .line 281
    .line 282
    :cond_1c
    :goto_12
    invoke-interface {v8}, LY/m;->G()V

    .line 283
    .line 284
    .line 285
    and-int/lit8 v4, v10, 0x1

    .line 286
    .line 287
    const v17, -0x380001

    .line 288
    .line 289
    .line 290
    const v18, -0x70001

    .line 291
    .line 292
    .line 293
    const v19, -0xe001

    .line 294
    .line 295
    .line 296
    const p9, -0x1c00001

    .line 297
    .line 298
    .line 299
    const/4 v15, 0x6

    .line 300
    if-eqz v4, :cond_22

    .line 301
    .line 302
    invoke-interface {v8}, LY/m;->N()Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-eqz v4, :cond_1d

    .line 307
    .line 308
    goto :goto_14

    .line 309
    :cond_1d
    invoke-interface {v8}, LY/m;->K()V

    .line 310
    .line 311
    .line 312
    and-int/lit8 v4, v11, 0x10

    .line 313
    .line 314
    if-eqz v4, :cond_1e

    .line 315
    .line 316
    and-int v5, v5, v19

    .line 317
    .line 318
    :cond_1e
    and-int/lit8 v4, v11, 0x20

    .line 319
    .line 320
    if-eqz v4, :cond_1f

    .line 321
    .line 322
    and-int v5, v5, v18

    .line 323
    .line 324
    :cond_1f
    and-int/lit8 v4, v11, 0x40

    .line 325
    .line 326
    if-eqz v4, :cond_20

    .line 327
    .line 328
    and-int v5, v5, v17

    .line 329
    .line 330
    :cond_20
    and-int/lit16 v4, v11, 0x80

    .line 331
    .line 332
    if-eqz v4, :cond_21

    .line 333
    .line 334
    and-int v5, v5, p9

    .line 335
    .line 336
    :cond_21
    move v4, v5

    .line 337
    move-object v5, v9

    .line 338
    move v6, v13

    .line 339
    move-object v13, v12

    .line 340
    move-object v12, v7

    .line 341
    :goto_13
    move v7, v14

    .line 342
    goto :goto_19

    .line 343
    :cond_22
    :goto_14
    if-eqz v6, :cond_23

    .line 344
    .line 345
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 346
    .line 347
    goto :goto_15

    .line 348
    :cond_23
    move-object v4, v7

    .line 349
    :goto_15
    and-int/lit8 v6, v11, 0x10

    .line 350
    .line 351
    if-eqz v6, :cond_24

    .line 352
    .line 353
    shr-int/lit8 v6, v5, 0x18

    .line 354
    .line 355
    and-int/lit8 v6, v6, 0xe

    .line 356
    .line 357
    invoke-virtual {v1, v8, v6}, LU/G;->c(LY/m;I)LU/f0;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    and-int v5, v5, v19

    .line 362
    .line 363
    goto :goto_16

    .line 364
    :cond_24
    move-object v6, v9

    .line 365
    :goto_16
    and-int/lit8 v7, v11, 0x20

    .line 366
    .line 367
    if-eqz v7, :cond_25

    .line 368
    .line 369
    sget-object v7, LU/G;->a:LU/G;

    .line 370
    .line 371
    invoke-virtual {v7, v8, v15}, LU/G;->j(LY/m;I)Ls0/E1;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    and-int v5, v5, v18

    .line 376
    .line 377
    goto :goto_17

    .line 378
    :cond_25
    move-object v7, v12

    .line 379
    :goto_17
    and-int/lit8 v9, v11, 0x40

    .line 380
    .line 381
    if-eqz v9, :cond_26

    .line 382
    .line 383
    sget v9, LU/G;->e:F

    .line 384
    .line 385
    and-int v5, v5, v17

    .line 386
    .line 387
    goto :goto_18

    .line 388
    :cond_26
    move v9, v13

    .line 389
    :goto_18
    and-int/lit16 v12, v11, 0x80

    .line 390
    .line 391
    if-eqz v12, :cond_27

    .line 392
    .line 393
    sget v12, LU/G;->d:F

    .line 394
    .line 395
    and-int v5, v5, p9

    .line 396
    .line 397
    move-object v13, v7

    .line 398
    move v7, v12

    .line 399
    move-object v12, v4

    .line 400
    move v4, v5

    .line 401
    move-object v5, v6

    .line 402
    move v6, v9

    .line 403
    goto :goto_19

    .line 404
    :cond_27
    move-object v12, v4

    .line 405
    move v4, v5

    .line 406
    move-object v5, v6

    .line 407
    move-object v13, v7

    .line 408
    move v6, v9

    .line 409
    goto :goto_13

    .line 410
    :goto_19
    invoke-interface {v8}, LY/m;->y()V

    .line 411
    .line 412
    .line 413
    invoke-static {}, LY/w;->L()Z

    .line 414
    .line 415
    .line 416
    move-result v9

    .line 417
    if-eqz v9, :cond_28

    .line 418
    .line 419
    const/4 v9, -0x1

    .line 420
    const-string v14, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:776)"

    .line 421
    .line 422
    const v15, 0x3db82288

    .line 423
    .line 424
    .line 425
    invoke-static {v15, v4, v9, v14}, LY/w;->U(IIILjava/lang/String;)V

    .line 426
    .line 427
    .line 428
    :cond_28
    shr-int/lit8 v9, v4, 0x6

    .line 429
    .line 430
    and-int/lit8 v14, v9, 0xe

    .line 431
    .line 432
    invoke-static {v0, v8, v14}, LB/f;->a(LB/k;LY/m;I)LY/h2;

    .line 433
    .line 434
    .line 435
    move-result-object v14

    .line 436
    invoke-interface {v14}, LY/h2;->getValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v14

    .line 440
    check-cast v14, Ljava/lang/Boolean;

    .line 441
    .line 442
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 443
    .line 444
    .line 445
    move-result v14

    .line 446
    and-int/lit8 v15, v4, 0x7e

    .line 447
    .line 448
    shr-int/lit8 v4, v4, 0x3

    .line 449
    .line 450
    and-int/lit16 v4, v4, 0x1c00

    .line 451
    .line 452
    or-int/2addr v4, v15

    .line 453
    const v15, 0xe000

    .line 454
    .line 455
    .line 456
    and-int/2addr v15, v9

    .line 457
    or-int/2addr v4, v15

    .line 458
    const/high16 v15, 0x70000

    .line 459
    .line 460
    and-int/2addr v9, v15

    .line 461
    or-int/2addr v9, v4

    .line 462
    move v4, v14

    .line 463
    invoke-static/range {v2 .. v9}, LW/j;->h(ZZZLU/f0;FFLY/m;I)LY/h2;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    invoke-virtual {v5, v2, v3, v4}, LU/f0;->a(ZZZ)J

    .line 468
    .line 469
    .line 470
    move-result-wide v14

    .line 471
    const/16 v4, 0x96

    .line 472
    .line 473
    move-wide/from16 p4, v14

    .line 474
    .line 475
    const/4 v15, 0x0

    .line 476
    const/4 v14, 0x0

    .line 477
    const/4 v0, 0x6

    .line 478
    invoke-static {v4, v15, v14, v0, v14}, Lw/j;->j(IILw/D;ILjava/lang/Object;)Lw/r0;

    .line 479
    .line 480
    .line 481
    move-result-object v14

    .line 482
    const/16 v18, 0x30

    .line 483
    .line 484
    const/16 v19, 0xc

    .line 485
    .line 486
    move v0, v15

    .line 487
    const/4 v15, 0x0

    .line 488
    const/16 v16, 0x0

    .line 489
    .line 490
    move-object/from16 v17, v8

    .line 491
    .line 492
    move-object v4, v12

    .line 493
    move v8, v0

    .line 494
    move-object v0, v13

    .line 495
    move-wide/from16 v12, p4

    .line 496
    .line 497
    invoke-static/range {v12 .. v19}, Lv/v;->a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 498
    .line 499
    .line 500
    move-result-object v12

    .line 501
    move-object/from16 v13, v17

    .line 502
    .line 503
    invoke-interface {v9}, LY/h2;->getValue()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v9

    .line 507
    check-cast v9, Lx/g;

    .line 508
    .line 509
    invoke-static {v4, v9, v0}, Lx/e;->e(Landroidx/compose/ui/e;Lx/g;Ls0/E1;)Landroidx/compose/ui/e;

    .line 510
    .line 511
    .line 512
    move-result-object v9

    .line 513
    new-instance v14, LU/G$a;

    .line 514
    .line 515
    invoke-direct {v14, v12}, LU/G$a;-><init>(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    new-instance v12, LU/g0$a;

    .line 519
    .line 520
    invoke-direct {v12, v14}, LU/g0$a;-><init>(Lie/a;)V

    .line 521
    .line 522
    .line 523
    invoke-static {v9, v12, v0}, LW/j;->u(Landroidx/compose/ui/e;Ls0/t0;Ls0/E1;)Landroidx/compose/ui/e;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    invoke-static {v9, v13, v8}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 528
    .line 529
    .line 530
    invoke-static {}, LY/w;->L()Z

    .line 531
    .line 532
    .line 533
    move-result v8

    .line 534
    if-eqz v8, :cond_29

    .line 535
    .line 536
    invoke-static {}, LY/w;->T()V

    .line 537
    .line 538
    .line 539
    :cond_29
    move v8, v6

    .line 540
    move v9, v7

    .line 541
    move-object v7, v0

    .line 542
    move-object v6, v5

    .line 543
    move-object v5, v4

    .line 544
    :goto_1a
    invoke-interface {v13}, LY/m;->k()LY/B1;

    .line 545
    .line 546
    .line 547
    move-result-object v12

    .line 548
    if-eqz v12, :cond_2a

    .line 549
    .line 550
    new-instance v0, LU/G$b;

    .line 551
    .line 552
    move-object/from16 v4, p3

    .line 553
    .line 554
    invoke-direct/range {v0 .. v11}, LU/G$b;-><init>(LU/G;ZZLB/k;Landroidx/compose/ui/e;LU/f0;Ls0/E1;FFII)V

    .line 555
    .line 556
    .line 557
    invoke-interface {v12, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 558
    .line 559
    .line 560
    :cond_2a
    return-void
.end method

.method public final b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLa1/f0;LB/k;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU/f0;LC/A;Lkotlin/jvm/functions/Function2;LY/m;III)V
    .locals 36

    move-object/from16 v1, p0

    move/from16 v12, p3

    move-object/from16 v14, p6

    move/from16 v0, p19

    move/from16 v2, p20

    move/from16 v3, p21

    const v4, -0x14e35297

    move-object/from16 v5, p18

    .line 1
    invoke-interface {v5, v4}, LY/m;->g(I)LY/m;

    move-result-object v4

    and-int/lit8 v5, v3, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v8, v5

    move-object/from16 v5, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-interface {v4, v5}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p1

    move v8, v0

    :goto_1
    and-int/lit8 v9, v3, 0x2

    if-eqz v9, :cond_4

    or-int/lit8 v8, v8, 0x30

    :cond_3
    move-object/from16 v9, p2

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p2

    invoke-interface {v4, v9}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    const/16 v13, 0x20

    goto :goto_2

    :cond_5
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v8, v13

    :goto_3
    and-int/lit8 v13, v3, 0x4

    const/16 v16, 0x100

    if-eqz v13, :cond_6

    or-int/lit16 v8, v8, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v13, v0, 0x180

    if-nez v13, :cond_8

    invoke-interface {v4, v12}, LY/m;->a(Z)Z

    move-result v13

    if-eqz v13, :cond_7

    move/from16 v13, v16

    goto :goto_4

    :cond_7
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v8, v13

    :cond_8
    :goto_5
    and-int/lit8 v13, v3, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v13, :cond_a

    or-int/lit16 v8, v8, 0xc00

    :cond_9
    move/from16 v13, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v0, 0xc00

    if-nez v13, :cond_9

    move/from16 v13, p4

    invoke-interface {v4, v13}, LY/m;->a(Z)Z

    move-result v19

    if-eqz v19, :cond_b

    move/from16 v19, v18

    goto :goto_6

    :cond_b
    move/from16 v19, v17

    :goto_6
    or-int v8, v8, v19

    :goto_7
    and-int/lit8 v19, v3, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_d

    or-int/lit16 v8, v8, 0x6000

    :cond_c
    move-object/from16 v6, p5

    goto :goto_9

    :cond_d
    and-int/lit16 v6, v0, 0x6000

    if-nez v6, :cond_c

    move-object/from16 v6, p5

    invoke-interface {v4, v6}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_e

    move/from16 v19, v21

    goto :goto_8

    :cond_e
    move/from16 v19, v20

    :goto_8
    or-int v8, v8, v19

    :goto_9
    and-int/lit8 v19, v3, 0x20

    const/high16 v22, 0x10000

    const/high16 v23, 0x20000

    const/high16 v24, 0x30000

    if-eqz v19, :cond_f

    or-int v8, v8, v24

    goto :goto_b

    :cond_f
    and-int v19, v0, v24

    if-nez v19, :cond_11

    invoke-interface {v4, v14}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_10

    move/from16 v19, v23

    goto :goto_a

    :cond_10
    move/from16 v19, v22

    :goto_a
    or-int v8, v8, v19

    :cond_11
    :goto_b
    and-int/lit8 v19, v3, 0x40

    const/high16 v25, 0x180000

    if-eqz v19, :cond_12

    or-int v8, v8, v25

    move/from16 v7, p7

    goto :goto_d

    :cond_12
    and-int v26, v0, v25

    move/from16 v7, p7

    if-nez v26, :cond_14

    invoke-interface {v4, v7}, LY/m;->a(Z)Z

    move-result v27

    if-eqz v27, :cond_13

    const/high16 v27, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v27, 0x80000

    :goto_c
    or-int v8, v8, v27

    :cond_14
    :goto_d
    and-int/lit16 v10, v3, 0x80

    const/high16 v28, 0xc00000

    if-eqz v10, :cond_15

    or-int v8, v8, v28

    move-object/from16 v11, p8

    goto :goto_f

    :cond_15
    and-int v29, v0, v28

    move-object/from16 v11, p8

    if-nez v29, :cond_17

    invoke-interface {v4, v11}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v30, 0x400000

    :goto_e
    or-int v8, v8, v30

    :cond_17
    :goto_f
    and-int/lit16 v15, v3, 0x100

    const/high16 v31, 0x6000000

    if-eqz v15, :cond_18

    or-int v8, v8, v31

    move-object/from16 v0, p9

    goto :goto_11

    :cond_18
    and-int v31, v0, v31

    move-object/from16 v0, p9

    if-nez v31, :cond_1a

    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_19

    const/high16 v31, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v31, 0x2000000

    :goto_10
    or-int v8, v8, v31

    :cond_1a
    :goto_11
    and-int/lit16 v0, v3, 0x200

    const/high16 v31, 0x30000000

    if-eqz v0, :cond_1c

    or-int v8, v8, v31

    :cond_1b
    move/from16 v31, v0

    move-object/from16 v0, p10

    goto :goto_13

    :cond_1c
    and-int v31, p19, v31

    if-nez v31, :cond_1b

    move/from16 v31, v0

    move-object/from16 v0, p10

    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_1d

    const/high16 v32, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v32, 0x10000000

    :goto_12
    or-int v8, v8, v32

    :goto_13
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v26, v2, 0x6

    move/from16 v32, v0

    move-object/from16 v0, p11

    goto :goto_15

    :cond_1e
    and-int/lit8 v32, v2, 0x6

    if-nez v32, :cond_20

    move/from16 v32, v0

    move-object/from16 v0, p11

    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/16 v26, 0x4

    goto :goto_14

    :cond_1f
    const/16 v26, 0x2

    :goto_14
    or-int v26, v2, v26

    goto :goto_15

    :cond_20
    move/from16 v32, v0

    move-object/from16 v0, p11

    move/from16 v26, v2

    :goto_15
    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v26, v26, 0x30

    move/from16 v33, v0

    :goto_16
    move/from16 v0, v26

    goto :goto_18

    :cond_21
    and-int/lit8 v33, v2, 0x30

    if-nez v33, :cond_23

    move/from16 v33, v0

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_22

    const/16 v27, 0x20

    goto :goto_17

    :cond_22
    const/16 v27, 0x10

    :goto_17
    or-int v26, v26, v27

    goto :goto_16

    :cond_23
    move/from16 v33, v0

    move-object/from16 v0, p12

    goto :goto_16

    :goto_18
    and-int/lit16 v5, v3, 0x1000

    if-eqz v5, :cond_24

    or-int/lit16 v0, v0, 0x180

    goto :goto_1a

    :cond_24
    move/from16 v26, v0

    and-int/lit16 v0, v2, 0x180

    if-nez v0, :cond_26

    move-object/from16 v0, p13

    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_25

    move/from16 v30, v16

    goto :goto_19

    :cond_25
    const/16 v30, 0x80

    :goto_19
    or-int v16, v26, v30

    move/from16 v0, v16

    goto :goto_1a

    :cond_26
    move-object/from16 v0, p13

    move/from16 v0, v26

    :goto_1a
    move/from16 v16, v5

    and-int/lit16 v5, v3, 0x2000

    if-eqz v5, :cond_28

    or-int/lit16 v0, v0, 0xc00

    move/from16 v26, v0

    :cond_27
    move-object/from16 v0, p14

    goto :goto_1b

    :cond_28
    move/from16 v26, v0

    and-int/lit16 v0, v2, 0xc00

    if-nez v0, :cond_27

    move-object/from16 v0, p14

    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_29

    move/from16 v17, v18

    :cond_29
    or-int v17, v26, v17

    move/from16 v26, v17

    :goto_1b
    and-int/lit16 v0, v2, 0x6000

    if-nez v0, :cond_2c

    and-int/lit16 v0, v3, 0x4000

    if-nez v0, :cond_2a

    move-object/from16 v0, p15

    invoke-interface {v4, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2b

    move/from16 v20, v21

    goto :goto_1c

    :cond_2a
    move-object/from16 v0, p15

    :cond_2b
    :goto_1c
    or-int v26, v26, v20

    goto :goto_1d

    :cond_2c
    move-object/from16 v0, p15

    :goto_1d
    and-int v17, v2, v24

    if-nez v17, :cond_2e

    const v17, 0x8000

    and-int v17, v3, v17

    move-object/from16 v0, p16

    if-nez v17, :cond_2d

    invoke-interface {v4, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2d

    move/from16 v17, v23

    goto :goto_1e

    :cond_2d
    move/from16 v17, v22

    :goto_1e
    or-int v26, v26, v17

    goto :goto_1f

    :cond_2e
    move-object/from16 v0, p16

    :goto_1f
    and-int v17, v3, v22

    if-eqz v17, :cond_2f

    or-int v26, v26, v25

    move-object/from16 v0, p17

    goto :goto_21

    :cond_2f
    and-int v18, v2, v25

    move-object/from16 v0, p17

    if-nez v18, :cond_31

    invoke-interface {v4, v0}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_30

    const/high16 v18, 0x100000

    goto :goto_20

    :cond_30
    const/high16 v18, 0x80000

    :goto_20
    or-int v26, v26, v18

    :cond_31
    :goto_21
    and-int v18, v3, v23

    if-eqz v18, :cond_32

    or-int v26, v26, v28

    goto :goto_23

    :cond_32
    and-int v18, v2, v28

    if-nez v18, :cond_34

    invoke-interface {v4, v1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_33

    const/high16 v18, 0x800000

    goto :goto_22

    :cond_33
    const/high16 v18, 0x400000

    :goto_22
    or-int v26, v26, v18

    :cond_34
    :goto_23
    const v18, 0x12492493

    and-int v0, v8, v18

    const v2, 0x12492492

    if-ne v0, v2, :cond_36

    const v0, 0x492493

    and-int v0, v26, v0

    const v2, 0x492492

    if-ne v0, v2, :cond_36

    invoke-interface {v4}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_35

    goto :goto_24

    .line 2
    :cond_35
    invoke-interface {v4}, LY/m;->K()V

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object v2, v4

    move v8, v7

    move-object v9, v11

    move-object/from16 v11, p10

    goto/16 :goto_31

    .line 3
    :cond_36
    :goto_24
    invoke-interface {v4}, LY/m;->G()V

    and-int/lit8 v0, p19, 0x1

    if-eqz v0, :cond_3a

    invoke-interface {v4}, LY/m;->N()Z

    move-result v0

    if-eqz v0, :cond_37

    goto :goto_25

    .line 4
    :cond_37
    invoke-interface {v4}, LY/m;->K()V

    and-int/lit16 v0, v3, 0x4000

    if-eqz v0, :cond_38

    const v0, -0xe001

    and-int v26, v26, v0

    :cond_38
    const v0, 0x8000

    and-int/2addr v0, v3

    if-eqz v0, :cond_39

    const v0, -0x70001

    and-int v26, v26, v0

    :cond_39
    move-object/from16 v5, p9

    move-object/from16 v6, p10

    move-object/from16 v18, p12

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move-object/from16 v16, p15

    move-object/from16 v15, p16

    move-object/from16 v0, p17

    move-object v2, v4

    move/from16 v17, v7

    move-object v4, v11

    move/from16 v1, v26

    move-object/from16 v7, p11

    goto/16 :goto_30

    :cond_3a
    :goto_25
    if-eqz v19, :cond_3b

    const/4 v0, 0x0

    goto :goto_26

    :cond_3b
    move v0, v7

    :goto_26
    const/4 v2, 0x0

    if-eqz v10, :cond_3c

    move-object v11, v2

    :cond_3c
    if-eqz v15, :cond_3d

    move-object v7, v2

    goto :goto_27

    :cond_3d
    move-object/from16 v7, p9

    :goto_27
    if-eqz v31, :cond_3e

    move-object v10, v2

    goto :goto_28

    :cond_3e
    move-object/from16 v10, p10

    :goto_28
    if-eqz v32, :cond_3f

    move-object v15, v2

    goto :goto_29

    :cond_3f
    move-object/from16 v15, p11

    :goto_29
    if-eqz v33, :cond_40

    move-object/from16 v18, v2

    goto :goto_2a

    :cond_40
    move-object/from16 v18, p12

    :goto_2a
    if-eqz v16, :cond_41

    move-object/from16 v16, v2

    goto :goto_2b

    :cond_41
    move-object/from16 v16, p13

    :goto_2b
    if-eqz v5, :cond_42

    goto :goto_2c

    :cond_42
    move-object/from16 v2, p14

    :goto_2c
    and-int/lit16 v5, v3, 0x4000

    if-eqz v5, :cond_43

    shr-int/lit8 v5, v26, 0x15

    and-int/lit8 v5, v5, 0xe

    .line 5
    invoke-virtual {v1, v4, v5}, LU/G;->c(LY/m;I)LU/f0;

    move-result-object v5

    const v19, -0xe001

    and-int v26, v26, v19

    goto :goto_2d

    :cond_43
    move-object/from16 v5, p15

    :goto_2d
    const v19, 0x8000

    and-int v19, v3, v19

    if-eqz v19, :cond_44

    const/16 v19, 0xf

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 p7, v1

    move/from16 p12, v19

    move-object/from16 p13, v20

    move/from16 p8, v21

    move/from16 p9, v22

    move/from16 p10, v23

    move/from16 p11, v24

    .line 6
    invoke-static/range {p7 .. p13}, LU/G;->e(LU/G;FFFFILjava/lang/Object;)LC/A;

    move-result-object v1

    const v19, -0x70001

    and-int v19, v26, v19

    move/from16 v26, v19

    goto :goto_2e

    :cond_44
    move-object/from16 v1, p16

    :goto_2e
    if-eqz v17, :cond_45

    move-object/from16 p7, v1

    .line 7
    new-instance v1, LU/G$c;

    invoke-direct {v1, v12, v0, v14, v5}, LU/G$c;-><init>(ZZLB/k;LU/f0;)V

    move/from16 v17, v0

    const/16 v0, 0x36

    move-object/from16 p8, v2

    const v2, -0x56576ca2

    const/4 v3, 0x1

    invoke-static {v2, v3, v1, v4, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v0

    :goto_2f
    move-object v2, v4

    move-object v6, v10

    move-object v4, v11

    move-object/from16 v9, v16

    move/from16 v1, v26

    move-object/from16 v10, p8

    move-object/from16 v16, v5

    move-object v5, v7

    move-object v7, v15

    move-object/from16 v15, p7

    goto :goto_30

    :cond_45
    move/from16 v17, v0

    move-object/from16 p7, v1

    move-object/from16 p8, v2

    move-object/from16 v0, p17

    goto :goto_2f

    :goto_30
    invoke-interface {v2}, LY/m;->y()V

    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_46

    const v3, -0x14e35297

    const-string v11, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:884)"

    .line 8
    invoke-static {v3, v8, v1, v11}, LY/w;->U(IIILjava/lang/String;)V

    :cond_46
    move/from16 v13, v17

    move-object/from16 v17, v0

    .line 9
    sget-object v0, LW/p;->b:LW/p;

    shl-int/lit8 v3, v8, 0x3

    and-int/lit8 v11, v3, 0x70

    or-int/lit8 v11, v11, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v11

    shr-int/lit8 v11, v8, 0x3

    move-object/from16 p7, v0

    and-int/lit16 v0, v11, 0x1c00

    or-int/2addr v0, v3

    shr-int/lit8 v3, v8, 0x9

    const v19, 0xe000

    and-int v19, v3, v19

    or-int v0, v0, v19

    const/high16 v19, 0x70000

    and-int v19, v3, v19

    or-int v0, v0, v19

    const/high16 v19, 0x380000

    and-int v19, v3, v19

    or-int v0, v0, v19

    shl-int/lit8 v19, v1, 0x15

    const/high16 v20, 0x1c00000

    and-int v20, v19, v20

    or-int v0, v0, v20

    const/high16 v20, 0xe000000

    and-int v20, v19, v20

    or-int v0, v0, v20

    const/high16 v20, 0x70000000

    and-int v19, v19, v20

    or-int v19, v0, v19

    shr-int/lit8 v0, v1, 0x9

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v20, v8, 0x6

    and-int/lit8 v20, v20, 0x70

    or-int v0, v0, v20

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v0, v8

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v0, v3

    const v3, 0xe000

    and-int/2addr v3, v11

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v1

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x6

    const/high16 v8, 0x380000

    and-int/2addr v3, v8

    or-int/2addr v0, v3

    shl-int/lit8 v1, v1, 0x3

    const/high16 v3, 0x1c00000

    and-int/2addr v1, v3

    or-int v20, v0, v1

    const/16 v21, 0x0

    move-object/from16 v1, p1

    move/from16 v11, p4

    move-object/from16 v3, p5

    move-object/from16 v0, p7

    move-object/from16 v8, v18

    move-object/from16 v18, v2

    move-object/from16 v2, p2

    .line 10
    invoke-static/range {v0 .. v21}, LW/j;->a(LW/p;Ljava/lang/String;Lkotlin/jvm/functions/Function2;La1/f0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLB/k;LC/A;LU/f0;Lkotlin/jvm/functions/Function2;LY/m;III)V

    move-object/from16 v2, v18

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_47

    invoke-static {}, LY/w;->T()V

    :cond_47
    move v11, v13

    move-object v13, v8

    move v8, v11

    move-object v11, v6

    move-object v12, v7

    move-object v14, v9

    move-object/from16 v18, v17

    move-object v9, v4

    move-object/from16 v17, v15

    move-object v15, v10

    move-object v10, v5

    .line 11
    :goto_31
    invoke-interface {v2}, LY/m;->k()LY/B1;

    move-result-object v0

    if-eqz v0, :cond_48

    move-object v1, v0

    new-instance v0, LU/G$d;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    move-object/from16 v35, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v21}, LU/G$d;-><init>(LU/G;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLa1/f0;LB/k;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LU/f0;LC/A;Lkotlin/jvm/functions/Function2;III)V

    move-object/from16 v1, v35

    invoke-interface {v1, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    :cond_48
    return-void
.end method

.method public final c(LY/m;I)LU/f0;
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
    const-string v1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)"

    .line 9
    .line 10
    const v2, -0x1c1cd5e2

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v0, LU/D;->a:LU/D;

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    invoke-virtual {v0, p1, v1}, LU/D;->a(LY/m;I)LU/l;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    shl-int/lit8 p2, p2, 0x3

    .line 24
    .line 25
    and-int/lit8 p2, p2, 0x70

    .line 26
    .line 27
    invoke-virtual {p0, v0, p1, p2}, LU/G;->f(LU/l;LY/m;I)LU/f0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {}, LY/w;->L()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-static {}, LY/w;->T()V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object p1
.end method

.method public final d(FFFF)LC/A;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/foundation/layout/p;->d(FFFF)LC/A;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final f(LU/l;LY/m;I)LU/f0;
    .locals 94

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static {}, LY/w;->L()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const-string v3, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)"

    .line 13
    .line 14
    const v4, -0x116d1d39

    .line 15
    .line 16
    .line 17
    move/from16 v5, p3

    .line 18
    .line 19
    invoke-static {v4, v5, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0}, LU/l;->h()LU/f0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const v3, 0x5bd0a3e6

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v3}, LY/m;->V(I)V

    .line 30
    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    new-instance v4, LU/f0;

    .line 35
    .line 36
    sget-object v2, LX/i;->a:LX/i;

    .line 37
    .line 38
    invoke-virtual {v2}, LX/i;->p()LX/c;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-virtual {v2}, LX/i;->v()LX/c;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v7

    .line 54
    invoke-virtual {v2}, LX/i;->c()LX/c;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v9

    .line 62
    const/16 v15, 0xe

    .line 63
    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const v11, 0x3ec28f5c    # 0.38f

    .line 67
    .line 68
    .line 69
    const/4 v12, 0x0

    .line 70
    const/4 v13, 0x0

    .line 71
    const/4 v14, 0x0

    .line 72
    invoke-static/range {v9 .. v16}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    invoke-virtual {v2}, LX/i;->j()LX/c;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v11

    .line 84
    sget-object v3, Ls0/r0;->b:Ls0/r0$a;

    .line 85
    .line 86
    invoke-virtual {v3}, Ls0/r0$a;->i()J

    .line 87
    .line 88
    .line 89
    move-result-wide v13

    .line 90
    invoke-virtual {v3}, Ls0/r0$a;->i()J

    .line 91
    .line 92
    .line 93
    move-result-wide v15

    .line 94
    invoke-virtual {v3}, Ls0/r0$a;->i()J

    .line 95
    .line 96
    .line 97
    move-result-wide v17

    .line 98
    invoke-virtual {v3}, Ls0/r0$a;->i()J

    .line 99
    .line 100
    .line 101
    move-result-wide v19

    .line 102
    invoke-virtual {v2}, LX/i;->a()LX/c;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v21

    .line 110
    invoke-virtual {v2}, LX/i;->i()LX/c;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v23

    .line 118
    invoke-static {}, LQ/K;->b()LY/b1;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-interface {v1, v3}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    move-object/from16 v25, v3

    .line 127
    .line 128
    check-cast v25, LQ/J;

    .line 129
    .line 130
    invoke-virtual {v2}, LX/i;->s()LX/c;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 135
    .line 136
    .line 137
    move-result-wide v26

    .line 138
    invoke-virtual {v2}, LX/i;->B()LX/c;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v28

    .line 146
    invoke-virtual {v2}, LX/i;->f()LX/c;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 151
    .line 152
    .line 153
    move-result-wide v30

    .line 154
    const/16 v36, 0xe

    .line 155
    .line 156
    const/16 v37, 0x0

    .line 157
    .line 158
    const v32, 0x3df5c28f    # 0.12f

    .line 159
    .line 160
    .line 161
    const/16 v33, 0x0

    .line 162
    .line 163
    const/16 v34, 0x0

    .line 164
    .line 165
    const/16 v35, 0x0

    .line 166
    .line 167
    invoke-static/range {v30 .. v37}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v30

    .line 171
    invoke-virtual {v2}, LX/i;->m()LX/c;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v32

    .line 179
    invoke-virtual {v2}, LX/i;->r()LX/c;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 184
    .line 185
    .line 186
    move-result-wide v34

    .line 187
    invoke-virtual {v2}, LX/i;->A()LX/c;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v36

    .line 195
    invoke-virtual {v2}, LX/i;->e()LX/c;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v38

    .line 203
    const/16 v44, 0xe

    .line 204
    .line 205
    const/16 v45, 0x0

    .line 206
    .line 207
    const v40, 0x3ec28f5c    # 0.38f

    .line 208
    .line 209
    .line 210
    const/16 v41, 0x0

    .line 211
    .line 212
    const/16 v42, 0x0

    .line 213
    .line 214
    const/16 v43, 0x0

    .line 215
    .line 216
    invoke-static/range {v38 .. v45}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 217
    .line 218
    .line 219
    move-result-wide v38

    .line 220
    invoke-virtual {v2}, LX/i;->l()LX/c;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 225
    .line 226
    .line 227
    move-result-wide v40

    .line 228
    invoke-virtual {v2}, LX/i;->u()LX/c;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 233
    .line 234
    .line 235
    move-result-wide v42

    .line 236
    invoke-virtual {v2}, LX/i;->D()LX/c;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 241
    .line 242
    .line 243
    move-result-wide v44

    .line 244
    invoke-virtual {v2}, LX/i;->h()LX/c;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 249
    .line 250
    .line 251
    move-result-wide v46

    .line 252
    const/16 v52, 0xe

    .line 253
    .line 254
    const/16 v53, 0x0

    .line 255
    .line 256
    const v48, 0x3ec28f5c    # 0.38f

    .line 257
    .line 258
    .line 259
    const/16 v49, 0x0

    .line 260
    .line 261
    const/16 v50, 0x0

    .line 262
    .line 263
    const/16 v51, 0x0

    .line 264
    .line 265
    invoke-static/range {v46 .. v53}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 266
    .line 267
    .line 268
    move-result-wide v46

    .line 269
    invoke-virtual {v2}, LX/i;->o()LX/c;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 274
    .line 275
    .line 276
    move-result-wide v48

    .line 277
    invoke-virtual {v2}, LX/i;->q()LX/c;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 282
    .line 283
    .line 284
    move-result-wide v50

    .line 285
    invoke-virtual {v2}, LX/i;->z()LX/c;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 290
    .line 291
    .line 292
    move-result-wide v52

    .line 293
    invoke-virtual {v2}, LX/i;->d()LX/c;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 298
    .line 299
    .line 300
    move-result-wide v54

    .line 301
    const/16 v60, 0xe

    .line 302
    .line 303
    const/16 v61, 0x0

    .line 304
    .line 305
    const v56, 0x3ec28f5c    # 0.38f

    .line 306
    .line 307
    .line 308
    const/16 v57, 0x0

    .line 309
    .line 310
    const/16 v58, 0x0

    .line 311
    .line 312
    const/16 v59, 0x0

    .line 313
    .line 314
    invoke-static/range {v54 .. v61}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 315
    .line 316
    .line 317
    move-result-wide v54

    .line 318
    invoke-virtual {v2}, LX/i;->k()LX/c;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 323
    .line 324
    .line 325
    move-result-wide v56

    .line 326
    invoke-virtual {v2}, LX/i;->w()LX/c;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 331
    .line 332
    .line 333
    move-result-wide v58

    .line 334
    invoke-virtual {v2}, LX/i;->w()LX/c;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 339
    .line 340
    .line 341
    move-result-wide v60

    .line 342
    invoke-virtual {v2}, LX/i;->c()LX/c;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 347
    .line 348
    .line 349
    move-result-wide v62

    .line 350
    const/16 v68, 0xe

    .line 351
    .line 352
    const/16 v69, 0x0

    .line 353
    .line 354
    const v64, 0x3ec28f5c    # 0.38f

    .line 355
    .line 356
    .line 357
    const/16 v65, 0x0

    .line 358
    .line 359
    const/16 v66, 0x0

    .line 360
    .line 361
    const/16 v67, 0x0

    .line 362
    .line 363
    invoke-static/range {v62 .. v69}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 364
    .line 365
    .line 366
    move-result-wide v62

    .line 367
    invoke-virtual {v2}, LX/i;->w()LX/c;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 372
    .line 373
    .line 374
    move-result-wide v64

    .line 375
    invoke-virtual {v2}, LX/i;->t()LX/c;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 380
    .line 381
    .line 382
    move-result-wide v66

    .line 383
    invoke-virtual {v2}, LX/i;->C()LX/c;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 388
    .line 389
    .line 390
    move-result-wide v68

    .line 391
    invoke-virtual {v2}, LX/i;->g()LX/c;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 396
    .line 397
    .line 398
    move-result-wide v70

    .line 399
    const/16 v76, 0xe

    .line 400
    .line 401
    const/16 v77, 0x0

    .line 402
    .line 403
    const v72, 0x3ec28f5c    # 0.38f

    .line 404
    .line 405
    .line 406
    const/16 v73, 0x0

    .line 407
    .line 408
    const/16 v74, 0x0

    .line 409
    .line 410
    const/16 v75, 0x0

    .line 411
    .line 412
    invoke-static/range {v70 .. v77}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 413
    .line 414
    .line 415
    move-result-wide v70

    .line 416
    invoke-virtual {v2}, LX/i;->n()LX/c;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 421
    .line 422
    .line 423
    move-result-wide v72

    .line 424
    invoke-virtual {v2}, LX/i;->x()LX/c;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 429
    .line 430
    .line 431
    move-result-wide v74

    .line 432
    invoke-virtual {v2}, LX/i;->x()LX/c;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 437
    .line 438
    .line 439
    move-result-wide v76

    .line 440
    invoke-virtual {v2}, LX/i;->x()LX/c;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 445
    .line 446
    .line 447
    move-result-wide v78

    .line 448
    const/16 v84, 0xe

    .line 449
    .line 450
    const/16 v85, 0x0

    .line 451
    .line 452
    const v80, 0x3ec28f5c    # 0.38f

    .line 453
    .line 454
    .line 455
    const/16 v81, 0x0

    .line 456
    .line 457
    const/16 v82, 0x0

    .line 458
    .line 459
    const/16 v83, 0x0

    .line 460
    .line 461
    invoke-static/range {v78 .. v85}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 462
    .line 463
    .line 464
    move-result-wide v78

    .line 465
    invoke-virtual {v2}, LX/i;->x()LX/c;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 470
    .line 471
    .line 472
    move-result-wide v80

    .line 473
    invoke-virtual {v2}, LX/i;->y()LX/c;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 478
    .line 479
    .line 480
    move-result-wide v82

    .line 481
    invoke-virtual {v2}, LX/i;->y()LX/c;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 486
    .line 487
    .line 488
    move-result-wide v84

    .line 489
    invoke-virtual {v2}, LX/i;->y()LX/c;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-static {v0, v3}, LU/m;->f(LU/l;LX/c;)J

    .line 494
    .line 495
    .line 496
    move-result-wide v86

    .line 497
    const/16 v92, 0xe

    .line 498
    .line 499
    const/16 v93, 0x0

    .line 500
    .line 501
    const v88, 0x3ec28f5c    # 0.38f

    .line 502
    .line 503
    .line 504
    const/16 v89, 0x0

    .line 505
    .line 506
    const/16 v90, 0x0

    .line 507
    .line 508
    const/16 v91, 0x0

    .line 509
    .line 510
    invoke-static/range {v86 .. v93}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 511
    .line 512
    .line 513
    move-result-wide v86

    .line 514
    invoke-virtual {v2}, LX/i;->y()LX/c;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-static {v0, v2}, LU/m;->f(LU/l;LX/c;)J

    .line 519
    .line 520
    .line 521
    move-result-wide v88

    .line 522
    const/16 v90, 0x0

    .line 523
    .line 524
    invoke-direct/range {v4 .. v90}, LU/f0;-><init>(JJJJJJJJJJLQ/J;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0, v4}, LU/l;->X(LU/f0;)V

    .line 528
    .line 529
    .line 530
    move-object v2, v4

    .line 531
    :cond_1
    invoke-interface {v1}, LY/m;->O()V

    .line 532
    .line 533
    .line 534
    invoke-static {}, LY/w;->L()Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_2

    .line 539
    .line 540
    invoke-static {}, LY/w;->T()V

    .line 541
    .line 542
    .line 543
    :cond_2
    return-object v2
.end method

.method public final g()F
    .locals 1

    .line 1
    sget v0, LU/G;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public final h()F
    .locals 1

    .line 1
    sget v0, LU/G;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final i()F
    .locals 1

    .line 1
    sget v0, LU/G;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public final j(LY/m;I)Ls0/E1;
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
    const-string v1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)"

    .line 9
    .line 10
    const v2, -0x3f956b61

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, LX/i;->a:LX/i;

    .line 17
    .line 18
    invoke-virtual {p2}, LX/i;->b()LX/l;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x6

    .line 23
    invoke-static {p2, p1, v0}, LU/V;->d(LX/l;LY/m;I)Ls0/E1;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, LY/w;->L()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {}, LY/w;->T()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p1
.end method

.method public final k()F
    .locals 1

    .line 1
    sget v0, LU/G;->d:F

    .line 2
    .line 3
    return v0
.end method
