.class final Lexpo/modules/video/a$O1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/a;->y(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/kotlin/types/Either;LUb/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lexpo/modules/video/player/VideoPlayer;

.field final synthetic c:Lexpo/modules/video/records/VideoSource;

.field final synthetic d:LUb/u;


# direct methods
.method constructor <init>(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;LUb/u;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/a$O1;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/video/a$O1;->c:Lexpo/modules/video/records/VideoSource;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/video/a$O1;->d:LUb/u;

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
    new-instance p1, Lexpo/modules/video/a$O1;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/video/a$O1;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/video/a$O1;->c:Lexpo/modules/video/records/VideoSource;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/video/a$O1;->d:LUb/u;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/video/a$O1;-><init>(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;LUb/u;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/a$O1;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lexpo/modules/video/a$O1;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lexpo/modules/video/a$O1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/video/a$O1;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v0, p0, Lexpo/modules/video/a$O1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/video/a$O1;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 12
    .line 13
    iget-object v0, p0, Lexpo/modules/video/a$O1;->c:Lexpo/modules/video/records/VideoSource;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lexpo/modules/video/player/VideoPlayer;->r3(Lexpo/modules/video/records/VideoSource;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lexpo/modules/video/a$O1;->b:Lexpo/modules/video/player/VideoPlayer;

    .line 19
    .line 20
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->T2()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lexpo/modules/video/a$O1;->d:LUb/u;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, LUb/u;->b()V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method
