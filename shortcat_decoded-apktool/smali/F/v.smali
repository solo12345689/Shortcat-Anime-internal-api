.class public final LF/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF/u;
.implements Landroidx/compose/ui/layout/l;


# instance fields
.field private final a:LF/o;

.field private final b:LI0/P;

.field private final c:LF/q;

.field private final d:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LF/o;LI0/P;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/v;->a:LF/o;

    .line 5
    .line 6
    iput-object p2, p0, LF/v;->b:LI0/P;

    .line 7
    .line 8
    invoke-virtual {p1}, LF/o;->d()Lie/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LF/q;

    .line 17
    .line 18
    iput-object p1, p0, LF/v;->c:LF/q;

    .line 19
    .line 20
    new-instance p1, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LF/v;->d:Ljava/util/HashMap;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public A(I)F
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->A(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public M0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)LI0/C;
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/l;->M0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)LI0/C;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public O(F)J
    .locals 2

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/l;->O(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public Q(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Li1/d;->Q(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public T(J)F
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Li1/l;->T(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->d0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public e1(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->e1(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g0(IJ)Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, LF/v;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, LF/v;->c:LF/q;

    .line 17
    .line 18
    invoke-interface {v0, p1}, LF/q;->d(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, LF/v;->c:LF/q;

    .line 23
    .line 24
    invoke-interface {v1, p1}, LF/q;->f(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, LF/v;->a:LF/o;

    .line 29
    .line 30
    invoke-virtual {v2, p1, v0, v1}, LF/o;->b(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, LF/v;->b:LI0/P;

    .line 35
    .line 36
    invoke-interface {v2, v0, v1}, LI0/P;->M(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    new-instance v2, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    :goto_0
    if-ge v3, v1, :cond_1

    .line 51
    .line 52
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, LI0/A;

    .line 57
    .line 58
    invoke-interface {v4, p2, p3}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p2, p0, LF/v;->d:Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-object v2
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/d;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getLayoutDirection()Li1/t;
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/m;->getLayoutDirection()Li1/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0}, Li1/l;->j1()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0}, LI0/m;->k0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public l1(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->l1(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public q1(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LI0/C;
    .locals 6

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-interface/range {v0 .. v5}, Landroidx/compose/ui/layout/l;->q1(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LI0/C;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public s0(F)I
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Li1/d;->s0(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public w1(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Li1/d;->w1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public z0(J)F
    .locals 1

    .line 1
    iget-object v0, p0, LF/v;->b:LI0/P;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Li1/d;->z0(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
