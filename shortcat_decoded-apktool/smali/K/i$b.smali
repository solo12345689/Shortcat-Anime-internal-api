.class final LK/i$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/i;->a(La1/U;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LU0/Y0;La1/f0;Lkotlin/jvm/functions/Function1;LB/m;Ls0/h0;ZIILa1/t;LK/w;ZZLie/o;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LK/y;

.field final synthetic c:LY/h2;

.field final synthetic d:La1/W;

.field final synthetic e:LQ/F;

.field final synthetic f:La1/t;


# direct methods
.method constructor <init>(LK/y;LY/h2;La1/W;LQ/F;La1/t;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/i$b;->b:LK/y;

    .line 2
    .line 3
    iput-object p2, p0, LK/i$b;->c:LY/h2;

    .line 4
    .line 5
    iput-object p3, p0, LK/i$b;->d:La1/W;

    .line 6
    .line 7
    iput-object p4, p0, LK/i$b;->e:LQ/F;

    .line 8
    .line 9
    iput-object p5, p0, LK/i$b;->f:La1/t;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 7

    .line 1
    new-instance v0, LK/i$b;

    .line 2
    .line 3
    iget-object v1, p0, LK/i$b;->b:LK/y;

    .line 4
    .line 5
    iget-object v2, p0, LK/i$b;->c:LY/h2;

    .line 6
    .line 7
    iget-object v3, p0, LK/i$b;->d:La1/W;

    .line 8
    .line 9
    iget-object v4, p0, LK/i$b;->e:LQ/F;

    .line 10
    .line 11
    iget-object v5, p0, LK/i$b;->f:La1/t;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, LK/i$b;-><init>(LK/y;LY/h2;La1/W;LQ/F;La1/t;LZd/e;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LK/i$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LK/i$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LK/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LK/i$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

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
    iget v1, p0, LK/i$b;->a:I

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
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :try_start_1
    new-instance p1, LK/i$b$a;

    .line 30
    .line 31
    iget-object v1, p0, LK/i$b;->c:LY/h2;

    .line 32
    .line 33
    invoke-direct {p1, v1}, LK/i$b$a;-><init>(LY/h2;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, LY/U1;->p(Lie/a;)LJf/e;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v1, LK/i$b$b;

    .line 41
    .line 42
    iget-object v3, p0, LK/i$b;->b:LK/y;

    .line 43
    .line 44
    iget-object v4, p0, LK/i$b;->d:La1/W;

    .line 45
    .line 46
    iget-object v5, p0, LK/i$b;->e:LQ/F;

    .line 47
    .line 48
    iget-object v6, p0, LK/i$b;->f:La1/t;

    .line 49
    .line 50
    invoke-direct {v1, v3, v4, v5, v6}, LK/i$b$b;-><init>(LK/y;La1/W;LQ/F;La1/t;)V

    .line 51
    .line 52
    .line 53
    iput v2, p0, LK/i$b;->a:I

    .line 54
    .line 55
    invoke-interface {p1, v1, p0}, LJf/e;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    :goto_0
    iget-object p1, p0, LK/i$b;->b:LK/y;

    .line 63
    .line 64
    invoke-static {p1}, LK/i;->i(LK/y;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, LTd/L;->a:LTd/L;

    .line 68
    .line 69
    return-object p1

    .line 70
    :goto_1
    iget-object v0, p0, LK/i$b;->b:LK/y;

    .line 71
    .line 72
    invoke-static {v0}, LK/i;->i(LK/y;)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method
