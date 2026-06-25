.class public final Lmf/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmf/g$a;
    }
.end annotation


# instance fields
.field private final a:Lye/H;

.field private final b:Lye/M;


# direct methods
.method public constructor <init>(Lye/H;Lye/M;)V
    .locals 1

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notFoundClasses"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lmf/g;->a:Lye/H;

    .line 15
    .line 16
    iput-object p2, p0, Lmf/g;->b:Lye/M;

    .line 17
    .line 18
    return-void
.end method

.method private final b(Ldf/g;Lqf/S;LSe/b$b$c;)Z
    .locals 6

    .line 1
    invoke-virtual {p3}, LSe/b$b$c;->T()LSe/b$b$c$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lmf/g$a;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/16 v1, 0xa

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eq v0, v1, :cond_7

    .line 22
    .line 23
    const/16 v1, 0xd

    .line 24
    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    iget-object p3, p0, Lmf/g;->a:Lye/H;

    .line 28
    .line 29
    invoke-virtual {p1, p3}, Ldf/g;->a(Lye/H;)Lqf/S;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_1
    instance-of v0, p1, Ldf/b;

    .line 39
    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    check-cast v0, Ldf/b;

    .line 44
    .line 45
    invoke-virtual {v0}, Ldf/g;->b()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p3}, LSe/b$b$c;->K()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-ne v0, v1, :cond_6

    .line 64
    .line 65
    invoke-direct {p0}, Lmf/g;->c()Lve/i;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, p2}, Lve/i;->l(Lqf/S;)Lqf/S;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-nez p2, :cond_2

    .line 74
    .line 75
    return v3

    .line 76
    :cond_2
    check-cast p1, Ldf/b;

    .line 77
    .line 78
    invoke-virtual {p1}, Ldf/g;->b()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/util/Collection;

    .line 83
    .line 84
    invoke-static {v0}, LUd/u;->n(Ljava/util/Collection;)Loe/f;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    instance-of v1, v0, Ljava/util/Collection;

    .line 89
    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    move-object v1, v0

    .line 93
    check-cast v1, Ljava/util/Collection;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    return v2

    .line 102
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    move-object v1, v0

    .line 113
    check-cast v1, LUd/O;

    .line 114
    .line 115
    invoke-virtual {v1}, LUd/O;->nextInt()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {p1}, Ldf/g;->b()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Ldf/g;

    .line 130
    .line 131
    invoke-virtual {p3, v1}, LSe/b$b$c;->I(I)LSe/b$b$c;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v5, "getArrayElement(...)"

    .line 136
    .line 137
    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-direct {p0, v4, p2, v1}, Lmf/g;->b(Ldf/g;Lqf/S;LSe/b$b$c;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_4

    .line 145
    .line 146
    return v3

    .line 147
    :cond_5
    return v2

    .line 148
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string p3, "Deserialized ArrayValue should have the same number of elements as the original array value: "

    .line 154
    .line 155
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p2

    .line 175
    :cond_7
    invoke-virtual {p2}, Lqf/S;->N0()Lqf/v0;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-interface {p1}, Lqf/v0;->p()Lye/h;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    instance-of p2, p1, Lye/e;

    .line 184
    .line 185
    if-eqz p2, :cond_8

    .line 186
    .line 187
    check-cast p1, Lye/e;

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_8
    const/4 p1, 0x0

    .line 191
    :goto_1
    if-eqz p1, :cond_a

    .line 192
    .line 193
    invoke-static {p1}, Lve/i;->m0(Lye/e;)Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-eqz p1, :cond_9

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_9
    return v3

    .line 201
    :cond_a
    :goto_2
    return v2
.end method

.method private final c()Lve/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lmf/g;->a:Lye/H;

    .line 2
    .line 3
    invoke-interface {v0}, Lye/H;->n()Lve/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final d(LSe/b$b;Ljava/util/Map;LUe/d;)Lkotlin/Pair;
    .locals 3

    .line 1
    invoke-virtual {p1}, LSe/b$b;->x()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p3, v0}, Lmf/L;->b(LUe/d;I)LXe/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Lye/t0;

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance v0, Lkotlin/Pair;

    .line 20
    .line 21
    invoke-virtual {p1}, LSe/b$b;->x()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {p3, v1}, Lmf/L;->b(LUe/d;I)LXe/f;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {p2}, Lye/s0;->getType()Lqf/S;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const-string v2, "getType(...)"

    .line 34
    .line 35
    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, LSe/b$b;->y()LSe/b$b$c;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v2, "getValue(...)"

    .line 43
    .line 44
    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p2, p1, p3}, Lmf/g;->g(Lqf/S;LSe/b$b$c;LUe/d;)Ldf/g;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method private final e(LXe/b;)Lye/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lmf/g;->a:Lye/H;

    .line 2
    .line 3
    iget-object v1, p0, Lmf/g;->b:Lye/M;

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Lye/y;->d(Lye/H;LXe/b;Lye/M;)Lye/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private final g(Lqf/S;LSe/b$b$c;LUe/d;)Ldf/g;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lmf/g;->f(Lqf/S;LSe/b$b$c;LUe/d;)Ldf/g;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p3, p1, p2}, Lmf/g;->b(Ldf/g;Lqf/S;LSe/b$b$c;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p3, 0x0

    .line 13
    :goto_0
    if-nez p3, :cond_1

    .line 14
    .line 15
    sget-object p3, Ldf/l;->b:Ldf/l$a;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "Unexpected argument value: actual type "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, LSe/b$b$c;->T()LSe/b$b$c$c;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, " != expected type "

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p3, p1}, Ldf/l$a;->a(Ljava/lang/String;)Ldf/l;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_1
    return-object p3
