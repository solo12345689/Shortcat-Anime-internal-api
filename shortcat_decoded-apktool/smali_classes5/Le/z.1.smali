.class public final LLe/z;
.super LLe/U;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final n:Lye/e;

.field private final o:LOe/g;

.field private final p:Z

.field private final q:Lpf/i;

.field private final r:Lpf/i;

.field private final s:Lpf/i;

.field private final t:Lpf/i;

.field private final u:Lpf/h;


# direct methods
.method public constructor <init>(LKe/k;Lye/e;LOe/g;ZLLe/z;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p5}, LLe/U;-><init>(LKe/k;LLe/U;)V

    .line 3
    iput-object p2, p0, LLe/z;->n:Lye/e;

    .line 4
    iput-object p3, p0, LLe/z;->o:LOe/g;

    .line 5
    iput-boolean p4, p0, LLe/z;->p:Z

    .line 6
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance p3, LLe/p;

    invoke-direct {p3, p0, p1}, LLe/p;-><init>(LLe/z;LKe/k;)V

    invoke-interface {p2, p3}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/z;->q:Lpf/i;

    .line 7
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance p3, LLe/q;

    invoke-direct {p3, p0}, LLe/q;-><init>(LLe/z;)V

    invoke-interface {p2, p3}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/z;->r:Lpf/i;

    .line 8
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance p3, LLe/r;

    invoke-direct {p3, p1, p0}, LLe/r;-><init>(LKe/k;LLe/z;)V

    invoke-interface {p2, p3}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/z;->s:Lpf/i;

    .line 9
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance p3, LLe/s;

    invoke-direct {p3, p0}, LLe/s;-><init>(LLe/z;)V

    invoke-interface {p2, p3}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p2

    iput-object p2, p0, LLe/z;->t:Lpf/i;

    .line 10
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    move-result-object p2

    new-instance p3, LLe/t;

    invoke-direct {p3, p0, p1}, LLe/t;-><init>(LLe/z;LKe/k;)V

    invoke-interface {p2, p3}, Lpf/n;->d(Lkotlin/jvm/functions/Function1;)Lpf/h;

    move-result-object p1

    iput-object p1, p0, LLe/z;->u:Lpf/h;

    return-void
.end method

.method public synthetic constructor <init>(LKe/k;Lye/e;LOe/g;ZLLe/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    .line 1
    invoke-direct/range {v0 .. v5}, LLe/z;-><init>(LKe/k;Lye/e;LOe/g;ZLLe/z;)V

    return-void
.end method

.method private static final A0(LLe/z;LXe/f;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LLe/z;->q1(LXe/f;)Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final B0(LLe/z;LXe/f;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LLe/z;->r1(LXe/f;)Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final C0()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-boolean v0, p0, LLe/z;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lye/h;->l()Lqf/v0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Lqf/v0;->k()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "getSupertypes(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, LKe/d;->k()Lrf/p;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Lrf/p;->d()Lrf/g;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Lrf/g;->g(Lye/e;)Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method private static final D0(LLe/z;LKe/k;)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, LLe/z;->o:LOe/g;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/g;->i()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, LOe/k;

    .line 31
    .line 32
    invoke-direct {p0, v2}, LLe/z;->o1(LOe/k;)LJe/b;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p0, LLe/z;->o:LOe/g;

    .line 41
    .line 42
    invoke-interface {v0}, LOe/g;->q()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    invoke-direct {p0}, LLe/z;->G0()Lye/d;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x2

    .line 54
    const/4 v4, 0x0

    .line 55
    invoke-static {v0, v2, v2, v3, v4}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Lye/d;

    .line 81
    .line 82
    invoke-static {v7, v2, v2, v3, v4}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-static {v7, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_2

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, LKe/d;->h()LIe/j;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v3, p0, LLe/z;->o:LOe/g;

    .line 105
    .line 106
    invoke-interface {v2, v3, v0}, LIe/j;->c(LOe/l;Lye/l;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    :goto_2
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, LKe/d;->w()Lgf/f;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-interface {v0, v2, v1, p1}, Lgf/f;->a(Lye/e;Ljava/util/List;LKe/k;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, LKe/d;->r()LPe/m0;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_5

    .line 137
    .line 138
    invoke-direct {p0}, LLe/z;->F0()Lye/d;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, LUd/u;->q(Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    :cond_5
    invoke-virtual {v0, p1, v1}, LPe/m0;->p(LKe/k;Ljava/util/Collection;)Ljava/util/Collection;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Ljava/lang/Iterable;

    .line 151
    .line 152
    invoke-static {p0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    return-object p0
.end method

.method private final E0(LBe/i;)Ljava/util/List;
    .locals 11

    .line 1
    iget-object v0, p0, LLe/z;->o:LOe/g;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/g;->B()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object v3, Lqf/I0;->b:Lqf/I0;

    .line 17
    .line 18
    const/4 v7, 0x6

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-static/range {v3 .. v8}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    check-cast v0, Ljava/lang/Iterable;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v3, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    move-object v5, v4

    .line 54
    check-cast v5, LOe/r;

    .line 55
    .line 56
    invoke-interface {v5}, LOe/t;->getName()LXe/f;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    sget-object v6, LHe/I;->c:LXe/f;

    .line 61
    .line 62
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    new-instance v0, Lkotlin/Pair;

    .line 77
    .line 78
    invoke-direct {v0, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    check-cast v1, Ljava/util/List;

    .line 86
    .line 87
    invoke-virtual {v0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-object v5, v1

    .line 101
    check-cast v5, LOe/r;

    .line 102
    .line 103
    const/4 v9, 0x1

    .line 104
    if-eqz v5, :cond_3

    .line 105
    .line 106
    invoke-interface {v5}, LOe/r;->getReturnType()LOe/x;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    instance-of v3, v1, LOe/f;

    .line 111
    .line 112
    if-eqz v3, :cond_2

    .line 113
    .line 114
    new-instance v3, Lkotlin/Pair;

    .line 115
    .line 116
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v4}, LKe/k;->g()LMe/e;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v1, LOe/f;

    .line 125
    .line 126
    invoke-virtual {v4, v1, v8, v9}, LMe/e;->l(LOe/f;LMe/a;Z)Lqf/S;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v6}, LKe/k;->g()LMe/e;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-interface {v1}, LOe/f;->n()LOe/x;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v6, v1, v8}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_2
    new-instance v3, Lkotlin/Pair;

    .line 151
    .line 152
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, LKe/k;->g()LMe/e;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v4, v1, v8}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    const/4 v4, 0x0

    .line 165
    invoke-direct {v3, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :goto_1
    invoke-virtual {v3}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    move-object v6, v1

    .line 173
    check-cast v6, Lqf/S;

    .line 174
    .line 175
    invoke-virtual {v3}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    move-object v7, v1

    .line 180
    check-cast v7, Lqf/S;

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    move-object v1, p0

    .line 184
    move-object v3, p1

    .line 185
    invoke-direct/range {v1 .. v7}, LLe/z;->s0(Ljava/util/List;Lye/l;ILOe/r;Lqf/S;Lqf/S;)V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_3
    move-object v3, p1

    .line 190
    :goto_2
    const/4 p1, 0x0

    .line 191
    if-eqz v5, :cond_4

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_4
    move v9, p1

    .line 195
    :goto_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_5

    .line 204
    .line 205
    add-int/lit8 v10, p1, 0x1

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    move-object v5, v1

    .line 212
    check-cast v5, LOe/r;

    .line 213
    .line 214
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1}, LKe/k;->g()LMe/e;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-interface {v5}, LOe/r;->getReturnType()LOe/x;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v1, v4, v8}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    add-int v4, p1, v9

    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    move-object v1, p0

    .line 234
    invoke-direct/range {v1 .. v7}, LLe/z;->s0(Ljava/util/List;Lye/l;ILOe/r;Lqf/S;Lqf/S;)V

    .line 235
    .line 236
    .line 237
    move p1, v10

    .line 238
    goto :goto_4

    .line 239
    :cond_5
    return-object v2
.end method

.method private final F0()Lye/d;
    .locals 5

    .line 1
    iget-object v0, p0, LLe/z;->o:LOe/g;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/g;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LLe/z;->o:LOe/g;

    .line 8
    .line 9
    invoke-interface {v1}, LOe/g;->J()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, LLe/z;->o:LOe/g;

    .line 16
    .line 17
    invoke-interface {v1}, LOe/g;->r()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    :cond_0
    if-nez v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    return-object v0

    .line 27
    :cond_1
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Lze/h;->k0:Lze/h$a;

    .line 32
    .line 33
    invoke-virtual {v2}, Lze/h$a;->b()Lze/h;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, LKe/k;->a()LKe/d;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, LKe/d;->t()LNe/b;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v4, p0, LLe/z;->o:LOe/g;

    .line 50
    .line 51
    invoke-interface {v3, v4}, LNe/b;->a(LOe/l;)LNe/a;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/4 v4, 0x1

    .line 56
    invoke-static {v1, v2, v4, v3}, LJe/b;->t1(Lye/e;Lze/h;ZLye/h0;)LJe/b;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "createJavaConstructor(...)"

    .line 61
    .line 62
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-direct {p0, v2}, LLe/z;->E0(LBe/i;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 73
    .line 74
    :goto_0
    const/4 v3, 0x0

    .line 75
    invoke-virtual {v2, v3}, LJe/b;->Z0(Z)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, v1}, LLe/z;->Z0(Lye/e;)Lye/u;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v0, v3}, LBe/i;->q1(Ljava/util/List;Lye/u;)LBe/i;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, LJe/b;->Y0(Z)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1}, Lye/e;->p()Lqf/d0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v2, v0}, LBe/s;->g1(Lqf/S;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, LKe/d;->h()LIe/j;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v1, p0, LLe/z;->o:LOe/g;

    .line 108
    .line 109
    invoke-interface {v0, v1, v2}, LIe/j;->c(LOe/l;Lye/l;)V

    .line 110
    .line 111
    .line 112
    return-object v2
.end method

.method private final G0()Lye/d;
    .locals 5

    .line 1
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lze/h;->k0:Lze/h$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lze/h$a;->b()Lze/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, LKe/k;->a()LKe/d;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, LKe/d;->t()LNe/b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, LLe/z;->o:LOe/g;

    .line 24
    .line 25
    invoke-interface {v2, v3}, LNe/b;->a(LOe/l;)LNe/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-static {v0, v1, v3, v2}, LJe/b;->t1(Lye/e;Lze/h;ZLye/h0;)LJe/b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "createJavaConstructor(...)"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v1}, LLe/z;->M0(LBe/i;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-virtual {v1, v3}, LJe/b;->Z0(Z)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v0}, LLe/z;->Z0(Lye/e;)Lye/u;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v1, v2, v4}, LBe/i;->q1(Ljava/util/List;Lye/u;)LBe/i;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v3}, LJe/b;->Y0(Z)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Lye/e;->p()Lqf/d0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v1, v0}, LBe/s;->g1(Lqf/S;)V

    .line 62
    .line 63
    .line 64
    return-object v1
