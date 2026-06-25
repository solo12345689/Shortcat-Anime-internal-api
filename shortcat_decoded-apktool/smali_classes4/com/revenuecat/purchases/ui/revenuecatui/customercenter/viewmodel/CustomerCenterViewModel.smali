.class public interface abstract Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J<\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\"\u0010!\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u001d2\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\u00a6@\u00a2\u0006\u0004\u0008!\u0010\"J\u001f\u0010#\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008#\u0010$J%\u0010\'\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00080%H&\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008)\u0010\u000fJ\u0010\u0010*\u001a\u00020\u0008H\u00a6@\u00a2\u0006\u0004\u0008*\u0010\u000fJ)\u0010.\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00112\u0008\u0008\u0002\u0010-\u001a\u00020,H&\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\u0008H&\u00a2\u0006\u0004\u00080\u00101J\u0017\u00104\u001a\u00020\u00082\u0006\u00103\u001a\u000202H&\u00a2\u0006\u0004\u00084\u00105J\u000f\u00106\u001a\u00020\u0008H&\u00a2\u0006\u0004\u00086\u00101J\u001f\u0010:\u001a\u00020\u00082\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010<\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008<\u00101J\u0017\u0010=\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008=\u0010>J\u000f\u0010?\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008?\u00101J\u000f\u0010@\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008@\u00101J\u000f\u0010A\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008A\u00101J\u0017\u0010C\u001a\u00020\u00082\u0006\u0010B\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008C\u0010DJ\u000f\u0010E\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008E\u00101J\u000f\u0010F\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008F\u00101R\u001a\u0010K\u001a\u0008\u0012\u0004\u0012\u00020H0G8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010JR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0L8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010O\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
        "path",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
        "product",
        "LTd/L;",
        "pathButtonPressed",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V",
        "purchase",
        "selectPurchase",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V",
        "dismissRestoreDialog",
        "(LZd/e;)Ljava/lang/Object;",
        "restorePurchases",
        "",
        "supportEmail",
        "contactSupport",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;",
        "promotionalOffer",
        "originalPath",
        "purchaseInformation",
        "",
        "loadAndDisplayPromotionalOffer",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "subscriptionOption",
        "Landroid/app/Activity;",
        "activity",
        "onAcceptedPromotionalOffer",
        "(Lcom/revenuecat/purchases/models/SubscriptionOption;Landroid/app/Activity;LZd/e;)Ljava/lang/Object;",
        "dismissPromotionalOffer",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V",
        "Lkotlin/Function0;",
        "onDismiss",
        "onNavigationButtonPressed",
        "(Landroid/content/Context;Lie/a;)V",
        "loadCustomerCenter",
        "refreshCustomerCenter",
        "url",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;",
        "method",
        "openURL",
        "(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V",
        "clearActionError",
        "()V",
        "Lcom/revenuecat/purchases/customercenter/CustomActionData;",
        "customActionData",
        "onCustomActionSelected",
        "(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V",
        "refreshStateIfLocaleChanged",
        "LU/l;",
        "currentColorScheme",
        "isSystemInDarkTheme",
        "refreshColors",
        "(LU/l;Z)V",
        "trackImpressionIfNeeded",
        "showPaywall",
        "(Landroid/content/Context;)V",
        "showVirtualCurrencyBalances",
        "showCreateSupportTicket",
        "dismissSupportTicketSuccessSnackbar",
        "isChangingConfigurations",
        "onActivityStopped",
        "(Z)V",
        "onActivityStarted",
        "onActivityResumed",
        "LJf/I;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;",
        "getState",
        "()LJf/I;",
        "state",
        "LY/h2;",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "getActionError",
        "()LY/h2;",
        "actionError",
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

.method public abstract contactSupport(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public abstract dismissPromotionalOffer(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V
.end method

.method public abstract dismissRestoreDialog(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract dismissSupportTicketSuccessSnackbar()V
.end method

.method public abstract getActionError()LY/h2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation
.end method

.method public abstract getState()LJf/I;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LJf/I;"
        }
    .end annotation
.end method

.method public abstract loadAndDisplayPromotionalOffer(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/revenuecat/purchases/models/StoreProduct;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract loadCustomerCenter(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onAcceptedPromotionalOffer(Lcom/revenuecat/purchases/models/SubscriptionOption;Landroid/app/Activity;LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/models/SubscriptionOption;",
            "Landroid/app/Activity;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onActivityResumed()V
.end method

.method public abstract onActivityStarted()V
.end method

.method public abstract onActivityStopped(Z)V
.end method

.method public abstract onCustomActionSelected(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V
.end method

.method public abstract onNavigationButtonPressed(Landroid/content/Context;Lie/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lie/a;",
            ")V"
        }
    .end annotation
.end method

.method public abstract openURL(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V
.end method

.method public abstract pathButtonPressed(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V
.end method

.method public abstract refreshColors(LU/l;Z)V
.end method

.method public abstract refreshCustomerCenter(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract refreshStateIfLocaleChanged()V
.end method

.method public abstract restorePurchases(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectPurchase(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V
.end method

.method public abstract showCreateSupportTicket()V
.end method

.method public abstract showPaywall(Landroid/content/Context;)V
.end method

.method public abstract showVirtualCurrencyBalances()V
.end method

.method public abstract trackImpressionIfNeeded()V
.end method
