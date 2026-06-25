.class public final Lio/sentry/android/replay/viewhierarchy/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Lio/sentry/android/replay/viewhierarchy/a;

.field private static final b:Lkotlin/Lazy;

.field private static c:Z

.field private static d:Ljava/lang/ref/WeakReference;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/sentry/android/replay/viewhierarchy/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/sentry/android/replay/viewhierarchy/a;->a:Lio/sentry/android/replay/viewhierarchy/a;

    .line 7
    .line 8
    sget-object v0, Lio/sentry/android/replay/viewhierarchy/a$a;->a:Lio/sentry/android/replay/viewhierarchy/a$a;

    .line 9
    .line 10
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lio/sentry/android/replay/viewhierarchy/a;->b:Lkotlin/Lazy;

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    sput v0, Lio/sentry/android/replay/viewhierarchy/a;->e:I

    .line 19
    .line 20
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

.method private final a(LK0/J;Lio/sentry/android/replay/viewhierarchy/b;IZLio/sentry/z3;)Lio/sentry/android/replay/viewhierarchy/b;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, LK0/J;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1c

    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, LK0/J;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1c

    .line 18
    .line 19
    if-eqz p4, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, LK0/J;->x()LI0/p;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v4}, LI0/q;->d(LI0/p;)LI0/p;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-direct {v0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lio/sentry/android/replay/viewhierarchy/a;->d:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    :cond_0
    invoke-virtual/range {p1 .. p1}, LK0/J;->x()LI0/p;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v4, Lio/sentry/android/replay/viewhierarchy/a;->d:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, LI0/p;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v4, 0x0

    .line 52
    :goto_0
    invoke-static {v0, v4}, Lio/sentry/android/replay/util/j;->a(LI0/p;LI0/p;)Landroid/graphics/Rect;

    .line 53
    .line 54
    .line 55
    move-result-object v13

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x1

    .line 58
    :try_start_0
    invoke-static/range {p1 .. p1}, Lio/sentry/android/replay/viewhierarchy/a;->e(LK0/J;)Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 59
    .line 60
    .line 61
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-virtual/range {p1 .. p1}, LK0/J;->w0()LK0/e0;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v7}, LK0/e0;->b3()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-nez v7, :cond_3

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    sget-object v7, LR0/x;->a:LR0/x;

    .line 75
    .line 76
    invoke-virtual {v7}, LR0/x;->p()LR0/B;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v0, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-nez v7, :cond_3

    .line 85
    .line 86
    :cond_2
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-lez v7, :cond_3

    .line 91
    .line 92
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-lez v7, :cond_3

    .line 97
    .line 98
    move v12, v6

    .line 99
    goto :goto_1

    .line 100
    :cond_3
    move v12, v5

    .line 101
    :goto_1
    if-eqz v0, :cond_4

    .line 102
    .line 103
    sget-object v7, LR0/l;->a:LR0/l;

    .line 104
    .line 105
    invoke-virtual {v7}, LR0/l;->z()LR0/B;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v0, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-ne v7, v6, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    if-eqz v0, :cond_5

    .line 117
    .line 118
    sget-object v7, LR0/x;->a:LR0/x;

    .line 119
    .line 120
    invoke-virtual {v7}, LR0/x;->g()LR0/B;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {v0, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-ne v7, v6, :cond_5

    .line 129
    .line 130
    :goto_2
    move v7, v6

    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move v7, v5

    .line 133
    :goto_3
    if-eqz v0, :cond_6

    .line 134
    .line 135
    sget-object v8, LR0/x;->a:LR0/x;

    .line 136
    .line 137
    invoke-virtual {v8}, LR0/x;->J()LR0/B;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {v0, v8}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-ne v8, v6, :cond_6

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    if-eqz v7, :cond_11

    .line 149
    .line 150
    :goto_4
    if-eqz v12, :cond_7

    .line 151
    .line 152
    invoke-direct {v1, v0, v5, v2}, Lio/sentry/android/replay/viewhierarchy/a;->f(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/z3;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_7

    .line 157
    .line 158
    move v14, v6

    .line 159
    goto :goto_5

    .line 160
    :cond_7
    move v14, v5

    .line 161
    :goto_5
    if-eqz v9, :cond_8

    .line 162
    .line 163
    invoke-virtual {v9, v6}, Lio/sentry/android/replay/viewhierarchy/b;->g(Z)V

    .line 164
    .line 165
    .line 166
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    if-eqz v0, :cond_9

    .line 172
    .line 173
    sget-object v6, LR0/l;->a:LR0/l;

    .line 174
    .line 175
    invoke-virtual {v6}, LR0/l;->i()LR0/B;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-static {v0, v6}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, LR0/a;

    .line 184
    .line 185
    if-eqz v0, :cond_9

    .line 186
    .line 187
    invoke-virtual {v0}, LR0/a;->a()LTd/i;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 192
    .line 193
    if-eqz v0, :cond_9

    .line 194
    .line 195
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Ljava/lang/Boolean;

    .line 200
    .line 201
    :cond_9
    invoke-static/range {p1 .. p1}, Lio/sentry/android/replay/util/j;->c(LK0/J;)Lio/sentry/android/replay/util/p;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0}, Lio/sentry/android/replay/util/p;->a()Ls0/r0;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-virtual {v0}, Lio/sentry/android/replay/util/p;->b()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    invoke-static {v2}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, LU0/T0;

    .line 218
    .line 219
    if-eqz v2, :cond_a

    .line 220
    .line 221
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    if-eqz v8, :cond_a

    .line 226
    .line 227
    invoke-virtual {v8}, LU0/S0;->i()LU0/Y0;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    if-eqz v8, :cond_a

    .line 232
    .line 233
    invoke-virtual {v8}, LU0/Y0;->j()J

    .line 234
    .line 235
    .line 236
    move-result-wide v10

    .line 237
    invoke-static {v10, v11}, Ls0/r0;->m(J)Ls0/r0;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    goto :goto_6

    .line 242
    :cond_a
    const/4 v8, 0x0

    .line 243
    :goto_6
    if-eqz v8, :cond_b

    .line 244
    .line 245
    invoke-virtual {v8}, Ls0/r0;->A()J

    .line 246
    .line 247
    .line 248
    move-result-wide v10

    .line 249
    sget-object v15, Ls0/r0;->b:Ls0/r0$a;

    .line 250
    .line 251
    invoke-virtual {v15}, Ls0/r0$a;->j()J

    .line 252
    .line 253
    .line 254
    move-result-wide v15

    .line 255
    cmp-long v10, v10, v15

    .line 256
    .line 257
    if-nez v10, :cond_b

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_b
    move-object v6, v8

    .line 261
    :goto_7
    if-eqz v2, :cond_c

    .line 262
    .line 263
    invoke-virtual {v2}, LU0/T0;->l()LU0/S0;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    if-eqz v8, :cond_c

    .line 268
    .line 269
    invoke-virtual {v8}, LU0/S0;->i()LU0/Y0;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    if-eqz v8, :cond_c

    .line 274
    .line 275
    invoke-virtual {v8}, LU0/Y0;->n()J

    .line 276
    .line 277
    .line 278
    move-result-wide v10

    .line 279
    invoke-static {v10, v11}, Li1/v;->b(J)Li1/v;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    goto :goto_8

    .line 284
    :cond_c
    const/4 v8, 0x0

    .line 285
    :goto_8
    sget-object v10, Li1/v;->b:Li1/v$a;

    .line 286
    .line 287
    invoke-virtual {v10}, Li1/v$a;->a()J

    .line 288
    .line 289
    .line 290
    move-result-wide v10

    .line 291
    const/4 v15, 0x0

    .line 292
    if-nez v8, :cond_d

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_d
    invoke-virtual {v8}, Li1/v;->k()J

    .line 296
    .line 297
    .line 298
    move-result-wide v3

    .line 299
    invoke-static {v3, v4, v10, v11}, Li1/v;->e(JJ)Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    :goto_9
    new-instance v3, Lio/sentry/android/replay/viewhierarchy/b$d;

    .line 304
    .line 305
    if-eqz v2, :cond_e

    .line 306
    .line 307
    if-nez v7, :cond_e

    .line 308
    .line 309
    if-nez v5, :cond_e

    .line 310
    .line 311
    new-instance v4, Lio/sentry/android/replay/util/b;

    .line 312
    .line 313
    invoke-direct {v4, v2, v0}, Lio/sentry/android/replay/util/b;-><init>(LU0/T0;Z)V

    .line 314
    .line 315
    .line 316
    goto :goto_a

    .line 317
    :cond_e
    move-object v4, v15

    .line 318
    :goto_a
    if-eqz v6, :cond_f

    .line 319
    .line 320
    invoke-virtual {v6}, Ls0/r0;->A()J

    .line 321
    .line 322
    .line 323
    move-result-wide v5

    .line 324
    invoke-static {v5, v6}, Ls0/s0;->k(J)I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    invoke-static {v0}, Lio/sentry/android/replay/util/r;->j(I)I

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    move-object v2, v3

    .line 337
    move-object v3, v4

    .line 338
    move-object v4, v0

    .line 339
    goto :goto_b

    .line 340
    :cond_f
    move-object v2, v3

    .line 341
    move-object v3, v4

    .line 342
    move-object v4, v15

    .line 343
    :goto_b
    iget v0, v13, Landroid/graphics/Rect;->left:I

    .line 344
    .line 345
    int-to-float v7, v0

    .line 346
    iget v0, v13, Landroid/graphics/Rect;->top:I

    .line 347
    .line 348
    int-to-float v8, v0

    .line 349
    invoke-virtual/range {p1 .. p1}, LK0/J;->F0()I

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    invoke-virtual/range {p1 .. p1}, LK0/J;->W()I

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    if-eqz p2, :cond_10

    .line 358
    .line 359
    invoke-virtual/range {p2 .. p2}, Lio/sentry/android/replay/viewhierarchy/b;->a()F

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    move v11, v0

    .line 364
    goto :goto_c

    .line 365
    :cond_10
    const/4 v11, 0x0

    .line 366
    :goto_c
    const/16 v18, 0xc

    .line 367
    .line 368
    const/16 v19, 0x0

    .line 369
    .line 370
    const/4 v5, 0x0

    .line 371
    const/4 v6, 0x0

    .line 372
    const/4 v15, 0x1

    .line 373
    move/from16 v16, v12

    .line 374
    .line 375
    move-object/from16 v17, v13

    .line 376
    .line 377
    move-object/from16 v13, p2

    .line 378
    .line 379
    move/from16 v12, p3

    .line 380
    .line 381
    invoke-direct/range {v2 .. v19}, Lio/sentry/android/replay/viewhierarchy/b$d;-><init>(Lio/sentry/android/replay/util/q;Ljava/lang/Integer;IIFFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 382
    .line 383
    .line 384
    return-object v2

    .line 385
    :cond_11
    invoke-static/range {p1 .. p1}, Lio/sentry/android/replay/util/j;->b(LK0/J;)Lw0/b;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    if-eqz v3, :cond_16

    .line 390
    .line 391
    if-eqz v12, :cond_12

    .line 392
    .line 393
    invoke-direct {v1, v0, v6, v2}, Lio/sentry/android/replay/viewhierarchy/a;->f(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/z3;)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    if-eqz v0, :cond_12

    .line 398
    .line 399
    move v0, v6

    .line 400
    goto :goto_d

    .line 401
    :cond_12
    move v0, v5

    .line 402
    :goto_d
    if-eqz v9, :cond_13

    .line 403
    .line 404
    invoke-virtual {v9, v6}, Lio/sentry/android/replay/viewhierarchy/b;->g(Z)V

    .line 405
    .line 406
    .line 407
    :cond_13
    iget v2, v13, Landroid/graphics/Rect;->left:I

    .line 408
    .line 409
    int-to-float v2, v2

    .line 410
    iget v4, v13, Landroid/graphics/Rect;->top:I

    .line 411
    .line 412
    int-to-float v4, v4

    .line 413
    move v7, v5

    .line 414
    invoke-virtual/range {p1 .. p1}, LK0/J;->F0()I

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    move v8, v6

    .line 419
    invoke-virtual/range {p1 .. p1}, LK0/J;->W()I

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    if-eqz v9, :cond_14

    .line 424
    .line 425
    invoke-virtual {v9}, Lio/sentry/android/replay/viewhierarchy/b;->a()F

    .line 426
    .line 427
    .line 428
    move-result v10

    .line 429
    move/from16 v20, v10

    .line 430
    .line 431
    move v10, v7

    .line 432
    move/from16 v7, v20

    .line 433
    .line 434
    goto :goto_e

    .line 435
    :cond_14
    move v10, v7

    .line 436
    const/4 v7, 0x0

    .line 437
    :goto_e
    if-eqz v0, :cond_15

    .line 438
    .line 439
    invoke-static {v3}, Lio/sentry/android/replay/util/j;->d(Lw0/b;)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_15

    .line 444
    .line 445
    move v10, v8

    .line 446
    :cond_15
    move v3, v2

    .line 447
    new-instance v2, Lio/sentry/android/replay/viewhierarchy/b$c;

    .line 448
    .line 449
    const/4 v11, 0x1

    .line 450
    move/from16 v8, p3

    .line 451
    .line 452
    invoke-direct/range {v2 .. v13}, Lio/sentry/android/replay/viewhierarchy/b$c;-><init>(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V

    .line 453
    .line 454
    .line 455
    return-object v2

    .line 456
    :cond_16
    move v10, v5

    .line 457
    move v8, v6

    .line 458
    if-eqz v12, :cond_17

    .line 459
    .line 460
    invoke-direct {v1, v0, v10, v2}, Lio/sentry/android/replay/viewhierarchy/a;->f(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/z3;)Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_17

    .line 465
    .line 466
    move v10, v8

    .line 467
    :cond_17
    new-instance v2, Lio/sentry/android/replay/viewhierarchy/b$b;

    .line 468
    .line 469
    iget v0, v13, Landroid/graphics/Rect;->left:I

    .line 470
    .line 471
    int-to-float v3, v0

    .line 472
    iget v0, v13, Landroid/graphics/Rect;->top:I

    .line 473
    .line 474
    int-to-float v4, v0

    .line 475
    invoke-virtual/range {p1 .. p1}, LK0/J;->F0()I

    .line 476
    .line 477
    .line 478
    move-result v5

    .line 479
    invoke-virtual/range {p1 .. p1}, LK0/J;->W()I

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    if-eqz p2, :cond_18

    .line 484
    .line 485
    invoke-virtual/range {p2 .. p2}, Lio/sentry/android/replay/viewhierarchy/b;->a()F

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    move v7, v0

    .line 490
    goto :goto_f

    .line 491
    :cond_18
    const/4 v7, 0x0

    .line 492
    :goto_f
    const/4 v11, 0x0

    .line 493
    move-object/from16 v9, p2

    .line 494
    .line 495
    move/from16 v8, p3

    .line 496
    .line 497
    invoke-direct/range {v2 .. v13}, Lio/sentry/android/replay/viewhierarchy/b$b;-><init>(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V

    .line 498
    .line 499
    .line 500
    return-object v2

    .line 501
    :catchall_0
    move-exception v0

    .line 502
    move v10, v5

    .line 503
    move v8, v6

    .line 504
    sget-boolean v3, Lio/sentry/android/replay/viewhierarchy/a;->c:Z

    .line 505
    .line 506
    if-nez v3, :cond_19

    .line 507
    .line 508
    sput-boolean v8, Lio/sentry/android/replay/viewhierarchy/a;->c:Z

    .line 509
    .line 510
    invoke-virtual {v2}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    sget-object v3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 515
    .line 516
    const-string v4, "Error retrieving semantics information from Compose tree. Most likely you\'re using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you\'re using a newer version, please open a github issue with the version\nyou\'re using, so we can add support for it."

    .line 517
    .line 518
    new-array v5, v10, [Ljava/lang/Object;

    .line 519
    .line 520
    invoke-interface {v2, v3, v0, v4, v5}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    :cond_19
    new-instance v2, Lio/sentry/android/replay/viewhierarchy/b$b;

    .line 524
    .line 525
    iget v0, v13, Landroid/graphics/Rect;->left:I

    .line 526
    .line 527
    int-to-float v3, v0

    .line 528
    iget v0, v13, Landroid/graphics/Rect;->top:I

    .line 529
    .line 530
    int-to-float v4, v0

    .line 531
    invoke-virtual/range {p1 .. p1}, LK0/J;->F0()I

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    invoke-virtual/range {p1 .. p1}, LK0/J;->W()I

    .line 536
    .line 537
    .line 538
    move-result v6

    .line 539
    if-eqz p2, :cond_1a

    .line 540
    .line 541
    invoke-virtual/range {p2 .. p2}, Lio/sentry/android/replay/viewhierarchy/b;->a()F

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    move v7, v0

    .line 546
    goto :goto_10

    .line 547
    :cond_1a
    const/4 v7, 0x0

    .line 548
    :goto_10
    invoke-virtual/range {p1 .. p1}, LK0/J;->w0()LK0/e0;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, LK0/e0;->b3()Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-nez v0, :cond_1b

    .line 557
    .line 558
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    if-lez v0, :cond_1b

    .line 563
    .line 564
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-lez v0, :cond_1b

    .line 569
    .line 570
    move v12, v8

    .line 571
    goto :goto_11

    .line 572
    :cond_1b
    move v12, v10

    .line 573
    :goto_11
    const/4 v10, 0x1

    .line 574
    const/4 v11, 0x0

    .line 575
    move-object/from16 v9, p2

    .line 576
    .line 577
    move/from16 v8, p3

    .line 578
    .line 579
    invoke-direct/range {v2 .. v13}, Lio/sentry/android/replay/viewhierarchy/b$b;-><init>(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V

    .line 580
    .line 581
    .line 582
    return-object v2

    .line 583
    :cond_1c
    const/4 v15, 0x0

    .line 584
    return-object v15
.end method

.method private final c()Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/android/replay/viewhierarchy/a;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/reflect/Method;

    .line 8
    .line 9
    return-object v0
.end method

.method private final d(ZLandroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p1, "android.widget.ImageView"

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    if-eqz p2, :cond_2

    .line 7
    .line 8
    sget-object p1, LR0/x;->a:LR0/x;

    .line 9
    .line 10
    invoke-virtual {p1}, LR0/x;->J()LR0/B;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p2, v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    sget-object v0, LR0/l;->a:LR0/l;

    .line 21
    .line 22
    invoke-virtual {v0}, LR0/l;->z()LR0/B;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p2, v0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, LR0/x;->g()LR0/B;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p2, p1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    :cond_1
    const-string p1, "android.widget.TextView"

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2
    const-string p1, "android.view.View"

    .line 46
    .line 47
    return-object p1
.end method

.method public static final e(LK0/J;)Landroidx/compose/ui/semantics/SemanticsConfiguration;
    .locals 2

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/sentry/android/replay/viewhierarchy/a;->a:Lio/sentry/android/replay/viewhierarchy/a;

    .line 7
    .line 8
    invoke-direct {v0}, Lio/sentry/android/replay/viewhierarchy/a;->c()Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p0}, LK0/J;->getCollapsedSemantics$ui_release()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method private final f(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/z3;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lio/sentry/android/replay/t;->a:Lio/sentry/android/replay/t;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/android/replay/t;->a()LR0/B;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    const-string v1, "unmask"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    const-string v1, "mask"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_2
    invoke-direct {p0, p2, p1}, Lio/sentry/android/replay/viewhierarchy/a;->d(ZLandroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p3}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2}, Lio/sentry/B3;->s()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    return v2

    .line 56
    :cond_3
    invoke-virtual {p3}, Lio/sentry/z3;->getSessionReplay()Lio/sentry/B3;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Lio/sentry/B3;->e()Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1
.end method

.method private final g(LK0/J;Lio/sentry/android/replay/viewhierarchy/b;ZLio/sentry/z3;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, LK0/J;->P()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    move v6, v2

    .line 27
    :goto_0
    if-ge v6, v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v4, v3

    .line 34
    check-cast v4, LK0/J;

    .line 35
    .line 36
    move-object v3, p0

    .line 37
    move-object v5, p2

    .line 38
    move v7, p3

    .line 39
    move-object v8, p4

    .line 40
    invoke-direct/range {v3 .. v8}, Lio/sentry/android/replay/viewhierarchy/a;->a(LK0/J;Lio/sentry/android/replay/viewhierarchy/b;IZLio/sentry/z3;)Lio/sentry/android/replay/viewhierarchy/b;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v4, p2, v2, v8}, Lio/sentry/android/replay/viewhierarchy/a;->g(LK0/J;Lio/sentry/android/replay/viewhierarchy/b;ZLio/sentry/z3;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 53
    .line 54
    move-object p2, v5

    .line 55
    move p3, v7

    .line 56
    move-object p4, v8

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v3, p0

    .line 59
    move-object v5, p2

    .line 60
    invoke-virtual {v5, v0}, Lio/sentry/android/replay/viewhierarchy/b;->f(Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/b;Lio/sentry/z3;)Z
    .locals 5

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "getName(...)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "AndroidComposeView"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x2

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {v0, v1, v2, v3, v4}, LDf/r;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    return v2

    .line 36
    :cond_0
    if-nez p2, :cond_1

    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    :try_start_0
    instance-of v0, p1, LK0/p0;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    move-object v4, p1

    .line 44
    check-cast v4, LK0/p0;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_0
    if-eqz v4, :cond_4

    .line 50
    .line 51
    invoke-interface {v4}, LK0/p0;->getRoot()LK0/J;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const/4 v0, 0x1

    .line 59
    invoke-direct {p0, p1, p2, v0, p3}, Lio/sentry/android/replay/viewhierarchy/a;->g(LK0/J;Lio/sentry/android/replay/viewhierarchy/b;ZLio/sentry/z3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    return v0

    .line 63
    :cond_4
    :goto_1
    return v2

    .line 64
    :goto_2
    invoke-virtual {p3}, Lio/sentry/z3;->getLogger()Lio/sentry/ILogger;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    sget-object p3, Lio/sentry/i3;->ERROR:Lio/sentry/i3;

    .line 69
    .line 70
    const-string v0, "Error traversing Compose tree. Most likely you\'re using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it\'s a newer\nversion, please open a github issue with the version you\'re using, so we can add\nsupport for it."

    .line 71
    .line 72
    new-array v1, v2, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-interface {p2, p3, p1, v0, v1}, Lio/sentry/ILogger;->a(Lio/sentry/i3;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return v2
.end method
