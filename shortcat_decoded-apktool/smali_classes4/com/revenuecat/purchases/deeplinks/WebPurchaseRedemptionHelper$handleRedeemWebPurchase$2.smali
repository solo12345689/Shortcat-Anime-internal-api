.class final Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;->handleRedeemWebPurchase(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;",
        "result",
        "LTd/L;",
        "invoke",
        "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $listener:Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;

.field final synthetic this$0:Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->this$0:Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->$listener:Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->invoke(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;

    if-eqz v0, :cond_1

    .line 3
    sget-object v0, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    move-result-object v1

    .line 4
    sget-object v2, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    invoke-virtual {v2}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gtz v2, :cond_0

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[Purchases] - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    const-string v2, "Successfully redeemed web purchase. Updating customer info."

    .line 7
    invoke-interface {v1, v0, v2}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->this$0:Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;

    invoke-static {v0}, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;->access$getOfflineEntitlementsManager$p(Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;)Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;->resetOfflineCustomerInfoCache()V

    .line 9
    iget-object v0, p0, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->this$0:Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;

    invoke-static {v0}, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;->access$getCustomerInfoUpdateHandler$p(Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;)Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result$Success;->getCustomerInfo()Lcom/revenuecat/purchases/CustomerInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;->cacheAndNotifyListeners(Lcom/revenuecat/purchases/CustomerInfo;)V

    .line 10
    iget-object v0, p0, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->this$0:Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;

    iget-object v1, p0, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->$listener:Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;

    invoke-static {v0, v1, p1}, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;->access$dispatchResult(Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V

    return-void

    .line 11
    :cond_1
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error redeeming web purchase: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 13
    const-string v2, "[Purchases] - ERROR"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    iget-object v0, p0, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->this$0:Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;

    iget-object v1, p0, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper$handleRedeemWebPurchase$2;->$listener:Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;

    invoke-static {v0, v1, p1}, Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;->access$dispatchResult(Lcom/revenuecat/purchases/deeplinks/WebPurchaseRedemptionHelper;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V

    return-void
.end method
