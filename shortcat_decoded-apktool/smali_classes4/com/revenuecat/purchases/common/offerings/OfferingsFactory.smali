.class public final Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011JW\u0010\u001b\u001a\u00020\u00172\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2$\u0010\u0018\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00150\u0014\u0012\u0004\u0012\u00020\u00170\u00132\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0013H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJM\u0010#\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u00132\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00170\u0013\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\'R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;",
        "",
        "Lcom/revenuecat/purchases/common/BillingAbstract;",
        "billing",
        "Lcom/revenuecat/purchases/common/OfferingParser;",
        "offeringParser",
        "Lcom/revenuecat/purchases/common/Dispatcher;",
        "dispatcher",
        "Lcom/revenuecat/purchases/common/AppConfig;",
        "appConfig",
        "<init>",
        "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/OfferingParser;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/AppConfig;)V",
        "Lorg/json/JSONObject;",
        "offeringsJSON",
        "",
        "",
        "extractProductIdentifiers",
        "(Lorg/json/JSONObject;)Ljava/util/Set;",
        "productIds",
        "Lkotlin/Function1;",
        "",
        "",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "LTd/L;",
        "onCompleted",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "onError",
        "getStoreProductsById",
        "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;",
        "originalDataSource",
        "",
        "loadedFromDiskCache",
        "Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;",
        "onSuccess",
        "createOfferings",
        "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Lcom/revenuecat/purchases/common/BillingAbstract;",
        "Lcom/revenuecat/purchases/common/OfferingParser;",
        "Lcom/revenuecat/purchases/common/Dispatcher;",
        "Lcom/revenuecat/purchases/common/AppConfig;",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final appConfig:Lcom/revenuecat/purchases/common/AppConfig;

.field private final billing:Lcom/revenuecat/purchases/common/BillingAbstract;

.field private final dispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

.field private final offeringParser:Lcom/revenuecat/purchases/common/OfferingParser;


# direct methods
.method public constructor <init>(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/OfferingParser;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/AppConfig;)V
    .locals 1

    .line 1
    const-string v0, "billing"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "offeringParser"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "dispatcher"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "appConfig"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->billing:Lcom/revenuecat/purchases/common/BillingAbstract;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->offeringParser:Lcom/revenuecat/purchases/common/OfferingParser;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->dispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 31
    .line 32
    return-void
.end method

.method public static final synthetic access$getBilling$p(Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;)Lcom/revenuecat/purchases/common/BillingAbstract;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->billing:Lcom/revenuecat/purchases/common/BillingAbstract;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getDispatcher$p(Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;)Lcom/revenuecat/purchases/common/Dispatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->dispatcher:Lcom/revenuecat/purchases/common/Dispatcher;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getOfferingParser$p(Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;)Lcom/revenuecat/purchases/common/OfferingParser;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->offeringParser:Lcom/revenuecat/purchases/common/OfferingParser;

    .line 2
    .line 3
    return-object p0
.end method

.method private final extractProductIdentifiers(Lorg/json/JSONObject;)Ljava/util/Set;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "offerings"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v1, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-string v5, "packages"

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    move v6, v2

    .line 35
    :goto_1
    if-ge v6, v5, :cond_2

    .line 36
    .line 37
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const-string v8, "platform_product_identifier"

    .line 42
    .line 43
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    const-string v8, "it"

    .line 48
    .line 49
    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v7}, LDf/r;->l0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-nez v8, :cond_0

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_0
    const/4 v7, 0x0

    .line 60
    :goto_2
    if-eqz v7, :cond_1

    .line 61
    .line 62
    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-object v0
.end method