.end method

.method private final H0(Lye/g0;Lye/a;Ljava/util/Collection;)Lye/g0;
    .locals 2

    .line 1
    check-cast p3, Ljava/lang/Iterable;

    .line 2
    .line 3
    instance-of v0, p3, Ljava/util/Collection;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v0, p3

    .line 8
    check-cast v0, Ljava/util/Collection;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lye/g0;

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Lye/z;->t0()Lye/z;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    invoke-direct {p0, v0, p2}, LLe/z;->Q0(Lye/a;Lye/a;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-interface {p1}, Lye/g0;->v()Lye/z$a;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1}, Lye/z$a;->k()Lye/z$a;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1}, Lye/z$a;->build()Lye/z;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    check-cast p1, Lye/g0;

    .line 67
    .line 68
    :cond_2
    return-object p1
.end method

.method private final I0(Lye/z;Lkotlin/jvm/functions/Function1;)Lye/g0;
    .locals 5

    .line 1
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getName(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v2, v0

    .line 32
    check-cast v2, Lye/g0;

    .line 33
    .line 34
    invoke-direct {p0, v2, p1}, LLe/z;->e1(Lye/g0;Lye/z;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v0, v1

    .line 42
    :goto_0
    check-cast v0, Lye/g0;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-interface {v0}, Lye/g0;->v()Lye/z$a;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-interface {p1}, Lye/a;->j()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "getValueParameters(...)"

    .line 55
    .line 56
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    const/16 v4, 0xa

    .line 62
    .line 63
    invoke-static {v1, v4}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_2

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Lye/t0;

    .line 85
    .line 86
    invoke-interface {v4}, Lye/s0;->getType()Lqf/S;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    invoke-interface {v0}, Lye/a;->j()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v3, v0, p1}, LJe/h;->a(Ljava/util/Collection;Ljava/util/Collection;Lye/a;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p2, p1}, Lye/z$a;->b(Ljava/util/List;)Lye/z$a;

    .line 106
    .line 107
    .line 108
    invoke-interface {p2}, Lye/z$a;->t()Lye/z$a;

    .line 109
    .line 110
    .line 111
    invoke-interface {p2}, Lye/z$a;->l()Lye/z$a;

    .line 112
    .line 113
    .line 114
    sget-object p1, LJe/e;->H:Lye/a$a;

    .line 115
    .line 116
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-interface {p2, p1, v0}, Lye/z$a;->d(Lye/a$a;Ljava/lang/Object;)Lye/z$a;

    .line 119
    .line 120
    .line 121
    invoke-interface {p2}, Lye/z$a;->build()Lye/z;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, Lye/g0;

    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_3
    return-object v1
.end method

.method private final J0(Lye/Z;Lkotlin/jvm/functions/Function1;)LJe/f;
    .locals 10

    .line 1
    invoke-direct {p0, p1, p2}, LLe/z;->P0(Lye/Z;Lkotlin/jvm/functions/Function1;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, LLe/z;->W0(Lye/Z;Lkotlin/jvm/functions/Function1;)Lye/g0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lye/u0;->N()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-direct {p0, p1, p2}, LLe/z;->X0(Lye/Z;Lkotlin/jvm/functions/Function1;)Lye/g0;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p2, v1

    .line 31
    :goto_0
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-interface {p2}, Lye/D;->r()Lye/E;

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Lye/D;->r()Lye/E;

    .line 37
    .line 38
    .line 39
    :cond_2
    new-instance v2, LJe/d;

    .line 40
    .line 41
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct {v2, v3, v0, p2, p1}, LJe/d;-><init>(Lye/e;Lye/g0;Lye/g0;Lye/Z;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Lye/a;->getReturnType()Lqf/S;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {p0}, LLe/z;->O()Lye/c0;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual/range {v2 .. v7}, LBe/K;->b1(Lqf/S;Ljava/util/List;Lye/c0;Lye/c0;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, Lze/a;->getAnnotations()Lze/h;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const/4 v6, 0x0

    .line 76
    invoke-interface {v0}, Lye/p;->k()Lye/h0;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-static/range {v2 .. v7}, Lbf/h;->k(Lye/Z;Lze/h;ZZZLye/h0;)LBe/L;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1, v0}, LBe/J;->M0(Lye/z;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, LBe/X;->getType()Lqf/S;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, LBe/L;->P0(Lqf/S;)V

    .line 94
    .line 95
    .line 96
    const-string v0, "apply(...)"

    .line 97
    .line 98
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    if-eqz p2, :cond_4

    .line 102
    .line 103
    invoke-interface {p2}, Lye/a;->j()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "getValueParameters(...)"

    .line 108
    .line 109
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lye/t0;

    .line 117
    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    invoke-interface {p2}, Lze/a;->getAnnotations()Lze/h;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-interface {v0}, Lze/a;->getAnnotations()Lze/h;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-interface {p2}, Lye/D;->getVisibility()Lye/u;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-interface {p2}, Lye/p;->k()Lye/h0;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    const/4 v5, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    invoke-static/range {v2 .. v9}, Lbf/h;->m(Lye/Z;Lze/h;Lze/h;ZZZLye/u;Lye/h0;)LBe/M;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1, p2}, LBe/J;->M0(Lye/z;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 148
    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v1, "No parameter found for "

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_4
    :goto_1
    invoke-virtual {v2, p1, v1}, LBe/K;->U0(LBe/L;Lye/b0;)V

    .line 171
    .line 172
    .line 173
    return-object v2
.end method

.method private final K0(LOe/r;Lqf/S;Lye/E;)LJe/f;
    .locals 17

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LLe/U;->L()LKe/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, v2}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    invoke-virtual/range {p0 .. p0}, LLe/z;->c1()Lye/e;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {v2}, LOe/s;->getVisibility()Lye/x0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, LHe/V;->d(Lye/x0;)Lye/u;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-interface {v2}, LOe/t;->getName()LXe/f;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual/range {p0 .. p0}, LLe/U;->L()LKe/k;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, LKe/d;->t()LNe/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0, v2}, LNe/b;->a(LOe/l;)LNe/a;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    move-object/from16 v5, p3

    .line 46
    .line 47
    invoke-static/range {v3 .. v10}, LJe/f;->f1(Lye/m;Lze/h;Lye/E;Lye/u;ZLXe/f;Lye/h0;Z)LJe/f;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v0, "create(...)"

    .line 52
    .line 53
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 57
    .line 58
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v1, v0}, Lbf/h;->d(Lye/Z;Lze/h;)LBe/L;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const-string v0, "createDefaultGetter(...)"

    .line 67
    .line 68
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-virtual {v1, v6, v0}, LBe/K;->U0(LBe/L;Lye/b0;)V

    .line 73
    .line 74
    .line 75
    if-nez p2, :cond_0

    .line 76
    .line 77
    invoke-virtual/range {p0 .. p0}, LLe/U;->L()LKe/k;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/4 v4, 0x4

    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-static/range {v0 .. v5}, LKe/c;->i(LKe/k;Lye/m;LOe/z;IILjava/lang/Object;)LKe/k;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v11, v1

    .line 89
    move-object/from16 v1, p0

    .line 90
    .line 91
    invoke-virtual {v1, v2, v0}, LLe/U;->A(LOe/r;LKe/k;)Lqf/S;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move-object v12, v0

    .line 96
    goto :goto_0

    .line 97
    :cond_0
    move-object v11, v1

    .line 98
    move-object/from16 v1, p0

    .line 99
    .line 100
    move-object/from16 v12, p2

    .line 101
    .line 102
    :goto_0
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v13

    .line 106
    invoke-virtual {v1}, LLe/z;->O()Lye/c0;

    .line 107
    .line 108
    .line 109
    move-result-object v14

    .line 110
    const/4 v15, 0x0

    .line 111
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v16

    .line 115
    invoke-virtual/range {v11 .. v16}, LBe/K;->b1(Lqf/S;Ljava/util/List;Lye/c0;Lye/c0;Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v12}, LBe/L;->P0(Lqf/S;)V

    .line 119
    .line 120
    .line 121
    return-object v11
.end method

.method static synthetic L0(LLe/z;LOe/r;Lqf/S;Lye/E;ILjava/lang/Object;)LJe/f;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LLe/z;->K0(LOe/r;Lqf/S;Lye/E;)LJe/f;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final M0(LBe/i;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LLe/z;->o:LOe/g;

    .line 4
    .line 5
    invoke-interface {v1}, LOe/g;->m()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sget-object v4, Lqf/I0;->b:Lqf/I0;

    .line 19
    .line 20
    const/4 v8, 0x6

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    invoke-static/range {v4 .. v9}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v1, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v4, 0x0

    .line 36
    :goto_0
    move v8, v4

    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    add-int/lit8 v4, v8, 0x1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, LOe/w;

    .line 50
    .line 51
    invoke-virtual {v0}, LLe/U;->L()LKe/k;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6}, LKe/k;->g()LMe/e;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v5}, LOe/w;->getType()LOe/x;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v6, v7, v3}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    invoke-interface {v5}, LOe/w;->a()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_0

    .line 72
    .line 73
    invoke-virtual {v0}, LLe/U;->L()LKe/k;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6}, LKe/k;->a()LKe/d;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v6}, LKe/d;->m()Lye/H;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-interface {v6}, Lye/H;->n()Lve/i;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v6, v11}, Lve/i;->k(Lqf/S;)Lqf/S;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    :goto_1
    move-object v15, v6

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    const/4 v6, 0x0

    .line 96
    goto :goto_1

    .line 97
    :goto_2
    new-instance v6, LBe/V;

    .line 98
    .line 99
    sget-object v7, Lze/h;->k0:Lze/h$a;

    .line 100
    .line 101
    invoke-virtual {v7}, Lze/h$a;->b()Lze/h;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    invoke-interface {v5}, LOe/t;->getName()LXe/f;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    invoke-virtual {v0}, LLe/U;->L()LKe/k;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v7}, LKe/k;->a()LKe/d;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v7}, LKe/d;->t()LNe/b;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-interface {v7, v5}, LNe/b;->a(LOe/l;)LNe/a;

    .line 122
    .line 123
    .line 124
    move-result-object v16

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v12, 0x0

    .line 127
    const/4 v13, 0x0

    .line 128
    const/4 v14, 0x0

    .line 129
    move-object v5, v6

    .line 130
    move-object/from16 v6, p1

    .line 131
    .line 132
    invoke-direct/range {v5 .. v16}, LBe/V;-><init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_1
    return-object v2
