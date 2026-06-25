.class public interface abstract Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008a\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u000f\u0010\u0004J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00022\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001e\u0010\u0004J\u0019\u0010!\u001a\u00020\u00022\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH&\u00a2\u0006\u0004\u0008!\u0010\"J.\u0010\'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0008\u0010$\u001a\u0004\u0018\u00010#2\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010%H\u00a6@\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008)\u0010\u0004J\u0010\u0010*\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008*\u0010+J\u000f\u0010,\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008-\u0010\u0004R\u001a\u00102\u001a\u0008\u0012\u0004\u0012\u00020/0.8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u0014\u00106\u001a\u0002038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u00105R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u0007078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u00109R\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u0007078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u00109R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u00109\u00a8\u0006C"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;",
        "",
        "LTd/L;",
        "refreshStateIfLocaleChanged",
        "()V",
        "LU/l;",
        "colorScheme",
        "",
        "isDark",
        "refreshStateIfColorsChanged",
        "(LU/l;Z)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;",
        "packageToSelect",
        "selectPackage",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V",
        "trackPaywallImpressionIfNeeded",
        "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;",
        "exitOfferType",
        "",
        "exitOfferingIdentifier",
        "trackExitOffer",
        "(Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;)V",
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
        "LJf/I;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;",
        "getState",
        "()LJf/I;",
        "state",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
        "getResourceProvider",
        "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;",
        "resourceProvider",
        "LY/h2;",
        "getActionInProgress",
        "()LY/h2;",
        "actionInProgress",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "getActionError",
        "actionError",
        "getPurchaseCompleted",
        "purchaseCompleted",
        "Lcom/revenuecat/purchases/Offering;",
        "getPreloadedExitOffering",
        "preloadedExitOffering",
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


# virtual methods
.method public abstract clearActionError()V
.end method

.method public abstract closePaywall(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V
.end method

.method public abstract getActionError()LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation
.end method

.method public abstract getActionInProgress()LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation
.end method

.method public abstract getPreloadedExitOffering()LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation
.end method

.method public abstract getPurchaseCompleted()LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation
.end method

.method public abstract getResourceProvider()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;
.end method

.method public abstract getState()LJf/I;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LJf/I;"
        }
    .end annotation
.end method

.method public abstract getWebCheckoutUrl(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;)Ljava/lang/String;
.end method

.method public abstract handlePackagePurchase(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;LZd/e;)Ljava/lang/Object;
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
.end method

.method public abstract handleRestorePurchases(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract invalidateCustomerInfoCache()V
.end method

.method public abstract preloadExitOffering()V
.end method

.method public abstract purchaseSelectedPackage(Landroid/app/Activity;)V
.end method

.method public abstract refreshStateIfColorsChanged(LU/l;Z)V
.end method

.method public abstract refreshStateIfLocaleChanged()V
.end method

.method public abstract restorePurchases()V
.end method

.method public abstract selectPackage(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V
.end method

.method public abstract trackExitOffer(Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;)V
.end method

.method public abstract trackPaywallImpressionIfNeeded()V
.end method
