.class public final Lx/f;
.super LK0/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private c:Lx/d;

.field private d:F

.field private e:Ls0/h0;

.field private f:Ls0/E1;

.field private final g:Lp0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(FLs0/h0;Ls0/E1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LK0/m;-><init>()V

    .line 3
    iput p1, p0, Lx/f;->d:F

    .line 4
    iput-object p2, p0, Lx/f;->e:Ls0/h0;

    .line 5
    iput-object p3, p0, Lx/f;->f:Ls0/E1;

    .line 6
    new-instance p1, Lx/f$e;

    invoke-direct {p1, p0}, Lx/f$e;-><init>(Lx/f;)V

    invoke-static {p1}, Landroidx/compose/ui/draw/b;->a(Lkotlin/jvm/functions/Function1;)Lp0/e;

    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, LK0/m;->E1(LK0/j;)LK0/j;

    move-result-object p1

    check-cast p1, Lp0/e;

    iput-object p1, p0, Lx/f;->g:Lp0/e;

    return-void
.end method

.method public synthetic constructor <init>(FLs0/h0;Ls0/E1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lx/f;-><init>(FLs0/h0;Ls0/E1;)V

    return-void
.end method

.method public static final synthetic K1(Lx/f;Lp0/f;Ls0/h0;Ls0/i1$a;ZF)Lp0/j;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lx/f;->M1(Lp0/f;Ls0/h0;Ls0/i1$a;ZF)Lp0/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic L1(Lx/f;Lp0/f;Ls0/h0;Ls0/i1$c;JJZF)Lp0/j;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Lx/f;->N1(Lp0/f;Ls0/h0;Ls0/i1$c;JJZF)Lp0/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final M1(Lp0/f;Ls0/h0;Ls0/i1$a;ZF)Lp0/j;
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v4, p2

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    new-instance v2, Lx/f$a;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    invoke-direct {v2, v3, v4}, Lx/f$a;-><init>(Ls0/i1$a;Ls0/h0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lp0/f;->p(Lkotlin/jvm/functions/Function1;)Lp0/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    move-object/from16 v3, p3

    .line 22
    .line 23
    instance-of v2, v4, Ls0/F1;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    sget-object v2, Ls0/c1;->b:Ls0/c1$a;

    .line 29
    .line 30
    invoke-virtual {v2}, Ls0/c1$a;->a()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sget-object v6, Landroidx/compose/ui/graphics/d;->b:Landroidx/compose/ui/graphics/d$a;

    .line 35
    .line 36
    move-object v7, v4

    .line 37
    check-cast v7, Ls0/F1;

    .line 38
    .line 39
    invoke-virtual {v7}, Ls0/F1;->a()J

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    const/4 v10, 0x2

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    invoke-static/range {v6 .. v11}, Landroidx/compose/ui/graphics/d$a;->b(Landroidx/compose/ui/graphics/d$a;JIILjava/lang/Object;)Landroidx/compose/ui/graphics/d;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    move-object v14, v6

    .line 51
    :goto_0
    move v8, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    sget-object v2, Ls0/c1;->b:Ls0/c1$a;

    .line 54
    .line 55
    invoke-virtual {v2}, Ls0/c1$a;->b()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    move-object v14, v5

    .line 60
    goto :goto_0

    .line 61
    :goto_1
    invoke-virtual {v3}, Ls0/i1$a;->b()Ls0/m1;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v2}, Ls0/m1;->getBounds()Lr0/h;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    iget-object v2, v1, Lx/f;->c:Lx/d;

    .line 70
    .line 71
    if-nez v2, :cond_2

    .line 72
    .line 73
    new-instance v15, Lx/d;

    .line 74
    .line 75
    const/16 v20, 0xf

    .line 76
    .line 77
    const/16 v21, 0x0

    .line 78
    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    const/16 v17, 0x0

    .line 82
    .line 83
    const/16 v18, 0x0

    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    invoke-direct/range {v15 .. v21}, Lx/d;-><init>(Ls0/b1;Ls0/j0;Lu0/a;Ls0/m1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    .line 89
    .line 90
    iput-object v15, v1, Lx/f;->c:Lx/d;

    .line 91
    .line 92
    :cond_2
    iget-object v2, v1, Lx/f;->c:Lx/d;

    .line 93
    .line 94
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lx/d;->g()Ls0/m1;

    .line 98
    .line 99
    .line 100
    move-result-object v15

    .line 101
    invoke-interface {v15}, Ls0/m1;->reset()V

    .line 102
    .line 103
    .line 104
    const/4 v2, 0x2

    .line 105
    invoke-static {v15, v13, v5, v2, v5}, Ls0/m1;->t(Ls0/m1;Lr0/h;Ls0/m1$b;ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ls0/i1$a;->b()Ls0/m1;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    sget-object v7, Ls0/q1;->a:Ls0/q1$a;

    .line 113
    .line 114
    invoke-virtual {v7}, Ls0/q1$a;->a()I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    invoke-interface {v15, v15, v6, v7}, Ls0/m1;->m(Ls0/m1;Ls0/m1;I)Z

    .line 119
    .line 120
    .line 121
    new-instance v11, Lkotlin/jvm/internal/N;

    .line 122
    .line 123
    invoke-direct {v11}, Lkotlin/jvm/internal/N;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v13}, Lr0/h;->n()F

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    float-to-double v6, v6

    .line 131
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v6

    .line 135
    double-to-float v6, v6

    .line 136
    float-to-int v6, v6

    .line 137
    invoke-virtual {v13}, Lr0/h;->h()F

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    float-to-double v9, v7

    .line 142
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v9

    .line 146
    double-to-float v7, v9

    .line 147
    float-to-int v7, v7

    .line 148
    invoke-static {v6, v7}, Li1/s;->a(II)J

    .line 149
    .line 150
    .line 151
    move-result-wide v16

    .line 152
    iget-object v6, v1, Lx/f;->c:Lx/d;

    .line 153
    .line 154
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v6}, Lx/d;->c(Lx/d;)Ls0/b1;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-static {v6}, Lx/d;->a(Lx/d;)Ls0/j0;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    if-eqz v7, :cond_3

    .line 166
    .line 167
    invoke-interface {v7}, Ls0/b1;->b()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    invoke-static {v10}, Ls0/c1;->f(I)Ls0/c1;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    goto :goto_2

    .line 176
    :cond_3
    move-object v10, v5

    .line 177
    :goto_2
    sget-object v12, Ls0/c1;->b:Ls0/c1$a;

    .line 178
    .line 179
    invoke-virtual {v12}, Ls0/c1$a;->b()I

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    const/16 v18, 0x0

    .line 184
    .line 185
    if-nez v10, :cond_4

    .line 186
    .line 187
    move/from16 v10, v18

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_4
    invoke-virtual {v10}, Ls0/c1;->l()I

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    invoke-static {v10, v12}, Ls0/c1;->i(II)Z

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    :goto_3
    const/4 v12, 0x1

    .line 199
    if-nez v10, :cond_6

    .line 200
    .line 201
    if-eqz v7, :cond_5

    .line 202
    .line 203
    invoke-interface {v7}, Ls0/b1;->b()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    invoke-static {v5}, Ls0/c1;->f(I)Ls0/c1;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    :cond_5
    invoke-static {v8, v5}, Ls0/c1;->h(ILjava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-eqz v5, :cond_7

    .line 216
    .line 217
    :cond_6
    move/from16 v18, v12

    .line 218
    .line 219
    :cond_7
    if-eqz v7, :cond_8

    .line 220
    .line 221
    if-eqz v9, :cond_8

    .line 222
    .line 223
    invoke-virtual {v0}, Lp0/f;->f()J

    .line 224
    .line 225
    .line 226
    move-result-wide v19

    .line 227
    invoke-static/range {v19 .. v20}, Lr0/l;->i(J)F

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    invoke-interface {v7}, Ls0/b1;->getWidth()I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    int-to-float v10, v10

    .line 236
    cmpl-float v5, v5, v10

    .line 237
    .line 238
    if-gtz v5, :cond_8

    .line 239
    .line 240
    invoke-virtual {v0}, Lp0/f;->f()J

    .line 241
    .line 242
    .line 243
    move-result-wide v19

    .line 244
    invoke-static/range {v19 .. v20}, Lr0/l;->g(J)F

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    invoke-interface {v7}, Ls0/b1;->getHeight()I

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    int-to-float v10, v10

    .line 253
    cmpl-float v5, v5, v10

    .line 254
    .line 255
    if-gtz v5, :cond_8

    .line 256
    .line 257
    if-nez v18, :cond_9

    .line 258
    .line 259
    :cond_8
    move-object v5, v6

    .line 260
    goto :goto_4

    .line 261
    :cond_9
    move-object v5, v6

    .line 262
    move-object/from16 v18, v11

    .line 263
    .line 264
    move-object v12, v9

    .line 265
    move-object v11, v7

    .line 266
    goto :goto_5

    .line 267
    :goto_4
    invoke-static/range {v16 .. v17}, Li1/r;->g(J)I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    invoke-static/range {v16 .. v17}, Li1/r;->f(J)I

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    move-object v9, v11

    .line 276
    const/16 v11, 0x18

    .line 277
    .line 278
    move v10, v12

    .line 279
    const/4 v12, 0x0

    .line 280
    move-object/from16 v18, v9

    .line 281
    .line 282
    const/4 v9, 0x0

    .line 283
    move/from16 v19, v10

    .line 284
    .line 285
    const/4 v10, 0x0

    .line 286
    invoke-static/range {v6 .. v12}, Ls0/d1;->b(IIIZLt0/c;ILjava/lang/Object;)Ls0/b1;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    invoke-static {v5, v7}, Lx/d;->f(Lx/d;Ls0/b1;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v7}, Ls0/l0;->a(Ls0/b1;)Ls0/j0;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    invoke-static {v5, v9}, Lx/d;->d(Lx/d;Ls0/j0;)V

    .line 298
    .line 299
    .line 300
    move-object v11, v7

    .line 301
    move-object v12, v9

    .line 302
    :goto_5
    invoke-static {v5}, Lx/d;->b(Lx/d;)Lu0/a;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    if-nez v6, :cond_a

    .line 307
    .line 308
    new-instance v6, Lu0/a;

    .line 309
    .line 310
    invoke-direct {v6}, Lu0/a;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-static {v5, v6}, Lx/d;->e(Lx/d;Lu0/a;)V

    .line 314
    .line 315
    .line 316
    :cond_a
    move-object/from16 v23, v6

    .line 317
    .line 318
    invoke-static/range {v16 .. v17}, Li1/s;->d(J)J

    .line 319
    .line 320
    .line 321
    move-result-wide v5

    .line 322
    invoke-virtual {v0}, Lp0/f;->getLayoutDirection()Li1/t;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-virtual/range {v23 .. v23}, Lu0/a;->N()Lu0/a$a;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    invoke-virtual {v8}, Lu0/a$a;->a()Li1/d;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    invoke-virtual {v8}, Lu0/a$a;->b()Li1/t;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    move-object/from16 p4, v8

    .line 339
    .line 340
    invoke-virtual/range {p4 .. p4}, Lu0/a$a;->c()Ls0/j0;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    move-object/from16 v20, v8

    .line 345
    .line 346
    move-object/from16 v19, v9

    .line 347
    .line 348
    invoke-virtual/range {p4 .. p4}, Lu0/a$a;->d()J

    .line 349
    .line 350
    .line 351
    move-result-wide v8

    .line 352
    invoke-virtual/range {v23 .. v23}, Lu0/a;->N()Lu0/a$a;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual {v2, v0}, Lu0/a$a;->j(Li1/d;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v7}, Lu0/a$a;->k(Li1/t;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v12}, Lu0/a$a;->i(Ls0/j0;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v5, v6}, Lu0/a$a;->l(J)V

    .line 366
    .line 367
    .line 368
    invoke-interface {v12}, Ls0/j0;->p()V

    .line 369
    .line 370
    .line 371
    sget-object v2, Ls0/r0;->b:Ls0/r0$a;

    .line 372
    .line 373
    invoke-virtual {v2}, Ls0/r0$a;->a()J

    .line 374
    .line 375
    .line 376
    move-result-wide v24

    .line 377
    sget-object v21, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 378
    .line 379
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/c$a;->a()I

    .line 380
    .line 381
    .line 382
    move-result v33

    .line 383
    const/16 v34, 0x3a

    .line 384
    .line 385
    const/16 v35, 0x0

    .line 386
    .line 387
    const-wide/16 v26, 0x0

    .line 388
    .line 389
    const/16 v30, 0x0

    .line 390
    .line 391
    const/16 v31, 0x0

    .line 392
    .line 393
    const/16 v32, 0x0

    .line 394
    .line 395
    move-wide/from16 v28, v5

    .line 396
    .line 397
    invoke-static/range {v23 .. v35}, Lu0/f;->B0(Lu0/f;JJJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    move-object/from16 v2, v23

    .line 401
    .line 402
    invoke-virtual {v13}, Lr0/h;->i()F

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    neg-float v5, v5

    .line 407
    invoke-virtual {v13}, Lr0/h;->l()F

    .line 408
    .line 409
    .line 410
    move-result v6

    .line 411
    neg-float v6, v6

    .line 412
    invoke-interface {v2}, Lu0/f;->n1()Lu0/d;

    .line 413
    .line 414
    .line 415
    move-result-object v7

    .line 416
    invoke-interface {v7}, Lu0/d;->a()Lu0/h;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-interface {v7, v5, v6}, Lu0/h;->d(FF)V

    .line 421
    .line 422
    .line 423
    :try_start_0
    invoke-virtual {v3}, Ls0/i1$a;->b()Ls0/m1;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    new-instance v23, Lu0/k;

    .line 428
    .line 429
    const/4 v7, 0x2

    .line 430
    int-to-float v7, v7

    .line 431
    mul-float v24, p5, v7

    .line 432
    .line 433
    const/16 v29, 0x1e

    .line 434
    .line 435
    const/16 v30, 0x0

    .line 436
    .line 437
    const/16 v25, 0x0

    .line 438
    .line 439
    const/16 v26, 0x0

    .line 440
    .line 441
    const/16 v27, 0x0

    .line 442
    .line 443
    const/16 v28, 0x0

    .line 444
    .line 445
    invoke-direct/range {v23 .. v30}, Lu0/k;-><init>(FFIILs0/n1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 446
    .line 447
    .line 448
    move-wide v7, v8

    .line 449
    const/16 v9, 0x34

    .line 450
    .line 451
    move-object/from16 v24, v10

    .line 452
    .line 453
    const/4 v10, 0x0

    .line 454
    move/from16 v25, v5

    .line 455
    .line 456
    const/4 v5, 0x0

    .line 457
    move-wide/from16 v26, v7

    .line 458
    .line 459
    const/4 v7, 0x0

    .line 460
    const/4 v8, 0x0

    .line 461
    move-object/from16 p4, v18

    .line 462
    .line 463
    move-object/from16 v18, v12

    .line 464
    .line 465
    move-object/from16 v12, v19

    .line 466
    .line 467
    move-object/from16 v19, v14

    .line 468
    .line 469
    move-object/from16 v14, v20

    .line 470
    .line 471
    move-object/from16 v20, p4

    .line 472
    .line 473
    move-object/from16 p4, v13

    .line 474
    .line 475
    move-object/from16 v13, v24

    .line 476
    .line 477
    move-wide/from16 v0, v26

    .line 478
    .line 479
    move-object/from16 v24, v11

    .line 480
    .line 481
    move v11, v6

    .line 482
    move-object/from16 v6, v23

    .line 483
    .line 484
    move-object/from16 v23, v15

    .line 485
    .line 486
    move/from16 v15, v25

    .line 487
    .line 488
    :try_start_1
    invoke-static/range {v2 .. v10}, Lu0/f;->i0(Lu0/f;Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v2}, Lu0/f;->f()J

    .line 492
    .line 493
    .line 494
    move-result-wide v3

    .line 495
    invoke-static {v3, v4}, Lr0/l;->i(J)F

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    const/4 v10, 0x1

    .line 500
    int-to-float v4, v10

    .line 501
    add-float/2addr v3, v4

    .line 502
    invoke-interface {v2}, Lu0/f;->f()J

    .line 503
    .line 504
    .line 505
    move-result-wide v5

    .line 506
    invoke-static {v5, v6}, Lr0/l;->i(J)F

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    div-float/2addr v3, v5

    .line 511
    invoke-interface {v2}, Lu0/f;->f()J

    .line 512
    .line 513
    .line 514
    move-result-wide v5

    .line 515
    invoke-static {v5, v6}, Lr0/l;->g(J)F

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    add-float/2addr v5, v4

    .line 520
    invoke-interface {v2}, Lu0/f;->f()J

    .line 521
    .line 522
    .line 523
    move-result-wide v6

    .line 524
    invoke-static {v6, v7}, Lr0/l;->g(J)F

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    div-float/2addr v5, v4

    .line 529
    invoke-interface {v2}, Lu0/f;->t1()J

    .line 530
    .line 531
    .line 532
    move-result-wide v6

    .line 533
    invoke-interface {v2}, Lu0/f;->n1()Lu0/d;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    invoke-interface {v4}, Lu0/d;->f()J

    .line 538
    .line 539
    .line 540
    move-result-wide v8

    .line 541
    invoke-interface {v4}, Lu0/d;->b()Ls0/j0;

    .line 542
    .line 543
    .line 544
    move-result-object v10

    .line 545
    invoke-interface {v10}, Ls0/j0;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 546
    .line 547
    .line 548
    :try_start_2
    invoke-interface {v4}, Lu0/d;->a()Lu0/h;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    invoke-interface {v10, v3, v5, v6, v7}, Lu0/h;->f(FFJ)V

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/c$a;->a()I

    .line 556
    .line 557
    .line 558
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 559
    move-wide v5, v8

    .line 560
    const/16 v9, 0x1c

    .line 561
    .line 562
    const/4 v10, 0x0

    .line 563
    move-wide v6, v5

    .line 564
    const/4 v5, 0x0

    .line 565
    move-wide v7, v6

    .line 566
    const/4 v6, 0x0

    .line 567
    move-wide/from16 v21, v7

    .line 568
    .line 569
    const/4 v7, 0x0

    .line 570
    move v8, v3

    .line 571
    move-object/from16 p3, v4

    .line 572
    .line 573
    move-object/from16 v3, v23

    .line 574
    .line 575
    move-object/from16 v4, p2

    .line 576
    .line 577
    move-wide/from16 v36, v21

    .line 578
    .line 579
    move-object/from16 v21, v13

    .line 580
    .line 581
    move-object/from16 v22, v14

    .line 582
    .line 583
    move-wide/from16 v13, v36

    .line 584
    .line 585
    :try_start_3
    invoke-static/range {v2 .. v10}, Lu0/f;->i0(Lu0/f;Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 586
    .line 587
    .line 588
    :try_start_4
    invoke-interface/range {p3 .. p3}, Lu0/d;->b()Ls0/j0;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    invoke-interface {v3}, Ls0/j0;->k()V

    .line 593
    .line 594
    .line 595
    move-object/from16 v3, p3

    .line 596
    .line 597
    invoke-interface {v3, v13, v14}, Lu0/d;->e(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 598
    .line 599
    .line 600
    invoke-interface {v2}, Lu0/f;->n1()Lu0/d;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-interface {v3}, Lu0/d;->a()Lu0/h;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    neg-float v4, v15

    .line 609
    neg-float v5, v11

    .line 610
    invoke-interface {v3, v4, v5}, Lu0/h;->d(FF)V

    .line 611
    .line 612
    .line 613
    invoke-interface/range {v18 .. v18}, Ls0/j0;->k()V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2}, Lu0/a;->N()Lu0/a$a;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    invoke-virtual {v2, v12}, Lu0/a$a;->j(Li1/d;)V

    .line 621
    .line 622
    .line 623
    move-object/from16 v13, v21

    .line 624
    .line 625
    invoke-virtual {v2, v13}, Lu0/a$a;->k(Li1/t;)V

    .line 626
    .line 627
    .line 628
    move-object/from16 v14, v22

    .line 629
    .line 630
    invoke-virtual {v2, v14}, Lu0/a$a;->i(Ls0/j0;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2, v0, v1}, Lu0/a$a;->l(J)V

    .line 634
    .line 635
    .line 636
    invoke-interface/range {v24 .. v24}, Ls0/b1;->a()V

    .line 637
    .line 638
    .line 639
    move-object/from16 v11, v20

    .line 640
    .line 641
    move-object/from16 v7, v24

    .line 642
    .line 643
    iput-object v7, v11, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 644
    .line 645
    new-instance v9, Lx/f$b;

    .line 646
    .line 647
    move-object/from16 v10, p4

    .line 648
    .line 649
    move-wide/from16 v12, v16

    .line 650
    .line 651
    move-object/from16 v14, v19

    .line 652
    .line 653
    invoke-direct/range {v9 .. v14}, Lx/f$b;-><init>(Lr0/h;Lkotlin/jvm/internal/N;JLandroidx/compose/ui/graphics/d;)V

    .line 654
    .line 655
    .line 656
    move-object/from16 v0, p1

    .line 657
    .line 658
    invoke-virtual {v0, v9}, Lp0/f;->p(Lkotlin/jvm/functions/Function1;)Lp0/j;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    return-object v0

    .line 663
    :catchall_0
    move-exception v0

    .line 664
    goto :goto_7

    .line 665
    :catchall_1
    move-exception v0

    .line 666
    move-object/from16 v3, p3

    .line 667
    .line 668
    goto :goto_6

    .line 669
    :catchall_2
    move-exception v0

    .line 670
    move-object v3, v4

    .line 671
    move-wide v13, v8

    .line 672
    :goto_6
    :try_start_5
    invoke-interface {v3}, Lu0/d;->b()Ls0/j0;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    invoke-interface {v1}, Ls0/j0;->k()V

    .line 677
    .line 678
    .line 679
    invoke-interface {v3, v13, v14}, Lu0/d;->e(J)V

    .line 680
    .line 681
    .line 682
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 683
    :catchall_3
    move-exception v0

    .line 684
    move v15, v5

    .line 685
    move v11, v6

    .line 686
    :goto_7
    invoke-interface {v2}, Lu0/f;->n1()Lu0/d;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    invoke-interface {v1}, Lu0/d;->a()Lu0/h;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    neg-float v2, v15

    .line 695
    neg-float v3, v11

    .line 696
    invoke-interface {v1, v2, v3}, Lu0/h;->d(FF)V

    .line 697
    .line 698
    .line 699
    throw v0
.end method

.method private final N1(Lp0/f;Ls0/h0;Ls0/i1$c;JJZF)Lp0/j;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p3 .. p3}, Ls0/i1$c;->b()Lr0/j;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, Lr0/k;->e(Lr0/j;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual/range {p3 .. p3}, Ls0/i1$c;->b()Lr0/j;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lr0/j;->h()J

    .line 20
    .line 21
    .line 22
    move-result-wide v10

    .line 23
    const/4 v2, 0x2

    .line 24
    int-to-float v2, v2

    .line 25
    div-float v12, p9, v2

    .line 26
    .line 27
    new-instance v13, Lu0/k;

    .line 28
    .line 29
    const/16 v8, 0x1e

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    move/from16 v3, p9

    .line 37
    .line 38
    move-object v2, v13

    .line 39
    invoke-direct/range {v2 .. v9}, Lu0/k;-><init>(FFIILs0/n1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Lx/f$c;

    .line 43
    .line 44
    move-object/from16 v4, p2

    .line 45
    .line 46
    move/from16 v3, p8

    .line 47
    .line 48
    move/from16 v8, p9

    .line 49
    .line 50
    move-wide v5, v10

    .line 51
    move v7, v12

    .line 52
    move-wide/from16 v9, p4

    .line 53
    .line 54
    move-wide/from16 v11, p6

    .line 55
    .line 56
    invoke-direct/range {v2 .. v13}, Lx/f$c;-><init>(ZLs0/h0;JFFJJLu0/k;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lp0/f;->p(Lkotlin/jvm/functions/Function1;)Lp0/j;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    return-object v1

    .line 64
    :cond_0
    move/from16 v8, p9

    .line 65
    .line 66
    iget-object v2, v0, Lx/f;->c:Lx/d;

    .line 67
    .line 68
    if-nez v2, :cond_1

    .line 69
    .line 70
    new-instance v9, Lx/d;

    .line 71
    .line 72
    const/16 v14, 0xf

    .line 73
    .line 74
    const/4 v15, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    invoke-direct/range {v9 .. v15}, Lx/d;-><init>(Ls0/b1;Ls0/j0;Lu0/a;Ls0/m1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    iput-object v9, v0, Lx/f;->c:Lx/d;

    .line 83
    .line 84
    :cond_1
    iget-object v2, v0, Lx/f;->c:Lx/d;

    .line 85
    .line 86
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Lx/d;->g()Ls0/m1;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual/range {p3 .. p3}, Ls0/i1$c;->b()Lr0/j;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    move/from16 v4, p8

    .line 98
    .line 99
    invoke-static {v2, v3, v8, v4}, Lx/e;->a(Ls0/m1;Lr0/j;FZ)Ls0/m1;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    new-instance v3, Lx/f$d;

    .line 104
    .line 105
    move-object/from16 v4, p2

    .line 106
    .line 107
    invoke-direct {v3, v2, v4}, Lx/f$d;-><init>(Ls0/m1;Ls0/h0;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v3}, Lp0/f;->p(Lkotlin/jvm/functions/Function1;)Lp0/j;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    return-object v1
.end method


# virtual methods
.method public final O1()Ls0/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/f;->e:Ls0/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P1()Ls0/E1;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/f;->f:Ls0/E1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q1()F
    .locals 1

    .line 1
    iget v0, p0, Lx/f;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public final R1(Ls0/h0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx/f;->e:Ls0/h0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lx/f;->e:Ls0/h0;

    .line 10
    .line 11
    iget-object p1, p0, Lx/f;->g:Lp0/e;

    .line 12
    .line 13
    invoke-interface {p1}, Lp0/e;->H0()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final S1(F)V
    .locals 1

    .line 1
    iget v0, p0, Lx/f;->d:F

    .line 2
    .line 3
    invoke-static {v0, p1}, Li1/h;->q(FF)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lx/f;->d:F

    .line 10
    .line 11
    iget-object p1, p0, Lx/f;->g:Lp0/e;

    .line 12
    .line 13
    invoke-interface {p1}, Lp0/e;->H0()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final s1(Ls0/E1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx/f;->f:Ls0/E1;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lx/f;->f:Ls0/E1;

    .line 10
    .line 11
    iget-object p1, p0, Lx/f;->g:Lp0/e;

    .line 12
    .line 13
    invoke-interface {p1}, Lp0/e;->H0()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
