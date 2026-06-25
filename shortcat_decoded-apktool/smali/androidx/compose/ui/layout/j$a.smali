.class final Landroidx/compose/ui/layout/j$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/P;
.implements Landroidx/compose/ui/layout/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/layout/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final synthetic a:Landroidx/compose/ui/layout/j$c;

.field final synthetic b:Landroidx/compose/ui/layout/j;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/j$a;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroidx/compose/ui/layout/j;->l(Landroidx/compose/ui/layout/j;)Landroidx/compose/ui/layout/j$c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public A(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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

.method public M(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/layout/j;->m(Landroidx/compose/ui/layout/j;)Lt/P;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LK0/J;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/compose/ui/layout/j$a;->b:Landroidx/compose/ui/layout/j;

    .line 16
    .line 17
    invoke-static {v1}, Landroidx/compose/ui/layout/j;->k(Landroidx/compose/ui/layout/j;)LK0/J;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, LK0/J;->T()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, Landroidx/compose/ui/layout/j$a;->b:Landroidx/compose/ui/layout/j;

    .line 30
    .line 31
    invoke-static {v2}, Landroidx/compose/ui/layout/j;->i(Landroidx/compose/ui/layout/j;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ge v1, v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, LK0/J;->O()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->b:Landroidx/compose/ui/layout/j;

    .line 43
    .line 44
    invoke-static {v0, p1, p2}, Landroidx/compose/ui/layout/j;->c(Landroidx/compose/ui/layout/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
.end method

.method public M0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)LI0/C;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/j$c;->getDensity()F

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/j$c;->getLayoutDirection()Li1/t;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/j$c;->j1()F

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/j$c;->k0()Z

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/ui/layout/j$c;->q1(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)LI0/C;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/j$a;->a:Landroidx/compose/ui/layout/j$c;

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
