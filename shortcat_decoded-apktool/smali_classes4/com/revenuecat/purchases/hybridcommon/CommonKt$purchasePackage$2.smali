.class final Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/hybridcommon/CommonKt;->purchasePackage(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/OnResult;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
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
.field final synthetic $activity:Landroid/app/Activity;

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

.field final synthetic $addOnStoreProducts:Ljava/util/List;
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

.field final synthetic $addOnSubscriptionOptions:Ljava/util/List;
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

.field final synthetic $googleIsPersonalizedPrice:Ljava/lang/Boolean;

.field final synthetic $googleOldProductId:Ljava/lang/String;

.field final synthetic $googleReplacementMode:Lcom/revenuecat/purchases/models/GoogleReplacementMode;

.field final synthetic $onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

.field final synthetic $packageIdentifier:Ljava/lang/String;

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


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
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
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Lcom/revenuecat/purchases/models/GoogleReplacementMode;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$presentedOfferingContext:Ljava/util/Map;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$activity:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$googleOldProductId:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$googleReplacementMode:Lcom/revenuecat/purchases/models/GoogleReplacementMode;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$googleIsPersonalizedPrice:Ljava/lang/Boolean;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnStoreProducts:Ljava/util/List;

    .line 14
    .line 15
    iput-object p8, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnSubscriptionOptions:Ljava/util/List;

    .line 16
    .line 17
    iput-object p9, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnPackages:Ljava/util/List;

    .line 18
    .line 19
    iput-object p10, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$packageIdentifier:Ljava/lang/String;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/Offerings;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->invoke(Lcom/revenuecat/purchases/Offerings;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lcom/revenuecat/purchases/Offerings;)V
    .locals 7

    const-string v0, "offerings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$presentedOfferingContext:Ljava/util/Map;

    invoke-static {v0}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->toPresentedOfferingContext(Ljava/util/Map;)Lcom/revenuecat/purchases/PresentedOfferingContext;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 4
    new-instance v0, Lcom/revenuecat/purchases/PurchasesError;

    .line 5
    sget-object v3, Lcom/revenuecat/purchases/PurchasesErrorCode;->PurchaseInvalidError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 6
    const-string v4, "There is no or invalid presented offering context data provided to make this purchase"

    .line 7
    invoke-direct {v0, v3, v4}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 8
    invoke-static {v0, v2, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/mappers/PurchasesErrorKt;->map$default(Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Map;ILjava/lang/Object;)Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;

    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, Lcom/revenuecat/purchases/hybridcommon/OnResult;->onError(Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;)V

    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PresentedOfferingContext;->getOfferingIdentifier()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/revenuecat/purchases/Offerings;->get(Ljava/lang/String;)Lcom/revenuecat/purchases/Offering;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/revenuecat/purchases/Offering;->getAvailablePackages()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v4, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$packageIdentifier:Ljava/lang/String;

    .line 11
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/revenuecat/purchases/Package;

    .line 12
    invoke-virtual {v6}, Lcom/revenuecat/purchases/Package;->getIdentifier()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4, v1}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_2
    move-object v5, v2

    .line 13
    :goto_0
    check-cast v5, Lcom/revenuecat/purchases/Package;

    goto :goto_1

    :cond_3
    move-object v5, v2

    :goto_1
    if-eqz v5, :cond_a

    .line 14
    new-instance v1, Lcom/revenuecat/purchases/PurchaseParams$Builder;

    iget-object v2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$activity:Landroid/app/Activity;

    invoke-direct {v1, v2, v5}, Lcom/revenuecat/purchases/PurchaseParams$Builder;-><init>(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;)V

    .line 15
    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->presentedOfferingContext(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 16
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$googleOldProductId:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {v0}, LDf/r;->l0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 17
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$googleOldProductId:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->oldProductId(Ljava/lang/String;)Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 18
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$googleReplacementMode:Lcom/revenuecat/purchases/models/GoogleReplacementMode;

    if-eqz v0, :cond_4

    .line 19
    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->googleReplacementMode(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 20
    :cond_4
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$googleIsPersonalizedPrice:Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->isPersonalizedPrice(Z)Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 22
    :cond_5
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnStoreProducts:Ljava/util/List;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 23
    :cond_6
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnSubscriptionOptions:Ljava/util/List;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 24
    :cond_7
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnPackages:Ljava/util/List;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_2

    .line 25
    :cond_8
    iget-object v0, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnStoreProducts:Ljava/util/List;

    .line 26
    iget-object v2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnSubscriptionOptions:Ljava/util/List;

    .line 27
    new-instance v3, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$2;

    iget-object v4, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    invoke-direct {v3, v4}, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$2;-><init>(Lcom/revenuecat/purchases/hybridcommon/OnResult;)V

    new-instance v4, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;

    iget-object v5, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$addOnPackages:Ljava/util/List;

    iget-object v6, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    invoke-direct {v4, v5, p1, v6, v1}, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2$3;-><init>(Ljava/util/List;Lcom/revenuecat/purchases/Offerings;Lcom/revenuecat/purchases/hybridcommon/OnResult;Lcom/revenuecat/purchases/PurchaseParams$Builder;)V

    invoke-static {v0, v2, v3, v4}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$fetchAddOnStoreProductsAndSubscriptionOptions(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    return-void

    .line 28
    :cond_9
    :goto_2
    sget-object p1, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/Purchases$Companion;->getSharedInstance()Lcom/revenuecat/purchases/Purchases;

    move-result-object p1

    .line 29
    invoke-virtual {v1}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->build()Lcom/revenuecat/purchases/PurchaseParams;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    invoke-static {v1}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$getPurchaseErrorFunction(Lcom/revenuecat/purchases/hybridcommon/OnResult;)Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 31
    iget-object v2, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    invoke-static {v2}, Lcom/revenuecat/purchases/hybridcommon/CommonKt;->access$getPurchaseCompletedFunction(Lcom/revenuecat/purchases/hybridcommon/OnResult;)Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 32
    invoke-static {p1, v0, v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->purchaseWith(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    return-void

    .line 33
    :cond_a
    iget-object p1, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$onResult:Lcom/revenuecat/purchases/hybridcommon/OnResult;

    .line 34
    new-instance v0, Lcom/revenuecat/purchases/PurchasesError;

    .line 35
    sget-object v3, Lcom/revenuecat/purchases/PurchasesErrorCode;->ProductNotAvailableForPurchaseError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 36
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Couldn\'t find product for package "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/revenuecat/purchases/hybridcommon/CommonKt$purchasePackage$2;->$packageIdentifier:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 37
    invoke-direct {v0, v3, v4}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 38
    invoke-static {v0, v2, v1, v2}, Lcom/revenuecat/purchases/hybridcommon/mappers/PurchasesErrorKt;->map$default(Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Map;ILjava/lang/Object;)Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;

    move-result-object v0

    .line 39
    invoke-interface {p1, v0}, Lcom/revenuecat/purchases/hybridcommon/OnResult;->onError(Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;)V

    return-void
.end method
