.class public final synthetic Lcom/shopify/reactnative/skia/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:Landroid/graphics/Canvas;

.field public final synthetic b:Landroid/view/SurfaceView;

.field public final synthetic c:Landroid/graphics/Paint;

.field public final synthetic d:F

.field public final synthetic e:Landroid/graphics/Bitmap;

.field public final synthetic f:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Canvas;Landroid/view/SurfaceView;Landroid/graphics/Paint;FLandroid/graphics/Bitmap;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/shopify/reactnative/skia/m;->a:Landroid/graphics/Canvas;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/shopify/reactnative/skia/m;->b:Landroid/view/SurfaceView;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/shopify/reactnative/skia/m;->c:Landroid/graphics/Paint;

    .line 9
    .line 10
    iput p4, p0, Lcom/shopify/reactnative/skia/m;->d:F

    .line 11
    .line 12
    iput-object p5, p0, Lcom/shopify/reactnative/skia/m;->e:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/shopify/reactnative/skia/m;->f:Ljava/util/concurrent/CountDownLatch;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/shopify/reactnative/skia/m;->a:Landroid/graphics/Canvas;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/shopify/reactnative/skia/m;->b:Landroid/view/SurfaceView;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/shopify/reactnative/skia/m;->c:Landroid/graphics/Paint;

    .line 6
    .line 7
    iget v3, p0, Lcom/shopify/reactnative/skia/m;->d:F

    .line 8
    .line 9
    iget-object v4, p0, Lcom/shopify/reactnative/skia/m;->e:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/shopify/reactnative/skia/m;->f:Ljava/util/concurrent/CountDownLatch;

    .line 12
    .line 13
    move v6, p1

    .line 14
    invoke-static/range {v0 .. v6}, Lcom/shopify/reactnative/skia/n;->a(Landroid/graphics/Canvas;Landroid/view/SurfaceView;Landroid/graphics/Paint;FLandroid/graphics/Bitmap;Ljava/util/concurrent/CountDownLatch;I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
