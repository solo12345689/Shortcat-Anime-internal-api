.class public abstract Lrh/d;
.super Ljava/lang/Object;


# direct methods
.method public static a(LKg/a;)LDg/b;
    .locals 6

    .line 1
    instance-of v0, p0, LLh/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LLh/b;

    .line 6
    .line 7
    invoke-virtual {p0}, LLh/b;->c()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Lrh/e;->E(I)LDg/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, LDg/b;

    .line 16
    .line 17
    invoke-virtual {p0}, LLh/b;->b()[B

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v1, v0, p0}, LDg/b;-><init>(LDg/a;[B)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    instance-of v0, p0, Lph/c;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p0, Lph/c;

    .line 30
    .line 31
    new-instance v0, LDg/a;

    .line 32
    .line 33
    sget-object v1, LVg/g;->r:Lzg/t;

    .line 34
    .line 35
    new-instance v2, LVg/h;

    .line 36
    .line 37
    invoke-virtual {p0}, Lph/a;->b()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, Lrh/e;->R(Ljava/lang/String;)LDg/a;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct {v2, v3}, LVg/h;-><init>(LDg/a;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, LDg/a;-><init>(Lzg/t;Lzg/e;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, LDg/b;

    .line 52
    .line 53
    invoke-virtual {p0}, Lph/c;->c()[B

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v1, v0, p0}, LDg/b;-><init>(LDg/a;[B)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_1
    instance-of v0, p0, Lhh/b;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    check-cast p0, Lhh/b;

    .line 66
    .line 67
    new-instance v0, LDg/a;

    .line 68
    .line 69
    sget-object v1, LVg/g;->v:Lzg/t;

    .line 70
    .line 71
    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, LDg/b;

    .line 75
    .line 76
    invoke-virtual {p0}, Lhh/b;->b()[B

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {v1, v0, p0}, LDg/b;-><init>(LDg/a;[B)V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_2
    instance-of v0, p0, Ldh/l;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    check-cast p0, Ldh/l;

    .line 90
    .line 91
    invoke-static {}, Ldh/a;->f()Ldh/a;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0, p0}, Ldh/a;->c(LOh/c;)Ldh/a;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Ldh/a;->b()[B

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    new-instance v0, LDg/a;

    .line 108
    .line 109
    sget-object v1, LCg/a;->R0:Lzg/t;

    .line 110
    .line 111
    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    .line 112
    .line 113
    .line 114
    new-instance v1, LDg/b;

    .line 115
    .line 116
    invoke-direct {v1, v0, p0}, LDg/b;-><init>(LDg/a;[B)V

    .line 117
    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_3
    instance-of v0, p0, Ldh/d;

    .line 121
    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    check-cast p0, Ldh/d;

    .line 125
    .line 126
    invoke-static {}, Ldh/a;->f()Ldh/a;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p0}, Ldh/d;->c()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {p0}, Ldh/d;->d()Ldh/l;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {v0, p0}, Ldh/a;->c(LOh/c;)Ldh/a;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Ldh/a;->b()[B

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    new-instance v0, LDg/a;

    .line 151
    .line 152
    sget-object v1, LCg/a;->R0:Lzg/t;

    .line 153
    .line 154
    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    .line 155
    .line 156
    .line 157
    new-instance v1, LDg/b;

    .line 158
    .line 159
    invoke-direct {v1, v0, p0}, LDg/b;-><init>(LDg/a;[B)V

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_4
    instance-of v0, p0, Lnh/g;

    .line 164
    .line 165
    if-eqz v0, :cond_5

    .line 166
    .line 167
    check-cast p0, Lnh/g;

    .line 168
    .line 169
    invoke-virtual {p0}, Lnh/g;->getEncoded()[B

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    new-instance v1, LDg/a;

    .line 174
    .line 175
    invoke-virtual {p0}, Lnh/d;->b()Lnh/e;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, Lrh/e;->L(Lnh/e;)Lzg/t;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 184
    .line 185
    .line 186
    new-instance p0, LDg/b;

    .line 187
    .line 188
    invoke-direct {p0, v1, v0}, LDg/b;-><init>(LDg/a;[B)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_5
    instance-of v0, p0, Lqh/g;

    .line 193
    .line 194
    if-eqz v0, :cond_6

    .line 195
    .line 196
    check-cast p0, Lqh/g;

    .line 197
    .line 198
    invoke-virtual {p0}, Lqh/g;->getEncoded()[B

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    new-instance v1, LDg/a;

    .line 203
    .line 204
    invoke-virtual {p0}, Lqh/d;->b()Lqh/e;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-static {p0}, Lrh/e;->T(Lqh/e;)Lzg/t;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 213
    .line 214
    .line 215
    new-instance p0, LDg/b;

    .line 216
    .line 217
    invoke-direct {p0, v1, v0}, LDg/b;-><init>(LDg/a;[B)V

    .line 218
    .line 219
    .line 220
    return-object p0

    .line 221
    :cond_6
    instance-of v0, p0, LYg/h;

    .line 222
    .line 223
    if-eqz v0, :cond_7

    .line 224
    .line 225
    check-cast p0, LYg/h;

    .line 226
    .line 227
    invoke-virtual {p0}, LYg/h;->getEncoded()[B

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v1, LDg/a;

    .line 232
    .line 233
    invoke-virtual {p0}, LYg/e;->b()LYg/f;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-static {p0}, Lrh/e;->q(LYg/f;)Lzg/t;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 242
    .line 243
    .line 244
    new-instance p0, LDg/b;

    .line 245
    .line 246
    invoke-direct {p0, v1, v0}, LDg/b;-><init>(LDg/a;[B)V

    .line 247
    .line 248
    .line 249
    return-object p0

    .line 250
    :cond_7
    instance-of v0, p0, Lsh/z;

    .line 251
    .line 252
    if-eqz v0, :cond_9

    .line 253
    .line 254
    check-cast p0, Lsh/z;

    .line 255
    .line 256
    invoke-virtual {p0}, Lsh/z;->d()[B

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {p0}, Lsh/z;->e()[B

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {p0}, Lsh/z;->getEncoded()[B

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    array-length v3, v2

    .line 269
    array-length v4, v0

    .line 270
    array-length v5, v1

    .line 271
    add-int/2addr v4, v5

    .line 272
    if-le v3, v4, :cond_8

    .line 273
    .line 274
    new-instance p0, LDg/a;

    .line 275
    .line 276
    sget-object v0, LLg/a;->a:Lzg/t;

    .line 277
    .line 278
    invoke-direct {p0, v0}, LDg/a;-><init>(Lzg/t;)V

    .line 279
    .line 280
    .line 281
    new-instance v0, LDg/b;

    .line 282
    .line 283
    new-instance v1, Lzg/n0;

    .line 284
    .line 285
    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    .line 286
    .line 287
    .line 288
    invoke-direct {v0, p0, v1}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 289
    .line 290
    .line 291
    return-object v0

    .line 292
    :cond_8
    new-instance v2, LDg/a;

    .line 293
    .line 294
    sget-object v3, LVg/g;->w:Lzg/t;

    .line 295
    .line 296
    new-instance v4, LVg/k;

    .line 297
    .line 298
    invoke-virtual {p0}, Lsh/z;->c()Lsh/x;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    invoke-virtual {v5}, Lsh/x;->b()I

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    invoke-virtual {p0}, Lsh/p;->b()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-static {p0}, Lrh/e;->V(Ljava/lang/String;)LDg/a;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    invoke-direct {v4, v5, p0}, LVg/k;-><init>(ILDg/a;)V

    .line 315
    .line 316
    .line 317
    invoke-direct {v2, v3, v4}, LDg/a;-><init>(Lzg/t;Lzg/e;)V

    .line 318
    .line 319
    .line 320
    new-instance p0, LDg/b;

    .line 321
    .line 322
    new-instance v3, LVg/p;

    .line 323
    .line 324
    invoke-direct {v3, v0, v1}, LVg/p;-><init>([B[B)V

    .line 325
    .line 326
    .line 327
    invoke-direct {p0, v2, v3}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 328
    .line 329
    .line 330
    return-object p0

    .line 331
    :cond_9
    instance-of v0, p0, Lsh/t;

    .line 332
    .line 333
    if-eqz v0, :cond_b

    .line 334
    .line 335
    check-cast p0, Lsh/t;

    .line 336
    .line 337
    invoke-virtual {p0}, Lsh/t;->d()[B

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {p0}, Lsh/t;->e()[B

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-virtual {p0}, Lsh/t;->getEncoded()[B

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    array-length v3, v2

    .line 350
    array-length v0, v0

    .line 351
    array-length v1, v1

    .line 352
    add-int/2addr v0, v1

    .line 353
    if-le v3, v0, :cond_a

    .line 354
    .line 355
    new-instance p0, LDg/a;

    .line 356
    .line 357
    sget-object v0, LLg/a;->b:Lzg/t;

    .line 358
    .line 359
    invoke-direct {p0, v0}, LDg/a;-><init>(Lzg/t;)V

    .line 360
    .line 361
    .line 362
    new-instance v0, LDg/b;

    .line 363
    .line 364
    new-instance v1, Lzg/n0;

    .line 365
    .line 366
    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    .line 367
    .line 368
    .line 369
    invoke-direct {v0, p0, v1}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 370
    .line 371
    .line 372
    return-object v0

    .line 373
    :cond_a
    new-instance v0, LDg/a;

    .line 374
    .line 375
    sget-object v1, LVg/g;->F:Lzg/t;

    .line 376
    .line 377
    new-instance v2, LVg/l;

    .line 378
    .line 379
    invoke-virtual {p0}, Lsh/t;->c()Lsh/r;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v3}, Lsh/r;->a()I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    invoke-virtual {p0}, Lsh/t;->c()Lsh/r;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-virtual {v4}, Lsh/r;->b()I

    .line 392
    .line 393
    .line 394
    move-result v4

    .line 395
    invoke-virtual {p0}, Lsh/q;->b()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    invoke-static {v5}, Lrh/e;->V(Ljava/lang/String;)LDg/a;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    invoke-direct {v2, v3, v4, v5}, LVg/l;-><init>(IILDg/a;)V

    .line 404
    .line 405
    .line 406
    invoke-direct {v0, v1, v2}, LDg/a;-><init>(Lzg/t;Lzg/e;)V

    .line 407
    .line 408
    .line 409
    new-instance v1, LDg/b;

    .line 410
    .line 411
    new-instance v2, LVg/n;

    .line 412
    .line 413
    invoke-virtual {p0}, Lsh/t;->d()[B

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {p0}, Lsh/t;->e()[B

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    invoke-direct {v2, v3, p0}, LVg/n;-><init>([B[B)V

    .line 422
    .line 423
    .line 424
    invoke-direct {v1, v0, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 425
    .line 426
    .line 427
    return-object v1

    .line 428
    :cond_b
    instance-of v0, p0, LKh/c;

    .line 429
    .line 430
    if-eqz v0, :cond_c

    .line 431
    .line 432
    check-cast p0, LKh/c;

    .line 433
    .line 434
    new-instance v0, LVg/f;

    .line 435
    .line 436
    invoke-virtual {p0}, LKh/c;->d()I

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    invoke-virtual {p0}, LKh/c;->e()I

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    invoke-virtual {p0}, LKh/c;->c()LMh/a;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-virtual {p0}, LKh/a;->b()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    invoke-static {p0}, Lrh/e;->i(Ljava/lang/String;)LDg/a;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    invoke-direct {v0, v1, v2, v3, p0}, LVg/f;-><init>(IILMh/a;LDg/a;)V

    .line 457
    .line 458
    .line 459
    new-instance p0, LDg/a;

    .line 460
    .line 461
    sget-object v1, LVg/g;->n:Lzg/t;

    .line 462
    .line 463
    invoke-direct {p0, v1}, LDg/a;-><init>(Lzg/t;)V

    .line 464
    .line 465
    .line 466
    new-instance v1, LDg/b;

    .line 467
    .line 468
    invoke-direct {v1, p0, v0}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 469
    .line 470
    .line 471
    return-object v1

    .line 472
    :cond_c
    instance-of v0, p0, Lbh/f;

    .line 473
    .line 474
    if-eqz v0, :cond_d

    .line 475
    .line 476
    check-cast p0, Lbh/f;

    .line 477
    .line 478
    invoke-virtual {p0}, Lbh/f;->getEncoded()[B

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    new-instance v1, LDg/a;

    .line 483
    .line 484
    invoke-virtual {p0}, Lbh/b;->b()Lbh/d;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    invoke-static {p0}, Lrh/e;->g(Lbh/d;)Lzg/t;

    .line 489
    .line 490
    .line 491
    move-result-object p0

    .line 492
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 493
    .line 494
    .line 495
    new-instance p0, LDg/b;

    .line 496
    .line 497
    new-instance v2, Lzg/n0;

    .line 498
    .line 499
    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    .line 500
    .line 501
    .line 502
    invoke-direct {p0, v1, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 503
    .line 504
    .line 505
    return-object p0

    .line 506
    :cond_d
    instance-of v0, p0, Lmh/f;

    .line 507
    .line 508
    if-eqz v0, :cond_e

    .line 509
    .line 510
    check-cast p0, Lmh/f;

    .line 511
    .line 512
    invoke-virtual {p0}, Lmh/f;->getEncoded()[B

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    new-instance v1, LDg/a;

    .line 517
    .line 518
    invoke-virtual {p0}, Lmh/c;->b()Lmh/d;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    invoke-static {p0}, Lrh/e;->J(Lmh/d;)Lzg/t;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 527
    .line 528
    .line 529
    new-instance p0, LDg/b;

    .line 530
    .line 531
    new-instance v2, Lzg/r0;

    .line 532
    .line 533
    new-instance v3, Lzg/n0;

    .line 534
    .line 535
    invoke-direct {v3, v0}, Lzg/n0;-><init>([B)V

    .line 536
    .line 537
    .line 538
    invoke-direct {v2, v3}, Lzg/r0;-><init>(Lzg/e;)V

    .line 539
    .line 540
    .line 541
    invoke-direct {p0, v1, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 542
    .line 543
    .line 544
    return-object p0

    .line 545
    :cond_e
    instance-of v0, p0, Lkh/d;

    .line 546
    .line 547
    if-eqz v0, :cond_f

    .line 548
    .line 549
    check-cast p0, Lkh/d;

    .line 550
    .line 551
    invoke-virtual {p0}, Lkh/d;->getEncoded()[B

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    new-instance v1, LDg/a;

    .line 556
    .line 557
    invoke-virtual {p0}, Lkh/a;->b()Lkh/b;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    invoke-static {p0}, Lrh/e;->C(Lkh/b;)Lzg/t;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 566
    .line 567
    .line 568
    new-instance p0, LDg/b;

    .line 569
    .line 570
    new-instance v2, Lzg/n0;

    .line 571
    .line 572
    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    .line 573
    .line 574
    .line 575
    invoke-direct {p0, v1, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 576
    .line 577
    .line 578
    return-object p0

    .line 579
    :cond_f
    instance-of v0, p0, Lih/d;

    .line 580
    .line 581
    if-eqz v0, :cond_10

    .line 582
    .line 583
    check-cast p0, Lih/d;

    .line 584
    .line 585
    invoke-virtual {p0}, Lih/d;->getEncoded()[B

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    new-instance v1, LDg/a;

    .line 590
    .line 591
    invoke-virtual {p0}, Lih/a;->b()Lih/b;

    .line 592
    .line 593
    .line 594
    move-result-object p0

    .line 595
    invoke-static {p0}, Lrh/e;->w(Lih/b;)Lzg/t;

    .line 596
    .line 597
    .line 598
    move-result-object p0

    .line 599
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 600
    .line 601
    .line 602
    new-instance p0, LDg/b;

    .line 603
    .line 604
    invoke-direct {p0, v1, v0}, LDg/b;-><init>(LDg/a;[B)V

    .line 605
    .line 606
    .line 607
    return-object p0

    .line 608
    :cond_10
    instance-of v0, p0, Lah/d;

    .line 609
    .line 610
    if-eqz v0, :cond_11

    .line 611
    .line 612
    check-cast p0, Lah/d;

    .line 613
    .line 614
    invoke-virtual {p0}, Lah/d;->c()[B

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    new-instance v2, LDg/a;

    .line 619
    .line 620
    invoke-virtual {p0}, Lah/a;->b()Lah/b;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    invoke-static {v3}, Lrh/e;->e(Lah/b;)Lzg/t;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-direct {v2, v3}, LDg/a;-><init>(Lzg/t;)V

    .line 629
    .line 630
    .line 631
    array-length v3, v0

    .line 632
    add-int/2addr v3, v1

    .line 633
    new-array v3, v3, [B

    .line 634
    .line 635
    invoke-virtual {p0}, Lah/a;->b()Lah/b;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    invoke-virtual {p0}, Lah/b;->a()I

    .line 640
    .line 641
    .line 642
    move-result p0

    .line 643
    int-to-byte p0, p0

    .line 644
    const/4 v4, 0x0

    .line 645
    aput-byte p0, v3, v4

    .line 646
    .line 647
    array-length p0, v0

    .line 648
    invoke-static {v0, v4, v3, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 649
    .line 650
    .line 651
    new-instance p0, LDg/b;

    .line 652
    .line 653
    invoke-direct {p0, v2, v3}, LDg/b;-><init>(LDg/a;[B)V

    .line 654
    .line 655
    .line 656
    return-object p0

    .line 657
    :cond_11
    instance-of v0, p0, Lgh/g;

    .line 658
    .line 659
    if-eqz v0, :cond_12

    .line 660
    .line 661
    check-cast p0, Lgh/g;

    .line 662
    .line 663
    new-instance v0, LDg/a;

    .line 664
    .line 665
    invoke-virtual {p0}, Lgh/d;->b()Lgh/e;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    invoke-static {v1}, Lrh/e;->u(Lgh/e;)Lzg/t;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    .line 674
    .line 675
    .line 676
    new-instance v1, LDg/b;

    .line 677
    .line 678
    invoke-virtual {p0}, Lgh/g;->getEncoded()[B

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    invoke-direct {v1, v0, p0}, LDg/b;-><init>(LDg/a;[B)V

    .line 683
    .line 684
    .line 685
    return-object v1

    .line 686
    :cond_12
    instance-of v0, p0, Ljh/d;

    .line 687
    .line 688
    if-eqz v0, :cond_13

    .line 689
    .line 690
    check-cast p0, Ljh/d;

    .line 691
    .line 692
    invoke-virtual {p0}, Ljh/d;->getEncoded()[B

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    new-instance v1, LDg/a;

    .line 697
    .line 698
    invoke-virtual {p0}, Ljh/a;->b()Ljh/b;

    .line 699
    .line 700
    .line 701
    move-result-object p0

    .line 702
    invoke-static {p0}, Lrh/e;->y(Ljh/b;)Lzg/t;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 707
    .line 708
    .line 709
    new-instance p0, LDg/b;

    .line 710
    .line 711
    new-instance v2, Lzg/n0;

    .line 712
    .line 713
    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    .line 714
    .line 715
    .line 716
    invoke-direct {p0, v1, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 717
    .line 718
    .line 719
    return-object p0

    .line 720
    :cond_13
    instance-of v0, p0, Ljh/h;

    .line 721
    .line 722
    if-eqz v0, :cond_14

    .line 723
    .line 724
    check-cast p0, Ljh/h;

    .line 725
    .line 726
    invoke-virtual {p0}, Ljh/h;->getEncoded()[B

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    new-instance v1, LDg/a;

    .line 731
    .line 732
    invoke-virtual {p0}, Ljh/e;->b()Ljh/f;

    .line 733
    .line 734
    .line 735
    move-result-object p0

    .line 736
    invoke-static {p0}, Lrh/e;->P(Ljh/f;)Lzg/t;

    .line 737
    .line 738
    .line 739
    move-result-object p0

    .line 740
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 741
    .line 742
    .line 743
    new-instance p0, LDg/b;

    .line 744
    .line 745
    new-instance v2, Lzg/n0;

    .line 746
    .line 747
    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    .line 748
    .line 749
    .line 750
    invoke-direct {p0, v1, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 751
    .line 752
    .line 753
    return-object p0

    .line 754
    :cond_14
    instance-of v0, p0, LZg/e;

    .line 755
    .line 756
    if-eqz v0, :cond_15

    .line 757
    .line 758
    check-cast p0, LZg/e;

    .line 759
    .line 760
    new-instance v0, LDg/a;

    .line 761
    .line 762
    invoke-virtual {p0}, LZg/b;->b()LZg/c;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    invoke-static {v1}, Lrh/e;->c(LZg/c;)Lzg/t;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    .line 771
    .line 772
    .line 773
    new-instance v1, LDg/b;

    .line 774
    .line 775
    invoke-virtual {p0}, LZg/e;->getEncoded()[B

    .line 776
    .line 777
    .line 778
    move-result-object p0

    .line 779
    invoke-direct {v1, v0, p0}, LDg/b;-><init>(LDg/a;[B)V

    .line 780
    .line 781
    .line 782
    return-object v1

    .line 783
    :cond_15
    instance-of v0, p0, Lfh/e;

    .line 784
    .line 785
    if-eqz v0, :cond_16

    .line 786
    .line 787
    check-cast p0, Lfh/e;

    .line 788
    .line 789
    new-instance v0, LDg/a;

    .line 790
    .line 791
    invoke-virtual {p0}, Lfh/b;->b()Lfh/c;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-static {v1}, Lrh/e;->s(Lfh/c;)Lzg/t;

    .line 796
    .line 797
    .line 798
    move-result-object v1

    .line 799
    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    .line 800
    .line 801
    .line 802
    new-instance v1, LDg/b;

    .line 803
    .line 804
    invoke-virtual {p0}, Lfh/e;->getEncoded()[B

    .line 805
    .line 806
    .line 807
    move-result-object p0

    .line 808
    invoke-direct {v1, v0, p0}, LDg/b;-><init>(LDg/a;[B)V

    .line 809
    .line 810
    .line 811
    return-object v1

    .line 812
    :cond_16
    instance-of v0, p0, LXg/e;

    .line 813
    .line 814
    if-eqz v0, :cond_17

    .line 815
    .line 816
    check-cast p0, LXg/e;

    .line 817
    .line 818
    invoke-virtual {p0}, LXg/e;->getEncoded()[B

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    new-instance v1, LDg/a;

    .line 823
    .line 824
    invoke-virtual {p0}, LXg/b;->b()LXg/c;

    .line 825
    .line 826
    .line 827
    move-result-object p0

    .line 828
    invoke-static {p0}, Lrh/e;->a(LXg/c;)Lzg/t;

    .line 829
    .line 830
    .line 831
    move-result-object p0

    .line 832
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 833
    .line 834
    .line 835
    new-instance p0, LDg/b;

    .line 836
    .line 837
    invoke-direct {p0, v1, v0}, LDg/b;-><init>(LDg/a;[B)V

    .line 838
    .line 839
    .line 840
    return-object p0

    .line 841
    :cond_17
    instance-of v0, p0, Lch/f;

    .line 842
    .line 843
    if-eqz v0, :cond_18

    .line 844
    .line 845
    check-cast p0, Lch/f;

    .line 846
    .line 847
    invoke-virtual {p0}, Lch/f;->getEncoded()[B

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    new-instance v1, LDg/a;

    .line 852
    .line 853
    invoke-virtual {p0}, Lch/c;->b()Lch/d;

    .line 854
    .line 855
    .line 856
    move-result-object p0

    .line 857
    invoke-static {p0}, Lrh/e;->l(Lch/d;)Lzg/t;

    .line 858
    .line 859
    .line 860
    move-result-object p0

    .line 861
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 862
    .line 863
    .line 864
    new-instance p0, LDg/b;

    .line 865
    .line 866
    invoke-direct {p0, v1, v0}, LDg/b;-><init>(LDg/a;[B)V

    .line 867
    .line 868
    .line 869
    return-object p0

    .line 870
    :cond_18
    instance-of v0, p0, Llh/h;

    .line 871
    .line 872
    if-eqz v0, :cond_19

    .line 873
    .line 874
    check-cast p0, Llh/h;

    .line 875
    .line 876
    invoke-virtual {p0}, Llh/h;->getEncoded()[B

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    new-instance v1, LDg/a;

    .line 881
    .line 882
    invoke-virtual {p0}, Llh/e;->b()Llh/f;

    .line 883
    .line 884
    .line 885
    move-result-object p0

    .line 886
    invoke-static {p0}, Lrh/e;->G(Llh/f;)Lzg/t;

    .line 887
    .line 888
    .line 889
    move-result-object p0

    .line 890
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 891
    .line 892
    .line 893
    new-instance p0, LDg/b;

    .line 894
    .line 895
    new-instance v2, Lzg/n0;

    .line 896
    .line 897
    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    .line 898
    .line 899
    .line 900
    invoke-direct {p0, v1, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 901
    .line 902
    .line 903
    return-object p0

    .line 904
    :cond_19
    instance-of v0, p0, Leh/d;

    .line 905
    .line 906
    if-eqz v0, :cond_1a

    .line 907
    .line 908
    check-cast p0, Leh/d;

    .line 909
    .line 910
    invoke-virtual {p0}, Leh/d;->getEncoded()[B

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    new-instance v1, LDg/a;

    .line 915
    .line 916
    invoke-virtual {p0}, Leh/a;->b()Leh/b;

    .line 917
    .line 918
    .line 919
    move-result-object p0

    .line 920
    invoke-static {p0}, Lrh/e;->o(Leh/b;)Lzg/t;

    .line 921
    .line 922
    .line 923
    move-result-object p0

    .line 924
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 925
    .line 926
    .line 927
    new-instance p0, LDg/b;

    .line 928
    .line 929
    new-instance v2, Lzg/n0;

    .line 930
    .line 931
    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    .line 932
    .line 933
    .line 934
    invoke-direct {p0, v1, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 935
    .line 936
    .line 937
    return-object p0

    .line 938
    :cond_1a
    instance-of v0, p0, Loh/c;

    .line 939
    .line 940
    if-eqz v0, :cond_1b

    .line 941
    .line 942
    check-cast p0, Loh/c;

    .line 943
    .line 944
    invoke-virtual {p0}, Loh/c;->getEncoded()[B

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    new-instance v1, LDg/a;

    .line 949
    .line 950
    invoke-virtual {p0}, Loh/c;->b()Loh/a;

    .line 951
    .line 952
    .line 953
    move-result-object p0

    .line 954
    invoke-static {p0}, Lrh/e;->N(Loh/a;)Lzg/t;

    .line 955
    .line 956
    .line 957
    move-result-object p0

    .line 958
    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    .line 959
    .line 960
    .line 961
    new-instance p0, LDg/b;

    .line 962
    .line 963
    new-instance v2, Lzg/n0;

    .line 964
    .line 965
    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    .line 966
    .line 967
    .line 968
    invoke-direct {p0, v1, v2}, LDg/b;-><init>(LDg/a;Lzg/e;)V

    .line 969
    .line 970
    .line 971
    return-object p0

    .line 972
    :cond_1b
    new-instance p0, Ljava/io/IOException;

    .line 973
    .line 974
    const-string v0, "key parameters not recognized"

    .line 975
    .line 976
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 977
    .line 978
    .line 979
    throw p0
.end method
