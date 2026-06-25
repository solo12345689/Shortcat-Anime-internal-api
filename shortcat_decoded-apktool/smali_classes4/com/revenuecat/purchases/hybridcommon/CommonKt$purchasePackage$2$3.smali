.class final Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->invoke(Lcom/revenuecat/purchases/Offerings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "addOnStoreProducts",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "addOnSubscriptionOptions",
        "LTd/L;",
        "invoke",
        "(Ljava/util/List;Ljava/util/List;)V",
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

.field final synthetic $offerings:Lcom/revenuecat/purchases/Offerings;

.field final synthetic $onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

.field final synthetic $purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/revenuecat/purchases/Offerings;Lcom/revenuecat/purchases/hybridcommon/OnResult;Lcom/revenuecat/purchases/PurchaseParams$Builder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/revenuecat/purchases/Offerings;",
            "Lcom/revenuecat/purchases/hybridcommon/OnResult;",
            "Lcom/revenuecat/purchases/PurchaseParams$Builder;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$addOnPackages:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$offerings:Lcom/revenuecat/purchases/Offerings;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->invoke(Ljava/util/List;Ljava/util/List;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/models/StoreProduct;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/models/SubscriptionOption;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move-object p1, v0

    :cond_1
    if-eqz p1, :cond_2

    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 4
    invoke-virtual {v1, p1}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->addOnStoreProducts(Ljava/util/List;)Lcom/revenuecat/purchases/PurchaseParams$Builder;

    :cond_2
    if-eqz p2, :cond_3

    .line 5
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    move-object p2, v0

    :cond_4
    if-eqz p2, :cond_5

    .line 6
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 7
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->addOnSubscriptionOptions(Ljava/util/List;)Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 8
    :cond_5
    :try_start_0
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$addOnPackages:Ljava/util/List;

    .line 9
    iget-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$offerings:Lcom/revenuecat/purchases/Offerings;

    .line 10
    invoke-static {p1, p2}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$createAddOnPackages(Ljava/util/List;Lcom/revenuecat/purchases/Offerings;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 11
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_6
    :goto_0
    move-object p1, v0

    :cond_7
    if-eqz p1, :cond_8

    .line 12
    iget-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 13
    invoke-virtual {p2, p1}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->addOnPackages(Ljava/util/List;)Lcom/revenuecat/purchases/PurchaseParams$Builder;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    :cond_8
    sget-object p1, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/Purchases$Companion;->getSharedInstance()Lcom/revenuecat/purchases/Purchases;

    move-result-object p1

    .line 15
    iget-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$purchaseParams:Lcom/revenuecat/purchases/PurchaseParams$Builder;

    invoke-virtual {p2}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->build()Lcom/revenuecat/purchases/PurchaseParams;

    move-result-object p2

    .line 16
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$getPurchaseErrorFunction(Lcom/revenuecat/purchases/hybridcommon/OnResult;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    invoke-static {v1}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$getPurchaseCompletedFunction(Lcom/revenuecat/purchases/hybridcommon/OnResult;)Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 18
    invoke-static {p1, p2, v0, v1}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->purchaseWith(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-void

    .line 19
    :goto_1
    iget-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 20
    new-instance v1, Lcom/revenuecat/purchases/PurchasesError;

    .line 21
    sget-object v2, Lcom/revenuecat/purchases/PurchasesErrorCode;->PurchaseInvalidError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-direct {v1, v2, p1}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 24
    invoke-static {v1, v0, p1, v0}, Lcom/revenuecat/purchases/hybridcommon/mappers/PurchasesErrorKt;->map$default(Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Map;ILjava/lang/Object;)Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;

    move-result-object p1

    .line 25
    invoke-interface {p2, p1}, Lcom/revenuecat/purchases/hybridcommon/OnResult;->onError(Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;)V

    return-void
.end method
