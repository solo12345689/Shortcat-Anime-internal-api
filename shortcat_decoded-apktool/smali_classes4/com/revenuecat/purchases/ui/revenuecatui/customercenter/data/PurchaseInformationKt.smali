.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a,\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001a\u0010\u000c\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001a\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a,\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0012*\u00020\u00032\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0012*\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u000c\u0010\u0017\u001a\u00020\u0001*\u00020\u0018H\u0002\u001a\u000c\u0010\u0019\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0012*\u00020\u00032\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0012*\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\u001b"
    }
    d2 = {
        "determineCancellationStatus",
        "",
        "entitlementInfo",
        "Lcom/revenuecat/purchases/EntitlementInfo;",
        "transaction",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;",
        "determineExpirationOrRenewal",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;",
        "dateFormatter",
        "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;",
        "locale",
        "Ljava/util/Locale;",
        "determineLifetimeStatus",
        "determinePrice",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;",
        "subscribedProduct",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "determineTitle",
        "",
        "localization",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "determineTrialStatus",
        "expirationDate",
        "isExpiringOrExpired",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;",
        "isPromotionalLifetime",
        "renewalDate",
        "revenuecatui_defaultsBc8Release"
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
.method public static final synthetic access$determineCancellationStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->determineCancellationStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$determineExpirationOrRenewal(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->determineExpirationOrRenewal(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$determineLifetimeStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->determineLifetimeStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$determinePrice(Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->determinePrice(Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$determineTitle(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->determineTitle(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$determineTrialStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->determineTrialStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final determineCancellationStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getUnsubscribeDetectedAt()Ljava/util/Date;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getWillRenew()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    move p0, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p0, v1

    .line 20
    :goto_0
    instance-of v2, p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_1
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getWillRenew()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    xor-int/2addr p1, v0

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move p1, v1

    .line 37
    :goto_2
    if-nez p0, :cond_4

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    return v1

    .line 43
    :cond_4
    :goto_3
    return v0
.end method

.method private static final determineExpirationOrRenewal(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-static {p0, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->renewalDate(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Renewal;

    .line 11
    .line 12
    invoke-direct {p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Renewal;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-static {p0, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->expirationDate(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Expiration;

    .line 25
    .line 26
    invoke-direct {v1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Expiration;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p0, v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object p0, v0

    .line 32
    :goto_0
    invoke-static {p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->renewalDate(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Renewal;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Renewal;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->expirationDate(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Expiration;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal$Expiration;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_1
    if-nez p0, :cond_4

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_4
    return-object p0
.end method

.method private static final determineLifetimeStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->isPromotionalLifetime(Lcom/revenuecat/purchases/EntitlementInfo;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ne v2, v1, :cond_0

    .line 10
    .line 11
    move v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v0

    .line 14
    :goto_0
    instance-of v3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getStore()Lcom/revenuecat/purchases/Store;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v3, Lcom/revenuecat/purchases/Store;->PROMOTIONAL:Lcom/revenuecat/purchases/Store;

    .line 23
    .line 24
    if-eq p1, v3, :cond_1

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    move p0, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move p0, v0

    .line 31
    :goto_1
    if-nez v2, :cond_3

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    return v0

    .line 37
    :cond_3
    :goto_2
    return v1
.end method

.method private static final determinePrice(Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getStore()Lcom/revenuecat/purchases/Store;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/Store;->PROMOTIONAL:Lcom/revenuecat/purchases/Store;

    .line 6
    .line 7
    if-eq v0, v1, :cond_5

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Price;->getAmountMicros()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    cmp-long v0, v3, v1

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/revenuecat/purchases/models/Price;->getAmountMicros()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    cmp-long v0, v3, v1

    .line 37
    .line 38
    if-lez v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Paid;

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Price;->getFormatted()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Paid;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_1
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Unknown;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Unknown;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    if-eqz p0, :cond_4

    .line 60
    .line 61
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/revenuecat/purchases/models/Price;->getAmountMicros()J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    cmp-long p1, v3, v1

    .line 70
    .line 71
    if-nez p1, :cond_3

    .line 72
    .line 73
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Free;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Free;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Paid;

    .line 77
    .line 78
    invoke-interface {p0}, Lcom/revenuecat/purchases/models/StoreProduct;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Lcom/revenuecat/purchases/models/Price;->getFormatted()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-direct {p1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Paid;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_4
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Unknown;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Unknown;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_5
    :goto_0
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Free;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails$Free;

    .line 94
    .line 95
    return-object p0
.end method

.method private static final determineTitle(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getStore()Lcom/revenuecat/purchases/Store;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/Store;->PROMOTIONAL:Lcom/revenuecat/purchases/Store;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getIdentifier()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    if-eqz p1, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Lcom/revenuecat/purchases/models/StoreProduct;->getTitle()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return-object p0

    .line 26
    :cond_2
    :goto_0
    instance-of p0, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 27
    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->TYPE_SUBSCRIPTION:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 31
    .line 32
    invoke-virtual {p3, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_3
    instance-of p0, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$NonSubscription;

    .line 38
    .line 39
    if-eqz p0, :cond_4

    .line 40
    .line 41
    sget-object p0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->TYPE_ONE_TIME_PURCHASE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 42
    .line 43
    invoke-virtual {p3, p0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_4
    new-instance p0, LTd/r;

    .line 49
    .line 50
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p0
.end method

.method private static final determineTrialStatus(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getPeriodType()Lcom/revenuecat/purchases/PeriodType;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p0, v0

    .line 10
    :goto_0
    sget-object v1, Lcom/revenuecat/purchases/PeriodType;->TRIAL:Lcom/revenuecat/purchases/PeriodType;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq p0, v1, :cond_3

    .line 14
    .line 15
    instance-of p0, p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 21
    .line 22
    :cond_1
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->isTrial()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-ne p0, v2, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_3
    :goto_1
    return v2
.end method

.method private static final expirationDate(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->isPromotionalLifetime(Lcom/revenuecat/purchases/EntitlementInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getWillRenew()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->isActive()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getExpirationDate()Ljava/util/Date;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 3
    invoke-interface {p1, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;->format(Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final expirationDate(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    .line 4
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getExpiresDate()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    const-string v0, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails.Subscription"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    invoke-static {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->isExpiringOrExpired(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getExpiresDate()Ljava/util/Date;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    invoke-interface {p1, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;->format(Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final isExpiringOrExpired(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getWillRenew()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->isActive()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method private static final isPromotionalLifetime(Lcom/revenuecat/purchases/EntitlementInfo;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getStore()Lcom/revenuecat/purchases/Store;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/Store;->PROMOTIONAL:Lcom/revenuecat/purchases/Store;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getProductIdentifier()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v0, 0x2

    .line 15
    const/4 v1, 0x0

    .line 16
    const-string v3, "_lifetime"

    .line 17
    .line 18
    invoke-static {p0, v3, v2, v0, v1}, LDf/r;->A(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_0
    return v2
.end method

.method private static final renewalDate(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getWillRenew()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformationKt;->isPromotionalLifetime(Lcom/revenuecat/purchases/EntitlementInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/revenuecat/purchases/EntitlementInfo;->getExpirationDate()Ljava/util/Date;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 3
    invoke-interface {p1, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;->format(Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final renewalDate(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 4
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getWillRenew()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getExpiresDate()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getExpiresDate()Ljava/util/Date;

    move-result-object p0

    invoke-interface {p1, p0, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;->format(Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
