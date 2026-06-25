.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001ak\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00072\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00072\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0007H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "paywallState",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;",
        "rememberUpdatedTextComponentState",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;",
        "Lkotlin/Function0;",
        "Lc1/d;",
        "localeProvider",
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
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;",
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
.method public static final synthetic rememberUpdatedTextComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;
    .locals 13

    move/from16 v1, p3

    const-string v2, "style"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paywallState"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x7a4bd0a8    # -1.694451E-35f

    invoke-interface {p2, v2}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.revenuecat.purchases.ui.revenuecatui.components.text.rememberUpdatedTextComponentState (TextComponentState.kt:43)"

    .line 1
    invoke-static {v2, v1, v4, v5}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const v2, 0x1bcc3254

    .line 2
    invoke-interface {p2, v2}, LY/m;->V(I)V

    and-int/lit8 v2, v1, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/16 v7, 0x20

    if-le v2, v7, :cond_1

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    :cond_1
    and-int/lit8 v8, v1, 0x30

    if-ne v8, v7, :cond_3

    :cond_2
    move v8, v5

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
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$1$1;

    invoke-direct {v9, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 6
    invoke-interface {p2, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 7
    :cond_5
    check-cast v9, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, 0x1bcc39c1

    invoke-interface {p2, v8}, LY/m;->V(I)V

    if-le v2, v7, :cond_6

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    and-int/lit8 v8, v1, 0x30

    if-ne v8, v7, :cond_8

    :cond_7
    move v8, v5

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
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$2$1;

    invoke-direct {v10, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$2$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 11
    invoke-interface {p2, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 12
    :cond_a
    check-cast v10, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, 0x1bcc425e

    invoke-interface {p2, v8}, LY/m;->V(I)V

    if-le v2, v7, :cond_b

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    and-int/lit8 v8, v1, 0x30

    if-ne v8, v7, :cond_d

    :cond_c
    move v8, v5

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
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$3$1;

    invoke-direct {v11, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$3$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 16
    invoke-interface {p2, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 17
    :cond_f
    check-cast v11, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, 0x1bcc4ba6

    invoke-interface {p2, v8}, LY/m;->V(I)V

    if-le v2, v7, :cond_10

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    :cond_10
    and-int/lit8 v8, v1, 0x30

    if-ne v8, v7, :cond_12

    :cond_11
    move v8, v5

    goto :goto_3

    :cond_12
    move v8, v4

    .line 18
    :goto_3
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_13

    .line 19
    sget-object v8, LY/m;->a:LY/m$a;

    invoke-virtual {v8}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v12, v8, :cond_14

    .line 20
    :cond_13
    new-instance v12, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$4$1;

    invoke-direct {v12, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$4$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 21
    invoke-interface {p2, v12}, LY/m;->u(Ljava/lang/Object;)V

    .line 22
    :cond_14
    check-cast v12, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    const v8, 0x1bcc54c3

    invoke-interface {p2, v8}, LY/m;->V(I)V

    if-le v2, v7, :cond_15

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    :cond_15
    and-int/lit8 v2, v1, 0x30

    if-ne v2, v7, :cond_17

    :cond_16
    move v4, v5

    .line 23
    :cond_17
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v2

    if-nez v4, :cond_18

    .line 24
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_19

    .line 25
    :cond_18
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$5$1;

    invoke-direct {v2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt$rememberUpdatedTextComponentState$5$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;)V

    .line 26
    invoke-interface {p2, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 27
    :cond_19
    move-object v5, v2

    check-cast v5, Lie/a;

    invoke-interface {p2}, LY/m;->O()V

    and-int/lit8 v7, v1, 0xe

    move-object v0, p0

    move-object v6, p2

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    .line 28
    invoke-static/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentStateKt;->rememberUpdatedTextComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    move-result-object v0

    invoke-static {}, LY/w;->L()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-static {}, LY/w;->T()V

    :cond_1a
    invoke-interface {p2}, LY/m;->O()V

    return-object v0
.end method

.method private static final synthetic rememberUpdatedTextComponentState(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;
    .locals 13

    move-object/from16 v0, p6

    move/from16 v1, p7

    const v2, 0x54ea30ae

    invoke-interface {v0, v2}, LY/m;->V(I)V

    invoke-static {}, LY/w;->L()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.components.text.rememberUpdatedTextComponentState (TextComponentState.kt:63)"

    .line 29
    invoke-static {v2, v1, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    :cond_0
    const/4 v2, 0x0

    .line 30
    invoke-static {v0, v2}, LV/b;->b(LY/m;I)LV/e;

    move-result-object v3

    invoke-virtual {v3}, LV/e;->a()Lb4/b;

    move-result-object v3

    invoke-virtual {v3}, Lb4/b;->b()Lb4/c;

    move-result-object v5

    .line 31
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;->getCountdownDate()Ljava/util/Date;

    move-result-object v3

    const v4, 0x1bcca4f5

    invoke-interface {v0, v4}, LY/m;->V(I)V

    const/4 v12, 0x0

    if-nez v3, :cond_1

    move-object v3, v12

    goto :goto_0

    .line 32
    :cond_1
    invoke-static {v3, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownComponentStateKt;->rememberCountdownState(Ljava/util/Date;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownState;

    move-result-object v3

    .line 33
    :goto_0
    invoke-interface {v0}, LY/m;->O()V

    const v4, 0x1bccaf26

    invoke-interface {v0, v4}, LY/m;->V(I)V

    and-int/lit8 v4, v1, 0xe

    xor-int/lit8 v4, v4, 0x6

    const/4 v6, 0x4

    if-le v4, v6, :cond_2

    .line 34
    invoke-interface {v0, p0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    and-int/lit8 v1, v1, 0x6

    if-ne v1, v6, :cond_4

    :cond_3
    const/4 v2, 0x1

    .line 35
    :cond_4
    invoke-interface {v0}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    if-nez v2, :cond_5

    .line 36
    sget-object v2, LY/m;->a:LY/m$a;

    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_6

    .line 37
    :cond_5
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-direct/range {v4 .. v11}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;-><init>(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;)V

    .line 38
    invoke-interface {v0, v4}, LY/m;->u(Ljava/lang/Object;)V

    move-object v1, v4

    .line 39
    :cond_6
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;

    invoke-interface {v0}, LY/m;->O()V

    if-eqz v3, :cond_7

    .line 40
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownState;->getCountdownTime()Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;

    move-result-object v12

    .line 41
    :cond_7
    invoke-virtual {v1, v5, v12}, Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;->update(Lb4/c;Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;)V

    .line 42
    invoke-static {}, LY/w;->L()Z

    move-result p0

    if-eqz p0, :cond_8

    invoke-static {}, LY/w;->T()V

    :cond_8
    invoke-interface {v0}, LY/m;->O()V

    return-object v1
.end method
