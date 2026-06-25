.class final LK0/y$b;
.super LK0/U;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic w:LK0/y;


# direct methods
.method public constructor <init>(LK0/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/y$b;->w:LK0/y;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LK0/U;-><init>(LK0/e0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public I(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/U;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/J;->j1(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public Z(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/U;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/J;->n1(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method protected k2()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/U;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK0/J;->i0()LK0/V;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, LK0/V;->d2()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public l0(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/U;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/J;->o1(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public q0(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/U;->L1()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LK0/J;->k1(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public v0(J)Landroidx/compose/ui/layout/s;
    .locals 5

    .line 1
    invoke-static {p0, p1, p2}, LK0/U;->c2(LK0/U;J)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LK0/U;->L1()LK0/J;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LK0/J;->I0()La0/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, v0, La0/c;->a:[Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0}, La0/c;->p()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    if-ge v2, v0, :cond_0

    .line 20
    .line 21
    aget-object v3, v1, v2

    .line 22
    .line 23
    check-cast v3, LK0/J;

    .line 24
    .line 25
    invoke-virtual {v3}, LK0/J;->i0()LK0/V;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v4, LK0/J$g;->c:LK0/J$g;

    .line 33
    .line 34
    invoke-virtual {v3, v4}, LK0/V;->n2(LK0/J$g;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, LK0/U;->L1()LK0/J;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, LK0/J;->n0()LI0/B;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, LK0/U;->L1()LK0/J;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, LK0/J;->N()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v0, p0, v1, p1, p2}, LI0/B;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p0, p1}, LK0/U;->d2(LK0/U;LI0/C;)V

    .line 61
    .line 62
    .line 63
    return-object p0
.end method

.method public y1(LI0/a;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, LK0/U;->e2()LK0/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LK0/b;->L()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/high16 v0, -0x80000000

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p0}, LK0/U;->g2()Lt/K;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, p1, v0}, Lt/K;->u(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    return v0
.end method
