.class final Landroidx/compose/material/ripple/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Z

.field private final b:Lie/a;

.field private final c:Lw/a;

.field private final d:Ljava/util/List;

.field private e:LB/j;


# direct methods
.method public constructor <init>(ZLie/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Landroidx/compose/material/ripple/e;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/material/ripple/e;->b:Lie/a;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    const/4 p2, 0x0

    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {v0, v0, p1, p2}, Lw/b;->b(FFILjava/lang/Object;)Lw/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Landroidx/compose/material/ripple/e;->c:Lw/a;

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 23
    .line 24
    return-void
.end method

.method public static final synthetic a(Landroidx/compose/material/ripple/e;)Lw/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/material/ripple/e;->c:Lw/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Lu0/f;FJ)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/material/ripple/e;->c:Lw/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lw/a;->m()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v1, 0x0

    .line 16
    cmpl-float v1, v4, v1

    .line 17
    .line 18
    if-lez v1, :cond_1

    .line 19
    .line 20
    const/16 v8, 0xe

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    move-wide/from16 v2, p3

    .line 27
    .line 28
    invoke-static/range {v2 .. v9}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v11

    .line 32
    iget-boolean v1, v0, Landroidx/compose/material/ripple/e;->a:Z

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    invoke-static {v1, v2}, Lr0/l;->i(J)F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-interface/range {p1 .. p1}, Lu0/f;->f()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    invoke-static {v1, v2}, Lr0/l;->g(J)F

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    sget-object v1, Ls0/q0;->a:Ls0/q0$a;

    .line 53
    .line 54
    invoke-virtual {v1}, Ls0/q0$a;->b()I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    invoke-interface/range {p1 .. p1}, Lu0/f;->n1()Lu0/d;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1}, Lu0/d;->f()J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    invoke-interface {v1}, Lu0/d;->b()Ls0/j0;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-interface {v2}, Ls0/j0;->p()V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1}, Lu0/d;->a()Lu0/h;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-interface/range {v3 .. v8}, Lu0/h;->c(FFFFI)V

    .line 80
    .line 81
    .line 82
    const/16 v20, 0x7c

    .line 83
    .line 84
    const/16 v21, 0x0

    .line 85
    .line 86
    const-wide/16 v14, 0x0

    .line 87
    .line 88
    const/16 v16, 0x0

    .line 89
    .line 90
    const/16 v17, 0x0

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0x0

    .line 95
    .line 96
    move/from16 v13, p2

    .line 97
    .line 98
    move-wide v2, v9

    .line 99
    move-object/from16 v10, p1

    .line 100
    .line 101
    invoke-static/range {v10 .. v21}, Lu0/f;->e0(Lu0/f;JFJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v1}, Lu0/d;->b()Ls0/j0;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-interface {v4}, Ls0/j0;->k()V

    .line 109
    .line 110
    .line 111
    invoke-interface {v1, v2, v3}, Lu0/d;->e(J)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_0
    const/16 v20, 0x7c

    .line 116
    .line 117
    const/16 v21, 0x0

    .line 118
    .line 119
    const-wide/16 v14, 0x0

    .line 120
    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    move-object/from16 v10, p1

    .line 130
    .line 131
    move/from16 v13, p2

    .line 132
    .line 133
    invoke-static/range {v10 .. v21}, Lu0/f;->e0(Lu0/f;JFJFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_1
    return-void
.end method

.method public final c(LB/j;LGf/O;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, LB/g;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v3, v0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v3, v1, LB/h;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    iget-object v3, v0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 20
    .line 21
    move-object v4, v1

    .line 22
    check-cast v4, LB/h;

    .line 23
    .line 24
    invoke-virtual {v4}, LB/h;->a()LB/g;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    instance-of v3, v1, LB/d;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget-object v3, v0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    instance-of v3, v1, LB/e;

    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    iget-object v3, v0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 47
    .line 48
    move-object v4, v1

    .line 49
    check-cast v4, LB/e;

    .line 50
    .line 51
    invoke-virtual {v4}, LB/e;->a()LB/d;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    instance-of v3, v1, LB/b;

    .line 60
    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    iget-object v3, v0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    instance-of v3, v1, LB/c;

    .line 70
    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    iget-object v3, v0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 74
    .line 75
    move-object v4, v1

    .line 76
    check-cast v4, LB/c;

    .line 77
    .line 78
    invoke-virtual {v4}, LB/c;->a()LB/b;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    instance-of v3, v1, LB/a;

    .line 87
    .line 88
    if-eqz v3, :cond_a

    .line 89
    .line 90
    iget-object v3, v0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 91
    .line 92
    move-object v4, v1

    .line 93
    check-cast v4, LB/a;

    .line 94
    .line 95
    invoke-virtual {v4}, LB/a;->a()LB/b;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :goto_0
    iget-object v3, v0, Landroidx/compose/material/ripple/e;->d:Ljava/util/List;

    .line 103
    .line 104
    invoke-static {v3}, LUd/u;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, LB/j;

    .line 109
    .line 110
    iget-object v4, v0, Landroidx/compose/material/ripple/e;->e:LB/j;

    .line 111
    .line 112
    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_a

    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    if-eqz v3, :cond_9

    .line 120
    .line 121
    iget-object v5, v0, Landroidx/compose/material/ripple/e;->b:Lie/a;

    .line 122
    .line 123
    invoke-interface {v5}, Lie/a;->invoke()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, LT/d;

    .line 128
    .line 129
    if-eqz v2, :cond_6

    .line 130
    .line 131
    invoke-virtual {v5}, LT/d;->c()F

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    goto :goto_1

    .line 136
    :cond_6
    instance-of v2, v1, LB/d;

    .line 137
    .line 138
    if-eqz v2, :cond_7

    .line 139
    .line 140
    invoke-virtual {v5}, LT/d;->b()F

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    goto :goto_1

    .line 145
    :cond_7
    instance-of v1, v1, LB/b;

    .line 146
    .line 147
    if-eqz v1, :cond_8

    .line 148
    .line 149
    invoke-virtual {v5}, LT/d;->a()F

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    goto :goto_1

    .line 154
    :cond_8
    const/4 v1, 0x0

    .line 155
    :goto_1
    invoke-static {v3}, LT/l;->a(LB/j;)Lw/i;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    new-instance v8, Landroidx/compose/material/ripple/e$a;

    .line 160
    .line 161
    invoke-direct {v8, v0, v1, v2, v4}, Landroidx/compose/material/ripple/e$a;-><init>(Landroidx/compose/material/ripple/e;FLw/i;LZd/e;)V

    .line 162
    .line 163
    .line 164
    const/4 v9, 0x3

    .line 165
    const/4 v10, 0x0

    .line 166
    const/4 v6, 0x0

    .line 167
    const/4 v7, 0x0

    .line 168
    move-object/from16 v5, p2

    .line 169
    .line 170
    invoke-static/range {v5 .. v10}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_9
    iget-object v1, v0, Landroidx/compose/material/ripple/e;->e:LB/j;

    .line 175
    .line 176
    invoke-static {v1}, LT/l;->b(LB/j;)Lw/i;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    new-instance v14, Landroidx/compose/material/ripple/e$b;

    .line 181
    .line 182
    invoke-direct {v14, v0, v1, v4}, Landroidx/compose/material/ripple/e$b;-><init>(Landroidx/compose/material/ripple/e;Lw/i;LZd/e;)V

    .line 183
    .line 184
    .line 185
    const/4 v15, 0x3

    .line 186
    const/16 v16, 0x0

    .line 187
    .line 188
    const/4 v12, 0x0

    .line 189
    const/4 v13, 0x0

    .line 190
    move-object/from16 v11, p2

    .line 191
    .line 192
    invoke-static/range {v11 .. v16}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 193
    .line 194
    .line 195
    :goto_2
    iput-object v3, v0, Landroidx/compose/material/ripple/e;->e:LB/j;

    .line 196
    .line 197
    :cond_a
    return-void
.end method
