.class public final Landroidx/compose/ui/layout/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/layout/l;
.implements LI0/m;


# instance fields
.field private final synthetic a:LI0/m;

.field private final b:Li1/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LI0/m;Li1/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/layout/g;->b:Li1/t;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public A(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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

.method public O(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->b:Li1/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public j1()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    .locals 2

    .line 1
    const/4 p5, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    move p1, p5

    .line 5
    :cond_0
    if-gez p2, :cond_1

    .line 6
    .line 7
    move p2, p5

    .line 8
    :cond_1
    const/high16 v0, -0x1000000

    .line 9
    .line 10
    and-int v1, p1, v0

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    and-int/2addr v0, p2

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    const/4 p5, 0x1

    .line 18
    :cond_2
    if-nez p5, :cond_3

    .line 19
    .line 20
    new-instance p5, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v0, "Size("

    .line 26
    .line 27
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " x "

    .line 34
    .line 35
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ") is out of range. Each dimension must be between 0 and 16777215."

    .line 42
    .line 43
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p5

    .line 50
    invoke-static {p5}, LH0/a;->b(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    new-instance p5, Landroidx/compose/ui/layout/g$a;

    .line 54
    .line 55
    invoke-direct {p5, p1, p2, p3, p4}, Landroidx/compose/ui/layout/g$a;-><init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    return-object p5
.end method

.method public s0(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
    iget-object v0, p0, Landroidx/compose/ui/layout/g;->a:LI0/m;

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
