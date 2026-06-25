.class public abstract Lqf/p;
.super Lqf/v;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf/p$a;,
        Lqf/p$b;
    }
.end annotation


# instance fields
.field private final b:Lpf/i;

.field private final c:Z


# direct methods
.method public constructor <init>(Lpf/n;)V
    .locals 3

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqf/v;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lqf/h;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lqf/h;-><init>(Lqf/p;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lqf/i;->a:Lqf/i;

    .line 15
    .line 16
    new-instance v2, Lqf/j;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Lqf/j;-><init>(Lqf/p;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1, v2}, Lpf/n;->e(Lie/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lpf/i;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lqf/p;->b:Lpf/i;

    .line 26
    .line 27
    return-void
.end method

.method private static final A(Lqf/p;)Lqf/p$b;
    .locals 1

    .line 1
    new-instance v0, Lqf/p$b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqf/p;->r()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lqf/p$b;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private static final B(Z)Lqf/p$b;
    .locals 1

    .line 1
    new-instance p0, Lqf/p$b;

    .line 2
    .line 3
    sget-object v0, Lsf/l;->a:Lsf/l;

    .line 4
    .line 5
    invoke-virtual {v0}, Lsf/l;->l()Lqf/S;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0, v0}, Lqf/p$b;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method private static final C(Lqf/p;Lqf/p$b;)LTd/L;
    .locals 5

    .line 1
    const-string v0, "supertypes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lqf/p;->v()Lye/k0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Lqf/p$b;->a()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lqf/k;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lqf/k;-><init>(Lqf/p;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lqf/l;

    .line 20
    .line 21
    invoke-direct {v3, p0}, Lqf/l;-><init>(Lqf/p;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p0, v1, v2, v3}, Lye/k0;->a(Lqf/v0;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lqf/p;->s()Lqf/S;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v0, v2

    .line 47
    :goto_0
    if-nez v0, :cond_1

    .line 48
    .line 49
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_1
    invoke-virtual {p0}, Lqf/p;->u()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Lqf/p;->v()Lye/k0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v3, Lqf/m;

    .line 64
    .line 65
    invoke-direct {v3, p0}, Lqf/m;-><init>(Lqf/p;)V

    .line 66
    .line 67
    .line 68
    new-instance v4, Lqf/n;

    .line 69
    .line 70
    invoke-direct {v4, p0}, Lqf/n;-><init>(Lqf/p;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, p0, v0, v3, v4}, Lye/k0;->a(Lqf/v0;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 74
    .line 75
    .line 76
    :cond_2
    instance-of v1, v0, Ljava/util/List;

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    move-object v2, v0

    .line 81
    check-cast v2, Ljava/util/List;

    .line 82
    .line 83
    :cond_3
    if-nez v2, :cond_4

    .line 84
    .line 85
    check-cast v0, Ljava/lang/Iterable;

    .line 86
    .line 87
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :cond_4
    invoke-virtual {p0, v2}, Lqf/p;->x(Ljava/util/List;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p1, p0}, Lqf/p$b;->c(Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, LTd/L;->a:LTd/L;

    .line 99
    .line 100
    return-object p0
.end method

.method private static final D(Lqf/p;Lqf/v0;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lqf/p;->m(Lqf/v0;Z)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Iterable;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final E(Lqf/p;Lqf/S;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lqf/p;->z(Lqf/S;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, LTd/L;->a:LTd/L;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final F(Lqf/p;Lqf/v0;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, p1, v0}, Lqf/p;->m(Lqf/v0;Z)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ljava/lang/Iterable;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final G(Lqf/p;Lqf/S;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lqf/p;->y(Lqf/S;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, LTd/L;->a:LTd/L;

    .line 10
    .line 11
    return-object p0
.end method

.method static synthetic e(Lqf/p;)Lqf/p$b;
    .locals 0

    .line 1
    invoke-static {p0}, Lqf/p;->A(Lqf/p;)Lqf/p$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic f(Z)Lqf/p$b;
    .locals 0

    .line 1
    invoke-static {p0}, Lqf/p;->B(Z)Lqf/p$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g(Lqf/p;Lqf/p$b;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/p;->C(Lqf/p;Lqf/p$b;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic h(Lqf/p;Lqf/v0;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/p;->D(Lqf/p;Lqf/v0;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic i(Lqf/p;Lqf/S;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/p;->E(Lqf/p;Lqf/S;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic j(Lqf/p;Lqf/v0;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/p;->F(Lqf/p;Lqf/v0;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic l(Lqf/p;Lqf/S;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqf/p;->G(Lqf/p;Lqf/S;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final m(Lqf/v0;Z)Ljava/util/Collection;
    .locals 2

    .line 1
    instance-of v0, p1, Lqf/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lqf/p;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, v0, Lqf/p;->b:Lpf/i;

    .line 13
    .line 14
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lqf/p$b;

    .line 19
    .line 20
    invoke-virtual {v1}, Lqf/p$b;->a()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, p2}, Lqf/p;->t(Z)Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Ljava/lang/Iterable;

    .line 29
    .line 30
    invoke-static {v1, p2}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    return-object p2

    .line 37
    :cond_1
    invoke-interface {p1}, Lqf/v0;->k()Ljava/util/Collection;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p2, "getSupertypes(...)"

    .line 42
    .line 43
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p1
.end method


# virtual methods
.method public bridge synthetic k()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/p;->w()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public o(Lrf/g;)Lqf/v0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lqf/p$a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lqf/p$a;-><init>(Lqf/p;Lrf/g;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method protected abstract r()Ljava/util/Collection;
.end method

.method protected abstract s()Lqf/S;
.end method

.method protected t(Z)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lqf/p;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method protected abstract v()Lye/k0;
.end method

.method public w()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/p;->b:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqf/p$b;

    .line 8
    .line 9
    invoke-virtual {v0}, Lqf/p$b;->b()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method protected x(Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "supertypes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method protected y(Lqf/S;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected z(Lqf/S;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
