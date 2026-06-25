.class public final Lcom/revenuecat/purchases/google/SubscriptionOptionConversionsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\"\u0018\u0010\u000c\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/android/billingclient/api/h$e;",
        "",
        "productId",
        "Lcom/android/billingclient/api/h;",
        "productDetails",
        "Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;",
        "toSubscriptionOption",
        "(Lcom/android/billingclient/api/h$e;Ljava/lang/String;Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;",
        "getSubscriptionBillingPeriod",
        "(Lcom/android/billingclient/api/h$e;)Ljava/lang/String;",
        "subscriptionBillingPeriod",
        "",
        "isBasePlan",
        "(Lcom/android/billingclient/api/h$e;)Z",
        "Lcom/android/billingclient/api/h$a;",
        "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;",
        "getInstallmentsInfo",
        "(Lcom/android/billingclient/api/h$a;)Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;",
        "installmentsInfo",
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
.method private static final getInstallmentsInfo(Lcom/android/billingclient/api/h$a;)Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$a;->b()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-direct {v0, v1, p0}, Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;-><init>(II)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final getSubscriptionBillingPeriod(Lcom/android/billingclient/api/h$e;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$e;->f()Lcom/android/billingclient/api/h$d;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$d;->a()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "this.pricingPhases.pricingPhaseList"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/android/billingclient/api/h$c;

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$c;->b()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static final isBasePlan(Lcom/android/billingclient/api/h$e;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$e;->f()Lcom/android/billingclient/api/h$d;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$d;->a()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/4 v0, 0x1

    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static final toSubscriptionOption(Lcom/android/billingclient/api/h$e;Ljava/lang/String;Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;
    .locals 12

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "productId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "productDetails"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$e;->f()Lcom/android/billingclient/api/h$d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/android/billingclient/api/h$d;->a()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "pricingPhases.pricingPhaseList"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v6, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v1, 0xa

    .line 32
    .line 33
    invoke-static {v0, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lcom/android/billingclient/api/h$c;

    .line 55
    .line 56
    const-string v2, "it"

    .line 57
    .line 58
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lcom/revenuecat/purchases/google/PricingPhaseConversionsKt;->toRevenueCatPricingPhase(Lcom/android/billingclient/api/h$c;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v6, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    new-instance v2, Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$e;->a()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v0, "basePlanId"

    .line 76
    .line 77
    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$e;->c()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$e;->d()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    const-string v0, "offerTags"

    .line 89
    .line 90
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$e;->e()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    const-string v0, "offerToken"

    .line 98
    .line 99
    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/android/billingclient/api/h$e;->b()Lcom/android/billingclient/api/h$a;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-eqz p0, :cond_1

    .line 107
    .line 108
    invoke-static {p0}, Lcom/revenuecat/purchases/google/SubscriptionOptionConversionsKt;->getInstallmentsInfo(Lcom/android/billingclient/api/h$a;)Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    :goto_1
    move-object v11, p0

    .line 113
    goto :goto_2

    .line 114
    :cond_1
    const/4 p0, 0x0

    .line 115
    goto :goto_1

    .line 116
    :goto_2
    const/4 v10, 0x0

    .line 117
    move-object v3, p1

    .line 118
    move-object v8, p2

    .line 119
    invoke-direct/range {v2 .. v11}, Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/android/billingclient/api/h;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;)V

    .line 120
    .line 121
    .line 122
    return-object v2
.end method
