.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/templates/Template7TestDataKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "template7",
        "Lcom/revenuecat/purchases/paywalls/PaywallData;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;",
        "getTemplate7",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;",
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


# direct methods
.method public static final getTemplate7(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;
    .locals 40

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
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallData;

    .line 9
    .line 10
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 15
    .line 16
    const/4 v8, 0x6

    .line 17
    const/4 v9, 0x0

    .line 18
    const-string v5, "954459_1703109702.png"

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-direct/range {v4 .. v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "basic"

    .line 26
    .line 27
    invoke-static {v0, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 32
    .line 33
    const-string v5, "954459_1692992845.png"

    .line 34
    .line 35
    invoke-direct/range {v4 .. v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    const-string v5, "standard"

    .line 39
    .line 40
    invoke-static {v5, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 45
    .line 46
    const/4 v10, 0x6

    .line 47
    const/4 v11, 0x0

    .line 48
    const-string v7, "954459_1701267532.jpeg"

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    invoke-direct/range {v6 .. v11}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 52
    .line 53
    .line 54
    const-string v7, "premium"

    .line 55
    .line 56
    invoke-static {v7, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    filled-new-array {v2, v4, v6}, [Lkotlin/Pair;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;

    .line 69
    .line 70
    sget-object v6, Lcom/revenuecat/purchases/PackageType;->ANNUAL:Lcom/revenuecat/purchases/PackageType;

    .line 71
    .line 72
    invoke-virtual {v6}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object v9, Lcom/revenuecat/purchases/PackageType;->MONTHLY:Lcom/revenuecat/purchases/PackageType;

    .line 80
    .line 81
    invoke-virtual {v9}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-static {v9}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    filled-new-array {v8, v9}, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-static {v8}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v6}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v4, v0, v8, v6}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;

    .line 107
    .line 108
    sget-object v8, Lcom/revenuecat/purchases/PackageType;->TWO_MONTH:Lcom/revenuecat/purchases/PackageType;

    .line 109
    .line 110
    invoke-virtual {v8}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object v9, Lcom/revenuecat/purchases/PackageType;->SIX_MONTH:Lcom/revenuecat/purchases/PackageType;

    .line 118
    .line 119
    invoke-virtual {v9}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    filled-new-array {v8, v10}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-static {v8}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    invoke-virtual {v9}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-static {v9}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v6, v5, v8, v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;

    .line 145
    .line 146
    sget-object v9, Lcom/revenuecat/purchases/PackageType;->THREE_MONTH:Lcom/revenuecat/purchases/PackageType;

    .line 147
    .line 148
    invoke-virtual {v9}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    sget-object v11, Lcom/revenuecat/purchases/PackageType;->LIFETIME:Lcom/revenuecat/purchases/PackageType;

    .line 156
    .line 157
    invoke-virtual {v11}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v11}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    filled-new-array {v10, v11}, [Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-static {v10}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    invoke-virtual {v9}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-static {v9}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-direct {v8, v7, v10, v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    filled-new-array {v4, v6, v8}, [Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-static {v4}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v14

    .line 190
    new-instance v10, Ljava/net/URL;

    .line 191
    .line 192
    const-string v4, "https://revenuecat.com/tos"

    .line 193
    .line 194
    invoke-direct {v10, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v11, Ljava/net/URL;

    .line 198
    .line 199
    const-string v4, "https://revenuecat.com/privacy"

    .line 200
    .line 201
    invoke-direct {v11, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 205
    .line 206
    new-instance v15, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 207
    .line 208
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 209
    .line 210
    const-string v6, "#FFFFFF"

    .line 211
    .line 212
    invoke-direct {v4, v6}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 216
    .line 217
    const-string v9, "#000000"

    .line 218
    .line 219
    invoke-direct {v8, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 223
    .line 224
    move-object/from16 p0, v1

    .line 225
    .line 226
    const-string v1, "#45c186"

    .line 227
    .line 228
    invoke-direct {v13, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 232
    .line 233
    move-object/from16 v33, v2

    .line 234
    .line 235
    const-string v2, "#ffffff"

    .line 236
    .line 237
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    const/16 v31, 0x7fcc

    .line 241
    .line 242
    const/16 v32, 0x0

    .line 243
    .line 244
    const/16 v18, 0x0

    .line 245
    .line 246
    const/16 v19, 0x0

    .line 247
    .line 248
    const/16 v22, 0x0

    .line 249
    .line 250
    const/16 v23, 0x0

    .line 251
    .line 252
    const/16 v24, 0x0

    .line 253
    .line 254
    const/16 v25, 0x0

    .line 255
    .line 256
    const/16 v26, 0x0

    .line 257
    .line 258
    const/16 v27, 0x0

    .line 259
    .line 260
    const/16 v28, 0x0

    .line 261
    .line 262
    const/16 v29, 0x0

    .line 263
    .line 264
    const/16 v30, 0x0

    .line 265
    .line 266
    move-object/from16 v21, v1

    .line 267
    .line 268
    move-object/from16 v16, v4

    .line 269
    .line 270
    move-object/from16 v17, v8

    .line 271
    .line 272
    move-object/from16 v20, v13

    .line 273
    .line 274
    invoke-direct/range {v15 .. v32}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 275
    .line 276
    .line 277
    const/4 v1, 0x0

    .line 278
    const/4 v4, 0x2

    .line 279
    invoke-direct {v12, v15, v1, v4, v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 280
    .line 281
    .line 282
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 283
    .line 284
    new-instance v15, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 285
    .line 286
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 287
    .line 288
    invoke-direct {v13, v6}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 292
    .line 293
    invoke-direct {v1, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 297
    .line 298
    invoke-direct {v4, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    move-object/from16 v17, v1

    .line 302
    .line 303
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 304
    .line 305
    move-object/from16 v34, v3

    .line 306
    .line 307
    const-string v3, "#30A0F8AA"

    .line 308
    .line 309
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    move-object/from16 v19, v1

    .line 313
    .line 314
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 315
    .line 316
    move-object/from16 v18, v4

    .line 317
    .line 318
    const-string v4, "#3fc1f7"

    .line 319
    .line 320
    invoke-direct {v1, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 324
    .line 325
    invoke-direct {v4, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    move-object/from16 v20, v1

    .line 329
    .line 330
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 331
    .line 332
    move-object/from16 v21, v4

    .line 333
    .line 334
    const-string v4, "#2d7fc1"

    .line 335
    .line 336
    invoke-direct {v1, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    move-object/from16 v23, v1

    .line 340
    .line 341
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 342
    .line 343
    move-object/from16 v35, v10

    .line 344
    .line 345
    const-string v10, "#7676801F"

    .line 346
    .line 347
    invoke-direct {v1, v10}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    move-object/from16 v24, v1

    .line 351
    .line 352
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 353
    .line 354
    move-object/from16 v36, v11

    .line 355
    .line 356
    const-string v11, "#100031"

    .line 357
    .line 358
    invoke-direct {v1, v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 362
    .line 363
    move-object/from16 v25, v1

    .line 364
    .line 365
    const-string v1, "#eeeef0"

    .line 366
    .line 367
    invoke-direct {v11, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    move-object/from16 v27, v11

    .line 371
    .line 372
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 373
    .line 374
    invoke-direct {v11, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    move-object/from16 v28, v11

    .line 378
    .line 379
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 380
    .line 381
    invoke-direct {v11, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 385
    .line 386
    invoke-direct {v4, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    const/16 v31, 0x440

    .line 390
    .line 391
    move-object/from16 v30, v4

    .line 392
    .line 393
    move-object/from16 v29, v11

    .line 394
    .line 395
    move-object/from16 v16, v13

    .line 396
    .line 397
    invoke-direct/range {v15 .. v32}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 398
    .line 399
    .line 400
    const/4 v4, 0x0

    .line 401
    const/4 v11, 0x2

    .line 402
    invoke-direct {v8, v15, v4, v11, v4}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v0, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 410
    .line 411
    new-instance v15, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 412
    .line 413
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 414
    .line 415
    invoke-direct {v11, v6}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 419
    .line 420
    invoke-direct {v13, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    move-object/from16 v16, v11

    .line 424
    .line 425
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 426
    .line 427
    invoke-direct {v11, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    move-object/from16 v18, v11

    .line 431
    .line 432
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 433
    .line 434
    invoke-direct {v11, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    move-object/from16 v19, v11

    .line 438
    .line 439
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 440
    .line 441
    move-object/from16 v37, v12

    .line 442
    .line 443
    const-string v12, "#da4079"

    .line 444
    .line 445
    invoke-direct {v11, v12}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 449
    .line 450
    invoke-direct {v12, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    move-object/from16 v20, v11

    .line 454
    .line 455
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 456
    .line 457
    move-object/from16 v21, v12

    .line 458
    .line 459
    const-string v12, "#cd0654"

    .line 460
    .line 461
    invoke-direct {v11, v12}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    move-object/from16 v23, v11

    .line 465
    .line 466
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 467
    .line 468
    invoke-direct {v11, v10}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    move-object/from16 v24, v11

    .line 472
    .line 473
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 474
    .line 475
    move-object/from16 v17, v13

    .line 476
    .line 477
    const-string v13, "#310217"

    .line 478
    .line 479
    invoke-direct {v11, v13}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 483
    .line 484
    invoke-direct {v13, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    move-object/from16 v25, v11

    .line 488
    .line 489
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 490
    .line 491
    invoke-direct {v11, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    move-object/from16 v28, v11

    .line 495
    .line 496
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 497
    .line 498
    invoke-direct {v11, v12}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 502
    .line 503
    invoke-direct {v12, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    move-object/from16 v29, v11

    .line 507
    .line 508
    move-object/from16 v30, v12

    .line 509
    .line 510
    move-object/from16 v27, v13

    .line 511
    .line 512
    invoke-direct/range {v15 .. v32}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 513
    .line 514
    .line 515
    const/4 v11, 0x0

    .line 516
    const/4 v12, 0x2

    .line 517
    invoke-direct {v8, v15, v11, v12, v11}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 518
    .line 519
    .line 520
    invoke-static {v5, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 521
    .line 522
    .line 523
    move-result-object v8

    .line 524
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 525
    .line 526
    new-instance v15, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 527
    .line 528
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 529
    .line 530
    invoke-direct {v12, v6}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 534
    .line 535
    invoke-direct {v6, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 539
    .line 540
    invoke-direct {v13, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    move-object/from16 v38, v5

    .line 544
    .line 545
    new-instance v5, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 546
    .line 547
    invoke-direct {v5, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    new-instance v3, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 551
    .line 552
    move-object/from16 v19, v5

    .line 553
    .line 554
    const-string v5, "#94d269"

    .line 555
    .line 556
    invoke-direct {v3, v5}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    new-instance v5, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 560
    .line 561
    invoke-direct {v5, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 565
    .line 566
    move-object/from16 v20, v3

    .line 567
    .line 568
    const-string v3, "#76c343"

    .line 569
    .line 570
    invoke-direct {v2, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    move-object/from16 v23, v2

    .line 574
    .line 575
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 576
    .line 577
    invoke-direct {v2, v10}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 581
    .line 582
    move-object/from16 v24, v2

    .line 583
    .line 584
    const-string v2, "#213711"

    .line 585
    .line 586
    invoke-direct {v10, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 590
    .line 591
    invoke-direct {v2, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 595
    .line 596
    invoke-direct {v1, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    move-object/from16 v28, v1

    .line 600
    .line 601
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 602
    .line 603
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    new-instance v3, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 607
    .line 608
    invoke-direct {v3, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    move-object/from16 v29, v1

    .line 612
    .line 613
    move-object/from16 v27, v2

    .line 614
    .line 615
    move-object/from16 v30, v3

    .line 616
    .line 617
    move-object/from16 v21, v5

    .line 618
    .line 619
    move-object/from16 v17, v6

    .line 620
    .line 621
    move-object/from16 v25, v10

    .line 622
    .line 623
    move-object/from16 v16, v12

    .line 624
    .line 625
    move-object/from16 v18, v13

    .line 626
    .line 627
    invoke-direct/range {v15 .. v32}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 628
    .line 629
    .line 630
    const/4 v1, 0x0

    .line 631
    const/4 v12, 0x2

    .line 632
    invoke-direct {v11, v15, v1, v12, v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 633
    .line 634
    .line 635
    invoke-static {v7, v11}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    filled-new-array {v4, v8, v1}, [Lkotlin/Pair;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-static {v1}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 644
    .line 645
    .line 646
    move-result-object v13

    .line 647
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 648
    .line 649
    const/16 v16, 0x102e

    .line 650
    .line 651
    const/16 v17, 0x0

    .line 652
    .line 653
    const/4 v4, 0x0

    .line 654
    const/4 v5, 0x0

    .line 655
    const/4 v6, 0x0

    .line 656
    const/4 v8, 0x0

    .line 657
    const/4 v9, 0x1

    .line 658
    const/4 v15, 0x0

    .line 659
    move-object/from16 v39, v7

    .line 660
    .line 661
    move-object/from16 v7, v33

    .line 662
    .line 663
    move-object/from16 v3, v34

    .line 664
    .line 665
    move-object/from16 v10, v35

    .line 666
    .line 667
    move-object/from16 v11, v36

    .line 668
    .line 669
    move-object/from16 v12, v37

    .line 670
    .line 671
    move-object/from16 v1, v38

    .line 672
    .line 673
    invoke-direct/range {v2 .. v17}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 674
    .line 675
    .line 676
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

    .line 677
    .line 678
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getAssetBaseURL()Ljava/net/URL;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 683
    .line 684
    new-instance v7, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 685
    .line 686
    const/4 v11, 0x2

    .line 687
    const/4 v12, 0x0

    .line 688
    const-string v8, "Access to 10 cinematic LUTs"

    .line 689
    .line 690
    const/4 v9, 0x0

    .line 691
    const-string v10, "tick"

    .line 692
    .line 693
    invoke-direct/range {v7 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 694
    .line 695
    .line 696
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 697
    .line 698
    const/4 v12, 0x2

    .line 699
    const/4 v13, 0x0

    .line 700
    const-string v9, "Standard fonts"

    .line 701
    .line 702
    const/4 v10, 0x0

    .line 703
    const-string v11, "tick"

    .line 704
    .line 705
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 706
    .line 707
    .line 708
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 709
    .line 710
    const/4 v13, 0x2

    .line 711
    const/4 v14, 0x0

    .line 712
    const-string v10, "2 templates"

    .line 713
    .line 714
    const/4 v11, 0x0

    .line 715
    const-string v12, "tick"

    .line 716
    .line 717
    invoke-direct/range {v9 .. v14}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 718
    .line 719
    .line 720
    filled-new-array {v7, v8, v9}, [Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 721
    .line 722
    .line 723
    move-result-object v4

    .line 724
    invoke-static {v4}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 725
    .line 726
    .line 727
    move-result-object v16

    .line 728
    const/16 v19, 0x892

    .line 729
    .line 730
    const/16 v20, 0x0

    .line 731
    .line 732
    const-string v7, "Get started with our Basic plan"

    .line 733
    .line 734
    const/4 v8, 0x0

    .line 735
    const-string v9, "{{ price_per_period }}"

    .line 736
    .line 737
    const-string v10, "Start your {{ sub_offer_duration }} free trial"

    .line 738
    .line 739
    const-string v12, "{{ total_price_and_per_month }}"

    .line 740
    .line 741
    const-string v13, "Free for {{ sub_offer_duration }}, then {{ total_price_and_per_month }}"

    .line 742
    .line 743
    const-string v15, "{{ sub_period }}"

    .line 744
    .line 745
    const-string v17, "Basic"

    .line 746
    .line 747
    const/16 v18, 0x0

    .line 748
    .line 749
    invoke-direct/range {v6 .. v20}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 750
    .line 751
    .line 752
    const-string v4, "en_US"

    .line 753
    .line 754
    invoke-static {v4, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 755
    .line 756
    .line 757
    move-result-object v6

    .line 758
    invoke-static {v6}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 759
    .line 760
    .line 761
    move-result-object v7

    .line 762
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 763
    .line 764
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 765
    .line 766
    const/4 v13, 0x2

    .line 767
    const-string v10, "Access to 10 cinematic LUTs"

    .line 768
    .line 769
    const-string v12, "tick"

    .line 770
    .line 771
    invoke-direct/range {v9 .. v14}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 772
    .line 773
    .line 774
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 775
    .line 776
    const/4 v14, 0x2

    .line 777
    const/4 v15, 0x0

    .line 778
    const-string v11, "Standard fonts"

    .line 779
    .line 780
    const/4 v12, 0x0

    .line 781
    const-string v13, "tick"

    .line 782
    .line 783
    invoke-direct/range {v10 .. v15}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 784
    .line 785
    .line 786
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 787
    .line 788
    const/4 v15, 0x2

    .line 789
    const/16 v16, 0x0

    .line 790
    .line 791
    const-string v12, "2 templates"

    .line 792
    .line 793
    const/4 v13, 0x0

    .line 794
    const-string v14, "tick"

    .line 795
    .line 796
    invoke-direct/range {v11 .. v16}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 797
    .line 798
    .line 799
    filled-new-array {v9, v10, v11}, [Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 800
    .line 801
    .line 802
    move-result-object v6

    .line 803
    invoke-static {v6}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 804
    .line 805
    .line 806
    move-result-object v18

    .line 807
    const/16 v21, 0x892

    .line 808
    .line 809
    const-string v9, "Get started with our Basic plan"

    .line 810
    .line 811
    const/4 v10, 0x0

    .line 812
    const-string v11, "Subscribe for {{ price_per_period }}"

    .line 813
    .line 814
    const-string v12, "Start your {{ sub_offer_duration }} free trial"

    .line 815
    .line 816
    const-string v14, "{{ total_price_and_per_month }}"

    .line 817
    .line 818
    const-string v15, "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial"

    .line 819
    .line 820
    const-string v17, "{{ sub_period }}"

    .line 821
    .line 822
    const-string v19, "Basic"

    .line 823
    .line 824
    invoke-direct/range {v8 .. v22}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 825
    .line 826
    .line 827
    invoke-static {v0, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 832
    .line 833
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 834
    .line 835
    const/4 v13, 0x2

    .line 836
    const/4 v14, 0x0

    .line 837
    const-string v10, "Access to 30 cinematic LUTs"

    .line 838
    .line 839
    const/4 v11, 0x0

    .line 840
    const-string v12, "tick"

    .line 841
    .line 842
    invoke-direct/range {v9 .. v14}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 843
    .line 844
    .line 845
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 846
    .line 847
    const/4 v14, 0x2

    .line 848
    const/4 v15, 0x0

    .line 849
    const-string v11, "Pro fonts and transition effects"

    .line 850
    .line 851
    const/4 v12, 0x0

    .line 852
    const-string v13, "tick"

    .line 853
    .line 854
    invoke-direct/range {v10 .. v15}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 855
    .line 856
    .line 857
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 858
    .line 859
    const/4 v15, 0x2

    .line 860
    const-string v12, "10+ templates"

    .line 861
    .line 862
    const/4 v13, 0x0

    .line 863
    const-string v14, "tick"

    .line 864
    .line 865
    invoke-direct/range {v11 .. v16}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 866
    .line 867
    .line 868
    filled-new-array {v9, v10, v11}, [Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 869
    .line 870
    .line 871
    move-result-object v6

    .line 872
    invoke-static {v6}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 873
    .line 874
    .line 875
    move-result-object v18

    .line 876
    const-string v9, "Get started with our Standard plan"

    .line 877
    .line 878
    const/4 v10, 0x0

    .line 879
    const-string v11, "Subscribe for {{ price_per_period }}"

    .line 880
    .line 881
    const-string v12, "Start your {{ sub_offer_duration }} free trial"

    .line 882
    .line 883
    const-string v14, "{{ total_price_and_per_month }}"

    .line 884
    .line 885
    const-string v15, "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial"

    .line 886
    .line 887
    const-string v17, "{{ sub_period }}"

    .line 888
    .line 889
    const-string v19, "Standard"

    .line 890
    .line 891
    invoke-direct/range {v8 .. v22}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 892
    .line 893
    .line 894
    invoke-static {v1, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 895
    .line 896
    .line 897
    move-result-object v1

    .line 898
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 899
    .line 900
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 901
    .line 902
    const/4 v13, 0x2

    .line 903
    const/4 v14, 0x0

    .line 904
    const-string v10, "Access to all 150 of our cinematic LUTs"

    .line 905
    .line 906
    const/4 v11, 0x0

    .line 907
    const-string v12, "tick"

    .line 908
    .line 909
    invoke-direct/range {v9 .. v14}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 910
    .line 911
    .line 912
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 913
    .line 914
    const/4 v14, 0x2

    .line 915
    const/4 v15, 0x0

    .line 916
    const-string v11, "Custom design tools and transition effects"

    .line 917
    .line 918
    const/4 v12, 0x0

    .line 919
    const-string v13, "tick"

    .line 920
    .line 921
    invoke-direct/range {v10 .. v15}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 922
    .line 923
    .line 924
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 925
    .line 926
    const/4 v15, 0x2

    .line 927
    const-string v12, "100+ exclusive templates"

    .line 928
    .line 929
    const/4 v13, 0x0

    .line 930
    const-string v14, "tick"

    .line 931
    .line 932
    invoke-direct/range {v11 .. v16}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 933
    .line 934
    .line 935
    filled-new-array {v9, v10, v11}, [Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 936
    .line 937
    .line 938
    move-result-object v6

    .line 939
    invoke-static {v6}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 940
    .line 941
    .line 942
    move-result-object v18

    .line 943
    const-string v9, "Master the art of video editing"

    .line 944
    .line 945
    const/4 v10, 0x0

    .line 946
    const-string v11, "Subscribe for {{ price_per_period }}"

    .line 947
    .line 948
    const-string v12, "Start your {{ sub_offer_duration }} free trial"

    .line 949
    .line 950
    const-string v14, "{{ total_price_and_per_month }}"

    .line 951
    .line 952
    const-string v15, "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial"

    .line 953
    .line 954
    const-string v17, "{{ sub_period }}"

    .line 955
    .line 956
    const-string v19, "Premium"

    .line 957
    .line 958
    invoke-direct/range {v8 .. v22}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 959
    .line 960
    .line 961
    move-object/from16 v6, v39

    .line 962
    .line 963
    invoke-static {v6, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 964
    .line 965
    .line 966
    move-result-object v6

    .line 967
    filled-new-array {v0, v1, v6}, [Lkotlin/Pair;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    invoke-static {v4, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    invoke-static {v0}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 980
    .line 981
    .line 982
    move-result-object v8

    .line 983
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getZeroDecimalPlaceCountries()Ljava/util/List;

    .line 984
    .line 985
    .line 986
    move-result-object v9

    .line 987
    const/16 v11, 0x111

    .line 988
    .line 989
    const/4 v12, 0x0

    .line 990
    move-object v4, v2

    .line 991
    const/4 v2, 0x0

    .line 992
    const-string v3, "7"

    .line 993
    .line 994
    const/4 v6, 0x0

    .line 995
    move-object/from16 v1, p0

    .line 996
    .line 997
    invoke-direct/range {v1 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 998
    .line 999
    .line 1000
    return-object v1
.end method
