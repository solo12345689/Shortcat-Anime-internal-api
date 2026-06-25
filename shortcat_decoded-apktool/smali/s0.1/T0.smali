.class final Ls0/T0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Ls0/T0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls0/T0;

    .line 2
    .line 3
    invoke-direct {v0}, Ls0/T0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls0/T0;->a:Ls0/T0;

    .line 7
    .line 8
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ls0/T0;->d(Lkotlin/jvm/functions/Function1;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;D)D
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ls0/T0;->e(Lkotlin/jvm/functions/Function1;D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final c(Lt0/c;)Landroid/graphics/ColorSpace;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lt0/k;->a:Lt0/k;

    .line 4
    .line 5
    invoke-virtual {v1}, Lt0/k;->G()Lt0/F;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ls0/M0;->a()Landroid/graphics/ColorSpace$Named;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    invoke-virtual {v1}, Lt0/k;->m()Lt0/F;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-static {}, Ls0/C0;->a()Landroid/graphics/ColorSpace$Named;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0

    .line 43
    :cond_1
    invoke-virtual {v1}, Lt0/k;->n()Lt0/F;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-static {}, Ls0/G0;->a()Landroid/graphics/ColorSpace$Named;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :cond_2
    invoke-virtual {v1}, Lt0/k;->o()Lt0/F;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-static {}, Ls0/H0;->a()Landroid/graphics/ColorSpace$Named;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :cond_3
    invoke-virtual {v1}, Lt0/k;->p()Lt0/F;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-static {}, Ls0/I0;->a()Landroid/graphics/ColorSpace$Named;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    return-object v0

    .line 100
    :cond_4
    invoke-virtual {v1}, Lt0/k;->s()Lt0/F;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    invoke-static {}, Ls0/N0;->a()Landroid/graphics/ColorSpace$Named;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :cond_5
    invoke-virtual {v1}, Lt0/k;->t()Lt0/c;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    invoke-static {}, Ls0/P0;->a()Landroid/graphics/ColorSpace$Named;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :cond_6
    invoke-virtual {v1}, Lt0/k;->u()Lt0/c;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_7

    .line 147
    .line 148
    invoke-static {}, Ls0/Q0;->a()Landroid/graphics/ColorSpace$Named;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :cond_7
    invoke-virtual {v1}, Lt0/k;->w()Lt0/F;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_8

    .line 166
    .line 167
    invoke-static {}, Ls0/v0;->a()Landroid/graphics/ColorSpace$Named;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    return-object v0

    .line 176
    :cond_8
    invoke-virtual {v1}, Lt0/k;->x()Lt0/F;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_9

    .line 185
    .line 186
    invoke-static {}, Ls0/w0;->a()Landroid/graphics/ColorSpace$Named;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :cond_9
    invoke-virtual {v1}, Lt0/k;->y()Lt0/F;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eqz v2, :cond_a

    .line 204
    .line 205
    invoke-static {}, Ls0/x0;->a()Landroid/graphics/ColorSpace$Named;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    return-object v0

    .line 214
    :cond_a
    invoke-virtual {v1}, Lt0/k;->z()Lt0/F;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_b

    .line 223
    .line 224
    invoke-static {}, Ls0/y0;->a()Landroid/graphics/ColorSpace$Named;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    return-object v0

    .line 233
    :cond_b
    invoke-virtual {v1}, Lt0/k;->A()Lt0/F;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-eqz v2, :cond_c

    .line 242
    .line 243
    invoke-static {}, Ls0/z0;->a()Landroid/graphics/ColorSpace$Named;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    return-object v0

    .line 252
    :cond_c
    invoke-virtual {v1}, Lt0/k;->B()Lt0/F;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_d

    .line 261
    .line 262
    invoke-static {}, Ls0/A0;->a()Landroid/graphics/ColorSpace$Named;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0

    .line 271
    :cond_d
    invoke-virtual {v1}, Lt0/k;->E()Lt0/F;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-eqz v2, :cond_e

    .line 280
    .line 281
    invoke-static {}, Ls0/B0;->a()Landroid/graphics/ColorSpace$Named;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    return-object v0

    .line 290
    :cond_e
    invoke-virtual {v1}, Lt0/k;->F()Lt0/F;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_f

    .line 299
    .line 300
    invoke-static {}, Ls0/D0;->a()Landroid/graphics/ColorSpace$Named;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    return-object v0

    .line 309
    :cond_f
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 310
    .line 311
    const/16 v2, 0x22

    .line 312
    .line 313
    if-lt v1, v2, :cond_10

    .line 314
    .line 315
    invoke-static {v0}, Ls0/W0;->a(Lt0/c;)Landroid/graphics/ColorSpace;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    if-eqz v1, :cond_10

    .line 320
    .line 321
    return-object v1

    .line 322
    :cond_10
    instance-of v1, v0, Lt0/F;

    .line 323
    .line 324
    if-eqz v1, :cond_13

    .line 325
    .line 326
    move-object v1, v0

    .line 327
    check-cast v1, Lt0/F;

    .line 328
    .line 329
    invoke-virtual {v1}, Lt0/F;->F()Lt0/I;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-virtual {v2}, Lt0/I;->c()[F

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    invoke-virtual {v1}, Lt0/F;->D()Lt0/G;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    if-eqz v2, :cond_11

    .line 342
    .line 343
    invoke-static {}, Ls0/K0;->a()V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Lt0/G;->a()D

    .line 347
    .line 348
    .line 349
    move-result-wide v6

    .line 350
    invoke-virtual {v2}, Lt0/G;->b()D

    .line 351
    .line 352
    .line 353
    move-result-wide v8

    .line 354
    invoke-virtual {v2}, Lt0/G;->c()D

    .line 355
    .line 356
    .line 357
    move-result-wide v10

    .line 358
    invoke-virtual {v2}, Lt0/G;->d()D

    .line 359
    .line 360
    .line 361
    move-result-wide v12

    .line 362
    invoke-virtual {v2}, Lt0/G;->e()D

    .line 363
    .line 364
    .line 365
    move-result-wide v14

    .line 366
    invoke-virtual {v2}, Lt0/G;->f()D

    .line 367
    .line 368
    .line 369
    move-result-wide v16

    .line 370
    invoke-virtual {v2}, Lt0/G;->g()D

    .line 371
    .line 372
    .line 373
    move-result-wide v18

    .line 374
    invoke-static/range {v6 .. v19}, Ls0/u0;->a(DDDDDDD)Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    goto :goto_0

    .line 379
    :cond_11
    const/4 v2, 0x0

    .line 380
    :goto_0
    if-eqz v2, :cond_12

    .line 381
    .line 382
    invoke-static {}, Ls0/L0;->a()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Lt0/c;->f()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v1}, Lt0/F;->C()[F

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-static {v0, v1, v5, v2}, Ls0/F0;->a(Ljava/lang/String;[F[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)Landroid/graphics/ColorSpace$Rgb;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    goto :goto_1

    .line 398
    :cond_12
    invoke-static {}, Ls0/L0;->a()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Lt0/c;->f()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-virtual {v1}, Lt0/F;->C()[F

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-virtual {v1}, Lt0/F;->z()Lkotlin/jvm/functions/Function1;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    new-instance v6, Ls0/R0;

    .line 414
    .line 415
    invoke-direct {v6, v0}, Ls0/R0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1}, Lt0/F;->v()Lkotlin/jvm/functions/Function1;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    new-instance v7, Ls0/S0;

    .line 423
    .line 424
    invoke-direct {v7, v0}, Ls0/S0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 425
    .line 426
    .line 427
    const/4 v0, 0x0

    .line 428
    invoke-virtual {v1, v0}, Lt0/F;->d(I)F

    .line 429
    .line 430
    .line 431
    move-result v8

    .line 432
    invoke-virtual {v1, v0}, Lt0/F;->c(I)F

    .line 433
    .line 434
    .line 435
    move-result v9

    .line 436
    invoke-static/range {v3 .. v9}, Ls0/J0;->a(Ljava/lang/String;[F[FLjava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;FF)Landroid/graphics/ColorSpace$Rgb;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    :goto_1
    invoke-static {v0}, Ls0/E0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    return-object v0

    .line 445
    :cond_13
    invoke-static {}, Ls0/M0;->a()Landroid/graphics/ColorSpace$Named;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v0}, Ls0/O0;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;D)D
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;D)D
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0
.end method
