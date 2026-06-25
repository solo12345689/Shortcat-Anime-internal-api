.class public final Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJQ\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u00042\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;",
        "",
        "<init>",
        "()V",
        "Lcom/revenuecat/purchases/paywalls/PaywallData;",
        "",
        "image",
        "Landroid/net/Uri;",
        "getUriFromImage",
        "(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;",
        "variableDataProvider",
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;",
        "mode",
        "paywallData",
        "",
        "Lcom/revenuecat/purchases/Package;",
        "availablePackages",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;",
        "template",
        "storefrontCountryCode",
        "LTd/u;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;",
        "create-hUnOzRk",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;Ljava/lang/String;)Ljava/lang/Object;",
        "create",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;

    .line 7
    .line 8
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

.method private final getUriFromImage(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/PaywallData;->getAssetBaseURL()Ljava/net/URL;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, p2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method


# virtual methods
.method public final create-hUnOzRk(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;Ljava/lang/String;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;",
            "Lcom/revenuecat/purchases/paywalls/PaywallData;",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/Package;",
            ">;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p3

    .line 2
    .line 3
    const-string v0, "variableDataProvider"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "mode"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "paywallData"

    .line 14
    .line 15
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "availablePackages"

    .line 19
    .line 20
    move-object/from16 v2, p4

    .line 21
    .line 22
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "template"

    .line 26
    .line 27
    move-object/from16 v9, p5

    .line 28
    .line 29
    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6}, Lcom/revenuecat/purchases/paywalls/PaywallData;->getConfig()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->getImages()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;->getIcon()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {p0, v6, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;->getUriFromImage(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;->getBackground()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-direct {p0, v6, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;->getUriFromImage(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;->getHeader()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-direct {p0, v6, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;->getUriFromImage(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-direct {v10, v1, v3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;-><init>(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Lcom/revenuecat/purchases/paywalls/PaywallData;->getConfig()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->getImagesByTier()Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-static {v3}, LUd/S;->e(I)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/Iterable;

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_0

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Ljava/util/Map$Entry;

    .line 113
    .line 114
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;

    .line 119
    .line 120
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;

    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    check-cast v11, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 127
    .line 128
    invoke-virtual {v11}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;->getIcon()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    invoke-direct {v7, v6, v11}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;->getUriFromImage(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    check-cast v12, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 141
    .line 142
    invoke-virtual {v12}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;->getBackground()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    invoke-direct {v7, v6, v12}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;->getUriFromImage(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;

    .line 155
    .line 156
    invoke-virtual {v3}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;->getHeader()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-direct {v7, v6, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfigurationFactory;->getUriFromImage(Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Landroid/net/Uri;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-direct {v5, v11, v12, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;-><init>(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_0
    :goto_1
    move-object v11, v1

    .line 172
    goto :goto_2

    .line 173
    :cond_1
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    goto :goto_1

    .line 178
    :goto_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackageConfigurationFactory;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackageConfigurationFactory;

    .line 179
    .line 180
    invoke-virtual {v6}, Lcom/revenuecat/purchases/paywalls/PaywallData;->getConfig()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->getPackageIds()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v6}, Lcom/revenuecat/purchases/paywalls/PaywallData;->getConfig()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->getDefaultPackage()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;->getConfigurationType()Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackageConfigurationType;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    move-object v1, p1

    .line 201
    move-object/from16 v7, p6

    .line 202
    .line 203
    invoke-virtual/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackageConfigurationFactory;->createPackageConfiguration-bMdYcbs(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableDataProvider;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PackageConfigurationType;Lcom/revenuecat/purchases/paywalls/PaywallData;Ljava/lang/String;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-static {p1}, LTd/u;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-nez v0, :cond_2

    .line 212
    .line 213
    check-cast p1, Lkotlin/Pair;

    .line 214
    .line 215
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Ljava/util/Locale;

    .line 220
    .line 221
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    move-object v4, p1

    .line 226
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;

    .line 227
    .line 228
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;

    .line 229
    .line 230
    invoke-virtual/range {p3 .. p3}, Lcom/revenuecat/purchases/paywalls/PaywallData;->getConfig()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual/range {p3 .. p3}, Lcom/revenuecat/purchases/paywalls/PaywallData;->getConfig()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;->getColors()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    move-object v8, p1

    .line 243
    move-object v3, p2

    .line 244
    move-object v2, v9

    .line 245
    move-object v6, v10

    .line 246
    move-object v7, v11

    .line 247
    move-object v9, v0

    .line 248
    invoke-direct/range {v1 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/PaywallTemplate;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageConfiguration;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Images;Ljava/util/Map;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ljava/util/Locale;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    return-object p1

    .line 256
    :cond_2
    invoke-static {v0}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    return-object p1
.end method
