.class public final Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u001a\u001c\u0010\t\u001a\u00020\u0008*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\"\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\n\u001a4\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000c*\u00020\u00002\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a:\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u000c0\u0004*\u00020\u00002\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0003\u001a\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0004*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0003\u001a\u0014\u0010\u0018\u001a\u00020\r*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0018\u0010\u0003\u001a,\u0010\u001f\u001a\u00020\u001e*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u000cH\u0086@\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/revenuecat/purchases/Purchases;",
        "Lcom/revenuecat/purchases/Offerings;",
        "awaitOfferings",
        "(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;",
        "LTd/u;",
        "awaitOfferingsResult",
        "Lcom/revenuecat/purchases/PurchaseParams;",
        "purchaseParams",
        "Lcom/revenuecat/purchases/PurchaseResult;",
        "awaitPurchase",
        "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;LZd/e;)Ljava/lang/Object;",
        "awaitPurchaseResult",
        "",
        "",
        "productIds",
        "Lcom/revenuecat/purchases/ProductType;",
        "type",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "awaitGetProducts",
        "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LZd/e;)Ljava/lang/Object;",
        "awaitGetProductsResult",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "awaitRestore",
        "awaitRestoreResult",
        "awaitStorefrontCountryCode",
        "Lcom/revenuecat/purchases/Purchases$Companion;",
        "Landroid/content/Context;",
        "context",
        "Lcom/revenuecat/purchases/models/BillingFeature;",
        "features",
        "",
        "awaitCanMakePayments",
        "(Lcom/revenuecat/purchases/Purchases$Companion;Landroid/content/Context;Ljava/util/List;LZd/e;)Ljava/lang/Object;",
        "purchases_defaultsBc8Release"
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
.method public static final synthetic awaitCanMakePayments(Lcom/revenuecat/purchases/Purchases$Companion;Landroid/content/Context;Ljava/util/List;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LZd/k;

    .line 2
    .line 3
    invoke-static {p3}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitCanMakePayments$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitCanMakePayments$2$1;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, v1}, Lcom/revenuecat/purchases/Purchases$Companion;->canMakePayments(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-ne p0, p1, :cond_0

    .line 27
    .line 28
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object p0
.end method

.method public static synthetic awaitCanMakePayments$default(Lcom/revenuecat/purchases/Purchases$Companion;Landroid/content/Context;Ljava/util/List;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt;->awaitCanMakePayments(Lcom/revenuecat/purchases/Purchases$Companion;Landroid/content/Context;Ljava/util/List;LZd/e;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final synthetic awaitGetProducts(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LZd/k;

    .line 2
    .line 3
    invoke-static {p3}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProducts$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProducts$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProducts$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProducts$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, p1, p2, v2, v1}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->getProductsWith(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-ne p0, p1, :cond_0

    .line 32
    .line 33
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object p0
.end method

.method public static synthetic awaitGetProducts$default(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt;->awaitGetProducts(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LZd/e;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final synthetic awaitGetProductsResult(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->L$2:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lcom/revenuecat/purchases/ProductType;

    .line 41
    .line 42
    iget-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ljava/util/List;

    .line 45
    .line 46
    iget-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lcom/revenuecat/purchases/Purchases;

    .line 49
    .line 50
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object p1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object p2, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->L$2:Ljava/lang/Object;

    .line 70
    .line 71
    iput v3, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$1;->label:I

    .line 72
    .line 73
    new-instance p3, LZd/k;

    .line 74
    .line 75
    invoke-static {v0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-direct {p3, v2}, LZd/k;-><init>(LZd/e;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$1;

    .line 83
    .line 84
    invoke-direct {v2, p3}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$1;-><init>(LZd/e;)V

    .line 85
    .line 86
    .line 87
    new-instance v3, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2;

    .line 88
    .line 89
    invoke-direct {v3, p3}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2;-><init>(LZd/e;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p0, p1, p2, v2, v3}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->getProductsWith(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3}, LZd/k;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p3, p0, :cond_3

    .line 104
    .line 105
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    if-ne p3, v1, :cond_4

    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_4
    :goto_1
    check-cast p3, LTd/u;

    .line 112
    .line 113
    invoke-virtual {p3}, LTd/u;->j()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public static synthetic awaitGetProductsResult$default(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt;->awaitGetProductsResult(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;LZd/e;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final synthetic awaitOfferings(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LZd/k;

    .line 2
    .line 3
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferings$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferings$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferings$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferings$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->getOfferingsWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object p0
.end method

.method public static final synthetic awaitOfferingsResult(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lcom/revenuecat/purchases/Purchases;

    .line 41
    .line 42
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput v3, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$1;->label:I

    .line 60
    .line 61
    new-instance p1, LZd/k;

    .line 62
    .line 63
    invoke-static {v0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-direct {p1, v2}, LZd/k;-><init>(LZd/e;)V

    .line 68
    .line 69
    .line 70
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$1;

    .line 71
    .line 72
    invoke-direct {v2, p1}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$1;-><init>(LZd/e;)V

    .line 73
    .line 74
    .line 75
    new-instance v3, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$2;

    .line 76
    .line 77
    invoke-direct {v3, p1}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitOfferingsResult$2$2;-><init>(LZd/e;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v2, v3}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->getOfferingsWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, LZd/k;->a()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p1, p0, :cond_3

    .line 92
    .line 93
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    if-ne p1, v1, :cond_4

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_4
    :goto_1
    check-cast p1, LTd/u;

    .line 100
    .line 101
    invoke-virtual {p1}, LTd/u;->j()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method

.method public static final synthetic awaitPurchase(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LZd/k;

    .line 2
    .line 3
    invoke-static {p2}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchase$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchase$2$1;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchase$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchase$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->purchaseCompletedCallback(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0, p1, v1}, Lcom/revenuecat/purchases/Purchases;->purchase(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p0, p1, :cond_0

    .line 36
    .line 37
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-object p0
.end method

.method public static final synthetic awaitPurchaseResult(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lcom/revenuecat/purchases/PurchaseParams;

    .line 41
    .line 42
    iget-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lcom/revenuecat/purchases/Purchases;

    .line 45
    .line 46
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_2
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object p1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$1;->label:I

    .line 66
    .line 67
    new-instance p2, LZd/k;

    .line 68
    .line 69
    invoke-static {v0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-direct {p2, v2}, LZd/k;-><init>(LZd/e;)V

    .line 74
    .line 75
    .line 76
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1;

    .line 77
    .line 78
    invoke-direct {v2, p2}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$1;-><init>(LZd/e;)V

    .line 79
    .line 80
    .line 81
    new-instance v3, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2;

    .line 82
    .line 83
    invoke-direct {v3, p2}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2;-><init>(LZd/e;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v2, v3}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->purchaseCompletedCallback(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {p0, p1, v2}, Lcom/revenuecat/purchases/Purchases;->purchase(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, LZd/k;->a()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-ne p2, p0, :cond_3

    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    if-ne p2, v1, :cond_4

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_4
    :goto_1
    check-cast p2, LTd/u;

    .line 110
    .line 111
    invoke-virtual {p2}, LTd/u;->j()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method

.method public static final synthetic awaitRestore(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LZd/k;

    .line 2
    .line 3
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestore$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestore$2$1;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestore$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestore$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->restorePurchasesWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object p0
.end method

.method public static final synthetic awaitRestoreResult(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lcom/revenuecat/purchases/Purchases;

    .line 41
    .line 42
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object p0, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput v3, v0, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$1;->label:I

    .line 60
    .line 61
    new-instance p1, LZd/k;

    .line 62
    .line 63
    invoke-static {v0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-direct {p1, v2}, LZd/k;-><init>(LZd/e;)V

    .line 68
    .line 69
    .line 70
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$2$1;

    .line 71
    .line 72
    invoke-direct {v2, p1}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$2$1;-><init>(LZd/e;)V

    .line 73
    .line 74
    .line 75
    new-instance v3, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2;

    .line 76
    .line 77
    invoke-direct {v3, p1}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2;-><init>(LZd/e;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v2, v3}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->restorePurchasesWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, LZd/k;->a()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p1, p0, :cond_3

    .line 92
    .line 93
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    if-ne p1, v1, :cond_4

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_4
    :goto_1
    check-cast p1, LTd/u;

    .line 100
    .line 101
    invoke-virtual {p1}, LTd/u;->j()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method

.method public static final awaitStorefrontCountryCode(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/Purchases;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LZd/k;

    .line 2
    .line 3
    invoke-static {p1}, Lae/b;->c(LZd/e;)LZd/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LZd/k;-><init>(LZd/e;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->getStorefrontCountryCodeWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, LZd/k;->a()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-ne p0, v0, :cond_0

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object p0
.end method
