.class public Lcom/shopify/reactnative/skia/j;
.super Landroid/view/SurfaceView;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field a:Lcom/shopify/reactnative/skia/l;

.field b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopify/reactnative/skia/l;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/shopify/reactnative/skia/j;->a:Lcom/shopify/reactnative/skia/l;

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/shopify/reactnative/skia/j;->b:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/SurfaceView;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/shopify/reactnative/skia/j;->a:Lcom/shopify/reactnative/skia/l;

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/shopify/reactnative/skia/l;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/shopify/reactnative/skia/j;->a:Lcom/shopify/reactnative/skia/l;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    invoke-interface {p2, p1, p3, p4}, Lcom/shopify/reactnative/skia/l;->c(Landroid/view/Surface;II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/j;->a:Lcom/shopify/reactnative/skia/l;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-interface {v0, p1, v1, v2}, Lcom/shopify/reactnative/skia/l;->f(Landroid/view/Surface;II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/shopify/reactnative/skia/j;->a:Lcom/shopify/reactnative/skia/l;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/shopify/reactnative/skia/l;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
