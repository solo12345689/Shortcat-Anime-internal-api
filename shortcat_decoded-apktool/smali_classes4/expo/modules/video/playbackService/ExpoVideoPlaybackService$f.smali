.class final Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->N(Landroidx/media3/exoplayer/ExoPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

.field final synthetic c:Landroidx/media3/exoplayer/ExoPlayer;


# direct methods
.method constructor <init>(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;Landroidx/media3/exoplayer/ExoPlayer;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance p1, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;-><init>(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;Landroidx/media3/exoplayer/ExoPlayer;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 12
    .line 13
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->z(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;Landroidx/media3/exoplayer/ExoPlayer;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 19
    .line 20
    invoke-static {p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->v(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->c:Landroidx/media3/exoplayer/ExoPlayer;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, LE3/h3;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, LE3/h3;->q()V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 38
    .line 39
    invoke-static {p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->v(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)Ljava/util/Map;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 50
    .line 51
    invoke-static {p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->t(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/app/Service;->stopSelf()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$f;->b:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 61
    .line 62
    invoke-static {p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->u(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)LE3/h3;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {p1, v0}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->B(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;LE3/h3;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
.end method
