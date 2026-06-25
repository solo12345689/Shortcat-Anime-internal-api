.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;",
        "",
        "()V",
        "create",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;",
        "variableDataProvider",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;",
        "context",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;",
        "localizedConfiguration",
        "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;",
        "rcPackage",
        "Lcom/revenuecat/purchases/Package;",
        "locale",
        "Ljava/util/Locale;",
        "revenuecatui_defaultsBc8Release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;-><init>()V

    return-void
.end method

.method private static final create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;

    .line 2
    .line 3
    move-object v3, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor;->processVariables(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Ljava/lang/String;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method


# virtual methods
.method public final create(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    const-string v4, "variableDataProvider"

    .line 10
    .line 11
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "context"

    .line 15
    .line 16
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "localizedConfiguration"

    .line 20
    .line 21
    move-object/from16 v5, p3

    .line 22
    .line 23
    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v4, "rcPackage"

    .line 27
    .line 28
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v4, "locale"

    .line 32
    .line 33
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getOfferOverrides()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v2}, Lcom/revenuecat/purchases/Package;->getIdentifier()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;->getOfferBadge()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    if-eqz v7, :cond_0

    .line 58
    .line 59
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    :goto_0
    move-object/from16 v18, v7

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    move-object/from16 v18, v6

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;->getDiscountRelativeToMostExpensivePerMonth()Ljava/lang/Double;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    if-eqz v7, :cond_0

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v0, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;->localizedRelativeDiscount(Ljava/lang/Double;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    goto :goto_0

    .line 88
    :goto_1
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getTitle()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getSubtitle()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    if-eqz v7, :cond_2

    .line 101
    .line 102
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    move-object v10, v7

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    move-object v10, v6

    .line 109
    :goto_2
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getCallToAction()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getCallToActionWithIntroOffer()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    if-eqz v7, :cond_3

    .line 122
    .line 123
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    move-object v12, v7

    .line 128
    goto :goto_3

    .line 129
    :cond_3
    move-object v12, v6

    .line 130
    :goto_3
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getCallToActionWithMultipleIntroOffers()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    if-eqz v7, :cond_4

    .line 135
    .line 136
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    move-object v13, v7

    .line 141
    goto :goto_4

    .line 142
    :cond_4
    move-object v13, v6

    .line 143
    :goto_4
    if-eqz v4, :cond_5

    .line 144
    .line 145
    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;->getOfferDetails()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    if-nez v7, :cond_6

    .line 150
    .line 151
    :cond_5
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getOfferDetails()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    :cond_6
    if-eqz v7, :cond_7

    .line 156
    .line 157
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    move-object v14, v7

    .line 162
    goto :goto_5

    .line 163
    :cond_7
    move-object v14, v6

    .line 164
    :goto_5
    if-eqz v4, :cond_8

    .line 165
    .line 166
    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;->getOfferDetailsWithIntroOffer()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    if-nez v7, :cond_9

    .line 171
    .line 172
    :cond_8
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getOfferDetailsWithIntroOffer()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    :cond_9
    if-eqz v7, :cond_a

    .line 177
    .line 178
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    move-object v15, v7

    .line 183
    goto :goto_6

    .line 184
    :cond_a
    move-object v15, v6

    .line 185
    :goto_6
    if-eqz v4, :cond_b

    .line 186
    .line 187
    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;->getOfferDetailsWithMultipleIntroOffers()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    if-nez v7, :cond_c

    .line 192
    .line 193
    :cond_b
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getOfferDetailsWithMultipleIntroOffers()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    :cond_c
    if-eqz v7, :cond_d

    .line 198
    .line 199
    invoke-static {v7, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    move-object/from16 v16, v7

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_d
    move-object/from16 v16, v6

    .line 207
    .line 208
    :goto_7
    if-eqz v4, :cond_e

    .line 209
    .line 210
    invoke-virtual {v4}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;->getOfferName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    if-nez v4, :cond_f

    .line 215
    .line 216
    :cond_e
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getOfferName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    :cond_f
    if-eqz v4, :cond_10

    .line 221
    .line 222
    invoke-static {v4, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    move-object/from16 v17, v4

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_10
    move-object/from16 v17, v6

    .line 230
    .line 231
    :goto_8
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getFeatures()Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    new-instance v7, Ljava/util/ArrayList;

    .line 236
    .line 237
    const/16 v8, 0xa

    .line 238
    .line 239
    invoke-static {v4, v8}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-eqz v8, :cond_12

    .line 255
    .line 256
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    move-object/from16 v19, v8

    .line 261
    .line 262
    check-cast v19, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 263
    .line 264
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;->getTitle()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    invoke-static {v8, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v20

    .line 272
    invoke-virtual/range {v19 .. v19}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;->getContent()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    if-eqz v8, :cond_11

    .line 277
    .line 278
    invoke-static {v8, v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration$Companion;->create$processVariables(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessor$PackageContext;Lcom/revenuecat/purchases/Package;Ljava/util/Locale;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    move-object/from16 v21, v8

    .line 283
    .line 284
    goto :goto_a

    .line 285
    :cond_11
    move-object/from16 v21, v6

    .line 286
    .line 287
    :goto_a
    const/16 v23, 0x4

    .line 288
    .line 289
    const/16 v24, 0x0

    .line 290
    .line 291
    const/16 v22, 0x0

    .line 292
    .line 293
    invoke-static/range {v19 .. v24}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;->copy$default(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_12
    invoke-virtual {v5}, Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;->getTierName()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v20

    .line 305
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;

    .line 306
    .line 307
    move-object/from16 v19, v7

    .line 308
    .line 309
    invoke-direct/range {v8 .. v20}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/ProcessedLocalizedConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-object v8
.end method
