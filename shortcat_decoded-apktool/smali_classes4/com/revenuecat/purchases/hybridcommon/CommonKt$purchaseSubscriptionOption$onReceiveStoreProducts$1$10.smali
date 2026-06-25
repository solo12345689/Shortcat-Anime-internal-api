.class final Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1;->invoke(Ljava/util/List;)V
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
        "Lcom/revenuecat/purchases/Offerings;",
        "offerings",
        "LTd/L;",
        "invoke",
        "(Lcom/revenuecat/purchases/Offerings;)V",
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
.field final synthetic $addOnPackages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

.field final synthetic $presentedOfferingContext:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;Ljava/util/List;Lcom/revenuecat/purchases/PurchaseParams$Builder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/revenuecat/purchases/hybridcommon/OnResult;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/revenuecat/purchases/PurchaseParams$Builder;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$presentedOfferingContext:Ljava/util/Map;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$addOnPackages:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/Offerings;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->invoke(Lcom/revenuecat/purchases/Offerings;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lcom/revenuecat/purchases/Offerings;)V
    .locals 5

    const-string v0, "offerings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$presentedOfferingContext:Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->toPresentedOfferingContext(Ljava/util/Map;)Lcom/revenuecat/purchases/PresentedOfferingContext;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 4
    new-instance v0, Lcom/revenuecat/purchases/PurchasesError;

    .line 5
    sget-object v3, Lcom/revenuecat/purchases/PurchasesErrorCode;->PurchaseInvalidError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 6
    const-string v4, "There is no or invalid presented offering context data provided to make this purchase"

    .line 7
    invoke-direct {v0, v3, v4}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 8
    invoke-static {v0, v1, v2, v1}, Lcom/revenuecat/purchases/hybridcommon/mappers/PurchasesErrorKt;->map$default(Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Map;ILjava/lang/Object;)Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;

    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, Lcom/revenuecat/purchases/hybridcommon/OnResult;->onError(Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;)V

    return-void

    .line 10
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$addOnPackages:Ljava/util/List;

    .line 11
    invoke-static {v0, p1}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$createAddOnPackages(Ljava/util/List;Lcom/revenuecat/purchases/Offerings;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 12
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    move-object p1, v1

    :cond_3
    if-eqz p1, :cond_4

    .line 13
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 14
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->addOnPackages(Ljava/util/List;)Lcom/revenuecat/purchases/PurchaseParams$Builder;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    :cond_4
    sget-object p1, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/Purchases$Companion;->getSharedInstance()Lcom/revenuecat/purchases/Purchases;

    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->build()Lcom/revenuecat/purchases/PurchaseParams;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    invoke-static {v1}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$getPurchaseErrorFunction(Lcom/revenuecat/purchases/hybridcommon/OnResult;)Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    invoke-static {v2}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$getPurchaseCompletedFunction(Lcom/revenuecat/purchases/hybridcommon/OnResult;)Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 19
    invoke-static {p1, v0, v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->purchaseWith(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-void

    .line 20
    :goto_2
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1$10;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 21
    new-instance v3, Lcom/revenuecat/purchases/PurchasesError;

    .line 22
    sget-object v4, Lcom/revenuecat/purchases/PurchasesErrorCode;->PurchaseInvalidError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 24
    invoke-direct {v3, v4, p1}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 25
    invoke-static {v3, v1, v2, v1}, Lcom/revenuecat/purchases/hybridcommon/mappers/PurchasesErrorKt;->map$default(Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Map;ILjava/lang/Object;)Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;

    move-result-object p1

    .line 26
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/hybridcommon/OnResult;->onError(Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;)V

    return-void
.end method
