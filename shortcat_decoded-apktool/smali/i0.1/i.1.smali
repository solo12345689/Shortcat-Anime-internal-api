.class public final Li0/i;
.super Li0/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final g:Lkotlin/jvm/functions/Function1;

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(JLi0/p;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Li0/l;-><init>(JLi0/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    iput-object p4, p0, Li0/i;->g:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput p1, p0, Li0/i;->h:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public A()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/i;->g:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/l;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p0}, Li0/i;->n(Li0/l;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Li0/l;->d()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lj0/b;->d(Li0/l;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public bridge synthetic g()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/i;->A()Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public k()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public m(Li0/l;)V
    .locals 0

    .line 1
    iget p1, p0, Li0/i;->h:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iput p1, p0, Li0/i;->h:I

    .line 6
    .line 7
    return-void
.end method

.method public n(Li0/l;)V
    .locals 0

    .line 1
    iget p1, p0, Li0/i;->h:I

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    iput p1, p0, Li0/i;->h:I

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Li0/l;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public p(Li0/U;)V
    .locals 0

    .line 1
    invoke-static {}, Li0/v;->w()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, LTd/k;

    .line 5
    .line 6
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public x(Lkotlin/jvm/functions/Function1;)Li0/l;
    .locals 10

    .line 1
    invoke-static {p0}, Li0/v;->D(Li0/l;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lj0/b;->a()Lb0/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v0, p0, v2, p1, v1}, Lj0/b;->e(Lb0/e;Li0/l;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lj0/a;

    .line 21
    .line 22
    invoke-virtual {v2}, Lj0/a;->a()Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2}, Lj0/a;->b()Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/util/Map;

    .line 34
    .line 35
    move-object v2, p1

    .line 36
    move-object p1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v2, v1

    .line 39
    :goto_0
    new-instance v3, Li0/f;

    .line 40
    .line 41
    invoke-virtual {p0}, Li0/l;->i()J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    invoke-virtual {p0}, Li0/l;->f()Li0/p;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {p0}, Li0/i;->A()Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x4

    .line 55
    invoke-static {p1, v7, v8, v9, v1}, Li0/v;->Q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    move-object v8, p0

    .line 60
    invoke-direct/range {v3 .. v8}, Li0/f;-><init>(JLi0/p;Lkotlin/jvm/functions/Function1;Li0/l;)V

    .line 61
    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-static {v0, p0, v3, v2}, Lj0/b;->b(Lb0/e;Li0/l;Li0/l;Ljava/util/Map;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-object v3
.end method
