.class public final Lexpo/modules/video/a$b0;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/video/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lexpo/modules/video/a;


# direct methods
.method public constructor <init>(LZd/e;Lexpo/modules/video/a;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/video/a$b0;->c:Lexpo/modules/video/a;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lexpo/modules/video/a$b0;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/video/a$b0;->c:Lexpo/modules/video/a;

    .line 4
    .line 5
    invoke-direct {p1, p3, v0}, Lexpo/modules/video/a$b0;-><init>(LZd/e;Lexpo/modules/video/a;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Lexpo/modules/video/a$b0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lexpo/modules/video/a$b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/O;

    .line 2
    .line 3
    check-cast p2, [Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p3, LZd/e;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/video/a$b0;->a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/video/a$b0;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lexpo/modules/video/a$b0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    aget-object v1, p1, v1

    .line 33
    .line 34
    aget-object v3, p1, v2

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    aget-object p1, p1, v4

    .line 38
    .line 39
    check-cast p1, Lexpo/modules/video/records/VideoThumbnailOptions;

    .line 40
    .line 41
    check-cast v3, Ljava/util/List;

    .line 42
    .line 43
    check-cast v1, Lexpo/modules/video/player/VideoPlayer;

    .line 44
    .line 45
    invoke-virtual {v1}, Lexpo/modules/video/player/VideoPlayer;->v3()Landroid/media/MediaMetadataRetriever;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v4, Lexpo/modules/video/a$l;

    .line 50
    .line 51
    iget-object v5, p0, Lexpo/modules/video/a$b0;->c:Lexpo/modules/video/a;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-direct {v4, v3, v5, p1, v6}, Lexpo/modules/video/a$l;-><init>(Ljava/util/List;Lexpo/modules/video/a;Lexpo/modules/video/records/VideoThumbnailOptions;LZd/e;)V

    .line 55
    .line 56
    .line 57
    iput v2, p0, Lexpo/modules/video/a$b0;->a:I

    .line 58
    .line 59
    invoke-static {v1, v4, p0}, LFd/q;->e(Landroid/media/MediaMetadataRetriever;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v0, :cond_2

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    return-object p1
.end method
