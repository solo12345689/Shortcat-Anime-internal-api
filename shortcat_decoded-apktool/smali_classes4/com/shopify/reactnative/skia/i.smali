.class public abstract Lcom/shopify/reactnative/skia/i;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/shopify/reactnative/skia/l;


# instance fields
.field private a:Landroid/view/View;

.field private final b:Z

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/shopify/reactnative/skia/i;->b:Z

    .line 6
    .line 7
    const-string v1, "SkiaView"

    .line 8
    .line 9
    iput-object v1, p0, Lcom/shopify/reactnative/skia/i;->c:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v1, Lcom/shopify/reactnative/skia/k;

    .line 12
    .line 13
    invoke-direct {v1, p1, p0, v0}, Lcom/shopify/reactnative/skia/k;-><init>(Landroid/content/Context;Lcom/shopify/reactnative/skia/l;Z)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/shopify/reactnative/skia/i;->a:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method B()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/shopify/reactnative/skia/RNSkiaModule;->isModuleValid()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/shopify/reactnative/skia/i;->unregisterView()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(Landroid/view/Surface;II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onSurfaceTextureSizeChanged "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "/"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "SkiaView"

    .line 27
    .line 28
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/shopify/reactnative/skia/i;->surfaceSizeChanged(Ljava/lang/Object;IIZ)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/g;->getPointerEvents()Lcom/facebook/react/uimanager/C;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/facebook/react/uimanager/C;->b(Lcom/facebook/react/uimanager/C;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public e()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/shopify/reactnative/skia/i;->surfaceDestroyed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public f(Landroid/view/Surface;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/shopify/reactnative/skia/i;->surfaceAvailable(Ljava/lang/Object;IIZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public g(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/shopify/reactnative/skia/i;->surfaceAvailable(Ljava/lang/Object;IIZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public l(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onSurfaceTextureSizeChanged "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "/"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "SkiaView"

    .line 27
    .line 28
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/shopify/reactnative/skia/i;->surfaceSizeChanged(Ljava/lang/Object;IIZ)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Lcom/facebook/react/views/view/g;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object v0, p1, Lcom/shopify/reactnative/skia/i;->a:Landroid/view/View;

    .line 6
    .line 7
    sub-int/2addr p4, p2

    .line 8
    sub-int/2addr p5, p3

    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-virtual {v0, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method protected abstract registerView(I)V
.end method

.method protected abstract setDebugMode(Z)V
.end method

.method public setOpaque(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, Lcom/shopify/reactnative/skia/i;->a:Landroid/view/View;

    .line 5
    .line 6
    instance-of v2, v1, Lcom/shopify/reactnative/skia/k;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lcom/shopify/reactnative/skia/j;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p1, v1, p0, v0}, Lcom/shopify/reactnative/skia/j;-><init>(Landroid/content/Context;Lcom/shopify/reactnative/skia/l;Z)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/shopify/reactnative/skia/i;->a:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    if-nez p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lcom/shopify/reactnative/skia/i;->a:Landroid/view/View;

    .line 31
    .line 32
    instance-of v1, p1, Lcom/shopify/reactnative/skia/j;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lcom/shopify/reactnative/skia/k;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {p1, v1, p0, v0}, Lcom/shopify/reactnative/skia/k;-><init>(Landroid/content/Context;Lcom/shopify/reactnative/skia/l;Z)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/shopify/reactnative/skia/i;->a:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method protected abstract surfaceAvailable(Ljava/lang/Object;IIZ)V
.end method

.method protected abstract surfaceDestroyed()V
.end method

.method protected abstract surfaceSizeChanged(Ljava/lang/Object;IIZ)V
.end method

.method protected abstract unregisterView()V
.end method
