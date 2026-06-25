.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/templates/Template1TestDataKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "template1",
        "Lcom/revenuecat/purchases/paywalls/PaywallData;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;",
        "getTemplate1",
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
.method public static final getTemplate1(Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData;)Lcom/revenuecat/purchases/paywalls/PaywallData;
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
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;->TEMPLATE_1:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;->getId()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v0, Lcom/revenuecat/purchases/PackageType;->MONTHLY:Lcom/revenuecat/purchases/PackageType;

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
    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PackageType;->getIdentifier()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getImages()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    new-instance v14, Ljava/net/URL;

    .line 41
    .line 42
    const-string v1, "https://revenuecat.com/tos"

    .line 43
    .line 44
    invoke-direct {v14, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance v9, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 48
    .line 49
    new-instance v15, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 50
    .line 51
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 52
    .line 53
    const-string v2, "#FFFFFF"

    .line 54
    .line 55
    invoke-direct {v1, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 59
    .line 60
    const-string v8, "#000000"

    .line 61
    .line 62
    invoke-direct {v4, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 66
    .line 67
    const-string v11, "#5CD27A"

    .line 68
    .line 69
    invoke-direct {v10, v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance v11, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 73
    .line 74
    invoke-direct {v11, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v12, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 78
    .line 79
    const-string v13, "#BC66FF"

    .line 80
    .line 81
    invoke-direct {v12, v13}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/16 v31, 0x7f4c

    .line 85
    .line 86
    const/16 v32, 0x0

    .line 87
    .line 88
    const/16 v18, 0x0

    .line 89
    .line 90
    const/16 v19, 0x0

    .line 91
    .line 92
    const/16 v22, 0x0

    .line 93
    .line 94
    const/16 v24, 0x0

    .line 95
    .line 96
    const/16 v25, 0x0

    .line 97
    .line 98
    const/16 v26, 0x0

    .line 99
    .line 100
    const/16 v27, 0x0

    .line 101
    .line 102
    const/16 v28, 0x0

    .line 103
    .line 104
    const/16 v29, 0x0

    .line 105
    .line 106
    const/16 v30, 0x0

    .line 107
    .line 108
    move-object/from16 v16, v1

    .line 109
    .line 110
    move-object/from16 v17, v4

    .line 111
    .line 112
    move-object/from16 v20, v10

    .line 113
    .line 114
    move-object/from16 v21, v11

    .line 115
    .line 116
    move-object/from16 v23, v12

    .line 117
    .line 118
    invoke-direct/range {v15 .. v32}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    new-instance v16, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;

    .line 122
    .line 123
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 124
    .line 125
    invoke-direct {v1, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 129
    .line 130
    invoke-direct {v4, v2}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    new-instance v2, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 134
    .line 135
    const-string v10, "#ACD27A"

    .line 136
    .line 137
    invoke-direct {v2, v10}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v10, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 141
    .line 142
    invoke-direct {v10, v8}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v8, Lcom/revenuecat/purchases/paywalls/PaywallColor;

    .line 146
    .line 147
    const-string v11, "#B022BB"

    .line 148
    .line 149
    invoke-direct {v8, v11}, Lcom/revenuecat/purchases/paywalls/PaywallColor;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/16 v32, 0x7f4c

    .line 153
    .line 154
    const/16 v33, 0x0

    .line 155
    .line 156
    const/16 v20, 0x0

    .line 157
    .line 158
    const/16 v23, 0x0

    .line 159
    .line 160
    const/16 v31, 0x0

    .line 161
    .line 162
    move-object/from16 v17, v1

    .line 163
    .line 164
    move-object/from16 v21, v2

    .line 165
    .line 166
    move-object/from16 v18, v4

    .line 167
    .line 168
    move-object/from16 v24, v8

    .line 169
    .line 170
    move-object/from16 v22, v10

    .line 171
    .line 172
    invoke-direct/range {v16 .. v33}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v1, v16

    .line 176
    .line 177
    invoke-direct {v9, v15, v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;-><init>(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V

    .line 178
    .line 179
    .line 180
    new-instance v4, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 181
    .line 182
    const/16 v16, 0x468

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const/4 v8, 0x0

    .line 187
    const/4 v10, 0x0

    .line 188
    const/4 v11, 0x0

    .line 189
    const/4 v12, 0x1

    .line 190
    const/4 v13, 0x1

    .line 191
    const/4 v15, 0x0

    .line 192
    invoke-direct/range {v4 .. v17}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Map;Ljava/util/List;ZZLjava/net/URL;Ljava/net/URL;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 193
    .line 194
    .line 195
    new-instance v5, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;

    .line 196
    .line 197
    const/16 v18, 0xf90

    .line 198
    .line 199
    const-string v6, "Ignite your _child_\'s curiosity"

    .line 200
    .line 201
    const-string v7, "Get access to **all our educational content** trusted by thousands of parents."

    .line 202
    .line 203
    const-string v8, "Subscribe for _only_ {{ sub_price_per_month }}"

    .line 204
    .line 205
    const-string v9, "Purchase for _only_ {{ sub_price_per_month }} per month"

    .line 206
    .line 207
    const-string v11, "*Just* {{ sub_price_per_month }} per month"

    .line 208
    .line 209
    const-string v12, "Start your {{ sub_offer_duration }} trial, then {{ sub_price_per_month }} per month"

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const/4 v14, 0x0

    .line 213
    const/16 v16, 0x0

    .line 214
    .line 215
    invoke-direct/range {v5 .. v19}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 216
    .line 217
    .line 218
    const-string v1, "en_US"

    .line 219
    .line 220
    invoke-static {v1, v5}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v1}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getAssetBaseURL()Ljava/net/URL;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/testdata/TestData$Constants;->getZeroDecimalPlaceCountries()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    new-instance v1, Lcom/revenuecat/purchases/paywalls/PaywallData;

    .line 237
    .line 238
    const/16 v11, 0x151

    .line 239
    .line 240
    const/4 v12, 0x0

    .line 241
    const/4 v2, 0x0

    .line 242
    const/4 v6, 0x0

    .line 243
    const/4 v8, 0x0

    .line 244
    invoke-direct/range {v1 .. v12}, Lcom/revenuecat/purchases/paywalls/PaywallData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 245
    .line 246
    .line 247
    return-object v1
.end method
