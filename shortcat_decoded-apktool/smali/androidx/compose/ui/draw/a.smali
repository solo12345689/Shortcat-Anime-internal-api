.class final Landroidx/compose/ui/draw/a;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lp0/e;
.implements LK0/j0;
.implements Lp0/d;


# instance fields
.field private final a:Lp0/f;

.field private b:Z

.field private c:Landroidx/compose/ui/draw/e;

.field private d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lp0/f;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/draw/a;->a:Lp0/f;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/draw/a;->d:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lp0/f;->q(Lp0/d;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Landroidx/compose/ui/draw/a$a;

    .line 12
    .line 13
    invoke-direct {p2, p0}, Landroidx/compose/ui/draw/a$a;-><init>(Landroidx/compose/ui/draw/a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lp0/f;->I(Lie/a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final G1(Lu0/c;)Lp0/j;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/draw/a;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/draw/a;->a:Lp0/f;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lp0/f;->B(Lp0/j;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lp0/f;->z(Lu0/c;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Landroidx/compose/ui/draw/a$b;

    .line 15
    .line 16
    invoke-direct {p1, p0, v0}, Landroidx/compose/ui/draw/a$b;-><init>(Landroidx/compose/ui/draw/a;Lp0/f;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, p1}, LK0/k0;->a(Landroidx/compose/ui/e$c;Lie/a;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lp0/f;->b()Lp0/j;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Landroidx/compose/ui/draw/a;->b:Z

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p1, "DrawResult not defined, did you forget to call onDraw?"

    .line 33
    .line 34
    invoke-static {p1}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 35
    .line 36
    .line 37
    new-instance p1, LTd/k;

    .line 38
    .line 39
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/compose/ui/draw/a;->a:Lp0/f;

    .line 44
    .line 45
    invoke-virtual {p1}, Lp0/f;->b()Lp0/j;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method


# virtual methods
.method public final E1()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draw/a;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F1()Ls0/Z0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draw/a;->c:Landroidx/compose/ui/draw/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/draw/e;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/compose/ui/draw/e;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/compose/ui/draw/a;->c:Landroidx/compose/ui/draw/e;

    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/draw/e;->c()Ls0/Z0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, LK0/k;->k(LK0/j;)Ls0/Z0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Landroidx/compose/ui/draw/e;->e(Ls0/Z0;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-object v0
.end method

.method public H0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draw/a;->c:Landroidx/compose/ui/draw/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/draw/e;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Landroidx/compose/ui/draw/a;->b:Z

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/ui/draw/a;->a:Lp0/f;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Lp0/f;->B(Lp0/j;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, LK0/u;->a(LK0/t;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final H1(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/draw/a;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->H0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public draw(Lu0/c;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/draw/a;->G1(Lu0/c;)Lp0/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lp0/j;->a()Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, LK0/g0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p0, v0}, LK0/k;->i(LK0/j;I)LK0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LK0/e0;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Li1/s;->d(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
.end method

.method public getDensity()Li1/d;
    .locals 1

    .line 1
    invoke-static {p0}, LK0/k;->j(LK0/j;)Li1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    invoke-static {p0}, LK0/k;->m(LK0/j;)Li1/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public onDensityChange()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->H0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/e$c;->onDetach()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/ui/draw/a;->c:Landroidx/compose/ui/draw/e;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/compose/ui/draw/e;->d()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onLayoutDirectionChange()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->H0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onMeasureResultChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->H0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onReset()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/e$c;->onReset()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->H0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public q0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/a;->H0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
