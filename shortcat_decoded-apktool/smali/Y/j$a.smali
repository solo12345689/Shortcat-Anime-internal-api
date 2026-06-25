.class final LY/j$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY/j;->e()LCf/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field b:I

.field c:I

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:LY/j;


# direct methods
.method constructor <init>(LY/j;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/j$a;->f:LY/j;

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
.method public final a(LCf/k;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LY/j$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LY/j$a;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LY/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, LY/j$a;

    .line 2
    .line 3
    iget-object v1, p0, LY/j$a;->f:LY/j;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LY/j$a;-><init>(LY/j;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LY/j$a;->e:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LCf/k;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LY/j$a;->a(LCf/k;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LY/j$a;->d:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget v1, p0, LY/j$a;->c:I

    .line 13
    .line 14
    iget v3, p0, LY/j$a;->b:I

    .line 15
    .line 16
    iget v4, p0, LY/j$a;->a:I

    .line 17
    .line 18
    iget-object v5, p0, LY/j$a;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, LCf/k;

    .line 21
    .line 22
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move p1, v3

    .line 26
    move v3, v1

    .line 27
    move v1, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LY/j$a;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, LCf/k;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    move-object v5, p1

    .line 46
    move p1, v1

    .line 47
    move v3, p1

    .line 48
    :goto_0
    iget-object v4, p0, LY/j$a;->f:LY/j;

    .line 49
    .line 50
    invoke-static {v4}, LY/j;->b(LY/j;)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    iget-object v6, p0, LY/j$a;->f:LY/j;

    .line 55
    .line 56
    invoke-static {v6}, LY/j;->c(LY/j;)Lt/m;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget v6, v6, Lt/m;->b:I

    .line 61
    .line 62
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-ge v1, v4, :cond_3

    .line 67
    .line 68
    iget-object v4, p0, LY/j$a;->f:LY/j;

    .line 69
    .line 70
    invoke-static {v4}, LY/j;->c(LY/j;)Lt/m;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    add-int/lit8 v6, v1, 0x1

    .line 75
    .line 76
    invoke-virtual {v4, v1}, Lt/m;->b(I)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const/16 v7, 0x20

    .line 81
    .line 82
    packed-switch v4, :pswitch_data_0

    .line 83
    .line 84
    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v8, "unknown op: "

    .line 91
    .line 92
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :pswitch_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v7, "reuse "

    .line 110
    .line 111
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    iget-object v7, p0, LY/j$a;->f:LY/j;

    .line 115
    .line 116
    invoke-static {v7}, LY/j;->d(LY/j;)Lt/V;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    add-int/lit8 v8, v3, 0x1

    .line 121
    .line 122
    invoke-virtual {v7, v3}, Lt/V;->c(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    move v3, v8

    .line 134
    goto/16 :goto_2

    .line 135
    .line 136
    :pswitch_1
    iget-object v4, p0, LY/j$a;->f:LY/j;

    .line 137
    .line 138
    invoke-static {v4}, LY/j;->a(LY/j;)Lt/V;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    add-int/lit8 v8, p1, 0x1

    .line 143
    .line 144
    invoke-virtual {v4, p1}, Lt/V;->c(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    const-string v9, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>"

    .line 149
    .line 150
    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const/4 v9, 0x2

    .line 154
    invoke-static {v4, v9}, Lkotlin/jvm/internal/V;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 159
    .line 160
    iget-object v9, p0, LY/j$a;->f:LY/j;

    .line 161
    .line 162
    invoke-static {v9}, LY/j;->a(LY/j;)Lt/V;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    add-int/lit8 p1, p1, 0x2

    .line 167
    .line 168
    invoke-virtual {v9, v8}, Lt/V;->c(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    new-instance v9, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v10, "apply "

    .line 178
    .line 179
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    goto/16 :goto_2

    .line 196
    .line 197
    :pswitch_2
    iget-object v4, p0, LY/j$a;->f:LY/j;

    .line 198
    .line 199
    invoke-static {v4}, LY/j;->c(LY/j;)Lt/m;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    add-int/lit8 v8, v1, 0x2

    .line 204
    .line 205
    invoke-virtual {v4, v6}, Lt/m;->b(I)I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    iget-object v6, p0, LY/j$a;->f:LY/j;

    .line 210
    .line 211
    invoke-static {v6}, LY/j;->a(LY/j;)Lt/V;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    add-int/lit8 v9, p1, 0x1

    .line 216
    .line 217
    invoke-virtual {v6, p1}, Lt/V;->c(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    new-instance v6, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    const-string v10, "insertTopDown "

    .line 227
    .line 228
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    :goto_1
    move v6, v8

    .line 245
    move p1, v9

    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :pswitch_3
    iget-object v4, p0, LY/j$a;->f:LY/j;

    .line 249
    .line 250
    invoke-static {v4}, LY/j;->c(LY/j;)Lt/m;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    add-int/lit8 v8, v1, 0x2

    .line 255
    .line 256
    invoke-virtual {v4, v6}, Lt/m;->b(I)I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    iget-object v6, p0, LY/j$a;->f:LY/j;

    .line 261
    .line 262
    invoke-static {v6}, LY/j;->a(LY/j;)Lt/V;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    add-int/lit8 v9, p1, 0x1

    .line 267
    .line 268
    invoke-virtual {v6, p1}, Lt/V;->c(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    new-instance v6, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const-string v10, "insertBottomUp "

    .line 278
    .line 279
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    goto :goto_1

    .line 296
    :pswitch_4
    const-string v4, "clear"

    .line 297
    .line 298
    goto/16 :goto_2

    .line 299
    .line 300
    :pswitch_5
    iget-object v4, p0, LY/j$a;->f:LY/j;

    .line 301
    .line 302
    invoke-static {v4}, LY/j;->c(LY/j;)Lt/m;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    add-int/lit8 v8, v1, 0x2

    .line 307
    .line 308
    invoke-virtual {v4, v6}, Lt/m;->b(I)I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    iget-object v6, p0, LY/j$a;->f:LY/j;

    .line 313
    .line 314
    invoke-static {v6}, LY/j;->c(LY/j;)Lt/m;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    add-int/lit8 v9, v1, 0x3

    .line 319
    .line 320
    invoke-virtual {v6, v8}, Lt/m;->b(I)I

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    iget-object v8, p0, LY/j$a;->f:LY/j;

    .line 325
    .line 326
    invoke-static {v8}, LY/j;->c(LY/j;)Lt/m;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    add-int/lit8 v10, v1, 0x4

    .line 331
    .line 332
    invoke-virtual {v8, v9}, Lt/m;->b(I)I

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    new-instance v9, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 339
    .line 340
    .line 341
    const-string v11, "move "

    .line 342
    .line 343
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    move v6, v10

    .line 366
    goto :goto_2

    .line 367
    :pswitch_6
    iget-object v4, p0, LY/j$a;->f:LY/j;

    .line 368
    .line 369
    invoke-static {v4}, LY/j;->c(LY/j;)Lt/m;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    add-int/lit8 v8, v1, 0x2

    .line 374
    .line 375
    invoke-virtual {v4, v6}, Lt/m;->b(I)I

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    iget-object v6, p0, LY/j$a;->f:LY/j;

    .line 380
    .line 381
    invoke-static {v6}, LY/j;->c(LY/j;)Lt/m;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    add-int/lit8 v9, v1, 0x3

    .line 386
    .line 387
    invoke-virtual {v6, v8}, Lt/m;->b(I)I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    new-instance v8, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    const-string v10, "remove "

    .line 397
    .line 398
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    move v6, v9

    .line 415
    goto :goto_2

    .line 416
    :pswitch_7
    iget-object v4, p0, LY/j$a;->f:LY/j;

    .line 417
    .line 418
    invoke-static {v4}, LY/j;->a(LY/j;)Lt/V;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    add-int/lit8 v7, p1, 0x1

    .line 423
    .line 424
    invoke-virtual {v4, p1}, Lt/V;->c(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    new-instance v4, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    const-string v8, "down "

    .line 434
    .line 435
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    move p1, v7

    .line 446
    goto :goto_2

    .line 447
    :pswitch_8
    const-string v4, "up"

    .line 448
    .line 449
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    const-string v1, ": "

    .line 458
    .line 459
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    iput-object v5, p0, LY/j$a;->e:Ljava/lang/Object;

    .line 470
    .line 471
    iput v6, p0, LY/j$a;->a:I

    .line 472
    .line 473
    iput p1, p0, LY/j$a;->b:I

    .line 474
    .line 475
    iput v3, p0, LY/j$a;->c:I

    .line 476
    .line 477
    iput v2, p0, LY/j$a;->d:I

    .line 478
    .line 479
    invoke-virtual {v5, v1, p0}, LCf/k;->d(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    if-ne v1, v0, :cond_2

    .line 484
    .line 485
    return-object v0

    .line 486
    :cond_2
    move v1, v6

    .line 487
    goto/16 :goto_0

    .line 488
    .line 489
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 490
    .line 491
    return-object p1

    .line 492
    nop

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
