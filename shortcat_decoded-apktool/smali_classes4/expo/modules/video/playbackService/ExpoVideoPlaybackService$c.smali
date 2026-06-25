.class final Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->q(LE3/h3;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Z

.field final synthetic c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

.field final synthetic d:LE3/h3;


# direct methods
.method constructor <init>(ZLexpo/modules/video/playbackService/ExpoVideoPlaybackService;LE3/h3;LZd/e;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->b:Z

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->d:LE3/h3;

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
    new-instance p1, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;

    .line 2
    .line 3
    iget-boolean v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->b:Z

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->d:LE3/h3;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;-><init>(ZLexpo/modules/video/playbackService/ExpoVideoPlaybackService;LE3/h3;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->b:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 16
    .line 17
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->d:LE3/h3;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->C(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;LE3/h3;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 26
    .line 27
    iget-object v0, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->d:LE3/h3;

    .line 28
    .line 29
    invoke-static {p1, v0}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->B(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;LE3/h3;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p1, p0, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$c;->c:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 34
    .line 35
    invoke-static {p1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->u(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;)LE3/h3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p1, v0}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->B(Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;LE3/h3;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method
