.class final Landroidx/compose/ui/layout/k;
.super Landroidx/compose/ui/layout/s$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:LK0/T;


# direct methods
.method public constructor <init>(LK0/T;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/layout/s$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/k;->b:LK0/T;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected B()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/k;->b:LK0/T;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->S0()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/k;->b:LK0/T;

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

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/k;->b:LK0/T;

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

.method public q(Landroidx/compose/ui/layout/y;F)F
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/layout/y;->b()Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/layout/y;->b()Lkotlin/jvm/functions/Function2;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p1, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/layout/k;->b:LK0/T;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, LK0/T;->I1(Landroidx/compose/ui/layout/y;F)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method protected z()Li1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/k;->b:LK0/T;

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
