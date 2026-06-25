.class public final Lcom/revenuecat/purchases/hybridcommon/mappers/CustomerInfoMapperKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u0007*\u00020\u00002 \u0010\u0008\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "",
        "",
        "",
        "map",
        "(Lcom/revenuecat/purchases/CustomerInfo;)Ljava/util/Map;",
        "Lkotlin/Function1;",
        "LTd/L;",
        "callback",
        "mapAsync",
        "(Lcom/revenuecat/purchases/CustomerInfo;Lkotlin/jvm/functions/Function1;)V",
        "hybridcommon_bc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final map(Lcom/revenuecat/purchases/CustomerInfo;)Ljava/util/Map;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/CustomerInfo;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getEntitlements()Lcom/revenuecat/purchases/EntitlementInfos;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/EntitlementInfosMapperKt;->map(Lcom/revenuecat/purchases/EntitlementInfos;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "entitlements"

    .line 17
    .line 18
    invoke-static {v2, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getActiveSubscriptions()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/Iterable;

    .line 27
    .line 28
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v2, "activeSubscriptions"

    .line 33
    .line 34
    invoke-static {v2, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getAllPurchasedProductIds()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v2, "allPurchasedProductIdentifiers"

    .line 49
    .line 50
    invoke-static {v2, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getLatestExpirationDate()Ljava/util/Date;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toIso8601(Ljava/util/Date;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 v0, 0x0

    .line 66
    :goto_0
    const-string v6, "latestExpirationDate"

    .line 67
    .line 68
    invoke-static {v6, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getLatestExpirationDate()Ljava/util/Date;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toMillis(Ljava/util/Date;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v7

    .line 82
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    const/4 v0, 0x0

    .line 88
    :goto_1
    const-string v7, "latestExpirationDateMillis"

    .line 89
    .line 90
    invoke-static {v7, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getFirstSeen()Ljava/util/Date;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toIso8601(Ljava/util/Date;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v8, "firstSeen"

    .line 103
    .line 104
    invoke-static {v8, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getFirstSeen()Ljava/util/Date;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toMillis(Ljava/util/Date;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v9, "firstSeenMillis"

    .line 121
    .line 122
    invoke-static {v9, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    const-string v0, "originalAppUserId"

    .line 127
    .line 128
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getOriginalAppUserId()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-static {v0, v10}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getRequestDate()Ljava/util/Date;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toIso8601(Ljava/util/Date;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v11, "requestDate"

    .line 145
    .line 146
    invoke-static {v11, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getRequestDate()Ljava/util/Date;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toMillis(Ljava/util/Date;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v12

    .line 158
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-string v12, "requestDateMillis"

    .line 163
    .line 164
    invoke-static {v12, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getAllExpirationDatesByProduct()Ljava/util/Map;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    invoke-static {v14}, LUd/S;->e(I)I

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    invoke-direct {v13, v14}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Ljava/lang/Iterable;

    .line 190
    .line 191
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v14

    .line 199
    if-eqz v14, :cond_3

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    check-cast v14, Ljava/util/Map$Entry;

    .line 206
    .line 207
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    check-cast v14, Ljava/util/Date;

    .line 216
    .line 217
    if-eqz v14, :cond_2

    .line 218
    .line 219
    invoke-static {v14}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toIso8601(Ljava/util/Date;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v14

    .line 223
    goto :goto_3

    .line 224
    :cond_2
    const/4 v14, 0x0

    .line 225
    :goto_3
    invoke-interface {v13, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_3
    const-string v0, "allExpirationDates"

    .line 230
    .line 231
    invoke-static {v0, v13}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 232
    .line 233
    .line 234
    move-result-object v13

    .line 235
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getAllExpirationDatesByProduct()Ljava/util/Map;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v14, Ljava/util/LinkedHashMap;

    .line 240
    .line 241
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    invoke-static {v15}, LUd/S;->e(I)I

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    invoke-direct {v14, v15}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, Ljava/lang/Iterable;

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v15

    .line 266
    if-eqz v15, :cond_5

    .line 267
    .line 268
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v15

    .line 272
    check-cast v15, Ljava/util/Map$Entry;

    .line 273
    .line 274
    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v15

    .line 282
    check-cast v15, Ljava/util/Date;

    .line 283
    .line 284
    if-eqz v15, :cond_4

    .line 285
    .line 286
    invoke-static {v15}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toMillis(Ljava/util/Date;)J

    .line 287
    .line 288
    .line 289
    move-result-wide v17

    .line 290
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 291
    .line 292
    .line 293
    move-result-object v15

    .line 294
    goto :goto_5

    .line 295
    :cond_4
    const/4 v15, 0x0

    .line 296
    :goto_5
    invoke-interface {v14, v2, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_5
    const-string v0, "allExpirationDatesMillis"

    .line 301
    .line 302
    invoke-static {v0, v14}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 303
    .line 304
    .line 305
    move-result-object v14

    .line 306
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getAllPurchaseDatesByProduct()Ljava/util/Map;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 311
    .line 312
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 313
    .line 314
    .line 315
    move-result v15

    .line 316
    invoke-static {v15}, LUd/S;->e(I)I

    .line 317
    .line 318
    .line 319
    move-result v15

    .line 320
    invoke-direct {v2, v15}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Ljava/lang/Iterable;

    .line 328
    .line 329
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v15

    .line 337
    if-eqz v15, :cond_7

    .line 338
    .line 339
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v15

    .line 343
    check-cast v15, Ljava/util/Map$Entry;

    .line 344
    .line 345
    move-object/from16 v17, v0

    .line 346
    .line 347
    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v15

    .line 355
    check-cast v15, Ljava/util/Date;

    .line 356
    .line 357
    if-eqz v15, :cond_6

    .line 358
    .line 359
    invoke-static {v15}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toIso8601(Ljava/util/Date;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    goto :goto_7

    .line 364
    :cond_6
    const/4 v15, 0x0

    .line 365
    :goto_7
    invoke-interface {v2, v0, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-object/from16 v0, v17

    .line 369
    .line 370
    goto :goto_6

    .line 371
    :cond_7
    const-string v0, "allPurchaseDates"

    .line 372
    .line 373
    invoke-static {v0, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 374
    .line 375
    .line 376
    move-result-object v15

    .line 377
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getAllPurchaseDatesByProduct()Ljava/util/Map;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 382
    .line 383
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 384
    .line 385
    .line 386
    move-result v17

    .line 387
    move-object/from16 v18, v0

    .line 388
    .line 389
    invoke-static/range {v17 .. v17}, LUd/S;->e(I)I

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 394
    .line 395
    .line 396
    invoke-interface/range {v18 .. v18}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    check-cast v0, Ljava/lang/Iterable;

    .line 401
    .line 402
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 407
    .line 408
    .line 409
    move-result v17

    .line 410
    if-eqz v17, :cond_9

    .line 411
    .line 412
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v17

    .line 416
    check-cast v17, Ljava/util/Map$Entry;

    .line 417
    .line 418
    move-object/from16 v18, v0

    .line 419
    .line 420
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v17

    .line 428
    check-cast v17, Ljava/util/Date;

    .line 429
    .line 430
    if-eqz v17, :cond_8

    .line 431
    .line 432
    invoke-static/range {v17 .. v17}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toMillis(Ljava/util/Date;)J

    .line 433
    .line 434
    .line 435
    move-result-wide v19

    .line 436
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 437
    .line 438
    .line 439
    move-result-object v17

    .line 440
    move-object/from16 v1, v17

    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_8
    const/4 v1, 0x0

    .line 444
    :goto_9
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-object/from16 v1, p0

    .line 448
    .line 449
    move-object/from16 v0, v18

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_9
    const-string v0, "allPurchaseDatesMillis"

    .line 453
    .line 454
    invoke-static {v0, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    const-string v1, "originalApplicationVersion"

    .line 459
    .line 460
    const/4 v2, 0x0

    .line 461
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 462
    .line 463
    .line 464
    move-result-object v17

    .line 465
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/CustomerInfo;->getManagementURL()Landroid/net/Uri;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    if-eqz v1, :cond_a

    .line 470
    .line 471
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    goto :goto_a

    .line 476
    :cond_a
    move-object v1, v2

    .line 477
    :goto_a
    const-string v2, "managementURL"

    .line 478
    .line 479
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 480
    .line 481
    .line 482
    move-result-object v18

    .line 483
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/CustomerInfo;->getOriginalPurchaseDate()Ljava/util/Date;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    if-eqz v1, :cond_b

    .line 488
    .line 489
    invoke-static {v1}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toIso8601(Ljava/util/Date;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    goto :goto_b

    .line 494
    :cond_b
    const/4 v1, 0x0

    .line 495
    :goto_b
    const-string v2, "originalPurchaseDate"

    .line 496
    .line 497
    invoke-static {v2, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 498
    .line 499
    .line 500
    move-result-object v19

    .line 501
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/CustomerInfo;->getOriginalPurchaseDate()Ljava/util/Date;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    if-eqz v1, :cond_c

    .line 506
    .line 507
    invoke-static {v1}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->toMillis(Ljava/util/Date;)J

    .line 508
    .line 509
    .line 510
    move-result-wide v1

    .line 511
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    goto :goto_c

    .line 516
    :cond_c
    const/4 v2, 0x0

    .line 517
    :goto_c
    const-string v1, "originalPurchaseDateMillis"

    .line 518
    .line 519
    invoke-static {v1, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 520
    .line 521
    .line 522
    move-result-object v20

    .line 523
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/CustomerInfo;->getNonSubscriptionTransactions()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    new-instance v2, Ljava/util/ArrayList;

    .line 528
    .line 529
    move-object/from16 v16, v0

    .line 530
    .line 531
    const/16 v0, 0xa

    .line 532
    .line 533
    invoke-static {v1, v0}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 538
    .line 539
    .line 540
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 545
    .line 546
    .line 547
    move-result v1

    .line 548
    if-eqz v1, :cond_d

    .line 549
    .line 550
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    check-cast v1, Lcom/revenuecat/purchases/models/Transaction;

    .line 555
    .line 556
    invoke-static {v1}, Lcom/revenuecat/purchases/hybridcommon/mappers/TransactionMapperKt;->map(Lcom/revenuecat/purchases/models/Transaction;)Ljava/util/Map;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    goto :goto_d

    .line 564
    :cond_d
    const-string v0, "nonSubscriptionTransactions"

    .line 565
    .line 566
    invoke-static {v0, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 567
    .line 568
    .line 569
    move-result-object v21

    .line 570
    invoke-virtual/range {p0 .. p0}, Lcom/revenuecat/purchases/CustomerInfo;->getSubscriptionsByProductIdentifier()Ljava/util/Map;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 575
    .line 576
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    invoke-static {v2}, LUd/S;->e(I)I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 585
    .line 586
    .line 587
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    check-cast v0, Ljava/lang/Iterable;

    .line 592
    .line 593
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    if-eqz v2, :cond_e

    .line 602
    .line 603
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    check-cast v2, Ljava/util/Map$Entry;

    .line 608
    .line 609
    move-object/from16 p0, v0

    .line 610
    .line 611
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    check-cast v2, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 620
    .line 621
    invoke-static {v2}, Lcom/revenuecat/purchases/hybridcommon/mappers/SubscriptionInfoMapperKt;->map(Lcom/revenuecat/purchases/SubscriptionInfo;)Ljava/util/Map;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-object/from16 v0, p0

    .line 629
    .line 630
    goto :goto_e

    .line 631
    :cond_e
    const-string v0, "subscriptionsByProductIdentifier"

    .line 632
    .line 633
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 634
    .line 635
    .line 636
    move-result-object v22

    .line 637
    filled-new-array/range {v3 .. v22}, [Lkotlin/Pair;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    return-object v0
.end method

.method public static final mapAsync(Lcom/revenuecat/purchases/CustomerInfo;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/CustomerInfo;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/revenuecat/purchases/hybridcommon/mappers/MappersHelpersKt;->getMainScope()LGf/O;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/revenuecat/purchases/hybridcommon/mappers/CustomerInfoMapperKt$mapAsync$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p1, p0, v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/CustomerInfoMapperKt$mapAsync$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/CustomerInfo;LZd/e;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 26
    .line 27
    .line 28
    return-void
.end method
