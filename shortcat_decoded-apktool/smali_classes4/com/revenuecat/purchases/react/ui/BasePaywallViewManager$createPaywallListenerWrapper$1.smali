.class public final Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;
.super Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->createPaywallListenerWrapper$react_native_purchases_ui_release(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J;\u0010\u000b\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\u000e\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u0008J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J%\u0010\u0012\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0008J%\u0010\u0013\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0008J-\u0010\u0015\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "com/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1",
        "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;",
        "",
        "",
        "",
        "rcPackage",
        "LTd/L;",
        "onPurchaseStarted",
        "(Ljava/util/Map;)V",
        "customerInfo",
        "storeTransaction",
        "onPurchaseCompleted",
        "(Ljava/util/Map;Ljava/util/Map;)V",
        "error",
        "onPurchaseError",
        "onPurchaseCancelled",
        "()V",
        "onRestoreStarted",
        "onRestoreCompleted",
        "onRestoreError",
        "requestId",
        "onPurchasePackageInitiated",
        "(Ljava/util/Map;Ljava/lang/String;)V",
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
.field final synthetic $themedReactContext:Lcom/facebook/react/uimanager/b0;

.field final synthetic $view:Landroid/view/View;

.field final synthetic this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/view/View;Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;Lcom/facebook/react/uimanager/b0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager<",
            "TT;>;",
            "Lcom/facebook/react/uimanager/b0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onPurchaseCancelled()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseCancelledEvent;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseCancelledEvent;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1, v2, v3, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onPurchaseCompleted(Ljava/util/Map;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "customerInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "storeTransaction"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseCompletedEvent;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-direct {v0, v1, v2, p1, p2}, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseCompletedEvent;-><init>(IILjava/util/Map;Ljava/util/Map;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 29
    .line 30
    iget-object p2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1, p2, v1, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onPurchaseError(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseErrorEvent;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v1, v2, p1}, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseErrorEvent;-><init>(IILjava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p1, v1, v2, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onPurchasePackageInitiated(Ljava/util/Map;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    const-string v0, "rcPackage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requestId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-direct {v0, v1, v2, p1, p2}, Lcom/revenuecat/purchases/react/ui/events/OnPurchasePackageInitiatedEvent;-><init>(IILjava/util/Map;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 29
    .line 30
    iget-object p2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1, p2, v1, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onPurchaseStarted(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "rcPackage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseStartedEvent;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v1, v2, p1}, Lcom/revenuecat/purchases/react/ui/events/OnPurchaseStartedEvent;-><init>(IILjava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p1, v1, v2, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onRestoreCompleted(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "customerInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/revenuecat/purchases/react/ui/events/OnRestoreCompletedEvent;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v1, v2, p1}, Lcom/revenuecat/purchases/react/ui/events/OnRestoreCompletedEvent;-><init>(IILjava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p1, v1, v2, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onRestoreError(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/revenuecat/purchases/react/ui/events/OnRestoreErrorEvent;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v1, v2, p1}, Lcom/revenuecat/purchases/react/ui/events/OnRestoreErrorEvent;-><init>(IILjava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p1, v1, v2, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public onRestoreStarted()V
    .locals 4

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/react/ui/events/OnRestoreStartedEvent;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/revenuecat/purchases/react/ui/ViewExtensionsKt;->getSurfaceId(Landroid/view/View;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/react/ui/events/OnRestoreStartedEvent;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->this$0:Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$themedReactContext:Lcom/facebook/react/uimanager/b0;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager$createPaywallListenerWrapper$1;->$view:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v1, v2, v3, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->emitEvent(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
