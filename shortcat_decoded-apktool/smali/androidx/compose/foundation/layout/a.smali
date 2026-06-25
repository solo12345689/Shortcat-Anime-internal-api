.class public abstract Landroidx/compose/foundation/layout/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Landroidx/compose/ui/layout/l;LI0/a;FFLI0/A;J)LI0/C;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/layout/a;->c(Landroidx/compose/ui/layout/l;LI0/a;FFLI0/A;J)LI0/C;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(LI0/a;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/layout/a;->d(LI0/a;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final c(Landroidx/compose/ui/layout/l;LI0/a;FFLI0/A;J)LI0/C;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    invoke-static/range {p1 .. p1}, Landroidx/compose/foundation/layout/a;->d(LI0/a;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/16 v10, 0xb

    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    move-wide/from16 v4, p5

    .line 21
    .line 22
    invoke-static/range {v4 .. v11}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v6

    .line 26
    :goto_0
    move-object/from16 v2, p4

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/16 v14, 0xe

    .line 30
    .line 31
    const/4 v15, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    const/4 v11, 0x0

    .line 34
    const/4 v12, 0x0

    .line 35
    const/4 v13, 0x0

    .line 36
    move-wide/from16 v8, p5

    .line 37
    .line 38
    invoke-static/range {v8 .. v15}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    goto :goto_0

    .line 43
    :goto_1
    invoke-interface {v2, v6, v7}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    move-object/from16 v2, p1

    .line 48
    .line 49
    invoke-interface {v7, v2}, LI0/D;->N(LI0/a;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/high16 v5, -0x80000000

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    if-eq v4, v5, :cond_1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    move v4, v6

    .line 60
    :goto_2
    invoke-static {v2}, Landroidx/compose/foundation/layout/a;->d(LI0/a;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->P0()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    goto :goto_3

    .line 71
    :cond_2
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->W0()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    :goto_3
    invoke-static {v2}, Landroidx/compose/foundation/layout/a;->d(LI0/a;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_3

    .line 80
    .line 81
    invoke-static/range {p5 .. p6}, Li1/b;->k(J)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    goto :goto_4

    .line 86
    :cond_3
    invoke-static/range {p5 .. p6}, Li1/b;->l(J)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    :goto_4
    sget-object v9, Li1/h;->b:Li1/h$a;

    .line 91
    .line 92
    invoke-virtual {v9}, Li1/h$a;->c()F

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    invoke-static {v3, v10}, Li1/h;->q(FF)Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-nez v10, :cond_4

    .line 101
    .line 102
    invoke-interface {v0, v3}, Li1/d;->s0(F)I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    goto :goto_5

    .line 107
    :cond_4
    move v10, v6

    .line 108
    :goto_5
    sub-int/2addr v10, v4

    .line 109
    sub-int/2addr v8, v5

    .line 110
    invoke-static {v10, v6, v8}, Loe/j;->m(III)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    invoke-virtual {v9}, Li1/h$a;->c()F

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    invoke-static {v1, v9}, Li1/h;->q(FF)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-nez v9, :cond_5

    .line 123
    .line 124
    invoke-interface {v0, v1}, Li1/d;->s0(F)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    goto :goto_6

    .line 129
    :cond_5
    move v1, v6

    .line 130
    :goto_6
    sub-int/2addr v1, v5

    .line 131
    add-int/2addr v1, v4

    .line 132
    sub-int/2addr v8, v10

    .line 133
    invoke-static {v1, v6, v8}, Loe/j;->m(III)I

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    invoke-static {v2}, Landroidx/compose/foundation/layout/a;->d(LI0/a;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_6

    .line 142
    .line 143
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->W0()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    goto :goto_7

    .line 148
    :cond_6
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->W0()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    add-int/2addr v1, v10

    .line 153
    add-int/2addr v1, v6

    .line 154
    invoke-static/range {p5 .. p6}, Li1/b;->n(J)I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    :goto_7
    invoke-static {v2}, Landroidx/compose/foundation/layout/a;->d(LI0/a;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_7

    .line 167
    .line 168
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->P0()I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    add-int/2addr v4, v10

    .line 173
    add-int/2addr v4, v6

    .line 174
    invoke-static/range {p5 .. p6}, Li1/b;->m(J)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    :goto_8
    move v8, v4

    .line 183
    goto :goto_9

    .line 184
    :cond_7
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->P0()I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    goto :goto_8

    .line 189
    :goto_9
    new-instance v4, Landroidx/compose/foundation/layout/a$a;

    .line 190
    .line 191
    move v5, v1

    .line 192
    move-object v1, v4

    .line 193
    move v4, v10

    .line 194
    invoke-direct/range {v1 .. v8}, Landroidx/compose/foundation/layout/a$a;-><init>(LI0/a;FIIILandroidx/compose/ui/layout/s;I)V

    .line 195
    .line 196
    .line 197
    move-object v4, v1

    .line 198
    move v1, v5

    .line 199
    move v2, v8

    .line 200
    const/4 v5, 0x4

    .line 201
    const/4 v6, 0x0

    .line 202
    const/4 v3, 0x0

    .line 203
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    return-object v0
.end method

.method private static final d(LI0/a;)Z
    .locals 0

    .line 1
    instance-of p0, p0, LI0/k;

    .line 2
    .line 3
    return p0
.end method

.method public static final e(Landroidx/compose/ui/e;LI0/a;FF)Landroidx/compose/ui/e;
    .locals 6

    .line 1
    new-instance v0, Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/ui/platform/T0;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Landroidx/compose/foundation/layout/a$b;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2, p3}, Landroidx/compose/foundation/layout/a$b;-><init>(LI0/a;FF)V

    .line 12
    .line 13
    .line 14
    :goto_0
    move-object v4, v1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/T0;->a()Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    const/4 v5, 0x0

    .line 22
    move-object v1, p1

    .line 23
    move v2, p2

    .line 24
    move v3, p3

    .line 25
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;-><init>(LI0/a;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/e;LI0/a;FFILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p2, Li1/h;->b:Li1/h$a;

    .line 6
    .line 7
    invoke-virtual {p2}, Li1/h$a;->c()F

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 12
    .line 13
    if-eqz p4, :cond_1

    .line 14
    .line 15
    sget-object p3, Li1/h;->b:Li1/h$a;

    .line 16
    .line 17
    invoke-virtual {p3}, Li1/h$a;->c()F

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    :cond_1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/layout/a;->e(Landroidx/compose/ui/e;LI0/a;FF)Landroidx/compose/ui/e;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;
    .locals 8

    .line 1
    sget-object v0, Li1/h;->b:Li1/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Li1/h$a;->c()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, v1}, Li1/h;->q(FF)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 14
    .line 15
    invoke-static {}, LI0/b;->a()LI0/k;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/4 v6, 0x4

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    move v4, p1

    .line 23
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/e;LI0/a;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 29
    .line 30
    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0}, Li1/h$a;->c()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p2, p1}, Li1/h;->q(FF)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 45
    .line 46
    invoke-static {}, LI0/b;->b()LI0/k;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/4 v4, 0x2

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v2, 0x0

    .line 53
    move v3, p2

    .line 54
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/e;LI0/a;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 60
    .line 61
    :goto_1
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method
