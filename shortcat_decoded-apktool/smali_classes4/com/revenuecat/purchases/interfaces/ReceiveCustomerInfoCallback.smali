.class public interface abstract Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;",
        "",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "customerInfo",
        "LTd/L;",
        "onReceived",
        "(Lcom/revenuecat/purchases/CustomerInfo;)V",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "error",
        "onError",
        "(Lcom/revenuecat/purchases/PurchasesError;)V",
        "purchases_defaultsBc8Release"
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
.method public abstract onError(Lcom/revenuecat/purchases/PurchasesError;)V
.end method

.method public abstract onReceived(Lcom/revenuecat/purchases/CustomerInfo;)V
.end method
