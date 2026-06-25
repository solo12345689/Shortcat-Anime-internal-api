.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/templates/Template5TestDataKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "template5",
        "Lcom/revenuecat/purchases/paywalls/PaywallData;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;",
        "getTemplate5",
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
.method public static final getTemplate5(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;
    .locals 34

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
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;->TEMPLATE_5:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;->getId()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v0, Lcom/revenuecat/purchases/PackageType;->ANNUAL:Lcom/revenuecat/purchases/PackageType;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v2, Lcom/revenuecat/purchases/PackageType;->MONTHLY:Lcom/revenuecat/purchases/PackageType;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v7, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 48
    .line 49
    const/4 v11, 0x6

    .line 50
    const/4 v12, 0x0

    .line 51
    const-string v8, "954459_1692992845.png"

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/4 v10, 0x0

    .line 55
    invoke-direct/range {v7 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    .line 57
    .line 58
    new-instance v15, Ljava/net/URL;

    .line 59
    .line 60
    const-string v0, "https://revenuecat.com/privacy"

    .line 61
    .line 62
    invoke-direct {v15, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 66
    .line 67
    new-instance v16, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 68
    .line 69
    new-instance v0, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 70
    .line 71
    const-string v1, "#FFFFFF"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 77
    .line 78
    const-string v2, "#000000"

    .line 79
    .line 80
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 84
    .line 85
    const-string v4, "#adf5c5"

    .line 86
    .line 87
    invoke-direct {v2, v4}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 91
    .line 92
    const-string v8, "#b15d5d"

    .line 93
    .line 94
    invoke-direct {v4, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 98
    .line 99
    const-string v10, "#45c186"

    .line 100
    .line 101
    invoke-direct {v8, v10}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 105
    .line 106
    const-string v11, "#ffffff"

    .line 107
    .line 108
    invoke-direct {v10, v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 112
    .line 113
    const-string v12, "#b24010"

    .line 114
    .line 115
    invoke-direct {v11, v12}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 119
    .line 120
    const-string v13, "#027424"

    .line 121
    .line 122
    invoke-direct {v12, v13}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v13, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 126
    .line 127
    const-string v14, "#D1D1D1"

    .line 128
    .line 129
    invoke-direct {v13, v14}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const/16 v32, 0x7c40

    .line 133
    .line 134
    const/16 v33, 0x0

    .line 135
    .line 136
    const/16 v23, 0x0

    .line 137
    .line 138
    const/16 v27, 0x0

    .line 139
    .line 140
    const/16 v28, 0x0

    .line 141
    .line 142
    const/16 v29, 0x0

    .line 143
    .line 144
    const/16 v30, 0x0

    .line 145
    .line 146
    const/16 v31, 0x0

    .line 147
    .line 148
    move-object/from16 v17, v0

    .line 149
    .line 150
    move-object/from16 v18, v1

    .line 151
    .line 152
    move-object/from16 v19, v2

    .line 153
    .line 154
    move-object/from16 v20, v4

    .line 155
    .line 156
    move-object/from16 v21, v8

    .line 157
    .line 158
    move-object/from16 v22, v10

    .line 159
    .line 160
    move-object/from16 v24, v11

    .line 161
    .line 162
    move-object/from16 v25, v12

    .line 163
    .line 164
    move-object/from16 v26, v13

    .line 165
    .line 166
    invoke-direct/range {v16 .. v33}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 167
    .line 168
    .line 169
    move-object/from16 v0, v16

    .line 170
    .line 171
    const/4 v1, 0x0

    .line 172
    const/4 v2, 0x2

    .line 173
    invoke-direct {v9, v0, v1, v2, v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 174
    .line 175
    .line 176
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 177
    .line 178
    const/16 v16, 0x2e8

    .line 179
    .line 180
    const/16 v17, 0x0

    .line 181
    .line 182
    const/4 v8, 0x0

    .line 183
    const/4 v10, 0x0

    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v12, 0x0

    .line 186
    const/4 v13, 0x1

    .line 187
    const/4 v14, 0x0

    .line 188
    invoke-direct/range {v4 .. v17}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;ZZLjava/net/URL;Ljava/net/URL;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 189
    .line 190
    .line 191
    new-instance v5, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 192
    .line 193
    new-instance v6, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 194
    .line 195
    const/4 v10, 0x2

    .line 196
    const-string v7, "Unique gourmet recipes"

    .line 197
    .line 198
    const-string v9, "tick"

    .line 199
    .line 200
    invoke-direct/range {v6 .. v11}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 201
    .line 202
    .line 203
    new-instance v7, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 204
    .line 205
    const/4 v11, 0x2

    .line 206
    const/4 v12, 0x0

    .line 207
    const-string v8, "Advanced nutritional recipes"

    .line 208
    .line 209
    const/4 v9, 0x0

    .line 210
    const-string v10, "apple"

    .line 211
    .line 212
    invoke-direct/range {v7 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 213
    .line 214
    .line 215
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 216
    .line 217
    const/4 v12, 0x2

    .line 218
    const/4 v13, 0x0

    .line 219
    const-string v9, "Personalized support from our Chef"

    .line 220
    .line 221
    const/4 v10, 0x0

    .line 222
    const-string v11, "warning"

    .line 223
    .line 224
    invoke-direct/range {v8 .. v13}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 225
    .line 226
    .line 227
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 228
    .line 229
    const/4 v13, 0x2

    .line 230
    const-string v10, "Unlimited receipt collections"

    .line 231
    .line 232
    const/4 v11, 0x0

    .line 233
    const-string v12, "bookmark"

    .line 234
    .line 235
    invoke-direct/range {v9 .. v14}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 236
    .line 237
    .line 238
    filled-new-array {v6, v7, v8, v9}, [Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v15

    .line 246
    const/16 v18, 0xc92

    .line 247
    .line 248
    const/16 v19, 0x0

    .line 249
    .line 250
    const-string v6, "Spice Up Your Kitchen - Go Pro for Exclusive Benefits!"

    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    const-string v8, "Continue"

    .line 254
    .line 255
    const-string v9, "Start your Free Trial"

    .line 256
    .line 257
    const/4 v10, 0x0

    .line 258
    const-string v11, "{{ total_price_and_per_month }}"

    .line 259
    .line 260
    const-string v12, "Free for {{ sub_offer_duration }}, then {{ total_price_and_per_month }}"

    .line 261
    .line 262
    const/4 v13, 0x0

    .line 263
    const-string v14, "{{ sub_period }}"

    .line 264
    .line 265
    const/16 v16, 0x0

    .line 266
    .line 267
    invoke-direct/range {v5 .. v19}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 268
    .line 269
    .line 270
    const-string v0, "en_US"

    .line 271
    .line 272
    invoke-static {v0, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-static {v0}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

    .line 281
    .line 282
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getAssetBaseURL()Ljava/net/URL;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getZeroDecimalPlaceCountries()Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallData;

    .line 291
    .line 292
    const/16 v11, 0x151

    .line 293
    .line 294
    const/4 v12, 0x0

    .line 295
    const/4 v2, 0x0

    .line 296
    const/4 v6, 0x0

    .line 297
    const/4 v8, 0x0

    .line 298
    invoke-direct/range {v1 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 299
    .line 300
    .line 301
    return-object v1
.end method
