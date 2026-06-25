.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/templates/Template7CustomPackagesTestDataKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "template7CustomPackages",
        "Lcom/revenuecat/purchases/paywalls/PaywallData;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;",
        "getTemplate7CustomPackages",
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
.method public static final getTemplate7CustomPackages(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;
    .locals 41

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
    const-string v5, "954459_1701267532.jpeg"

    .line 34
    .line 35
    invoke-direct/range {v4 .. v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    const-string v5, "premium"

    .line 39
    .line 40
    invoke-static {v5, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    filled-new-array {v2, v4}, [Lkotlin/Pair;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;

    .line 53
    .line 54
    sget-object v18, Lcom/revenuecat/purchases/PackageType;->ANNUAL:Lcom/revenuecat/purchases/PackageType;

    .line 55
    .line 56
    invoke-virtual/range {v18 .. v18}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object v19, Lcom/revenuecat/purchases/PackageType;->MONTHLY:Lcom/revenuecat/purchases/PackageType;

    .line 64
    .line 65
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v20, Lcom/revenuecat/purchases/PackageType;->SIX_MONTH:Lcom/revenuecat/purchases/PackageType;

    .line 73
    .line 74
    invoke-virtual/range {v20 .. v20}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    filled-new-array {v4, v6, v8}, [Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v4}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual/range {v18 .. v18}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v2, v0, v4, v6}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;

    .line 100
    .line 101
    sget-object v6, Lcom/revenuecat/purchases/PackageType;->LIFETIME:Lcom/revenuecat/purchases/PackageType;

    .line 102
    .line 103
    invoke-virtual {v6}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v8}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v6}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v4, v5, v8, v6}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    filled-new-array {v2, v4}, [Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Tier;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-static {v2}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v14

    .line 132
    new-instance v10, Ljava/net/URL;

    .line 133
    .line 134
    const-string v2, "https://revenuecat.com/tos"

    .line 135
    .line 136
    invoke-direct {v10, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v11, Ljava/net/URL;

    .line 140
    .line 141
    const-string v2, "https://revenuecat.com/privacy"

    .line 142
    .line 143
    invoke-direct {v11, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 147
    .line 148
    new-instance v21, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 149
    .line 150
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 151
    .line 152
    const-string v4, "#FFFFFF"

    .line 153
    .line 154
    invoke-direct {v2, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 158
    .line 159
    const-string v8, "#000000"

    .line 160
    .line 161
    invoke-direct {v6, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 165
    .line 166
    const-string v13, "#45c186"

    .line 167
    .line 168
    invoke-direct {v9, v13}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 172
    .line 173
    const-string v15, "#ffffff"

    .line 174
    .line 175
    invoke-direct {v13, v15}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const/16 v37, 0x7fcc

    .line 179
    .line 180
    const/16 v38, 0x0

    .line 181
    .line 182
    const/16 v24, 0x0

    .line 183
    .line 184
    const/16 v25, 0x0

    .line 185
    .line 186
    const/16 v28, 0x0

    .line 187
    .line 188
    const/16 v29, 0x0

    .line 189
    .line 190
    const/16 v30, 0x0

    .line 191
    .line 192
    const/16 v31, 0x0

    .line 193
    .line 194
    const/16 v32, 0x0

    .line 195
    .line 196
    const/16 v33, 0x0

    .line 197
    .line 198
    const/16 v34, 0x0

    .line 199
    .line 200
    const/16 v35, 0x0

    .line 201
    .line 202
    const/16 v36, 0x0

    .line 203
    .line 204
    move-object/from16 v22, v2

    .line 205
    .line 206
    move-object/from16 v23, v6

    .line 207
    .line 208
    move-object/from16 v26, v9

    .line 209
    .line 210
    move-object/from16 v27, v13

    .line 211
    .line 212
    invoke-direct/range {v21 .. v38}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 213
    .line 214
    .line 215
    move-object/from16 v2, v21

    .line 216
    .line 217
    const/4 v6, 0x0

    .line 218
    const/4 v9, 0x2

    .line 219
    invoke-direct {v12, v2, v6, v9, v6}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 220
    .line 221
    .line 222
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 223
    .line 224
    new-instance v21, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 225
    .line 226
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 227
    .line 228
    invoke-direct {v13, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 232
    .line 233
    invoke-direct {v6, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 237
    .line 238
    invoke-direct {v9, v15}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    move-object/from16 v39, v1

    .line 242
    .line 243
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 244
    .line 245
    move-object/from16 v17, v3

    .line 246
    .line 247
    const-string v3, "#30A0F8AA"

    .line 248
    .line 249
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v25, v1

    .line 253
    .line 254
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 255
    .line 256
    move-object/from16 v23, v6

    .line 257
    .line 258
    const-string v6, "#3fc1f7"

    .line 259
    .line 260
    invoke-direct {v1, v6}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 264
    .line 265
    invoke-direct {v6, v15}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v26, v1

    .line 269
    .line 270
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 271
    .line 272
    move-object/from16 v27, v6

    .line 273
    .line 274
    const-string v6, "#2d7fc1"

    .line 275
    .line 276
    invoke-direct {v1, v6}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    move-object/from16 v29, v1

    .line 280
    .line 281
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 282
    .line 283
    move-object/from16 v40, v7

    .line 284
    .line 285
    const-string v7, "#7676801F"

    .line 286
    .line 287
    invoke-direct {v1, v7}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    move-object/from16 v30, v1

    .line 291
    .line 292
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 293
    .line 294
    move-object/from16 v24, v9

    .line 295
    .line 296
    const-string v9, "#100031"

    .line 297
    .line 298
    invoke-direct {v1, v9}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 302
    .line 303
    move-object/from16 v31, v1

    .line 304
    .line 305
    const-string v1, "#eeeef0"

    .line 306
    .line 307
    invoke-direct {v9, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v33, v9

    .line 311
    .line 312
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 313
    .line 314
    invoke-direct {v9, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    move-object/from16 v34, v9

    .line 318
    .line 319
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 320
    .line 321
    invoke-direct {v9, v6}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 325
    .line 326
    invoke-direct {v6, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    const/16 v37, 0x440

    .line 330
    .line 331
    move-object/from16 v36, v6

    .line 332
    .line 333
    move-object/from16 v35, v9

    .line 334
    .line 335
    move-object/from16 v22, v13

    .line 336
    .line 337
    invoke-direct/range {v21 .. v38}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 338
    .line 339
    .line 340
    move-object/from16 v6, v21

    .line 341
    .line 342
    const/4 v9, 0x0

    .line 343
    const/4 v13, 0x2

    .line 344
    invoke-direct {v2, v6, v9, v13, v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 345
    .line 346
    .line 347
    invoke-static {v0, v2}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 352
    .line 353
    new-instance v21, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 354
    .line 355
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 356
    .line 357
    invoke-direct {v9, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 361
    .line 362
    invoke-direct {v4, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 366
    .line 367
    invoke-direct {v13, v15}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    move-object/from16 v23, v4

    .line 371
    .line 372
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 373
    .line 374
    invoke-direct {v4, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    new-instance v3, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 378
    .line 379
    move-object/from16 v25, v4

    .line 380
    .line 381
    const-string v4, "#94d269"

    .line 382
    .line 383
    invoke-direct {v3, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 387
    .line 388
    invoke-direct {v4, v15}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    new-instance v15, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 392
    .line 393
    move-object/from16 v26, v3

    .line 394
    .line 395
    const-string v3, "#76c343"

    .line 396
    .line 397
    invoke-direct {v15, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    move-object/from16 v27, v4

    .line 401
    .line 402
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 403
    .line 404
    invoke-direct {v4, v7}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    new-instance v7, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 408
    .line 409
    move-object/from16 v30, v4

    .line 410
    .line 411
    const-string v4, "#213711"

    .line 412
    .line 413
    invoke-direct {v7, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 417
    .line 418
    invoke-direct {v4, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 422
    .line 423
    invoke-direct {v1, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    move-object/from16 v34, v1

    .line 427
    .line 428
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 429
    .line 430
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    new-instance v3, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 434
    .line 435
    invoke-direct {v3, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    move-object/from16 v35, v1

    .line 439
    .line 440
    move-object/from16 v36, v3

    .line 441
    .line 442
    move-object/from16 v33, v4

    .line 443
    .line 444
    move-object/from16 v31, v7

    .line 445
    .line 446
    move-object/from16 v22, v9

    .line 447
    .line 448
    move-object/from16 v24, v13

    .line 449
    .line 450
    move-object/from16 v29, v15

    .line 451
    .line 452
    invoke-direct/range {v21 .. v38}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 453
    .line 454
    .line 455
    move-object/from16 v1, v21

    .line 456
    .line 457
    const/4 v9, 0x0

    .line 458
    const/4 v13, 0x2

    .line 459
    invoke-direct {v6, v1, v9, v13, v9}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v5, v6}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    filled-new-array {v2, v1}, [Lkotlin/Pair;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-static {v1}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 471
    .line 472
    .line 473
    move-result-object v13

    .line 474
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 475
    .line 476
    const/16 v16, 0x102e

    .line 477
    .line 478
    move-object/from16 v3, v17

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const/4 v4, 0x0

    .line 483
    move-object v1, v5

    .line 484
    const/4 v5, 0x0

    .line 485
    const/4 v6, 0x0

    .line 486
    const/4 v8, 0x0

    .line 487
    const/4 v9, 0x1

    .line 488
    const/4 v15, 0x0

    .line 489
    move-object/from16 v7, v40

    .line 490
    .line 491
    invoke-direct/range {v2 .. v17}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 492
    .line 493
    .line 494
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

    .line 495
    .line 496
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getAssetBaseURL()Ljava/net/URL;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    new-instance v21, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 501
    .line 502
    const/16 v34, 0xeda

    .line 503
    .line 504
    const/16 v35, 0x0

    .line 505
    .line 506
    const-string v22, "Get started with our Basic plan"

    .line 507
    .line 508
    const/16 v23, 0x0

    .line 509
    .line 510
    const-string v24, "{{ price_per_period }}"

    .line 511
    .line 512
    const/16 v25, 0x0

    .line 513
    .line 514
    const/16 v26, 0x0

    .line 515
    .line 516
    const-string v27, "{{ total_price_and_per_month }}"

    .line 517
    .line 518
    const/16 v29, 0x0

    .line 519
    .line 520
    const-string v30, "{{ sub_period }}"

    .line 521
    .line 522
    const/16 v31, 0x0

    .line 523
    .line 524
    const/16 v33, 0x0

    .line 525
    .line 526
    invoke-direct/range {v21 .. v35}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 527
    .line 528
    .line 529
    move-object/from16 v4, v21

    .line 530
    .line 531
    const-string v6, "en_US"

    .line 532
    .line 533
    invoke-static {v6, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    invoke-static {v4}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 538
    .line 539
    .line 540
    move-result-object v7

    .line 541
    new-instance v21, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 542
    .line 543
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 544
    .line 545
    const/4 v12, 0x2

    .line 546
    const/4 v13, 0x0

    .line 547
    const-string v9, "Access to all 150 of our cinematic LUTs"

    .line 548
    .line 549
    const/4 v10, 0x0

    .line 550
    const-string v11, "tick"

    .line 551
    .line 552
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 553
    .line 554
    .line 555
    invoke-static {v8}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 556
    .line 557
    .line 558
    move-result-object v31

    .line 559
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;

    .line 567
    .line 568
    const/16 v14, 0xc

    .line 569
    .line 570
    const-string v9, "{{ sub_period }}"

    .line 571
    .line 572
    const-string v10, "{{ total_price_and_per_month }}"

    .line 573
    .line 574
    const/4 v11, 0x0

    .line 575
    const/4 v12, 0x0

    .line 576
    invoke-direct/range {v8 .. v15}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 577
    .line 578
    .line 579
    invoke-static {v4, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    invoke-virtual/range {v18 .. v18}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v8

    .line 587
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;

    .line 591
    .line 592
    const/16 v15, 0xc

    .line 593
    .line 594
    const/16 v16, 0x0

    .line 595
    .line 596
    const-string v10, "NAME OVERRIDE {{ sub_period }}"

    .line 597
    .line 598
    const-string v11, "DETAIL OVERRIDE {{ total_price_and_per_month }}"

    .line 599
    .line 600
    const/4 v14, 0x0

    .line 601
    invoke-direct/range {v9 .. v16}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 602
    .line 603
    .line 604
    invoke-static {v8, v9}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 605
    .line 606
    .line 607
    move-result-object v8

    .line 608
    invoke-virtual/range {v20 .. v20}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v9

    .line 612
    invoke-static {v9}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;

    .line 616
    .line 617
    const/16 v16, 0xc

    .line 618
    .line 619
    const-string v11, "NAME OVERRIDE {{ sub_period }}"

    .line 620
    .line 621
    const-string v12, "DETAIL OVERRIDE {{ total_price_and_per_month }}"

    .line 622
    .line 623
    const-string v15, "BADGE OVERRIDE {{ sub_relative_discount }}"

    .line 624
    .line 625
    invoke-direct/range {v10 .. v17}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 626
    .line 627
    .line 628
    invoke-static {v9, v10}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 629
    .line 630
    .line 631
    move-result-object v9

    .line 632
    filled-new-array {v4, v8, v9}, [Lkotlin/Pair;

    .line 633
    .line 634
    .line 635
    move-result-object v4

    .line 636
    invoke-static {v4}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 637
    .line 638
    .line 639
    move-result-object v33

    .line 640
    const/16 v34, 0x92

    .line 641
    .line 642
    const-string v22, "Get started with our Basic plan"

    .line 643
    .line 644
    const-string v24, "Subscribe for {{ price_per_period }}"

    .line 645
    .line 646
    const-string v25, "Start your {{ sub_offer_duration }} free trial"

    .line 647
    .line 648
    const-string v27, "{{ total_price_and_per_month }}"

    .line 649
    .line 650
    const-string v28, "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial"

    .line 651
    .line 652
    const-string v30, "{{ sub_period }}"

    .line 653
    .line 654
    const-string v32, "Basic"

    .line 655
    .line 656
    invoke-direct/range {v21 .. v35}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 657
    .line 658
    .line 659
    move-object/from16 v4, v21

    .line 660
    .line 661
    invoke-static {v0, v4}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 666
    .line 667
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 668
    .line 669
    const/4 v13, 0x2

    .line 670
    const-string v10, "Access to all 150 of our cinematic LUTs"

    .line 671
    .line 672
    const/4 v11, 0x0

    .line 673
    const-string v12, "tick"

    .line 674
    .line 675
    invoke-direct/range {v9 .. v14}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 676
    .line 677
    .line 678
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 679
    .line 680
    const/4 v14, 0x2

    .line 681
    const/4 v15, 0x0

    .line 682
    const-string v11, "Custom design tools and transition effects"

    .line 683
    .line 684
    const/4 v12, 0x0

    .line 685
    const-string v13, "tick"

    .line 686
    .line 687
    invoke-direct/range {v10 .. v15}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 688
    .line 689
    .line 690
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 691
    .line 692
    const/4 v15, 0x2

    .line 693
    const/16 v16, 0x0

    .line 694
    .line 695
    const-string v12, "100+ exclusive templates"

    .line 696
    .line 697
    const/4 v13, 0x0

    .line 698
    const-string v14, "tick"

    .line 699
    .line 700
    invoke-direct/range {v11 .. v16}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 701
    .line 702
    .line 703
    filled-new-array {v9, v10, v11}, [Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 704
    .line 705
    .line 706
    move-result-object v4

    .line 707
    invoke-static {v4}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 708
    .line 709
    .line 710
    move-result-object v18

    .line 711
    const/16 v21, 0x892

    .line 712
    .line 713
    const/16 v22, 0x0

    .line 714
    .line 715
    const-string v9, "Master the art of video editing"

    .line 716
    .line 717
    const/4 v10, 0x0

    .line 718
    const-string v11, "Subscribe for {{ price_per_period }}"

    .line 719
    .line 720
    const-string v12, "Start your {{ sub_offer_duration }} free trial"

    .line 721
    .line 722
    const-string v14, "{{ total_price_and_per_month }}"

    .line 723
    .line 724
    const-string v15, "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial"

    .line 725
    .line 726
    const-string v17, "{{ sub_period }}"

    .line 727
    .line 728
    const-string v19, "Premium"

    .line 729
    .line 730
    const/16 v20, 0x0

    .line 731
    .line 732
    invoke-direct/range {v8 .. v22}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 733
    .line 734
    .line 735
    invoke-static {v1, v8}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-static {v0}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-static {v6, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-static {v0}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 752
    .line 753
    .line 754
    move-result-object v8

    .line 755
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getZeroDecimalPlaceCountries()Ljava/util/List;

    .line 756
    .line 757
    .line 758
    move-result-object v9

    .line 759
    const/16 v11, 0x111

    .line 760
    .line 761
    const/4 v12, 0x0

    .line 762
    move-object v4, v2

    .line 763
    const/4 v2, 0x0

    .line 764
    const-string v3, "7"

    .line 765
    .line 766
    const/4 v6, 0x0

    .line 767
    move-object/from16 v1, v39

    .line 768
    .line 769
    invoke-direct/range {v1 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 770
    .line 771
    .line 772
    return-object v1
.end method
