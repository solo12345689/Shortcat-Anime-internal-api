.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002Jo\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0008\u001a\u00020\t2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u000c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000bj\u0002`\u000f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0011H\u0086\u0002\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial$Companion;",
        "",
        "()V",
        "invoke",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
        "from",
        "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;",
        "using",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;",
        "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;",
        "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;",
        "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/LocalizationDictionary;",
        "aliases",
        "",
        "Lcom/revenuecat/purchases/ColorAlias;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
        "fontAliases",
        "Lcom/revenuecat/purchases/FontAlias;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;",
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
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Ljava/util/Map;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;
    .locals 9

    .line 1
    const-string v0, "from"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "using"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "aliases"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "fontAliases"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;->getText-sa7TU9Q()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-static {p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/LocalizationKt;->stringForAllLocales-7v81vok(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object p2, v1

    .line 34
    :goto_0
    invoke-static {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;->getColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {v0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v0, v1

    .line 50
    :goto_1
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;->getBackgroundColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-static {v2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object p3, v1

    .line 66
    :goto_2
    invoke-static {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;->getFontName-ARcRonI()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    invoke-static {p4, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpecKt;->getFontSpec-pDyximM(Ljava/util/Map;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    if-eqz p4, :cond_3

    .line 81
    .line 82
    invoke-static {p4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpecKt;->recoverFromFontAliasError(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    :cond_3
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    instance-of v1, p4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    instance-of v1, p4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 97
    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    check-cast p4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 101
    .line 102
    invoke-virtual {p4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    check-cast p4, Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;

    .line 107
    .line 108
    new-array v1, v2, [Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;

    .line 109
    .line 110
    invoke-static {p4, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyListKt;->nonEmptyListOf(Ljava/lang/Object;[Ljava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 115
    .line 116
    invoke-direct {v1, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;-><init>(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object p4, v1

    .line 120
    :goto_3
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 121
    .line 122
    sget-object v3, LTd/L;->a:LTd/L;

    .line 123
    .line 124
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 128
    .line 129
    invoke-direct {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    const/4 v3, 0x6

    .line 133
    new-array v3, v3, [Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 134
    .line 135
    aput-object p2, v3, v2

    .line 136
    .line 137
    const/4 v2, 0x1

    .line 138
    aput-object v0, v3, v2

    .line 139
    .line 140
    const/4 v2, 0x2

    .line 141
    aput-object p3, v3, v2

    .line 142
    .line 143
    const/4 v2, 0x3

    .line 144
    aput-object p4, v3, v2

    .line 145
    .line 146
    const/4 v2, 0x4

    .line 147
    aput-object v1, v3, v2

    .line 148
    .line 149
    const/4 v2, 0x5

    .line 150
    aput-object v4, v3, v2

    .line 151
    .line 152
    invoke-static {v3}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->access$collectErrors(Ljava/util/List;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyListKt;->toNonEmptyListOrNull(Ljava/lang/Iterable;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-eqz v2, :cond_5

    .line 165
    .line 166
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 167
    .line 168
    invoke-direct {p1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;-><init>(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-object p1

    .line 172
    :cond_5
    const-string v2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 173
    .line 174
    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 178
    .line 179
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    const-string v2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 184
    .line 185
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-string v2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 195
    .line 196
    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    check-cast p3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 200
    .line 201
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    const-string v2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 206
    .line 207
    invoke-static {p4, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    check-cast p4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 211
    .line 212
    invoke-virtual {p4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p4

    .line 216
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    check-cast v2, LTd/L;

    .line 225
    .line 226
    check-cast v1, LTd/L;

    .line 227
    .line 228
    move-object v6, p4

    .line 229
    check-cast v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;

    .line 230
    .line 231
    move-object v5, p3

    .line 232
    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 233
    .line 234
    move-object v4, v0

    .line 235
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 236
    .line 237
    move-object v3, p2

    .line 238
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;

    .line 239
    .line 240
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;

    .line 241
    .line 242
    const/4 v8, 0x0

    .line 243
    move-object v7, p1

    .line 244
    invoke-direct/range {v2 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/LocalizedTextPartial;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/FontSpec;Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 245
    .line 246
    .line 247
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 248
    .line 249
    invoke-direct {p1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    return-object p1

    .line 253
    :cond_6
    new-instance p1, LTd/r;

    .line 254
    .line 255
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 256
    .line 257
    .line 258
    throw p1
.end method
