.class final Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->M(ZLandroidx/media3/exoplayer/ExoPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

.field final synthetic c:Landroidx/media3/exoplayer/ExoPlayer;

.field final synthetic d:Z


# direct methods
.method constructor <init>(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;Landroidx/media3/exoplayer/ExoPlayer;ZLZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 4
    .line 5
    iput-boolean p3, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->d:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance p1, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 6
    .line 7
    iget-boolean v2, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->d:Z

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;-><init>(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;Landroidx/media3/exoplayer/ExoPlayer;ZLZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v0, 0x1a

    .line 14
    .line 15
    if-lt p1, v0, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 18
    .line 19
    invoke-static {p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->v(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, LE3/h3;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, LE3/h3;->l()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-static {p1}, LJd/b;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    const-string v0, "showNotification"

    .line 57
    .line 58
    iget-boolean v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->d:Z

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 64
    .line 65
    invoke-static {v0}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->v(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 70
    .line 71
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, LE3/h3;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 80
    .line 81
    iget-boolean v2, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->d:Z

    .line 82
    .line 83
    iget-object v3, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$e;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, LE3/h3;->s(Landroid/os/Bundle;)V

    .line 86
    .line 87
    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-interface {v3}, Lq2/P;->q0()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    const/4 p1, 0x0

    .line 99
    :goto_1
    invoke-virtual {v1, v0, p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->q(LE3/h3;Z)V

    .line 100
    .line 101
    .line 102
    :cond_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 106
    .line 107
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 108
    .line 109
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1
.end method