.end method

.method private final N0(Lye/g0;LXe/f;)Lye/g0;
    .locals 0

    .line 1
    invoke-interface {p1}, Lye/g0;->v()Lye/z$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1, p2}, Lye/z$a;->j(LXe/f;)Lye/z$a;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lye/z$a;->t()Lye/z$a;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lye/z$a;->l()Lye/z$a;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lye/z$a;->build()Lye/z;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Lye/g0;

    .line 22
    .line 23
    return-object p1
.end method

.method private final O0(Lye/g0;)Lye/g0;
    .locals 5

    .line 1
    invoke-interface {p1}, Lye/a;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getValueParameters(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lye/t0;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    invoke-interface {v0}, Lye/s0;->getType()Lqf/S;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Lqf/S;->N0()Lqf/v0;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Lqf/v0;->p()Lye/h;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-static {v3}, Lff/e;->p(Lye/m;)LXe/d;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {v3}, LXe/d;->f()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v3, v2

    .line 47
    :goto_0
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3}, LXe/d;->m()LXe/c;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v3, v2

    .line 55
    :goto_1
    sget-object v4, Lve/o;->v:LXe/c;

    .line 56
    .line 57
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move-object v0, v2

    .line 65
    :goto_2
    if-nez v0, :cond_3

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    invoke-interface {p1}, Lye/g0;->v()Lye/z$a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {p1}, Lye/a;->j()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v1, 0x1

    .line 80
    invoke-static {p1, v1}, LUd/u;->h0(Ljava/util/List;I)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {v2, p1}, Lye/z$a;->b(Ljava/util/List;)Lye/z$a;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {v0}, Lye/s0;->getType()Lqf/S;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Lqf/S;->L0()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Lqf/B0;

    .line 102
    .line 103
    invoke-interface {v0}, Lqf/B0;->getType()Lqf/S;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {p1, v0}, Lye/z$a;->o(Lqf/S;)Lye/z$a;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {p1}, Lye/z$a;->build()Lye/z;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lye/g0;

    .line 116
    .line 117
    move-object v0, p1

    .line 118
    check-cast v0, LBe/O;

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0, v1}, LBe/s;->h1(Z)V

    .line 123
    .line 124
    .line 125
    :cond_4
    return-object p1

    .line 126
    :cond_5
    :goto_3
    return-object v2
.end method

