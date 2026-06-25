.class public final Lcom/revenuecat/purchases/ui/revenuecatui/icons/CalendarMonthKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lx0/d;",
        "_Calendar_month",
        "Lx0/d;",
        "getCalendarMonth",
        "()Lx0/d;",
        "CalendarMonth",
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
.field private static _Calendar_month:Lx0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getCalendarMonth()Lx0/d;
    .locals 18

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CalendarMonthKt;->_Calendar_month:Lx0/d;

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
    const-string v2, "CalendarMonth"

    .line 26
    .line 27
    const/high16 v5, 0x44700000    # 960.0f

    .line 28
    .line 29
    const/high16 v6, 0x44700000    # 960.0f

    .line 30
    .line 31
    const-wide/16 v7, 0x0

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

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
    const/high16 v2, 0x43480000    # 200.0f

    .line 74
    .line 75
    const/high16 v4, 0x445c0000    # 880.0f

    .line 76
    .line 77
    invoke-virtual {v0, v2, v4}, Lx0/f;->i(FF)Lx0/f;

    .line 78
    .line 79
    .line 80
    const/high16 v6, -0x3dfc0000    # -33.0f

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    const/high16 v8, -0x3d9e0000    # -56.5f

    .line 84
    .line 85
    const/high16 v9, -0x3e440000    # -23.5f

    .line 86
    .line 87
    invoke-virtual {v0, v6, v7, v8, v9}, Lx0/f;->k(FFFF)Lx0/f;

    .line 88
    .line 89
    .line 90
    const/high16 v12, 0x42f00000    # 120.0f

    .line 91
    .line 92
    const/high16 v13, 0x44480000    # 800.0f

    .line 93
    .line 94
    invoke-virtual {v0, v12, v13}, Lx0/f;->n(FF)Lx0/f;

    .line 95
    .line 96
    .line 97
    const/high16 v12, -0x3bf40000    # -560.0f

    .line 98
    .line 99
    invoke-virtual {v0, v12}, Lx0/f;->p(F)Lx0/f;

    .line 100
    .line 101
    .line 102
    const/high16 v12, 0x41bc0000    # 23.5f

    .line 103
    .line 104
    invoke-virtual {v0, v7, v6, v12, v8}, Lx0/f;->k(FFFF)Lx0/f;

    .line 105
    .line 106
    .line 107
    const/high16 v6, 0x43200000    # 160.0f

    .line 108
    .line 109
    invoke-virtual {v0, v2, v6}, Lx0/f;->n(FF)Lx0/f;

    .line 110
    .line 111
    .line 112
    const/high16 v6, 0x42200000    # 40.0f

    .line 113
    .line 114
    invoke-virtual {v0, v6}, Lx0/f;->f(F)Lx0/f;

    .line 115
    .line 116
    .line 117
    const/high16 v6, -0x3d600000    # -80.0f

    .line 118
    .line 119
    invoke-virtual {v0, v6}, Lx0/f;->p(F)Lx0/f;

    .line 120
    .line 121
    .line 122
    const/high16 v8, 0x42a00000    # 80.0f

    .line 123
    .line 124
    invoke-virtual {v0, v8}, Lx0/f;->f(F)Lx0/f;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v8}, Lx0/f;->p(F)Lx0/f;

    .line 128
    .line 129
    .line 130
    const/high16 v13, 0x43a00000    # 320.0f

    .line 131
    .line 132
    invoke-virtual {v0, v13}, Lx0/f;->f(F)Lx0/f;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v6}, Lx0/f;->p(F)Lx0/f;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v8}, Lx0/f;->f(F)Lx0/f;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v8}, Lx0/f;->p(F)Lx0/f;

    .line 142
    .line 143
    .line 144
    const/high16 v8, 0x42200000    # 40.0f

    .line 145
    .line 146
    invoke-virtual {v0, v8}, Lx0/f;->f(F)Lx0/f;

    .line 147
    .line 148
    .line 149
    const/high16 v8, 0x42040000    # 33.0f

    .line 150
    .line 151
    const/high16 v14, 0x42620000    # 56.5f

    .line 152
    .line 153
    invoke-virtual {v0, v8, v7, v14, v12}, Lx0/f;->k(FFFF)Lx0/f;

    .line 154
    .line 155
    .line 156
    const/high16 v8, 0x44520000    # 840.0f

    .line 157
    .line 158
    const/high16 v12, 0x43700000    # 240.0f

    .line 159
    .line 160
    invoke-virtual {v0, v8, v12}, Lx0/f;->n(FF)Lx0/f;

    .line 161
    .line 162
    .line 163
    const/high16 v8, 0x440c0000    # 560.0f

    .line 164
    .line 165
    invoke-virtual {v0, v8}, Lx0/f;->p(F)Lx0/f;

    .line 166
    .line 167
    .line 168
    const/high16 v12, 0x42040000    # 33.0f

    .line 169
    .line 170
    invoke-virtual {v0, v7, v12, v9, v14}, Lx0/f;->k(FFFF)Lx0/f;

    .line 171
    .line 172
    .line 173
    const/high16 v9, 0x443e0000    # 760.0f

    .line 174
    .line 175
    invoke-virtual {v0, v9, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v7, v6}, Lx0/f;->j(FF)Lx0/f;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v8}, Lx0/f;->f(F)Lx0/f;

    .line 185
    .line 186
    .line 187
    const/high16 v4, -0x3c380000    # -400.0f

    .line 188
    .line 189
    invoke-virtual {v0, v4}, Lx0/f;->p(F)Lx0/f;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v2}, Lx0/f;->e(F)Lx0/f;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 196
    .line 197
    .line 198
    const/high16 v4, -0x3c100000    # -480.0f

    .line 199
    .line 200
    invoke-virtual {v0, v7, v4}, Lx0/f;->j(FF)Lx0/f;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v8}, Lx0/f;->f(F)Lx0/f;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v6}, Lx0/f;->p(F)Lx0/f;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v2}, Lx0/f;->e(F)Lx0/f;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v7, v7}, Lx0/f;->j(FF)Lx0/f;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v6}, Lx0/f;->p(F)Lx0/f;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 222
    .line 223
    .line 224
    const/high16 v2, 0x43700000    # 240.0f

    .line 225
    .line 226
    const/high16 v4, 0x438c0000    # 280.0f

    .line 227
    .line 228
    invoke-virtual {v0, v4, v2}, Lx0/f;->j(FF)Lx0/f;

    .line 229
    .line 230
    .line 231
    const/high16 v2, -0x3e780000    # -17.0f

    .line 232
    .line 233
    const/high16 v6, -0x3e1c0000    # -28.5f

    .line 234
    .line 235
    const/high16 v9, -0x3ec80000    # -11.5f

    .line 236
    .line 237
    invoke-virtual {v0, v2, v7, v6, v9}, Lx0/f;->k(FFFF)Lx0/f;

    .line 238
    .line 239
    .line 240
    const/high16 v12, 0x43dc0000    # 440.0f

    .line 241
    .line 242
    const/high16 v14, 0x44020000    # 520.0f

    .line 243
    .line 244
    invoke-virtual {v0, v12, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 245
    .line 246
    .line 247
    const/high16 v12, 0x41380000    # 11.5f

    .line 248
    .line 249
    invoke-virtual {v0, v12, v6}, Lx0/f;->o(FF)Lx0/f;

    .line 250
    .line 251
    .line 252
    const/high16 v15, 0x43f00000    # 480.0f

    .line 253
    .line 254
    invoke-virtual {v0, v15, v15}, Lx0/f;->n(FF)Lx0/f;

    .line 255
    .line 256
    .line 257
    const/high16 v13, 0x41e40000    # 28.5f

    .line 258
    .line 259
    invoke-virtual {v0, v13, v12}, Lx0/f;->o(FF)Lx0/f;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v14, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v9, v13}, Lx0/f;->o(FF)Lx0/f;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v15, v8}, Lx0/f;->n(FF)Lx0/f;

    .line 269
    .line 270
    .line 271
    const/high16 v8, -0x3ce00000    # -160.0f

    .line 272
    .line 273
    invoke-virtual {v0, v8, v7}, Lx0/f;->j(FF)Lx0/f;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v2, v7, v6, v9}, Lx0/f;->k(FFFF)Lx0/f;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v4, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v12, v6}, Lx0/f;->o(FF)Lx0/f;

    .line 283
    .line 284
    .line 285
    const/high16 v8, 0x43a00000    # 320.0f

    .line 286
    .line 287
    invoke-virtual {v0, v8, v15}, Lx0/f;->n(FF)Lx0/f;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v13, v12}, Lx0/f;->o(FF)Lx0/f;

    .line 291
    .line 292
    .line 293
    const/high16 v4, 0x43b40000    # 360.0f

    .line 294
    .line 295
    invoke-virtual {v0, v4, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v9, v13}, Lx0/f;->o(FF)Lx0/f;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x440c0000    # 560.0f

    .line 302
    .line 303
    invoke-virtual {v0, v8, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v8, v7}, Lx0/f;->j(FF)Lx0/f;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v2, v7, v6, v9}, Lx0/f;->k(FFFF)Lx0/f;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x44160000    # 600.0f

    .line 313
    .line 314
    invoke-virtual {v0, v4, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v12, v6}, Lx0/f;->o(FF)Lx0/f;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x44200000    # 640.0f

    .line 321
    .line 322
    invoke-virtual {v0, v4, v15}, Lx0/f;->n(FF)Lx0/f;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v13, v12}, Lx0/f;->o(FF)Lx0/f;

    .line 326
    .line 327
    .line 328
    const/high16 v8, 0x442a0000    # 680.0f

    .line 329
    .line 330
    invoke-virtual {v0, v8, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v9, v13}, Lx0/f;->o(FF)Lx0/f;

    .line 334
    .line 335
    .line 336
    const/high16 v14, 0x440c0000    # 560.0f

    .line 337
    .line 338
    invoke-virtual {v0, v4, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 339
    .line 340
    .line 341
    const/high16 v14, 0x44340000    # 720.0f

    .line 342
    .line 343
    invoke-virtual {v0, v15, v14}, Lx0/f;->i(FF)Lx0/f;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v2, v7, v6, v9}, Lx0/f;->k(FFFF)Lx0/f;

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x43dc0000    # 440.0f

    .line 350
    .line 351
    invoke-virtual {v0, v2, v8}, Lx0/f;->n(FF)Lx0/f;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v12, v6}, Lx0/f;->o(FF)Lx0/f;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v15, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v13, v12}, Lx0/f;->o(FF)Lx0/f;

    .line 361
    .line 362
    .line 363
    const/high16 v2, 0x44020000    # 520.0f

    .line 364
    .line 365
    invoke-virtual {v0, v2, v8}, Lx0/f;->n(FF)Lx0/f;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v9, v13}, Lx0/f;->o(FF)Lx0/f;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v15, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 372
    .line 373
    .line 374
    const/high16 v2, -0x3ce00000    # -160.0f

    .line 375
    .line 376
    invoke-virtual {v0, v2, v7}, Lx0/f;->j(FF)Lx0/f;

    .line 377
    .line 378
    .line 379
    const/high16 v2, -0x3e780000    # -17.0f

    .line 380
    .line 381
    invoke-virtual {v0, v2, v7, v6, v9}, Lx0/f;->k(FFFF)Lx0/f;

    .line 382
    .line 383
    .line 384
    const/high16 v15, 0x438c0000    # 280.0f

    .line 385
    .line 386
    invoke-virtual {v0, v15, v8}, Lx0/f;->n(FF)Lx0/f;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v12, v6}, Lx0/f;->o(FF)Lx0/f;

    .line 390
    .line 391
    .line 392
    const/high16 v15, 0x43a00000    # 320.0f

    .line 393
    .line 394
    invoke-virtual {v0, v15, v4}, Lx0/f;->n(FF)Lx0/f;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, v13, v12}, Lx0/f;->o(FF)Lx0/f;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x43b40000    # 360.0f

    .line 401
    .line 402
    invoke-virtual {v0, v4, v8}, Lx0/f;->n(FF)Lx0/f;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v9, v13}, Lx0/f;->o(FF)Lx0/f;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v15, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0, v15, v7}, Lx0/f;->j(FF)Lx0/f;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0, v2, v7, v6, v9}, Lx0/f;->k(FFFF)Lx0/f;

    .line 415
    .line 416
    .line 417
    const/high16 v2, 0x44160000    # 600.0f

    .line 418
    .line 419
    invoke-virtual {v0, v2, v8}, Lx0/f;->n(FF)Lx0/f;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v12, v6}, Lx0/f;->o(FF)Lx0/f;

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x44200000    # 640.0f

    .line 426
    .line 427
    invoke-virtual {v0, v2, v2}, Lx0/f;->n(FF)Lx0/f;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v13, v12}, Lx0/f;->o(FF)Lx0/f;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v8, v8}, Lx0/f;->n(FF)Lx0/f;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v0, v9, v13}, Lx0/f;->o(FF)Lx0/f;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v2, v14}, Lx0/f;->n(FF)Lx0/f;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, Lx0/f;->d()Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    const/16 v16, 0x3800

    .line 447
    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    const-string v4, ""

    .line 451
    .line 452
    const/high16 v6, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/4 v7, 0x0

    .line 455
    const/high16 v8, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/high16 v9, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v12, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const/4 v14, 0x0

    .line 463
    const/4 v15, 0x0

    .line 464
    invoke-static/range {v1 .. v17}, Lx0/d$a;->d(Lx0/d$a;Ljava/util/List;ILjava/lang/String;Ls0/h0;FLs0/h0;FFIIFFFFILjava/lang/Object;)Lx0/d$a;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v1}, Lx0/d$a;->f()Lx0/d;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CalendarMonthKt;->_Calendar_month:Lx0/d;

    .line 472
    .line 473
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    return-object v0
.end method
