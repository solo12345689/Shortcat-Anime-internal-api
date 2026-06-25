.class public final synthetic Lb7/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Landroid/graphics/Bitmap;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:J

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Landroid/graphics/Bitmap;IIJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb7/e;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iput-object p2, p0, Lb7/e;->b:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    iput p3, p0, Lb7/e;->c:I

    .line 9
    .line 10
    iput p4, p0, Lb7/e;->d:I

    .line 11
    .line 12
    iput-wide p5, p0, Lb7/e;->e:J

    .line 13
    .line 14
    iput-wide p7, p0, Lb7/e;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lb7/e;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object v1, p0, Lb7/e;->b:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iget v2, p0, Lb7/e;->c:I

    .line 6
    .line 7
    iget v3, p0, Lb7/e;->d:I

    .line 8
    .line 9
    iget-wide v4, p0, Lb7/e;->e:J

    .line 10
    .line 11
    iget-wide v6, p0, Lb7/e;->f:J

    .line 12
    .line 13
    move v8, p1

    .line 14
    invoke-static/range {v0 .. v8}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->a(Lkotlin/jvm/functions/Function1;Landroid/graphics/Bitmap;IIJJI)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
