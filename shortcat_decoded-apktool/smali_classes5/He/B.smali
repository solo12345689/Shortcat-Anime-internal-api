.class public abstract LHe/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LXe/c;

.field private static final b:LXe/c;

.field private static final c:LXe/c;

.field private static final d:LXe/c;

.field private static final e:Ljava/lang/String;

.field private static final f:[LXe/c;

.field private static final g:LHe/K;

.field private static final h:LHe/C;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    .line 1
    new-instance v0, LXe/c;

    .line 2
    .line 3
    const-string v1, "org.jspecify.nullness"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LHe/B;->a:LXe/c;

    .line 9
    .line 10
    new-instance v1, LXe/c;

    .line 11
    .line 12
    const-string v2, "org.jspecify.annotations"

    .line 13
    .line 14
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, LHe/B;->b:LXe/c;

    .line 18
    .line 19
    new-instance v2, LXe/c;

    .line 20
    .line 21
    const-string v3, "io.reactivex.rxjava3.annotations"

    .line 22
    .line 23
    invoke-direct {v2, v3}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v2, LHe/B;->c:LXe/c;

    .line 27
    .line 28
    new-instance v3, LXe/c;

    .line 29
    .line 30
    const-string v4, "org.checkerframework.checker.nullness.compatqual"

    .line 31
    .line 32
    invoke-direct {v3, v4}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v3, LHe/B;->d:LXe/c;

    .line 36
    .line 37
    invoke-virtual {v2}, LXe/c;->a()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    sput-object v4, LHe/B;->e:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v5, LXe/c;

    .line 44
    .line 45
    new-instance v6, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v7, ".Nullable"

    .line 54
    .line 55
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-direct {v5, v6}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v6, LXe/c;

    .line 66
    .line 67
    new-instance v7, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v4, ".NonNull"

    .line 76
    .line 77
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-direct {v6, v4}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    filled-new-array {v5, v6}, [LXe/c;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    sput-object v4, LHe/B;->f:[LXe/c;

    .line 92
    .line 93
    new-instance v4, LHe/M;

    .line 94
    .line 95
    new-instance v5, LXe/c;

    .line 96
    .line 97
    const-string v6, "org.jetbrains.annotations"

    .line 98
    .line 99
    invoke-direct {v5, v6}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget-object v6, LHe/C;->d:LHe/C$a;

    .line 103
    .line 104
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-static {v5, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    new-instance v5, LXe/c;

    .line 113
    .line 114
    const-string v7, "androidx.annotation"

    .line 115
    .line 116
    invoke-direct {v5, v7}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-static {v5, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    new-instance v5, LXe/c;

    .line 128
    .line 129
    const-string v7, "android.support.annotation"

    .line 130
    .line 131
    invoke-direct {v5, v7}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-static {v5, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    new-instance v5, LXe/c;

    .line 143
    .line 144
    const-string v7, "android.annotation"

    .line 145
    .line 146
    invoke-direct {v5, v7}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-static {v5, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    new-instance v5, LXe/c;

    .line 158
    .line 159
    const-string v7, "com.android.annotations"

    .line 160
    .line 161
    invoke-direct {v5, v7}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-static {v5, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    new-instance v5, LXe/c;

    .line 173
    .line 174
    const-string v7, "org.eclipse.jdt.annotation"

    .line 175
    .line 176
    invoke-direct {v5, v7}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-static {v5, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    new-instance v5, LXe/c;

    .line 188
    .line 189
    const-string v7, "org.checkerframework.checker.nullness.qual"

    .line 190
    .line 191
    invoke-direct {v5, v7}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-static {v5, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 207
    .line 208
    .line 209
    move-result-object v15

    .line 210
    new-instance v3, LXe/c;

    .line 211
    .line 212
    const-string v5, "javax.annotation"

    .line 213
    .line 214
    invoke-direct {v3, v5}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 222
    .line 223
    .line 224
    move-result-object v16

    .line 225
    new-instance v3, LXe/c;

    .line 226
    .line 227
    const-string v5, "edu.umd.cs.findbugs.annotations"

    .line 228
    .line 229
    invoke-direct {v3, v5}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 237
    .line 238
    .line 239
    move-result-object v17

    .line 240
    new-instance v3, LXe/c;

    .line 241
    .line 242
    const-string v5, "io.reactivex.annotations"

    .line 243
    .line 244
    invoke-direct {v3, v5}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 252
    .line 253
    .line 254
    move-result-object v18

    .line 255
    new-instance v3, LXe/c;

    .line 256
    .line 257
    const-string v5, "androidx.annotation.RecentlyNullable"

    .line 258
    .line 259
    invoke-direct {v3, v5}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    new-instance v19, LHe/C;

    .line 263
    .line 264
    sget-object v21, LHe/O;->d:LHe/O;

    .line 265
    .line 266
    const/16 v23, 0x4

    .line 267
    .line 268
    const/16 v24, 0x0

    .line 269
    .line 270
    move-object/from16 v20, v21

    .line 271
    .line 272
    const/16 v21, 0x0

    .line 273
    .line 274
    const/16 v22, 0x0

    .line 275
    .line 276
    invoke-direct/range {v19 .. v24}, LHe/C;-><init>(LHe/O;LTd/l;LHe/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v5, v19

    .line 280
    .line 281
    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 282
    .line 283
    .line 284
    move-result-object v19

    .line 285
    new-instance v3, LXe/c;

    .line 286
    .line 287
    const-string v5, "androidx.annotation.RecentlyNonNull"

    .line 288
    .line 289
    invoke-direct {v3, v5}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    move-object/from16 v21, v20

    .line 293
    .line 294
    new-instance v20, LHe/C;

    .line 295
    .line 296
    const/16 v24, 0x4

    .line 297
    .line 298
    const/16 v25, 0x0

    .line 299
    .line 300
    const/16 v23, 0x0

    .line 301
    .line 302
    invoke-direct/range {v20 .. v25}, LHe/C;-><init>(LHe/O;LTd/l;LHe/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v7, v20

    .line 306
    .line 307
    move-object/from16 v5, v21

    .line 308
    .line 309
    invoke-static {v3, v7}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 310
    .line 311
    .line 312
    move-result-object v20

    .line 313
    new-instance v3, LXe/c;

    .line 314
    .line 315
    const-string v7, "lombok"

    .line 316
    .line 317
    invoke-direct {v3, v7}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6}, LHe/C$a;->a()LHe/C;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    invoke-static {v3, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 325
    .line 326
    .line 327
    move-result-object v21

    .line 328
    new-instance v3, LHe/C;

    .line 329
    .line 330
    new-instance v6, LTd/l;

    .line 331
    .line 332
    const/4 v7, 0x2

    .line 333
    move-object/from16 v22, v8

    .line 334
    .line 335
    const/4 v8, 0x1

    .line 336
    invoke-direct {v6, v7, v8}, LTd/l;-><init>(II)V

    .line 337
    .line 338
    .line 339
    sget-object v7, LHe/O;->e:LHe/O;

    .line 340
    .line 341
    invoke-direct {v3, v5, v6, v7}, LHe/C;-><init>(LHe/O;LTd/l;LHe/O;)V

    .line 342
    .line 343
    .line 344
    invoke-static {v0, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    new-instance v3, LHe/C;

    .line 349
    .line 350
    new-instance v6, LTd/l;

    .line 351
    .line 352
    move-object/from16 v24, v0

    .line 353
    .line 354
    const/4 v0, 0x2

    .line 355
    invoke-direct {v6, v0, v8}, LTd/l;-><init>(II)V

    .line 356
    .line 357
    .line 358
    invoke-direct {v3, v5, v6, v7}, LHe/C;-><init>(LHe/O;LTd/l;LHe/O;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 362
    .line 363
    .line 364
    move-result-object v23

    .line 365
    new-instance v0, LHe/C;

    .line 366
    .line 367
    new-instance v1, LTd/l;

    .line 368
    .line 369
    const/16 v3, 0x8

    .line 370
    .line 371
    invoke-direct {v1, v8, v3}, LTd/l;-><init>(II)V

    .line 372
    .line 373
    .line 374
    invoke-direct {v0, v5, v1, v7}, LHe/C;-><init>(LHe/O;LTd/l;LHe/O;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v2, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    move-object/from16 v8, v22

    .line 382
    .line 383
    move-object/from16 v22, v24

    .line 384
    .line 385
    move-object/from16 v24, v0

    .line 386
    .line 387
    filled-new-array/range {v8 .. v24}, [Lkotlin/Pair;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-direct {v4, v0}, LHe/M;-><init>(Ljava/util/Map;)V

    .line 396
    .line 397
    .line 398
    sput-object v4, LHe/B;->g:LHe/K;

    .line 399
    .line 400
    new-instance v20, LHe/C;

    .line 401
    .line 402
    const/16 v24, 0x4

    .line 403
    .line 404
    const/16 v22, 0x0

    .line 405
    .line 406
    const/16 v23, 0x0

    .line 407
    .line 408
    move-object/from16 v21, v5

    .line 409
    .line 410
    invoke-direct/range {v20 .. v25}, LHe/C;-><init>(LHe/O;LTd/l;LHe/O;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 411
    .line 412
    .line 413
    sput-object v20, LHe/B;->h:LHe/C;

    .line 414
    .line 415
    return-void
.end method

.method public static final a(LTd/l;)LHe/G;
    .locals 6

    .line 1
    const-string v0, "configuredKotlinVersion"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LHe/B;->h:LHe/C;

    .line 7
    .line 8
    invoke-virtual {v0}, LHe/C;->d()LTd/l;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, LHe/C;->d()LTd/l;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p0}, LTd/l;->a(LTd/l;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-gtz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, LHe/C;->b()LHe/O;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    move-object v1, p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {v0}, LHe/C;->c()LHe/O;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    invoke-static {v1}, LHe/B;->c(LHe/O;)LHe/O;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v0, LHe/G;

    .line 40
    .line 41
    const/4 v4, 0x4

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct/range {v0 .. v5}, LHe/G;-><init>(LHe/O;LHe/O;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public static synthetic b(LTd/l;ILjava/lang/Object;)LHe/G;
    .locals 0

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object p0, LTd/l;->f:LTd/l;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0}, LHe/B;->a(LTd/l;)LHe/G;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final c(LHe/O;)LHe/O;
    .locals 1

    .line 1
    const-string v0, "globalReportLevel"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LHe/O;->d:LHe/O;

    .line 7
    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    return-object p0
.end method

.method public static final d(LXe/c;)LHe/O;
    .locals 3

    .line 1
    const-string v0, "annotationFqName"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LHe/K;->a:LHe/K$a;

    .line 7
    .line 8
    invoke-virtual {v0}, LHe/K$a;->a()LHe/K;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x4

    .line 14
    invoke-static {p0, v0, v1, v2, v1}, LHe/B;->h(LXe/c;LHe/K;LTd/l;ILjava/lang/Object;)LHe/O;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final e()LXe/c;
    .locals 1

    .line 1
    sget-object v0, LHe/B;->b:LXe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final f()[LXe/c;
    .locals 1

    .line 1
    sget-object v0, LHe/B;->f:[LXe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final g(LXe/c;LHe/K;LTd/l;)LHe/O;
    .locals 1

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "configuredReportLevels"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "configuredKotlinVersion"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, LHe/K;->a(LXe/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, LHe/O;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, LHe/B;->g:LHe/K;

    .line 26
    .line 27
    invoke-interface {p1, p0}, LHe/K;->a(LXe/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, LHe/C;

    .line 32
    .line 33
    if-nez p0, :cond_1

    .line 34
    .line 35
    sget-object p0, LHe/O;->c:LHe/O;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-virtual {p0}, LHe/C;->d()LTd/l;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, LHe/C;->d()LTd/l;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1, p2}, LTd/l;->a(LTd/l;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-gtz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, LHe/C;->b()LHe/O;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-virtual {p0}, LHe/C;->c()LHe/O;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static synthetic h(LXe/c;LHe/K;LTd/l;ILjava/lang/Object;)LHe/O;
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance p2, LTd/l;

    .line 6
    .line 7
    const/4 p3, 0x7

    .line 8
    const/16 p4, 0x14

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, v0, p3, p4}, LTd/l;-><init>(III)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0, p1, p2}, LHe/B;->g(LXe/c;LHe/K;LTd/l;)LHe/O;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
