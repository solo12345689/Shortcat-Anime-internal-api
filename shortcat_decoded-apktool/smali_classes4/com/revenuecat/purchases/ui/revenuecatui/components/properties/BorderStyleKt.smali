.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyleKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/Border;",
        "",
        "Lcom/revenuecat/purchases/ColorAlias;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;",
        "aliases",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;",
        "toBorderStyles",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/Border;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;",
        "border",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;",
        "rememberBorderStyle",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;",
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
.method public static final synthetic rememberBorderStyle(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;
    .locals 3

    .line 1
    const-string v0, "border"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x5ab4613e

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LY/w;->L()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberBorderStyle (BorderStyle.kt:49)"

    .line 20
    .line 21
    invoke-static {v0, p2, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;->getColors()Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p2, p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->getForCurrentTheme(Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const v0, 0x4a707ba9    # 3940074.2f

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v0}, LY/m;->V(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    sget-object v0, LY/m;->a:LY/m$a;

    .line 50
    .line 51
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-ne v1, v0, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;->getWidth-D9Ej5fM()F

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-direct {v1, p0, p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;-><init>(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyle;

    .line 71
    .line 72
    invoke-interface {p1}, LY/m;->O()V

    .line 73
    .line 74
    .line 75
    invoke-static {}, LY/w;->L()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_3

    .line 80
    .line 81
    invoke-static {}, LY/w;->T()V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-interface {p1}, LY/m;->O()V

    .line 85
    .line 86
    .line 87
    return-object v1
.end method

.method public static final synthetic toBorderStyles(Lcom/revenuecat/purchases/paywalls/components/properties/Border;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "aliases"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Border;->getColor()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyleKt;->toColorStyles(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    instance-of v0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result$Success;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;

    .line 30
    .line 31
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/revenuecat/purchases/paywalls/components/properties/Border;->getWidth()D

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    double-to-float p0, v1

    .line 38
    invoke-static {p0}, Li1/h;->n(F)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p0, p1, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/BorderStyles;-><init>(FLcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyles;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

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
