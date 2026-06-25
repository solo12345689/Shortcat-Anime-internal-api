.class public abstract Lo3/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo3/b$k;,
        Lo3/b$e;,
        Lo3/b$h;,
        Lo3/b$i;,
        Lo3/b$j;,
        Lo3/b$f;,
        Lo3/b$b;,
        Lo3/b$c;,
        Lo3/b$l;,
        Lo3/b$d;,
        Lo3/b$g;,
        Lo3/b$a;
    }
.end annotation


# static fields
.field private static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "OpusHead"

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a0;->z0(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lo3/b;->a:[B

    .line 8
    .line 9
    return-void
.end method

.method private static A(Lt2/I;IILjava/lang/String;)Lo3/u;
    .locals 11

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    :goto_0
    sub-int v1, v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v1, p2, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const v4, 0x74656e63

    .line 20
    .line 21
    .line 22
    if-ne v3, v4, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Lo3/b;->q(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 p2, 0x1

    .line 33
    invoke-virtual {p0, p2}, Lt2/I;->c0(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lt2/I;->c0(I)V

    .line 40
    .line 41
    .line 42
    move v8, v0

    .line 43
    move v9, v8

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    and-int/lit16 v1, p1, 0xf0

    .line 50
    .line 51
    shr-int/lit8 v1, v1, 0x4

    .line 52
    .line 53
    and-int/lit8 p1, p1, 0xf

    .line 54
    .line 55
    move v9, p1

    .line 56
    move v8, v1

    .line 57
    :goto_1
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-ne p1, p2, :cond_1

    .line 62
    .line 63
    move v4, p2

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    move v4, v0

    .line 66
    :goto_2
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const/16 p1, 0x10

    .line 71
    .line 72
    new-array v7, p1, [B

    .line 73
    .line 74
    invoke-virtual {p0, v7, v0, p1}, Lt2/I;->q([BII)V

    .line 75
    .line 76
    .line 77
    if-eqz v4, :cond_2

    .line 78
    .line 79
    if-nez v6, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    new-array v2, p1, [B

    .line 86
    .line 87
    invoke-virtual {p0, v2, v0, p1}, Lt2/I;->q([BII)V

    .line 88
    .line 89
    .line 90
    :cond_2
    move-object v10, v2

    .line 91
    new-instance v3, Lo3/u;

    .line 92
    .line 93
    move-object v5, p3

    .line 94
    invoke-direct/range {v3 .. v10}, Lo3/u;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 95
    .line 96
    .line 97
    return-object v3

    .line 98
    :cond_3
    move-object v5, p3

    .line 99
    add-int/2addr v0, v1

    .line 100
    goto :goto_0

    .line 101
    :cond_4
    return-object v2
.end method

.method public static B(Lo3/t;Lu2/e$b;LU2/B;)Lo3/w;
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const v3, 0x7374737a

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v3}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    new-instance v5, Lo3/b$i;

    .line 15
    .line 16
    iget-object v6, v1, Lo3/t;->g:Lq2/x;

    .line 17
    .line 18
    invoke-direct {v5, v3, v6}, Lo3/b$i;-><init>(Lu2/e$c;Lq2/x;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const v3, 0x73747a32

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_33

    .line 30
    .line 31
    new-instance v5, Lo3/b$j;

    .line 32
    .line 33
    invoke-direct {v5, v3}, Lo3/b$j;-><init>(Lu2/e$c;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-interface {v5}, Lo3/b$f;->c()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v6, 0x0

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    new-instance v0, Lo3/w;

    .line 44
    .line 45
    new-array v2, v6, [J

    .line 46
    .line 47
    new-array v3, v6, [I

    .line 48
    .line 49
    new-array v5, v6, [J

    .line 50
    .line 51
    new-array v6, v6, [I

    .line 52
    .line 53
    const-wide/16 v7, 0x0

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-direct/range {v0 .. v8}, Lo3/w;-><init>(Lo3/t;[J[II[J[IJ)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    iget v7, v1, Lo3/t;->b:I

    .line 61
    .line 62
    const/4 v8, 0x2

    .line 63
    const-wide/16 v9, 0x0

    .line 64
    .line 65
    if-ne v7, v8, :cond_2

    .line 66
    .line 67
    iget-wide v11, v1, Lo3/t;->f:J

    .line 68
    .line 69
    cmp-long v7, v11, v9

    .line 70
    .line 71
    if-lez v7, :cond_2

    .line 72
    .line 73
    int-to-float v7, v3

    .line 74
    long-to-float v11, v11

    .line 75
    const v12, 0x49742400    # 1000000.0f

    .line 76
    .line 77
    .line 78
    div-float/2addr v11, v12

    .line 79
    div-float/2addr v7, v11

    .line 80
    iget-object v11, v1, Lo3/t;->g:Lq2/x;

    .line 81
    .line 82
    invoke-virtual {v11}, Lq2/x;->b()Lq2/x$b;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-virtual {v11, v7}, Lq2/x$b;->f0(F)Lq2/x$b;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v7}, Lq2/x$b;->P()Lq2/x;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v1, v7}, Lo3/t;->a(Lq2/x;)Lo3/t;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_2
    const v7, 0x7374636f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v7}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    const/4 v11, 0x1

    .line 106
    if-nez v7, :cond_3

    .line 107
    .line 108
    const v7, 0x636f3634

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v7}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-static {v7}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Lu2/e$c;

    .line 120
    .line 121
    move v12, v11

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    move v12, v6

    .line 124
    :goto_1
    iget-object v7, v7, Lu2/e$c;->b:Lt2/I;

    .line 125
    .line 126
    const v13, 0x73747363

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v13}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    invoke-static {v13}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    check-cast v13, Lu2/e$c;

    .line 138
    .line 139
    iget-object v13, v13, Lu2/e$c;->b:Lt2/I;

    .line 140
    .line 141
    const v14, 0x73747473

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v14}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    invoke-static {v14}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    check-cast v14, Lu2/e$c;

    .line 153
    .line 154
    iget-object v14, v14, Lu2/e$c;->b:Lt2/I;

    .line 155
    .line 156
    const v15, 0x73747373

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v15}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 160
    .line 161
    .line 162
    move-result-object v15

    .line 163
    if-eqz v15, :cond_4

    .line 164
    .line 165
    iget-object v15, v15, Lu2/e$c;->b:Lt2/I;

    .line 166
    .line 167
    :goto_2
    move-wide/from16 v16, v9

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_4
    const/4 v15, 0x0

    .line 171
    goto :goto_2

    .line 172
    :goto_3
    const v9, 0x63747473

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v9}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-eqz v0, :cond_5

    .line 180
    .line 181
    iget-object v0, v0, Lu2/e$c;->b:Lt2/I;

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_5
    const/4 v0, 0x0

    .line 185
    :goto_4
    new-instance v9, Lo3/b$b;

    .line 186
    .line 187
    invoke-direct {v9, v13, v7, v12}, Lo3/b$b;-><init>(Lt2/I;Lt2/I;Z)V

    .line 188
    .line 189
    .line 190
    const/16 v7, 0xc

    .line 191
    .line 192
    invoke-virtual {v14, v7}, Lt2/I;->b0(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v14}, Lt2/I;->Q()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    sub-int/2addr v10, v11

    .line 200
    invoke-virtual {v14}, Lt2/I;->Q()I

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    invoke-virtual {v14}, Lt2/I;->Q()I

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v0, :cond_6

    .line 209
    .line 210
    invoke-virtual {v0, v7}, Lt2/I;->b0(I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lt2/I;->Q()I

    .line 214
    .line 215
    .line 216
    move-result v18

    .line 217
    goto :goto_5

    .line 218
    :cond_6
    move/from16 v18, v6

    .line 219
    .line 220
    :goto_5
    const/4 v4, -0x1

    .line 221
    if-eqz v15, :cond_8

    .line 222
    .line 223
    invoke-virtual {v15, v7}, Lt2/I;->b0(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v15}, Lt2/I;->Q()I

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    if-lez v7, :cond_7

    .line 231
    .line 232
    invoke-virtual {v15}, Lt2/I;->Q()I

    .line 233
    .line 234
    .line 235
    move-result v19

    .line 236
    add-int/lit8 v19, v19, -0x1

    .line 237
    .line 238
    move/from16 v20, v6

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_7
    move/from16 v19, v4

    .line 242
    .line 243
    move/from16 v20, v6

    .line 244
    .line 245
    const/4 v15, 0x0

    .line 246
    goto :goto_6

    .line 247
    :cond_8
    move/from16 v19, v4

    .line 248
    .line 249
    move v7, v6

    .line 250
    move/from16 v20, v7

    .line 251
    .line 252
    :goto_6
    invoke-interface {v5}, Lo3/b$f;->b()I

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    iget-object v8, v1, Lo3/t;->g:Lq2/x;

    .line 257
    .line 258
    iget-object v8, v8, Lq2/x;->o:Ljava/lang/String;

    .line 259
    .line 260
    if-eq v6, v4, :cond_a

    .line 261
    .line 262
    const-string v4, "audio/raw"

    .line 263
    .line 264
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-nez v4, :cond_9

    .line 269
    .line 270
    const-string v4, "audio/g711-mlaw"

    .line 271
    .line 272
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-nez v4, :cond_9

    .line 277
    .line 278
    const-string v4, "audio/g711-alaw"

    .line 279
    .line 280
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-eqz v4, :cond_a

    .line 285
    .line 286
    :cond_9
    if-nez v10, :cond_a

    .line 287
    .line 288
    if-nez v18, :cond_a

    .line 289
    .line 290
    if-nez v7, :cond_a

    .line 291
    .line 292
    move v4, v11

    .line 293
    goto :goto_7

    .line 294
    :cond_a
    move/from16 v4, v20

    .line 295
    .line 296
    :goto_7
    if-eqz v4, :cond_c

    .line 297
    .line 298
    iget v0, v9, Lo3/b$b;->a:I

    .line 299
    .line 300
    new-array v4, v0, [J

    .line 301
    .line 302
    new-array v0, v0, [I

    .line 303
    .line 304
    :goto_8
    invoke-virtual {v9}, Lo3/b$b;->a()Z

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-eqz v5, :cond_b

    .line 309
    .line 310
    iget v5, v9, Lo3/b$b;->b:I

    .line 311
    .line 312
    iget-wide v7, v9, Lo3/b$b;->d:J

    .line 313
    .line 314
    aput-wide v7, v4, v5

    .line 315
    .line 316
    iget v7, v9, Lo3/b$b;->c:I

    .line 317
    .line 318
    aput v7, v0, v5

    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_b
    int-to-long v7, v13

    .line 322
    invoke-static {v6, v4, v0, v7, v8}, Lo3/d;->a(I[J[IJ)Lo3/d$b;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    iget-object v4, v0, Lo3/d$b;->a:[J

    .line 327
    .line 328
    iget-object v5, v0, Lo3/d$b;->b:[I

    .line 329
    .line 330
    iget v6, v0, Lo3/d$b;->c:I

    .line 331
    .line 332
    iget-object v7, v0, Lo3/d$b;->d:[J

    .line 333
    .line 334
    iget-object v8, v0, Lo3/d$b;->e:[I

    .line 335
    .line 336
    iget-wide v9, v0, Lo3/d$b;->f:J

    .line 337
    .line 338
    iget-wide v12, v0, Lo3/d$b;->g:J

    .line 339
    .line 340
    move-wide/from16 v22, v9

    .line 341
    .line 342
    move/from16 p0, v11

    .line 343
    .line 344
    move-object v9, v7

    .line 345
    move-object v10, v8

    .line 346
    move v8, v6

    .line 347
    move-object v7, v5

    .line 348
    move-object v6, v4

    .line 349
    goto/16 :goto_12

    .line 350
    .line 351
    :cond_c
    new-array v4, v3, [J

    .line 352
    .line 353
    new-array v6, v3, [I

    .line 354
    .line 355
    new-array v8, v3, [J

    .line 356
    .line 357
    move/from16 p0, v11

    .line 358
    .line 359
    new-array v11, v3, [I

    .line 360
    .line 361
    move-object/from16 p1, v0

    .line 362
    .line 363
    move-object/from16 v23, v5

    .line 364
    .line 365
    move v0, v13

    .line 366
    move-object/from16 v24, v14

    .line 367
    .line 368
    move-object/from16 v27, v15

    .line 369
    .line 370
    move-wide/from16 v25, v16

    .line 371
    .line 372
    move-wide/from16 v29, v25

    .line 373
    .line 374
    move/from16 v22, v18

    .line 375
    .line 376
    move/from16 v5, v19

    .line 377
    .line 378
    move/from16 v14, v20

    .line 379
    .line 380
    move v15, v14

    .line 381
    move/from16 v28, v15

    .line 382
    .line 383
    move/from16 v31, v28

    .line 384
    .line 385
    move v13, v12

    .line 386
    move-wide/from16 v18, v29

    .line 387
    .line 388
    move v12, v10

    .line 389
    move v10, v7

    .line 390
    move/from16 v7, v31

    .line 391
    .line 392
    :goto_9
    const-string v2, "BoxParsers"

    .line 393
    .line 394
    if-ge v14, v3, :cond_15

    .line 395
    .line 396
    move-wide/from16 v32, v29

    .line 397
    .line 398
    move/from16 v29, v28

    .line 399
    .line 400
    move/from16 v28, p0

    .line 401
    .line 402
    :goto_a
    if-nez v29, :cond_d

    .line 403
    .line 404
    invoke-virtual {v9}, Lo3/b$b;->a()Z

    .line 405
    .line 406
    .line 407
    move-result v28

    .line 408
    if-eqz v28, :cond_d

    .line 409
    .line 410
    move/from16 v30, v12

    .line 411
    .line 412
    move/from16 v34, v13

    .line 413
    .line 414
    iget-wide v12, v9, Lo3/b$b;->d:J

    .line 415
    .line 416
    move/from16 v35, v3

    .line 417
    .line 418
    iget v3, v9, Lo3/b$b;->c:I

    .line 419
    .line 420
    move/from16 v29, v3

    .line 421
    .line 422
    move-wide/from16 v32, v12

    .line 423
    .line 424
    move/from16 v12, v30

    .line 425
    .line 426
    move/from16 v13, v34

    .line 427
    .line 428
    move/from16 v3, v35

    .line 429
    .line 430
    goto :goto_a

    .line 431
    :cond_d
    move/from16 v35, v3

    .line 432
    .line 433
    move/from16 v30, v12

    .line 434
    .line 435
    move/from16 v34, v13

    .line 436
    .line 437
    if-nez v28, :cond_e

    .line 438
    .line 439
    const-string v0, "Unexpected end of chunk data"

    .line 440
    .line 441
    invoke-static {v2, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-static {v4, v14}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-static {v6, v14}, Ljava/util/Arrays;->copyOf([II)[I

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-static {v8, v14}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    invoke-static {v11, v14}, Ljava/util/Arrays;->copyOf([II)[I

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    move-object v8, v4

    .line 461
    move-object v11, v5

    .line 462
    move-object v4, v0

    .line 463
    move-object v5, v3

    .line 464
    move v3, v14

    .line 465
    move/from16 v0, v29

    .line 466
    .line 467
    goto/16 :goto_e

    .line 468
    .line 469
    :cond_e
    if-eqz p1, :cond_10

    .line 470
    .line 471
    move/from16 v2, v31

    .line 472
    .line 473
    :goto_b
    if-nez v2, :cond_f

    .line 474
    .line 475
    if-lez v22, :cond_f

    .line 476
    .line 477
    invoke-virtual/range {p1 .. p1}, Lt2/I;->Q()I

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    invoke-virtual/range {p1 .. p1}, Lt2/I;->v()I

    .line 482
    .line 483
    .line 484
    move-result v15

    .line 485
    add-int/lit8 v22, v22, -0x1

    .line 486
    .line 487
    goto :goto_b

    .line 488
    :cond_f
    add-int/lit8 v2, v2, -0x1

    .line 489
    .line 490
    move/from16 v31, v2

    .line 491
    .line 492
    :cond_10
    aput-wide v32, v4, v14

    .line 493
    .line 494
    invoke-interface/range {v23 .. v23}, Lo3/b$f;->a()I

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    aput v2, v6, v14

    .line 499
    .line 500
    int-to-long v12, v2

    .line 501
    add-long v18, v18, v12

    .line 502
    .line 503
    if-le v2, v7, :cond_11

    .line 504
    .line 505
    move v7, v2

    .line 506
    :cond_11
    int-to-long v2, v15

    .line 507
    add-long v2, v25, v2

    .line 508
    .line 509
    aput-wide v2, v8, v14

    .line 510
    .line 511
    if-nez v27, :cond_12

    .line 512
    .line 513
    move/from16 v2, p0

    .line 514
    .line 515
    goto :goto_c

    .line 516
    :cond_12
    move/from16 v2, v20

    .line 517
    .line 518
    :goto_c
    aput v2, v11, v14

    .line 519
    .line 520
    if-ne v14, v5, :cond_13

    .line 521
    .line 522
    aput p0, v11, v14

    .line 523
    .line 524
    add-int/lit8 v10, v10, -0x1

    .line 525
    .line 526
    if-lez v10, :cond_13

    .line 527
    .line 528
    invoke-static/range {v27 .. v27}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    check-cast v2, Lt2/I;

    .line 533
    .line 534
    invoke-virtual {v2}, Lt2/I;->Q()I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    add-int/lit8 v2, v2, -0x1

    .line 539
    .line 540
    move v5, v2

    .line 541
    :cond_13
    int-to-long v2, v0

    .line 542
    add-long v25, v25, v2

    .line 543
    .line 544
    add-int/lit8 v13, v34, -0x1

    .line 545
    .line 546
    if-nez v13, :cond_14

    .line 547
    .line 548
    if-lez v30, :cond_14

    .line 549
    .line 550
    invoke-virtual/range {v24 .. v24}, Lt2/I;->Q()I

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    invoke-virtual/range {v24 .. v24}, Lt2/I;->v()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    add-int/lit8 v12, v30, -0x1

    .line 559
    .line 560
    move v13, v0

    .line 561
    move v0, v2

    .line 562
    goto :goto_d

    .line 563
    :cond_14
    move/from16 v12, v30

    .line 564
    .line 565
    :goto_d
    aget v2, v6, v14

    .line 566
    .line 567
    int-to-long v2, v2

    .line 568
    add-long v2, v32, v2

    .line 569
    .line 570
    add-int/lit8 v28, v29, -0x1

    .line 571
    .line 572
    add-int/lit8 v14, v14, 0x1

    .line 573
    .line 574
    move-wide/from16 v29, v2

    .line 575
    .line 576
    move/from16 v3, v35

    .line 577
    .line 578
    goto/16 :goto_9

    .line 579
    .line 580
    :cond_15
    move/from16 v35, v3

    .line 581
    .line 582
    move/from16 v30, v12

    .line 583
    .line 584
    move/from16 v34, v13

    .line 585
    .line 586
    move-object v5, v6

    .line 587
    move/from16 v0, v28

    .line 588
    .line 589
    :goto_e
    int-to-long v12, v15

    .line 590
    add-long v12, v25, v12

    .line 591
    .line 592
    if-eqz p1, :cond_17

    .line 593
    .line 594
    :goto_f
    if-lez v22, :cond_17

    .line 595
    .line 596
    invoke-virtual/range {p1 .. p1}, Lt2/I;->Q()I

    .line 597
    .line 598
    .line 599
    move-result v6

    .line 600
    if-eqz v6, :cond_16

    .line 601
    .line 602
    move/from16 v6, v20

    .line 603
    .line 604
    goto :goto_10

    .line 605
    :cond_16
    invoke-virtual/range {p1 .. p1}, Lt2/I;->v()I

    .line 606
    .line 607
    .line 608
    add-int/lit8 v22, v22, -0x1

    .line 609
    .line 610
    goto :goto_f

    .line 611
    :cond_17
    move/from16 v6, p0

    .line 612
    .line 613
    :goto_10
    if-nez v10, :cond_18

    .line 614
    .line 615
    if-nez v34, :cond_18

    .line 616
    .line 617
    if-nez v0, :cond_18

    .line 618
    .line 619
    if-nez v30, :cond_18

    .line 620
    .line 621
    if-nez v31, :cond_18

    .line 622
    .line 623
    if-nez v6, :cond_1a

    .line 624
    .line 625
    :cond_18
    new-instance v9, Ljava/lang/StringBuilder;

    .line 626
    .line 627
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 628
    .line 629
    .line 630
    const-string v14, "Inconsistent stbl box for track "

    .line 631
    .line 632
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    iget v14, v1, Lo3/t;->a:I

    .line 636
    .line 637
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    const-string v14, ": remainingSynchronizationSamples "

    .line 641
    .line 642
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    const-string v10, ", remainingSamplesAtTimestampDelta "

    .line 649
    .line 650
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    move/from16 v10, v34

    .line 654
    .line 655
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    const-string v10, ", remainingSamplesInChunk "

    .line 659
    .line 660
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    const-string v0, ", remainingTimestampDeltaChanges "

    .line 667
    .line 668
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    move/from16 v10, v30

    .line 672
    .line 673
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    const-string v0, ", remainingSamplesAtTimestampOffset "

    .line 677
    .line 678
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    move/from16 v0, v31

    .line 682
    .line 683
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    if-nez v6, :cond_19

    .line 687
    .line 688
    const-string v0, ", ctts invalid"

    .line 689
    .line 690
    goto :goto_11

    .line 691
    :cond_19
    const-string v0, ""

    .line 692
    .line 693
    :goto_11
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    invoke-static {v2, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    :cond_1a
    move-object v9, v8

    .line 704
    move-object v10, v11

    .line 705
    move-wide/from16 v22, v12

    .line 706
    .line 707
    move-wide/from16 v12, v18

    .line 708
    .line 709
    move v8, v7

    .line 710
    move-object v6, v4

    .line 711
    move-object v7, v5

    .line 712
    :goto_12
    iget-wide v4, v1, Lo3/t;->f:J

    .line 713
    .line 714
    cmp-long v0, v4, v16

    .line 715
    .line 716
    const-wide/32 v18, 0x7fffffff

    .line 717
    .line 718
    .line 719
    if-lez v0, :cond_1b

    .line 720
    .line 721
    const-wide/16 v14, 0x8

    .line 722
    .line 723
    mul-long v24, v12, v14

    .line 724
    .line 725
    const-wide/32 v26, 0xf4240

    .line 726
    .line 727
    .line 728
    sget-object v30, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    .line 729
    .line 730
    move-wide/from16 v28, v4

    .line 731
    .line 732
    invoke-static/range {v24 .. v30}, Lt2/a0;->o1(JJJLjava/math/RoundingMode;)J

    .line 733
    .line 734
    .line 735
    move-result-wide v4

    .line 736
    cmp-long v0, v4, v16

    .line 737
    .line 738
    if-lez v0, :cond_1b

    .line 739
    .line 740
    cmp-long v0, v4, v18

    .line 741
    .line 742
    if-gez v0, :cond_1b

    .line 743
    .line 744
    iget-object v0, v1, Lo3/t;->g:Lq2/x;

    .line 745
    .line 746
    invoke-virtual {v0}, Lq2/x;->b()Lq2/x$b;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    long-to-int v2, v4

    .line 751
    invoke-virtual {v0, v2}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {v1, v0}, Lo3/t;->a(Lq2/x;)Lo3/t;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    :cond_1b
    move-object v5, v1

    .line 764
    const-wide/32 v24, 0xf4240

    .line 765
    .line 766
    .line 767
    iget-wide v0, v5, Lo3/t;->c:J

    .line 768
    .line 769
    move-wide/from16 v26, v0

    .line 770
    .line 771
    invoke-static/range {v22 .. v27}, Lt2/a0;->m1(JJJ)J

    .line 772
    .line 773
    .line 774
    move-result-wide v11

    .line 775
    iget-object v0, v5, Lo3/t;->i:[J

    .line 776
    .line 777
    const-wide/32 v1, 0xf4240

    .line 778
    .line 779
    .line 780
    if-nez v0, :cond_1c

    .line 781
    .line 782
    iget-wide v3, v5, Lo3/t;->c:J

    .line 783
    .line 784
    invoke-static {v9, v1, v2, v3, v4}, Lt2/a0;->n1([JJJ)V

    .line 785
    .line 786
    .line 787
    new-instance v4, Lo3/w;

    .line 788
    .line 789
    invoke-direct/range {v4 .. v12}, Lo3/w;-><init>(Lo3/t;[J[II[J[IJ)V

    .line 790
    .line 791
    .line 792
    return-object v4

    .line 793
    :cond_1c
    move-object v4, v10

    .line 794
    array-length v0, v0

    .line 795
    move/from16 v10, p0

    .line 796
    .line 797
    if-ne v0, v10, :cond_1d

    .line 798
    .line 799
    iget v0, v5, Lo3/t;->b:I

    .line 800
    .line 801
    if-ne v0, v10, :cond_1d

    .line 802
    .line 803
    array-length v0, v9

    .line 804
    const/4 v10, 0x2

    .line 805
    if-lt v0, v10, :cond_1d

    .line 806
    .line 807
    iget-object v0, v5, Lo3/t;->j:[J

    .line 808
    .line 809
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    check-cast v0, [J

    .line 814
    .line 815
    aget-wide v12, v0, v20

    .line 816
    .line 817
    iget-object v0, v5, Lo3/t;->i:[J

    .line 818
    .line 819
    aget-wide v24, v0, v20

    .line 820
    .line 821
    iget-wide v10, v5, Lo3/t;->c:J

    .line 822
    .line 823
    iget-wide v14, v5, Lo3/t;->d:J

    .line 824
    .line 825
    move-wide/from16 v26, v10

    .line 826
    .line 827
    move-wide/from16 v28, v14

    .line 828
    .line 829
    invoke-static/range {v24 .. v29}, Lt2/a0;->m1(JJJ)J

    .line 830
    .line 831
    .line 832
    move-result-wide v10

    .line 833
    add-long v14, v12, v10

    .line 834
    .line 835
    move-wide/from16 v10, v22

    .line 836
    .line 837
    invoke-static/range {v9 .. v15}, Lo3/b;->b([JJJJ)Z

    .line 838
    .line 839
    .line 840
    move-result v0

    .line 841
    if-eqz v0, :cond_1d

    .line 842
    .line 843
    sub-long v24, v22, v14

    .line 844
    .line 845
    aget-wide v10, v9, v20

    .line 846
    .line 847
    sub-long v26, v12, v10

    .line 848
    .line 849
    iget-object v0, v5, Lo3/t;->g:Lq2/x;

    .line 850
    .line 851
    iget v0, v0, Lq2/x;->H:I

    .line 852
    .line 853
    int-to-long v10, v0

    .line 854
    iget-wide v12, v5, Lo3/t;->c:J

    .line 855
    .line 856
    move-wide/from16 v28, v10

    .line 857
    .line 858
    move-wide/from16 v30, v12

    .line 859
    .line 860
    invoke-static/range {v26 .. v31}, Lt2/a0;->m1(JJJ)J

    .line 861
    .line 862
    .line 863
    move-result-wide v10

    .line 864
    iget-object v0, v5, Lo3/t;->g:Lq2/x;

    .line 865
    .line 866
    iget v0, v0, Lq2/x;->H:I

    .line 867
    .line 868
    int-to-long v12, v0

    .line 869
    iget-wide v14, v5, Lo3/t;->c:J

    .line 870
    .line 871
    move-wide/from16 v26, v12

    .line 872
    .line 873
    move-wide/from16 v28, v14

    .line 874
    .line 875
    invoke-static/range {v24 .. v29}, Lt2/a0;->m1(JJJ)J

    .line 876
    .line 877
    .line 878
    move-result-wide v12

    .line 879
    cmp-long v0, v10, v16

    .line 880
    .line 881
    if-nez v0, :cond_1e

    .line 882
    .line 883
    cmp-long v0, v12, v16

    .line 884
    .line 885
    if-eqz v0, :cond_1d

    .line 886
    .line 887
    goto :goto_13

    .line 888
    :cond_1d
    move-object v10, v4

    .line 889
    goto :goto_14

    .line 890
    :cond_1e
    :goto_13
    cmp-long v0, v10, v18

    .line 891
    .line 892
    if-gtz v0, :cond_1d

    .line 893
    .line 894
    cmp-long v0, v12, v18

    .line 895
    .line 896
    if-gtz v0, :cond_1d

    .line 897
    .line 898
    long-to-int v0, v10

    .line 899
    move-object/from16 v3, p2

    .line 900
    .line 901
    iput v0, v3, LU2/B;->a:I

    .line 902
    .line 903
    long-to-int v0, v12

    .line 904
    iput v0, v3, LU2/B;->b:I

    .line 905
    .line 906
    iget-wide v10, v5, Lo3/t;->c:J

    .line 907
    .line 908
    invoke-static {v9, v1, v2, v10, v11}, Lt2/a0;->n1([JJJ)V

    .line 909
    .line 910
    .line 911
    iget-object v0, v5, Lo3/t;->i:[J

    .line 912
    .line 913
    aget-wide v10, v0, v20

    .line 914
    .line 915
    const-wide/32 v12, 0xf4240

    .line 916
    .line 917
    .line 918
    iget-wide v14, v5, Lo3/t;->d:J

    .line 919
    .line 920
    invoke-static/range {v10 .. v15}, Lt2/a0;->m1(JJJ)J

    .line 921
    .line 922
    .line 923
    move-result-wide v11

    .line 924
    move-object v10, v4

    .line 925
    new-instance v4, Lo3/w;

    .line 926
    .line 927
    invoke-direct/range {v4 .. v12}, Lo3/w;-><init>(Lo3/t;[J[II[J[IJ)V

    .line 928
    .line 929
    .line 930
    return-object v4

    .line 931
    :goto_14
    iget-object v0, v5, Lo3/t;->i:[J

    .line 932
    .line 933
    array-length v1, v0

    .line 934
    const/4 v2, 0x1

    .line 935
    if-ne v1, v2, :cond_20

    .line 936
    .line 937
    aget-wide v1, v0, v20

    .line 938
    .line 939
    cmp-long v1, v1, v16

    .line 940
    .line 941
    if-nez v1, :cond_20

    .line 942
    .line 943
    iget-object v0, v5, Lo3/t;->j:[J

    .line 944
    .line 945
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    check-cast v0, [J

    .line 950
    .line 951
    aget-wide v1, v0, v20

    .line 952
    .line 953
    move/from16 v0, v20

    .line 954
    .line 955
    :goto_15
    array-length v3, v9

    .line 956
    if-ge v0, v3, :cond_1f

    .line 957
    .line 958
    aget-wide v3, v9, v0

    .line 959
    .line 960
    sub-long v11, v3, v1

    .line 961
    .line 962
    const-wide/32 v13, 0xf4240

    .line 963
    .line 964
    .line 965
    iget-wide v3, v5, Lo3/t;->c:J

    .line 966
    .line 967
    move-wide v15, v3

    .line 968
    invoke-static/range {v11 .. v16}, Lt2/a0;->m1(JJJ)J

    .line 969
    .line 970
    .line 971
    move-result-wide v3

    .line 972
    aput-wide v3, v9, v0

    .line 973
    .line 974
    add-int/lit8 v0, v0, 0x1

    .line 975
    .line 976
    goto :goto_15

    .line 977
    :cond_1f
    sub-long v11, v22, v1

    .line 978
    .line 979
    const-wide/32 v13, 0xf4240

    .line 980
    .line 981
    .line 982
    iget-wide v0, v5, Lo3/t;->c:J

    .line 983
    .line 984
    move-wide v15, v0

    .line 985
    invoke-static/range {v11 .. v16}, Lt2/a0;->m1(JJJ)J

    .line 986
    .line 987
    .line 988
    move-result-wide v11

    .line 989
    new-instance v4, Lo3/w;

    .line 990
    .line 991
    invoke-direct/range {v4 .. v12}, Lo3/w;-><init>(Lo3/t;[J[II[J[IJ)V

    .line 992
    .line 993
    .line 994
    return-object v4

    .line 995
    :cond_20
    iget v1, v5, Lo3/t;->b:I

    .line 996
    .line 997
    const/4 v2, 0x1

    .line 998
    if-ne v1, v2, :cond_21

    .line 999
    .line 1000
    const/4 v1, 0x1

    .line 1001
    goto :goto_16

    .line 1002
    :cond_21
    move/from16 v1, v20

    .line 1003
    .line 1004
    :goto_16
    array-length v2, v0

    .line 1005
    new-array v2, v2, [I

    .line 1006
    .line 1007
    array-length v0, v0

    .line 1008
    new-array v0, v0, [I

    .line 1009
    .line 1010
    iget-object v4, v5, Lo3/t;->j:[J

    .line 1011
    .line 1012
    invoke-static {v4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v4

    .line 1016
    check-cast v4, [J

    .line 1017
    .line 1018
    move/from16 v11, v20

    .line 1019
    .line 1020
    move v12, v11

    .line 1021
    move v13, v12

    .line 1022
    move v14, v13

    .line 1023
    :goto_17
    iget-object v15, v5, Lo3/t;->i:[J

    .line 1024
    .line 1025
    move-object/from16 v18, v0

    .line 1026
    .line 1027
    array-length v0, v15

    .line 1028
    if-ge v11, v0, :cond_27

    .line 1029
    .line 1030
    move v0, v11

    .line 1031
    move/from16 p1, v12

    .line 1032
    .line 1033
    aget-wide v11, v4, v0

    .line 1034
    .line 1035
    const-wide/16 v22, -0x1

    .line 1036
    .line 1037
    cmp-long v19, v11, v22

    .line 1038
    .line 1039
    if-eqz v19, :cond_26

    .line 1040
    .line 1041
    aget-wide v22, v15, v0

    .line 1042
    .line 1043
    move-object v15, v7

    .line 1044
    move/from16 p2, v8

    .line 1045
    .line 1046
    iget-wide v7, v5, Lo3/t;->c:J

    .line 1047
    .line 1048
    move-wide/from16 v24, v7

    .line 1049
    .line 1050
    iget-wide v7, v5, Lo3/t;->d:J

    .line 1051
    .line 1052
    move-wide/from16 v26, v7

    .line 1053
    .line 1054
    invoke-static/range {v22 .. v27}, Lt2/a0;->m1(JJJ)J

    .line 1055
    .line 1056
    .line 1057
    move-result-wide v7

    .line 1058
    move/from16 v19, v0

    .line 1059
    .line 1060
    const/4 v0, 0x1

    .line 1061
    invoke-static {v9, v11, v12, v0, v0}, Lt2/a0;->k([JJZZ)I

    .line 1062
    .line 1063
    .line 1064
    move-result v22

    .line 1065
    aput v22, v2, v19

    .line 1066
    .line 1067
    add-long/2addr v11, v7

    .line 1068
    move/from16 v8, v20

    .line 1069
    .line 1070
    invoke-static {v9, v11, v12, v1, v8}, Lt2/a0;->g([JJZZ)I

    .line 1071
    .line 1072
    .line 1073
    move-result v7

    .line 1074
    aput v7, v18, v19

    .line 1075
    .line 1076
    aget v7, v2, v19

    .line 1077
    .line 1078
    :goto_18
    aget v20, v2, v19

    .line 1079
    .line 1080
    if-ltz v20, :cond_22

    .line 1081
    .line 1082
    aget v22, v10, v20

    .line 1083
    .line 1084
    and-int/lit8 v22, v22, 0x1

    .line 1085
    .line 1086
    if-nez v22, :cond_22

    .line 1087
    .line 1088
    add-int/lit8 v20, v20, -0x1

    .line 1089
    .line 1090
    aput v20, v2, v19

    .line 1091
    .line 1092
    const/4 v0, 0x1

    .line 1093
    goto :goto_18

    .line 1094
    :cond_22
    if-gez v20, :cond_23

    .line 1095
    .line 1096
    aput v7, v2, v19

    .line 1097
    .line 1098
    :goto_19
    aget v0, v2, v19

    .line 1099
    .line 1100
    aget v7, v18, v19

    .line 1101
    .line 1102
    if-ge v0, v7, :cond_23

    .line 1103
    .line 1104
    aget v7, v10, v0

    .line 1105
    .line 1106
    const/16 v20, 0x1

    .line 1107
    .line 1108
    and-int/lit8 v7, v7, 0x1

    .line 1109
    .line 1110
    if-nez v7, :cond_23

    .line 1111
    .line 1112
    add-int/lit8 v0, v0, 0x1

    .line 1113
    .line 1114
    aput v0, v2, v19

    .line 1115
    .line 1116
    goto :goto_19

    .line 1117
    :cond_23
    iget v0, v5, Lo3/t;->b:I

    .line 1118
    .line 1119
    const/4 v7, 0x2

    .line 1120
    if-ne v0, v7, :cond_24

    .line 1121
    .line 1122
    aget v0, v2, v19

    .line 1123
    .line 1124
    aget v7, v18, v19

    .line 1125
    .line 1126
    if-eq v0, v7, :cond_24

    .line 1127
    .line 1128
    :goto_1a
    aget v0, v18, v19

    .line 1129
    .line 1130
    array-length v7, v9

    .line 1131
    const/16 v20, 0x1

    .line 1132
    .line 1133
    add-int/lit8 v7, v7, -0x1

    .line 1134
    .line 1135
    if-ge v0, v7, :cond_24

    .line 1136
    .line 1137
    add-int/lit8 v7, v0, 0x1

    .line 1138
    .line 1139
    aget-wide v22, v9, v7

    .line 1140
    .line 1141
    cmp-long v7, v22, v11

    .line 1142
    .line 1143
    if-gtz v7, :cond_24

    .line 1144
    .line 1145
    add-int/lit8 v0, v0, 0x1

    .line 1146
    .line 1147
    aput v0, v18, v19

    .line 1148
    .line 1149
    goto :goto_1a

    .line 1150
    :cond_24
    aget v0, v18, v19

    .line 1151
    .line 1152
    aget v7, v2, v19

    .line 1153
    .line 1154
    sub-int v11, v0, v7

    .line 1155
    .line 1156
    add-int/2addr v13, v11

    .line 1157
    if-eq v14, v7, :cond_25

    .line 1158
    .line 1159
    const/4 v7, 0x1

    .line 1160
    goto :goto_1b

    .line 1161
    :cond_25
    move v7, v8

    .line 1162
    :goto_1b
    or-int v12, p1, v7

    .line 1163
    .line 1164
    move v14, v0

    .line 1165
    goto :goto_1c

    .line 1166
    :cond_26
    move/from16 v19, v0

    .line 1167
    .line 1168
    move-object v15, v7

    .line 1169
    move/from16 p2, v8

    .line 1170
    .line 1171
    move/from16 v8, v20

    .line 1172
    .line 1173
    move/from16 v12, p1

    .line 1174
    .line 1175
    :goto_1c
    add-int/lit8 v11, v19, 0x1

    .line 1176
    .line 1177
    move/from16 v20, v8

    .line 1178
    .line 1179
    move-object v7, v15

    .line 1180
    move-object/from16 v0, v18

    .line 1181
    .line 1182
    move/from16 v8, p2

    .line 1183
    .line 1184
    goto/16 :goto_17

    .line 1185
    .line 1186
    :cond_27
    move-object v15, v7

    .line 1187
    move/from16 p2, v8

    .line 1188
    .line 1189
    move/from16 p1, v12

    .line 1190
    .line 1191
    move/from16 v8, v20

    .line 1192
    .line 1193
    if-eq v13, v3, :cond_28

    .line 1194
    .line 1195
    const/4 v0, 0x1

    .line 1196
    goto :goto_1d

    .line 1197
    :cond_28
    move v0, v8

    .line 1198
    :goto_1d
    or-int v0, p1, v0

    .line 1199
    .line 1200
    if-eqz v0, :cond_29

    .line 1201
    .line 1202
    new-array v1, v13, [J

    .line 1203
    .line 1204
    goto :goto_1e

    .line 1205
    :cond_29
    move-object v1, v6

    .line 1206
    :goto_1e
    if-eqz v0, :cond_2a

    .line 1207
    .line 1208
    new-array v7, v13, [I

    .line 1209
    .line 1210
    goto :goto_1f

    .line 1211
    :cond_2a
    move-object v7, v15

    .line 1212
    :goto_1f
    if-eqz v0, :cond_2b

    .line 1213
    .line 1214
    move v3, v8

    .line 1215
    goto :goto_20

    .line 1216
    :cond_2b
    move/from16 v3, p2

    .line 1217
    .line 1218
    :goto_20
    if-eqz v0, :cond_2c

    .line 1219
    .line 1220
    new-array v4, v13, [I

    .line 1221
    .line 1222
    goto :goto_21

    .line 1223
    :cond_2c
    move-object v4, v10

    .line 1224
    :goto_21
    new-array v11, v13, [J

    .line 1225
    .line 1226
    move/from16 v23, v3

    .line 1227
    .line 1228
    move v3, v8

    .line 1229
    move v12, v3

    .line 1230
    move-wide/from16 v24, v16

    .line 1231
    .line 1232
    :goto_22
    iget-object v13, v5, Lo3/t;->i:[J

    .line 1233
    .line 1234
    array-length v13, v13

    .line 1235
    if-ge v8, v13, :cond_31

    .line 1236
    .line 1237
    iget-object v13, v5, Lo3/t;->j:[J

    .line 1238
    .line 1239
    aget-wide v19, v13, v8

    .line 1240
    .line 1241
    aget v13, v2, v8

    .line 1242
    .line 1243
    aget v14, v18, v8

    .line 1244
    .line 1245
    move/from16 p1, v0

    .line 1246
    .line 1247
    if-eqz v0, :cond_2d

    .line 1248
    .line 1249
    sub-int v0, v14, v13

    .line 1250
    .line 1251
    invoke-static {v6, v13, v1, v12, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1252
    .line 1253
    .line 1254
    invoke-static {v15, v13, v7, v12, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1255
    .line 1256
    .line 1257
    invoke-static {v10, v13, v4, v12, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1258
    .line 1259
    .line 1260
    :cond_2d
    move/from16 v0, v23

    .line 1261
    .line 1262
    :goto_23
    if-ge v13, v14, :cond_30

    .line 1263
    .line 1264
    const-wide/32 v26, 0xf4240

    .line 1265
    .line 1266
    .line 1267
    move-object/from16 v22, v1

    .line 1268
    .line 1269
    move-object/from16 v21, v2

    .line 1270
    .line 1271
    iget-wide v1, v5, Lo3/t;->d:J

    .line 1272
    .line 1273
    move-wide/from16 v28, v1

    .line 1274
    .line 1275
    invoke-static/range {v24 .. v29}, Lt2/a0;->m1(JJJ)J

    .line 1276
    .line 1277
    .line 1278
    move-result-wide v1

    .line 1279
    aget-wide v26, v9, v13

    .line 1280
    .line 1281
    sub-long v28, v26, v19

    .line 1282
    .line 1283
    const-wide/32 v30, 0xf4240

    .line 1284
    .line 1285
    .line 1286
    move-wide/from16 v26, v1

    .line 1287
    .line 1288
    iget-wide v1, v5, Lo3/t;->c:J

    .line 1289
    .line 1290
    move-wide/from16 v32, v1

    .line 1291
    .line 1292
    invoke-static/range {v28 .. v33}, Lt2/a0;->m1(JJJ)J

    .line 1293
    .line 1294
    .line 1295
    move-result-wide v1

    .line 1296
    cmp-long v23, v1, v16

    .line 1297
    .line 1298
    if-gez v23, :cond_2e

    .line 1299
    .line 1300
    const/4 v3, 0x1

    .line 1301
    :cond_2e
    add-long v1, v26, v1

    .line 1302
    .line 1303
    aput-wide v1, v11, v12

    .line 1304
    .line 1305
    if-eqz p1, :cond_2f

    .line 1306
    .line 1307
    aget v1, v7, v12

    .line 1308
    .line 1309
    if-le v1, v0, :cond_2f

    .line 1310
    .line 1311
    aget v0, v15, v13

    .line 1312
    .line 1313
    :cond_2f
    add-int/lit8 v12, v12, 0x1

    .line 1314
    .line 1315
    add-int/lit8 v13, v13, 0x1

    .line 1316
    .line 1317
    move-object/from16 v2, v21

    .line 1318
    .line 1319
    move-object/from16 v1, v22

    .line 1320
    .line 1321
    goto :goto_23

    .line 1322
    :cond_30
    move-object/from16 v22, v1

    .line 1323
    .line 1324
    move-object/from16 v21, v2

    .line 1325
    .line 1326
    iget-object v1, v5, Lo3/t;->i:[J

    .line 1327
    .line 1328
    aget-wide v13, v1, v8

    .line 1329
    .line 1330
    add-long v24, v24, v13

    .line 1331
    .line 1332
    add-int/lit8 v8, v8, 0x1

    .line 1333
    .line 1334
    move/from16 v23, v0

    .line 1335
    .line 1336
    move-object/from16 v1, v22

    .line 1337
    .line 1338
    move/from16 v0, p1

    .line 1339
    .line 1340
    goto :goto_22

    .line 1341
    :cond_31
    move-object/from16 v22, v1

    .line 1342
    .line 1343
    const-wide/32 v26, 0xf4240

    .line 1344
    .line 1345
    .line 1346
    iget-wide v0, v5, Lo3/t;->d:J

    .line 1347
    .line 1348
    move-wide/from16 v28, v0

    .line 1349
    .line 1350
    invoke-static/range {v24 .. v29}, Lt2/a0;->m1(JJJ)J

    .line 1351
    .line 1352
    .line 1353
    move-result-wide v26

    .line 1354
    if-eqz v3, :cond_32

    .line 1355
    .line 1356
    iget-object v0, v5, Lo3/t;->g:Lq2/x;

    .line 1357
    .line 1358
    invoke-virtual {v0}, Lq2/x;->b()Lq2/x$b;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    const/4 v2, 0x1

    .line 1363
    invoke-virtual {v0, v2}, Lq2/x$b;->g0(Z)Lq2/x$b;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    invoke-virtual {v5, v0}, Lo3/t;->a(Lq2/x;)Lo3/t;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v5

    .line 1375
    :cond_32
    move-object/from16 v20, v5

    .line 1376
    .line 1377
    new-instance v19, Lo3/w;

    .line 1378
    .line 1379
    move-object/from16 v25, v4

    .line 1380
    .line 1381
    move-object/from16 v24, v11

    .line 1382
    .line 1383
    move-object/from16 v21, v22

    .line 1384
    .line 1385
    move-object/from16 v22, v7

    .line 1386
    .line 1387
    invoke-direct/range {v19 .. v27}, Lo3/w;-><init>(Lo3/t;[J[II[J[IJ)V

    .line 1388
    .line 1389
    .line 1390
    return-object v19

    .line 1391
    :cond_33
    const-string v0, "Track has no sample table size information"

    .line 1392
    .line 1393
    const/4 v1, 0x0

    .line 1394
    invoke-static {v0, v1}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    throw v0
.end method

.method private static C(Lt2/I;II)Lo3/b$d;
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :goto_0
    sub-int v1, v0, p1

    .line 11
    .line 12
    if-ge v1, p2, :cond_5

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    move v4, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move v4, v2

    .line 28
    :goto_1
    const-string v5, "childAtomSize must be positive"

    .line 29
    .line 30
    invoke-static {v4, v5}, LU2/s;->a(ZLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const v5, 0x73747269

    .line 38
    .line 39
    .line 40
    if-ne v4, v5, :cond_4

    .line 41
    .line 42
    const/4 p1, 0x4

    .line 43
    invoke-virtual {p0, p1}, Lt2/I;->c0(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    new-instance p1, Lo3/b$d;

    .line 51
    .line 52
    new-instance p2, Lo3/b$g;

    .line 53
    .line 54
    and-int/lit8 v0, p0, 0x1

    .line 55
    .line 56
    if-ne v0, v3, :cond_1

    .line 57
    .line 58
    move v0, v3

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    move v0, v2

    .line 61
    :goto_2
    and-int/lit8 v1, p0, 0x2

    .line 62
    .line 63
    const/4 v4, 0x2

    .line 64
    if-ne v1, v4, :cond_2

    .line 65
    .line 66
    move v1, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    move v1, v2

    .line 69
    :goto_3
    const/16 v4, 0x8

    .line 70
    .line 71
    and-int/2addr p0, v4

    .line 72
    if-ne p0, v4, :cond_3

    .line 73
    .line 74
    move v2, v3

    .line 75
    :cond_3
    invoke-direct {p2, v0, v1, v2}, Lo3/b$g;-><init>(ZZZ)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p1, p2}, Lo3/b$d;-><init>(Lo3/b$g;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_4
    add-int/2addr v0, v1

    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const/4 p0, 0x0

    .line 85
    return-object p0
.end method

.method private static D(Lt2/I;Lo3/b$k;Ljava/lang/String;Lq2/q;Z)Lo3/b$h;
    .locals 12

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-instance v9, Lo3/b$h;

    .line 11
    .line 12
    invoke-direct {v9, v0}, Lo3/b$h;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    move v10, v11

    .line 17
    :goto_0
    if-ge v10, v0, :cond_9

    .line 18
    .line 19
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-lez v4, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v1, v11

    .line 32
    :goto_1
    const-string v2, "childAtomSize must be positive"

    .line 33
    .line 34
    invoke-static {v1, v2}, LU2/s;->a(ZLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const v1, 0x61766331

    .line 42
    .line 43
    .line 44
    if-eq v2, v1, :cond_7

    .line 45
    .line 46
    const v1, 0x61766333

    .line 47
    .line 48
    .line 49
    if-eq v2, v1, :cond_7

    .line 50
    .line 51
    const v1, 0x656e6376

    .line 52
    .line 53
    .line 54
    if-eq v2, v1, :cond_7

    .line 55
    .line 56
    const v1, 0x6d317620

    .line 57
    .line 58
    .line 59
    if-eq v2, v1, :cond_7

    .line 60
    .line 61
    const v1, 0x6d703476

    .line 62
    .line 63
    .line 64
    if-eq v2, v1, :cond_7

    .line 65
    .line 66
    const v1, 0x68766331

    .line 67
    .line 68
    .line 69
    if-eq v2, v1, :cond_7

    .line 70
    .line 71
    const v1, 0x68657631

    .line 72
    .line 73
    .line 74
    if-eq v2, v1, :cond_7

    .line 75
    .line 76
    const v1, 0x73323633

    .line 77
    .line 78
    .line 79
    if-eq v2, v1, :cond_7

    .line 80
    .line 81
    const v1, 0x48323633

    .line 82
    .line 83
    .line 84
    if-eq v2, v1, :cond_7

    .line 85
    .line 86
    const v1, 0x68323633

    .line 87
    .line 88
    .line 89
    if-eq v2, v1, :cond_7

    .line 90
    .line 91
    const v1, 0x76703038

    .line 92
    .line 93
    .line 94
    if-eq v2, v1, :cond_7

    .line 95
    .line 96
    const v1, 0x76703039

    .line 97
    .line 98
    .line 99
    if-eq v2, v1, :cond_7

    .line 100
    .line 101
    const v1, 0x61763031

    .line 102
    .line 103
    .line 104
    if-eq v2, v1, :cond_7

    .line 105
    .line 106
    const v1, 0x64766176

    .line 107
    .line 108
    .line 109
    if-eq v2, v1, :cond_7

    .line 110
    .line 111
    const v1, 0x64766131

    .line 112
    .line 113
    .line 114
    if-eq v2, v1, :cond_7

    .line 115
    .line 116
    const v1, 0x64766865

    .line 117
    .line 118
    .line 119
    if-eq v2, v1, :cond_7

    .line 120
    .line 121
    const v1, 0x64766831

    .line 122
    .line 123
    .line 124
    if-eq v2, v1, :cond_7

    .line 125
    .line 126
    const v1, 0x61707631

    .line 127
    .line 128
    .line 129
    if-ne v2, v1, :cond_1

    .line 130
    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :cond_1
    const v1, 0x6d703461

    .line 134
    .line 135
    .line 136
    if-eq v2, v1, :cond_6

    .line 137
    .line 138
    const v1, 0x656e6361

    .line 139
    .line 140
    .line 141
    if-eq v2, v1, :cond_6

    .line 142
    .line 143
    const v1, 0x61632d33

    .line 144
    .line 145
    .line 146
    if-eq v2, v1, :cond_6

    .line 147
    .line 148
    const v1, 0x65632d33

    .line 149
    .line 150
    .line 151
    if-eq v2, v1, :cond_6

    .line 152
    .line 153
    const v1, 0x61632d34

    .line 154
    .line 155
    .line 156
    if-eq v2, v1, :cond_6

    .line 157
    .line 158
    const v1, 0x6d6c7061

    .line 159
    .line 160
    .line 161
    if-eq v2, v1, :cond_6

    .line 162
    .line 163
    const v1, 0x64747363

    .line 164
    .line 165
    .line 166
    if-eq v2, v1, :cond_6

    .line 167
    .line 168
    const v1, 0x64747365

    .line 169
    .line 170
    .line 171
    if-eq v2, v1, :cond_6

    .line 172
    .line 173
    const v1, 0x64747368

    .line 174
    .line 175
    .line 176
    if-eq v2, v1, :cond_6

    .line 177
    .line 178
    const v1, 0x6474736c

    .line 179
    .line 180
    .line 181
    if-eq v2, v1, :cond_6

    .line 182
    .line 183
    const v1, 0x64747378

    .line 184
    .line 185
    .line 186
    if-eq v2, v1, :cond_6

    .line 187
    .line 188
    const v1, 0x73616d72

    .line 189
    .line 190
    .line 191
    if-eq v2, v1, :cond_6

    .line 192
    .line 193
    const v1, 0x73617762

    .line 194
    .line 195
    .line 196
    if-eq v2, v1, :cond_6

    .line 197
    .line 198
    const v1, 0x6c70636d

    .line 199
    .line 200
    .line 201
    if-eq v2, v1, :cond_6

    .line 202
    .line 203
    const v1, 0x736f7774

    .line 204
    .line 205
    .line 206
    if-eq v2, v1, :cond_6

    .line 207
    .line 208
    const v1, 0x74776f73

    .line 209
    .line 210
    .line 211
    if-eq v2, v1, :cond_6

    .line 212
    .line 213
    const v1, 0x2e6d7032

    .line 214
    .line 215
    .line 216
    if-eq v2, v1, :cond_6

    .line 217
    .line 218
    const v1, 0x2e6d7033

    .line 219
    .line 220
    .line 221
    if-eq v2, v1, :cond_6

    .line 222
    .line 223
    const v1, 0x6d686131

    .line 224
    .line 225
    .line 226
    if-eq v2, v1, :cond_6

    .line 227
    .line 228
    const v1, 0x6d686d31

    .line 229
    .line 230
    .line 231
    if-eq v2, v1, :cond_6

    .line 232
    .line 233
    const v1, 0x616c6163

    .line 234
    .line 235
    .line 236
    if-eq v2, v1, :cond_6

    .line 237
    .line 238
    const v1, 0x616c6177

    .line 239
    .line 240
    .line 241
    if-eq v2, v1, :cond_6

    .line 242
    .line 243
    const v1, 0x756c6177

    .line 244
    .line 245
    .line 246
    if-eq v2, v1, :cond_6

    .line 247
    .line 248
    const v1, 0x4f707573

    .line 249
    .line 250
    .line 251
    if-eq v2, v1, :cond_6

    .line 252
    .line 253
    const v1, 0x664c6143

    .line 254
    .line 255
    .line 256
    if-eq v2, v1, :cond_6

    .line 257
    .line 258
    const v1, 0x69616d66

    .line 259
    .line 260
    .line 261
    if-eq v2, v1, :cond_6

    .line 262
    .line 263
    const v1, 0x6970636d

    .line 264
    .line 265
    .line 266
    if-eq v2, v1, :cond_6

    .line 267
    .line 268
    const v1, 0x6670636d

    .line 269
    .line 270
    .line 271
    if-ne v2, v1, :cond_2

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_2
    const v1, 0x54544d4c

    .line 275
    .line 276
    .line 277
    if-eq v2, v1, :cond_3

    .line 278
    .line 279
    const v1, 0x74783367

    .line 280
    .line 281
    .line 282
    if-eq v2, v1, :cond_3

    .line 283
    .line 284
    const v1, 0x77767474

    .line 285
    .line 286
    .line 287
    if-eq v2, v1, :cond_3

    .line 288
    .line 289
    const v1, 0x73747070

    .line 290
    .line 291
    .line 292
    if-eq v2, v1, :cond_3

    .line 293
    .line 294
    const v1, 0x63363038

    .line 295
    .line 296
    .line 297
    if-eq v2, v1, :cond_3

    .line 298
    .line 299
    const v1, 0x6d703473

    .line 300
    .line 301
    .line 302
    if-ne v2, v1, :cond_4

    .line 303
    .line 304
    :cond_3
    move-object v1, p0

    .line 305
    move-object v5, p1

    .line 306
    move-object v6, p2

    .line 307
    move-object v7, v9

    .line 308
    goto :goto_2

    .line 309
    :cond_4
    const v1, 0x6d657474

    .line 310
    .line 311
    .line 312
    if-ne v2, v1, :cond_5

    .line 313
    .line 314
    invoke-static {p1}, Lo3/b$k;->c(Lo3/b$k;)I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    invoke-static {p0, v2, v3, v1, v9}, Lo3/b;->v(Lt2/I;IIILo3/b$h;)V

    .line 319
    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_5
    const v1, 0x63616d6d

    .line 323
    .line 324
    .line 325
    if-ne v2, v1, :cond_8

    .line 326
    .line 327
    new-instance v1, Lq2/x$b;

    .line 328
    .line 329
    invoke-direct {v1}, Lq2/x$b;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-static {p1}, Lo3/b$k;->c(Lo3/b$k;)I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    invoke-virtual {v1, v2}, Lq2/x$b;->i0(I)Lq2/x$b;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    const-string v2, "application/x-camera-motion"

    .line 341
    .line 342
    invoke-virtual {v1, v2}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {v1}, Lq2/x$b;->P()Lq2/x;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iput-object v1, v9, Lo3/b$h;->b:Lq2/x;

    .line 351
    .line 352
    goto :goto_5

    .line 353
    :goto_2
    invoke-static/range {v1 .. v7}, Lo3/b;->E(Lt2/I;IIILo3/b$k;Ljava/lang/String;Lo3/b$h;)V

    .line 354
    .line 355
    .line 356
    move-object v9, v7

    .line 357
    goto :goto_5

    .line 358
    :cond_6
    :goto_3
    invoke-static {p1}, Lo3/b$k;->c(Lo3/b$k;)I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    move-object v1, p0

    .line 363
    move-object v6, p2

    .line 364
    move-object v8, p3

    .line 365
    move/from16 v7, p4

    .line 366
    .line 367
    invoke-static/range {v1 .. v10}, Lo3/b;->i(Lt2/I;IIIILjava/lang/String;ZLq2/q;Lo3/b$h;I)V

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_7
    :goto_4
    invoke-static {p1}, Lo3/b$k;->c(Lo3/b$k;)I

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    invoke-static {p1}, Lo3/b$k;->d(Lo3/b$k;)I

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    move-object v1, p0

    .line 380
    move-object v6, p2

    .line 381
    move-object v8, p3

    .line 382
    invoke-static/range {v1 .. v10}, Lo3/b;->L(Lt2/I;IIIILjava/lang/String;ILq2/q;Lo3/b$h;I)V

    .line 383
    .line 384
    .line 385
    :cond_8
    :goto_5
    add-int/2addr v3, v4

    .line 386
    invoke-virtual {p0, v3}, Lt2/I;->b0(I)V

    .line 387
    .line 388
    .line 389
    add-int/lit8 v10, v10, 0x1

    .line 390
    .line 391
    goto/16 :goto_0

    .line 392
    .line 393
    :cond_9
    return-object v9
.end method

.method private static E(Lt2/I;IIILo3/b$k;Ljava/lang/String;Lo3/b$h;)V
    .locals 4

    .line 1
    add-int/lit8 p2, p2, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    const p2, 0x54544d4c

    .line 7
    .line 8
    .line 9
    const-string v0, "application/ttml+xml"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-wide v2, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    const p2, 0x74783367

    .line 22
    .line 23
    .line 24
    if-ne p1, p2, :cond_1

    .line 25
    .line 26
    add-int/lit8 p3, p3, -0x10

    .line 27
    .line 28
    new-array p1, p3, [B

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-virtual {p0, p1, p2, p3}, Lt2/I;->q([BII)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v0, "application/x-quicktime-tx3g"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const p2, 0x77767474

    .line 42
    .line 43
    .line 44
    if-ne p1, p2, :cond_2

    .line 45
    .line 46
    const-string v0, "application/x-mp4-vtt"

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const p2, 0x73747070

    .line 50
    .line 51
    .line 52
    if-ne p1, p2, :cond_3

    .line 53
    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const p2, 0x63363038

    .line 58
    .line 59
    .line 60
    if-ne p1, p2, :cond_4

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    iput p0, p6, Lo3/b$h;->d:I

    .line 64
    .line 65
    const-string v0, "application/x-mp4-cea-608"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const p2, 0x6d703473

    .line 69
    .line 70
    .line 71
    if-ne p1, p2, :cond_8

    .line 72
    .line 73
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/4 p2, 0x4

    .line 78
    invoke-virtual {p0, p2}, Lt2/I;->c0(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    const p3, 0x65736473

    .line 86
    .line 87
    .line 88
    if-ne p2, p3, :cond_6

    .line 89
    .line 90
    invoke-static {p0, p1}, Lo3/b;->n(Lt2/I;I)Lo3/b$c;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lo3/b$c;->d(Lo3/b$c;)[B

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    invoke-static {p0}, Lo3/b$c;->d(Lo3/b$c;)[B

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    array-length p1, p1

    .line 105
    const/16 p2, 0x40

    .line 106
    .line 107
    if-eq p1, p2, :cond_5

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    invoke-static {p0}, Lo3/b$c;->d(Lo3/b$c;)[B

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p4}, Lo3/b$k;->e(Lo3/b$k;)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-static {p4}, Lo3/b$k;->f(Lo3/b$k;)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-static {p0, p1, p2}, Lo3/b;->d([BII)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, Lt2/a0;->z0(Ljava/lang/String;)[B

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string p0, "application/vobsub"

    .line 135
    .line 136
    move-object v0, p0

    .line 137
    goto :goto_0

    .line 138
    :cond_6
    move-object v0, v1

    .line 139
    :goto_0
    if-eqz v0, :cond_7

    .line 140
    .line 141
    new-instance p0, Lq2/x$b;

    .line 142
    .line 143
    invoke-direct {p0}, Lq2/x$b;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-static {p4}, Lo3/b$k;->c(Lo3/b$k;)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    invoke-virtual {p0, p1}, Lq2/x$b;->i0(I)Lq2/x$b;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0, v0}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0, p5}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p0, v2, v3}, Lq2/x$b;->C0(J)Lq2/x$b;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p0, v1}, Lq2/x$b;->k0(Ljava/util/List;)Lq2/x$b;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0}, Lq2/x$b;->P()Lq2/x;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    iput-object p0, p6, Lo3/b$h;->b:Lq2/x;

    .line 175
    .line 176
    :cond_7
    :goto_1
    return-void

    .line 177
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 180
    .line 181
    .line 182
    throw p0
.end method

.method private static F(Lt2/I;)Lo3/b$k;
    .locals 12

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lo3/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move v3, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v2

    .line 21
    :goto_0
    invoke-virtual {p0, v3}, Lt2/I;->c0(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const/4 v3, 0x4

    .line 29
    invoke-virtual {p0, v3}, Lt2/I;->c0(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    move v0, v3

    .line 39
    :cond_1
    const/4 v6, 0x0

    .line 40
    move v7, v6

    .line 41
    :goto_1
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    if-ge v7, v0, :cond_5

    .line 47
    .line 48
    invoke-virtual {p0}, Lt2/I;->f()[B

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    add-int v11, v4, v7

    .line 53
    .line 54
    aget-byte v10, v10, v11

    .line 55
    .line 56
    const/4 v11, -0x1

    .line 57
    if-eq v10, v11, :cond_4

    .line 58
    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-virtual {p0}, Lt2/I;->T()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    :goto_2
    const-wide/16 v10, 0x0

    .line 71
    .line 72
    cmp-long v4, v0, v10

    .line 73
    .line 74
    if-nez v4, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    move-wide v8, v0

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 83
    .line 84
    .line 85
    :goto_3
    const/16 v0, 0xa

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 88
    .line 89
    .line 90
    move v0, v6

    .line 91
    move-wide v6, v8

    .line 92
    invoke-virtual {p0}, Lt2/I;->U()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-virtual {p0, v3}, Lt2/I;->c0(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-virtual {p0, v3}, Lt2/I;->c0(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    const/high16 v10, -0x10000

    .line 119
    .line 120
    const/high16 v11, 0x10000

    .line 121
    .line 122
    if-nez v1, :cond_8

    .line 123
    .line 124
    if-ne v4, v11, :cond_8

    .line 125
    .line 126
    if-eq v3, v10, :cond_6

    .line 127
    .line 128
    if-ne v3, v11, :cond_8

    .line 129
    .line 130
    :cond_6
    if-nez v9, :cond_8

    .line 131
    .line 132
    const/16 v0, 0x5a

    .line 133
    .line 134
    :cond_7
    :goto_4
    move v9, v0

    .line 135
    goto :goto_5

    .line 136
    :cond_8
    if-nez v1, :cond_a

    .line 137
    .line 138
    if-ne v4, v10, :cond_a

    .line 139
    .line 140
    if-eq v3, v11, :cond_9

    .line 141
    .line 142
    if-ne v3, v10, :cond_a

    .line 143
    .line 144
    :cond_9
    if-nez v9, :cond_a

    .line 145
    .line 146
    const/16 v0, 0x10e

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_a
    if-eq v1, v10, :cond_b

    .line 150
    .line 151
    if-ne v1, v11, :cond_7

    .line 152
    .line 153
    :cond_b
    if-nez v4, :cond_7

    .line 154
    .line 155
    if-nez v3, :cond_7

    .line 156
    .line 157
    if-ne v9, v10, :cond_7

    .line 158
    .line 159
    const/16 v0, 0xb4

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :goto_5
    invoke-virtual {p0, v2}, Lt2/I;->c0(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lt2/I;->I()S

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    const/4 v0, 0x2

    .line 170
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lt2/I;->I()S

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    new-instance v4, Lo3/b$k;

    .line 178
    .line 179
    invoke-direct/range {v4 .. v11}, Lo3/b$k;-><init>(IJIIII)V

    .line 180
    .line 181
    .line 182
    return-object v4
.end method

.method public static G(Lu2/e$b;Lu2/e$c;JLq2/q;ZZ)Lo3/t;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x6d646961

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lu2/e$b;

    .line 15
    .line 16
    const v2, 0x68646c72    # 4.3148E24f

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lu2/e$c;

    .line 28
    .line 29
    iget-object v2, v2, Lu2/e$c;->b:Lt2/I;

    .line 30
    .line 31
    invoke-static {v2}, Lo3/b;->r(Lt2/I;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Lo3/b;->f(I)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/4 v2, -0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    if-ne v5, v2, :cond_0

    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_0
    const v2, 0x746b6864

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Lu2/e$c;

    .line 56
    .line 57
    iget-object v2, v2, Lu2/e$c;->b:Lt2/I;

    .line 58
    .line 59
    invoke-static {v2}, Lo3/b;->F(Lt2/I;)Lo3/b$k;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long v4, p2, v6

    .line 69
    .line 70
    if-nez v4, :cond_1

    .line 71
    .line 72
    invoke-static {v2}, Lo3/b$k;->a(Lo3/b$k;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v8

    .line 76
    move-wide v10, v8

    .line 77
    :goto_0
    move-object/from16 v4, p1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move-wide/from16 v10, p2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :goto_1
    iget-object v4, v4, Lu2/e$c;->b:Lt2/I;

    .line 84
    .line 85
    invoke-static {v4}, Lo3/b;->w(Lt2/I;)Lu2/g;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iget-wide v14, v4, Lu2/g;->c:J

    .line 90
    .line 91
    cmp-long v4, v10, v6

    .line 92
    .line 93
    if-nez v4, :cond_2

    .line 94
    .line 95
    :goto_2
    move-wide v10, v6

    .line 96
    goto :goto_3

    .line 97
    :cond_2
    const-wide/32 v12, 0xf4240

    .line 98
    .line 99
    .line 100
    invoke-static/range {v10 .. v15}, Lt2/a0;->m1(JJJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v6

    .line 104
    goto :goto_2

    .line 105
    :goto_3
    const v4, 0x6d696e66

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v4}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Lu2/e$b;

    .line 117
    .line 118
    const v6, 0x7374626c

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v6}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Lu2/e$b;

    .line 130
    .line 131
    const v6, 0x6d646864

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v6}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Lu2/e$c;

    .line 143
    .line 144
    iget-object v1, v1, Lu2/e$c;->b:Lt2/I;

    .line 145
    .line 146
    invoke-static {v1}, Lo3/b;->t(Lt2/I;)Lo3/b$e;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    const v6, 0x73747364

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v6}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-eqz v4, :cond_7

    .line 158
    .line 159
    iget-object v4, v4, Lu2/e$c;->b:Lt2/I;

    .line 160
    .line 161
    invoke-static {v1}, Lo3/b$e;->a(Lo3/b$e;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    move-object/from16 v7, p4

    .line 166
    .line 167
    move/from16 v8, p6

    .line 168
    .line 169
    invoke-static {v4, v2, v6, v7, v8}, Lo3/b;->D(Lt2/I;Lo3/b$k;Ljava/lang/String;Lq2/q;Z)Lo3/b$h;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    if-nez p5, :cond_3

    .line 174
    .line 175
    const v6, 0x65647473

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v6}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_3

    .line 183
    .line 184
    invoke-static {v0}, Lo3/b;->m(Lu2/e$b;)Landroid/util/Pair;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    if-eqz v0, :cond_3

    .line 189
    .line 190
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v6, [J

    .line 193
    .line 194
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, [J

    .line 197
    .line 198
    move-object/from16 v19, v0

    .line 199
    .line 200
    move-object/from16 v18, v6

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_3
    move-object/from16 v18, v3

    .line 204
    .line 205
    move-object/from16 v19, v18

    .line 206
    .line 207
    :goto_4
    iget-object v0, v4, Lo3/b$h;->b:Lq2/x;

    .line 208
    .line 209
    if-nez v0, :cond_4

    .line 210
    .line 211
    return-object v3

    .line 212
    :cond_4
    invoke-static {v2}, Lo3/b$k;->b(Lo3/b$k;)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_6

    .line 217
    .line 218
    new-instance v0, Lu2/d;

    .line 219
    .line 220
    invoke-static {v2}, Lo3/b$k;->b(Lo3/b$k;)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-direct {v0, v3}, Lu2/d;-><init>(I)V

    .line 225
    .line 226
    .line 227
    iget-object v3, v4, Lo3/b$h;->b:Lq2/x;

    .line 228
    .line 229
    invoke-virtual {v3}, Lq2/x;->b()Lq2/x$b;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    iget-object v6, v4, Lo3/b$h;->b:Lq2/x;

    .line 234
    .line 235
    iget-object v6, v6, Lq2/x;->l:Lq2/J;

    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    const/4 v8, 0x1

    .line 239
    if-eqz v6, :cond_5

    .line 240
    .line 241
    new-array v8, v8, [Lq2/J$a;

    .line 242
    .line 243
    aput-object v0, v8, v7

    .line 244
    .line 245
    invoke-virtual {v6, v8}, Lq2/J;->a([Lq2/J$a;)Lq2/J;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    goto :goto_5

    .line 250
    :cond_5
    new-instance v6, Lq2/J;

    .line 251
    .line 252
    new-array v8, v8, [Lq2/J$a;

    .line 253
    .line 254
    aput-object v0, v8, v7

    .line 255
    .line 256
    invoke-direct {v6, v8}, Lq2/J;-><init>([Lq2/J$a;)V

    .line 257
    .line 258
    .line 259
    move-object v0, v6

    .line 260
    :goto_5
    invoke-virtual {v3, v0}, Lq2/x$b;->r0(Lq2/J;)Lq2/x$b;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    goto :goto_6

    .line 269
    :cond_6
    iget-object v0, v4, Lo3/b$h;->b:Lq2/x;

    .line 270
    .line 271
    :goto_6
    new-instance v3, Lo3/t;

    .line 272
    .line 273
    invoke-static {v2}, Lo3/b$k;->c(Lo3/b$k;)I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    invoke-static {v1}, Lo3/b$e;->b(Lo3/b$e;)J

    .line 278
    .line 279
    .line 280
    move-result-wide v6

    .line 281
    invoke-static {v1}, Lo3/b$e;->c(Lo3/b$e;)J

    .line 282
    .line 283
    .line 284
    move-result-wide v12

    .line 285
    move-wide v8, v14

    .line 286
    iget v15, v4, Lo3/b$h;->d:I

    .line 287
    .line 288
    iget-object v1, v4, Lo3/b$h;->a:[Lo3/u;

    .line 289
    .line 290
    iget v4, v4, Lo3/b$h;->c:I

    .line 291
    .line 292
    move-object v14, v0

    .line 293
    move-object/from16 v16, v1

    .line 294
    .line 295
    move/from16 v17, v4

    .line 296
    .line 297
    move v4, v2

    .line 298
    invoke-direct/range {v3 .. v19}, Lo3/t;-><init>(IIJJJJLq2/x;I[Lo3/u;I[J[J)V

    .line 299
    .line 300
    .line 301
    return-object v3

    .line 302
    :cond_7
    const-string v0, "Malformed sample table (stbl) missing sample description (stsd)"

    .line 303
    .line 304
    invoke-static {v0, v3}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    throw v0
.end method

.method public static H(Lu2/e$b;LU2/B;JLq2/q;ZZLO9/f;)Ljava/util/List;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lu2/e$b;->d:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_2

    .line 14
    .line 15
    iget-object v2, p0, Lu2/e$b;->d:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    move-object v3, v2

    .line 22
    check-cast v3, Lu2/e$b;

    .line 23
    .line 24
    iget v2, v3, Lu2/e;->a:I

    .line 25
    .line 26
    const v4, 0x7472616b

    .line 27
    .line 28
    .line 29
    if-eq v2, v4, :cond_0

    .line 30
    .line 31
    move-object/from16 v3, p7

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const v2, 0x6d766864

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v4, v2

    .line 46
    check-cast v4, Lu2/e$c;

    .line 47
    .line 48
    move-wide v5, p2

    .line 49
    move-object v7, p4

    .line 50
    move v8, p5

    .line 51
    move/from16 v9, p6

    .line 52
    .line 53
    invoke-static/range {v3 .. v9}, Lo3/b;->G(Lu2/e$b;Lu2/e$c;JLq2/q;ZZ)Lo3/t;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v4, v3

    .line 58
    move-object/from16 v3, p7

    .line 59
    .line 60
    invoke-interface {v3, v2}, LO9/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lo3/t;

    .line 65
    .line 66
    if-nez v2, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    const v5, 0x6d646961

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v5}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Lu2/e$b;

    .line 81
    .line 82
    const v5, 0x6d696e66

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v5}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {v4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lu2/e$b;

    .line 94
    .line 95
    const v5, 0x7374626c

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v5}, Lu2/e$b;->d(I)Lu2/e$b;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v4}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Lu2/e$b;

    .line 107
    .line 108
    invoke-static {v2, v4, p1}, Lo3/b;->B(Lo3/t;Lu2/e$b;LU2/B;)Lo3/w;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    return-object v0
.end method

.method public static I(Lu2/e$c;)Lq2/J;
    .locals 6

    .line 1
    iget-object p0, p0, Lu2/e$c;->b:Lt2/I;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lq2/J;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    new-array v2, v2, [Lq2/J$a;

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lq2/J;-><init>([Lq2/J$a;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lt2/I;->a()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-lt v2, v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const v5, 0x6d657461

    .line 35
    .line 36
    .line 37
    if-ne v4, v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lt2/I;->b0(I)V

    .line 40
    .line 41
    .line 42
    add-int v4, v2, v3

    .line 43
    .line 44
    invoke-static {p0, v4}, Lo3/b;->J(Lt2/I;I)Lq2/J;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v1, v4}, Lq2/J;->b(Lq2/J;)Lq2/J;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    const v5, 0x736d7461

    .line 54
    .line 55
    .line 56
    if-ne v4, v5, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lt2/I;->b0(I)V

    .line 59
    .line 60
    .line 61
    add-int v4, v2, v3

    .line 62
    .line 63
    invoke-static {p0, v4}, Lo3/r;->b(Lt2/I;I)Lq2/J;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v1, v4}, Lq2/J;->b(Lq2/J;)Lq2/J;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const v5, -0x56878686

    .line 73
    .line 74
    .line 75
    if-ne v4, v5, :cond_2

    .line 76
    .line 77
    invoke-static {p0}, Lo3/b;->M(Lt2/I;)Lq2/J;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v1, v4}, Lq2/J;->b(Lq2/J;)Lq2/J;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_2
    :goto_1
    add-int/2addr v2, v3

    .line 86
    invoke-virtual {p0, v2}, Lt2/I;->b0(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    return-object v1
.end method

.method private static J(Lt2/I;I)Lq2/J;
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lo3/b;->g(Lt2/I;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge v0, p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const v3, 0x696c7374

    .line 28
    .line 29
    .line 30
    if-ne v2, v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 33
    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    invoke-static {p0, v0}, Lo3/b;->s(Lt2/I;I)Lq2/J;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    add-int/2addr v0, v1

    .line 42
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method static K(Lt2/I;II)Lo3/b$l;
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move-object v2, v1

    .line 12
    :goto_0
    sub-int v3, v0, p1

    .line 13
    .line 14
    if-ge v3, p2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-lez v3, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/4 v4, 0x0

    .line 28
    :goto_1
    const-string v5, "childAtomSize must be positive"

    .line 29
    .line 30
    invoke-static {v4, v5}, LU2/s;->a(ZLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const v5, 0x65796573

    .line 38
    .line 39
    .line 40
    if-ne v4, v5, :cond_1

    .line 41
    .line 42
    invoke-static {p0, v0, v3}, Lo3/b;->C(Lt2/I;II)Lo3/b$d;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :cond_1
    add-int/2addr v0, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    if-nez v2, :cond_3

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_3
    new-instance p0, Lo3/b$l;

    .line 52
    .line 53
    invoke-direct {p0, v2}, Lo3/b$l;-><init>(Lo3/b$d;)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method private static L(Lt2/I;IIIILjava/lang/String;ILq2/q;Lo3/b$h;I)V
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    move-object/from16 v4, p8

    .line 10
    .line 11
    add-int/lit8 v5, v1, 0x10

    .line 12
    .line 13
    invoke-virtual {v0, v5}, Lt2/I;->b0(I)V

    .line 14
    .line 15
    .line 16
    const/16 v5, 0x10

    .line 17
    .line 18
    invoke-virtual {v0, v5}, Lt2/I;->c0(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const/16 v7, 0x32

    .line 30
    .line 31
    invoke-virtual {v0, v7}, Lt2/I;->c0(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lt2/I;->g()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const v8, 0x656e6376

    .line 39
    .line 40
    .line 41
    move/from16 v10, p1

    .line 42
    .line 43
    if-ne v10, v8, :cond_2

    .line 44
    .line 45
    invoke-static {v0, v1, v2}, Lo3/b;->z(Lt2/I;II)Landroid/util/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    if-eqz v8, :cond_1

    .line 50
    .line 51
    iget-object v10, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v10, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-nez v3, :cond_0

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object v11, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v11, Lo3/u;

    .line 66
    .line 67
    iget-object v11, v11, Lo3/u;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v3, v11}, Lq2/q;->c(Ljava/lang/String;)Lq2/q;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :goto_0
    iget-object v11, v4, Lo3/b$h;->a:[Lo3/u;

    .line 74
    .line 75
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v8, Lo3/u;

    .line 78
    .line 79
    aput-object v8, v11, p9

    .line 80
    .line 81
    :cond_1
    invoke-virtual {v0, v7}, Lt2/I;->b0(I)V

    .line 82
    .line 83
    .line 84
    :cond_2
    const v8, 0x6d317620

    .line 85
    .line 86
    .line 87
    const-string v11, "video/3gpp"

    .line 88
    .line 89
    if-ne v10, v8, :cond_3

    .line 90
    .line 91
    const-string v8, "video/mpeg"

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const v8, 0x48323633

    .line 95
    .line 96
    .line 97
    if-ne v10, v8, :cond_4

    .line 98
    .line 99
    move-object v8, v11

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    const/4 v8, 0x0

    .line 102
    :goto_1
    const/high16 v14, 0x3f800000    # 1.0f

    .line 103
    .line 104
    const/16 v15, 0x8

    .line 105
    .line 106
    move v13, v15

    .line 107
    const/16 v16, 0x0

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    const/16 v19, 0x0

    .line 114
    .line 115
    const/16 v20, -0x1

    .line 116
    .line 117
    const/16 v21, -0x1

    .line 118
    .line 119
    const/16 v22, -0x1

    .line 120
    .line 121
    const/16 v23, -0x1

    .line 122
    .line 123
    const/16 v24, -0x1

    .line 124
    .line 125
    const/16 v25, -0x1

    .line 126
    .line 127
    const/16 v26, -0x1

    .line 128
    .line 129
    const/16 v27, -0x1

    .line 130
    .line 131
    const/16 v28, 0x0

    .line 132
    .line 133
    const/16 v29, 0x0

    .line 134
    .line 135
    const/16 v30, 0x0

    .line 136
    .line 137
    const/16 v31, 0x0

    .line 138
    .line 139
    :goto_2
    sub-int v12, v7, v1

    .line 140
    .line 141
    if-ge v12, v2, :cond_5

    .line 142
    .line 143
    invoke-virtual {v0, v7}, Lt2/I;->b0(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Lt2/I;->g()I

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-nez v9, :cond_6

    .line 155
    .line 156
    invoke-virtual {v0}, Lt2/I;->g()I

    .line 157
    .line 158
    .line 159
    move-result v32

    .line 160
    sub-int v1, v32, p2

    .line 161
    .line 162
    if-ne v1, v2, :cond_6

    .line 163
    .line 164
    :cond_5
    move-object/from16 v30, v3

    .line 165
    .line 166
    move/from16 v40, v14

    .line 167
    .line 168
    move-object/from16 v7, v17

    .line 169
    .line 170
    move/from16 v37, v20

    .line 171
    .line 172
    move/from16 v11, v25

    .line 173
    .line 174
    move/from16 v35, v26

    .line 175
    .line 176
    move/from16 v3, v27

    .line 177
    .line 178
    const/4 v2, 0x0

    .line 179
    move/from16 v25, v13

    .line 180
    .line 181
    move/from16 v27, v15

    .line 182
    .line 183
    goto/16 :goto_2d

    .line 184
    .line 185
    :cond_6
    if-lez v9, :cond_7

    .line 186
    .line 187
    const/4 v1, 0x1

    .line 188
    :goto_3
    const/16 p9, 0x1

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_7
    const/4 v1, 0x0

    .line 192
    goto :goto_3

    .line 193
    :goto_4
    const-string v2, "childAtomSize must be positive"

    .line 194
    .line 195
    invoke-static {v1, v2}, LU2/s;->a(ZLjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    const v2, 0x61766343

    .line 203
    .line 204
    .line 205
    if-ne v1, v2, :cond_a

    .line 206
    .line 207
    if-nez v8, :cond_8

    .line 208
    .line 209
    move/from16 v1, p9

    .line 210
    .line 211
    :goto_5
    const/4 v2, 0x0

    .line 212
    goto :goto_6

    .line 213
    :cond_8
    const/4 v1, 0x0

    .line 214
    goto :goto_5

    .line 215
    :goto_6
    invoke-static {v1, v2}, LU2/s;->a(ZLjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    add-int/lit8 v12, v12, 0x8

    .line 219
    .line 220
    invoke-virtual {v0, v12}, Lt2/I;->b0(I)V

    .line 221
    .line 222
    .line 223
    invoke-static {v0}, LU2/d;->b(Lt2/I;)LU2/d;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iget-object v2, v1, LU2/d;->a:Ljava/util/List;

    .line 228
    .line 229
    iget v8, v1, LU2/d;->b:I

    .line 230
    .line 231
    iput v8, v4, Lo3/b$h;->c:I

    .line 232
    .line 233
    if-nez v31, :cond_9

    .line 234
    .line 235
    iget v14, v1, LU2/d;->k:F

    .line 236
    .line 237
    :cond_9
    iget-object v8, v1, LU2/d;->l:Ljava/lang/String;

    .line 238
    .line 239
    iget v12, v1, LU2/d;->j:I

    .line 240
    .line 241
    iget v13, v1, LU2/d;->g:I

    .line 242
    .line 243
    iget v15, v1, LU2/d;->h:I

    .line 244
    .line 245
    move-object/from16 v17, v2

    .line 246
    .line 247
    iget v2, v1, LU2/d;->i:I

    .line 248
    .line 249
    move/from16 v18, v2

    .line 250
    .line 251
    iget v2, v1, LU2/d;->e:I

    .line 252
    .line 253
    iget v1, v1, LU2/d;->f:I

    .line 254
    .line 255
    const-string v21, "video/avc"

    .line 256
    .line 257
    move-object/from16 v25, v30

    .line 258
    .line 259
    move-object/from16 v30, v3

    .line 260
    .line 261
    move-object/from16 v3, v25

    .line 262
    .line 263
    move/from16 v25, v1

    .line 264
    .line 265
    move/from16 v32, v7

    .line 266
    .line 267
    move/from16 v26, v10

    .line 268
    .line 269
    move-object/from16 v33, v11

    .line 270
    .line 271
    move/from16 v34, v13

    .line 272
    .line 273
    move/from16 v35, v15

    .line 274
    .line 275
    move/from16 v27, v18

    .line 276
    .line 277
    const/4 v1, -0x1

    .line 278
    const/4 v13, 0x0

    .line 279
    move v15, v2

    .line 280
    move-object/from16 v18, v8

    .line 281
    .line 282
    move-object/from16 v8, v21

    .line 283
    .line 284
    const/4 v2, 0x0

    .line 285
    move/from16 v21, v12

    .line 286
    .line 287
    goto/16 :goto_2c

    .line 288
    .line 289
    :cond_a
    const v2, 0x68766343

    .line 290
    .line 291
    .line 292
    move/from16 v32, v7

    .line 293
    .line 294
    const-string v7, "video/hevc"

    .line 295
    .line 296
    if-ne v1, v2, :cond_e

    .line 297
    .line 298
    if-nez v8, :cond_b

    .line 299
    .line 300
    move/from16 v1, p9

    .line 301
    .line 302
    :goto_7
    const/4 v2, 0x0

    .line 303
    goto :goto_8

    .line 304
    :cond_b
    const/4 v1, 0x0

    .line 305
    goto :goto_7

    .line 306
    :goto_8
    invoke-static {v1, v2}, LU2/s;->a(ZLjava/lang/String;)V

    .line 307
    .line 308
    .line 309
    add-int/lit8 v12, v12, 0x8

    .line 310
    .line 311
    invoke-virtual {v0, v12}, Lt2/I;->b0(I)V

    .line 312
    .line 313
    .line 314
    invoke-static {v0}, LU2/C;->a(Lt2/I;)LU2/C;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    iget-object v2, v1, LU2/C;->a:Ljava/util/List;

    .line 319
    .line 320
    iget v8, v1, LU2/C;->b:I

    .line 321
    .line 322
    iput v8, v4, Lo3/b$h;->c:I

    .line 323
    .line 324
    if-nez v31, :cond_c

    .line 325
    .line 326
    iget v14, v1, LU2/C;->n:F

    .line 327
    .line 328
    :cond_c
    iget v8, v1, LU2/C;->o:I

    .line 329
    .line 330
    iget v12, v1, LU2/C;->c:I

    .line 331
    .line 332
    iget-object v13, v1, LU2/C;->p:Ljava/lang/String;

    .line 333
    .line 334
    iget v15, v1, LU2/C;->m:I

    .line 335
    .line 336
    move-object/from16 v17, v2

    .line 337
    .line 338
    const/4 v2, -0x1

    .line 339
    if-eq v15, v2, :cond_d

    .line 340
    .line 341
    move/from16 v20, v15

    .line 342
    .line 343
    :cond_d
    iget v2, v1, LU2/C;->f:I

    .line 344
    .line 345
    iget v15, v1, LU2/C;->g:I

    .line 346
    .line 347
    move/from16 v18, v2

    .line 348
    .line 349
    iget v2, v1, LU2/C;->j:I

    .line 350
    .line 351
    move/from16 v21, v2

    .line 352
    .line 353
    iget v2, v1, LU2/C;->k:I

    .line 354
    .line 355
    move/from16 v22, v2

    .line 356
    .line 357
    iget v2, v1, LU2/C;->l:I

    .line 358
    .line 359
    move/from16 v23, v2

    .line 360
    .line 361
    iget v2, v1, LU2/C;->h:I

    .line 362
    .line 363
    move/from16 v24, v2

    .line 364
    .line 365
    iget v2, v1, LU2/C;->i:I

    .line 366
    .line 367
    iget-object v1, v1, LU2/C;->q:Lu2/h$k;

    .line 368
    .line 369
    move/from16 v25, v24

    .line 370
    .line 371
    move/from16 v24, v15

    .line 372
    .line 373
    move/from16 v15, v25

    .line 374
    .line 375
    move/from16 v25, v2

    .line 376
    .line 377
    move-object/from16 v30, v3

    .line 378
    .line 379
    move/from16 v26, v10

    .line 380
    .line 381
    move-object/from16 v33, v11

    .line 382
    .line 383
    move/from16 v34, v21

    .line 384
    .line 385
    move/from16 v35, v22

    .line 386
    .line 387
    move/from16 v27, v23

    .line 388
    .line 389
    const/4 v2, 0x0

    .line 390
    move-object v3, v1

    .line 391
    move/from16 v21, v8

    .line 392
    .line 393
    move/from16 v22, v12

    .line 394
    .line 395
    move/from16 v23, v18

    .line 396
    .line 397
    const/4 v1, -0x1

    .line 398
    move-object v8, v7

    .line 399
    move-object/from16 v18, v13

    .line 400
    .line 401
    :goto_9
    const/4 v13, 0x0

    .line 402
    goto/16 :goto_2c

    .line 403
    .line 404
    :cond_e
    const v2, 0x6c687643

    .line 405
    .line 406
    .line 407
    move-object/from16 v33, v11

    .line 408
    .line 409
    const/4 v11, 0x2

    .line 410
    if-ne v1, v2, :cond_1a

    .line 411
    .line 412
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    const-string v2, "lhvC must follow hvcC atom"

    .line 417
    .line 418
    invoke-static {v1, v2}, LU2/s;->a(ZLjava/lang/String;)V

    .line 419
    .line 420
    .line 421
    move-object/from16 v2, v30

    .line 422
    .line 423
    if-eqz v2, :cond_f

    .line 424
    .line 425
    iget-object v1, v2, Lu2/h$k;->b:LP9/u;

    .line 426
    .line 427
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-lt v1, v11, :cond_f

    .line 432
    .line 433
    move/from16 v1, p9

    .line 434
    .line 435
    goto :goto_a

    .line 436
    :cond_f
    const/4 v1, 0x0

    .line 437
    :goto_a
    const-string v7, "must have at least two layers"

    .line 438
    .line 439
    invoke-static {v1, v7}, LU2/s;->a(ZLjava/lang/String;)V

    .line 440
    .line 441
    .line 442
    add-int/lit8 v12, v12, 0x8

    .line 443
    .line 444
    invoke-virtual {v0, v12}, Lt2/I;->b0(I)V

    .line 445
    .line 446
    .line 447
    invoke-static {v2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    check-cast v1, Lu2/h$k;

    .line 452
    .line 453
    invoke-static {v0, v1}, LU2/C;->c(Lt2/I;Lu2/h$k;)LU2/C;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    iget v7, v4, Lo3/b$h;->c:I

    .line 458
    .line 459
    iget v8, v1, LU2/C;->b:I

    .line 460
    .line 461
    if-ne v7, v8, :cond_10

    .line 462
    .line 463
    move/from16 v7, p9

    .line 464
    .line 465
    goto :goto_b

    .line 466
    :cond_10
    const/4 v7, 0x0

    .line 467
    :goto_b
    const-string v8, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    .line 468
    .line 469
    invoke-static {v7, v8}, LU2/s;->a(ZLjava/lang/String;)V

    .line 470
    .line 471
    .line 472
    iget v7, v1, LU2/C;->j:I

    .line 473
    .line 474
    const/4 v8, -0x1

    .line 475
    move/from16 v11, v25

    .line 476
    .line 477
    if-eq v7, v8, :cond_12

    .line 478
    .line 479
    if-ne v11, v7, :cond_11

    .line 480
    .line 481
    move/from16 v7, p9

    .line 482
    .line 483
    goto :goto_c

    .line 484
    :cond_11
    const/4 v7, 0x0

    .line 485
    :goto_c
    const-string v12, "colorSpace must be the same for both views"

    .line 486
    .line 487
    invoke-static {v7, v12}, LU2/s;->a(ZLjava/lang/String;)V

    .line 488
    .line 489
    .line 490
    :cond_12
    iget v7, v1, LU2/C;->k:I

    .line 491
    .line 492
    move/from16 v12, v26

    .line 493
    .line 494
    if-eq v7, v8, :cond_14

    .line 495
    .line 496
    if-ne v12, v7, :cond_13

    .line 497
    .line 498
    move/from16 v7, p9

    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_13
    const/4 v7, 0x0

    .line 502
    :goto_d
    const-string v8, "colorRange must be the same for both views"

    .line 503
    .line 504
    invoke-static {v7, v8}, LU2/s;->a(ZLjava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :cond_14
    iget v7, v1, LU2/C;->l:I

    .line 508
    .line 509
    const/4 v8, -0x1

    .line 510
    if-eq v7, v8, :cond_16

    .line 511
    .line 512
    move/from16 v8, v27

    .line 513
    .line 514
    if-ne v8, v7, :cond_15

    .line 515
    .line 516
    move/from16 v7, p9

    .line 517
    .line 518
    :goto_e
    move/from16 v18, v8

    .line 519
    .line 520
    goto :goto_f

    .line 521
    :cond_15
    const/4 v7, 0x0

    .line 522
    goto :goto_e

    .line 523
    :goto_f
    const-string v8, "colorTransfer must be the same for both views"

    .line 524
    .line 525
    invoke-static {v7, v8}, LU2/s;->a(ZLjava/lang/String;)V

    .line 526
    .line 527
    .line 528
    goto :goto_10

    .line 529
    :cond_16
    move/from16 v18, v27

    .line 530
    .line 531
    :goto_10
    iget v7, v1, LU2/C;->h:I

    .line 532
    .line 533
    if-ne v15, v7, :cond_17

    .line 534
    .line 535
    move/from16 v7, p9

    .line 536
    .line 537
    goto :goto_11

    .line 538
    :cond_17
    const/4 v7, 0x0

    .line 539
    :goto_11
    const-string v8, "bitdepthLuma must be the same for both views"

    .line 540
    .line 541
    invoke-static {v7, v8}, LU2/s;->a(ZLjava/lang/String;)V

    .line 542
    .line 543
    .line 544
    iget v7, v1, LU2/C;->i:I

    .line 545
    .line 546
    if-ne v13, v7, :cond_18

    .line 547
    .line 548
    move/from16 v7, p9

    .line 549
    .line 550
    goto :goto_12

    .line 551
    :cond_18
    const/4 v7, 0x0

    .line 552
    :goto_12
    const-string v8, "bitdepthChroma must be the same for both views"

    .line 553
    .line 554
    invoke-static {v7, v8}, LU2/s;->a(ZLjava/lang/String;)V

    .line 555
    .line 556
    .line 557
    move-object/from16 v7, v17

    .line 558
    .line 559
    if-eqz v7, :cond_19

    .line 560
    .line 561
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    invoke-virtual {v8, v7}, LP9/u$a;->j(Ljava/lang/Iterable;)LP9/u$a;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    iget-object v8, v1, LU2/C;->a:Ljava/util/List;

    .line 570
    .line 571
    invoke-virtual {v7, v8}, LP9/u$a;->j(Ljava/lang/Iterable;)LP9/u$a;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    invoke-virtual {v7}, LP9/u$a;->k()LP9/u;

    .line 576
    .line 577
    .line 578
    move-result-object v17

    .line 579
    move-object/from16 v7, v17

    .line 580
    .line 581
    move/from16 v17, v11

    .line 582
    .line 583
    goto :goto_13

    .line 584
    :cond_19
    const-string v8, "initializationData must be already set from hvcC atom"

    .line 585
    .line 586
    move/from16 v17, v11

    .line 587
    .line 588
    const/4 v11, 0x0

    .line 589
    invoke-static {v11, v8}, LU2/s;->a(ZLjava/lang/String;)V

    .line 590
    .line 591
    .line 592
    :goto_13
    iget-object v1, v1, LU2/C;->p:Ljava/lang/String;

    .line 593
    .line 594
    const-string v8, "video/mv-hevc"

    .line 595
    .line 596
    move-object/from16 v30, v3

    .line 597
    .line 598
    move/from16 v26, v10

    .line 599
    .line 600
    move/from16 v35, v12

    .line 601
    .line 602
    move/from16 v25, v13

    .line 603
    .line 604
    move/from16 v34, v17

    .line 605
    .line 606
    move/from16 v27, v18

    .line 607
    .line 608
    const/4 v13, 0x0

    .line 609
    move-object/from16 v18, v1

    .line 610
    .line 611
    move-object v3, v2

    .line 612
    move-object/from16 v17, v7

    .line 613
    .line 614
    const/4 v1, -0x1

    .line 615
    :goto_14
    const/4 v2, 0x0

    .line 616
    goto/16 :goto_2c

    .line 617
    .line 618
    :cond_1a
    move-object/from16 v7, v17

    .line 619
    .line 620
    move/from16 v34, v25

    .line 621
    .line 622
    move/from16 v35, v26

    .line 623
    .line 624
    move/from16 v36, v27

    .line 625
    .line 626
    move-object/from16 v2, v30

    .line 627
    .line 628
    const v11, 0x76657875

    .line 629
    .line 630
    .line 631
    if-ne v1, v11, :cond_1f

    .line 632
    .line 633
    invoke-static {v0, v12, v9}, Lo3/b;->K(Lt2/I;II)Lo3/b$l;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    if-eqz v1, :cond_1b

    .line 638
    .line 639
    invoke-static {v1}, Lo3/b$l;->a(Lo3/b$l;)Lo3/b$d;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    if-eqz v11, :cond_1b

    .line 644
    .line 645
    if-eqz v2, :cond_1c

    .line 646
    .line 647
    iget-object v11, v2, Lu2/h$k;->b:LP9/u;

    .line 648
    .line 649
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->size()I

    .line 650
    .line 651
    .line 652
    move-result v11

    .line 653
    const/4 v12, 0x2

    .line 654
    if-lt v11, v12, :cond_1c

    .line 655
    .line 656
    invoke-virtual {v1}, Lo3/b$l;->b()Z

    .line 657
    .line 658
    .line 659
    move-result v11

    .line 660
    const-string v12, "both eye views must be marked as available"

    .line 661
    .line 662
    invoke-static {v11, v12}, LU2/s;->a(ZLjava/lang/String;)V

    .line 663
    .line 664
    .line 665
    invoke-static {v1}, Lo3/b$l;->a(Lo3/b$l;)Lo3/b$d;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-static {v1}, Lo3/b$d;->a(Lo3/b$d;)Lo3/b$g;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-static {v1}, Lo3/b$g;->a(Lo3/b$g;)Z

    .line 674
    .line 675
    .line 676
    move-result v1

    .line 677
    xor-int/lit8 v1, v1, 0x1

    .line 678
    .line 679
    const-string v11, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 680
    .line 681
    invoke-static {v1, v11}, LU2/s;->a(ZLjava/lang/String;)V

    .line 682
    .line 683
    .line 684
    :cond_1b
    move/from16 v11, v20

    .line 685
    .line 686
    goto :goto_16

    .line 687
    :cond_1c
    move/from16 v11, v20

    .line 688
    .line 689
    const/4 v12, -0x1

    .line 690
    if-ne v11, v12, :cond_1e

    .line 691
    .line 692
    invoke-static {v1}, Lo3/b$l;->a(Lo3/b$l;)Lo3/b$d;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-static {v1}, Lo3/b$d;->a(Lo3/b$d;)Lo3/b$g;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-static {v1}, Lo3/b$g;->a(Lo3/b$g;)Z

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    if-eqz v1, :cond_1d

    .line 705
    .line 706
    const/4 v1, 0x5

    .line 707
    :goto_15
    move/from16 v20, v1

    .line 708
    .line 709
    goto :goto_17

    .line 710
    :cond_1d
    const/4 v1, 0x4

    .line 711
    goto :goto_15

    .line 712
    :cond_1e
    :goto_16
    move/from16 v20, v11

    .line 713
    .line 714
    :goto_17
    move-object/from16 v30, v3

    .line 715
    .line 716
    move-object/from16 v17, v7

    .line 717
    .line 718
    move/from16 v26, v10

    .line 719
    .line 720
    move/from16 v25, v13

    .line 721
    .line 722
    move/from16 v27, v36

    .line 723
    .line 724
    const/4 v1, -0x1

    .line 725
    const/4 v13, 0x0

    .line 726
    move-object v3, v2

    .line 727
    goto :goto_14

    .line 728
    :cond_1f
    move/from16 v11, v20

    .line 729
    .line 730
    move-object/from16 v20, v2

    .line 731
    .line 732
    const v2, 0x64766343

    .line 733
    .line 734
    .line 735
    if-eq v1, v2, :cond_20

    .line 736
    .line 737
    const v2, 0x64767643

    .line 738
    .line 739
    .line 740
    if-eq v1, v2, :cond_20

    .line 741
    .line 742
    const v2, 0x64767743

    .line 743
    .line 744
    .line 745
    if-ne v1, v2, :cond_21

    .line 746
    .line 747
    :cond_20
    move-object/from16 v30, v3

    .line 748
    .line 749
    move/from16 v26, v10

    .line 750
    .line 751
    move/from16 v37, v11

    .line 752
    .line 753
    move/from16 v25, v13

    .line 754
    .line 755
    move/from16 v40, v14

    .line 756
    .line 757
    move/from16 v27, v15

    .line 758
    .line 759
    move/from16 v11, v34

    .line 760
    .line 761
    move/from16 v3, v36

    .line 762
    .line 763
    const/4 v1, -0x1

    .line 764
    const/4 v2, 0x0

    .line 765
    goto/16 :goto_2a

    .line 766
    .line 767
    :cond_21
    const v2, 0x76706343

    .line 768
    .line 769
    .line 770
    if-ne v1, v2, :cond_27

    .line 771
    .line 772
    if-nez v8, :cond_22

    .line 773
    .line 774
    move/from16 v1, p9

    .line 775
    .line 776
    :goto_18
    const/4 v2, 0x0

    .line 777
    goto :goto_19

    .line 778
    :cond_22
    const/4 v1, 0x0

    .line 779
    goto :goto_18

    .line 780
    :goto_19
    invoke-static {v1, v2}, LU2/s;->a(ZLjava/lang/String;)V

    .line 781
    .line 782
    .line 783
    const v1, 0x76703038

    .line 784
    .line 785
    .line 786
    const-string v2, "video/x-vnd.on2.vp9"

    .line 787
    .line 788
    if-ne v10, v1, :cond_23

    .line 789
    .line 790
    const-string v1, "video/x-vnd.on2.vp8"

    .line 791
    .line 792
    goto :goto_1a

    .line 793
    :cond_23
    move-object v1, v2

    .line 794
    :goto_1a
    add-int/lit8 v12, v12, 0xc

    .line 795
    .line 796
    invoke-virtual {v0, v12}, Lt2/I;->b0(I)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 800
    .line 801
    .line 802
    move-result v8

    .line 803
    int-to-byte v8, v8

    .line 804
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 805
    .line 806
    .line 807
    move-result v12

    .line 808
    int-to-byte v12, v12

    .line 809
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 810
    .line 811
    .line 812
    move-result v13

    .line 813
    shr-int/lit8 v15, v13, 0x4

    .line 814
    .line 815
    shr-int/lit8 v25, v13, 0x1

    .line 816
    .line 817
    move/from16 v26, v10

    .line 818
    .line 819
    and-int/lit8 v10, v25, 0x7

    .line 820
    .line 821
    int-to-byte v10, v10

    .line 822
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    if-eqz v2, :cond_24

    .line 827
    .line 828
    int-to-byte v2, v15

    .line 829
    invoke-static {v8, v12, v2, v10}, Lt2/k;->k(BBBB)LP9/u;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    move-object v7, v2

    .line 834
    :cond_24
    and-int/lit8 v2, v13, 0x1

    .line 835
    .line 836
    if-eqz v2, :cond_25

    .line 837
    .line 838
    move/from16 v2, p9

    .line 839
    .line 840
    goto :goto_1b

    .line 841
    :cond_25
    const/4 v2, 0x0

    .line 842
    :goto_1b
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 843
    .line 844
    .line 845
    move-result v8

    .line 846
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 847
    .line 848
    .line 849
    move-result v10

    .line 850
    invoke-static {v8}, Lq2/l;->k(I)I

    .line 851
    .line 852
    .line 853
    move-result v25

    .line 854
    if-eqz v2, :cond_26

    .line 855
    .line 856
    move/from16 v17, p9

    .line 857
    .line 858
    goto :goto_1c

    .line 859
    :cond_26
    const/16 v17, 0x2

    .line 860
    .line 861
    :goto_1c
    invoke-static {v10}, Lq2/l;->l(I)I

    .line 862
    .line 863
    .line 864
    move-result v27

    .line 865
    move-object v8, v1

    .line 866
    move-object/from16 v30, v3

    .line 867
    .line 868
    move/from16 v35, v17

    .line 869
    .line 870
    move-object/from16 v3, v20

    .line 871
    .line 872
    move/from16 v34, v25

    .line 873
    .line 874
    const/4 v1, -0x1

    .line 875
    const/4 v2, 0x0

    .line 876
    const/4 v13, 0x0

    .line 877
    move-object/from16 v17, v7

    .line 878
    .line 879
    move/from16 v20, v11

    .line 880
    .line 881
    move/from16 v25, v15

    .line 882
    .line 883
    goto/16 :goto_2c

    .line 884
    .line 885
    :cond_27
    move/from16 v26, v10

    .line 886
    .line 887
    const v2, 0x61763143

    .line 888
    .line 889
    .line 890
    if-ne v1, v2, :cond_28

    .line 891
    .line 892
    add-int/lit8 v1, v9, -0x8

    .line 893
    .line 894
    new-array v2, v1, [B

    .line 895
    .line 896
    const/4 v7, 0x0

    .line 897
    invoke-virtual {v0, v2, v7, v1}, Lt2/I;->q([BII)V

    .line 898
    .line 899
    .line 900
    invoke-static {v2}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 901
    .line 902
    .line 903
    move-result-object v17

    .line 904
    add-int/lit8 v12, v12, 0x8

    .line 905
    .line 906
    invoke-virtual {v0, v12}, Lt2/I;->b0(I)V

    .line 907
    .line 908
    .line 909
    invoke-static {v0}, Lo3/b;->j(Lt2/I;)Lq2/l;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    iget v2, v1, Lq2/l;->e:I

    .line 914
    .line 915
    iget v7, v1, Lq2/l;->f:I

    .line 916
    .line 917
    iget v8, v1, Lq2/l;->a:I

    .line 918
    .line 919
    iget v10, v1, Lq2/l;->b:I

    .line 920
    .line 921
    iget v1, v1, Lq2/l;->c:I

    .line 922
    .line 923
    const-string v12, "video/av01"

    .line 924
    .line 925
    move/from16 v27, v1

    .line 926
    .line 927
    move v15, v2

    .line 928
    move-object/from16 v30, v3

    .line 929
    .line 930
    move/from16 v25, v7

    .line 931
    .line 932
    move/from16 v34, v8

    .line 933
    .line 934
    move/from16 v35, v10

    .line 935
    .line 936
    move-object v8, v12

    .line 937
    move-object/from16 v3, v20

    .line 938
    .line 939
    :goto_1d
    const/4 v1, -0x1

    .line 940
    const/4 v2, 0x0

    .line 941
    const/4 v13, 0x0

    .line 942
    move/from16 v20, v11

    .line 943
    .line 944
    goto/16 :goto_2c

    .line 945
    .line 946
    :cond_28
    const v2, 0x636c6c69

    .line 947
    .line 948
    .line 949
    if-ne v1, v2, :cond_2a

    .line 950
    .line 951
    if-nez v16, :cond_29

    .line 952
    .line 953
    invoke-static {}, Lo3/b;->a()Ljava/nio/ByteBuffer;

    .line 954
    .line 955
    .line 956
    move-result-object v16

    .line 957
    :cond_29
    move-object/from16 v1, v16

    .line 958
    .line 959
    const/16 v2, 0x15

    .line 960
    .line 961
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 965
    .line 966
    .line 967
    move-result v2

    .line 968
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 972
    .line 973
    .line 974
    move-result v2

    .line 975
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 976
    .line 977
    .line 978
    move-object/from16 v16, v1

    .line 979
    .line 980
    move-object/from16 v30, v3

    .line 981
    .line 982
    move-object/from16 v17, v7

    .line 983
    .line 984
    move/from16 v25, v13

    .line 985
    .line 986
    move-object/from16 v3, v20

    .line 987
    .line 988
    move/from16 v27, v36

    .line 989
    .line 990
    goto :goto_1d

    .line 991
    :cond_2a
    const v2, 0x6d646376

    .line 992
    .line 993
    .line 994
    if-ne v1, v2, :cond_2c

    .line 995
    .line 996
    if-nez v16, :cond_2b

    .line 997
    .line 998
    invoke-static {}, Lo3/b;->a()Ljava/nio/ByteBuffer;

    .line 999
    .line 1000
    .line 1001
    move-result-object v16

    .line 1002
    :cond_2b
    move-object/from16 v1, v16

    .line 1003
    .line 1004
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 1005
    .line 1006
    .line 1007
    move-result v2

    .line 1008
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 1009
    .line 1010
    .line 1011
    move-result v10

    .line 1012
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 1013
    .line 1014
    .line 1015
    move-result v12

    .line 1016
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 1017
    .line 1018
    .line 1019
    move-result v4

    .line 1020
    move/from16 v25, v13

    .line 1021
    .line 1022
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 1023
    .line 1024
    .line 1025
    move-result v13

    .line 1026
    move/from16 v27, v15

    .line 1027
    .line 1028
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 1029
    .line 1030
    .line 1031
    move-result v15

    .line 1032
    move-object/from16 v30, v3

    .line 1033
    .line 1034
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 1035
    .line 1036
    .line 1037
    move-result v3

    .line 1038
    move/from16 v37, v11

    .line 1039
    .line 1040
    invoke-virtual {v0}, Lt2/I;->I()S

    .line 1041
    .line 1042
    .line 1043
    move-result v11

    .line 1044
    invoke-virtual {v0}, Lt2/I;->O()J

    .line 1045
    .line 1046
    .line 1047
    move-result-wide v16

    .line 1048
    invoke-virtual {v0}, Lt2/I;->O()J

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v38

    .line 1052
    move/from16 v40, v14

    .line 1053
    .line 1054
    move/from16 v14, p9

    .line 1055
    .line 1056
    invoke-virtual {v1, v14}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v1, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1081
    .line 1082
    .line 1083
    const-wide/16 v2, 0x2710

    .line 1084
    .line 1085
    div-long v10, v16, v2

    .line 1086
    .line 1087
    long-to-int v4, v10

    .line 1088
    int-to-short v4, v4

    .line 1089
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1090
    .line 1091
    .line 1092
    div-long v2, v38, v2

    .line 1093
    .line 1094
    long-to-int v2, v2

    .line 1095
    int-to-short v2, v2

    .line 1096
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1097
    .line 1098
    .line 1099
    move-object/from16 v16, v1

    .line 1100
    .line 1101
    move-object/from16 v17, v7

    .line 1102
    .line 1103
    move-object/from16 v3, v20

    .line 1104
    .line 1105
    move/from16 v15, v27

    .line 1106
    .line 1107
    move/from16 v27, v36

    .line 1108
    .line 1109
    move/from16 v20, v37

    .line 1110
    .line 1111
    move/from16 v14, v40

    .line 1112
    .line 1113
    const/4 v1, -0x1

    .line 1114
    const/4 v2, 0x0

    .line 1115
    goto/16 :goto_9

    .line 1116
    .line 1117
    :cond_2c
    move-object/from16 v30, v3

    .line 1118
    .line 1119
    move/from16 v37, v11

    .line 1120
    .line 1121
    move/from16 v25, v13

    .line 1122
    .line 1123
    move/from16 v40, v14

    .line 1124
    .line 1125
    move/from16 v27, v15

    .line 1126
    .line 1127
    const v2, 0x64323633

    .line 1128
    .line 1129
    .line 1130
    if-ne v1, v2, :cond_2e

    .line 1131
    .line 1132
    if-nez v8, :cond_2d

    .line 1133
    .line 1134
    const/4 v1, 0x1

    .line 1135
    :goto_1e
    const/4 v2, 0x0

    .line 1136
    goto :goto_1f

    .line 1137
    :cond_2d
    const/4 v1, 0x0

    .line 1138
    goto :goto_1e

    .line 1139
    :goto_1f
    invoke-static {v1, v2}, LU2/s;->a(ZLjava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    move-object/from16 v17, v7

    .line 1143
    .line 1144
    move-object/from16 v3, v20

    .line 1145
    .line 1146
    move/from16 v15, v27

    .line 1147
    .line 1148
    move-object/from16 v8, v33

    .line 1149
    .line 1150
    :goto_20
    move/from16 v27, v36

    .line 1151
    .line 1152
    :goto_21
    move/from16 v20, v37

    .line 1153
    .line 1154
    move/from16 v14, v40

    .line 1155
    .line 1156
    const/4 v1, -0x1

    .line 1157
    goto/16 :goto_9

    .line 1158
    .line 1159
    :cond_2e
    const/4 v2, 0x0

    .line 1160
    const v3, 0x65736473

    .line 1161
    .line 1162
    .line 1163
    if-ne v1, v3, :cond_31

    .line 1164
    .line 1165
    if-nez v8, :cond_2f

    .line 1166
    .line 1167
    const/4 v1, 0x1

    .line 1168
    goto :goto_22

    .line 1169
    :cond_2f
    const/4 v1, 0x0

    .line 1170
    :goto_22
    invoke-static {v1, v2}, LU2/s;->a(ZLjava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    invoke-static {v0, v12}, Lo3/b;->n(Lt2/I;I)Lo3/b$c;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v29

    .line 1177
    invoke-static/range {v29 .. v29}, Lo3/b$c;->a(Lo3/b$c;)Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v1

    .line 1181
    invoke-static/range {v29 .. v29}, Lo3/b$c;->d(Lo3/b$c;)[B

    .line 1182
    .line 1183
    .line 1184
    move-result-object v3

    .line 1185
    if-eqz v3, :cond_30

    .line 1186
    .line 1187
    invoke-static {v3}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v17

    .line 1191
    goto :goto_23

    .line 1192
    :cond_30
    move-object/from16 v17, v7

    .line 1193
    .line 1194
    :goto_23
    move-object v8, v1

    .line 1195
    :goto_24
    move-object/from16 v3, v20

    .line 1196
    .line 1197
    move/from16 v15, v27

    .line 1198
    .line 1199
    goto :goto_20

    .line 1200
    :cond_31
    const v3, 0x62747274

    .line 1201
    .line 1202
    .line 1203
    if-ne v1, v3, :cond_33

    .line 1204
    .line 1205
    invoke-static {v0, v12}, Lo3/b;->k(Lt2/I;I)Lo3/b$a;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v28

    .line 1209
    :cond_32
    :goto_25
    move-object/from16 v17, v7

    .line 1210
    .line 1211
    goto :goto_24

    .line 1212
    :cond_33
    const v3, 0x70617370

    .line 1213
    .line 1214
    .line 1215
    if-ne v1, v3, :cond_34

    .line 1216
    .line 1217
    invoke-static {v0, v12}, Lo3/b;->x(Lt2/I;I)F

    .line 1218
    .line 1219
    .line 1220
    move-result v1

    .line 1221
    move v14, v1

    .line 1222
    move-object/from16 v17, v7

    .line 1223
    .line 1224
    move-object/from16 v3, v20

    .line 1225
    .line 1226
    move/from16 v15, v27

    .line 1227
    .line 1228
    move/from16 v27, v36

    .line 1229
    .line 1230
    move/from16 v20, v37

    .line 1231
    .line 1232
    const/4 v1, -0x1

    .line 1233
    const/4 v13, 0x0

    .line 1234
    const/16 v31, 0x1

    .line 1235
    .line 1236
    goto/16 :goto_2c

    .line 1237
    .line 1238
    :cond_34
    const v3, 0x73763364

    .line 1239
    .line 1240
    .line 1241
    if-ne v1, v3, :cond_35

    .line 1242
    .line 1243
    invoke-static {v0, v12, v9}, Lo3/b;->y(Lt2/I;II)[B

    .line 1244
    .line 1245
    .line 1246
    move-result-object v19

    .line 1247
    goto :goto_25

    .line 1248
    :cond_35
    const v3, 0x73743364

    .line 1249
    .line 1250
    .line 1251
    if-ne v1, v3, :cond_3a

    .line 1252
    .line 1253
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 1254
    .line 1255
    .line 1256
    move-result v1

    .line 1257
    const/4 v3, 0x3

    .line 1258
    invoke-virtual {v0, v3}, Lt2/I;->c0(I)V

    .line 1259
    .line 1260
    .line 1261
    if-nez v1, :cond_32

    .line 1262
    .line 1263
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 1264
    .line 1265
    .line 1266
    move-result v1

    .line 1267
    if-eqz v1, :cond_39

    .line 1268
    .line 1269
    const/4 v14, 0x1

    .line 1270
    if-eq v1, v14, :cond_38

    .line 1271
    .line 1272
    const/4 v12, 0x2

    .line 1273
    if-eq v1, v12, :cond_37

    .line 1274
    .line 1275
    if-eq v1, v3, :cond_36

    .line 1276
    .line 1277
    goto :goto_25

    .line 1278
    :cond_36
    move/from16 v37, v3

    .line 1279
    .line 1280
    goto :goto_25

    .line 1281
    :cond_37
    const/16 v37, 0x2

    .line 1282
    .line 1283
    goto :goto_25

    .line 1284
    :cond_38
    move/from16 v37, v14

    .line 1285
    .line 1286
    goto :goto_25

    .line 1287
    :cond_39
    const/16 v37, 0x0

    .line 1288
    .line 1289
    goto :goto_25

    .line 1290
    :cond_3a
    const/4 v14, 0x1

    .line 1291
    const v3, 0x61707643

    .line 1292
    .line 1293
    .line 1294
    if-ne v1, v3, :cond_3b

    .line 1295
    .line 1296
    add-int/lit8 v1, v9, -0xc

    .line 1297
    .line 1298
    new-array v3, v1, [B

    .line 1299
    .line 1300
    add-int/lit8 v12, v12, 0xc

    .line 1301
    .line 1302
    invoke-virtual {v0, v12}, Lt2/I;->b0(I)V

    .line 1303
    .line 1304
    .line 1305
    const/4 v7, 0x0

    .line 1306
    invoke-virtual {v0, v3, v7, v1}, Lt2/I;->q([BII)V

    .line 1307
    .line 1308
    .line 1309
    invoke-static {v3}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v17

    .line 1313
    new-instance v1, Lt2/I;

    .line 1314
    .line 1315
    invoke-direct {v1, v3}, Lt2/I;-><init>([B)V

    .line 1316
    .line 1317
    .line 1318
    invoke-static {v1}, Lo3/b;->h(Lt2/I;)Lq2/l;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    iget v3, v1, Lq2/l;->e:I

    .line 1323
    .line 1324
    iget v4, v1, Lq2/l;->f:I

    .line 1325
    .line 1326
    iget v7, v1, Lq2/l;->a:I

    .line 1327
    .line 1328
    iget v8, v1, Lq2/l;->b:I

    .line 1329
    .line 1330
    iget v1, v1, Lq2/l;->c:I

    .line 1331
    .line 1332
    const-string v10, "video/apv"

    .line 1333
    .line 1334
    move/from16 v27, v1

    .line 1335
    .line 1336
    move v15, v3

    .line 1337
    move/from16 v25, v4

    .line 1338
    .line 1339
    move/from16 v34, v7

    .line 1340
    .line 1341
    move/from16 v35, v8

    .line 1342
    .line 1343
    move-object v8, v10

    .line 1344
    move-object/from16 v3, v20

    .line 1345
    .line 1346
    goto/16 :goto_21

    .line 1347
    .line 1348
    :cond_3b
    const v3, 0x636f6c72

    .line 1349
    .line 1350
    .line 1351
    move/from16 v11, v34

    .line 1352
    .line 1353
    if-ne v1, v3, :cond_40

    .line 1354
    .line 1355
    const/4 v1, -0x1

    .line 1356
    move/from16 v3, v36

    .line 1357
    .line 1358
    if-ne v11, v1, :cond_41

    .line 1359
    .line 1360
    if-ne v3, v1, :cond_41

    .line 1361
    .line 1362
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 1363
    .line 1364
    .line 1365
    move-result v4

    .line 1366
    const v10, 0x6e636c78

    .line 1367
    .line 1368
    .line 1369
    if-eq v4, v10, :cond_3d

    .line 1370
    .line 1371
    const v10, 0x6e636c63

    .line 1372
    .line 1373
    .line 1374
    if-ne v4, v10, :cond_3c

    .line 1375
    .line 1376
    goto :goto_26

    .line 1377
    :cond_3c
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1380
    .line 1381
    .line 1382
    const-string v12, "Unsupported color type: "

    .line 1383
    .line 1384
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1385
    .line 1386
    .line 1387
    invoke-static {v4}, Lu2/e;->a(I)Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v4

    .line 1391
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v4

    .line 1398
    const-string v10, "BoxParsers"

    .line 1399
    .line 1400
    invoke-static {v10, v4}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1401
    .line 1402
    .line 1403
    goto :goto_28

    .line 1404
    :cond_3d
    :goto_26
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 1405
    .line 1406
    .line 1407
    move-result v3

    .line 1408
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 1409
    .line 1410
    .line 1411
    move-result v4

    .line 1412
    const/4 v12, 0x2

    .line 1413
    invoke-virtual {v0, v12}, Lt2/I;->c0(I)V

    .line 1414
    .line 1415
    .line 1416
    const/16 v10, 0x13

    .line 1417
    .line 1418
    if-ne v9, v10, :cond_3e

    .line 1419
    .line 1420
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 1421
    .line 1422
    .line 1423
    move-result v10

    .line 1424
    and-int/lit16 v10, v10, 0x80

    .line 1425
    .line 1426
    if-eqz v10, :cond_3e

    .line 1427
    .line 1428
    move v11, v14

    .line 1429
    goto :goto_27

    .line 1430
    :cond_3e
    const/4 v11, 0x0

    .line 1431
    :goto_27
    invoke-static {v3}, Lq2/l;->k(I)I

    .line 1432
    .line 1433
    .line 1434
    move-result v3

    .line 1435
    if-eqz v11, :cond_3f

    .line 1436
    .line 1437
    move v12, v14

    .line 1438
    :cond_3f
    invoke-static {v4}, Lq2/l;->l(I)I

    .line 1439
    .line 1440
    .line 1441
    move-result v4

    .line 1442
    move/from16 v34, v3

    .line 1443
    .line 1444
    move-object/from16 v17, v7

    .line 1445
    .line 1446
    move/from16 v35, v12

    .line 1447
    .line 1448
    move-object/from16 v3, v20

    .line 1449
    .line 1450
    move/from16 v15, v27

    .line 1451
    .line 1452
    move/from16 v20, v37

    .line 1453
    .line 1454
    move/from16 v14, v40

    .line 1455
    .line 1456
    const/4 v13, 0x0

    .line 1457
    move/from16 v27, v4

    .line 1458
    .line 1459
    goto :goto_2c

    .line 1460
    :cond_40
    move/from16 v3, v36

    .line 1461
    .line 1462
    const/4 v1, -0x1

    .line 1463
    :cond_41
    :goto_28
    move-object/from16 v17, v7

    .line 1464
    .line 1465
    move/from16 v34, v11

    .line 1466
    .line 1467
    move/from16 v15, v27

    .line 1468
    .line 1469
    move/from16 v14, v40

    .line 1470
    .line 1471
    const/4 v13, 0x0

    .line 1472
    :goto_29
    move/from16 v27, v3

    .line 1473
    .line 1474
    move-object/from16 v3, v20

    .line 1475
    .line 1476
    move/from16 v20, v37

    .line 1477
    .line 1478
    goto :goto_2c

    .line 1479
    :goto_2a
    add-int/lit8 v4, v9, -0x8

    .line 1480
    .line 1481
    new-array v10, v4, [B

    .line 1482
    .line 1483
    const/4 v13, 0x0

    .line 1484
    invoke-virtual {v0, v10, v13, v4}, Lt2/I;->q([BII)V

    .line 1485
    .line 1486
    .line 1487
    if-eqz v7, :cond_42

    .line 1488
    .line 1489
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v4

    .line 1493
    invoke-virtual {v4, v7}, LP9/u$a;->j(Ljava/lang/Iterable;)LP9/u$a;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v4

    .line 1497
    invoke-virtual {v4, v10}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v4

    .line 1501
    invoke-virtual {v4}, LP9/u$a;->k()LP9/u;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v17

    .line 1505
    goto :goto_2b

    .line 1506
    :cond_42
    const-string v4, "initializationData must already be set from hvcC or avcC atom"

    .line 1507
    .line 1508
    invoke-static {v13, v4}, LU2/s;->a(ZLjava/lang/String;)V

    .line 1509
    .line 1510
    .line 1511
    move-object/from16 v17, v7

    .line 1512
    .line 1513
    :goto_2b
    add-int/lit8 v12, v12, 0x8

    .line 1514
    .line 1515
    invoke-virtual {v0, v12}, Lt2/I;->b0(I)V

    .line 1516
    .line 1517
    .line 1518
    invoke-static {v0}, Lu2/a;->a(Lt2/I;)Lu2/a;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v4

    .line 1522
    if-eqz v4, :cond_43

    .line 1523
    .line 1524
    iget-object v4, v4, Lu2/a;->c:Ljava/lang/String;

    .line 1525
    .line 1526
    const-string v8, "video/dolby-vision"

    .line 1527
    .line 1528
    move-object/from16 v18, v4

    .line 1529
    .line 1530
    :cond_43
    move/from16 v34, v11

    .line 1531
    .line 1532
    move/from16 v15, v27

    .line 1533
    .line 1534
    move/from16 v14, v40

    .line 1535
    .line 1536
    goto :goto_29

    .line 1537
    :goto_2c
    add-int v7, v32, v9

    .line 1538
    .line 1539
    move-object/from16 v1, v30

    .line 1540
    .line 1541
    move-object/from16 v30, v3

    .line 1542
    .line 1543
    move-object v3, v1

    .line 1544
    move/from16 v1, p2

    .line 1545
    .line 1546
    move/from16 v2, p3

    .line 1547
    .line 1548
    move-object/from16 v4, p8

    .line 1549
    .line 1550
    move/from16 v13, v25

    .line 1551
    .line 1552
    move/from16 v10, v26

    .line 1553
    .line 1554
    move-object/from16 v11, v33

    .line 1555
    .line 1556
    move/from16 v25, v34

    .line 1557
    .line 1558
    move/from16 v26, v35

    .line 1559
    .line 1560
    goto/16 :goto_2

    .line 1561
    .line 1562
    :goto_2d
    if-nez v8, :cond_44

    .line 1563
    .line 1564
    return-void

    .line 1565
    :cond_44
    new-instance v0, Lq2/x$b;

    .line 1566
    .line 1567
    invoke-direct {v0}, Lq2/x$b;-><init>()V

    .line 1568
    .line 1569
    .line 1570
    move/from16 v1, p4

    .line 1571
    .line 1572
    invoke-virtual {v0, v1}, Lq2/x$b;->i0(I)Lq2/x$b;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    invoke-virtual {v0, v8}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v0

    .line 1580
    move-object/from16 v9, v18

    .line 1581
    .line 1582
    invoke-virtual {v0, v9}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    invoke-virtual {v0, v5}, Lq2/x$b;->F0(I)Lq2/x$b;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v0

    .line 1590
    invoke-virtual {v0, v6}, Lq2/x$b;->h0(I)Lq2/x$b;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v0

    .line 1594
    move/from16 v12, v23

    .line 1595
    .line 1596
    invoke-virtual {v0, v12}, Lq2/x$b;->b0(I)Lq2/x$b;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v0

    .line 1600
    move/from16 v12, v24

    .line 1601
    .line 1602
    invoke-virtual {v0, v12}, Lq2/x$b;->a0(I)Lq2/x$b;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v0

    .line 1606
    move/from16 v14, v40

    .line 1607
    .line 1608
    invoke-virtual {v0, v14}, Lq2/x$b;->u0(F)Lq2/x$b;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v0

    .line 1612
    move/from16 v1, p6

    .line 1613
    .line 1614
    invoke-virtual {v0, v1}, Lq2/x$b;->x0(I)Lq2/x$b;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v0

    .line 1618
    move-object/from16 v9, v19

    .line 1619
    .line 1620
    invoke-virtual {v0, v9}, Lq2/x$b;->v0([B)Lq2/x$b;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    move/from16 v12, v37

    .line 1625
    .line 1626
    invoke-virtual {v0, v12}, Lq2/x$b;->B0(I)Lq2/x$b;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v0

    .line 1630
    invoke-virtual {v0, v7}, Lq2/x$b;->k0(Ljava/util/List;)Lq2/x$b;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v0

    .line 1634
    move/from16 v12, v21

    .line 1635
    .line 1636
    invoke-virtual {v0, v12}, Lq2/x$b;->p0(I)Lq2/x$b;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v0

    .line 1640
    move/from16 v12, v22

    .line 1641
    .line 1642
    invoke-virtual {v0, v12}, Lq2/x$b;->q0(I)Lq2/x$b;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    move-object/from16 v1, v30

    .line 1647
    .line 1648
    invoke-virtual {v0, v1}, Lq2/x$b;->c0(Lq2/q;)Lq2/x$b;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v0

    .line 1652
    move-object/from16 v1, p5

    .line 1653
    .line 1654
    invoke-virtual {v0, v1}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v0

    .line 1658
    new-instance v1, Lq2/l$b;

    .line 1659
    .line 1660
    invoke-direct {v1}, Lq2/l$b;-><init>()V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v1, v11}, Lq2/l$b;->d(I)Lq2/l$b;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v1

    .line 1667
    move/from16 v12, v35

    .line 1668
    .line 1669
    invoke-virtual {v1, v12}, Lq2/l$b;->c(I)Lq2/l$b;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v1

    .line 1673
    invoke-virtual {v1, v3}, Lq2/l$b;->e(I)Lq2/l$b;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    if-eqz v16, :cond_45

    .line 1678
    .line 1679
    invoke-virtual/range {v16 .. v16}, Ljava/nio/ByteBuffer;->array()[B

    .line 1680
    .line 1681
    .line 1682
    move-result-object v9

    .line 1683
    goto :goto_2e

    .line 1684
    :cond_45
    move-object v9, v2

    .line 1685
    :goto_2e
    invoke-virtual {v1, v9}, Lq2/l$b;->f([B)Lq2/l$b;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v1

    .line 1689
    move/from16 v15, v27

    .line 1690
    .line 1691
    invoke-virtual {v1, v15}, Lq2/l$b;->g(I)Lq2/l$b;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v1

    .line 1695
    move/from16 v15, v25

    .line 1696
    .line 1697
    invoke-virtual {v1, v15}, Lq2/l$b;->b(I)Lq2/l$b;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v1

    .line 1701
    invoke-virtual {v1}, Lq2/l$b;->a()Lq2/l;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v1

    .line 1705
    invoke-virtual {v0, v1}, Lq2/x$b;->V(Lq2/l;)Lq2/x$b;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v0

    .line 1709
    if-eqz v28, :cond_46

    .line 1710
    .line 1711
    invoke-static/range {v28 .. v28}, Lo3/b$a;->b(Lo3/b$a;)J

    .line 1712
    .line 1713
    .line 1714
    move-result-wide v1

    .line 1715
    invoke-static {v1, v2}, LS9/f;->n(J)I

    .line 1716
    .line 1717
    .line 1718
    move-result v1

    .line 1719
    invoke-virtual {v0, v1}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v1

    .line 1723
    invoke-static/range {v28 .. v28}, Lo3/b$a;->a(Lo3/b$a;)J

    .line 1724
    .line 1725
    .line 1726
    move-result-wide v2

    .line 1727
    invoke-static {v2, v3}, LS9/f;->n(J)I

    .line 1728
    .line 1729
    .line 1730
    move-result v2

    .line 1731
    invoke-virtual {v1, v2}, Lq2/x$b;->t0(I)Lq2/x$b;

    .line 1732
    .line 1733
    .line 1734
    goto :goto_2f

    .line 1735
    :cond_46
    if-eqz v29, :cond_47

    .line 1736
    .line 1737
    invoke-static/range {v29 .. v29}, Lo3/b$c;->c(Lo3/b$c;)J

    .line 1738
    .line 1739
    .line 1740
    move-result-wide v1

    .line 1741
    invoke-static {v1, v2}, LS9/f;->n(J)I

    .line 1742
    .line 1743
    .line 1744
    move-result v1

    .line 1745
    invoke-virtual {v0, v1}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v1

    .line 1749
    invoke-static/range {v29 .. v29}, Lo3/b$c;->b(Lo3/b$c;)J

    .line 1750
    .line 1751
    .line 1752
    move-result-wide v2

    .line 1753
    invoke-static {v2, v3}, LS9/f;->n(J)I

    .line 1754
    .line 1755
    .line 1756
    move-result v2

    .line 1757
    invoke-virtual {v1, v2}, Lq2/x$b;->t0(I)Lq2/x$b;

    .line 1758
    .line 1759
    .line 1760
    :cond_47
    :goto_2f
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v0

    .line 1764
    move-object/from16 v4, p8

    .line 1765
    .line 1766
    iput-object v0, v4, Lo3/b$h;->b:Lq2/x;

    .line 1767
    .line 1768
    return-void
.end method

.method private static M(Lt2/I;)Lq2/J;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lt2/I;->I()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {p0, v1}, Lt2/I;->c0(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lt2/I;->J(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/16 v0, 0x2b

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x2d

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    :try_start_0
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x1

    .line 43
    sub-int/2addr v3, v4

    .line 44
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    new-instance v0, Lq2/J;

    .line 53
    .line 54
    new-instance v3, Lu2/f;

    .line 55
    .line 56
    invoke-direct {v3, v2, p0}, Lu2/f;-><init>(FF)V

    .line 57
    .line 58
    .line 59
    new-array p0, v4, [Lq2/J$a;

    .line 60
    .line 61
    aput-object v3, p0, v1

    .line 62
    .line 63
    invoke-direct {v0, p0}, Lq2/J;-><init>([Lq2/J$a;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :catch_0
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method private static N(I)I
    .locals 5

    .line 1
    shr-int/lit8 v0, p0, 0x10

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    shr-int/lit8 v2, p0, 0x8

    .line 7
    .line 8
    and-int/2addr v2, v1

    .line 9
    and-int/2addr p0, v1

    .line 10
    add-int/lit8 v2, v2, -0x80

    .line 11
    .line 12
    mul-int/lit16 v3, v2, 0x36fb

    .line 13
    .line 14
    div-int/lit16 v3, v3, 0x2710

    .line 15
    .line 16
    add-int/2addr v3, v0

    .line 17
    add-int/lit8 p0, p0, -0x80

    .line 18
    .line 19
    mul-int/lit16 v4, p0, 0xd7f

    .line 20
    .line 21
    div-int/lit16 v4, v4, 0x2710

    .line 22
    .line 23
    sub-int v4, v0, v4

    .line 24
    .line 25
    mul-int/lit16 v2, v2, 0x1c01

    .line 26
    .line 27
    div-int/lit16 v2, v2, 0x2710

    .line 28
    .line 29
    sub-int/2addr v4, v2

    .line 30
    mul-int/lit16 p0, p0, 0x457e

    .line 31
    .line 32
    div-int/lit16 p0, p0, 0x2710

    .line 33
    .line 34
    add-int/2addr v0, p0

    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-static {v3, p0, v1}, Lt2/a0;->r(III)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    shl-int/lit8 v2, v2, 0x10

    .line 41
    .line 42
    invoke-static {v4, p0, v1}, Lt2/a0;->r(III)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    shl-int/lit8 v3, v3, 0x8

    .line 47
    .line 48
    or-int/2addr v2, v3

    .line 49
    invoke-static {v0, p0, v1}, Lt2/a0;->r(III)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    or-int/2addr p0, v2

    .line 54
    return p0
.end method

.method private static a()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method private static b([JJJJ)Z
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    sub-int/2addr v0, v1

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v2, v3, v0}, Lt2/a0;->r(III)I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    array-length v5, p0

    .line 11
    sub-int/2addr v5, v2

    .line 12
    invoke-static {v5, v3, v0}, Lt2/a0;->r(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget-wide v5, p0, v3

    .line 17
    .line 18
    cmp-long v2, v5, p3

    .line 19
    .line 20
    if-gtz v2, :cond_0

    .line 21
    .line 22
    aget-wide v4, p0, v4

    .line 23
    .line 24
    cmp-long p3, p3, v4

    .line 25
    .line 26
    if-gez p3, :cond_0

    .line 27
    .line 28
    aget-wide p3, p0, v0

    .line 29
    .line 30
    cmp-long p0, p3, p5

    .line 31
    .line 32
    if-gez p0, :cond_0

    .line 33
    .line 34
    cmp-long p0, p5, p1

    .line 35
    .line 36
    if-gtz p0, :cond_0

    .line 37
    .line 38
    return v1

    .line 39
    :cond_0
    return v3
.end method

.method private static c(Lt2/I;III)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-lt v0, p2, :cond_0

    .line 8
    .line 9
    move v3, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v1

    .line 12
    :goto_0
    const/4 v4, 0x0

    .line 13
    invoke-static {v3, v4}, LU2/s;->a(ZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_1
    sub-int v3, v0, p2

    .line 17
    .line 18
    if-ge v3, p3, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-lez v3, :cond_1

    .line 28
    .line 29
    move v4, v2

    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move v4, v1

    .line 32
    :goto_2
    const-string v5, "childAtomSize must be positive"

    .line 33
    .line 34
    invoke-static {v4, v5}, LU2/s;->a(ZLjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-ne v4, p1, :cond_2

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    add-int/2addr v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const/4 p0, -0x1

    .line 47
    return p0
.end method

.method private static d([BII)Ljava/lang/String;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x40

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    invoke-static {v0}, Lt2/a;->g(Z)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v1, 0x10

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    :goto_1
    array-length v1, p0

    .line 21
    add-int/lit8 v1, v1, -0x3

    .line 22
    .line 23
    if-ge v2, v1, :cond_1

    .line 24
    .line 25
    aget-byte v1, p0, v2

    .line 26
    .line 27
    add-int/lit8 v3, v2, 0x1

    .line 28
    .line 29
    aget-byte v3, p0, v3

    .line 30
    .line 31
    add-int/lit8 v4, v2, 0x2

    .line 32
    .line 33
    aget-byte v4, p0, v4

    .line 34
    .line 35
    add-int/lit8 v5, v2, 0x3

    .line 36
    .line 37
    aget-byte v5, p0, v5

    .line 38
    .line 39
    invoke-static {v1, v3, v4, v5}, LS9/f;->i(BBBB)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Lo3/b;->N(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v3, "%06x"

    .line 56
    .line 57
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    add-int/lit8 v2, v2, 0x4

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v1, "size: "

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p1, "x"

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p1, "\npalette: "

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p1, ", "

    .line 94
    .line 95
    invoke-static {p1}, LO9/g;->g(Ljava/lang/String;)LO9/g;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1, v0}, LO9/g;->d(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p1, "\n"

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method

.method private static e(I)Ljava/lang/String;
    .locals 5

    .line 1
    shr-int/lit8 v0, p0, 0xa

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x60

    .line 6
    .line 7
    int-to-char v0, v0

    .line 8
    shr-int/lit8 v1, p0, 0x5

    .line 9
    .line 10
    and-int/lit8 v1, v1, 0x1f

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x60

    .line 13
    .line 14
    int-to-char v1, v1

    .line 15
    and-int/lit8 p0, p0, 0x1f

    .line 16
    .line 17
    add-int/lit8 p0, p0, 0x60

    .line 18
    .line 19
    int-to-char p0, p0

    .line 20
    const/4 v2, 0x3

    .line 21
    new-array v3, v2, [C

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-char v0, v3, v4

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    aput-char v1, v3, v0

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    aput-char p0, v3, v0

    .line 31
    .line 32
    :goto_0
    if-ge v4, v2, :cond_2

    .line 33
    .line 34
    aget-char p0, v3, v4

    .line 35
    .line 36
    const/16 v0, 0x61

    .line 37
    .line 38
    if-lt p0, v0, :cond_1

    .line 39
    .line 40
    const/16 v0, 0x7a

    .line 41
    .line 42
    if-le p0, v0, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method private static f(I)I
    .locals 1

    .line 1
    const v0, 0x736f756e

    .line 2
    .line 3
    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const v0, 0x76696465

    .line 9
    .line 10
    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    const/4 p0, 0x2

    .line 14
    return p0

    .line 15
    :cond_1
    const v0, 0x74657874

    .line 16
    .line 17
    .line 18
    if-eq p0, v0, :cond_4

    .line 19
    .line 20
    const v0, 0x7362746c

    .line 21
    .line 22
    .line 23
    if-eq p0, v0, :cond_4

    .line 24
    .line 25
    const v0, 0x73756274

    .line 26
    .line 27
    .line 28
    if-eq p0, v0, :cond_4

    .line 29
    .line 30
    const v0, 0x636c6370

    .line 31
    .line 32
    .line 33
    if-eq p0, v0, :cond_4

    .line 34
    .line 35
    const v0, 0x73756270

    .line 36
    .line 37
    .line 38
    if-ne p0, v0, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const v0, 0x6d657461

    .line 42
    .line 43
    .line 44
    if-ne p0, v0, :cond_3

    .line 45
    .line 46
    const/4 p0, 0x5

    .line 47
    return p0

    .line 48
    :cond_3
    const/4 p0, -0x1

    .line 49
    return p0

    .line 50
    :cond_4
    :goto_0
    const/4 p0, 0x3

    .line 51
    return p0
.end method

.method public static g(Lt2/I;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {p0, v1}, Lt2/I;->c0(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v2, 0x68646c72    # 4.3148E24f

    .line 14
    .line 15
    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x4

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private static h(Lt2/I;)Lq2/l;
    .locals 11

    .line 1
    new-instance v0, Lq2/l$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/l$b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lt2/H;

    .line 7
    .line 8
    invoke-virtual {p0}, Lt2/I;->f()[B

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Lt2/H;-><init>([B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    mul-int/2addr p0, v2

    .line 22
    invoke-virtual {v1, p0}, Lt2/H;->p(I)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    invoke-virtual {v1, p0}, Lt2/H;->s(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lt2/H;->h(I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    move v5, v4

    .line 35
    :goto_0
    if-ge v5, v3, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Lt2/H;->s(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lt2/H;->h(I)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    move v7, v4

    .line 45
    :goto_1
    if-ge v7, v6, :cond_2

    .line 46
    .line 47
    const/4 v8, 0x6

    .line 48
    invoke-virtual {v1, v8}, Lt2/H;->r(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-virtual {v1}, Lt2/H;->q()V

    .line 56
    .line 57
    .line 58
    const/16 v9, 0xb

    .line 59
    .line 60
    invoke-virtual {v1, v9}, Lt2/H;->s(I)V

    .line 61
    .line 62
    .line 63
    const/4 v9, 0x4

    .line 64
    invoke-virtual {v1, v9}, Lt2/H;->r(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v9}, Lt2/H;->h(I)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    add-int/2addr v9, v2

    .line 72
    invoke-virtual {v0, v9}, Lq2/l$b;->g(I)Lq2/l$b;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v9}, Lq2/l$b;->b(I)Lq2/l$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p0}, Lt2/H;->s(I)V

    .line 79
    .line 80
    .line 81
    if-eqz v8, :cond_1

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Lt2/H;->h(I)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    invoke-virtual {v1, v2}, Lt2/H;->h(I)I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    invoke-virtual {v1, p0}, Lt2/H;->s(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    invoke-static {v8}, Lq2/l;->k(I)I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    invoke-virtual {v0, v8}, Lq2/l$b;->d(I)Lq2/l$b;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    if-eqz v10, :cond_0

    .line 107
    .line 108
    move v10, p0

    .line 109
    goto :goto_2

    .line 110
    :cond_0
    const/4 v10, 0x2

    .line 111
    :goto_2
    invoke-virtual {v8, v10}, Lq2/l$b;->c(I)Lq2/l$b;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-static {v9}, Lq2/l;->l(I)I

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    invoke-virtual {v8, v9}, Lq2/l$b;->e(I)Lq2/l$b;

    .line 120
    .line 121
    .line 122
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    invoke-virtual {v0}, Lq2/l$b;->a()Lq2/l;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
.end method

.method private static i(Lt2/I;IIIILjava/lang/String;ZLq2/q;Lo3/b$h;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p7

    .line 14
    .line 15
    move-object/from16 v7, p8

    .line 16
    .line 17
    add-int/lit8 v8, v2, 0x10

    .line 18
    .line 19
    invoke-virtual {v0, v8}, Lt2/I;->b0(I)V

    .line 20
    .line 21
    .line 22
    const/4 v8, 0x6

    .line 23
    const/16 v9, 0x8

    .line 24
    .line 25
    if-eqz p6, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 28
    .line 29
    .line 30
    move-result v11

    .line 31
    invoke-virtual {v0, v8}, Lt2/I;->c0(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0, v9}, Lt2/I;->c0(I)V

    .line 36
    .line 37
    .line 38
    const/4 v11, 0x0

    .line 39
    :goto_0
    const/16 v14, 0x20

    .line 40
    .line 41
    const/4 v15, 0x4

    .line 42
    const/16 v17, 0x3

    .line 43
    .line 44
    const/4 v13, 0x2

    .line 45
    const/4 v10, 0x1

    .line 46
    const/16 v12, 0x10

    .line 47
    .line 48
    if-eqz v11, :cond_c

    .line 49
    .line 50
    if-ne v11, v10, :cond_1

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_1
    if-ne v11, v13, :cond_4f

    .line 55
    .line 56
    invoke-virtual {v0, v12}, Lt2/I;->c0(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lt2/I;->t()D

    .line 60
    .line 61
    .line 62
    move-result-wide v19

    .line 63
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->round(D)J

    .line 64
    .line 65
    .line 66
    move-result-wide v10

    .line 67
    long-to-int v8, v10

    .line 68
    invoke-virtual {v0}, Lt2/I;->Q()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    invoke-virtual {v0, v15}, Lt2/I;->c0(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lt2/I;->Q()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    invoke-virtual {v0}, Lt2/I;->Q()I

    .line 80
    .line 81
    .line 82
    move-result v19

    .line 83
    and-int/lit8 v20, v19, 0x1

    .line 84
    .line 85
    if-eqz v20, :cond_2

    .line 86
    .line 87
    const/16 v20, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const/16 v20, 0x0

    .line 91
    .line 92
    :goto_1
    and-int/lit8 v19, v19, 0x2

    .line 93
    .line 94
    if-eqz v19, :cond_3

    .line 95
    .line 96
    const/16 v19, 0x1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    const/16 v19, 0x0

    .line 100
    .line 101
    :goto_2
    if-nez v20, :cond_a

    .line 102
    .line 103
    if-ne v11, v9, :cond_4

    .line 104
    .line 105
    move/from16 v11, v17

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    if-ne v11, v12, :cond_6

    .line 109
    .line 110
    if-eqz v19, :cond_5

    .line 111
    .line 112
    const/high16 v11, 0x10000000

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    move v11, v13

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    const/16 v12, 0x18

    .line 118
    .line 119
    if-ne v11, v12, :cond_8

    .line 120
    .line 121
    if-eqz v19, :cond_7

    .line 122
    .line 123
    const/high16 v11, 0x50000000

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_7
    const/16 v11, 0x15

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_8
    if-ne v11, v14, :cond_b

    .line 130
    .line 131
    if-eqz v19, :cond_9

    .line 132
    .line 133
    const/high16 v11, 0x60000000

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_9
    const/16 v11, 0x16

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_a
    if-ne v11, v14, :cond_b

    .line 140
    .line 141
    move v11, v15

    .line 142
    goto :goto_3

    .line 143
    :cond_b
    const/4 v11, -0x1

    .line 144
    :goto_3
    invoke-virtual {v0, v9}, Lt2/I;->c0(I)V

    .line 145
    .line 146
    .line 147
    move v9, v10

    .line 148
    move/from16 v19, v13

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    goto :goto_5

    .line 152
    :cond_c
    :goto_4
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    invoke-virtual {v0, v8}, Lt2/I;->c0(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lt2/I;->N()I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    invoke-virtual {v0}, Lt2/I;->g()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    sub-int/2addr v10, v15

    .line 168
    invoke-virtual {v0, v10}, Lt2/I;->b0(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    move/from16 v19, v13

    .line 176
    .line 177
    const/4 v13, 0x1

    .line 178
    if-ne v11, v13, :cond_d

    .line 179
    .line 180
    invoke-virtual {v0, v12}, Lt2/I;->c0(I)V

    .line 181
    .line 182
    .line 183
    :cond_d
    const/4 v11, -0x1

    .line 184
    :goto_5
    const v12, 0x73617762

    .line 185
    .line 186
    .line 187
    const v13, 0x73616d72

    .line 188
    .line 189
    .line 190
    const v14, 0x69616d66

    .line 191
    .line 192
    .line 193
    if-ne v1, v14, :cond_e

    .line 194
    .line 195
    const/4 v8, -0x1

    .line 196
    const/4 v9, -0x1

    .line 197
    goto :goto_7

    .line 198
    :cond_e
    if-ne v1, v13, :cond_f

    .line 199
    .line 200
    const/16 v8, 0x1f40

    .line 201
    .line 202
    :goto_6
    const/4 v9, 0x1

    .line 203
    goto :goto_7

    .line 204
    :cond_f
    if-ne v1, v12, :cond_10

    .line 205
    .line 206
    const/16 v8, 0x3e80

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_10
    :goto_7
    invoke-virtual {v0}, Lt2/I;->g()I

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    const v14, 0x656e6361

    .line 214
    .line 215
    .line 216
    if-ne v1, v14, :cond_13

    .line 217
    .line 218
    invoke-static {v0, v2, v3}, Lo3/b;->z(Lt2/I;II)Landroid/util/Pair;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    if-eqz v14, :cond_12

    .line 223
    .line 224
    iget-object v1, v14, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v1, Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v6, :cond_11

    .line 233
    .line 234
    const/4 v6, 0x0

    .line 235
    goto :goto_8

    .line 236
    :cond_11
    iget-object v12, v14, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v12, Lo3/u;

    .line 239
    .line 240
    iget-object v12, v12, Lo3/u;->b:Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v6, v12}, Lq2/q;->c(Ljava/lang/String;)Lq2/q;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    :goto_8
    iget-object v12, v7, Lo3/b$h;->a:[Lo3/u;

    .line 247
    .line 248
    iget-object v14, v14, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v14, Lo3/u;

    .line 251
    .line 252
    aput-object v14, v12, p9

    .line 253
    .line 254
    :cond_12
    invoke-virtual {v0, v15}, Lt2/I;->b0(I)V

    .line 255
    .line 256
    .line 257
    :cond_13
    const v12, 0x61632d33

    .line 258
    .line 259
    .line 260
    const-string v14, "audio/mhm1"

    .line 261
    .line 262
    const-string v24, "audio/raw"

    .line 263
    .line 264
    if-ne v1, v12, :cond_14

    .line 265
    .line 266
    const-string v12, "audio/ac3"

    .line 267
    .line 268
    :goto_9
    move-object/from16 v25, v12

    .line 269
    .line 270
    move v12, v11

    .line 271
    move-object/from16 v11, v25

    .line 272
    .line 273
    goto/16 :goto_e

    .line 274
    .line 275
    :cond_14
    const v12, 0x65632d33

    .line 276
    .line 277
    .line 278
    if-ne v1, v12, :cond_15

    .line 279
    .line 280
    const-string v12, "audio/eac3"

    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_15
    const v12, 0x61632d34

    .line 284
    .line 285
    .line 286
    if-ne v1, v12, :cond_16

    .line 287
    .line 288
    const-string v12, "audio/ac4"

    .line 289
    .line 290
    goto :goto_9

    .line 291
    :cond_16
    const v12, 0x64747363

    .line 292
    .line 293
    .line 294
    if-ne v1, v12, :cond_17

    .line 295
    .line 296
    const-string v12, "audio/vnd.dts"

    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_17
    const v12, 0x64747368

    .line 300
    .line 301
    .line 302
    if-eq v1, v12, :cond_2c

    .line 303
    .line 304
    const v12, 0x6474736c

    .line 305
    .line 306
    .line 307
    if-ne v1, v12, :cond_18

    .line 308
    .line 309
    goto/16 :goto_d

    .line 310
    .line 311
    :cond_18
    const v12, 0x64747365

    .line 312
    .line 313
    .line 314
    if-ne v1, v12, :cond_19

    .line 315
    .line 316
    const-string v12, "audio/vnd.dts.hd;profile=lbr"

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_19
    const v12, 0x64747378

    .line 320
    .line 321
    .line 322
    if-ne v1, v12, :cond_1a

    .line 323
    .line 324
    const-string v12, "audio/vnd.dts.uhd;profile=p2"

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_1a
    if-ne v1, v13, :cond_1b

    .line 328
    .line 329
    const-string v12, "audio/3gpp"

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_1b
    const v12, 0x73617762

    .line 333
    .line 334
    .line 335
    if-ne v1, v12, :cond_1c

    .line 336
    .line 337
    const-string v12, "audio/amr-wb"

    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_1c
    const v12, 0x736f7774

    .line 341
    .line 342
    .line 343
    if-ne v1, v12, :cond_1d

    .line 344
    .line 345
    :goto_a
    move/from16 v12, v19

    .line 346
    .line 347
    :goto_b
    move-object/from16 v11, v24

    .line 348
    .line 349
    goto/16 :goto_e

    .line 350
    .line 351
    :cond_1d
    const v12, 0x74776f73

    .line 352
    .line 353
    .line 354
    if-ne v1, v12, :cond_1e

    .line 355
    .line 356
    move-object/from16 v11, v24

    .line 357
    .line 358
    const/high16 v12, 0x10000000

    .line 359
    .line 360
    goto/16 :goto_e

    .line 361
    .line 362
    :cond_1e
    const v12, 0x6c70636d

    .line 363
    .line 364
    .line 365
    if-ne v1, v12, :cond_20

    .line 366
    .line 367
    const/4 v12, -0x1

    .line 368
    if-ne v11, v12, :cond_1f

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_1f
    move v12, v11

    .line 372
    goto :goto_b

    .line 373
    :cond_20
    const v12, 0x2e6d7032

    .line 374
    .line 375
    .line 376
    if-eq v1, v12, :cond_2b

    .line 377
    .line 378
    const v12, 0x2e6d7033

    .line 379
    .line 380
    .line 381
    if-ne v1, v12, :cond_21

    .line 382
    .line 383
    goto :goto_c

    .line 384
    :cond_21
    const v12, 0x6d686131

    .line 385
    .line 386
    .line 387
    if-ne v1, v12, :cond_22

    .line 388
    .line 389
    const-string v12, "audio/mha1"

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_22
    const v12, 0x6d686d31

    .line 393
    .line 394
    .line 395
    if-ne v1, v12, :cond_23

    .line 396
    .line 397
    move v12, v11

    .line 398
    move-object v11, v14

    .line 399
    goto :goto_e

    .line 400
    :cond_23
    const v12, 0x616c6163

    .line 401
    .line 402
    .line 403
    if-ne v1, v12, :cond_24

    .line 404
    .line 405
    const-string v12, "audio/alac"

    .line 406
    .line 407
    goto/16 :goto_9

    .line 408
    .line 409
    :cond_24
    const v12, 0x616c6177

    .line 410
    .line 411
    .line 412
    if-ne v1, v12, :cond_25

    .line 413
    .line 414
    const-string v12, "audio/g711-alaw"

    .line 415
    .line 416
    goto/16 :goto_9

    .line 417
    .line 418
    :cond_25
    const v12, 0x756c6177

    .line 419
    .line 420
    .line 421
    if-ne v1, v12, :cond_26

    .line 422
    .line 423
    const-string v12, "audio/g711-mlaw"

    .line 424
    .line 425
    goto/16 :goto_9

    .line 426
    .line 427
    :cond_26
    const v12, 0x4f707573

    .line 428
    .line 429
    .line 430
    if-ne v1, v12, :cond_27

    .line 431
    .line 432
    const-string v12, "audio/opus"

    .line 433
    .line 434
    goto/16 :goto_9

    .line 435
    .line 436
    :cond_27
    const v12, 0x664c6143

    .line 437
    .line 438
    .line 439
    if-ne v1, v12, :cond_28

    .line 440
    .line 441
    const-string v12, "audio/flac"

    .line 442
    .line 443
    goto/16 :goto_9

    .line 444
    .line 445
    :cond_28
    const v12, 0x6d6c7061

    .line 446
    .line 447
    .line 448
    if-ne v1, v12, :cond_29

    .line 449
    .line 450
    const-string v12, "audio/true-hd"

    .line 451
    .line 452
    goto/16 :goto_9

    .line 453
    .line 454
    :cond_29
    const v12, 0x69616d66

    .line 455
    .line 456
    .line 457
    if-ne v1, v12, :cond_2a

    .line 458
    .line 459
    const-string v12, "audio/iamf"

    .line 460
    .line 461
    goto/16 :goto_9

    .line 462
    .line 463
    :cond_2a
    move v12, v11

    .line 464
    const/4 v11, 0x0

    .line 465
    goto :goto_e

    .line 466
    :cond_2b
    :goto_c
    const-string v12, "audio/mpeg"

    .line 467
    .line 468
    goto/16 :goto_9

    .line 469
    .line 470
    :cond_2c
    :goto_d
    const-string v12, "audio/vnd.dts.hd"

    .line 471
    .line 472
    goto/16 :goto_9

    .line 473
    .line 474
    :goto_e
    move/from16 v23, v12

    .line 475
    .line 476
    const/4 v2, 0x0

    .line 477
    const/4 v13, 0x0

    .line 478
    const/16 v16, 0x0

    .line 479
    .line 480
    const/16 v22, 0x0

    .line 481
    .line 482
    :goto_f
    sub-int v12, v15, p2

    .line 483
    .line 484
    if-ge v12, v3, :cond_4c

    .line 485
    .line 486
    invoke-virtual {v0, v15}, Lt2/I;->b0(I)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 490
    .line 491
    .line 492
    move-result v12

    .line 493
    if-lez v12, :cond_2d

    .line 494
    .line 495
    const/4 v3, 0x1

    .line 496
    :goto_10
    move-object/from16 p7, v13

    .line 497
    .line 498
    goto :goto_11

    .line 499
    :cond_2d
    const/4 v3, 0x0

    .line 500
    goto :goto_10

    .line 501
    :goto_11
    const-string v13, "childAtomSize must be positive"

    .line 502
    .line 503
    invoke-static {v3, v13}, LU2/s;->a(ZLjava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    const v13, 0x6d686143

    .line 511
    .line 512
    .line 513
    if-ne v3, v13, :cond_31

    .line 514
    .line 515
    add-int/lit8 v3, v15, 0x8

    .line 516
    .line 517
    invoke-virtual {v0, v3}, Lt2/I;->b0(I)V

    .line 518
    .line 519
    .line 520
    const/4 v13, 0x1

    .line 521
    invoke-virtual {v0, v13}, Lt2/I;->c0(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    invoke-virtual {v0, v13}, Lt2/I;->c0(I)V

    .line 529
    .line 530
    .line 531
    invoke-static {v11, v14}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result v13

    .line 535
    if-eqz v13, :cond_2e

    .line 536
    .line 537
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v3

    .line 545
    const-string v13, "mhm1.%02X"

    .line 546
    .line 547
    invoke-static {v13, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    :goto_12
    move-object v13, v3

    .line 552
    goto :goto_13

    .line 553
    :cond_2e
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    const-string v13, "mha1.%02X"

    .line 562
    .line 563
    invoke-static {v13, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    goto :goto_12

    .line 568
    :goto_13
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    move-object/from16 p7, v13

    .line 573
    .line 574
    new-array v13, v3, [B

    .line 575
    .line 576
    move-object/from16 p9, v14

    .line 577
    .line 578
    const/4 v14, 0x0

    .line 579
    invoke-virtual {v0, v13, v14, v3}, Lt2/I;->q([BII)V

    .line 580
    .line 581
    .line 582
    if-nez v2, :cond_2f

    .line 583
    .line 584
    invoke-static {v13}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    goto :goto_14

    .line 589
    :cond_2f
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    check-cast v2, [B

    .line 594
    .line 595
    invoke-static {v13, v2}, LP9/u;->D(Ljava/lang/Object;Ljava/lang/Object;)LP9/u;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    :cond_30
    :goto_14
    move-object/from16 v3, p7

    .line 600
    .line 601
    :goto_15
    const/4 v13, -0x1

    .line 602
    const/16 v14, 0x20

    .line 603
    .line 604
    const v18, 0x616c6163

    .line 605
    .line 606
    .line 607
    const/16 v20, 0x0

    .line 608
    .line 609
    :goto_16
    const/16 v21, 0x1

    .line 610
    .line 611
    goto/16 :goto_22

    .line 612
    .line 613
    :cond_31
    move-object/from16 p9, v14

    .line 614
    .line 615
    const v13, 0x6d686150

    .line 616
    .line 617
    .line 618
    if-ne v3, v13, :cond_33

    .line 619
    .line 620
    add-int/lit8 v3, v15, 0x8

    .line 621
    .line 622
    invoke-virtual {v0, v3}, Lt2/I;->b0(I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-lez v3, :cond_30

    .line 630
    .line 631
    new-array v13, v3, [B

    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    invoke-virtual {v0, v13, v14, v3}, Lt2/I;->q([BII)V

    .line 635
    .line 636
    .line 637
    if-nez v2, :cond_32

    .line 638
    .line 639
    invoke-static {v13}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    goto :goto_14

    .line 644
    :cond_32
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    check-cast v2, [B

    .line 649
    .line 650
    invoke-static {v2, v13}, LP9/u;->D(Ljava/lang/Object;Ljava/lang/Object;)LP9/u;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    goto :goto_14

    .line 655
    :cond_33
    const v13, 0x65736473

    .line 656
    .line 657
    .line 658
    if-eq v3, v13, :cond_34

    .line 659
    .line 660
    if-eqz p6, :cond_35

    .line 661
    .line 662
    const v14, 0x77617665

    .line 663
    .line 664
    .line 665
    if-ne v3, v14, :cond_35

    .line 666
    .line 667
    :cond_34
    const/16 v14, 0x20

    .line 668
    .line 669
    const v18, 0x616c6163

    .line 670
    .line 671
    .line 672
    const/16 v20, 0x0

    .line 673
    .line 674
    const/16 v21, 0x1

    .line 675
    .line 676
    goto/16 :goto_1e

    .line 677
    .line 678
    :cond_35
    const v13, 0x62747274

    .line 679
    .line 680
    .line 681
    if-ne v3, v13, :cond_36

    .line 682
    .line 683
    invoke-static {v0, v15}, Lo3/b;->k(Lt2/I;I)Lo3/b$a;

    .line 684
    .line 685
    .line 686
    move-result-object v22

    .line 687
    goto :goto_14

    .line 688
    :cond_36
    const v13, 0x64616333

    .line 689
    .line 690
    .line 691
    if-ne v3, v13, :cond_38

    .line 692
    .line 693
    add-int/lit8 v3, v15, 0x8

    .line 694
    .line 695
    invoke-virtual {v0, v3}, Lt2/I;->b0(I)V

    .line 696
    .line 697
    .line 698
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    invoke-static {v0, v3, v5, v6}, LU2/b;->d(Lt2/I;Ljava/lang/String;Ljava/lang/String;Lq2/q;)Lq2/x;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    iput-object v3, v7, Lo3/b$h;->b:Lq2/x;

    .line 707
    .line 708
    :cond_37
    :goto_17
    const/16 v14, 0x20

    .line 709
    .line 710
    const/16 v21, 0x1

    .line 711
    .line 712
    goto/16 :goto_1d

    .line 713
    .line 714
    :cond_38
    const v13, 0x64656333

    .line 715
    .line 716
    .line 717
    if-ne v3, v13, :cond_39

    .line 718
    .line 719
    add-int/lit8 v3, v15, 0x8

    .line 720
    .line 721
    invoke-virtual {v0, v3}, Lt2/I;->b0(I)V

    .line 722
    .line 723
    .line 724
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    invoke-static {v0, v3, v5, v6}, LU2/b;->h(Lt2/I;Ljava/lang/String;Ljava/lang/String;Lq2/q;)Lq2/x;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    iput-object v3, v7, Lo3/b$h;->b:Lq2/x;

    .line 733
    .line 734
    goto :goto_17

    .line 735
    :cond_39
    const v13, 0x64616334

    .line 736
    .line 737
    .line 738
    if-ne v3, v13, :cond_3a

    .line 739
    .line 740
    add-int/lit8 v3, v15, 0x8

    .line 741
    .line 742
    invoke-virtual {v0, v3}, Lt2/I;->b0(I)V

    .line 743
    .line 744
    .line 745
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    invoke-static {v0, v3, v5, v6}, LU2/c;->e(Lt2/I;Ljava/lang/String;Ljava/lang/String;Lq2/q;)Lq2/x;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    iput-object v3, v7, Lo3/b$h;->b:Lq2/x;

    .line 754
    .line 755
    goto :goto_17

    .line 756
    :cond_3a
    const v13, 0x646d6c70

    .line 757
    .line 758
    .line 759
    if-ne v3, v13, :cond_3c

    .line 760
    .line 761
    if-lez v10, :cond_3b

    .line 762
    .line 763
    move-object/from16 v3, p7

    .line 764
    .line 765
    move v8, v10

    .line 766
    move/from16 v9, v19

    .line 767
    .line 768
    goto/16 :goto_15

    .line 769
    .line 770
    :cond_3b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 771
    .line 772
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 773
    .line 774
    .line 775
    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    .line 776
    .line 777
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    const/4 v14, 0x0

    .line 788
    invoke-static {v0, v14}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    throw v0

    .line 793
    :cond_3c
    const/4 v14, 0x0

    .line 794
    const v13, 0x64647473

    .line 795
    .line 796
    .line 797
    if-eq v3, v13, :cond_3d

    .line 798
    .line 799
    const v13, 0x75647473

    .line 800
    .line 801
    .line 802
    if-ne v3, v13, :cond_3e

    .line 803
    .line 804
    :cond_3d
    const/16 v14, 0x20

    .line 805
    .line 806
    const/16 v21, 0x1

    .line 807
    .line 808
    goto/16 :goto_1c

    .line 809
    .line 810
    :cond_3e
    const v13, 0x644f7073

    .line 811
    .line 812
    .line 813
    if-ne v3, v13, :cond_3f

    .line 814
    .line 815
    add-int/lit8 v2, v12, -0x8

    .line 816
    .line 817
    sget-object v3, Lo3/b;->a:[B

    .line 818
    .line 819
    array-length v13, v3

    .line 820
    add-int/2addr v13, v2

    .line 821
    invoke-static {v3, v13}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 822
    .line 823
    .line 824
    move-result-object v13

    .line 825
    add-int/lit8 v14, v15, 0x8

    .line 826
    .line 827
    invoke-virtual {v0, v14}, Lt2/I;->b0(I)V

    .line 828
    .line 829
    .line 830
    array-length v3, v3

    .line 831
    invoke-virtual {v0, v13, v3, v2}, Lt2/I;->q([BII)V

    .line 832
    .line 833
    .line 834
    invoke-static {v13}, LU2/H;->a([B)Ljava/util/List;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    goto/16 :goto_14

    .line 839
    .line 840
    :cond_3f
    const v13, 0x64664c61

    .line 841
    .line 842
    .line 843
    if-ne v3, v13, :cond_40

    .line 844
    .line 845
    add-int/lit8 v2, v12, -0xc

    .line 846
    .line 847
    add-int/lit8 v3, v12, -0x8

    .line 848
    .line 849
    new-array v3, v3, [B

    .line 850
    .line 851
    const/16 v13, 0x66

    .line 852
    .line 853
    const/16 v18, 0x0

    .line 854
    .line 855
    aput-byte v13, v3, v18

    .line 856
    .line 857
    const/16 v13, 0x4c

    .line 858
    .line 859
    const/16 v21, 0x1

    .line 860
    .line 861
    aput-byte v13, v3, v21

    .line 862
    .line 863
    const/16 v13, 0x61

    .line 864
    .line 865
    aput-byte v13, v3, v19

    .line 866
    .line 867
    const/16 v13, 0x43

    .line 868
    .line 869
    aput-byte v13, v3, v17

    .line 870
    .line 871
    add-int/lit8 v13, v15, 0xc

    .line 872
    .line 873
    invoke-virtual {v0, v13}, Lt2/I;->b0(I)V

    .line 874
    .line 875
    .line 876
    const/4 v14, 0x4

    .line 877
    invoke-virtual {v0, v3, v14, v2}, Lt2/I;->q([BII)V

    .line 878
    .line 879
    .line 880
    invoke-static {v3}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    goto/16 :goto_14

    .line 885
    .line 886
    :cond_40
    const v13, 0x616c6163

    .line 887
    .line 888
    .line 889
    const/4 v14, 0x4

    .line 890
    if-ne v3, v13, :cond_42

    .line 891
    .line 892
    add-int/lit8 v2, v12, -0xc

    .line 893
    .line 894
    new-array v3, v2, [B

    .line 895
    .line 896
    add-int/lit8 v8, v15, 0xc

    .line 897
    .line 898
    invoke-virtual {v0, v8}, Lt2/I;->b0(I)V

    .line 899
    .line 900
    .line 901
    const/4 v8, 0x0

    .line 902
    invoke-virtual {v0, v3, v8, v2}, Lt2/I;->q([BII)V

    .line 903
    .line 904
    .line 905
    invoke-static {v3}, Lt2/k;->z([B)Landroid/util/Pair;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast v8, Ljava/lang/Integer;

    .line 912
    .line 913
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 914
    .line 915
    .line 916
    move-result v8

    .line 917
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v2, Ljava/lang/Integer;

    .line 920
    .line 921
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 922
    .line 923
    .line 924
    move-result v2

    .line 925
    invoke-static {v3}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    move v9, v2

    .line 930
    move-object v2, v3

    .line 931
    move/from16 v18, v13

    .line 932
    .line 933
    const/4 v13, -0x1

    .line 934
    const/16 v14, 0x20

    .line 935
    .line 936
    const/16 v20, 0x0

    .line 937
    .line 938
    const/16 v21, 0x1

    .line 939
    .line 940
    :cond_41
    :goto_18
    move-object/from16 v3, p7

    .line 941
    .line 942
    goto/16 :goto_22

    .line 943
    .line 944
    :cond_42
    const v13, 0x69616362

    .line 945
    .line 946
    .line 947
    if-ne v3, v13, :cond_43

    .line 948
    .line 949
    add-int/lit8 v2, v15, 0x9

    .line 950
    .line 951
    invoke-virtual {v0, v2}, Lt2/I;->b0(I)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v0}, Lt2/I;->R()I

    .line 955
    .line 956
    .line 957
    move-result v2

    .line 958
    new-array v3, v2, [B

    .line 959
    .line 960
    const/4 v13, 0x0

    .line 961
    invoke-virtual {v0, v3, v13, v2}, Lt2/I;->q([BII)V

    .line 962
    .line 963
    .line 964
    invoke-static {v3}, Lt2/k;->i([B)Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v2

    .line 968
    invoke-static {v3}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 969
    .line 970
    .line 971
    move-result-object v3

    .line 972
    move-object v14, v3

    .line 973
    move-object v3, v2

    .line 974
    move-object v2, v14

    .line 975
    move/from16 v20, v13

    .line 976
    .line 977
    const/4 v13, -0x1

    .line 978
    const/16 v14, 0x20

    .line 979
    .line 980
    const v18, 0x616c6163

    .line 981
    .line 982
    .line 983
    goto/16 :goto_16

    .line 984
    .line 985
    :cond_43
    const v13, 0x70636d43

    .line 986
    .line 987
    .line 988
    if-ne v3, v13, :cond_37

    .line 989
    .line 990
    add-int/lit8 v3, v15, 0xc

    .line 991
    .line 992
    invoke-virtual {v0, v3}, Lt2/I;->b0(I)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 996
    .line 997
    .line 998
    move-result v3

    .line 999
    const/16 v21, 0x1

    .line 1000
    .line 1001
    and-int/lit8 v3, v3, 0x1

    .line 1002
    .line 1003
    if-eqz v3, :cond_44

    .line 1004
    .line 1005
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1006
    .line 1007
    goto :goto_19

    .line 1008
    :cond_44
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 1009
    .line 1010
    :goto_19
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 1011
    .line 1012
    .line 1013
    move-result v13

    .line 1014
    const v14, 0x6970636d

    .line 1015
    .line 1016
    .line 1017
    if-ne v1, v14, :cond_45

    .line 1018
    .line 1019
    invoke-static {v13, v3}, Lt2/a0;->m0(ILjava/nio/ByteOrder;)I

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    const/4 v13, -0x1

    .line 1024
    const/16 v14, 0x20

    .line 1025
    .line 1026
    goto :goto_1b

    .line 1027
    :cond_45
    const v14, 0x6670636d

    .line 1028
    .line 1029
    .line 1030
    if-ne v1, v14, :cond_46

    .line 1031
    .line 1032
    const/16 v14, 0x20

    .line 1033
    .line 1034
    if-ne v13, v14, :cond_47

    .line 1035
    .line 1036
    sget-object v13, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1037
    .line 1038
    invoke-virtual {v3, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v3

    .line 1042
    if-eqz v3, :cond_47

    .line 1043
    .line 1044
    const/4 v3, 0x4

    .line 1045
    :goto_1a
    const/4 v13, -0x1

    .line 1046
    goto :goto_1b

    .line 1047
    :cond_46
    const/16 v14, 0x20

    .line 1048
    .line 1049
    :cond_47
    move/from16 v3, v23

    .line 1050
    .line 1051
    goto :goto_1a

    .line 1052
    :goto_1b
    move/from16 v23, v3

    .line 1053
    .line 1054
    if-eq v3, v13, :cond_48

    .line 1055
    .line 1056
    move-object/from16 v11, v24

    .line 1057
    .line 1058
    :cond_48
    const v18, 0x616c6163

    .line 1059
    .line 1060
    .line 1061
    const/16 v20, 0x0

    .line 1062
    .line 1063
    goto :goto_18

    .line 1064
    :goto_1c
    new-instance v3, Lq2/x$b;

    .line 1065
    .line 1066
    invoke-direct {v3}, Lq2/x$b;-><init>()V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v3, v4}, Lq2/x$b;->i0(I)Lq2/x$b;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v3

    .line 1073
    invoke-virtual {v3, v11}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v3

    .line 1077
    invoke-virtual {v3, v9}, Lq2/x$b;->T(I)Lq2/x$b;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v3

    .line 1081
    invoke-virtual {v3, v8}, Lq2/x$b;->z0(I)Lq2/x$b;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v3

    .line 1085
    invoke-virtual {v3, v6}, Lq2/x$b;->c0(Lq2/q;)Lq2/x$b;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v3

    .line 1089
    invoke-virtual {v3, v5}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    invoke-virtual {v3}, Lq2/x$b;->P()Lq2/x;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    iput-object v3, v7, Lo3/b$h;->b:Lq2/x;

    .line 1098
    .line 1099
    :goto_1d
    move-object/from16 v3, p7

    .line 1100
    .line 1101
    const/4 v13, -0x1

    .line 1102
    const v18, 0x616c6163

    .line 1103
    .line 1104
    .line 1105
    const/16 v20, 0x0

    .line 1106
    .line 1107
    goto :goto_22

    .line 1108
    :goto_1e
    if-ne v3, v13, :cond_49

    .line 1109
    .line 1110
    move v3, v15

    .line 1111
    :goto_1f
    const/4 v13, -0x1

    .line 1112
    goto :goto_20

    .line 1113
    :cond_49
    invoke-static {v0, v13, v15, v12}, Lo3/b;->c(Lt2/I;III)I

    .line 1114
    .line 1115
    .line 1116
    move-result v3

    .line 1117
    goto :goto_1f

    .line 1118
    :goto_20
    if-eq v3, v13, :cond_41

    .line 1119
    .line 1120
    invoke-static {v0, v3}, Lo3/b;->n(Lt2/I;I)Lo3/b$c;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v16

    .line 1124
    invoke-static/range {v16 .. v16}, Lo3/b$c;->a(Lo3/b$c;)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v11

    .line 1128
    invoke-static/range {v16 .. v16}, Lo3/b$c;->d(Lo3/b$c;)[B

    .line 1129
    .line 1130
    .line 1131
    move-result-object v3

    .line 1132
    if-eqz v3, :cond_41

    .line 1133
    .line 1134
    const-string v2, "audio/vorbis"

    .line 1135
    .line 1136
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1137
    .line 1138
    .line 1139
    move-result v2

    .line 1140
    if-eqz v2, :cond_4a

    .line 1141
    .line 1142
    invoke-static {v3}, LU2/S;->e([B)LP9/u;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v2

    .line 1146
    goto/16 :goto_18

    .line 1147
    .line 1148
    :cond_4a
    const-string v2, "audio/mp4a-latm"

    .line 1149
    .line 1150
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v2

    .line 1154
    if-eqz v2, :cond_4b

    .line 1155
    .line 1156
    invoke-static {v3}, LU2/a;->e([B)LU2/a$b;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v2

    .line 1160
    iget v8, v2, LU2/a$b;->a:I

    .line 1161
    .line 1162
    iget v9, v2, LU2/a$b;->b:I

    .line 1163
    .line 1164
    iget-object v2, v2, LU2/a$b;->c:Ljava/lang/String;

    .line 1165
    .line 1166
    goto :goto_21

    .line 1167
    :cond_4b
    move-object/from16 v2, p7

    .line 1168
    .line 1169
    :goto_21
    invoke-static {v3}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v3

    .line 1173
    move-object/from16 v25, v3

    .line 1174
    .line 1175
    move-object v3, v2

    .line 1176
    move-object/from16 v2, v25

    .line 1177
    .line 1178
    :goto_22
    add-int/2addr v15, v12

    .line 1179
    move-object/from16 v14, p9

    .line 1180
    .line 1181
    move-object v13, v3

    .line 1182
    move/from16 v3, p3

    .line 1183
    .line 1184
    goto/16 :goto_f

    .line 1185
    .line 1186
    :cond_4c
    move-object/from16 p7, v13

    .line 1187
    .line 1188
    iget-object v0, v7, Lo3/b$h;->b:Lq2/x;

    .line 1189
    .line 1190
    if-nez v0, :cond_4f

    .line 1191
    .line 1192
    if-eqz v11, :cond_4f

    .line 1193
    .line 1194
    new-instance v0, Lq2/x$b;

    .line 1195
    .line 1196
    invoke-direct {v0}, Lq2/x$b;-><init>()V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v0, v4}, Lq2/x$b;->i0(I)Lq2/x$b;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    invoke-virtual {v0, v11}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    move-object/from16 v3, p7

    .line 1208
    .line 1209
    invoke-virtual {v0, v3}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    invoke-virtual {v0, v9}, Lq2/x$b;->T(I)Lq2/x$b;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    invoke-virtual {v0, v8}, Lq2/x$b;->z0(I)Lq2/x$b;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    move/from16 v12, v23

    .line 1222
    .line 1223
    invoke-virtual {v0, v12}, Lq2/x$b;->s0(I)Lq2/x$b;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    invoke-virtual {v0, v2}, Lq2/x$b;->k0(Ljava/util/List;)Lq2/x$b;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    invoke-virtual {v0, v6}, Lq2/x$b;->c0(Lq2/q;)Lq2/x$b;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    invoke-virtual {v0, v5}, Lq2/x$b;->n0(Ljava/lang/String;)Lq2/x$b;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    if-eqz v16, :cond_4d

    .line 1240
    .line 1241
    invoke-static/range {v16 .. v16}, Lo3/b$c;->c(Lo3/b$c;)J

    .line 1242
    .line 1243
    .line 1244
    move-result-wide v1

    .line 1245
    invoke-static {v1, v2}, LS9/f;->n(J)I

    .line 1246
    .line 1247
    .line 1248
    move-result v1

    .line 1249
    invoke-virtual {v0, v1}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    invoke-static/range {v16 .. v16}, Lo3/b$c;->b(Lo3/b$c;)J

    .line 1254
    .line 1255
    .line 1256
    move-result-wide v2

    .line 1257
    invoke-static {v2, v3}, LS9/f;->n(J)I

    .line 1258
    .line 1259
    .line 1260
    move-result v2

    .line 1261
    invoke-virtual {v1, v2}, Lq2/x$b;->t0(I)Lq2/x$b;

    .line 1262
    .line 1263
    .line 1264
    goto :goto_23

    .line 1265
    :cond_4d
    if-eqz v22, :cond_4e

    .line 1266
    .line 1267
    invoke-static/range {v22 .. v22}, Lo3/b$a;->b(Lo3/b$a;)J

    .line 1268
    .line 1269
    .line 1270
    move-result-wide v1

    .line 1271
    invoke-static {v1, v2}, LS9/f;->n(J)I

    .line 1272
    .line 1273
    .line 1274
    move-result v1

    .line 1275
    invoke-virtual {v0, v1}, Lq2/x$b;->S(I)Lq2/x$b;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v1

    .line 1279
    invoke-static/range {v22 .. v22}, Lo3/b$a;->a(Lo3/b$a;)J

    .line 1280
    .line 1281
    .line 1282
    move-result-wide v2

    .line 1283
    invoke-static {v2, v3}, LS9/f;->n(J)I

    .line 1284
    .line 1285
    .line 1286
    move-result v2

    .line 1287
    invoke-virtual {v1, v2}, Lq2/x$b;->t0(I)Lq2/x$b;

    .line 1288
    .line 1289
    .line 1290
    :cond_4e
    :goto_23
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v0

    .line 1294
    iput-object v0, v7, Lo3/b$h;->b:Lq2/x;

    .line 1295
    .line 1296
    :cond_4f
    return-void
.end method

.method private static j(Lt2/I;)Lq2/l;
    .locals 15

    .line 1
    new-instance v0, Lq2/l$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/l$b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lt2/H;

    .line 7
    .line 8
    invoke-virtual {p0}, Lt2/I;->f()[B

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v1, v2}, Lt2/H;-><init>([B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    mul-int/2addr p0, v2

    .line 22
    invoke-virtual {v1, p0}, Lt2/H;->p(I)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    invoke-virtual {v1, p0}, Lt2/H;->s(I)V

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    invoke-virtual {v1, v3}, Lt2/H;->h(I)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x6

    .line 35
    invoke-virtual {v1, v5}, Lt2/H;->r(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/16 v7, 0xc

    .line 47
    .line 48
    const/16 v8, 0xa

    .line 49
    .line 50
    const/4 v9, 0x2

    .line 51
    if-ne v4, v9, :cond_2

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    move v4, v7

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v4, v8

    .line 60
    :goto_0
    invoke-virtual {v0, v4}, Lq2/l$b;->g(I)Lq2/l$b;

    .line 61
    .line 62
    .line 63
    if-eqz v6, :cond_1

    .line 64
    .line 65
    move v8, v7

    .line 66
    :cond_1
    invoke-virtual {v0, v8}, Lq2/l$b;->b(I)Lq2/l$b;

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    if-gt v4, v9, :cond_5

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    move v4, v8

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move v4, v2

    .line 77
    :goto_1
    invoke-virtual {v0, v4}, Lq2/l$b;->g(I)Lq2/l$b;

    .line 78
    .line 79
    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move v8, v2

    .line 84
    :goto_2
    invoke-virtual {v0, v8}, Lq2/l$b;->b(I)Lq2/l$b;

    .line 85
    .line 86
    .line 87
    :cond_5
    :goto_3
    const/16 v4, 0xd

    .line 88
    .line 89
    invoke-virtual {v1, v4}, Lt2/H;->r(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lt2/H;->q()V

    .line 93
    .line 94
    .line 95
    const/4 v5, 0x4

    .line 96
    invoke-virtual {v1, v5}, Lt2/H;->h(I)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    const-string v8, "BoxParsers"

    .line 101
    .line 102
    if-eq v6, p0, :cond_6

    .line 103
    .line 104
    new-instance p0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v1, "Unsupported obu_type: "

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {v8, p0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lq2/l$b;->a()Lq2/l;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :cond_6
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_7

    .line 134
    .line 135
    const-string p0, "Unsupported obu_extension_flag"

    .line 136
    .line 137
    invoke-static {v8, p0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lq2/l$b;->a()Lq2/l;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :cond_7
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    invoke-virtual {v1}, Lt2/H;->q()V

    .line 150
    .line 151
    .line 152
    if-eqz v6, :cond_8

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Lt2/H;->h(I)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    const/16 v10, 0x7f

    .line 159
    .line 160
    if-le v6, v10, :cond_8

    .line 161
    .line 162
    const-string p0, "Excessive obu_size"

    .line 163
    .line 164
    invoke-static {v8, p0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Lq2/l$b;->a()Lq2/l;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :cond_8
    invoke-virtual {v1, v3}, Lt2/H;->h(I)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    invoke-virtual {v1}, Lt2/H;->q()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-eqz v10, :cond_9

    .line 184
    .line 185
    const-string p0, "Unsupported reduced_still_picture_header"

    .line 186
    .line 187
    invoke-static {v8, p0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lq2/l$b;->a()Lq2/l;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :cond_9
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    if-eqz v10, :cond_a

    .line 200
    .line 201
    const-string p0, "Unsupported timing_info_present_flag"

    .line 202
    .line 203
    invoke-static {v8, p0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Lq2/l$b;->a()Lq2/l;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    return-object p0

    .line 211
    :cond_a
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-eqz v10, :cond_b

    .line 216
    .line 217
    const-string p0, "Unsupported initial_display_delay_present_flag"

    .line 218
    .line 219
    invoke-static {v8, p0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Lq2/l$b;->a()Lq2/l;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :cond_b
    const/4 v8, 0x5

    .line 228
    invoke-virtual {v1, v8}, Lt2/H;->h(I)I

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    const/4 v11, 0x0

    .line 233
    move v12, v11

    .line 234
    :goto_4
    const/4 v13, 0x7

    .line 235
    if-gt v12, v10, :cond_d

    .line 236
    .line 237
    invoke-virtual {v1, v7}, Lt2/H;->r(I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v8}, Lt2/H;->h(I)I

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    if-le v14, v13, :cond_c

    .line 245
    .line 246
    invoke-virtual {v1}, Lt2/H;->q()V

    .line 247
    .line 248
    .line 249
    :cond_c
    add-int/lit8 v12, v12, 0x1

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_d
    invoke-virtual {v1, v5}, Lt2/H;->h(I)I

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    invoke-virtual {v1, v5}, Lt2/H;->h(I)I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    add-int/2addr v7, p0

    .line 261
    invoke-virtual {v1, v7}, Lt2/H;->r(I)V

    .line 262
    .line 263
    .line 264
    add-int/2addr v5, p0

    .line 265
    invoke-virtual {v1, v5}, Lt2/H;->r(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_e

    .line 273
    .line 274
    invoke-virtual {v1, v13}, Lt2/H;->r(I)V

    .line 275
    .line 276
    .line 277
    :cond_e
    invoke-virtual {v1, v13}, Lt2/H;->r(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-eqz v5, :cond_f

    .line 285
    .line 286
    invoke-virtual {v1, v9}, Lt2/H;->r(I)V

    .line 287
    .line 288
    .line 289
    :cond_f
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    if-eqz v7, :cond_10

    .line 294
    .line 295
    move v7, v9

    .line 296
    goto :goto_5

    .line 297
    :cond_10
    invoke-virtual {v1, p0}, Lt2/H;->h(I)I

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    :goto_5
    if-lez v7, :cond_11

    .line 302
    .line 303
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    if-nez v7, :cond_11

    .line 308
    .line 309
    invoke-virtual {v1, p0}, Lt2/H;->r(I)V

    .line 310
    .line 311
    .line 312
    :cond_11
    if-eqz v5, :cond_12

    .line 313
    .line 314
    invoke-virtual {v1, v3}, Lt2/H;->r(I)V

    .line 315
    .line 316
    .line 317
    :cond_12
    invoke-virtual {v1, v3}, Lt2/H;->r(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-ne v6, v9, :cond_13

    .line 325
    .line 326
    if-eqz v3, :cond_13

    .line 327
    .line 328
    invoke-virtual {v1}, Lt2/H;->q()V

    .line 329
    .line 330
    .line 331
    :cond_13
    if-eq v6, p0, :cond_14

    .line 332
    .line 333
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-eqz v3, :cond_14

    .line 338
    .line 339
    move v11, p0

    .line 340
    :cond_14
    invoke-virtual {v1}, Lt2/H;->g()Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-eqz v3, :cond_17

    .line 345
    .line 346
    invoke-virtual {v1, v2}, Lt2/H;->h(I)I

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    invoke-virtual {v1, v2}, Lt2/H;->h(I)I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    invoke-virtual {v1, v2}, Lt2/H;->h(I)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-nez v11, :cond_15

    .line 359
    .line 360
    if-ne v3, p0, :cond_15

    .line 361
    .line 362
    if-ne v5, v4, :cond_15

    .line 363
    .line 364
    if-nez v2, :cond_15

    .line 365
    .line 366
    move v1, p0

    .line 367
    goto :goto_6

    .line 368
    :cond_15
    invoke-virtual {v1, p0}, Lt2/H;->h(I)I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    :goto_6
    invoke-static {v3}, Lq2/l;->k(I)I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    invoke-virtual {v0, v2}, Lq2/l$b;->d(I)Lq2/l$b;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    if-ne v1, p0, :cond_16

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_16
    move p0, v9

    .line 384
    :goto_7
    invoke-virtual {v2, p0}, Lq2/l$b;->c(I)Lq2/l$b;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    invoke-static {v5}, Lq2/l;->l(I)I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    invoke-virtual {p0, v1}, Lq2/l$b;->e(I)Lq2/l$b;

    .line 393
    .line 394
    .line 395
    :cond_17
    invoke-virtual {v0}, Lq2/l$b;->a()Lq2/l;

    .line 396
    .line 397
    .line 398
    move-result-object p0

    .line 399
    return-object p0
.end method

.method private static k(Lt2/I;I)Lo3/b$a;
    .locals 3

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    invoke-virtual {p0, p1}, Lt2/I;->c0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    new-instance v2, Lo3/b$a;

    .line 19
    .line 20
    invoke-direct {v2, p0, p1, v0, v1}, Lo3/b$a;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    return-object v2
.end method

.method static l(Lt2/I;II)Landroid/util/Pair;
    .locals 11

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move v5, v1

    .line 7
    move v7, v2

    .line 8
    move-object v4, v3

    .line 9
    move-object v6, v4

    .line 10
    :goto_0
    sub-int v8, v0, p1

    .line 11
    .line 12
    if-ge v8, p2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    const v10, 0x66726d61

    .line 26
    .line 27
    .line 28
    if-ne v9, v10, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const v10, 0x7363686d

    .line 40
    .line 41
    .line 42
    if-ne v9, v10, :cond_1

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    invoke-virtual {p0, v4}, Lt2/I;->c0(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4}, Lt2/I;->J(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const v10, 0x73636869

    .line 54
    .line 55
    .line 56
    if-ne v9, v10, :cond_2

    .line 57
    .line 58
    move v5, v0

    .line 59
    move v7, v8

    .line 60
    :cond_2
    :goto_1
    add-int/2addr v0, v8

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const-string p1, "cenc"

    .line 63
    .line 64
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    const-string p1, "cbc1"

    .line 71
    .line 72
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_5

    .line 77
    .line 78
    const-string p1, "cens"

    .line 79
    .line 80
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    const-string p1, "cbcs"

    .line 87
    .line 88
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    return-object v3

    .line 96
    :cond_5
    :goto_2
    const/4 p1, 0x1

    .line 97
    if-eqz v6, :cond_6

    .line 98
    .line 99
    move p2, p1

    .line 100
    goto :goto_3

    .line 101
    :cond_6
    move p2, v2

    .line 102
    :goto_3
    const-string v0, "frma atom is mandatory"

    .line 103
    .line 104
    invoke-static {p2, v0}, LU2/s;->a(ZLjava/lang/String;)V

    .line 105
    .line 106
    .line 107
    if-eq v5, v1, :cond_7

    .line 108
    .line 109
    move p2, p1

    .line 110
    goto :goto_4

    .line 111
    :cond_7
    move p2, v2

    .line 112
    :goto_4
    const-string v0, "schi atom is mandatory"

    .line 113
    .line 114
    invoke-static {p2, v0}, LU2/s;->a(ZLjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v5, v7, v4}, Lo3/b;->A(Lt2/I;IILjava/lang/String;)Lo3/u;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-eqz p0, :cond_8

    .line 122
    .line 123
    move v2, p1

    .line 124
    :cond_8
    const-string p1, "tenc atom is mandatory"

    .line 125
    .line 126
    invoke-static {v2, p1}, LU2/s;->a(ZLjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, Lo3/u;

    .line 134
    .line 135
    invoke-static {v6, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0
.end method

.method private static m(Lu2/e$b;)Landroid/util/Pair;
    .locals 8

    .line 1
    const v0, 0x656c7374

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lu2/e$c;->b:Lt2/I;

    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Lo3/b;->q(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lt2/I;->Q()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    new-array v2, v1, [J

    .line 32
    .line 33
    new-array v3, v1, [J

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    :goto_0
    if-ge v4, v1, :cond_4

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    if-ne v0, v5, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lt2/I;->T()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    :goto_1
    aput-wide v6, v2, v4

    .line 51
    .line 52
    if-ne v0, v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lt2/I;->F()J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    int-to-long v6, v6

    .line 64
    :goto_2
    aput-wide v6, v3, v4

    .line 65
    .line 66
    invoke-virtual {p0}, Lt2/I;->I()S

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-ne v6, v5, :cond_3

    .line 71
    .line 72
    const/4 v5, 0x2

    .line 73
    invoke-virtual {p0, v5}, Lt2/I;->c0(I)V

    .line 74
    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string v0, "Unsupported media rate."

    .line 82
    .line 83
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_4
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method private static n(Lt2/I;I)Lo3/b$c;
    .locals 10

    .line 1
    add-int/lit8 p1, p1, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lt2/I;->c0(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lo3/b;->o(Lt2/I;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0, v2}, Lt2/I;->c0(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, p1}, Lt2/I;->c0(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lo3/b;->o(Lt2/I;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Lq2/K;->h(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p0, p1}, Lt2/I;->c0(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, Lo3/b;->o(Lt2/I;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p1, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p0, v3, v6, p1}, Lt2/I;->q([BII)V

    .line 109
    .line 110
    .line 111
    move-wide p0, v0

    .line 112
    new-instance v1, Lo3/b$c;

    .line 113
    .line 114
    const-wide/16 v6, 0x0

    .line 115
    .line 116
    cmp-long v0, v4, v6

    .line 117
    .line 118
    const-wide/16 v8, -0x1

    .line 119
    .line 120
    if-lez v0, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    move-wide v4, v8

    .line 124
    :goto_0
    cmp-long v0, p0, v6

    .line 125
    .line 126
    if-lez v0, :cond_5

    .line 127
    .line 128
    move-wide v6, p0

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    move-wide v6, v8

    .line 131
    :goto_1
    invoke-direct/range {v1 .. v7}, Lo3/b$c;-><init>(Ljava/lang/String;[BJJ)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_6
    :goto_2
    new-instance v1, Lo3/b$c;

    .line 136
    .line 137
    const-wide/16 v4, -0x1

    .line 138
    .line 139
    const-wide/16 v6, -0x1

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    invoke-direct/range {v1 .. v7}, Lo3/b$c;-><init>(Ljava/lang/String;[BJJ)V

    .line 143
    .line 144
    .line 145
    return-object v1
.end method

.method private static o(Lt2/I;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lt2/I;->M()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
.end method

.method public static p(I)I
    .locals 1

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p0, v0

    .line 5
    return p0
.end method

.method public static q(I)I
    .locals 0

    .line 1
    shr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
.end method

.method private static r(Lt2/I;)I
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static s(Lt2/I;I)Lq2/J;
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge v1, p1, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, Lo3/j;->d(Lt2/I;)Lq2/J$a;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :cond_2
    new-instance p0, Lq2/J;

    .line 36
    .line 37
    invoke-direct {p0, v0}, Lq2/J;-><init>(Ljava/util/List;)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method private static t(Lt2/I;)Lo3/b$e;
    .locals 10

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lo3/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move v2, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v2, 0x10

    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0, v2}, Lt2/I;->c0(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    :cond_1
    const/4 v3, 0x0

    .line 35
    :goto_1
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    if-ge v3, v0, :cond_5

    .line 41
    .line 42
    invoke-virtual {p0}, Lt2/I;->f()[B

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    add-int v9, v2, v3

    .line 47
    .line 48
    aget-byte v8, v8, v9

    .line 49
    .line 50
    const/4 v9, -0x1

    .line 51
    if-eq v8, v9, :cond_4

    .line 52
    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {p0}, Lt2/I;->T()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    :goto_2
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    cmp-long v2, v0, v2

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    move-wide v7, v4

    .line 72
    const-wide/32 v5, 0xf4240

    .line 73
    .line 74
    .line 75
    move-wide v3, v0

    .line 76
    invoke-static/range {v3 .. v8}, Lt2/a0;->m1(JJJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    move-wide v4, v7

    .line 81
    move-wide v6, v0

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    invoke-virtual {p0, v0}, Lt2/I;->c0(I)V

    .line 87
    .line 88
    .line 89
    :goto_3
    invoke-virtual {p0}, Lt2/I;->U()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {p0}, Lo3/b;->e(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    new-instance v3, Lo3/b$e;

    .line 98
    .line 99
    invoke-direct/range {v3 .. v8}, Lo3/b$e;-><init>(JJLjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v3
.end method

.method public static u(Lu2/e$b;)Lq2/J;
    .locals 10

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x6b657973

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x696c7374

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lu2/e$b;->e(I)Lu2/e$c;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    if-eqz v1, :cond_6

    .line 26
    .line 27
    if-eqz p0, :cond_6

    .line 28
    .line 29
    iget-object v0, v0, Lu2/e$c;->b:Lt2/I;

    .line 30
    .line 31
    invoke-static {v0}, Lo3/b;->r(Lt2/I;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const v3, 0x6d647461

    .line 36
    .line 37
    .line 38
    if-eq v0, v3, :cond_0

    .line 39
    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_0
    iget-object v0, v1, Lu2/e$c;->b:Lt2/I;

    .line 43
    .line 44
    const/16 v1, 0xc

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lt2/I;->b0(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    new-array v3, v1, [Ljava/lang/String;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    :goto_0
    const/16 v5, 0x8

    .line 57
    .line 58
    if-ge v4, v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, Lt2/I;->v()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const/4 v7, 0x4

    .line 65
    invoke-virtual {v0, v7}, Lt2/I;->c0(I)V

    .line 66
    .line 67
    .line 68
    sub-int/2addr v6, v5

    .line 69
    invoke-virtual {v0, v6}, Lt2/I;->J(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    aput-object v5, v3, v4

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iget-object p0, p0, Lu2/e$c;->b:Lt2/I;

    .line 79
    .line 80
    invoke-virtual {p0, v5}, Lt2/I;->b0(I)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    :goto_1
    invoke-virtual {p0}, Lt2/I;->a()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-le v4, v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    add-int/lit8 v7, v7, -0x1

    .line 107
    .line 108
    if-ltz v7, :cond_2

    .line 109
    .line 110
    if-ge v7, v1, :cond_2

    .line 111
    .line 112
    aget-object v7, v3, v7

    .line 113
    .line 114
    add-int v8, v4, v6

    .line 115
    .line 116
    invoke-static {p0, v8, v7}, Lo3/j;->i(Lt2/I;ILjava/lang/String;)Lu2/c;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    if-eqz v7, :cond_3

    .line 121
    .line 122
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v9, "Skipped metadata with unknown key index: "

    .line 132
    .line 133
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const-string v8, "BoxParsers"

    .line 144
    .line 145
    invoke-static {v8, v7}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    :goto_2
    add-int/2addr v4, v6

    .line 149
    invoke-virtual {p0, v4}, Lt2/I;->b0(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_5

    .line 158
    .line 159
    return-object v2

    .line 160
    :cond_5
    new-instance p0, Lq2/J;

    .line 161
    .line 162
    invoke-direct {p0, v0}, Lq2/J;-><init>(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_6
    :goto_3
    return-object v2
.end method

.method private static v(Lt2/I;IIILo3/b$h;)V
    .locals 0

    .line 1
    add-int/lit8 p2, p2, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    const p2, 0x6d657474

    .line 7
    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lt2/I;->G()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lt2/I;->G()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    new-instance p1, Lq2/x$b;

    .line 21
    .line 22
    invoke-direct {p1}, Lq2/x$b;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p3}, Lq2/x$b;->i0(I)Lq2/x$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p0}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lq2/x$b;->P()Lq2/x;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iput-object p0, p4, Lo3/b$h;->b:Lq2/x;

    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public static w(Lt2/I;)Lu2/g;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lo3/b;->q(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lt2/I;->F()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lt2/I;->F()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, Lt2/I;->O()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance v4, Lu2/g;

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Lu2/g;-><init>(JJJ)V

    .line 43
    .line 44
    .line 45
    return-object v4
.end method

.method private static x(Lt2/I;I)F
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt2/I;->b0(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lt2/I;->Q()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Lt2/I;->Q()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-float p1, p1

    .line 15
    int-to-float p0, p0

    .line 16
    div-float/2addr p1, p0

    .line 17
    return p1
.end method

.method private static y(Lt2/I;II)[B
    .locals 4

    .line 1
    add-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    :goto_0
    sub-int v1, v0, p1

    .line 4
    .line 5
    if-ge v1, p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const v3, 0x70726f6a

    .line 19
    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lt2/I;->f()[B

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    add-int/2addr v1, v0

    .line 28
    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    add-int/2addr v0, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method private static z(Lt2/I;II)Landroid/util/Pair;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lt2/I;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    sub-int v1, v0, p1

    .line 6
    .line 7
    if-ge v1, p2, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lt2/I;->b0(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_1
    const-string v3, "childAtomSize must be positive"

    .line 22
    .line 23
    invoke-static {v2, v3}, LU2/s;->a(ZLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lt2/I;->v()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const v3, 0x73696e66

    .line 31
    .line 32
    .line 33
    if-ne v2, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, Lo3/b;->l(Lt2/I;II)Landroid/util/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    add-int/2addr v0, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method
