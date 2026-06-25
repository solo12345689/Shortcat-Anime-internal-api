.class public abstract LQe/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Lye/e;LQe/G;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeMappingConfiguration"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p0}, LQe/G;->e(Lye/e;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-interface {p0}, Lye/e;->b()Lye/m;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "getContainingDeclaration(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Lye/J;->getName()LXe/f;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, LXe/h;->b(LXe/f;)LXe/f;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, LXe/f;->h()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "getIdentifier(...)"

    .line 40
    .line 41
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    instance-of v2, v0, Lye/N;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    check-cast v0, Lye/N;

    .line 49
    .line 50
    invoke-interface {v0}, Lye/N;->f()LXe/c;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, LXe/c;->c()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, LXe/c;->a()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const/4 v6, 0x4

    .line 71
    const/4 v7, 0x0

    .line 72
    const/16 v3, 0x2e

    .line 73
    .line 74
    const/16 v4, 0x2f

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-static/range {v2 .. v7}, LDf/r;->J(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const/16 p0, 0x2f

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_2
    instance-of v2, v0, Lye/e;

    .line 98
    .line 99
    if-eqz v2, :cond_3

    .line 100
    .line 101
    move-object v2, v0

    .line 102
    check-cast v2, Lye/e;

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    const/4 v2, 0x0

    .line 106
    :goto_0
    if-eqz v2, :cond_5

    .line 107
    .line 108
    invoke-interface {p1, v2}, LQe/G;->b(Lye/e;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-nez p0, :cond_4

    .line 113
    .line 114
    invoke-static {v2, p1}, LQe/j;->a(Lye/e;LQe/G;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const/16 p0, 0x24

    .line 127
    .line 128
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v2, "Unexpected container: "

    .line 147
    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v0, " for "

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1
.end method

.method public static synthetic b(Lye/e;LQe/G;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, LQe/H;->a:LQe/H;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, LQe/j;->a(Lye/e;LQe/G;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final c(Lye/a;)Z
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lye/l;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-interface {p0}, Lye/a;->getReturnType()Lqf/S;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lve/i;->D0(Lqf/S;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Lye/a;->getReturnType()Lqf/S;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lqf/J0;->l(Lqf/S;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    instance-of p0, p0, Lye/a0;

    .line 39
    .line 40
    if-nez p0, :cond_1

    .line 41
    .line 42
    return v1

    .line 43
    :cond_1
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public static final d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "kotlinType"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "factory"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "mode"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "typeMappingConfiguration"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "writeGenericType"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p3, p0}, LQe/G;->a(Lqf/S;)Lqf/S;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    move-object v3, p2

    .line 34
    move-object v4, p3

    .line 35
    move-object v5, p4

    .line 36
    move-object v6, p5

    .line 37
    invoke-static/range {v1 .. v6}, LQe/j;->d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    move-object v1, p1

    .line 43
    move-object v2, p2

    .line 44
    move-object v3, p3

    .line 45
    move-object v4, p4

    .line 46
    move-object v5, p5

    .line 47
    invoke-static {p0}, Lve/h;->r(Lqf/S;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    invoke-static {p0}, Lve/p;->a(Lqf/S;)Lqf/d0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static/range {v0 .. v5}, LQe/j;->d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_1
    sget-object p1, Lrf/s;->a:Lrf/s;

    .line 63
    .line 64
    invoke-static {p1, p0, v1, v2}, LQe/J;->b(Lqf/H0;Luf/i;LQe/t;LQe/I;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    invoke-virtual {v2}, LQe/I;->d()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {v1, p2, p1}, LQe/J;->a(LQe/t;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-interface {v5, p0, p1, v2}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_2
    invoke-virtual {p0}, Lqf/S;->N0()Lqf/v0;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    instance-of p3, p2, Lqf/Q;

    .line 87
    .line 88
    if-eqz p3, :cond_4

    .line 89
    .line 90
    check-cast p2, Lqf/Q;

    .line 91
    .line 92
    invoke-virtual {p2}, Lqf/Q;->h()Lqf/S;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    if-nez p0, :cond_3

    .line 97
    .line 98
    invoke-virtual {p2}, Lqf/Q;->k()Ljava/util/Collection;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-interface {v3, p0}, LQe/G;->f(Ljava/util/Collection;)Lqf/S;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_3
    invoke-static {p0}, Lvf/d;->D(Lqf/S;)Lqf/S;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static/range {v0 .. v5}, LQe/j;->d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_4
    invoke-interface {p2}, Lqf/v0;->p()Lye/h;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-eqz p2, :cond_11

    .line 120
    .line 121
    invoke-static {p2}, Lsf/l;->m(Lye/m;)Z

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    if-eqz p3, :cond_5

    .line 126
    .line 127
    const-string p1, "error/NonExistentClass"

    .line 128
    .line 129
    invoke-interface {v1, p1}, LQe/t;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p2, Lye/e;

    .line 134
    .line 135
    invoke-interface {v3, p0, p2}, LQe/G;->d(Lqf/S;Lye/e;)V

    .line 136
    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_5
    instance-of p3, p2, Lye/e;

    .line 140
    .line 141
    if-eqz p3, :cond_8

    .line 142
    .line 143
    invoke-static {p0}, Lve/i;->d0(Lqf/S;)Z

    .line 144
    .line 145
    .line 146
    move-result p4

    .line 147
    if-eqz p4, :cond_8

    .line 148
    .line 149
    invoke-virtual {p0}, Lqf/S;->L0()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    const/4 p2, 0x1

    .line 158
    if-ne p1, p2, :cond_7

    .line 159
    .line 160
    invoke-virtual {p0}, Lqf/S;->L0()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const/4 p1, 0x0

    .line 165
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, Lqf/B0;

    .line 170
    .line 171
    invoke-interface {p0}, Lqf/B0;->getType()Lqf/S;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const-string p1, "getType(...)"

    .line 176
    .line 177
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {p0}, Lqf/B0;->b()Lqf/N0;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    sget-object p3, Lqf/N0;->f:Lqf/N0;

    .line 185
    .line 186
    if-ne p1, p3, :cond_6

    .line 187
    .line 188
    const-string p0, "java/lang/Object"

    .line 189
    .line 190
    invoke-interface {v1, p0}, LQe/t;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    goto :goto_0

    .line 195
    :cond_6
    invoke-interface {p0}, Lqf/B0;->b()Lqf/N0;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    const-string p1, "getProjectionKind(...)"

    .line 200
    .line 201
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, p0, p2}, LQe/I;->f(Lqf/N0;Z)LQe/I;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-static/range {v0 .. v5}, LQe/j;->d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const/16 p2, 0x5b

    .line 218
    .line 219
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-interface {v1, p0}, LQe/t;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-interface {v1, p0}, LQe/t;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    return-object p0

    .line 238
    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 239
    .line 240
    const-string p1, "arrays must have one type argument"

    .line 241
    .line 242
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p0

    .line 246
    :cond_8
    if-eqz p3, :cond_d

    .line 247
    .line 248
    invoke-static {p2}, Lbf/k;->b(Lye/m;)Z

    .line 249
    .line 250
    .line 251
    move-result p3

    .line 252
    if-eqz p3, :cond_9

    .line 253
    .line 254
    invoke-virtual {v2}, LQe/I;->c()Z

    .line 255
    .line 256
    .line 257
    move-result p3

    .line 258
    if-nez p3, :cond_9

    .line 259
    .line 260
    invoke-static {p1, p0}, Lqf/H;->a(Lqf/H0;Luf/i;)Luf/i;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    move-object v0, p1

    .line 265
    check-cast v0, Lqf/S;

    .line 266
    .line 267
    if-eqz v0, :cond_9

    .line 268
    .line 269
    invoke-virtual {v2}, LQe/I;->g()LQe/I;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-static/range {v0 .. v5}, LQe/j;->d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :cond_9
    invoke-virtual {v2}, LQe/I;->e()Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_a

    .line 283
    .line 284
    move-object p1, p2

    .line 285
    check-cast p1, Lye/e;

    .line 286
    .line 287
    invoke-static {p1}, Lve/i;->m0(Lye/e;)Z

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    if-eqz p1, :cond_a

    .line 292
    .line 293
    invoke-interface {v1}, LQe/t;->f()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    goto :goto_1

    .line 298
    :cond_a
    check-cast p2, Lye/e;

    .line 299
    .line 300
    invoke-interface {p2}, Lye/e;->a()Lye/e;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    const-string p3, "getOriginal(...)"

    .line 305
    .line 306
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v3, p1}, LQe/G;->c(Lye/e;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    if-nez p1, :cond_c

    .line 314
    .line 315
    invoke-interface {p2}, Lye/e;->h()Lye/f;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    sget-object p4, Lye/f;->e:Lye/f;

    .line 320
    .line 321
    if-ne p1, p4, :cond_b

    .line 322
    .line 323
    invoke-interface {p2}, Lye/e;->b()Lye/m;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 328
    .line 329
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    move-object p2, p1

    .line 333
    check-cast p2, Lye/e;

    .line 334
    .line 335
    :cond_b
    invoke-interface {p2}, Lye/e;->a()Lye/e;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-static {p1, v3}, LQe/j;->a(Lye/e;LQe/G;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-interface {v1, p1}, LQe/t;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    :cond_c
    :goto_1
    invoke-interface {v5, p0, p1, v2}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    return-object p1

    .line 354
    :cond_d
    instance-of p1, p2, Lye/m0;

    .line 355
    .line 356
    if-eqz p1, :cond_f

    .line 357
    .line 358
    check-cast p2, Lye/m0;

    .line 359
    .line 360
    invoke-static {p2}, Lvf/d;->o(Lye/m0;)Lqf/S;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-virtual {p0}, Lqf/S;->O0()Z

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    if-eqz p0, :cond_e

    .line 369
    .line 370
    invoke-static {p1}, Lvf/d;->B(Lqf/S;)Lqf/S;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    :cond_e
    move-object v0, p1

    .line 375
    invoke-static {}, LAf/i;->l()Lie/o;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    const/4 v4, 0x0

    .line 380
    invoke-static/range {v0 .. v5}, LQe/j;->d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    return-object p0

    .line 385
    :cond_f
    instance-of p1, p2, Lye/l0;

    .line 386
    .line 387
    if-eqz p1, :cond_10

    .line 388
    .line 389
    invoke-virtual {v2}, LQe/I;->b()Z

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    if-eqz p1, :cond_10

    .line 394
    .line 395
    check-cast p2, Lye/l0;

    .line 396
    .line 397
    invoke-interface {p2}, Lye/l0;->G()Lqf/d0;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-static/range {v0 .. v5}, LQe/j;->d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    return-object p0

    .line 406
    :cond_10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 407
    .line 408
    new-instance p2, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 411
    .line 412
    .line 413
    const-string p3, "Unknown type "

    .line 414
    .line 415
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw p1

    .line 429
    :cond_11
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 430
    .line 431
    new-instance p2, Ljava/lang/StringBuilder;

    .line 432
    .line 433
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 434
    .line 435
    .line 436
    const-string p3, "no descriptor for type constructor of "

    .line 437
    .line 438
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw p1
.end method

.method public static synthetic e(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x20

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    invoke-static {}, LAf/i;->l()Lie/o;

    .line 6
    .line 7
    .line 8
    move-result-object p5

    .line 9
    :cond_0
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    move-object v3, p3

    .line 13
    move-object v4, p4

    .line 14
    move-object v5, p5

    .line 15
    invoke-static/range {v0 .. v5}, LQe/j;->d(Lqf/S;LQe/t;LQe/I;LQe/G;LQe/q;Lie/o;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
