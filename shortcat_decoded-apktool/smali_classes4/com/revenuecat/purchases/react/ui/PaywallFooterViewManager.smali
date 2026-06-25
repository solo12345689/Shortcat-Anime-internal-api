.class public final Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;
.super Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager<",
        "Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ+\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u00022\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0010!\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;",
        "Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;",
        "Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;",
        "<init>",
        "()V",
        "",
        "getName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/uimanager/b0;",
        "themedReactContext",
        "createViewInstance",
        "(Lcom/facebook/react/uimanager/b0;)Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;",
        "view",
        "offeringId",
        "Lcom/revenuecat/purchases/PresentedOfferingContext;",
        "presentedOfferingContext",
        "LTd/L;",
        "setOfferingId",
        "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V",
        "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;",
        "customFontProvider",
        "setFontFamily",
        "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V",
        "",
        "display",
        "setDisplayDismissButton",
        "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Z)V",
        "",
        "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
        "customVariables",
        "setCustomVariables",
        "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Ljava/util/Map;)V",
        "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;",
        "bridge",
        "setPurchaseLogic",
        "(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V",
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
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;
    .locals 2

    const-string v0, "themedReactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;

    invoke-direct {v0, p1, p0}, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager$createViewInstance$1;-><init>(Lcom/facebook/react/uimanager/b0;Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;)V

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->createPaywallListenerWrapper$react_native_purchases_ui_release(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;->setPaywallListener(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;->getDismissHandler$react_native_purchases_ui_release(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)Lie/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;->setDismissHandler(Lie/a;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "RCPaywallFooterView"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic setCustomVariables(Landroid/view/View;Ljava/util/Map;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;->setCustomVariables(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Ljava/util/Map;)V

    return-void
.end method

.method public setCustomVariables(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "customVariables"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setDisplayDismissButton(Landroid/view/View;Z)V
    .locals 0

    .line 2
    check-cast p1, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;->setDisplayDismissButton(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Z)V

    return-void
.end method

.method public setDisplayDismissButton(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Z)V
    .locals 0

    .line 1
    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setFontFamily(Landroid/view/View;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;->setFontFamily(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V

    return-void
.end method

.method public setFontFamily(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customFontProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;->setFontProvider(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V

    return-void
.end method

.method public bridge synthetic setOfferingId(Landroid/view/View;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;->setOfferingId(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V

    return-void
.end method

.method public setOfferingId(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2, p3}, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;->setOfferingId(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V

    return-void
.end method

.method public bridge synthetic setPurchaseLogic(Landroid/view/View;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/react/ui/PaywallFooterViewManager;->setPurchaseLogic(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V

    return-void
.end method

.method public setPurchaseLogic(Lcom/revenuecat/purchases/react/ui/views/WrappedPaywallFooterComposeView;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V
    .locals 0

    .line 1
    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
