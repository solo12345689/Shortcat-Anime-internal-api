.class public final LLe/a0;
.super LLe/b0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final n:LOe/g;

.field private final o:LJe/c;


# direct methods
.method public constructor <init>(LKe/k;LOe/g;LJe/c;)V
    .locals 1

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "jClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ownerDescriptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, LLe/b0;-><init>(LKe/k;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LLe/a0;->n:LOe/g;

    .line 20
    .line 21
    iput-object p3, p0, LLe/a0;->o:LJe/c;

    .line 22
    .line 23
    return-void
.end method

.method static synthetic g0(LOe/q;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LLe/a0;->m0(LOe/q;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic h0(Ljf/k;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/a0;->o0(Ljf/k;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic i0(LXe/f;Ljf/k;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/a0;->n0(LXe/f;Ljf/k;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic j0(Lye/e;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/a0;->q0(Lye/e;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic k0(Lqf/S;)Lye/e;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/a0;->r0(Lqf/S;)Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final m0(LOe/q;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LOe/s;->P()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final n0(LXe/f;Ljf/k;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LGe/d;->o:LGe/d;

    .line 7
    .line 8
    invoke-interface {p1, p0, v0}, Ljf/k;->a(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method private static final o0(Ljf/k;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljf/k;->d()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
.end method

.method private final p0(Lye/e;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 3

    .line 1
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LLe/Y;->a:LLe/Y;

    .line 6
    .line 7
    new-instance v2, LLe/a0$a;

    .line 8
    .line 9
    invoke-direct {v2, p1, p2, p3}, LLe/a0$a;-><init>(Lye/e;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2}, LAf/b;->b(Ljava/util/Collection;LAf/b$c;LAf/b$d;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-object p2
.end method

.method private static final q0(Lye/e;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    invoke-interface {p0}, Lye/h;->l()Lqf/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lqf/v0;->k()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "getSupertypes(...)"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-static {p0}, LUd/u;->c0(Ljava/lang/Iterable;)LCf/i;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v0, LLe/Z;->a:LLe/Z;

    .line 21
    .line 22
    invoke-static {p0, v0}, LCf/l;->L(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, LCf/l;->u(LCf/i;)Ljava/lang/Iterable;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method private static final r0(Lqf/S;)Lye/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqf/S;->N0()Lqf/v0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lqf/v0;->p()Lye/h;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Lye/e;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Lye/e;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method private final t0(Lye/Z;)Lye/Z;
    .locals 2

    .line 1
    invoke-interface {p1}, Lye/b;->h()Lye/b$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lye/b$a;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-interface {p1}, Lye/Z;->e()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "getOverriddenDescriptors(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v1, 0xa

    .line 26
    .line 27
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lye/Z;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, v1}, LLe/a0;->t0(Lye/Z;)Lye/Z;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-static {v0}, LUd/u;->f0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, LUd/u;->M0(Ljava/util/List;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lye/Z;

    .line 70
    .line 71
    return-object p1
.end method

.method private final u0(LXe/f;Lye/e;)Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {p2}, LJe/h;->b(Lye/e;)LLe/a0;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object v0, LGe/d;->o:LGe/d;

    .line 13
    .line 14
    invoke-virtual {p2, p1, v0}, LLe/U;->c(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-static {p1}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method


# virtual methods
.method protected B(Ljava/util/Collection;LXe/f;)V
    .locals 7

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, p2, v0}, LLe/a0;->u0(LXe/f;Lye/e;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v2, v0

    .line 20
    check-cast v2, Ljava/util/Collection;

    .line 21
    .line 22
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, LKe/d;->c()Lmf/w;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, LKe/d;->k()Lrf/p;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Lrf/p;->b()Lbf/o;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    move-object v3, p1

    .line 55
    move-object v1, p2

    .line 56
    invoke-static/range {v1 .. v6}, LIe/a;->e(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Lye/e;Lmf/w;Lbf/o;)Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p2, "resolveOverridesForStaticMembers(...)"

    .line 61
    .line 62
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v3, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, LLe/a0;->n:LOe/g;

    .line 69
    .line 70
    invoke-interface {p1}, LOe/g;->v()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    sget-object p1, Lve/o;->f:LXe/f;

    .line 77
    .line 78
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_0

    .line 83
    .line 84
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lbf/h;->g(Lye/e;)Lye/g0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string p2, "createEnumValueOfMethod(...)"

    .line 93
    .line 94
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v3, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_0
    sget-object p1, Lve/o;->d:LXe/f;

    .line 102
    .line 103
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_1

    .line 108
    .line 109
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Lbf/h;->h(Lye/e;)Lye/g0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string p2, "createEnumValuesMethod(...)"

    .line 118
    .line 119
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v3, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :cond_1
    return-void
.end method

.method protected C(LXe/f;Ljava/util/Collection;)V
    .locals 9

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "result"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, LLe/X;

    .line 21
    .line 22
    invoke-direct {v2, p1}, LLe/X;-><init>(LXe/f;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, v1, v2}, LLe/a0;->p0(Lye/e;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const-string v2, "resolveOverridesForStaticMembers(...)"

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    move-object v4, v0

    .line 38
    check-cast v4, Ljava/util/Collection;

    .line 39
    .line 40
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, LKe/d;->c()Lmf/w;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, LKe/d;->k()Lrf/p;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, Lrf/p;->b()Lbf/o;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    move-object v3, p1

    .line 73
    move-object v5, p2

    .line 74
    invoke-static/range {v3 .. v8}, LIe/a;->e(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Lye/e;Lmf/w;Lbf/o;)Ljava/util/Collection;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v5, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :cond_0
    move-object v3, p1

    .line 87
    move-object v5, p2

    .line 88
    check-cast v0, Ljava/lang/Iterable;

    .line 89
    .line 90
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    move-object v1, v0

    .line 110
    check-cast v1, Lye/Z;

    .line 111
    .line 112
    invoke-direct {p0, v1}, LLe/a0;->t0(Lye/Z;)Lye/Z;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    if-nez v4, :cond_1

    .line 121
    .line 122
    new-instance v4, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {p1, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :cond_1
    check-cast v4, Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Ljava/util/Map$Entry;

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    move-object v4, v0

    .line 166
    check-cast v4, Ljava/util/Collection;

    .line 167
    .line 168
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, LKe/d;->c()Lmf/w;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, LKe/d;->k()Lrf/p;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-interface {v0}, Lrf/p;->b()Lbf/o;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    invoke-static/range {v3 .. v8}, LIe/a;->e(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Lye/e;Lmf/w;Lbf/o;)Ljava/util/Collection;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    check-cast v0, Ljava/lang/Iterable;

    .line 208
    .line 209
    invoke-static {p2, v0}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_3
    invoke-interface {v5, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 214
    .line 215
    .line 216
    :goto_2
    iget-object p1, p0, LLe/a0;->n:LOe/g;

    .line 217
    .line 218
    invoke-interface {p1}, LOe/g;->v()Z

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    if-eqz p1, :cond_4

    .line 223
    .line 224
    sget-object p1, Lve/o;->e:LXe/f;

    .line 225
    .line 226
    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eqz p1, :cond_4

    .line 231
    .line 232
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-static {p1}, Lbf/h;->f(Lye/e;)Lye/Z;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-static {v5, p1}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_4
    return-void
.end method

.method protected D(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 1

    .line 1
    const-string p2, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, LLe/c;

    .line 15
    .line 16
    invoke-interface {p1}, LLe/c;->e()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-static {p1}, LUd/u;->e1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    sget-object v0, LLe/W;->a:LLe/W;

    .line 31
    .line 32
    invoke-direct {p0, p2, p1, v0}, LLe/a0;->p0(Lye/e;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, LLe/a0;->n:LOe/g;

    .line 36
    .line 37
    invoke-interface {p2}, LOe/g;->v()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    sget-object p2, Lve/o;->e:LXe/f;

    .line 44
    .line 45
    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    return-object p1
.end method

.method public bridge synthetic R()Lye/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public e(LXe/f;LGe/b;)Lye/h;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "location"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method

.method protected l0()LLe/b;
    .locals 3

    .line 1
    new-instance v0, LLe/b;

    .line 2
    .line 3
    iget-object v1, p0, LLe/a0;->n:LOe/g;

    .line 4
    .line 5
    sget-object v2, LLe/V;->a:LLe/V;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LLe/b;-><init>(LOe/g;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method protected s0()LJe/c;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/a0;->o:LJe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method protected v(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 0

    .line 1
    const-string p2, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method protected x(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 2

    .line 1
    const-string p2, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, LLe/c;

    .line 15
    .line 16
    invoke-interface {p1}, LLe/c;->a()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-static {p1}, LUd/u;->e1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-static {p2}, LJe/h;->b(Lye/e;)LLe/a0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p2}, LLe/U;->b()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p2, 0x0

    .line 42
    :goto_0
    if-nez p2, :cond_1

    .line 43
    .line 44
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :cond_1
    check-cast p2, Ljava/util/Collection;

    .line 49
    .line 50
    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, LLe/a0;->n:LOe/g;

    .line 54
    .line 55
    invoke-interface {p2}, LOe/g;->v()Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    sget-object p2, Lve/o;->f:LXe/f;

    .line 62
    .line 63
    sget-object v0, Lve/o;->d:LXe/f;

    .line 64
    .line 65
    filled-new-array {p2, v0}, [LXe/f;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-static {p2}, LUd/u;->p([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2}, LKe/k;->a()LKe/d;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2}, LKe/d;->w()Lgf/f;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {p2, v0, v1}, Lgf/f;->b(Lye/e;LKe/k;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 101
    .line 102
    .line 103
    return-object p1
.end method

.method protected y(Ljava/util/Collection;LXe/f;)V
    .locals 3

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LKe/d;->w()Lgf/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, LLe/a0;->s0()LJe/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v0, v1, p2, p1, v2}, Lgf/f;->f(Lye/e;LXe/f;Ljava/util/Collection;LKe/k;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public bridge synthetic z()LLe/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/a0;->l0()LLe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
