.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a]\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00072\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\u0007H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "paywallState",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;",
        "rememberUpdatedCarouselComponentState",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;",
        "Lkotlin/Function0;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;",
        "selectedPackageInfoProvider",
        "",
        "selectedTabIndexProvider",
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;",
        "selectedOfferEligibilityProvider",
        "",
        "",
        "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
        "customVariablesProvider",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;",
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
.method public static final synthetic rememberUpdatedCarouselComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;
    .locals 12

    const-string v2, "style"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paywallState"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x7a0a35fb

    invoke-interface {p2, v2}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.rememberUpdatedCarouselComponentState (CarouselComponentState.kt:31)"

    .line 1
    invoke-static {v2, p3, v4, v6}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const v2, -0x59fe8f19

    .line 2
    invoke-interface {p2, v2}, LY/m;->V(I)V

    and-int/lit8 v2, p3, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/16 v7, 0x20

    if-le v2, v7, :cond_1

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    :cond_1
    and-int/lit8 v8, p3, 0x30

    if-ne v8, v7, :cond_3

    :cond_2
    move v8, v6

    goto :goto_0

    :cond_3
    move v8, v4

    .line 3
    :goto_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_4

    .line 4
    sget-object v8, LY/m;->a:LY/m$a;

    invoke-virtual {v8}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_5

    .line 5
    :cond_4
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt$rememberUpdatedCarouselComponentState$1$1;

    invoke-direct {v9, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt$rememberUpdatedCarouselComponentState$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 6
    invoke-interface {p2, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 7
    :cond_5
    check-cast v9, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, -0x59fe867c

    invoke-interface {p2, v8}, LY/m;->V(I)V

    if-le v2, v7, :cond_6

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    and-int/lit8 v8, p3, 0x30

    if-ne v8, v7, :cond_8

    :cond_7
    move v8, v6

    goto :goto_1

    :cond_8
    move v8, v4

    .line 8
    :goto_1
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_9

    .line 9
    sget-object v8, LY/m;->a:LY/m$a;

    invoke-virtual {v8}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_a

    .line 10
    :cond_9
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt$rememberUpdatedCarouselComponentState$2$1;

    invoke-direct {v10, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt$rememberUpdatedCarouselComponentState$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 11
    invoke-interface {p2, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 12
    :cond_a
    check-cast v10, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, -0x59fe7d34

    invoke-interface {p2, v8}, LY/m;->V(I)V

    if-le v2, v7, :cond_b

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    and-int/lit8 v8, p3, 0x30

    if-ne v8, v7, :cond_d

    :cond_c
    move v8, v6

    goto :goto_2

    :cond_d
    move v8, v4

    .line 13
    :goto_2
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_e

    .line 14
    sget-object v8, LY/m;->a:LY/m$a;

    invoke-virtual {v8}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v11, v8, :cond_f

    .line 15
    :cond_e
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt$rememberUpdatedCarouselComponentState$3$1;

    invoke-direct {v11, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt$rememberUpdatedCarouselComponentState$3$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 16
    invoke-interface {p2, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 17
    :cond_f
    check-cast v11, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, -0x59fe7417

    invoke-interface {p2, v8}, LY/m;->V(I)V

    if-le v2, v7, :cond_10

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    and-int/lit8 v2, p3, 0x30

    if-ne v2, v7, :cond_12

    :cond_11
    move v4, v6

    .line 18
    :cond_12
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    if-nez v4, :cond_13

    .line 19
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_14

    .line 20
    :cond_13
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt$rememberUpdatedCarouselComponentState$4$1;

    invoke-direct {v2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt$rememberUpdatedCarouselComponentState$4$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 21
    invoke-interface {p2, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 22
    :cond_14
    move-object v4, v2

    check-cast v4, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    and-int/lit8 v6, p3, 0xe

    move-object v0, p0

    move-object v5, p2

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    .line 23
    invoke-static/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentStateKt;->rememberUpdatedCarouselComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;

    move-result-object v0

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {}, LY/w;->T()V

    :cond_15
    invoke-interface {p2}, LY/m;->O()V

    return-object v0
.end method

.method private static final synthetic rememberUpdatedCarouselComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;
    .locals 9

    const v0, -0x536107d9

    invoke-interface {p5, v0}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.rememberUpdatedCarouselComponentState (CarouselComponentState.kt:48)"

    .line 24
    invoke-static {v0, p6, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    .line 25
    invoke-static {p5, v0}, LV/b;->b(LY/m;I)LV/e;

    move-result-object v1

    invoke-virtual {v1}, LV/e;->a()Lb4/b;

    move-result-object v1

    invoke-virtual {v1}, Lb4/b;->b()Lb4/c;

    move-result-object v3

    const v1, -0x59fe2d7d

    invoke-interface {p5, v1}, LY/m;->V(I)V

    and-int/lit8 v1, p6, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v2, 0x4

    if-le v1, v2, :cond_1

    .line 26
    invoke-interface {p5, p0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    and-int/lit8 p6, p6, 0x6

    if-ne p6, v2, :cond_3

    :cond_2
    const/4 v0, 0x1

    .line 27
    :cond_3
    invoke-interface {p5}, LY/m;->D()Ljava/lang/Object;

    move-result-object p6

    if-nez v0, :cond_4

    .line 28
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p6, v0, :cond_5

    .line 29
    :cond_4
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;-><init>(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/CarouselComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V

    .line 30
    invoke-interface {p5, v2}, LY/m;->u(Ljava/lang/Object;)V

    move-object p6, v2

    .line 31
    :cond_5
    check-cast p6, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;

    invoke-interface {p5}, LY/m;->O()V

    .line 32
    invoke-virtual {p6, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/carousel/CarouselComponentState;->update(Lb4/c;)V

    .line 33
    invoke-static {}, LY/w;->L()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LY/w;->T()V

    :cond_6
    invoke-interface {p5}, LY/m;->O()V

    return-object p6
.end method
