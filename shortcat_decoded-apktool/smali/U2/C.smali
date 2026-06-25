.class public final LU2/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:F

.field public final o:I

.field public final p:Ljava/lang/String;

.field public final q:Lu2/h$k;


# direct methods
.method private constructor <init>(Ljava/util/List;IIIIIIIIIIIIFILjava/lang/String;Lu2/h$k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU2/C;->a:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, LU2/C;->b:I

    .line 7
    .line 8
    iput p3, p0, LU2/C;->c:I

    .line 9
    .line 10
    iput p4, p0, LU2/C;->d:I

    .line 11
    .line 12
    iput p5, p0, LU2/C;->e:I

    .line 13
    .line 14
    iput p6, p0, LU2/C;->f:I

    .line 15
    .line 16
    iput p7, p0, LU2/C;->g:I

    .line 17
    .line 18
    iput p8, p0, LU2/C;->h:I

    .line 19
    .line 20
    iput p9, p0, LU2/C;->i:I

    .line 21
    .line 22
    iput p10, p0, LU2/C;->j:I

    .line 23
    .line 24
    iput p11, p0, LU2/C;->k:I

    .line 25
    .line 26
    iput p12, p0, LU2/C;->l:I

    .line 27
    .line 28
    iput p13, p0, LU2/C;->m:I

    .line 29
    .line 30
    iput p14, p0, LU2/C;->n:F

    .line 31
    .line 32
    iput p15, p0, LU2/C;->o:I

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, LU2/C;->p:Ljava/lang/String;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, LU2/C;->q:Lu2/h$k;

    .line 41
    .line 42
    return-void
.end method

.method public static a(Lt2/I;)LU2/C;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v0, v1}, LU2/C;->b(Lt2/I;ZLu2/h$k;)LU2/C;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static b(Lt2/I;ZLu2/h$k;)LU2/C;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-virtual {v0, v1}, Lt2/I;->c0(I)V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    goto/16 :goto_9

    .line 12
    .line 13
    :cond_0
    const/16 v2, 0x15

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lt2/I;->c0(I)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    and-int/lit8 v2, v2, 0x3

    .line 23
    .line 24
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v0}, Lt2/I;->g()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    move v7, v6

    .line 35
    :goto_1
    const/4 v8, 0x1

    .line 36
    if-ge v6, v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, v8}, Lt2/I;->c0(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    move v9, v5

    .line 46
    :goto_2
    if-ge v9, v8, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    add-int/lit8 v11, v10, 0x4

    .line 53
    .line 54
    add-int/2addr v7, v11

    .line 55
    invoke-virtual {v0, v10}, Lt2/I;->c0(I)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v9, v9, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    invoke-virtual {v0, v4}, Lt2/I;->b0(I)V

    .line 65
    .line 66
    .line 67
    new-array v4, v7, [B

    .line 68
    .line 69
    const/4 v6, -0x1

    .line 70
    const/high16 v9, 0x3f800000    # 1.0f

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    move-object/from16 v28, p2

    .line 74
    .line 75
    move v14, v6

    .line 76
    move v15, v14

    .line 77
    move/from16 v16, v15

    .line 78
    .line 79
    move/from16 v17, v16

    .line 80
    .line 81
    move/from16 v18, v17

    .line 82
    .line 83
    move/from16 v19, v18

    .line 84
    .line 85
    move/from16 v20, v19

    .line 86
    .line 87
    move/from16 v21, v20

    .line 88
    .line 89
    move/from16 v22, v21

    .line 90
    .line 91
    move/from16 v23, v22

    .line 92
    .line 93
    move/from16 v24, v23

    .line 94
    .line 95
    move/from16 v26, v24

    .line 96
    .line 97
    move/from16 v25, v9

    .line 98
    .line 99
    move-object/from16 v27, v10

    .line 100
    .line 101
    move v6, v5

    .line 102
    move v9, v6

    .line 103
    :goto_3
    if-ge v6, v3, :cond_9

    .line 104
    .line 105
    invoke-virtual {v0}, Lt2/I;->M()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    and-int/lit8 v10, v10, 0x3f

    .line 110
    .line 111
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    move v13, v5

    .line 116
    move-object/from16 v12, v28

    .line 117
    .line 118
    :goto_4
    if-ge v13, v11, :cond_8

    .line 119
    .line 120
    invoke-virtual {v0}, Lt2/I;->U()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    move/from16 v29, v8

    .line 125
    .line 126
    sget-object v8, Lu2/h;->a:[B

    .line 127
    .line 128
    move/from16 v30, v2

    .line 129
    .line 130
    array-length v2, v8

    .line 131
    invoke-static {v8, v5, v4, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    .line 133
    .line 134
    array-length v2, v8

    .line 135
    add-int/2addr v9, v2

    .line 136
    invoke-virtual {v0}, Lt2/I;->f()[B

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v0}, Lt2/I;->g()I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    invoke-static {v2, v8, v4, v9, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 145
    .line 146
    .line 147
    const/16 v2, 0x20

    .line 148
    .line 149
    if-ne v10, v2, :cond_3

    .line 150
    .line 151
    if-nez v13, :cond_3

    .line 152
    .line 153
    add-int v2, v9, v1

    .line 154
    .line 155
    invoke-static {v4, v9, v2}, Lu2/h;->y([BII)Lu2/h$k;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    move/from16 v31, v3

    .line 160
    .line 161
    goto/16 :goto_6

    .line 162
    .line 163
    :cond_3
    const/16 v2, 0x21

    .line 164
    .line 165
    if-ne v10, v2, :cond_6

    .line 166
    .line 167
    if-nez v13, :cond_6

    .line 168
    .line 169
    add-int v2, v9, v1

    .line 170
    .line 171
    invoke-static {v4, v9, v2, v12}, Lu2/h;->u([BIILu2/h$k;)Lu2/h$h;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    iget v8, v2, Lu2/h$h;->b:I

    .line 176
    .line 177
    add-int/lit8 v14, v8, 0x1

    .line 178
    .line 179
    iget v15, v2, Lu2/h$h;->h:I

    .line 180
    .line 181
    iget v8, v2, Lu2/h$h;->i:I

    .line 182
    .line 183
    iget v5, v2, Lu2/h$h;->j:I

    .line 184
    .line 185
    move/from16 v31, v3

    .line 186
    .line 187
    iget v3, v2, Lu2/h$h;->k:I

    .line 188
    .line 189
    move/from16 v16, v3

    .line 190
    .line 191
    iget v3, v2, Lu2/h$h;->e:I

    .line 192
    .line 193
    add-int/lit8 v19, v3, 0x8

    .line 194
    .line 195
    iget v3, v2, Lu2/h$h;->f:I

    .line 196
    .line 197
    add-int/lit8 v20, v3, 0x8

    .line 198
    .line 199
    iget v3, v2, Lu2/h$h;->n:I

    .line 200
    .line 201
    move/from16 v17, v3

    .line 202
    .line 203
    iget v3, v2, Lu2/h$h;->o:I

    .line 204
    .line 205
    move/from16 v18, v3

    .line 206
    .line 207
    iget v3, v2, Lu2/h$h;->p:I

    .line 208
    .line 209
    move/from16 v21, v3

    .line 210
    .line 211
    iget v3, v2, Lu2/h$h;->l:F

    .line 212
    .line 213
    move/from16 v22, v3

    .line 214
    .line 215
    iget v3, v2, Lu2/h$h;->m:I

    .line 216
    .line 217
    iget-object v2, v2, Lu2/h$h;->c:Lu2/h$c;

    .line 218
    .line 219
    if-eqz v2, :cond_4

    .line 220
    .line 221
    move/from16 v23, v3

    .line 222
    .line 223
    iget v3, v2, Lu2/h$c;->a:I

    .line 224
    .line 225
    move/from16 v32, v3

    .line 226
    .line 227
    iget-boolean v3, v2, Lu2/h$c;->b:Z

    .line 228
    .line 229
    move/from16 v33, v3

    .line 230
    .line 231
    iget v3, v2, Lu2/h$c;->c:I

    .line 232
    .line 233
    move/from16 v34, v3

    .line 234
    .line 235
    iget v3, v2, Lu2/h$c;->d:I

    .line 236
    .line 237
    move/from16 v35, v3

    .line 238
    .line 239
    iget-object v3, v2, Lu2/h$c;->e:[I

    .line 240
    .line 241
    iget v2, v2, Lu2/h$c;->f:I

    .line 242
    .line 243
    move/from16 v37, v2

    .line 244
    .line 245
    move-object/from16 v36, v3

    .line 246
    .line 247
    invoke-static/range {v32 .. v37}, Lt2/k;->h(IZII[II)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v27

    .line 251
    goto :goto_5

    .line 252
    :cond_4
    move/from16 v23, v3

    .line 253
    .line 254
    :goto_5
    move/from16 v25, v22

    .line 255
    .line 256
    move/from16 v26, v23

    .line 257
    .line 258
    move/from16 v22, v18

    .line 259
    .line 260
    move/from16 v23, v21

    .line 261
    .line 262
    move/from16 v18, v16

    .line 263
    .line 264
    move/from16 v21, v17

    .line 265
    .line 266
    move/from16 v17, v5

    .line 267
    .line 268
    move/from16 v16, v8

    .line 269
    .line 270
    :cond_5
    const/4 v5, 0x0

    .line 271
    goto :goto_6

    .line 272
    :cond_6
    move/from16 v31, v3

    .line 273
    .line 274
    const/16 v2, 0x27

    .line 275
    .line 276
    if-ne v10, v2, :cond_5

    .line 277
    .line 278
    if-nez v13, :cond_5

    .line 279
    .line 280
    add-int v2, v9, v1

    .line 281
    .line 282
    invoke-static {v4, v9, v2}, Lu2/h;->t([BII)Lu2/h$g;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    if-eqz v2, :cond_5

    .line 287
    .line 288
    if-eqz v12, :cond_5

    .line 289
    .line 290
    iget v2, v2, Lu2/h$g;->d:I

    .line 291
    .line 292
    iget-object v3, v12, Lu2/h$k;->b:LP9/u;

    .line 293
    .line 294
    const/4 v5, 0x0

    .line 295
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    check-cast v3, Lu2/h$a;

    .line 300
    .line 301
    iget v3, v3, Lu2/h$a;->b:I

    .line 302
    .line 303
    if-ne v2, v3, :cond_7

    .line 304
    .line 305
    const/16 v24, 0x4

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_7
    const/4 v2, 0x5

    .line 309
    move/from16 v24, v2

    .line 310
    .line 311
    :goto_6
    add-int/2addr v9, v1

    .line 312
    invoke-virtual {v0, v1}, Lt2/I;->c0(I)V

    .line 313
    .line 314
    .line 315
    add-int/lit8 v13, v13, 0x1

    .line 316
    .line 317
    move/from16 v8, v29

    .line 318
    .line 319
    move/from16 v2, v30

    .line 320
    .line 321
    move/from16 v3, v31

    .line 322
    .line 323
    const/4 v1, 0x4

    .line 324
    goto/16 :goto_4

    .line 325
    .line 326
    :cond_8
    move/from16 v30, v2

    .line 327
    .line 328
    move/from16 v31, v3

    .line 329
    .line 330
    move/from16 v29, v8

    .line 331
    .line 332
    add-int/lit8 v6, v6, 0x1

    .line 333
    .line 334
    move-object/from16 v28, v12

    .line 335
    .line 336
    const/4 v1, 0x4

    .line 337
    goto/16 :goto_3

    .line 338
    .line 339
    :cond_9
    move/from16 v30, v2

    .line 340
    .line 341
    move/from16 v29, v8

    .line 342
    .line 343
    if-nez v7, :cond_a

    .line 344
    .line 345
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 346
    .line 347
    :goto_7
    move-object v12, v0

    .line 348
    goto :goto_8

    .line 349
    :cond_a
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    goto :goto_7

    .line 354
    :goto_8
    new-instance v11, LU2/C;

    .line 355
    .line 356
    add-int/lit8 v13, v30, 0x1

    .line 357
    .line 358
    invoke-direct/range {v11 .. v28}, LU2/C;-><init>(Ljava/util/List;IIIIIIIIIIIIFILjava/lang/String;Lu2/h$k;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    .line 360
    .line 361
    return-object v11

    .line 362
    :goto_9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    const-string v2, "Error parsing"

    .line 368
    .line 369
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    if-eqz p1, :cond_b

    .line 373
    .line 374
    const-string v2, "L-HEVC config"

    .line 375
    .line 376
    goto :goto_a

    .line 377
    :cond_b
    const-string v2, "HEVC config"

    .line 378
    .line 379
    :goto_a
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-static {v1, v0}, Lq2/L;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lq2/L;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    throw v0
.end method

.method public static c(Lt2/I;Lu2/h$k;)LU2/C;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0, p1}, LU2/C;->b(Lt2/I;ZLu2/h$k;)LU2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
