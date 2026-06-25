.class abstract Landroidx/media3/exoplayer/Y$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method public static synthetic a(Landroid/content/Context;ZLandroidx/media3/exoplayer/Y;LB2/K1;)V
    .locals 0

    .line 1
    invoke-static {p0}, LB2/G1;->J0(Landroid/content/Context;)LB2/G1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "ExoPlayerImpl"

    .line 8
    .line 9
    const-string p1, "MediaMetricsService unavailable."

    .line 10
    .line 11
    invoke-static {p0, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2, p0}, Landroidx/media3/exoplayer/Y;->A(LB2/b;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0}, LB2/G1;->Q0()Landroid/media/metrics/LogSessionId;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p3, p0}, LB2/K1;->b(Landroid/media/metrics/LogSessionId;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static b(Landroid/content/Context;Landroidx/media3/exoplayer/Y;ZLB2/K1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/media3/exoplayer/Y;->F2()Lt2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroidx/media3/exoplayer/Y;->K2()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {v0, v1, v2}, Lt2/j;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lt2/s;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroidx/media3/exoplayer/Z;

    .line 15
    .line 16
    invoke-direct {v1, p0, p2, p1, p3}, Landroidx/media3/exoplayer/Z;-><init>(Landroid/content/Context;ZLandroidx/media3/exoplayer/Y;LB2/K1;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Lt2/s;->i(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method
