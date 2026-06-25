.class public Lnh/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnh/e$a;,
        Lnh/e$b;
    }
.end annotation


# static fields
.field public static final A:Lnh/e;

.field public static final d:Lnh/e;

.field public static final e:Lnh/e;

.field public static final f:Lnh/e;

.field public static final g:Lnh/e;

.field public static final h:Lnh/e;

.field public static final i:Lnh/e;

.field public static final j:Lnh/e;

.field public static final k:Lnh/e;

.field public static final l:Lnh/e;

.field public static final m:Lnh/e;

.field public static final n:Lnh/e;

.field public static final o:Lnh/e;

.field public static final p:Lnh/e;

.field public static final q:Lnh/e;

.field public static final r:Lnh/e;

.field public static final s:Lnh/e;

.field public static final t:Lnh/e;

.field public static final u:Lnh/e;

.field public static final v:Lnh/e;

.field public static final w:Lnh/e;

.field public static final x:Lnh/e;

.field public static final y:Lnh/e;

.field public static final z:Lnh/e;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lnh/c;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lnh/e;

    .line 2
    .line 3
    new-instance v1, Lnh/e$a;

    .line 4
    .line 5
    const/16 v6, 0x21

    .line 6
    .line 7
    const/16 v7, 0x42

    .line 8
    .line 9
    const/16 v2, 0x10

    .line 10
    .line 11
    const/16 v3, 0x10

    .line 12
    .line 13
    const/16 v4, 0x16

    .line 14
    .line 15
    const/4 v5, 0x6

    .line 16
    invoke-direct/range {v1 .. v7}, Lnh/e$a;-><init>(IIIIII)V

    .line 17
    .line 18
    .line 19
    const-string v2, "sha2-128f"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v0, v2, v1, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lnh/e;->d:Lnh/e;

    .line 26
    .line 27
    new-instance v0, Lnh/e;

    .line 28
    .line 29
    new-instance v4, Lnh/e$a;

    .line 30
    .line 31
    const/16 v9, 0xe

    .line 32
    .line 33
    const/16 v10, 0x3f

    .line 34
    .line 35
    const/16 v5, 0x10

    .line 36
    .line 37
    const/16 v6, 0x10

    .line 38
    .line 39
    const/4 v7, 0x7

    .line 40
    const/16 v8, 0xc

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 43
    .line 44
    .line 45
    const-string v1, "sha2-128s"

    .line 46
    .line 47
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lnh/e;->e:Lnh/e;

    .line 51
    .line 52
    new-instance v0, Lnh/e;

    .line 53
    .line 54
    new-instance v4, Lnh/e$a;

    .line 55
    .line 56
    const/16 v9, 0x21

    .line 57
    .line 58
    const/16 v10, 0x42

    .line 59
    .line 60
    const/16 v5, 0x18

    .line 61
    .line 62
    const/16 v7, 0x16

    .line 63
    .line 64
    const/16 v8, 0x8

    .line 65
    .line 66
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 67
    .line 68
    .line 69
    const-string v1, "sha2-192f"

    .line 70
    .line 71
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lnh/e;->f:Lnh/e;

    .line 75
    .line 76
    new-instance v0, Lnh/e;

    .line 77
    .line 78
    new-instance v4, Lnh/e$a;

    .line 79
    .line 80
    const/16 v9, 0x11

    .line 81
    .line 82
    const/16 v10, 0x3f

    .line 83
    .line 84
    const/4 v7, 0x7

    .line 85
    const/16 v8, 0xe

    .line 86
    .line 87
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 88
    .line 89
    .line 90
    const-string v1, "sha2-192s"

    .line 91
    .line 92
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lnh/e;->g:Lnh/e;

    .line 96
    .line 97
    new-instance v0, Lnh/e;

    .line 98
    .line 99
    new-instance v4, Lnh/e$a;

    .line 100
    .line 101
    const/16 v9, 0x23

    .line 102
    .line 103
    const/16 v10, 0x44

    .line 104
    .line 105
    const/16 v5, 0x20

    .line 106
    .line 107
    const/16 v7, 0x11

    .line 108
    .line 109
    const/16 v8, 0x9

    .line 110
    .line 111
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 112
    .line 113
    .line 114
    const-string v1, "sha2-256f"

    .line 115
    .line 116
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 117
    .line 118
    .line 119
    sput-object v0, Lnh/e;->h:Lnh/e;

    .line 120
    .line 121
    new-instance v0, Lnh/e;

    .line 122
    .line 123
    new-instance v4, Lnh/e$a;

    .line 124
    .line 125
    const/16 v9, 0x16

    .line 126
    .line 127
    const/16 v10, 0x40

    .line 128
    .line 129
    const/16 v7, 0x8

    .line 130
    .line 131
    const/16 v8, 0xe

    .line 132
    .line 133
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 134
    .line 135
    .line 136
    const-string v1, "sha2-256s"

    .line 137
    .line 138
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 139
    .line 140
    .line 141
    sput-object v0, Lnh/e;->i:Lnh/e;

    .line 142
    .line 143
    new-instance v0, Lnh/e;

    .line 144
    .line 145
    new-instance v4, Lnh/e$b;

    .line 146
    .line 147
    const/16 v9, 0x21

    .line 148
    .line 149
    const/16 v10, 0x42

    .line 150
    .line 151
    const/16 v5, 0x10

    .line 152
    .line 153
    const/16 v7, 0x16

    .line 154
    .line 155
    const/4 v8, 0x6

    .line 156
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 157
    .line 158
    .line 159
    const-string v1, "shake-128f"

    .line 160
    .line 161
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 162
    .line 163
    .line 164
    sput-object v0, Lnh/e;->j:Lnh/e;

    .line 165
    .line 166
    new-instance v0, Lnh/e;

    .line 167
    .line 168
    new-instance v4, Lnh/e$b;

    .line 169
    .line 170
    const/16 v9, 0xe

    .line 171
    .line 172
    const/16 v10, 0x3f

    .line 173
    .line 174
    const/4 v7, 0x7

    .line 175
    const/16 v8, 0xc

    .line 176
    .line 177
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 178
    .line 179
    .line 180
    const-string v1, "shake-128s"

    .line 181
    .line 182
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 183
    .line 184
    .line 185
    sput-object v0, Lnh/e;->k:Lnh/e;

    .line 186
    .line 187
    new-instance v0, Lnh/e;

    .line 188
    .line 189
    new-instance v4, Lnh/e$b;

    .line 190
    .line 191
    const/16 v9, 0x21

    .line 192
    .line 193
    const/16 v10, 0x42

    .line 194
    .line 195
    const/16 v5, 0x18

    .line 196
    .line 197
    const/16 v7, 0x16

    .line 198
    .line 199
    const/16 v8, 0x8

    .line 200
    .line 201
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 202
    .line 203
    .line 204
    const-string v1, "shake-192f"

    .line 205
    .line 206
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 207
    .line 208
    .line 209
    sput-object v0, Lnh/e;->l:Lnh/e;

    .line 210
    .line 211
    new-instance v0, Lnh/e;

    .line 212
    .line 213
    new-instance v4, Lnh/e$b;

    .line 214
    .line 215
    const/16 v9, 0x11

    .line 216
    .line 217
    const/16 v10, 0x3f

    .line 218
    .line 219
    const/4 v7, 0x7

    .line 220
    const/16 v8, 0xe

    .line 221
    .line 222
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 223
    .line 224
    .line 225
    const-string v1, "shake-192s"

    .line 226
    .line 227
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 228
    .line 229
    .line 230
    sput-object v0, Lnh/e;->m:Lnh/e;

    .line 231
    .line 232
    new-instance v0, Lnh/e;

    .line 233
    .line 234
    new-instance v4, Lnh/e$b;

    .line 235
    .line 236
    const/16 v9, 0x23

    .line 237
    .line 238
    const/16 v10, 0x44

    .line 239
    .line 240
    const/16 v5, 0x20

    .line 241
    .line 242
    const/16 v7, 0x11

    .line 243
    .line 244
    const/16 v8, 0x9

    .line 245
    .line 246
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 247
    .line 248
    .line 249
    const-string v1, "shake-256f"

    .line 250
    .line 251
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 252
    .line 253
    .line 254
    sput-object v0, Lnh/e;->n:Lnh/e;

    .line 255
    .line 256
    new-instance v0, Lnh/e;

    .line 257
    .line 258
    new-instance v4, Lnh/e$b;

    .line 259
    .line 260
    const/16 v9, 0x16

    .line 261
    .line 262
    const/16 v10, 0x40

    .line 263
    .line 264
    const/16 v7, 0x8

    .line 265
    .line 266
    const/16 v8, 0xe

    .line 267
    .line 268
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 269
    .line 270
    .line 271
    const-string v1, "shake-256s"

    .line 272
    .line 273
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 274
    .line 275
    .line 276
    sput-object v0, Lnh/e;->o:Lnh/e;

    .line 277
    .line 278
    new-instance v0, Lnh/e;

    .line 279
    .line 280
    new-instance v1, Lnh/e$a;

    .line 281
    .line 282
    const/16 v6, 0x21

    .line 283
    .line 284
    const/16 v7, 0x42

    .line 285
    .line 286
    const/16 v2, 0x10

    .line 287
    .line 288
    const/16 v3, 0x10

    .line 289
    .line 290
    const/16 v4, 0x16

    .line 291
    .line 292
    const/4 v5, 0x6

    .line 293
    invoke-direct/range {v1 .. v7}, Lnh/e$a;-><init>(IIIIII)V

    .line 294
    .line 295
    .line 296
    const-string v2, "sha2-128f-with-sha256"

    .line 297
    .line 298
    const/4 v3, 0x1

    .line 299
    invoke-direct {v0, v2, v1, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 300
    .line 301
    .line 302
    sput-object v0, Lnh/e;->p:Lnh/e;

    .line 303
    .line 304
    new-instance v0, Lnh/e;

    .line 305
    .line 306
    new-instance v4, Lnh/e$a;

    .line 307
    .line 308
    const/16 v9, 0xe

    .line 309
    .line 310
    const/16 v10, 0x3f

    .line 311
    .line 312
    const/16 v5, 0x10

    .line 313
    .line 314
    const/16 v6, 0x10

    .line 315
    .line 316
    const/4 v7, 0x7

    .line 317
    const/16 v8, 0xc

    .line 318
    .line 319
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 320
    .line 321
    .line 322
    const-string v1, "sha2-128s-with-sha256"

    .line 323
    .line 324
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 325
    .line 326
    .line 327
    sput-object v0, Lnh/e;->q:Lnh/e;

    .line 328
    .line 329
    new-instance v0, Lnh/e;

    .line 330
    .line 331
    new-instance v1, Lnh/e$a;

    .line 332
    .line 333
    const/16 v6, 0x21

    .line 334
    .line 335
    const/16 v7, 0x42

    .line 336
    .line 337
    const/16 v2, 0x18

    .line 338
    .line 339
    const/16 v3, 0x10

    .line 340
    .line 341
    const/16 v4, 0x16

    .line 342
    .line 343
    const/16 v5, 0x8

    .line 344
    .line 345
    invoke-direct/range {v1 .. v7}, Lnh/e$a;-><init>(IIIIII)V

    .line 346
    .line 347
    .line 348
    const-string v2, "sha2-192f-with-sha512"

    .line 349
    .line 350
    const/4 v3, 0x2

    .line 351
    invoke-direct {v0, v2, v1, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 352
    .line 353
    .line 354
    sput-object v0, Lnh/e;->r:Lnh/e;

    .line 355
    .line 356
    new-instance v0, Lnh/e;

    .line 357
    .line 358
    new-instance v4, Lnh/e$a;

    .line 359
    .line 360
    const/16 v9, 0x11

    .line 361
    .line 362
    const/16 v5, 0x18

    .line 363
    .line 364
    const/16 v6, 0x10

    .line 365
    .line 366
    const/4 v7, 0x7

    .line 367
    const/16 v8, 0xe

    .line 368
    .line 369
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 370
    .line 371
    .line 372
    const-string v1, "sha2-192s-with-sha512"

    .line 373
    .line 374
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 375
    .line 376
    .line 377
    sput-object v0, Lnh/e;->s:Lnh/e;

    .line 378
    .line 379
    new-instance v0, Lnh/e;

    .line 380
    .line 381
    new-instance v4, Lnh/e$a;

    .line 382
    .line 383
    const/16 v9, 0x23

    .line 384
    .line 385
    const/16 v10, 0x44

    .line 386
    .line 387
    const/16 v5, 0x20

    .line 388
    .line 389
    const/16 v7, 0x11

    .line 390
    .line 391
    const/16 v8, 0x9

    .line 392
    .line 393
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 394
    .line 395
    .line 396
    const-string v1, "sha2-256f-with-sha512"

    .line 397
    .line 398
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 399
    .line 400
    .line 401
    sput-object v0, Lnh/e;->t:Lnh/e;

    .line 402
    .line 403
    new-instance v0, Lnh/e;

    .line 404
    .line 405
    new-instance v4, Lnh/e$a;

    .line 406
    .line 407
    const/16 v9, 0x16

    .line 408
    .line 409
    const/16 v10, 0x40

    .line 410
    .line 411
    const/16 v7, 0x8

    .line 412
    .line 413
    const/16 v8, 0xe

    .line 414
    .line 415
    invoke-direct/range {v4 .. v10}, Lnh/e$a;-><init>(IIIIII)V

    .line 416
    .line 417
    .line 418
    const-string v1, "sha2-256s-with-sha512"

    .line 419
    .line 420
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 421
    .line 422
    .line 423
    sput-object v0, Lnh/e;->u:Lnh/e;

    .line 424
    .line 425
    new-instance v0, Lnh/e;

    .line 426
    .line 427
    new-instance v1, Lnh/e$b;

    .line 428
    .line 429
    const/16 v6, 0x21

    .line 430
    .line 431
    const/16 v7, 0x42

    .line 432
    .line 433
    const/16 v2, 0x10

    .line 434
    .line 435
    const/16 v3, 0x10

    .line 436
    .line 437
    const/16 v4, 0x16

    .line 438
    .line 439
    const/4 v5, 0x6

    .line 440
    invoke-direct/range {v1 .. v7}, Lnh/e$b;-><init>(IIIIII)V

    .line 441
    .line 442
    .line 443
    const-string v2, "shake-128f-with-shake128"

    .line 444
    .line 445
    const/4 v3, 0x3

    .line 446
    invoke-direct {v0, v2, v1, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 447
    .line 448
    .line 449
    sput-object v0, Lnh/e;->v:Lnh/e;

    .line 450
    .line 451
    new-instance v0, Lnh/e;

    .line 452
    .line 453
    new-instance v4, Lnh/e$b;

    .line 454
    .line 455
    const/16 v9, 0xe

    .line 456
    .line 457
    const/16 v10, 0x3f

    .line 458
    .line 459
    const/16 v5, 0x10

    .line 460
    .line 461
    const/16 v6, 0x10

    .line 462
    .line 463
    const/4 v7, 0x7

    .line 464
    const/16 v8, 0xc

    .line 465
    .line 466
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 467
    .line 468
    .line 469
    const-string v1, "shake-128s-with-shake128"

    .line 470
    .line 471
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 472
    .line 473
    .line 474
    sput-object v0, Lnh/e;->w:Lnh/e;

    .line 475
    .line 476
    new-instance v0, Lnh/e;

    .line 477
    .line 478
    new-instance v1, Lnh/e$b;

    .line 479
    .line 480
    const/16 v6, 0x21

    .line 481
    .line 482
    const/16 v7, 0x42

    .line 483
    .line 484
    const/16 v2, 0x18

    .line 485
    .line 486
    const/16 v3, 0x10

    .line 487
    .line 488
    const/16 v4, 0x16

    .line 489
    .line 490
    const/16 v5, 0x8

    .line 491
    .line 492
    invoke-direct/range {v1 .. v7}, Lnh/e$b;-><init>(IIIIII)V

    .line 493
    .line 494
    .line 495
    const-string v2, "shake-192f-with-shake256"

    .line 496
    .line 497
    const/4 v3, 0x4

    .line 498
    invoke-direct {v0, v2, v1, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 499
    .line 500
    .line 501
    sput-object v0, Lnh/e;->x:Lnh/e;

    .line 502
    .line 503
    new-instance v0, Lnh/e;

    .line 504
    .line 505
    new-instance v4, Lnh/e$b;

    .line 506
    .line 507
    const/16 v9, 0x11

    .line 508
    .line 509
    const/16 v5, 0x18

    .line 510
    .line 511
    const/16 v6, 0x10

    .line 512
    .line 513
    const/4 v7, 0x7

    .line 514
    const/16 v8, 0xe

    .line 515
    .line 516
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 517
    .line 518
    .line 519
    const-string v1, "shake-192s-with-shake256"

    .line 520
    .line 521
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 522
    .line 523
    .line 524
    sput-object v0, Lnh/e;->y:Lnh/e;

    .line 525
    .line 526
    new-instance v0, Lnh/e;

    .line 527
    .line 528
    new-instance v4, Lnh/e$b;

    .line 529
    .line 530
    const/16 v9, 0x23

    .line 531
    .line 532
    const/16 v10, 0x44

    .line 533
    .line 534
    const/16 v5, 0x20

    .line 535
    .line 536
    const/16 v7, 0x11

    .line 537
    .line 538
    const/16 v8, 0x9

    .line 539
    .line 540
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 541
    .line 542
    .line 543
    const-string v1, "shake-256f-with-shake256"

    .line 544
    .line 545
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 546
    .line 547
    .line 548
    sput-object v0, Lnh/e;->z:Lnh/e;

    .line 549
    .line 550
    new-instance v0, Lnh/e;

    .line 551
    .line 552
    new-instance v4, Lnh/e$b;

    .line 553
    .line 554
    const/16 v9, 0x16

    .line 555
    .line 556
    const/16 v10, 0x40

    .line 557
    .line 558
    const/16 v7, 0x8

    .line 559
    .line 560
    const/16 v8, 0xe

    .line 561
    .line 562
    invoke-direct/range {v4 .. v10}, Lnh/e$b;-><init>(IIIIII)V

    .line 563
    .line 564
    .line 565
    const-string v1, "shake-256s-with-shake256"

    .line 566
    .line 567
    invoke-direct {v0, v1, v4, v3}, Lnh/e;-><init>(Ljava/lang/String;Lnh/c;I)V

    .line 568
    .line 569
    .line 570
    sput-object v0, Lnh/e;->A:Lnh/e;

    .line 571
    .line 572
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lnh/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnh/e;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnh/e;->b:Lnh/c;

    .line 7
    .line 8
    iput p3, p0, Lnh/e;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lnh/e;->b:Lnh/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lnh/c;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
