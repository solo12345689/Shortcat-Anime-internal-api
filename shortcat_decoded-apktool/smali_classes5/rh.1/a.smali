.class public abstract Lrh/a;
.super Ljava/lang/Object;


# direct methods
.method private static a([B)[S
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    div-int/lit8 v0, v0, 0x2

    .line 3
    .line 4
    new-array v1, v0, [S

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-eq v2, v0, :cond_0

    .line 8
    .line 9
    mul-int/lit8 v3, v2, 0x2

    .line 10
    .line 11
    invoke-static {p0, v3}, LOh/g;->g([BI)S

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    aput-short v3, v1, v2

    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v1
.end method

.method public static b(LCg/b;)LKg/a;
    .locals 21

    .line 1
    if-eqz p0, :cond_30

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LCg/b;->r()LDg/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LDg/a;->l()Lzg/t;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, LVg/g;->W:Lzg/t;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, LLh/a;

    .line 28
    .line 29
    invoke-static {v0}, Lrh/e;->F(LDg/a;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v2, v0, v1}, LLh/a;-><init>(I[B)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_0
    sget-object v2, LVg/g;->r:Lzg/t;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    new-instance v1, Lph/b;

    .line 50
    .line 51
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Lzg/u;->B()[B

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v0}, LDg/a;->p()Lzg/e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, LVg/h;->l(Ljava/lang/Object;)LVg/h;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lrh/e;->S(LVg/h;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {v1, v2, v0}, Lph/b;-><init>([BLjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_1
    sget-object v2, LVg/g;->v:Lzg/t;

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    new-instance v0, Lhh/a;

    .line 88
    .line 89
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1}, Lrh/a;->a([B)[S

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-direct {v0, v1}, Lhh/a;-><init>([S)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_2
    sget-object v2, LCg/a;->R0:Lzg/t;

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    const/16 v3, 0x40

    .line 116
    .line 117
    const/4 v4, 0x4

    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    invoke-virtual/range {p0 .. p0}, LCg/b;->p()Lzg/u;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0, v3}, Lrh/a;->c(Lzg/u;I)Lzg/u;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_3

    .line 137
    .line 138
    invoke-virtual {v1}, Lzg/b;->D()[B

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    array-length v2, v0

    .line 143
    invoke-static {v0, v4, v2}, LOh/a;->m([BII)[B

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0, v1}, Ldh/c;->d([B[B)Ldh/c;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0

    .line 152
    :cond_3
    array-length v1, v0

    .line 153
    invoke-static {v0, v4, v1}, LOh/a;->m([BII)[B

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, Ldh/c;->c(Ljava/lang/Object;)Ldh/c;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    :cond_4
    sget-object v2, LAg/a;->a0:Lzg/t;

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-nez v2, :cond_2e

    .line 169
    .line 170
    sget-object v2, LAg/a;->L0:Lzg/t;

    .line 171
    .line 172
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_5

    .line 177
    .line 178
    goto/16 :goto_7

    .line 179
    .line 180
    :cond_5
    sget-object v2, Lrh/e;->Q:Ljava/util/Map;

    .line 181
    .line 182
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_6

    .line 187
    .line 188
    invoke-static {v1}, Lrh/e;->M(Lzg/t;)Lnh/e;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual/range {p0 .. p0}, LCg/b;->p()Lzg/u;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v0}, Lnh/e;->a()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    mul-int/2addr v2, v4

    .line 201
    invoke-static {v1, v2}, Lrh/a;->c(Lzg/u;I)Lzg/u;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    new-instance v2, Lnh/f;

    .line 206
    .line 207
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-direct {v2, v0, v1}, Lnh/f;-><init>(Lnh/e;[B)V

    .line 212
    .line 213
    .line 214
    return-object v2

    .line 215
    :cond_6
    sget-object v2, LAg/a;->o1:Lzg/t;

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_7

    .line 222
    .line 223
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v1}, Lrh/e;->D(Lzg/t;)Lkh/b;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    new-instance v2, Lkh/c;

    .line 240
    .line 241
    invoke-direct {v2, v1, v0}, Lkh/c;-><init>(Lkh/b;[B)V

    .line 242
    .line 243
    .line 244
    return-object v2

    .line 245
    :cond_7
    sget-object v2, LAg/a;->C2:Lzg/t;

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_8

    .line 252
    .line 253
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v0}, LVg/a;->s(Ljava/lang/Object;)LVg/a;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v1}, Lrh/e;->r(Lzg/t;)LYg/f;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    new-instance v2, LYg/g;

    .line 266
    .line 267
    invoke-virtual {v0}, LVg/a;->p()[B

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {v0}, LVg/a;->n()[B

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-virtual {v0}, LVg/a;->r()[B

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-virtual {v0}, LVg/a;->l()[B

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-virtual {v0}, LVg/a;->t()[B

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    invoke-direct/range {v2 .. v8}, LYg/g;-><init>(LYg/f;[B[B[B[B[B)V

    .line 288
    .line 289
    .line 290
    return-object v2

    .line 291
    :cond_8
    sget-object v2, LAg/a;->N2:Lzg/t;

    .line 292
    .line 293
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-eqz v2, :cond_9

    .line 298
    .line 299
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v1}, Lrh/e;->h(Lzg/t;)Lbh/d;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    new-instance v2, Lbh/e;

    .line 316
    .line 317
    invoke-direct {v2, v1, v0}, Lbh/e;-><init>(Lbh/d;[B)V

    .line 318
    .line 319
    .line 320
    return-object v2

    .line 321
    :cond_9
    sget-object v2, LAg/a;->U2:Lzg/t;

    .line 322
    .line 323
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_a

    .line 328
    .line 329
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-static {v1}, Lrh/e;->K(Lzg/t;)Lmh/d;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    new-instance v2, Lmh/e;

    .line 346
    .line 347
    invoke-direct {v2, v1, v0}, Lmh/e;-><init>(Lmh/d;[B)V

    .line 348
    .line 349
    .line 350
    return-object v2

    .line 351
    :cond_a
    sget-object v2, LAg/a;->w3:Lzg/t;

    .line 352
    .line 353
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-eqz v2, :cond_b

    .line 358
    .line 359
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-static {v1}, Lrh/e;->x(Lzg/t;)Lih/b;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    new-instance v2, Lih/c;

    .line 376
    .line 377
    invoke-direct {v2, v1, v0}, Lih/c;-><init>(Lih/b;[B)V

    .line 378
    .line 379
    .line 380
    return-object v2

    .line 381
    :cond_b
    sget-object v2, LBg/a;->X0:Lzg/t;

    .line 382
    .line 383
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    const-string v5, "invalid "

    .line 388
    .line 389
    const-string v6, "inconsistent "

    .line 390
    .line 391
    const/4 v7, 0x0

    .line 392
    const-string v8, " private key"

    .line 393
    .line 394
    const/4 v9, 0x1

    .line 395
    const/4 v10, 0x0

    .line 396
    if-nez v2, :cond_29

    .line 397
    .line 398
    sget-object v2, LBg/a;->Y0:Lzg/t;

    .line 399
    .line 400
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    if-nez v2, :cond_29

    .line 405
    .line 406
    sget-object v2, LBg/a;->Z0:Lzg/t;

    .line 407
    .line 408
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-eqz v2, :cond_c

    .line 413
    .line 414
    goto/16 :goto_6

    .line 415
    .line 416
    :cond_c
    sget-object v2, LAg/a;->L3:Lzg/t;

    .line 417
    .line 418
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    const/4 v3, 0x3

    .line 423
    const/4 v11, 0x2

    .line 424
    if-eqz v2, :cond_d

    .line 425
    .line 426
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-static {v0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-static {v1}, Lrh/e;->z(Lzg/t;)Ljh/b;

    .line 435
    .line 436
    .line 437
    move-result-object v13

    .line 438
    new-instance v12, Ljh/c;

    .line 439
    .line 440
    invoke-virtual {v0, v10}, Lzg/B;->B(I)Lzg/e;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 449
    .line 450
    .line 451
    move-result-object v14

    .line 452
    invoke-virtual {v0, v9}, Lzg/B;->B(I)Lzg/e;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 461
    .line 462
    .line 463
    move-result-object v15

    .line 464
    invoke-virtual {v0, v11}, Lzg/B;->B(I)Lzg/e;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 473
    .line 474
    .line 475
    move-result-object v16

    .line 476
    invoke-virtual {v0, v3}, Lzg/B;->B(I)Lzg/e;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 485
    .line 486
    .line 487
    move-result-object v17

    .line 488
    invoke-direct/range {v12 .. v17}, Ljh/c;-><init>(Ljh/b;[B[B[B[B)V

    .line 489
    .line 490
    .line 491
    return-object v12

    .line 492
    :cond_d
    sget-object v2, LAg/a;->S3:Lzg/t;

    .line 493
    .line 494
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-eqz v2, :cond_e

    .line 499
    .line 500
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-static {v0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-static {v1}, Lrh/e;->Q(Lzg/t;)Ljh/f;

    .line 509
    .line 510
    .line 511
    move-result-object v13

    .line 512
    new-instance v12, Ljh/g;

    .line 513
    .line 514
    invoke-virtual {v0, v10}, Lzg/B;->B(I)Lzg/e;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 523
    .line 524
    .line 525
    move-result-object v14

    .line 526
    invoke-virtual {v0, v9}, Lzg/B;->B(I)Lzg/e;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 535
    .line 536
    .line 537
    move-result-object v15

    .line 538
    invoke-virtual {v0, v11}, Lzg/B;->B(I)Lzg/e;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 547
    .line 548
    .line 549
    move-result-object v16

    .line 550
    invoke-virtual {v0, v3}, Lzg/B;->B(I)Lzg/e;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    invoke-static {v1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    invoke-virtual {v1}, Lzg/u;->B()[B

    .line 559
    .line 560
    .line 561
    move-result-object v17

    .line 562
    invoke-virtual {v0, v4}, Lzg/B;->B(I)Lzg/e;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 571
    .line 572
    .line 573
    move-result-object v18

    .line 574
    invoke-direct/range {v12 .. v18}, Ljh/g;-><init>(Ljh/f;[B[B[B[B[B)V

    .line 575
    .line 576
    .line 577
    return-object v12

    .line 578
    :cond_e
    sget-object v2, Lrh/e;->O:Ljava/util/Map;

    .line 579
    .line 580
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    if-eqz v2, :cond_13

    .line 585
    .line 586
    invoke-virtual/range {p0 .. p0}, LCg/b;->p()Lzg/u;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    const/16 v2, 0x20

    .line 591
    .line 592
    invoke-static {v0, v2}, Lrh/a;->d(Lzg/u;I)Lzg/y;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-static {v1}, Lrh/e;->t(Lzg/t;)Lfh/c;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    if-eqz v2, :cond_f

    .line 605
    .line 606
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-static {v1, v2}, Lrh/c$i;->b(Lfh/c;Lzg/b;)Lfh/e;

    .line 611
    .line 612
    .line 613
    move-result-object v7

    .line 614
    :cond_f
    instance-of v2, v0, Lzg/u;

    .line 615
    .line 616
    if-eqz v2, :cond_10

    .line 617
    .line 618
    new-instance v2, Lfh/d;

    .line 619
    .line 620
    check-cast v0, Lzg/u;

    .line 621
    .line 622
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-direct {v2, v1, v0, v7}, Lfh/d;-><init>(Lfh/c;[BLfh/e;)V

    .line 627
    .line 628
    .line 629
    return-object v2

    .line 630
    :cond_10
    instance-of v2, v0, Lzg/B;

    .line 631
    .line 632
    if-eqz v2, :cond_12

    .line 633
    .line 634
    check-cast v0, Lzg/B;

    .line 635
    .line 636
    invoke-virtual {v0, v10}, Lzg/B;->B(I)Lzg/e;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    invoke-static {v2}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    invoke-virtual {v2}, Lzg/u;->B()[B

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    invoke-virtual {v0, v9}, Lzg/B;->B(I)Lzg/e;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    new-instance v3, Lfh/d;

    .line 661
    .line 662
    invoke-direct {v3, v1, v2, v7}, Lfh/d;-><init>(Lfh/c;[BLfh/e;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v3}, Lfh/d;->getEncoded()[B

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    invoke-static {v2, v0}, LOh/a;->k([B[B)Z

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    if-eqz v0, :cond_11

    .line 674
    .line 675
    return-object v3

    .line 676
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 677
    .line 678
    new-instance v2, Ljava/lang/StringBuilder;

    .line 679
    .line 680
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v1}, Lfh/c;->b()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    throw v0

    .line 704
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 705
    .line 706
    new-instance v2, Ljava/lang/StringBuilder;

    .line 707
    .line 708
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v1}, Lfh/c;->b()Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    throw v0

    .line 732
    :cond_13
    sget-object v2, LAg/a;->S1:Lzg/t;

    .line 733
    .line 734
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    if-nez v2, :cond_23

    .line 739
    .line 740
    sget-object v2, LAg/a;->T1:Lzg/t;

    .line 741
    .line 742
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    if-nez v2, :cond_23

    .line 747
    .line 748
    sget-object v2, LAg/a;->U1:Lzg/t;

    .line 749
    .line 750
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    if-eqz v2, :cond_14

    .line 755
    .line 756
    goto/16 :goto_5

    .line 757
    .line 758
    :cond_14
    sget-object v2, LAg/a;->H1:Lzg/t;

    .line 759
    .line 760
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    if-nez v2, :cond_22

    .line 765
    .line 766
    sget-object v2, LAg/a;->K1:Lzg/t;

    .line 767
    .line 768
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    if-eqz v2, :cond_15

    .line 773
    .line 774
    goto/16 :goto_4

    .line 775
    .line 776
    :cond_15
    sget-object v2, LAg/a;->Z3:Lzg/t;

    .line 777
    .line 778
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    if-eqz v2, :cond_16

    .line 783
    .line 784
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    invoke-static {v1}, Lrh/e;->b(Lzg/t;)LXg/c;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    invoke-virtual {v1}, LXg/c;->b()I

    .line 801
    .line 802
    .line 803
    move-result v2

    .line 804
    invoke-static {v0, v10, v2}, LOh/a;->m([BII)[B

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    invoke-virtual {v1}, LXg/c;->b()I

    .line 809
    .line 810
    .line 811
    move-result v3

    .line 812
    invoke-virtual {v1}, LXg/c;->b()I

    .line 813
    .line 814
    .line 815
    move-result v4

    .line 816
    mul-int/2addr v4, v11

    .line 817
    invoke-static {v0, v3, v4}, LOh/a;->m([BII)[B

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    invoke-virtual {v1}, LXg/c;->b()I

    .line 822
    .line 823
    .line 824
    move-result v4

    .line 825
    mul-int/2addr v4, v11

    .line 826
    array-length v5, v0

    .line 827
    invoke-static {v0, v4, v5}, LOh/a;->m([BII)[B

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    new-instance v4, LXg/d;

    .line 832
    .line 833
    invoke-direct {v4, v1, v2, v3, v0}, LXg/d;-><init>(LXg/c;[B[B[B)V

    .line 834
    .line 835
    .line 836
    return-object v4

    .line 837
    :cond_16
    sget-object v2, LAg/a;->d4:Lzg/t;

    .line 838
    .line 839
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    if-eqz v2, :cond_17

    .line 844
    .line 845
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-static {v1}, Lrh/e;->m(Lzg/t;)Lch/d;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    new-instance v2, Lch/e;

    .line 862
    .line 863
    invoke-direct {v2, v1, v0}, Lch/e;-><init>(Lch/d;[B)V

    .line 864
    .line 865
    .line 866
    return-object v2

    .line 867
    :cond_17
    sget-object v2, LAg/a;->p2:Lzg/t;

    .line 868
    .line 869
    invoke-virtual {v1, v2}, Lzg/t;->K(Lzg/t;)Z

    .line 870
    .line 871
    .line 872
    move-result v2

    .line 873
    if-eqz v2, :cond_18

    .line 874
    .line 875
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-static {v1}, Lrh/e;->H(Lzg/t;)Llh/f;

    .line 888
    .line 889
    .line 890
    move-result-object v1

    .line 891
    new-instance v2, Llh/g;

    .line 892
    .line 893
    invoke-direct {v2, v1, v0}, Llh/g;-><init>(Llh/f;[B)V

    .line 894
    .line 895
    .line 896
    return-object v2

    .line 897
    :cond_18
    sget-object v2, LVg/g;->w:Lzg/t;

    .line 898
    .line 899
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 900
    .line 901
    .line 902
    move-result v2

    .line 903
    const-string v3, "ClassNotFoundException processing BDS state: "

    .line 904
    .line 905
    if-eqz v2, :cond_1b

    .line 906
    .line 907
    invoke-virtual {v0}, LDg/a;->p()Lzg/e;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    invoke-static {v0}, LVg/k;->n(Ljava/lang/Object;)LVg/k;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-virtual {v0}, LVg/k;->p()LDg/a;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    invoke-virtual {v1}, LDg/a;->l()Lzg/t;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-static {v2}, LVg/o;->p(Ljava/lang/Object;)LVg/o;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    :try_start_0
    new-instance v4, Lsh/y$b;

    .line 932
    .line 933
    new-instance v5, Lsh/x;

    .line 934
    .line 935
    invoke-virtual {v0}, LVg/k;->l()I

    .line 936
    .line 937
    .line 938
    move-result v0

    .line 939
    invoke-static {v1}, Lrh/e;->j(Lzg/t;)LFg/j;

    .line 940
    .line 941
    .line 942
    move-result-object v6

    .line 943
    invoke-direct {v5, v0, v6}, Lsh/x;-><init>(ILFg/j;)V

    .line 944
    .line 945
    .line 946
    invoke-direct {v4, v5}, Lsh/y$b;-><init>(Lsh/x;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v2}, LVg/o;->n()I

    .line 950
    .line 951
    .line 952
    move-result v0

    .line 953
    invoke-virtual {v4, v0}, Lsh/y$b;->l(I)Lsh/y$b;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    invoke-virtual {v2}, LVg/o;->v()[B

    .line 958
    .line 959
    .line 960
    move-result-object v4

    .line 961
    invoke-virtual {v0, v4}, Lsh/y$b;->q([B)Lsh/y$b;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-virtual {v2}, LVg/o;->u()[B

    .line 966
    .line 967
    .line 968
    move-result-object v4

    .line 969
    invoke-virtual {v0, v4}, Lsh/y$b;->p([B)Lsh/y$b;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    invoke-virtual {v2}, LVg/o;->s()[B

    .line 974
    .line 975
    .line 976
    move-result-object v4

    .line 977
    invoke-virtual {v0, v4}, Lsh/y$b;->n([B)Lsh/y$b;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    invoke-virtual {v2}, LVg/o;->t()[B

    .line 982
    .line 983
    .line 984
    move-result-object v4

    .line 985
    invoke-virtual {v0, v4}, Lsh/y$b;->o([B)Lsh/y$b;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-virtual {v2}, LVg/o;->w()I

    .line 990
    .line 991
    .line 992
    move-result v4

    .line 993
    if-eqz v4, :cond_19

    .line 994
    .line 995
    invoke-virtual {v2}, LVg/o;->r()I

    .line 996
    .line 997
    .line 998
    move-result v4

    .line 999
    invoke-virtual {v0, v4}, Lsh/y$b;->m(I)Lsh/y$b;

    .line 1000
    .line 1001
    .line 1002
    goto :goto_0

    .line 1003
    :catch_0
    move-exception v0

    .line 1004
    goto :goto_1

    .line 1005
    :cond_19
    :goto_0
    invoke-virtual {v2}, LVg/o;->l()[B

    .line 1006
    .line 1007
    .line 1008
    move-result-object v4

    .line 1009
    if-eqz v4, :cond_1a

    .line 1010
    .line 1011
    invoke-virtual {v2}, LVg/o;->l()[B

    .line 1012
    .line 1013
    .line 1014
    move-result-object v2

    .line 1015
    const-class v4, Lsh/a;

    .line 1016
    .line 1017
    invoke-static {v2, v4}, Lsh/A;->f([BLjava/lang/Class;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    check-cast v2, Lsh/a;

    .line 1022
    .line 1023
    invoke-virtual {v2, v1}, Lsh/a;->h(Lzg/t;)Lsh/a;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    invoke-virtual {v0, v1}, Lsh/y$b;->k(Lsh/a;)Lsh/y$b;

    .line 1028
    .line 1029
    .line 1030
    :cond_1a
    invoke-virtual {v0}, Lsh/y$b;->j()Lsh/y;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1034
    return-object v0

    .line 1035
    :goto_1
    new-instance v1, Ljava/io/IOException;

    .line 1036
    .line 1037
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1038
    .line 1039
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    throw v1

    .line 1060
    :cond_1b
    sget-object v2, LVg/g;->F:Lzg/t;

    .line 1061
    .line 1062
    invoke-virtual {v1, v2}, Lzg/y;->u(Lzg/y;)Z

    .line 1063
    .line 1064
    .line 1065
    move-result v2

    .line 1066
    if-eqz v2, :cond_1e

    .line 1067
    .line 1068
    invoke-virtual {v0}, LDg/a;->p()Lzg/e;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    invoke-static {v0}, LVg/l;->n(Ljava/lang/Object;)LVg/l;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    invoke-virtual {v0}, LVg/l;->r()LDg/a;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v1

    .line 1080
    invoke-virtual {v1}, LDg/a;->l()Lzg/t;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    :try_start_1
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v2

    .line 1088
    invoke-static {v2}, LVg/m;->p(Ljava/lang/Object;)LVg/m;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v2

    .line 1092
    new-instance v4, Lsh/s$b;

    .line 1093
    .line 1094
    new-instance v5, Lsh/r;

    .line 1095
    .line 1096
    invoke-virtual {v0}, LVg/l;->l()I

    .line 1097
    .line 1098
    .line 1099
    move-result v6

    .line 1100
    invoke-virtual {v0}, LVg/l;->p()I

    .line 1101
    .line 1102
    .line 1103
    move-result v0

    .line 1104
    invoke-static {v1}, Lrh/e;->j(Lzg/t;)LFg/j;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v7

    .line 1108
    invoke-direct {v5, v6, v0, v7}, Lsh/r;-><init>(IILFg/j;)V

    .line 1109
    .line 1110
    .line 1111
    invoke-direct {v4, v5}, Lsh/s$b;-><init>(Lsh/r;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v2}, LVg/m;->n()J

    .line 1115
    .line 1116
    .line 1117
    move-result-wide v5

    .line 1118
    invoke-virtual {v4, v5, v6}, Lsh/s$b;->m(J)Lsh/s$b;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    invoke-virtual {v2}, LVg/m;->v()[B

    .line 1123
    .line 1124
    .line 1125
    move-result-object v4

    .line 1126
    invoke-virtual {v0, v4}, Lsh/s$b;->r([B)Lsh/s$b;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    invoke-virtual {v2}, LVg/m;->u()[B

    .line 1131
    .line 1132
    .line 1133
    move-result-object v4

    .line 1134
    invoke-virtual {v0, v4}, Lsh/s$b;->q([B)Lsh/s$b;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v0

    .line 1138
    invoke-virtual {v2}, LVg/m;->s()[B

    .line 1139
    .line 1140
    .line 1141
    move-result-object v4

    .line 1142
    invoke-virtual {v0, v4}, Lsh/s$b;->o([B)Lsh/s$b;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    invoke-virtual {v2}, LVg/m;->t()[B

    .line 1147
    .line 1148
    .line 1149
    move-result-object v4

    .line 1150
    invoke-virtual {v0, v4}, Lsh/s$b;->p([B)Lsh/s$b;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    invoke-virtual {v2}, LVg/m;->w()I

    .line 1155
    .line 1156
    .line 1157
    move-result v4

    .line 1158
    if-eqz v4, :cond_1c

    .line 1159
    .line 1160
    invoke-virtual {v2}, LVg/m;->r()J

    .line 1161
    .line 1162
    .line 1163
    move-result-wide v4

    .line 1164
    invoke-virtual {v0, v4, v5}, Lsh/s$b;->n(J)Lsh/s$b;

    .line 1165
    .line 1166
    .line 1167
    goto :goto_2

    .line 1168
    :catch_1
    move-exception v0

    .line 1169
    goto :goto_3

    .line 1170
    :cond_1c
    :goto_2
    invoke-virtual {v2}, LVg/m;->l()[B

    .line 1171
    .line 1172
    .line 1173
    move-result-object v4

    .line 1174
    if-eqz v4, :cond_1d

    .line 1175
    .line 1176
    invoke-virtual {v2}, LVg/m;->l()[B

    .line 1177
    .line 1178
    .line 1179
    move-result-object v2

    .line 1180
    const-class v4, Lsh/b;

    .line 1181
    .line 1182
    invoke-static {v2, v4}, Lsh/A;->f([BLjava/lang/Class;)Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    check-cast v2, Lsh/b;

    .line 1187
    .line 1188
    invoke-virtual {v2, v1}, Lsh/b;->f(Lzg/t;)Lsh/b;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v1

    .line 1192
    invoke-virtual {v0, v1}, Lsh/s$b;->l(Lsh/b;)Lsh/s$b;

    .line 1193
    .line 1194
    .line 1195
    :cond_1d
    invoke-virtual {v0}, Lsh/s$b;->k()Lsh/s;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1199
    return-object v0

    .line 1200
    :goto_3
    new-instance v1, Ljava/io/IOException;

    .line 1201
    .line 1202
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1203
    .line 1204
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    throw v1

    .line 1225
    :cond_1e
    sget-object v0, LVg/g;->n:Lzg/t;

    .line 1226
    .line 1227
    invoke-virtual {v1, v0}, Lzg/y;->u(Lzg/y;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    if-eqz v0, :cond_1f

    .line 1232
    .line 1233
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    invoke-static {v0}, LVg/e;->r(Ljava/lang/Object;)LVg/e;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    new-instance v1, LKh/b;

    .line 1242
    .line 1243
    invoke-virtual {v0}, LVg/e;->t()I

    .line 1244
    .line 1245
    .line 1246
    move-result v2

    .line 1247
    invoke-virtual {v0}, LVg/e;->s()I

    .line 1248
    .line 1249
    .line 1250
    move-result v3

    .line 1251
    invoke-virtual {v0}, LVg/e;->n()LMh/b;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v4

    .line 1255
    invoke-virtual {v0}, LVg/e;->p()LMh/i;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v5

    .line 1259
    invoke-virtual {v0}, LVg/e;->u()LMh/h;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v6

    .line 1263
    invoke-virtual {v0}, LVg/e;->l()LDg/a;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    invoke-virtual {v0}, LDg/a;->l()Lzg/t;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v0

    .line 1271
    invoke-static {v0}, Lrh/e;->k(Lzg/t;)Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v7

    .line 1275
    invoke-direct/range {v1 .. v7}, LKh/b;-><init>(IILMh/b;LMh/i;LMh/h;Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    return-object v1

    .line 1279
    :cond_1f
    sget-object v0, LAg/a;->h4:Lzg/t;

    .line 1280
    .line 1281
    invoke-virtual {v1, v0}, Lzg/t;->K(Lzg/t;)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v0

    .line 1285
    if-eqz v0, :cond_20

    .line 1286
    .line 1287
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    invoke-static {v1}, Lrh/e;->p(Lzg/t;)Leh/b;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v1

    .line 1303
    new-instance v2, Leh/c;

    .line 1304
    .line 1305
    invoke-direct {v2, v1, v0}, Leh/c;-><init>(Leh/b;[B)V

    .line 1306
    .line 1307
    .line 1308
    return-object v2

    .line 1309
    :cond_20
    sget-object v0, LAg/a;->u4:Lzg/t;

    .line 1310
    .line 1311
    invoke-virtual {v1, v0}, Lzg/t;->K(Lzg/t;)Z

    .line 1312
    .line 1313
    .line 1314
    move-result v0

    .line 1315
    if-eqz v0, :cond_21

    .line 1316
    .line 1317
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    invoke-static {v1}, Lrh/e;->O(Lzg/t;)Loh/a;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v1

    .line 1333
    new-instance v2, Loh/b;

    .line 1334
    .line 1335
    invoke-direct {v2, v1, v0}, Loh/b;-><init>(Loh/a;[B)V

    .line 1336
    .line 1337
    .line 1338
    return-object v2

    .line 1339
    :cond_21
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1340
    .line 1341
    const-string v1, "algorithm identifier in private key not recognised"

    .line 1342
    .line 1343
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1344
    .line 1345
    .line 1346
    throw v0

    .line 1347
    :cond_22
    :goto_4
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    invoke-static {v0}, LVg/c;->p(Ljava/lang/Object;)LVg/c;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    invoke-static {v1}, Lrh/e;->f(Lzg/t;)Lah/b;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v3

    .line 1359
    new-instance v2, Lah/c;

    .line 1360
    .line 1361
    invoke-virtual {v0}, LVg/c;->s()[B

    .line 1362
    .line 1363
    .line 1364
    move-result-object v4

    .line 1365
    invoke-virtual {v0}, LVg/c;->n()[B

    .line 1366
    .line 1367
    .line 1368
    move-result-object v5

    .line 1369
    invoke-virtual {v0}, LVg/c;->l()[B

    .line 1370
    .line 1371
    .line 1372
    move-result-object v6

    .line 1373
    invoke-virtual {v0}, LVg/c;->r()LVg/d;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v0

    .line 1377
    invoke-virtual {v0}, LVg/d;->l()[B

    .line 1378
    .line 1379
    .line 1380
    move-result-object v7

    .line 1381
    invoke-direct/range {v2 .. v7}, Lah/c;-><init>(Lah/b;[B[B[B[B)V

    .line 1382
    .line 1383
    .line 1384
    return-object v2

    .line 1385
    :cond_23
    :goto_5
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v0

    .line 1389
    invoke-static {v1}, Lrh/e;->d(Lzg/t;)LZg/c;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v13

    .line 1393
    instance-of v1, v0, Lzg/B;

    .line 1394
    .line 1395
    if-eqz v1, :cond_26

    .line 1396
    .line 1397
    invoke-static {v0}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    invoke-virtual {v0, v10}, Lzg/B;->B(I)Lzg/e;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v1

    .line 1405
    invoke-static {v1}, Lzg/o;->z(Ljava/lang/Object;)Lzg/o;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v1

    .line 1409
    invoke-virtual {v1}, Lzg/o;->G()I

    .line 1410
    .line 1411
    .line 1412
    move-result v1

    .line 1413
    if-nez v1, :cond_25

    .line 1414
    .line 1415
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    const/4 v2, 0x6

    .line 1420
    const/4 v5, 0x5

    .line 1421
    if-eqz v1, :cond_24

    .line 1422
    .line 1423
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v1

    .line 1427
    invoke-static {v13, v1}, Lrh/c$d;->b(LZg/c;Lzg/b;)LZg/e;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v1

    .line 1431
    new-instance v12, LZg/d;

    .line 1432
    .line 1433
    invoke-virtual {v0, v9}, Lzg/B;->B(I)Lzg/e;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v6

    .line 1437
    invoke-static {v6}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v6

    .line 1441
    invoke-virtual {v6}, Lzg/b;->D()[B

    .line 1442
    .line 1443
    .line 1444
    move-result-object v14

    .line 1445
    invoke-virtual {v0, v11}, Lzg/B;->B(I)Lzg/e;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v6

    .line 1449
    invoke-static {v6}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v6

    .line 1453
    invoke-virtual {v6}, Lzg/b;->D()[B

    .line 1454
    .line 1455
    .line 1456
    move-result-object v15

    .line 1457
    invoke-virtual {v0, v3}, Lzg/B;->B(I)Lzg/e;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v3

    .line 1461
    invoke-static {v3}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v3

    .line 1465
    invoke-virtual {v3}, Lzg/b;->D()[B

    .line 1466
    .line 1467
    .line 1468
    move-result-object v16

    .line 1469
    invoke-virtual {v0, v4}, Lzg/B;->B(I)Lzg/e;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v3

    .line 1473
    invoke-static {v3}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v3

    .line 1477
    invoke-virtual {v3}, Lzg/b;->D()[B

    .line 1478
    .line 1479
    .line 1480
    move-result-object v17

    .line 1481
    invoke-virtual {v0, v5}, Lzg/B;->B(I)Lzg/e;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v3

    .line 1485
    invoke-static {v3}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v3

    .line 1489
    invoke-virtual {v3}, Lzg/b;->D()[B

    .line 1490
    .line 1491
    .line 1492
    move-result-object v18

    .line 1493
    invoke-virtual {v0, v2}, Lzg/B;->B(I)Lzg/e;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    invoke-static {v0}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v0

    .line 1501
    invoke-virtual {v0}, Lzg/b;->D()[B

    .line 1502
    .line 1503
    .line 1504
    move-result-object v19

    .line 1505
    invoke-virtual {v1}, LZg/e;->d()[B

    .line 1506
    .line 1507
    .line 1508
    move-result-object v20

    .line 1509
    invoke-direct/range {v12 .. v20}, LZg/d;-><init>(LZg/c;[B[B[B[B[B[B[B)V

    .line 1510
    .line 1511
    .line 1512
    return-object v12

    .line 1513
    :cond_24
    new-instance v12, LZg/d;

    .line 1514
    .line 1515
    invoke-virtual {v0, v9}, Lzg/B;->B(I)Lzg/e;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v1

    .line 1519
    invoke-static {v1}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v1

    .line 1523
    invoke-virtual {v1}, Lzg/b;->D()[B

    .line 1524
    .line 1525
    .line 1526
    move-result-object v14

    .line 1527
    invoke-virtual {v0, v11}, Lzg/B;->B(I)Lzg/e;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v1

    .line 1531
    invoke-static {v1}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v1

    .line 1535
    invoke-virtual {v1}, Lzg/b;->D()[B

    .line 1536
    .line 1537
    .line 1538
    move-result-object v15

    .line 1539
    invoke-virtual {v0, v3}, Lzg/B;->B(I)Lzg/e;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v1

    .line 1543
    invoke-static {v1}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v1

    .line 1547
    invoke-virtual {v1}, Lzg/b;->D()[B

    .line 1548
    .line 1549
    .line 1550
    move-result-object v16

    .line 1551
    invoke-virtual {v0, v4}, Lzg/B;->B(I)Lzg/e;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v1

    .line 1555
    invoke-static {v1}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v1

    .line 1559
    invoke-virtual {v1}, Lzg/b;->D()[B

    .line 1560
    .line 1561
    .line 1562
    move-result-object v17

    .line 1563
    invoke-virtual {v0, v5}, Lzg/B;->B(I)Lzg/e;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v1

    .line 1567
    invoke-static {v1}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v1

    .line 1571
    invoke-virtual {v1}, Lzg/b;->D()[B

    .line 1572
    .line 1573
    .line 1574
    move-result-object v18

    .line 1575
    invoke-virtual {v0, v2}, Lzg/B;->B(I)Lzg/e;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v0

    .line 1579
    invoke-static {v0}, Lzg/b;->A(Ljava/lang/Object;)Lzg/b;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    invoke-virtual {v0}, Lzg/b;->D()[B

    .line 1584
    .line 1585
    .line 1586
    move-result-object v19

    .line 1587
    const/16 v20, 0x0

    .line 1588
    .line 1589
    invoke-direct/range {v12 .. v20}, LZg/d;-><init>(LZg/c;[B[B[B[B[B[B[B)V

    .line 1590
    .line 1591
    .line 1592
    return-object v12

    .line 1593
    :cond_25
    new-instance v0, Ljava/io/IOException;

    .line 1594
    .line 1595
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1596
    .line 1597
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1598
    .line 1599
    .line 1600
    const-string v3, "unknown private key version: "

    .line 1601
    .line 1602
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1606
    .line 1607
    .line 1608
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v1

    .line 1612
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1613
    .line 1614
    .line 1615
    throw v0

    .line 1616
    :cond_26
    instance-of v1, v0, Lzg/n0;

    .line 1617
    .line 1618
    if-eqz v1, :cond_28

    .line 1619
    .line 1620
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v1

    .line 1632
    if-eqz v1, :cond_27

    .line 1633
    .line 1634
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v1

    .line 1638
    invoke-static {v13, v1}, Lrh/c$d;->b(LZg/c;Lzg/b;)LZg/e;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v1

    .line 1642
    new-instance v2, LZg/d;

    .line 1643
    .line 1644
    invoke-direct {v2, v13, v0, v1}, LZg/d;-><init>(LZg/c;[BLZg/e;)V

    .line 1645
    .line 1646
    .line 1647
    return-object v2

    .line 1648
    :cond_27
    new-instance v1, LZg/d;

    .line 1649
    .line 1650
    invoke-direct {v1, v13, v0, v7}, LZg/d;-><init>(LZg/c;[BLZg/e;)V

    .line 1651
    .line 1652
    .line 1653
    return-object v1

    .line 1654
    :cond_28
    new-instance v0, Ljava/io/IOException;

    .line 1655
    .line 1656
    const-string v1, "not supported"

    .line 1657
    .line 1658
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1659
    .line 1660
    .line 1661
    throw v0

    .line 1662
    :cond_29
    :goto_6
    invoke-virtual/range {p0 .. p0}, LCg/b;->p()Lzg/u;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v0

    .line 1666
    invoke-static {v0, v3}, Lrh/a;->d(Lzg/u;I)Lzg/y;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v0

    .line 1670
    invoke-static {v1}, Lrh/e;->v(Lzg/t;)Lgh/e;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v1

    .line 1674
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v2

    .line 1678
    if-eqz v2, :cond_2a

    .line 1679
    .line 1680
    invoke-virtual/range {p0 .. p0}, LCg/b;->s()Lzg/b;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v2

    .line 1684
    invoke-static {v1, v2}, Lrh/c$j;->b(Lgh/e;Lzg/b;)Lgh/g;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v7

    .line 1688
    :cond_2a
    instance-of v2, v0, Lzg/u;

    .line 1689
    .line 1690
    if-eqz v2, :cond_2b

    .line 1691
    .line 1692
    new-instance v2, Lgh/f;

    .line 1693
    .line 1694
    check-cast v0, Lzg/u;

    .line 1695
    .line 1696
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 1697
    .line 1698
    .line 1699
    move-result-object v0

    .line 1700
    invoke-direct {v2, v1, v0, v7}, Lgh/f;-><init>(Lgh/e;[BLgh/g;)V

    .line 1701
    .line 1702
    .line 1703
    return-object v2

    .line 1704
    :cond_2b
    instance-of v2, v0, Lzg/B;

    .line 1705
    .line 1706
    if-eqz v2, :cond_2d

    .line 1707
    .line 1708
    check-cast v0, Lzg/B;

    .line 1709
    .line 1710
    invoke-virtual {v0, v10}, Lzg/B;->B(I)Lzg/e;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v2

    .line 1714
    invoke-static {v2}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v2

    .line 1718
    invoke-virtual {v2}, Lzg/u;->B()[B

    .line 1719
    .line 1720
    .line 1721
    move-result-object v2

    .line 1722
    invoke-virtual {v0, v9}, Lzg/B;->B(I)Lzg/e;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v0

    .line 1726
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v0

    .line 1730
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 1731
    .line 1732
    .line 1733
    move-result-object v0

    .line 1734
    new-instance v3, Lgh/f;

    .line 1735
    .line 1736
    invoke-direct {v3, v1, v2, v7}, Lgh/f;-><init>(Lgh/e;[BLgh/g;)V

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v3}, Lgh/f;->getEncoded()[B

    .line 1740
    .line 1741
    .line 1742
    move-result-object v2

    .line 1743
    invoke-static {v2, v0}, LOh/a;->k([B[B)Z

    .line 1744
    .line 1745
    .line 1746
    move-result v0

    .line 1747
    if-eqz v0, :cond_2c

    .line 1748
    .line 1749
    return-object v3

    .line 1750
    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1751
    .line 1752
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1753
    .line 1754
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1755
    .line 1756
    .line 1757
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1758
    .line 1759
    .line 1760
    invoke-virtual {v1}, Lgh/e;->b()Ljava/lang/String;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v1

    .line 1764
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1765
    .line 1766
    .line 1767
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v1

    .line 1774
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1775
    .line 1776
    .line 1777
    throw v0

    .line 1778
    :cond_2d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1779
    .line 1780
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1781
    .line 1782
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1786
    .line 1787
    .line 1788
    invoke-virtual {v1}, Lgh/e;->b()Ljava/lang/String;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v1

    .line 1792
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1793
    .line 1794
    .line 1795
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v1

    .line 1802
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1803
    .line 1804
    .line 1805
    throw v0

    .line 1806
    :cond_2e
    :goto_7
    invoke-static {v1}, Lrh/e;->U(Lzg/t;)Lqh/e;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v3

    .line 1810
    invoke-virtual/range {p0 .. p0}, LCg/b;->u()Lzg/e;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v0

    .line 1814
    instance-of v1, v0, Lzg/B;

    .line 1815
    .line 1816
    if-eqz v1, :cond_2f

    .line 1817
    .line 1818
    invoke-static {v0}, LVg/i;->l(Ljava/lang/Object;)LVg/i;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v0

    .line 1822
    invoke-virtual {v0}, LVg/i;->n()LVg/j;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v1

    .line 1826
    new-instance v2, Lqh/f;

    .line 1827
    .line 1828
    invoke-virtual {v0}, LVg/i;->r()[B

    .line 1829
    .line 1830
    .line 1831
    move-result-object v4

    .line 1832
    invoke-virtual {v0}, LVg/i;->p()[B

    .line 1833
    .line 1834
    .line 1835
    move-result-object v5

    .line 1836
    invoke-virtual {v1}, LVg/j;->p()[B

    .line 1837
    .line 1838
    .line 1839
    move-result-object v6

    .line 1840
    invoke-virtual {v1}, LVg/j;->n()[B

    .line 1841
    .line 1842
    .line 1843
    move-result-object v7

    .line 1844
    invoke-direct/range {v2 .. v7}, Lqh/f;-><init>(Lqh/e;[B[B[B[B)V

    .line 1845
    .line 1846
    .line 1847
    return-object v2

    .line 1848
    :cond_2f
    new-instance v1, Lqh/f;

    .line 1849
    .line 1850
    invoke-static {v0}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v0

    .line 1854
    invoke-virtual {v0}, Lzg/u;->B()[B

    .line 1855
    .line 1856
    .line 1857
    move-result-object v0

    .line 1858
    invoke-direct {v1, v3, v0}, Lqh/f;-><init>(Lqh/e;[B)V

    .line 1859
    .line 1860
    .line 1861
    return-object v1

    .line 1862
    :cond_30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1863
    .line 1864
    const-string v1, "keyInfo array null"

    .line 1865
    .line 1866
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1867
    .line 1868
    .line 1869
    throw v0
.end method

.method private static c(Lzg/u;I)Lzg/u;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzg/u;->B()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    if-ne v1, p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {v0}, Lrh/e;->B([B)Lzg/u;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-static {p1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    :goto_0
    return-object p0
.end method

.method private static d(Lzg/u;I)Lzg/y;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzg/u;->B()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    if-ne v1, p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {v0}, Lrh/e;->A([B)Lzg/y;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Lzg/u;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {p1}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    instance-of v0, p1, Lzg/B;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-static {p1}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_0
    return-object p0
.end method
