.class final Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->J(Lexpo/modules/video/player/VideoPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/video/player/VideoPlayer;

.field final synthetic c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;


# direct methods
.method constructor <init>(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

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
    new-instance p1, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;-><init>(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;LZd/e;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->y2()Landroidx/media3/exoplayer/ExoPlayer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 18
    .line 19
    invoke-static {v0}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->v(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget-object p1, LTd/L;->a:LTd/L;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance v0, LE3/h3$b;

    .line 33
    .line 34
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 35
    .line 36
    invoke-direct {v0, v1, p1}, LE3/h3$b;-><init>(Landroid/content/Context;Lq2/P;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v3, "ExpoVideoPlaybackService_"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, LE3/h3$b;->g(Ljava/lang/String;)LE3/h3$b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, LJd/e;

    .line 65
    .line 66
    invoke-direct {v1}, LJd/e;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, LE3/h3$b;->e(LE3/h3$d;)LE3/h3$b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 74
    .line 75
    invoke-static {v1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->w(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)LE3/b;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v2, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 80
    .line 81
    invoke-static {v2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->x(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)LE3/b;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v1, v2}, LP9/u;->D(Ljava/lang/Object;Ljava/lang/Object;)LP9/u;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, LE3/h3$b;->f(Ljava/util/List;)LE3/h3$b;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, LE3/h3$b;->d()LE3/h3;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v1, "build(...)"

    .line 98
    .line 99
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 103
    .line 104
    invoke-virtual {v1}, Lexpo/modules/video/player/VideoPlayer;->v2()LE3/h3;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, LE3/h3;->q()V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Lexpo/modules/video/player/VideoPlayer;->g3(LE3/h3;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 117
    .line 118
    invoke-static {v1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->v(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 126
    .line 127
    invoke-virtual {v1, v0}, LE3/W4;->f(LE3/h3;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 131
    .line 132
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$d;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 133
    .line 134
    invoke-virtual {v1}, Lexpo/modules/video/player/VideoPlayer;->F2()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-virtual {v0, v1, p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->M(ZLandroidx/media3/exoplayer/ExoPlayer;)V

    .line 139
    .line 140
    .line 141
    sget-object p1, LTd/L;->a:LTd/L;

    .line 142
    .line 143
    return-object p1

    .line 144
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 147
    .line 148
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1
.end method
