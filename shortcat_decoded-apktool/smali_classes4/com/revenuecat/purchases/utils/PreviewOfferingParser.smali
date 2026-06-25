.class final Lcom/revenuecat/purchases/utils/PreviewOfferingParser;
.super Lcom/revenuecat/purchases/common/OfferingParser;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/utils/PreviewOfferingParser$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00080\u00062\u0006\u0010\t\u001a\u00020\nH\u0014\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/utils/PreviewOfferingParser;",
        "Lcom/revenuecat/purchases/common/OfferingParser;",
        "()V",
        "findMatchingProduct",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "productsById",
        "",
        "",
        "",
        "packageJson",
        "Lorg/json/JSONObject;",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/common/OfferingParser;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected findMatchingProduct(Ljava/util/Map;Lorg/json/JSONObject;)Lcom/revenuecat/purchases/models/StoreProduct;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/models/StoreProduct;",
            ">;>;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/revenuecat/purchases/models/StoreProduct;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const-string v3, "productsById"

    .line 9
    .line 10
    move-object/from16 v4, p1

    .line 11
    .line 12
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v3, "packageJson"

    .line 16
    .line 17
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v3, "identifier"

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {}, Lcom/revenuecat/purchases/PackageType;->values()[Lcom/revenuecat/purchases/PackageType;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    array-length v4, v3

    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_0
    if-ge v5, v4, :cond_1

    .line 33
    .line 34
    aget-object v6, v3, v5

    .line 35
    .line 36
    invoke-virtual {v6}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    sget-object v0, Lcom/revenuecat/purchases/utils/PreviewOfferingParser$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    aget v0, v0, v3

    .line 53
    .line 54
    const-wide/16 v3, 0x0

    .line 55
    .line 56
    const-string v5, "Free"

    .line 57
    .line 58
    const-wide/32 v6, 0x3ce1f0

    .line 59
    .line 60
    .line 61
    const-string v8, "$ 3.99"

    .line 62
    .line 63
    const/4 v9, 0x2

    .line 64
    const-string v10, "P1M"

    .line 65
    .line 66
    const-string v11, "USD"

    .line 67
    .line 68
    packed-switch v0, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    return-object v0

    .line 73
    :pswitch_0
    new-instance v6, Lcom/revenuecat/purchases/models/Price;

    .line 74
    .line 75
    const-string v0, "$ 1.49"

    .line 76
    .line 77
    const-wide/32 v2, 0x16bc50

    .line 78
    .line 79
    .line 80
    invoke-direct {v6, v0, v2, v3, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v7, Lcom/revenuecat/purchases/models/Period;

    .line 84
    .line 85
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 86
    .line 87
    const-string v2, "P1W"

    .line 88
    .line 89
    invoke-direct {v7, v1, v0, v2}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance v1, Lcom/revenuecat/purchases/models/TestStoreProduct;

    .line 93
    .line 94
    const/16 v10, 0xc0

    .line 95
    .line 96
    const/4 v11, 0x0

    .line 97
    const-string v2, "com.revenuecat.weekly_product"

    .line 98
    .line 99
    const-string v3, "Weekly"

    .line 100
    .line 101
    const-string v4, "Weekly (App name)"

    .line 102
    .line 103
    const-string v5, "Weekly"

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    invoke-direct/range {v1 .. v11}, Lcom/revenuecat/purchases/models/TestStoreProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 108
    .line 109
    .line 110
    return-object v1

    .line 111
    :pswitch_1
    new-instance v7, Lcom/revenuecat/purchases/models/Price;

    .line 112
    .line 113
    const-string v0, "$ 7.99"

    .line 114
    .line 115
    const-wide/32 v2, 0x79eaf0

    .line 116
    .line 117
    .line 118
    invoke-direct {v7, v0, v2, v3, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    new-instance v8, Lcom/revenuecat/purchases/models/Period;

    .line 122
    .line 123
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 124
    .line 125
    invoke-direct {v8, v1, v0, v10}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v2, Lcom/revenuecat/purchases/models/TestStoreProduct;

    .line 129
    .line 130
    const/16 v11, 0xc0

    .line 131
    .line 132
    const/4 v12, 0x0

    .line 133
    const-string v3, "com.revenuecat.monthly_product"

    .line 134
    .line 135
    const-string v4, "Monthly"

    .line 136
    .line 137
    const-string v5, "Monthly (App name)"

    .line 138
    .line 139
    const-string v6, "Monthly"

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    const/4 v10, 0x0

    .line 143
    invoke-direct/range {v2 .. v12}, Lcom/revenuecat/purchases/models/TestStoreProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    return-object v2

    .line 147
    :pswitch_2
    new-instance v0, Lcom/revenuecat/purchases/models/Price;

    .line 148
    .line 149
    const-string v3, "$ 15.99"

    .line 150
    .line 151
    const-wide/32 v4, 0xf3fcf0

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v3, v4, v5, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    new-instance v3, Lcom/revenuecat/purchases/models/Period;

    .line 158
    .line 159
    sget-object v4, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 160
    .line 161
    const-string v5, "P2M"

    .line 162
    .line 163
    invoke-direct {v3, v9, v4, v5}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    new-instance v5, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 167
    .line 168
    new-instance v9, Lcom/revenuecat/purchases/models/Period;

    .line 169
    .line 170
    invoke-direct {v9, v1, v4, v10}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    sget-object v1, Lcom/revenuecat/purchases/models/RecurrenceMode;->FINITE_RECURRING:Lcom/revenuecat/purchases/models/RecurrenceMode;

    .line 174
    .line 175
    new-instance v4, Lcom/revenuecat/purchases/models/Price;

    .line 176
    .line 177
    invoke-direct {v4, v8, v6, v7, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-direct {v5, v9, v1, v2, v4}, Lcom/revenuecat/purchases/models/PricingPhase;-><init>(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V

    .line 181
    .line 182
    .line 183
    move-object v9, v3

    .line 184
    new-instance v3, Lcom/revenuecat/purchases/models/TestStoreProduct;

    .line 185
    .line 186
    const/16 v13, 0x140

    .line 187
    .line 188
    const/4 v14, 0x0

    .line 189
    const-string v4, "com.revenuecat.bimonthly_product"

    .line 190
    .line 191
    move-object v11, v5

    .line 192
    const-string v5, "2 month"

    .line 193
    .line 194
    const-string v6, "2 month (App name)"

    .line 195
    .line 196
    const-string v7, "2 month"

    .line 197
    .line 198
    const/4 v10, 0x0

    .line 199
    const/4 v12, 0x0

    .line 200
    move-object v8, v0

    .line 201
    invoke-direct/range {v3 .. v14}, Lcom/revenuecat/purchases/models/TestStoreProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/PresentedOfferingContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 202
    .line 203
    .line 204
    return-object v3

    .line 205
    :pswitch_3
    new-instance v0, Lcom/revenuecat/purchases/models/Price;

    .line 206
    .line 207
    const-string v12, "$ 23.99"

    .line 208
    .line 209
    const-wide/32 v13, 0x16e0ef0

    .line 210
    .line 211
    .line 212
    invoke-direct {v0, v12, v13, v14, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    new-instance v12, Lcom/revenuecat/purchases/models/Period;

    .line 216
    .line 217
    sget-object v13, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 218
    .line 219
    const-string v14, "P3M"

    .line 220
    .line 221
    const/4 v15, 0x3

    .line 222
    invoke-direct {v12, v15, v13, v14}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance v14, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 226
    .line 227
    new-instance v15, Lcom/revenuecat/purchases/models/Period;

    .line 228
    .line 229
    sget-object v6, Lcom/revenuecat/purchases/models/Period$Unit;->WEEK:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 230
    .line 231
    const-string v7, "P2W"

    .line 232
    .line 233
    invoke-direct {v15, v9, v6, v7}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    sget-object v6, Lcom/revenuecat/purchases/models/RecurrenceMode;->FINITE_RECURRING:Lcom/revenuecat/purchases/models/RecurrenceMode;

    .line 237
    .line 238
    new-instance v7, Lcom/revenuecat/purchases/models/Price;

    .line 239
    .line 240
    invoke-direct {v7, v5, v3, v4, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-direct {v14, v15, v6, v2, v7}, Lcom/revenuecat/purchases/models/PricingPhase;-><init>(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V

    .line 244
    .line 245
    .line 246
    move-object v3, v12

    .line 247
    new-instance v12, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 248
    .line 249
    new-instance v4, Lcom/revenuecat/purchases/models/Period;

    .line 250
    .line 251
    invoke-direct {v4, v1, v13, v10}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    new-instance v1, Lcom/revenuecat/purchases/models/Price;

    .line 255
    .line 256
    const-wide/32 v9, 0x3ce1f0

    .line 257
    .line 258
    .line 259
    invoke-direct {v1, v8, v9, v10, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-direct {v12, v4, v6, v2, v1}, Lcom/revenuecat/purchases/models/PricingPhase;-><init>(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V

    .line 263
    .line 264
    .line 265
    new-instance v4, Lcom/revenuecat/purchases/models/TestStoreProduct;

    .line 266
    .line 267
    move-object v11, v14

    .line 268
    const/16 v14, 0x100

    .line 269
    .line 270
    const/4 v15, 0x0

    .line 271
    const-string v5, "com.revenuecat.quarterly_product"

    .line 272
    .line 273
    const-string v6, "3 month"

    .line 274
    .line 275
    const-string v7, "3 month (App name)"

    .line 276
    .line 277
    const-string v8, "3 month"

    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    move-object v9, v0

    .line 281
    move-object v10, v3

    .line 282
    invoke-direct/range {v4 .. v15}, Lcom/revenuecat/purchases/models/TestStoreProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/PresentedOfferingContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 283
    .line 284
    .line 285
    return-object v4

    .line 286
    :pswitch_4
    new-instance v10, Lcom/revenuecat/purchases/models/Price;

    .line 287
    .line 288
    const-string v0, "$ 39.99"

    .line 289
    .line 290
    const-wide/32 v1, 0x26232f0

    .line 291
    .line 292
    .line 293
    invoke-direct {v10, v0, v1, v2, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 294
    .line 295
    .line 296
    new-instance v11, Lcom/revenuecat/purchases/models/Period;

    .line 297
    .line 298
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 299
    .line 300
    const-string v1, "P6M"

    .line 301
    .line 302
    const/4 v2, 0x6

    .line 303
    invoke-direct {v11, v2, v0, v1}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    new-instance v5, Lcom/revenuecat/purchases/models/TestStoreProduct;

    .line 307
    .line 308
    const/16 v14, 0xc0

    .line 309
    .line 310
    const/4 v15, 0x0

    .line 311
    const-string v6, "com.revenuecat.semester_product"

    .line 312
    .line 313
    const-string v7, "6 month"

    .line 314
    .line 315
    const-string v8, "6 month (App name)"

    .line 316
    .line 317
    const-string v9, "6 month"

    .line 318
    .line 319
    const/4 v12, 0x0

    .line 320
    const/4 v13, 0x0

    .line 321
    invoke-direct/range {v5 .. v15}, Lcom/revenuecat/purchases/models/TestStoreProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 322
    .line 323
    .line 324
    return-object v5

    .line 325
    :pswitch_5
    new-instance v0, Lcom/revenuecat/purchases/models/Price;

    .line 326
    .line 327
    const-string v6, "$ 67.99"

    .line 328
    .line 329
    const-wide/32 v7, 0x40d71f0

    .line 330
    .line 331
    .line 332
    invoke-direct {v0, v6, v7, v8, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 333
    .line 334
    .line 335
    new-instance v12, Lcom/revenuecat/purchases/models/Period;

    .line 336
    .line 337
    sget-object v6, Lcom/revenuecat/purchases/models/Period$Unit;->YEAR:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 338
    .line 339
    const-string v7, "P1Y"

    .line 340
    .line 341
    invoke-direct {v12, v1, v6, v7}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    new-instance v13, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 345
    .line 346
    new-instance v6, Lcom/revenuecat/purchases/models/Period;

    .line 347
    .line 348
    sget-object v7, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 349
    .line 350
    invoke-direct {v6, v1, v7, v10}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    sget-object v1, Lcom/revenuecat/purchases/models/RecurrenceMode;->FINITE_RECURRING:Lcom/revenuecat/purchases/models/RecurrenceMode;

    .line 354
    .line 355
    new-instance v7, Lcom/revenuecat/purchases/models/Price;

    .line 356
    .line 357
    invoke-direct {v7, v5, v3, v4, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-direct {v13, v6, v1, v2, v7}, Lcom/revenuecat/purchases/models/PricingPhase;-><init>(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V

    .line 361
    .line 362
    .line 363
    new-instance v6, Lcom/revenuecat/purchases/models/TestStoreProduct;

    .line 364
    .line 365
    const/16 v16, 0x180

    .line 366
    .line 367
    const/16 v17, 0x0

    .line 368
    .line 369
    const-string v7, "com.revenuecat.annual_product"

    .line 370
    .line 371
    const-string v8, "Annual"

    .line 372
    .line 373
    const-string v9, "Annual (App name)"

    .line 374
    .line 375
    const-string v10, "Annual"

    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/4 v15, 0x0

    .line 379
    move-object v11, v0

    .line 380
    invoke-direct/range {v6 .. v17}, Lcom/revenuecat/purchases/models/TestStoreProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/PresentedOfferingContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 381
    .line 382
    .line 383
    return-object v6

    .line 384
    :pswitch_6
    new-instance v12, Lcom/revenuecat/purchases/models/Price;

    .line 385
    .line 386
    const-string v0, "$ 1,000.00"

    .line 387
    .line 388
    const-wide/32 v1, 0x3b9aca00

    .line 389
    .line 390
    .line 391
    invoke-direct {v12, v0, v1, v2, v11}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 392
    .line 393
    .line 394
    new-instance v7, Lcom/revenuecat/purchases/models/TestStoreProduct;

    .line 395
    .line 396
    const/16 v16, 0xc0

    .line 397
    .line 398
    const/16 v17, 0x0

    .line 399
    .line 400
    const-string v8, "com.revenuecat.lifetime_product"

    .line 401
    .line 402
    const-string v9, "Lifetime"

    .line 403
    .line 404
    const-string v10, "Lifetime (App name)"

    .line 405
    .line 406
    const-string v11, "Lifetime"

    .line 407
    .line 408
    const/4 v13, 0x0

    .line 409
    const/4 v14, 0x0

    .line 410
    const/4 v15, 0x0

    .line 411
    invoke-direct/range {v7 .. v17}, Lcom/revenuecat/purchases/models/TestStoreProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 412
    .line 413
    .line 414
    return-object v7

    .line 415
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 420
    .line 421
    const-string v1, "Array contains no element matching the predicate."

    .line 422
    .line 423
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v0

    .line 427
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
