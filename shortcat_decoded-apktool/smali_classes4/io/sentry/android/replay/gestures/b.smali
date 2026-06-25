.class public final Lio/sentry/android/replay/gestures/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/replay/gestures/b$a;
    }
.end annotation


# static fields
.field public static final e:Lio/sentry/android/replay/gestures/b$a;

.field public static final f:I


# instance fields
.field private final a:Lio/sentry/transport/o;

.field private final b:Ljava/util/LinkedHashMap;

.field private c:J

.field private d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/sentry/android/replay/gestures/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lio/sentry/android/replay/gestures/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lio/sentry/android/replay/gestures/b;->e:Lio/sentry/android/replay/gestures/b$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lio/sentry/android/replay/gestures/b;->f:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lio/sentry/transport/o;)V
    .locals 1

    .line 1
    const-string v0, "dateProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->a:Lio/sentry/transport/o;

    .line 10
    .line 11
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;Lio/sentry/android/replay/s;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "event"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "recorderConfig"

    .line 11
    .line 12
    move-object/from16 v3, p2

    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v4, 0xa

    .line 22
    .line 23
    const/4 v5, -0x1

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    if-eq v2, v8, :cond_0

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    if-eq v2, v8, :cond_3

    .line 33
    .line 34
    const/4 v8, 0x3

    .line 35
    if-eq v2, v8, :cond_2

    .line 36
    .line 37
    const/4 v8, 0x5

    .line 38
    if-eq v2, v8, :cond_1

    .line 39
    .line 40
    const/4 v4, 0x6

    .line 41
    if-eq v2, v4, :cond_0

    .line 42
    .line 43
    return-object v7

    .line 44
    :cond_0
    move-object v11, v7

    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_1
    move-object v11, v7

    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :cond_2
    iget-object v2, v0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 53
    .line 54
    .line 55
    new-instance v2, Lio/sentry/rrweb/e;

    .line 56
    .line 57
    invoke-direct {v2}, Lio/sentry/rrweb/e;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v4, v0, Lio/sentry/android/replay/gestures/b;->a:Lio/sentry/transport/o;

    .line 61
    .line 62
    invoke-interface {v4}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    invoke-virtual {v2, v4, v5}, Lio/sentry/rrweb/b;->f(J)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-virtual {v3}, Lio/sentry/android/replay/s;->e()F

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    mul-float/2addr v4, v5

    .line 78
    invoke-virtual {v2, v4}, Lio/sentry/rrweb/e;->u(F)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {v3}, Lio/sentry/android/replay/s;->f()F

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    mul-float/2addr v1, v3

    .line 90
    invoke-virtual {v2, v1}, Lio/sentry/rrweb/e;->v(F)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v6}, Lio/sentry/rrweb/e;->q(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6}, Lio/sentry/rrweb/e;->s(I)V

    .line 97
    .line 98
    .line 99
    sget-object v1, Lio/sentry/rrweb/e$b;->TouchCancel:Lio/sentry/rrweb/e$b;

    .line 100
    .line 101
    invoke-virtual {v2, v1}, Lio/sentry/rrweb/e;->r(Lio/sentry/rrweb/e$b;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    return-object v1

    .line 109
    :cond_3
    iget-object v2, v0, Lio/sentry/android/replay/gestures/b;->a:Lio/sentry/transport/o;

    .line 110
    .line 111
    invoke-interface {v2}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 112
    .line 113
    .line 114
    move-result-wide v8

    .line 115
    iget-wide v10, v0, Lio/sentry/android/replay/gestures/b;->d:J

    .line 116
    .line 117
    const-wide/16 v12, 0x0

    .line 118
    .line 119
    cmp-long v2, v10, v12

    .line 120
    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    const/16 v2, 0x32

    .line 124
    .line 125
    int-to-long v14, v2

    .line 126
    add-long/2addr v10, v14

    .line 127
    cmp-long v2, v10, v8

    .line 128
    .line 129
    if-lez v2, :cond_4

    .line 130
    .line 131
    return-object v7

    .line 132
    :cond_4
    iput-wide v8, v0, Lio/sentry/android/replay/gestures/b;->d:J

    .line 133
    .line 134
    iget-object v2, v0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const-string v10, "<get-keys>(...)"

    .line 141
    .line 142
    invoke-static {v2, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    check-cast v2, Ljava/lang/Iterable;

    .line 146
    .line 147
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    if-eqz v10, :cond_7

    .line 156
    .line 157
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    check-cast v10, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    if-ne v11, v5, :cond_5

    .line 175
    .line 176
    move-object v11, v7

    .line 177
    goto :goto_1

    .line 178
    :cond_5
    iget-wide v14, v0, Lio/sentry/android/replay/gestures/b;->c:J

    .line 179
    .line 180
    cmp-long v14, v14, v12

    .line 181
    .line 182
    if-nez v14, :cond_6

    .line 183
    .line 184
    iput-wide v8, v0, Lio/sentry/android/replay/gestures/b;->c:J

    .line 185
    .line 186
    :cond_6
    iget-object v14, v0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 187
    .line 188
    invoke-virtual {v14, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    check-cast v10, Ljava/util/Collection;

    .line 196
    .line 197
    new-instance v14, Lio/sentry/rrweb/f$b;

    .line 198
    .line 199
    invoke-direct {v14}, Lio/sentry/rrweb/f$b;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 203
    .line 204
    .line 205
    move-result v15

    .line 206
    invoke-virtual {v3}, Lio/sentry/android/replay/s;->e()F

    .line 207
    .line 208
    .line 209
    move-result v16

    .line 210
    mul-float v15, v15, v16

    .line 211
    .line 212
    invoke-virtual {v14, v15}, Lio/sentry/rrweb/f$b;->i(F)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    invoke-virtual {v3}, Lio/sentry/android/replay/s;->f()F

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    mul-float/2addr v11, v15

    .line 224
    invoke-virtual {v14, v11}, Lio/sentry/rrweb/f$b;->j(F)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v14, v6}, Lio/sentry/rrweb/f$b;->f(I)V

    .line 228
    .line 229
    .line 230
    move-object v11, v7

    .line 231
    iget-wide v6, v0, Lio/sentry/android/replay/gestures/b;->c:J

    .line 232
    .line 233
    sub-long v6, v8, v6

    .line 234
    .line 235
    invoke-virtual {v14, v6, v7}, Lio/sentry/rrweb/f$b;->g(J)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v10, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    :goto_1
    move-object v7, v11

    .line 242
    const/4 v6, 0x0

    .line 243
    goto :goto_0

    .line 244
    :cond_7
    move-object v11, v7

    .line 245
    iget-wide v1, v0, Lio/sentry/android/replay/gestures/b;->c:J

    .line 246
    .line 247
    sub-long v1, v8, v1

    .line 248
    .line 249
    const-wide/16 v5, 0x1f4

    .line 250
    .line 251
    cmp-long v3, v1, v5

    .line 252
    .line 253
    if-lez v3, :cond_b

    .line 254
    .line 255
    new-instance v3, Ljava/util/ArrayList;

    .line 256
    .line 257
    iget-object v5, v0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 258
    .line 259
    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 264
    .line 265
    .line 266
    iget-object v5, v0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 267
    .line 268
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    :cond_8
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-eqz v6, :cond_a

    .line 281
    .line 282
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    check-cast v6, Ljava/util/Map$Entry;

    .line 287
    .line 288
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    check-cast v7, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    check-cast v6, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    if-nez v10, :cond_8

    .line 309
    .line 310
    new-instance v10, Lio/sentry/rrweb/f;

    .line 311
    .line 312
    invoke-direct {v10}, Lio/sentry/rrweb/f;-><init>()V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v10, v8, v9}, Lio/sentry/rrweb/b;->f(J)V

    .line 316
    .line 317
    .line 318
    new-instance v11, Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-static {v6, v4}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 321
    .line 322
    .line 323
    move-result v14

    .line 324
    invoke-direct {v11, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 332
    .line 333
    .line 334
    move-result v14

    .line 335
    if-eqz v14, :cond_9

    .line 336
    .line 337
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v14

    .line 341
    check-cast v14, Lio/sentry/rrweb/f$b;

    .line 342
    .line 343
    invoke-virtual {v14}, Lio/sentry/rrweb/f$b;->e()J

    .line 344
    .line 345
    .line 346
    move-result-wide v15

    .line 347
    move-object/from16 p1, v5

    .line 348
    .line 349
    sub-long v4, v15, v1

    .line 350
    .line 351
    invoke-virtual {v14, v4, v5}, Lio/sentry/rrweb/f$b;->g(J)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v11, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-object/from16 v5, p1

    .line 358
    .line 359
    const/16 v4, 0xa

    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_9
    move-object/from16 p1, v5

    .line 363
    .line 364
    invoke-virtual {v10, v11}, Lio/sentry/rrweb/f;->n(Ljava/util/List;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v10, v7}, Lio/sentry/rrweb/f;->m(I)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    iget-object v4, v0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 374
    .line 375
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    check-cast v4, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 389
    .line 390
    .line 391
    move-object/from16 v5, p1

    .line 392
    .line 393
    const/16 v4, 0xa

    .line 394
    .line 395
    goto :goto_2

    .line 396
    :cond_a
    iput-wide v12, v0, Lio/sentry/android/replay/gestures/b;->c:J

    .line 397
    .line 398
    return-object v3

    .line 399
    :cond_b
    return-object v11

    .line 400
    :goto_4
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-ne v4, v5, :cond_c

    .line 413
    .line 414
    return-object v11

    .line 415
    :cond_c
    iget-object v5, v0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 416
    .line 417
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    invoke-virtual {v5, v6}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    new-instance v5, Lio/sentry/rrweb/e;

    .line 425
    .line 426
    invoke-direct {v5}, Lio/sentry/rrweb/e;-><init>()V

    .line 427
    .line 428
    .line 429
    iget-object v6, v0, Lio/sentry/android/replay/gestures/b;->a:Lio/sentry/transport/o;

    .line 430
    .line 431
    invoke-interface {v6}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 432
    .line 433
    .line 434
    move-result-wide v6

    .line 435
    invoke-virtual {v5, v6, v7}, Lio/sentry/rrweb/b;->f(J)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 439
    .line 440
    .line 441
    move-result v6

    .line 442
    invoke-virtual {v3}, Lio/sentry/android/replay/s;->e()F

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    mul-float/2addr v6, v7

    .line 447
    invoke-virtual {v5, v6}, Lio/sentry/rrweb/e;->u(F)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    invoke-virtual {v3}, Lio/sentry/android/replay/s;->f()F

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    mul-float/2addr v1, v3

    .line 459
    invoke-virtual {v5, v1}, Lio/sentry/rrweb/e;->v(F)V

    .line 460
    .line 461
    .line 462
    const/4 v15, 0x0

    .line 463
    invoke-virtual {v5, v15}, Lio/sentry/rrweb/e;->q(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v5, v2}, Lio/sentry/rrweb/e;->s(I)V

    .line 467
    .line 468
    .line 469
    sget-object v1, Lio/sentry/rrweb/e$b;->TouchEnd:Lio/sentry/rrweb/e$b;

    .line 470
    .line 471
    invoke-virtual {v5, v1}, Lio/sentry/rrweb/e;->r(Lio/sentry/rrweb/e$b;)V

    .line 472
    .line 473
    .line 474
    invoke-static {v5}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    return-object v1

    .line 479
    :goto_5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 488
    .line 489
    .line 490
    move-result v4

    .line 491
    if-ne v4, v5, :cond_d

    .line 492
    .line 493
    return-object v11

    .line 494
    :cond_d
    iget-object v5, v0, Lio/sentry/android/replay/gestures/b;->b:Ljava/util/LinkedHashMap;

    .line 495
    .line 496
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v6

    .line 500
    new-instance v7, Ljava/util/ArrayList;

    .line 501
    .line 502
    const/16 v8, 0xa

    .line 503
    .line 504
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    new-instance v5, Lio/sentry/rrweb/e;

    .line 511
    .line 512
    invoke-direct {v5}, Lio/sentry/rrweb/e;-><init>()V

    .line 513
    .line 514
    .line 515
    iget-object v6, v0, Lio/sentry/android/replay/gestures/b;->a:Lio/sentry/transport/o;

    .line 516
    .line 517
    invoke-interface {v6}, Lio/sentry/transport/o;->getCurrentTimeMillis()J

    .line 518
    .line 519
    .line 520
    move-result-wide v6

    .line 521
    invoke-virtual {v5, v6, v7}, Lio/sentry/rrweb/b;->f(J)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    invoke-virtual {v3}, Lio/sentry/android/replay/s;->e()F

    .line 529
    .line 530
    .line 531
    move-result v7

    .line 532
    mul-float/2addr v6, v7

    .line 533
    invoke-virtual {v5, v6}, Lio/sentry/rrweb/e;->u(F)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    invoke-virtual {v3}, Lio/sentry/android/replay/s;->f()F

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    mul-float/2addr v1, v3

    .line 545
    invoke-virtual {v5, v1}, Lio/sentry/rrweb/e;->v(F)V

    .line 546
    .line 547
    .line 548
    const/4 v15, 0x0

    .line 549
    invoke-virtual {v5, v15}, Lio/sentry/rrweb/e;->q(I)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v5, v2}, Lio/sentry/rrweb/e;->s(I)V

    .line 553
    .line 554
    .line 555
    sget-object v1, Lio/sentry/rrweb/e$b;->TouchStart:Lio/sentry/rrweb/e$b;

    .line 556
    .line 557
    invoke-virtual {v5, v1}, Lio/sentry/rrweb/e;->r(Lio/sentry/rrweb/e$b;)V

    .line 558
    .line 559
    .line 560
    invoke-static {v5}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    return-object v1
.end method
