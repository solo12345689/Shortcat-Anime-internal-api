.class public final Lx/z;
.super LK0/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lq0/d;
.implements LK0/A0;
.implements LK0/v;
.implements Lq0/m;


# instance fields
.field private final c:Z

.field private d:Lq0/n;

.field private final e:Lx/y;

.field private final f:Lx/A;

.field private final g:Lx/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LB/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/m;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx/y;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lx/y;-><init>(LB/m;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lx/y;

    .line 14
    .line 15
    iput-object p1, p0, Lx/z;->e:Lx/y;

    .line 16
    .line 17
    new-instance p1, Lx/A;

    .line 18
    .line 19
    invoke-direct {p1}, Lx/A;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lx/A;

    .line 27
    .line 28
    iput-object p1, p0, Lx/z;->f:Lx/A;

    .line 29
    .line 30
    new-instance p1, Lx/C;

    .line 31
    .line 32
    invoke-direct {p1}, Lx/C;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lx/C;

    .line 40
    .line 41
    iput-object p1, p0, Lx/z;->g:Lx/C;

    .line 42
    .line 43
    invoke-static {}, Landroidx/compose/ui/focus/p;->a()Landroidx/compose/ui/focus/o;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final K1(LB/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx/z;->e:Lx/y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx/y;->H1(LB/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public W0(Lq0/n;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lx/z;->d:Lq0/n;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Lq0/n;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->getCoroutineScope()LGf/O;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v4, Lx/z$b;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v4, p0, v2}, Lx/z$b;-><init>(Lx/z;LZd/e;)V

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x3

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Lx/z;->e:Lx/y;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lx/y;->G1(Z)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lx/z;->g:Lx/C;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lx/C;->G1(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lx/z;->f:Lx/A;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lx/A;->F1(Z)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lx/z;->d:Lq0/n;

    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public Y(LR0/C;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx/z;->d:Lq0/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lq0/n;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    :cond_0
    invoke-static {p1, v1}, LR0/A;->X(LR0/C;Z)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lx/z$a;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lx/z$a;-><init>(Lx/z;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {p1, v1, v0, v2, v1}, LR0/A;->L(LR0/C;Ljava/lang/String;Lie/a;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public getShouldAutoInvalidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx/z;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public p(LI0/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx/z;->g:Lx/C;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx/C;->p(LI0/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
