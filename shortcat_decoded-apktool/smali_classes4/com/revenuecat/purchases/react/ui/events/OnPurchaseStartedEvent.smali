.class public final Lcom/revenuecat/purchases/react/ui/events/OnPurchaseStartedEvent;
.super Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/revenuecat/purchases/react/ui/events/PaywallEvent<",
        "Lcom/revenuecat/purchases/react/ui/events/OnPurchaseStartedEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\"\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00060\u0006H\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/events/OnPurchaseStartedEvent;",
        "Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;",
        "surfaceId",
        "",
        "viewTag",
        "packageMap",
        "",
        "",
        "",
        "<init>",
        "(IILjava/util/Map;)V",
        "getPaywallEventName",
        "Lcom/revenuecat/purchases/react/ui/PaywallEventName;",
        "getPayload",
        "Lcom/revenuecat/purchases/react/ui/PaywallEventKey;",
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


# direct methods
.method public constructor <init>(IILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
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
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/events/PaywallEvent;-><init>(II)V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseStartedEvent;->packageMap:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
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
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseStartedEvent;->packageMap:Ljava/util/Map;

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
    sget-object v0, Lcom/revenuecat/purchases/react/ui/PaywallEventName;->ON_PURCHASE_STARTED:Lcom/revenuecat/purchases/react/ui/PaywallEventName;

    .line 2
    .line 3
    return-object v0
.end method
