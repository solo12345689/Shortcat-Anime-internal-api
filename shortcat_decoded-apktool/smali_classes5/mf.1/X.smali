.class public final Lmf/X;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lmf/p;

.field private final b:Lmf/X;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lkotlin/jvm/functions/Function1;

.field private final f:Lkotlin/jvm/functions/Function1;

.field private final g:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lmf/p;Lmf/X;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameterProtos"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "debugName"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "containerPresentableName"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lmf/X;->a:Lmf/p;

    .line 25
    .line 26
    iput-object p2, p0, Lmf/X;->b:Lmf/X;

    .line 27
    .line 28
    iput-object p4, p0, Lmf/X;->c:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p5, p0, Lmf/X;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    new-instance p4, Lmf/S;

    .line 37
    .line 38
    invoke-direct {p4, p0}, Lmf/S;-><init>(Lmf/X;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p2, p4}, Lpf/n;->d(Lkotlin/jvm/functions/Function1;)Lpf/h;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iput-object p2, p0, Lmf/X;->e:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Lmf/T;

    .line 52
    .line 53
    invoke-direct {p2, p0}, Lmf/T;-><init>(Lmf/X;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p2}, Lpf/n;->d(Lkotlin/jvm/functions/Function1;)Lpf/h;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lmf/X;->f:Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_0

    .line 67
    .line 68
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :cond_0
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const/4 p3, 0x0

    .line 83
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result p4

    .line 87
    if-eqz p4, :cond_1

    .line 88
    .line 89
    add-int/lit8 p4, p3, 0x1

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p5

    .line 95
    check-cast p5, LSe/t;

    .line 96
    .line 97
    invoke-virtual {p5}, LSe/t;->N()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v1, Lof/S;

    .line 106
    .line 107
    iget-object v2, p0, Lmf/X;->a:Lmf/p;

    .line 108
    .line 109
    invoke-direct {v1, v2, p5, p3}, Lof/S;-><init>(Lmf/p;LSe/t;I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move p3, p4

    .line 116
    goto :goto_0

    .line 117
    :cond_1
    :goto_1
    iput-object p1, p0, Lmf/X;->g:Ljava/util/Map;

    .line 118
    .line 119
    return-void
.end method

.method private static final A(LSe/r;)I
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LSe/r;->V()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method static synthetic a(Lmf/X;I)Lye/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lmf/X;->f(Lmf/X;I)Lye/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lmf/X;I)Lye/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lmf/X;->v(Lmf/X;I)Lye/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(Lmf/X;LSe/r;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lmf/X;->r(Lmf/X;LSe/r;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic d(Lmf/X;LSe/r;)LSe/r;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lmf/X;->z(Lmf/X;LSe/r;)LSe/r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic e(LSe/r;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lmf/X;->A(LSe/r;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final f(Lmf/X;I)Lye/h;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lmf/X;->g(I)Lye/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final g(I)Lye/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/p;->g()LUe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, LXe/b;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 18
    .line 19
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Lmf/n;->b(LXe/b;)Lye/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 29
    .line 30
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lmf/n;->q()Lye/H;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0, p1}, Lye/y;->c(Lye/H;LXe/b;)Lye/h;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method private final h(I)Lqf/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/p;->g()LUe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, LXe/b;->i()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lmf/X;->a:Lmf/p;

    .line 18
    .line 19
    invoke-virtual {p1}, Lmf/p;->c()Lmf/n;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lmf/n;->o()Lmf/B;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Lmf/B;->a()Lqf/d0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method private final i(I)Lye/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/p;->g()LUe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, LXe/b;->i()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 20
    .line 21
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lmf/n;->q()Lye/H;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, p1}, Lye/y;->f(Lye/H;LXe/b;)Lye/l0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method private final j(Lqf/S;Lqf/S;)Lqf/d0;
    .locals 8

    .line 1
    invoke-static {p1}, Lvf/d;->n(Lqf/S;)Lve/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lqf/S;->getAnnotations()Lze/h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p1}, Lve/h;->k(Lqf/S;)Lqf/S;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {p1}, Lve/h;->e(Lqf/S;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {p1}, Lve/h;->m(Lqf/S;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/4 v5, 0x1

    .line 22
    invoke-static {v4, v5}, LUd/u;->h0(Ljava/util/List;I)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    move-object v5, v4

    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/16 v6, 0xa

    .line 30
    .line 31
    invoke-static {v5, v6}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_0

    .line 47
    .line 48
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Lqf/B0;

    .line 53
    .line 54
    invoke-interface {v6}, Lqf/B0;->getType()Lqf/S;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v5, 0x0

    .line 63
    const/4 v7, 0x1

    .line 64
    move-object v6, p2

    .line 65
    invoke-static/range {v0 .. v7}, Lve/h;->b(Lve/i;Lze/h;Lqf/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;Z)Lqf/d0;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p1}, Lqf/S;->O0()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {p2, p1}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
.end method

.method private final k(Lqf/r0;Lqf/v0;Ljava/util/List;Z)Lqf/d0;
    .locals 8

    .line 1
    invoke-interface {p2}, Lqf/v0;->getParameters()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    :cond_0
    move-object v3, p3

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sub-int/2addr v0, v2

    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {p2}, Lqf/v0;->n()Lve/i;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v0}, Lve/i;->Y(I)Lye/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Lye/h;->l()Lqf/v0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v0, "getTypeConstructor(...)"

    .line 42
    .line 43
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/16 v6, 0x10

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    move-object v1, p1

    .line 51
    move-object v3, p3

    .line 52
    move v4, p4

    .line 53
    invoke-static/range {v1 .. v7}, Lqf/V;->k(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;ILjava/lang/Object;)Lqf/d0;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v1, p1

    .line 59
    move-object v3, p3

    .line 60
    move v4, p4

    .line 61
    invoke-direct {p0, v1, p2, v3, v4}, Lmf/X;->l(Lqf/r0;Lqf/v0;Ljava/util/List;Z)Lqf/d0;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_0
    if-nez v1, :cond_3

    .line 66
    .line 67
    sget-object p1, Lsf/l;->a:Lsf/l;

    .line 68
    .line 69
    sget-object p3, Lsf/k;->n0:Lsf/k;

    .line 70
    .line 71
    const/4 p4, 0x0

    .line 72
    new-array p4, p4, [Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1, p3, v3, p2, p4}, Lsf/l;->f(Lsf/k;Ljava/util/List;Lqf/v0;[Ljava/lang/String;)Lsf/i;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_3
    return-object v1
.end method

.method private final l(Lqf/r0;Lqf/v0;Ljava/util/List;Z)Lqf/d0;
    .locals 7

    .line 1
    const/16 v5, 0x10

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v4, 0x0

    .line 5
    move-object v0, p1

    .line 6
    move-object v1, p2

    .line 7
    move-object v2, p3

    .line 8
    move v3, p4

    .line 9
    invoke-static/range {v0 .. v6}, Lqf/V;->k(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;ILjava/lang/Object;)Lqf/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lve/h;->q(Lqf/S;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-direct {p0, p1}, Lmf/X;->t(Lqf/S;)Lqf/d0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method private final n(I)Lye/m0;
    .locals 2

    .line 1
    iget-object v0, p0, Lmf/X;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lye/m0;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lmf/X;->b:Lmf/X;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lmf/X;->n(I)Lye/m0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_1
    return-object v0
.end method

.method private static final p(LSe/r;Lmf/X;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, LSe/r;->W()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getArgumentList(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Lmf/X;->a:Lmf/p;

    .line 11
    .line 12
    invoke-virtual {v1}, Lmf/p;->j()LUe/h;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p0, v1}, LUe/g;->j(LSe/r;LUe/h;)LSe/r;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-static {p0, p1}, Lmf/X;->p(LSe/r;Lmf/X;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-nez p0, :cond_1

    .line 29
    .line 30
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_1
    invoke-static {v0, p0}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static synthetic q(Lmf/X;LSe/r;ZILjava/lang/Object;)Lqf/d0;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lmf/X;->o(LSe/r;Z)Lqf/d0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final r(Lmf/X;LSe/r;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lmf/n;->d()Lmf/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lmf/X;->a:Lmf/p;

    .line 12
    .line 13
    invoke-virtual {p0}, Lmf/p;->g()LUe/d;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {v0, p1, p0}, Lmf/h;->i(LSe/r;LUe/d;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final s(Ljava/util/List;Lze/h;Lqf/v0;Lye/m;)Lqf/r0;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lqf/q0;

    .line 27
    .line 28
    invoke-interface {v1, p2, p3, p4}, Lqf/q0;->a(Lze/h;Lqf/v0;Lye/m;)Lqf/r0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v0}, LUd/u;->z(Ljava/lang/Iterable;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object p2, Lqf/r0;->b:Lqf/r0$a;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Lqf/r0$a;->j(Ljava/util/List;)Lqf/r0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method private final t(Lqf/S;)Lqf/d0;
    .locals 5

    .line 1
    invoke-static {p1}, Lve/h;->m(Lqf/S;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lqf/B0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    invoke-interface {v0}, Lqf/B0;->getType()Lqf/S;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_0
    invoke-virtual {v0}, Lqf/S;->N0()Lqf/v0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Lqf/v0;->p()Lye/h;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-static {v2}, Lff/e;->o(Lye/m;)LXe/c;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v2, v1

    .line 37
    :goto_0
    invoke-virtual {v0}, Lqf/S;->L0()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, 0x1

    .line 46
    if-ne v3, v4, :cond_6

    .line 47
    .line 48
    sget-object v3, Lve/o;->v:LXe/c;

    .line 49
    .line 50
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    invoke-static {}, Lmf/Y;->a()LXe/c;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0}, Lqf/S;->L0()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, LUd/u;->M0(Ljava/util/List;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lqf/B0;

    .line 76
    .line 77
    invoke-interface {v0}, Lqf/B0;->getType()Lqf/S;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v2, "getType(...)"

    .line 82
    .line 83
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lmf/X;->a:Lmf/p;

    .line 87
    .line 88
    invoke-virtual {v2}, Lmf/p;->e()Lye/m;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    instance-of v3, v2, Lye/a;

    .line 93
    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    check-cast v2, Lye/a;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object v2, v1

    .line 100
    :goto_1
    if-eqz v2, :cond_4

    .line 101
    .line 102
    invoke-static {v2}, Lff/e;->k(Lye/m;)LXe/c;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :cond_4
    sget-object v2, Lmf/Q;->a:LXe/c;

    .line 107
    .line 108
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-direct {p0, p1, v0}, Lmf/X;->j(Lqf/S;Lqf/S;)Lqf/d0;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    :cond_5
    invoke-direct {p0, p1, v0}, Lmf/X;->j(Lqf/S;Lqf/S;)Lqf/d0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    :cond_6
    :goto_2
    check-cast p1, Lqf/d0;

    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_7
    :goto_3
    return-object v1
.end method

.method private static final v(Lmf/X;I)Lye/h;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lmf/X;->i(I)Lye/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final w(Lye/m0;LSe/r$b;)Lqf/B0;
    .locals 2

    .line 1
    invoke-virtual {p2}, LSe/r$b;->y()LSe/r$b$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LSe/r$b$c;->e:LSe/r$b$c;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lqf/i0;

    .line 12
    .line 13
    iget-object p2, p0, Lmf/X;->a:Lmf/p;

    .line 14
    .line 15
    invoke-virtual {p2}, Lmf/p;->c()Lmf/n;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Lmf/n;->q()Lye/H;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Lye/H;->n()Lve/i;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, Lqf/i0;-><init>(Lve/i;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    new-instance p2, Lqf/k0;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lqf/k0;-><init>(Lye/m0;)V

    .line 34
    .line 35
    .line 36
    return-object p2

    .line 37
    :cond_1
    sget-object p1, Lmf/O;->a:Lmf/O;

    .line 38
    .line 39
    invoke-virtual {p2}, LSe/r$b;->y()LSe/r$b$c;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "getProjection(...)"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lmf/O;->c(LSe/r$b$c;)Lqf/N0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 53
    .line 54
    invoke-virtual {v0}, Lmf/p;->j()LUe/h;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {p2, v0}, LUe/g;->p(LSe/r$b;LUe/h;)LSe/r;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    new-instance p1, Lqf/D0;

    .line 65
    .line 66
    sget-object v0, Lsf/k;->X0:Lsf/k;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    filled-new-array {p2}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {v0, p2}, Lsf/l;->d(Lsf/k;[Ljava/lang/String;)Lsf/i;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p1, p2}, Lqf/D0;-><init>(Lqf/S;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_2
    new-instance p2, Lqf/D0;

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lmf/X;->u(LSe/r;)Lqf/S;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {p2, p1, v0}, Lqf/D0;-><init>(Lqf/N0;Lqf/S;)V

    .line 91
    .line 92
    .line 93
    return-object p2
.end method

.method private final x(LSe/r;)Lqf/v0;
    .locals 3

    .line 1
    invoke-virtual {p1}, LSe/r;->m0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lmf/X;->e:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    invoke-virtual {p1}, LSe/r;->X()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lye/h;

    .line 22
    .line 23
    if-nez v0, :cond_5

    .line 24
    .line 25
    invoke-virtual {p1}, LSe/r;->X()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {p0, p1, v0}, Lmf/X;->y(Lmf/X;LSe/r;I)Lye/e;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1}, LSe/r;->v0()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, LSe/r;->i0()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-direct {p0, v0}, Lmf/X;->n(I)Lye/m0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    sget-object v0, Lsf/l;->a:Lsf/l;

    .line 52
    .line 53
    sget-object v1, Lsf/k;->l0:Lsf/k;

    .line 54
    .line 55
    invoke-virtual {p1}, LSe/r;->i0()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v2, p0, Lmf/X;->d:Ljava/lang/String;

    .line 64
    .line 65
    filled-new-array {p1, v2}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, v1, p1}, Lsf/l;->e(Lsf/k;[Ljava/lang/String;)Lsf/j;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_1
    invoke-virtual {p1}, LSe/r;->w0()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 81
    .line 82
    invoke-virtual {v0}, Lmf/p;->g()LUe/d;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1}, LSe/r;->j0()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-interface {v0, p1}, LUe/d;->getString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0}, Lmf/X;->m()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_3

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    move-object v2, v1

    .line 113
    check-cast v2, Lye/m0;

    .line 114
    .line 115
    invoke-interface {v2}, Lye/J;->getName()LXe/f;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, LXe/f;->b()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    const/4 v1, 0x0

    .line 131
    :goto_0
    move-object v0, v1

    .line 132
    check-cast v0, Lye/m0;

    .line 133
    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    sget-object v0, Lsf/l;->a:Lsf/l;

    .line 137
    .line 138
    sget-object v1, Lsf/k;->m0:Lsf/k;

    .line 139
    .line 140
    iget-object v2, p0, Lmf/X;->a:Lmf/p;

    .line 141
    .line 142
    invoke-virtual {v2}, Lmf/p;->e()Lye/m;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    filled-new-array {p1, v2}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v0, v1, p1}, Lsf/l;->e(Lsf/k;[Ljava/lang/String;)Lsf/j;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    return-object p1

    .line 159
    :cond_4
    invoke-virtual {p1}, LSe/r;->u0()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    iget-object v0, p0, Lmf/X;->f:Lkotlin/jvm/functions/Function1;

    .line 166
    .line 167
    invoke-virtual {p1}, LSe/r;->h0()I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Lye/h;

    .line 180
    .line 181
    if-nez v0, :cond_5

    .line 182
    .line 183
    invoke-virtual {p1}, LSe/r;->h0()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-static {p0, p1, v0}, Lmf/X;->y(Lmf/X;LSe/r;I)Lye/e;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :cond_5
    :goto_1
    invoke-interface {v0}, Lye/h;->l()Lqf/v0;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    const-string v0, "getTypeConstructor(...)"

    .line 196
    .line 197
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object p1

    .line 201
    :cond_6
    sget-object p1, Lsf/l;->a:Lsf/l;

    .line 202
    .line 203
    sget-object v0, Lsf/k;->p0:Lsf/k;

    .line 204
    .line 205
    const/4 v1, 0x0

    .line 206
    new-array v1, v1, [Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {p1, v0, v1}, Lsf/l;->e(Lsf/k;[Ljava/lang/String;)Lsf/j;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    return-object p1
.end method

.method private static final y(Lmf/X;LSe/r;I)Lye/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/p;->g()LUe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p2}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    new-instance v0, Lmf/V;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lmf/V;-><init>(Lmf/X;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, LCf/l;->p(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, Lmf/W;->a:Lmf/W;

    .line 21
    .line 22
    invoke-static {p1, v0}, LCf/l;->K(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, LCf/l;->U(LCf/i;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object v0, Lmf/X$a;->b:Lmf/X$a;

    .line 31
    .line 32
    invoke-static {p2, v0}, LCf/l;->p(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, LCf/l;->w(LCf/i;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-ge v1, v0, :cond_0

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object p0, p0, Lmf/X;->a:Lmf/p;

    .line 56
    .line 57
    invoke-virtual {p0}, Lmf/p;->c()Lmf/n;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Lmf/n;->r()Lye/M;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0, p2, p1}, Lye/M;->d(LXe/b;Ljava/util/List;)Lye/e;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method private static final z(Lmf/X;LSe/r;)LSe/r;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lmf/X;->a:Lmf/p;

    .line 7
    .line 8
    invoke-virtual {p0}, Lmf/p;->j()LUe/h;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p1, p0}, LUe/g;->j(LSe/r;LUe/h;)LSe/r;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final m()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/X;->g:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final o(LSe/r;Z)Lqf/d0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "proto"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, LSe/r;->m0()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, LSe/r;->X()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v2}, Lmf/X;->h(I)Lqf/d0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, LSe/r;->u0()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, LSe/r;->h0()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-direct {v0, v2}, Lmf/X;->h(I)Lqf/d0;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v2, 0x0

    .line 41
    :goto_0
    if-eqz v2, :cond_2

    .line 42
    .line 43
    return-object v2

    .line 44
    :cond_2
    invoke-direct/range {p0 .. p1}, Lmf/X;->x(LSe/r;)Lqf/v0;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v4}, Lqf/v0;->p()Lye/h;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, Lsf/l;->m(Lye/m;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    sget-object v1, Lsf/l;->a:Lsf/l;

    .line 59
    .line 60
    sget-object v2, Lsf/k;->S0:Lsf/k;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    filled-new-array {v3}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v1, v2, v4, v3}, Lsf/l;->c(Lsf/k;Lqf/v0;[Ljava/lang/String;)Lsf/i;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    return-object v1

    .line 75
    :cond_3
    new-instance v2, Lof/a;

    .line 76
    .line 77
    iget-object v3, v0, Lmf/X;->a:Lmf/p;

    .line 78
    .line 79
    invoke-virtual {v3}, Lmf/p;->h()Lpf/n;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    new-instance v5, Lmf/U;

    .line 84
    .line 85
    invoke-direct {v5, v0, v1}, Lmf/U;-><init>(Lmf/X;LSe/r;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v2, v3, v5}, Lof/a;-><init>(Lpf/n;Lie/a;)V

    .line 89
    .line 90
    .line 91
    iget-object v3, v0, Lmf/X;->a:Lmf/p;

    .line 92
    .line 93
    invoke-virtual {v3}, Lmf/p;->c()Lmf/n;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Lmf/n;->v()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-object v5, v0, Lmf/X;->a:Lmf/p;

    .line 102
    .line 103
    invoke-virtual {v5}, Lmf/p;->e()Lye/m;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-direct {v0, v3, v2, v4, v5}, Lmf/X;->s(Ljava/util/List;Lze/h;Lqf/v0;Lye/m;)Lqf/r0;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v1, v0}, Lmf/X;->p(LSe/r;Lmf/X;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    new-instance v6, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v7, 0xa

    .line 118
    .line 119
    invoke-static {v5, v7}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const/4 v10, 0x0

    .line 131
    move v7, v10

    .line 132
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_5

    .line 137
    .line 138
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    add-int/lit8 v9, v7, 0x1

    .line 143
    .line 144
    if-gez v7, :cond_4

    .line 145
    .line 146
    invoke-static {}, LUd/u;->w()V

    .line 147
    .line 148
    .line 149
    :cond_4
    check-cast v8, LSe/r$b;

    .line 150
    .line 151
    invoke-interface {v4}, Lqf/v0;->getParameters()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    const-string v12, "getParameters(...)"

    .line 156
    .line 157
    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v11, v7}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    check-cast v7, Lye/m0;

    .line 165
    .line 166
    invoke-direct {v0, v7, v8}, Lmf/X;->w(Lye/m0;LSe/r$b;)Lqf/B0;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move v7, v9

    .line 174
    goto :goto_1

    .line 175
    :cond_5
    invoke-static {v6}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-interface {v4}, Lqf/v0;->p()Lye/h;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    if-eqz p2, :cond_8

    .line 184
    .line 185
    instance-of v7, v6, Lye/l0;

    .line 186
    .line 187
    if-eqz v7, :cond_8

    .line 188
    .line 189
    check-cast v6, Lye/l0;

    .line 190
    .line 191
    invoke-static {v6, v5}, Lqf/V;->c(Lye/l0;Ljava/util/List;)Lqf/d0;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    iget-object v5, v0, Lmf/X;->a:Lmf/p;

    .line 196
    .line 197
    invoke-virtual {v5}, Lmf/p;->c()Lmf/n;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5}, Lmf/n;->v()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    sget-object v6, Lze/h;->k0:Lze/h$a;

    .line 206
    .line 207
    invoke-virtual {v3}, Lqf/S;->getAnnotations()Lze/h;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-static {v2, v7}, LUd/u;->G0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v6, v2}, Lze/h$a;->a(Ljava/util/List;)Lze/h;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    iget-object v6, v0, Lmf/X;->a:Lmf/p;

    .line 220
    .line 221
    invoke-virtual {v6}, Lmf/p;->e()Lye/m;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-direct {v0, v5, v2, v4, v6}, Lmf/X;->s(Ljava/util/List;Lze/h;Lqf/v0;Lye/m;)Lqf/r0;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-static {v3}, Lqf/W;->b(Lqf/S;)Z

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    if-nez v4, :cond_7

    .line 234
    .line 235
    invoke-virtual {v1}, LSe/r;->e0()Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_6

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_6
    move v4, v10

    .line 243
    goto :goto_3

    .line 244
    :cond_7
    :goto_2
    const/4 v4, 0x1

    .line 245
    :goto_3
    invoke-virtual {v3, v4}, Lqf/d0;->U0(Z)Lqf/d0;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-virtual {v3, v2}, Lqf/d0;->V0(Lqf/r0;)Lqf/d0;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    goto :goto_4

    .line 254
    :cond_8
    sget-object v2, LUe/b;->a:LUe/b$b;

    .line 255
    .line 256
    invoke-virtual {v1}, LSe/r;->a0()I

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    invoke-virtual {v2, v6}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_9

    .line 269
    .line 270
    invoke-virtual {v1}, LSe/r;->e0()Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-direct {v0, v3, v4, v5, v2}, Lmf/X;->k(Lqf/r0;Lqf/v0;Ljava/util/List;Z)Lqf/d0;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    goto :goto_4

    .line 279
    :cond_9
    invoke-virtual {v1}, LSe/r;->e0()Z

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    const/16 v8, 0x10

    .line 284
    .line 285
    const/4 v9, 0x0

    .line 286
    const/4 v7, 0x0

    .line 287
    invoke-static/range {v3 .. v9}, Lqf/V;->k(Lqf/r0;Lqf/v0;Ljava/util/List;ZLrf/g;ILjava/lang/Object;)Lqf/d0;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    sget-object v2, LUe/b;->b:LUe/b$b;

    .line 292
    .line 293
    invoke-virtual {v1}, LSe/r;->a0()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    invoke-virtual {v2, v3}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_b

    .line 306
    .line 307
    sget-object v11, Lqf/y;->d:Lqf/y$a;

    .line 308
    .line 309
    const/4 v15, 0x4

    .line 310
    const/16 v16, 0x0

    .line 311
    .line 312
    const/4 v13, 0x1

    .line 313
    const/4 v14, 0x0

    .line 314
    invoke-static/range {v11 .. v16}, Lqf/y$a;->c(Lqf/y$a;Lqf/M0;ZZILjava/lang/Object;)Lqf/y;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    if-eqz v2, :cond_a

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 322
    .line 323
    new-instance v2, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const-string v3, "null DefinitelyNotNullType for \'"

    .line 329
    .line 330
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const/16 v3, 0x27

    .line 337
    .line 338
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw v1

    .line 353
    :cond_b
    move-object v2, v12

    .line 354
    :goto_4
    iget-object v3, v0, Lmf/X;->a:Lmf/p;

    .line 355
    .line 356
    invoke-virtual {v3}, Lmf/p;->j()LUe/h;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-static {v1, v3}, LUe/g;->a(LSe/r;LUe/h;)LSe/r;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    if-eqz v1, :cond_d

    .line 365
    .line 366
    invoke-virtual {v0, v1, v10}, Lmf/X;->o(LSe/r;Z)Lqf/d0;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-static {v2, v1}, Lqf/h0;->j(Lqf/d0;Lqf/d0;)Lqf/d0;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    if-nez v1, :cond_c

    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_c
    return-object v1

    .line 378
    :cond_d
    :goto_5
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmf/X;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lmf/X;->b:Lmf/X;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, ". Child of "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lmf/X;->b:Lmf/X;

    .line 29
    .line 30
    iget-object v2, v2, Lmf/X;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method

.method public final u(LSe/r;)Lqf/S;
    .locals 6

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LSe/r;->o0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lmf/X;->a:Lmf/p;

    .line 13
    .line 14
    invoke-virtual {v0}, Lmf/p;->g()LUe/d;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1}, LSe/r;->b0()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-interface {v0, v1}, LUe/d;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {p0, p1, v1, v2, v3}, Lmf/X;->q(Lmf/X;LSe/r;ZILjava/lang/Object;)Lqf/d0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, p0, Lmf/X;->a:Lmf/p;

    .line 34
    .line 35
    invoke-virtual {v5}, Lmf/p;->j()LUe/h;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {p1, v5}, LUe/g;->f(LSe/r;LUe/h;)LSe/r;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v5, v1, v2, v3}, Lmf/X;->q(Lmf/X;LSe/r;ZILjava/lang/Object;)Lqf/d0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Lmf/X;->a:Lmf/p;

    .line 51
    .line 52
    invoke-virtual {v2}, Lmf/p;->c()Lmf/n;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Lmf/n;->m()Lmf/x;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {v2, p1, v0, v4, v1}, Lmf/x;->a(LSe/r;Ljava/lang/String;Lqf/d0;Lqf/d0;)Lqf/S;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_0
    const/4 v0, 0x1

    .line 66
    invoke-virtual {p0, p1, v0}, Lmf/X;->o(LSe/r;Z)Lqf/d0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method
