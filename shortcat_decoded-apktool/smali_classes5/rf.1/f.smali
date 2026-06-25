.class public abstract Lrf/f;
.super Lqf/q;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrf/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lqf/q;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(Lqf/d0;)Lqf/d0;
    .locals 14

    .line 1
    invoke-virtual {p1}, Lqf/S;->N0()Lqf/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcf/c;

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_4

    .line 11
    .line 12
    check-cast v0, Lcf/c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcf/c;->a()Lqf/B0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Lqf/B0;->b()Lqf/N0;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    sget-object v5, Lqf/N0;->f:Lqf/N0;

    .line 23
    .line 24
    if-ne v4, v5, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v3

    .line 28
    :goto_0
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v1}, Lqf/B0;->getType()Lqf/S;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Lqf/S;->Q0()Lqf/M0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    :cond_1
    move-object v7, v3

    .line 41
    invoke-virtual {v0}, Lcf/c;->c()Lrf/n;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Lcf/c;->a()Lqf/B0;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual {v0}, Lcf/c;->k()Ljava/util/Collection;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/Iterable;

    .line 56
    .line 57
    new-instance v10, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-static {v1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Lqf/S;

    .line 81
    .line 82
    invoke-virtual {v2}, Lqf/S;->Q0()Lqf/M0;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v10, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    new-instance v8, Lrf/n;

    .line 91
    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v12, 0x4

    .line 94
    const/4 v13, 0x0

    .line 95
    invoke-direct/range {v8 .. v13}, Lrf/n;-><init>(Lqf/B0;Ljava/util/List;Lrf/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v8}, Lcf/c;->e(Lrf/n;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    new-instance v4, Lrf/i;

    .line 102
    .line 103
    sget-object v5, Luf/b;->a:Luf/b;

    .line 104
    .line 105
    invoke-virtual {v0}, Lcf/c;->c()Lrf/n;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-static {v6}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Lqf/S;->M0()Lqf/r0;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-virtual {p1}, Lqf/S;->O0()Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    const/16 v11, 0x20

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-direct/range {v4 .. v12}, Lrf/i;-><init>(Luf/b;Lrf/n;Lqf/M0;Lqf/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 125
    .line 126
    .line 127
    return-object v4

    .line 128
    :cond_4
    instance-of v1, v0, Lqf/Q;

    .line 129
    .line 130
    if-eqz v1, :cond_9

    .line 131
    .line 132
    invoke-virtual {p1}, Lqf/S;->O0()Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_9

    .line 137
    .line 138
    check-cast v0, Lqf/Q;

    .line 139
    .line 140
    invoke-virtual {v0}, Lqf/Q;->k()Ljava/util/Collection;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, Ljava/lang/Iterable;

    .line 145
    .line 146
    new-instance v1, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-static {p1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    const/4 v2, 0x0

    .line 160
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_5

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Lqf/S;

    .line 171
    .line 172
    invoke-static {v2}, Lvf/d;->B(Lqf/S;)Lqf/S;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    const/4 v2, 0x1

    .line 180
    goto :goto_2

    .line 181
    :cond_5
    if-nez v2, :cond_6

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_6
    invoke-virtual {v0}, Lqf/Q;->h()Lqf/S;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-eqz p1, :cond_7

    .line 189
    .line 190
    invoke-static {p1}, Lvf/d;->B(Lqf/S;)Lqf/S;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    :cond_7
    new-instance p1, Lqf/Q;

    .line 195
    .line 196
    invoke-direct {p1, v1}, Lqf/Q;-><init>(Ljava/util/Collection;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v3}, Lqf/Q;->s(Lqf/S;)Lqf/Q;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    :goto_3
    if-nez v3, :cond_8

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_8
    move-object v0, v3

    .line 207
    :goto_4
    invoke-virtual {v0}, Lqf/Q;->f()Lqf/d0;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    :cond_9
    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Luf/i;)Luf/i;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lrf/f;->b(Luf/i;)Lqf/M0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Luf/i;)Lqf/M0;
    .locals 4

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lqf/S;

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    check-cast p1, Lqf/S;

    .line 11
    .line 12
    invoke-virtual {p1}, Lqf/S;->Q0()Lqf/M0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of v0, p1, Lqf/d0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, Lqf/d0;

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lrf/f;->c(Lqf/d0;)Lqf/d0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    instance-of v0, p1, Lqf/I;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    move-object v0, p1

    .line 33
    check-cast v0, Lqf/I;

    .line 34
    .line 35
    invoke-virtual {v0}, Lqf/I;->V0()Lqf/d0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {p0, v1}, Lrf/f;->c(Lqf/d0;)Lqf/d0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0}, Lqf/I;->W0()Lqf/d0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-direct {p0, v2}, Lrf/f;->c(Lqf/d0;)Lqf/d0;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0}, Lqf/I;->V0()Lqf/d0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-ne v1, v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, Lqf/I;->W0()Lqf/d0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eq v2, v0, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    move-object v0, p1

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Lqf/V;->e(Lqf/d0;Lqf/d0;)Lqf/M0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_1
    new-instance v1, Lrf/f$b;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lrf/f$b;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p1, v1}, Lqf/L0;->c(Lqf/M0;Lqf/S;Lkotlin/jvm/functions/Function1;)Lqf/M0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_3
    new-instance p1, LTd/r;

    .line 81
    .line 82
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    const-string v0, "Failed requirement."

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
.end method
