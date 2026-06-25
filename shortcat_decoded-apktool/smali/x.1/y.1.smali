.class final Lx/y;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:LB/m;

.field private b:LB/d;

.field private final c:Z


# direct methods
.method public constructor <init>(LB/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx/y;->a:LB/m;

    .line 5
    .line 6
    return-void
.end method

.method private final E1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx/y;->a:LB/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lx/y;->b:LB/d;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, LB/e;

    .line 10
    .line 11
    invoke-direct {v2, v1}, LB/e;-><init>(LB/d;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v2}, LB/m;->a(LB/j;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lx/y;->b:LB/d;

    .line 19
    .line 20
    return-void
.end method

.method private final F1(LB/m;LB/j;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, LGf/O;->getCoroutineContext()LZd/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, LGf/C0;->K:LGf/C0$b;

    .line 16
    .line 17
    invoke-interface {v0, v1}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LGf/C0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v2, Lx/y$b;

    .line 27
    .line 28
    invoke-direct {v2, p1, p2}, Lx/y$b;-><init>(LB/m;LB/j;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v2}, LGf/C0;->H(Lkotlin/jvm/functions/Function1;)LGf/h0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v0, v1

    .line 37
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v5, Lx/y$a;

    .line 42
    .line 43
    invoke-direct {v5, p1, p2, v0, v1}, Lx/y$a;-><init>(LB/m;LB/j;LGf/h0;LZd/e;)V

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x3

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-interface {p1, p2}, LB/m;->a(LB/j;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final G1(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx/y;->a:LB/m;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, Lx/y;->b:LB/d;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance v2, LB/e;

    .line 13
    .line 14
    invoke-direct {v2, p1}, LB/e;-><init>(LB/d;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, v2}, Lx/y;->F1(LB/m;LB/j;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lx/y;->b:LB/d;

    .line 21
    .line 22
    :cond_0
    new-instance p1, LB/d;

    .line 23
    .line 24
    invoke-direct {p1}, LB/d;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, p1}, Lx/y;->F1(LB/m;LB/j;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lx/y;->b:LB/d;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p1, p0, Lx/y;->b:LB/d;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    new-instance v2, LB/e;

    .line 38
    .line 39
    invoke-direct {v2, p1}, LB/e;-><init>(LB/d;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0, v2}, Lx/y;->F1(LB/m;LB/j;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lx/y;->b:LB/d;

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final H1(LB/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx/y;->a:LB/m;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lx/y;->E1()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lx/y;->a:LB/m;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public getShouldAutoInvalidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx/y;->c:Z

    .line 2
    .line 3
    return v0
.end method
