.class public final Lxe/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/c$a;
    }
.end annotation


# static fields
.field public static final a:Lxe/c;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:LXe/b;

.field private static final g:LXe/c;

.field private static final h:LXe/b;

.field private static final i:LXe/b;

.field private static final j:LXe/b;

.field private static final k:Ljava/util/HashMap;

.field private static final l:Ljava/util/HashMap;

.field private static final m:Ljava/util/HashMap;

.field private static final n:Ljava/util/HashMap;

.field private static final o:Ljava/util/HashMap;

.field private static final p:Ljava/util/HashMap;

.field private static final q:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lxe/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lxe/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxe/c;->a:Lxe/c;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lwe/f$a;->f:Lwe/f$a;

    .line 14
    .line 15
    invoke-virtual {v2}, Lwe/f;->b()LXe/c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v3, 0x2e

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lwe/f;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sput-object v1, Lxe/c;->b:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    sget-object v2, Lwe/f$b;->f:Lwe/f$b;

    .line 46
    .line 47
    invoke-virtual {v2}, Lwe/f;->b()LXe/c;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lwe/f;->a()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    sput-object v1, Lxe/c;->c:Ljava/lang/String;

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    sget-object v2, Lwe/f$d;->f:Lwe/f$d;

    .line 76
    .line 77
    invoke-virtual {v2}, Lwe/f;->b()LXe/c;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Lwe/f;->a()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    sput-object v1, Lxe/c;->d:Ljava/lang/String;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    sget-object v2, Lwe/f$c;->f:Lwe/f$c;

    .line 106
    .line 107
    invoke-virtual {v2}, Lwe/f;->b()LXe/c;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Lwe/f;->a()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    sput-object v1, Lxe/c;->e:Ljava/lang/String;

    .line 129
    .line 130
    sget-object v1, LXe/b;->d:LXe/b$a;

    .line 131
    .line 132
    new-instance v2, LXe/c;

    .line 133
    .line 134
    const-string v4, "kotlin.jvm.functions.FunctionN"

    .line 135
    .line 136
    invoke-direct {v2, v4}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    sput-object v2, Lxe/c;->f:LXe/b;

    .line 144
    .line 145
    invoke-virtual {v2}, LXe/b;->a()LXe/c;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    sput-object v2, Lxe/c;->g:LXe/c;

    .line 150
    .line 151
    sget-object v2, LXe/i;->a:LXe/i;

    .line 152
    .line 153
    invoke-virtual {v2}, LXe/i;->k()LXe/b;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    sput-object v4, Lxe/c;->h:LXe/b;

    .line 158
    .line 159
    invoke-virtual {v2}, LXe/i;->j()LXe/b;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    sput-object v2, Lxe/c;->i:LXe/b;

    .line 164
    .line 165
    const-class v2, Ljava/lang/Class;

    .line 166
    .line 167
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    sput-object v2, Lxe/c;->j:LXe/b;

    .line 172
    .line 173
    new-instance v2, Ljava/util/HashMap;

    .line 174
    .line 175
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 176
    .line 177
    .line 178
    sput-object v2, Lxe/c;->k:Ljava/util/HashMap;

    .line 179
    .line 180
    new-instance v2, Ljava/util/HashMap;

    .line 181
    .line 182
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 183
    .line 184
    .line 185
    sput-object v2, Lxe/c;->l:Ljava/util/HashMap;

    .line 186
    .line 187
    new-instance v2, Ljava/util/HashMap;

    .line 188
    .line 189
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 190
    .line 191
    .line 192
    sput-object v2, Lxe/c;->m:Ljava/util/HashMap;

    .line 193
    .line 194
    new-instance v2, Ljava/util/HashMap;

    .line 195
    .line 196
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 197
    .line 198
    .line 199
    sput-object v2, Lxe/c;->n:Ljava/util/HashMap;

    .line 200
    .line 201
    new-instance v2, Ljava/util/HashMap;

    .line 202
    .line 203
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 204
    .line 205
    .line 206
    sput-object v2, Lxe/c;->o:Ljava/util/HashMap;

    .line 207
    .line 208
    new-instance v2, Ljava/util/HashMap;

    .line 209
    .line 210
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 211
    .line 212
    .line 213
    sput-object v2, Lxe/c;->p:Ljava/util/HashMap;

    .line 214
    .line 215
    sget-object v2, Lve/o$a;->W:LXe/c;

    .line 216
    .line 217
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    sget-object v4, Lve/o$a;->e0:LXe/c;

    .line 222
    .line 223
    new-instance v5, LXe/b;

    .line 224
    .line 225
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-static {v4, v7}, LXe/e;->g(LXe/c;LXe/c;)LXe/c;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    const/4 v7, 0x0

    .line 238
    invoke-direct {v5, v6, v4, v7}, LXe/b;-><init>(LXe/c;LXe/c;Z)V

    .line 239
    .line 240
    .line 241
    new-instance v8, Lxe/c$a;

    .line 242
    .line 243
    const-class v4, Ljava/lang/Iterable;

    .line 244
    .line 245
    invoke-direct {v0, v4}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-direct {v8, v4, v2, v5}, Lxe/c$a;-><init>(LXe/b;LXe/b;LXe/b;)V

    .line 250
    .line 251
    .line 252
    sget-object v2, Lve/o$a;->V:LXe/c;

    .line 253
    .line 254
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    sget-object v4, Lve/o$a;->d0:LXe/c;

    .line 259
    .line 260
    new-instance v5, LXe/b;

    .line 261
    .line 262
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-static {v4, v9}, LXe/e;->g(LXe/c;LXe/c;)LXe/c;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-direct {v5, v6, v4, v7}, LXe/b;-><init>(LXe/c;LXe/c;Z)V

    .line 275
    .line 276
    .line 277
    new-instance v9, Lxe/c$a;

    .line 278
    .line 279
    const-class v4, Ljava/util/Iterator;

    .line 280
    .line 281
    invoke-direct {v0, v4}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-direct {v9, v4, v2, v5}, Lxe/c$a;-><init>(LXe/b;LXe/b;LXe/b;)V

    .line 286
    .line 287
    .line 288
    sget-object v2, Lve/o$a;->X:LXe/c;

    .line 289
    .line 290
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    sget-object v4, Lve/o$a;->f0:LXe/c;

    .line 295
    .line 296
    new-instance v5, LXe/b;

    .line 297
    .line 298
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    invoke-static {v4, v10}, LXe/e;->g(LXe/c;LXe/c;)LXe/c;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-direct {v5, v6, v4, v7}, LXe/b;-><init>(LXe/c;LXe/c;Z)V

    .line 311
    .line 312
    .line 313
    new-instance v10, Lxe/c$a;

    .line 314
    .line 315
    const-class v4, Ljava/util/Collection;

    .line 316
    .line 317
    invoke-direct {v0, v4}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-direct {v10, v4, v2, v5}, Lxe/c$a;-><init>(LXe/b;LXe/b;LXe/b;)V

    .line 322
    .line 323
    .line 324
    sget-object v2, Lve/o$a;->Y:LXe/c;

    .line 325
    .line 326
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    sget-object v4, Lve/o$a;->g0:LXe/c;

    .line 331
    .line 332
    new-instance v5, LXe/b;

    .line 333
    .line 334
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    invoke-static {v4, v11}, LXe/e;->g(LXe/c;LXe/c;)LXe/c;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    invoke-direct {v5, v6, v4, v7}, LXe/b;-><init>(LXe/c;LXe/c;Z)V

    .line 347
    .line 348
    .line 349
    new-instance v11, Lxe/c$a;

    .line 350
    .line 351
    const-class v4, Ljava/util/List;

    .line 352
    .line 353
    invoke-direct {v0, v4}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-direct {v11, v4, v2, v5}, Lxe/c$a;-><init>(LXe/b;LXe/b;LXe/b;)V

    .line 358
    .line 359
    .line 360
    sget-object v2, Lve/o$a;->a0:LXe/c;

    .line 361
    .line 362
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    sget-object v4, Lve/o$a;->i0:LXe/c;

    .line 367
    .line 368
    new-instance v5, LXe/b;

    .line 369
    .line 370
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-static {v4, v12}, LXe/e;->g(LXe/c;LXe/c;)LXe/c;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    invoke-direct {v5, v6, v4, v7}, LXe/b;-><init>(LXe/c;LXe/c;Z)V

    .line 383
    .line 384
    .line 385
    new-instance v12, Lxe/c$a;

    .line 386
    .line 387
    const-class v4, Ljava/util/Set;

    .line 388
    .line 389
    invoke-direct {v0, v4}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-direct {v12, v4, v2, v5}, Lxe/c$a;-><init>(LXe/b;LXe/b;LXe/b;)V

    .line 394
    .line 395
    .line 396
    sget-object v2, Lve/o$a;->Z:LXe/c;

    .line 397
    .line 398
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    sget-object v4, Lve/o$a;->h0:LXe/c;

    .line 403
    .line 404
    new-instance v5, LXe/b;

    .line 405
    .line 406
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    invoke-virtual {v2}, LXe/b;->f()LXe/c;

    .line 411
    .line 412
    .line 413
    move-result-object v13

    .line 414
    invoke-static {v4, v13}, LXe/e;->g(LXe/c;LXe/c;)LXe/c;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-direct {v5, v6, v4, v7}, LXe/b;-><init>(LXe/c;LXe/c;Z)V

    .line 419
    .line 420
    .line 421
    new-instance v13, Lxe/c$a;

    .line 422
    .line 423
    const-class v4, Ljava/util/ListIterator;

    .line 424
    .line 425
    invoke-direct {v0, v4}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    invoke-direct {v13, v4, v2, v5}, Lxe/c$a;-><init>(LXe/b;LXe/b;LXe/b;)V

    .line 430
    .line 431
    .line 432
    sget-object v2, Lve/o$a;->b0:LXe/c;

    .line 433
    .line 434
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    sget-object v5, Lve/o$a;->j0:LXe/c;

    .line 439
    .line 440
    new-instance v6, LXe/b;

    .line 441
    .line 442
    invoke-virtual {v4}, LXe/b;->f()LXe/c;

    .line 443
    .line 444
    .line 445
    move-result-object v14

    .line 446
    invoke-virtual {v4}, LXe/b;->f()LXe/c;

    .line 447
    .line 448
    .line 449
    move-result-object v15

    .line 450
    invoke-static {v5, v15}, LXe/e;->g(LXe/c;LXe/c;)LXe/c;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    invoke-direct {v6, v14, v5, v7}, LXe/b;-><init>(LXe/c;LXe/c;Z)V

    .line 455
    .line 456
    .line 457
    new-instance v14, Lxe/c$a;

    .line 458
    .line 459
    const-class v5, Ljava/util/Map;

    .line 460
    .line 461
    invoke-direct {v0, v5}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    invoke-direct {v14, v5, v4, v6}, Lxe/c$a;-><init>(LXe/b;LXe/b;LXe/b;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    sget-object v2, Lve/o$a;->c0:LXe/c;

    .line 473
    .line 474
    invoke-virtual {v2}, LXe/c;->f()LXe/f;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-virtual {v1, v2}, LXe/b;->d(LXe/f;)LXe/b;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    sget-object v2, Lve/o$a;->k0:LXe/c;

    .line 483
    .line 484
    new-instance v4, LXe/b;

    .line 485
    .line 486
    invoke-virtual {v1}, LXe/b;->f()LXe/c;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    invoke-virtual {v1}, LXe/b;->f()LXe/c;

    .line 491
    .line 492
    .line 493
    move-result-object v6

    .line 494
    invoke-static {v2, v6}, LXe/e;->g(LXe/c;LXe/c;)LXe/c;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    invoke-direct {v4, v5, v2, v7}, LXe/b;-><init>(LXe/c;LXe/c;Z)V

    .line 499
    .line 500
    .line 501
    new-instance v15, Lxe/c$a;

    .line 502
    .line 503
    const-class v2, Ljava/util/Map$Entry;

    .line 504
    .line 505
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    invoke-direct {v15, v2, v1, v4}, Lxe/c$a;-><init>(LXe/b;LXe/b;LXe/b;)V

    .line 510
    .line 511
    .line 512
    filled-new-array/range {v8 .. v15}, [Lxe/c$a;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    sput-object v1, Lxe/c;->q:Ljava/util/List;

    .line 521
    .line 522
    const-class v2, Ljava/lang/Object;

    .line 523
    .line 524
    sget-object v4, Lve/o$a;->b:LXe/d;

    .line 525
    .line 526
    invoke-direct {v0, v2, v4}, Lxe/c;->f(Ljava/lang/Class;LXe/d;)V

    .line 527
    .line 528
    .line 529
    const-class v2, Ljava/lang/String;

    .line 530
    .line 531
    sget-object v4, Lve/o$a;->h:LXe/d;

    .line 532
    .line 533
    invoke-direct {v0, v2, v4}, Lxe/c;->f(Ljava/lang/Class;LXe/d;)V

    .line 534
    .line 535
    .line 536
    const-class v2, Ljava/lang/CharSequence;

    .line 537
    .line 538
    sget-object v4, Lve/o$a;->g:LXe/d;

    .line 539
    .line 540
    invoke-direct {v0, v2, v4}, Lxe/c;->f(Ljava/lang/Class;LXe/d;)V

    .line 541
    .line 542
    .line 543
    const-class v2, Ljava/lang/Throwable;

    .line 544
    .line 545
    sget-object v4, Lve/o$a;->u:LXe/c;

    .line 546
    .line 547
    invoke-direct {v0, v2, v4}, Lxe/c;->e(Ljava/lang/Class;LXe/c;)V

    .line 548
    .line 549
    .line 550
    const-class v2, Ljava/lang/Cloneable;

    .line 551
    .line 552
    sget-object v4, Lve/o$a;->d:LXe/d;

    .line 553
    .line 554
    invoke-direct {v0, v2, v4}, Lxe/c;->f(Ljava/lang/Class;LXe/d;)V

    .line 555
    .line 556
    .line 557
    const-class v2, Ljava/lang/Number;

    .line 558
    .line 559
    sget-object v4, Lve/o$a;->r:LXe/d;

    .line 560
    .line 561
    invoke-direct {v0, v2, v4}, Lxe/c;->f(Ljava/lang/Class;LXe/d;)V

    .line 562
    .line 563
    .line 564
    const-class v2, Ljava/lang/Comparable;

    .line 565
    .line 566
    sget-object v4, Lve/o$a;->v:LXe/c;

    .line 567
    .line 568
    invoke-direct {v0, v2, v4}, Lxe/c;->e(Ljava/lang/Class;LXe/c;)V

    .line 569
    .line 570
    .line 571
    const-class v2, Ljava/lang/Enum;

    .line 572
    .line 573
    sget-object v4, Lve/o$a;->s:LXe/d;

    .line 574
    .line 575
    invoke-direct {v0, v2, v4}, Lxe/c;->f(Ljava/lang/Class;LXe/d;)V

    .line 576
    .line 577
    .line 578
    const-class v2, Ljava/lang/annotation/Annotation;

    .line 579
    .line 580
    sget-object v4, Lve/o$a;->G:LXe/c;

    .line 581
    .line 582
    invoke-direct {v0, v2, v4}, Lxe/c;->e(Ljava/lang/Class;LXe/c;)V

    .line 583
    .line 584
    .line 585
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    if-eqz v1, :cond_0

    .line 594
    .line 595
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v1

    .line 599
    check-cast v1, Lxe/c$a;

    .line 600
    .line 601
    sget-object v2, Lxe/c;->a:Lxe/c;

    .line 602
    .line 603
    invoke-direct {v2, v1}, Lxe/c;->d(Lxe/c$a;)V

    .line 604
    .line 605
    .line 606
    goto :goto_0

    .line 607
    :cond_0
    invoke-static {}, Lgf/e;->values()[Lgf/e;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    array-length v1, v0

    .line 612
    move v2, v7

    .line 613
    :goto_1
    if-ge v2, v1, :cond_1

    .line 614
    .line 615
    aget-object v4, v0, v2

    .line 616
    .line 617
    sget-object v5, Lxe/c;->a:Lxe/c;

    .line 618
    .line 619
    sget-object v6, LXe/b;->d:LXe/b$a;

    .line 620
    .line 621
    invoke-virtual {v4}, Lgf/e;->p()LXe/c;

    .line 622
    .line 623
    .line 624
    move-result-object v8

    .line 625
    const-string v9, "getWrapperFqName(...)"

    .line 626
    .line 627
    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v6, v8}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 631
    .line 632
    .line 633
    move-result-object v8

    .line 634
    invoke-virtual {v4}, Lgf/e;->m()Lve/l;

    .line 635
    .line 636
    .line 637
    move-result-object v4

    .line 638
    const-string v9, "getPrimitiveType(...)"

    .line 639
    .line 640
    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    invoke-static {v4}, Lve/o;->c(Lve/l;)LXe/c;

    .line 644
    .line 645
    .line 646
    move-result-object v4

    .line 647
    invoke-virtual {v6, v4}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-direct {v5, v8, v4}, Lxe/c;->a(LXe/b;LXe/b;)V

    .line 652
    .line 653
    .line 654
    add-int/lit8 v2, v2, 0x1

    .line 655
    .line 656
    goto :goto_1

    .line 657
    :cond_1
    sget-object v0, Lve/d;->a:Lve/d;

    .line 658
    .line 659
    invoke-virtual {v0}, Lve/d;->a()Ljava/util/Set;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    if-eqz v1, :cond_2

    .line 672
    .line 673
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    check-cast v1, LXe/b;

    .line 678
    .line 679
    sget-object v2, Lxe/c;->a:Lxe/c;

    .line 680
    .line 681
    sget-object v4, LXe/b;->d:LXe/b$a;

    .line 682
    .line 683
    new-instance v5, LXe/c;

    .line 684
    .line 685
    new-instance v6, Ljava/lang/StringBuilder;

    .line 686
    .line 687
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 688
    .line 689
    .line 690
    const-string v8, "kotlin.jvm.internal."

    .line 691
    .line 692
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1}, LXe/b;->h()LXe/f;

    .line 696
    .line 697
    .line 698
    move-result-object v8

    .line 699
    invoke-virtual {v8}, LXe/f;->b()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v8

    .line 703
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    const-string v8, "CompanionObject"

    .line 707
    .line 708
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v6

    .line 715
    invoke-direct {v5, v6}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v4, v5}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 719
    .line 720
    .line 721
    move-result-object v4

    .line 722
    sget-object v5, LXe/h;->d:LXe/f;

    .line 723
    .line 724
    invoke-virtual {v1, v5}, LXe/b;->d(LXe/f;)LXe/b;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-direct {v2, v4, v1}, Lxe/c;->a(LXe/b;LXe/b;)V

    .line 729
    .line 730
    .line 731
    goto :goto_2

    .line 732
    :cond_2
    move v0, v7

    .line 733
    :goto_3
    const/16 v1, 0x17

    .line 734
    .line 735
    if-ge v0, v1, :cond_3

    .line 736
    .line 737
    sget-object v1, Lxe/c;->a:Lxe/c;

    .line 738
    .line 739
    sget-object v2, LXe/b;->d:LXe/b$a;

    .line 740
    .line 741
    new-instance v4, LXe/c;

    .line 742
    .line 743
    new-instance v5, Ljava/lang/StringBuilder;

    .line 744
    .line 745
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 746
    .line 747
    .line 748
    const-string v6, "kotlin.jvm.functions.Function"

    .line 749
    .line 750
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v5

    .line 760
    invoke-direct {v4, v5}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2, v4}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    invoke-static {v0}, Lve/o;->a(I)LXe/b;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    invoke-direct {v1, v2, v4}, Lxe/c;->a(LXe/b;LXe/b;)V

    .line 772
    .line 773
    .line 774
    new-instance v2, LXe/c;

    .line 775
    .line 776
    new-instance v4, Ljava/lang/StringBuilder;

    .line 777
    .line 778
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 779
    .line 780
    .line 781
    sget-object v5, Lxe/c;->c:Ljava/lang/String;

    .line 782
    .line 783
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v4

    .line 793
    invoke-direct {v2, v4}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    sget-object v4, Lxe/c;->h:LXe/b;

    .line 797
    .line 798
    invoke-direct {v1, v2, v4}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 799
    .line 800
    .line 801
    add-int/lit8 v0, v0, 0x1

    .line 802
    .line 803
    goto :goto_3

    .line 804
    :cond_3
    :goto_4
    const/16 v0, 0x16

    .line 805
    .line 806
    if-ge v7, v0, :cond_4

    .line 807
    .line 808
    sget-object v0, Lwe/f$c;->f:Lwe/f$c;

    .line 809
    .line 810
    new-instance v1, Ljava/lang/StringBuilder;

    .line 811
    .line 812
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v0}, Lwe/f;->b()LXe/c;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v0}, Lwe/f;->a()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    sget-object v1, Lxe/c;->a:Lxe/c;

    .line 837
    .line 838
    new-instance v2, LXe/c;

    .line 839
    .line 840
    new-instance v4, Ljava/lang/StringBuilder;

    .line 841
    .line 842
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-direct {v2, v0}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    sget-object v0, Lxe/c;->h:LXe/b;

    .line 859
    .line 860
    invoke-direct {v1, v2, v0}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 861
    .line 862
    .line 863
    add-int/lit8 v7, v7, 0x1

    .line 864
    .line 865
    goto :goto_4

    .line 866
    :cond_4
    sget-object v0, Lxe/c;->a:Lxe/c;

    .line 867
    .line 868
    new-instance v1, LXe/c;

    .line 869
    .line 870
    const-string v2, "kotlin.concurrent.atomics.AtomicInt"

    .line 871
    .line 872
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    const-class v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 876
    .line 877
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    invoke-direct {v0, v1, v2}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 882
    .line 883
    .line 884
    new-instance v1, LXe/c;

    .line 885
    .line 886
    const-string v2, "kotlin.concurrent.atomics.AtomicLong"

    .line 887
    .line 888
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    const-class v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 892
    .line 893
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    invoke-direct {v0, v1, v2}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 898
    .line 899
    .line 900
    new-instance v1, LXe/c;

    .line 901
    .line 902
    const-string v2, "kotlin.concurrent.atomics.AtomicBoolean"

    .line 903
    .line 904
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    const-class v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 908
    .line 909
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    invoke-direct {v0, v1, v2}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 914
    .line 915
    .line 916
    new-instance v1, LXe/c;

    .line 917
    .line 918
    const-string v2, "kotlin.concurrent.atomics.AtomicReference"

    .line 919
    .line 920
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    const-class v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 924
    .line 925
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    invoke-direct {v0, v1, v2}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 930
    .line 931
    .line 932
    new-instance v1, LXe/c;

    .line 933
    .line 934
    const-string v2, "kotlin.concurrent.atomics.AtomicIntArray"

    .line 935
    .line 936
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    const-class v2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 940
    .line 941
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 942
    .line 943
    .line 944
    move-result-object v2

    .line 945
    invoke-direct {v0, v1, v2}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 946
    .line 947
    .line 948
    new-instance v1, LXe/c;

    .line 949
    .line 950
    const-string v2, "kotlin.concurrent.atomics.AtomicLongArray"

    .line 951
    .line 952
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 953
    .line 954
    .line 955
    const-class v2, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 956
    .line 957
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    invoke-direct {v0, v1, v2}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 962
    .line 963
    .line 964
    new-instance v1, LXe/c;

    .line 965
    .line 966
    const-string v2, "kotlin.concurrent.atomics.AtomicArray"

    .line 967
    .line 968
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    const-class v2, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 972
    .line 973
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 974
    .line 975
    .line 976
    move-result-object v2

    .line 977
    invoke-direct {v0, v1, v2}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 978
    .line 979
    .line 980
    sget-object v1, Lve/o$a;->c:LXe/d;

    .line 981
    .line 982
    invoke-virtual {v1}, LXe/d;->m()LXe/c;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    const-class v2, Ljava/lang/Void;

    .line 987
    .line 988
    invoke-direct {v0, v2}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 989
    .line 990
    .line 991
    move-result-object v2

    .line 992
    invoke-direct {v0, v1, v2}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 993
    .line 994
    .line 995
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

