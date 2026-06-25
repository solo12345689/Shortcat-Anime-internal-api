.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J]\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0008\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2$\u0010\u000e\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u000fH\u0086\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial$Companion;",
        "",
        "()V",
        "invoke",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
        "from",
        "Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;",
        "aliases",
        "",
        "Lcom/revenuecat/purchases/ColorAlias;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
        "createBadgeStackComponentStyle",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/paywalls/components/StackComponent;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;",
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
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;
    .locals 11

    .line 1
    const-string v0, "from"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "aliases"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "createBadgeStackComponentStyle"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;->getBackground()Lcom/revenuecat/purchases/paywalls/components/common/Background;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {v0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyleKt;->toBackgroundStyles(Lcom/revenuecat/purchases/paywalls/components/common/Background;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v0, v1

    .line 29
    :goto_0
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;->getBackgroundColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-static {v2, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v2, v1

    .line 45
    :goto_1
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;->getBorder()Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-static {v3, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyleKt;->toBorderStyles(Lcom/revenuecat/purchases/paywalls/components/properties/Border;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move-object v3, v1

    .line 61
    :goto_2
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;->getShadow()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    invoke-static {v4, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyleKt;->toShadowStyles(Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    move-object p2, v1

    .line 77
    :goto_3
    invoke-static {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;->getBadge()Lcom/revenuecat/purchases/paywalls/components/properties/Badge;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    invoke-static {v4, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyleKt;->toBadgeStyle(Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    goto :goto_4

    .line 92
    :cond_4
    move-object p3, v1

    .line 93
    :goto_4
    invoke-static {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 98
    .line 99
    sget-object v5, LTd/L;->a:LTd/L;

    .line 100
    .line 101
    invoke-direct {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    const/4 v5, 0x6

    .line 105
    new-array v5, v5, [Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    aput-object v0, v5, v6

    .line 109
    .line 110
    const/4 v6, 0x1

    .line 111
    aput-object v2, v5, v6

    .line 112
    .line 113
    const/4 v6, 0x2

    .line 114
    aput-object v3, v5, v6

    .line 115
    .line 116
    const/4 v6, 0x3

    .line 117
    aput-object p2, v5, v6

    .line 118
    .line 119
    const/4 v6, 0x4

    .line 120
    aput-object p3, v5, v6

    .line 121
    .line 122
    const/4 v6, 0x5

    .line 123
    aput-object v4, v5, v6

    .line 124
    .line 125
    invoke-static {v5}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-static {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->access$collectErrors(Ljava/util/List;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-static {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyListKt;->toNonEmptyListOrNull(Ljava/lang/Iterable;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 140
    .line 141
    invoke-direct {p1, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;-><init>(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object p1

    .line 145
    :cond_5
    const-string v5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 146
    .line 147
    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const-string v5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 157
    .line 158
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 162
    .line 163
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const-string v5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 168
    .line 169
    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 173
    .line 174
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    const-string v5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 179
    .line 180
    invoke-static {p2, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 184
    .line 185
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    const-string v5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 190
    .line 191
    invoke-static {p3, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    check-cast p3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 195
    .line 196
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    check-cast v4, LTd/L;

    .line 205
    .line 206
    move-object v9, p3

    .line 207
    check-cast v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;

    .line 208
    .line 209
    move-object v8, p2

    .line 210
    check-cast v8, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 211
    .line 212
    move-object v7, v3

    .line 213
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 214
    .line 215
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 216
    .line 217
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;

    .line 218
    .line 219
    if-nez v0, :cond_8

    .line 220
    .line 221
    if-eqz v2, :cond_6

    .line 222
    .line 223
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;->constructor-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    goto :goto_5

    .line 228
    :cond_6
    move-object p2, v1

    .line 229
    :goto_5
    if-eqz p2, :cond_7

    .line 230
    .line 231
    invoke-static {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;->box-impl(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles$Color;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    :cond_7
    move-object v6, v1

    .line 236
    goto :goto_6

    .line 237
    :cond_8
    move-object v6, v0

    .line 238
    :goto_6
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;

    .line 239
    .line 240
    move-object v10, p1

    .line 241
    invoke-direct/range {v5 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedStackPartial;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BackgroundStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;)V

    .line 242
    .line 243
    .line 244
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 245
    .line 246
    invoke-direct {p1, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    return-object p1
.end method
