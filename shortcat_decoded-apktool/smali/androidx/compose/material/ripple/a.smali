.class public final Landroidx/compose/material/ripple/a;
.super Landroidx/compose/material/ripple/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/v1;
.implements LT/h;


# instance fields
.field private final c:Z

.field private final d:F

.field private final e:LY/h2;

.field private final f:LY/h2;

.field private final g:Landroid/view/ViewGroup;

.field private h:LT/g;

.field private final i:LY/C0;

.field private final j:LY/C0;

.field private k:J

.field private l:I

.field private final m:Lie/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(ZFLY/h2;LY/h2;Landroid/view/ViewGroup;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p4}, Landroidx/compose/material/ripple/d;-><init>(ZLY/h2;)V

    .line 3
    iput-boolean p1, p0, Landroidx/compose/material/ripple/a;->c:Z

    .line 4
    iput p2, p0, Landroidx/compose/material/ripple/a;->d:F

    .line 5
    iput-object p3, p0, Landroidx/compose/material/ripple/a;->e:LY/h2;

    .line 6
    iput-object p4, p0, Landroidx/compose/material/ripple/a;->f:LY/h2;

    .line 7
    iput-object p5, p0, Landroidx/compose/material/ripple/a;->g:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    const/4 p2, 0x2

    .line 8
    invoke-static {p1, p1, p2, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/material/ripple/a;->i:LY/C0;

    .line 9
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, p1, p2, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/material/ripple/a;->j:LY/C0;

    .line 10
    sget-object p1, Lr0/l;->b:Lr0/l$a;

    invoke-virtual {p1}, Lr0/l$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/material/ripple/a;->k:J

    const/4 p1, -0x1

    .line 11
    iput p1, p0, Landroidx/compose/material/ripple/a;->l:I

    .line 12
    new-instance p1, Landroidx/compose/material/ripple/a$a;

    invoke-direct {p1, p0}, Landroidx/compose/material/ripple/a$a;-><init>(Landroidx/compose/material/ripple/a;)V

    iput-object p1, p0, Landroidx/compose/material/ripple/a;->m:Lie/a;

    return-void
.end method

.method public synthetic constructor <init>(ZFLY/h2;LY/h2;Landroid/view/ViewGroup;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/material/ripple/a;-><init>(ZFLY/h2;LY/h2;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static final synthetic i(Landroidx/compose/material/ripple/a;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/ripple/a;->l()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic j(Landroidx/compose/material/ripple/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/material/ripple/a;->o(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final k()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->h:LT/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, LT/g;->a(LT/h;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private final l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->j:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final m()LT/g;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->h:LT/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->g:Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-static {v0}, LT/o;->a(Landroid/view/ViewGroup;)LT/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/compose/material/ripple/a;->h:LT/g;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private final n()LT/k;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->i:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LT/k;

    .line 8
    .line 9
    return-object v0
.end method

.method private final o(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->j:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final p(LT/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->i:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lu0/c;)V
    .locals 7

    .line 1
    invoke-interface {p1}, Lu0/f;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Landroidx/compose/material/ripple/a;->k:J

    .line 6
    .line 7
    iget v0, p0, Landroidx/compose/material/ripple/a;->d:F

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p0, Landroidx/compose/material/ripple/a;->c:Z

    .line 16
    .line 17
    invoke-interface {p1}, Lu0/f;->f()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-static {p1, v0, v1, v2}, LT/f;->a(Li1/d;ZJ)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Lke/a;->d(F)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget v0, p0, Landroidx/compose/material/ripple/a;->d:F

    .line 31
    .line 32
    invoke-interface {p1, v0}, Li1/d;->s0(F)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    :goto_0
    iput v0, p0, Landroidx/compose/material/ripple/a;->l:I

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->e:LY/h2;

    .line 39
    .line 40
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ls0/r0;

    .line 45
    .line 46
    invoke-virtual {v0}, Ls0/r0;->A()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    iget-object v0, p0, Landroidx/compose/material/ripple/a;->f:LY/h2;

    .line 51
    .line 52
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, LT/d;

    .line 57
    .line 58
    invoke-virtual {v0}, LT/d;->d()F

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-interface {p1}, Lu0/c;->B1()V

    .line 63
    .line 64
    .line 65
    iget v0, p0, Landroidx/compose/material/ripple/a;->d:F

    .line 66
    .line 67
    invoke-virtual {p0, p1, v0, v4, v5}, Landroidx/compose/material/ripple/d;->f(Lu0/f;FJ)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Lu0/f;->n1()Lu0/d;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Lu0/d;->b()Ls0/j0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-direct {p0}, Landroidx/compose/material/ripple/a;->l()Z

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, Landroidx/compose/material/ripple/a;->n()LT/k;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    invoke-interface {p1}, Lu0/f;->f()J

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    invoke-virtual/range {v1 .. v6}, LT/k;->f(JJF)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Ls0/E;->d(Ls0/j0;)Landroid/graphics/Canvas;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v1, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    return-void
.end method

.method public b(LB/o$b;LGf/O;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/ripple/a;->m()LT/g;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2, p0}, LT/g;->b(LT/h;)LT/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v2, p0, Landroidx/compose/material/ripple/a;->c:Z

    .line 10
    .line 11
    iget-wide v3, p0, Landroidx/compose/material/ripple/a;->k:J

    .line 12
    .line 13
    iget v5, p0, Landroidx/compose/material/ripple/a;->l:I

    .line 14
    .line 15
    iget-object p2, p0, Landroidx/compose/material/ripple/a;->e:LY/h2;

    .line 16
    .line 17
    invoke-interface {p2}, LY/h2;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Ls0/r0;

    .line 22
    .line 23
    invoke-virtual {p2}, Ls0/r0;->A()J

    .line 24
    .line 25
    .line 26
    move-result-wide v6

    .line 27
    iget-object p2, p0, Landroidx/compose/material/ripple/a;->f:LY/h2;

    .line 28
    .line 29
    invoke-interface {p2}, LY/h2;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, LT/d;

    .line 34
    .line 35
    invoke-virtual {p2}, LT/d;->d()F

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    iget-object v9, p0, Landroidx/compose/material/ripple/a;->m:Lie/a;

    .line 40
    .line 41
    move-object v1, p1

    .line 42
    invoke-virtual/range {v0 .. v9}, LT/k;->b(LB/o$b;ZJIJFLie/a;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, v0}, Landroidx/compose/material/ripple/a;->p(LT/k;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public b1()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/material/ripple/a;->p(LT/k;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/ripple/a;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/ripple/a;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public g(LB/o$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/material/ripple/a;->n()LT/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, LT/k;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
