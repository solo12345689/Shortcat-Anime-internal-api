.class final Lof/m$b;
.super Lqf/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lof/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final d:Lpf/i;

.field final synthetic e:Lof/m;


# direct methods
.method public constructor <init>(Lof/m;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lof/m$b;->e:Lof/m;

    .line 2
    .line 3
    invoke-virtual {p1}, Lof/m;->d1()Lmf/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lmf/p;->h()Lpf/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, v0}, Lqf/b;-><init>(Lpf/n;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lof/m;->d1()Lmf/p;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lmf/p;->h()Lpf/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lof/n;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Lof/n;-><init>(Lof/m;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lof/m$b;->d:Lpf/i;

    .line 32
    .line 33
    return-void
.end method

.method static synthetic J(Lof/m;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lof/m$b;->L(Lof/m;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final L(Lof/m;)Ljava/util/List;
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
.method public bridge synthetic I()Lye/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lof/m$b;->K()Lof/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public K()Lof/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m$b;->e:Lof/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m$b;->d:Lpf/i;

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
    invoke-virtual {p0}, Lof/m$b;->K()Lof/m;

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
    .locals 7

    .line 1
    iget-object v0, p0, Lof/m$b;->e:Lof/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lof/m;->e1()LSe/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lof/m$b;->e:Lof/m;

    .line 8
    .line 9
    invoke-virtual {v1}, Lof/m;->d1()Lmf/p;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lmf/p;->j()LUe/h;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, LUe/g;->o(LSe/c;LUe/h;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lof/m$b;->e:Lof/m;

    .line 22
    .line 23
    new-instance v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v3, 0xa

    .line 26
    .line 27
    invoke-static {v0, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, LSe/r;

    .line 49
    .line 50
    invoke-virtual {v1}, Lof/m;->d1()Lmf/p;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Lmf/p;->i()Lmf/X;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5, v4}, Lmf/X;->u(LSe/r;)Lqf/S;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, Lof/m$b;->e:Lof/m;

    .line 67
    .line 68
    invoke-virtual {v0}, Lof/m;->d1()Lmf/p;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lmf/n;->c()LAe/a;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v1, p0, Lof/m$b;->e:Lof/m;

    .line 81
    .line 82
    invoke-interface {v0, v1}, LAe/a;->a(Lye/e;)Ljava/util/Collection;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/lang/Iterable;

    .line 87
    .line 88
    invoke-static {v2, v0}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    new-instance v1, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_3

    .line 106
    .line 107
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Lqf/S;

    .line 112
    .line 113
    invoke-virtual {v4}, Lqf/S;->N0()Lqf/v0;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-interface {v4}, Lqf/v0;->p()Lye/h;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    instance-of v5, v4, Lye/M$b;

    .line 122
    .line 123
    if-eqz v5, :cond_2

    .line 124
    .line 125
    check-cast v4, Lye/M$b;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    const/4 v4, 0x0

    .line 129
    :goto_2
    if-eqz v4, :cond_1

    .line 130
    .line 131
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    iget-object v2, p0, Lof/m$b;->e:Lof/m;

    .line 142
    .line 143
    invoke-virtual {v2}, Lof/m;->d1()Lmf/p;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Lmf/p;->c()Lmf/n;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v2}, Lmf/n;->j()Lmf/w;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    iget-object v4, p0, Lof/m$b;->e:Lof/m;

    .line 156
    .line 157
    new-instance v5, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-static {v1, v3}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_6

    .line 175
    .line 176
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, Lye/M$b;

    .line 181
    .line 182
    invoke-static {v3}, Lff/e;->n(Lye/h;)LXe/b;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    if-eqz v6, :cond_4

    .line 187
    .line 188
    invoke-virtual {v6}, LXe/b;->a()LXe/c;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    if-eqz v6, :cond_4

    .line 193
    .line 194
    invoke-virtual {v6}, LXe/c;->a()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    if-nez v6, :cond_5

    .line 199
    .line 200
    :cond_4
    invoke-virtual {v3}, LBe/a;->getName()LXe/f;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v3}, LXe/f;->b()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    const-string v3, "asString(...)"

    .line 209
    .line 210
    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_5
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_6
    invoke-interface {v2, v4, v5}, Lmf/w;->b(Lye/e;Ljava/util/List;)V

    .line 218
    .line 219
    .line 220
    :cond_7
    invoke-static {v0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lof/m$b;->e:Lof/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LBe/a;->getName()LXe/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LXe/f;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "toString(...)"

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
    sget-object v0, Lye/k0$a;->a:Lye/k0$a;

    .line 2
    .line 3
    return-object v0
.end method
