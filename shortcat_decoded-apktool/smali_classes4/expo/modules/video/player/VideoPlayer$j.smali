.class final Lexpo/modules/video/player/VideoPlayer$j;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/player/VideoPlayer;->n3(Lexpo/modules/video/records/SeekTolerance;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/video/player/VideoPlayer;


# direct methods
.method constructor <init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer$j;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 1

    .line 1
    new-instance p1, Lexpo/modules/video/player/VideoPlayer$j;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$j;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lexpo/modules/video/player/VideoPlayer$j;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/player/VideoPlayer$j;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/video/player/VideoPlayer$j;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/video/player/VideoPlayer$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/player/VideoPlayer$j;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v0, p0, Lexpo/modules/video/player/VideoPlayer$j;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/video/player/VideoPlayer$j;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->D2()Lexpo/modules/video/records/SeekTolerance;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer$j;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lexpo/modules/video/records/SeekTolerance;->applyToPlayer(Lexpo/modules/video/player/VideoPlayer;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, LTd/L;->a:LTd/L;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method
