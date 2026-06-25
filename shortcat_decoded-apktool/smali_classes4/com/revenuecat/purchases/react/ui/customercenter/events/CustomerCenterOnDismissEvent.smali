.class public final Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterOnDismissEvent;
.super Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEvent;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEvent<",
        "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterOnDismissEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterOnDismissEvent;",
        "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEvent;",
        "surfaceId",
        "",
        "viewTag",
        "<init>",
        "(II)V",
        "getCustomerCenterEventName",
        "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;",
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
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEvent;-><init>(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCustomerCenterEventName()Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;->ON_DISMISS:Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;

    .line 2
    .line 3
    return-object v0
.end method
