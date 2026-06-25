.class public abstract Le1/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final A(Landroid/text/Spannable;Lg1/k;II)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, LX0/n;

    .line 4
    .line 5
    sget-object v1, Lg1/k;->b:Lg1/k$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lg1/k$a;->d()Lg1/k;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1, v2}, Lg1/k;->d(Lg1/k;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v1}, Lg1/k$a;->b()Lg1/k;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p1, v1}, Lg1/k;->d(Lg1/k;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-direct {v0, v2, p1}, LX0/n;-><init>(ZZ)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, p2, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public static final B(Landroid/text/Spannable;Lg1/s;FLi1/d;)V
    .locals 10

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    invoke-virtual {p1}, Lg1/s;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v2}, Li1/w;->f(I)J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    invoke-static {v0, v1, v3, v4}, Li1/v;->e(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lg1/s;->c()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v2}, Li1/w;->f(I)J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    invoke-static {v0, v1, v3, v4}, Li1/v;->e(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_7

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lg1/s;->b()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-static {v0, v1}, Li1/v;->f(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    const-wide/16 v3, 0x0

    .line 41
    .line 42
    cmp-long v0, v0, v3

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-virtual {p1}, Lg1/s;->c()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    invoke-static {v0, v1}, Li1/v;->f(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    cmp-long v0, v0, v3

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    invoke-virtual {p1}, Lg1/s;->b()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-static {v0, v1}, Li1/v;->g(J)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    sget-object v3, Li1/x;->b:Li1/x$a;

    .line 69
    .line 70
    invoke-virtual {v3}, Li1/x$a;->b()J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    invoke-static {v0, v1, v4, v5}, Li1/x;->g(JJ)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    const/4 v5, 0x0

    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-virtual {p1}, Lg1/s;->b()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    invoke-interface {p3, v0, v1}, Li1/d;->z0(J)F

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    goto :goto_0

    .line 90
    :cond_3
    invoke-virtual {v3}, Li1/x$a;->a()J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    invoke-static {v0, v1, v6, v7}, Li1/x;->g(JJ)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {p1}, Lg1/s;->b()J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-static {v0, v1}, Li1/v;->h(J)F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    mul-float/2addr v0, p2

    .line 109
    goto :goto_0

    .line 110
    :cond_4
    move v0, v5

    .line 111
    :goto_0
    invoke-virtual {p1}, Lg1/s;->c()J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    invoke-static {v6, v7}, Li1/v;->g(J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v6

    .line 119
    invoke-virtual {v3}, Li1/x$a;->b()J

    .line 120
    .line 121
    .line 122
    move-result-wide v8

    .line 123
    invoke-static {v6, v7, v8, v9}, Li1/x;->g(JJ)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    invoke-virtual {p1}, Lg1/s;->c()J

    .line 130
    .line 131
    .line 132
    move-result-wide p1

    .line 133
    invoke-interface {p3, p1, p2}, Li1/d;->z0(J)F

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    goto :goto_1

    .line 138
    :cond_5
    invoke-virtual {v3}, Li1/x$a;->a()J

    .line 139
    .line 140
    .line 141
    move-result-wide v3

    .line 142
    invoke-static {v6, v7, v3, v4}, Li1/x;->g(JJ)Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-eqz p3, :cond_6

    .line 147
    .line 148
    invoke-virtual {p1}, Lg1/s;->c()J

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    invoke-static {v3, v4}, Li1/v;->h(J)F

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    mul-float v5, p1, p2

    .line 157
    .line 158
    :cond_6
    :goto_1
    new-instance p1, Landroid/text/style/LeadingMarginSpan$Standard;

    .line 159
    .line 160
    float-to-double p2, v0

    .line 161
    invoke-static {p2, p3}, Ljava/lang/Math;->ceil(D)D

    .line 162
    .line 163
    .line 164
    move-result-wide p2

    .line 165
    double-to-float p2, p2

    .line 166
    float-to-int p2, p2

    .line 167
    float-to-double v0, v5

    .line 168
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 169
    .line 170
    .line 171
    move-result-wide v0

    .line 172
    double-to-float p3, v0

    .line 173
    float-to-int p3, p3

    .line 174
    invoke-direct {p1, p2, p3}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 175
    .line 176
    .line 177
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    invoke-static {p0, p1, v2, p2}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 182
    .line 183
    .line 184
    :cond_7
    return-void
.end method

.method public static synthetic a(Landroid/text/Spannable;Lie/p;LU0/I0;II)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Le1/d;->p(Landroid/text/Spannable;Lie/p;LU0/I0;II)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(JLi1/d;)Landroid/text/style/MetricAffectingSpan;
    .locals 5

    .line 1
    invoke-static {p0, p1}, Li1/v;->g(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Li1/x;->b:Li1/x$a;

    .line 6
    .line 7
    invoke-virtual {v2}, Li1/x$a;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    invoke-static {v0, v1, v3, v4}, Li1/x;->g(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    new-instance v0, LX0/f;

    .line 18
    .line 19
    invoke-interface {p2, p0, p1}, Li1/d;->z0(J)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-direct {v0, p0}, LX0/f;-><init>(F)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    invoke-virtual {v2}, Li1/x$a;->a()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-static {v0, v1, v2, v3}, Li1/x;->g(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    new-instance p2, LX0/e;

    .line 38
    .line 39
    invoke-static {p0, p1}, Li1/v;->h(J)F

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-direct {p2, p0}, LX0/e;-><init>(F)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public static final c(LU0/I0;Ljava/util/List;Lie/o;)V
    .locals 12

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-gt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_6

    .line 14
    .line 15
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, LU0/e$d;

    .line 20
    .line 21
    invoke-virtual {v0}, LU0/e$d;->g()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, LU0/I0;

    .line 26
    .line 27
    invoke-static {p0, v0}, Le1/d;->g(LU0/I0;LU0/I0;)LU0/I0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LU0/e$d;

    .line 36
    .line 37
    invoke-virtual {v0}, LU0/e$d;->h()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, LU0/e$d;

    .line 50
    .line 51
    invoke-virtual {p1}, LU0/e$d;->f()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p2, p0, v0, p1}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    mul-int/lit8 v1, v0, 0x2

    .line 68
    .line 69
    new-array v3, v1, [I

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    move v5, v2

    .line 76
    :goto_0
    if-ge v5, v4, :cond_1

    .line 77
    .line 78
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, LU0/e$d;

    .line 83
    .line 84
    invoke-virtual {v6}, LU0/e$d;->h()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    aput v7, v3, v5

    .line 89
    .line 90
    add-int v7, v5, v0

    .line 91
    .line 92
    invoke-virtual {v6}, LU0/e$d;->f()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    aput v6, v3, v7

    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-static {v3}, LUd/n;->F([I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v3}, LUd/n;->W([I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    move v4, v2

    .line 109
    :goto_1
    if-ge v4, v1, :cond_6

    .line 110
    .line 111
    aget v5, v3, v4

    .line 112
    .line 113
    if-ne v5, v0, :cond_2

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    move-object v8, p0

    .line 121
    move v7, v2

    .line 122
    :goto_2
    if-ge v7, v6, :cond_4

    .line 123
    .line 124
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    check-cast v9, LU0/e$d;

    .line 129
    .line 130
    invoke-virtual {v9}, LU0/e$d;->h()I

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    invoke-virtual {v9}, LU0/e$d;->f()I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-eq v10, v11, :cond_3

    .line 139
    .line 140
    invoke-virtual {v9}, LU0/e$d;->h()I

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    invoke-virtual {v9}, LU0/e$d;->f()I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    invoke-static {v0, v5, v10, v11}, LU0/g;->j(IIII)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_3

    .line 153
    .line 154
    invoke-virtual {v9}, LU0/e$d;->g()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    check-cast v9, LU0/I0;

    .line 159
    .line 160
    invoke-static {v8, v9}, Le1/d;->g(LU0/I0;LU0/I0;)LU0/I0;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_4
    if-eqz v8, :cond_5

    .line 168
    .line 169
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-interface {p2, v8, v0, v6}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    :cond_5
    move v0, v5

    .line 181
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_6
    return-void
.end method

.method private static final d(LU0/I0;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LU0/I0;->o()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Li1/v;->g(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget-object v2, Li1/x;->b:Li1/x$a;

    .line 10
    .line 11
    invoke-virtual {v2}, Li1/x$a;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-static {v0, v1, v3, v4}, Li1/x;->g(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, LU0/I0;->o()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Li1/v;->g(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-virtual {v2}, Li1/x$a;->a()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-static {v0, v1, v2, v3}, Li1/x;->g(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0
.end method

.method private static final e(LU0/Y0;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LU0/Y0;->O()LU0/I0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Le1/e;->d(LU0/I0;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LU0/Y0;->p()LY0/I;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method private static final f(Li1/d;)Z
    .locals 4

    .line 1
    invoke-interface {p0}, Li1/l;->j1()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    float-to-double v0, p0

    .line 6
    const-wide v2, 0x3ff0cccccccccccdL    # 1.05

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmpl-double p0, v0, v2

    .line 12
    .line 13
    if-lez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private static final g(LU0/I0;LU0/I0;)LU0/I0;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, LU0/I0;->x(LU0/I0;)LU0/I0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private static final h(JFLi1/d;)F
    .locals 5

    .line 1
    invoke-static {p0, p1}, Li1/v;->g(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Li1/x;->b:Li1/x$a;

    .line 6
    .line 7
    invoke-virtual {v2}, Li1/x$a;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    invoke-static {v0, v1, v3, v4}, Li1/x;->g(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-static {p3}, Le1/d;->f(Li1/d;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p3, p0, p1}, Li1/d;->z0(J)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_0
    invoke-interface {p3, p2}, Li1/d;->d0(F)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-static {p0, p1}, Li1/v;->h(J)F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {v0, v1}, Li1/v;->h(J)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    div-float/2addr p0, p1

    .line 41
    :goto_0
    mul-float/2addr p0, p2

    .line 42
    return p0

    .line 43
    :cond_1
    invoke-virtual {v2}, Li1/x$a;->a()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    invoke-static {v0, v1, v2, v3}, Li1/x;->g(JJ)Z

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    if-eqz p3, :cond_2

    .line 52
    .line 53
    invoke-static {p0, p1}, Li1/v;->h(J)F

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 59
    .line 60
    return p0
.end method

.method public static final i(Landroid/text/Spannable;JII)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x10

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/text/style/BackgroundColorSpan;

    .line 8
    .line 9
    invoke-static {p1, p2}, Ls0/s0;->k(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {v0, p1}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0, p3, p4}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private static final j(Landroid/text/Spannable;Lg1/a;II)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lg1/a;->h()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    new-instance v0, LX0/a;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LX0/a;-><init>(F)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v0, p2, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private static final k(Landroid/text/Spannable;Ls0/h0;FII)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    instance-of v0, p1, Ls0/F1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ls0/F1;

    .line 8
    .line 9
    invoke-virtual {p1}, Ls0/F1;->a()J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-static {p0, p1, p2, p3, p4}, Le1/d;->m(Landroid/text/Spannable;JII)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p1, Ls0/A1;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Lf1/d;

    .line 22
    .line 23
    check-cast p1, Ls0/A1;

    .line 24
    .line 25
    invoke-direct {v0, p1, p2}, Lf1/d;-><init>(Ls0/A1;F)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, v0, p3, p4}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance p0, LTd/r;

    .line 33
    .line 34
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 35
    .line 36
    .line 37
    throw p0

    .line 38
    :cond_2
    return-void
.end method

.method public static final l(Landroid/text/Spannable;Ljava/util/List;FLi1/d;Lg1/s;)V
    .locals 4

    .line 1
    if-eqz p4, :cond_1

    .line 2
    .line 3
    invoke-virtual {p4}, Lg1/s;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Li1/v;->g(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sget-object p0, Li1/x;->b:Li1/x$a;

    .line 12
    .line 13
    invoke-virtual {p0}, Li1/x$a;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-static {v0, v1, v2, v3}, Li1/x;->g(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p4}, Lg1/s;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-interface {p3, v0, v1}, Li1/d;->z0(J)F

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Li1/x$a;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide p2

    .line 35
    invoke-static {v0, v1, p2, p3}, Li1/x;->g(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p4}, Lg1/s;->b()J

    .line 42
    .line 43
    .line 44
    move-result-wide p2

    .line 45
    invoke-static {p2, p3}, Li1/v;->h(J)F

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    const/4 p2, 0x0

    .line 53
    :goto_1
    if-ge p2, p0, :cond_2

    .line 54
    .line 55
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    check-cast p3, LU0/e$d;

    .line 60
    .line 61
    invoke-virtual {p3}, LU0/e$d;->g()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    add-int/lit8 p2, p2, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    return-void
.end method

.method public static final m(Landroid/text/Spannable;JII)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x10

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 8
    .line 9
    invoke-static {p1, p2}, Ls0/s0;->k(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0, p3, p4}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private static final n(Landroid/text/Spannable;Lu0/g;II)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lf1/a;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lf1/a;-><init>(Lu0/g;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0, p2, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private static final o(Landroid/text/Spannable;LU0/Y0;Ljava/util/List;Lie/p;)V
    .locals 25

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_2

    .line 16
    .line 17
    move-object/from16 v3, p2

    .line 18
    .line 19
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, LU0/e$d;

    .line 24
    .line 25
    invoke-virtual {v4}, LU0/e$d;->g()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    instance-of v5, v5, LU0/I0;

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    invoke-virtual {v4}, LU0/e$d;->g()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, LU0/I0;

    .line 38
    .line 39
    invoke-static {v5}, Le1/e;->d(LU0/I0;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    invoke-virtual {v4}, LU0/e$d;->g()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, LU0/I0;

    .line 50
    .line 51
    invoke-virtual {v5}, LU0/I0;->m()LY0/I;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    :cond_0
    const-string v5, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>"

    .line 58
    .line 59
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-static/range {p1 .. p1}, Le1/d;->e(LU0/Y0;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual/range {p1 .. p1}, LU0/Y0;->l()LY0/u;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-virtual/range {p1 .. p1}, LU0/Y0;->q()LY0/L;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual/range {p1 .. p1}, LU0/Y0;->o()LY0/H;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual/range {p1 .. p1}, LU0/Y0;->p()LY0/I;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    new-instance v2, LU0/I0;

    .line 91
    .line 92
    const v23, 0xffc3

    .line 93
    .line 94
    .line 95
    const/16 v24, 0x0

    .line 96
    .line 97
    const-wide/16 v3, 0x0

    .line 98
    .line 99
    const-wide/16 v5, 0x0

    .line 100
    .line 101
    const/4 v11, 0x0

    .line 102
    const-wide/16 v12, 0x0

    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/4 v15, 0x0

    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    const-wide/16 v17, 0x0

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    const/16 v20, 0x0

    .line 113
    .line 114
    const/16 v21, 0x0

    .line 115
    .line 116
    const/16 v22, 0x0

    .line 117
    .line 118
    invoke-direct/range {v2 .. v24}, LU0/I0;-><init>(JJLY0/L;LY0/H;LY0/I;LY0/u;Ljava/lang/String;JLg1/a;Lg1/q;Lc1/e;JLg1/k;Ls0/C1;LU0/F;Lu0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    const/4 v2, 0x0

    .line 123
    :goto_1
    new-instance v1, Le1/c;

    .line 124
    .line 125
    move-object/from16 v3, p0

    .line 126
    .line 127
    move-object/from16 v4, p3

    .line 128
    .line 129
    invoke-direct {v1, v3, v4}, Le1/c;-><init>(Landroid/text/Spannable;Lie/p;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v2, v0, v1}, Le1/d;->c(LU0/I0;Ljava/util/List;Lie/o;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method private static final p(Landroid/text/Spannable;Lie/p;LU0/I0;II)LTd/L;
    .locals 4

    .line 1
    new-instance v0, LX0/o;

    .line 2
    .line 3
    invoke-virtual {p2}, LU0/I0;->i()LY0/u;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p2}, LU0/I0;->n()LY0/L;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    sget-object v2, LY0/L;->b:LY0/L$a;

    .line 14
    .line 15
    invoke-virtual {v2}, LY0/L$a;->g()LY0/L;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    invoke-virtual {p2}, LU0/I0;->l()LY0/H;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v3}, LY0/H;->i()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sget-object v3, LY0/H;->b:LY0/H$a;

    .line 31
    .line 32
    invoke-virtual {v3}, LY0/H$a;->b()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    :goto_0
    invoke-static {v3}, LY0/H;->c(I)LY0/H;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p2}, LU0/I0;->m()LY0/I;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2}, LY0/I;->m()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    sget-object p2, LY0/I;->b:LY0/I$a;

    .line 52
    .line 53
    invoke-virtual {p2}, LY0/I$a;->a()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    :goto_1
    invoke-static {p2}, LY0/I;->e(I)LY0/I;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-interface {p1, v1, v2, v3, p2}, Lie/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Landroid/graphics/Typeface;

    .line 66
    .line 67
    invoke-direct {v0, p1}, LX0/o;-><init>(Landroid/graphics/Typeface;)V

    .line 68
    .line 69
    .line 70
    const/16 p1, 0x21

    .line 71
    .line 72
    invoke-interface {p0, v0, p3, p4, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 73
    .line 74
    .line 75
    sget-object p0, LTd/L;->a:LTd/L;

    .line 76
    .line 77
    return-object p0
.end method

.method private static final q(Landroid/text/Spannable;Ljava/lang/String;II)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, LX0/b;

    .line 4
    .line 5
    invoke-direct {v0, p1}, LX0/b;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0, p2, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static final r(Landroid/text/Spannable;JLi1/d;II)V
    .locals 5

    .line 1
    invoke-static {p1, p2}, Li1/v;->g(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Li1/x;->b:Li1/x$a;

    .line 6
    .line 7
    invoke-virtual {v2}, Li1/x$a;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    invoke-static {v0, v1, v3, v4}, Li1/x;->g(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    .line 18
    .line 19
    invoke-interface {p3, p1, p2}, Li1/d;->z0(J)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, Lke/a;->d(F)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {v0, p1, p2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0, v0, p4, p5}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-virtual {v2}, Li1/x$a;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-static {v0, v1, v2, v3}, Li1/x;->g(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-eqz p3, :cond_1

    .line 44
    .line 45
    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    .line 46
    .line 47
    invoke-static {p1, p2}, Li1/v;->h(J)F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-direct {p3, p1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, p3, p4, p5}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
.end method

.method private static final s(Landroid/text/Spannable;Lg1/q;II)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroid/text/style/ScaleXSpan;

    .line 4
    .line 5
    invoke-virtual {p1}, Lg1/q;->b()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v0, p2, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    new-instance v0, LX0/m;

    .line 16
    .line 17
    invoke-virtual {p1}, Lg1/q;->c()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-direct {v0, p1}, LX0/m;-><init>(F)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v0, p2, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public static final t(Landroid/text/Spannable;JFLi1/d;Lg1/h;)V
    .locals 8

    .line 1
    invoke-static {p1, p2, p3, p4}, Le1/d;->h(JFLi1/d;)F

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_2

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p0}, LDf/r;->q1(Ljava/lang/CharSequence;)C

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/16 p2, 0xa

    .line 23
    .line 24
    if-ne p1, p2, :cond_1

    .line 25
    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    add-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    :goto_1
    move v3, p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    goto :goto_1

    .line 39
    :goto_2
    new-instance v0, LX0/h;

    .line 40
    .line 41
    invoke-virtual {p5}, Lg1/h;->d()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Lg1/h$d;->h(I)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {p5}, Lg1/h;->d()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p1}, Lg1/h$d;->i(I)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-virtual {p5}, Lg1/h;->b()F

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-virtual {p5}, Lg1/h;->c()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    sget-object p2, Lg1/h$c;->b:Lg1/h$c$a;

    .line 66
    .line 67
    invoke-virtual {p2}, Lg1/h$c$a;->b()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-static {p1, p2}, Lg1/h$c;->f(II)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-direct/range {v0 .. v7}, LX0/h;-><init>(FIIZZFZ)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-static {p0, v0, p1, p2}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
.end method

.method public static final u(Landroid/text/Spannable;JFLi1/d;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4}, Le1/d;->h(JFLi1/d;)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance p2, LX0/g;

    .line 12
    .line 13
    invoke-direct {p2, p1}, LX0/g;-><init>(F)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-static {p0, p2, p1, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public static final v(Landroid/text/Spannable;Lc1/e;II)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Le1/a;->a:Le1/a;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Le1/a;->a(Lc1/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1, p2, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private static final w(Landroid/text/Spannable;Ls0/C1;II)V
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, LX0/l;

    .line 4
    .line 5
    invoke-virtual {p1}, Ls0/C1;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Ls0/s0;->k(J)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1}, Ls0/C1;->d()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const/16 v4, 0x20

    .line 18
    .line 19
    shr-long/2addr v2, v4

    .line 20
    long-to-int v2, v2

    .line 21
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1}, Ls0/C1;->d()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    const-wide v5, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v3, v5

    .line 35
    long-to-int v3, v3

    .line 36
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {p1}, Ls0/C1;->b()F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1}, Le1/e;->b(F)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-direct {v0, v1, v2, v3, p1}, LX0/l;-><init>(IFFF)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0, p2, p3}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public static final x(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 1

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final y(Landroid/text/Spannable;LU0/I0;IILi1/d;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, LU0/I0;->e()Lg1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0, p2, p3}, Le1/d;->j(Landroid/text/Spannable;Lg1/a;II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, LU0/I0;->g()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {p0, v0, v1, p2, p3}, Le1/d;->m(Landroid/text/Spannable;JII)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, LU0/I0;->f()Ls0/h0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, LU0/I0;->c()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {p0, v0, v1, p2, p3}, Le1/d;->k(Landroid/text/Spannable;Ls0/h0;FII)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, LU0/I0;->s()Lg1/k;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p0, v0, p2, p3}, Le1/d;->A(Landroid/text/Spannable;Lg1/k;II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, LU0/I0;->k()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    move-object v1, p0

    .line 38
    move v5, p2

    .line 39
    move v6, p3

    .line 40
    move-object v4, p4

    .line 41
    invoke-static/range {v1 .. v6}, Le1/d;->r(Landroid/text/Spannable;JLi1/d;II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, LU0/I0;->j()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {v1, p0, v5, v6}, Le1/d;->q(Landroid/text/Spannable;Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, LU0/I0;->u()Lg1/q;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v1, p0, v5, v6}, Le1/d;->s(Landroid/text/Spannable;Lg1/q;II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, LU0/I0;->p()Lc1/e;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {v1, p0, v5, v6}, Le1/d;->v(Landroid/text/Spannable;Lc1/e;II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, LU0/I0;->d()J

    .line 66
    .line 67
    .line 68
    move-result-wide p2

    .line 69
    invoke-static {v1, p2, p3, v5, v6}, Le1/d;->i(Landroid/text/Spannable;JII)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, LU0/I0;->r()Ls0/C1;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {v1, p0, v5, v6}, Le1/d;->w(Landroid/text/Spannable;Ls0/C1;II)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, LU0/I0;->h()Lu0/g;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {v1, p0, v5, v6}, Le1/d;->n(Landroid/text/Spannable;Lu0/g;II)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static final z(Landroid/text/Spannable;LU0/Y0;Ljava/util/List;Li1/d;Lie/p;)V
    .locals 6

    .line 1
    invoke-static {p0, p1, p2, p4}, Le1/d;->o(Landroid/text/Spannable;LU0/Y0;Ljava/util/List;Lie/p;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 p4, 0x0

    .line 9
    move v0, p4

    .line 10
    move v1, v0

    .line 11
    :goto_0
    if-ge v0, p1, :cond_2

    .line 12
    .line 13
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, LU0/e$d;

    .line 18
    .line 19
    invoke-virtual {v2}, LU0/e$d;->g()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    instance-of v3, v3, LU0/I0;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, LU0/e$d;->h()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v2}, LU0/e$d;->f()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ltz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-ge v3, v5, :cond_1

    .line 42
    .line 43
    if-le v4, v3, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-le v4, v5, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-virtual {v2}, LU0/e$d;->g()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, LU0/I0;

    .line 57
    .line 58
    invoke-static {p0, v5, v3, v4, p3}, Le1/d;->y(Landroid/text/Spannable;LU0/I0;IILi1/d;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, LU0/e$d;->g()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, LU0/I0;

    .line 66
    .line 67
    invoke-static {v2}, Le1/d;->d(LU0/I0;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    if-eqz v1, :cond_5

    .line 78
    .line 79
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    :goto_2
    if-ge p4, p1, :cond_5

    .line 84
    .line 85
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, LU0/e$d;

    .line 90
    .line 91
    invoke-virtual {v0}, LU0/e$d;->g()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, LU0/e$a;

    .line 96
    .line 97
    instance-of v2, v1, LU0/I0;

    .line 98
    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0}, LU0/e$d;->h()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {v0}, LU0/e$d;->f()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-ltz v2, :cond_4

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-ge v2, v3, :cond_4

    .line 116
    .line 117
    if-le v0, v2, :cond_4

    .line 118
    .line 119
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-le v0, v3, :cond_3

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_3
    check-cast v1, LU0/I0;

    .line 127
    .line 128
    invoke-virtual {v1}, LU0/I0;->o()J

    .line 129
    .line 130
    .line 131
    move-result-wide v3

    .line 132
    invoke-static {v3, v4, p3}, Le1/d;->b(JLi1/d;)Landroid/text/style/MetricAffectingSpan;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    invoke-static {p0, v1, v2, v0}, Le1/d;->x(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 139
    .line 140
    .line 141
    :cond_4
    :goto_3
    add-int/lit8 p4, p4, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    return-void
.end method
