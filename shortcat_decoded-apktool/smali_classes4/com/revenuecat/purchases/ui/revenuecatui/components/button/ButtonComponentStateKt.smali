.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentStateKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "paywallState",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;",
        "rememberButtonComponentState",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;",
        "Lkotlin/Function0;",
        "Lc1/d;",
        "localeProvider",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;",
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
.method public static final synthetic rememberButtonComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;
    .locals 3

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paywallState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x52d0e198

    invoke-interface {p2, v0}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.button.rememberButtonComponentState (ButtonComponentState.kt:23)"

    .line 1
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x6cd76ad7

    .line 2
    invoke-interface {p2, v0}, LY/m;->V(I)V

    and-int/lit8 v0, p3, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    if-le v0, v1, :cond_1

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, p3, 0x30

    if-ne v0, v1, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4

    .line 4
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_5

    .line 5
    :cond_4
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentStateKt$rememberButtonComponentState$1$1;

    invoke-direct {v1, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentStateKt$rememberButtonComponentState$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 6
    invoke-interface {p2, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 7
    :cond_5
    check-cast v1, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    and-int/lit8 p1, p3, 0xe

    .line 8
    invoke-static {p0, v1, p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentStateKt;->rememberButtonComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;

    move-result-object p0

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LY/w;->T()V

    :cond_6
    invoke-interface {p2}, LY/m;->O()V

    return-object p0
.end method

.method public static final synthetic rememberButtonComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;
    .locals 3

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x633da08c

    invoke-interface {p2, v0}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.button.rememberButtonComponentState (ButtonComponentState.kt:34)"

    .line 9
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x6cd78473

    invoke-interface {p2, v0}, LY/m;->V(I)V

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p2, p0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v1, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    .line 10
    :goto_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    .line 11
    sget-object p3, LY/m;->a:LY/m$a;

    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    .line 12
    :cond_4
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;

    invoke-direct {v0, p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lie/a;)V

    .line 13
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 14
    :cond_5
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;

    invoke-interface {p2}, LY/m;->O()V

    invoke-static {}, LY/w;->L()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LY/w;->T()V

    :cond_6
    invoke-interface {p2}, LY/m;->O()V

    return-object v0
.end method
