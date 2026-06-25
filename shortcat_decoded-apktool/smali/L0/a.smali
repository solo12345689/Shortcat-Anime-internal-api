.class public abstract LL0/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private static final a(Ljava/util/List;)Z
    .locals 14

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    const-wide v3, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const/16 v5, 0x20

    .line 21
    .line 22
    if-gt v0, v2, :cond_1

    .line 23
    .line 24
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    move v8, v1

    .line 44
    :goto_0
    if-ge v8, v7, :cond_2

    .line 45
    .line 46
    add-int/lit8 v8, v8, 0x1

    .line 47
    .line 48
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    move-object v10, v9

    .line 53
    check-cast v10, LR0/s;

    .line 54
    .line 55
    check-cast v6, LR0/s;

    .line 56
    .line 57
    invoke-virtual {v6}, LR0/s;->k()Lr0/h;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    invoke-virtual {v11}, Lr0/h;->g()J

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    shr-long/2addr v11, v5

    .line 66
    long-to-int v11, v11

    .line 67
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    invoke-virtual {v10}, LR0/s;->k()Lr0/h;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    invoke-virtual {v12}, Lr0/h;->g()J

    .line 76
    .line 77
    .line 78
    move-result-wide v12

    .line 79
    shr-long/2addr v12, v5

    .line 80
    long-to-int v12, v12

    .line 81
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    sub-float/2addr v11, v12

    .line 86
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    invoke-virtual {v6}, LR0/s;->k()Lr0/h;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v6}, Lr0/h;->g()J

    .line 95
    .line 96
    .line 97
    move-result-wide v12

    .line 98
    and-long/2addr v12, v3

    .line 99
    long-to-int v6, v12

    .line 100
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-virtual {v10}, LR0/s;->k()Lr0/h;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-virtual {v10}, Lr0/h;->g()J

    .line 109
    .line 110
    .line 111
    move-result-wide v12

    .line 112
    and-long/2addr v12, v3

    .line 113
    long-to-int v10, v12

    .line 114
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    sub-float/2addr v6, v10

    .line 119
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    int-to-long v10, v10

    .line 128
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    int-to-long v12, v6

    .line 133
    shl-long/2addr v10, v5

    .line 134
    and-long/2addr v12, v3

    .line 135
    or-long/2addr v10, v12

    .line 136
    invoke-static {v10, v11}, Lr0/f;->e(J)J

    .line 137
    .line 138
    .line 139
    move-result-wide v10

    .line 140
    invoke-static {v10, v11}, Lr0/f;->d(J)Lr0/f;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-object v6, v9

    .line 148
    goto :goto_0

    .line 149
    :cond_2
    move-object p0, v0

    .line 150
    :goto_1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-ne v0, v2, :cond_3

    .line 155
    .line 156
    invoke-static {p0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, Lr0/f;

    .line 161
    .line 162
    invoke-virtual {p0}, Lr0/f;->u()J

    .line 163
    .line 164
    .line 165
    move-result-wide v6

    .line 166
    goto :goto_3

    .line 167
    :cond_3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_4

    .line 172
    .line 173
    const-string v0, "Empty collection can\'t be reduced."

    .line 174
    .line 175
    invoke-static {v0}, Lk1/a;->f(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    invoke-static {p0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {p0}, LUd/u;->o(Ljava/util/List;)I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-gt v2, v6, :cond_5

    .line 187
    .line 188
    move v7, v2

    .line 189
    :goto_2
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    check-cast v8, Lr0/f;

    .line 194
    .line 195
    invoke-virtual {v8}, Lr0/f;->u()J

    .line 196
    .line 197
    .line 198
    move-result-wide v8

    .line 199
    check-cast v0, Lr0/f;

    .line 200
    .line 201
    invoke-virtual {v0}, Lr0/f;->u()J

    .line 202
    .line 203
    .line 204
    move-result-wide v10

    .line 205
    invoke-static {v10, v11, v8, v9}, Lr0/f;->q(JJ)J

    .line 206
    .line 207
    .line 208
    move-result-wide v8

    .line 209
    invoke-static {v8, v9}, Lr0/f;->d(J)Lr0/f;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-eq v7, v6, :cond_5

    .line 214
    .line 215
    add-int/lit8 v7, v7, 0x1

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_5
    check-cast v0, Lr0/f;

    .line 219
    .line 220
    invoke-virtual {v0}, Lr0/f;->u()J

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    :goto_3
    shr-long v8, v6, v5

    .line 225
    .line 226
    long-to-int p0, v8

    .line 227
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    and-long/2addr v3, v6

    .line 232
    long-to-int v0, v3

    .line 233
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    cmpg-float p0, v0, p0

    .line 238
    .line 239
    if-gez p0, :cond_6

    .line 240
    .line 241
    return v2

    .line 242
    :cond_6
    return v1
.end method

.method public static final b(LR0/s;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    invoke-virtual {v1}, LR0/x;->a()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v1}, LR0/x;->E()LR0/B;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p0, v0}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method private static final c(LR0/b;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LR0/b;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, LR0/b;->a()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-gez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static final d(LR0/s;LL1/B;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    invoke-virtual {v1}, LR0/x;->a()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LR0/b;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, LL0/a;->f(LR0/b;)LL1/B$f;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p1, p0}, LL1/B;->B0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1}, LR0/x;->E()LR0/B;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v2, v1}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x0

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, LR0/s;->v()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    move v3, v2

    .line 56
    :goto_0
    if-ge v3, v1, :cond_2

    .line 57
    .line 58
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, LR0/s;

    .line 63
    .line 64
    invoke-virtual {v4}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    sget-object v6, LR0/x;->a:LR0/x;

    .line 69
    .line 70
    invoke-virtual {v6}, LR0/x;->F()LR0/B;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v5, v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_5

    .line 91
    .line 92
    invoke-static {v0}, LL0/a;->a(Ljava/util/List;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    const/4 v1, 0x1

    .line 97
    if-eqz p0, :cond_3

    .line 98
    .line 99
    move v3, v1

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    :goto_1
    if-eqz p0, :cond_4

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    :cond_4
    invoke-static {v3, v1, v2, v2}, LL1/B$f;->b(IIZI)LL1/B$f;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p1, p0}, LL1/B;->B0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    return-void
.end method

.method public static final e(LR0/s;LL1/B;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LR0/x;->a:LR0/x;

    .line 6
    .line 7
    invoke-virtual {v1}, LR0/x;->b()LR0/B;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0, v2}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LR0/s;->t()LR0/s;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1}, LR0/x;->E()LR0/B;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v2, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_7

    .line 39
    .line 40
    invoke-virtual {v0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1}, LR0/x;->a()LR0/B;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v2, v3}, LR0/m;->a(Landroidx/compose/ui/semantics/SemanticsConfiguration;LR0/B;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, LR0/b;

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    invoke-static {v2}, LL0/a;->c(LR0/b;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_1
    invoke-virtual {p0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1}, LR0/x;->F()LR0/B;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v2, v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    goto/16 :goto_3

    .line 79
    .line 80
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, LR0/s;->v()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v3, 0x0

    .line 94
    move v4, v3

    .line 95
    move v5, v4

    .line 96
    :goto_0
    if-ge v4, v2, :cond_4

    .line 97
    .line 98
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    check-cast v6, LR0/s;

    .line 103
    .line 104
    invoke-virtual {v6}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    sget-object v8, LR0/x;->a:LR0/x;

    .line 109
    .line 110
    invoke-virtual {v8}, LR0/x;->F()LR0/B;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v7, v8}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->e(LR0/B;)Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_3

    .line 119
    .line 120
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, LR0/s;->s()LK0/J;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6}, LK0/J;->B0()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {p0}, LR0/s;->s()LK0/J;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-virtual {v7}, LK0/J;->B0()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-ge v6, v7, :cond_3

    .line 140
    .line 141
    add-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_7

    .line 151
    .line 152
    invoke-static {v1}, LL0/a;->a(Ljava/util/List;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    move v6, v3

    .line 159
    goto :goto_1

    .line 160
    :cond_5
    move v6, v5

    .line 161
    :goto_1
    if-eqz v0, :cond_6

    .line 162
    .line 163
    move v8, v5

    .line 164
    goto :goto_2

    .line 165
    :cond_6
    move v8, v3

    .line 166
    :goto_2
    invoke-virtual {p0}, LR0/s;->p()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    sget-object v0, LR0/x;->a:LR0/x;

    .line 171
    .line 172
    invoke-virtual {v0}, LR0/x;->F()LR0/B;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    sget-object v1, LL0/a$a;->a:LL0/a$a;

    .line 177
    .line 178
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->p(LR0/B;Lie/a;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    check-cast p0, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v11

    .line 188
    const/4 v7, 0x1

    .line 189
    const/4 v9, 0x1

    .line 190
    const/4 v10, 0x0

    .line 191
    invoke-static/range {v6 .. v11}, LL1/B$g;->b(IIIIZZ)LL1/B$g;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    if-eqz p0, :cond_7

    .line 196
    .line 197
    invoke-virtual {p1, p0}, LL1/B;->C0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_7
    :goto_3
    return-void
.end method

.method private static final f(LR0/b;)LL1/B$f;
    .locals 2

    .line 1
    invoke-virtual {p0}, LR0/b;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LR0/b;->a()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, p0, v1, v1}, LL1/B$f;->b(IIZI)LL1/B$f;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
