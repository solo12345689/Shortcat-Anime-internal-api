.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyleKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u00052$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0008\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u0007H\u0000\u00a8\u0006\n"
    }
    d2 = {
        "toBadgeStyle",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;",
        "createStackComponentStyle",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/paywalls/components/StackComponent;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;",
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
.method public static final synthetic toBadgeStyle(Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "createStackComponentStyle"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Badge;->getStack()Lcom/revenuecat/purchases/paywalls/components/StackComponent;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 20
    .line 21
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 32
    .line 33
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Badge;->getStyle()Lcom/revenuecat/purchases/paywalls/components/properties/Badge$Style;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Badge;->getAlignment()Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p1, v1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/BadgeStyle;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/paywalls/components/properties/Badge$Style;Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 47
    .line 48
    invoke-direct {p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    instance-of p0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Error;

    .line 53
    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_1
    new-instance p0, LTd/r;

    .line 58
    .line 59
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 60
    .line 61
    .line 62
    throw p0
.end method
