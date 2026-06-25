.class public final Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;",
        "",
        "()V",
        "findOfferById",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "subscriptionOptions",
        "",
        "offerId",
        "",
        "resolve",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;",
        "rcPackage",
        "Lcom/revenuecat/purchases/Package;",
        "offerConfig",
        "Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final findOfferById(Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/models/SubscriptionOption;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/models/SubscriptionOption;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/revenuecat/purchases/models/SubscriptionOption;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v2, v0

    .line 17
    check-cast v2, Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 18
    .line 19
    instance-of v3, v2, Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    check-cast v2, Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v2, v1

    .line 27
    :goto_0
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;->getOfferId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_2
    invoke-static {v1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    move-object v1, v0

    .line 40
    :cond_3
    check-cast v1, Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 41
    .line 42
    return-object v1
.end method


# virtual methods
.method public final resolve(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;
    .locals 5

    .line 1
    const-string v0, "rcPackage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lcom/revenuecat/purchases/models/StoreProduct;->getDefaultOption()Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$NoConfiguration;

    .line 17
    .line 18
    invoke-direct {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$NoConfiguration;-><init>(Lcom/revenuecat/purchases/models/SubscriptionOption;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Lcom/revenuecat/purchases/models/StoreProduct;->getSubscriptionOptions()Lcom/revenuecat/purchases/models/SubscriptionOptions;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;

    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;->getOfferId()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-direct {v2, v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PromoOfferResolver;->findOfferById(Ljava/util/List;Ljava/lang/String;)Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v2, 0x0

    .line 44
    :goto_0
    if-eqz v2, :cond_2

    .line 45
    .line 46
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$ConfiguredOffer;

    .line 47
    .line 48
    invoke-direct {p1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$ConfiguredOffer;-><init>(Lcom/revenuecat/purchases/models/SubscriptionOption;)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    if-nez v1, :cond_3

    .line 53
    .line 54
    const-string v1, "product has no subscription options"

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    const-string v1, "offer not found in available options"

    .line 58
    .line 59
    :goto_1
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 60
    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v4, "Configured offer \'"

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;->getOfferId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v4, "\' for package \'"

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/revenuecat/purchases/Package;->getIdentifier()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, "\': "

    .line 91
    .line 92
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p1, ". Falling back to default option."

    .line 99
    .line 100
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$OfferNotFound;

    .line 111
    .line 112
    invoke-virtual {p2}, Lcom/revenuecat/purchases/paywalls/components/common/PromoOfferConfig;->getOfferId()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-direct {p1, p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$OfferNotFound;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/models/SubscriptionOption;)V

    .line 117
    .line 118
    .line 119
    return-object p1
.end method
