.class public final LE0/m;
.super LE0/n;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final c:Landroidx/compose/ui/e$c;

.field private final d:LF0/b;

.field private final e:Lt/x;

.field private f:LI0/p;

.field private g:LE0/q;

.field private h:Z

.field private i:Z

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/e$c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 5
    .line 6
    new-instance p1, LF0/b;

    .line 7
    .line 8
    invoke-direct {p1}, LF0/b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LE0/m;->d:LF0/b;

    .line 12
    .line 13
    new-instance p1, Lt/x;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-direct {p1, v0}, Lt/x;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LE0/m;->e:Lt/x;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LE0/m;->i:Z

    .line 23
    .line 24
    iput-boolean p1, p0, LE0/m;->j:Z

    .line 25
    .line 26
    return-void
.end method

.method private final j()V
    .locals 1

    .line 1
    iget-object v0, p0, LE0/m;->e:Lt/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/x;->a()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, LE0/m;->f:LI0/p;

    .line 8
    .line 9
    return-void
.end method

.method private final m(LE0/q;LE0/q;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p2}, LE0/q;->c()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eq v1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p2}, LE0/q;->c()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    move v3, v2

    .line 33
    :goto_0
    if-ge v3, v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, LE0/C;

    .line 44
    .line 45
    invoke-virtual {p2}, LE0/q;->c()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, LE0/C;

    .line 54
    .line 55
    invoke-virtual {v4}, LE0/C;->h()J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    invoke-virtual {v5}, LE0/C;->h()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-static {v6, v7, v4, v5}, Lr0/f;->j(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    return v0

    .line 70
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return v2

    .line 74
    :cond_3
    :goto_1
    return v0
.end method


# virtual methods
.method public a(Lt/x;LI0/p;LE0/g;Z)Z
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-super/range {p0 .. p4}, LE0/n;->a(Lt/x;LI0/p;LE0/g;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget-object v5, v0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 14
    .line 15
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    return v6

    .line 23
    :cond_0
    iget-object v5, v0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 24
    .line 25
    const/16 v7, 0x10

    .line 26
    .line 27
    invoke-static {v7}, LK0/g0;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    const/4 v10, 0x0

    .line 32
    :goto_0
    const/4 v11, 0x0

    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    instance-of v12, v5, LK0/v0;

    .line 36
    .line 37
    if-eqz v12, :cond_1

    .line 38
    .line 39
    check-cast v5, LK0/v0;

    .line 40
    .line 41
    invoke-static {v5}, LK0/w0;->a(LK0/v0;)LI0/p;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iput-object v5, v0, LE0/m;->f:LI0/p;

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    and-int/2addr v12, v8

    .line 53
    if-eqz v12, :cond_7

    .line 54
    .line 55
    instance-of v12, v5, LK0/m;

    .line 56
    .line 57
    if-eqz v12, :cond_7

    .line 58
    .line 59
    move-object v12, v5

    .line 60
    check-cast v12, LK0/m;

    .line 61
    .line 62
    invoke-virtual {v12}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    move v13, v11

    .line 67
    :goto_1
    if-eqz v12, :cond_6

    .line 68
    .line 69
    invoke-virtual {v12}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    and-int/2addr v14, v8

    .line 74
    if-eqz v14, :cond_5

    .line 75
    .line 76
    add-int/lit8 v13, v13, 0x1

    .line 77
    .line 78
    if-ne v13, v6, :cond_2

    .line 79
    .line 80
    move-object v5, v12

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    if-nez v10, :cond_3

    .line 83
    .line 84
    new-instance v10, La0/c;

    .line 85
    .line 86
    new-array v14, v7, [Landroidx/compose/ui/e$c;

    .line 87
    .line 88
    invoke-direct {v10, v14, v11}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 89
    .line 90
    .line 91
    :cond_3
    if-eqz v5, :cond_4

    .line 92
    .line 93
    invoke-virtual {v10, v5}, La0/c;->c(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    :cond_4
    invoke-virtual {v10, v12}, La0/c;->c(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_2
    invoke-virtual {v12}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    goto :goto_1

    .line 105
    :cond_6
    if-ne v13, v6, :cond_7

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    :goto_3
    invoke-static {v10}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    goto :goto_0

    .line 113
    :cond_8
    iget-object v5, v0, LE0/m;->f:LI0/p;

    .line 114
    .line 115
    if-nez v5, :cond_9

    .line 116
    .line 117
    return v6

    .line 118
    :cond_9
    invoke-virtual {v1}, Lt/x;->m()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    move v7, v11

    .line 123
    :goto_4
    if-ge v7, v5, :cond_e

    .line 124
    .line 125
    invoke-virtual {v1, v7}, Lt/x;->h(I)J

    .line 126
    .line 127
    .line 128
    move-result-wide v12

    .line 129
    invoke-virtual {v1, v7}, Lt/x;->n(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    move-object v14, v8

    .line 134
    check-cast v14, LE0/C;

    .line 135
    .line 136
    iget-object v8, v0, LE0/m;->d:LF0/b;

    .line 137
    .line 138
    invoke-virtual {v8, v12, v13}, LF0/b;->c(J)Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-eqz v8, :cond_d

    .line 143
    .line 144
    move v8, v6

    .line 145
    move v10, v7

    .line 146
    invoke-virtual {v14}, LE0/C;->k()J

    .line 147
    .line 148
    .line 149
    move-result-wide v6

    .line 150
    move/from16 v33, v8

    .line 151
    .line 152
    invoke-virtual {v14}, LE0/C;->h()J

    .line 153
    .line 154
    .line 155
    move-result-wide v8

    .line 156
    const-wide v15, 0x7fffffff7fffffffL

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    and-long v17, v6, v15

    .line 162
    .line 163
    const-wide v19, 0x7fffff007fffffL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    add-long v17, v17, v19

    .line 169
    .line 170
    const-wide v21, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    and-long v17, v17, v21

    .line 176
    .line 177
    const-wide/16 v23, 0x0

    .line 178
    .line 179
    cmp-long v17, v17, v23

    .line 180
    .line 181
    if-nez v17, :cond_c

    .line 182
    .line 183
    and-long v17, v8, v15

    .line 184
    .line 185
    add-long v17, v17, v19

    .line 186
    .line 187
    and-long v17, v17, v21

    .line 188
    .line 189
    cmp-long v17, v17, v23

    .line 190
    .line 191
    if-nez v17, :cond_c

    .line 192
    .line 193
    move-wide/from16 v17, v15

    .line 194
    .line 195
    new-instance v15, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-virtual {v14}, LE0/C;->e()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v16

    .line 201
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    invoke-direct {v15, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v14}, LE0/C;->e()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    move/from16 v34, v4

    .line 213
    .line 214
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    move/from16 v35, v5

    .line 219
    .line 220
    const/4 v5, 0x0

    .line 221
    :goto_5
    if-ge v5, v4, :cond_b

    .line 222
    .line 223
    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v16

    .line 227
    check-cast v16, LE0/d;

    .line 228
    .line 229
    move/from16 v25, v4

    .line 230
    .line 231
    move/from16 v26, v5

    .line 232
    .line 233
    invoke-virtual/range {v16 .. v16}, LE0/d;->b()J

    .line 234
    .line 235
    .line 236
    move-result-wide v4

    .line 237
    and-long v27, v4, v17

    .line 238
    .line 239
    add-long v27, v27, v19

    .line 240
    .line 241
    and-long v27, v27, v21

    .line 242
    .line 243
    cmp-long v27, v27, v23

    .line 244
    .line 245
    if-nez v27, :cond_a

    .line 246
    .line 247
    new-instance v36, LE0/d;

    .line 248
    .line 249
    invoke-virtual/range {v16 .. v16}, LE0/d;->c()J

    .line 250
    .line 251
    .line 252
    move-result-wide v37

    .line 253
    move/from16 v44, v10

    .line 254
    .line 255
    iget-object v10, v0, LE0/m;->f:LI0/p;

    .line 256
    .line 257
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v10, v2, v4, v5}, LI0/p;->y0(LI0/p;J)J

    .line 261
    .line 262
    .line 263
    move-result-wide v39

    .line 264
    invoke-virtual/range {v16 .. v16}, LE0/d;->a()J

    .line 265
    .line 266
    .line 267
    move-result-wide v41

    .line 268
    const/16 v43, 0x0

    .line 269
    .line 270
    invoke-direct/range {v36 .. v43}, LE0/d;-><init>(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v4, v36

    .line 274
    .line 275
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_a
    move/from16 v44, v10

    .line 280
    .line 281
    :goto_6
    add-int/lit8 v5, v26, 0x1

    .line 282
    .line 283
    move/from16 v4, v25

    .line 284
    .line 285
    move/from16 v10, v44

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_b
    move/from16 v44, v10

    .line 289
    .line 290
    iget-object v4, v0, LE0/m;->e:Lt/x;

    .line 291
    .line 292
    iget-object v5, v0, LE0/m;->f:LI0/p;

    .line 293
    .line 294
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v5, v2, v6, v7}, LI0/p;->y0(LI0/p;J)J

    .line 298
    .line 299
    .line 300
    move-result-wide v24

    .line 301
    iget-object v5, v0, LE0/m;->f:LI0/p;

    .line 302
    .line 303
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-interface {v5, v2, v8, v9}, LI0/p;->y0(LI0/p;J)J

    .line 307
    .line 308
    .line 309
    move-result-wide v19

    .line 310
    const/16 v31, 0x2db

    .line 311
    .line 312
    const/16 v32, 0x0

    .line 313
    .line 314
    move-object/from16 v28, v15

    .line 315
    .line 316
    const-wide/16 v15, 0x0

    .line 317
    .line 318
    const-wide/16 v17, 0x0

    .line 319
    .line 320
    const/16 v21, 0x0

    .line 321
    .line 322
    const-wide/16 v22, 0x0

    .line 323
    .line 324
    const/16 v26, 0x0

    .line 325
    .line 326
    const/16 v27, 0x0

    .line 327
    .line 328
    const-wide/16 v29, 0x0

    .line 329
    .line 330
    invoke-static/range {v14 .. v32}, LE0/C;->c(LE0/C;JJJZJJZILjava/util/List;JILjava/lang/Object;)LE0/C;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-virtual {v4, v12, v13, v5}, Lt/x;->i(JLjava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    goto :goto_7

    .line 338
    :cond_c
    move/from16 v34, v4

    .line 339
    .line 340
    move/from16 v35, v5

    .line 341
    .line 342
    move/from16 v44, v10

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_d
    move/from16 v34, v4

    .line 346
    .line 347
    move/from16 v35, v5

    .line 348
    .line 349
    move/from16 v33, v6

    .line 350
    .line 351
    move/from16 v44, v7

    .line 352
    .line 353
    :goto_7
    add-int/lit8 v7, v44, 0x1

    .line 354
    .line 355
    move/from16 v6, v33

    .line 356
    .line 357
    move/from16 v4, v34

    .line 358
    .line 359
    move/from16 v5, v35

    .line 360
    .line 361
    const/4 v11, 0x0

    .line 362
    goto/16 :goto_4

    .line 363
    .line 364
    :cond_e
    move/from16 v34, v4

    .line 365
    .line 366
    move/from16 v33, v6

    .line 367
    .line 368
    iget-object v2, v0, LE0/m;->e:Lt/x;

    .line 369
    .line 370
    invoke-virtual {v2}, Lt/x;->g()Z

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    if-eqz v2, :cond_f

    .line 375
    .line 376
    iget-object v1, v0, LE0/m;->d:LF0/b;

    .line 377
    .line 378
    invoke-virtual {v1}, LF0/b;->b()V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, LE0/n;->g()La0/c;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-virtual {v1}, La0/c;->i()V

    .line 386
    .line 387
    .line 388
    return v33

    .line 389
    :cond_f
    iget-object v2, v0, LE0/m;->d:LF0/b;

    .line 390
    .line 391
    invoke-virtual {v2}, LF0/b;->e()I

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    add-int/lit8 v2, v2, -0x1

    .line 396
    .line 397
    :goto_8
    const/4 v4, -0x1

    .line 398
    if-ge v4, v2, :cond_11

    .line 399
    .line 400
    iget-object v4, v0, LE0/m;->d:LF0/b;

    .line 401
    .line 402
    invoke-virtual {v4, v2}, LF0/b;->d(I)J

    .line 403
    .line 404
    .line 405
    move-result-wide v4

    .line 406
    invoke-virtual {v1, v4, v5}, Lt/x;->d(J)Z

    .line 407
    .line 408
    .line 409
    move-result v4

    .line 410
    if-nez v4, :cond_10

    .line 411
    .line 412
    iget-object v4, v0, LE0/m;->d:LF0/b;

    .line 413
    .line 414
    invoke-virtual {v4, v2}, LF0/b;->h(I)Z

    .line 415
    .line 416
    .line 417
    :cond_10
    add-int/lit8 v2, v2, -0x1

    .line 418
    .line 419
    goto :goto_8

    .line 420
    :cond_11
    new-instance v1, Ljava/util/ArrayList;

    .line 421
    .line 422
    iget-object v2, v0, LE0/m;->e:Lt/x;

    .line 423
    .line 424
    invoke-virtual {v2}, Lt/x;->m()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 429
    .line 430
    .line 431
    iget-object v2, v0, LE0/m;->e:Lt/x;

    .line 432
    .line 433
    invoke-virtual {v2}, Lt/x;->m()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    const/4 v4, 0x0

    .line 438
    :goto_9
    if-ge v4, v2, :cond_12

    .line 439
    .line 440
    iget-object v5, v0, LE0/m;->e:Lt/x;

    .line 441
    .line 442
    invoke-virtual {v5, v4}, Lt/x;->n(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    add-int/lit8 v4, v4, 0x1

    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_12
    new-instance v2, LE0/q;

    .line 453
    .line 454
    invoke-direct {v2, v1, v3}, LE0/q;-><init>(Ljava/util/List;LE0/g;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2}, LE0/q;->c()Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 462
    .line 463
    .line 464
    move-result v4

    .line 465
    const/4 v5, 0x0

    .line 466
    :goto_a
    if-ge v5, v4, :cond_14

    .line 467
    .line 468
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    move-object v7, v6

    .line 473
    check-cast v7, LE0/C;

    .line 474
    .line 475
    invoke-virtual {v7}, LE0/C;->f()J

    .line 476
    .line 477
    .line 478
    move-result-wide v7

    .line 479
    invoke-virtual {v3, v7, v8}, LE0/g;->a(J)Z

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    if-eqz v7, :cond_13

    .line 484
    .line 485
    move-object v9, v6

    .line 486
    goto :goto_b

    .line 487
    :cond_13
    add-int/lit8 v5, v5, 0x1

    .line 488
    .line 489
    goto :goto_a

    .line 490
    :cond_14
    const/4 v9, 0x0

    .line 491
    :goto_b
    check-cast v9, LE0/C;

    .line 492
    .line 493
    if-eqz v9, :cond_1c

    .line 494
    .line 495
    if-nez p4, :cond_15

    .line 496
    .line 497
    const/4 v1, 0x0

    .line 498
    iput-boolean v1, v0, LE0/m;->i:Z

    .line 499
    .line 500
    goto :goto_c

    .line 501
    :cond_15
    const/4 v1, 0x0

    .line 502
    iget-boolean v3, v0, LE0/m;->i:Z

    .line 503
    .line 504
    if-nez v3, :cond_17

    .line 505
    .line 506
    invoke-virtual {v9}, LE0/C;->i()Z

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    if-nez v3, :cond_16

    .line 511
    .line 512
    invoke-virtual {v9}, LE0/C;->l()Z

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    if-eqz v3, :cond_17

    .line 517
    .line 518
    :cond_16
    iget-object v3, v0, LE0/m;->f:LI0/p;

    .line 519
    .line 520
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    invoke-interface {v3}, LI0/p;->a()J

    .line 524
    .line 525
    .line 526
    move-result-wide v3

    .line 527
    invoke-static {v9, v3, v4}, LE0/r;->e(LE0/C;J)Z

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    xor-int/lit8 v3, v3, 0x1

    .line 532
    .line 533
    iput-boolean v3, v0, LE0/m;->i:Z

    .line 534
    .line 535
    :cond_17
    :goto_c
    iget-boolean v3, v0, LE0/m;->i:Z

    .line 536
    .line 537
    iget-boolean v4, v0, LE0/m;->h:Z

    .line 538
    .line 539
    if-eq v3, v4, :cond_1a

    .line 540
    .line 541
    invoke-virtual {v2}, LE0/q;->f()I

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    sget-object v4, LE0/u;->a:LE0/u$a;

    .line 546
    .line 547
    invoke-virtual {v4}, LE0/u$a;->c()I

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    invoke-static {v3, v5}, LE0/u;->i(II)Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-nez v3, :cond_18

    .line 556
    .line 557
    invoke-virtual {v2}, LE0/q;->f()I

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    invoke-virtual {v4}, LE0/u$a;->a()I

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    invoke-static {v3, v5}, LE0/u;->i(II)Z

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    if-nez v3, :cond_18

    .line 570
    .line 571
    invoke-virtual {v2}, LE0/q;->f()I

    .line 572
    .line 573
    .line 574
    move-result v3

    .line 575
    invoke-virtual {v4}, LE0/u$a;->b()I

    .line 576
    .line 577
    .line 578
    move-result v5

    .line 579
    invoke-static {v3, v5}, LE0/u;->i(II)Z

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    if-eqz v3, :cond_1a

    .line 584
    .line 585
    :cond_18
    iget-boolean v3, v0, LE0/m;->i:Z

    .line 586
    .line 587
    if-eqz v3, :cond_19

    .line 588
    .line 589
    invoke-virtual {v4}, LE0/u$a;->a()I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    goto :goto_d

    .line 594
    :cond_19
    invoke-virtual {v4}, LE0/u$a;->b()I

    .line 595
    .line 596
    .line 597
    move-result v3

    .line 598
    :goto_d
    invoke-virtual {v2, v3}, LE0/q;->g(I)V

    .line 599
    .line 600
    .line 601
    goto :goto_e

    .line 602
    :cond_1a
    invoke-virtual {v2}, LE0/q;->f()I

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    sget-object v4, LE0/u;->a:LE0/u$a;

    .line 607
    .line 608
    invoke-virtual {v4}, LE0/u$a;->a()I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    invoke-static {v3, v5}, LE0/u;->i(II)Z

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    if-eqz v3, :cond_1b

    .line 617
    .line 618
    iget-boolean v3, v0, LE0/m;->h:Z

    .line 619
    .line 620
    if-eqz v3, :cond_1b

    .line 621
    .line 622
    iget-boolean v3, v0, LE0/m;->j:Z

    .line 623
    .line 624
    if-nez v3, :cond_1b

    .line 625
    .line 626
    invoke-virtual {v4}, LE0/u$a;->c()I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    invoke-virtual {v2, v3}, LE0/q;->g(I)V

    .line 631
    .line 632
    .line 633
    goto :goto_e

    .line 634
    :cond_1b
    invoke-virtual {v2}, LE0/q;->f()I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    invoke-virtual {v4}, LE0/u$a;->b()I

    .line 639
    .line 640
    .line 641
    move-result v5

    .line 642
    invoke-static {v3, v5}, LE0/u;->i(II)Z

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    if-eqz v3, :cond_1d

    .line 647
    .line 648
    iget-boolean v3, v0, LE0/m;->i:Z

    .line 649
    .line 650
    if-eqz v3, :cond_1d

    .line 651
    .line 652
    invoke-virtual {v9}, LE0/C;->i()Z

    .line 653
    .line 654
    .line 655
    move-result v3

    .line 656
    if-eqz v3, :cond_1d

    .line 657
    .line 658
    invoke-virtual {v4}, LE0/u$a;->c()I

    .line 659
    .line 660
    .line 661
    move-result v3

    .line 662
    invoke-virtual {v2, v3}, LE0/q;->g(I)V

    .line 663
    .line 664
    .line 665
    goto :goto_e

    .line 666
    :cond_1c
    const/4 v1, 0x0

    .line 667
    :cond_1d
    :goto_e
    if-nez v34, :cond_1f

    .line 668
    .line 669
    invoke-virtual {v2}, LE0/q;->f()I

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    sget-object v4, LE0/u;->a:LE0/u$a;

    .line 674
    .line 675
    invoke-virtual {v4}, LE0/u$a;->c()I

    .line 676
    .line 677
    .line 678
    move-result v4

    .line 679
    invoke-static {v3, v4}, LE0/u;->i(II)Z

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    if-eqz v3, :cond_1f

    .line 684
    .line 685
    iget-object v3, v0, LE0/m;->g:LE0/q;

    .line 686
    .line 687
    invoke-direct {v0, v3, v2}, LE0/m;->m(LE0/q;LE0/q;)Z

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    if-eqz v3, :cond_1e

    .line 692
    .line 693
    goto :goto_f

    .line 694
    :cond_1e
    move v6, v1

    .line 695
    goto :goto_10

    .line 696
    :cond_1f
    :goto_f
    move/from16 v6, v33

    .line 697
    .line 698
    :goto_10
    iput-object v2, v0, LE0/m;->g:LE0/q;

    .line 699
    .line 700
    return v6
.end method

.method public b(LE0/g;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, LE0/n;->b(LE0/g;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE0/m;->g:LE0/q;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v1, p0, LE0/m;->i:Z

    .line 10
    .line 11
    iput-boolean v1, p0, LE0/m;->h:Z

    .line 12
    .line 13
    invoke-virtual {v0}, LE0/q;->c()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    if-ge v4, v2, :cond_4

    .line 24
    .line 25
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, LE0/C;

    .line 30
    .line 31
    invoke-virtual {v5}, LE0/C;->i()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {v5}, LE0/C;->f()J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    invoke-virtual {p1, v7, v8}, LE0/g;->a(J)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    iget-boolean v8, p0, LE0/m;->i:Z

    .line 44
    .line 45
    if-nez v6, :cond_1

    .line 46
    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    :cond_1
    if-nez v6, :cond_3

    .line 50
    .line 51
    if-nez v8, :cond_3

    .line 52
    .line 53
    :cond_2
    iget-object v6, p0, LE0/m;->d:LF0/b;

    .line 54
    .line 55
    invoke-virtual {v5}, LE0/C;->f()J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v6, v7, v8}, LF0/b;->g(J)Z

    .line 60
    .line 61
    .line 62
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    iput-boolean v3, p0, LE0/m;->i:Z

    .line 66
    .line 67
    invoke-virtual {v0}, LE0/q;->f()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    sget-object v0, LE0/u;->a:LE0/u$a;

    .line 72
    .line 73
    invoke-virtual {v0}, LE0/u$a;->b()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {p1, v0}, LE0/u;->i(II)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    iput-boolean p1, p0, LE0/m;->j:Z

    .line 82
    .line 83
    return-void
.end method

.method public d()V
    .locals 10

    .line 1
    invoke-virtual {p0}, LE0/n;->g()La0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0}, La0/c;->p()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v0, :cond_0

    .line 14
    .line 15
    aget-object v4, v1, v3

    .line 16
    .line 17
    check-cast v4, LE0/m;

    .line 18
    .line 19
    invoke-virtual {v4}, LE0/m;->d()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 26
    .line 27
    const/16 v1, 0x10

    .line 28
    .line 29
    invoke-static {v1}, LK0/g0;->a(I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    move-object v5, v4

    .line 35
    :goto_1
    if-eqz v0, :cond_8

    .line 36
    .line 37
    instance-of v6, v0, LK0/v0;

    .line 38
    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    check-cast v0, LK0/v0;

    .line 42
    .line 43
    invoke-interface {v0}, LK0/v0;->a1()V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    and-int/2addr v6, v3

    .line 52
    if-eqz v6, :cond_7

    .line 53
    .line 54
    instance-of v6, v0, LK0/m;

    .line 55
    .line 56
    if-eqz v6, :cond_7

    .line 57
    .line 58
    move-object v6, v0

    .line 59
    check-cast v6, LK0/m;

    .line 60
    .line 61
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    move v7, v2

    .line 66
    :goto_2
    const/4 v8, 0x1

    .line 67
    if-eqz v6, :cond_6

    .line 68
    .line 69
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    and-int/2addr v9, v3

    .line 74
    if-eqz v9, :cond_5

    .line 75
    .line 76
    add-int/lit8 v7, v7, 0x1

    .line 77
    .line 78
    if-ne v7, v8, :cond_2

    .line 79
    .line 80
    move-object v0, v6

    .line 81
    goto :goto_3

    .line 82
    :cond_2
    if-nez v5, :cond_3

    .line 83
    .line 84
    new-instance v5, La0/c;

    .line 85
    .line 86
    new-array v8, v1, [Landroidx/compose/ui/e$c;

    .line 87
    .line 88
    invoke-direct {v5, v8, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 89
    .line 90
    .line 91
    :cond_3
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-virtual {v5, v0}, La0/c;->c(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-object v0, v4

    .line 97
    :cond_4
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_3
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    goto :goto_2

    .line 105
    :cond_6
    if-ne v7, v8, :cond_7

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_7
    :goto_4
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_1

    .line 113
    :cond_8
    return-void
.end method

.method public e(LE0/g;)Z
    .locals 13

    .line 1
    iget-object v0, p0, LE0/m;->e:Lt/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/x;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, LE0/m;->g:LE0/q;

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, LE0/m;->f:LI0/p;

    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v2}, LI0/p;->a()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    iget-object v4, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 37
    .line 38
    const/16 v5, 0x10

    .line 39
    .line 40
    invoke-static {v5}, LK0/g0;->a(I)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v8, v7

    .line 46
    :goto_0
    const/4 v9, 0x1

    .line 47
    if-eqz v4, :cond_9

    .line 48
    .line 49
    instance-of v10, v4, LK0/v0;

    .line 50
    .line 51
    if-eqz v10, :cond_2

    .line 52
    .line 53
    check-cast v4, LK0/v0;

    .line 54
    .line 55
    sget-object v9, LE0/s;->c:LE0/s;

    .line 56
    .line 57
    invoke-interface {v4, v0, v9, v2, v3}, LK0/v0;->S(LE0/q;LE0/s;J)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    and-int/2addr v10, v6

    .line 66
    if-eqz v10, :cond_8

    .line 67
    .line 68
    instance-of v10, v4, LK0/m;

    .line 69
    .line 70
    if-eqz v10, :cond_8

    .line 71
    .line 72
    move-object v10, v4

    .line 73
    check-cast v10, LK0/m;

    .line 74
    .line 75
    invoke-virtual {v10}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    move v11, v1

    .line 80
    :goto_1
    if-eqz v10, :cond_7

    .line 81
    .line 82
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    and-int/2addr v12, v6

    .line 87
    if-eqz v12, :cond_6

    .line 88
    .line 89
    add-int/lit8 v11, v11, 0x1

    .line 90
    .line 91
    if-ne v11, v9, :cond_3

    .line 92
    .line 93
    move-object v4, v10

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    if-nez v8, :cond_4

    .line 96
    .line 97
    new-instance v8, La0/c;

    .line 98
    .line 99
    new-array v12, v5, [Landroidx/compose/ui/e$c;

    .line 100
    .line 101
    invoke-direct {v8, v12, v1}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    :cond_4
    if-eqz v4, :cond_5

    .line 105
    .line 106
    invoke-virtual {v8, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-object v4, v7

    .line 110
    :cond_5
    invoke-virtual {v8, v10}, La0/c;->c(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_6
    :goto_2
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    goto :goto_1

    .line 118
    :cond_7
    if-ne v11, v9, :cond_8

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_8
    :goto_3
    invoke-static {v8}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_0

    .line 126
    :cond_9
    iget-object v0, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 127
    .line 128
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_a

    .line 133
    .line 134
    invoke-virtual {p0}, LE0/n;->g()La0/c;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-object v2, v0, La0/c;->a:[Ljava/lang/Object;

    .line 139
    .line 140
    invoke-virtual {v0}, La0/c;->p()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    :goto_4
    if-ge v1, v0, :cond_a

    .line 145
    .line 146
    aget-object v3, v2, v1

    .line 147
    .line 148
    check-cast v3, LE0/m;

    .line 149
    .line 150
    invoke-virtual {v3, p1}, LE0/m;->e(LE0/g;)Z

    .line 151
    .line 152
    .line 153
    add-int/lit8 v1, v1, 0x1

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_a
    move v1, v9

    .line 157
    :goto_5
    invoke-virtual {p0, p1}, LE0/m;->b(LE0/g;)V

    .line 158
    .line 159
    .line 160
    invoke-direct {p0}, LE0/m;->j()V

    .line 161
    .line 162
    .line 163
    return v1
.end method

.method public f(Lt/x;LI0/p;LE0/g;Z)Z
    .locals 11

    .line 1
    iget-object p1, p0, LE0/m;->e:Lt/x;

    .line 2
    .line 3
    invoke-virtual {p1}, Lt/x;->g()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    return p2

    .line 11
    :cond_0
    iget-object p1, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    return p2

    .line 20
    :cond_1
    iget-object p1, p0, LE0/m;->g:LE0/q;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LE0/m;->f:LI0/p;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, LI0/p;->a()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    iget-object v2, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 35
    .line 36
    const/16 v3, 0x10

    .line 37
    .line 38
    invoke-static {v3}, LK0/g0;->a(I)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v5, 0x0

    .line 43
    move-object v6, v5

    .line 44
    :goto_0
    const/4 v7, 0x1

    .line 45
    if-eqz v2, :cond_9

    .line 46
    .line 47
    instance-of v8, v2, LK0/v0;

    .line 48
    .line 49
    if-eqz v8, :cond_2

    .line 50
    .line 51
    check-cast v2, LK0/v0;

    .line 52
    .line 53
    sget-object v7, LE0/s;->a:LE0/s;

    .line 54
    .line 55
    invoke-interface {v2, p1, v7, v0, v1}, LK0/v0;->S(LE0/q;LE0/s;J)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    and-int/2addr v8, v4

    .line 64
    if-eqz v8, :cond_8

    .line 65
    .line 66
    instance-of v8, v2, LK0/m;

    .line 67
    .line 68
    if-eqz v8, :cond_8

    .line 69
    .line 70
    move-object v8, v2

    .line 71
    check-cast v8, LK0/m;

    .line 72
    .line 73
    invoke-virtual {v8}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    move v9, p2

    .line 78
    :goto_1
    if-eqz v8, :cond_7

    .line 79
    .line 80
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    and-int/2addr v10, v4

    .line 85
    if-eqz v10, :cond_6

    .line 86
    .line 87
    add-int/lit8 v9, v9, 0x1

    .line 88
    .line 89
    if-ne v9, v7, :cond_3

    .line 90
    .line 91
    move-object v2, v8

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    if-nez v6, :cond_4

    .line 94
    .line 95
    new-instance v6, La0/c;

    .line 96
    .line 97
    new-array v10, v3, [Landroidx/compose/ui/e$c;

    .line 98
    .line 99
    invoke-direct {v6, v10, p2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    :cond_4
    if-eqz v2, :cond_5

    .line 103
    .line 104
    invoke-virtual {v6, v2}, La0/c;->c(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-object v2, v5

    .line 108
    :cond_5
    invoke-virtual {v6, v8}, La0/c;->c(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :cond_6
    :goto_2
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    goto :goto_1

    .line 116
    :cond_7
    if-ne v9, v7, :cond_8

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    :goto_3
    invoke-static {v6}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    goto :goto_0

    .line 124
    :cond_9
    iget-object v2, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 125
    .line 126
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_a

    .line 131
    .line 132
    invoke-virtual {p0}, LE0/n;->g()La0/c;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    iget-object v4, v2, La0/c;->a:[Ljava/lang/Object;

    .line 137
    .line 138
    invoke-virtual {v2}, La0/c;->p()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    move v6, p2

    .line 143
    :goto_4
    if-ge v6, v2, :cond_a

    .line 144
    .line 145
    aget-object v8, v4, v6

    .line 146
    .line 147
    check-cast v8, LE0/m;

    .line 148
    .line 149
    iget-object v9, p0, LE0/m;->e:Lt/x;

    .line 150
    .line 151
    iget-object v10, p0, LE0/m;->f:LI0/p;

    .line 152
    .line 153
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8, v9, v10, p3, p4}, LE0/m;->f(Lt/x;LI0/p;LE0/g;Z)Z

    .line 157
    .line 158
    .line 159
    add-int/lit8 v6, v6, 0x1

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_a
    iget-object p3, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 163
    .line 164
    invoke-virtual {p3}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    if-eqz p3, :cond_12

    .line 169
    .line 170
    iget-object p3, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 171
    .line 172
    invoke-static {v3}, LK0/g0;->a(I)I

    .line 173
    .line 174
    .line 175
    move-result p4

    .line 176
    move-object v2, v5

    .line 177
    :goto_5
    if-eqz p3, :cond_12

    .line 178
    .line 179
    instance-of v4, p3, LK0/v0;

    .line 180
    .line 181
    if-eqz v4, :cond_b

    .line 182
    .line 183
    check-cast p3, LK0/v0;

    .line 184
    .line 185
    sget-object v4, LE0/s;->b:LE0/s;

    .line 186
    .line 187
    invoke-interface {p3, p1, v4, v0, v1}, LK0/v0;->S(LE0/q;LE0/s;J)V

    .line 188
    .line 189
    .line 190
    goto :goto_8

    .line 191
    :cond_b
    invoke-virtual {p3}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    and-int/2addr v4, p4

    .line 196
    if-eqz v4, :cond_11

    .line 197
    .line 198
    instance-of v4, p3, LK0/m;

    .line 199
    .line 200
    if-eqz v4, :cond_11

    .line 201
    .line 202
    move-object v4, p3

    .line 203
    check-cast v4, LK0/m;

    .line 204
    .line 205
    invoke-virtual {v4}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    move v6, p2

    .line 210
    :goto_6
    if-eqz v4, :cond_10

    .line 211
    .line 212
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    and-int/2addr v8, p4

    .line 217
    if-eqz v8, :cond_f

    .line 218
    .line 219
    add-int/lit8 v6, v6, 0x1

    .line 220
    .line 221
    if-ne v6, v7, :cond_c

    .line 222
    .line 223
    move-object p3, v4

    .line 224
    goto :goto_7

    .line 225
    :cond_c
    if-nez v2, :cond_d

    .line 226
    .line 227
    new-instance v2, La0/c;

    .line 228
    .line 229
    new-array v8, v3, [Landroidx/compose/ui/e$c;

    .line 230
    .line 231
    invoke-direct {v2, v8, p2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 232
    .line 233
    .line 234
    :cond_d
    if-eqz p3, :cond_e

    .line 235
    .line 236
    invoke-virtual {v2, p3}, La0/c;->c(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-object p3, v5

    .line 240
    :cond_e
    invoke-virtual {v2, v4}, La0/c;->c(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    :cond_f
    :goto_7
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    goto :goto_6

    .line 248
    :cond_10
    if-ne v6, v7, :cond_11

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_11
    :goto_8
    invoke-static {v2}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    .line 252
    .line 253
    .line 254
    move-result-object p3

    .line 255
    goto :goto_5

    .line 256
    :cond_12
    return v7
.end method

.method public h(JLt/L;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE0/m;->d:LF0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LF0/b;->c(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3, p0}, Lt/V;->a(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LE0/m;->d:LF0/b;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, LF0/b;->g(J)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LE0/m;->e:Lt/x;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lt/x;->j(J)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, LE0/n;->g()La0/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v0}, La0/c;->p()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x0

    .line 36
    :goto_0
    if-ge v2, v0, :cond_1

    .line 37
    .line 38
    aget-object v3, v1, v2

    .line 39
    .line 40
    check-cast v3, LE0/m;

    .line 41
    .line 42
    invoke-virtual {v3, p1, p2, p3}, LE0/m;->h(JLt/L;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public final k()Landroidx/compose/ui/e$c;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()LF0/b;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/m;->d:LF0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LE0/m;->i:Z

    .line 3
    .line 4
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Node(modifierNode="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LE0/m;->c:Landroidx/compose/ui/e$c;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", children="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LE0/n;->g()La0/c;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", pointerIds="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, LE0/m;->d:LF0/b;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const/16 v1, 0x29

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method
