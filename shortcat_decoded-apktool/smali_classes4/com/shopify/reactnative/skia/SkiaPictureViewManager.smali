.class public Lcom/shopify/reactnative/skia/SkiaPictureViewManager;
.super Lcom/shopify/reactnative/skia/SkiaBaseViewManager;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK7/g1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/shopify/reactnative/skia/SkiaBaseViewManager<",
        "Lcom/shopify/reactnative/skia/SkiaPictureView;",
        ">;",
        "LK7/g1;"
    }
.end annotation


# instance fields
.field protected mDelegate:LK7/f1;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LK7/f1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LK7/f1;-><init>(Lcom/facebook/react/uimanager/BaseViewManager;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->mDelegate:LK7/f1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/shopify/reactnative/skia/SkiaPictureView;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/facebook/react/views/view/g;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/shopify/reactnative/skia/SkiaPictureView;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/b0;)Lcom/shopify/reactnative/skia/SkiaPictureView;
    .locals 1

    .line 3
    new-instance v0, Lcom/shopify/reactnative/skia/SkiaPictureView;

    invoke-direct {v0, p1}, Lcom/shopify/reactnative/skia/SkiaPictureView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected getDelegate()LK7/f1;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->mDelegate:LK7/f1;

    return-object v0
.end method

.method protected bridge synthetic getDelegate()Lcom/facebook/react/uimanager/q0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->getDelegate()LK7/f1;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "SkiaPictureView"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic setAndroidWarmup(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/shopify/reactnative/skia/SkiaPictureView;

    invoke-virtual {p0, p1, p2}, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->setAndroidWarmup(Lcom/shopify/reactnative/skia/SkiaPictureView;Z)V

    return-void
.end method

.method public setAndroidWarmup(Lcom/shopify/reactnative/skia/SkiaPictureView;Z)V
    .locals 0

    .line 2
    invoke-virtual {p1, p2}, Lcom/shopify/reactnative/skia/SkiaPictureView;->setAndroidWarmup(Z)V

    return-void
.end method

.method public bridge synthetic setColorSpace(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/shopify/reactnative/skia/SkiaPictureView;

    invoke-virtual {p0, p1, p2}, Lcom/shopify/reactnative/skia/SkiaPictureViewManager;->setColorSpace(Lcom/shopify/reactnative/skia/SkiaPictureView;Ljava/lang/String;)V

    return-void
.end method

.method public setColorSpace(Lcom/shopify/reactnative/skia/SkiaPictureView;Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic setDebug(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime LB7/a;
        name = "debug"
    .end annotation

    .line 1
    check-cast p1, Lcom/shopify/reactnative/skia/i;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;->setDebug(Lcom/shopify/reactnative/skia/i;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setOpaque(Landroid/view/View;Z)V
    .locals 0
    .annotation runtime LB7/a;
        name = "opaque"
    .end annotation

    .line 1
    check-cast p1, Lcom/shopify/reactnative/skia/i;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;->setOpaque(Lcom/shopify/reactnative/skia/i;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic setPointerEvents(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime LB7/a;
        name = "pointerEvents"
    .end annotation

    .line 1
    check-cast p1, Lcom/shopify/reactnative/skia/i;

    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/shopify/reactnative/skia/SkiaBaseViewManager;->setPointerEvents(Lcom/shopify/reactnative/skia/i;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
