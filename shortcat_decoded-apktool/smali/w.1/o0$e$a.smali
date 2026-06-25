.class final Lw/o0$e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/o0$e;->invoke(LY/Y;)LY/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:F

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Lw/o0;


# direct methods
.method constructor <init>(Lw/o0;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/o0$e$a;->d:Lw/o0;

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
    .locals 2

    .line 1
    new-instance v0, Lw/o0$e$a;

    .line 2
    .line 3
    iget-object v1, p0, Lw/o0$e$a;->d:Lw/o0;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lw/o0$e$a;-><init>(Lw/o0;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lw/o0$e$a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lw/o0$e$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Lw/o0$e$a;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Lw/o0$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Lw/o0$e$a;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lw/o0$e$a;->b:I

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
    iget v1, p0, Lw/o0$e$a;->a:F

    .line 13
    .line 14
    iget-object v3, p0, Lw/o0$e$a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, LGf/O;

    .line 17
    .line 18
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lw/o0$e$a;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, LGf/O;

    .line 36
    .line 37
    invoke-interface {p1}, LGf/O;->getCoroutineContext()LZd/i;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lw/m0;->n(LZd/i;)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    move-object v3, p1

    .line 46
    :cond_2
    :goto_0
    invoke-static {v3}, LGf/P;->g(LGf/O;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    new-instance p1, Lw/o0$e$a$a;

    .line 53
    .line 54
    iget-object v4, p0, Lw/o0$e$a;->d:Lw/o0;

    .line 55
    .line 56
    invoke-direct {p1, v4, v1}, Lw/o0$e$a$a;-><init>(Lw/o0;F)V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Lw/o0$e$a;->c:Ljava/lang/Object;

    .line 60
    .line 61
    iput v1, p0, Lw/o0$e$a;->a:F

    .line 62
    .line 63
    iput v2, p0, Lw/o0$e$a;->b:I

    .line 64
    .line 65
    invoke-static {p1, p0}, LY/v0;->c(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    sget-object p1, LTd/L;->a:LTd/L;

    .line 73
    .line 74
    return-object p1
.end method
