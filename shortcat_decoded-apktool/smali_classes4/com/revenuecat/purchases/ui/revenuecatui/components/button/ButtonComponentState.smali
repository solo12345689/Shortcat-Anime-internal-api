.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\u000f\u001a\u00020\u000c*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u000c8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;",
        "",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;",
        "style",
        "Lkotlin/Function0;",
        "Lc1/d;",
        "localeProvider",
        "<init>",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lie/a;)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;",
        "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;",
        "localeId",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;",
        "toPaywallAction-64pKzr8",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;",
        "toPaywallAction",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;",
        "Lie/a;",
        "action$delegate",
        "LY/h2;",
        "getAction",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;",
        "action",
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


# instance fields
.field private final action$delegate:LY/h2;

.field private final localeProvider:Lie/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/a;"
        }
    .end annotation
.end field

.field private final style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lie/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localeProvider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;->style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;->localeProvider:Lie/a;

    .line 17
    .line 18
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState$action$2;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState$action$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, LY/U1;->d(Lie/a;)LY/h2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;->action$delegate:LY/h2;

    .line 28
    .line 29
    return-void
.end method

.method public static final synthetic access$getLocaleProvider$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;)Lie/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;->localeProvider:Lie/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getStyle$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;)Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;->style:Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$toPaywallAction-64pKzr8(Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;->toPaywallAction-64pKzr8(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final toPaywallAction-64pKzr8(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateBack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateBack;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateBack;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo;

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo;->getDestination()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$CustomerCenter;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo;

    .line 23
    .line 24
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$CustomerCenter;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$CustomerCenter;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Url;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo;->getDestination()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Url;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Url;->getUrls()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {p2}, Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;->getEntry()Ljava/util/Map$Entry;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v0, p2, v1}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo;->getDestination()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Url;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Url;->getMethod()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$Url;

    .line 73
    .line 74
    invoke-direct {v0, p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination$Url;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo;

    .line 78
    .line 79
    invoke-direct {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$NavigateTo$Destination;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_2
    instance-of p2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Sheet;

    .line 84
    .line 85
    if-eqz p2, :cond_3

    .line 86
    .line 87
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$Internal$NavigateTo;

    .line 88
    .line 89
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$Internal$NavigateTo$Destination$Sheet;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo;->getDestination()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Sheet;

    .line 96
    .line 97
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$Internal$NavigateTo$Destination$Sheet;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$NavigateTo$Destination$Sheet;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$Internal$NavigateTo;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$Internal$NavigateTo$Destination;)V

    .line 101
    .line 102
    .line 103
    return-object p2

    .line 104
    :cond_3
    new-instance p1, LTd/r;

    .line 105
    .line 106
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_4
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$PurchasePackage;

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$PurchasePackage;

    .line 115
    .line 116
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$PurchasePackage;

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$PurchasePackage;->getRcPackage()Lcom/revenuecat/purchases/Package;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$PurchasePackage;->getResolvedOffer()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p2, v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$PurchasePackage;-><init>(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;)V

    .line 127
    .line 128
    .line 129
    return-object p2

    .line 130
    :cond_5
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$RestorePurchases;

    .line 131
    .line 132
    if-eqz v0, :cond_6

    .line 133
    .line 134
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$RestorePurchases;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$RestorePurchases;

    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_6
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    if-eqz v0, :cond_7

    .line 141
    .line 142
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;

    .line 143
    .line 144
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->getOpenMethod()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->getAutoDismiss()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior$Append;

    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebCheckout;->getRcPackage()Lcom/revenuecat/purchases/Package;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-direct {v3, p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior$Append;-><init>(Lcom/revenuecat/purchases/Package;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {p2, v1, v0, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;ZLcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior;)V

    .line 164
    .line 165
    .line 166
    return-object p2

    .line 167
    :cond_7
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebProductSelection;

    .line 168
    .line 169
    if-eqz v0, :cond_8

    .line 170
    .line 171
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;

    .line 172
    .line 173
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebProductSelection;

    .line 174
    .line 175
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebProductSelection;->getOpenMethod()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$WebProductSelection;->getAutoDismiss()Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior$DoNotAppend;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior$DoNotAppend;

    .line 184
    .line 185
    invoke-direct {p2, v1, v0, p1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;ZLcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior;)V

    .line 186
    .line 187
    .line 188
    return-object p2

    .line 189
    :cond_8
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$CustomWebCheckout;

    .line 190
    .line 191
    if-eqz v0, :cond_9

    .line 192
    .line 193
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$CustomWebCheckout;

    .line 194
    .line 195
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$CustomWebCheckout;->getUrls()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {p2}, Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;->box-impl(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;->getEntry()Ljava/util/Map$Entry;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-interface {v0, p2, v1}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    check-cast p2, Ljava/lang/String;

    .line 216
    .line 217
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;

    .line 218
    .line 219
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$CustomWebCheckout;->getOpenMethod()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$CustomWebCheckout;->getAutoDismiss()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior$Append;

    .line 228
    .line 229
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$CustomWebCheckout;->getRcPackage()Lcom/revenuecat/purchases/Package;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action$CustomWebCheckout;->getPackageParam()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-direct {v3, v4, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior$Append;-><init>(Lcom/revenuecat/purchases/Package;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-direct {v0, p2, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;ZLcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout$PackageParamBehavior;)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :cond_9
    new-instance p1, LTd/r;

    .line 245
    .line 246
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 247
    .line 248
    .line 249
    throw p1
.end method


# virtual methods
.method public final synthetic getAction()Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;->action$delegate:LY/h2;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;

    .line 8
    .line 9
    return-object v0
.end method
