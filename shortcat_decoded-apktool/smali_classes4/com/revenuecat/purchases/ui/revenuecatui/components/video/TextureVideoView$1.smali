.class public final Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "com/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1",
        "Landroid/view/TextureView$SurfaceTextureListener;",
        "Landroid/graphics/SurfaceTexture;",
        "st",
        "",
        "w",
        "h",
        "LTd/L;",
        "onSurfaceTextureAvailable",
        "(Landroid/graphics/SurfaceTexture;II)V",
        "onSurfaceTextureSizeChanged",
        "",
        "onSurfaceTextureDestroyed",
        "(Landroid/graphics/SurfaceTexture;)Z",
        "onSurfaceTextureUpdated",
        "(Landroid/graphics/SurfaceTexture;)V",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 1
    const-string p2, "st"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 7
    .line 8
    invoke-static {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getReleased$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 16
    .line 17
    invoke-static {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$takeAttachedSurface(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Landroid/view/Surface;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 24
    .line 25
    invoke-static {p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getPlayerOwner$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p3, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;->clearSurfaceBlocking(Landroid/view/Surface;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 33
    .line 34
    new-instance p3, Landroid/view/Surface;

    .line 35
    .line 36
    invoke-direct {p3, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$setAttachedSurface$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;Landroid/view/Surface;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getPlayerOwner$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 49
    .line 50
    invoke-static {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getAttachedSurface$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Landroid/view/Surface;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;->setSurface(Landroid/view/Surface;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getViewTreeObserverListening$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_2

    .line 64
    .line 65
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 72
    .line 73
    invoke-static {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getLayoutListener$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 81
    .line 82
    const/4 p2, 0x1

    .line 83
    invoke-static {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$setViewTreeObserverListening$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;Z)V

    .line 84
    .line 85
    .line 86
    :cond_2
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 87
    .line 88
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getPrepared$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 95
    .line 96
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getResumePosMs$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    invoke-static {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$safeSeekTo(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;I)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 104
    .line 105
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getResumePlayWhenReady$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->start()V

    .line 114
    .line 115
    .line 116
    :cond_3
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 117
    .line 118
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$applySizing(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_4
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 123
    .line 124
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$prepareIfNeeded(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 2

    .line 1
    const-string v0, "st"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$takeAttachedSurface(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Landroid/view/Surface;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getReleased$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->isPlaying()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$setResumePlayWhenReady$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;Z)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->getCurrentPosition()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$setResumePosMs$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getPrepared$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->pause()V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getPlayerOwner$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/MediaPlayerThreadOwner;->clearSurfaceBlocking(Landroid/view/Surface;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    const/4 p1, 0x1

    .line 61
    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 1
    const-string p2, "st"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$applySizing(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    const-string v0, "st"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getFirstFrameRendered$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getPrepared$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-static {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$setFirstFrameRendered$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;Z)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView$1;->this$0:Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;->access$getOnReadyCallback$p(Lcom/revenuecat/purchases/ui/revenuecatui/components/video/TextureVideoView;)Lie/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method
