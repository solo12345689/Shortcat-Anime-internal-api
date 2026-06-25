.class public abstract Ls0/j1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final a(Ls0/m1;Ls0/i1;)V
    .locals 6

    .line 1
    instance-of v0, p1, Ls0/i1$b;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ls0/i1$b;

    .line 8
    .line 9
    invoke-virtual {p1}, Ls0/i1$b;->b()Lr0/h;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0, p1, v2, v1, v2}, Ls0/m1;->t(Ls0/m1;Lr0/h;Ls0/m1$b;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p1, Ls0/i1$c;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Ls0/i1$c;

    .line 22
    .line 23
    invoke-virtual {p1}, Ls0/i1$c;->b()Lr0/j;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p0, p1, v2, v1, v2}, Ls0/m1;->s(Ls0/m1;Lr0/j;Ls0/m1$b;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    instance-of v0, p1, Ls0/i1$a;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, Ls0/i1$a;

    .line 36
    .line 37
    invoke-virtual {p1}, Ls0/i1$a;->b()Ls0/m1;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v4, 0x2

    .line 42
    const/4 v5, 0x0

    .line 43
    const-wide/16 v2, 0x0

    .line 44
    .line 45
    move-object v0, p0

    .line 46
    invoke-static/range {v0 .. v5}, Ls0/m1;->n(Ls0/m1;Ls0/m1;JILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    new-instance p0, LTd/r;

    .line 51
    .line 52
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p0
.end method

.method public static final b(Lu0/f;Ls0/i1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v1, v0, Ls0/i1$b;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ls0/i1$b;

    .line 8
    .line 9
    invoke-virtual {v0}, Ls0/i1$b;->b()Lr0/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ls0/j1;->h(Lr0/h;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    invoke-static {v0}, Ls0/j1;->f(Lr0/h;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    move-object/from16 v1, p0

    .line 22
    .line 23
    move-object/from16 v2, p2

    .line 24
    .line 25
    move/from16 v7, p3

    .line 26
    .line 27
    move-object/from16 v8, p4

    .line 28
    .line 29
    move-object/from16 v9, p5

    .line 30
    .line 31
    move/from16 v10, p6

    .line 32
    .line 33
    invoke-interface/range {v1 .. v10}, Lu0/f;->U0(Ls0/h0;JJFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    instance-of v1, v0, Ls0/i1$c;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    check-cast v0, Ls0/i1$c;

    .line 42
    .line 43
    invoke-virtual {v0}, Ls0/i1$c;->c()Ls0/m1;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    if-eqz v8, :cond_1

    .line 48
    .line 49
    move-object/from16 v7, p0

    .line 50
    .line 51
    move-object/from16 v9, p2

    .line 52
    .line 53
    move/from16 v10, p3

    .line 54
    .line 55
    move-object/from16 v11, p4

    .line 56
    .line 57
    move-object/from16 v12, p5

    .line 58
    .line 59
    move/from16 v13, p6

    .line 60
    .line 61
    invoke-interface/range {v7 .. v13}, Lu0/f;->p1(Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    invoke-virtual {v0}, Ls0/i1$c;->b()Lr0/j;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lr0/j;->b()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    const/16 v3, 0x20

    .line 74
    .line 75
    shr-long/2addr v1, v3

    .line 76
    long-to-int v1, v1

    .line 77
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v0}, Ls0/j1;->i(Lr0/j;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v9

    .line 85
    invoke-static {v0}, Ls0/j1;->g(Lr0/j;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v11

    .line 89
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-long v4, v0

    .line 94
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    int-to-long v0, v0

    .line 99
    shl-long v2, v4, v3

    .line 100
    .line 101
    const-wide v4, 0xffffffffL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v0, v4

    .line 107
    or-long/2addr v0, v2

    .line 108
    invoke-static {v0, v1}, Lr0/a;->b(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v13

    .line 112
    move-object/from16 v7, p0

    .line 113
    .line 114
    move-object/from16 v8, p2

    .line 115
    .line 116
    move/from16 v15, p3

    .line 117
    .line 118
    move-object/from16 v16, p4

    .line 119
    .line 120
    move-object/from16 v17, p5

    .line 121
    .line 122
    move/from16 v18, p6

    .line 123
    .line 124
    invoke-interface/range {v7 .. v18}, Lu0/f;->m1(Ls0/h0;JJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_2
    instance-of v1, v0, Ls0/i1$a;

    .line 129
    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    check-cast v0, Ls0/i1$a;

    .line 133
    .line 134
    invoke-virtual {v0}, Ls0/i1$a;->b()Ls0/m1;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    move-object/from16 v7, p0

    .line 139
    .line 140
    move-object/from16 v9, p2

    .line 141
    .line 142
    move/from16 v10, p3

    .line 143
    .line 144
    move-object/from16 v11, p4

    .line 145
    .line 146
    move-object/from16 v12, p5

    .line 147
    .line 148
    move/from16 v13, p6

    .line 149
    .line 150
    invoke-interface/range {v7 .. v13}, Lu0/f;->p1(Ls0/m1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    new-instance v0, LTd/r;

    .line 155
    .line 156
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 157
    .line 158
    .line 159
    throw v0
.end method

.method public static synthetic c(Lu0/f;Ls0/i1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x4

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :cond_0
    move v3, p3

    .line 8
    and-int/lit8 p3, p7, 0x8

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    sget-object p4, Lu0/j;->a:Lu0/j;

    .line 13
    .line 14
    :cond_1
    move-object v4, p4

    .line 15
    and-int/lit8 p3, p7, 0x10

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    const/4 p5, 0x0

    .line 20
    :cond_2
    move-object v5, p5

    .line 21
    and-int/lit8 p3, p7, 0x20

    .line 22
    .line 23
    if-eqz p3, :cond_3

    .line 24
    .line 25
    sget-object p3, Lu0/f;->j0:Lu0/f$a;

    .line 26
    .line 27
    invoke-virtual {p3}, Lu0/f$a;->a()I

    .line 28
    .line 29
    .line 30
    move-result p6

    .line 31
    :cond_3
    move-object v0, p0

    .line 32
    move-object v1, p1

    .line 33
    move-object v2, p2

    .line 34
    move v6, p6

    .line 35
    invoke-static/range {v0 .. v6}, Ls0/j1;->b(Lu0/f;Ls0/i1;Ls0/h0;FLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final d(Lu0/f;Ls0/i1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v1, v0, Ls0/i1$b;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ls0/i1$b;

    .line 8
    .line 9
    invoke-virtual {v0}, Ls0/i1$b;->b()Lr0/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ls0/j1;->h(Lr0/h;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    invoke-static {v0}, Ls0/j1;->f(Lr0/h;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v6

    .line 21
    move-object/from16 v1, p0

    .line 22
    .line 23
    move-wide/from16 v2, p2

    .line 24
    .line 25
    move/from16 v8, p4

    .line 26
    .line 27
    move-object/from16 v9, p5

    .line 28
    .line 29
    move-object/from16 v10, p6

    .line 30
    .line 31
    move/from16 v11, p7

    .line 32
    .line 33
    invoke-interface/range {v1 .. v11}, Lu0/f;->V0(JJJFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    instance-of v1, v0, Ls0/i1$c;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    check-cast v0, Ls0/i1$c;

    .line 42
    .line 43
    invoke-virtual {v0}, Ls0/i1$c;->c()Ls0/m1;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    if-eqz v9, :cond_1

    .line 48
    .line 49
    move-object/from16 v8, p0

    .line 50
    .line 51
    move-wide/from16 v10, p2

    .line 52
    .line 53
    move/from16 v12, p4

    .line 54
    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    move-object/from16 v14, p6

    .line 58
    .line 59
    move/from16 v15, p7

    .line 60
    .line 61
    invoke-interface/range {v8 .. v15}, Lu0/f;->C1(Ls0/m1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    invoke-virtual {v0}, Ls0/i1$c;->b()Lr0/j;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lr0/j;->b()J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    const/16 v3, 0x20

    .line 74
    .line 75
    shr-long/2addr v1, v3

    .line 76
    long-to-int v1, v1

    .line 77
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v0}, Ls0/j1;->i(Lr0/j;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v11

    .line 85
    invoke-static {v0}, Ls0/j1;->g(Lr0/j;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v13

    .line 89
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    int-to-long v4, v0

    .line 94
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    int-to-long v0, v0

    .line 99
    shl-long v2, v4, v3

    .line 100
    .line 101
    const-wide v4, 0xffffffffL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v0, v4

    .line 107
    or-long/2addr v0, v2

    .line 108
    invoke-static {v0, v1}, Lr0/a;->b(J)J

    .line 109
    .line 110
    .line 111
    move-result-wide v15

    .line 112
    move-object/from16 v8, p0

    .line 113
    .line 114
    move-wide/from16 v9, p2

    .line 115
    .line 116
    move/from16 v18, p4

    .line 117
    .line 118
    move-object/from16 v17, p5

    .line 119
    .line 120
    move-object/from16 v19, p6

    .line 121
    .line 122
    move/from16 v20, p7

    .line 123
    .line 124
    invoke-interface/range {v8 .. v20}, Lu0/f;->g1(JJJJLu0/g;FLandroidx/compose/ui/graphics/d;I)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_2
    instance-of v1, v0, Ls0/i1$a;

    .line 129
    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    check-cast v0, Ls0/i1$a;

    .line 133
    .line 134
    invoke-virtual {v0}, Ls0/i1$a;->b()Ls0/m1;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    move-object/from16 v8, p0

    .line 139
    .line 140
    move-wide/from16 v10, p2

    .line 141
    .line 142
    move/from16 v12, p4

    .line 143
    .line 144
    move-object/from16 v13, p5

    .line 145
    .line 146
    move-object/from16 v14, p6

    .line 147
    .line 148
    move/from16 v15, p7

    .line 149
    .line 150
    invoke-interface/range {v8 .. v15}, Lu0/f;->C1(Ls0/m1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    new-instance v0, LTd/r;

    .line 155
    .line 156
    invoke-direct {v0}, LTd/r;-><init>()V

    .line 157
    .line 158
    .line 159
    throw v0
.end method

.method public static synthetic e(Lu0/f;Ls0/i1;JFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/high16 p4, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :cond_0
    move v4, p4

    .line 8
    and-int/lit8 p4, p8, 0x8

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    sget-object p5, Lu0/j;->a:Lu0/j;

    .line 13
    .line 14
    :cond_1
    move-object v5, p5

    .line 15
    and-int/lit8 p4, p8, 0x10

    .line 16
    .line 17
    if-eqz p4, :cond_2

    .line 18
    .line 19
    const/4 p6, 0x0

    .line 20
    :cond_2
    move-object v6, p6

    .line 21
    and-int/lit8 p4, p8, 0x20

    .line 22
    .line 23
    if-eqz p4, :cond_3

    .line 24
    .line 25
    sget-object p4, Lu0/f;->j0:Lu0/f$a;

    .line 26
    .line 27
    invoke-virtual {p4}, Lu0/f$a;->a()I

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    move v7, p4

    .line 32
    :goto_0
    move-object v0, p0

    .line 33
    move-object v1, p1

    .line 34
    move-wide v2, p2

    .line 35
    goto :goto_1

    .line 36
    :cond_3
    move v7, p7

    .line 37
    goto :goto_0

    .line 38
    :goto_1
    invoke-static/range {v0 .. v7}, Ls0/j1;->d(Lu0/f;Ls0/i1;JFLu0/g;Landroidx/compose/ui/graphics/d;I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private static final f(Lr0/h;)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr0/h;->j()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lr0/h;->i()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-float/2addr v0, v1

    .line 10
    invoke-virtual {p0}, Lr0/h;->e()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0}, Lr0/h;->l()F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    sub-float/2addr v1, p0

    .line 19
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-long v2, p0

    .line 24
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    int-to-long v0, p0

    .line 29
    const/16 p0, 0x20

    .line 30
    .line 31
    shl-long/2addr v2, p0

    .line 32
    const-wide v4, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v0, v4

    .line 38
    or-long/2addr v0, v2

    .line 39
    invoke-static {v0, v1}, Lr0/l;->d(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    return-wide v0
.end method

.method private static final g(Lr0/j;)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr0/j;->j()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lr0/j;->d()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v0, v0

    .line 14
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    int-to-long v2, p0

    .line 19
    const/16 p0, 0x20

    .line 20
    .line 21
    shl-long/2addr v0, p0

    .line 22
    const-wide v4, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v2, v4

    .line 28
    or-long/2addr v0, v2

    .line 29
    invoke-static {v0, v1}, Lr0/l;->d(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0
.end method

.method private static final h(Lr0/h;)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr0/h;->i()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lr0/h;->l()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v0, v0

    .line 14
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    int-to-long v2, p0

    .line 19
    const/16 p0, 0x20

    .line 20
    .line 21
    shl-long/2addr v0, p0

    .line 22
    const-wide v4, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v2, v4

    .line 28
    or-long/2addr v0, v2

    .line 29
    invoke-static {v0, v1}, Lr0/f;->e(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0
.end method

.method private static final i(Lr0/j;)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr0/j;->e()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lr0/j;->g()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v0, v0

    .line 14
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    int-to-long v2, p0

    .line 19
    const/16 p0, 0x20

    .line 20
    .line 21
    shl-long/2addr v0, p0

    .line 22
    const-wide v4, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v2, v4

    .line 28
    or-long/2addr v0, v2

    .line 29
    invoke-static {v0, v1}, Lr0/f;->e(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0
.end method
