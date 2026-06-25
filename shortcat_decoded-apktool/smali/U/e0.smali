.class public abstract LU/e0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, LU/e0$a;->a:LU/e0$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v2, v0, v1, v2}, LY/H;->h(LY/T1;Lie/a;ILjava/lang/Object;)LY/b1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LU/e0;->a:LY/b1;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;Ls0/E1;JJFFLx/g;Lkotlin/jvm/functions/Function2;LY/m;II)V
    .locals 2

    .line 1
    and-int/lit8 v0, p12, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p12, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_1
    and-int/lit8 v0, p12, 0x4

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    sget-object p2, LU/D;->a:LU/D;

    .line 20
    .line 21
    const/4 p3, 0x6

    .line 22
    invoke-virtual {p2, p10, p3}, LU/D;->a(LY/m;I)LU/l;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2}, LU/l;->H()J

    .line 27
    .line 28
    .line 29
    move-result-wide p2

    .line 30
    :cond_2
    and-int/lit8 v0, p12, 0x8

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    shr-int/lit8 p4, p11, 0x6

    .line 35
    .line 36
    and-int/lit8 p4, p4, 0xe

    .line 37
    .line 38
    invoke-static {p2, p3, p10, p4}, LU/m;->c(JLY/m;I)J

    .line 39
    .line 40
    .line 41
    move-result-wide p4

    .line 42
    :cond_3
    and-int/lit8 v0, p12, 0x10

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    int-to-float p6, v1

    .line 48
    invoke-static {p6}, Li1/h;->n(F)F

    .line 49
    .line 50
    .line 51
    move-result p6

    .line 52
    :cond_4
    and-int/lit8 v0, p12, 0x20

    .line 53
    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    int-to-float p7, v1

    .line 57
    invoke-static {p7}, Li1/h;->n(F)F

    .line 58
    .line 59
    .line 60
    move-result p7

    .line 61
    :cond_5
    and-int/lit8 p12, p12, 0x40

    .line 62
    .line 63
    if-eqz p12, :cond_6

    .line 64
    .line 65
    const/4 p8, 0x0

    .line 66
    :cond_6
    invoke-static {}, LY/w;->L()Z

    .line 67
    .line 68
    .line 69
    move-result p12

    .line 70
    if-eqz p12, :cond_7

    .line 71
    .line 72
    const/4 p12, -0x1

    .line 73
    const-string v0, "androidx.compose.material3.Surface (Surface.kt:102)"

    .line 74
    .line 75
    const v1, -0x1ea1368d

    .line 76
    .line 77
    .line 78
    invoke-static {v1, p11, p12, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_7
    sget-object p11, LU/e0;->a:LY/b1;

    .line 82
    .line 83
    invoke-interface {p10, p11}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p12

    .line 87
    check-cast p12, Li1/h;

    .line 88
    .line 89
    invoke-virtual {p12}, Li1/h;->t()F

    .line 90
    .line 91
    .line 92
    move-result p12

    .line 93
    add-float/2addr p12, p6

    .line 94
    invoke-static {p12}, Li1/h;->n(F)F

    .line 95
    .line 96
    .line 97
    move-result p6

    .line 98
    invoke-static {}, LU/s;->a()LY/b1;

    .line 99
    .line 100
    .line 101
    move-result-object p12

    .line 102
    invoke-static {p4, p5}, Ls0/r0;->m(J)Ls0/r0;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    invoke-virtual {p12, p4}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 107
    .line 108
    .line 109
    move-result-object p4

    .line 110
    invoke-static {p6}, Li1/h;->h(F)Li1/h;

    .line 111
    .line 112
    .line 113
    move-result-object p5

    .line 114
    invoke-virtual {p11, p5}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 115
    .line 116
    .line 117
    move-result-object p5

    .line 118
    filled-new-array {p4, p5}, [LY/c1;

    .line 119
    .line 120
    .line 121
    move-result-object p11

    .line 122
    move-wide p4, p2

    .line 123
    move-object p3, p1

    .line 124
    new-instance p1, LU/e0$b;

    .line 125
    .line 126
    move-object p2, p8

    .line 127
    move p8, p7

    .line 128
    move-object p7, p2

    .line 129
    move-object p2, p0

    .line 130
    invoke-direct/range {p1 .. p9}, LU/e0$b;-><init>(Landroidx/compose/ui/e;Ls0/E1;JFLx/g;FLkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    const/16 p0, 0x36

    .line 134
    .line 135
    const p2, -0x43a11cd

    .line 136
    .line 137
    .line 138
    const/4 p3, 0x1

    .line 139
    invoke-static {p2, p3, p1, p10, p0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    sget p1, LY/c1;->i:I

    .line 144
    .line 145
    or-int/lit8 p1, p1, 0x30

    .line 146
    .line 147
    invoke-static {p11, p0, p10, p1}, LY/H;->d([LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 148
    .line 149
    .line 150
    invoke-static {}, LY/w;->L()Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_8

    .line 155
    .line 156
    invoke-static {}, LY/w;->T()V

    .line 157
    .line 158
    .line 159
    :cond_8
    return-void
.end method

.method public static final b(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;JJFFLx/g;LB/m;Lkotlin/jvm/functions/Function2;LY/m;III)V
    .locals 16

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    move/from16 v1, p14

    .line 4
    .line 5
    move/from16 v2, p16

    .line 6
    .line 7
    and-int/lit8 v3, v2, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 12
    .line 13
    move-object v5, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object/from16 v5, p1

    .line 16
    .line 17
    :goto_0
    and-int/lit8 v3, v2, 0x4

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    const/4 v12, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v12, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v3, v2, 0x8

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-static {}, Ls0/t1;->a()Ls0/E1;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v6, v3

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object/from16 v6, p3

    .line 36
    .line 37
    :goto_2
    and-int/lit8 v3, v2, 0x10

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    sget-object v3, LU/D;->a:LU/D;

    .line 42
    .line 43
    const/4 v7, 0x6

    .line 44
    invoke-virtual {v3, v0, v7}, LU/D;->a(LY/m;I)LU/l;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, LU/l;->H()J

    .line 49
    .line 50
    .line 51
    move-result-wide v7

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move-wide/from16 v7, p4

    .line 54
    .line 55
    :goto_3
    and-int/lit8 v3, v2, 0x20

    .line 56
    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    shr-int/lit8 v3, v1, 0xc

    .line 60
    .line 61
    and-int/lit8 v3, v3, 0xe

    .line 62
    .line 63
    invoke-static {v7, v8, v0, v3}, LU/m;->c(JLY/m;I)J

    .line 64
    .line 65
    .line 66
    move-result-wide v9

    .line 67
    goto :goto_4

    .line 68
    :cond_4
    move-wide/from16 v9, p6

    .line 69
    .line 70
    :goto_4
    and-int/lit8 v3, v2, 0x40

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    if-eqz v3, :cond_5

    .line 74
    .line 75
    int-to-float v3, v11

    .line 76
    invoke-static {v3}, Li1/h;->n(F)F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    goto :goto_5

    .line 81
    :cond_5
    move/from16 v3, p8

    .line 82
    .line 83
    :goto_5
    and-int/lit16 v13, v2, 0x80

    .line 84
    .line 85
    if-eqz v13, :cond_6

    .line 86
    .line 87
    int-to-float v11, v11

    .line 88
    invoke-static {v11}, Li1/h;->n(F)F

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    move v14, v11

    .line 93
    goto :goto_6

    .line 94
    :cond_6
    move/from16 v14, p9

    .line 95
    .line 96
    :goto_6
    and-int/lit16 v11, v2, 0x100

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    if-eqz v11, :cond_7

    .line 100
    .line 101
    move-object v11, v13

    .line 102
    goto :goto_7

    .line 103
    :cond_7
    move-object/from16 v11, p10

    .line 104
    .line 105
    :goto_7
    and-int/lit16 v2, v2, 0x200

    .line 106
    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    goto :goto_8

    .line 110
    :cond_8
    move-object/from16 v13, p11

    .line 111
    .line 112
    :goto_8
    invoke-static {}, LY/w;->L()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_9

    .line 117
    .line 118
    const v2, -0x2f12abe4

    .line 119
    .line 120
    .line 121
    const-string v15, "androidx.compose.material3.Surface (Surface.kt:203)"

    .line 122
    .line 123
    move/from16 v4, p15

    .line 124
    .line 125
    invoke-static {v2, v1, v4, v15}, LY/w;->U(IIILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_9
    sget-object v1, LU/e0;->a:LY/b1;

    .line 129
    .line 130
    invoke-interface {v0, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Li1/h;

    .line 135
    .line 136
    invoke-virtual {v2}, Li1/h;->t()F

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    add-float/2addr v2, v3

    .line 141
    invoke-static {v2}, Li1/h;->n(F)F

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    invoke-static {}, LU/s;->a()LY/b1;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v9, v10}, Ls0/r0;->m(J)Ls0/r0;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v3, v4}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {v2}, Li1/h;->h(F)Li1/h;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v1, v4}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    filled-new-array {v3, v1}, [LY/c1;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v4, LU/e0$c;

    .line 170
    .line 171
    move-object/from16 v15, p12

    .line 172
    .line 173
    move v9, v2

    .line 174
    move-object v10, v11

    .line 175
    move-object v11, v13

    .line 176
    const/4 v2, 0x1

    .line 177
    move-object/from16 v13, p0

    .line 178
    .line 179
    invoke-direct/range {v4 .. v15}, LU/e0$c;-><init>(Landroidx/compose/ui/e;Ls0/E1;JFLx/g;LB/m;ZLie/a;FLkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    const/16 v3, 0x36

    .line 183
    .line 184
    const v5, 0x4c46b75c    # 5.2092272E7f

    .line 185
    .line 186
    .line 187
    invoke-static {v5, v2, v4, v0, v3}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    sget v3, LY/c1;->i:I

    .line 192
    .line 193
    or-int/lit8 v3, v3, 0x30

    .line 194
    .line 195
    invoke-static {v1, v2, v0, v3}, LY/H;->d([LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 196
    .line 197
    .line 198
    invoke-static {}, LY/w;->L()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_a

    .line 203
    .line 204
    invoke-static {}, LY/w;->T()V

    .line 205
    .line 206
    .line 207
    :cond_a
    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/e;Ls0/E1;JLx/g;F)Landroidx/compose/ui/e;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, LU/e0;->e(Landroidx/compose/ui/e;Ls0/E1;JLx/g;F)Landroidx/compose/ui/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(JFLY/m;I)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LU/e0;->f(JFLY/m;I)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ls0/E1;JLx/g;F)Landroidx/compose/ui/e;
    .locals 24

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v1, p5, v1

    .line 5
    .line 6
    if-lez v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 9
    .line 10
    const v22, 0x1e7df

    .line 11
    .line 12
    .line 13
    const/16 v23, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    const-wide/16 v12, 0x0

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    const-wide/16 v17, 0x0

    .line 30
    .line 31
    const-wide/16 v19, 0x0

    .line 32
    .line 33
    const/16 v21, 0x0

    .line 34
    .line 35
    move-object/from16 v14, p1

    .line 36
    .line 37
    move/from16 v7, p5

    .line 38
    .line 39
    invoke-static/range {v1 .. v23}, Landroidx/compose/ui/graphics/f;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    move-object/from16 v2, p0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move-object/from16 v14, p1

    .line 47
    .line 48
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    invoke-interface {v2, v1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 58
    .line 59
    invoke-static {v2, v0, v14}, Lx/e;->e(Landroidx/compose/ui/e;Lx/g;Ls0/E1;)Landroidx/compose/ui/e;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 65
    .line 66
    :goto_2
    invoke-interface {v1, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-wide/from16 v1, p2

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v14}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLs0/E1;)Landroidx/compose/ui/e;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0, v14}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
.end method

.method private static final f(JFLY/m;I)J
    .locals 8

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)"

    .line 9
    .line 10
    const v2, -0x7bf9080a

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p4, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v0, LU/D;->a:LU/D;

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    invoke-virtual {v0, p3, v1}, LU/D;->a(LY/m;I)LU/l;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    shl-int/lit8 p4, p4, 0x3

    .line 24
    .line 25
    and-int/lit16 v7, p4, 0x3f0

    .line 26
    .line 27
    move-wide v3, p0

    .line 28
    move v5, p2

    .line 29
    move-object v6, p3

    .line 30
    invoke-static/range {v2 .. v7}, LU/m;->a(LU/l;JFLY/m;I)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    invoke-static {}, LY/w;->L()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    invoke-static {}, LY/w;->T()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-wide p0
.end method
