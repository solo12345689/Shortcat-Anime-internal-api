.class public final Lxc/a;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lxc/a;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "expo-linear-gradient_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 17

    .line 1
    const-class v0, Ljava/lang/Boolean;

    .line 2
    .line 3
    const-class v1, [I

    .line 4
    .line 5
    const-class v2, Lxc/b;

    .line 6
    .line 7
    const-class v3, Lkotlin/Pair;

    .line 8
    .line 9
    const-class v4, [F

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v5, ".ModuleDefinition"

    .line 24
    .line 25
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v6, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v7, "["

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v7, "ExpoModulesCore"

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v7, "] "

    .line 48
    .line 49
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v5}, LX3/a;->c(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :try_start_0
    new-instance v5, Lgc/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 63
    .line 64
    move-object/from16 v6, p0

    .line 65
    .line 66
    :try_start_1
    invoke-direct {v5, v6}, Lgc/d;-><init>(Lgc/c;)V

    .line 67
    .line 68
    .line 69
    const-string v7, "ExpoLinearGradient"

    .line 70
    .line 71
    invoke-virtual {v5, v7}, Lgc/a;->s(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    new-instance v8, Lexpo/modules/kotlin/views/p;

    .line 79
    .line 80
    new-instance v9, Lpc/M;

    .line 81
    .line 82
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    sget-object v12, Lxc/a$g;->a:Lxc/a$g;

    .line 87
    .line 88
    const/4 v13, 0x2

    .line 89
    const/4 v14, 0x0

    .line 90
    const/4 v11, 0x0

    .line 91
    invoke-direct/range {v9 .. v14}, Lpc/M;-><init>(Lpe/d;ZLie/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5}, Lhc/f;->m()Lpc/X;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-direct {v8, v7, v9, v2}, Lexpo/modules/kotlin/views/p;-><init>(Lpe/d;Lpe/q;Lpc/X;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v8}, Lwc/b;->g(Lexpo/modules/kotlin/views/p;)V

    .line 102
    .line 103
    .line 104
    const-string v2, "colors"

    .line 105
    .line 106
    sget-object v7, Lxc/a$a;->a:Lxc/a$a;

    .line 107
    .line 108
    invoke-virtual {v8}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    new-instance v10, Lexpo/modules/kotlin/views/c;

    .line 113
    .line 114
    sget-object v11, Lpc/d;->a:Lpc/d;

    .line 115
    .line 116
    new-instance v12, Lkotlin/Pair;

    .line 117
    .line 118
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    check-cast v12, Lpc/b;

    .line 136
    .line 137
    if-nez v12, :cond_0

    .line 138
    .line 139
    sget-object v12, Lxc/a$h;->a:Lxc/a$h;

    .line 140
    .line 141
    new-instance v14, Lpc/b;

    .line 142
    .line 143
    new-instance v15, Lpc/M;

    .line 144
    .line 145
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const/4 v13, 0x0

    .line 150
    invoke-direct {v15, v1, v13, v12}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 151
    .line 152
    .line 153
    const/4 v1, 0x0

    .line 154
    invoke-direct {v14, v15, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 155
    .line 156
    .line 157
    move-object v12, v14

    .line 158
    goto :goto_0

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    goto/16 :goto_2

    .line 161
    .line 162
    :cond_0
    :goto_0
    invoke-direct {v10, v2, v12, v7}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v9, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    const-string v1, "locations"

    .line 169
    .line 170
    sget-object v2, Lxc/a$b;->a:Lxc/a$b;

    .line 171
    .line 172
    invoke-virtual {v8}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    new-instance v9, Lexpo/modules/kotlin/views/c;

    .line 177
    .line 178
    new-instance v10, Lkotlin/Pair;

    .line 179
    .line 180
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-direct {v10, v12, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    check-cast v10, Lpc/b;

    .line 198
    .line 199
    const/4 v12, 0x1

    .line 200
    if-nez v10, :cond_1

    .line 201
    .line 202
    sget-object v10, Lxc/a$i;->a:Lxc/a$i;

    .line 203
    .line 204
    new-instance v14, Lpc/b;

    .line 205
    .line 206
    new-instance v15, Lpc/M;

    .line 207
    .line 208
    move-object/from16 v16, v0

    .line 209
    .line 210
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-direct {v15, v0, v12, v10}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 215
    .line 216
    .line 217
    const/4 v0, 0x0

    .line 218
    invoke-direct {v14, v15, v0}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 219
    .line 220
    .line 221
    move-object v10, v14

    .line 222
    goto :goto_1

    .line 223
    :cond_1
    move-object/from16 v16, v0

    .line 224
    .line 225
    :goto_1
    invoke-direct {v9, v1, v10, v2}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v7, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    const-string v0, "startPoint"

    .line 232
    .line 233
    sget-object v1, Lxc/a$c;->a:Lxc/a$c;

    .line 234
    .line 235
    invoke-virtual {v8}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    new-instance v7, Lexpo/modules/kotlin/views/c;

    .line 240
    .line 241
    new-instance v9, Lkotlin/Pair;

    .line 242
    .line 243
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    invoke-direct {v9, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    check-cast v9, Lpc/b;

    .line 259
    .line 260
    if-nez v9, :cond_2

    .line 261
    .line 262
    sget-object v9, Lxc/a$j;->a:Lxc/a$j;

    .line 263
    .line 264
    new-instance v10, Lpc/b;

    .line 265
    .line 266
    new-instance v14, Lpc/M;

    .line 267
    .line 268
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 269
    .line 270
    .line 271
    move-result-object v15

    .line 272
    invoke-direct {v14, v15, v12, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 273
    .line 274
    .line 275
    const/4 v9, 0x0

    .line 276
    invoke-direct {v10, v14, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 277
    .line 278
    .line 279
    move-object v9, v10

    .line 280
    :cond_2
    invoke-direct {v7, v0, v9, v1}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 281
    .line 282
    .line 283
    invoke-interface {v2, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    const-string v0, "endPoint"

    .line 287
    .line 288
    sget-object v1, Lxc/a$d;->a:Lxc/a$d;

    .line 289
    .line 290
    invoke-virtual {v8}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    new-instance v7, Lexpo/modules/kotlin/views/c;

    .line 295
    .line 296
    new-instance v9, Lkotlin/Pair;

    .line 297
    .line 298
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    invoke-direct {v9, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 306
    .line 307
    .line 308
    move-result-object v10

    .line 309
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    check-cast v9, Lpc/b;

    .line 314
    .line 315
    if-nez v9, :cond_3

    .line 316
    .line 317
    sget-object v9, Lxc/a$k;->a:Lxc/a$k;

    .line 318
    .line 319
    new-instance v10, Lpc/b;

    .line 320
    .line 321
    new-instance v14, Lpc/M;

    .line 322
    .line 323
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    invoke-direct {v14, v3, v12, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 328
    .line 329
    .line 330
    const/4 v9, 0x0

    .line 331
    invoke-direct {v10, v14, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 332
    .line 333
    .line 334
    move-object v9, v10

    .line 335
    :cond_3
    invoke-direct {v7, v0, v9, v1}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v2, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    const-string v0, "borderRadii"

    .line 342
    .line 343
    sget-object v1, Lxc/a$e;->a:Lxc/a$e;

    .line 344
    .line 345
    invoke-virtual {v8}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    new-instance v3, Lexpo/modules/kotlin/views/c;

    .line 350
    .line 351
    new-instance v7, Lkotlin/Pair;

    .line 352
    .line 353
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    invoke-direct {v7, v9, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    check-cast v7, Lpc/b;

    .line 369
    .line 370
    if-nez v7, :cond_4

    .line 371
    .line 372
    sget-object v7, Lxc/a$l;->a:Lxc/a$l;

    .line 373
    .line 374
    new-instance v9, Lpc/b;

    .line 375
    .line 376
    new-instance v10, Lpc/M;

    .line 377
    .line 378
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    invoke-direct {v10, v4, v12, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 383
    .line 384
    .line 385
    const/4 v4, 0x0

    .line 386
    invoke-direct {v9, v10, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 387
    .line 388
    .line 389
    move-object v7, v9

    .line 390
    :cond_4
    invoke-direct {v3, v0, v7, v1}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 391
    .line 392
    .line 393
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    const-string v0, "dither"

    .line 397
    .line 398
    sget-object v1, Lxc/a$f;->a:Lxc/a$f;

    .line 399
    .line 400
    invoke-virtual {v8}, Lexpo/modules/kotlin/views/p;->h()Ljava/util/Map;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    new-instance v3, Lexpo/modules/kotlin/views/c;

    .line 405
    .line 406
    new-instance v4, Lkotlin/Pair;

    .line 407
    .line 408
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    invoke-direct {v4, v7, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v11}, Lpc/d;->a()Ljava/util/Map;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    check-cast v4, Lpc/b;

    .line 424
    .line 425
    if-nez v4, :cond_5

    .line 426
    .line 427
    sget-object v4, Lxc/a$m;->a:Lxc/a$m;

    .line 428
    .line 429
    new-instance v7, Lpc/b;

    .line 430
    .line 431
    new-instance v9, Lpc/M;

    .line 432
    .line 433
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 434
    .line 435
    .line 436
    move-result-object v10

    .line 437
    invoke-direct {v9, v10, v12, v4}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 438
    .line 439
    .line 440
    const/4 v4, 0x0

    .line 441
    invoke-direct {v7, v9, v4}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 442
    .line 443
    .line 444
    move-object v4, v7

    .line 445
    :cond_5
    invoke-direct {v3, v0, v4, v1}, Lexpo/modules/kotlin/views/c;-><init>(Ljava/lang/String;Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 446
    .line 447
    .line 448
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v8}, Lexpo/modules/kotlin/views/p;->c()Lexpo/modules/kotlin/views/r;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v5, v0}, Lgc/a;->y(Lexpo/modules/kotlin/views/r;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v5}, Lgc/a;->u()Lgc/e;

    .line 459
    .line 460
    .line 461
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 462
    invoke-static {}, LX3/a;->f()V

    .line 463
    .line 464
    .line 465
    return-object v0

    .line 466
    :catchall_1
    move-exception v0

    .line 467
    move-object/from16 v6, p0

    .line 468
    .line 469
    :goto_2
    invoke-static {}, LX3/a;->f()V

    .line 470
    .line 471
    .line 472
    throw v0
.end method
