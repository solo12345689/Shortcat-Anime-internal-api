.class public final synthetic Lb7/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# instance fields
.field public final synthetic a:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb7/d;->a:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/d;->a:Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3}, Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;->c(Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;Landroid/view/Window;Landroid/view/FrameMetrics;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
