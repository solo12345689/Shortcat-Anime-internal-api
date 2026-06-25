.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/utils/PreviewDataCreatorsKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000\u00a2\u0006\u0002\u0010\u000b\u001aJ\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "previewPricingPhase",
        "Lcom/revenuecat/purchases/models/PricingPhase;",
        "billingPeriod",
        "Lcom/revenuecat/purchases/models/Period;",
        "priceCurrencyCodeValue",
        "",
        "price",
        "",
        "recurrenceMode",
        "",
        "billingCycleCount",
        "(Lcom/revenuecat/purchases/models/Period;Ljava/lang/String;DILjava/lang/Integer;)Lcom/revenuecat/purchases/models/PricingPhase;",
        "previewSubscriptionOption",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "id",
        "productId",
        "duration",
        "pricingPhases",
        "",
        "presentedOfferingContext",
        "Lcom/revenuecat/purchases/PresentedOfferingContext;",
        "installmentsInfo",
        "Lcom/revenuecat/purchases/models/InstallmentsInfo;",
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
.method public static final synthetic previewPricingPhase(Lcom/revenuecat/purchases/models/Period;Ljava/lang/String;DILjava/lang/Integer;)Lcom/revenuecat/purchases/models/PricingPhase;
    .locals 5

    .line 1
    const-string v0, "billingPeriod"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "priceCurrencyCodeValue"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/models/PricingPhase;

    .line 12
    .line 13
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-static {p4}, Lcom/revenuecat/purchases/models/RecurrenceModeKt;->toRecurrenceMode(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/RecurrenceMode;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    new-instance v1, Lcom/revenuecat/purchases/models/Price;

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmpg-double v2, p2, v2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    const-string v2, "Free"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const/16 v3, 0x24

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    const v3, 0xf4240

    .line 50
    .line 51
    .line 52
    int-to-double v3, v3

    .line 53
    mul-double/2addr p2, v3

    .line 54
    double-to-long p2, p2

    .line 55
    invoke-direct {v1, v2, p2, p3, p1}, Lcom/revenuecat/purchases/models/Price;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, p0, p4, p5, v1}, Lcom/revenuecat/purchases/models/PricingPhase;-><init>(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public static synthetic previewPricingPhase$default(Lcom/revenuecat/purchases/models/Period;Ljava/lang/String;DILjava/lang/Integer;ILjava/lang/Object;)Lcom/revenuecat/purchases/models/PricingPhase;
    .locals 2

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    new-instance p0, Lcom/revenuecat/purchases/models/Period;

    .line 7
    .line 8
    sget-object p7, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 9
    .line 10
    const-string v1, "P1M"

    .line 11
    .line 12
    invoke-direct {p0, v0, p7, v1}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 16
    .line 17
    if-eqz p7, :cond_1

    .line 18
    .line 19
    const-string p1, "USD"

    .line 20
    .line 21
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 22
    .line 23
    if-eqz p7, :cond_2

    .line 24
    .line 25
    const-wide p2, 0x4013f5c28f5c28f6L    # 4.99

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 31
    .line 32
    if-eqz p7, :cond_3

    .line 33
    .line 34
    move p4, v0

    .line 35
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 36
    .line 37
    if-eqz p6, :cond_4

    .line 38
    .line 39
    const/4 p5, 0x0

    .line 40
    :cond_4
    move-object p6, p5

    .line 41
    move p5, p4

    .line 42
    move-wide p3, p2

    .line 43
    move-object p2, p1

    .line 44
    move-object p1, p0

    .line 45
    invoke-static/range {p1 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/PreviewDataCreatorsKt;->previewPricingPhase(Lcom/revenuecat/purchases/models/Period;Ljava/lang/String;DILjava/lang/Integer;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static final synthetic previewSubscriptionOption(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/InstallmentsInfo;)Lcom/revenuecat/purchases/models/SubscriptionOption;
    .locals 6

    .line 1
    const-string v0, "id"

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
    const-string v0, "duration"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p2, "pricingPhases"

    .line 17
    .line 18
    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/utils/PreviewDataCreatorsKt$previewSubscriptionOption$1;

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    move-object v4, p1

    .line 25
    move-object v2, p3

    .line 26
    move-object v3, p4

    .line 27
    move-object v5, p5

    .line 28
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/PreviewDataCreatorsKt$previewSubscriptionOption$1;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/InstallmentsInfo;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public static synthetic previewSubscriptionOption$default(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/InstallmentsInfo;ILjava/lang/Object;)Lcom/revenuecat/purchases/models/SubscriptionOption;
    .locals 11

    .line 1
    and-int/lit8 v0, p6, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p2, Lcom/revenuecat/purchases/models/Period;

    .line 6
    .line 7
    sget-object v0, Lcom/revenuecat/purchases/models/Period$Unit;->MONTH:Lcom/revenuecat/purchases/models/Period$Unit;

    .line 8
    .line 9
    const-string v1, "P1M"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {p2, v2, v0, v1}, Lcom/revenuecat/purchases/models/Period;-><init>(ILcom/revenuecat/purchases/models/Period$Unit;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    move-object v3, p2

    .line 16
    and-int/lit8 p2, p6, 0x8

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    const/16 v9, 0x1e

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const-wide/16 v5, 0x0

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    invoke-static/range {v3 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/PreviewDataCreatorsKt;->previewPricingPhase$default(Lcom/revenuecat/purchases/models/Period;Ljava/lang/String;DILjava/lang/Integer;ILjava/lang/Object;)Lcom/revenuecat/purchases/models/PricingPhase;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-static {p2}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    :cond_1
    move-object v6, p3

    .line 37
    and-int/lit8 p2, p6, 0x10

    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    move-object v7, p3

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move-object v7, p4

    .line 45
    :goto_0
    and-int/lit8 p2, p6, 0x20

    .line 46
    .line 47
    if-eqz p2, :cond_3

    .line 48
    .line 49
    move-object v8, p3

    .line 50
    :goto_1
    move-object v4, p1

    .line 51
    move-object v5, v3

    .line 52
    move-object v3, p0

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object/from16 v8, p5

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :goto_2
    invoke-static/range {v3 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/PreviewDataCreatorsKt;->previewSubscriptionOption(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/InstallmentsInfo;)Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method
