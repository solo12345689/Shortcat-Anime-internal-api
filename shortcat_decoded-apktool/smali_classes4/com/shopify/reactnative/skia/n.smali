.class public abstract Lcom/shopify/reactnative/skia/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a(Landroid/graphics/Canvas;Landroid/view/SurfaceView;Landroid/graphics/Paint;FLandroid/graphics/Bitmap;Ljava/util/concurrent/CountDownLatch;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lcom/shopify/reactnative/skia/n;->b(Landroid/graphics/Canvas;Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    const/high16 p1, 0x437f0000    # 255.0f

    .line 8
    .line 9
    mul-float/2addr p3, p1

    .line 10
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p4, p1, p1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p5}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static b(Landroid/graphics/Canvas;Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    add-int/2addr v2, v3

    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sub-int/2addr v2, v3

    .line 24
    int-to-float v2, v2

    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    add-int/2addr v3, v4

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    sub-int/2addr v3, p1

    .line 39
    int-to-float p1, v3

    .line 40
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private static c()Landroid/graphics/Paint;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method private static d(Landroid/graphics/Canvas;Landroid/view/View;F)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x437f0000    # 255.0f

    .line 8
    .line 9
    mul-float/2addr p2, v0

    .line 10
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0, p2}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;I)I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private static e(Landroid/graphics/Canvas;Landroid/view/ViewGroup;Landroid/graphics/Paint;F)V
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/facebook/react/views/view/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-class v0, Landroid/graphics/Canvas;

    .line 6
    .line 7
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lcom/facebook/react/views/view/g;

    .line 12
    .line 13
    const-string v2, "dispatchOverflowDraw"

    .line 14
    .line 15
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 21
    .line 22
    .line 23
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception v0

    .line 32
    const-string v1, "SkiaScreenshot"

    .line 33
    .line 34
    const-string v2, "couldn\'t invoke dispatchOverflowDraw() on ReactViewGroup"

    .line 35
    .line 36
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 37
    .line 38
    .line 39
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 40
    :goto_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-ge v0, v1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    instance-of v2, v1, Landroid/view/TextureView;

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    check-cast v1, Landroid/view/TextureView;

    .line 62
    .line 63
    invoke-static {p0, v1, p2, p3}, Lcom/shopify/reactnative/skia/n;->h(Landroid/graphics/Canvas;Landroid/view/TextureView;Landroid/graphics/Paint;F)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    instance-of v2, v1, Landroid/view/SurfaceView;

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    check-cast v1, Landroid/view/SurfaceView;

    .line 72
    .line 73
    invoke-static {p0, v1, p2, p3}, Lcom/shopify/reactnative/skia/n;->f(Landroid/graphics/Canvas;Landroid/view/SurfaceView;Landroid/graphics/Paint;F)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    invoke-static {p0, v1, p2, p3}, Lcom/shopify/reactnative/skia/n;->l(Landroid/graphics/Canvas;Landroid/view/View;Landroid/graphics/Paint;F)V

    .line 78
    .line 79
    .line 80
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    return-void
.end method

