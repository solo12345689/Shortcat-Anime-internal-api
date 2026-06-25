.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a]\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00072\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\u0007H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "paywallState",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;",
        "rememberUpdatedStackComponentState",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;",
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
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;",
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
.method public static final synthetic rememberUpdatedStackComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;
    .locals 12

    const-string v2, "style"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paywallState"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x660b3875

    invoke-interface {p2, v2}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v6, "com.revenuecat.purchases.ui.revenuecatui.components.stack.rememberUpdatedStackComponentState (StackComponentState.kt:39)"

    .line 1
    invoke-static {v2, p3, v4, v6}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const v2, 0x3b7d6467

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
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt$rememberUpdatedStackComponentState$1$1;

    invoke-direct {v9, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt$rememberUpdatedStackComponentState$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 6
    invoke-interface {p2, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 7
    :cond_5
    check-cast v9, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, 0x3b7d6d04

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
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt$rememberUpdatedStackComponentState$2$1;

    invoke-direct {v10, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt$rememberUpdatedStackComponentState$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 11
    invoke-interface {p2, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 12
    :cond_a
    check-cast v10, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, 0x3b7d764c

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
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt$rememberUpdatedStackComponentState$3$1;

    invoke-direct {v11, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt$rememberUpdatedStackComponentState$3$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 16
    invoke-interface {p2, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 17
    :cond_f
    check-cast v11, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, 0x3b7d7f69

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
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt$rememberUpdatedStackComponentState$4$1;

    invoke-direct {v2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt$rememberUpdatedStackComponentState$4$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

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
    invoke-static/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentStateKt;->rememberUpdatedStackComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    move-result-object v0

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {}, LY/w;->T()V

    :cond_15
    invoke-interface {p2}, LY/m;->O()V

    return-object v0
.end method

.method private static final synthetic rememberUpdatedStackComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;
    .locals 12

    move-object/from16 v0, p5

    move/from16 v1, p6

    const v2, 0x58eab2f9

    invoke-interface {v0, v2}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.components.stack.rememberUpdatedStackComponentState (StackComponentState.kt:56)"

    .line 24
    invoke-static {v2, v1, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const/4 v2, 0x0

    .line 25
    invoke-static {v0, v2}, LV/b;->b(LY/m;I)LV/e;

    move-result-object v3

    invoke-virtual {v3}, LV/e;->a()Lb4/b;

    move-result-object v3

    invoke-virtual {v3}, Lb4/b;->b()Lb4/c;

    move-result-object v5

    .line 26
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    move-result-object v3

    .line 27
    invoke-interface {v0, v3}, LY/m;->n(LY/D;)Ljava/lang/Object;

    move-result-object v3

    .line 28
    move-object v6, v3

    check-cast v6, Li1/t;

    const v3, 0x3b7dcbf6

    invoke-interface {v0, v3}, LY/m;->V(I)V

    and-int/lit8 v3, v1, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    if-le v3, v4, :cond_1

    .line 29
    invoke-interface {v0, p0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    and-int/lit8 v1, v1, 0x6

    if-ne v1, v4, :cond_3

    :cond_2
    const/4 v2, 0x1

    .line 30
    :cond_3
    invoke-interface {v0}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    if-nez v2, :cond_4

    .line 31
    sget-object v2, LY/m;->a:LY/m$a;

    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_5

    .line 32
    :cond_4
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    move-object v7, p0

    move-object v8, p1

    move-object v9, p2

    move-object v10, p3

    move-object/from16 v11, p4

    invoke-direct/range {v4 .. v11}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;-><init>(Lb4/c;Li1/t;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;)V

    .line 33
    invoke-interface {v0, v4}, LY/m;->u(Ljava/lang/Object;)V

    move-object v1, v4

    .line 34
    :cond_5
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;

    invoke-interface {v0}, LY/m;->O()V

    .line 35
    invoke-virtual {v1, v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;->update(Lb4/c;Li1/t;)V

    .line 36
    invoke-static {}, LY/w;->L()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LY/w;->T()V

    :cond_6
    invoke-interface {v0}, LY/m;->O()V

    return-object v1
.end method
