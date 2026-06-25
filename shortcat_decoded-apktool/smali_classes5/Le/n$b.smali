.class final LLe/n$b;
.super Lqf/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLe/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final d:Lpf/i;

.field final synthetic e:LLe/n;


# direct methods
.method public constructor <init>(LLe/n;)V
    .locals 2

    .line 1
    iput-object p1, p0, LLe/n$b;->e:LLe/n;

    .line 2
    .line 3
    invoke-static {p1}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LKe/k;->e()Lpf/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Lqf/b;-><init>(Lpf/n;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LKe/k;->e()Lpf/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, LLe/o;

    .line 23
    .line 24
    invoke-direct {v1, p1}, LLe/o;-><init>(LLe/n;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, LLe/n$b;->d:Lpf/i;

    .line 32
    .line 33
    return-void
.end method

.method static synthetic J(LLe/n;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LLe/n$b;->M(LLe/n;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final K()Lqf/S;
    .locals 8

    .line 1
    invoke-direct {p0}, LLe/n$b;->L()LXe/c;

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
    invoke-virtual {v0}, LXe/c;->c()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    sget-object v2, Lve/o;->z:LXe/f;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, LXe/c;->h(LXe/f;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v1

    .line 24
    :goto_0
    if-nez v0, :cond_1

    .line 25
    .line 26
    sget-object v2, LHe/r;->a:LHe/r;

    .line 27
    .line 28
    iget-object v3, p0, LLe/n$b;->e:LLe/n;

    .line 29
    .line 30
    invoke-static {v3}, Lff/e;->o(Lye/m;)LXe/c;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, LHe/r;->b(LXe/c;)LXe/c;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_1
    move-object v2, v0

    .line 42
    :cond_2
    iget-object v3, p0, LLe/n$b;->e:LLe/n;

    .line 43
    .line 44
    invoke-static {v3}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, LKe/k;->d()Lye/H;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    sget-object v4, LGe/d;->s:LGe/d;

    .line 53
    .line 54
    invoke-static {v3, v2, v4}, Lff/e;->B(Lye/H;LXe/c;LGe/b;)Lye/e;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    invoke-interface {v2}, Lye/h;->l()Lqf/v0;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-interface {v3}, Lqf/v0;->getParameters()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    iget-object v4, p0, LLe/n$b;->e:LLe/n;

    .line 74
    .line 75
    invoke-virtual {v4}, LLe/n;->l()Lqf/v0;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v4}, Lqf/v0;->getParameters()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const-string v5, "getParameters(...)"

    .line 84
    .line 85
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    const/16 v6, 0xa

    .line 93
    .line 94
    if-ne v5, v3, :cond_4

    .line 95
    .line 96
    new-instance v0, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-static {v4, v6}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Lye/m0;

    .line 120
    .line 121
    new-instance v4, Lqf/D0;

    .line 122
    .line 123
    sget-object v5, Lqf/N0;->e:Lqf/N0;

    .line 124
    .line 125
    invoke-interface {v3}, Lye/h;->p()Lqf/d0;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-direct {v4, v5, v3}, Lqf/D0;-><init>(Lqf/N0;Lqf/S;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    const/4 v7, 0x1

    .line 137
    if-ne v5, v7, :cond_7

    .line 138
    .line 139
    if-le v3, v7, :cond_7

    .line 140
    .line 141
    if-nez v0, :cond_7

    .line 142
    .line 143
    new-instance v0, Lqf/D0;

    .line 144
    .line 145
    sget-object v1, Lqf/N0;->e:Lqf/N0;

    .line 146
    .line 147
    invoke-static {v4}, LUd/u;->M0(Ljava/util/List;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    check-cast v4, Lye/m0;

    .line 152
    .line 153
    invoke-interface {v4}, Lye/h;->p()Lqf/d0;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-direct {v0, v1, v4}, Lqf/D0;-><init>(Lqf/N0;Lqf/S;)V

    .line 158
    .line 159
    .line 160
    new-instance v1, Loe/f;

    .line 161
    .line 162
    invoke-direct {v1, v7, v3}, Loe/f;-><init>(II)V

    .line 163
    .line 164
    .line 165
    new-instance v3, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-static {v1, v6}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_5

    .line 183
    .line 184
    move-object v4, v1

    .line 185
    check-cast v4, LUd/O;

    .line 186
    .line 187
    invoke-virtual {v4}, LUd/O;->nextInt()I

    .line 188
    .line 189
    .line 190
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_5
    move-object v0, v3

    .line 195
    :cond_6
    sget-object v1, Lqf/r0;->b:Lqf/r0$a;

    .line 196
    .line 197
    invoke-virtual {v1}, Lqf/r0$a;->k()Lqf/r0;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v1, v2, v0}, Lqf/V;->h(Lqf/r0;Lye/e;Ljava/util/List;)Lqf/d0;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    return-object v0

    .line 206
    :cond_7
    return-object v1
.end method

.method private final L()LXe/c;
    .locals 3

    .line 1
    iget-object v0, p0, LLe/n$b;->e:LLe/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LLe/n;->getAnnotations()Lze/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, LHe/I;->r:LXe/c;

    .line 8
    .line 9
    const-string v2, "PURELY_IMPLEMENTS_ANNOTATION"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lze/h;->h(LXe/c;)Lze/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    invoke-interface {v0}, Lze/c;->a()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-static {v0}, LUd/u;->N0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    instance-of v2, v0, Ldf/x;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    check-cast v0, Ldf/x;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v0, v1

    .line 44
    :goto_0
    if-eqz v0, :cond_4

    .line 45
    .line 46
    invoke-virtual {v0}, Ldf/g;->b()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-static {v0}, LXe/e;->e(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    new-instance v1, LXe/c;

    .line 63
    .line 64
    invoke-direct {v1, v0}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    :goto_1
    return-object v1
.end method

.method private static final M(LLe/n;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lye/q0;->g(Lye/i;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public I()Lye/e;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n$b;->e:LLe/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n$b;->d:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic p()Lye/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/n$b;->I()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method protected r()Ljava/util/Collection;
    .locals 13

    .line 1
    iget-object v0, p0, LLe/n$b;->e:LLe/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LLe/n;->S0()LOe/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LOe/g;->k()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, LLe/n$b;->K()Lqf/S;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, LOe/j;

    .line 46
    .line 47
    iget-object v6, p0, LLe/n$b;->e:LLe/n;

    .line 48
    .line 49
    invoke-static {v6}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v6}, LKe/k;->g()LMe/e;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    sget-object v7, Lqf/I0;->a:Lqf/I0;

    .line 58
    .line 59
    const/4 v11, 0x7

    .line 60
    const/4 v12, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v10, 0x0

    .line 64
    invoke-static/range {v7 .. v12}, LMe/b;->b(Lqf/I0;ZZLye/m0;ILjava/lang/Object;)LMe/a;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {v6, v4, v7}, LMe/e;->p(LOe/x;LMe/a;)Lqf/S;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    iget-object v7, p0, LLe/n$b;->e:LLe/n;

    .line 73
    .line 74
    invoke-static {v7}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v7}, LKe/k;->a()LKe/d;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {v7}, LKe/d;->r()LPe/m0;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    iget-object v8, p0, LLe/n$b;->e:LLe/n;

    .line 87
    .line 88
    invoke-static {v8}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-virtual {v7, v6, v8}, LPe/m0;->q(Lqf/S;LKe/k;)Lqf/S;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v6}, Lqf/S;->N0()Lqf/v0;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-interface {v7}, Lqf/v0;->p()Lye/h;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    instance-of v7, v7, Lye/M$b;

    .line 105
    .line 106
    if-eqz v7, :cond_1

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :cond_1
    invoke-virtual {v6}, Lqf/S;->N0()Lqf/v0;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-eqz v3, :cond_2

    .line 116
    .line 117
    invoke-virtual {v3}, Lqf/S;->N0()Lqf/v0;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    :cond_2
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_3

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    invoke-static {v6}, Lve/i;->c0(Lqf/S;)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_0

    .line 133
    .line 134
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    iget-object v0, p0, LLe/n$b;->e:LLe/n;

    .line 139
    .line 140
    invoke-static {v0}, LLe/n;->K0(LLe/n;)Lye/e;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    iget-object v4, p0, LLe/n$b;->e:LLe/n;

    .line 147
    .line 148
    invoke-static {v0, v4}, Lxe/y;->a(Lye/e;Lye/e;)Lqf/w0;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v4}, Lqf/E0;->c()Lqf/G0;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-interface {v0}, Lye/e;->p()Lqf/d0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    sget-object v5, Lqf/N0;->e:Lqf/N0;

    .line 161
    .line 162
    invoke-virtual {v4, v0, v5}, Lqf/G0;->p(Lqf/S;Lqf/N0;)Lqf/S;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    :cond_5
    invoke-static {v1, v5}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v1, v3}, LAf/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_7

    .line 177
    .line 178
    iget-object v0, p0, LLe/n$b;->e:LLe/n;

    .line 179
    .line 180
    invoke-static {v0}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, LKe/d;->c()Lmf/w;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {p0}, LLe/n$b;->I()Lye/e;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    new-instance v4, Ljava/util/ArrayList;

    .line 197
    .line 198
    const/16 v5, 0xa

    .line 199
    .line 200
    invoke-static {v2, v5}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-eqz v5, :cond_6

    .line 216
    .line 217
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    check-cast v5, LOe/x;

    .line 222
    .line 223
    const-string v6, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType"

    .line 224
    .line 225
    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    check-cast v5, LOe/j;

    .line 229
    .line 230
    invoke-interface {v5}, LOe/j;->E()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_6
    invoke-interface {v0, v3, v4}, Lmf/w;->b(Lye/e;Ljava/util/List;)V

    .line 239
    .line 240
    .line 241
    :cond_7
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_8

    .line 246
    .line 247
    invoke-static {v1}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    return-object v0

    .line 252
    :cond_8
    iget-object v0, p0, LLe/n$b;->e:LLe/n;

    .line 253
    .line 254
    invoke-static {v0}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0}, LKe/k;->d()Lye/H;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-interface {v0}, Lye/H;->n()Lve/i;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Lve/i;->i()Lqf/d0;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-static {v0}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LLe/n$b;->e:LLe/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/a;->getName()LXe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LXe/f;->b()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "asString(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method protected v()Lye/k0;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/n$b;->e:LLe/n;

    .line 2
    .line 3
    invoke-static {v0}, LLe/n;->L0(LLe/n;)LKe/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LKe/d;->v()Lye/k0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
