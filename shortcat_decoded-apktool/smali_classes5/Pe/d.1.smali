.class public abstract LPe/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPe/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final G(LPe/l;LPe/l;)LPe/l;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    if-nez p2, :cond_1

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p1}, LPe/l;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p2}, LPe/l;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    invoke-virtual {p1}, LPe/l;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p2}, LPe/l;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    invoke-virtual {p1}, LPe/l;->c()LPe/k;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p2}, LPe/l;->c()LPe/k;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-gez v0, :cond_4

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    invoke-virtual {p1}, LPe/l;->c()LPe/k;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p2}, LPe/l;->c()LPe/k;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-lez v0, :cond_5

    .line 61
    .line 62
    :goto_0
    return-object p1

    .line 63
    :cond_5
    :goto_1
    return-object p2
.end method

.method private final H(Luf/i;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, LPe/d;->A()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LPe/d$a;

    .line 6
    .line 7
    invoke-virtual {p0}, LPe/d;->r()LHe/E;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0, p1, v2}, LPe/d;->f(Luf/i;LHe/E;)LHe/E;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p1, v2, v3}, LPe/d$a;-><init>(Luf/i;LHe/E;Luf/q;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, LPe/c;

    .line 20
    .line 21
    invoke-direct {p1, p0, v0}, LPe/c;-><init>(LPe/d;Luf/r;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v1, p1}, LPe/d;->j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method private static final I(LPe/d;Luf/r;LPe/d$a;)Ljava/lang/Iterable;
    .locals 8

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LPe/d;->z()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, LPe/d$a;->b()Luf/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v0}, Luf/r;->i(Luf/i;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    invoke-virtual {p2}, LPe/d$a;->b()Luf/i;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {p1, v0}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-interface {p1, v0}, Luf/r;->h0(Luf/p;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p2}, LPe/d$a;->b()Luf/i;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {p1, v2}, Luf/r;->z0(Luf/i;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    new-instance v5, Ljava/util/ArrayList;

    .line 62
    .line 63
    const/16 v6, 0xa

    .line 64
    .line 65
    invoke-static {v0, v6}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v2, v6}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Luf/m;

    .line 101
    .line 102
    check-cast v0, Luf/q;

    .line 103
    .line 104
    invoke-interface {p1, v2}, Luf/r;->m0(Luf/m;)Luf/i;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    if-nez v2, :cond_1

    .line 109
    .line 110
    new-instance v2, LPe/d$a;

    .line 111
    .line 112
    invoke-virtual {p2}, LPe/d$a;->a()LHe/E;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-direct {v2, v1, v6, v0}, LPe/d$a;-><init>(Luf/i;LHe/E;Luf/q;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    new-instance v6, LPe/d$a;

    .line 121
    .line 122
    invoke-virtual {p2}, LPe/d$a;->a()LHe/E;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-direct {p0, v2, v7}, LPe/d;->f(Luf/i;LHe/E;)LHe/E;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-direct {v6, v2, v7, v0}, LPe/d$a;-><init>(Luf/i;LHe/E;Luf/q;)V

    .line 131
    .line 132
    .line 133
    move-object v2, v6

    .line 134
    :goto_1
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_2
    return-object v5

    .line 139
    :cond_3
    return-object v1
.end method

.method static synthetic a(LPe/d;LPe/d$a;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LPe/d;->i(LPe/d;LPe/d$a;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic b(LPe/r0;[LPe/h;I)LPe/h;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LPe/d;->e(LPe/r0;[LPe/h;I)LPe/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic c(LPe/d;Luf/r;LPe/d$a;)Ljava/lang/Iterable;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LPe/d;->I(LPe/d;Luf/r;LPe/d$a;)Ljava/lang/Iterable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e(LPe/r0;[LPe/h;I)LPe/h;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, LPe/r0;->b()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, LPe/h;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object p0

    .line 23
    :cond_1
    :goto_0
    if-ltz p2, :cond_2

    .line 24
    .line 25
    array-length p0, p1

    .line 26
    if-ge p2, p0, :cond_2

    .line 27
    .line 28
    aget-object p0, p1, p2

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    sget-object p0, LPe/h;->e:LPe/h$a;

    .line 32
    .line 33
    invoke-virtual {p0}, LPe/h$a;->a()LPe/h;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method private final f(Luf/i;LHe/E;)LHe/E;
    .locals 1

    .line 1
    invoke-virtual {p0}, LPe/d;->m()LHe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, LPe/d;->n(Luf/i;)Ljava/lang/Iterable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p2, p1}, LHe/b;->d(LHe/E;Ljava/lang/Iterable;)LHe/E;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final g(Luf/i;)LPe/h;
    .locals 6

    .line 1
    invoke-direct {p0, p1}, LPe/d;->y(Luf/i;)LPe/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LPe/d;->v(Luf/i;)Luf/i;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, v2}, LPe/d;->y(Luf/i;)LPe/k;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v2, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object v2, v0

    .line 22
    :goto_0
    invoke-virtual {p0}, LPe/d;->A()Luf/r;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    sget-object v4, Lxe/c;->a:Lxe/c;

    .line 27
    .line 28
    invoke-interface {v3, p1}, Luf/r;->v(Luf/i;)Luf/j;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {p0, v5}, LPe/d;->x(Luf/i;)LXe/d;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v4, v5}, Lxe/c;->l(LXe/d;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    sget-object v1, LPe/i;->a:LPe/i;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-interface {v3, p1}, Luf/r;->G(Luf/i;)Luf/j;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {p0, v3}, LPe/d;->x(Luf/i;)LXe/d;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v4, v3}, Lxe/c;->k(LXe/d;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    sget-object v1, LPe/i;->b:LPe/i;

    .line 60
    .line 61
    :cond_3
    :goto_1
    invoke-virtual {p0}, LPe/d;->A()Luf/r;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v3, p1}, Luf/r;->w0(Luf/i;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/4 v4, 0x1

    .line 70
    const/4 v5, 0x0

    .line 71
    if-nez v3, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0, p1}, LPe/d;->F(Luf/i;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    move p1, v5

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :goto_2
    move p1, v4

    .line 83
    :goto_3
    new-instance v3, LPe/h;

    .line 84
    .line 85
    if-eq v2, v0, :cond_6

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    move v4, v5

    .line 89
    :goto_4
    invoke-direct {v3, v2, v1, p1, v4}, LPe/h;-><init>(LPe/k;LPe/i;ZZ)V

    .line 90
    .line 91
    .line 92
    return-object v3
.end method

.method private final h(LPe/d$a;)LPe/h;
    .locals 11

    .line 1
    invoke-virtual {p1}, LPe/d$a;->b()Luf/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, LPe/d;->A()Luf/r;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, LPe/d$a;->c()Luf/q;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v0, v2}, Luf/r;->t0(Luf/q;)Luf/v;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v1

    .line 24
    :goto_0
    sget-object v2, Luf/v;->b:Luf/v;

    .line 25
    .line 26
    if-ne v0, v2, :cond_1

    .line 27
    .line 28
    sget-object p1, LPe/h;->e:LPe/h$a;

    .line 29
    .line 30
    invoke-virtual {p1}, LPe/h$a;->a()LPe/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_1
    invoke-virtual {p1}, LPe/d$a;->c()Luf/q;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x1

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    move v0, v3

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v0, v2

    .line 46
    :goto_1
    invoke-virtual {p1}, LPe/d$a;->b()Luf/i;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v4}, LPe/d;->n(Luf/i;)Ljava/lang/Iterable;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-nez v4, :cond_4

    .line 57
    .line 58
    :cond_3
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :cond_4
    invoke-virtual {p0}, LPe/d;->A()Luf/r;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {p1}, LPe/d$a;->b()Luf/i;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-eqz v6, :cond_5

    .line 71
    .line 72
    invoke-interface {v5, v6}, Luf/r;->G0(Luf/i;)Luf/p;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    if-eqz v6, :cond_5

    .line 77
    .line 78
    invoke-interface {v5, v6}, Luf/r;->x0(Luf/p;)Luf/q;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    goto :goto_2

    .line 83
    :cond_5
    move-object v5, v1

    .line 84
    :goto_2
    invoke-virtual {p0}, LPe/d;->q()LHe/c;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    sget-object v7, LHe/c;->f:LHe/c;

    .line 89
    .line 90
    if-ne v6, v7, :cond_6

    .line 91
    .line 92
    move v6, v3

    .line 93
    goto :goto_3

    .line 94
    :cond_6
    move v6, v2

    .line 95
    :goto_3
    if-nez v0, :cond_7

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_7
    if-nez v6, :cond_a

    .line 99
    .line 100
    invoke-virtual {p0}, LPe/d;->u()Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_a

    .line 105
    .line 106
    invoke-virtual {p1}, LPe/d$a;->b()Luf/i;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    if-eqz v7, :cond_a

    .line 111
    .line 112
    invoke-virtual {p0, v7}, LPe/d;->B(Luf/i;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-ne v7, v3, :cond_a

    .line 117
    .line 118
    invoke-virtual {p0}, LPe/d;->p()Ljava/lang/Iterable;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    new-instance v8, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    :cond_8
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-eqz v9, :cond_9

    .line 136
    .line 137
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-virtual {p0}, LPe/d;->m()LHe/b;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-virtual {v10, v9}, LHe/b;->p(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-nez v10, :cond_8

    .line 150
    .line 151
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_9
    invoke-static {v8, v4}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    goto :goto_5

    .line 160
    :cond_a
    invoke-virtual {p0}, LPe/d;->p()Ljava/lang/Iterable;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-static {v7, v4}, LUd/u;->G0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    :goto_5
    invoke-virtual {p0}, LPe/d;->m()LHe/b;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {v7, v4}, LHe/b;->g(Ljava/lang/Iterable;)LPe/i;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {p0}, LPe/d;->m()LHe/b;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    new-instance v9, LPe/a;

    .line 181
    .line 182
    invoke-direct {v9, p0, p1}, LPe/a;-><init>(LPe/d;LPe/d$a;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8, v4, v9}, LHe/b;->h(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)LPe/l;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    if-eqz v4, :cond_c

    .line 190
    .line 191
    new-instance p1, LPe/h;

    .line 192
    .line 193
    invoke-virtual {v4}, LPe/l;->c()LPe/k;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v4}, LPe/l;->c()LPe/k;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    sget-object v6, LPe/k;->c:LPe/k;

    .line 202
    .line 203
    if-ne v1, v6, :cond_b

    .line 204
    .line 205
    if-eqz v5, :cond_b

    .line 206
    .line 207
    move v2, v3

    .line 208
    :cond_b
    invoke-virtual {v4}, LPe/l;->d()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-direct {p1, v0, v7, v2, v1}, LPe/h;-><init>(LPe/k;LPe/i;ZZ)V

    .line 213
    .line 214
    .line 215
    return-object p1

    .line 216
    :cond_c
    if-nez v0, :cond_e

    .line 217
    .line 218
    if-eqz v6, :cond_d

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_d
    sget-object v0, LHe/c;->e:LHe/c;

    .line 222
    .line 223
    goto :goto_7

    .line 224
    :cond_e
    :goto_6
    invoke-virtual {p0}, LPe/d;->q()LHe/c;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    :goto_7
    invoke-virtual {p1}, LPe/d$a;->a()LHe/E;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    if-eqz v4, :cond_f

    .line 233
    .line 234
    invoke-virtual {v4, v0}, LHe/E;->a(LHe/c;)LHe/w;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    goto :goto_8

    .line 239
    :cond_f
    move-object v0, v1

    .line 240
    :goto_8
    if-eqz v5, :cond_10

    .line 241
    .line 242
    invoke-direct {p0, v5}, LPe/d;->o(Luf/q;)LPe/l;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    goto :goto_9

    .line 247
    :cond_10
    move-object v4, v1

    .line 248
    :goto_9
    invoke-virtual {p0, v4, v0}, LPe/d;->t(LPe/l;LHe/w;)LPe/l;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    if-eqz v4, :cond_11

    .line 253
    .line 254
    invoke-virtual {v4}, LPe/l;->c()LPe/k;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    goto :goto_a

    .line 259
    :cond_11
    move-object v4, v1

    .line 260
    :goto_a
    sget-object v8, LPe/k;->c:LPe/k;

    .line 261
    .line 262
    if-eq v4, v8, :cond_13

    .line 263
    .line 264
    if-eqz v5, :cond_12

    .line 265
    .line 266
    if-eqz v0, :cond_12

    .line 267
    .line 268
    invoke-virtual {v0}, LHe/w;->c()Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-ne v0, v3, :cond_12

    .line 273
    .line 274
    goto :goto_b

    .line 275
    :cond_12
    move v0, v2

    .line 276
    goto :goto_c

    .line 277
    :cond_13
    :goto_b
    move v0, v3

    .line 278
    :goto_c
    invoke-virtual {p1}, LPe/d$a;->c()Luf/q;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-eqz p1, :cond_14

    .line 283
    .line 284
    invoke-direct {p0, p1}, LPe/d;->o(Luf/q;)LPe/l;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    if-eqz p1, :cond_14

    .line 289
    .line 290
    invoke-virtual {p1}, LPe/l;->c()LPe/k;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    sget-object v5, LPe/k;->b:LPe/k;

    .line 295
    .line 296
    if-ne v4, v5, :cond_15

    .line 297
    .line 298
    sget-object v4, LPe/k;->a:LPe/k;

    .line 299
    .line 300
    const/4 v5, 0x2

    .line 301
    invoke-static {p1, v4, v2, v5, v1}, LPe/l;->b(LPe/l;LPe/k;ZILjava/lang/Object;)LPe/l;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    goto :goto_d

    .line 306
    :cond_14
    move-object p1, v1

    .line 307
    :cond_15
    :goto_d
    invoke-direct {p0, p1, v6}, LPe/d;->G(LPe/l;LPe/l;)LPe/l;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    new-instance v4, LPe/h;

    .line 312
    .line 313
    if-eqz p1, :cond_16

    .line 314
    .line 315
    invoke-virtual {p1}, LPe/l;->c()LPe/k;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    :cond_16
    if-eqz p1, :cond_17

    .line 320
    .line 321
    invoke-virtual {p1}, LPe/l;->d()Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-ne p1, v3, :cond_17

    .line 326
    .line 327
    move v2, v3

    .line 328
    :cond_17
    invoke-direct {v4, v1, v7, v0, v2}, LPe/h;-><init>(LPe/k;LPe/i;ZZ)V

    .line 329
    .line 330
    .line 331
    return-object v4
.end method

.method private static final i(LPe/d;LPe/d$a;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "$this$extractNullability"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LPe/d$a;->b()Luf/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p2, p1}, LPe/d;->l(Ljava/lang/Object;Luf/i;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private final j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, v0, p2}, LPe/d;->k(Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private final k(Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Iterable;

    .line 9
    .line 10
    if-eqz p1, :cond_0

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
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p0, v0, p2, p3}, LPe/d;->k(Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method private final o(Luf/q;)LPe/l;
    .locals 4

    .line 1
    invoke-virtual {p0}, LPe/d;->A()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1}, LPe/d;->E(Luf/q;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    invoke-interface {v0, p1}, Luf/r;->W(Luf/q;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_e

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Luf/i;

    .line 42
    .line 43
    invoke-interface {v0, v3}, Luf/r;->K(Luf/i;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Luf/i;

    .line 73
    .line 74
    invoke-direct {p0, v3}, LPe/d;->y(Luf/i;)LPe/k;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    move-object v1, p1

    .line 81
    goto :goto_2

    .line 82
    :cond_5
    :goto_0
    if-eqz p1, :cond_6

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    goto :goto_6

    .line 91
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_e

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Luf/i;

    .line 106
    .line 107
    invoke-virtual {p0, v3}, LPe/d;->v(Luf/i;)Luf/i;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-eqz v3, :cond_7

    .line 112
    .line 113
    new-instance v1, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    :cond_8
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_9

    .line 127
    .line 128
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Luf/i;

    .line 133
    .line 134
    invoke-virtual {p0, v3}, LPe/d;->v(Luf/i;)Luf/i;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    if-eqz v3, :cond_8

    .line 139
    .line 140
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_9
    :goto_2
    if-eqz v1, :cond_a

    .line 145
    .line 146
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_a

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_c

    .line 162
    .line 163
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Luf/i;

    .line 168
    .line 169
    invoke-interface {v0, v3}, Luf/r;->M(Luf/i;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-nez v3, :cond_b

    .line 174
    .line 175
    sget-object v0, LPe/k;->c:LPe/k;

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_c
    :goto_3
    sget-object v0, LPe/k;->b:LPe/k;

    .line 179
    .line 180
    :goto_4
    new-instance v2, LPe/l;

    .line 181
    .line 182
    if-eq v1, p1, :cond_d

    .line 183
    .line 184
    const/4 p1, 0x1

    .line 185
    goto :goto_5

    .line 186
    :cond_d
    const/4 p1, 0x0

    .line 187
    :goto_5
    invoke-direct {v2, v0, p1}, LPe/l;-><init>(LPe/k;Z)V

    .line 188
    .line 189
    .line 190
    :cond_e
    :goto_6
    return-object v2
.end method

.method private final y(Luf/i;)LPe/k;
    .locals 2

    .line 1
    invoke-virtual {p0}, LPe/d;->A()Luf/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Luf/r;->v(Luf/i;)Luf/j;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Luf/r;->b0(Luf/i;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object p1, LPe/k;->b:LPe/k;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-interface {v0, p1}, Luf/r;->G(Luf/i;)Luf/j;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v0, p1}, Luf/r;->b0(Luf/i;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    sget-object p1, LPe/k;->c:LPe/k;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method


# virtual methods
.method public abstract A()Luf/r;
.end method

.method public abstract B(Luf/i;)Z
.end method

.method public abstract C()Z
.end method

.method public abstract D(Luf/i;Luf/i;)Z
.end method

.method public abstract E(Luf/q;)Z
.end method

.method public abstract F(Luf/i;)Z
.end method

.method public final d(Luf/i;Ljava/lang/Iterable;LPe/r0;Z)Lkotlin/jvm/functions/Function1;
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "overrides"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, LPe/d;->H(Luf/i;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-static {p2, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Luf/i;

    .line 41
    .line 42
    invoke-direct {p0, v3}, LPe/d;->H(Luf/i;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, LPe/d;->w()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v3, 0x1

    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {p0}, LPe/d;->C()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    instance-of v2, p2, Ljava/util/Collection;

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    move-object v2, p2

    .line 68
    check-cast v2, Ljava/util/Collection;

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Luf/i;

    .line 92
    .line 93
    invoke-virtual {p0, p1, v2}, LPe/d;->D(Luf/i;Luf/i;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_2

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    :goto_2
    move p1, v3

    .line 106
    :goto_3
    new-array p2, p1, [LPe/h;

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    move v4, v2

    .line 110
    :goto_4
    if-ge v4, p1, :cond_a

    .line 111
    .line 112
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, LPe/d$a;

    .line 117
    .line 118
    invoke-direct {p0, v5}, LPe/d;->h(LPe/d$a;)LPe/h;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    new-instance v6, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    :cond_5
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-eqz v8, :cond_7

    .line 136
    .line 137
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    check-cast v8, Ljava/util/List;

    .line 142
    .line 143
    invoke-static {v8, v4}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    check-cast v8, LPe/d$a;

    .line 148
    .line 149
    if-eqz v8, :cond_6

    .line 150
    .line 151
    invoke-virtual {v8}, LPe/d$a;->b()Luf/i;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    if-eqz v8, :cond_6

    .line 156
    .line 157
    invoke-direct {p0, v8}, LPe/d;->g(Luf/i;)LPe/h;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    goto :goto_6

    .line 162
    :cond_6
    const/4 v8, 0x0

    .line 163
    :goto_6
    if-eqz v8, :cond_5

    .line 164
    .line 165
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_7
    if-nez v4, :cond_8

    .line 170
    .line 171
    invoke-virtual {p0}, LPe/d;->C()Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-eqz v7, :cond_8

    .line 176
    .line 177
    move v7, v3

    .line 178
    goto :goto_7

    .line 179
    :cond_8
    move v7, v2

    .line 180
    :goto_7
    if-nez v4, :cond_9

    .line 181
    .line 182
    invoke-virtual {p0}, LPe/d;->s()Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    if-eqz v8, :cond_9

    .line 187
    .line 188
    move v8, v3

    .line 189
    goto :goto_8

    .line 190
    :cond_9
    move v8, v2

    .line 191
    :goto_8
    invoke-static {v5, v6, v7, v8, p4}, LPe/t0;->a(LPe/h;Ljava/util/Collection;ZZZ)LPe/h;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    aput-object v5, p2, v4

    .line 196
    .line 197
    add-int/lit8 v4, v4, 0x1

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_a
    new-instance p1, LPe/b;

    .line 201
    .line 202
    invoke-direct {p1, p3, p2}, LPe/b;-><init>(LPe/r0;[LPe/h;)V

    .line 203
    .line 204
    .line 205
    return-object p1
.end method

.method public abstract l(Ljava/lang/Object;Luf/i;)Z
.end method

.method public abstract m()LHe/b;
.end method

.method public abstract n(Luf/i;)Ljava/lang/Iterable;
.end method

.method public abstract p()Ljava/lang/Iterable;
.end method

.method public abstract q()LHe/c;
.end method

.method public abstract r()LHe/E;
.end method

.method public abstract s()Z
.end method

.method protected abstract t(LPe/l;LHe/w;)LPe/l;
.end method

.method public abstract u()Z
.end method

.method public abstract v(Luf/i;)Luf/i;
.end method

.method public w()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract x(Luf/i;)LXe/d;
.end method

.method public abstract z()Z
.end method
