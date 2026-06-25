.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentStateKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001aA\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00072\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n0\u0007H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "paywallState",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;",
        "rememberUpdatedTabsComponentState",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;",
        "Lkotlin/Function0;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;",
        "selectedPackageInfoProvider",
        "",
        "",
        "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
        "customVariablesProvider",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;",
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
.method public static final synthetic rememberUpdatedTabsComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;
    .locals 6

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paywallState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x31c6ba27

    invoke-interface {p2, v0}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.rememberUpdatedTabsComponentState (TabsComponentState.kt:31)"

    .line 1
    invoke-static {v0, p3, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x1b29d2c3

    .line 2
    invoke-interface {p2, v0}, LY/m;->V(I)V

    and-int/lit8 v0, p3, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x20

    if-le v0, v3, :cond_1

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    and-int/lit8 v4, p3, 0x30

    if-ne v4, v3, :cond_3

    :cond_2
    move v4, v2

    goto :goto_0

    :cond_3
    move v4, v1

    .line 3
    :goto_0
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_4

    .line 4
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_5

    .line 5
    :cond_4
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentStateKt$rememberUpdatedTabsComponentState$1$1;

    invoke-direct {v5, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentStateKt$rememberUpdatedTabsComponentState$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 6
    invoke-interface {p2, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 7
    :cond_5
    check-cast v5, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v4, 0x1b29db45

    invoke-interface {p2, v4}, LY/m;->V(I)V

    if-le v0, v3, :cond_6

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    and-int/lit8 v0, p3, 0x30

    if-ne v0, v3, :cond_8

    :cond_7
    move v1, v2

    .line 8
    :cond_8
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v0

    if-nez v1, :cond_9

    .line 9
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_a

    .line 10
    :cond_9
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentStateKt$rememberUpdatedTabsComponentState$2$1;

    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentStateKt$rememberUpdatedTabsComponentState$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 11
    invoke-interface {p2, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 12
    :cond_a
    check-cast v0, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    and-int/lit8 p1, p3, 0xe

    .line 13
    invoke-static {p0, v5, v0, p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentStateKt;->rememberUpdatedTabsComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;

    move-result-object p0

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LY/w;->T()V

    :cond_b
    invoke-interface {p2}, LY/m;->O()V

    return-object p0
.end method

.method private static final synthetic rememberUpdatedTabsComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;
    .locals 4

    const v0, -0x395ce1f

    invoke-interface {p3, v0}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.rememberUpdatedTabsComponentState (TabsComponentState.kt:44)"

    .line 14
    invoke-static {v0, p4, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    .line 15
    invoke-static {p3, v0}, LV/b;->b(LY/m;I)LV/e;

    move-result-object v1

    invoke-virtual {v1}, LV/e;->a()Lb4/b;

    move-result-object v1

    invoke-virtual {v1}, Lb4/b;->b()Lb4/c;

    move-result-object v1

    const v2, 0x1b2a12e9

    invoke-interface {p3, v2}, LY/m;->V(I)V

    and-int/lit8 v2, p4, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    if-le v2, v3, :cond_1

    .line 16
    invoke-interface {p3, p0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    and-int/lit8 p4, p4, 0x6

    if-ne p4, v3, :cond_3

    :cond_2
    const/4 v0, 0x1

    .line 17
    :cond_3
    invoke-interface {p3}, LY/m;->D()Ljava/lang/Object;

    move-result-object p4

    if-nez v0, :cond_4

    .line 18
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p4, v0, :cond_5

    .line 19
    :cond_4
    new-instance p4, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;

    invoke-direct {p4, v1, p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;-><init>(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TabsComponentStyle;Lie/a;Lie/a;)V

    .line 20
    invoke-interface {p3, p4}, LY/m;->u(Ljava/lang/Object;)V

    .line 21
    :cond_5
    check-cast p4, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;

    invoke-interface {p3}, LY/m;->O()V

    .line 22
    invoke-virtual {p4, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/tabs/TabsComponentState;->update(Lb4/c;)V

    .line 23
    invoke-static {}, LY/w;->L()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LY/w;->T()V

    :cond_6
    invoke-interface {p3}, LY/m;->O()V

    return-object p4
.end method
