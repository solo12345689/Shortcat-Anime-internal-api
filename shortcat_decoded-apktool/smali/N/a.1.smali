.class public final LN/a;
.super LN/q0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private b:LGf/C0;

.field private c:LN/s0;

.field private d:LJf/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LN/q0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic m(LN/a;)LJf/t;
    .locals 0

    .line 1
    invoke-direct {p0}, LN/a;->p()LJf/t;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(LN/a;LN/s0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/a;->c:LN/s0;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic o(LN/q0$a;[F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LN/a;->r(LN/q0$a;[F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final p()LJf/t;
    .locals 5

    .line 1
    iget-object v0, p0, LN/a;->d:LJf/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {}, LL/c;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    sget-object v0, LIf/a;->c:LIf/a;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v3, v4, v0, v2, v1}, LJf/A;->b(IILIf/a;ILjava/lang/Object;)LJf/t;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, LN/a;->d:LJf/t;

    .line 24
    .line 25
    return-object v0
.end method

.method private final q(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LN/q0;->i()LN/q0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v1, LN/a$b;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p1, p0, v0, v2}, LN/a$b;-><init>(Lkotlin/jvm/functions/Function1;LN/a;LN/q0$a;LZd/e;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, LN/q0$a;->O0(Lkotlin/jvm/functions/Function2;)LGf/C0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, LN/a;->b:LGf/C0;

    .line 19
    .line 20
    return-void
.end method

.method private static final r(LN/q0$a;[F)V
    .locals 1

    .line 1
    invoke-interface {p0}, LN/q0$a;->o0()LI0/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    invoke-interface {p0}, LI0/p;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-interface {p0, p1}, LI0/p;->j0([F)V

    .line 19
    .line 20
    .line 21
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LN/a;->q(Lkotlin/jvm/functions/Function1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, LN/a;->b:LGf/C0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, LGf/C0$a;->a(LGf/C0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v1, p0, LN/a;->b:LGf/C0;

    .line 11
    .line 12
    invoke-direct {p0}, LN/a;->p()LJf/t;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, LJf/t;->h()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public c(La1/U;La1/J;LU0/T0;Lkotlin/jvm/functions/Function1;Lr0/h;Lr0/h;)V
    .locals 0

    .line 1
    move-object p4, p3

    .line 2
    move-object p3, p2

    .line 3
    move-object p2, p1

    .line 4
    iget-object p1, p0, LN/a;->c:LN/s0;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual/range {p1 .. p6}, LN/s0;->n(La1/U;La1/J;LU0/T0;Lr0/h;Lr0/h;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public d(Lr0/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->c:LN/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LN/s0;->j(Lr0/h;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public f(La1/U;La1/U;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/a;->c:LN/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LN/s0;->m(La1/U;La1/U;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public h(La1/U;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    .line 1
    new-instance v0, LN/a$a;

    .line 2
    .line 3
    move-object v2, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, LN/a$a;-><init>(La1/U;LN/a;La1/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, LN/a;->q(Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public k()V
    .locals 2

    .line 1
    invoke-direct {p0}, LN/a;->p()LJf/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-interface {v0, v1}, LJf/t;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