.end method


# virtual methods
.method public final a(LSe/b;LUe/d;)Lze/c;
    .locals 5

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LSe/b;->B()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p2, v0}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p0, v0}, Lmf/g;->e(LXe/b;)Lye/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, LSe/b;->y()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-static {v0}, Lsf/l;->m(Lye/m;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    invoke-static {v0}, Lbf/i;->t(Lye/m;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-interface {v0}, Lye/e;->i()Ljava/util/Collection;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v3, "getConstructors(...)"

    .line 50
    .line 51
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast v2, Ljava/lang/Iterable;

    .line 55
    .line 56
    invoke-static {v2}, LUd/u;->N0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lye/d;

    .line 61
    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-interface {v2}, Lye/a;->j()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "getValueParameters(...)"

    .line 69
    .line 70
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/16 v2, 0xa

    .line 74
    .line 75
    invoke-static {v1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {v2}, LUd/S;->e(I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    const/16 v3, 0x10

    .line 84
    .line 85
    invoke-static {v2, v3}, Loe/j;->e(II)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v4, v2

    .line 109
    check-cast v4, Lye/t0;

    .line 110
    .line 111
    invoke-interface {v4}, Lye/J;->getName()LXe/f;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {p1}, LSe/b;->z()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const-string v1, "getArgumentList(...)"

    .line 124
    .line 125
    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v1, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_2

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, LSe/b$b;

    .line 148
    .line 149
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p0, v2, v3, p2}, Lmf/g;->d(LSe/b$b;Ljava/util/Map;LUe/d;)Lkotlin/Pair;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-eqz v2, :cond_1

    .line 157
    .line 158
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    invoke-static {v1}, LUd/S;->w(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    :cond_3
    new-instance p1, Lze/d;

    .line 167
    .line 168
    invoke-interface {v0}, Lye/e;->p()Lqf/d0;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    sget-object v0, Lye/h0;->a:Lye/h0;

    .line 173
    .line 174
    invoke-direct {p1, p2, v1, v0}, Lze/d;-><init>(Lqf/S;Ljava/util/Map;Lye/h0;)V

    .line 175
    .line 176
    .line 177
    return-object p1
.end method

.method public final f(Lqf/S;LSe/b$b$c;LUe/d;)Ldf/g;
    .locals 5

    .line 1
    const-string v0, "expectedType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "nameResolver"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, LUe/b;->P:LUe/b$b;

    .line 17
    .line 18
    invoke-virtual {p2}, LSe/b$b$c;->P()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "get(...)"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p2}, LSe/b$b$c;->T()LSe/b$b$c$c;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    const/4 v1, -0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object v2, Lmf/g$a;->a:[I

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    aget v1, v2, v1

    .line 50
    .line 51
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v1, "Unsupported annotation argument type: "

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, LSe/b$b$c;->T()LSe/b$b$c$c;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p2, " (expected "

    .line 74
    .line 75
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 p1, 0x29

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p3

    .line 98
    :pswitch_0
    sget-object v0, Ldf/i;->a:Ldf/i;

    .line 99
    .line 100
    invoke-virtual {p2}, LSe/b$b$c;->K()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    const-string v1, "getArrayElementList(...)"

    .line 105
    .line 106
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Ljava/util/ArrayList;

    .line 110
    .line 111
    const/16 v2, 0xa

    .line 112
    .line 113
    invoke-static {p2, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_1

    .line 129
    .line 130
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, LSe/b$b$c;

    .line 135
    .line 136
    invoke-direct {p0}, Lmf/g;->c()Lve/i;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-virtual {v3}, Lve/i;->i()Lqf/d0;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    const-string v4, "getAnyType(...)"

    .line 145
    .line 146
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v3, v2, p3}, Lmf/g;->f(Lqf/S;LSe/b$b$c;LUe/d;)Ldf/g;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_1
    invoke-virtual {v0, v1, p1}, Ldf/i;->b(Ljava/util/List;Lqf/S;)Ldf/b;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :pswitch_1
    new-instance p1, Ldf/a;

    .line 166
    .line 167
    invoke-virtual {p2}, LSe/b$b$c;->G()LSe/b;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    const-string v0, "getAnnotation(...)"

    .line 172
    .line 173
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p2, p3}, Lmf/g;->a(LSe/b;LUe/d;)Lze/c;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-direct {p1, p2}, Ldf/a;-><init>(Lze/c;)V

    .line 181
    .line 182
    .line 183
    return-object p1

    .line 184
    :pswitch_2
    new-instance p1, Ldf/k;

    .line 185
    .line 186
    invoke-virtual {p2}, LSe/b$b$c;->L()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-static {p3, v0}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {p2}, LSe/b$b$c;->O()I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    invoke-static {p3, p2}, Lmf/L;->b(LUe/d;I)LXe/f;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-direct {p1, v0, p2}, Ldf/k;-><init>(LXe/b;LXe/f;)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :pswitch_3
    new-instance p1, Ldf/s;

    .line 207
    .line 208
    invoke-virtual {p2}, LSe/b$b$c;->L()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-static {p3, v0}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 213
    .line 214
    .line 215
    move-result-object p3

    .line 216
    invoke-virtual {p2}, LSe/b$b$c;->H()I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    invoke-direct {p1, p3, p2}, Ldf/s;-><init>(LXe/b;I)V

    .line 221
    .line 222
    .line 223
    return-object p1

    .line 224
    :pswitch_4
    new-instance p1, Ldf/x;

    .line 225
    .line 226
    invoke-virtual {p2}, LSe/b$b$c;->S()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    invoke-interface {p3, p2}, LUe/d;->getString(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-direct {p1, p2}, Ldf/x;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-object p1

    .line 238
    :pswitch_5
    new-instance p1, Ldf/c;

    .line 239
    .line 240
    invoke-virtual {p2}, LSe/b$b$c;->R()J

    .line 241
    .line 242
    .line 243
    move-result-wide p2

    .line 244
    const-wide/16 v0, 0x0

    .line 245
    .line 246
    cmp-long p2, p2, v0

    .line 247
    .line 248
    if-eqz p2, :cond_2

    .line 249
    .line 250
    const/4 p2, 0x1

    .line 251
    goto :goto_2

    .line 252
    :cond_2
    const/4 p2, 0x0

    .line 253
    :goto_2
    invoke-direct {p1, p2}, Ldf/c;-><init>(Z)V

    .line 254
    .line 255
    .line 256
    return-object p1

    .line 257
    :pswitch_6
    new-instance p1, Ldf/j;

    .line 258
    .line 259
    invoke-virtual {p2}, LSe/b$b$c;->N()D

    .line 260
    .line 261
    .line 262
    move-result-wide p2

    .line 263
    invoke-direct {p1, p2, p3}, Ldf/j;-><init>(D)V

    .line 264
    .line 265
    .line 266
    return-object p1

    .line 267
    :pswitch_7
    new-instance p1, Ldf/m;

    .line 268
    .line 269
    invoke-virtual {p2}, LSe/b$b$c;->Q()F

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    invoke-direct {p1, p2}, Ldf/m;-><init>(F)V

    .line 274
    .line 275
    .line 276
    return-object p1

    .line 277
    :pswitch_8
    invoke-virtual {p2}, LSe/b$b$c;->R()J

    .line 278
    .line 279
    .line 280
    move-result-wide p1

    .line 281
    if-eqz v0, :cond_3

    .line 282
    .line 283
    new-instance p3, Ldf/C;

    .line 284
    .line 285
    invoke-direct {p3, p1, p2}, Ldf/C;-><init>(J)V

    .line 286
    .line 287
    .line 288
    return-object p3

    .line 289
    :cond_3
    new-instance p3, Ldf/t;

    .line 290
    .line 291
    invoke-direct {p3, p1, p2}, Ldf/t;-><init>(J)V

    .line 292
    .line 293
    .line 294
    return-object p3

    .line 295
    :pswitch_9
    invoke-virtual {p2}, LSe/b$b$c;->R()J

    .line 296
    .line 297
    .line 298
    move-result-wide p1

    .line 299
    long-to-int p1, p1

    .line 300
    if-eqz v0, :cond_4

    .line 301
    .line 302
    new-instance p2, Ldf/B;

    .line 303
    .line 304
    invoke-direct {p2, p1}, Ldf/B;-><init>(I)V

    .line 305
    .line 306
    .line 307
    return-object p2

    .line 308
    :cond_4
    new-instance p2, Ldf/n;

    .line 309
    .line 310
    invoke-direct {p2, p1}, Ldf/n;-><init>(I)V

    .line 311
    .line 312
    .line 313
    return-object p2

    .line 314
    :pswitch_a
    invoke-virtual {p2}, LSe/b$b$c;->R()J

    .line 315
    .line 316
    .line 317
    move-result-wide p1

    .line 318
    long-to-int p1, p1

    .line 319
    int-to-short p1, p1

    .line 320
    if-eqz v0, :cond_5

    .line 321
    .line 322
    new-instance p2, Ldf/D;

    .line 323
    .line 324
    invoke-direct {p2, p1}, Ldf/D;-><init>(S)V

    .line 325
    .line 326
    .line 327
    return-object p2

    .line 328
    :cond_5
    new-instance p2, Ldf/w;

    .line 329
    .line 330
    invoke-direct {p2, p1}, Ldf/w;-><init>(S)V

    .line 331
    .line 332
    .line 333
    return-object p2

    .line 334
    :pswitch_b
    new-instance p1, Ldf/e;

    .line 335
    .line 336
    invoke-virtual {p2}, LSe/b$b$c;->R()J

    .line 337
    .line 338
    .line 339
    move-result-wide p2

    .line 340
    long-to-int p2, p2

    .line 341
    int-to-char p2, p2

    .line 342
    invoke-direct {p1, p2}, Ldf/e;-><init>(C)V

    .line 343
    .line 344
    .line 345
    return-object p1

    .line 346
    :pswitch_c
    invoke-virtual {p2}, LSe/b$b$c;->R()J

    .line 347
    .line 348
    .line 349
    move-result-wide p1

    .line 350
    long-to-int p1, p1

    .line 351
    int-to-byte p1, p1

    .line 352
    if-eqz v0, :cond_6

    .line 353
    .line 354
    new-instance p2, Ldf/A;

    .line 355
    .line 356
    invoke-direct {p2, p1}, Ldf/A;-><init>(B)V

    .line 357
    .line 358
    .line 359
    return-object p2

    .line 360
    :cond_6
    new-instance p2, Ldf/d;

    .line 361
    .line 362
    invoke-direct {p2, p1}, Ldf/d;-><init>(B)V

    .line 363
    .line 364
    .line 365
    return-object p2

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
