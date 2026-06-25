.class final LL/a$a$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field private synthetic d:Ljava/lang/Object;

.field final synthetic e:LL/a;


# direct methods
.method constructor <init>(LL/a;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL/a$a$a;->e:LL/a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, LL/a$a$a;

    .line 2
    .line 3
    iget-object v1, p0, LL/a$a$a;->e:LL/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LL/a$a$a;-><init>(LL/a;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LL/a$a$a;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LE0/b;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LL/a$a$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LL/a$a$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LL/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LE0/b;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LL/a$a$a;->invoke(LE0/b;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, LL/a$a$a;->c:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    if-eq v2, v6, :cond_2

    .line 16
    .line 17
    if-eq v2, v4, :cond_1

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    iget-object v2, v0, LL/a$a$a;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, LE0/C;

    .line 24
    .line 25
    iget-object v4, v0, LL/a$a$a;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, LE0/b;

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object/from16 v5, p1

    .line 33
    .line 34
    goto/16 :goto_d

    .line 35
    .line 36
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_1
    iget-object v2, v0, LL/a$a$a;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, LE0/s;

    .line 47
    .line 48
    iget-object v6, v0, LL/a$a$a;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v6, LE0/C;

    .line 51
    .line 52
    iget-object v8, v0, LL/a$a$a;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v8, LE0/b;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object/from16 v9, p1

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_2
    iget-object v2, v0, LL/a$a$a;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, LE0/b;

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object/from16 v8, p1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v0, LL/a$a$a;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, LE0/b;

    .line 79
    .line 80
    sget-object v8, LE0/s;->a:LE0/s;

    .line 81
    .line 82
    iput-object v2, v0, LL/a$a$a;->d:Ljava/lang/Object;

    .line 83
    .line 84
    iput v6, v0, LL/a$a$a;->c:I

    .line 85
    .line 86
    invoke-static {v2, v6, v8, v0}, Lz/A;->d(LE0/b;ZLE0/s;LZd/e;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    if-ne v8, v1, :cond_4

    .line 91
    .line 92
    goto/16 :goto_c

    .line 93
    .line 94
    :cond_4
    :goto_0
    check-cast v8, LE0/C;

    .line 95
    .line 96
    invoke-virtual {v8}, LE0/C;->n()I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    sget-object v10, LE0/Q;->a:LE0/Q$a;

    .line 101
    .line 102
    invoke-virtual {v10}, LE0/Q$a;->c()I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    invoke-static {v9, v11}, LE0/Q;->g(II)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_6

    .line 111
    .line 112
    invoke-virtual {v8}, LE0/C;->n()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    invoke-virtual {v10}, LE0/Q$a;->a()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    invoke-static {v9, v10}, LE0/Q;->g(II)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-eqz v9, :cond_5

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    sget-object v1, LTd/L;->a:LTd/L;

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_6
    :goto_1
    invoke-virtual {v8}, LE0/C;->h()J

    .line 131
    .line 132
    .line 133
    move-result-wide v9

    .line 134
    invoke-static {v9, v10}, Lr0/f;->m(J)F

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    const/4 v10, 0x0

    .line 139
    cmpl-float v9, v9, v10

    .line 140
    .line 141
    if-ltz v9, :cond_7

    .line 142
    .line 143
    invoke-virtual {v8}, LE0/C;->h()J

    .line 144
    .line 145
    .line 146
    move-result-wide v11

    .line 147
    invoke-static {v11, v12}, Lr0/f;->m(J)F

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    invoke-interface {v2}, LE0/b;->a()J

    .line 152
    .line 153
    .line 154
    move-result-wide v11

    .line 155
    invoke-static {v11, v12}, Li1/r;->g(J)I

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    int-to-float v11, v11

    .line 160
    cmpg-float v9, v9, v11

    .line 161
    .line 162
    if-gez v9, :cond_7

    .line 163
    .line 164
    invoke-virtual {v8}, LE0/C;->h()J

    .line 165
    .line 166
    .line 167
    move-result-wide v11

    .line 168
    invoke-static {v11, v12}, Lr0/f;->n(J)F

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    cmpl-float v9, v9, v10

    .line 173
    .line 174
    if-ltz v9, :cond_7

    .line 175
    .line 176
    invoke-virtual {v8}, LE0/C;->h()J

    .line 177
    .line 178
    .line 179
    move-result-wide v9

    .line 180
    invoke-static {v9, v10}, Lr0/f;->n(J)F

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    invoke-interface {v2}, LE0/b;->a()J

    .line 185
    .line 186
    .line 187
    move-result-wide v10

    .line 188
    invoke-static {v10, v11}, Li1/r;->f(J)I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    int-to-float v10, v10

    .line 193
    cmpg-float v9, v9, v10

    .line 194
    .line 195
    if-gez v9, :cond_7

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_7
    const/4 v6, 0x0

    .line 199
    :goto_2
    iget-object v9, v0, LL/a$a$a;->e:LL/a;

    .line 200
    .line 201
    invoke-static {v9}, LL/a;->K1(LL/a;)Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    if-nez v9, :cond_9

    .line 206
    .line 207
    if-eqz v6, :cond_8

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_8
    sget-object v6, LE0/s;->b:LE0/s;

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_9
    :goto_3
    sget-object v6, LE0/s;->a:LE0/s;

    .line 214
    .line 215
    :goto_4
    move-object/from16 v16, v8

    .line 216
    .line 217
    move-object v8, v2

    .line 218
    move-object v2, v6

    .line 219
    move-object/from16 v6, v16

    .line 220
    .line 221
    :goto_5
    iput-object v8, v0, LL/a$a$a;->d:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v6, v0, LL/a$a$a;->a:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v2, v0, LL/a$a$a;->b:Ljava/lang/Object;

    .line 226
    .line 227
    iput v4, v0, LL/a$a$a;->c:I

    .line 228
    .line 229
    invoke-interface {v8, v2, v0}, LE0/b;->p0(LE0/s;LZd/e;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    if-ne v9, v1, :cond_a

    .line 234
    .line 235
    goto/16 :goto_c

    .line 236
    .line 237
    :cond_a
    :goto_6
    check-cast v9, LE0/q;

    .line 238
    .line 239
    invoke-virtual {v9}, LE0/q;->c()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    const/4 v11, 0x0

    .line 248
    :goto_7
    if-ge v11, v10, :cond_c

    .line 249
    .line 250
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    move-object v13, v12

    .line 255
    check-cast v13, LE0/C;

    .line 256
    .line 257
    invoke-virtual {v13}, LE0/C;->p()Z

    .line 258
    .line 259
    .line 260
    move-result v14

    .line 261
    if-nez v14, :cond_b

    .line 262
    .line 263
    invoke-virtual {v13}, LE0/C;->f()J

    .line 264
    .line 265
    .line 266
    move-result-wide v14

    .line 267
    invoke-virtual {v6}, LE0/C;->f()J

    .line 268
    .line 269
    .line 270
    move-result-wide v4

    .line 271
    invoke-static {v14, v15, v4, v5}, LE0/B;->d(JJ)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_b

    .line 276
    .line 277
    invoke-virtual {v13}, LE0/C;->i()Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_b

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 285
    .line 286
    const/4 v4, 0x2

    .line 287
    goto :goto_7

    .line 288
    :cond_c
    move-object v12, v7

    .line 289
    :goto_8
    check-cast v12, LE0/C;

    .line 290
    .line 291
    if-nez v12, :cond_d

    .line 292
    .line 293
    goto :goto_9

    .line 294
    :cond_d
    invoke-virtual {v12}, LE0/C;->o()J

    .line 295
    .line 296
    .line 297
    move-result-wide v4

    .line 298
    invoke-virtual {v6}, LE0/C;->o()J

    .line 299
    .line 300
    .line 301
    move-result-wide v9

    .line 302
    sub-long/2addr v4, v9

    .line 303
    invoke-interface {v8}, LE0/b;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    invoke-interface {v9}, Landroidx/compose/ui/platform/A1;->c()J

    .line 308
    .line 309
    .line 310
    move-result-wide v9

    .line 311
    cmp-long v4, v4, v9

    .line 312
    .line 313
    if-ltz v4, :cond_e

    .line 314
    .line 315
    :goto_9
    move-object v12, v7

    .line 316
    goto :goto_a

    .line 317
    :cond_e
    invoke-virtual {v12}, LE0/C;->h()J

    .line 318
    .line 319
    .line 320
    move-result-wide v4

    .line 321
    invoke-virtual {v6}, LE0/C;->h()J

    .line 322
    .line 323
    .line 324
    move-result-wide v9

    .line 325
    invoke-static {v4, v5, v9, v10}, Lr0/f;->p(JJ)J

    .line 326
    .line 327
    .line 328
    move-result-wide v4

    .line 329
    invoke-static {v4, v5}, Lr0/f;->k(J)F

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    invoke-interface {v8}, LE0/b;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    invoke-interface {v5}, Landroidx/compose/ui/platform/A1;->d()F

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    cmpl-float v4, v4, v5

    .line 342
    .line 343
    if-lez v4, :cond_15

    .line 344
    .line 345
    :goto_a
    if-eqz v12, :cond_14

    .line 346
    .line 347
    iget-object v2, v0, LL/a$a$a;->e:LL/a;

    .line 348
    .line 349
    invoke-virtual {v2}, LL/a;->L1()Lie/a;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    check-cast v2, Ljava/lang/Boolean;

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-nez v2, :cond_f

    .line 364
    .line 365
    goto :goto_10

    .line 366
    :cond_f
    invoke-virtual {v12}, LE0/C;->a()V

    .line 367
    .line 368
    .line 369
    move-object v2, v6

    .line 370
    move-object v4, v8

    .line 371
    :goto_b
    sget-object v5, LE0/s;->a:LE0/s;

    .line 372
    .line 373
    iput-object v4, v0, LL/a$a$a;->d:Ljava/lang/Object;

    .line 374
    .line 375
    iput-object v2, v0, LL/a$a$a;->a:Ljava/lang/Object;

    .line 376
    .line 377
    iput-object v7, v0, LL/a$a$a;->b:Ljava/lang/Object;

    .line 378
    .line 379
    iput v3, v0, LL/a$a$a;->c:I

    .line 380
    .line 381
    invoke-interface {v4, v5, v0}, LE0/b;->p0(LE0/s;LZd/e;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    if-ne v5, v1, :cond_10

    .line 386
    .line 387
    :goto_c
    return-object v1

    .line 388
    :cond_10
    :goto_d
    check-cast v5, LE0/q;

    .line 389
    .line 390
    invoke-virtual {v5}, LE0/q;->c()Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 395
    .line 396
    .line 397
    move-result v6

    .line 398
    const/4 v8, 0x0

    .line 399
    :goto_e
    if-ge v8, v6, :cond_12

    .line 400
    .line 401
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    move-object v10, v9

    .line 406
    check-cast v10, LE0/C;

    .line 407
    .line 408
    invoke-virtual {v10}, LE0/C;->p()Z

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    if-nez v11, :cond_11

    .line 413
    .line 414
    invoke-virtual {v10}, LE0/C;->f()J

    .line 415
    .line 416
    .line 417
    move-result-wide v11

    .line 418
    invoke-virtual {v2}, LE0/C;->f()J

    .line 419
    .line 420
    .line 421
    move-result-wide v13

    .line 422
    invoke-static {v11, v12, v13, v14}, LE0/B;->d(JJ)Z

    .line 423
    .line 424
    .line 425
    move-result v11

    .line 426
    if-eqz v11, :cond_11

    .line 427
    .line 428
    invoke-virtual {v10}, LE0/C;->i()Z

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    if-eqz v10, :cond_11

    .line 433
    .line 434
    goto :goto_f

    .line 435
    :cond_11
    add-int/lit8 v8, v8, 0x1

    .line 436
    .line 437
    goto :goto_e

    .line 438
    :cond_12
    move-object v9, v7

    .line 439
    :goto_f
    check-cast v9, LE0/C;

    .line 440
    .line 441
    if-nez v9, :cond_13

    .line 442
    .line 443
    sget-object v1, LTd/L;->a:LTd/L;

    .line 444
    .line 445
    return-object v1

    .line 446
    :cond_13
    invoke-virtual {v9}, LE0/C;->a()V

    .line 447
    .line 448
    .line 449
    goto :goto_b

    .line 450
    :cond_14
    :goto_10
    sget-object v1, LTd/L;->a:LTd/L;

    .line 451
    .line 452
    return-object v1

    .line 453
    :cond_15
    const/4 v4, 0x2

    .line 454
    goto/16 :goto_5
.end method
