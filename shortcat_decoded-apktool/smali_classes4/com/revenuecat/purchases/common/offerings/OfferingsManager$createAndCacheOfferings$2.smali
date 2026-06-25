.class final Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/common/offerings/OfferingsManager;->createAndCacheOfferings(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
        "Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;",
        "offeringsResultData",
        "LTd/L;",
        "invoke",
        "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V",
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
.field final synthetic $offeringsJSON:Lorg/json/JSONObject;

.field final synthetic $onSuccess:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/revenuecat/purchases/common/offerings/OfferingsManager;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/common/offerings/OfferingsManager;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;",
            "Lorg/json/JSONObject;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->this$0:Lcom/revenuecat/purchases/common/offerings/OfferingsManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->$offeringsJSON:Lorg/json/JSONObject;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->$onSuccess:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->invoke(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V
    .locals 3

    const-string v0, "offeringsResultData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;->getOfferings()Lcom/revenuecat/purchases/Offerings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/revenuecat/purchases/Offerings;->getCurrent()Lcom/revenuecat/purchases/Offering;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->this$0:Lcom/revenuecat/purchases/common/offerings/OfferingsManager;

    .line 3
    invoke-static {v1}, Lcom/revenuecat/purchases/common/offerings/OfferingsManager;->access$getOfferingImagePreDownloader$p(Lcom/revenuecat/purchases/common/offerings/OfferingsManager;)Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;->preDownloadOfferingImages(Lcom/revenuecat/purchases/Offering;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->this$0:Lcom/revenuecat/purchases/common/offerings/OfferingsManager;

    invoke-static {v0}, Lcom/revenuecat/purchases/common/offerings/OfferingsManager;->access$getOfferingFontPreDownloader$p(Lcom/revenuecat/purchases/common/offerings/OfferingsManager;)Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;

    move-result-object v0

    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;->getOfferings()Lcom/revenuecat/purchases/Offerings;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;->preDownloadOfferingFontsIfNeeded(Lcom/revenuecat/purchases/Offerings;)V

    .line 5
    iget-object v0, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->this$0:Lcom/revenuecat/purchases/common/offerings/OfferingsManager;

    invoke-static {v0}, Lcom/revenuecat/purchases/common/offerings/OfferingsManager;->access$getOfferingsCache$p(Lcom/revenuecat/purchases/common/offerings/OfferingsManager;)Lcom/revenuecat/purchases/common/offerings/OfferingsCache;

    move-result-object v0

    invoke-virtual {p1}, Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;->getOfferings()Lcom/revenuecat/purchases/Offerings;

    move-result-object v1

    iget-object v2, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->$offeringsJSON:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lcom/revenuecat/purchases/common/offerings/OfferingsCache;->cacheOfferings(Lcom/revenuecat/purchases/Offerings;Lorg/json/JSONObject;)V

    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->this$0:Lcom/revenuecat/purchases/common/offerings/OfferingsManager;

    new-instance v1, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2$2;

    iget-object v2, p0, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2;->$onSuccess:Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v2, p1}, Lcom/revenuecat/purchases/common/offerings/OfferingsManager$createAndCacheOfferings$2$2;-><init>(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V

    invoke-static {v0, v1}, Lcom/revenuecat/purchases/common/offerings/OfferingsManager;->access$dispatch(Lcom/revenuecat/purchases/common/offerings/OfferingsManager;Lie/a;)V

    return-void
.end method
