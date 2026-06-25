.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JM\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0008\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0086\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial$Companion;",
        "",
        "()V",
        "invoke",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
        "from",
        "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;",
        "sources",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;",
        "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;",
        "aliases",
        "",
        "Lcom/revenuecat/purchases/ColorAlias;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
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
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic invoke(Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;
    .locals 9

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
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;->getColorOverlay()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {v0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v1

    .line 24
    :goto_0
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;->getBorder()Lcom/revenuecat/purchases/paywalls/components/properties/Border;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-static {v2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyleKt;->toBorderStyles(Lcom/revenuecat/purchases/paywalls/components/properties/Border;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v2, v1

    .line 40
    :goto_1
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;->getShadow()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    invoke-static {v3, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyleKt;->toShadowStyles(Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_2
    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->orSuccessfullyNull(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 59
    .line 60
    sget-object v3, LTd/L;->a:LTd/L;

    .line 61
    .line 62
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 66
    .line 67
    invoke-direct {v4, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 71
    .line 72
    invoke-direct {v5, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/4 v3, 0x6

    .line 76
    new-array v3, v3, [Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    aput-object v0, v3, v6

    .line 80
    .line 81
    const/4 v6, 0x1

    .line 82
    aput-object v2, v3, v6

    .line 83
    .line 84
    const/4 v6, 0x2

    .line 85
    aput-object p3, v3, v6

    .line 86
    .line 87
    const/4 v6, 0x3

    .line 88
    aput-object v1, v3, v6

    .line 89
    .line 90
    const/4 v6, 0x4

    .line 91
    aput-object v4, v3, v6

    .line 92
    .line 93
    const/4 v6, 0x5

    .line 94
    aput-object v5, v3, v6

    .line 95
    .line 96
    invoke-static {v3}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResultKt;->access$collectErrors(Ljava/util/List;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyListKt;->toNonEmptyListOrNull(Ljava/lang/Iterable;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-eqz v3, :cond_3

    .line 109
    .line 110
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 111
    .line 112
    invoke-direct {p1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;-><init>(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_3
    const-string v3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 117
    .line 118
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 128
    .line 129
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const-string v3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>"

    .line 139
    .line 140
    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    check-cast p3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 144
    .line 145
    invoke-virtual {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, LTd/L;

    .line 162
    .line 163
    check-cast v3, LTd/L;

    .line 164
    .line 165
    check-cast v1, LTd/L;

    .line 166
    .line 167
    move-object v7, p3

    .line 168
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;

    .line 169
    .line 170
    move-object v6, v2

    .line 171
    check-cast v6, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 172
    .line 173
    move-object v5, v0

    .line 174
    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 175
    .line 176
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial;

    .line 177
    .line 178
    move-object v8, p1

    .line 179
    move-object v4, p2

    .line 180
    invoke-direct/range {v3 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedImagePartial;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ShadowStyles;Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;)V

    .line 181
    .line 182
    .line 183
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 184
    .line 185
    invoke-direct {p1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-object p1
.end method
