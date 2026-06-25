.class public final Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;
.super Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/revenuecat/purchases/react/ui/events/PaywallEvent<",
        "Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u000c\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00060\u0006H\u0016J\u0008\u0010\u0010\u001a\u00020\u0011H\u0014R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;",
        "Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;",
        "surfaceId",
        "",
        "viewTag",
        "packageMap",
        "",
        "",
        "",
        "requestId",
        "<init>",
        "(IILjava/util/Map;Ljava/lang/String;)V",
        "getPaywallEventName",
        "Lcom/revenuecat/purchases/react/ui/PaywallEventName;",
        "getPayload",
        "Lcom/revenuecat/purchases/react/ui/PaywallEventKey;",
        "getEventData",
        "Lcom/facebook/react/bridge/WritableMap;",
        "react-native-purchases-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final packageMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final requestId:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/util/Map;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "packageMap"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requestId"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;-><init>(II)V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;->packageMap:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p4, p0, Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;->requestId:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->REQUEST_ID:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->getKey()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;->requestId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public getPayload()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/revenuecat/purchases/react/ui/PaywallEventKey;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventKey;->PACKAGE:Lcom/revenuecat/purchases/react/ui/PaywallEventKey;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;->packageMap:Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {v0, v1}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LUd/S;->f(Lkotlin/Pair;)Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public getPaywallEventName()Lcom/revenuecat/purchases/react/ui/PaywallEventName;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_PACKAGE_INITIATED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 2
    .line 3
    return-object v0
.end method
