.class public final synthetic Lcom/revenuecat/purchases/common/offerings/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/Set;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/revenuecat/purchases/common/offerings/a;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/common/offerings/a;->b:Ljava/util/Set;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/revenuecat/purchases/common/offerings/a;->c:Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/revenuecat/purchases/common/offerings/a;->d:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/revenuecat/purchases/common/offerings/a;->e:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/common/offerings/a;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/common/offerings/a;->b:Ljava/util/Set;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/revenuecat/purchases/common/offerings/a;->c:Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/revenuecat/purchases/common/offerings/a;->d:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/revenuecat/purchases/common/offerings/a;->e:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Lcom/revenuecat/purchases/common/offerings/OfferingsFactory$getStoreProductsById$1;->a(Ljava/util/List;Ljava/util/Set;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
