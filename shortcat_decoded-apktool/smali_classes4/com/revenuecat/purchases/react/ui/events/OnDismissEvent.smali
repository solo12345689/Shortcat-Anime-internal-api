.class public final Lcom/revenuecat/purchases/react/ui/events/OnDismissEvent;
.super Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/revenuecat/purchases/react/ui/events/PaywallEvent<",
        "Lcom/revenuecat/purchases/react/ui/events/OnDismissEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016J\"\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\r0\n0\nH\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/events/OnDismissEvent;",
        "Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;",
        "surfaceId",
        "",
        "viewTag",
        "<init>",
        "(II)V",
        "getPaywallEventName",
        "Lcom/revenuecat/purchases/react/ui/PaywallEventName;",
        "getPayload",
        "",
        "Lcom/revenuecat/purchases/react/ui/PaywallEventKey;",
        "",
        "",
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


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;-><init>(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getPayload()Ljava/util/Map;
    .locals 1
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
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getPaywallEventName()Lcom/revenuecat/purchases/react/ui/PaywallEventName;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_DISMISS:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 2
    .line 3
    return-object v0
.end method
