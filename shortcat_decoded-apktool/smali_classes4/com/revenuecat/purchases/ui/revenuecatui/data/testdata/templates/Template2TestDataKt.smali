.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/templates/Template2TestDataKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "template2",
        "Lcom/revenuecat/purchases/paywalls/PaywallData;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;",
        "getTemplate2",
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
.method public static final getTemplate2(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;
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
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;->TEMPLATE_2:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;

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
    move-result-object v0

    .line 20
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lcom/revenuecat/purchases/PackageType;->MONTHLY:Lcom/revenuecat/purchases/PackageType;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v4, Lcom/revenuecat/purchases/PackageType;->LIFETIME:Lcom/revenuecat/purchases/PackageType;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v0, v2, v4}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getImages()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    new-instance v14, Ljava/net/URL;

    .line 63
    .line 64
    const-string v1, "https://revenuecat.com/tos"

    .line 65
    .line 66
    invoke-direct {v14, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance v15, Ljava/net/URL;

    .line 70
    .line 71
    const-string v1, "https://revenuecat.com/privacy"

    .line 72
    .line 73
    invoke-direct {v15, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 77
    .line 78
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 79
    .line 80
    const-string v2, "#FFFFFF"

    .line 81
    .line 82
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 86
    .line 87
    const-string v8, "#000000"

    .line 88
    .line 89
    invoke-direct {v4, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 93
    .line 94
    const-string v10, "#EC807C"

    .line 95
    .line 96
    invoke-direct {v8, v10}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 100
    .line 101
    const-string v11, "#FC609C"

    .line 102
    .line 103
    invoke-direct {v10, v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 107
    .line 108
    invoke-direct {v11, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 112
    .line 113
    const-string v12, "#BC66FF"

    .line 114
    .line 115
    invoke-direct {v2, v12}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 119
    .line 120
    const-string v13, "#222222"

    .line 121
    .line 122
    invoke-direct {v12, v13}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v16, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 126
    .line 127
    const/16 v32, 0x7e0c

    .line 128
    .line 129
    const/16 v33, 0x0

    .line 130
    .line 131
    const/16 v19, 0x0

    .line 132
    .line 133
    const/16 v20, 0x0

    .line 134
    .line 135
    const/16 v26, 0x0

    .line 136
    .line 137
    const/16 v27, 0x0

    .line 138
    .line 139
    const/16 v28, 0x0

    .line 140
    .line 141
    const/16 v29, 0x0

    .line 142
    .line 143
    const/16 v30, 0x0

    .line 144
    .line 145
    const/16 v31, 0x0

    .line 146
    .line 147
    move-object/from16 v17, v1

    .line 148
    .line 149
    move-object/from16 v24, v2

    .line 150
    .line 151
    move-object/from16 v18, v4

    .line 152
    .line 153
    move-object/from16 v21, v8

    .line 154
    .line 155
    move-object/from16 v23, v10

    .line 156
    .line 157
    move-object/from16 v22, v11

    .line 158
    .line 159
    move-object/from16 v25, v12

    .line 160
    .line 161
    invoke-direct/range {v16 .. v33}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 162
    .line 163
    .line 164
    move-object/from16 v1, v16

    .line 165
    .line 166
    const/4 v2, 0x0

    .line 167
    const/4 v4, 0x2

    .line 168
    invoke-direct {v9, v1, v2, v4, v2}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 169
    .line 170
    .line 171
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 172
    .line 173
    const/16 v16, 0x68

    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const/4 v8, 0x0

    .line 178
    const/4 v10, 0x0

    .line 179
    const/4 v11, 0x0

    .line 180
    const/4 v12, 0x1

    .line 181
    const/4 v13, 0x1

    .line 182
    invoke-direct/range {v4 .. v17}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;ZZLjava/net/URL;Ljava/net/URL;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 183
    .line 184
    .line 185
    new-instance v5, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 186
    .line 187
    const/16 v18, 0xe90

    .line 188
    .line 189
    const-string v6, "Call to **action** for _better_ conversion."

    .line 190
    .line 191
    const-string v7, "**Lorem ipsum** is simply ~dummy~ text of the _printing_ and *typesetting* industry."

    .line 192
    .line 193
    const-string v8, "Subscribe for {{ price_per_period }}"

    .line 194
    .line 195
    const-string v9, "Start your {{ sub_offer_duration }} free trial"

    .line 196
    .line 197
    const-string v11, "{{ total_price_and_per_month }}"

    .line 198
    .line 199
    const-string v12, "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial"

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const-string v14, "{{ sub_period }}"

    .line 203
    .line 204
    const/4 v15, 0x0

    .line 205
    const/16 v16, 0x0

    .line 206
    .line 207
    invoke-direct/range {v5 .. v19}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    .line 209
    .line 210
    const-string v1, "en_US"

    .line 211
    .line 212
    invoke-static {v1, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    new-instance v5, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 217
    .line 218
    const-string v6, "T\u00edtulo en espa\u00f1ol"

    .line 219
    .line 220
    const-string v7, "Un lorem ipsum en espa\u00f1ol que es m\u00e1s largo para mostrar un subt\u00edtulo multilinea."

    .line 221
    .line 222
    const-string v8, "Suscribete for {{ price_per_period }}"

    .line 223
    .line 224
    const-string v9, "Empieza tu prueba gratuita de {{ sub_offer_duration }}"

    .line 225
    .line 226
    const-string v11, "{{ total_price_and_per_month }}"

    .line 227
    .line 228
    const-string v12, "{{ total_price_and_per_month }} con {{ sub_offer_duration }} de prueba"

    .line 229
    .line 230
    const-string v14, "{{ sub_period }}"

    .line 231
    .line 232
    invoke-direct/range {v5 .. v19}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 233
    .line 234
    .line 235
    const-string v2, "es_ES"

    .line 236
    .line 237
    invoke-static {v2, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v1}, LUd/S;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getAssetBaseURL()Ljava/net/URL;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getZeroDecimalPlaceCountries()Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallData;

    .line 258
    .line 259
    const/16 v11, 0x151

    .line 260
    .line 261
    const/4 v12, 0x0

    .line 262
    const/4 v2, 0x0

    .line 263
    const/4 v6, 0x0

    .line 264
    const/4 v8, 0x0

    .line 265
    invoke-direct/range {v1 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 266
    .line 267
    .line 268
    return-object v1
.end method
