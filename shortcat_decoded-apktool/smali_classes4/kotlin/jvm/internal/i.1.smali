.class public final Lkotlin/jvm/internal/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lpe/d;
.implements Lkotlin/jvm/internal/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/jvm/internal/i$a;
    }
.end annotation


# static fields
.field public static final b:Lkotlin/jvm/internal/i$a;

.field private static final c:Ljava/util/Map;

.field private static final d:Ljava/util/HashMap;

.field private static final e:Ljava/util/HashMap;

.field private static final f:Ljava/util/HashMap;

.field private static final g:Ljava/util/Map;


# instance fields
.field private final a:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 1
    new-instance v0, Lkotlin/jvm/internal/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkotlin/jvm/internal/i;->b:Lkotlin/jvm/internal/i$a;

    .line 8
    .line 9
    const-class v23, Lie/m;

    .line 10
    .line 11
    const-class v24, Lie/n;

    .line 12
    .line 13
    const-class v2, Lie/a;

    .line 14
    .line 15
    const-class v3, Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    const-class v4, Lkotlin/jvm/functions/Function2;

    .line 18
    .line 19
    const-class v5, Lie/o;

    .line 20
    .line 21
    const-class v6, Lie/p;

    .line 22
    .line 23
    const-class v7, Lie/q;

    .line 24
    .line 25
    const-class v8, Lie/r;

    .line 26
    .line 27
    const-class v9, Lie/s;

    .line 28
    .line 29
    const-class v10, Lie/t;

    .line 30
    .line 31
    const-class v11, Lie/u;

    .line 32
    .line 33
    const-class v12, Lie/b;

    .line 34
    .line 35
    const-class v13, Lie/c;

    .line 36
    .line 37
    const-class v14, Lie/d;

    .line 38
    .line 39
    const-class v15, Lie/e;

    .line 40
    .line 41
    const-class v16, Lie/f;

    .line 42
    .line 43
    const-class v17, Lie/g;

    .line 44
    .line 45
    const-class v18, Lie/h;

    .line 46
    .line 47
    const-class v19, Lie/i;

    .line 48
    .line 49
    const-class v20, Lie/j;

    .line 50
    .line 51
    const-class v21, Lie/k;

    .line 52
    .line 53
    const-class v22, Lie/l;

    .line 54
    .line 55
    filled-new-array/range {v2 .. v24}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    const/16 v3, 0xa

    .line 66
    .line 67
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const/4 v3, 0x0

    .line 79
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_1

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    add-int/lit8 v5, v3, 0x1

    .line 90
    .line 91
    if-gez v3, :cond_0

    .line 92
    .line 93
    invoke-static {}, LUd/u;->w()V

    .line 94
    .line 95
    .line 96
    :cond_0
    check-cast v4, Ljava/lang/Class;

    .line 97
    .line 98
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v4, v3}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move v3, v5

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    invoke-static {v2}, LUd/S;->w(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sput-object v0, Lkotlin/jvm/internal/i;->c:Ljava/util/Map;

    .line 116
    .line 117
    new-instance v0, Ljava/util/HashMap;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v2, "boolean"

    .line 123
    .line 124
    const-string v3, "kotlin.Boolean"

    .line 125
    .line 126
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    const-string v2, "char"

    .line 130
    .line 131
    const-string v4, "kotlin.Char"

    .line 132
    .line 133
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    const-string v2, "byte"

    .line 137
    .line 138
    const-string v5, "kotlin.Byte"

    .line 139
    .line 140
    invoke-virtual {v0, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    const-string v2, "short"

    .line 144
    .line 145
    const-string v6, "kotlin.Short"

    .line 146
    .line 147
    invoke-virtual {v0, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    const-string v2, "int"

    .line 151
    .line 152
    const-string v7, "kotlin.Int"

    .line 153
    .line 154
    invoke-virtual {v0, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    const-string v2, "float"

    .line 158
    .line 159
    const-string v8, "kotlin.Float"

    .line 160
    .line 161
    invoke-virtual {v0, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    const-string v2, "long"

    .line 165
    .line 166
    const-string v9, "kotlin.Long"

    .line 167
    .line 168
    invoke-virtual {v0, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    const-string v2, "double"

    .line 172
    .line 173
    const-string v10, "kotlin.Double"

    .line 174
    .line 175
    invoke-virtual {v0, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    sput-object v0, Lkotlin/jvm/internal/i;->d:Ljava/util/HashMap;

    .line 179
    .line 180
    new-instance v2, Ljava/util/HashMap;

    .line 181
    .line 182
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v11, "java.lang.Boolean"

    .line 186
    .line 187
    invoke-virtual {v2, v11, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    const-string v3, "java.lang.Character"

    .line 191
    .line 192
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    const-string v3, "java.lang.Byte"

    .line 196
    .line 197
    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    const-string v3, "java.lang.Short"

    .line 201
    .line 202
    invoke-virtual {v2, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    const-string v3, "java.lang.Integer"

    .line 206
    .line 207
    invoke-virtual {v2, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    const-string v3, "java.lang.Float"

    .line 211
    .line 212
    invoke-virtual {v2, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    const-string v3, "java.lang.Long"

    .line 216
    .line 217
    invoke-virtual {v2, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    const-string v3, "java.lang.Double"

    .line 221
    .line 222
    invoke-virtual {v2, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    sput-object v2, Lkotlin/jvm/internal/i;->e:Ljava/util/HashMap;

    .line 226
    .line 227
    new-instance v3, Ljava/util/HashMap;

    .line 228
    .line 229
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 230
    .line 231
    .line 232
    const-string v4, "java.lang.Object"

    .line 233
    .line 234
    const-string v5, "kotlin.Any"

    .line 235
    .line 236
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    const-string v4, "java.lang.String"

    .line 240
    .line 241
    const-string v5, "kotlin.String"

    .line 242
    .line 243
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    const-string v4, "java.lang.CharSequence"

    .line 247
    .line 248
    const-string v5, "kotlin.CharSequence"

    .line 249
    .line 250
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    const-string v4, "java.lang.Throwable"

    .line 254
    .line 255
    const-string v5, "kotlin.Throwable"

    .line 256
    .line 257
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    const-string v4, "java.lang.Cloneable"

    .line 261
    .line 262
    const-string v5, "kotlin.Cloneable"

    .line 263
    .line 264
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    const-string v4, "java.lang.Number"

    .line 268
    .line 269
    const-string v5, "kotlin.Number"

    .line 270
    .line 271
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    const-string v4, "java.lang.Comparable"

    .line 275
    .line 276
    const-string v5, "kotlin.Comparable"

    .line 277
    .line 278
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    const-string v4, "java.lang.Enum"

    .line 282
    .line 283
    const-string v5, "kotlin.Enum"

    .line 284
    .line 285
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    const-string v4, "java.lang.annotation.Annotation"

    .line 289
    .line 290
    const-string v5, "kotlin.Annotation"

    .line 291
    .line 292
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    const-string v4, "java.lang.Iterable"

    .line 296
    .line 297
    const-string v5, "kotlin.collections.Iterable"

    .line 298
    .line 299
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    const-string v4, "java.util.Iterator"

    .line 303
    .line 304
    const-string v5, "kotlin.collections.Iterator"

    .line 305
    .line 306
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    const-string v4, "java.util.Collection"

    .line 310
    .line 311
    const-string v5, "kotlin.collections.Collection"

    .line 312
    .line 313
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    const-string v4, "java.util.List"

    .line 317
    .line 318
    const-string v5, "kotlin.collections.List"

    .line 319
    .line 320
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    const-string v4, "java.util.Set"

    .line 324
    .line 325
    const-string v5, "kotlin.collections.Set"

    .line 326
    .line 327
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    const-string v4, "java.util.ListIterator"

    .line 331
    .line 332
    const-string v5, "kotlin.collections.ListIterator"

    .line 333
    .line 334
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    const-string v4, "java.util.Map"

    .line 338
    .line 339
    const-string v5, "kotlin.collections.Map"

    .line 340
    .line 341
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    const-string v4, "java.util.Map$Entry"

    .line 345
    .line 346
    const-string v5, "kotlin.collections.Map.Entry"

    .line 347
    .line 348
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    const-string v4, "kotlin.jvm.internal.StringCompanionObject"

    .line 352
    .line 353
    const-string v5, "kotlin.String.Companion"

    .line 354
    .line 355
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    const-string v4, "kotlin.jvm.internal.EnumCompanionObject"

    .line 359
    .line 360
    const-string v5, "kotlin.Enum.Companion"

    .line 361
    .line 362
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    const-string v2, "<get-values>(...)"

    .line 376
    .line 377
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    check-cast v0, Ljava/lang/Iterable;

    .line 381
    .line 382
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    const/4 v4, 0x2

    .line 391
    const/16 v5, 0x2e

    .line 392
    .line 393
    if-eqz v2, :cond_2

    .line 394
    .line 395
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    check-cast v2, Ljava/lang/String;

    .line 400
    .line 401
    new-instance v6, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 404
    .line 405
    .line 406
    const-string v7, "kotlin.jvm.internal."

    .line 407
    .line 408
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v2, v5, v1, v4, v1}, LDf/r;->Z0(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string v4, "CompanionObject"

    .line 422
    .line 423
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    new-instance v5, Ljava/lang/StringBuilder;

    .line 431
    .line 432
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    const-string v2, ".Companion"

    .line 439
    .line 440
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-static {v4, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    invoke-virtual {v2}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    invoke-virtual {v2}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    goto :goto_1

    .line 463
    :cond_2
    sget-object v0, Lkotlin/jvm/internal/i;->c:Ljava/util/Map;

    .line 464
    .line 465
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-eqz v2, :cond_3

    .line 478
    .line 479
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    check-cast v2, Ljava/util/Map$Entry;

    .line 484
    .line 485
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    check-cast v6, Ljava/lang/Class;

    .line 490
    .line 491
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    check-cast v2, Ljava/lang/Number;

    .line 496
    .line 497
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    new-instance v7, Ljava/lang/StringBuilder;

    .line 506
    .line 507
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 508
    .line 509
    .line 510
    const-string v8, "kotlin.Function"

    .line 511
    .line 512
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-virtual {v3, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    goto :goto_2

    .line 526
    :cond_3
    sput-object v3, Lkotlin/jvm/internal/i;->f:Ljava/util/HashMap;

    .line 527
    .line 528
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 529
    .line 530
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    invoke-static {v2}, LUd/S;->e(I)I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 539
    .line 540
    .line 541
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    check-cast v2, Ljava/lang/Iterable;

    .line 546
    .line 547
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-eqz v3, :cond_4

    .line 556
    .line 557
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    check-cast v3, Ljava/util/Map$Entry;

    .line 562
    .line 563
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    check-cast v3, Ljava/lang/String;

    .line 572
    .line 573
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    invoke-static {v3, v5, v1, v4, v1}, LDf/r;->Z0(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    invoke-interface {v0, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    goto :goto_3

    .line 584
    :cond_4
    sput-object v0, Lkotlin/jvm/internal/i;->g:Ljava/util/Map;

    .line 585
    .line 586
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-string v0, "jClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lkotlin/jvm/internal/i;->a:Ljava/lang/Class;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic l()Ljava/util/HashMap;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/i;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic n()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/i;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic o()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/i;->g:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method private final q()Ljava/lang/Void;
    .locals 1

    .line 1
    new-instance v0, Lhe/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lhe/b;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lkotlin/jvm/internal/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lhe/a;->c(Lpe/d;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast p1, Lpe/d;

    .line 10
    .line 11
    invoke-static {p1}, Lhe/a;->c(Lpe/d;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/i;->q()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-static {p0}, Lhe/a;->c(Lpe/d;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public i()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/i;->q()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public j()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/i;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/i;->q()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public s()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/i;->q()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public t(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/i;->b:Lkotlin/jvm/internal/i$a;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/jvm/internal/i;->j()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, p1, v1}, Lkotlin/jvm/internal/i$a;->c(Ljava/lang/Object;Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lkotlin/jvm/internal/i;->j()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " (Kotlin reflection is not available)"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/i;->b:Lkotlin/jvm/internal/i$a;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/jvm/internal/i;->j()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i$a;->a(Ljava/lang/Class;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/i;->b:Lkotlin/jvm/internal/i$a;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/jvm/internal/i;->j()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i$a;->b(Ljava/lang/Class;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