.method private final getStoreProductsById(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->billing:Lcom/revenuecat/purchases/common/BillingAbstract;

    .line 2
    .line 3
    sget-object v1, Lcom/revenuecat/purchases/ProductType;->SUBS:Lcom/revenuecat/purchases/ProductType;

    .line 4
    .line 5
    new-instance v2, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$getStoreProductsById$1;

    .line 6
    .line 7
    invoke-direct {v2, p0, p1, p2, p3}, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$getStoreProductsById$1;-><init>(Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    new-instance p2, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$getStoreProductsById$2;

    .line 11
    .line 12
    invoke-direct {p2, p3}, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$getStoreProductsById$2;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, p1, v2, p2}, Lcom/revenuecat/purchases/common/BillingAbstract;->queryProductDetailsAsync(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final createOfferings(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "offeringsJSON"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "originalDataSource"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onSuccess"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->extractProductIdentifiers(Lorg/json/JSONObject;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    :try_start_1
    new-instance p1, Lcom/revenuecat/purchases/PurchasesError;

    .line 32
    .line 33
    sget-object p2, Lcom/revenuecat/purchases/PurchasesErrorCode;->ConfigurationError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 34
    .line 35
    sget-object p3, Lcom/revenuecat/purchases/strings/OfferingStrings;->INSTANCE:Lcom/revenuecat/purchases/strings/OfferingStrings;

    .line 36
    .line 37
    iget-object p5, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 38
    .line 39
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/AppConfig;->getApiKeyValidationResult()Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;

    .line 40
    .line 41
    .line 42
    move-result-object p5

    .line 43
    iget-object v0, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->appConfig:Lcom/revenuecat/purchases/common/AppConfig;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/revenuecat/purchases/common/AppConfig;->getStore()Lcom/revenuecat/purchases/Store;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p3, p5, v0}, Lcom/revenuecat/purchases/strings/OfferingStrings;->getConfigurationErrorNoProductsForOfferings(Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;Lcom/revenuecat/purchases/Store;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-direct {p1, p2, p3}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object p1, v0

    .line 62
    move-object v3, p0

    .line 63
    move-object v7, p4

    .line 64
    goto :goto_1

    .line 65
    :cond_0
    :try_start_2
    new-instance v1, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$createOfferings$1;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 66
    .line 67
    move-object v3, p0

    .line 68
    move-object v4, p1

    .line 69
    move-object v5, p2

    .line 70
    move v6, p3

    .line 71
    move-object v7, p4

    .line 72
    move-object v8, p5

    .line 73
    :try_start_3
    invoke-direct/range {v1 .. v8}, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$createOfferings$1;-><init>(Ljava/util/Set;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$createOfferings$2;

    .line 77
    .line 78
    invoke-direct {p1, v7}, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$createOfferings$2;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v2, v1, p1}, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;->getStoreProductsById(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catch_1
    move-exception v0

    .line 86
    :goto_0
    move-object p1, v0

    .line 87
    goto :goto_1

    .line 88
    :catch_2
    move-exception v0

    .line 89
    move-object v3, p0

    .line 90
    move-object v7, p4

    .line 91
    goto :goto_0

    .line 92
    :goto_1
    sget-object p2, Lcom/revenuecat/purchases/common/LogIntent;->RC_ERROR:Lcom/revenuecat/purchases/common/LogIntent;

    .line 93
    .line 94
    new-instance p3, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$createOfferings$$inlined$log$1;

    .line 95
    .line 96
    invoke-direct {p3, p2, p1}, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$createOfferings$$inlined$log$1;-><init>(Lcom/revenuecat/purchases/common/LogIntent;Lorg/json/JSONException;)V

    .line 97
    .line 98
    .line 99
    sget-object p4, Lcom/revenuecat/purchases/common/LogWrapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    aget p2, p4, p2

    .line 106
    .line 107
    const-string p4, "[Purchases] - ERROR"

    .line 108
    .line 109
    const/4 p5, 0x0

    .line 110
    const-string v0, "[Purchases] - "

    .line 111
    .line 112
    packed-switch p2, :pswitch_data_0

    .line 113
    .line 114
    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :pswitch_0
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    check-cast p3, Ljava/lang/String;

    .line 126
    .line 127
    invoke-interface {p2, p4, p3, p5}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_3

    .line 131
    .line 132
    :pswitch_1
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 133
    .line 134
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 135
    .line 136
    .line 137
    move-result-object p4

    .line 138
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 139
    .line 140
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 141
    .line 142
    .line 143
    move-result-object p5

    .line 144
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 145
    .line 146
    .line 147
    move-result p5

    .line 148
    if-gtz p5, :cond_1

    .line 149
    .line 150
    new-instance p5, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    check-cast p3, Ljava/lang/String;

    .line 174
    .line 175
    invoke-interface {p4, p2, p3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_3

    .line 179
    .line 180
    :pswitch_2
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    check-cast p3, Ljava/lang/String;

    .line 189
    .line 190
    invoke-interface {p2, p4, p3, p5}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :pswitch_3
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 196
    .line 197
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 198
    .line 199
    .line 200
    move-result-object p4

    .line 201
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 202
    .line 203
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 204
    .line 205
    .line 206
    move-result-object p5

    .line 207
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 208
    .line 209
    .line 210
    move-result p5

    .line 211
    if-gtz p5, :cond_1

    .line 212
    .line 213
    new-instance p5, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p3

    .line 236
    check-cast p3, Ljava/lang/String;

    .line 237
    .line 238
    invoke-interface {p4, p2, p3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_3

    .line 242
    .line 243
    :pswitch_4
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 244
    .line 245
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 246
    .line 247
    .line 248
    move-result-object p4

    .line 249
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 250
    .line 251
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 252
    .line 253
    .line 254
    move-result-object p5

    .line 255
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 256
    .line 257
    .line 258
    move-result p5

    .line 259
    if-gtz p5, :cond_1

    .line 260
    .line 261
    new-instance p5, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p3

    .line 284
    check-cast p3, Ljava/lang/String;

    .line 285
    .line 286
    invoke-interface {p4, p2, p3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    goto/16 :goto_3

    .line 290
    .line 291
    :pswitch_5
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 292
    .line 293
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 294
    .line 295
    .line 296
    move-result-object p4

    .line 297
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 298
    .line 299
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 300
    .line 301
    .line 302
    move-result-object p5

    .line 303
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 304
    .line 305
    .line 306
    move-result p5

    .line 307
    if-gtz p5, :cond_1

    .line 308
    .line 309
    new-instance p5, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p2

    .line 328
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p3

    .line 332
    check-cast p3, Ljava/lang/String;

    .line 333
    .line 334
    :goto_2
    invoke-interface {p4, p2, p3}, Lcom/revenuecat/purchases/LogHandler;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_3

    .line 338
    .line 339
    :pswitch_6
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 340
    .line 341
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 342
    .line 343
    .line 344
    move-result-object p4

    .line 345
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 346
    .line 347
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 348
    .line 349
    .line 350
    move-result-object p5

    .line 351
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 352
    .line 353
    .line 354
    move-result p5

    .line 355
    if-gtz p5, :cond_1

    .line 356
    .line 357
    new-instance p5, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p2

    .line 369
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p2

    .line 376
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p3

    .line 380
    check-cast p3, Ljava/lang/String;

    .line 381
    .line 382
    goto :goto_2

    .line 383
    :pswitch_7
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 384
    .line 385
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 386
    .line 387
    .line 388
    move-result-object p4

    .line 389
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 390
    .line 391
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 392
    .line 393
    .line 394
    move-result-object p5

    .line 395
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 396
    .line 397
    .line 398
    move-result p5

    .line 399
    if-gtz p5, :cond_1

    .line 400
    .line 401
    new-instance p5, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p2

    .line 420
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p3

    .line 424
    check-cast p3, Ljava/lang/String;

    .line 425
    .line 426
    invoke-interface {p4, p2, p3}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    goto/16 :goto_3

    .line 430
    .line 431
    :pswitch_8
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 432
    .line 433
    .line 434
    move-result-object p2

    .line 435
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object p3

    .line 439
    check-cast p3, Ljava/lang/String;

    .line 440
    .line 441
    invoke-interface {p2, p4, p3, p5}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 442
    .line 443
    .line 444
    goto/16 :goto_3

    .line 445
    .line 446
    :pswitch_9
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 447
    .line 448
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 449
    .line 450
    .line 451
    move-result-object p4

    .line 452
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 453
    .line 454
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 455
    .line 456
    .line 457
    move-result-object p5

    .line 458
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 459
    .line 460
    .line 461
    move-result p5

    .line 462
    if-gtz p5, :cond_1

    .line 463
    .line 464
    new-instance p5, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 467
    .line 468
    .line 469
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object p2

    .line 476
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p2

    .line 483
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object p3

    .line 487
    check-cast p3, Ljava/lang/String;

    .line 488
    .line 489
    goto/16 :goto_2

    .line 490
    .line 491
    :pswitch_a
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->INFO:Lcom/revenuecat/purchases/LogLevel;

    .line 492
    .line 493
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 494
    .line 495
    .line 496
    move-result-object p4

    .line 497
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 498
    .line 499
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 500
    .line 501
    .line 502
    move-result-object p5

    .line 503
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 504
    .line 505
    .line 506
    move-result p5

    .line 507
    if-gtz p5, :cond_1

    .line 508
    .line 509
    new-instance p5, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 512
    .line 513
    .line 514
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object p2

    .line 521
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object p2

    .line 528
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object p3

    .line 532
    check-cast p3, Ljava/lang/String;

    .line 533
    .line 534
    invoke-interface {p4, p2, p3}, Lcom/revenuecat/purchases/LogHandler;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    goto :goto_3

    .line 538
    :pswitch_b
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->WARN:Lcom/revenuecat/purchases/LogLevel;

    .line 539
    .line 540
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 541
    .line 542
    .line 543
    move-result-object p4

    .line 544
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 545
    .line 546
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 547
    .line 548
    .line 549
    move-result-object p5

    .line 550
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 551
    .line 552
    .line 553
    move-result p5

    .line 554
    if-gtz p5, :cond_1

    .line 555
    .line 556
    new-instance p5, Ljava/lang/StringBuilder;

    .line 557
    .line 558
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 559
    .line 560
    .line 561
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object p2

    .line 568
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object p2

    .line 575
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object p3

    .line 579
    check-cast p3, Ljava/lang/String;

    .line 580
    .line 581
    invoke-interface {p4, p2, p3}, Lcom/revenuecat/purchases/LogHandler;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    goto :goto_3

    .line 585
    :pswitch_c
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 586
    .line 587
    .line 588
    move-result-object p2

    .line 589
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object p3

    .line 593
    check-cast p3, Ljava/lang/String;

    .line 594
    .line 595
    invoke-interface {p2, p4, p3, p5}, Lcom/revenuecat/purchases/LogHandler;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 596
    .line 597
    .line 598
    goto :goto_3

    .line 599
    :pswitch_d
    sget-object p2, Lcom/revenuecat/purchases/LogLevel;->DEBUG:Lcom/revenuecat/purchases/LogLevel;

    .line 600
    .line 601
    invoke-static {}, Lcom/revenuecat/purchases/common/LogWrapperKt;->getCurrentLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 602
    .line 603
    .line 604
    move-result-object p4

    .line 605
    sget-object p5, Lcom/revenuecat/purchases/common/Config;->INSTANCE:Lcom/revenuecat/purchases/common/Config;

    .line 606
    .line 607
    invoke-virtual {p5}, Lcom/revenuecat/purchases/common/Config;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 608
    .line 609
    .line 610
    move-result-object p5

    .line 611
    invoke-virtual {p5, p2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 612
    .line 613
    .line 614
    move-result p5

    .line 615
    if-gtz p5, :cond_1

    .line 616
    .line 617
    new-instance p5, Ljava/lang/StringBuilder;

    .line 618
    .line 619
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 620
    .line 621
    .line 622
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object p2

    .line 629
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object p2

    .line 636
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object p3

    .line 640
    check-cast p3, Ljava/lang/String;

    .line 641
    .line 642
    goto/16 :goto_2

    .line 643
    .line 644
    :cond_1
    :goto_3
    new-instance p2, Lcom/revenuecat/purchases/PurchasesError;

    .line 645
    .line 646
    sget-object p3, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnexpectedBackendResponseError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 647
    .line 648
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object p1

    .line 652
    invoke-direct {p2, p3, p1}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    invoke-interface {v7, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    return-void

    .line 659
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
