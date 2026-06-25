.class public final LTg/a;
.super Ljava/security/Provider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTg/a$c;
    }
.end annotation


# static fields
.field private static final b:Ljava/util/logging/Logger;

.field private static c:Ljava/lang/String;

.field public static final d:LPg/a;

.field private static final e:Ljava/util/Map;

.field private static final f:Ljava/lang/Class;

.field private static final g:[Ljava/lang/String;

.field private static final h:[Ljava/lang/String;

.field private static final i:[LFg/c;

.field private static final j:[Ljava/lang/String;

.field private static final k:[Ljava/lang/String;

.field private static final l:[Ljava/lang/String;

.field private static final m:[Ljava/lang/String;

.field private static final n:[Ljava/lang/String;


# instance fields
.field private a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 41

    .line 1
    const-class v0, LTg/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, LTg/a;->b:Ljava/util/logging/Logger;

    .line 12
    .line 13
    const-string v1, "BouncyCastle Security Provider v1.81"

    .line 14
    .line 15
    sput-object v1, LTg/a;->c:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, LTg/b;

    .line 18
    .line 19
    invoke-direct {v1}, LTg/b;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v1, LTg/a;->d:LPg/a;

    .line 23
    .line 24
    new-instance v1, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v1, LTg/a;->e:Ljava/util/Map;

    .line 30
    .line 31
    const-string v1, "java.security.cert.PKIXRevocationChecker"

    .line 32
    .line 33
    invoke-static {v0, v1}, LQg/a;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, LTg/a;->f:Ljava/lang/Class;

    .line 38
    .line 39
    const-string v0, "TLSKDF"

    .line 40
    .line 41
    const-string v1, "SCRYPT"

    .line 42
    .line 43
    const-string v2, "PBEPBKDF1"

    .line 44
    .line 45
    const-string v3, "PBEPBKDF2"

    .line 46
    .line 47
    const-string v4, "PBEPKCS12"

    .line 48
    .line 49
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, LTg/a;->g:[Ljava/lang/String;

    .line 54
    .line 55
    const-string v0, "SipHash128"

    .line 56
    .line 57
    const-string v1, "Poly1305"

    .line 58
    .line 59
    const-string v2, "SipHash"

    .line 60
    .line 61
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, LTg/a;->h:[Ljava/lang/String;

    .line 66
    .line 67
    const-string v0, "AES"

    .line 68
    .line 69
    const/16 v1, 0x100

    .line 70
    .line 71
    invoke-static {v0, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v2, "ARC4"

    .line 76
    .line 77
    const/16 v3, 0x14

    .line 78
    .line 79
    invoke-static {v2, v3}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v4, "ARIA"

    .line 84
    .line 85
    invoke-static {v4, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    const-string v5, "Blowfish"

    .line 90
    .line 91
    const/16 v6, 0x80

    .line 92
    .line 93
    invoke-static {v5, v6}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const-string v7, "Camellia"

    .line 98
    .line 99
    invoke-static {v7, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    const-string v8, "CAST5"

    .line 104
    .line 105
    invoke-static {v8, v6}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    const-string v9, "CAST6"

    .line 110
    .line 111
    invoke-static {v9, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    const-string v10, "ChaCha"

    .line 116
    .line 117
    invoke-static {v10, v6}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    const-string v11, "DES"

    .line 122
    .line 123
    const/16 v12, 0x38

    .line 124
    .line 125
    invoke-static {v11, v12}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    const-string v12, "DESede"

    .line 130
    .line 131
    const/16 v13, 0x70

    .line 132
    .line 133
    invoke-static {v12, v13}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    const-string v13, "GOST28147"

    .line 138
    .line 139
    invoke-static {v13, v6}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    const-string v14, "Grainv1"

    .line 144
    .line 145
    invoke-static {v14, v6}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    const-string v15, "Grain128"

    .line 150
    .line 151
    invoke-static {v15, v6}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    move/from16 v16, v3

    .line 156
    .line 157
    const-string v3, "HC128"

    .line 158
    .line 159
    invoke-static {v3, v6}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    const-string v6, "HC256"

    .line 164
    .line 165
    invoke-static {v6, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    const-string v1, "IDEA"

    .line 170
    .line 171
    move-object/from16 v19, v0

    .line 172
    .line 173
    const/16 v0, 0x80

    .line 174
    .line 175
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    move-object/from16 v17, v1

    .line 180
    .line 181
    const-string v1, "Noekeon"

    .line 182
    .line 183
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    move-object/from16 v20, v1

    .line 188
    .line 189
    const-string v1, "RC2"

    .line 190
    .line 191
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    move-object/from16 v21, v1

    .line 196
    .line 197
    const-string v1, "RC5"

    .line 198
    .line 199
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    const-string v0, "RC6"

    .line 204
    .line 205
    move-object/from16 v23, v1

    .line 206
    .line 207
    const/16 v1, 0x100

    .line 208
    .line 209
    invoke-static {v0, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    move-object/from16 v24, v0

    .line 214
    .line 215
    const-string v0, "Rijndael"

    .line 216
    .line 217
    invoke-static {v0, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    const-string v1, "Salsa20"

    .line 222
    .line 223
    move-object/from16 v25, v0

    .line 224
    .line 225
    const/16 v0, 0x80

    .line 226
    .line 227
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    move-object/from16 v22, v1

    .line 232
    .line 233
    const-string v1, "SEED"

    .line 234
    .line 235
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    const-string v0, "Serpent"

    .line 240
    .line 241
    move-object/from16 v27, v1

    .line 242
    .line 243
    const/16 v1, 0x100

    .line 244
    .line 245
    invoke-static {v0, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const-string v1, "Shacal2"

    .line 250
    .line 251
    move-object/from16 v28, v0

    .line 252
    .line 253
    const/16 v0, 0x80

    .line 254
    .line 255
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    const-string v0, "Skipjack"

    .line 260
    .line 261
    move-object/from16 v29, v1

    .line 262
    .line 263
    const/16 v1, 0x50

    .line 264
    .line 265
    invoke-static {v0, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const-string v1, "SM4"

    .line 270
    .line 271
    move-object/from16 v30, v0

    .line 272
    .line 273
    const/16 v0, 0x80

    .line 274
    .line 275
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    move-object/from16 v26, v1

    .line 280
    .line 281
    const-string v1, "TEA"

    .line 282
    .line 283
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    const-string v0, "Twofish"

    .line 288
    .line 289
    move-object/from16 v32, v1

    .line 290
    .line 291
    const/16 v1, 0x100

    .line 292
    .line 293
    invoke-static {v0, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const-string v1, "Threefish"

    .line 298
    .line 299
    move-object/from16 v33, v0

    .line 300
    .line 301
    const/16 v0, 0x80

    .line 302
    .line 303
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    move-object/from16 v31, v1

    .line 308
    .line 309
    const-string v1, "VMPC"

    .line 310
    .line 311
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    move-object/from16 v34, v1

    .line 316
    .line 317
    const-string v1, "VMPCKSA3"

    .line 318
    .line 319
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    move-object/from16 v35, v1

    .line 324
    .line 325
    const-string v1, "XTEA"

    .line 326
    .line 327
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    move-object/from16 v36, v1

    .line 332
    .line 333
    const-string v1, "XSalsa20"

    .line 334
    .line 335
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    move-object/from16 v37, v1

    .line 340
    .line 341
    const-string v1, "OpenSSLPBKDF"

    .line 342
    .line 343
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    const-string v0, "DSTU7624"

    .line 348
    .line 349
    move-object/from16 v39, v1

    .line 350
    .line 351
    const/16 v1, 0x100

    .line 352
    .line 353
    invoke-static {v0, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    move-object/from16 v18, v0

    .line 358
    .line 359
    const-string v0, "GOST3412_2015"

    .line 360
    .line 361
    invoke-static {v0, v1}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    const-string v1, "Zuc"

    .line 366
    .line 367
    move-object/from16 v40, v0

    .line 368
    .line 369
    const/16 v0, 0x80

    .line 370
    .line 371
    invoke-static {v1, v0}, LTg/a;->p(Ljava/lang/String;I)LFg/c;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const/16 v1, 0x26

    .line 376
    .line 377
    new-array v1, v1, [LFg/c;

    .line 378
    .line 379
    const/16 v38, 0x0

    .line 380
    .line 381
    aput-object v19, v1, v38

    .line 382
    .line 383
    const/16 v19, 0x1

    .line 384
    .line 385
    aput-object v2, v1, v19

    .line 386
    .line 387
    const/4 v2, 0x2

    .line 388
    aput-object v4, v1, v2

    .line 389
    .line 390
    const/4 v2, 0x3

    .line 391
    aput-object v5, v1, v2

    .line 392
    .line 393
    const/4 v2, 0x4

    .line 394
    aput-object v7, v1, v2

    .line 395
    .line 396
    const/4 v2, 0x5

    .line 397
    aput-object v8, v1, v2

    .line 398
    .line 399
    const/4 v2, 0x6

    .line 400
    aput-object v9, v1, v2

    .line 401
    .line 402
    const/4 v2, 0x7

    .line 403
    aput-object v10, v1, v2

    .line 404
    .line 405
    const/16 v2, 0x8

    .line 406
    .line 407
    aput-object v11, v1, v2

    .line 408
    .line 409
    const/16 v2, 0x9

    .line 410
    .line 411
    aput-object v12, v1, v2

    .line 412
    .line 413
    const/16 v2, 0xa

    .line 414
    .line 415
    aput-object v13, v1, v2

    .line 416
    .line 417
    const/16 v2, 0xb

    .line 418
    .line 419
    aput-object v14, v1, v2

    .line 420
    .line 421
    const/16 v2, 0xc

    .line 422
    .line 423
    aput-object v15, v1, v2

    .line 424
    .line 425
    const/16 v2, 0xd

    .line 426
    .line 427
    aput-object v3, v1, v2

    .line 428
    .line 429
    const/16 v2, 0xe

    .line 430
    .line 431
    aput-object v6, v1, v2

    .line 432
    .line 433
    const/16 v2, 0xf

    .line 434
    .line 435
    aput-object v17, v1, v2

    .line 436
    .line 437
    const/16 v2, 0x10

    .line 438
    .line 439
    aput-object v20, v1, v2

    .line 440
    .line 441
    const/16 v2, 0x11

    .line 442
    .line 443
    aput-object v21, v1, v2

    .line 444
    .line 445
    const/16 v2, 0x12

    .line 446
    .line 447
    aput-object v23, v1, v2

    .line 448
    .line 449
    const/16 v2, 0x13

    .line 450
    .line 451
    aput-object v24, v1, v2

    .line 452
    .line 453
    aput-object v25, v1, v16

    .line 454
    .line 455
    const/16 v2, 0x15

    .line 456
    .line 457
    aput-object v22, v1, v2

    .line 458
    .line 459
    const/16 v2, 0x16

    .line 460
    .line 461
    aput-object v27, v1, v2

    .line 462
    .line 463
    const/16 v2, 0x17

    .line 464
    .line 465
    aput-object v28, v1, v2

    .line 466
    .line 467
    const/16 v2, 0x18

    .line 468
    .line 469
    aput-object v29, v1, v2

    .line 470
    .line 471
    const/16 v2, 0x19

    .line 472
    .line 473
    aput-object v30, v1, v2

    .line 474
    .line 475
    const/16 v2, 0x1a

    .line 476
    .line 477
    aput-object v26, v1, v2

    .line 478
    .line 479
    const/16 v2, 0x1b

    .line 480
    .line 481
    aput-object v32, v1, v2

    .line 482
    .line 483
    const/16 v2, 0x1c

    .line 484
    .line 485
    aput-object v33, v1, v2

    .line 486
    .line 487
    const/16 v2, 0x1d

    .line 488
    .line 489
    aput-object v31, v1, v2

    .line 490
    .line 491
    const/16 v2, 0x1e

    .line 492
    .line 493
    aput-object v34, v1, v2

    .line 494
    .line 495
    const/16 v2, 0x1f

    .line 496
    .line 497
    aput-object v35, v1, v2

    .line 498
    .line 499
    const/16 v2, 0x20

    .line 500
    .line 501
    aput-object v36, v1, v2

    .line 502
    .line 503
    const/16 v2, 0x21

    .line 504
    .line 505
    aput-object v37, v1, v2

    .line 506
    .line 507
    const/16 v2, 0x22

    .line 508
    .line 509
    aput-object v39, v1, v2

    .line 510
    .line 511
    const/16 v2, 0x23

    .line 512
    .line 513
    aput-object v18, v1, v2

    .line 514
    .line 515
    const/16 v2, 0x24

    .line 516
    .line 517
    aput-object v40, v1, v2

    .line 518
    .line 519
    const/16 v2, 0x25

    .line 520
    .line 521
    aput-object v0, v1, v2

    .line 522
    .line 523
    sput-object v1, LTg/a;->i:[LFg/c;

    .line 524
    .line 525
    const-string v7, "CompositeSignatures"

    .line 526
    .line 527
    const-string v8, "NoSig"

    .line 528
    .line 529
    const-string v3, "X509"

    .line 530
    .line 531
    const-string v4, "IES"

    .line 532
    .line 533
    const-string v5, "COMPOSITE"

    .line 534
    .line 535
    const-string v6, "EXTERNAL"

    .line 536
    .line 537
    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    sput-object v0, LTg/a;->j:[Ljava/lang/String;

    .line 542
    .line 543
    const-string v18, "MLDSA"

    .line 544
    .line 545
    const-string v19, "MLKEM"

    .line 546
    .line 547
    const-string v1, "DSA"

    .line 548
    .line 549
    const-string v2, "DH"

    .line 550
    .line 551
    const-string v3, "EC"

    .line 552
    .line 553
    const-string v4, "RSA"

    .line 554
    .line 555
    const-string v5, "GOST"

    .line 556
    .line 557
    const-string v6, "ECGOST"

    .line 558
    .line 559
    const-string v7, "ElGamal"

    .line 560
    .line 561
    const-string v8, "DSTU4145"

    .line 562
    .line 563
    const-string v9, "GM"

    .line 564
    .line 565
    const-string v10, "EdEC"

    .line 566
    .line 567
    const-string v11, "LMS"

    .line 568
    .line 569
    const-string v12, "SPHINCSPlus"

    .line 570
    .line 571
    const-string v13, "Dilithium"

    .line 572
    .line 573
    const-string v14, "Falcon"

    .line 574
    .line 575
    const-string v15, "NTRU"

    .line 576
    .line 577
    const-string v16, "CONTEXT"

    .line 578
    .line 579
    const-string v17, "SLHDSA"

    .line 580
    .line 581
    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    sput-object v0, LTg/a;->k:[Ljava/lang/String;

    .line 586
    .line 587
    const-string v23, "Haraka"

    .line 588
    .line 589
    const-string v24, "Blake3"

    .line 590
    .line 591
    const-string v1, "GOST3411"

    .line 592
    .line 593
    const-string v2, "Keccak"

    .line 594
    .line 595
    const-string v3, "MD2"

    .line 596
    .line 597
    const-string v4, "MD4"

    .line 598
    .line 599
    const-string v5, "MD5"

    .line 600
    .line 601
    const-string v6, "SHA1"

    .line 602
    .line 603
    const-string v7, "RIPEMD128"

    .line 604
    .line 605
    const-string v8, "RIPEMD160"

    .line 606
    .line 607
    const-string v9, "RIPEMD256"

    .line 608
    .line 609
    const-string v10, "RIPEMD320"

    .line 610
    .line 611
    const-string v11, "SHA224"

    .line 612
    .line 613
    const-string v12, "SHA256"

    .line 614
    .line 615
    const-string v13, "SHA384"

    .line 616
    .line 617
    const-string v14, "SHA512"

    .line 618
    .line 619
    const-string v15, "SHA3"

    .line 620
    .line 621
    const-string v16, "Skein"

    .line 622
    .line 623
    const-string v17, "SM3"

    .line 624
    .line 625
    const-string v18, "Tiger"

    .line 626
    .line 627
    const-string v19, "Whirlpool"

    .line 628
    .line 629
    const-string v20, "Blake2b"

    .line 630
    .line 631
    const-string v21, "Blake2s"

    .line 632
    .line 633
    const-string v22, "DSTU7564"

    .line 634
    .line 635
    filled-new-array/range {v1 .. v24}, [Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    sput-object v0, LTg/a;->l:[Ljava/lang/String;

    .line 640
    .line 641
    const-string v0, "BCFKS"

    .line 642
    .line 643
    const-string v1, "PKCS12"

    .line 644
    .line 645
    const-string v2, "BC"

    .line 646
    .line 647
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    sput-object v0, LTg/a;->m:[Ljava/lang/String;

    .line 652
    .line 653
    const-string v0, "DRBG"

    .line 654
    .line 655
    filled-new-array {v0}, [Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    sput-object v0, LTg/a;->n:[Ljava/lang/String;

    .line 660
    .line 661
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const-wide v0, 0x3ffcf5c28f5c28f6L    # 1.81

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    sget-object v2, LTg/a;->c:Ljava/lang/String;

    .line 7
    .line 8
    const-string v3, "BC"

    .line 9
    .line 10
    invoke-direct {p0, v3, v0, v1, v2}, Ljava/security/Provider;-><init>(Ljava/lang/String;DLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LTg/a;->a:Ljava/util/Map;

    .line 19
    .line 20
    new-instance v0, LTg/a$a;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LTg/a$a;-><init>(LTg/a;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method static synthetic a(LTg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LTg/a;->q()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic d(LTg/a;Ljava/lang/String;Ljava/lang/String;)Ljava/security/Provider$Service;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ljava/security/Provider;->getService(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Provider$Service;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(LTg/a;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, LTg/a;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(LTg/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/security/Provider;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g(LTg/a;Ljava/security/Provider$Service;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/security/Provider;->putService(Ljava/security/Provider$Service;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private i(Ljava/lang/String;[LFg/c;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p2

    .line 3
    if-eq v0, v1, :cond_0

    .line 4
    .line 5
    aget-object v1, p2, v0

    .line 6
    .line 7
    invoke-static {v1}, LFg/g;->a(LFg/c;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, LFg/c;->t()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {p0, p1, v1}, LTg/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method private j(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p2

    .line 3
    if-eq v0, v1, :cond_0

    .line 4
    .line 5
    aget-object v1, p2, v0

    .line 6
    .line 7
    invoke-direct {p0, p1, v1}, LTg/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method private k()V
    .locals 2

    .line 1
    sget-object v0, LAg/a;->a0:Lzg/t;

    .line 2
    .line 3
    new-instance v1, LHh/c;

    .line 4
    .line 5
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LAg/a;->b0:Lzg/t;

    .line 12
    .line 13
    new-instance v1, LHh/c;

    .line 14
    .line 15
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, LAg/a;->c0:Lzg/t;

    .line 22
    .line 23
    new-instance v1, LHh/c;

    .line 24
    .line 25
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, LAg/a;->d0:Lzg/t;

    .line 32
    .line 33
    new-instance v1, LHh/c;

    .line 34
    .line 35
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, LAg/a;->e0:Lzg/t;

    .line 42
    .line 43
    new-instance v1, LHh/c;

    .line 44
    .line 45
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 49
    .line 50
    .line 51
    sget-object v0, LAg/a;->f0:Lzg/t;

    .line 52
    .line 53
    new-instance v1, LHh/c;

    .line 54
    .line 55
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, LAg/a;->g0:Lzg/t;

    .line 62
    .line 63
    new-instance v1, LHh/c;

    .line 64
    .line 65
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, LAg/a;->h0:Lzg/t;

    .line 72
    .line 73
    new-instance v1, LHh/c;

    .line 74
    .line 75
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, LAg/a;->i0:Lzg/t;

    .line 82
    .line 83
    new-instance v1, LHh/c;

    .line 84
    .line 85
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, LAg/a;->j0:Lzg/t;

    .line 92
    .line 93
    new-instance v1, LHh/c;

    .line 94
    .line 95
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, LAg/a;->k0:Lzg/t;

    .line 102
    .line 103
    new-instance v1, LHh/c;

    .line 104
    .line 105
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 109
    .line 110
    .line 111
    sget-object v0, LAg/a;->l0:Lzg/t;

    .line 112
    .line 113
    new-instance v1, LHh/c;

    .line 114
    .line 115
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, LAg/a;->m0:Lzg/t;

    .line 122
    .line 123
    new-instance v1, LHh/c;

    .line 124
    .line 125
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 129
    .line 130
    .line 131
    sget-object v0, LAg/a;->n0:Lzg/t;

    .line 132
    .line 133
    new-instance v1, LHh/c;

    .line 134
    .line 135
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, LAg/a;->o0:Lzg/t;

    .line 142
    .line 143
    new-instance v1, LHh/c;

    .line 144
    .line 145
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, LAg/a;->p0:Lzg/t;

    .line 152
    .line 153
    new-instance v1, LHh/c;

    .line 154
    .line 155
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, LAg/a;->q0:Lzg/t;

    .line 162
    .line 163
    new-instance v1, LHh/c;

    .line 164
    .line 165
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 169
    .line 170
    .line 171
    sget-object v0, LAg/a;->r0:Lzg/t;

    .line 172
    .line 173
    new-instance v1, LHh/c;

    .line 174
    .line 175
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 179
    .line 180
    .line 181
    sget-object v0, LAg/a;->s0:Lzg/t;

    .line 182
    .line 183
    new-instance v1, LHh/c;

    .line 184
    .line 185
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 189
    .line 190
    .line 191
    sget-object v0, LAg/a;->t0:Lzg/t;

    .line 192
    .line 193
    new-instance v1, LHh/c;

    .line 194
    .line 195
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 199
    .line 200
    .line 201
    sget-object v0, LAg/a;->u0:Lzg/t;

    .line 202
    .line 203
    new-instance v1, LHh/c;

    .line 204
    .line 205
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 209
    .line 210
    .line 211
    sget-object v0, LAg/a;->v0:Lzg/t;

    .line 212
    .line 213
    new-instance v1, LHh/c;

    .line 214
    .line 215
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 219
    .line 220
    .line 221
    sget-object v0, LAg/a;->w0:Lzg/t;

    .line 222
    .line 223
    new-instance v1, LHh/c;

    .line 224
    .line 225
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 229
    .line 230
    .line 231
    sget-object v0, LAg/a;->x0:Lzg/t;

    .line 232
    .line 233
    new-instance v1, LHh/c;

    .line 234
    .line 235
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 239
    .line 240
    .line 241
    sget-object v0, LAg/a;->y0:Lzg/t;

    .line 242
    .line 243
    new-instance v1, LHh/c;

    .line 244
    .line 245
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 249
    .line 250
    .line 251
    sget-object v0, LAg/a;->z0:Lzg/t;

    .line 252
    .line 253
    new-instance v1, LHh/c;

    .line 254
    .line 255
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 259
    .line 260
    .line 261
    sget-object v0, LAg/a;->A0:Lzg/t;

    .line 262
    .line 263
    new-instance v1, LHh/c;

    .line 264
    .line 265
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 269
    .line 270
    .line 271
    sget-object v0, LAg/a;->B0:Lzg/t;

    .line 272
    .line 273
    new-instance v1, LHh/c;

    .line 274
    .line 275
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 279
    .line 280
    .line 281
    sget-object v0, LAg/a;->C0:Lzg/t;

    .line 282
    .line 283
    new-instance v1, LHh/c;

    .line 284
    .line 285
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 289
    .line 290
    .line 291
    sget-object v0, LAg/a;->D0:Lzg/t;

    .line 292
    .line 293
    new-instance v1, LHh/c;

    .line 294
    .line 295
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 299
    .line 300
    .line 301
    sget-object v0, LAg/a;->E0:Lzg/t;

    .line 302
    .line 303
    new-instance v1, LHh/c;

    .line 304
    .line 305
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 309
    .line 310
    .line 311
    sget-object v0, LAg/a;->F0:Lzg/t;

    .line 312
    .line 313
    new-instance v1, LHh/c;

    .line 314
    .line 315
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 319
    .line 320
    .line 321
    sget-object v0, LAg/a;->G0:Lzg/t;

    .line 322
    .line 323
    new-instance v1, LHh/c;

    .line 324
    .line 325
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, LAg/a;->H0:Lzg/t;

    .line 332
    .line 333
    new-instance v1, LHh/c;

    .line 334
    .line 335
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, LAg/a;->I0:Lzg/t;

    .line 342
    .line 343
    new-instance v1, LHh/c;

    .line 344
    .line 345
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 349
    .line 350
    .line 351
    sget-object v0, LAg/a;->J0:Lzg/t;

    .line 352
    .line 353
    new-instance v1, LHh/c;

    .line 354
    .line 355
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 359
    .line 360
    .line 361
    sget-object v0, LAg/a;->K0:Lzg/t;

    .line 362
    .line 363
    new-instance v1, LHh/c;

    .line 364
    .line 365
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 369
    .line 370
    .line 371
    sget-object v0, LAg/a;->N0:Lzg/t;

    .line 372
    .line 373
    new-instance v1, LHh/c;

    .line 374
    .line 375
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 379
    .line 380
    .line 381
    sget-object v0, LAg/a;->P0:Lzg/t;

    .line 382
    .line 383
    new-instance v1, LHh/c;

    .line 384
    .line 385
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 386
    .line 387
    .line 388
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 389
    .line 390
    .line 391
    sget-object v0, LAg/a;->R0:Lzg/t;

    .line 392
    .line 393
    new-instance v1, LHh/c;

    .line 394
    .line 395
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 399
    .line 400
    .line 401
    new-instance v0, Lzg/t;

    .line 402
    .line 403
    const-string v1, "1.3.9999.6.4.10"

    .line 404
    .line 405
    invoke-direct {v0, v1}, Lzg/t;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    new-instance v1, LHh/c;

    .line 409
    .line 410
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 411
    .line 412
    .line 413
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 414
    .line 415
    .line 416
    sget-object v0, LAg/a;->S0:Lzg/t;

    .line 417
    .line 418
    new-instance v1, LHh/c;

    .line 419
    .line 420
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 424
    .line 425
    .line 426
    sget-object v0, LAg/a;->U0:Lzg/t;

    .line 427
    .line 428
    new-instance v1, LHh/c;

    .line 429
    .line 430
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 434
    .line 435
    .line 436
    sget-object v0, LAg/a;->W0:Lzg/t;

    .line 437
    .line 438
    new-instance v1, LHh/c;

    .line 439
    .line 440
    invoke-direct {v1}, LHh/c;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 444
    .line 445
    .line 446
    sget-object v0, LVg/g;->r:Lzg/t;

    .line 447
    .line 448
    new-instance v1, LGh/c;

    .line 449
    .line 450
    invoke-direct {v1}, LGh/c;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 454
    .line 455
    .line 456
    sget-object v0, LVg/g;->v:Lzg/t;

    .line 457
    .line 458
    new-instance v1, LCh/c;

    .line 459
    .line 460
    invoke-direct {v1}, LCh/c;-><init>()V

    .line 461
    .line 462
    .line 463
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 464
    .line 465
    .line 466
    sget-object v0, LVg/g;->w:Lzg/t;

    .line 467
    .line 468
    new-instance v1, LJh/f;

    .line 469
    .line 470
    invoke-direct {v1}, LJh/f;-><init>()V

    .line 471
    .line 472
    .line 473
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 474
    .line 475
    .line 476
    sget-object v0, LLg/a;->a:Lzg/t;

    .line 477
    .line 478
    new-instance v1, LJh/f;

    .line 479
    .line 480
    invoke-direct {v1}, LJh/f;-><init>()V

    .line 481
    .line 482
    .line 483
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 484
    .line 485
    .line 486
    sget-object v0, LVg/g;->F:Lzg/t;

    .line 487
    .line 488
    new-instance v1, LJh/g;

    .line 489
    .line 490
    invoke-direct {v1}, LJh/g;-><init>()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 494
    .line 495
    .line 496
    sget-object v0, LLg/a;->b:Lzg/t;

    .line 497
    .line 498
    new-instance v1, LJh/g;

    .line 499
    .line 500
    invoke-direct {v1}, LJh/g;-><init>()V

    .line 501
    .line 502
    .line 503
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 504
    .line 505
    .line 506
    sget-object v0, LCg/a;->R0:Lzg/t;

    .line 507
    .line 508
    new-instance v1, LAh/c;

    .line 509
    .line 510
    invoke-direct {v1}, LAh/c;-><init>()V

    .line 511
    .line 512
    .line 513
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 514
    .line 515
    .line 516
    sget-object v0, LAg/a;->p1:Lzg/t;

    .line 517
    .line 518
    new-instance v1, LEh/c;

    .line 519
    .line 520
    invoke-direct {v1}, LEh/c;-><init>()V

    .line 521
    .line 522
    .line 523
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 524
    .line 525
    .line 526
    sget-object v0, LAg/a;->H1:Lzg/t;

    .line 527
    .line 528
    new-instance v1, Lxh/c;

    .line 529
    .line 530
    invoke-direct {v1}, Lxh/c;-><init>()V

    .line 531
    .line 532
    .line 533
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 534
    .line 535
    .line 536
    sget-object v0, LAg/a;->K1:Lzg/t;

    .line 537
    .line 538
    new-instance v1, Lxh/c;

    .line 539
    .line 540
    invoke-direct {v1}, Lxh/c;-><init>()V

    .line 541
    .line 542
    .line 543
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 544
    .line 545
    .line 546
    sget-object v0, LBg/a;->X0:Lzg/t;

    .line 547
    .line 548
    new-instance v1, LOg/c;

    .line 549
    .line 550
    invoke-direct {v1}, LOg/c;-><init>()V

    .line 551
    .line 552
    .line 553
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 554
    .line 555
    .line 556
    sget-object v0, LBg/a;->Y0:Lzg/t;

    .line 557
    .line 558
    new-instance v1, LOg/c;

    .line 559
    .line 560
    invoke-direct {v1}, LOg/c;-><init>()V

    .line 561
    .line 562
    .line 563
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 564
    .line 565
    .line 566
    sget-object v0, LBg/a;->Z0:Lzg/t;

    .line 567
    .line 568
    new-instance v1, LOg/c;

    .line 569
    .line 570
    invoke-direct {v1}, LOg/c;-><init>()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 574
    .line 575
    .line 576
    sget-object v0, LAg/a;->S1:Lzg/t;

    .line 577
    .line 578
    new-instance v1, Lwh/c;

    .line 579
    .line 580
    invoke-direct {v1}, Lwh/c;-><init>()V

    .line 581
    .line 582
    .line 583
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 584
    .line 585
    .line 586
    sget-object v0, LAg/a;->T1:Lzg/t;

    .line 587
    .line 588
    new-instance v1, Lwh/c;

    .line 589
    .line 590
    invoke-direct {v1}, Lwh/c;-><init>()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 594
    .line 595
    .line 596
    sget-object v0, LAg/a;->U1:Lzg/t;

    .line 597
    .line 598
    new-instance v1, Lwh/c;

    .line 599
    .line 600
    invoke-direct {v1}, Lwh/c;-><init>()V

    .line 601
    .line 602
    .line 603
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 604
    .line 605
    .line 606
    sget-object v0, LAg/a;->V1:Lzg/t;

    .line 607
    .line 608
    new-instance v1, Lwh/c;

    .line 609
    .line 610
    invoke-direct {v1}, Lwh/c;-><init>()V

    .line 611
    .line 612
    .line 613
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 614
    .line 615
    .line 616
    sget-object v0, LAg/a;->W1:Lzg/t;

    .line 617
    .line 618
    new-instance v1, Lwh/c;

    .line 619
    .line 620
    invoke-direct {v1}, Lwh/c;-><init>()V

    .line 621
    .line 622
    .line 623
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 624
    .line 625
    .line 626
    sget-object v0, LAg/a;->X1:Lzg/t;

    .line 627
    .line 628
    new-instance v1, Lwh/c;

    .line 629
    .line 630
    invoke-direct {v1}, Lwh/c;-><init>()V

    .line 631
    .line 632
    .line 633
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 634
    .line 635
    .line 636
    sget-object v0, LAg/a;->D2:Lzg/t;

    .line 637
    .line 638
    new-instance v1, Lvh/c;

    .line 639
    .line 640
    invoke-direct {v1}, Lvh/c;-><init>()V

    .line 641
    .line 642
    .line 643
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 644
    .line 645
    .line 646
    sget-object v0, LAg/a;->F2:Lzg/t;

    .line 647
    .line 648
    new-instance v1, Lvh/c;

    .line 649
    .line 650
    invoke-direct {v1}, Lvh/c;-><init>()V

    .line 651
    .line 652
    .line 653
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 654
    .line 655
    .line 656
    sget-object v0, LAg/a;->H2:Lzg/t;

    .line 657
    .line 658
    new-instance v1, Lvh/c;

    .line 659
    .line 660
    invoke-direct {v1}, Lvh/c;-><init>()V

    .line 661
    .line 662
    .line 663
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 664
    .line 665
    .line 666
    sget-object v0, LAg/a;->J2:Lzg/t;

    .line 667
    .line 668
    new-instance v1, Lvh/c;

    .line 669
    .line 670
    invoke-direct {v1}, Lvh/c;-><init>()V

    .line 671
    .line 672
    .line 673
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 674
    .line 675
    .line 676
    sget-object v0, LAg/a;->L2:Lzg/t;

    .line 677
    .line 678
    new-instance v1, Lvh/c;

    .line 679
    .line 680
    invoke-direct {v1}, Lvh/c;-><init>()V

    .line 681
    .line 682
    .line 683
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 684
    .line 685
    .line 686
    sget-object v0, LAg/a;->a4:Lzg/t;

    .line 687
    .line 688
    new-instance v1, Luh/c;

    .line 689
    .line 690
    invoke-direct {v1}, Luh/c;-><init>()V

    .line 691
    .line 692
    .line 693
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 694
    .line 695
    .line 696
    sget-object v0, LAg/a;->b4:Lzg/t;

    .line 697
    .line 698
    new-instance v1, Luh/c;

    .line 699
    .line 700
    invoke-direct {v1}, Luh/c;-><init>()V

    .line 701
    .line 702
    .line 703
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 704
    .line 705
    .line 706
    sget-object v0, LAg/a;->c4:Lzg/t;

    .line 707
    .line 708
    new-instance v1, Luh/c;

    .line 709
    .line 710
    invoke-direct {v1}, Luh/c;-><init>()V

    .line 711
    .line 712
    .line 713
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 714
    .line 715
    .line 716
    sget-object v0, LAg/a;->e4:Lzg/t;

    .line 717
    .line 718
    new-instance v1, Lyh/c;

    .line 719
    .line 720
    invoke-direct {v1}, Lyh/c;-><init>()V

    .line 721
    .line 722
    .line 723
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 724
    .line 725
    .line 726
    sget-object v0, LAg/a;->f4:Lzg/t;

    .line 727
    .line 728
    new-instance v1, Lyh/c;

    .line 729
    .line 730
    invoke-direct {v1}, Lyh/c;-><init>()V

    .line 731
    .line 732
    .line 733
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 734
    .line 735
    .line 736
    sget-object v0, LAg/a;->g4:Lzg/t;

    .line 737
    .line 738
    new-instance v1, Lyh/c;

    .line 739
    .line 740
    invoke-direct {v1}, Lyh/c;-><init>()V

    .line 741
    .line 742
    .line 743
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 744
    .line 745
    .line 746
    sget-object v0, LAg/a;->H3:Lzg/t;

    .line 747
    .line 748
    new-instance v1, Lzh/c;

    .line 749
    .line 750
    invoke-direct {v1}, Lzh/c;-><init>()V

    .line 751
    .line 752
    .line 753
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 754
    .line 755
    .line 756
    sget-object v0, LAg/a;->I3:Lzg/t;

    .line 757
    .line 758
    new-instance v1, Lzh/c;

    .line 759
    .line 760
    invoke-direct {v1}, Lzh/c;-><init>()V

    .line 761
    .line 762
    .line 763
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 764
    .line 765
    .line 766
    sget-object v0, LAg/a;->J3:Lzg/t;

    .line 767
    .line 768
    new-instance v1, Lzh/c;

    .line 769
    .line 770
    invoke-direct {v1}, Lzh/c;-><init>()V

    .line 771
    .line 772
    .line 773
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 774
    .line 775
    .line 776
    sget-object v0, LAg/a;->x3:Lzg/t;

    .line 777
    .line 778
    new-instance v1, LDh/c;

    .line 779
    .line 780
    invoke-direct {v1}, LDh/c;-><init>()V

    .line 781
    .line 782
    .line 783
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 784
    .line 785
    .line 786
    sget-object v0, LAg/a;->y3:Lzg/t;

    .line 787
    .line 788
    new-instance v1, LDh/c;

    .line 789
    .line 790
    invoke-direct {v1}, LDh/c;-><init>()V

    .line 791
    .line 792
    .line 793
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 794
    .line 795
    .line 796
    sget-object v0, LAg/a;->z3:Lzg/t;

    .line 797
    .line 798
    new-instance v1, LDh/c;

    .line 799
    .line 800
    invoke-direct {v1}, LDh/c;-><init>()V

    .line 801
    .line 802
    .line 803
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 804
    .line 805
    .line 806
    sget-object v0, LAg/a;->A3:Lzg/t;

    .line 807
    .line 808
    new-instance v1, LDh/c;

    .line 809
    .line 810
    invoke-direct {v1}, LDh/c;-><init>()V

    .line 811
    .line 812
    .line 813
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 814
    .line 815
    .line 816
    sget-object v0, LAg/a;->i4:Lzg/t;

    .line 817
    .line 818
    new-instance v1, LBh/c;

    .line 819
    .line 820
    invoke-direct {v1}, LBh/c;-><init>()V

    .line 821
    .line 822
    .line 823
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 824
    .line 825
    .line 826
    sget-object v0, LAg/a;->j4:Lzg/t;

    .line 827
    .line 828
    new-instance v1, LBh/c;

    .line 829
    .line 830
    invoke-direct {v1}, LBh/c;-><init>()V

    .line 831
    .line 832
    .line 833
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 834
    .line 835
    .line 836
    sget-object v0, LAg/a;->k4:Lzg/t;

    .line 837
    .line 838
    new-instance v1, LBh/c;

    .line 839
    .line 840
    invoke-direct {v1}, LBh/c;-><init>()V

    .line 841
    .line 842
    .line 843
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 844
    .line 845
    .line 846
    sget-object v0, LAg/a;->l4:Lzg/t;

    .line 847
    .line 848
    new-instance v1, LBh/c;

    .line 849
    .line 850
    invoke-direct {v1}, LBh/c;-><init>()V

    .line 851
    .line 852
    .line 853
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 854
    .line 855
    .line 856
    sget-object v0, LAg/a;->v4:Lzg/t;

    .line 857
    .line 858
    new-instance v1, LFh/c;

    .line 859
    .line 860
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 861
    .line 862
    .line 863
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 864
    .line 865
    .line 866
    sget-object v0, LAg/a;->w4:Lzg/t;

    .line 867
    .line 868
    new-instance v1, LFh/c;

    .line 869
    .line 870
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 871
    .line 872
    .line 873
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 874
    .line 875
    .line 876
    sget-object v0, LAg/a;->x4:Lzg/t;

    .line 877
    .line 878
    new-instance v1, LFh/c;

    .line 879
    .line 880
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 881
    .line 882
    .line 883
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 884
    .line 885
    .line 886
    sget-object v0, LAg/a;->y4:Lzg/t;

    .line 887
    .line 888
    new-instance v1, LFh/c;

    .line 889
    .line 890
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 891
    .line 892
    .line 893
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 894
    .line 895
    .line 896
    sget-object v0, LAg/a;->z4:Lzg/t;

    .line 897
    .line 898
    new-instance v1, LFh/c;

    .line 899
    .line 900
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 901
    .line 902
    .line 903
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 904
    .line 905
    .line 906
    sget-object v0, LAg/a;->A4:Lzg/t;

    .line 907
    .line 908
    new-instance v1, LFh/c;

    .line 909
    .line 910
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 911
    .line 912
    .line 913
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 914
    .line 915
    .line 916
    sget-object v0, LAg/a;->B4:Lzg/t;

    .line 917
    .line 918
    new-instance v1, LFh/c;

    .line 919
    .line 920
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 921
    .line 922
    .line 923
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 924
    .line 925
    .line 926
    sget-object v0, LAg/a;->C4:Lzg/t;

    .line 927
    .line 928
    new-instance v1, LFh/c;

    .line 929
    .line 930
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 931
    .line 932
    .line 933
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 934
    .line 935
    .line 936
    sget-object v0, LAg/a;->D4:Lzg/t;

    .line 937
    .line 938
    new-instance v1, LFh/c;

    .line 939
    .line 940
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 941
    .line 942
    .line 943
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 944
    .line 945
    .line 946
    sget-object v0, LAg/a;->E4:Lzg/t;

    .line 947
    .line 948
    new-instance v1, LFh/c;

    .line 949
    .line 950
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 951
    .line 952
    .line 953
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 954
    .line 955
    .line 956
    sget-object v0, LAg/a;->F4:Lzg/t;

    .line 957
    .line 958
    new-instance v1, LFh/c;

    .line 959
    .line 960
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 961
    .line 962
    .line 963
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 964
    .line 965
    .line 966
    sget-object v0, LAg/a;->G4:Lzg/t;

    .line 967
    .line 968
    new-instance v1, LFh/c;

    .line 969
    .line 970
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 971
    .line 972
    .line 973
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 974
    .line 975
    .line 976
    sget-object v0, LAg/a;->L4:Lzg/t;

    .line 977
    .line 978
    new-instance v1, LFh/c;

    .line 979
    .line 980
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 981
    .line 982
    .line 983
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 984
    .line 985
    .line 986
    sget-object v0, LAg/a;->M4:Lzg/t;

    .line 987
    .line 988
    new-instance v1, LFh/c;

    .line 989
    .line 990
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 991
    .line 992
    .line 993
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 994
    .line 995
    .line 996
    sget-object v0, LAg/a;->N4:Lzg/t;

    .line 997
    .line 998
    new-instance v1, LFh/c;

    .line 999
    .line 1000
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1004
    .line 1005
    .line 1006
    sget-object v0, LAg/a;->O4:Lzg/t;

    .line 1007
    .line 1008
    new-instance v1, LFh/c;

    .line 1009
    .line 1010
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1014
    .line 1015
    .line 1016
    sget-object v0, LAg/a;->P4:Lzg/t;

    .line 1017
    .line 1018
    new-instance v1, LFh/c;

    .line 1019
    .line 1020
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1024
    .line 1025
    .line 1026
    sget-object v0, LAg/a;->Q4:Lzg/t;

    .line 1027
    .line 1028
    new-instance v1, LFh/c;

    .line 1029
    .line 1030
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1034
    .line 1035
    .line 1036
    sget-object v0, LAg/a;->R4:Lzg/t;

    .line 1037
    .line 1038
    new-instance v1, LFh/c;

    .line 1039
    .line 1040
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1044
    .line 1045
    .line 1046
    sget-object v0, LAg/a;->S4:Lzg/t;

    .line 1047
    .line 1048
    new-instance v1, LFh/c;

    .line 1049
    .line 1050
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1054
    .line 1055
    .line 1056
    sget-object v0, LAg/a;->T4:Lzg/t;

    .line 1057
    .line 1058
    new-instance v1, LFh/c;

    .line 1059
    .line 1060
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1064
    .line 1065
    .line 1066
    sget-object v0, LAg/a;->U4:Lzg/t;

    .line 1067
    .line 1068
    new-instance v1, LFh/c;

    .line 1069
    .line 1070
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1074
    .line 1075
    .line 1076
    sget-object v0, LAg/a;->V4:Lzg/t;

    .line 1077
    .line 1078
    new-instance v1, LFh/c;

    .line 1079
    .line 1080
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1084
    .line 1085
    .line 1086
    sget-object v0, LAg/a;->W4:Lzg/t;

    .line 1087
    .line 1088
    new-instance v1, LFh/c;

    .line 1089
    .line 1090
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1094
    .line 1095
    .line 1096
    sget-object v0, LAg/a;->X4:Lzg/t;

    .line 1097
    .line 1098
    new-instance v1, LFh/c;

    .line 1099
    .line 1100
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1104
    .line 1105
    .line 1106
    sget-object v0, LAg/a;->Y4:Lzg/t;

    .line 1107
    .line 1108
    new-instance v1, LFh/c;

    .line 1109
    .line 1110
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1114
    .line 1115
    .line 1116
    sget-object v0, LAg/a;->Z4:Lzg/t;

    .line 1117
    .line 1118
    new-instance v1, LFh/c;

    .line 1119
    .line 1120
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1124
    .line 1125
    .line 1126
    sget-object v0, LAg/a;->a5:Lzg/t;

    .line 1127
    .line 1128
    new-instance v1, LFh/c;

    .line 1129
    .line 1130
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1134
    .line 1135
    .line 1136
    sget-object v0, LAg/a;->b5:Lzg/t;

    .line 1137
    .line 1138
    new-instance v1, LFh/c;

    .line 1139
    .line 1140
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1144
    .line 1145
    .line 1146
    sget-object v0, LAg/a;->c5:Lzg/t;

    .line 1147
    .line 1148
    new-instance v1, LFh/c;

    .line 1149
    .line 1150
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1154
    .line 1155
    .line 1156
    sget-object v0, LAg/a;->d5:Lzg/t;

    .line 1157
    .line 1158
    new-instance v1, LFh/c;

    .line 1159
    .line 1160
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1164
    .line 1165
    .line 1166
    sget-object v0, LAg/a;->e5:Lzg/t;

    .line 1167
    .line 1168
    new-instance v1, LFh/c;

    .line 1169
    .line 1170
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1174
    .line 1175
    .line 1176
    sget-object v0, LAg/a;->f5:Lzg/t;

    .line 1177
    .line 1178
    new-instance v1, LFh/c;

    .line 1179
    .line 1180
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1184
    .line 1185
    .line 1186
    sget-object v0, LAg/a;->g5:Lzg/t;

    .line 1187
    .line 1188
    new-instance v1, LFh/c;

    .line 1189
    .line 1190
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1194
    .line 1195
    .line 1196
    sget-object v0, LAg/a;->h5:Lzg/t;

    .line 1197
    .line 1198
    new-instance v1, LFh/c;

    .line 1199
    .line 1200
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1204
    .line 1205
    .line 1206
    sget-object v0, LAg/a;->i5:Lzg/t;

    .line 1207
    .line 1208
    new-instance v1, LFh/c;

    .line 1209
    .line 1210
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1214
    .line 1215
    .line 1216
    sget-object v0, LAg/a;->j5:Lzg/t;

    .line 1217
    .line 1218
    new-instance v1, LFh/c;

    .line 1219
    .line 1220
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1224
    .line 1225
    .line 1226
    sget-object v0, LAg/a;->k5:Lzg/t;

    .line 1227
    .line 1228
    new-instance v1, LFh/c;

    .line 1229
    .line 1230
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1234
    .line 1235
    .line 1236
    sget-object v0, LAg/a;->l5:Lzg/t;

    .line 1237
    .line 1238
    new-instance v1, LFh/c;

    .line 1239
    .line 1240
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1244
    .line 1245
    .line 1246
    sget-object v0, LAg/a;->m5:Lzg/t;

    .line 1247
    .line 1248
    new-instance v1, LFh/c;

    .line 1249
    .line 1250
    invoke-direct {v1}, LFh/c;-><init>()V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {p0, v0, v1}, LTg/a;->h(Lzg/t;LRg/a;)V

    .line 1254
    .line 1255
    .line 1256
    return-void
.end method

.method private m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, "$Mappings"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-class v1, LTg/a;

    .line 22
    .line 23
    invoke-static {v1, v0}, LQg/a;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    new-instance v1, Ljava/lang/InternalError;

    .line 41
    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v3, "cannot create instance of "

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p1, "$Mappings : "

    .line 59
    .line 60
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {v1, p1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1
.end method

.method private static p(Ljava/lang/String;I)LFg/c;
    .locals 1

    .line 1
    new-instance v0, LTg/a$c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LTg/a$c;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private q()V
    .locals 9

    .line 1
    const-string v0, "org.bouncycastle.jcajce.provider.digest."

    .line 2
    .line 3
    sget-object v1, LTg/a;->l:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, LTg/a;->j(Ljava/lang/String;[Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, LTg/a;->g:[Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "org.bouncycastle.jcajce.provider.symmetric."

    .line 11
    .line 12
    invoke-direct {p0, v1, v0}, LTg/a;->j(Ljava/lang/String;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, LTg/a;->h:[Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {p0, v1, v0}, LTg/a;->j(Ljava/lang/String;[Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, LTg/a;->i:[LFg/c;

    .line 21
    .line 22
    invoke-direct {p0, v1, v0}, LTg/a;->i(Ljava/lang/String;[LFg/c;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, LTg/a;->j:[Ljava/lang/String;

    .line 26
    .line 27
    const-string v1, "org.bouncycastle.jcajce.provider.asymmetric."

    .line 28
    .line 29
    invoke-direct {p0, v1, v0}, LTg/a;->j(Ljava/lang/String;[Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, LTg/a;->k:[Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {p0, v1, v0}, LTg/a;->j(Ljava/lang/String;[Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "org.bouncycastle.jcajce.provider.keystore."

    .line 38
    .line 39
    sget-object v1, LTg/a;->m:[Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {p0, v0, v1}, LTg/a;->j(Ljava/lang/String;[Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v0, "org.bouncycastle.jcajce.provider.drbg."

    .line 45
    .line 46
    sget-object v1, LTg/a;->n:[Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {p0, v0, v1}, LTg/a;->j(Ljava/lang/String;[Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, LTg/a;->k()V

    .line 52
    .line 53
    .line 54
    const-string v0, "X509Store.CERTIFICATE/COLLECTION"

    .line 55
    .line 56
    const-string v1, "org.bouncycastle.jce.provider.X509StoreCertCollection"

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    const-string v0, "X509Store.ATTRIBUTECERTIFICATE/COLLECTION"

    .line 62
    .line 63
    const-string v1, "org.bouncycastle.jce.provider.X509StoreAttrCertCollection"

    .line 64
    .line 65
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    const-string v0, "X509Store.CRL/COLLECTION"

    .line 69
    .line 70
    const-string v1, "org.bouncycastle.jce.provider.X509StoreCRLCollection"

    .line 71
    .line 72
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    const-string v0, "X509Store.CERTIFICATEPAIR/COLLECTION"

    .line 76
    .line 77
    const-string v1, "org.bouncycastle.jce.provider.X509StoreCertPairCollection"

    .line 78
    .line 79
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    const-string v0, "X509Store.CERTIFICATE/LDAP"

    .line 83
    .line 84
    const-string v1, "org.bouncycastle.jce.provider.X509StoreLDAPCerts"

    .line 85
    .line 86
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    const-string v0, "X509Store.CRL/LDAP"

    .line 90
    .line 91
    const-string v1, "org.bouncycastle.jce.provider.X509StoreLDAPCRLs"

    .line 92
    .line 93
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    const-string v0, "X509Store.ATTRIBUTECERTIFICATE/LDAP"

    .line 97
    .line 98
    const-string v1, "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts"

    .line 99
    .line 100
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const-string v0, "X509Store.CERTIFICATEPAIR/LDAP"

    .line 104
    .line 105
    const-string v1, "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs"

    .line 106
    .line 107
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-string v0, "X509StreamParser.CERTIFICATE"

    .line 111
    .line 112
    const-string v1, "org.bouncycastle.jce.provider.X509CertParser"

    .line 113
    .line 114
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-string v0, "X509StreamParser.ATTRIBUTECERTIFICATE"

    .line 118
    .line 119
    const-string v1, "org.bouncycastle.jce.provider.X509AttrCertParser"

    .line 120
    .line 121
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    const-string v0, "X509StreamParser.CRL"

    .line 125
    .line 126
    const-string v1, "org.bouncycastle.jce.provider.X509CRLParser"

    .line 127
    .line 128
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    const-string v0, "X509StreamParser.CERTIFICATEPAIR"

    .line 132
    .line 133
    const-string v1, "org.bouncycastle.jce.provider.X509CertPairParser"

    .line 134
    .line 135
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    const-string v0, "Cipher.BROKENPBEWITHMD5ANDDES"

    .line 139
    .line 140
    const-string v1, "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES"

    .line 141
    .line 142
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    const-string v0, "Cipher.BROKENPBEWITHSHA1ANDDES"

    .line 146
    .line 147
    const-string v1, "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES"

    .line 148
    .line 149
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    const-string v0, "Cipher.OLDPBEWITHSHAANDTWOFISH-CBC"

    .line 153
    .line 154
    const-string v1, "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish"

    .line 155
    .line 156
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    sget-object v0, LTg/a;->f:Ljava/lang/Class;

    .line 160
    .line 161
    const-string v1, "CertPathBuilder.PKIX"

    .line 162
    .line 163
    const-string v2, "CertPathValidator.PKIX"

    .line 164
    .line 165
    const-string v3, "CertPathBuilder.RFC3280"

    .line 166
    .line 167
    const-string v4, "CertPathValidator.RFC3280"

    .line 168
    .line 169
    const-string v5, "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi"

    .line 170
    .line 171
    const-string v6, "CertPathBuilder.RFC3281"

    .line 172
    .line 173
    const-string v7, "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi"

    .line 174
    .line 175
    const-string v8, "CertPathValidator.RFC3281"

    .line 176
    .line 177
    invoke-virtual {p0, v8, v7}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, v6, v5}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    if-eqz v0, :cond_0

    .line 184
    .line 185
    const-string v0, "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8"

    .line 186
    .line 187
    invoke-virtual {p0, v4, v0}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    const-string v4, "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8"

    .line 191
    .line 192
    :goto_0
    invoke-virtual {p0, v3, v4}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v2, v0}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v1, v4}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_0
    const-string v0, "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi"

    .line 203
    .line 204
    invoke-virtual {p0, v4, v0}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    const-string v4, "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi"

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :goto_1
    const-string v0, "CertStore.Collection"

    .line 211
    .line 212
    const-string v1, "org.bouncycastle.jce.provider.CertStoreCollectionSpi"

    .line 213
    .line 214
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    const-string v0, "CertStore.LDAP"

    .line 218
    .line 219
    const-string v1, "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi"

    .line 220
    .line 221
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    const-string v0, "CertStore.Multi"

    .line 225
    .line 226
    const-string v1, "org.bouncycastle.jce.provider.MultiCertStoreSpi"

    .line 227
    .line 228
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    const-string v0, "Alg.Alias.CertStore.X509LDAP"

    .line 232
    .line 233
    const-string v1, "LDAP"

    .line 234
    .line 235
    invoke-virtual {p0, v0, v1}, Ljava/util/Dictionary;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    return-void
.end method


# virtual methods
.method public final getService(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Provider$Service;
    .locals 3

    .line 1
    invoke-static {p2}, LOh/i;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, "."

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, LTg/a;->a:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/security/Provider$Service;

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    monitor-enter p0

    .line 36
    :try_start_0
    iget-object v1, p0, LTg/a;->a:Ljava/util/Map;

    .line 37
    .line 38
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    new-instance v1, LTg/a$b;

    .line 45
    .line 46
    invoke-direct {v1, p0, p1, p2, v0}, LTg/a$b;-><init>(LTg/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    check-cast p1, Ljava/security/Provider$Service;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_2

    .line 58
    :cond_0
    iget-object p1, p0, LTg/a;->a:Ljava/util/Map;

    .line 59
    .line 60
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    goto :goto_0

    .line 65
    :goto_1
    monitor-exit p0

    .line 66
    return-object p1

    .line 67
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p1

    .line 69
    :cond_1
    return-object v1
.end method

.method public h(Lzg/t;LRg/a;)V
    .locals 1

    .line 1
    sget-object v0, LTg/a;->e:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw p1
.end method