.method private static f(Landroid/graphics/Canvas;Landroid/view/SurfaceView;Landroid/graphics/Paint;F)V
    .locals 7

    .line 1
    new-instance v6, Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {v6, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    :try_start_0
    new-instance v0, Lcom/shopify/reactnative/skia/m;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-object v3, p2

    .line 26
    move v4, p3

    .line 27
    :try_start_1
    invoke-direct/range {v0 .. v6}, Lcom/shopify/reactnative/skia/m;-><init>(Landroid/graphics/Canvas;Landroid/view/SurfaceView;Landroid/graphics/Paint;FLandroid/graphics/Bitmap;Ljava/util/concurrent/CountDownLatch;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v5, v0, p0}, Landroid/view/PixelCopy;->request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 43
    .line 44
    const-wide/16 p1, 0x5

    .line 45
    .line 46
    invoke-virtual {v6, p1, p2, p0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception v0

    .line 51
    :goto_0
    move-object p0, v0

    .line 52
    goto :goto_1

    .line 53
    :catch_1
    move-exception v0

    .line 54
    move-object v1, p0

    .line 55
    move-object v2, p1

    .line 56
    move-object v3, p2

    .line 57
    move v4, p3

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string p2, "Cannot PixelCopy for "

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const-string p2, "SkiaScreenshot"

    .line 77
    .line 78
    invoke-static {p2, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2, v3, v4}, Lcom/shopify/reactnative/skia/n;->g(Landroid/graphics/Canvas;Landroid/view/SurfaceView;Landroid/graphics/Paint;F)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private static g(Landroid/graphics/Canvas;Landroid/view/SurfaceView;Landroid/graphics/Paint;F)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Lcom/shopify/reactnative/skia/n;->b(Landroid/graphics/Canvas;Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    const/high16 p1, 0x437f0000    # 255.0f

    .line 14
    .line 15
    mul-float/2addr p3, p1

    .line 16
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, v0, p1, p1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method private static h(Landroid/graphics/Canvas;Landroid/view/TextureView;Landroid/graphics/Paint;F)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->getBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1}, Lcom/shopify/reactnative/skia/n;->b(Landroid/graphics/Canvas;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    const/high16 p1, 0x437f0000    # 255.0f

    .line 30
    .line 31
    mul-float/2addr p3, p1

    .line 32
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-virtual {p0, v0, p1, p1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private static i(Landroid/graphics/Canvas;Landroid/view/View;Landroid/graphics/Paint;F)V
    .locals 0

    .line 1
    const/high16 p2, 0x437f0000    # 255.0f

    .line 2
    .line 3
    mul-float/2addr p3, p2

    .line 4
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const/4 p3, 0x0

    .line 9
    invoke-virtual {p0, p3, p2}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;I)I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static j(Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v1, "com.horcrux.svg"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    return v0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    const-string v1, "ViewScreenshotService"

    .line 23
    .line 24
    const-string v2, "Error checking if view is SVG"

    .line 25
    .line 26
    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 27
    .line 28
    .line 29
    return v0
.end method

.method public static k(Lcom/facebook/react/bridge/ReactContext;I)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/f0;->i(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/UIManager;->resolveView(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/facebook/react/bridge/ReactContext;->handleException(Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    move-object p0, v1

    .line 16
    :goto_0
    if-nez p0, :cond_0

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lez p1, :cond_2

    .line 28
    .line 29
    if-gtz v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 33
    .line 34
    invoke-static {p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, Landroid/graphics/Canvas;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/shopify/reactnative/skia/n;->c()Landroid/graphics/Paint;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    neg-int v2, v2

    .line 55
    int-to-float v2, v2

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    neg-int v3, v3

    .line 61
    int-to-float v3, v3

    .line 62
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 63
    .line 64
    .line 65
    const/high16 v2, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-static {v0, p0, v1, v2}, Lcom/shopify/reactnative/skia/n;->l(Landroid/graphics/Canvas;Landroid/view/View;Landroid/graphics/Paint;F)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_2
    :goto_1
    return-object v1
.end method

.method private static l(Landroid/graphics/Canvas;Landroid/view/View;Landroid/graphics/Paint;F)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-float/2addr p3, v0

    .line 6
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1}, Lcom/shopify/reactnative/skia/n;->b(Landroid/graphics/Canvas;Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    instance-of v0, p1, Landroid/widget/ScrollView;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, Landroid/widget/ScrollView;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/2addr v3, v1

    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 38
    .line 39
    .line 40
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {p1}, Lcom/shopify/reactnative/skia/n;->j(Landroid/view/View;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    move-object v0, p1

    .line 51
    check-cast v0, Landroid/view/ViewGroup;

    .line 52
    .line 53
    invoke-static {p0, p1, p3}, Lcom/shopify/reactnative/skia/n;->d(Landroid/graphics/Canvas;Landroid/view/View;F)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0, p2, p3}, Lcom/shopify/reactnative/skia/n;->e(Landroid/graphics/Canvas;Landroid/view/ViewGroup;Landroid/graphics/Paint;F)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lcom/shopify/reactnative/skia/n;->i(Landroid/graphics/Canvas;Landroid/view/View;Landroid/graphics/Paint;F)V

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 64
    .line 65
    .line 66
    return-void
.end method