.method private final P0(Lye/Z;Lkotlin/jvm/functions/Function1;)Z
    .locals 3

    .line 1
    invoke-static {p1}, LLe/d;->a(Lye/Z;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, LLe/z;->W0(Lye/Z;Lkotlin/jvm/functions/Function1;)Lye/g0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {p0, p1, p2}, LLe/z;->X0(Lye/Z;Lkotlin/jvm/functions/Function1;)Lye/g0;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-interface {p1}, Lye/u0;->N()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v2, 0x1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    return v2

    .line 28
    :cond_2
    if-eqz p2, :cond_3

    .line 29
    .line 30
    invoke-interface {p2}, Lye/D;->r()Lye/E;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {v0}, Lye/D;->r()Lye/E;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    if-ne p1, p2, :cond_3

    .line 39
    .line 40
    return v2

    .line 41
    :cond_3
    return v1
.end method

.method private final Q0(Lye/a;Lye/a;)Z
    .locals 3

    .line 1
    sget-object v0, Lbf/o;->f:Lbf/o;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p2, p1, v1}, Lbf/o;->F(Lye/a;Lye/a;Z)Lbf/o$i;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lbf/o$i;->c()Lbf/o$i$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v2, "getResult(...)"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v2, Lbf/o$i$a;->a:Lbf/o$i$a;

    .line 18
    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    sget-object v0, LHe/z;->a:LHe/z$a;

    .line 22
    .line 23
    invoke-virtual {v0, p2, p1}, LHe/z$a;->a(Lye/a;Lye/a;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method private final R0(Lye/g0;)Z
    .locals 6

    .line 1
    sget-object v0, LHe/U;->a:LHe/U$a;

    .line 2
    .line 3
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getName(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LHe/U$a;->b(LXe/f;)LXe/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    invoke-direct {p0, v0}, LLe/z;->b1(LXe/f;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/Iterable;

    .line 25
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    move-object v5, v4

    .line 46
    check-cast v5, Lye/g0;

    .line 47
    .line 48
    invoke-static {v5}, LHe/T;->d(Lye/b;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    return v1

    .line 65
    :cond_3
    invoke-direct {p0, p1, v0}, LLe/z;->N0(Lye/g0;LXe/f;)Lye/g0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    return v1

    .line 76
    :cond_4
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lye/g0;

    .line 91
    .line 92
    invoke-direct {p0, v2, p1}, LLe/z;->S0(Lye/g0;Lye/z;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    return p1

    .line 100
    :cond_6
    return v1
.end method

.method private final S0(Lye/g0;Lye/z;)Z
    .locals 1

    .line 1
    sget-object v0, LHe/f;->o:LHe/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LHe/f;->m(Lye/g0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p2}, Lye/z;->a()Lye/z;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :cond_0
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p2, p1}, LLe/z;->Q0(Lye/a;Lye/a;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method private final T0(Lye/g0;)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LLe/z;->O0(Lye/g0;)Lye/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v2, "getName(...)"

    .line 14
    .line 15
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, LLe/z;->b1(LXe/f;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/lang/Iterable;

    .line 23
    .line 24
    instance-of v2, p1, Ljava/util/Collection;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    check-cast v2, Ljava/util/Collection;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    return v1

    .line 38
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lye/g0;

    .line 53
    .line 54
    invoke-interface {v2}, Lye/z;->isSuspend()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-direct {p0, v0, v2}, LLe/z;->Q0(Lye/a;Lye/a;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    return p1

    .line 68
    :cond_3
    return v1
.end method

.method private static final U0(LLe/z;)Ljava/util/Map;
    .locals 3

    .line 1
    iget-object p0, p0, LLe/z;->o:LOe/g;

    .line 2
    .line 3
    invoke-interface {p0}, LOe/g;->x()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    move-object v2, v1

    .line 29
    check-cast v2, LOe/n;

    .line 30
    .line 31
    invoke-interface {v2}, LOe/n;->I()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/16 p0, 0xa

    .line 42
    .line 43
    invoke-static {v0, p0}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p0}, LUd/S;->e(I)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const/16 v1, 0x10

    .line 52
    .line 53
    invoke-static {p0, v1}, Loe/j;->e(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v2, v0

    .line 77
    check-cast v2, LOe/n;

    .line 78
    .line 79
    invoke-interface {v2}, LOe/t;->getName()LXe/f;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    return-object v1
.end method

.method private final V0(Lye/Z;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lye/g0;
    .locals 4

    .line 1
    invoke-static {p2}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const-string v0, "identifier(...)"

    .line 6
    .line 7
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p3, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p3, :cond_4

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    check-cast p3, Lye/g0;

    .line 32
    .line 33
    invoke-interface {p3}, Lye/a;->j()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    sget-object v1, Lrf/e;->a:Lrf/e;

    .line 45
    .line 46
    invoke-interface {p3}, Lye/a;->getReturnType()Lqf/S;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-interface {p1}, Lye/s0;->getType()Lqf/S;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-interface {v1, v2, v3}, Lrf/e;->a(Lqf/S;Lqf/S;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    :goto_0
    if-eqz v1, :cond_3

    .line 63
    .line 64
    move-object v0, p3

    .line 65
    :cond_3
    :goto_1
    if-eqz v0, :cond_0

    .line 66
    .line 67
    :cond_4
    return-object v0
.end method

.method private final W0(Lye/Z;Lkotlin/jvm/functions/Function1;)Lye/g0;
    .locals 3

    .line 1
    invoke-interface {p1}, Lye/Z;->d()Lye/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, LHe/T;->g(Lye/b;)Lye/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lye/a0;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object v1, LHe/m;->a:LHe/m;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, LHe/m;->b(Lye/b;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_1
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2, v0}, LHe/T;->l(Lye/e;Lye/a;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    invoke-direct {p0, p1, v1, p2}, LLe/z;->V0(Lye/Z;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lye/g0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_2
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, LXe/f;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "asString(...)"

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, LHe/H;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p0, p1, v0, p2}, LLe/z;->V0(Lye/Z;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lye/g0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method private final X0(Lye/Z;Lkotlin/jvm/functions/Function1;)Lye/g0;
    .locals 5

    .line 1
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LXe/f;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "asString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, LHe/H;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "identifier(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x0

    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lye/g0;

    .line 49
    .line 50
    invoke-interface {v0}, Lye/a;->j()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v3, 0x1

    .line 59
    if-eq v2, v3, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-interface {v0}, Lye/a;->getReturnType()Lqf/S;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-static {v2}, Lve/i;->D0(Lqf/S;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    sget-object v2, Lrf/e;->a:Lrf/e;

    .line 77
    .line 78
    invoke-interface {v0}, Lye/a;->j()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const-string v4, "getValueParameters(...)"

    .line 83
    .line 84
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v3}, LUd/u;->M0(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Lye/t0;

    .line 92
    .line 93
    invoke-interface {v3}, Lye/s0;->getType()Lqf/S;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-interface {p1}, Lye/s0;->getType()Lqf/S;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-interface {v2, v3, v4}, Lrf/e;->c(Lqf/S;Lqf/S;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    move-object v1, v0

    .line 108
    :cond_4
    :goto_0
    if-eqz v1, :cond_0

    .line 109
    .line 110
    :cond_5
    return-object v1
.end method

.method private static final Y0(LKe/k;LLe/z;)Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, LKe/k;->a()LKe/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LKe/d;->w()Lgf/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, LLe/z;->c1()Lye/e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1, p0}, Lgf/f;->g(Lye/e;LKe/k;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final Z0(Lye/e;)Lye/u;
    .locals 1

    .line 1
    invoke-interface {p1}, Lye/e;->getVisibility()Lye/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getVisibility(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, LHe/y;->b:Lye/u;

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object p1, LHe/y;->c:Lye/u;

    .line 19
    .line 20
    const-string v0, "PROTECTED_AND_PACKAGE"

    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-object p1
.end method

.method private final b1(LXe/f;)Ljava/util/Set;
    .locals 4

    .line 1
    invoke-direct {p0}, LLe/z;->C0()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lqf/S;

    .line 27
    .line 28
    invoke-virtual {v2}, Lqf/S;->o()Ljf/k;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, LGe/d;->o:LGe/d;

    .line 33
    .line 34
    invoke-interface {v2, p1, v3}, Ljf/k;->c(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {v1, v2}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v1
.end method

.method private final d1(LXe/f;)Ljava/util/Set;
    .locals 5

    .line 1
    invoke-direct {p0}, LLe/z;->C0()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lqf/S;

    .line 27
    .line 28
    invoke-virtual {v2}, Lqf/S;->o()Ljf/k;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, LGe/d;->o:LGe/d;

    .line 33
    .line 34
    invoke-interface {v2, p1, v3}, Ljf/k;->a(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/Iterable;

    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    const/16 v4, 0xa

    .line 43
    .line 44
    invoke-static {v2, v4}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lye/Z;

    .line 66
    .line 67
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    invoke-static {v1, v3}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-static {v1}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method private final e1(Lye/g0;Lye/z;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {p1, v0, v0, v1, v2}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    invoke-interface {p2}, Lye/z;->a()Lye/z;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    const-string v5, "getOriginal(...)"

    .line 13
    .line 14
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v4, v0, v0, v1, v2}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-direct {p0, p1, p2}, LLe/z;->Q0(Lye/a;Lye/a;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_0
    return v0
.end method

.method private final f1(Lye/g0;)Z
    .locals 5

    .line 1
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getName(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, LHe/N;->a(LXe/f;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_5

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, LXe/f;

    .line 39
    .line 40
    invoke-direct {p0, v2}, LLe/z;->d1(LXe/f;)Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/Iterable;

    .line 45
    .line 46
    instance-of v3, v2, Ljava/util/Collection;

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    move-object v3, v2

    .line 51
    check-cast v3, Ljava/util/Collection;

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lye/Z;

    .line 75
    .line 76
    new-instance v4, LLe/v;

    .line 77
    .line 78
    invoke-direct {v4, p1, p0}, LLe/v;-><init>(Lye/g0;LLe/z;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v3, v4}, LLe/z;->P0(Lye/Z;Lkotlin/jvm/functions/Function1;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_3

    .line 86
    .line 87
    invoke-interface {v3}, Lye/u0;->N()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_4

    .line 92
    .line 93
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, LXe/f;->b()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    const-string v4, "asString(...)"

    .line 102
    .line 103
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v3}, LHe/H;->d(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_3

    .line 111
    .line 112
    :cond_4
    return v1

    .line 113
    :cond_5
    :goto_1
    invoke-direct {p0, p1}, LLe/z;->R0(Lye/g0;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_6

    .line 118
    .line 119
    invoke-direct {p0, p1}, LLe/z;->s1(Lye/g0;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_6

    .line 124
    .line 125
    invoke-direct {p0, p1}, LLe/z;->T0(Lye/g0;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_6

    .line 130
    .line 131
    const/4 p1, 0x1

    .line 132
    return p1

    .line 133
    :cond_6
    return v1
.end method

.method public static final synthetic g0(LLe/z;LXe/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LLe/z;->q1(LXe/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final g1(Lye/g0;LLe/z;LXe/f;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "accessorName"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lye/J;->getName()LXe/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-direct {p1, p2}, LLe/z;->q1(LXe/f;)Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {p1, p2}, LLe/z;->r1(LXe/f;)Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-static {p0, p1}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static final synthetic h0(LLe/z;LXe/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LLe/z;->r1(LXe/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h1(LLe/z;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, LLe/z;->o:LOe/g;

    .line 2
    .line 3
    invoke-interface {p0}, LOe/g;->A()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {p0}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method static synthetic i0(LLe/z;LKe/k;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/z;->D0(LLe/z;LKe/k;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final i1(LLe/z;LKe/k;LXe/f;)Lye/e;
    .locals 10

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LLe/z;->r:Lpf/i;

    .line 7
    .line 8
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LKe/d;->d()LHe/u;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v2, LHe/u$a;

    .line 30
    .line 31
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Lff/e;->n(Lye/h;)LXe/b;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p2}, LXe/b;->d(LXe/f;)LXe/b;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v5, p0, LLe/z;->o:LOe/g;

    .line 47
    .line 48
    const/4 v6, 0x2

    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct/range {v2 .. v7}, LHe/u$a;-><init>(LXe/b;[BLOe/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v2}, LHe/u;->b(LHe/u$a;)LOe/g;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    if-eqz v6, :cond_0

    .line 59
    .line 60
    new-instance v3, LLe/n;

    .line 61
    .line 62
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const/16 v8, 0x8

    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    move-object v4, p1

    .line 71
    invoke-direct/range {v3 .. v9}, LLe/n;-><init>(LKe/k;Lye/m;LOe/g;Lye/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, LKe/k;->a()LKe/d;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, LKe/d;->e()LHe/v;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-interface {p0, v3}, LHe/v;->a(LJe/c;)V

    .line 83
    .line 84
    .line 85
    return-object v3

    .line 86
    :cond_0
    return-object v1

    .line 87
    :cond_1
    move-object v4, p1

    .line 88
    iget-object p1, p0, LLe/z;->s:Lpf/i;

    .line 89
    .line 90
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Ljava/util/Set;

    .line 95
    .line 96
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    invoke-static {}, LUd/u;->c()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {v4}, LKe/k;->a()LKe/d;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, LKe/d;->w()Lgf/f;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-interface {v0, p0, p2, p1, v4}, Lgf/f;->d(Lye/e;LXe/f;Ljava/util/List;LKe/k;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, LUd/u;->a(Ljava/util/List;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_3

    .line 130
    .line 131
    const/4 p2, 0x1

    .line 132
    if-ne p1, p2, :cond_2

    .line 133
    .line 134
    invoke-static {p0}, LUd/u;->M0(Ljava/util/List;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast p0, Lye/e;

    .line 139
    .line 140
    return-object p0

    .line 141
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    new-instance p2, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v0, "Multiple classes with same name are generated: "

    .line 149
    .line 150
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1

    .line 168
    :cond_3
    return-object v1

    .line 169
    :cond_4
    iget-object p1, p0, LLe/z;->t:Lpf/i;

    .line 170
    .line 171
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Ljava/util/Map;

    .line 176
    .line 177
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    check-cast p1, LOe/n;

    .line 182
    .line 183
    if-eqz p1, :cond_5

    .line 184
    .line 185
    invoke-virtual {v4}, LKe/k;->e()Lpf/n;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    new-instance v1, LLe/y;

    .line 190
    .line 191
    invoke-direct {v1, p0}, LLe/y;-><init>(LLe/z;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v0, v1}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-virtual {v4}, LKe/k;->e()Lpf/n;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-static {v4, p1}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    invoke-virtual {v4}, LKe/k;->a()LKe/d;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-virtual {p0}, LKe/d;->t()LNe/b;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-interface {p0, p1}, LNe/b;->a(LOe/l;)LNe/a;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    move-object v4, p2

    .line 223
    invoke-static/range {v2 .. v7}, LBe/q;->L0(Lpf/n;Lye/e;LXe/f;Lpf/i;Lze/h;Lye/h0;)LBe/q;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    :cond_5
    return-object v1
.end method

.method static synthetic j0(LLe/z;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/z;->h1(LLe/z;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final j1(LLe/z;)Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/U;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LLe/U;->d()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-static {v0, p0}, LUd/a0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method static synthetic k0(LKe/k;LLe/z;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/z;->Y0(LKe/k;LLe/z;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final k1(Lye/g0;Lkotlin/jvm/functions/Function1;Ljava/util/Collection;)Lye/g0;
    .locals 2

    .line 1
    invoke-static {p1}, LHe/i;->l(Lye/z;)Lye/z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, LLe/z;->I0(Lye/z;Lkotlin/jvm/functions/Function1;)Lye/g0;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    invoke-direct {p0, p2}, LLe/z;->f1(Lye/g0;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object p2, v0

    .line 23
    :goto_0
    if-eqz p2, :cond_2

    .line 24
    .line 25
    invoke-direct {p0, p2, p1, p3}, LLe/z;->H0(Lye/g0;Lye/a;Ljava/util/Collection;)Lye/g0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_2
    return-object v0
.end method

.method static synthetic l0(LLe/z;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/z;->U0(LLe/z;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final l1(Lye/g0;Lkotlin/jvm/functions/Function1;LXe/f;Ljava/util/Collection;)Lye/g0;
    .locals 3

    .line 1
    invoke-static {p1}, LHe/T;->g(Lye/b;)Lye/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lye/g0;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {p1}, LHe/T;->e(Lye/b;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "identifier(...)"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lye/g0;

    .line 48
    .line 49
    invoke-direct {p0, v1, p3}, LLe/z;->N0(Lye/g0;LXe/f;)Lye/g0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {p0, p1, v1}, LLe/z;->S0(Lye/g0;Lye/z;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    invoke-direct {p0, v1, p1, p4}, LLe/z;->H0(Lye/g0;Lye/a;Ljava/util/Collection;)Lye/g0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_2
    return-object v0
.end method

.method static synthetic m0(LLe/z;LKe/k;LXe/f;)Lye/e;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LLe/z;->i1(LLe/z;LKe/k;LXe/f;)Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final m1(Lye/g0;Lkotlin/jvm/functions/Function1;)Lye/g0;
    .locals 3

    .line 1
    invoke-interface {p1}, Lye/z;->isSuspend()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "getName(...)"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p2, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lye/g0;

    .line 39
    .line 40
    invoke-direct {p0, v0}, LLe/z;->O0(Lye/g0;)Lye/g0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-direct {p0, v0, p1}, LLe/z;->Q0(Lye/a;Lye/a;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object v0, v1

    .line 54
    :goto_0
    if-eqz v0, :cond_1

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_3
    return-object v1
.end method

.method static synthetic n0(LOe/q;)Z
    .locals 0

    .line 1
    invoke-static {p0}, LLe/z;->z0(LOe/q;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static synthetic o0(Lye/g0;LLe/z;LXe/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LLe/z;->g1(Lye/g0;LLe/z;LXe/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final o1(LOe/k;)LJe/b;
    .locals 10

    .line 1
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1, p1}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, LKe/k;->a()LKe/d;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, LKe/d;->t()LNe/b;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2, p1}, LNe/b;->a(LOe/l;)LNe/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v0, v1, v3, v2}, LJe/b;->t1(Lye/e;Lze/h;ZLye/h0;)LJe/b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "createJavaConstructor(...)"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v0}, Lye/e;->q()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-static {v2, v1, p1, v4}, LKe/c;->h(LKe/k;Lye/m;LOe/z;I)LKe/k;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {p1}, LOe/k;->j()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {p0, v2, v1, v4}, LLe/U;->d0(LKe/k;Lye/z;Ljava/util/List;)LLe/U$b;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v0}, Lye/e;->q()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    const-string v6, "getDeclaredTypeParameters(...)"

    .line 68
    .line 69
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, LOe/z;->getTypeParameters()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-instance v7, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v8, 0xa

    .line 79
    .line 80
    invoke-static {v6, v8}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_0

    .line 96
    .line 97
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, LOe/y;

    .line 102
    .line 103
    invoke-virtual {v2}, LKe/k;->f()LKe/p;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-interface {v9, v8}, LKe/p;->a(LOe/y;)Lye/m0;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-static {v8}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    invoke-static {v5, v7}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v4}, LLe/U$b;->a()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-interface {p1}, LOe/s;->getVisibility()Lye/x0;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-static {v7}, LHe/V;->d(Lye/x0;)Lye/u;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v1, v6, v7, v5}, LBe/i;->r1(Ljava/util/List;Lye/u;Ljava/util/List;)LBe/i;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v3}, LJe/b;->Y0(Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4}, LLe/U$b;->b()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-virtual {v1, v3}, LJe/b;->Z0(Z)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v0}, Lye/e;->p()Lqf/d0;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v1, v0}, LBe/s;->g1(Lqf/S;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, LKe/k;->a()LKe/d;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, LKe/d;->h()LIe/j;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-interface {v0, p1, v1}, LIe/j;->c(LOe/l;Lye/l;)V

    .line 163
    .line 164
    .line 165
    return-object v1
.end method

.method static synthetic p0(LLe/z;LXe/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/z;->A0(LLe/z;LXe/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final p1(LOe/w;)LJe/e;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, LLe/U;->L()LKe/k;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1, v0}, LKe/h;->a(LKe/k;LOe/d;)Lze/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual/range {p0 .. p0}, LLe/z;->c1()Lye/e;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v0}, LOe/t;->getName()LXe/f;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual/range {p0 .. p0}, LLe/U;->L()LKe/k;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, LKe/k;->a()LKe/d;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, LKe/d;->t()LNe/b;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-interface {v4, v0}, LNe/b;->a(LOe/l;)LNe/a;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-static {v2, v1, v3, v4, v5}, LJe/e;->p1(Lye/m;Lze/h;LXe/f;Lye/h0;Z)LJe/e;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const-string v1, "createJavaMethod(...)"

    .line 41
    .line 42
    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object v7, Lqf/I0;->b:Lqf/I0;

    .line 46
    .line 47
    const/4 v11, 0x6

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    invoke-static/range {v7 .. v12}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual/range {p0 .. p0}, LLe/U;->L()LKe/k;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, LKe/k;->g()LMe/e;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v0}, LOe/w;->getType()LOe/x;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v3, v1}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-virtual/range {p0 .. p0}, LLe/z;->O()Lye/c0;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    sget-object v1, Lye/E;->a:Lye/E$a;

    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    invoke-virtual {v1, v2, v2, v5}, Lye/E$a;->a(ZZZ)Lye/E;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    sget-object v14, Lye/t;->e:Lye/u;

    .line 96
    .line 97
    const/4 v15, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    invoke-virtual/range {v6 .. v15}, LJe/e;->o1(Lye/c0;Lye/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;Lye/E;Lye/u;Ljava/util/Map;)LBe/O;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v2, v2}, LJe/e;->s1(ZZ)V

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {p0 .. p0}, LLe/U;->L()LKe/k;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, LKe/k;->a()LKe/d;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, LKe/d;->h()LIe/j;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-interface {v1, v0, v6}, LIe/j;->a(LOe/q;Lye/g0;)V

    .line 118
    .line 119
    .line 120
    return-object v6
.end method

.method static synthetic q0(LLe/z;LXe/f;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/z;->B0(LLe/z;LXe/f;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final q1(LXe/f;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LLe/c;

    .line 10
    .line 11
    invoke-interface {v0, p1}, LLe/c;->c(LXe/f;)Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v1, 0xa

    .line 20
    .line 21
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, LOe/r;

    .line 43
    .line 44
    invoke-virtual {p0, v1}, LLe/U;->Z(LOe/r;)LJe/e;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-object v0
.end method

.method static synthetic r0(LLe/z;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/z;->j1(LLe/z;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final r1(LXe/f;)Ljava/util/Collection;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LLe/z;->b1(LXe/f;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, Lye/g0;

    .line 28
    .line 29
    invoke-static {v2}, LHe/T;->d(Lye/b;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    invoke-static {v2}, LHe/i;->l(Lye/z;)Lye/z;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-object v0
.end method

.method private final s0(Ljava/util/List;Lye/l;ILOe/r;Lqf/S;Lqf/S;)V
    .locals 13

    .line 1
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    invoke-interface/range {p4 .. p4}, LOe/t;->getName()LXe/f;

    .line 8
    .line 9
    .line 10
    move-result-object v6

    .line 11
    invoke-static/range {p5 .. p5}, Lqf/J0;->n(Lqf/S;)Lqf/S;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    const-string v0, "makeNotNullable(...)"

    .line 16
    .line 17
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface/range {p4 .. p4}, LOe/r;->M()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    if-eqz p6, :cond_0

    .line 25
    .line 26
    invoke-static/range {p6 .. p6}, Lqf/J0;->n(Lqf/S;)Lqf/S;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    move-object v11, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v0, 0x0

    .line 33
    goto :goto_0

    .line 34
    :goto_1
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, LKe/d;->t()LNe/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object/from16 v1, p4

    .line 47
    .line 48
    invoke-interface {v0, v1}, LNe/b;->a(LOe/l;)LNe/a;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    new-instance v1, LBe/V;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    move-object v2, p2

    .line 58
    move/from16 v4, p3

    .line 59
    .line 60
    invoke-direct/range {v1 .. v12}, LBe/V;-><init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private final s1(Lye/g0;)Z
    .locals 4

    .line 1
    sget-object v0, LHe/i;->o:LHe/i;

    .line 2
    .line 3
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getName(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LHe/i;->n(LXe/f;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    invoke-interface {p1}, Lye/J;->getName()LXe/f;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, LLe/z;->b1(LXe/f;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Iterable;

    .line 32
    .line 33
    new-instance v2, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lye/g0;

    .line 53
    .line 54
    invoke-static {v3}, LHe/i;->l(Lye/z;)Lye/z;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    return v1

    .line 71
    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lye/z;

    .line 86
    .line 87
    invoke-direct {p0, p1, v2}, LLe/z;->e1(Lye/g0;Lye/z;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    return p1

    .line 95
    :cond_5
    return v1
.end method

.method private final t0(Ljava/util/Collection;LXe/f;Ljava/util/Collection;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LKe/d;->c()Lmf/w;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LKe/d;->k()Lrf/p;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Lrf/p;->b()Lbf/o;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    move-object v2, p1

    .line 34
    move-object v0, p2

    .line 35
    move-object v1, p3

    .line 36
    invoke-static/range {v0 .. v5}, LIe/a;->d(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Lye/e;Lmf/w;Lbf/o;)Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string p2, "resolveOverridesForNonStaticMembers(...)"

    .line 41
    .line 42
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    if-nez p4, :cond_0

    .line 46
    .line 47
    invoke-interface {v2, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 52
    .line 53
    invoke-static {v2, p1}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-instance p3, Ljava/util/ArrayList;

    .line 58
    .line 59
    const/16 p4, 0xa

    .line 60
    .line 61
    invoke-static {p1, p4}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result p4

    .line 76
    if-eqz p4, :cond_2

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    check-cast p4, Lye/g0;

    .line 83
    .line 84
    invoke-static {p4}, LHe/T;->j(Lye/b;)Lye/b;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lye/g0;

    .line 89
    .line 90
    if-nez v0, :cond_1

    .line 91
    .line 92
    invoke-static {p4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    invoke-static {p4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0, p4, v0, p2}, LLe/z;->H0(Lye/g0;Lye/a;Ljava/util/Collection;)Lye/g0;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    :goto_1
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    invoke-interface {v2, p3}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method private final u0(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lye/g0;

    .line 16
    .line 17
    invoke-direct {p0, v0, p5, p1, p2}, LLe/z;->l1(Lye/g0;Lkotlin/jvm/functions/Function1;LXe/f;Ljava/util/Collection;)Lye/g0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {p4, v1}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0, p5, p2}, LLe/z;->k1(Lye/g0;Lkotlin/jvm/functions/Function1;Ljava/util/Collection;)Lye/g0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p4, v1}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v0, p5}, LLe/z;->m1(Lye/g0;Lkotlin/jvm/functions/Function1;)Lye/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p4, v0}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method private final v0(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lye/Z;

    .line 16
    .line 17
    invoke-direct {p0, v0, p4}, LLe/z;->J0(Lye/Z;Lkotlin/jvm/functions/Function1;)LJe/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    if-eqz p3, :cond_1

    .line 27
    .line 28
    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method private final w0(LXe/f;Ljava/util/Collection;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LLe/c;

    .line 10
    .line 11
    invoke-interface {v0, p1}, LLe/c;->c(LXe/f;)Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-static {p1}, LUd/u;->N0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    move-object v1, p1

    .line 22
    check-cast v1, LOe/r;

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v3, Lye/E;->b:Lye/E;

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    move-object v0, p0

    .line 33
    invoke-static/range {v0 .. v5}, LLe/z;->L0(LLe/z;LOe/r;Lqf/S;Lye/E;ILjava/lang/Object;)LJe/f;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private static final z0(LOe/q;)Z
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
    xor-int/lit8 p0, p0, 0x1

    .line 11
    .line 12
    return p0
.end method


# virtual methods
.method protected B(Ljava/util/Collection;LXe/f;)V
    .locals 11

    .line 1
    const-string v3, "result"

    .line 2
    .line 3
    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v3, "name"

    .line 7
    .line 8
    invoke-static {p2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p2}, LLe/z;->b1(LXe/f;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    sget-object v3, LHe/U;->a:LHe/U$a;

    .line 16
    .line 17
    invoke-virtual {v3, p2}, LHe/U$a;->k(LXe/f;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_5

    .line 22
    .line 23
    sget-object v3, LHe/i;->o:LHe/i;

    .line 24
    .line 25
    invoke-virtual {v3, p2}, LHe/i;->n(LXe/f;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_5

    .line 30
    .line 31
    move-object v3, v9

    .line 32
    check-cast v3, Ljava/lang/Iterable;

    .line 33
    .line 34
    instance-of v4, v3, Ljava/util/Collection;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    move-object v4, v3

    .line 39
    check-cast v4, Ljava/util/Collection;

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Lye/z;

    .line 63
    .line 64
    invoke-interface {v5}, Lye/z;->isSuspend()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    move-object v6, v5

    .line 91
    check-cast v6, Lye/g0;

    .line 92
    .line 93
    invoke-direct {p0, v6}, LLe/z;->f1(Lye/g0;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_3

    .line 98
    .line 99
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    const/4 v3, 0x0

    .line 104
    invoke-direct {p0, p1, p2, v4, v3}, LLe/z;->t0(Ljava/util/Collection;LXe/f;Ljava/util/Collection;Z)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    :goto_2
    sget-object v3, LAf/k;->c:LAf/k$b;

    .line 109
    .line 110
    invoke-virtual {v3}, LAf/k$b;->a()LAf/k;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    move-object v4, v9

    .line 115
    check-cast v4, Ljava/util/Collection;

    .line 116
    .line 117
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    sget-object v7, Lmf/w;->a:Lmf/w;

    .line 126
    .line 127
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v3}, LKe/k;->a()LKe/d;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v3}, LKe/d;->k()Lrf/p;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-interface {v3}, Lrf/p;->b()Lbf/o;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    move-object v3, p2

    .line 144
    invoke-static/range {v3 .. v8}, LIe/a;->d(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Lye/e;Lmf/w;Lbf/o;)Ljava/util/Collection;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const-string v3, "resolveOverridesForNonStaticMembers(...)"

    .line 149
    .line 150
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    new-instance v5, LLe/z$a;

    .line 154
    .line 155
    invoke-direct {v5, p0}, LLe/z$a;-><init>(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move-object v4, p1

    .line 159
    move-object v0, p0

    .line 160
    move-object v2, p1

    .line 161
    move-object v3, v1

    .line 162
    move-object v1, p2

    .line 163
    invoke-direct/range {v0 .. v5}, LLe/z;->u0(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V

    .line 164
    .line 165
    .line 166
    new-instance v5, LLe/z$b;

    .line 167
    .line 168
    invoke-direct {v5, p0}, LLe/z$b;-><init>(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move-object v4, v10

    .line 172
    invoke-direct/range {v0 .. v5}, LLe/z;->u0(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V

    .line 173
    .line 174
    .line 175
    check-cast v9, Ljava/lang/Iterable;

    .line 176
    .line 177
    new-instance v3, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-eqz v6, :cond_7

    .line 191
    .line 192
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    move-object v7, v6

    .line 197
    check-cast v7, Lye/g0;

    .line 198
    .line 199
    invoke-direct {p0, v7}, LLe/z;->f1(Lye/g0;)Z

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-eqz v7, :cond_6

    .line 204
    .line 205
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_7
    invoke-static {v3, v4}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    const/4 v4, 0x1

    .line 214
    invoke-direct {p0, p1, p2, v3, v4}, LLe/z;->t0(Ljava/util/Collection;LXe/f;Ljava/util/Collection;Z)V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method protected C(LXe/f;Ljava/util/Collection;)V
    .locals 7

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
    iget-object v0, p0, LLe/z;->o:LOe/g;

    .line 12
    .line 13
    invoke-interface {v0}, LOe/g;->o()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, p1, p2}, LLe/z;->w0(LXe/f;Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-direct {p0, p1}, LLe/z;->d1(LXe/f;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget-object v1, LAf/k;->c:LAf/k$b;

    .line 34
    .line 35
    invoke-virtual {v1}, LAf/k$b;->a()LAf/k;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1}, LAf/k$b;->a()LAf/k;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v3, LLe/w;

    .line 44
    .line 45
    invoke-direct {v3, p0}, LLe/w;-><init>(LLe/z;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, v0, p2, v2, v3}, LLe/z;->v0(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v2}, LUd/a0;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v3, LLe/x;

    .line 56
    .line 57
    invoke-direct {v3, p0}, LLe/x;-><init>(LLe/z;)V

    .line 58
    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-direct {p0, v2, v1, v4, v3}, LLe/z;->v0(Ljava/util/Set;Ljava/util/Collection;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, LUd/a0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v2, v0

    .line 69
    check-cast v2, Ljava/util/Collection;

    .line 70
    .line 71
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, LKe/d;->c()Lmf/w;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, LKe/d;->k()Lrf/p;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {v0}, Lrf/p;->b()Lbf/o;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    move-object v1, p1

    .line 104
    move-object v3, p2

    .line 105
    invoke-static/range {v1 .. v6}, LIe/a;->d(LXe/f;Ljava/util/Collection;Ljava/util/Collection;Lye/e;Lmf/w;Lbf/o;)Ljava/util/Collection;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string p2, "resolveOverridesForNonStaticMembers(...)"

    .line 110
    .line 111
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v3, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 115
    .line 116
    .line 117
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
    iget-object p1, p0, LLe/z;->o:LOe/g;

    .line 7
    .line 8
    invoke-interface {p1}, LOe/g;->o()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LLe/U;->b()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, LLe/c;

    .line 30
    .line 31
    invoke-interface {p2}, LLe/c;->e()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Ljava/util/Collection;

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-interface {p2}, Lye/h;->l()Lqf/v0;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-interface {p2}, Lqf/v0;->k()Ljava/util/Collection;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const-string v0, "getSupertypes(...)"

    .line 53
    .line 54
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast p2, Ljava/lang/Iterable;

    .line 58
    .line 59
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lqf/S;

    .line 74
    .line 75
    invoke-virtual {v0}, Lqf/S;->o()Ljf/k;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, Ljf/k;->d()Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/lang/Iterable;

    .line 84
    .line 85
    invoke-static {p1, v0}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    return-object p1
.end method

.method protected O()Lye/c0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lbf/i;->l(Lye/m;)Lye/c0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public bridge synthetic R()Lye/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected V(LJe/e;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LLe/z;->o:LOe/g;

    .line 7
    .line 8
    invoke-interface {v0}, LOe/g;->o()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-direct {p0, p1}, LLe/z;->f1(Lye/g0;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method protected Y(LOe/r;Ljava/util/List;Lqf/S;Ljava/util/List;)LLe/U$a;
    .locals 8

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "methodTypeParameters"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "returnType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "valueParameters"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, LKe/d;->s()LIe/o;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 v5, 0x0

    .line 38
    move-object v2, p1

    .line 39
    move-object v7, p2

    .line 40
    move-object v4, p3

    .line 41
    move-object v6, p4

    .line 42
    invoke-interface/range {v1 .. v7}, LIe/o;->a(LOe/r;Lye/e;Lqf/S;Lqf/S;Ljava/util/List;Ljava/util/List;)LIe/o$b;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, "resolvePropagatedSignature(...)"

    .line 47
    .line 48
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, LLe/U$a;

    .line 52
    .line 53
    invoke-virtual {p1}, LIe/o$b;->d()Lqf/S;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string p2, "getReturnType(...)"

    .line 58
    .line 59
    invoke-static {v1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, LIe/o$b;->c()Lqf/S;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {p1}, LIe/o$b;->f()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const-string p2, "getValueParameters(...)"

    .line 71
    .line 72
    invoke-static {v3, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, LIe/o$b;->e()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const-string p2, "getTypeParameters(...)"

    .line 80
    .line 81
    invoke-static {v4, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, LIe/o$b;->g()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-virtual {p1}, LIe/o$b;->b()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    const-string p1, "getErrors(...)"

    .line 93
    .line 94
    invoke-static {v6, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v0 .. v6}, LLe/U$a;-><init>(Lqf/S;Lqf/S;Ljava/util/List;Ljava/util/List;ZLjava/util/List;)V

    .line 98
    .line 99
    .line 100
    return-object v0
.end method

.method public a(LXe/f;LGe/b;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, LLe/z;->n1(LXe/f;LGe/b;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2}, LLe/U;->a(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final a1()Lpf/i;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/z;->q:Lpf/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(LXe/f;LGe/b;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, LLe/z;->n1(LXe/f;LGe/b;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2}, LLe/U;->c(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method protected c1()Lye/e;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/z;->n:Lye/e;

    .line 2
    .line 3
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
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, LLe/z;->n1(LXe/f;LGe/b;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LLe/U;->Q()LLe/U;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, LLe/z;

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    iget-object p2, p2, LLe/z;->u:Lpf/h;

    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lye/e;

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_0
    iget-object p2, p0, LLe/z;->u:Lpf/h;

    .line 36
    .line 37
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lye/h;

    .line 42
    .line 43
    return-object p1
.end method

.method public n1(LXe/f;LGe/b;)V
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

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
    invoke-virtual {v0}, LKe/d;->l()LGe/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, p2, v1, p1}, LFe/a;->a(LGe/c;LGe/b;Lye/e;LXe/f;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Lazy Java member scope for "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LLe/z;->o:LOe/g;

    .line 12
    .line 13
    invoke-interface {v1}, LOe/g;->f()LXe/c;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
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
    iget-object p1, p0, LLe/z;->r:Lpf/i;

    .line 7
    .line 8
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/Set;

    .line 13
    .line 14
    iget-object p2, p0, LLe/z;->t:Lpf/i;

    .line 15
    .line 16
    invoke-interface {p2}, Lie/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Ljava/lang/Iterable;

    .line 27
    .line 28
    invoke-static {p1, p2}, LUd/a0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public bridge synthetic x(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LLe/z;->x0(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected x0(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/LinkedHashSet;
    .locals 3

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Lye/h;->l()Lqf/v0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Lqf/v0;->k()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "getSupertypes(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    check-cast v0, Ljava/lang/Iterable;

    .line 24
    .line 25
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lqf/S;

    .line 45
    .line 46
    invoke-virtual {v2}, Lqf/S;->o()Ljf/k;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v2}, Ljf/k;->b()Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/Iterable;

    .line 55
    .line 56
    invoke-static {v1, v2}, LUd/u;->D(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, LLe/c;

    .line 69
    .line 70
    invoke-interface {v0}, LLe/c;->a()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ljava/util/Collection;

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, LLe/c;

    .line 88
    .line 89
    invoke-interface {v0}, LLe/c;->d()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Ljava/util/Collection;

    .line 94
    .line 95
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, LLe/z;->v(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Ljava/util/Collection;

    .line 103
    .line 104
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, LKe/k;->a()LKe/d;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, LKe/d;->w()Lgf/f;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface {p1, p2, v0}, Lgf/f;->h(Lye/e;LKe/k;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 132
    .line 133
    .line 134
    return-object v1
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
    iget-object v0, p0, LLe/z;->o:LOe/g;

    .line 12
    .line 13
    invoke-interface {v0}, LOe/g;->q()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LLe/c;

    .line 28
    .line 29
    invoke-interface {v0, p2}, LLe/c;->b(LXe/f;)LOe/w;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    move-object v0, p1

    .line 36
    check-cast v0, Ljava/lang/Iterable;

    .line 37
    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Ljava/util/Collection;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lye/g0;

    .line 63
    .line 64
    invoke-interface {v1}, Lye/a;->j()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    :goto_0
    invoke-virtual {p0}, LLe/U;->N()Lpf/i;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, LLe/c;

    .line 84
    .line 85
    invoke-interface {v0, p2}, LLe/c;->b(LXe/f;)LOe/w;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, v0}, LLe/z;->p1(LOe/w;)LJe/e;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_1
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, LKe/d;->w()Lgf/f;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p0}, LLe/z;->c1()Lye/e;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-interface {v0, v1, p2, p1, v2}, Lgf/f;->c(Lye/e;LXe/f;Ljava/util/Collection;LKe/k;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method protected y0()LLe/b;
    .locals 3

    .line 1
    new-instance v0, LLe/b;

    .line 2
    .line 3
    iget-object v1, p0, LLe/z;->o:LOe/g;

    .line 4
    .line 5
    sget-object v2, LLe/u;->a:LLe/u;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LLe/b;-><init>(LOe/g;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic z()LLe/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/z;->y0()LLe/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
