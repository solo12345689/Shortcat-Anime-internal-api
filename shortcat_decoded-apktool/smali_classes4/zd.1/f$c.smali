.class final Lzd/f$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd/f;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lzd/f;


# direct methods
.method constructor <init>(Lzd/f;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/f$c;->b:Lzd/f;

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
    new-instance p1, Lzd/f$c;

    .line 2
    .line 3
    iget-object v0, p0, Lzd/f$c;->b:Lzd/f;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lzd/f$c;-><init>(Lzd/f;LZd/e;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lzd/f$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lzd/f$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lzd/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lzd/f$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v0, p0, Lzd/f$c;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object p1, p0, Lzd/f$c;->b:Lzd/f;

    .line 12
    .line 13
    invoke-static {p1}, Lzd/f;->h(Lzd/f;)Lexpo/modules/updates/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lzd/f$c;->b:Lzd/f;

    .line 18
    .line 19
    invoke-static {v0}, Lzd/f;->c(Lzd/f;)Lpd/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lpd/c;->c()Lexpo/modules/updates/db/UpdatesDatabase;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lzd/f$c;->b:Lzd/f;

    .line 28
    .line 29
    invoke-static {v1}, Lzd/f;->i(Lzd/f;)Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, Lzd/f$c;->b:Lzd/f;

    .line 34
    .line 35
    invoke-static {v2}, Lzd/f;->d(Lzd/f;)Lie/a;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lvd/b;

    .line 44
    .line 45
    invoke-interface {v2}, Lvd/b;->d()Lrd/d;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Lzd/f$c;->b:Lzd/f;

    .line 50
    .line 51
    invoke-static {v3}, Lzd/f;->g(Lzd/f;)LBd/h;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {p1, v0, v1, v2, v3}, Lpd/d;->a(Lexpo/modules/updates/d;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lrd/d;LBd/h;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception p1

    .line 60
    iget-object v0, p0, Lzd/f$c;->b:Lzd/f;

    .line 61
    .line 62
    invoke-static {v0}, Lzd/f;->e(Lzd/f;)Lxd/g;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "Could not run Reaper."

    .line 67
    .line 68
    sget-object v2, Lxd/b;->l:Lxd/b;

    .line 69
    .line 70
    invoke-virtual {v0, v1, p1, v2}, Lxd/g;->f(Ljava/lang/String;Ljava/lang/Exception;Lxd/b;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method
