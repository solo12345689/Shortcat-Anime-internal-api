.class final Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\u001f\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00082\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008$\u0010\nJ\u0019\u0010\'\u001a\u00020\u00082\u0008\u0010&\u001a\u0004\u0018\u00010%H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J,\u0010-\u001a\u00020\u00082\u0006\u0010&\u001a\u00020%2\u0008\u0010*\u001a\u0004\u0018\u00010)2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u0096@\u00a2\u0006\u0004\u0008-\u0010.J\u000f\u0010/\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008/\u0010\nJ\u0010\u00100\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u00082\u0010\nJ\u000f\u00103\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u00083\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u00106R \u00108\u001a\u0008\u0012\u0004\u0012\u00020\u0014078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008=\u00109\u001a\u0004\u0008>\u0010;R \u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u0014078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008?\u00109\u001a\u0004\u0008@\u0010;R\"\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008B\u00109\u001a\u0004\u0008C\u0010;R\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020G8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010I\u00a8\u0006J"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;",
        "state",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
        "resourceProvider",
        "<init>",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)V",
        "LTd/L;",
        "trackPaywallImpressionIfNeeded",
        "()V",
        "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;",
        "exitOfferType",
        "",
        "exitOfferingIdentifier",
        "trackExitOffer",
        "(Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;)V",
        "refreshStateIfLocaleChanged",
        "LU/l;",
        "colorScheme",
        "",
        "isDarkMode",
        "refreshStateIfColorsChanged",
        "(LU/l;Z)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
        "packageToSelect",
        "selectPackage",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;",
        "result",
        "closePaywall",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;",
        "launchWebCheckout",
        "getWebCheckoutUrl",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;)Ljava/lang/String;",
        "invalidateCustomerInfoCache",
        "Landroid/app/Activity;",
        "activity",
        "purchaseSelectedPackage",
        "(Landroid/app/Activity;)V",
        "Lcom/revenuecat/purchases/Package;",
        "pkg",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;",
        "resolvedOffer",
        "handlePackagePurchase",
        "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;LZd/e;)Ljava/lang/Object;",
        "restorePurchases",
        "handleRestorePurchases",
        "(LZd/e;)Ljava/lang/Object;",
        "clearActionError",
        "preloadExitOffering",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
        "getResourceProvider",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
        "LY/h2;",
        "actionInProgress",
        "LY/h2;",
        "getActionInProgress",
        "()LY/h2;",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "actionError",
        "getActionError",
        "purchaseCompleted",
        "getPurchaseCompleted",
        "Lcom/revenuecat/purchases/Offering;",
        "preloadedExitOffering",
        "getPreloadedExitOffering",
        "LJf/u;",
        "_state",
        "LJf/u;",
        "LJf/I;",
        "getState",
        "()LJf/I;",
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


# instance fields
.field private final _state:LJf/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJf/u;"
        }
    .end annotation
.end field

.field private final actionError:LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/h2;"
        }
    .end annotation
.end field

.field private final actionInProgress:LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/h2;"
        }
    .end annotation
.end field

.field private final preloadedExitOffering:LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/h2;"
        }
    .end annotation
.end field

.field private final purchaseCompleted:LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/h2;"
        }
    .end annotation
.end field

.field private final resourceProvider:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;


# direct methods
.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)V
    .locals 3

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "resourceProvider"

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
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->resourceProvider:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;

    .line 15
    .line 16
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-static {p2, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->actionInProgress:LY/h2;

    .line 25
    .line 26
    invoke-static {v0, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iput-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->actionError:LY/h2;

    .line 31
    .line 32
    invoke-static {p2, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->purchaseCompleted:LY/h2;

    .line 37
    .line 38
    invoke-static {v0, v0, v1, v0}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->preloadedExitOffering:LY/h2;

    .line 43
    .line 44
    invoke-static {p1}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->_state:LJf/u;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public clearActionError()V
    .locals 0

    .line 1
    return-void
.end method

.method public closePaywall(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V
    .locals 0

    .line 1
    return-void
.end method

.method public getActionError()LY/h2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->actionError:LY/h2;

    .line 2
    .line 3
    return-object v0
.end method

.method public getActionInProgress()LY/h2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->actionInProgress:LY/h2;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPreloadedExitOffering()LY/h2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->preloadedExitOffering:LY/h2;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPurchaseCompleted()LY/h2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->purchaseCompleted:LY/h2;

    .line 2
    .line 3
    return-object v0
.end method

.method public getResourceProvider()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->resourceProvider:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public getState()LJf/I;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LJf/I;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;->_state:LJf/u;

    .line 2
    .line 3
    invoke-static {v0}, LJf/g;->b(LJf/u;)LJf/I;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getWebCheckoutUrl(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "launchWebCheckout"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public handlePackagePurchase(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;LZd/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/revenuecat/purchases/Package;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 2
    .line 3
    return-object p1
.end method

.method public handleRestorePurchases(LZd/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object p1, LTd/L;->a:LTd/L;

    .line 2
    .line 3
    return-object p1
.end method

.method public invalidateCustomerInfoCache()V
    .locals 0

    .line 1
    return-void
.end method

.method public preloadExitOffering()V
    .locals 0

    .line 1
    return-void
.end method

.method public purchaseSelectedPackage(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public refreshStateIfColorsChanged(LU/l;Z)V
    .locals 0

    .line 1
    const-string p2, "colorScheme"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public refreshStateIfLocaleChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public restorePurchases()V
    .locals 0

    .line 1
    return-void
.end method

.method public selectPackage(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V
    .locals 1

    .line 1
    const-string v0, "packageToSelect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public trackExitOffer(Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "exitOfferType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "exitOfferingIdentifier"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public trackPaywallImpressionIfNeeded()V
    .locals 0

    .line 1
    return-void
.end method
