.class public abstract Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$ConfiguredOffer;,
        Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$NoConfiguration;,
        Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$OfferNotFound;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0003\n\u000b\u000cB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0003\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;",
        "",
        "()V",
        "isPromoOffer",
        "",
        "()Z",
        "subscriptionOption",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "getSubscriptionOption",
        "()Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "ConfiguredOffer",
        "NoConfiguration",
        "OfferNotFound",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$ConfiguredOffer;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$NoConfiguration;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$OfferNotFound;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;-><init>()V

    return-void
.end method


# virtual methods
.method public final getSubscriptionOption()Lcom/revenuecat/purchases/models/SubscriptionOption;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$ConfiguredOffer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$ConfiguredOffer;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$ConfiguredOffer;->getOption()Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :cond_0
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$NoConfiguration;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$NoConfiguration;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$NoConfiguration;->getOption()Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_1
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$OfferNotFound;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$OfferNotFound;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$OfferNotFound;->getFallbackOption()Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_2
    new-instance v0, LTd/r;

    .line 38
    .line 39
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final isPromoOffer()Z
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer$ConfiguredOffer;

    .line 2
    .line 3
    return v0
.end method
