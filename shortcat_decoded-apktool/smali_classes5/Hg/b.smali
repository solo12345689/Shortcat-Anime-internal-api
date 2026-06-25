.class public abstract LHg/b;
.super Ljava/lang/Object;

# interfaces
.implements LFg/j;


# static fields
.field private static h:[J


# instance fields
.field protected final a:LFg/d;

.field protected b:[J

.field protected c:[B

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    new-array v0, v0, [J

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LHg/b;->h:[J

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 8
        0x1
        0x8082
        -0x7fffffffffff7f76L    # -1.62577E-319
        -0x7fffffff7fff8000L    # -1.061014085E-314
        0x808b
        0x80000001L
        -0x7fffffff7fff7f7fL    # -1.061014149E-314
        -0x7fffffffffff7ff7L    # -1.6194E-319
        0x8a
        0x88
        0x80008009L
        0x8000000aL
        0x8000808bL
        -0x7fffffffffffff75L    # -6.87E-322
        -0x7fffffffffff7f77L    # -1.6257E-319
        -0x7fffffffffff7ffdL    # -1.6191E-319
        -0x7fffffffffff7ffeL    # -1.61905E-319
        -0x7fffffffffffff80L    # -6.32E-322
        0x800a
        -0x7fffffff7ffffff6L    # -1.0609979004E-314
        -0x7fffffff7fff7f7fL    # -1.061014149E-314
        -0x7fffffffffff7f80L    # -1.6253E-319
        0x80000001L
        -0x7fffffff7fff7ff8L    # -1.061014089E-314
    .end array-data
.end method

.method public constructor <init>(ILFg/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x19

    .line 5
    .line 6
    new-array v0, v0, [J

    .line 7
    .line 8
    iput-object v0, p0, LHg/b;->b:[J

    .line 9
    .line 10
    const/16 v0, 0xc0

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    iput-object v0, p0, LHg/b;->c:[B

    .line 15
    .line 16
    iput-object p2, p0, LHg/b;->a:LFg/d;

    .line 17
    .line 18
    invoke-direct {p0, p1}, LHg/b;->m(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LHg/b;->l()LFg/c;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, LFg/g;->a(LFg/c;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private f([BI)V
    .locals 7

    .line 1
    iget v0, p0, LHg/b;->d:I

    .line 2
    .line 3
    ushr-int/lit8 v0, v0, 0x6

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    iget-object v2, p0, LHg/b;->b:[J

    .line 9
    .line 10
    aget-wide v3, v2, v1

    .line 11
    .line 12
    invoke-static {p1, p2}, LOh/g;->f([BI)J

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    xor-long/2addr v3, v5

    .line 17
    aput-wide v3, v2, v1

    .line 18
    .line 19
    add-int/lit8 p2, p2, 0x8

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-direct {p0}, LHg/b;->h()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private g()V
    .locals 4

    .line 1
    invoke-direct {p0}, LHg/b;->h()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LHg/b;->b:[J

    .line 5
    .line 6
    iget v1, p0, LHg/b;->d:I

    .line 7
    .line 8
    ushr-int/lit8 v1, v1, 0x6

    .line 9
    .line 10
    iget-object v2, p0, LHg/b;->c:[B

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v0, v3, v1, v2, v3}, LOh/g;->j([JII[BI)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, LHg/b;->d:I

    .line 17
    .line 18
    iput v0, p0, LHg/b;->e:I

    .line 19
    .line 20
    return-void
.end method

.method private h()V
    .locals 95

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LHg/b;->b:[J

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-wide v3, v1, v2

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    aget-wide v6, v1, v5

    .line 10
    .line 11
    const/4 v8, 0x2

    .line 12
    aget-wide v9, v1, v8

    .line 13
    .line 14
    const/4 v11, 0x3

    .line 15
    aget-wide v12, v1, v11

    .line 16
    .line 17
    const/4 v14, 0x4

    .line 18
    aget-wide v15, v1, v14

    .line 19
    .line 20
    const/16 v17, 0x5

    .line 21
    .line 22
    aget-wide v18, v1, v17

    .line 23
    .line 24
    const/16 v20, 0x6

    .line 25
    .line 26
    aget-wide v21, v1, v20

    .line 27
    .line 28
    const/16 v23, 0x7

    .line 29
    .line 30
    aget-wide v24, v1, v23

    .line 31
    .line 32
    const/16 v26, 0x8

    .line 33
    .line 34
    aget-wide v27, v1, v26

    .line 35
    .line 36
    const/16 v29, 0x9

    .line 37
    .line 38
    aget-wide v30, v1, v29

    .line 39
    .line 40
    const/16 v32, 0xa

    .line 41
    .line 42
    aget-wide v33, v1, v32

    .line 43
    .line 44
    const/16 v35, 0xb

    .line 45
    .line 46
    aget-wide v36, v1, v35

    .line 47
    .line 48
    const/16 v38, 0xc

    .line 49
    .line 50
    aget-wide v39, v1, v38

    .line 51
    .line 52
    const/16 v41, 0xd

    .line 53
    .line 54
    aget-wide v41, v1, v41

    .line 55
    .line 56
    const/16 v43, 0xe

    .line 57
    .line 58
    aget-wide v44, v1, v43

    .line 59
    .line 60
    const/16 v46, 0xf

    .line 61
    .line 62
    aget-wide v47, v1, v46

    .line 63
    .line 64
    const/16 v49, 0x10

    .line 65
    .line 66
    aget-wide v49, v1, v49

    .line 67
    .line 68
    const/16 v51, 0x11

    .line 69
    .line 70
    aget-wide v51, v1, v51

    .line 71
    .line 72
    const/16 v53, 0x12

    .line 73
    .line 74
    aget-wide v54, v1, v53

    .line 75
    .line 76
    const/16 v56, 0x13

    .line 77
    .line 78
    aget-wide v57, v1, v56

    .line 79
    .line 80
    const/16 v59, 0x14

    .line 81
    .line 82
    aget-wide v60, v1, v59

    .line 83
    .line 84
    const/16 v62, 0x15

    .line 85
    .line 86
    aget-wide v63, v1, v62

    .line 87
    .line 88
    const/16 v65, 0x16

    .line 89
    .line 90
    aget-wide v65, v1, v65

    .line 91
    .line 92
    const/16 v67, 0x17

    .line 93
    .line 94
    aget-wide v68, v1, v67

    .line 95
    .line 96
    move/from16 v70, v2

    .line 97
    .line 98
    const/16 v2, 0x18

    .line 99
    .line 100
    aget-wide v71, v1, v2

    .line 101
    .line 102
    move/from16 v73, v5

    .line 103
    .line 104
    move/from16 v5, v70

    .line 105
    .line 106
    :goto_0
    if-ge v5, v2, :cond_0

    .line 107
    .line 108
    xor-long v74, v3, v18

    .line 109
    .line 110
    xor-long v74, v74, v33

    .line 111
    .line 112
    xor-long v74, v74, v47

    .line 113
    .line 114
    xor-long v74, v74, v60

    .line 115
    .line 116
    xor-long v76, v6, v21

    .line 117
    .line 118
    xor-long v76, v76, v36

    .line 119
    .line 120
    xor-long v76, v76, v49

    .line 121
    .line 122
    xor-long v76, v76, v63

    .line 123
    .line 124
    xor-long v78, v9, v24

    .line 125
    .line 126
    xor-long v78, v78, v39

    .line 127
    .line 128
    xor-long v78, v78, v51

    .line 129
    .line 130
    xor-long v78, v78, v65

    .line 131
    .line 132
    xor-long v80, v12, v27

    .line 133
    .line 134
    xor-long v80, v80, v41

    .line 135
    .line 136
    xor-long v80, v80, v54

    .line 137
    .line 138
    xor-long v80, v80, v68

    .line 139
    .line 140
    xor-long v82, v15, v30

    .line 141
    .line 142
    xor-long v82, v82, v44

    .line 143
    .line 144
    xor-long v82, v82, v57

    .line 145
    .line 146
    xor-long v82, v82, v71

    .line 147
    .line 148
    shl-long v84, v76, v73

    .line 149
    .line 150
    const/16 v86, -0x1

    .line 151
    .line 152
    ushr-long v87, v76, v86

    .line 153
    .line 154
    or-long v84, v84, v87

    .line 155
    .line 156
    xor-long v84, v84, v82

    .line 157
    .line 158
    shl-long v87, v78, v73

    .line 159
    .line 160
    ushr-long v89, v78, v86

    .line 161
    .line 162
    or-long v87, v87, v89

    .line 163
    .line 164
    xor-long v87, v87, v74

    .line 165
    .line 166
    shl-long v89, v80, v73

    .line 167
    .line 168
    ushr-long v91, v80, v86

    .line 169
    .line 170
    or-long v89, v89, v91

    .line 171
    .line 172
    xor-long v76, v89, v76

    .line 173
    .line 174
    shl-long v89, v82, v73

    .line 175
    .line 176
    ushr-long v82, v82, v86

    .line 177
    .line 178
    or-long v82, v89, v82

    .line 179
    .line 180
    xor-long v78, v82, v78

    .line 181
    .line 182
    shl-long v82, v74, v73

    .line 183
    .line 184
    ushr-long v74, v74, v86

    .line 185
    .line 186
    or-long v74, v82, v74

    .line 187
    .line 188
    xor-long v74, v74, v80

    .line 189
    .line 190
    xor-long v3, v3, v84

    .line 191
    .line 192
    xor-long v18, v18, v84

    .line 193
    .line 194
    xor-long v33, v33, v84

    .line 195
    .line 196
    xor-long v47, v47, v84

    .line 197
    .line 198
    xor-long v60, v60, v84

    .line 199
    .line 200
    xor-long v6, v6, v87

    .line 201
    .line 202
    xor-long v21, v21, v87

    .line 203
    .line 204
    xor-long v36, v36, v87

    .line 205
    .line 206
    xor-long v49, v49, v87

    .line 207
    .line 208
    xor-long v63, v63, v87

    .line 209
    .line 210
    xor-long v9, v9, v76

    .line 211
    .line 212
    xor-long v24, v24, v76

    .line 213
    .line 214
    xor-long v39, v39, v76

    .line 215
    .line 216
    xor-long v51, v51, v76

    .line 217
    .line 218
    xor-long v65, v65, v76

    .line 219
    .line 220
    xor-long v12, v12, v78

    .line 221
    .line 222
    xor-long v27, v27, v78

    .line 223
    .line 224
    xor-long v41, v41, v78

    .line 225
    .line 226
    xor-long v54, v54, v78

    .line 227
    .line 228
    xor-long v68, v68, v78

    .line 229
    .line 230
    xor-long v15, v15, v74

    .line 231
    .line 232
    xor-long v30, v30, v74

    .line 233
    .line 234
    xor-long v44, v44, v74

    .line 235
    .line 236
    xor-long v57, v57, v74

    .line 237
    .line 238
    xor-long v71, v71, v74

    .line 239
    .line 240
    shl-long v74, v6, v73

    .line 241
    .line 242
    const/16 v76, 0x3f

    .line 243
    .line 244
    ushr-long v6, v6, v76

    .line 245
    .line 246
    or-long v6, v74, v6

    .line 247
    .line 248
    const/16 v74, 0x2c

    .line 249
    .line 250
    shl-long v74, v21, v74

    .line 251
    .line 252
    ushr-long v21, v21, v59

    .line 253
    .line 254
    move/from16 v76, v8

    .line 255
    .line 256
    move-wide/from16 v77, v9

    .line 257
    .line 258
    or-long v8, v74, v21

    .line 259
    .line 260
    shl-long v21, v30, v59

    .line 261
    .line 262
    const/16 v10, 0x2c

    .line 263
    .line 264
    ushr-long v30, v30, v10

    .line 265
    .line 266
    move/from16 v74, v11

    .line 267
    .line 268
    move-wide/from16 v79, v12

    .line 269
    .line 270
    or-long v11, v21, v30

    .line 271
    .line 272
    const/16 v10, 0x3d

    .line 273
    .line 274
    shl-long v21, v65, v10

    .line 275
    .line 276
    ushr-long v30, v65, v74

    .line 277
    .line 278
    move/from16 v75, v14

    .line 279
    .line 280
    move-wide/from16 v65, v15

    .line 281
    .line 282
    or-long v14, v21, v30

    .line 283
    .line 284
    const/16 v10, 0x27

    .line 285
    .line 286
    shl-long v21, v44, v10

    .line 287
    .line 288
    const/16 v10, 0x19

    .line 289
    .line 290
    ushr-long v30, v44, v10

    .line 291
    .line 292
    move/from16 v81, v2

    .line 293
    .line 294
    move-wide/from16 v82, v3

    .line 295
    .line 296
    or-long v2, v21, v30

    .line 297
    .line 298
    shl-long v21, v60, v53

    .line 299
    .line 300
    const/16 v4, 0x2e

    .line 301
    .line 302
    ushr-long v30, v60, v4

    .line 303
    .line 304
    move-object/from16 v84, v1

    .line 305
    .line 306
    or-long v0, v21, v30

    .line 307
    .line 308
    const/16 v4, 0x3e

    .line 309
    .line 310
    shl-long v21, v77, v4

    .line 311
    .line 312
    ushr-long v30, v77, v76

    .line 313
    .line 314
    move/from16 v77, v5

    .line 315
    .line 316
    or-long v4, v21, v30

    .line 317
    .line 318
    const/16 v10, 0x2b

    .line 319
    .line 320
    shl-long v21, v39, v10

    .line 321
    .line 322
    ushr-long v30, v39, v62

    .line 323
    .line 324
    move-wide/from16 v39, v4

    .line 325
    .line 326
    or-long v4, v21, v30

    .line 327
    .line 328
    const/16 v10, 0x19

    .line 329
    .line 330
    shl-long v21, v41, v10

    .line 331
    .line 332
    const/16 v10, 0x27

    .line 333
    .line 334
    ushr-long v30, v41, v10

    .line 335
    .line 336
    move-wide/from16 v41, v2

    .line 337
    .line 338
    or-long v2, v21, v30

    .line 339
    .line 340
    shl-long v21, v57, v26

    .line 341
    .line 342
    const/16 v10, 0x38

    .line 343
    .line 344
    ushr-long v30, v57, v10

    .line 345
    .line 346
    move-wide/from16 v44, v6

    .line 347
    .line 348
    or-long v6, v21, v30

    .line 349
    .line 350
    shl-long v21, v68, v10

    .line 351
    .line 352
    ushr-long v30, v68, v26

    .line 353
    .line 354
    move-wide/from16 v57, v0

    .line 355
    .line 356
    or-long v0, v21, v30

    .line 357
    .line 358
    const/16 v10, 0x29

    .line 359
    .line 360
    shl-long v21, v47, v10

    .line 361
    .line 362
    ushr-long v30, v47, v67

    .line 363
    .line 364
    move-wide/from16 v47, v0

    .line 365
    .line 366
    or-long v0, v21, v30

    .line 367
    .line 368
    const/16 v10, 0x1b

    .line 369
    .line 370
    shl-long v21, v65, v10

    .line 371
    .line 372
    const/16 v10, 0x25

    .line 373
    .line 374
    ushr-long v30, v65, v10

    .line 375
    .line 376
    move-wide/from16 v60, v0

    .line 377
    .line 378
    or-long v0, v21, v30

    .line 379
    .line 380
    shl-long v21, v71, v43

    .line 381
    .line 382
    const/16 v10, 0x32

    .line 383
    .line 384
    ushr-long v30, v71, v10

    .line 385
    .line 386
    move-wide/from16 v65, v0

    .line 387
    .line 388
    or-long v0, v21, v30

    .line 389
    .line 390
    shl-long v21, v63, v76

    .line 391
    .line 392
    const/16 v10, 0x3e

    .line 393
    .line 394
    ushr-long v30, v63, v10

    .line 395
    .line 396
    move-wide/from16 v63, v6

    .line 397
    .line 398
    or-long v6, v21, v30

    .line 399
    .line 400
    const/16 v10, 0x37

    .line 401
    .line 402
    shl-long v21, v27, v10

    .line 403
    .line 404
    ushr-long v27, v27, v29

    .line 405
    .line 406
    move-wide/from16 v30, v6

    .line 407
    .line 408
    or-long v6, v21, v27

    .line 409
    .line 410
    const/16 v10, 0x2d

    .line 411
    .line 412
    shl-long v21, v49, v10

    .line 413
    .line 414
    ushr-long v27, v49, v56

    .line 415
    .line 416
    move-wide/from16 v49, v6

    .line 417
    .line 418
    or-long v6, v21, v27

    .line 419
    .line 420
    const/16 v10, 0x24

    .line 421
    .line 422
    shl-long v21, v18, v10

    .line 423
    .line 424
    const/16 v10, 0x1c

    .line 425
    .line 426
    ushr-long v18, v18, v10

    .line 427
    .line 428
    move-wide/from16 v27, v2

    .line 429
    .line 430
    or-long v2, v21, v18

    .line 431
    .line 432
    shl-long v18, v79, v10

    .line 433
    .line 434
    const/16 v10, 0x24

    .line 435
    .line 436
    ushr-long v21, v79, v10

    .line 437
    .line 438
    move-wide/from16 v68, v2

    .line 439
    .line 440
    or-long v2, v18, v21

    .line 441
    .line 442
    shl-long v18, v54, v62

    .line 443
    .line 444
    const/16 v10, 0x2b

    .line 445
    .line 446
    ushr-long v21, v54, v10

    .line 447
    .line 448
    move-wide/from16 v54, v2

    .line 449
    .line 450
    or-long v2, v18, v21

    .line 451
    .line 452
    shl-long v18, v51, v46

    .line 453
    .line 454
    const/16 v10, 0x31

    .line 455
    .line 456
    ushr-long v21, v51, v10

    .line 457
    .line 458
    move-wide/from16 v51, v14

    .line 459
    .line 460
    or-long v13, v18, v21

    .line 461
    .line 462
    shl-long v15, v36, v32

    .line 463
    .line 464
    const/16 v10, 0x36

    .line 465
    .line 466
    ushr-long v18, v36, v10

    .line 467
    .line 468
    move-wide/from16 v21, v13

    .line 469
    .line 470
    or-long v13, v15, v18

    .line 471
    .line 472
    shl-long v15, v24, v20

    .line 473
    .line 474
    const/16 v10, 0x3a

    .line 475
    .line 476
    ushr-long v18, v24, v10

    .line 477
    .line 478
    move-wide/from16 v24, v13

    .line 479
    .line 480
    or-long v13, v15, v18

    .line 481
    .line 482
    shl-long v15, v33, v74

    .line 483
    .line 484
    const/16 v10, 0x3d

    .line 485
    .line 486
    ushr-long v18, v33, v10

    .line 487
    .line 488
    move-wide/from16 v33, v13

    .line 489
    .line 490
    or-long v13, v15, v18

    .line 491
    .line 492
    move-wide v15, v6

    .line 493
    not-long v6, v8

    .line 494
    and-long/2addr v6, v4

    .line 495
    xor-long v6, v82, v6

    .line 496
    .line 497
    move-wide/from16 v18, v6

    .line 498
    .line 499
    not-long v6, v4

    .line 500
    and-long/2addr v6, v2

    .line 501
    xor-long/2addr v6, v8

    .line 502
    move-wide/from16 v36, v4

    .line 503
    .line 504
    not-long v4, v2

    .line 505
    and-long/2addr v4, v0

    .line 506
    xor-long v4, v36, v4

    .line 507
    .line 508
    move-wide/from16 v36, v2

    .line 509
    .line 510
    not-long v2, v0

    .line 511
    and-long v2, v2, v82

    .line 512
    .line 513
    xor-long v2, v36, v2

    .line 514
    .line 515
    move-wide/from16 v36, v0

    .line 516
    .line 517
    move-wide/from16 v0, v82

    .line 518
    .line 519
    not-long v0, v0

    .line 520
    and-long/2addr v0, v8

    .line 521
    xor-long v0, v36, v0

    .line 522
    .line 523
    not-long v8, v11

    .line 524
    and-long/2addr v8, v13

    .line 525
    xor-long v8, v54, v8

    .line 526
    .line 527
    move-wide/from16 v36, v0

    .line 528
    .line 529
    not-long v0, v13

    .line 530
    and-long/2addr v0, v15

    .line 531
    xor-long/2addr v0, v11

    .line 532
    move-wide/from16 v71, v0

    .line 533
    .line 534
    move-wide v0, v15

    .line 535
    move-wide v15, v2

    .line 536
    not-long v2, v0

    .line 537
    and-long v2, v2, v51

    .line 538
    .line 539
    xor-long/2addr v2, v13

    .line 540
    move-wide/from16 v13, v51

    .line 541
    .line 542
    move-wide/from16 v51, v0

    .line 543
    .line 544
    not-long v0, v13

    .line 545
    and-long v0, v0, v54

    .line 546
    .line 547
    xor-long v0, v51, v0

    .line 548
    .line 549
    move-wide/from16 v51, v0

    .line 550
    .line 551
    move-wide/from16 v0, v54

    .line 552
    .line 553
    not-long v0, v0

    .line 554
    and-long/2addr v0, v11

    .line 555
    xor-long/2addr v0, v13

    .line 556
    move-wide/from16 v10, v33

    .line 557
    .line 558
    not-long v12, v10

    .line 559
    and-long v12, v12, v27

    .line 560
    .line 561
    xor-long v33, v44, v12

    .line 562
    .line 563
    move-wide/from16 v12, v27

    .line 564
    .line 565
    move-wide/from16 v27, v0

    .line 566
    .line 567
    not-long v0, v12

    .line 568
    and-long v0, v0, v63

    .line 569
    .line 570
    xor-long/2addr v0, v10

    .line 571
    move-wide/from16 v54, v0

    .line 572
    .line 573
    move-wide/from16 v0, v63

    .line 574
    .line 575
    move-wide/from16 v63, v2

    .line 576
    .line 577
    not-long v2, v0

    .line 578
    and-long v2, v2, v57

    .line 579
    .line 580
    xor-long/2addr v2, v12

    .line 581
    move-wide/from16 v12, v57

    .line 582
    .line 583
    move-wide/from16 v57, v0

    .line 584
    .line 585
    not-long v0, v12

    .line 586
    and-long v0, v0, v44

    .line 587
    .line 588
    xor-long v0, v57, v0

    .line 589
    .line 590
    move-wide/from16 v57, v0

    .line 591
    .line 592
    move-wide/from16 v0, v44

    .line 593
    .line 594
    not-long v0, v0

    .line 595
    and-long/2addr v0, v10

    .line 596
    xor-long v44, v12, v0

    .line 597
    .line 598
    move-wide/from16 v0, v68

    .line 599
    .line 600
    not-long v10, v0

    .line 601
    and-long v10, v10, v24

    .line 602
    .line 603
    xor-long v10, v65, v10

    .line 604
    .line 605
    move-wide/from16 v12, v24

    .line 606
    .line 607
    not-long v0, v12

    .line 608
    and-long v0, v0, v21

    .line 609
    .line 610
    xor-long v0, v68, v0

    .line 611
    .line 612
    move-wide/from16 v24, v0

    .line 613
    .line 614
    move-wide/from16 v0, v21

    .line 615
    .line 616
    move-wide/from16 v21, v2

    .line 617
    .line 618
    not-long v2, v0

    .line 619
    and-long v2, v2, v47

    .line 620
    .line 621
    xor-long/2addr v2, v12

    .line 622
    move-wide/from16 v12, v47

    .line 623
    .line 624
    move-wide/from16 v47, v0

    .line 625
    .line 626
    not-long v0, v12

    .line 627
    and-long v0, v0, v65

    .line 628
    .line 629
    xor-long v0, v47, v0

    .line 630
    .line 631
    move-wide/from16 v47, v0

    .line 632
    .line 633
    move-wide/from16 v0, v65

    .line 634
    .line 635
    not-long v0, v0

    .line 636
    and-long v0, v0, v68

    .line 637
    .line 638
    xor-long/2addr v0, v12

    .line 639
    move-wide/from16 v12, v49

    .line 640
    .line 641
    move-wide/from16 v49, v0

    .line 642
    .line 643
    not-long v0, v12

    .line 644
    and-long v0, v0, v41

    .line 645
    .line 646
    xor-long v0, v39, v0

    .line 647
    .line 648
    move-wide/from16 v65, v0

    .line 649
    .line 650
    move-wide/from16 v0, v41

    .line 651
    .line 652
    move-wide/from16 v41, v2

    .line 653
    .line 654
    not-long v2, v0

    .line 655
    and-long v2, v2, v60

    .line 656
    .line 657
    xor-long/2addr v2, v12

    .line 658
    move-wide/from16 v68, v0

    .line 659
    .line 660
    move-wide/from16 v0, v60

    .line 661
    .line 662
    move-wide/from16 v60, v2

    .line 663
    .line 664
    not-long v2, v0

    .line 665
    and-long v2, v2, v30

    .line 666
    .line 667
    xor-long v2, v68, v2

    .line 668
    .line 669
    move-wide/from16 v68, v0

    .line 670
    .line 671
    move-wide/from16 v0, v30

    .line 672
    .line 673
    move-wide/from16 v30, v2

    .line 674
    .line 675
    not-long v2, v0

    .line 676
    and-long v2, v2, v39

    .line 677
    .line 678
    xor-long v68, v68, v2

    .line 679
    .line 680
    move-wide/from16 v2, v39

    .line 681
    .line 682
    not-long v2, v2

    .line 683
    and-long/2addr v2, v12

    .line 684
    xor-long/2addr v0, v2

    .line 685
    sget-object v2, LHg/b;->h:[J

    .line 686
    .line 687
    aget-wide v12, v2, v77

    .line 688
    .line 689
    xor-long v2, v18, v12

    .line 690
    .line 691
    add-int/lit8 v12, v77, 0x1

    .line 692
    .line 693
    move-wide/from16 v18, v49

    .line 694
    .line 695
    move-wide/from16 v49, v24

    .line 696
    .line 697
    move-wide/from16 v24, v63

    .line 698
    .line 699
    move-wide/from16 v63, v60

    .line 700
    .line 701
    move-wide/from16 v60, v65

    .line 702
    .line 703
    move-wide/from16 v65, v30

    .line 704
    .line 705
    move-wide/from16 v30, v27

    .line 706
    .line 707
    move-wide/from16 v27, v51

    .line 708
    .line 709
    move-wide/from16 v51, v41

    .line 710
    .line 711
    move-wide/from16 v41, v57

    .line 712
    .line 713
    move-wide/from16 v57, v18

    .line 714
    .line 715
    move-wide/from16 v18, v8

    .line 716
    .line 717
    move-wide/from16 v39, v21

    .line 718
    .line 719
    move-wide/from16 v21, v71

    .line 720
    .line 721
    move/from16 v14, v75

    .line 722
    .line 723
    move/from16 v8, v76

    .line 724
    .line 725
    move-wide/from16 v71, v0

    .line 726
    .line 727
    move-object/from16 v1, v84

    .line 728
    .line 729
    move-object/from16 v0, p0

    .line 730
    .line 731
    move-wide/from16 v93, v4

    .line 732
    .line 733
    move v5, v12

    .line 734
    move-wide v3, v2

    .line 735
    move-wide v12, v15

    .line 736
    move-wide/from16 v15, v36

    .line 737
    .line 738
    move-wide/from16 v36, v54

    .line 739
    .line 740
    move/from16 v2, v81

    .line 741
    .line 742
    move-wide/from16 v54, v47

    .line 743
    .line 744
    move-wide/from16 v47, v10

    .line 745
    .line 746
    move/from16 v11, v74

    .line 747
    .line 748
    move-wide/from16 v9, v93

    .line 749
    .line 750
    goto/16 :goto_0

    .line 751
    .line 752
    :cond_0
    move-object/from16 v84, v1

    .line 753
    .line 754
    move/from16 v81, v2

    .line 755
    .line 756
    move/from16 v76, v8

    .line 757
    .line 758
    move/from16 v74, v11

    .line 759
    .line 760
    move/from16 v75, v14

    .line 761
    .line 762
    aput-wide v3, v84, v70

    .line 763
    .line 764
    aput-wide v6, v84, v73

    .line 765
    .line 766
    aput-wide v9, v84, v76

    .line 767
    .line 768
    aput-wide v12, v84, v74

    .line 769
    .line 770
    aput-wide v15, v84, v75

    .line 771
    .line 772
    aput-wide v18, v84, v17

    .line 773
    .line 774
    aput-wide v21, v84, v20

    .line 775
    .line 776
    aput-wide v24, v84, v23

    .line 777
    .line 778
    aput-wide v27, v84, v26

    .line 779
    .line 780
    aput-wide v30, v84, v29

    .line 781
    .line 782
    aput-wide v33, v84, v32

    .line 783
    .line 784
    aput-wide v36, v84, v35

    .line 785
    .line 786
    aput-wide v39, v84, v38

    .line 787
    .line 788
    const/16 v0, 0xd

    .line 789
    .line 790
    aput-wide v41, v84, v0

    .line 791
    .line 792
    aput-wide v44, v84, v43

    .line 793
    .line 794
    aput-wide v47, v84, v46

    .line 795
    .line 796
    const/16 v0, 0x10

    .line 797
    .line 798
    aput-wide v49, v84, v0

    .line 799
    .line 800
    const/16 v0, 0x11

    .line 801
    .line 802
    aput-wide v51, v84, v0

    .line 803
    .line 804
    aput-wide v54, v84, v53

    .line 805
    .line 806
    aput-wide v57, v84, v56

    .line 807
    .line 808
    aput-wide v60, v84, v59

    .line 809
    .line 810
    aput-wide v63, v84, v62

    .line 811
    .line 812
    const/16 v0, 0x16

    .line 813
    .line 814
    aput-wide v65, v84, v0

    .line 815
    .line 816
    aput-wide v68, v84, v67

    .line 817
    .line 818
    aput-wide v71, v84, v81

    .line 819
    .line 820
    return-void
.end method

.method private m(I)V
    .locals 1

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0xe0

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x100

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x120

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x180

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x200

    .line 22
    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v0, "bitLength must be one of 128, 224, 256, 288, 384, or 512."

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    :goto_0
    shl-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    rsub-int p1, p1, 0x640

    .line 37
    .line 38
    invoke-direct {p0, p1}, LHg/b;->n(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private n(I)V
    .locals 6

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    const/16 v0, 0x640

    .line 4
    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    rem-int/lit8 v1, p1, 0x40

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iput p1, p0, LHg/b;->d:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    iget-object v3, p0, LHg/b;->b:[J

    .line 16
    .line 17
    array-length v4, v3

    .line 18
    if-ge v2, v4, :cond_0

    .line 19
    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    aput-wide v4, v3, v2

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, p0, LHg/b;->c:[B

    .line 28
    .line 29
    invoke-static {v2, v1}, LOh/a;->o([BB)V

    .line 30
    .line 31
    .line 32
    iput v1, p0, LHg/b;->e:I

    .line 33
    .line 34
    iput-boolean v1, p0, LHg/b;->g:Z

    .line 35
    .line 36
    sub-int/2addr v0, p1

    .line 37
    div-int/lit8 v0, v0, 0x2

    .line 38
    .line 39
    iput v0, p0, LHg/b;->f:I

    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "invalid rate value"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method private o()V
    .locals 11

    .line 1
    iget-object v0, p0, LHg/b;->c:[B

    .line 2
    .line 3
    iget v1, p0, LHg/b;->e:I

    .line 4
    .line 5
    ushr-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    aget-byte v3, v0, v2

    .line 8
    .line 9
    and-int/lit8 v4, v1, 0x7

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    shl-int v4, v5, v4

    .line 13
    .line 14
    int-to-byte v4, v4

    .line 15
    or-int/2addr v3, v4

    .line 16
    int-to-byte v3, v3

    .line 17
    aput-byte v3, v0, v2

    .line 18
    .line 19
    add-int/2addr v1, v5

    .line 20
    iput v1, p0, LHg/b;->e:I

    .line 21
    .line 22
    iget v2, p0, LHg/b;->d:I

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    invoke-direct {p0, v0, v3}, LHg/b;->f([BI)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    ushr-int/lit8 v0, v1, 0x6

    .line 32
    .line 33
    and-int/lit8 v1, v1, 0x3f

    .line 34
    .line 35
    move v2, v3

    .line 36
    move v4, v2

    .line 37
    :goto_0
    if-ge v2, v0, :cond_1

    .line 38
    .line 39
    iget-object v6, p0, LHg/b;->b:[J

    .line 40
    .line 41
    aget-wide v7, v6, v2

    .line 42
    .line 43
    iget-object v9, p0, LHg/b;->c:[B

    .line 44
    .line 45
    invoke-static {v9, v4}, LOh/g;->f([BI)J

    .line 46
    .line 47
    .line 48
    move-result-wide v9

    .line 49
    xor-long/2addr v7, v9

    .line 50
    aput-wide v7, v6, v2

    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x8

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    if-lez v1, :cond_2

    .line 58
    .line 59
    const-wide/16 v6, 0x1

    .line 60
    .line 61
    shl-long v1, v6, v1

    .line 62
    .line 63
    sub-long/2addr v1, v6

    .line 64
    iget-object v6, p0, LHg/b;->b:[J

    .line 65
    .line 66
    aget-wide v7, v6, v0

    .line 67
    .line 68
    iget-object v9, p0, LHg/b;->c:[B

    .line 69
    .line 70
    invoke-static {v9, v4}, LOh/g;->f([BI)J

    .line 71
    .line 72
    .line 73
    move-result-wide v9

    .line 74
    and-long/2addr v1, v9

    .line 75
    xor-long/2addr v1, v7

    .line 76
    aput-wide v1, v6, v0

    .line 77
    .line 78
    :cond_2
    :goto_1
    iget-object v0, p0, LHg/b;->b:[J

    .line 79
    .line 80
    iget v1, p0, LHg/b;->d:I

    .line 81
    .line 82
    sub-int/2addr v1, v5

    .line 83
    ushr-int/lit8 v1, v1, 0x6

    .line 84
    .line 85
    aget-wide v6, v0, v1

    .line 86
    .line 87
    const-wide/high16 v8, -0x8000000000000000L

    .line 88
    .line 89
    xor-long/2addr v6, v8

    .line 90
    aput-wide v6, v0, v1

    .line 91
    .line 92
    iput v3, p0, LHg/b;->e:I

    .line 93
    .line 94
    iput-boolean v5, p0, LHg/b;->g:Z

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public a([BI)I
    .locals 2

    .line 1
    iget v0, p0, LHg/b;->f:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    invoke-virtual {p0, p1, p2, v0, v1}, LHg/b;->q([BIJ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LHg/b;->p()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LHg/b;->d()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public b(B)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LHg/b;->i(B)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LHg/b;->f:I

    .line 2
    .line 3
    div-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    return v0
.end method

.method protected i(B)V
    .locals 3

    .line 1
    iget v0, p0, LHg/b;->e:I

    .line 2
    .line 3
    rem-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    if-nez v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, p0, LHg/b;->g:Z

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, LHg/b;->c:[B

    .line 12
    .line 13
    ushr-int/lit8 v2, v0, 0x3

    .line 14
    .line 15
    aput-byte p1, v1, v2

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x8

    .line 18
    .line 19
    iput v0, p0, LHg/b;->e:I

    .line 20
    .line 21
    iget p1, p0, LHg/b;->d:I

    .line 22
    .line 23
    if-ne v0, p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-direct {p0, v1, p1}, LHg/b;->f([BI)V

    .line 27
    .line 28
    .line 29
    iput p1, p0, LHg/b;->e:I

    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "attempt to absorb while squeezing"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "attempt to absorb with odd length queue"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
.end method

.method protected j([BII)V
    .locals 5

    .line 1
    iget v0, p0, LHg/b;->e:I

    .line 2
    .line 3
    rem-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    if-nez v1, :cond_4

    .line 6
    .line 7
    iget-boolean v1, p0, LHg/b;->g:Z

    .line 8
    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    ushr-int/lit8 v0, v0, 0x3

    .line 12
    .line 13
    iget v1, p0, LHg/b;->d:I

    .line 14
    .line 15
    ushr-int/lit8 v1, v1, 0x3

    .line 16
    .line 17
    sub-int v2, v1, v0

    .line 18
    .line 19
    if-ge p3, v2, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, LHg/b;->c:[B

    .line 22
    .line 23
    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, LHg/b;->e:I

    .line 27
    .line 28
    shl-int/lit8 p2, p3, 0x3

    .line 29
    .line 30
    add-int/2addr p1, p2

    .line 31
    :goto_0
    iput p1, p0, LHg/b;->e:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const/4 v3, 0x0

    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    iget-object v4, p0, LHg/b;->c:[B

    .line 38
    .line 39
    invoke-static {p1, p2, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LHg/b;->c:[B

    .line 43
    .line 44
    invoke-direct {p0, v0, v3}, LHg/b;->f([BI)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v2, v3

    .line 49
    :goto_1
    sub-int v0, p3, v2

    .line 50
    .line 51
    if-lt v0, v1, :cond_2

    .line 52
    .line 53
    add-int v0, p2, v2

    .line 54
    .line 55
    invoke-direct {p0, p1, v0}, LHg/b;->f([BI)V

    .line 56
    .line 57
    .line 58
    add-int/2addr v2, v1

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    add-int/2addr p2, v2

    .line 61
    iget-object p3, p0, LHg/b;->c:[B

    .line 62
    .line 63
    invoke-static {p1, p2, p3, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    shl-int/lit8 p1, v0, 0x3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string p2, "attempt to absorb while squeezing"

    .line 72
    .line 73
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string p2, "attempt to absorb with odd length queue"

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method protected k(II)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p2, v0, :cond_2

    .line 3
    .line 4
    const/4 v1, 0x7

    .line 5
    if-gt p2, v1, :cond_2

    .line 6
    .line 7
    iget v1, p0, LHg/b;->e:I

    .line 8
    .line 9
    rem-int/lit8 v2, v1, 0x8

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    iget-boolean v2, p0, LHg/b;->g:Z

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    shl-int v2, v0, p2

    .line 18
    .line 19
    sub-int/2addr v2, v0

    .line 20
    iget-object v0, p0, LHg/b;->c:[B

    .line 21
    .line 22
    ushr-int/lit8 v3, v1, 0x3

    .line 23
    .line 24
    and-int/2addr p1, v2

    .line 25
    int-to-byte p1, p1

    .line 26
    aput-byte p1, v0, v3

    .line 27
    .line 28
    add-int/2addr v1, p2

    .line 29
    iput v1, p0, LHg/b;->e:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string p2, "attempt to absorb while squeezing"

    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "attempt to absorb with odd length queue"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string p2, "\'bits\' must be in the range 1 to 7"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method protected l()LFg/c;
    .locals 2

    .line 1
    invoke-virtual {p0}, LHg/b;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    iget-object v1, p0, LHg/b;->a:LFg/d;

    .line 8
    .line 9
    invoke-static {p0, v0, v1}, LHg/i;->a(LFg/j;ILFg/d;)LFg/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public p()V
    .locals 1

    .line 1
    iget v0, p0, LHg/b;->f:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, LHg/b;->m(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected q([BIJ)V
    .locals 9

    .line 1
    iget-boolean v0, p0, LHg/b;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LHg/b;->o()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const-wide/16 v0, 0x8

    .line 9
    .line 10
    rem-long v2, p3, v0

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    if-nez v2, :cond_3

    .line 17
    .line 18
    :goto_0
    cmp-long v2, v4, p3

    .line 19
    .line 20
    if-gez v2, :cond_2

    .line 21
    .line 22
    iget v2, p0, LHg/b;->e:I

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, LHg/b;->g()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget v2, p0, LHg/b;->e:I

    .line 30
    .line 31
    int-to-long v2, v2

    .line 32
    sub-long v6, p3, v4

    .line 33
    .line 34
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    long-to-int v2, v2

    .line 39
    iget-object v3, p0, LHg/b;->c:[B

    .line 40
    .line 41
    iget v6, p0, LHg/b;->d:I

    .line 42
    .line 43
    iget v7, p0, LHg/b;->e:I

    .line 44
    .line 45
    sub-int/2addr v6, v7

    .line 46
    div-int/lit8 v6, v6, 0x8

    .line 47
    .line 48
    div-long v7, v4, v0

    .line 49
    .line 50
    long-to-int v7, v7

    .line 51
    add-int/2addr v7, p2

    .line 52
    div-int/lit8 v8, v2, 0x8

    .line 53
    .line 54
    invoke-static {v3, v6, p1, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    iget v3, p0, LHg/b;->e:I

    .line 58
    .line 59
    sub-int/2addr v3, v2

    .line 60
    iput v3, p0, LHg/b;->e:I

    .line 61
    .line 62
    int-to-long v2, v2

    .line 63
    add-long/2addr v4, v2

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return-void

    .line 66
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "outputLength not a multiple of 8"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method

.method public update([BII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LHg/b;->j([BII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