.method private final a(LXe/b;LXe/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lxe/c;->b(LXe/b;LXe/b;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LXe/b;->a()LXe/c;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-direct {p0, p2, p1}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final b(LXe/b;LXe/b;)V
    .locals 1

    .line 1
    sget-object v0, Lxe/c;->k:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, LXe/b;->a()LXe/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, LXe/c;->i()LXe/d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final c(LXe/c;LXe/b;)V
    .locals 1

    .line 1
    sget-object v0, Lxe/c;->l:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, LXe/c;->i()LXe/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final d(Lxe/c$a;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lxe/c$a;->a()LXe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lxe/c$a;->b()LXe/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lxe/c$a;->c()LXe/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, v0, v1}, Lxe/c;->a(LXe/b;LXe/b;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, LXe/b;->a()LXe/c;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {p0, v2, v0}, Lxe/c;->c(LXe/c;LXe/b;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lxe/c;->o:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object v0, Lxe/c;->p:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, LXe/b;->a()LXe/c;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, LXe/b;->a()LXe/c;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sget-object v2, Lxe/c;->m:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {p1}, LXe/b;->a()LXe/c;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, LXe/c;->i()LXe/d;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object p1, Lxe/c;->n:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v0}, LXe/c;->i()LXe/d;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private final e(Ljava/lang/Class;LXe/c;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, LXe/b;->d:LXe/b$a;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {p0, p1, p2}, Lxe/c;->a(LXe/b;LXe/b;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final f(Ljava/lang/Class;LXe/d;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, LXe/d;->m()LXe/c;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lxe/c;->e(Ljava/lang/Class;LXe/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final g(Ljava/lang/Class;)LXe/b;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget-object v0, LXe/b;->d:LXe/b$a;

    .line 18
    .line 19
    new-instance v1, LXe/c;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v2, "getCanonicalName(...)"

    .line 26
    .line 27
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, p1}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, LXe/b$a;->c(LXe/c;)LXe/b;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-direct {p0, v0}, Lxe/c;->g(Ljava/lang/Class;)LXe/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v1, "identifier(...)"

    .line 51
    .line 52
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, LXe/b;->d(LXe/f;)LXe/b;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method private final j(LXe/d;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, LXe/d;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p1, p2, v0, v1, v2}, LDf/r;->Q(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "substring(...)"

    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/16 p2, 0x30

    .line 29
    .line 30
    invoke-static {p1, p2, v0, v1, v2}, LDf/r;->Q0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, LDf/r;->r(Ljava/lang/String;)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/16 p2, 0x17

    .line 47
    .line 48
    if-lt p1, p2, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    return v0
.end method


# virtual methods
.method public final h()LXe/c;
    .locals 1

    .line 1
    sget-object v0, Lxe/c;->g:LXe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lxe/c;->q:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(LXe/d;)Z
    .locals 1

    .line 1
    sget-object v0, Lxe/c;->m:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l(LXe/d;)Z
    .locals 1

    .line 1
    sget-object v0, Lxe/c;->n:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final m(LXe/c;)LXe/b;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxe/c;->k:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p1}, LXe/c;->i()LXe/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LXe/b;

    .line 17
    .line 18
    return-object p1
.end method

.method public final n(LXe/d;)LXe/b;
    .locals 1

    .line 1
    const-string v0, "kotlinFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxe/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Lxe/c;->j(LXe/d;Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p1, Lxe/c;->f:LXe/b;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object v0, Lxe/c;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, Lxe/c;->j(LXe/d;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object p1, Lxe/c;->f:LXe/b;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    sget-object v0, Lxe/c;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {p0, p1, v0}, Lxe/c;->j(LXe/d;Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    sget-object p1, Lxe/c;->h:LXe/b;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_2
    sget-object v0, Lxe/c;->e:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {p0, p1, v0}, Lxe/c;->j(LXe/d;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object p1, Lxe/c;->h:LXe/b;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_3
    sget-object v0, Lxe/c;->l:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, LXe/b;

    .line 57
    .line 58
    return-object p1
.end method

.method public final o(LXe/d;)LXe/c;
    .locals 1

    .line 1
    sget-object v0, Lxe/c;->m:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LXe/c;

    .line 8
    .line 9
    return-object p1
.end method

.method public final p(LXe/d;)LXe/c;
    .locals 1

    .line 1
    sget-object v0, Lxe/c;->n:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LXe/c;

    .line 8
    .line 9
    return-object p1
.end method
