.class Landroidx/media3/exoplayer/l$c$b;
.super Landroid/media/MediaRouter2$ControllerCallback;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/l$c;->a(Landroidx/media3/exoplayer/g1$a;Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Lt2/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/media3/exoplayer/l$c;


# direct methods
.method constructor <init>(Landroidx/media3/exoplayer/l$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/l$c$b;->a:Landroidx/media3/exoplayer/l$c;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/MediaRouter2$ControllerCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onControllerUpdated(Landroid/media/MediaRouter2$RoutingController;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/l$c$b;->a:Landroidx/media3/exoplayer/l$c;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/media3/exoplayer/l$c;->h(Landroidx/media3/exoplayer/l$c;)Lt2/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/l$c$b;->a:Landroidx/media3/exoplayer/l$c;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/media3/exoplayer/l$c;->f(Landroidx/media3/exoplayer/l$c;)Landroid/media/MediaRouter2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroidx/media3/exoplayer/l$c;->g(Landroid/media/MediaRouter2;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lt2/g;->g(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
