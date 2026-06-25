.class public abstract Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEvent;
.super Lcom/facebook/react/uimanager/events/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/facebook/react/uimanager/events/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008 \u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEvent;",
        "T",
        "Lcom/facebook/react/uimanager/events/d;",
        "",
        "surfaceId",
        "viewTag",
        "<init>",
        "(II)V",
        "Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;",
        "getCustomerCenterEventName",
        "()Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;",
        "",
        "getEventName",
        "()Ljava/lang/String;",
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
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract getCustomerCenterEventName()Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEvent;->getCustomerCenterEventName()Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/revenuecat/purchases/react/ui/customercenter/events/CustomerCenterEventName;->getEventName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
