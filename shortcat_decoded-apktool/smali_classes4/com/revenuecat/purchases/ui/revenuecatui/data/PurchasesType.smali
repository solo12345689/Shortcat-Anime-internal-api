.class public interface abstract Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008\u000b\u0010\tJ\u001a\u0010\u000e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00a6@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0004\u0008\u0011\u0010\tJ$\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u00a6@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u00a6@\u00a2\u0006\u0004\u0008\u0019\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH&\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008!\u0010\tJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u00a6@\u00a2\u0006\u0004\u0008%\u0010\u0017R\u0014\u0010)\u001a\u00020&8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00081\u0010+\u00a8\u00063"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;",
        "",
        "Lcom/revenuecat/purchases/PurchaseParams$Builder;",
        "purchaseParams",
        "Lcom/revenuecat/purchases/PurchaseResult;",
        "awaitPurchase",
        "(Lcom/revenuecat/purchases/PurchaseParams$Builder;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "awaitRestore",
        "(LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/Offerings;",
        "awaitOfferings",
        "Lcom/revenuecat/purchases/CacheFetchPolicy;",
        "fetchPolicy",
        "awaitCustomerInfo",
        "(Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;",
        "awaitCustomerCenterConfigData",
        "",
        "productId",
        "basePlan",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "awaitGetProduct",
        "(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;",
        "awaitGetVirtualCurrencies",
        "LTd/L;",
        "invalidateVirtualCurrenciesCache",
        "()V",
        "Lcom/revenuecat/purchases/common/events/FeatureEvent;",
        "event",
        "track",
        "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V",
        "awaitSyncPurchases",
        "email",
        "description",
        "Lcom/revenuecat/purchases/CreateSupportTicketResult;",
        "awaitCreateSupportTicket",
        "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;",
        "getPurchasesAreCompletedBy",
        "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;",
        "purchasesAreCompletedBy",
        "getStorefrontCountryCode",
        "()Ljava/lang/String;",
        "storefrontCountryCode",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "getCustomerCenterListener",
        "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "customerCenterListener",
        "getPreferredUILocaleOverride",
        "preferredUILocaleOverride",
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
.method public abstract awaitCreateSupportTicket(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract awaitCustomerCenterConfigData(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract awaitCustomerInfo(Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/CacheFetchPolicy;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract awaitGetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract awaitGetVirtualCurrencies(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract awaitOfferings(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract awaitPurchase(Lcom/revenuecat/purchases/PurchaseParams$Builder;LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/PurchaseParams$Builder;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract awaitRestore(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract awaitSyncPurchases(LZd/e;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;
.end method

.method public abstract getPreferredUILocaleOverride()Ljava/lang/String;
.end method

.method public abstract getPurchasesAreCompletedBy()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;
.end method

.method public abstract getStorefrontCountryCode()Ljava/lang/String;
.end method

.method public abstract invalidateVirtualCurrenciesCache()V
.end method

.method public abstract track(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V
.end method
