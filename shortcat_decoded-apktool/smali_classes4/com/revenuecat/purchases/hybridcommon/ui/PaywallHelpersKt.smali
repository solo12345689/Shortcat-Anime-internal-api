.class public final Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000b\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/fragment/app/v;",
        "activity",
        "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;",
        "paywallResultListener",
        "",
        "requiredEntitlementIdentifier",
        "",
        "shouldDisplayDismissButton",
        "Lcom/revenuecat/purchases/Offering;",
        "offering",
        "LTd/L;",
        "presentPaywallFromFragment",
        "(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/Offering;)V",
        "Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;",
        "options",
        "(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V",
        "hybridcommon-ui_bc8Release"
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
.method public static synthetic a(Landroidx/fragment/app/v;Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->presentPaywallFromFragment$lambda$3$lambda$2(Landroidx/fragment/app/v;Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Landroidx/fragment/app/v;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->presentPaywallFromFragment$lambda$3$lambda$2$lambda$1(Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Landroidx/fragment/app/v;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final presentPaywallFromFragment(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;)V
    .locals 8
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paywallResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->presentPaywallFromFragment$default(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/Offering;ILjava/lang/Object;)V

    return-void
.end method

.method public static final presentPaywallFromFragment(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;)V
    .locals 8
    .annotation runtime LTd/e;
    .end annotation

    .line 2
    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paywallResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->presentPaywallFromFragment$default(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/Offering;ILjava/lang/Object;)V

    return-void
.end method

.method public static final presentPaywallFromFragment(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 8
    .annotation runtime LTd/e;
    .end annotation

    .line 3
    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paywallResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->presentPaywallFromFragment$default(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/Offering;ILjava/lang/Object;)V

    return-void
.end method

.method public static final presentPaywallFromFragment(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/Offering;)V
    .locals 13
    .annotation runtime LTd/e;
    .end annotation

    move-object/from16 v0, p4

    const-string v1, "activity"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "paywallResultListener"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    .line 4
    new-instance v1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$Offering;

    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$Offering;-><init>(Lcom/revenuecat/purchases/Offering;)V

    :goto_0
    move-object v4, v1

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$DefaultOffering;->INSTANCE:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource$DefaultOffering;

    goto :goto_0

    .line 5
    :goto_1
    new-instance v2, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;

    const/16 v11, 0xf0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v3, p1

    move-object v5, p2

    move-object/from16 v6, p3

    invoke-direct/range {v2 .. v12}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;-><init>(Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    invoke-static {p0, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->presentPaywallFromFragment(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V

    return-void
.end method

.method public static final presentPaywallFromFragment(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V
    .locals 5

    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getPaywallResultListener()Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getPaywallListener()Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getPurchaseLogic()Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 9
    :cond_0
    sget-object v1, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgsStore;->INSTANCE:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgsStore;

    .line 10
    new-instance v2, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgs;

    .line 11
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getPaywallListener()Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;

    move-result-object v3

    .line 12
    invoke-virtual {p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getPurchaseLogic()Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;

    move-result-object v4

    .line 13
    invoke-direct {v2, v3, v4}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgs;-><init>(Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V

    .line 14
    invoke-virtual {v1, v0, v2}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgsStore;->put(Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragmentNonSerializableArgs;)V

    .line 15
    :cond_1
    new-instance v1, Lcom/revenuecat/purchases/hybridcommon/ui/f;

    invoke-direct {v1, p0, v0, p1, p1}, Lcom/revenuecat/purchases/hybridcommon/ui/f;-><init>(Landroidx/fragment/app/v;Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V

    invoke-virtual {p0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic presentPaywallFromFragment$default(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/Offering;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x8

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x10

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    move-object p4, v0

    .line 17
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallHelpersKt;->presentPaywallFromFragment(Landroidx/fragment/app/v;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/Offering;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final presentPaywallFromFragment$lambda$3$lambda$2(Landroidx/fragment/app/v;Ljava/lang/String;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/v;->C()Landroidx/fragment/app/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/revenuecat/purchases/hybridcommon/ui/e;

    .line 6
    .line 7
    invoke-direct {v1, p2, p0, p1}, Lcom/revenuecat/purchases/hybridcommon/ui/e;-><init>(Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Landroidx/fragment/app/v;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p0, v1}, Landroidx/fragment/app/K;->z1(Ljava/lang/String;Landroidx/lifecycle/r;Landroidx/fragment/app/P;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/activity/j;->getLifecycle()Landroidx/lifecycle/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroidx/lifecycle/k;->getCurrentState()Landroidx/lifecycle/k$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Landroidx/lifecycle/k$b;->d:Landroidx/lifecycle/k$b;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/lifecycle/k$b;->b(Landroidx/lifecycle/k$b;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/v;->C()Landroidx/fragment/app/K;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/K;->s()Landroidx/fragment/app/U;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sget-object v0, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;->Companion:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;

    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getRequiredEntitlementIdentifier()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p2}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getShouldDisplayDismissButton()Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {p2}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getPaywallSource()Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {p2}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getFontFamily()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {p2}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getCustomVariables()Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    move-object v1, p1

    .line 60
    invoke-virtual/range {v0 .. v6}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$Companion;->newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/ui/PaywallSource;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/PaywallFontFamily;Ljava/util/Map;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string p2, "revenuecat-paywall-fragment"

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/U;->e(Landroidx/fragment/app/q;Ljava/lang/String;)Landroidx/fragment/app/U;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Landroidx/fragment/app/U;->h()I

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_0
    const-string p0, "Purchases"

    .line 75
    .line 76
    const-string p1, "Tried to present a paywall while the activity was paused or finished. Not presenting."

    .line 77
    .line 78
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getPaywallResultListener()Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string p1, "ERROR"

    .line 86
    .line 87
    invoke-interface {p0, p1}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;->onPaywallResult(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method private static final presentPaywallFromFragment$lambda$3$lambda$2$lambda$1(Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;Landroidx/fragment/app/v;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "<anonymous parameter 0>"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "result"

    .line 7
    .line 8
    invoke-static {p4, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p3, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$ResultKey;->PAYWALL_RESULT:Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$ResultKey;

    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallFragment$ResultKey;->getKey()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p4, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/revenuecat/purchases/hybridcommon/ui/PresentPaywallOptions;->getPaywallResultListener()Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0, p3}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;->onPaywallResult(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/fragment/app/v;->C()Landroidx/fragment/app/K;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0, p2}, Landroidx/fragment/app/K;->z(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p1, "PaywallResult not found in result bundle."

    .line 41
    .line 42
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p0
.end method
