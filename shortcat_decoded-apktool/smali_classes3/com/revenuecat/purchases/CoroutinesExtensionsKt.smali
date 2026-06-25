.class public final Lcom/revenuecat/purchases/CoroutinesExtensionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\u0008*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000c\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u000c\u001a(\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u000c\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0000H\u0087@\u00a2\u0006\u0004\u0008\u0017\u0010\u000c\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u000c\u001a\u0014\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0087@\u00a2\u0006\u0004\u0008\u001b\u0010\u000c\u001a$\u0010\u001f\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0087@\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/revenuecat/purchases/Purchases;",
        "Lcom/revenuecat/purchases/CacheFetchPolicy;",
        "fetchPolicy",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "awaitCustomerInfo",
        "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;",
        "",
        "appUserID",
        "Lcom/revenuecat/purchases/data/LogInResult;",
        "awaitLogIn",
        "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;LZd/e;)Ljava/lang/Object;",
        "awaitLogOut",
        "(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;",
        "awaitSyncPurchases",
        "Lcom/revenuecat/purchases/Offerings;",
        "awaitSyncAttributesAndOfferingsIfNeeded",
        "",
        "data",
        "awaitSetAppstackAttributionParams",
        "(Lcom/revenuecat/purchases/Purchases;Ljava/util/Map;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/AmazonLWAConsentStatus;",
        "getAmazonLWAConsentStatus",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;",
        "awaitCustomerCenterConfigData",
        "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;",
        "awaitGetVirtualCurrencies",
        "Ljava/util/Locale;",
        "awaitStorefrontLocale",
        "email",
        "description",
        "Lcom/revenuecat/purchases/CreateSupportTicketResult;",
        "awaitCreateSupportTicket",
        "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;",
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
.method public static final synthetic awaitCreateSupportTicket(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCreateSupportTicket$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCreateSupportTicket$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, p2, v1, v2}, Lcom/revenuecat/purchases/Purchases;->createSupportTicket(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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

.method public static final synthetic awaitCustomerCenterConfigData(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
    .locals 2

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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCustomerCenterConfigData$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCustomerCenterConfigData$2$1;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lcom/revenuecat/purchases/Purchases;->getCustomerCenterConfigData$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;)V

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
    move-result-object v0

    .line 26
    if-ne p0, v0, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object p0
.end method

.method public static final synthetic awaitCustomerInfo(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCustomerInfo$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCustomerInfo$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCustomerInfo$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitCustomerInfo$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, p1, v2, v1}, Lcom/revenuecat/purchases/ListenerConversionsKt;->getCustomerInfoWith(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object p0
.end method

.method public static synthetic awaitCustomerInfo$default(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/revenuecat/purchases/CacheFetchPolicy;->Companion:Lcom/revenuecat/purchases/CacheFetchPolicy$Companion;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/revenuecat/purchases/CacheFetchPolicy$Companion;->default()Lcom/revenuecat/purchases/CacheFetchPolicy;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt;->awaitCustomerInfo(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final synthetic awaitGetVirtualCurrencies(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$1;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitGetVirtualCurrencies$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsKt;->getVirtualCurrenciesWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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

.method public static final synthetic awaitLogIn(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitLogIn$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitLogIn$2$1;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitLogIn$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitLogIn$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, p1, v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsKt;->logInWith(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

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
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object p0
.end method

.method public static final synthetic awaitLogOut(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitLogOut$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitLogOut$2$1;-><init>(LZd/e;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitLogOut$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitLogOut$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsKt;->logOutWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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

.method public static final synthetic awaitSetAppstackAttributionParams(Lcom/revenuecat/purchases/Purchases;Ljava/util/Map;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSetAppstackAttributionParams$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsKt;->syncAttributesAndOfferingsListener(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0, p1, v1}, Lcom/revenuecat/purchases/Purchases;->setAppstackAttributionParams(Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V

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

.method public static final awaitStorefrontLocale(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitStorefrontLocale$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitStorefrontLocale$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitStorefrontLocale$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitStorefrontLocale$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lcom/revenuecat/purchases/ListenerConversionsKt;->getStorefrontLocaleWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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

.method public static final synthetic awaitSyncAttributesAndOfferingsIfNeeded(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lcom/revenuecat/purchases/ListenerConversionsKt;->syncAttributesAndOfferingsIfNeededWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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

.method public static final synthetic awaitSyncPurchases(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSyncPurchases$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSyncPurchases$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSyncPurchases$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$awaitSyncPurchases$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lcom/revenuecat/purchases/ListenerConversionsKt;->syncPurchasesWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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

.method public static final synthetic getAmazonLWAConsentStatus(Lcom/revenuecat/purchases/Purchases;LZd/e;)Ljava/lang/Object;
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
    new-instance v1, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$1;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$1;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$2;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$2;-><init>(LZd/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lcom/revenuecat/purchases/ListenerConversionsKt;->getAmazonLWAConsentStatusWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

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
