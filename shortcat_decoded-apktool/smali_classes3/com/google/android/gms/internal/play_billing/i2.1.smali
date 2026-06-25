.class final Lcom/google/android/gms/internal/play_billing/i2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/p2;


# static fields
.field private static final l:[I

.field private static final m:Lsun/misc/Unsafe;


# instance fields
.field private final a:[I

.field private final b:[Ljava/lang/Object;

.field private final c:I

.field private final d:I

.field private final e:Lcom/google/android/gms/internal/play_billing/f2;

.field private final f:Z

.field private final g:[I

.field private final h:I

.field private final i:I

.field private final j:Lcom/google/android/gms/internal/play_billing/v2;

.field private final k:Lcom/google/android/gms/internal/play_billing/A1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, Lcom/google/android/gms/internal/play_billing/i2;->l:[I

    .line 5
    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/C2;->l()Lsun/misc/Unsafe;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/play_billing/f2;Z[IIILcom/google/android/gms/internal/play_billing/k2;Lcom/google/android/gms/internal/play_billing/T1;Lcom/google/android/gms/internal/play_billing/v2;Lcom/google/android/gms/internal/play_billing/A1;Lcom/google/android/gms/internal/play_billing/a2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/i2;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/internal/play_billing/i2;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/google/android/gms/internal/play_billing/i2;->d:I

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    .line 14
    .line 15
    iput-object p7, p0, Lcom/google/android/gms/internal/play_billing/i2;->g:[I

    .line 16
    .line 17
    iput p8, p0, Lcom/google/android/gms/internal/play_billing/i2;->h:I

    .line 18
    .line 19
    iput p9, p0, Lcom/google/android/gms/internal/play_billing/i2;->i:I

    .line 20
    .line 21
    iput-object p12, p0, Lcom/google/android/gms/internal/play_billing/i2;->j:Lcom/google/android/gms/internal/play_billing/v2;

    .line 22
    .line 23
    iput-object p13, p0, Lcom/google/android/gms/internal/play_billing/i2;->k:Lcom/google/android/gms/internal/play_billing/A1;

    .line 24
    .line 25
    iput-object p5, p0, Lcom/google/android/gms/internal/play_billing/i2;->e:Lcom/google/android/gms/internal/play_billing/f2;

    .line 26
    .line 27
    return-void
.end method

.method static A(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/c2;Lcom/google/android/gms/internal/play_billing/k2;Lcom/google/android/gms/internal/play_billing/T1;Lcom/google/android/gms/internal/play_billing/v2;Lcom/google/android/gms/internal/play_billing/A1;Lcom/google/android/gms/internal/play_billing/a2;)Lcom/google/android/gms/internal/play_billing/i2;
    .locals 32

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/o2;

    .line 4
    .line 5
    if-eqz v1, :cond_37

    .line 6
    .line 7
    check-cast v0, Lcom/google/android/gms/internal/play_billing/o2;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/o2;->a()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const v5, 0xd800

    .line 23
    .line 24
    .line 25
    if-lt v4, v5, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    :goto_0
    add-int/lit8 v7, v4, 0x1

    .line 29
    .line 30
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-lt v4, v5, :cond_1

    .line 35
    .line 36
    move v4, v7

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v7, 0x1

    .line 39
    :cond_1
    add-int/lit8 v4, v7, 0x1

    .line 40
    .line 41
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-lt v7, v5, :cond_3

    .line 46
    .line 47
    and-int/lit16 v7, v7, 0x1fff

    .line 48
    .line 49
    const/16 v9, 0xd

    .line 50
    .line 51
    :goto_1
    add-int/lit8 v10, v4, 0x1

    .line 52
    .line 53
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-lt v4, v5, :cond_2

    .line 58
    .line 59
    and-int/lit16 v4, v4, 0x1fff

    .line 60
    .line 61
    shl-int/2addr v4, v9

    .line 62
    or-int/2addr v7, v4

    .line 63
    add-int/lit8 v9, v9, 0xd

    .line 64
    .line 65
    move v4, v10

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    shl-int/2addr v4, v9

    .line 68
    or-int/2addr v7, v4

    .line 69
    move v4, v10

    .line 70
    :cond_3
    if-nez v7, :cond_4

    .line 71
    .line 72
    sget-object v7, Lcom/google/android/gms/internal/play_billing/i2;->l:[I

    .line 73
    .line 74
    move v9, v3

    .line 75
    move v10, v9

    .line 76
    move v11, v10

    .line 77
    move v12, v11

    .line 78
    move v13, v12

    .line 79
    move/from16 v17, v13

    .line 80
    .line 81
    move-object/from16 v16, v7

    .line 82
    .line 83
    move/from16 v7, v17

    .line 84
    .line 85
    goto/16 :goto_a

    .line 86
    .line 87
    :cond_4
    add-int/lit8 v7, v4, 0x1

    .line 88
    .line 89
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-lt v4, v5, :cond_6

    .line 94
    .line 95
    and-int/lit16 v4, v4, 0x1fff

    .line 96
    .line 97
    const/16 v9, 0xd

    .line 98
    .line 99
    :goto_2
    add-int/lit8 v10, v7, 0x1

    .line 100
    .line 101
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-lt v7, v5, :cond_5

    .line 106
    .line 107
    and-int/lit16 v7, v7, 0x1fff

    .line 108
    .line 109
    shl-int/2addr v7, v9

    .line 110
    or-int/2addr v4, v7

    .line 111
    add-int/lit8 v9, v9, 0xd

    .line 112
    .line 113
    move v7, v10

    .line 114
    goto :goto_2

    .line 115
    :cond_5
    shl-int/2addr v7, v9

    .line 116
    or-int/2addr v4, v7

    .line 117
    move v7, v10

    .line 118
    :cond_6
    add-int/lit8 v9, v7, 0x1

    .line 119
    .line 120
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-lt v7, v5, :cond_8

    .line 125
    .line 126
    and-int/lit16 v7, v7, 0x1fff

    .line 127
    .line 128
    const/16 v10, 0xd

    .line 129
    .line 130
    :goto_3
    add-int/lit8 v11, v9, 0x1

    .line 131
    .line 132
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-lt v9, v5, :cond_7

    .line 137
    .line 138
    and-int/lit16 v9, v9, 0x1fff

    .line 139
    .line 140
    shl-int/2addr v9, v10

    .line 141
    or-int/2addr v7, v9

    .line 142
    add-int/lit8 v10, v10, 0xd

    .line 143
    .line 144
    move v9, v11

    .line 145
    goto :goto_3

    .line 146
    :cond_7
    shl-int/2addr v9, v10

    .line 147
    or-int/2addr v7, v9

    .line 148
    move v9, v11

    .line 149
    :cond_8
    add-int/lit8 v10, v9, 0x1

    .line 150
    .line 151
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-lt v9, v5, :cond_a

    .line 156
    .line 157
    and-int/lit16 v9, v9, 0x1fff

    .line 158
    .line 159
    const/16 v11, 0xd

    .line 160
    .line 161
    :goto_4
    add-int/lit8 v12, v10, 0x1

    .line 162
    .line 163
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-lt v10, v5, :cond_9

    .line 168
    .line 169
    and-int/lit16 v10, v10, 0x1fff

    .line 170
    .line 171
    shl-int/2addr v10, v11

    .line 172
    or-int/2addr v9, v10

    .line 173
    add-int/lit8 v11, v11, 0xd

    .line 174
    .line 175
    move v10, v12

    .line 176
    goto :goto_4

    .line 177
    :cond_9
    shl-int/2addr v10, v11

    .line 178
    or-int/2addr v9, v10

    .line 179
    move v10, v12

    .line 180
    :cond_a
    add-int/lit8 v11, v10, 0x1

    .line 181
    .line 182
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-lt v10, v5, :cond_c

    .line 187
    .line 188
    and-int/lit16 v10, v10, 0x1fff

    .line 189
    .line 190
    const/16 v12, 0xd

    .line 191
    .line 192
    :goto_5
    add-int/lit8 v13, v11, 0x1

    .line 193
    .line 194
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    if-lt v11, v5, :cond_b

    .line 199
    .line 200
    and-int/lit16 v11, v11, 0x1fff

    .line 201
    .line 202
    shl-int/2addr v11, v12

    .line 203
    or-int/2addr v10, v11

    .line 204
    add-int/lit8 v12, v12, 0xd

    .line 205
    .line 206
    move v11, v13

    .line 207
    goto :goto_5

    .line 208
    :cond_b
    shl-int/2addr v11, v12

    .line 209
    or-int/2addr v10, v11

    .line 210
    move v11, v13

    .line 211
    :cond_c
    add-int/lit8 v12, v11, 0x1

    .line 212
    .line 213
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-lt v11, v5, :cond_e

    .line 218
    .line 219
    and-int/lit16 v11, v11, 0x1fff

    .line 220
    .line 221
    const/16 v13, 0xd

    .line 222
    .line 223
    :goto_6
    add-int/lit8 v14, v12, 0x1

    .line 224
    .line 225
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-lt v12, v5, :cond_d

    .line 230
    .line 231
    and-int/lit16 v12, v12, 0x1fff

    .line 232
    .line 233
    shl-int/2addr v12, v13

    .line 234
    or-int/2addr v11, v12

    .line 235
    add-int/lit8 v13, v13, 0xd

    .line 236
    .line 237
    move v12, v14

    .line 238
    goto :goto_6

    .line 239
    :cond_d
    shl-int/2addr v12, v13

    .line 240
    or-int/2addr v11, v12

    .line 241
    move v12, v14

    .line 242
    :cond_e
    add-int/lit8 v13, v12, 0x1

    .line 243
    .line 244
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    if-lt v12, v5, :cond_10

    .line 249
    .line 250
    and-int/lit16 v12, v12, 0x1fff

    .line 251
    .line 252
    const/16 v14, 0xd

    .line 253
    .line 254
    :goto_7
    add-int/lit8 v15, v13, 0x1

    .line 255
    .line 256
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    if-lt v13, v5, :cond_f

    .line 261
    .line 262
    and-int/lit16 v13, v13, 0x1fff

    .line 263
    .line 264
    shl-int/2addr v13, v14

    .line 265
    or-int/2addr v12, v13

    .line 266
    add-int/lit8 v14, v14, 0xd

    .line 267
    .line 268
    move v13, v15

    .line 269
    goto :goto_7

    .line 270
    :cond_f
    shl-int/2addr v13, v14

    .line 271
    or-int/2addr v12, v13

    .line 272
    move v13, v15

    .line 273
    :cond_10
    add-int/lit8 v14, v13, 0x1

    .line 274
    .line 275
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 276
    .line 277
    .line 278
    move-result v13

    .line 279
    if-lt v13, v5, :cond_12

    .line 280
    .line 281
    and-int/lit16 v13, v13, 0x1fff

    .line 282
    .line 283
    const/16 v15, 0xd

    .line 284
    .line 285
    :goto_8
    add-int/lit8 v16, v14, 0x1

    .line 286
    .line 287
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 288
    .line 289
    .line 290
    move-result v14

    .line 291
    if-lt v14, v5, :cond_11

    .line 292
    .line 293
    and-int/lit16 v14, v14, 0x1fff

    .line 294
    .line 295
    shl-int/2addr v14, v15

    .line 296
    or-int/2addr v13, v14

    .line 297
    add-int/lit8 v15, v15, 0xd

    .line 298
    .line 299
    move/from16 v14, v16

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_11
    shl-int/2addr v14, v15

    .line 303
    or-int/2addr v13, v14

    .line 304
    move/from16 v14, v16

    .line 305
    .line 306
    :cond_12
    add-int/lit8 v15, v14, 0x1

    .line 307
    .line 308
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 309
    .line 310
    .line 311
    move-result v14

    .line 312
    if-lt v14, v5, :cond_14

    .line 313
    .line 314
    and-int/lit16 v14, v14, 0x1fff

    .line 315
    .line 316
    const/16 v16, 0xd

    .line 317
    .line 318
    :goto_9
    add-int/lit8 v17, v15, 0x1

    .line 319
    .line 320
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v15

    .line 324
    if-lt v15, v5, :cond_13

    .line 325
    .line 326
    and-int/lit16 v15, v15, 0x1fff

    .line 327
    .line 328
    shl-int v15, v15, v16

    .line 329
    .line 330
    or-int/2addr v14, v15

    .line 331
    add-int/lit8 v16, v16, 0xd

    .line 332
    .line 333
    move/from16 v15, v17

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_13
    shl-int v15, v15, v16

    .line 337
    .line 338
    or-int/2addr v14, v15

    .line 339
    move/from16 v15, v17

    .line 340
    .line 341
    :cond_14
    add-int v16, v14, v12

    .line 342
    .line 343
    add-int v13, v16, v13

    .line 344
    .line 345
    add-int v16, v4, v4

    .line 346
    .line 347
    add-int v16, v16, v7

    .line 348
    .line 349
    new-array v7, v13, [I

    .line 350
    .line 351
    move v13, v12

    .line 352
    move v12, v9

    .line 353
    move v9, v13

    .line 354
    move v13, v10

    .line 355
    move/from16 v17, v14

    .line 356
    .line 357
    move/from16 v10, v16

    .line 358
    .line 359
    move-object/from16 v16, v7

    .line 360
    .line 361
    move v7, v4

    .line 362
    move v4, v15

    .line 363
    :goto_a
    sget-object v14, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 364
    .line 365
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/o2;->b()[Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v15

    .line 369
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/o2;->zza()Lcom/google/android/gms/internal/play_billing/f2;

    .line 370
    .line 371
    .line 372
    move-result-object v18

    .line 373
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    add-int v18, v17, v9

    .line 378
    .line 379
    add-int v9, v11, v11

    .line 380
    .line 381
    mul-int/lit8 v11, v11, 0x3

    .line 382
    .line 383
    new-array v11, v11, [I

    .line 384
    .line 385
    new-array v9, v9, [Ljava/lang/Object;

    .line 386
    .line 387
    move/from16 v21, v17

    .line 388
    .line 389
    move/from16 v22, v18

    .line 390
    .line 391
    const/16 v19, 0x0

    .line 392
    .line 393
    const/16 v20, 0x0

    .line 394
    .line 395
    :goto_b
    if-ge v4, v2, :cond_36

    .line 396
    .line 397
    add-int/lit8 v23, v4, 0x1

    .line 398
    .line 399
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    if-lt v4, v5, :cond_16

    .line 404
    .line 405
    and-int/lit16 v4, v4, 0x1fff

    .line 406
    .line 407
    move/from16 v8, v23

    .line 408
    .line 409
    const/16 v23, 0xd

    .line 410
    .line 411
    :goto_c
    add-int/lit8 v24, v8, 0x1

    .line 412
    .line 413
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-lt v8, v5, :cond_15

    .line 418
    .line 419
    and-int/lit16 v8, v8, 0x1fff

    .line 420
    .line 421
    shl-int v8, v8, v23

    .line 422
    .line 423
    or-int/2addr v4, v8

    .line 424
    add-int/lit8 v23, v23, 0xd

    .line 425
    .line 426
    move/from16 v8, v24

    .line 427
    .line 428
    goto :goto_c

    .line 429
    :cond_15
    shl-int v8, v8, v23

    .line 430
    .line 431
    or-int/2addr v4, v8

    .line 432
    move/from16 v8, v24

    .line 433
    .line 434
    goto :goto_d

    .line 435
    :cond_16
    move/from16 v8, v23

    .line 436
    .line 437
    :goto_d
    add-int/lit8 v23, v8, 0x1

    .line 438
    .line 439
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    .line 440
    .line 441
    .line 442
    move-result v8

    .line 443
    if-lt v8, v5, :cond_18

    .line 444
    .line 445
    and-int/lit16 v8, v8, 0x1fff

    .line 446
    .line 447
    move/from16 v6, v23

    .line 448
    .line 449
    const/16 v23, 0xd

    .line 450
    .line 451
    :goto_e
    add-int/lit8 v25, v6, 0x1

    .line 452
    .line 453
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 454
    .line 455
    .line 456
    move-result v6

    .line 457
    if-lt v6, v5, :cond_17

    .line 458
    .line 459
    and-int/lit16 v6, v6, 0x1fff

    .line 460
    .line 461
    shl-int v6, v6, v23

    .line 462
    .line 463
    or-int/2addr v8, v6

    .line 464
    add-int/lit8 v23, v23, 0xd

    .line 465
    .line 466
    move/from16 v6, v25

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_17
    shl-int v6, v6, v23

    .line 470
    .line 471
    or-int/2addr v8, v6

    .line 472
    move/from16 v6, v25

    .line 473
    .line 474
    goto :goto_f

    .line 475
    :cond_18
    move/from16 v6, v23

    .line 476
    .line 477
    :goto_f
    and-int/lit16 v5, v8, 0x400

    .line 478
    .line 479
    if-eqz v5, :cond_19

    .line 480
    .line 481
    add-int/lit8 v5, v19, 0x1

    .line 482
    .line 483
    aput v20, v16, v19

    .line 484
    .line 485
    move/from16 v19, v5

    .line 486
    .line 487
    :cond_19
    and-int/lit16 v5, v8, 0xff

    .line 488
    .line 489
    move-object/from16 v25, v0

    .line 490
    .line 491
    and-int/lit16 v0, v8, 0x800

    .line 492
    .line 493
    move/from16 v26, v0

    .line 494
    .line 495
    const/16 v0, 0x33

    .line 496
    .line 497
    if-lt v5, v0, :cond_23

    .line 498
    .line 499
    add-int/lit8 v0, v6, 0x1

    .line 500
    .line 501
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 502
    .line 503
    .line 504
    move-result v6

    .line 505
    move/from16 v27, v0

    .line 506
    .line 507
    const v0, 0xd800

    .line 508
    .line 509
    .line 510
    if-lt v6, v0, :cond_1b

    .line 511
    .line 512
    and-int/lit16 v6, v6, 0x1fff

    .line 513
    .line 514
    move/from16 v30, v27

    .line 515
    .line 516
    move/from16 v27, v6

    .line 517
    .line 518
    move/from16 v6, v30

    .line 519
    .line 520
    const/16 v30, 0xd

    .line 521
    .line 522
    :goto_10
    add-int/lit8 v31, v6, 0x1

    .line 523
    .line 524
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    if-lt v6, v0, :cond_1a

    .line 529
    .line 530
    and-int/lit16 v0, v6, 0x1fff

    .line 531
    .line 532
    shl-int v0, v0, v30

    .line 533
    .line 534
    or-int v27, v27, v0

    .line 535
    .line 536
    add-int/lit8 v30, v30, 0xd

    .line 537
    .line 538
    move/from16 v6, v31

    .line 539
    .line 540
    const v0, 0xd800

    .line 541
    .line 542
    .line 543
    goto :goto_10

    .line 544
    :cond_1a
    shl-int v0, v6, v30

    .line 545
    .line 546
    or-int v6, v27, v0

    .line 547
    .line 548
    move/from16 v0, v31

    .line 549
    .line 550
    goto :goto_11

    .line 551
    :cond_1b
    move/from16 v0, v27

    .line 552
    .line 553
    :goto_11
    move/from16 v27, v0

    .line 554
    .line 555
    add-int/lit8 v0, v5, -0x33

    .line 556
    .line 557
    move/from16 v30, v2

    .line 558
    .line 559
    const/16 v2, 0x9

    .line 560
    .line 561
    if-eq v0, v2, :cond_1c

    .line 562
    .line 563
    const/16 v2, 0x11

    .line 564
    .line 565
    if-ne v0, v2, :cond_1d

    .line 566
    .line 567
    :cond_1c
    const/4 v2, 0x1

    .line 568
    goto :goto_14

    .line 569
    :cond_1d
    const/16 v2, 0xc

    .line 570
    .line 571
    if-ne v0, v2, :cond_20

    .line 572
    .line 573
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/play_billing/o2;->k()I

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    const/4 v2, 0x1

    .line 578
    if-eq v0, v2, :cond_1f

    .line 579
    .line 580
    if-eqz v26, :cond_1e

    .line 581
    .line 582
    goto :goto_12

    .line 583
    :cond_1e
    const/4 v0, 0x0

    .line 584
    goto :goto_15

    .line 585
    :cond_1f
    :goto_12
    add-int/lit8 v0, v10, 0x1

    .line 586
    .line 587
    div-int/lit8 v24, v20, 0x3

    .line 588
    .line 589
    add-int v24, v24, v24

    .line 590
    .line 591
    add-int/lit8 v24, v24, 0x1

    .line 592
    .line 593
    aget-object v10, v15, v10

    .line 594
    .line 595
    aput-object v10, v9, v24

    .line 596
    .line 597
    :goto_13
    move v10, v0

    .line 598
    :cond_20
    move/from16 v0, v26

    .line 599
    .line 600
    goto :goto_15

    .line 601
    :goto_14
    add-int/lit8 v0, v10, 0x1

    .line 602
    .line 603
    div-int/lit8 v24, v20, 0x3

    .line 604
    .line 605
    add-int v24, v24, v24

    .line 606
    .line 607
    add-int/lit8 v28, v24, 0x1

    .line 608
    .line 609
    aget-object v2, v15, v10

    .line 610
    .line 611
    aput-object v2, v9, v28

    .line 612
    .line 613
    goto :goto_13

    .line 614
    :goto_15
    add-int/2addr v6, v6

    .line 615
    aget-object v2, v15, v6

    .line 616
    .line 617
    move/from16 v26, v0

    .line 618
    .line 619
    instance-of v0, v2, Ljava/lang/reflect/Field;

    .line 620
    .line 621
    if-eqz v0, :cond_21

    .line 622
    .line 623
    check-cast v2, Ljava/lang/reflect/Field;

    .line 624
    .line 625
    :goto_16
    move/from16 v28, v6

    .line 626
    .line 627
    move v0, v7

    .line 628
    goto :goto_17

    .line 629
    :cond_21
    check-cast v2, Ljava/lang/String;

    .line 630
    .line 631
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/i2;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    aput-object v2, v15, v6

    .line 636
    .line 637
    goto :goto_16

    .line 638
    :goto_17
    invoke-virtual {v14, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 639
    .line 640
    .line 641
    move-result-wide v6

    .line 642
    long-to-int v2, v6

    .line 643
    add-int/lit8 v6, v28, 0x1

    .line 644
    .line 645
    aget-object v7, v15, v6

    .line 646
    .line 647
    move/from16 v31, v0

    .line 648
    .line 649
    instance-of v0, v7, Ljava/lang/reflect/Field;

    .line 650
    .line 651
    if-eqz v0, :cond_22

    .line 652
    .line 653
    check-cast v7, Ljava/lang/reflect/Field;

    .line 654
    .line 655
    goto :goto_18

    .line 656
    :cond_22
    check-cast v7, Ljava/lang/String;

    .line 657
    .line 658
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/play_billing/i2;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 659
    .line 660
    .line 661
    move-result-object v7

    .line 662
    aput-object v7, v15, v6

    .line 663
    .line 664
    :goto_18
    invoke-virtual {v14, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 665
    .line 666
    .line 667
    move-result-wide v6

    .line 668
    long-to-int v0, v6

    .line 669
    move/from16 v28, v0

    .line 670
    .line 671
    move-object v7, v1

    .line 672
    move/from16 v0, v26

    .line 673
    .line 674
    move/from16 v6, v27

    .line 675
    .line 676
    const/4 v1, 0x0

    .line 677
    const v23, 0xd800

    .line 678
    .line 679
    .line 680
    goto/16 :goto_25

    .line 681
    .line 682
    :cond_23
    move/from16 v30, v2

    .line 683
    .line 684
    move/from16 v31, v7

    .line 685
    .line 686
    add-int/lit8 v0, v10, 0x1

    .line 687
    .line 688
    aget-object v2, v15, v10

    .line 689
    .line 690
    check-cast v2, Ljava/lang/String;

    .line 691
    .line 692
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/i2;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    const/16 v7, 0x9

    .line 697
    .line 698
    if-eq v5, v7, :cond_24

    .line 699
    .line 700
    const/16 v7, 0x11

    .line 701
    .line 702
    if-ne v5, v7, :cond_25

    .line 703
    .line 704
    :cond_24
    move/from16 v28, v0

    .line 705
    .line 706
    const/4 v0, 0x1

    .line 707
    goto/16 :goto_1d

    .line 708
    .line 709
    :cond_25
    const/16 v7, 0x1b

    .line 710
    .line 711
    if-eq v5, v7, :cond_2d

    .line 712
    .line 713
    const/16 v7, 0x31

    .line 714
    .line 715
    if-ne v5, v7, :cond_26

    .line 716
    .line 717
    add-int/lit8 v10, v10, 0x2

    .line 718
    .line 719
    move/from16 v28, v0

    .line 720
    .line 721
    const/4 v0, 0x1

    .line 722
    goto/16 :goto_1c

    .line 723
    .line 724
    :cond_26
    const/16 v7, 0xc

    .line 725
    .line 726
    if-eq v5, v7, :cond_2a

    .line 727
    .line 728
    const/16 v7, 0x1e

    .line 729
    .line 730
    if-eq v5, v7, :cond_2a

    .line 731
    .line 732
    const/16 v7, 0x2c

    .line 733
    .line 734
    if-ne v5, v7, :cond_27

    .line 735
    .line 736
    goto :goto_1a

    .line 737
    :cond_27
    const/16 v7, 0x32

    .line 738
    .line 739
    if-ne v5, v7, :cond_29

    .line 740
    .line 741
    add-int/lit8 v7, v10, 0x2

    .line 742
    .line 743
    add-int/lit8 v28, v21, 0x1

    .line 744
    .line 745
    aput v20, v16, v21

    .line 746
    .line 747
    div-int/lit8 v21, v20, 0x3

    .line 748
    .line 749
    aget-object v0, v15, v0

    .line 750
    .line 751
    add-int v21, v21, v21

    .line 752
    .line 753
    aput-object v0, v9, v21

    .line 754
    .line 755
    if-eqz v26, :cond_28

    .line 756
    .line 757
    add-int/lit8 v21, v21, 0x1

    .line 758
    .line 759
    add-int/lit8 v0, v10, 0x3

    .line 760
    .line 761
    aget-object v7, v15, v7

    .line 762
    .line 763
    aput-object v7, v9, v21

    .line 764
    .line 765
    move v10, v0

    .line 766
    move-object v7, v1

    .line 767
    move/from16 v21, v28

    .line 768
    .line 769
    goto :goto_1f

    .line 770
    :cond_28
    move v10, v7

    .line 771
    move/from16 v21, v28

    .line 772
    .line 773
    const/16 v26, 0x0

    .line 774
    .line 775
    :goto_19
    move-object v7, v1

    .line 776
    goto :goto_1f

    .line 777
    :cond_29
    move/from16 v28, v0

    .line 778
    .line 779
    const/4 v0, 0x1

    .line 780
    goto :goto_1e

    .line 781
    :cond_2a
    :goto_1a
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/play_billing/o2;->k()I

    .line 782
    .line 783
    .line 784
    move-result v7

    .line 785
    move/from16 v28, v0

    .line 786
    .line 787
    const/4 v0, 0x1

    .line 788
    if-eq v7, v0, :cond_2c

    .line 789
    .line 790
    if-eqz v26, :cond_2b

    .line 791
    .line 792
    goto :goto_1b

    .line 793
    :cond_2b
    move-object v7, v1

    .line 794
    move/from16 v10, v28

    .line 795
    .line 796
    const/16 v26, 0x0

    .line 797
    .line 798
    goto :goto_1f

    .line 799
    :cond_2c
    :goto_1b
    add-int/lit8 v10, v10, 0x2

    .line 800
    .line 801
    div-int/lit8 v7, v20, 0x3

    .line 802
    .line 803
    add-int/2addr v7, v7

    .line 804
    add-int/2addr v7, v0

    .line 805
    aget-object v24, v15, v28

    .line 806
    .line 807
    aput-object v24, v9, v7

    .line 808
    .line 809
    goto :goto_19

    .line 810
    :cond_2d
    move/from16 v28, v0

    .line 811
    .line 812
    const/4 v0, 0x1

    .line 813
    add-int/lit8 v10, v10, 0x2

    .line 814
    .line 815
    :goto_1c
    div-int/lit8 v7, v20, 0x3

    .line 816
    .line 817
    add-int/2addr v7, v7

    .line 818
    add-int/2addr v7, v0

    .line 819
    aget-object v24, v15, v28

    .line 820
    .line 821
    aput-object v24, v9, v7

    .line 822
    .line 823
    goto :goto_19

    .line 824
    :goto_1d
    div-int/lit8 v7, v20, 0x3

    .line 825
    .line 826
    add-int/2addr v7, v7

    .line 827
    add-int/2addr v7, v0

    .line 828
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    move-result-object v10

    .line 832
    aput-object v10, v9, v7

    .line 833
    .line 834
    :goto_1e
    move-object v7, v1

    .line 835
    move/from16 v10, v28

    .line 836
    .line 837
    :goto_1f
    invoke-virtual {v14, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 838
    .line 839
    .line 840
    move-result-wide v0

    .line 841
    long-to-int v2, v0

    .line 842
    and-int/lit16 v0, v8, 0x1000

    .line 843
    .line 844
    const v1, 0xfffff

    .line 845
    .line 846
    .line 847
    if-eqz v0, :cond_31

    .line 848
    .line 849
    const/16 v0, 0x11

    .line 850
    .line 851
    if-gt v5, v0, :cond_31

    .line 852
    .line 853
    add-int/lit8 v0, v6, 0x1

    .line 854
    .line 855
    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    .line 856
    .line 857
    .line 858
    move-result v1

    .line 859
    const v6, 0xd800

    .line 860
    .line 861
    .line 862
    if-lt v1, v6, :cond_2f

    .line 863
    .line 864
    and-int/lit16 v1, v1, 0x1fff

    .line 865
    .line 866
    const/16 v23, 0xd

    .line 867
    .line 868
    :goto_20
    add-int/lit8 v28, v0, 0x1

    .line 869
    .line 870
    invoke-virtual {v7, v0}, Ljava/lang/String;->charAt(I)C

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    if-lt v0, v6, :cond_2e

    .line 875
    .line 876
    and-int/lit16 v0, v0, 0x1fff

    .line 877
    .line 878
    shl-int v0, v0, v23

    .line 879
    .line 880
    or-int/2addr v1, v0

    .line 881
    add-int/lit8 v23, v23, 0xd

    .line 882
    .line 883
    move/from16 v0, v28

    .line 884
    .line 885
    goto :goto_20

    .line 886
    :cond_2e
    shl-int v0, v0, v23

    .line 887
    .line 888
    or-int/2addr v1, v0

    .line 889
    goto :goto_21

    .line 890
    :cond_2f
    move/from16 v28, v0

    .line 891
    .line 892
    :goto_21
    add-int v0, v31, v31

    .line 893
    .line 894
    div-int/lit8 v23, v1, 0x20

    .line 895
    .line 896
    add-int v0, v0, v23

    .line 897
    .line 898
    aget-object v6, v15, v0

    .line 899
    .line 900
    move/from16 v29, v0

    .line 901
    .line 902
    instance-of v0, v6, Ljava/lang/reflect/Field;

    .line 903
    .line 904
    if-eqz v0, :cond_30

    .line 905
    .line 906
    check-cast v6, Ljava/lang/reflect/Field;

    .line 907
    .line 908
    :goto_22
    move/from16 v29, v1

    .line 909
    .line 910
    goto :goto_23

    .line 911
    :cond_30
    check-cast v6, Ljava/lang/String;

    .line 912
    .line 913
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/play_billing/i2;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 914
    .line 915
    .line 916
    move-result-object v6

    .line 917
    aput-object v6, v15, v29

    .line 918
    .line 919
    goto :goto_22

    .line 920
    :goto_23
    invoke-virtual {v14, v6}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 921
    .line 922
    .line 923
    move-result-wide v0

    .line 924
    long-to-int v0, v0

    .line 925
    rem-int/lit8 v1, v29, 0x20

    .line 926
    .line 927
    move/from16 v6, v28

    .line 928
    .line 929
    const v23, 0xd800

    .line 930
    .line 931
    .line 932
    move/from16 v28, v0

    .line 933
    .line 934
    goto :goto_24

    .line 935
    :cond_31
    const v23, 0xd800

    .line 936
    .line 937
    .line 938
    move/from16 v28, v1

    .line 939
    .line 940
    const/4 v1, 0x0

    .line 941
    :goto_24
    const/16 v0, 0x12

    .line 942
    .line 943
    if-lt v5, v0, :cond_32

    .line 944
    .line 945
    const/16 v0, 0x31

    .line 946
    .line 947
    if-gt v5, v0, :cond_32

    .line 948
    .line 949
    add-int/lit8 v0, v22, 0x1

    .line 950
    .line 951
    aput v2, v16, v22

    .line 952
    .line 953
    move/from16 v22, v0

    .line 954
    .line 955
    :cond_32
    move/from16 v0, v26

    .line 956
    .line 957
    :goto_25
    add-int/lit8 v26, v20, 0x1

    .line 958
    .line 959
    aput v4, v11, v20

    .line 960
    .line 961
    add-int/lit8 v4, v20, 0x2

    .line 962
    .line 963
    move/from16 v27, v0

    .line 964
    .line 965
    and-int/lit16 v0, v8, 0x200

    .line 966
    .line 967
    if-eqz v0, :cond_33

    .line 968
    .line 969
    const/high16 v0, 0x20000000

    .line 970
    .line 971
    goto :goto_26

    .line 972
    :cond_33
    const/4 v0, 0x0

    .line 973
    :goto_26
    and-int/lit16 v8, v8, 0x100

    .line 974
    .line 975
    if-eqz v8, :cond_34

    .line 976
    .line 977
    const/high16 v8, 0x10000000

    .line 978
    .line 979
    goto :goto_27

    .line 980
    :cond_34
    const/4 v8, 0x0

    .line 981
    :goto_27
    if-eqz v27, :cond_35

    .line 982
    .line 983
    const/high16 v27, -0x80000000

    .line 984
    .line 985
    goto :goto_28

    .line 986
    :cond_35
    const/16 v27, 0x0

    .line 987
    .line 988
    :goto_28
    shl-int/lit8 v5, v5, 0x14

    .line 989
    .line 990
    or-int/2addr v0, v8

    .line 991
    or-int v0, v0, v27

    .line 992
    .line 993
    or-int/2addr v0, v5

    .line 994
    or-int/2addr v0, v2

    .line 995
    aput v0, v11, v26

    .line 996
    .line 997
    add-int/lit8 v20, v20, 0x3

    .line 998
    .line 999
    shl-int/lit8 v0, v1, 0x14

    .line 1000
    .line 1001
    or-int v0, v0, v28

    .line 1002
    .line 1003
    aput v0, v11, v4

    .line 1004
    .line 1005
    move v4, v6

    .line 1006
    move-object v1, v7

    .line 1007
    move/from16 v5, v23

    .line 1008
    .line 1009
    move-object/from16 v0, v25

    .line 1010
    .line 1011
    move/from16 v2, v30

    .line 1012
    .line 1013
    move/from16 v7, v31

    .line 1014
    .line 1015
    goto/16 :goto_b

    .line 1016
    .line 1017
    :cond_36
    move-object/from16 v25, v0

    .line 1018
    .line 1019
    new-instance v0, Lcom/google/android/gms/internal/play_billing/i2;

    .line 1020
    .line 1021
    invoke-virtual/range {v25 .. v25}, Lcom/google/android/gms/internal/play_billing/o2;->zza()Lcom/google/android/gms/internal/play_billing/f2;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v14

    .line 1025
    const/4 v15, 0x0

    .line 1026
    move-object/from16 v19, p2

    .line 1027
    .line 1028
    move-object/from16 v20, p3

    .line 1029
    .line 1030
    move-object/from16 v21, p4

    .line 1031
    .line 1032
    move-object/from16 v22, p5

    .line 1033
    .line 1034
    move-object/from16 v23, p6

    .line 1035
    .line 1036
    move-object v10, v11

    .line 1037
    move-object v11, v9

    .line 1038
    move-object v9, v0

    .line 1039
    invoke-direct/range {v9 .. v23}, Lcom/google/android/gms/internal/play_billing/i2;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/play_billing/f2;Z[IIILcom/google/android/gms/internal/play_billing/k2;Lcom/google/android/gms/internal/play_billing/T1;Lcom/google/android/gms/internal/play_billing/v2;Lcom/google/android/gms/internal/play_billing/A1;Lcom/google/android/gms/internal/play_billing/a2;)V

    .line 1040
    .line 1041
    .line 1042
    return-object v9

    .line 1043
    :cond_37
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 1044
    .line 1045
    .line 1046
    const/4 v0, 0x0

    .line 1047
    throw v0
.end method

.method private static B(Ljava/lang/Object;J)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Double;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private static C(Ljava/lang/Object;J)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static D(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private final E(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private final F(II)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    div-int/lit8 v1, v1, 0x3

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    add-int/2addr v1, v2

    .line 8
    :goto_0
    if-gt p2, v1, :cond_2

    .line 9
    .line 10
    add-int v3, v1, p2

    .line 11
    .line 12
    ushr-int/lit8 v3, v3, 0x1

    .line 13
    .line 14
    mul-int/lit8 v4, v3, 0x3

    .line 15
    .line 16
    aget v5, v0, v4

    .line 17
    .line 18
    if-ne p1, v5, :cond_0

    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    if-ge p1, v5, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v3, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    add-int/lit8 p2, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    return v2
.end method

.method private static G(I)I
    .locals 0

    .line 1
    ushr-int/lit8 p0, p0, 0x14

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method private final H(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    aget p1, v0, p1

    .line 6
    .line 7
    return p1
.end method

.method private static I(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method private final J(I)Lcom/google/android/gms/internal/play_billing/M1;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    add-int/2addr p1, p1

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    check-cast p1, Lcom/google/android/gms/internal/play_billing/M1;

    .line 11
    .line 12
    return-object p1
.end method

.method private final K(I)Lcom/google/android/gms/internal/play_billing/p2;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    div-int/lit8 p1, p1, 0x3

    .line 4
    .line 5
    add-int/2addr p1, p1

    .line 6
    aget-object v1, v0, p1

    .line 7
    .line 8
    check-cast v1, Lcom/google/android/gms/internal/play_billing/p2;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/m2;->a()Lcom/google/android/gms/internal/play_billing/m2;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    aget-object v1, v0, v1

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Class;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/m2;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/p2;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    aput-object v1, v0, p1

    .line 28
    .line 29
    return-object v1
.end method

.method private final L(I)Ljava/lang/Object;
    .locals 1

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    add-int/2addr p1, p1

    .line 6
    aget-object p1, v0, p1

    .line 7
    .line 8
    return-object p1
.end method

.method private final M(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0xfffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/p2;->m()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    int-to-long v1, v1

    .line 25
    sget-object p2, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/i2;->u(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/p2;->m()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/p2;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method private final N(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/p2;->m()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    const v1, 0xfffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p3, v1

    .line 26
    int-to-long v1, p3

    .line 27
    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/i2;->u(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/p2;->m()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/p2;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-object p2
.end method

.method private static O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_1

    .line 14
    .line 15
    aget-object v4, v1, v3

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    return-object v4

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v4, "Field "

    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, " for "

    .line 55
    .line 56
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, " not found. Known fields are "

    .line 63
    .line 64
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-direct {v2, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v2
.end method

.method private static i(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/i2;->u(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "Mutating immutable message: "

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method private final j(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    sget-object v1, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 17
    .line 18
    int-to-long v2, v0

    .line 19
    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/i2;->u(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1, p1, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/p2;->m()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p2, v4, v0}, Lcom/google/android/gms/internal/play_billing/p2;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    invoke-static {p3}, Lcom/google/android/gms/internal/play_billing/i2;->u(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/p2;->m()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {p2, v4, p3}, Lcom/google/android/gms/internal/play_billing/p2;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p3, v4

    .line 80
    :cond_3
    invoke-interface {p2, p3, v0}, Lcom/google/android/gms/internal/play_billing/p2;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 85
    .line 86
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    aget p1, p1, p3

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    new-instance p3, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v1, "Source subfield "

    .line 100
    .line 101
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p1, " is present but null: "

    .line 108
    .line 109
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v0
.end method

.method private final k(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 2
    .line 3
    aget v1, v0, p3

    .line 4
    .line 5
    invoke-direct {p0, p2, v1, p3}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    sget-object v3, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 21
    .line 22
    int-to-long v4, v2

    .line 23
    invoke-virtual {v3, p2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/i2;->u(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3, p1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/p2;->m()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {p2, v0, v2}, Lcom/google/android/gms/internal/play_billing/p2;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, p1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-direct {p0, p1, v1, p3}, Lcom/google/android/gms/internal/play_billing/i2;->n(Ljava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {p3}, Lcom/google/android/gms/internal/play_billing/i2;->u(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/p2;->m()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {p2, v0, p3}, Lcom/google/android/gms/internal/play_billing/p2;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, p1, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object p3, v0

    .line 84
    :cond_3
    invoke-interface {p2, p3, v2}, Lcom/google/android/gms/internal/play_billing/p2;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    aget p3, v0, p3

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v1, "Source subfield "

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p3, " is present but null: "

    .line 110
    .line 111
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1
.end method

.method private final l(Ljava/lang/Object;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/i2;->E(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p2

    .line 9
    int-to-long v0, v0

    .line 10
    const-wide/32 v2, 0xfffff

    .line 11
    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    ushr-int/lit8 p2, p2, 0x14

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x1

    .line 25
    shl-int p2, v3, p2

    .line 26
    .line 27
    or-int/2addr p2, v2

    .line 28
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/play_billing/C2;->v(Ljava/lang/Object;JI)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private final n(Ljava/lang/Object;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->E(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/play_billing/C2;->v(Ljava/lang/Object;JI)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final o(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final p(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr v1, v2

    .line 11
    int-to-long v1, v1

    .line 12
    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/i2;->n(Ljava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final q(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method private final r(Ljava/lang/Object;I)Z
    .locals 7

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/i2;->E(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int v2, v0, v1

    .line 9
    .line 10
    int-to-long v2, v2

    .line 11
    const-wide/32 v4, 0xfffff

    .line 12
    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x1

    .line 18
    if-nez v4, :cond_14

    .line 19
    .line 20
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    and-int v0, p2, v1

    .line 25
    .line 26
    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    int-to-long v0, v0

    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    packed-switch p2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    return v6

    .line 49
    :cond_0
    return v5

    .line 50
    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    cmp-long p1, p1, v2

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    return v6

    .line 59
    :cond_1
    return v5

    .line 60
    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    return v6

    .line 67
    :cond_2
    return v5

    .line 68
    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide p1

    .line 72
    cmp-long p1, p1, v2

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    return v6

    .line 77
    :cond_3
    return v5

    .line 78
    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    return v6

    .line 85
    :cond_4
    return v5

    .line 86
    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    return v6

    .line 93
    :cond_5
    return v5

    .line 94
    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_6

    .line 99
    .line 100
    return v6

    .line 101
    :cond_6
    return v5

    .line 102
    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/play_billing/o1;->b:Lcom/google/android/gms/internal/play_billing/o1;

    .line 103
    .line 104
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/o1;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_7

    .line 113
    .line 114
    return v6

    .line 115
    :cond_7
    return v5

    .line 116
    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_8

    .line 121
    .line 122
    return v6

    .line 123
    :cond_8
    return v5

    .line 124
    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    instance-of p2, p1, Ljava/lang/String;

    .line 129
    .line 130
    if-eqz p2, :cond_a

    .line 131
    .line 132
    check-cast p1, Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_9

    .line 139
    .line 140
    return v6

    .line 141
    :cond_9
    return v5

    .line 142
    :cond_a
    instance-of p2, p1, Lcom/google/android/gms/internal/play_billing/o1;

    .line 143
    .line 144
    if-eqz p2, :cond_c

    .line 145
    .line 146
    sget-object p2, Lcom/google/android/gms/internal/play_billing/o1;->b:Lcom/google/android/gms/internal/play_billing/o1;

    .line 147
    .line 148
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/o1;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-nez p1, :cond_b

    .line 153
    .line 154
    return v6

    .line 155
    :cond_b
    return v5

    .line 156
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->B(Ljava/lang/Object;J)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    return p1

    .line 167
    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_d

    .line 172
    .line 173
    return v6

    .line 174
    :cond_d
    return v5

    .line 175
    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 176
    .line 177
    .line 178
    move-result-wide p1

    .line 179
    cmp-long p1, p1, v2

    .line 180
    .line 181
    if-eqz p1, :cond_e

    .line 182
    .line 183
    return v6

    .line 184
    :cond_e
    return v5

    .line 185
    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_f

    .line 190
    .line 191
    return v6

    .line 192
    :cond_f
    return v5

    .line 193
    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 194
    .line 195
    .line 196
    move-result-wide p1

    .line 197
    cmp-long p1, p1, v2

    .line 198
    .line 199
    if-eqz p1, :cond_10

    .line 200
    .line 201
    return v6

    .line 202
    :cond_10
    return v5

    .line 203
    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 204
    .line 205
    .line 206
    move-result-wide p1

    .line 207
    cmp-long p1, p1, v2

    .line 208
    .line 209
    if-eqz p1, :cond_11

    .line 210
    .line 211
    return v6

    .line 212
    :cond_11
    return v5

    .line 213
    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->g(Ljava/lang/Object;J)F

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_12

    .line 222
    .line 223
    return v6

    .line 224
    :cond_12
    return v5

    .line 225
    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->f(Ljava/lang/Object;J)D

    .line 226
    .line 227
    .line 228
    move-result-wide p1

    .line 229
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 230
    .line 231
    .line 232
    move-result-wide p1

    .line 233
    cmp-long p1, p1, v2

    .line 234
    .line 235
    if-eqz p1, :cond_13

    .line 236
    .line 237
    return v6

    .line 238
    :cond_13
    return v5

    .line 239
    :cond_14
    ushr-int/lit8 p2, v0, 0x14

    .line 240
    .line 241
    shl-int p2, v6, p2

    .line 242
    .line 243
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    and-int/2addr p1, p2

    .line 248
    if-eqz p1, :cond_15

    .line 249
    .line 250
    return v6

    .line 251
    :cond_15
    return v5

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final s(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    and-int p1, p4, p5

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private static t(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/p2;)Z
    .locals 2

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    int-to-long v0, p1

    .line 6
    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/play_billing/p2;->c(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private static u(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J1;->B()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method private final v(Ljava/lang/Object;II)Z
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/i2;->E(I)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    const v0, 0xfffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p3, v0

    .line 9
    int-to-long v0, p3

    .line 10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-ne p1, p2, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method private static w(Ljava/lang/Object;J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

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

.method private static final x(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/G2;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/play_billing/G2;->l(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/play_billing/o1;

    .line 12
    .line 13
    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/play_billing/G2;->n(ILcom/google/android/gms/internal/play_billing/o1;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method static z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/w2;
    .locals 2

    .line 1
    check-cast p0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w2;->c()Lcom/google/android/gms/internal/play_billing/w2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/w2;->f()Lcom/google/android/gms/internal/play_billing/w2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v0, v3, :cond_2

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const v4, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v4, v3

    .line 16
    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    aget v2, v2, v0

    .line 21
    .line 22
    int-to-long v4, v4

    .line 23
    const/16 v6, 0x25

    .line 24
    .line 25
    const/16 v7, 0x20

    .line 26
    .line 27
    packed-switch v3, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :pswitch_0
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    mul-int/lit8 v1, v1, 0x35

    .line 39
    .line 40
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    :goto_1
    add-int/2addr v1, v2

    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :pswitch_1
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    mul-int/lit8 v1, v1, 0x35

    .line 58
    .line 59
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 64
    .line 65
    :goto_2
    ushr-long v4, v2, v7

    .line 66
    .line 67
    xor-long/2addr v2, v4

    .line 68
    long-to-int v2, v2

    .line 69
    goto :goto_1

    .line 70
    :pswitch_2
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    mul-int/lit8 v1, v1, 0x35

    .line 77
    .line 78
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    goto :goto_1

    .line 83
    :pswitch_3
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    mul-int/lit8 v1, v1, 0x35

    .line 90
    .line 91
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :pswitch_4
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_1

    .line 103
    .line 104
    mul-int/lit8 v1, v1, 0x35

    .line 105
    .line 106
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    goto :goto_1

    .line 111
    :pswitch_5
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_1

    .line 116
    .line 117
    mul-int/lit8 v1, v1, 0x35

    .line 118
    .line 119
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    goto :goto_1

    .line 124
    :pswitch_6
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_1

    .line 129
    .line 130
    mul-int/lit8 v1, v1, 0x35

    .line 131
    .line 132
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    goto :goto_1

    .line 137
    :pswitch_7
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_1

    .line 142
    .line 143
    mul-int/lit8 v1, v1, 0x35

    .line 144
    .line 145
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    goto :goto_1

    .line 154
    :pswitch_8
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_1

    .line 159
    .line 160
    mul-int/lit8 v1, v1, 0x35

    .line 161
    .line 162
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    goto :goto_1

    .line 171
    :pswitch_9
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_1

    .line 176
    .line 177
    mul-int/lit8 v1, v1, 0x35

    .line 178
    .line 179
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :pswitch_a
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_1

    .line 196
    .line 197
    mul-int/lit8 v1, v1, 0x35

    .line 198
    .line 199
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->w(Ljava/lang/Object;J)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/P1;->a(Z)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :pswitch_b
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_1

    .line 214
    .line 215
    mul-int/lit8 v1, v1, 0x35

    .line 216
    .line 217
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    goto/16 :goto_1

    .line 222
    .line 223
    :pswitch_c
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_1

    .line 228
    .line 229
    mul-int/lit8 v1, v1, 0x35

    .line 230
    .line 231
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    .line 232
    .line 233
    .line 234
    move-result-wide v2

    .line 235
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 236
    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :pswitch_d
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_1

    .line 244
    .line 245
    mul-int/lit8 v1, v1, 0x35

    .line 246
    .line 247
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :pswitch_e
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_1

    .line 258
    .line 259
    mul-int/lit8 v1, v1, 0x35

    .line 260
    .line 261
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    .line 262
    .line 263
    .line 264
    move-result-wide v2

    .line 265
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 266
    .line 267
    goto/16 :goto_2

    .line 268
    .line 269
    :pswitch_f
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eqz v2, :cond_1

    .line 274
    .line 275
    mul-int/lit8 v1, v1, 0x35

    .line 276
    .line 277
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    .line 278
    .line 279
    .line 280
    move-result-wide v2

    .line 281
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 282
    .line 283
    goto/16 :goto_2

    .line 284
    .line 285
    :pswitch_10
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-eqz v2, :cond_1

    .line 290
    .line 291
    mul-int/lit8 v1, v1, 0x35

    .line 292
    .line 293
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->C(Ljava/lang/Object;J)F

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :pswitch_11
    invoke-direct {p0, p1, v2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_1

    .line 308
    .line 309
    mul-int/lit8 v1, v1, 0x35

    .line 310
    .line 311
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/i2;->B(Ljava/lang/Object;J)D

    .line 312
    .line 313
    .line 314
    move-result-wide v2

    .line 315
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 316
    .line 317
    .line 318
    move-result-wide v2

    .line 319
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 320
    .line 321
    goto/16 :goto_2

    .line 322
    .line 323
    :pswitch_12
    mul-int/lit8 v1, v1, 0x35

    .line 324
    .line 325
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :pswitch_13
    mul-int/lit8 v1, v1, 0x35

    .line 336
    .line 337
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    goto/16 :goto_1

    .line 346
    .line 347
    :pswitch_14
    mul-int/lit8 v1, v1, 0x35

    .line 348
    .line 349
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    if-eqz v2, :cond_0

    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    :cond_0
    :goto_3
    add-int/2addr v1, v6

    .line 360
    goto/16 :goto_4

    .line 361
    .line 362
    :pswitch_15
    mul-int/lit8 v1, v1, 0x35

    .line 363
    .line 364
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 365
    .line 366
    .line 367
    move-result-wide v2

    .line 368
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 369
    .line 370
    goto/16 :goto_2

    .line 371
    .line 372
    :pswitch_16
    mul-int/lit8 v1, v1, 0x35

    .line 373
    .line 374
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    goto/16 :goto_1

    .line 379
    .line 380
    :pswitch_17
    mul-int/lit8 v1, v1, 0x35

    .line 381
    .line 382
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 383
    .line 384
    .line 385
    move-result-wide v2

    .line 386
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 387
    .line 388
    goto/16 :goto_2

    .line 389
    .line 390
    :pswitch_18
    mul-int/lit8 v1, v1, 0x35

    .line 391
    .line 392
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    goto/16 :goto_1

    .line 397
    .line 398
    :pswitch_19
    mul-int/lit8 v1, v1, 0x35

    .line 399
    .line 400
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    goto/16 :goto_1

    .line 405
    .line 406
    :pswitch_1a
    mul-int/lit8 v1, v1, 0x35

    .line 407
    .line 408
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    goto/16 :goto_1

    .line 413
    .line 414
    :pswitch_1b
    mul-int/lit8 v1, v1, 0x35

    .line 415
    .line 416
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    goto/16 :goto_1

    .line 425
    .line 426
    :pswitch_1c
    mul-int/lit8 v1, v1, 0x35

    .line 427
    .line 428
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    if-eqz v2, :cond_0

    .line 433
    .line 434
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 435
    .line 436
    .line 437
    move-result v6

    .line 438
    goto :goto_3

    .line 439
    :pswitch_1d
    mul-int/lit8 v1, v1, 0x35

    .line 440
    .line 441
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    check-cast v2, Ljava/lang/String;

    .line 446
    .line 447
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    goto/16 :goto_1

    .line 452
    .line 453
    :pswitch_1e
    mul-int/lit8 v1, v1, 0x35

    .line 454
    .line 455
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->B(Ljava/lang/Object;J)Z

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/P1;->a(Z)I

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    goto/16 :goto_1

    .line 464
    .line 465
    :pswitch_1f
    mul-int/lit8 v1, v1, 0x35

    .line 466
    .line 467
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    goto/16 :goto_1

    .line 472
    .line 473
    :pswitch_20
    mul-int/lit8 v1, v1, 0x35

    .line 474
    .line 475
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 476
    .line 477
    .line 478
    move-result-wide v2

    .line 479
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 480
    .line 481
    goto/16 :goto_2

    .line 482
    .line 483
    :pswitch_21
    mul-int/lit8 v1, v1, 0x35

    .line 484
    .line 485
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    goto/16 :goto_1

    .line 490
    .line 491
    :pswitch_22
    mul-int/lit8 v1, v1, 0x35

    .line 492
    .line 493
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 494
    .line 495
    .line 496
    move-result-wide v2

    .line 497
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 498
    .line 499
    goto/16 :goto_2

    .line 500
    .line 501
    :pswitch_23
    mul-int/lit8 v1, v1, 0x35

    .line 502
    .line 503
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 504
    .line 505
    .line 506
    move-result-wide v2

    .line 507
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 508
    .line 509
    goto/16 :goto_2

    .line 510
    .line 511
    :pswitch_24
    mul-int/lit8 v1, v1, 0x35

    .line 512
    .line 513
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->g(Ljava/lang/Object;J)F

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    goto/16 :goto_1

    .line 522
    .line 523
    :pswitch_25
    mul-int/lit8 v1, v1, 0x35

    .line 524
    .line 525
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->f(Ljava/lang/Object;J)D

    .line 526
    .line 527
    .line 528
    move-result-wide v2

    .line 529
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 530
    .line 531
    .line 532
    move-result-wide v2

    .line 533
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->b:[B

    .line 534
    .line 535
    goto/16 :goto_2

    .line 536
    .line 537
    :cond_1
    :goto_4
    add-int/lit8 v0, v0, 0x3

    .line 538
    .line 539
    goto/16 :goto_0

    .line 540
    .line 541
    :cond_2
    mul-int/lit8 v1, v1, 0x35

    .line 542
    .line 543
    move-object v0, p1

    .line 544
    check-cast v0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 545
    .line 546
    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    add-int/2addr v1, v0

    .line 553
    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    .line 554
    .line 555
    if-nez v0, :cond_3

    .line 556
    .line 557
    return v1

    .line 558
    :cond_3
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    const/4 p1, 0x0

    .line 562
    throw p1

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    sget-object v6, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    const/4 v7, 0x0

    const v8, 0xfffff

    move v2, v7

    move v4, v2

    move v9, v4

    move v3, v8

    :goto_0
    iget-object v5, v0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    array-length v10, v5

    const/4 v11, 0x0

    if-ge v2, v10, :cond_1a

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    move-result v10

    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    move-result v12

    .line 2
    aget v13, v5, v2

    add-int/lit8 v14, v2, 0x2

    .line 3
    aget v5, v5, v14

    and-int v14, v5, v8

    const/16 v15, 0x11

    const/16 v16, 0x1

    if-gt v12, v15, :cond_2

    if-eq v14, v3, :cond_1

    if-ne v14, v8, :cond_0

    move v4, v7

    goto :goto_1

    :cond_0
    int-to-long v3, v14

    .line 4
    invoke-virtual {v6, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    move v4, v3

    :goto_1
    move v3, v14

    :cond_1
    ushr-int/lit8 v5, v5, 0x14

    shl-int v5, v16, v5

    goto :goto_2

    :cond_2
    move v5, v7

    :goto_2
    and-int/2addr v10, v8

    .line 5
    sget-object v14, Lcom/google/android/gms/internal/play_billing/E1;->Y:Lcom/google/android/gms/internal/play_billing/E1;

    .line 6
    invoke-virtual {v14}, Lcom/google/android/gms/internal/play_billing/E1;->zza()I

    move-result v14

    if-lt v12, v14, :cond_3

    sget-object v14, Lcom/google/android/gms/internal/play_billing/E1;->w0:Lcom/google/android/gms/internal/play_billing/E1;

    .line 7
    invoke-virtual {v14}, Lcom/google/android/gms/internal/play_billing/E1;->zza()I

    :cond_3
    int-to-long v14, v10

    const/16 v10, 0x3f

    packed-switch v12, :pswitch_data_0

    goto/16 :goto_1a

    .line 8
    :pswitch_0
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 9
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/f2;

    .line 10
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v10

    .line 11
    invoke-static {v13, v5, v10}, Lcom/google/android/gms/internal/play_billing/v1;->z(ILcom/google/android/gms/internal/play_billing/f2;Lcom/google/android/gms/internal/play_billing/p2;)I

    move-result v5

    :goto_3
    add-int/2addr v9, v5

    goto/16 :goto_1a

    .line 12
    :pswitch_1
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 13
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    move-result-wide v11

    add-long v13, v11, v11

    shr-long v10, v11, v10

    .line 14
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    xor-long/2addr v10, v13

    .line 15
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v10

    :goto_4
    add-int/2addr v5, v10

    goto :goto_3

    .line 16
    :pswitch_2
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 17
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v10

    add-int v11, v10, v10

    shr-int/lit8 v10, v10, 0x1f

    .line 18
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    xor-int/2addr v10, v11

    .line 19
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    goto :goto_4

    .line 20
    :pswitch_3
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 21
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    :goto_5
    add-int/lit8 v5, v5, 0x8

    goto :goto_3

    .line 22
    :pswitch_4
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 23
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    :goto_6
    add-int/lit8 v5, v5, 0x4

    goto :goto_3

    .line 24
    :pswitch_5
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 25
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v10

    int-to-long v10, v10

    .line 26
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    .line 27
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v10

    goto :goto_4

    .line 28
    :pswitch_6
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 29
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v10

    .line 30
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    .line 31
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    goto :goto_4

    .line 32
    :pswitch_7
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 33
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/play_billing/o1;

    .line 34
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    .line 35
    invoke-virtual {v10}, Lcom/google/android/gms/internal/play_billing/o1;->d()I

    move-result v10

    .line 36
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    :goto_7
    add-int/2addr v11, v10

    add-int/2addr v5, v11

    goto/16 :goto_3

    .line 37
    :pswitch_8
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 38
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    .line 39
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v10

    invoke-static {v13, v5, v10}, Lcom/google/android/gms/internal/play_billing/r2;->m(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;)I

    move-result v5

    goto/16 :goto_3

    .line 40
    :pswitch_9
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 41
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Lcom/google/android/gms/internal/play_billing/o1;

    if-eqz v11, :cond_4

    .line 42
    check-cast v10, Lcom/google/android/gms/internal/play_billing/o1;

    .line 43
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    .line 44
    invoke-virtual {v10}, Lcom/google/android/gms/internal/play_billing/o1;->d()I

    move-result v10

    .line 45
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_7

    .line 46
    :cond_4
    check-cast v10, Ljava/lang/String;

    .line 47
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    .line 48
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->b(Ljava/lang/String;)I

    move-result v10

    goto/16 :goto_4

    .line 49
    :pswitch_a
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 50
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_3

    .line 51
    :pswitch_b
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 52
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    goto/16 :goto_6

    .line 53
    :pswitch_c
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 54
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    goto/16 :goto_5

    .line 55
    :pswitch_d
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 56
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v10

    int-to-long v10, v10

    .line 57
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    .line 58
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v10

    goto/16 :goto_4

    .line 59
    :pswitch_e
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 60
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    move-result-wide v10

    .line 61
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    .line 62
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v10

    goto/16 :goto_4

    .line 63
    :pswitch_f
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 64
    invoke-static {v1, v14, v15}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    move-result-wide v10

    .line 65
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    .line 66
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v10

    goto/16 :goto_4

    .line 67
    :pswitch_10
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 68
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    goto/16 :goto_6

    .line 69
    :pswitch_11
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v5, v13, 0x3

    .line 70
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    goto/16 :goto_5

    .line 71
    :pswitch_12
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->L(I)Ljava/lang/Object;

    move-result-object v10

    .line 72
    check-cast v5, Lcom/google/android/gms/internal/play_billing/Z1;

    .line 73
    invoke-static {v10}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 74
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_19

    .line 75
    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/Z1;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_5

    goto/16 :goto_1a

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 76
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    throw v11

    .line 78
    :pswitch_13
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 79
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v10

    .line 80
    sget v11, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 81
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_6

    move v14, v7

    goto :goto_9

    :cond_6
    move v12, v7

    move v14, v12

    :goto_8
    if-ge v12, v11, :cond_7

    .line 82
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/google/android/gms/internal/play_billing/f2;

    invoke-static {v13, v15, v10}, Lcom/google/android/gms/internal/play_billing/v1;->z(ILcom/google/android/gms/internal/play_billing/f2;Lcom/google/android/gms/internal/play_billing/p2;)I

    move-result v15

    add-int/2addr v14, v15

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_7
    :goto_9
    add-int/2addr v9, v14

    goto/16 :goto_1a

    .line 83
    :pswitch_14
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 84
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->o(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 85
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 86
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    :goto_a
    add-int/2addr v10, v11

    add-int/2addr v10, v5

    :cond_8
    :goto_b
    add-int/2addr v9, v10

    goto/16 :goto_1a

    .line 87
    :pswitch_15
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 88
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->n(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 89
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 90
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_a

    .line 91
    :pswitch_16
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 92
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->j(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 93
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 94
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_a

    .line 95
    :pswitch_17
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 96
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->h(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 97
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 98
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_a

    .line 99
    :pswitch_18
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 100
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->f(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 101
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 102
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_a

    .line 103
    :pswitch_19
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 104
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->p(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 105
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 106
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_a

    .line 107
    :pswitch_1a
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 108
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 109
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 110
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 111
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_a

    .line 112
    :pswitch_1b
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 113
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->h(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 114
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 115
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_a

    .line 116
    :pswitch_1c
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 117
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->j(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 118
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 119
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_a

    .line 120
    :pswitch_1d
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 121
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->k(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 122
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 123
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_a

    .line 124
    :pswitch_1e
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 125
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->q(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 126
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 127
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_a

    .line 128
    :pswitch_1f
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 129
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->l(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 130
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 131
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_a

    .line 132
    :pswitch_20
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 133
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->h(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 134
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 135
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_a

    .line 136
    :pswitch_21
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 137
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->j(Ljava/util/List;)I

    move-result v5

    if-lez v5, :cond_19

    shl-int/lit8 v10, v13, 0x3

    .line 138
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    .line 139
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_a

    .line 140
    :pswitch_22
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 141
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 142
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_9

    :goto_c
    move v5, v7

    goto/16 :goto_3

    :cond_9
    shl-int/lit8 v11, v13, 0x3

    .line 143
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->o(Ljava/util/List;)I

    move-result v5

    .line 144
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    :goto_d
    mul-int/2addr v10, v11

    goto/16 :goto_4

    .line 145
    :pswitch_23
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 146
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 147
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_a

    goto :goto_c

    :cond_a
    shl-int/lit8 v11, v13, 0x3

    .line 148
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->n(Ljava/util/List;)I

    move-result v5

    .line 149
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_d

    .line 150
    :pswitch_24
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 151
    invoke-static {v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/r2;->i(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    .line 152
    :pswitch_25
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 153
    invoke-static {v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/r2;->g(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    .line 154
    :pswitch_26
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 155
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 156
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_b

    goto :goto_c

    :cond_b
    shl-int/lit8 v11, v13, 0x3

    .line 157
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->f(Ljava/util/List;)I

    move-result v5

    .line 158
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_d

    .line 159
    :pswitch_27
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 160
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 161
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_c

    goto :goto_c

    :cond_c
    shl-int/lit8 v11, v13, 0x3

    .line 162
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->p(Ljava/util/List;)I

    move-result v5

    .line 163
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto :goto_d

    .line 164
    :pswitch_28
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 165
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 166
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_d

    move v10, v7

    goto/16 :goto_b

    :cond_d
    shl-int/lit8 v11, v13, 0x3

    .line 167
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    mul-int/2addr v10, v11

    move v11, v7

    .line 168
    :goto_e
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_8

    .line 169
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/play_billing/o1;

    .line 170
    invoke-virtual {v12}, Lcom/google/android/gms/internal/play_billing/o1;->d()I

    move-result v12

    .line 171
    invoke-static {v12}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v13

    add-int/2addr v13, v12

    add-int/2addr v10, v13

    add-int/lit8 v11, v11, 0x1

    goto :goto_e

    .line 172
    :pswitch_29
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v10

    .line 173
    sget v11, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 174
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_e

    move v12, v7

    goto :goto_10

    :cond_e
    shl-int/lit8 v12, v13, 0x3

    .line 175
    invoke-static {v12}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v12

    mul-int/2addr v12, v11

    move v13, v7

    :goto_f
    if-ge v13, v11, :cond_f

    .line 176
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 177
    check-cast v14, Lcom/google/android/gms/internal/play_billing/f2;

    invoke-static {v14, v10}, Lcom/google/android/gms/internal/play_billing/v1;->a(Lcom/google/android/gms/internal/play_billing/f2;Lcom/google/android/gms/internal/play_billing/p2;)I

    move-result v14

    add-int/2addr v12, v14

    add-int/lit8 v13, v13, 0x1

    goto :goto_f

    :cond_f
    :goto_10
    add-int/2addr v9, v12

    goto/16 :goto_1a

    .line 178
    :pswitch_2a
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 179
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_10

    :goto_11
    move v11, v7

    goto :goto_14

    :cond_10
    shl-int/lit8 v11, v13, 0x3

    .line 180
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    mul-int/2addr v11, v10

    move v12, v7

    :goto_12
    if-ge v12, v10, :cond_12

    .line 181
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Lcom/google/android/gms/internal/play_billing/o1;

    if-eqz v14, :cond_11

    .line 182
    check-cast v13, Lcom/google/android/gms/internal/play_billing/o1;

    .line 183
    invoke-virtual {v13}, Lcom/google/android/gms/internal/play_billing/o1;->d()I

    move-result v13

    .line 184
    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v14

    add-int/2addr v14, v13

    add-int/2addr v11, v14

    goto :goto_13

    .line 185
    :cond_11
    check-cast v13, Ljava/lang/String;

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/v1;->b(Ljava/lang/String;)I

    move-result v13

    add-int/2addr v11, v13

    :goto_13
    add-int/lit8 v12, v12, 0x1

    goto :goto_12

    :cond_12
    :goto_14
    add-int/2addr v9, v11

    goto/16 :goto_1a

    .line 186
    :pswitch_2b
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 187
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 188
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_13

    goto/16 :goto_c

    :cond_13
    shl-int/lit8 v10, v13, 0x3

    .line 189
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    add-int/lit8 v10, v10, 0x1

    mul-int/2addr v5, v10

    goto/16 :goto_3

    .line 190
    :pswitch_2c
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 191
    invoke-static {v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/r2;->g(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    .line 192
    :pswitch_2d
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 193
    invoke-static {v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/r2;->i(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    .line 194
    :pswitch_2e
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 195
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 196
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_14

    goto/16 :goto_c

    :cond_14
    shl-int/lit8 v11, v13, 0x3

    .line 197
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->k(Ljava/util/List;)I

    move-result v5

    .line 198
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_d

    .line 199
    :pswitch_2f
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 200
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 201
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_15

    goto/16 :goto_c

    :cond_15
    shl-int/lit8 v11, v13, 0x3

    .line 202
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->q(Ljava/util/List;)I

    move-result v5

    .line 203
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v11

    goto/16 :goto_d

    .line 204
    :pswitch_30
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 205
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 206
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_16

    goto/16 :goto_11

    :cond_16
    shl-int/lit8 v10, v13, 0x3

    .line 207
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r2;->l(Ljava/util/List;)I

    move-result v11

    .line 208
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    .line 209
    invoke-static {v10}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    mul-int/2addr v5, v10

    add-int/2addr v11, v5

    goto/16 :goto_14

    .line 210
    :pswitch_31
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 211
    invoke-static {v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/r2;->g(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    .line 212
    :pswitch_32
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 213
    invoke-static {v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/r2;->i(ILjava/util/List;Z)I

    move-result v5

    goto/16 :goto_3

    .line 214
    :pswitch_33
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 215
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/f2;

    .line 216
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v10

    .line 217
    invoke-static {v13, v5, v10}, Lcom/google/android/gms/internal/play_billing/v1;->z(ILcom/google/android/gms/internal/play_billing/f2;Lcom/google/android/gms/internal/play_billing/p2;)I

    move-result v5

    goto/16 :goto_3

    .line 218
    :pswitch_34
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 219
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v11

    add-long v13, v11, v11

    shr-long v10, v11, v10

    .line 220
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    xor-long/2addr v10, v13

    .line 221
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v5

    :goto_15
    add-int/2addr v0, v5

    :goto_16
    add-int/2addr v9, v0

    :cond_17
    move-object/from16 v0, p0

    goto/16 :goto_1a

    .line 222
    :pswitch_35
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 223
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    add-int v10, v5, v5

    shr-int/lit8 v5, v5, 0x1f

    .line 224
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    xor-int/2addr v5, v10

    .line 225
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    goto :goto_15

    .line 226
    :pswitch_36
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 227
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    :goto_17
    add-int/lit8 v0, v0, 0x8

    goto :goto_16

    .line 228
    :pswitch_37
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 229
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    :goto_18
    add-int/lit8 v0, v0, 0x4

    goto :goto_16

    .line 230
    :pswitch_38
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 231
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    int-to-long v10, v5

    .line 232
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    .line 233
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v5

    goto :goto_15

    .line 234
    :pswitch_39
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 235
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    .line 236
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    .line 237
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v5

    goto :goto_15

    .line 238
    :pswitch_3a
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 239
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/o1;

    .line 240
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    .line 241
    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/o1;->d()I

    move-result v5

    .line 242
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    :goto_19
    add-int/2addr v10, v5

    add-int/2addr v0, v10

    goto/16 :goto_16

    .line 243
    :pswitch_3b
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    .line 244
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    .line 245
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v10

    invoke-static {v13, v5, v10}, Lcom/google/android/gms/internal/play_billing/r2;->m(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;)I

    move-result v5

    goto/16 :goto_3

    .line 246
    :pswitch_3c
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 247
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    instance-of v10, v5, Lcom/google/android/gms/internal/play_billing/o1;

    if-eqz v10, :cond_18

    .line 248
    check-cast v5, Lcom/google/android/gms/internal/play_billing/o1;

    .line 249
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    .line 250
    invoke-virtual {v5}, Lcom/google/android/gms/internal/play_billing/o1;->d()I

    move-result v5

    .line 251
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v10

    goto :goto_19

    .line 252
    :cond_18
    check-cast v5, Ljava/lang/String;

    .line 253
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    .line 254
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/v1;->b(Ljava/lang/String;)I

    move-result v5

    goto/16 :goto_15

    .line 255
    :pswitch_3d
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 256
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_16

    .line 257
    :pswitch_3e
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 258
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    goto/16 :goto_18

    .line 259
    :pswitch_3f
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 260
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    goto/16 :goto_17

    .line 261
    :pswitch_40
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 262
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    int-to-long v10, v5

    .line 263
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    .line 264
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v5

    goto/16 :goto_15

    .line 265
    :pswitch_41
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 266
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    .line 267
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    .line 268
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v5

    goto/16 :goto_15

    .line 269
    :pswitch_42
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 270
    invoke-virtual {v6, v1, v14, v15}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    .line 271
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    .line 272
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/v1;->d(J)I

    move-result v5

    goto/16 :goto_15

    .line 273
    :pswitch_43
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_17

    shl-int/lit8 v0, v13, 0x3

    .line 274
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v0

    goto/16 :goto_18

    .line 275
    :pswitch_44
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_19

    shl-int/lit8 v1, v13, 0x3

    .line 276
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v1;->c(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x8

    add-int/2addr v9, v1

    :cond_19
    :goto_1a
    add-int/lit8 v2, v2, 0x3

    move-object/from16 v1, p1

    goto/16 :goto_0

    .line 277
    :cond_1a
    move-object/from16 v1, p1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/J1;

    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 278
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/w2;->a()I

    move-result v1

    add-int/2addr v9, v1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    if-nez v1, :cond_1b

    return v9

    .line 279
    :cond_1b
    invoke-static/range {p1 .. p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    throw v11

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const v7, 0xfffff

    .line 5
    .line 6
    .line 7
    move v2, v6

    .line 8
    move v8, v2

    .line 9
    move v0, v7

    .line 10
    :goto_0
    iget v3, p0, Lcom/google/android/gms/internal/play_billing/i2;->h:I

    .line 11
    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ge v8, v3, :cond_b

    .line 15
    .line 16
    iget-object v3, p0, Lcom/google/android/gms/internal/play_billing/i2;->g:[I

    .line 17
    .line 18
    iget-object v5, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 19
    .line 20
    aget v3, v3, v8

    .line 21
    .line 22
    aget v10, v5, v3

    .line 23
    .line 24
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 25
    .line 26
    .line 27
    move-result v11

    .line 28
    add-int/lit8 v12, v3, 0x2

    .line 29
    .line 30
    aget v5, v5, v12

    .line 31
    .line 32
    and-int v12, v5, v7

    .line 33
    .line 34
    ushr-int/lit8 v5, v5, 0x14

    .line 35
    .line 36
    shl-int v5, v4, v5

    .line 37
    .line 38
    if-eq v12, v0, :cond_1

    .line 39
    .line 40
    if-eq v12, v7, :cond_0

    .line 41
    .line 42
    int-to-long v13, v12

    .line 43
    sget-object v0, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    :cond_0
    move v4, v2

    .line 50
    move v0, v12

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v4, v2

    .line 53
    :goto_1
    const/high16 v2, 0x10000000

    .line 54
    .line 55
    and-int/2addr v2, v11

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    move v2, v3

    .line 59
    move v3, v0

    .line 60
    move-object v0, p0

    .line 61
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    if-eqz v12, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    return v6

    .line 69
    :cond_3
    move v2, v3

    .line 70
    move v3, v0

    .line 71
    :goto_2
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const/16 v13, 0x9

    .line 76
    .line 77
    if-eq v12, v13, :cond_9

    .line 78
    .line 79
    const/16 v13, 0x11

    .line 80
    .line 81
    if-eq v12, v13, :cond_9

    .line 82
    .line 83
    const/16 v5, 0x1b

    .line 84
    .line 85
    if-eq v12, v5, :cond_7

    .line 86
    .line 87
    const/16 v5, 0x3c

    .line 88
    .line 89
    if-eq v12, v5, :cond_6

    .line 90
    .line 91
    const/16 v5, 0x44

    .line 92
    .line 93
    if-eq v12, v5, :cond_6

    .line 94
    .line 95
    const/16 v5, 0x31

    .line 96
    .line 97
    if-eq v12, v5, :cond_7

    .line 98
    .line 99
    const/16 v5, 0x32

    .line 100
    .line 101
    if-eq v12, v5, :cond_4

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    and-int v5, v11, v7

    .line 105
    .line 106
    int-to-long v10, v5

    .line 107
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Lcom/google/android/gms/internal/play_billing/Z1;

    .line 112
    .line 113
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_5

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->L(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    throw v9

    .line 128
    :cond_6
    invoke-direct {p0, v1, v10, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_a

    .line 133
    .line 134
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-static {v1, v11, v2}, Lcom/google/android/gms/internal/play_billing/i2;->t(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/p2;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_a

    .line 143
    .line 144
    return v6

    .line 145
    :cond_7
    and-int v5, v11, v7

    .line 146
    .line 147
    int-to-long v9, v5

    .line 148
    invoke-static {v1, v9, v10}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, Ljava/util/List;

    .line 153
    .line 154
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-nez v9, :cond_a

    .line 159
    .line 160
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    move v9, v6

    .line 165
    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    if-ge v9, v10, :cond_a

    .line 170
    .line 171
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-interface {v2, v10}, Lcom/google/android/gms/internal/play_billing/p2;->c(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-nez v10, :cond_8

    .line 180
    .line 181
    return v6

    .line 182
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_9
    move-object v0, p0

    .line 186
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_a

    .line 191
    .line 192
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-static {v1, v11, v2}, Lcom/google/android/gms/internal/play_billing/i2;->t(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/p2;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-nez v2, :cond_a

    .line 201
    .line 202
    return v6

    .line 203
    :cond_a
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 204
    .line 205
    move v0, v3

    .line 206
    move v2, v4

    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_b
    iget-boolean v2, p0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    .line 210
    .line 211
    if-nez v2, :cond_c

    .line 212
    .line 213
    return v4

    .line 214
    :cond_c
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    throw v9
.end method

.method public final d(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/G2;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    .line 1
    iget-boolean v2, v0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    if-nez v2, :cond_7

    .line 2
    iget-object v8, v0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    sget-object v9, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    const v10, 0xfffff

    move v3, v10

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    array-length v5, v8

    if-ge v2, v5, :cond_6

    .line 3
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    move-result v5

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    move-result v12

    .line 4
    aget v13, v8, v2

    const/16 v14, 0x11

    const/4 v15, 0x1

    if-gt v12, v14, :cond_2

    add-int/lit8 v14, v2, 0x2

    .line 5
    aget v14, v8, v14

    const/16 v16, 0x0

    and-int v7, v14, v10

    if-eq v7, v3, :cond_1

    if-ne v7, v10, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    int-to-long v3, v7

    .line 6
    invoke-virtual {v9, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    move v4, v3

    :goto_1
    move v3, v7

    :cond_1
    ushr-int/lit8 v7, v14, 0x14

    shl-int v7, v15, v7

    goto :goto_2

    :cond_2
    const/16 v16, 0x0

    const/4 v7, 0x0

    :goto_2
    and-int/2addr v5, v10

    int-to-long v10, v5

    packed-switch v12, :pswitch_data_0

    :cond_3
    :goto_3
    const/4 v12, 0x0

    goto/16 :goto_6

    .line 7
    :pswitch_0
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 8
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v7

    .line 9
    invoke-interface {v6, v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/G2;->j(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;)V

    goto :goto_3

    .line 10
    :pswitch_1
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 11
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->s(IJ)V

    goto :goto_3

    .line 12
    :pswitch_2
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 13
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->w(II)V

    goto :goto_3

    .line 14
    :pswitch_3
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 15
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->B(IJ)V

    goto :goto_3

    .line 16
    :pswitch_4
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 17
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->u(II)V

    goto :goto_3

    .line 18
    :pswitch_5
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 19
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->g(II)V

    goto :goto_3

    .line 20
    :pswitch_6
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 21
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->z(II)V

    goto :goto_3

    .line 22
    :pswitch_7
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 23
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/o1;

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->n(ILcom/google/android/gms/internal/play_billing/o1;)V

    goto :goto_3

    .line 24
    :pswitch_8
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 25
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    .line 26
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v7

    invoke-interface {v6, v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/G2;->D(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;)V

    goto/16 :goto_3

    .line 27
    :pswitch_9
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 28
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13, v5, v6}, Lcom/google/android/gms/internal/play_billing/i2;->x(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/G2;)V

    goto/16 :goto_3

    .line 29
    :pswitch_a
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 30
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->w(Ljava/lang/Object;J)Z

    move-result v5

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->m(IZ)V

    goto/16 :goto_3

    .line 31
    :pswitch_b
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 32
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->e(II)V

    goto/16 :goto_3

    .line 33
    :pswitch_c
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 34
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->H(IJ)V

    goto/16 :goto_3

    .line 35
    :pswitch_d
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 36
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->D(Ljava/lang/Object;J)I

    move-result v5

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->r(II)V

    goto/16 :goto_3

    .line 37
    :pswitch_e
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 38
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->J(IJ)V

    goto/16 :goto_3

    .line 39
    :pswitch_f
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 40
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->I(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->o(IJ)V

    goto/16 :goto_3

    .line 41
    :pswitch_10
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 42
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->C(Ljava/lang/Object;J)F

    move-result v5

    invoke-interface {v6, v13, v5}, Lcom/google/android/gms/internal/play_billing/G2;->E(IF)V

    goto/16 :goto_3

    .line 43
    :pswitch_11
    invoke-direct {v0, v1, v13, v2}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 44
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/i2;->B(Ljava/lang/Object;J)D

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->b(ID)V

    goto/16 :goto_3

    .line 45
    :pswitch_12
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_4

    goto/16 :goto_3

    .line 46
    :cond_4
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->L(I)Ljava/lang/Object;

    move-result-object v1

    .line 47
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 48
    throw v16

    .line 49
    :pswitch_13
    aget v5, v8, v2

    .line 50
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 51
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v10

    .line 52
    sget v11, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    if-eqz v7, :cond_3

    .line 53
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_3

    const/4 v11, 0x0

    .line 54
    :goto_4
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_3

    .line 55
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v6

    check-cast v13, Lcom/google/android/gms/internal/play_billing/w1;

    invoke-virtual {v13, v5, v12, v10}, Lcom/google/android/gms/internal/play_billing/w1;->j(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 56
    :pswitch_14
    aget v5, v8, v2

    .line 57
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 58
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->b(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 59
    :pswitch_15
    aget v5, v8, v2

    .line 60
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 61
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->a(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 62
    :pswitch_16
    aget v5, v8, v2

    .line 63
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 64
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->E(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 65
    :pswitch_17
    aget v5, v8, v2

    .line 66
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 67
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->D(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 68
    :pswitch_18
    aget v5, v8, v2

    .line 69
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 70
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->x(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 71
    :pswitch_19
    aget v5, v8, v2

    .line 72
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 73
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->c(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 74
    :pswitch_1a
    aget v5, v8, v2

    .line 75
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 76
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->v(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 77
    :pswitch_1b
    aget v5, v8, v2

    .line 78
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 79
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->y(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 80
    :pswitch_1c
    aget v5, v8, v2

    .line 81
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 82
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->z(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 83
    :pswitch_1d
    aget v5, v8, v2

    .line 84
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 85
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->B(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 86
    :pswitch_1e
    aget v5, v8, v2

    .line 87
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 88
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->d(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 89
    :pswitch_1f
    aget v5, v8, v2

    .line 90
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 91
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->C(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 92
    :pswitch_20
    aget v5, v8, v2

    .line 93
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 94
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->A(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 95
    :pswitch_21
    aget v5, v8, v2

    .line 96
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 97
    invoke-static {v5, v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/r2;->w(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_3

    .line 98
    :pswitch_22
    aget v5, v8, v2

    .line 99
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v12, 0x0

    .line 100
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->b(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_23
    const/4 v12, 0x0

    .line 101
    aget v5, v8, v2

    .line 102
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 103
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->a(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_24
    const/4 v12, 0x0

    .line 104
    aget v5, v8, v2

    .line 105
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 106
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->E(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_25
    const/4 v12, 0x0

    .line 107
    aget v5, v8, v2

    .line 108
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 109
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->D(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_26
    const/4 v12, 0x0

    .line 110
    aget v5, v8, v2

    .line 111
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 112
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->x(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_27
    const/4 v12, 0x0

    .line 113
    aget v5, v8, v2

    .line 114
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 115
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->c(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    .line 116
    :pswitch_28
    aget v5, v8, v2

    .line 117
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 118
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    if-eqz v7, :cond_3

    .line 119
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_3

    .line 120
    invoke-interface {v6, v5, v7}, Lcom/google/android/gms/internal/play_billing/G2;->k(ILjava/util/List;)V

    goto/16 :goto_3

    .line 121
    :pswitch_29
    aget v5, v8, v2

    .line 122
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 123
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v10

    .line 124
    sget v11, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    if-eqz v7, :cond_3

    .line 125
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_3

    const/4 v12, 0x0

    .line 126
    :goto_5
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-ge v12, v11, :cond_3

    .line 127
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v6

    check-cast v13, Lcom/google/android/gms/internal/play_billing/w1;

    invoke-virtual {v13, v5, v11, v10}, Lcom/google/android/gms/internal/play_billing/w1;->D(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    .line 128
    :pswitch_2a
    aget v5, v8, v2

    .line 129
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 130
    sget v10, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    if-eqz v7, :cond_3

    .line 131
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_3

    .line 132
    invoke-interface {v6, v5, v7}, Lcom/google/android/gms/internal/play_billing/G2;->I(ILjava/util/List;)V

    goto/16 :goto_3

    .line 133
    :pswitch_2b
    aget v5, v8, v2

    .line 134
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v12, 0x0

    .line 135
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->v(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_2c
    const/4 v12, 0x0

    .line 136
    aget v5, v8, v2

    .line 137
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 138
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->y(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_2d
    const/4 v12, 0x0

    .line 139
    aget v5, v8, v2

    .line 140
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 141
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->z(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_2e
    const/4 v12, 0x0

    .line 142
    aget v5, v8, v2

    .line 143
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 144
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->B(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_2f
    const/4 v12, 0x0

    .line 145
    aget v5, v8, v2

    .line 146
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 147
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->d(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_30
    const/4 v12, 0x0

    .line 148
    aget v5, v8, v2

    .line 149
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 150
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->C(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_31
    const/4 v12, 0x0

    .line 151
    aget v5, v8, v2

    .line 152
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 153
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->A(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_32
    const/4 v12, 0x0

    .line 154
    aget v5, v8, v2

    .line 155
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    .line 156
    invoke-static {v5, v7, v6, v12}, Lcom/google/android/gms/internal/play_billing/r2;->w(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/G2;Z)V

    goto/16 :goto_6

    :pswitch_33
    move v5, v7

    const/4 v12, 0x0

    .line 157
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 158
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v7

    .line 159
    invoke-interface {v6, v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/G2;->j(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;)V

    goto/16 :goto_6

    :pswitch_34
    move v5, v7

    const/4 v12, 0x0

    .line 160
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 161
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->s(IJ)V

    goto/16 :goto_6

    :pswitch_35
    move v5, v7

    const/4 v12, 0x0

    .line 162
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 163
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->w(II)V

    goto/16 :goto_6

    :pswitch_36
    move v5, v7

    const/4 v12, 0x0

    .line 164
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 165
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->B(IJ)V

    goto/16 :goto_6

    :pswitch_37
    move v5, v7

    const/4 v12, 0x0

    .line 166
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 167
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->u(II)V

    goto/16 :goto_6

    :pswitch_38
    move v5, v7

    const/4 v12, 0x0

    .line 168
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 169
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->g(II)V

    goto/16 :goto_6

    :pswitch_39
    move v5, v7

    const/4 v12, 0x0

    .line 170
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 171
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->z(II)V

    goto/16 :goto_6

    :pswitch_3a
    move v5, v7

    const/4 v12, 0x0

    .line 172
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 173
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/o1;

    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->n(ILcom/google/android/gms/internal/play_billing/o1;)V

    goto/16 :goto_6

    :pswitch_3b
    move v5, v7

    const/4 v12, 0x0

    .line 174
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 175
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    .line 176
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v7

    invoke-interface {v6, v13, v5, v7}, Lcom/google/android/gms/internal/play_billing/G2;->D(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;)V

    goto/16 :goto_6

    :pswitch_3c
    move v5, v7

    const/4 v12, 0x0

    .line 177
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 178
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13, v0, v6}, Lcom/google/android/gms/internal/play_billing/i2;->x(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/G2;)V

    goto/16 :goto_6

    :pswitch_3d
    move v5, v7

    const/4 v12, 0x0

    .line 179
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 180
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/C2;->B(Ljava/lang/Object;J)Z

    move-result v0

    .line 181
    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->m(IZ)V

    goto/16 :goto_6

    :pswitch_3e
    move v5, v7

    const/4 v12, 0x0

    .line 182
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 183
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->e(II)V

    goto :goto_6

    :pswitch_3f
    move v5, v7

    const/4 v12, 0x0

    .line 184
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 185
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->H(IJ)V

    goto :goto_6

    :pswitch_40
    move v5, v7

    const/4 v12, 0x0

    .line 186
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 187
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->r(II)V

    goto :goto_6

    :pswitch_41
    move v5, v7

    const/4 v12, 0x0

    .line 188
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 189
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->J(IJ)V

    goto :goto_6

    :pswitch_42
    move v5, v7

    const/4 v12, 0x0

    .line 190
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 191
    invoke-virtual {v9, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v10

    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->o(IJ)V

    goto :goto_6

    :pswitch_43
    move v5, v7

    const/4 v12, 0x0

    .line 192
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 193
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/C2;->g(Ljava/lang/Object;J)F

    move-result v0

    .line 194
    invoke-interface {v6, v13, v0}, Lcom/google/android/gms/internal/play_billing/G2;->E(IF)V

    goto :goto_6

    :pswitch_44
    move v5, v7

    const/4 v12, 0x0

    .line 195
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/i2;->s(Ljava/lang/Object;IIII)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 196
    invoke-static {v1, v10, v11}, Lcom/google/android/gms/internal/play_billing/C2;->f(Ljava/lang/Object;J)D

    move-result-wide v10

    .line 197
    invoke-interface {v6, v13, v10, v11}, Lcom/google/android/gms/internal/play_billing/G2;->b(ID)V

    :cond_5
    :goto_6
    add-int/lit8 v2, v2, 0x3

    const v10, 0xfffff

    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 198
    :cond_6
    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/J1;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 199
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/play_billing/w2;->k(Lcom/google/android/gms/internal/play_billing/G2;)V

    return-void

    :cond_7
    const/16 v16, 0x0

    .line 200
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    throw v16

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/i2;->u(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/play_billing/J1;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 16
    .line 17
    const v2, 0x7fffffff

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/J1;->A(I)V

    .line 21
    .line 22
    .line 23
    iput v1, v0, Lcom/google/android/gms/internal/play_billing/a1;->zza:I

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J1;->y()V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 29
    .line 30
    :goto_0
    array-length v2, v0

    .line 31
    if-ge v1, v2, :cond_5

    .line 32
    .line 33
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const v3, 0xfffff

    .line 38
    .line 39
    .line 40
    and-int/2addr v3, v2

    .line 41
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    int-to-long v3, v3

    .line 46
    const/16 v5, 0x9

    .line 47
    .line 48
    if-eq v2, v5, :cond_3

    .line 49
    .line 50
    const/16 v5, 0x3c

    .line 51
    .line 52
    if-eq v2, v5, :cond_2

    .line 53
    .line 54
    const/16 v5, 0x44

    .line 55
    .line 56
    if-eq v2, v5, :cond_2

    .line 57
    .line 58
    packed-switch v2, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 63
    .line 64
    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    move-object v6, v5

    .line 71
    check-cast v6, Lcom/google/android/gms/internal/play_billing/Z1;

    .line 72
    .line 73
    invoke-virtual {v6}, Lcom/google/android/gms/internal/play_billing/Z1;->e()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_1
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lcom/google/android/gms/internal/play_billing/O1;

    .line 85
    .line 86
    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/O1;->j()V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    aget v2, v0, v1

    .line 91
    .line 92
    invoke-direct {p0, p1, v2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    sget-object v5, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 103
    .line 104
    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/play_billing/p2;->e(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    :pswitch_2
    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v5, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    .line 123
    .line 124
    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/play_billing/p2;->e(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x3

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->j:Lcom/google/android/gms/internal/play_billing/v2;

    .line 135
    .line 136
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/v2;->b(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->k:Lcom/google/android/gms/internal/play_billing/A1;

    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/A1;->a(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_2
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/i2;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v0, v2, :cond_4

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const v3, 0xfffff

    .line 18
    .line 19
    .line 20
    and-int/2addr v3, v2

    .line 21
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    aget v1, v1, v0

    .line 26
    .line 27
    int-to-long v3, v3

    .line 28
    packed-switch v2, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :pswitch_0
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->k(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :pswitch_1
    invoke-direct {p0, p2, v1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/C2;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->n(Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :pswitch_2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->k(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :pswitch_3
    invoke-direct {p0, p2, v1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->v(Ljava/lang/Object;II)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/C2;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->n(Ljava/lang/Object;II)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :pswitch_4
    sget v1, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    .line 80
    .line 81
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/a2;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :pswitch_5
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lcom/google/android/gms/internal/play_billing/O1;

    .line 103
    .line 104
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Lcom/google/android/gms/internal/play_billing/O1;

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-lez v5, :cond_1

    .line 119
    .line 120
    if-lez v6, :cond_1

    .line 121
    .line 122
    invoke-interface {v1}, Lcom/google/android/gms/internal/play_billing/O1;->k()Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_0

    .line 127
    .line 128
    add-int/2addr v6, v5

    .line 129
    invoke-interface {v1, v6}, Lcom/google/android/gms/internal/play_billing/O1;->a(I)Lcom/google/android/gms/internal/play_billing/O1;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    :cond_0
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 134
    .line 135
    .line 136
    :cond_1
    if-gtz v5, :cond_2

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    move-object v2, v1

    .line 140
    :goto_1
    invoke-static {p1, v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/C2;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_2

    .line 144
    .line 145
    :pswitch_6
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->j(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    :pswitch_7
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_3

    .line 155
    .line 156
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/C2;->w(Ljava/lang/Object;JJ)V

    .line 161
    .line 162
    .line 163
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :pswitch_8
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_3

    .line 173
    .line 174
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->v(Ljava/lang/Object;JI)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :pswitch_9
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_3

    .line 191
    .line 192
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 193
    .line 194
    .line 195
    move-result-wide v1

    .line 196
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/C2;->w(Ljava/lang/Object;JJ)V

    .line 197
    .line 198
    .line 199
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :pswitch_a
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_3

    .line 209
    .line 210
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->v(Ljava/lang/Object;JI)V

    .line 215
    .line 216
    .line 217
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_2

    .line 221
    .line 222
    :pswitch_b
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_3

    .line 227
    .line 228
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->v(Ljava/lang/Object;JI)V

    .line 233
    .line 234
    .line 235
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_2

    .line 239
    .line 240
    :pswitch_c
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_3

    .line 245
    .line 246
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->v(Ljava/lang/Object;JI)V

    .line 251
    .line 252
    .line 253
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_2

    .line 257
    .line 258
    :pswitch_d
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_3

    .line 263
    .line 264
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_2

    .line 275
    .line 276
    :pswitch_e
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->j(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_2

    .line 280
    .line 281
    :pswitch_f
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_3

    .line 286
    .line 287
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_2

    .line 298
    .line 299
    :pswitch_10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_3

    .line 304
    .line 305
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->B(Ljava/lang/Object;J)Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->r(Ljava/lang/Object;JZ)V

    .line 310
    .line 311
    .line 312
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_2

    .line 316
    .line 317
    :pswitch_11
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_3

    .line 322
    .line 323
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->v(Ljava/lang/Object;JI)V

    .line 328
    .line 329
    .line 330
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 331
    .line 332
    .line 333
    goto :goto_2

    .line 334
    :pswitch_12
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_3

    .line 339
    .line 340
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 341
    .line 342
    .line 343
    move-result-wide v1

    .line 344
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/C2;->w(Ljava/lang/Object;JJ)V

    .line 345
    .line 346
    .line 347
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 348
    .line 349
    .line 350
    goto :goto_2

    .line 351
    :pswitch_13
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eqz v1, :cond_3

    .line 356
    .line 357
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->v(Ljava/lang/Object;JI)V

    .line 362
    .line 363
    .line 364
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 365
    .line 366
    .line 367
    goto :goto_2

    .line 368
    :pswitch_14
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_3

    .line 373
    .line 374
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 375
    .line 376
    .line 377
    move-result-wide v1

    .line 378
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/C2;->w(Ljava/lang/Object;JJ)V

    .line 379
    .line 380
    .line 381
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 382
    .line 383
    .line 384
    goto :goto_2

    .line 385
    :pswitch_15
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_3

    .line 390
    .line 391
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 392
    .line 393
    .line 394
    move-result-wide v1

    .line 395
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/C2;->w(Ljava/lang/Object;JJ)V

    .line 396
    .line 397
    .line 398
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 399
    .line 400
    .line 401
    goto :goto_2

    .line 402
    :pswitch_16
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    if-eqz v1, :cond_3

    .line 407
    .line 408
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->g(Ljava/lang/Object;J)F

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    invoke-static {p1, v3, v4, v1}, Lcom/google/android/gms/internal/play_billing/C2;->u(Ljava/lang/Object;JF)V

    .line 413
    .line 414
    .line 415
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 416
    .line 417
    .line 418
    goto :goto_2

    .line 419
    :pswitch_17
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/i2;->r(Ljava/lang/Object;I)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_3

    .line 424
    .line 425
    invoke-static {p2, v3, v4}, Lcom/google/android/gms/internal/play_billing/C2;->f(Ljava/lang/Object;J)D

    .line 426
    .line 427
    .line 428
    move-result-wide v1

    .line 429
    invoke-static {p1, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/C2;->t(Ljava/lang/Object;JD)V

    .line 430
    .line 431
    .line 432
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/i2;->l(Ljava/lang/Object;I)V

    .line 433
    .line 434
    .line 435
    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x3

    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->j:Lcom/google/android/gms/internal/play_billing/v2;

    .line 440
    .line 441
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/r2;->u(Lcom/google/android/gms/internal/play_billing/v2;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    .line 445
    .line 446
    if-eqz v0, :cond_5

    .line 447
    .line 448
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->k:Lcom/google/android/gms/internal/play_billing/A1;

    .line 449
    .line 450
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/r2;->t(Lcom/google/android/gms/internal/play_billing/A1;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_5
    return-void

    .line 454
    nop

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge v1, v2, :cond_2

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const v3, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int v4, v2, v3

    .line 16
    .line 17
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-long v4, v4

    .line 22
    packed-switch v2, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :pswitch_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/i2;->E(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    and-int/2addr v2, v3

    .line 32
    int-to-long v2, v2

    .line 33
    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-ne v6, v2, :cond_1

    .line 42
    .line 43
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/r2;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :pswitch_1
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/r2;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    goto :goto_1

    .line 72
    :pswitch_2
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/r2;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    :goto_1
    if-nez v2, :cond_0

    .line 85
    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :pswitch_3
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/r2;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    goto/16 :goto_2

    .line 109
    .line 110
    :pswitch_4
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_1

    .line 115
    .line 116
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    cmp-long v2, v2, v4

    .line 125
    .line 126
    if-nez v2, :cond_1

    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :pswitch_5
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_1

    .line 135
    .line 136
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-ne v2, v3, :cond_1

    .line 145
    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :pswitch_6
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_1

    .line 153
    .line 154
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v4

    .line 162
    cmp-long v2, v2, v4

    .line 163
    .line 164
    if-nez v2, :cond_1

    .line 165
    .line 166
    goto/16 :goto_2

    .line 167
    .line 168
    :pswitch_7
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_1

    .line 173
    .line 174
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-ne v2, v3, :cond_1

    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :pswitch_8
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_1

    .line 191
    .line 192
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-ne v2, v3, :cond_1

    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :pswitch_9
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_1

    .line 209
    .line 210
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-ne v2, v3, :cond_1

    .line 219
    .line 220
    goto/16 :goto_2

    .line 221
    .line 222
    :pswitch_a
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_1

    .line 227
    .line 228
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/r2;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_1

    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :pswitch_b
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_1

    .line 249
    .line 250
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/r2;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-eqz v2, :cond_1

    .line 263
    .line 264
    goto/16 :goto_2

    .line 265
    .line 266
    :pswitch_c
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_1

    .line 271
    .line 272
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/r2;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_1

    .line 285
    .line 286
    goto/16 :goto_2

    .line 287
    .line 288
    :pswitch_d
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v2, :cond_1

    .line 293
    .line 294
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->B(Ljava/lang/Object;J)Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->B(Ljava/lang/Object;J)Z

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    if-ne v2, v3, :cond_1

    .line 303
    .line 304
    goto/16 :goto_2

    .line 305
    .line 306
    :pswitch_e
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-eqz v2, :cond_1

    .line 311
    .line 312
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-ne v2, v3, :cond_1

    .line 321
    .line 322
    goto/16 :goto_2

    .line 323
    .line 324
    :pswitch_f
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-eqz v2, :cond_1

    .line 329
    .line 330
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 331
    .line 332
    .line 333
    move-result-wide v2

    .line 334
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 335
    .line 336
    .line 337
    move-result-wide v4

    .line 338
    cmp-long v2, v2, v4

    .line 339
    .line 340
    if-nez v2, :cond_1

    .line 341
    .line 342
    goto :goto_2

    .line 343
    :pswitch_10
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-eqz v2, :cond_1

    .line 348
    .line 349
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->h(Ljava/lang/Object;J)I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-ne v2, v3, :cond_1

    .line 358
    .line 359
    goto :goto_2

    .line 360
    :pswitch_11
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-eqz v2, :cond_1

    .line 365
    .line 366
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 367
    .line 368
    .line 369
    move-result-wide v2

    .line 370
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 371
    .line 372
    .line 373
    move-result-wide v4

    .line 374
    cmp-long v2, v2, v4

    .line 375
    .line 376
    if-nez v2, :cond_1

    .line 377
    .line 378
    goto :goto_2

    .line 379
    :pswitch_12
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-eqz v2, :cond_1

    .line 384
    .line 385
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 386
    .line 387
    .line 388
    move-result-wide v2

    .line 389
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->i(Ljava/lang/Object;J)J

    .line 390
    .line 391
    .line 392
    move-result-wide v4

    .line 393
    cmp-long v2, v2, v4

    .line 394
    .line 395
    if-nez v2, :cond_1

    .line 396
    .line 397
    goto :goto_2

    .line 398
    :pswitch_13
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    if-eqz v2, :cond_1

    .line 403
    .line 404
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->g(Ljava/lang/Object;J)F

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->g(Ljava/lang/Object;J)F

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-ne v2, v3, :cond_1

    .line 421
    .line 422
    goto :goto_2

    .line 423
    :pswitch_14
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/i2;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-eqz v2, :cond_1

    .line 428
    .line 429
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->f(Ljava/lang/Object;J)D

    .line 430
    .line 431
    .line 432
    move-result-wide v2

    .line 433
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 434
    .line 435
    .line 436
    move-result-wide v2

    .line 437
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/C2;->f(Ljava/lang/Object;J)D

    .line 438
    .line 439
    .line 440
    move-result-wide v4

    .line 441
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 442
    .line 443
    .line 444
    move-result-wide v4

    .line 445
    cmp-long v2, v2, v4

    .line 446
    .line 447
    if-nez v2, :cond_1

    .line 448
    .line 449
    :cond_0
    :goto_2
    add-int/lit8 v1, v1, 0x3

    .line 450
    .line 451
    goto/16 :goto_0

    .line 452
    .line 453
    :cond_1
    :goto_3
    return v0

    .line 454
    :cond_2
    move-object v1, p1

    .line 455
    check-cast v1, Lcom/google/android/gms/internal/play_billing/J1;

    .line 456
    .line 457
    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 458
    .line 459
    check-cast p2, Lcom/google/android/gms/internal/play_billing/J1;

    .line 460
    .line 461
    iget-object p2, p2, Lcom/google/android/gms/internal/play_billing/J1;->zzc:Lcom/google/android/gms/internal/play_billing/w2;

    .line 462
    .line 463
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result p2

    .line 467
    if-nez p2, :cond_3

    .line 468
    .line 469
    return v0

    .line 470
    :cond_3
    iget-boolean p2, p0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    .line 471
    .line 472
    if-nez p2, :cond_4

    .line 473
    .line 474
    const/4 p1, 0x1

    .line 475
    return p1

    .line 476
    :cond_4
    invoke-static {p1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    const/4 p1, 0x0

    .line 480
    throw p1

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;[BIILcom/google/android/gms/internal/play_billing/d1;)V
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move-object v6, p5

    .line 8
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/i2;->y(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/play_billing/d1;)I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final m()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i2;->e:Lcom/google/android/gms/internal/play_billing/f2;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/play_billing/J1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J1;->r()Lcom/google/android/gms/internal/play_billing/J1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method final y(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/play_billing/d1;)I
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    .line 1
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/i2;->i(Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/gms/internal/play_billing/i2;->m:Lsun/misc/Unsafe;

    const/4 v11, 0x0

    const/4 v12, -0x1

    move/from16 v5, p3

    move v8, v11

    move v14, v8

    move v15, v14

    move v7, v12

    const v9, 0xfffff

    :goto_0
    const/16 v16, 0x0

    if-ge v5, v4, :cond_71

    add-int/lit8 v15, v5, 0x1

    .line 2
    aget-byte v5, v3, v5

    if-gez v5, :cond_0

    .line 3
    invoke-static {v5, v3, v15, v6}, Lcom/google/android/gms/internal/play_billing/e1;->j(I[BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v15

    iget v5, v6, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    :cond_0
    move v6, v15

    move v15, v5

    ushr-int/lit8 v5, v15, 0x3

    const v17, 0xfffff

    const/4 v13, 0x3

    if-le v5, v7, :cond_1

    div-int/2addr v8, v13

    iget v7, v0, Lcom/google/android/gms/internal/play_billing/i2;->c:I

    if-lt v5, v7, :cond_2

    iget v7, v0, Lcom/google/android/gms/internal/play_billing/i2;->d:I

    if-gt v5, v7, :cond_2

    .line 4
    invoke-direct {v0, v5, v8}, Lcom/google/android/gms/internal/play_billing/i2;->F(II)I

    move-result v7

    goto :goto_1

    .line 5
    :cond_1
    iget v7, v0, Lcom/google/android/gms/internal/play_billing/i2;->c:I

    if-lt v5, v7, :cond_2

    iget v7, v0, Lcom/google/android/gms/internal/play_billing/i2;->d:I

    if-gt v5, v7, :cond_2

    .line 6
    invoke-direct {v0, v5, v11}, Lcom/google/android/gms/internal/play_billing/i2;->F(II)I

    move-result v7

    goto :goto_1

    :cond_2
    move v7, v12

    :goto_1
    if-ne v7, v12, :cond_3

    move/from16 v12, p5

    move-object v10, v1

    move v7, v5

    move v5, v6

    move/from16 v20, v9

    move v8, v11

    move v9, v15

    move-object/from16 v6, p6

    move-object v11, v2

    goto/16 :goto_3b

    :cond_3
    and-int/lit8 v8, v15, 0x7

    .line 7
    iget-object v11, v0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    add-int/lit8 v18, v7, 0x1

    .line 8
    aget v12, v11, v18

    invoke-static {v12}, Lcom/google/android/gms/internal/play_billing/i2;->G(I)I

    move-result v13

    and-int v3, v12, v17

    int-to-long v3, v3

    move-wide/from16 v19, v3

    const-wide/16 v21, 0x0

    const/high16 v18, 0x20000000

    const-string v4, ""

    const-string v3, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    move/from16 v24, v5

    const/16 v25, 0x1

    const/16 v5, 0x11

    if-gt v13, v5, :cond_15

    add-int/lit8 v5, v7, 0x2

    .line 9
    aget v5, v11, v5

    ushr-int/lit8 v11, v5, 0x14

    shl-int v11, v25, v11

    and-int v5, v5, v17

    move/from16 v23, v6

    if-eq v5, v9, :cond_6

    move/from16 v6, v17

    move/from16 v27, v7

    if-eq v9, v6, :cond_4

    int-to-long v6, v9

    .line 10
    invoke-virtual {v1, v2, v6, v7, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v6, 0xfffff

    :cond_4
    if-ne v5, v6, :cond_5

    const/4 v6, 0x0

    goto :goto_2

    :cond_5
    int-to-long v6, v5

    .line 11
    invoke-virtual {v1, v2, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    :goto_2
    move v14, v5

    goto :goto_3

    :cond_6
    move/from16 v27, v7

    move v6, v14

    move v14, v9

    :goto_3
    packed-switch v13, :pswitch_data_0

    const/4 v5, 0x3

    if-ne v8, v5, :cond_7

    or-int/2addr v11, v6

    move/from16 v12, v27

    .line 12
    invoke-direct {v0, v2, v12}, Lcom/google/android/gms/internal/play_billing/i2;->M(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    shl-int/lit8 v4, v24, 0x3

    or-int/lit8 v8, v4, 0x4

    .line 13
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v4

    move-object/from16 v5, p2

    move/from16 v7, p4

    move-object/from16 v9, p6

    move v13, v12

    move/from16 v6, v23

    .line 14
    invoke-static/range {v3 .. v9}, Lcom/google/android/gms/internal/play_billing/e1;->m(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;[BIIILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v4

    move-object v7, v5

    .line 15
    invoke-direct {v0, v2, v13, v3}, Lcom/google/android/gms/internal/play_billing/i2;->o(Ljava/lang/Object;ILjava/lang/Object;)V

    move v5, v4

    move-object v3, v7

    move-object v6, v9

    move v8, v13

    move v9, v14

    move/from16 v7, v24

    const/4 v12, -0x1

    move/from16 v4, p4

    move v14, v11

    const/4 v11, 0x0

    goto/16 :goto_0

    :cond_7
    move-object/from16 v7, p2

    move-object/from16 v11, p6

    move-object v5, v1

    move-object v1, v2

    move/from16 p3, v6

    move/from16 v2, v23

    goto/16 :goto_14

    :pswitch_0
    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 v4, v23

    move/from16 v13, v27

    if-nez v8, :cond_8

    or-int v8, v6, v11

    .line 16
    invoke-static {v7, v4, v9}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v11

    iget-wide v3, v9, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    .line 17
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/r1;->b(J)J

    move-result-wide v5

    move-wide/from16 v3, v19

    .line 18
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v28, v2

    move-object v2, v1

    move-object/from16 v1, v28

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move/from16 v4, p4

    move-object v3, v7

    move-object v6, v9

    move v5, v11

    :goto_4
    move v9, v14

    move/from16 v7, v24

    const/4 v11, 0x0

    const/4 v12, -0x1

    move v14, v8

    move v8, v13

    goto/16 :goto_0

    :cond_8
    move-object/from16 v28, v2

    move-object v2, v1

    move-object/from16 v1, v28

    move-object v5, v2

    move v2, v4

    move/from16 p3, v6

    :goto_5
    move-object v11, v9

    :goto_6
    move/from16 v27, v13

    goto/16 :goto_14

    :pswitch_1
    move-object/from16 p3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v4, v23

    move/from16 v13, v27

    if-nez v8, :cond_9

    or-int v3, p3, v11

    .line 19
    invoke-static {v7, v4, v9}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v4

    iget v8, v9, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    .line 20
    invoke-static {v8}, Lcom/google/android/gms/internal/play_billing/r1;->a(I)I

    move-result v8

    .line 21
    invoke-virtual {v2, v1, v5, v6, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_7
    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    move v5, v4

    move-object v6, v9

    move v8, v13

    move v9, v14

    const/4 v11, 0x0

    const/4 v12, -0x1

    move/from16 v4, p4

    move v14, v3

    move-object v3, v7

    move/from16 v7, v24

    goto/16 :goto_0

    :cond_9
    move-object v5, v2

    move v2, v4

    goto :goto_5

    :pswitch_2
    move-object/from16 p3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v4, v23

    move/from16 v13, v27

    if-nez v8, :cond_9

    .line 22
    invoke-static {v7, v4, v9}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    iget v4, v9, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    .line 23
    invoke-direct {v0, v13}, Lcom/google/android/gms/internal/play_billing/i2;->J(I)Lcom/google/android/gms/internal/play_billing/M1;

    move-result-object v8

    const/high16 v16, -0x80000000

    and-int v12, v12, v16

    if-eqz v12, :cond_b

    if-eqz v8, :cond_b

    invoke-interface {v8, v4}, Lcom/google/android/gms/internal/play_billing/M1;->a(I)Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_8

    .line 24
    :cond_a
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/i2;->z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/w2;

    move-result-object v5

    int-to-long v11, v4

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v5, v15, v4}, Lcom/google/android/gms/internal/play_billing/w2;->j(ILjava/lang/Object;)V

    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move/from16 v4, p4

    move v5, v3

    move-object v3, v7

    move-object v6, v9

    move v8, v13

    move v9, v14

    move/from16 v7, v24

    const/4 v11, 0x0

    const/4 v12, -0x1

    move/from16 v14, p3

    goto/16 :goto_0

    :cond_b
    :goto_8
    or-int v8, p3, v11

    .line 25
    invoke-virtual {v2, v1, v5, v6, v4}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move/from16 v4, p4

    move v5, v3

    move-object v3, v7

    move-object v6, v9

    goto/16 :goto_4

    :pswitch_3
    move-object/from16 p3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v4, v23

    move/from16 v13, v27

    const/4 v3, 0x2

    if-ne v8, v3, :cond_9

    or-int v3, p3, v11

    .line 26
    invoke-static {v7, v4, v9}, Lcom/google/android/gms/internal/play_billing/e1;->a([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v4

    iget-object v8, v9, Lcom/google/android/gms/internal/play_billing/d1;->c:Ljava/lang/Object;

    .line 27
    invoke-virtual {v2, v1, v5, v6, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_4
    move-object/from16 p3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    move-object/from16 v7, p2

    move-object/from16 v9, p6

    move/from16 p3, v6

    move/from16 v4, v23

    move/from16 v13, v27

    const/4 v3, 0x2

    if-ne v8, v3, :cond_c

    or-int v8, p3, v11

    move-object v3, v1

    .line 28
    invoke-direct {v0, v3, v13}, Lcom/google/android/gms/internal/play_billing/i2;->M(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v2

    .line 29
    invoke-direct {v0, v13}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v2

    move-object v6, v7

    move-object v7, v3

    move-object v3, v6

    move-object v6, v9

    move-object v9, v5

    move/from16 v5, p4

    .line 30
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e1;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;[BIILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    move-object/from16 v28, v3

    move-object v3, v1

    move-object/from16 v1, v28

    .line 31
    invoke-direct {v0, v7, v13, v3}, Lcom/google/android/gms/internal/play_billing/i2;->o(Ljava/lang/Object;ILjava/lang/Object;)V

    move/from16 v4, p4

    move-object/from16 v6, p6

    move-object v3, v1

    move v5, v2

    move-object v2, v7

    move-object v1, v9

    goto/16 :goto_4

    :cond_c
    move-object v9, v7

    move-object v7, v1

    move-object v1, v9

    move-object v9, v2

    move v2, v4

    move-object v5, v7

    move-object v7, v1

    move-object v1, v5

    move-object/from16 v11, p6

    move-object v5, v9

    goto/16 :goto_6

    :pswitch_5
    move-object v9, v1

    move-object v7, v2

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v2, v23

    const/4 v13, 0x2

    move-object/from16 v1, p2

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v13, :cond_10

    and-int v8, v12, v18

    if-eqz v8, :cond_d

    or-int v3, p3, v19

    .line 32
    invoke-static {v1, v2, v11}, Lcom/google/android/gms/internal/play_billing/e1;->g([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    goto :goto_9

    .line 33
    :cond_d
    invoke-static {v1, v2, v11}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v8, v11, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ltz v8, :cond_f

    or-int v3, p3, v19

    if-nez v8, :cond_e

    .line 34
    iput-object v4, v11, Lcom/google/android/gms/internal/play_billing/d1;->c:Ljava/lang/Object;

    goto :goto_9

    :cond_e
    new-instance v4, Ljava/lang/String;

    .line 35
    sget-object v12, Lcom/google/android/gms/internal/play_billing/P1;->a:Ljava/nio/charset/Charset;

    invoke-direct {v4, v1, v2, v8, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v4, v11, Lcom/google/android/gms/internal/play_billing/d1;->c:Ljava/lang/Object;

    add-int/2addr v2, v8

    .line 36
    :goto_9
    iget-object v4, v11, Lcom/google/android/gms/internal/play_billing/d1;->c:Ljava/lang/Object;

    .line 37
    invoke-virtual {v9, v7, v5, v6, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_a
    move v4, v3

    move-object v3, v1

    move-object v1, v9

    move v9, v14

    move v14, v4

    move/from16 v4, p4

    move v5, v2

    move-object v2, v7

    :goto_b
    move-object v6, v11

    :goto_c
    move/from16 v7, v24

    :goto_d
    move/from16 v8, v27

    :goto_e
    const/4 v11, 0x0

    :goto_f
    const/4 v12, -0x1

    goto/16 :goto_0

    .line 38
    :cond_f
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 39
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 40
    throw v1

    :cond_10
    move-object v5, v7

    move-object v7, v1

    move-object v1, v5

    :cond_11
    :goto_10
    move-object v5, v9

    goto/16 :goto_14

    :pswitch_6
    move-object v9, v1

    move-object v7, v2

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v2, v23

    move-object/from16 v1, p2

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-nez v8, :cond_10

    or-int v3, p3, v19

    .line 41
    invoke-static {v1, v2, v11}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget-wide v12, v11, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    cmp-long v4, v12, v21

    if-eqz v4, :cond_12

    move/from16 v4, v25

    goto :goto_11

    :cond_12
    const/4 v4, 0x0

    .line 42
    :goto_11
    invoke-static {v7, v5, v6, v4}, Lcom/google/android/gms/internal/play_billing/C2;->r(Ljava/lang/Object;JZ)V

    goto :goto_a

    :pswitch_7
    move-object v9, v1

    move-object v7, v2

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v2, v23

    const/4 v3, 0x5

    move-object/from16 v1, p2

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v3, :cond_10

    add-int/lit8 v3, v2, 0x4

    or-int v4, p3, v19

    .line 43
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/e1;->b([BI)I

    move-result v2

    invoke-virtual {v9, v7, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v5, v3

    move-object v2, v7

    move-object v6, v11

    move/from16 v7, v24

    move/from16 v8, v27

    const/4 v11, 0x0

    const/4 v12, -0x1

    move-object v3, v1

    move-object v1, v9

    move v9, v14

    move v14, v4

    move/from16 v4, p4

    goto/16 :goto_0

    :pswitch_8
    move-object v9, v1

    move-object v7, v2

    move/from16 p3, v6

    move-wide/from16 v5, v19

    move/from16 v2, v23

    move/from16 v3, v25

    move-object/from16 v1, p2

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v3, :cond_13

    add-int/lit8 v8, v2, 0x8

    or-int v12, p3, v19

    move-wide v3, v5

    .line 44
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/e1;->o([BI)J

    move-result-wide v5

    move-object v2, v7

    move-object v7, v1

    move-object v1, v9

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v4, p4

    move-object v3, v7

    move v5, v8

    move-object v6, v11

    move v9, v14

    move/from16 v7, v24

    move/from16 v8, v27

    const/4 v11, 0x0

    move v14, v12

    goto/16 :goto_f

    :cond_13
    move-object/from16 v28, v7

    move-object v7, v1

    move-object/from16 v1, v28

    goto/16 :goto_10

    :pswitch_9
    move-object/from16 v7, p2

    move-object v9, v1

    move-object v1, v2

    move/from16 p3, v6

    move-wide/from16 v3, v19

    move/from16 v2, v23

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-nez v8, :cond_11

    or-int v5, p3, v19

    .line 45
    invoke-static {v7, v2, v11}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v6, v11, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    .line 46
    invoke-virtual {v9, v1, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v3, v2

    move-object v2, v1

    move-object v1, v9

    move v9, v14

    move v14, v5

    move v5, v3

    move/from16 v4, p4

    move-object v3, v7

    goto/16 :goto_b

    :pswitch_a
    move-object/from16 v7, p2

    move-object v9, v1

    move-object v1, v2

    move/from16 p3, v6

    move-wide/from16 v3, v19

    move/from16 v2, v23

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-nez v8, :cond_11

    or-int v8, p3, v19

    .line 47
    invoke-static {v7, v2, v11}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v12

    iget-wide v5, v11, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    move-object v2, v1

    move-object v1, v9

    .line 48
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v4, p4

    move-object v3, v7

    move-object v6, v11

    move v5, v12

    :goto_12
    move v9, v14

    move/from16 v7, v24

    const/4 v11, 0x0

    const/4 v12, -0x1

    move v14, v8

    move/from16 v8, v27

    goto/16 :goto_0

    :pswitch_b
    move-object/from16 v7, p2

    move-object v5, v1

    move-object v1, v2

    move/from16 p3, v6

    move-wide/from16 v3, v19

    move/from16 v2, v23

    const/4 v6, 0x5

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v6, :cond_14

    add-int/lit8 v6, v2, 0x4

    or-int v8, p3, v19

    .line 49
    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/e1;->b([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 50
    invoke-static {v1, v3, v4, v2}, Lcom/google/android/gms/internal/play_billing/C2;->u(Ljava/lang/Object;JF)V

    :goto_13
    move/from16 v4, p4

    move-object v2, v1

    move-object v1, v5

    move v5, v6

    move-object v3, v7

    move-object v6, v11

    goto :goto_12

    :pswitch_c
    move-object/from16 v7, p2

    move-object v5, v1

    move-object v1, v2

    move/from16 p3, v6

    move-wide/from16 v3, v19

    move/from16 v2, v23

    move/from16 v6, v25

    move/from16 v19, v11

    move-object/from16 v11, p6

    if-ne v8, v6, :cond_14

    add-int/lit8 v6, v2, 0x8

    or-int v8, p3, v19

    .line 51
    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/e1;->o([BI)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v12

    .line 52
    invoke-static {v1, v3, v4, v12, v13}, Lcom/google/android/gms/internal/play_billing/C2;->t(Ljava/lang/Object;JD)V

    goto :goto_13

    :cond_14
    :goto_14
    move/from16 v12, p5

    move-object v10, v5

    move-object v3, v7

    move-object v6, v11

    move/from16 v20, v14

    move v9, v15

    move/from16 v7, v24

    move/from16 v8, v27

    move/from16 v14, p3

    move-object v11, v1

    move v5, v2

    goto/16 :goto_3b

    :cond_15
    move-object v5, v1

    move-object v1, v2

    move/from16 v27, v6

    move v6, v7

    move/from16 v23, v14

    move-object/from16 v7, p2

    move-object/from16 v28, v11

    move-object/from16 v11, p6

    move-wide/from16 v29, v19

    move-object/from16 v19, v28

    move/from16 v20, v15

    move-wide/from16 v14, v29

    const/16 v2, 0x1b

    if-ne v13, v2, :cond_19

    const/4 v2, 0x2

    if-ne v8, v2, :cond_18

    .line 53
    invoke-virtual {v5, v1, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/play_billing/O1;

    .line 54
    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/O1;->k()Z

    move-result v3

    if-nez v3, :cond_17

    .line 55
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_16

    const/16 v3, 0xa

    goto :goto_15

    :cond_16
    add-int/2addr v3, v3

    .line 56
    :goto_15
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/play_billing/O1;->a(I)Lcom/google/android/gms/internal/play_billing/O1;

    move-result-object v2

    .line 57
    invoke-virtual {v5, v1, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 58
    :cond_17
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v1

    move-object v8, v5

    move-object v3, v7

    move-object v7, v11

    move/from16 v4, v27

    move-object/from16 v11, p1

    move/from16 v5, p4

    move/from16 v27, v6

    move-object v6, v2

    move/from16 v2, v20

    .line 59
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/e1;->e(Lcom/google/android/gms/internal/play_billing/p2;I[BIILcom/google/android/gms/internal/play_billing/O1;Lcom/google/android/gms/internal/play_billing/d1;)I

    move-result v1

    move v7, v2

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    move v5, v1

    move v15, v7

    move-object v1, v8

    move-object v2, v11

    move/from16 v14, v23

    goto/16 :goto_c

    :cond_18
    move-object v11, v1

    move/from16 v2, v27

    move/from16 v3, v20

    move/from16 v20, v9

    move v9, v3

    move-object/from16 v7, p2

    move v10, v2

    move-object v3, v5

    move/from16 v5, v24

    goto/16 :goto_2f

    :cond_19
    move-object v11, v1

    move-object v1, v5

    move v5, v6

    move/from16 v7, v20

    move/from16 v2, v27

    const/16 v6, 0x31

    const-string v2, "Protocol message had invalid UTF-8."

    if-gt v13, v6, :cond_5f

    move/from16 v20, v9

    int-to-long v9, v12

    .line 60
    invoke-virtual {v1, v11, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/play_billing/O1;

    .line 61
    invoke-interface {v6}, Lcom/google/android/gms/internal/play_billing/O1;->k()Z

    move-result v12

    if-nez v12, :cond_1a

    .line 62
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v12

    add-int/2addr v12, v12

    .line 63
    invoke-interface {v6, v12}, Lcom/google/android/gms/internal/play_billing/O1;->a(I)Lcom/google/android/gms/internal/play_billing/O1;

    move-result-object v6

    .line 64
    invoke-virtual {v1, v11, v14, v15, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1a
    move-object v12, v6

    const-string v6, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    packed-switch v13, :pswitch_data_1

    const/4 v13, 0x3

    if-ne v8, v13, :cond_1c

    and-int/lit8 v2, v7, -0x8

    or-int/lit8 v2, v2, 0x4

    move-object v9, v1

    .line 65
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v1

    move/from16 v4, p4

    move-object/from16 v6, p6

    move v15, v5

    move-object v13, v9

    move/from16 v14, v24

    move/from16 v3, v27

    move v5, v2

    move-object/from16 v2, p2

    .line 66
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e1;->c(Lcom/google/android/gms/internal/play_billing/p2;[BIIILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v8

    move v9, v3

    iget-object v3, v6, Lcom/google/android/gms/internal/play_billing/d1;->c:Ljava/lang/Object;

    .line 67
    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_16
    if-ge v8, v4, :cond_1b

    .line 68
    invoke-static {v2, v8, v6}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    iget v10, v6, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ne v7, v10, :cond_1b

    .line 69
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e1;->c(Lcom/google/android/gms/internal/play_billing/p2;[BIIILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v8

    move-object v3, v1

    move-object v1, v6

    iget-object v6, v1, Lcom/google/android/gms/internal/play_billing/d1;->c:Ljava/lang/Object;

    .line 70
    invoke-interface {v12, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v6, v1

    move-object v1, v3

    goto :goto_16

    :cond_1b
    move-object v1, v6

    move v5, v8

    :goto_17
    move v10, v9

    move-object/from16 v18, v13

    move/from16 v19, v15

    move v9, v7

    move-object v7, v2

    goto/16 :goto_2e

    :cond_1c
    move/from16 v4, p4

    move/from16 v14, v24

    move-object/from16 v18, v1

    move/from16 v19, v5

    move v9, v7

    move/from16 v10, v27

    move-object/from16 v7, p2

    move-object/from16 v1, p6

    goto/16 :goto_2d

    :pswitch_d
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object v13, v1

    move v15, v5

    move/from16 v14, v24

    move/from16 v9, v27

    const/4 v3, 0x2

    move-object/from16 v1, p6

    if-ne v8, v3, :cond_20

    .line 71
    sget v3, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 72
    invoke-static {v12}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 73
    invoke-static {v2, v9, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    iget v5, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    add-int/2addr v5, v3

    if-lt v3, v5, :cond_1f

    if-ne v3, v5, :cond_1e

    :cond_1d
    :goto_18
    move v5, v3

    goto :goto_17

    .line 74
    :cond_1e
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 75
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 76
    throw v1

    .line 77
    :cond_1f
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    iget-wide v1, v1, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    .line 78
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/r1;->b(J)J

    throw v16

    :cond_20
    if-eqz v8, :cond_22

    :cond_21
    move v10, v9

    move-object/from16 v18, v13

    :goto_19
    move/from16 v19, v15

    move v9, v7

    move-object v7, v2

    goto/16 :goto_2d

    .line 79
    :cond_22
    sget v3, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 80
    invoke-static {v12}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 81
    invoke-static {v2, v9, v1}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    iget-wide v1, v1, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    .line 82
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/r1;->b(J)J

    throw v16

    :pswitch_e
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object v13, v1

    move v15, v5

    move/from16 v14, v24

    move/from16 v9, v27

    const/4 v3, 0x2

    move-object/from16 v1, p6

    if-ne v8, v3, :cond_25

    .line 83
    sget v3, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 84
    check-cast v12, Lcom/google/android/gms/internal/play_billing/K1;

    .line 85
    invoke-static {v2, v9, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    iget v5, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    add-int/2addr v5, v3

    :goto_1a
    if-ge v3, v5, :cond_23

    .line 86
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    iget v8, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    .line 87
    invoke-static {v8}, Lcom/google/android/gms/internal/play_billing/r1;->a(I)I

    move-result v8

    invoke-virtual {v12, v8}, Lcom/google/android/gms/internal/play_billing/K1;->e(I)V

    goto :goto_1a

    :cond_23
    if-ne v3, v5, :cond_24

    goto :goto_18

    .line 88
    :cond_24
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 89
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 90
    throw v1

    :cond_25
    if-nez v8, :cond_21

    .line 91
    sget v3, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 92
    check-cast v12, Lcom/google/android/gms/internal/play_billing/K1;

    .line 93
    invoke-static {v2, v9, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    iget v5, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    .line 94
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r1;->a(I)I

    move-result v5

    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/play_billing/K1;->e(I)V

    :goto_1b
    if-ge v3, v4, :cond_1d

    .line 95
    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v5

    iget v6, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ne v7, v6, :cond_1d

    .line 96
    invoke-static {v2, v5, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    iget v5, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r1;->a(I)I

    move-result v5

    .line 97
    invoke-virtual {v12, v5}, Lcom/google/android/gms/internal/play_billing/K1;->e(I)V

    goto :goto_1b

    :pswitch_f
    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object v13, v1

    move v15, v5

    move/from16 v14, v24

    move/from16 v9, v27

    const/4 v3, 0x2

    move-object/from16 v1, p6

    if-ne v8, v3, :cond_26

    .line 98
    invoke-static {v2, v9, v12, v1}, Lcom/google/android/gms/internal/play_billing/e1;->f([BILcom/google/android/gms/internal/play_billing/O1;Lcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    move v5, v9

    move-object v10, v12

    move-object v9, v1

    move v1, v7

    goto :goto_1c

    :cond_26
    if-nez v8, :cond_2e

    move-object v6, v1

    move v1, v7

    move v3, v9

    move-object v5, v12

    .line 99
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e1;->k(I[BIILcom/google/android/gms/internal/play_billing/O1;Lcom/google/android/gms/internal/play_billing/d1;)I

    move-result v7

    move-object v10, v5

    move-object v9, v6

    move v5, v3

    move v3, v7

    .line 100
    :goto_1c
    invoke-direct {v0, v15}, Lcom/google/android/gms/internal/play_billing/i2;->J(I)Lcom/google/android/gms/internal/play_billing/M1;

    move-result-object v6

    iget-object v7, v0, Lcom/google/android/gms/internal/play_billing/i2;->j:Lcom/google/android/gms/internal/play_billing/v2;

    .line 101
    sget v8, Lcom/google/android/gms/internal/play_billing/r2;->b:I

    if-eqz v6, :cond_2c

    if-eqz v10, :cond_2a

    .line 102
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v8

    move/from16 p3, v3

    move-object/from16 v18, v13

    move-object/from16 v13, v16

    const/4 v3, 0x0

    const/4 v12, 0x0

    :goto_1d
    if-ge v12, v8, :cond_29

    .line 103
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v0, v19

    check-cast v0, Ljava/lang/Integer;

    move/from16 v27, v15

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-interface {v6, v15}, Lcom/google/android/gms/internal/play_billing/M1;->a(I)Z

    move-result v19

    if-eqz v19, :cond_28

    if-eq v12, v3, :cond_27

    .line 104
    invoke-interface {v10, v3, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_27
    add-int/lit8 v3, v3, 0x1

    goto :goto_1e

    .line 105
    :cond_28
    invoke-static {v11, v14, v15, v13, v7}, Lcom/google/android/gms/internal/play_billing/r2;->s(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/v2;)Ljava/lang/Object;

    move-result-object v13

    :goto_1e
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    move/from16 v15, v27

    goto :goto_1d

    :cond_29
    move/from16 v27, v15

    if-eq v3, v8, :cond_2d

    .line 106
    invoke-interface {v10, v3, v8}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_20

    :cond_2a
    move/from16 p3, v3

    move-object/from16 v18, v13

    move/from16 v27, v15

    .line 107
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v3, v16

    :cond_2b
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2d

    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-interface {v6, v8}, Lcom/google/android/gms/internal/play_billing/M1;->a(I)Z

    move-result v10

    if-nez v10, :cond_2b

    .line 109
    invoke-static {v11, v14, v8, v3, v7}, Lcom/google/android/gms/internal/play_billing/r2;->s(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/v2;)Ljava/lang/Object;

    move-result-object v3

    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1f

    :cond_2c
    move/from16 p3, v3

    move-object/from16 v18, v13

    move/from16 v27, v15

    :cond_2d
    :goto_20
    move-object v0, v9

    move v9, v1

    move-object v1, v0

    move-object/from16 v0, p0

    move-object v7, v2

    move v10, v5

    move/from16 v19, v27

    move/from16 v5, p3

    goto/16 :goto_2e

    :cond_2e
    move-object/from16 v18, v13

    move-object/from16 v0, p0

    move v10, v9

    goto/16 :goto_19

    :pswitch_10
    move/from16 v2, v27

    move/from16 v27, v5

    move v5, v2

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v9, p6

    move-object/from16 v18, v1

    move v1, v7

    move-object v10, v12

    move/from16 v14, v24

    const/4 v13, 0x2

    if-ne v8, v13, :cond_36

    .line 111
    invoke-static {v2, v5, v9}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v0

    iget v7, v9, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ltz v7, :cond_35

    .line 112
    array-length v8, v2

    sub-int/2addr v8, v0

    if-gt v7, v8, :cond_34

    if-nez v7, :cond_2f

    .line 113
    sget-object v7, Lcom/google/android/gms/internal/play_billing/o1;->b:Lcom/google/android/gms/internal/play_billing/o1;

    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_22

    .line 114
    :cond_2f
    invoke-static {v2, v0, v7}, Lcom/google/android/gms/internal/play_billing/o1;->s([BII)Lcom/google/android/gms/internal/play_billing/o1;

    move-result-object v8

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_21
    add-int/2addr v0, v7

    :goto_22
    if-ge v0, v4, :cond_33

    .line 115
    invoke-static {v2, v0, v9}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v7

    iget v8, v9, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ne v1, v8, :cond_33

    .line 116
    invoke-static {v2, v7, v9}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v0

    iget v7, v9, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ltz v7, :cond_32

    .line 117
    array-length v8, v2

    sub-int/2addr v8, v0

    if-gt v7, v8, :cond_31

    if-nez v7, :cond_30

    .line 118
    sget-object v7, Lcom/google/android/gms/internal/play_billing/o1;->b:Lcom/google/android/gms/internal/play_billing/o1;

    .line 119
    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_22

    .line 120
    :cond_30
    invoke-static {v2, v0, v7}, Lcom/google/android/gms/internal/play_billing/o1;->s([BII)Lcom/google/android/gms/internal/play_billing/o1;

    move-result-object v8

    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_21

    .line 121
    :cond_31
    new-instance v0, Lcom/google/android/gms/internal/play_billing/R1;

    .line 122
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 123
    throw v0

    .line 124
    :cond_32
    new-instance v0, Lcom/google/android/gms/internal/play_billing/R1;

    .line 125
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 126
    throw v0

    :cond_33
    move-object v7, v9

    move v9, v1

    move-object v1, v7

    move-object v7, v2

    move v10, v5

    move/from16 v19, v27

    move v5, v0

    move-object/from16 v0, p0

    goto/16 :goto_2e

    .line 127
    :cond_34
    new-instance v0, Lcom/google/android/gms/internal/play_billing/R1;

    .line 128
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 129
    throw v0

    .line 130
    :cond_35
    new-instance v0, Lcom/google/android/gms/internal/play_billing/R1;

    .line 131
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 132
    throw v0

    :cond_36
    move-object v0, v9

    move v9, v1

    move-object v1, v0

    move-object/from16 v0, p0

    move-object v7, v2

    move v10, v5

    :goto_23
    move/from16 v19, v27

    goto/16 :goto_2d

    :pswitch_11
    move/from16 v2, v27

    move/from16 v27, v5

    move v5, v2

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v9, p6

    move-object/from16 v18, v1

    move v1, v7

    move-object v10, v12

    move/from16 v14, v24

    const/4 v13, 0x2

    if-ne v8, v13, :cond_37

    move-object/from16 v0, p0

    move v7, v1

    move/from16 v12, v27

    .line 133
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v1

    move v3, v5

    move v5, v4

    move v4, v3

    move-object v3, v2

    move v2, v7

    move-object v7, v9

    move-object v6, v10

    .line 134
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/e1;->e(Lcom/google/android/gms/internal/play_billing/p2;I[BIILcom/google/android/gms/internal/play_billing/O1;Lcom/google/android/gms/internal/play_billing/d1;)I

    move-result v1

    move/from16 v28, v2

    move v2, v1

    move/from16 v1, v28

    move v9, v1

    move v5, v2

    move v10, v4

    move-object v1, v7

    move/from16 v19, v12

    move-object v7, v3

    goto/16 :goto_2e

    :cond_37
    move-object/from16 v0, p0

    move v6, v5

    move v5, v4

    move-object v7, v9

    move v9, v1

    move-object v1, v7

    move-object v7, v2

    move v10, v6

    goto :goto_23

    :pswitch_12
    move-object/from16 v15, p6

    move-object/from16 v18, v1

    move v1, v7

    move/from16 v14, v24

    move/from16 v6, v27

    const/4 v13, 0x2

    move-object/from16 v7, p2

    move-wide/from16 v26, v9

    move-object v9, v12

    move v12, v5

    move/from16 v5, p4

    if-ne v8, v13, :cond_45

    const-wide/32 v24, 0x20000000

    and-long v24, v26, v24

    cmp-long v8, v24, v21

    if-nez v8, :cond_3d

    .line 135
    invoke-static {v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v8, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ltz v8, :cond_3c

    if-nez v8, :cond_38

    .line 136
    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_25

    .line 137
    :cond_38
    new-instance v10, Ljava/lang/String;

    .line 138
    sget-object v13, Lcom/google/android/gms/internal/play_billing/P1;->a:Ljava/nio/charset/Charset;

    invoke-direct {v10, v7, v2, v8, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 139
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_24
    add-int/2addr v2, v8

    :goto_25
    if-ge v2, v5, :cond_3b

    .line 140
    invoke-static {v7, v2, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v8

    iget v10, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ne v1, v10, :cond_3b

    .line 141
    invoke-static {v7, v8, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v8, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ltz v8, :cond_3a

    if-nez v8, :cond_39

    .line 142
    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_39
    new-instance v10, Ljava/lang/String;

    .line 143
    sget-object v13, Lcom/google/android/gms/internal/play_billing/P1;->a:Ljava/nio/charset/Charset;

    invoke-direct {v10, v7, v2, v8, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 144
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_24

    .line 145
    :cond_3a
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 146
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 147
    throw v1

    :cond_3b
    move v9, v1

    move v5, v2

    move v10, v6

    move/from16 v19, v12

    :goto_26
    move-object v1, v15

    goto/16 :goto_2e

    .line 148
    :cond_3c
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 149
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 150
    throw v1

    .line 151
    :cond_3d
    invoke-static {v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v8

    iget v10, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ltz v10, :cond_44

    if-nez v10, :cond_3e

    .line 152
    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v27, v6

    move/from16 v19, v12

    goto :goto_27

    :cond_3e
    add-int v13, v8, v10

    .line 153
    invoke-static {v7, v8, v13}, Lcom/google/android/gms/internal/play_billing/F2;->d([BII)Z

    move-result v19

    if-eqz v19, :cond_43

    move/from16 v27, v6

    .line 154
    new-instance v6, Ljava/lang/String;

    move/from16 v19, v12

    .line 155
    sget-object v12, Lcom/google/android/gms/internal/play_billing/P1;->a:Ljava/nio/charset/Charset;

    invoke-direct {v6, v7, v8, v10, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 156
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v8, v13

    :goto_27
    if-ge v8, v5, :cond_42

    .line 157
    invoke-static {v7, v8, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v6

    iget v10, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ne v1, v10, :cond_42

    .line 158
    invoke-static {v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v8

    iget v6, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ltz v6, :cond_41

    if-nez v6, :cond_3f

    .line 159
    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_3f
    add-int v10, v8, v6

    .line 160
    invoke-static {v7, v8, v10}, Lcom/google/android/gms/internal/play_billing/F2;->d([BII)Z

    move-result v12

    if-eqz v12, :cond_40

    .line 161
    new-instance v12, Ljava/lang/String;

    .line 162
    sget-object v13, Lcom/google/android/gms/internal/play_billing/P1;->a:Ljava/nio/charset/Charset;

    invoke-direct {v12, v7, v8, v6, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 163
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v8, v10

    goto :goto_27

    .line 164
    :cond_40
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 165
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 166
    throw v1

    .line 167
    :cond_41
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 168
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 169
    throw v1

    :cond_42
    move v9, v1

    move v5, v8

    move-object v1, v15

    move/from16 v10, v27

    goto/16 :goto_2e

    .line 170
    :cond_43
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 171
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 172
    throw v1

    .line 173
    :cond_44
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 174
    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 175
    throw v1

    :cond_45
    move/from16 v19, v12

    move v9, v1

    move v10, v6

    :goto_28
    move-object v1, v15

    goto/16 :goto_2d

    :pswitch_13
    move-object/from16 v15, p6

    move-object/from16 v18, v1

    move/from16 v19, v5

    move v1, v7

    move-object v9, v12

    move/from16 v14, v24

    move/from16 v4, v27

    const/4 v3, 0x2

    move-object/from16 v7, p2

    move/from16 v5, p4

    if-ne v8, v3, :cond_48

    .line 176
    sget v2, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 177
    invoke-static {v9}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 178
    invoke-static {v7, v4, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v3, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    add-int/2addr v3, v2

    if-lt v2, v3, :cond_47

    if-ne v2, v3, :cond_46

    :goto_29
    move v9, v1

    move v5, v2

    move v10, v4

    goto/16 :goto_26

    .line 179
    :cond_46
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 180
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 181
    throw v1

    .line 182
    :cond_47
    invoke-static {v7, v2, v15}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    .line 183
    throw v16

    :cond_48
    if-eqz v8, :cond_4a

    :cond_49
    :goto_2a
    move v9, v1

    move v10, v4

    goto :goto_28

    .line 184
    :cond_4a
    sget v1, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 185
    invoke-static {v9}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 186
    invoke-static {v7, v4, v15}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    iget-wide v1, v15, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    .line 187
    throw v16

    :pswitch_14
    move-object/from16 v15, p6

    move-object/from16 v18, v1

    move/from16 v19, v5

    move v1, v7

    move-object v9, v12

    move/from16 v14, v24

    move/from16 v4, v27

    const/4 v3, 0x2

    move-object/from16 v7, p2

    move/from16 v5, p4

    if-ne v8, v3, :cond_4e

    .line 188
    sget v2, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 189
    move-object v12, v9

    check-cast v12, Lcom/google/android/gms/internal/play_billing/K1;

    .line 190
    invoke-static {v7, v4, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v3, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    add-int v8, v2, v3

    .line 191
    array-length v9, v7

    if-gt v8, v9, :cond_4d

    .line 192
    invoke-virtual {v12}, Lcom/google/android/gms/internal/play_billing/K1;->size()I

    move-result v9

    div-int/lit8 v3, v3, 0x4

    add-int/2addr v9, v3

    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/play_billing/K1;->f(I)V

    :goto_2b
    if-ge v2, v8, :cond_4b

    .line 193
    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/e1;->b([BI)I

    move-result v3

    invoke-virtual {v12, v3}, Lcom/google/android/gms/internal/play_billing/K1;->e(I)V

    add-int/lit8 v2, v2, 0x4

    goto :goto_2b

    :cond_4b
    if-ne v2, v8, :cond_4c

    goto :goto_29

    .line 194
    :cond_4c
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 195
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 196
    throw v1

    .line 197
    :cond_4d
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 198
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 199
    throw v1

    :cond_4e
    const/4 v3, 0x5

    if-ne v8, v3, :cond_49

    add-int/lit8 v6, v4, 0x4

    .line 200
    sget v2, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 201
    move-object v12, v9

    check-cast v12, Lcom/google/android/gms/internal/play_billing/K1;

    .line 202
    invoke-static {v7, v4}, Lcom/google/android/gms/internal/play_billing/e1;->b([BI)I

    move-result v2

    invoke-virtual {v12, v2}, Lcom/google/android/gms/internal/play_billing/K1;->e(I)V

    :goto_2c
    if-ge v6, v5, :cond_4f

    .line 203
    invoke-static {v7, v6, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v3, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-ne v1, v3, :cond_4f

    .line 204
    invoke-static {v7, v2}, Lcom/google/android/gms/internal/play_billing/e1;->b([BI)I

    move-result v3

    invoke-virtual {v12, v3}, Lcom/google/android/gms/internal/play_billing/K1;->e(I)V

    add-int/lit8 v6, v2, 0x4

    goto :goto_2c

    :cond_4f
    move v9, v1

    move v10, v4

    move v5, v6

    goto/16 :goto_26

    :pswitch_15
    move-object/from16 v15, p6

    move-object/from16 v18, v1

    move/from16 v19, v5

    move v1, v7

    move-object v9, v12

    move/from16 v14, v24

    move/from16 v4, v27

    const/4 v3, 0x2

    move-object/from16 v7, p2

    move/from16 v5, p4

    if-ne v8, v3, :cond_51

    .line 205
    sget v1, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 206
    invoke-static {v9}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 207
    invoke-static {v7, v4, v15}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v1

    iget v2, v15, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    add-int/2addr v1, v2

    .line 208
    array-length v2, v7

    if-le v1, v2, :cond_50

    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 209
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 210
    throw v1

    .line 211
    :cond_50
    throw v16

    :cond_51
    const/4 v3, 0x1

    if-eq v8, v3, :cond_52

    goto/16 :goto_2a

    .line 212
    :cond_52
    sget v1, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 213
    invoke-static {v9}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 214
    invoke-static {v7, v4}, Lcom/google/android/gms/internal/play_billing/e1;->o([BI)J

    throw v16

    :pswitch_16
    move-object/from16 v15, p6

    move-object/from16 v18, v1

    move/from16 v19, v5

    move v1, v7

    move-object v9, v12

    move/from16 v14, v24

    move/from16 v4, v27

    const/4 v3, 0x2

    move-object/from16 v7, p2

    move/from16 v5, p4

    if-ne v8, v3, :cond_53

    .line 215
    invoke-static {v7, v4, v9, v15}, Lcom/google/android/gms/internal/play_billing/e1;->f([BILcom/google/android/gms/internal/play_billing/O1;Lcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    goto/16 :goto_29

    :cond_53
    if-nez v8, :cond_49

    move v3, v4

    move v4, v5

    move-object v2, v7

    move-object v5, v9

    move-object v6, v15

    .line 216
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e1;->k(I[BIILcom/google/android/gms/internal/play_billing/O1;Lcom/google/android/gms/internal/play_billing/d1;)I

    move-result v5

    move v9, v1

    move v10, v3

    move-object v1, v6

    goto/16 :goto_2e

    :pswitch_17
    move-object/from16 v18, v1

    move/from16 v19, v5

    move v9, v7

    move-object v5, v12

    move/from16 v14, v24

    move/from16 v10, v27

    const/4 v3, 0x2

    move-object/from16 v7, p2

    move-object/from16 v1, p6

    if-ne v8, v3, :cond_56

    .line 217
    sget v2, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 218
    invoke-static {v5}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 219
    invoke-static {v7, v10, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v3, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    add-int/2addr v3, v2

    if-lt v2, v3, :cond_55

    if-ne v2, v3, :cond_54

    move v5, v2

    goto/16 :goto_2e

    .line 220
    :cond_54
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 221
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 222
    throw v1

    .line 223
    :cond_55
    invoke-static {v7, v2, v1}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    .line 224
    throw v16

    :cond_56
    if-eqz v8, :cond_57

    goto/16 :goto_2d

    .line 225
    :cond_57
    sget v2, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 226
    invoke-static {v5}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 227
    invoke-static {v7, v10, v1}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    iget-wide v1, v1, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    .line 228
    throw v16

    :pswitch_18
    move-object/from16 v18, v1

    move/from16 v19, v5

    move v9, v7

    move-object v5, v12

    move/from16 v14, v24

    move/from16 v10, v27

    const/4 v3, 0x2

    move-object/from16 v7, p2

    move-object/from16 v1, p6

    if-ne v8, v3, :cond_59

    .line 229
    sget v2, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 230
    invoke-static {v5}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 231
    invoke-static {v7, v10, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v1, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    add-int/2addr v2, v1

    .line 232
    array-length v1, v7

    if-le v2, v1, :cond_58

    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 233
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 234
    throw v1

    .line 235
    :cond_58
    throw v16

    :cond_59
    const/4 v3, 0x5

    if-eq v8, v3, :cond_5a

    goto :goto_2d

    .line 236
    :cond_5a
    sget v1, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 237
    invoke-static {v5}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 238
    invoke-static {v7, v10}, Lcom/google/android/gms/internal/play_billing/e1;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 239
    throw v16

    :pswitch_19
    move-object/from16 v18, v1

    move/from16 v19, v5

    move v9, v7

    move-object v5, v12

    move/from16 v14, v24

    move/from16 v10, v27

    const/4 v3, 0x2

    move-object/from16 v7, p2

    move-object/from16 v1, p6

    if-ne v8, v3, :cond_5c

    .line 240
    sget v2, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 241
    invoke-static {v5}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 242
    invoke-static {v7, v10, v1}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v1, v1, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    add-int/2addr v2, v1

    .line 243
    array-length v1, v7

    if-le v2, v1, :cond_5b

    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 244
    invoke-direct {v1, v6}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 245
    throw v1

    .line 246
    :cond_5b
    throw v16

    :cond_5c
    const/4 v3, 0x1

    if-eq v8, v3, :cond_5e

    :goto_2d
    move v5, v10

    :goto_2e
    if-eq v5, v10, :cond_5d

    move/from16 v4, p4

    move-object v6, v1

    move-object v3, v7

    move v15, v9

    move-object v2, v11

    move v7, v14

    move-object/from16 v1, v18

    move/from16 v8, v19

    move/from16 v9, v20

    move/from16 v14, v23

    goto/16 :goto_e

    :cond_5d
    move/from16 v12, p5

    move-object v6, v1

    move-object v3, v7

    move v7, v14

    move-object/from16 v10, v18

    move/from16 v8, v19

    move/from16 v14, v23

    goto/16 :goto_3b

    .line 247
    :cond_5e
    sget v1, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 248
    invoke-static {v5}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 249
    invoke-static {v7, v10}, Lcom/google/android/gms/internal/play_billing/e1;->o([BI)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 250
    throw v16

    :cond_5f
    move-object v3, v1

    move v6, v5

    move/from16 v20, v9

    move/from16 v5, v24

    move/from16 v10, v27

    move v9, v7

    move-object/from16 v7, p2

    const/16 v1, 0x32

    if-ne v13, v1, :cond_62

    const/4 v1, 0x2

    if-ne v8, v1, :cond_61

    .line 251
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/play_billing/i2;->L(I)Ljava/lang/Object;

    move-result-object v1

    .line 252
    invoke-virtual {v3, v11, v14, v15}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    .line 253
    move-object v4, v2

    check-cast v4, Lcom/google/android/gms/internal/play_billing/Z1;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/Z1;->g()Z

    move-result v4

    if-nez v4, :cond_60

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/Z1;->a()Lcom/google/android/gms/internal/play_billing/Z1;

    move-result-object v4

    .line 254
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/Z1;->d()Lcom/google/android/gms/internal/play_billing/Z1;

    move-result-object v4

    .line 255
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/play_billing/a2;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    invoke-virtual {v3, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 257
    :cond_60
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 258
    throw v16

    :cond_61
    :goto_2f
    move v8, v10

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    move v5, v8

    move/from16 v12, p5

    move v8, v6

    move/from16 v14, v23

    move-object/from16 v6, p6

    goto/16 :goto_3b

    :cond_62
    add-int/lit8 v1, v6, 0x2

    .line 259
    aget v1, v19, v1

    const v17, 0xfffff

    and-int v1, v1, v17

    move/from16 v19, v12

    move/from16 v24, v13

    int-to-long v12, v1

    packed-switch v24, :pswitch_data_2

    move/from16 v27, v6

    move v1, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    :goto_30
    move v7, v5

    goto/16 :goto_39

    :pswitch_1a
    const/4 v13, 0x3

    if-ne v8, v13, :cond_63

    and-int/lit8 v1, v9, -0x8

    or-int/lit8 v1, v1, 0x4

    move v2, v1

    .line 260
    invoke-direct {v0, v11, v5, v6}, Lcom/google/android/gms/internal/play_billing/i2;->N(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v1

    move v4, v2

    .line 261
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v2

    move v8, v5

    move v12, v6

    move/from16 v5, p4

    move v6, v4

    move v4, v10

    move-object v10, v3

    move-object v3, v7

    move-object/from16 v7, p6

    .line 262
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/e1;->m(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;[BIIILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    move-object v6, v7

    .line 263
    invoke-direct {v0, v11, v8, v12, v1}, Lcom/google/android/gms/internal/play_billing/i2;->p(Ljava/lang/Object;IILjava/lang/Object;)V

    move v5, v2

    move v1, v4

    move v7, v8

    move/from16 v27, v12

    goto/16 :goto_3a

    :cond_63
    move v4, v10

    move-object v10, v3

    move v1, v4

    move/from16 v27, v6

    move-object v3, v7

    move-object/from16 v6, p6

    goto :goto_30

    :pswitch_1b
    move v1, v6

    move v4, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-nez v8, :cond_64

    .line 264
    invoke-static {v3, v4, v6}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    move/from16 p3, v9

    iget-wide v8, v6, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    .line 265
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/play_billing/r1;->b(J)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v10, v11, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 266
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_31
    move/from16 v9, p3

    :goto_32
    move/from16 v27, v1

    move v5, v2

    move v1, v4

    goto/16 :goto_3a

    :cond_64
    :goto_33
    move/from16 v27, v1

    move v1, v4

    goto/16 :goto_39

    :pswitch_1c
    move v1, v6

    move/from16 p3, v9

    move v4, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-nez v8, :cond_65

    .line 267
    invoke-static {v3, v4, v6}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v5, v6, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    .line 268
    invoke-static {v5}, Lcom/google/android/gms/internal/play_billing/r1;->a(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v10, v11, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 269
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_31

    :cond_65
    move/from16 v9, p3

    goto :goto_33

    :pswitch_1d
    move v1, v6

    move/from16 p3, v9

    move v4, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-nez v8, :cond_65

    .line 270
    invoke-static {v3, v4, v6}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v5, v6, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    .line 271
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/i2;->J(I)Lcom/google/android/gms/internal/play_billing/M1;

    move-result-object v8

    if-eqz v8, :cond_66

    invoke-interface {v8, v5}, Lcom/google/android/gms/internal/play_billing/M1;->a(I)Z

    move-result v8

    if-eqz v8, :cond_67

    :cond_66
    move/from16 v9, p3

    goto :goto_34

    .line 272
    :cond_67
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/i2;->z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/w2;

    move-result-object v8

    int-to-long v12, v5

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move/from16 v9, p3

    invoke-virtual {v8, v9, v5}, Lcom/google/android/gms/internal/play_billing/w2;->j(ILjava/lang/Object;)V

    goto :goto_32

    .line 273
    :goto_34
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v10, v11, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 274
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_32

    :pswitch_1e
    move v1, v6

    move v4, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    const/4 v5, 0x2

    if-ne v8, v5, :cond_64

    .line 275
    invoke-static {v3, v4, v6}, Lcom/google/android/gms/internal/play_billing/e1;->a([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget-object v5, v6, Lcom/google/android/gms/internal/play_billing/d1;->c:Ljava/lang/Object;

    .line 276
    invoke-virtual {v10, v11, v14, v15, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 277
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_32

    :pswitch_1f
    move v1, v6

    move v4, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    const/4 v5, 0x2

    if-ne v8, v5, :cond_68

    .line 278
    invoke-direct {v0, v11, v7, v1}, Lcom/google/android/gms/internal/play_billing/i2;->N(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    .line 279
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/i2;->K(I)Lcom/google/android/gms/internal/play_billing/p2;

    move-result-object v2

    move v8, v1

    move-object v1, v5

    move/from16 v5, p4

    .line 280
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e1;->n(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/p2;[BIILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    move-object v5, v1

    move v1, v4

    .line 281
    invoke-direct {v0, v11, v7, v8, v5}, Lcom/google/android/gms/internal/play_billing/i2;->p(Ljava/lang/Object;IILjava/lang/Object;)V

    move v5, v2

    move/from16 v27, v8

    goto/16 :goto_3a

    :cond_68
    move v8, v1

    move v1, v4

    move/from16 v27, v8

    goto/16 :goto_39

    :pswitch_20
    move/from16 v27, v6

    move v1, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    const/4 v5, 0x2

    if-ne v8, v5, :cond_6d

    .line 282
    invoke-static {v3, v1, v6}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v5

    iget v8, v6, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    if-nez v8, :cond_69

    .line 283
    invoke-virtual {v10, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_36

    :cond_69
    and-int v4, v19, v18

    move/from16 p3, v4

    add-int v4, v5, v8

    if-eqz p3, :cond_6b

    .line 284
    invoke-static {v3, v5, v4}, Lcom/google/android/gms/internal/play_billing/F2;->d([BII)Z

    move-result v18

    if-eqz v18, :cond_6a

    goto :goto_35

    .line 285
    :cond_6a
    new-instance v1, Lcom/google/android/gms/internal/play_billing/R1;

    .line 286
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 287
    throw v1

    .line 288
    :cond_6b
    :goto_35
    new-instance v2, Ljava/lang/String;

    move/from16 p3, v4

    .line 289
    sget-object v4, Lcom/google/android/gms/internal/play_billing/P1;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, v5, v8, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 290
    invoke-virtual {v10, v11, v14, v15, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move/from16 v5, p3

    .line 291
    :goto_36
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_3a

    :pswitch_21
    move/from16 v27, v6

    move v1, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-nez v8, :cond_6d

    .line 292
    invoke-static {v3, v1, v6}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget-wide v4, v6, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    cmp-long v4, v4, v21

    if-eqz v4, :cond_6c

    const/4 v5, 0x1

    goto :goto_37

    :cond_6c
    const/4 v5, 0x0

    .line 293
    :goto_37
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v10, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 294
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_38
    move v5, v2

    goto/16 :goto_3a

    :pswitch_22
    move/from16 v27, v6

    move v1, v10

    const/4 v2, 0x5

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-ne v8, v2, :cond_6d

    add-int/lit8 v2, v1, 0x4

    .line 295
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/play_billing/e1;->b([BI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v10, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 296
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_38

    :pswitch_23
    move/from16 v27, v6

    move v1, v10

    const/4 v2, 0x1

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-ne v8, v2, :cond_6d

    add-int/lit8 v2, v1, 0x8

    .line 297
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/play_billing/e1;->o([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v10, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 298
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_38

    :pswitch_24
    move/from16 v27, v6

    move v1, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-nez v8, :cond_6d

    .line 299
    invoke-static {v3, v1, v6}, Lcom/google/android/gms/internal/play_billing/e1;->i([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget v4, v6, Lcom/google/android/gms/internal/play_billing/d1;->a:I

    .line 300
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v10, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 301
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_38

    :pswitch_25
    move/from16 v27, v6

    move v1, v10

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-nez v8, :cond_6d

    .line 302
    invoke-static {v3, v1, v6}, Lcom/google/android/gms/internal/play_billing/e1;->l([BILcom/google/android/gms/internal/play_billing/d1;)I

    move-result v2

    iget-wide v4, v6, Lcom/google/android/gms/internal/play_billing/d1;->b:J

    .line 303
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v10, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 304
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_38

    :pswitch_26
    move/from16 v27, v6

    move v1, v10

    const/4 v2, 0x5

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-ne v8, v2, :cond_6d

    add-int/lit8 v2, v1, 0x4

    .line 305
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/play_billing/e1;->b([BI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    .line 306
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v10, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 307
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_38

    :pswitch_27
    move/from16 v27, v6

    move v1, v10

    const/4 v2, 0x1

    move-object/from16 v6, p6

    move-object v10, v3

    move-object v3, v7

    move v7, v5

    if-ne v8, v2, :cond_6d

    add-int/lit8 v2, v1, 0x8

    .line 308
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/play_billing/e1;->o([BI)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    .line 309
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v10, v11, v14, v15, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 310
    invoke-virtual {v10, v11, v12, v13, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto/16 :goto_38

    :cond_6d
    :goto_39
    move v5, v1

    :goto_3a
    if-eq v5, v1, :cond_6e

    move/from16 v4, p4

    move v15, v9

    move-object v1, v10

    move-object v2, v11

    move/from16 v9, v20

    move/from16 v14, v23

    goto/16 :goto_d

    :cond_6e
    move/from16 v12, p5

    move/from16 v14, v23

    move/from16 v8, v27

    :goto_3b
    if-ne v9, v12, :cond_6f

    if-eqz v12, :cond_6f

    move/from16 v4, p4

    move v15, v9

    move/from16 v9, v20

    :goto_3c
    const v6, 0xfffff

    goto :goto_3f

    .line 311
    :cond_6f
    iget-boolean v1, v0, Lcom/google/android/gms/internal/play_billing/i2;->f:Z

    if-eqz v1, :cond_70

    iget-object v1, v6, Lcom/google/android/gms/internal/play_billing/d1;->d:Lcom/google/android/gms/internal/play_billing/z1;

    .line 312
    sget-object v2, Lcom/google/android/gms/internal/play_billing/z1;->c:Lcom/google/android/gms/internal/play_billing/z1;

    .line 313
    sget v2, Lcom/google/android/gms/internal/play_billing/m2;->d:I

    sget-object v2, Lcom/google/android/gms/internal/play_billing/z1;->c:Lcom/google/android/gms/internal/play_billing/z1;

    if-eq v1, v2, :cond_70

    iget-object v2, v0, Lcom/google/android/gms/internal/play_billing/i2;->e:Lcom/google/android/gms/internal/play_billing/f2;

    .line 314
    sget v4, Lcom/google/android/gms/internal/play_billing/e1;->b:I

    .line 315
    invoke-virtual {v1, v2, v7}, Lcom/google/android/gms/internal/play_billing/z1;->b(Lcom/google/android/gms/internal/play_billing/f2;I)Lcom/google/android/gms/internal/play_billing/I1;

    move v3, v5

    .line 316
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/i2;->z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/w2;

    move-result-object v5

    move-object/from16 v2, p2

    move/from16 v4, p4

    move v1, v9

    .line 317
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e1;->h(I[BIILcom/google/android/gms/internal/play_billing/w2;Lcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    :goto_3d
    move v5, v3

    goto :goto_3e

    :cond_70
    move v3, v5

    move v1, v9

    .line 318
    invoke-static {v11}, Lcom/google/android/gms/internal/play_billing/i2;->z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/w2;

    move-result-object v5

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    .line 319
    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e1;->h(I[BIILcom/google/android/gms/internal/play_billing/w2;Lcom/google/android/gms/internal/play_billing/d1;)I

    move-result v3

    goto :goto_3d

    :goto_3e
    move-object/from16 v3, p2

    move-object/from16 v6, p6

    move v15, v1

    move-object v1, v10

    move-object v2, v11

    move/from16 v9, v20

    goto/16 :goto_e

    :cond_71
    move/from16 v12, p5

    move-object v10, v1

    move-object v11, v2

    move/from16 v20, v9

    move/from16 v23, v14

    goto :goto_3c

    :goto_3f
    if-eq v9, v6, :cond_72

    int-to-long v1, v9

    .line 320
    invoke-virtual {v10, v11, v1, v2, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_72
    iget v1, v0, Lcom/google/android/gms/internal/play_billing/i2;->h:I

    :goto_40
    iget v2, v0, Lcom/google/android/gms/internal/play_billing/i2;->i:I

    if-ge v1, v2, :cond_75

    iget-object v2, v0, Lcom/google/android/gms/internal/play_billing/i2;->g:[I

    iget-object v3, v0, Lcom/google/android/gms/internal/play_billing/i2;->a:[I

    .line 321
    aget v2, v2, v1

    .line 322
    aget v3, v3, v2

    .line 323
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->H(I)I

    move-result v3

    const v17, 0xfffff

    and-int v3, v3, v17

    int-to-long v6, v3

    .line 324
    invoke-static {v11, v6, v7}, Lcom/google/android/gms/internal/play_billing/C2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_73

    goto :goto_41

    .line 325
    :cond_73
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->J(I)Lcom/google/android/gms/internal/play_billing/M1;

    move-result-object v6

    if-nez v6, :cond_74

    :goto_41
    add-int/lit8 v1, v1, 0x1

    goto :goto_40

    .line 326
    :cond_74
    check-cast v3, Lcom/google/android/gms/internal/play_billing/Z1;

    .line 327
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/i2;->L(I)Ljava/lang/Object;

    move-result-object v1

    .line 328
    invoke-static {v1}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 329
    throw v16

    .line 330
    :cond_75
    const-string v1, "Failed to parse the message."

    if-nez v12, :cond_77

    if-ne v5, v4, :cond_76

    goto :goto_42

    :cond_76
    new-instance v2, Lcom/google/android/gms/internal/play_billing/R1;

    .line 331
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 332
    throw v2

    :cond_77
    if-gt v5, v4, :cond_78

    if-ne v15, v12, :cond_78

    :goto_42
    return v5

    :cond_78
    new-instance v2, Lcom/google/android/gms/internal/play_billing/R1;

    .line 333
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/play_billing/R1;-><init>(Ljava/lang/String;)V

    .line 334
    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_24
        :pswitch_1d
        :pswitch_22
        :pswitch_23
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method
