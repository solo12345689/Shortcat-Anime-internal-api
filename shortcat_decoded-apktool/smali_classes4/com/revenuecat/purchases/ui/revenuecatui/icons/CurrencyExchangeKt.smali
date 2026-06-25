.class public final Lcom/revenuecat/purchases/ui/revenuecatui/icons/CurrencyExchangeKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lx0/d;",
        "_Currency_exchange",
        "Lx0/d;",
        "getCurrencyExchange",
        "()Lx0/d;",
        "CurrencyExchange",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static _Currency_exchange:Lx0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getCurrencyExchange()Lx0/d;
    .locals 18

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CurrencyExchangeKt;->_Currency_exchange:Lx0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Lx0/d$a;

    .line 10
    .line 11
    const/16 v0, 0x18

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    invoke-static {v0}, Li1/h;->n(F)F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-static {v0}, Li1/h;->n(F)F

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/16 v11, 0xe0

    .line 23
    .line 24
    const/4 v12, 0x0

    .line 25
    const/high16 v5, 0x44700000    # 960.0f

    .line 26
    .line 27
    const/high16 v6, 0x44700000    # 960.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    const-string v2, "CurrencyExchange"

    .line 34
    .line 35
    invoke-direct/range {v1 .. v12}, Lx0/d$a;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Ls0/F1;

    .line 39
    .line 40
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 41
    .line 42
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {v5, v2, v3, v0}, Ls0/F1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Ls0/G1;->a:Ls0/G1$a;

    .line 51
    .line 52
    invoke-virtual {v0}, Ls0/G1$a;->a()I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    sget-object v0, Ls0/H1;->a:Ls0/H1$a;

    .line 57
    .line 58
    invoke-virtual {v0}, Ls0/H1$a;->b()I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    sget-object v0, Ls0/o1;->a:Ls0/o1$a;

    .line 63
    .line 64
    invoke-virtual {v0}, Ls0/o1$a;->b()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    new-instance v0, Lx0/f;

    .line 69
    .line 70
    invoke-direct {v0}, Lx0/f;-><init>()V

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x44660000    # 920.0f

    .line 74
    .line 75
    const/high16 v4, 0x43f00000    # 480.0f

    .line 76
    .line 77
    invoke-virtual {v0, v4, v2}, Lx0/f;->i(FF)Lx0/f;

    .line 78
    .line 79
    .line 80
    const/high16 v2, -0x3cb20000    # -206.0f

    .line 81
    .line 82
    const/high16 v4, -0x3db40000    # -51.0f

    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    const/high16 v7, -0x3d200000    # -112.0f

    .line 86
    .line 87
    invoke-virtual {v0, v7, v6, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 88
    .line 89
    .line 90
    const v2, 0x44374000    # 733.0f

    .line 91
    .line 92
    .line 93
    const/high16 v4, 0x42f00000    # 120.0f

    .line 94
    .line 95
    invoke-virtual {v0, v4, v2}, Lx0/f;->n(FF)Lx0/f;

    .line 96
    .line 97
    .line 98
    const/high16 v2, 0x42d60000    # 107.0f

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x42200000    # 40.0f

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Lx0/f;->e(F)Lx0/f;

    .line 106
    .line 107
    .line 108
    const/high16 v2, -0x3c900000    # -240.0f

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 111
    .line 112
    .line 113
    const/high16 v2, 0x43700000    # 240.0f

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Lx0/f;->f(F)Lx0/f;

    .line 116
    .line 117
    .line 118
    const/high16 v2, 0x42a00000    # 80.0f

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 121
    .line 122
    .line 123
    const/high16 v2, -0x3d3a0000    # -99.0f

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Lx0/f;->f(F)Lx0/f;

    .line 126
    .line 127
    .line 128
    const/high16 v2, 0x42fd0000    # 126.5f

    .line 129
    .line 130
    const/high16 v4, 0x42e80000    # 116.0f

    .line 131
    .line 132
    const/high16 v6, 0x42900000    # 72.0f

    .line 133
    .line 134
    const/high16 v7, 0x42400000    # 48.0f

    .line 135
    .line 136
    invoke-virtual {v0, v7, v6, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x44520000    # 840.0f

    .line 140
    .line 141
    const/high16 v4, 0x43f00000    # 480.0f

    .line 142
    .line 143
    invoke-virtual {v0, v4, v2}, Lx0/f;->n(FF)Lx0/f;

    .line 144
    .line 145
    .line 146
    const v2, 0x430c8000    # 140.5f

    .line 147
    .line 148
    .line 149
    const/high16 v4, -0x3e1c0000    # -28.5f

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    const/high16 v7, 0x42960000    # 75.0f

    .line 153
    .line 154
    invoke-virtual {v0, v7, v6, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 155
    .line 156
    .line 157
    const/high16 v2, -0x3d660000    # -77.0f

    .line 158
    .line 159
    const/high16 v4, 0x42e40000    # 114.0f

    .line 160
    .line 161
    invoke-virtual {v0, v4, v2}, Lx0/f;->o(FF)Lx0/f;

    .line 162
    .line 163
    .line 164
    const/high16 v2, -0x3d1c0000    # -114.0f

    .line 165
    .line 166
    const/high16 v4, 0x429a0000    # 77.0f

    .line 167
    .line 168
    invoke-virtual {v0, v4, v2}, Lx0/f;->o(FF)Lx0/f;

    .line 169
    .line 170
    .line 171
    const/high16 v2, 0x44520000    # 840.0f

    .line 172
    .line 173
    const/high16 v4, 0x43f00000    # 480.0f

    .line 174
    .line 175
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 176
    .line 177
    .line 178
    const/high16 v2, 0x42a00000    # 80.0f

    .line 179
    .line 180
    invoke-virtual {v0, v2}, Lx0/f;->f(F)Lx0/f;

    .line 181
    .line 182
    .line 183
    const/high16 v2, -0x3df60000    # -34.5f

    .line 184
    .line 185
    const/high16 v4, 0x432b0000    # 171.0f

    .line 186
    .line 187
    const/high16 v7, 0x42b60000    # 91.0f

    .line 188
    .line 189
    invoke-virtual {v0, v6, v7, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 190
    .line 191
    .line 192
    const v2, 0x4445c000    # 791.0f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v2, v2}, Lx0/f;->n(FF)Lx0/f;

    .line 196
    .line 197
    .line 198
    const v2, 0x4422c000    # 651.0f

    .line 199
    .line 200
    .line 201
    const v4, 0x445d6000    # 885.5f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 205
    .line 206
    .line 207
    const/high16 v2, 0x44660000    # 920.0f

    .line 208
    .line 209
    const/high16 v4, 0x43f00000    # 480.0f

    .line 210
    .line 211
    invoke-virtual {v0, v4, v2}, Lx0/f;->n(FF)Lx0/f;

    .line 212
    .line 213
    .line 214
    const/high16 v2, -0x3df00000    # -36.0f

    .line 215
    .line 216
    const/high16 v4, -0x3ce00000    # -160.0f

    .line 217
    .line 218
    invoke-virtual {v0, v2, v4}, Lx0/f;->j(FF)Lx0/f;

    .line 219
    .line 220
    .line 221
    const/high16 v2, -0x3db00000    # -52.0f

    .line 222
    .line 223
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 224
    .line 225
    .line 226
    const/high16 v2, -0x3d670000    # -76.5f

    .line 227
    .line 228
    const/high16 v4, -0x3dde0000    # -40.5f

    .line 229
    .line 230
    const/high16 v6, -0x3dc40000    # -47.0f

    .line 231
    .line 232
    const/high16 v7, -0x3ed00000    # -11.0f

    .line 233
    .line 234
    invoke-virtual {v0, v6, v7, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 235
    .line 236
    .line 237
    const/high16 v2, 0x43a20000    # 324.0f

    .line 238
    .line 239
    const v4, 0x44138000    # 590.0f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 243
    .line 244
    .line 245
    const/high16 v2, 0x42840000    # 66.0f

    .line 246
    .line 247
    const/high16 v4, -0x3e300000    # -26.0f

    .line 248
    .line 249
    invoke-virtual {v0, v2, v4}, Lx0/f;->h(FF)Lx0/f;

    .line 250
    .line 251
    .line 252
    const/high16 v2, 0x41400000    # 12.0f

    .line 253
    .line 254
    const/high16 v4, 0x42760000    # 61.5f

    .line 255
    .line 256
    const/high16 v6, 0x42160000    # 37.5f

    .line 257
    .line 258
    const/high16 v7, 0x42240000    # 41.0f

    .line 259
    .line 260
    invoke-virtual {v0, v2, v7, v6, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 261
    .line 262
    .line 263
    const/high16 v2, 0x43f30000    # 486.0f

    .line 264
    .line 265
    const v4, 0x44218000    # 646.0f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 269
    .line 270
    .line 271
    const/high16 v2, 0x42620000    # 56.5f

    .line 272
    .line 273
    const/high16 v4, -0x3e880000    # -15.5f

    .line 274
    .line 275
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 276
    .line 277
    .line 278
    const v2, 0x440d8000    # 566.0f

    .line 279
    .line 280
    .line 281
    const v4, 0x44118000    # 582.0f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 285
    .line 286
    .line 287
    const/high16 v2, -0x3e180000    # -29.0f

    .line 288
    .line 289
    const/high16 v4, -0x3e3c0000    # -24.5f

    .line 290
    .line 291
    const/high16 v6, -0x3dc40000    # -47.0f

    .line 292
    .line 293
    const/4 v7, 0x0

    .line 294
    invoke-virtual {v0, v7, v2, v4, v6}, Lx0/f;->k(FFFF)Lx0/f;

    .line 295
    .line 296
    .line 297
    const/high16 v2, 0x43e30000    # 454.0f

    .line 298
    .line 299
    const/high16 v4, 0x43f70000    # 494.0f

    .line 300
    .line 301
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 302
    .line 303
    .line 304
    const/high16 v2, -0x3e580000    # -21.0f

    .line 305
    .line 306
    const/high16 v4, -0x3d530000    # -86.5f

    .line 307
    .line 308
    const/high16 v6, -0x3db80000    # -50.0f

    .line 309
    .line 310
    const/high16 v7, -0x3d940000    # -59.0f

    .line 311
    .line 312
    invoke-virtual {v0, v7, v2, v4, v6}, Lx0/f;->k(FFFF)Lx0/f;

    .line 313
    .line 314
    .line 315
    const/high16 v2, 0x43aa0000    # 340.0f

    .line 316
    .line 317
    const/high16 v4, 0x43b80000    # 368.0f

    .line 318
    .line 319
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 320
    .line 321
    .line 322
    const/high16 v2, -0x3ddc0000    # -41.0f

    .line 323
    .line 324
    const/high16 v4, -0x3d6b0000    # -74.5f

    .line 325
    .line 326
    const/high16 v6, 0x41e40000    # 28.5f

    .line 327
    .line 328
    const/4 v7, 0x0

    .line 329
    invoke-virtual {v0, v7, v2, v6, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 330
    .line 331
    .line 332
    const/high16 v2, 0x43df0000    # 446.0f

    .line 333
    .line 334
    const/high16 v4, 0x437a0000    # 250.0f

    .line 335
    .line 336
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 337
    .line 338
    .line 339
    const/high16 v2, -0x3db80000    # -50.0f

    .line 340
    .line 341
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 342
    .line 343
    .line 344
    const/high16 v2, 0x428c0000    # 70.0f

    .line 345
    .line 346
    invoke-virtual {v0, v2}, Lx0/f;->f(F)Lx0/f;

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x42480000    # 50.0f

    .line 350
    .line 351
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 352
    .line 353
    .line 354
    const/high16 v2, 0x42830000    # 65.5f

    .line 355
    .line 356
    const/high16 v4, 0x41e80000    # 29.0f

    .line 357
    .line 358
    const/high16 v6, 0x42100000    # 36.0f

    .line 359
    .line 360
    const/high16 v7, 0x40400000    # 3.0f

    .line 361
    .line 362
    invoke-virtual {v0, v6, v7, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 363
    .line 364
    .line 365
    const/high16 v2, 0x42220000    # 40.5f

    .line 366
    .line 367
    const/high16 v4, 0x42740000    # 61.0f

    .line 368
    .line 369
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 370
    .line 371
    .line 372
    const/high16 v2, -0x3d800000    # -64.0f

    .line 373
    .line 374
    const/high16 v4, 0x41d00000    # 26.0f

    .line 375
    .line 376
    invoke-virtual {v0, v2, v4}, Lx0/f;->h(FF)Lx0/f;

    .line 377
    .line 378
    .line 379
    const/high16 v2, -0x3e480000    # -23.0f

    .line 380
    .line 381
    const/high16 v4, -0x3de60000    # -38.5f

    .line 382
    .line 383
    const/high16 v6, -0x3e300000    # -26.0f

    .line 384
    .line 385
    const/high16 v7, -0x3f000000    # -8.0f

    .line 386
    .line 387
    invoke-virtual {v0, v7, v2, v6, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 388
    .line 389
    .line 390
    const/high16 v2, 0x43f10000    # 482.0f

    .line 391
    .line 392
    const/high16 v4, 0x439c0000    # 312.0f

    .line 393
    .line 394
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 395
    .line 396
    .line 397
    const/high16 v2, -0x3daa0000    # -53.5f

    .line 398
    .line 399
    const/high16 v4, 0x41700000    # 15.0f

    .line 400
    .line 401
    const/4 v6, 0x0

    .line 402
    const/high16 v7, -0x3df40000    # -35.0f

    .line 403
    .line 404
    invoke-virtual {v0, v7, v6, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 405
    .line 406
    .line 407
    const/high16 v2, 0x43cd0000    # 410.0f

    .line 408
    .line 409
    const/high16 v4, 0x43b80000    # 368.0f

    .line 410
    .line 411
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 412
    .line 413
    .line 414
    const/high16 v2, 0x41b80000    # 23.0f

    .line 415
    .line 416
    const/high16 v4, 0x42240000    # 41.0f

    .line 417
    .line 418
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x42a60000    # 83.0f

    .line 422
    .line 423
    const/high16 v4, 0x420c0000    # 35.0f

    .line 424
    .line 425
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 426
    .line 427
    .line 428
    const/high16 v2, 0x42c00000    # 96.0f

    .line 429
    .line 430
    const/high16 v4, 0x42740000    # 61.0f

    .line 431
    .line 432
    const/high16 v6, 0x42900000    # 72.0f

    .line 433
    .line 434
    const/high16 v7, 0x41d00000    # 26.0f

    .line 435
    .line 436
    invoke-virtual {v0, v6, v7, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 437
    .line 438
    .line 439
    const/high16 v2, 0x41c00000    # 24.0f

    .line 440
    .line 441
    const/high16 v4, 0x429a0000    # 77.0f

    .line 442
    .line 443
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 444
    .line 445
    .line 446
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 447
    .line 448
    const/high16 v4, 0x424c0000    # 51.0f

    .line 449
    .line 450
    const/4 v6, 0x0

    .line 451
    const/high16 v7, 0x41e80000    # 29.0f

    .line 452
    .line 453
    invoke-virtual {v0, v6, v7, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 454
    .line 455
    .line 456
    const/high16 v2, -0x3e2c0000    # -26.5f

    .line 457
    .line 458
    const/high16 v4, 0x42160000    # 37.5f

    .line 459
    .line 460
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 461
    .line 462
    .line 463
    const/high16 v2, -0x3de60000    # -38.5f

    .line 464
    .line 465
    const/high16 v4, 0x41c80000    # 25.0f

    .line 466
    .line 467
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 468
    .line 469
    .line 470
    const/high16 v2, 0x41680000    # 14.5f

    .line 471
    .line 472
    const/high16 v4, -0x3dc40000    # -47.0f

    .line 473
    .line 474
    invoke-virtual {v0, v4, v2}, Lx0/f;->o(FF)Lx0/f;

    .line 475
    .line 476
    .line 477
    const/high16 v2, 0x42480000    # 50.0f

    .line 478
    .line 479
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 483
    .line 484
    .line 485
    const/high16 v2, 0x42200000    # 40.0f

    .line 486
    .line 487
    const/high16 v4, 0x43f00000    # 480.0f

    .line 488
    .line 489
    invoke-virtual {v0, v2, v4}, Lx0/f;->i(FF)Lx0/f;

    .line 490
    .line 491
    .line 492
    const/high16 v2, 0x420a0000    # 34.5f

    .line 493
    .line 494
    const/high16 v4, -0x3cd50000    # -171.0f

    .line 495
    .line 496
    const/high16 v7, -0x3d4a0000    # -91.0f

    .line 497
    .line 498
    invoke-virtual {v0, v6, v7, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 499
    .line 500
    .line 501
    const/high16 v2, 0x43290000    # 169.0f

    .line 502
    .line 503
    const/high16 v4, 0x43290000    # 169.0f

    .line 504
    .line 505
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 506
    .line 507
    .line 508
    const/high16 v2, 0x430c0000    # 140.0f

    .line 509
    .line 510
    const/high16 v4, -0x3d430000    # -94.5f

    .line 511
    .line 512
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 513
    .line 514
    .line 515
    const/high16 v2, 0x42200000    # 40.0f

    .line 516
    .line 517
    const/high16 v4, 0x43f00000    # 480.0f

    .line 518
    .line 519
    invoke-virtual {v0, v4, v2}, Lx0/f;->n(FF)Lx0/f;

    .line 520
    .line 521
    .line 522
    const/high16 v2, 0x434e0000    # 206.0f

    .line 523
    .line 524
    const/high16 v4, 0x424c0000    # 51.0f

    .line 525
    .line 526
    const/high16 v7, 0x42e00000    # 112.0f

    .line 527
    .line 528
    invoke-virtual {v0, v7, v6, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 529
    .line 530
    .line 531
    const/high16 v2, 0x431a0000    # 154.0f

    .line 532
    .line 533
    const/high16 v4, 0x43080000    # 136.0f

    .line 534
    .line 535
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 536
    .line 537
    .line 538
    const/high16 v2, -0x3d2a0000    # -107.0f

    .line 539
    .line 540
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 541
    .line 542
    .line 543
    const/high16 v2, 0x42a00000    # 80.0f

    .line 544
    .line 545
    invoke-virtual {v0, v2}, Lx0/f;->f(F)Lx0/f;

    .line 546
    .line 547
    .line 548
    const/high16 v2, 0x43700000    # 240.0f

    .line 549
    .line 550
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 551
    .line 552
    .line 553
    const/high16 v2, 0x442a0000    # 680.0f

    .line 554
    .line 555
    invoke-virtual {v0, v2}, Lx0/f;->e(F)Lx0/f;

    .line 556
    .line 557
    .line 558
    const/high16 v2, -0x3d600000    # -80.0f

    .line 559
    .line 560
    invoke-virtual {v0, v2}, Lx0/f;->p(F)Lx0/f;

    .line 561
    .line 562
    .line 563
    const/high16 v2, 0x42c60000    # 99.0f

    .line 564
    .line 565
    invoke-virtual {v0, v2}, Lx0/f;->f(F)Lx0/f;

    .line 566
    .line 567
    .line 568
    const/high16 v2, -0x3d030000    # -126.5f

    .line 569
    .line 570
    const/high16 v4, -0x3d180000    # -116.0f

    .line 571
    .line 572
    const/high16 v6, -0x3dc00000    # -48.0f

    .line 573
    .line 574
    const/high16 v7, -0x3d700000    # -72.0f

    .line 575
    .line 576
    invoke-virtual {v0, v6, v7, v2, v4}, Lx0/f;->k(FFFF)Lx0/f;

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x42f00000    # 120.0f

    .line 580
    .line 581
    const/high16 v4, 0x43f00000    # 480.0f

    .line 582
    .line 583
    invoke-virtual {v0, v4, v2}, Lx0/f;->n(FF)Lx0/f;

    .line 584
    .line 585
    .line 586
    const/high16 v2, -0x3d6a0000    # -75.0f

    .line 587
    .line 588
    const v4, -0x3cf38000    # -140.5f

    .line 589
    .line 590
    .line 591
    const/high16 v6, 0x41e40000    # 28.5f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    invoke-virtual {v0, v2, v7, v4, v6}, Lx0/f;->k(FFFF)Lx0/f;

    .line 595
    .line 596
    .line 597
    const/high16 v2, -0x3d1c0000    # -114.0f

    .line 598
    .line 599
    const/high16 v4, 0x429a0000    # 77.0f

    .line 600
    .line 601
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 602
    .line 603
    .line 604
    const/high16 v2, -0x3d660000    # -77.0f

    .line 605
    .line 606
    const/high16 v4, 0x42e40000    # 114.0f

    .line 607
    .line 608
    invoke-virtual {v0, v2, v4}, Lx0/f;->o(FF)Lx0/f;

    .line 609
    .line 610
    .line 611
    const/high16 v2, 0x42f00000    # 120.0f

    .line 612
    .line 613
    const/high16 v4, 0x43f00000    # 480.0f

    .line 614
    .line 615
    invoke-virtual {v0, v2, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0}, Lx0/f;->d()Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    const/16 v16, 0x3800

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    const/high16 v6, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/4 v7, 0x0

    .line 632
    const/high16 v8, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/high16 v9, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/high16 v12, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/4 v13, 0x0

    .line 639
    const/4 v14, 0x0

    .line 640
    const/4 v15, 0x0

    .line 641
    const-string v4, ""

    .line 642
    .line 643
    invoke-static/range {v1 .. v17}, Lx0/d$a;->d(Lx0/d$a;Ljava/util/List;ILjava/lang/String;Ls0/h0;FLs0/h0;FFIIFFFFILjava/lang/Object;)Lx0/d$a;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v1}, Lx0/d$a;->f()Lx0/d;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CurrencyExchangeKt;->_Currency_exchange:Lx0/d;

    .line 651
    .line 652
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    return-object v0
.end method
