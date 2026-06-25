.class public abstract Lcom/shopify/reactnative/skia/SkiaBaseViewManager;
.super Lcom/facebook/react/views/view/ReactViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/shopify/reactnative/skia/i;",
        ">",
        "Lcom/facebook/react/views/view/ReactViewManager;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/g;

    invoke-virtual {p0, p1}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;->onDropViewInstance(Lcom/facebook/react/views/view/g;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/facebook/react/views/view/g;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/ReactViewManager;->onDropViewInstance(Lcom/facebook/react/views/view/g;)V

    .line 3
    check-cast p1, Lcom/shopify/reactnative/skia/i;

    invoke-virtual {p1}, Lcom/shopify/reactnative/skia/i;->B()V

    return-void
.end method

.method public setDebug(Lcom/shopify/reactnative/skia/i;Z)V
    .locals 0
    .annotation runtime LB7/a;
        name = "debug"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/shopify/reactnative/skia/i;->setDebugMode(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setNativeId(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/g;

    invoke-virtual {p0, p1, p2}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;->setNativeId(Lcom/facebook/react/views/view/g;Ljava/lang/String;)V

    return-void
.end method

.method public setNativeId(Lcom/facebook/react/views/view/g;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->setNativeId(Landroid/view/View;Ljava/lang/String;)V

    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    .line 4
    check-cast p1, Lcom/shopify/reactnative/skia/i;

    invoke-virtual {p1, p2}, Lcom/shopify/reactnative/skia/i;->registerView(I)V

    return-void
.end method

.method public setOpaque(Lcom/shopify/reactnative/skia/i;Z)V
    .locals 0
    .annotation runtime LB7/a;
        name = "opaque"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/shopify/reactnative/skia/i;->setOpaque(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setPointerEvents(Lcom/shopify/reactnative/skia/i;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "pointerEvents"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/facebook/react/uimanager/C;->h(Ljava/lang/String;)Lcom/facebook/react/uimanager/C;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/g;->setPointerEvents(Lcom/facebook/react/uimanager/C;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
