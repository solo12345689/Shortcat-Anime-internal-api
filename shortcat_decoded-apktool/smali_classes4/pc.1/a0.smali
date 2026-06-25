.class public final Lpc/a0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lpc/X;


# static fields
.field public static final a:Lpc/a0;

.field private static final b:Ljava/util/Map;

.field private static final c:Ljava/util/Map;

.field private static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lpc/a0;

    .line 2
    .line 3
    invoke-direct {v0}, Lpc/a0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpc/a0;->a:Lpc/a0;

    .line 7
    .line 8
    invoke-direct {v0}, Lpc/a0;->b()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sput-object v1, Lpc/a0;->b:Ljava/util/Map;

    .line 13
    .line 14
    invoke-direct {v0}, Lpc/a0;->c()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lpc/a0;->c:Ljava/util/Map;

    .line 19
    .line 20
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lpc/a0;->d:Ljava/util/Map;

    .line 26
    .line 27
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

.method private final b()Ljava/util/Map;
    .locals 47

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    sget-object v1, Lec/a;->e:Lec/a;

    .line 4
    .line 5
    filled-new-array {v1}, [Lec/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lpc/a0$a;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lpc/a0$a;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 18
    .line 19
    sget-object v2, Lec/a;->f:Lec/a;

    .line 20
    .line 21
    filled-new-array {v2}, [Lec/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v0, v2}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lpc/a0$b;

    .line 29
    .line 30
    invoke-direct {v2, v0}, Lpc/a0$b;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 34
    .line 35
    sget-object v3, Lec/a;->d:Lec/a;

    .line 36
    .line 37
    filled-new-array {v3}, [Lec/a;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-direct {v0, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Lpc/a0$c;

    .line 45
    .line 46
    invoke-direct {v3, v0}, Lpc/a0$c;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 50
    .line 51
    sget-object v4, Lec/a;->g:Lec/a;

    .line 52
    .line 53
    filled-new-array {v4}, [Lec/a;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-direct {v0, v4}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 58
    .line 59
    .line 60
    new-instance v4, Lpc/a0$d;

    .line 61
    .line 62
    invoke-direct {v4, v0}, Lpc/a0$d;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 66
    .line 67
    sget-object v5, Lec/a;->h:Lec/a;

    .line 68
    .line 69
    filled-new-array {v5}, [Lec/a;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-direct {v0, v5}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 74
    .line 75
    .line 76
    new-instance v5, Lpc/a0$e;

    .line 77
    .line 78
    invoke-direct {v5, v0}, Lpc/a0$e;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Ltc/a;

    .line 82
    .line 83
    invoke-direct {v0}, Ltc/a;-><init>()V

    .line 84
    .line 85
    .line 86
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-static {v6, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const-class v6, Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-static {v6}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-static {v6, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    const-class v1, Ljava/lang/Long;

    .line 117
    .line 118
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 127
    .line 128
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    const-class v1, Ljava/lang/Double;

    .line 137
    .line 138
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 147
    .line 148
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v1, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    const-class v1, Ljava/lang/Float;

    .line 157
    .line 158
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 167
    .line 168
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-static {v1, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    const-class v1, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v1, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 183
    .line 184
    .line 185
    move-result-object v16

    .line 186
    const-class v1, Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 193
    .line 194
    sget-object v3, Lec/a;->i:Lec/a;

    .line 195
    .line 196
    filled-new-array {v3}, [Lec/a;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-direct {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 201
    .line 202
    .line 203
    new-instance v3, Lpc/a0$f;

    .line 204
    .line 205
    invoke-direct {v3, v2}, Lpc/a0$f;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 209
    .line 210
    .line 211
    move-result-object v17

    .line 212
    const-class v1, Lcom/facebook/react/bridge/ReadableArray;

    .line 213
    .line 214
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    new-instance v2, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 219
    .line 220
    sget-object v3, Lec/a;->l:Lec/a;

    .line 221
    .line 222
    filled-new-array {v3}, [Lec/a;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-direct {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 227
    .line 228
    .line 229
    new-instance v3, Lpc/a0$g;

    .line 230
    .line 231
    invoke-direct {v3, v2}, Lpc/a0$g;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 235
    .line 236
    .line 237
    move-result-object v18

    .line 238
    const-class v1, Lcom/facebook/react/bridge/ReadableMap;

    .line 239
    .line 240
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    new-instance v2, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 245
    .line 246
    sget-object v3, Lec/a;->m:Lec/a;

    .line 247
    .line 248
    filled-new-array {v3}, [Lec/a;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-direct {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 253
    .line 254
    .line 255
    new-instance v3, Lpc/a0$h;

    .line 256
    .line 257
    invoke-direct {v3, v2}, Lpc/a0$h;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 261
    .line 262
    .line 263
    move-result-object v19

    .line 264
    const-class v1, [B

    .line 265
    .line 266
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    new-instance v2, Lpc/j;

    .line 271
    .line 272
    invoke-direct {v2}, Lpc/j;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 276
    .line 277
    .line 278
    move-result-object v20

    .line 279
    const-class v1, Lexpo/modules/kotlin/jni/JavaScriptValue;

    .line 280
    .line 281
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    new-instance v2, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 286
    .line 287
    sget-object v3, Lec/a;->k:Lec/a;

    .line 288
    .line 289
    filled-new-array {v3}, [Lec/a;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-direct {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 294
    .line 295
    .line 296
    new-instance v3, Lpc/a0$i;

    .line 297
    .line 298
    invoke-direct {v3, v2}, Lpc/a0$i;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 302
    .line 303
    .line 304
    move-result-object v21

    .line 305
    const-class v1, Lexpo/modules/kotlin/jni/JavaScriptObject;

    .line 306
    .line 307
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    new-instance v2, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 312
    .line 313
    sget-object v3, Lec/a;->j:Lec/a;

    .line 314
    .line 315
    filled-new-array {v3}, [Lec/a;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-direct {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 320
    .line 321
    .line 322
    new-instance v3, Lpc/a0$j;

    .line 323
    .line 324
    invoke-direct {v3, v2}, Lpc/a0$j;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 328
    .line 329
    .line 330
    move-result-object v22

    .line 331
    const-class v1, Lexpo/modules/kotlin/jni/JavaScriptArrayBuffer;

    .line 332
    .line 333
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    new-instance v2, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 338
    .line 339
    sget-object v3, Lec/a;->z:Lec/a;

    .line 340
    .line 341
    filled-new-array {v3}, [Lec/a;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-direct {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 346
    .line 347
    .line 348
    new-instance v3, Lpc/a0$k;

    .line 349
    .line 350
    invoke-direct {v3, v2}, Lpc/a0$k;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 354
    .line 355
    .line 356
    move-result-object v23

    .line 357
    const-class v1, Lexpo/modules/kotlin/jni/NativeArrayBuffer;

    .line 358
    .line 359
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    new-instance v2, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 364
    .line 365
    sget-object v3, Lec/a;->A:Lec/a;

    .line 366
    .line 367
    filled-new-array {v3}, [Lec/a;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-direct {v2, v3}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lec/a;)V

    .line 372
    .line 373
    .line 374
    new-instance v3, Lpc/a0$l;

    .line 375
    .line 376
    invoke-direct {v3, v2}, Lpc/a0$l;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 377
    .line 378
    .line 379
    invoke-static {v1, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 380
    .line 381
    .line 382
    move-result-object v24

    .line 383
    const-class v1, Lexpo/modules/kotlin/jni/worklets/Serializable;

    .line 384
    .line 385
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {v1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 390
    .line 391
    .line 392
    move-result-object v25

    .line 393
    const-class v1, Lexpo/modules/kotlin/jni/worklets/Worklet;

    .line 394
    .line 395
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    new-instance v2, Ltc/b;

    .line 400
    .line 401
    invoke-direct {v2, v0}, Ltc/b;-><init>(Lexpo/modules/kotlin/types/b;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 405
    .line 406
    .line 407
    move-result-object v26

    .line 408
    const-class v0, Loc/h;

    .line 409
    .line 410
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    new-instance v1, Lpc/H;

    .line 415
    .line 416
    invoke-direct {v1}, Lpc/H;-><init>()V

    .line 417
    .line 418
    .line 419
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 420
    .line 421
    .line 422
    move-result-object v27

    .line 423
    const-class v0, Loc/f;

    .line 424
    .line 425
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    new-instance v1, Lpc/F;

    .line 430
    .line 431
    invoke-direct {v1}, Lpc/F;-><init>()V

    .line 432
    .line 433
    .line 434
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 435
    .line 436
    .line 437
    move-result-object v28

    .line 438
    const-class v0, Loc/g;

    .line 439
    .line 440
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    new-instance v1, Lpc/G;

    .line 445
    .line 446
    invoke-direct {v1}, Lpc/G;-><init>()V

    .line 447
    .line 448
    .line 449
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 450
    .line 451
    .line 452
    move-result-object v29

    .line 453
    const-class v0, Loc/n;

    .line 454
    .line 455
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    new-instance v1, Lpc/f0;

    .line 460
    .line 461
    invoke-direct {v1}, Lpc/f0;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 465
    .line 466
    .line 467
    move-result-object v30

    .line 468
    const-class v0, Loc/o;

    .line 469
    .line 470
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    new-instance v1, Lpc/g0;

    .line 475
    .line 476
    invoke-direct {v1}, Lpc/g0;-><init>()V

    .line 477
    .line 478
    .line 479
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 480
    .line 481
    .line 482
    move-result-object v31

    .line 483
    const-class v0, Loc/l;

    .line 484
    .line 485
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    new-instance v1, Lpc/d0;

    .line 490
    .line 491
    invoke-direct {v1}, Lpc/d0;-><init>()V

    .line 492
    .line 493
    .line 494
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 495
    .line 496
    .line 497
    move-result-object v32

    .line 498
    const-class v0, Loc/m;

    .line 499
    .line 500
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    new-instance v1, Lpc/e0;

    .line 505
    .line 506
    invoke-direct {v1}, Lpc/e0;-><init>()V

    .line 507
    .line 508
    .line 509
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 510
    .line 511
    .line 512
    move-result-object v33

    .line 513
    const-class v0, Loc/c;

    .line 514
    .line 515
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    new-instance v1, Lpc/C;

    .line 520
    .line 521
    invoke-direct {v1}, Lpc/C;-><init>()V

    .line 522
    .line 523
    .line 524
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 525
    .line 526
    .line 527
    move-result-object v34

    .line 528
    const-class v0, Loc/d;

    .line 529
    .line 530
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    new-instance v1, Lpc/D;

    .line 535
    .line 536
    invoke-direct {v1}, Lpc/D;-><init>()V

    .line 537
    .line 538
    .line 539
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 540
    .line 541
    .line 542
    move-result-object v35

    .line 543
    const-class v0, Loc/a;

    .line 544
    .line 545
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    new-instance v1, Lpc/h;

    .line 550
    .line 551
    invoke-direct {v1}, Lpc/h;-><init>()V

    .line 552
    .line 553
    .line 554
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 555
    .line 556
    .line 557
    move-result-object v36

    .line 558
    const-class v0, Loc/b;

    .line 559
    .line 560
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    new-instance v1, Lpc/i;

    .line 565
    .line 566
    invoke-direct {v1}, Lpc/i;-><init>()V

    .line 567
    .line 568
    .line 569
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 570
    .line 571
    .line 572
    move-result-object v37

    .line 573
    const-class v0, Loc/j;

    .line 574
    .line 575
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    new-instance v1, Lpc/c0;

    .line 580
    .line 581
    invoke-direct {v1}, Lpc/c0;-><init>()V

    .line 582
    .line 583
    .line 584
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 585
    .line 586
    .line 587
    move-result-object v38

    .line 588
    const-class v0, Ljava/net/URL;

    .line 589
    .line 590
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    new-instance v1, Lsc/b;

    .line 595
    .line 596
    invoke-direct {v1}, Lsc/b;-><init>()V

    .line 597
    .line 598
    .line 599
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 600
    .line 601
    .line 602
    move-result-object v39

    .line 603
    const-class v0, Landroid/net/Uri;

    .line 604
    .line 605
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    new-instance v1, Lsc/c;

    .line 610
    .line 611
    invoke-direct {v1}, Lsc/c;-><init>()V

    .line 612
    .line 613
    .line 614
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 615
    .line 616
    .line 617
    move-result-object v40

    .line 618
    const-class v0, Ljava/net/URI;

    .line 619
    .line 620
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    new-instance v1, Lsc/a;

    .line 625
    .line 626
    invoke-direct {v1}, Lsc/a;-><init>()V

    .line 627
    .line 628
    .line 629
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 630
    .line 631
    .line 632
    move-result-object v41

    .line 633
    const-class v0, Ljava/io/File;

    .line 634
    .line 635
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    new-instance v1, Lrc/a;

    .line 640
    .line 641
    invoke-direct {v1}, Lrc/a;-><init>()V

    .line 642
    .line 643
    .line 644
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 645
    .line 646
    .line 647
    move-result-object v42

    .line 648
    const-class v0, LEf/a;

    .line 649
    .line 650
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    new-instance v1, Lpc/t;

    .line 655
    .line 656
    invoke-direct {v1}, Lpc/t;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 660
    .line 661
    .line 662
    move-result-object v43

    .line 663
    const-class v0, Ljava/lang/Object;

    .line 664
    .line 665
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    new-instance v1, Lpc/c;

    .line 670
    .line 671
    invoke-direct {v1}, Lpc/c;-><init>()V

    .line 672
    .line 673
    .line 674
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 675
    .line 676
    .line 677
    move-result-object v44

    .line 678
    const-class v0, LTd/L;

    .line 679
    .line 680
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    new-instance v1, Lpc/i0;

    .line 685
    .line 686
    invoke-direct {v1}, Lpc/i0;-><init>()V

    .line 687
    .line 688
    .line 689
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 690
    .line 691
    .line 692
    move-result-object v45

    .line 693
    const-class v0, Lqb/b;

    .line 694
    .line 695
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    new-instance v1, Lpc/T;

    .line 700
    .line 701
    invoke-direct {v1}, Lpc/T;-><init>()V

    .line 702
    .line 703
    .line 704
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 705
    .line 706
    .line 707
    move-result-object v46

    .line 708
    filled-new-array/range {v7 .. v46}, [Lkotlin/Pair;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 717
    .line 718
    const/16 v2, 0x1a

    .line 719
    .line 720
    if-lt v1, v2, :cond_0

    .line 721
    .line 722
    invoke-static {}, Lpc/Y;->a()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    new-instance v2, Lrc/b;

    .line 731
    .line 732
    invoke-direct {v2}, Lrc/b;-><init>()V

    .line 733
    .line 734
    .line 735
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    const-class v2, Landroid/graphics/Color;

    .line 740
    .line 741
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    new-instance v3, Lpc/l;

    .line 746
    .line 747
    invoke-direct {v3}, Lpc/l;-><init>()V

    .line 748
    .line 749
    .line 750
    invoke-static {v2, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    invoke-static {}, Lpc/Z;->a()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    new-instance v4, Lpc/r;

    .line 763
    .line 764
    invoke-direct {v4}, Lpc/r;-><init>()V

    .line 765
    .line 766
    .line 767
    invoke-static {v3, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    filled-new-array {v1, v2, v3}, [Lkotlin/Pair;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    invoke-static {v1}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    invoke-static {v0, v1}, LUd/S;->p(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    :cond_0
    return-object v0
.end method

.method private final c()Ljava/util/Map;
    .locals 7

    .line 1
    const-class v0, [I

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lexpo/modules/kotlin/jni/ExpectedType;->c:Lexpo/modules/kotlin/jni/ExpectedType$a;

    .line 8
    .line 9
    sget-object v2, Lec/a;->e:Lec/a;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lexpo/modules/kotlin/jni/ExpectedType$a;->e(Lec/a;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Lpc/a0$m;

    .line 16
    .line 17
    invoke-direct {v3, v2}, Lpc/a0$m;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-class v2, [J

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Lec/a;->f:Lec/a;

    .line 31
    .line 32
    invoke-virtual {v1, v3}, Lexpo/modules/kotlin/jni/ExpectedType$a;->e(Lec/a;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    new-instance v4, Lpc/a0$n;

    .line 37
    .line 38
    invoke-direct {v4, v3}, Lpc/a0$n;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-class v3, [D

    .line 46
    .line 47
    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sget-object v4, Lec/a;->d:Lec/a;

    .line 52
    .line 53
    invoke-virtual {v1, v4}, Lexpo/modules/kotlin/jni/ExpectedType$a;->e(Lec/a;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    new-instance v5, Lpc/a0$o;

    .line 58
    .line 59
    invoke-direct {v5, v4}, Lpc/a0$o;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v3, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-class v4, [F

    .line 67
    .line 68
    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, Lec/a;->g:Lec/a;

    .line 73
    .line 74
    invoke-virtual {v1, v5}, Lexpo/modules/kotlin/jni/ExpectedType$a;->e(Lec/a;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    new-instance v6, Lpc/a0$p;

    .line 79
    .line 80
    invoke-direct {v6, v5}, Lpc/a0$p;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v4, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-class v5, [Z

    .line 88
    .line 89
    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    sget-object v6, Lec/a;->h:Lec/a;

    .line 94
    .line 95
    invoke-virtual {v1, v6}, Lexpo/modules/kotlin/jni/ExpectedType$a;->e(Lec/a;)Lexpo/modules/kotlin/jni/ExpectedType;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v6, Lpc/a0$q;

    .line 100
    .line 101
    invoke-direct {v6, v1}, Lpc/a0$q;-><init>(Lexpo/modules/kotlin/jni/ExpectedType;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v5, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    filled-new-array {v0, v2, v3, v4, v1}, [Lkotlin/Pair;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0
.end method

.method private final d(Lpe/q;)Lexpo/modules/kotlin/types/b;
    .locals 1

    .line 1
    sget-object v0, Lpc/a0;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1}, Lpe/q;->c()Lpe/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lexpo/modules/kotlin/types/b;

    .line 12
    .line 13
    return-object p1
.end method

.method private final e(Lpe/q;)Lexpo/modules/kotlin/types/b;
    .locals 1

    .line 1
    sget-object v0, Lpc/a0;->c:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1}, Lpe/q;->c()Lpe/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lexpo/modules/kotlin/types/b;

    .line 12
    .line 13
    return-object p1
.end method

.method private final f(Lpe/q;Ljava/lang/Class;)Lexpo/modules/kotlin/types/b;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/kotlin/types/Either;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const-class v0, Lexpo/modules/kotlin/types/EitherOfFour;

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p2, Lpc/v;

    .line 18
    .line 19
    invoke-direct {p2, p0, p1}, Lpc/v;-><init>(Lpc/X;Lpe/q;)V

    .line 20
    .line 21
    .line 22
    return-object p2

    .line 23
    :cond_0
    const-class v0, Lexpo/modules/kotlin/types/EitherOfThree;

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    new-instance p2, Lpc/w;

    .line 32
    .line 33
    invoke-direct {p2, p0, p1}, Lpc/w;-><init>(Lpc/X;Lpe/q;)V

    .line 34
    .line 35
    .line 36
    return-object p2

    .line 37
    :cond_1
    new-instance p2, Lpc/x;

    .line 38
    .line 39
    invoke-direct {p2, p0, p1}, Lpc/x;-><init>(Lpc/X;Lpe/q;)V

    .line 40
    .line 41
    .line 42
    return-object p2

    .line 43
    :cond_2
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method


# virtual methods
.method public a(Lpe/q;)Lexpo/modules/kotlin/types/b;
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lpc/a0;->g(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1}, Lpe/q;->b()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance p1, Lpc/Q;

    .line 17
    .line 18
    invoke-direct {p1, v0}, Lpc/Q;-><init>(Lexpo/modules/kotlin/types/b;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    return-object v0
.end method

.method public final g(Lpe/q;)Lexpo/modules/kotlin/types/b;
    .locals 3

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lpc/a0;->d(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-interface {p1}, Lpe/q;->c()Lpe/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, Lpe/d;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, Lpe/d;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-eqz v0, :cond_13

    .line 26
    .line 27
    invoke-static {v0}, Lhe/a;->b(Lpe/d;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_10

    .line 36
    .line 37
    const-class v2, [Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_2
    const-class v2, Ljava/util/List;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    new-instance v0, Lpc/N;

    .line 56
    .line 57
    invoke-direct {v0, p0, p1}, Lpc/N;-><init>(Lpc/X;Lpe/q;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    const-class v2, Ljava/util/Map;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    new-instance v0, Lpc/O;

    .line 70
    .line 71
    invoke-direct {v0, p0, p1}, Lpc/O;-><init>(Lpc/X;Lpe/q;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_4
    const-class v2, Lkotlin/Pair;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_5

    .line 82
    .line 83
    new-instance v0, Lpc/S;

    .line 84
    .line 85
    invoke-direct {v0, p0, p1}, Lpc/S;-><init>(Lpc/X;Lpe/q;)V

    .line 86
    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_5
    const-class v2, Ljava/util/Set;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_6

    .line 96
    .line 97
    new-instance v0, Lpc/W;

    .line 98
    .line 99
    invoke-direct {v0, p0, p1}, Lpc/W;-><init>(Lpc/X;Lpe/q;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_7

    .line 108
    .line 109
    new-instance p1, Lpc/B;

    .line 110
    .line 111
    invoke-direct {p1, v0}, Lpc/B;-><init>(Lpe/d;)V

    .line 112
    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_7
    sget-object v0, Lpc/a0;->d:Ljava/util/Map;

    .line 116
    .line 117
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Lexpo/modules/kotlin/types/b;

    .line 122
    .line 123
    if-eqz v2, :cond_8

    .line 124
    .line 125
    return-object v2

    .line 126
    :cond_8
    const-class v2, Ljc/b;

    .line 127
    .line 128
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_9

    .line 133
    .line 134
    new-instance v1, Ljc/d;

    .line 135
    .line 136
    invoke-direct {v1, p0, p1}, Ljc/d;-><init>(Lpc/X;Lpe/q;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    return-object v1

    .line 143
    :cond_9
    const-class v0, Landroid/view/View;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_a

    .line 150
    .line 151
    new-instance v0, Lexpo/modules/kotlin/views/u;

    .line 152
    .line 153
    invoke-direct {v0, p1}, Lexpo/modules/kotlin/views/u;-><init>(Lpe/q;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_a
    const-class v0, Lexpo/modules/kotlin/sharedobjects/SharedRef;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_b

    .line 164
    .line 165
    new-instance v0, Lnc/i;

    .line 166
    .line 167
    invoke-direct {v0, p1}, Lnc/i;-><init>(Lpe/q;)V

    .line 168
    .line 169
    .line 170
    return-object v0

    .line 171
    :cond_b
    const-class v0, Lexpo/modules/kotlin/sharedobjects/SharedObject;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    new-instance v0, Lnc/f;

    .line 180
    .line 181
    invoke-direct {v0, p1}, Lnc/f;-><init>(Lpe/q;)V

    .line 182
    .line 183
    .line 184
    return-object v0

    .line 185
    :cond_c
    const-class v0, Lexpo/modules/kotlin/jni/JavaScriptFunction;

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_d

    .line 192
    .line 193
    new-instance v0, Lpc/L;

    .line 194
    .line 195
    invoke-direct {v0, p1}, Lpc/L;-><init>(Lpe/q;)V

    .line 196
    .line 197
    .line 198
    return-object v0

    .line 199
    :cond_d
    const-class v0, Lexpo/modules/kotlin/types/ValueOrUndefined;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_e

    .line 206
    .line 207
    new-instance v0, Lexpo/modules/kotlin/types/d;

    .line 208
    .line 209
    invoke-direct {v0, p0, p1}, Lexpo/modules/kotlin/types/d;-><init>(Lpc/X;Lpe/q;)V

    .line 210
    .line 211
    .line 212
    return-object v0

    .line 213
    :cond_e
    invoke-direct {p0, p1, v1}, Lpc/a0;->f(Lpe/q;Ljava/lang/Class;)Lexpo/modules/kotlin/types/b;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-eqz v0, :cond_f

    .line 218
    .line 219
    return-object v0

    .line 220
    :cond_f
    new-instance v0, Lcc/r;

    .line 221
    .line 222
    invoke-direct {v0, p1}, Lcc/r;-><init>(Lpe/q;)V

    .line 223
    .line 224
    .line 225
    throw v0

    .line 226
    :cond_10
    :goto_1
    invoke-static {p1, v1}, Lpc/f;->a(Lpe/q;Ljava/lang/Class;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_12

    .line 231
    .line 232
    invoke-direct {p0, p1}, Lpc/a0;->e(Lpe/q;)Lexpo/modules/kotlin/types/b;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-eqz v0, :cond_11

    .line 237
    .line 238
    return-object v0

    .line 239
    :cond_11
    new-instance v0, Lcc/r;

    .line 240
    .line 241
    invoke-direct {v0, p1}, Lcc/r;-><init>(Lpe/q;)V

    .line 242
    .line 243
    .line 244
    throw v0

    .line 245
    :cond_12
    new-instance v0, Lpc/e;

    .line 246
    .line 247
    invoke-direct {v0, p0, p1}, Lpc/e;-><init>(Lpc/X;Lpe/q;)V

    .line 248
    .line 249
    .line 250
    return-object v0

    .line 251
    :cond_13
    new-instance v0, Lcc/r;

    .line 252
    .line 253
    invoke-direct {v0, p1}, Lcc/r;-><init>(Lpe/q;)V

    .line 254
    .line 255
    .line 256
    throw v0
.end method
