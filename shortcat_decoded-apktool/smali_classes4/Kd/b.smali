.class public final LKd/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq2/P$d;
.implements LHd/b;


# instance fields
.field private final a:LMd/e;

.field private b:Lie/a;

.field private final c:Ljava/lang/ref/WeakReference;

.field private d:Z

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(LUb/d;Lexpo/modules/video/player/VideoPlayer;LMd/e;Lie/a;)V
    .locals 6

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "videoPlayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "currentViewReference"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, LKd/b;->a:LMd/e;

    .line 20
    .line 21
    iput-object p4, p0, LKd/b;->b:Lie/a;

    .line 22
    .line 23
    new-instance p3, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-direct {p3, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, LKd/b;->c:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {p2, p0}, Lexpo/modules/video/player/VideoPlayer;->a2(LHd/b;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v3, LKd/b$a;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-direct {v3, p2, p0, p1}, LKd/b$a;-><init>(Lexpo/modules/video/player/VideoPlayer;LKd/b;LZd/e;)V

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private final K()Z
    .locals 8

    .line 1
    iget-object v0, p0, LKd/b;->c:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/video/player/VideoPlayer;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_9

    .line 11
    .line 12
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, LKd/b;->a:LMd/e;

    .line 21
    .line 22
    invoke-virtual {v2}, LMd/e;->a()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lexpo/modules/video/VideoView;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1
    invoke-interface {v0}, Lq2/P;->f()Lt2/K;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Lt2/K;->b()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-interface {v0}, Lq2/P;->f()Lt2/K;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Lt2/K;->a()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-interface {v0}, Lq2/P;->w0()Lq2/l0;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget v5, v5, Lq2/l0;->a:I

    .line 52
    .line 53
    invoke-interface {v0}, Lq2/P;->w0()Lq2/l0;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget v6, v6, Lq2/l0;->b:I

    .line 58
    .line 59
    invoke-interface {v0}, Lq2/P;->w0()Lq2/l0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget v0, v0, Lq2/l0;->d:F

    .line 64
    .line 65
    if-eqz v3, :cond_9

    .line 66
    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_2
    int-to-float v3, v3

    .line 71
    int-to-float v4, v4

    .line 72
    div-float/2addr v3, v4

    .line 73
    int-to-float v4, v5

    .line 74
    int-to-float v7, v6

    .line 75
    div-float/2addr v4, v7

    .line 76
    mul-float/2addr v4, v0

    .line 77
    const/4 v0, 0x1

    .line 78
    if-eqz v5, :cond_4

    .line 79
    .line 80
    if-nez v6, :cond_3

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    move v5, v1

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    :goto_0
    move v5, v0

    .line 86
    :goto_1
    invoke-virtual {v2}, Lexpo/modules/video/VideoView;->getPlayerView()Landroidx/media3/ui/PlayerView;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Landroidx/media3/ui/PlayerView;->getResizeMode()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    sget-object v6, Lexpo/modules/video/enums/ContentFit;->FILL:Lexpo/modules/video/enums/ContentFit;

    .line 95
    .line 96
    invoke-virtual {v6}, Lexpo/modules/video/enums/ContentFit;->toResizeMode()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-ne v2, v6, :cond_5

    .line 101
    .line 102
    move v2, v0

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    move v2, v1

    .line 105
    :goto_2
    sub-float/2addr v4, v3

    .line 106
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    float-to-double v3, v3

    .line 111
    const-wide v6, 0x3fa999999999999aL    # 0.05

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    cmpg-double v3, v3, v6

    .line 117
    .line 118
    if-gez v3, :cond_6

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    if-nez v2, :cond_8

    .line 122
    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_7
    return v1

    .line 127
    :cond_8
    :goto_3
    return v0

    .line 128
    :cond_9
    :goto_4
    return v1
.end method

.method private final O()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LKd/b;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, LKd/b;->f:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, LKd/b;->b:Lie/a;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, LKd/b;->d:Z

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, LKd/b;->e:Z

    .line 21
    .line 22
    iput-boolean v0, p0, LKd/b;->f:Z

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public E(Lq2/C;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LKd/b;->e:Z

    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Lq2/P$d;->E(Lq2/C;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LKd/b;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public T()V
    .locals 1

    .line 1
    invoke-direct {p0}, LKd/b;->K()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LKd/b;->O()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, LKd/b;->d:Z

    .line 13
    .line 14
    return-void
.end method

.method public W(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, LKd/b;->K()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p0, LKd/b;->d:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, LKd/b;->O()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LKd/b;->c:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/video/player/VideoPlayer;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lexpo/modules/video/player/VideoPlayer;->V2(LHd/b;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LKd/b;->c:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lexpo/modules/video/player/VideoPlayer;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, p0}, Lq2/P;->H(Lq2/P$d;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, LKd/b;->b:Lie/a;

    .line 35
    .line 36
    return-void
.end method

.method public onAudioMixingModeChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->a(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onIsPlayingChanged(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->b(LHd/b;Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMutedChanged(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->c(LHd/b;Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPlaybackRateChanged(Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->d(LHd/b;Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPlayedToEnd(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHd/b$a;->e(LHd/b;Lexpo/modules/video/player/VideoPlayer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onRenderedFirstFrame(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHd/b$a;->f(LHd/b;Lexpo/modules/video/player/VideoPlayer;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onSourceChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->g(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onStatusChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LHd/b$a;->h(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTargetViewChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)V
    .locals 0

    .line 1
    const-string p2, "player"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, LKd/b;->f:Z

    .line 8
    .line 9
    return-void
.end method

.method public onTimeUpdate(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/TimeUpdate;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LHd/b$a;->j(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/TimeUpdate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTrackSelectionParametersChanged(Lexpo/modules/video/player/VideoPlayer;Lq2/d0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LHd/b$a;->k(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lq2/d0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onTracksChanged(Lexpo/modules/video/player/VideoPlayer;Lq2/h0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LHd/b$a;->l(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lq2/h0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVideoSourceLoaded(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, LHd/b$a;->m(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVideoTrackChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->n(LHd/b;Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onVolumeChanged(Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHd/b$a;->o(LHd/b;Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
