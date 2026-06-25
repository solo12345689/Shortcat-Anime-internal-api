.class public final Lt/F;
.super Lt/o;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private f:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lt/o;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 3
    const-string v0, "Capacity must be a positive value."

    .line 4
    invoke-static {v0}, Lu/d;->a(Ljava/lang/String;)V

    .line 5
    :cond_1
    invoke-static {p1}, Lt/d0;->e(I)I

    move-result p1

    invoke-direct {p0, p1}, Lt/F;->n(I)V

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x6

    .line 1
    :cond_0
    invoke-direct {p0, p1}, Lt/F;-><init>(I)V

    return-void
.end method

.method private final j(I)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, -0x3361d2af    # -8.2930312E7f

    .line 8
    .line 9
    .line 10
    mul-int/2addr v1, v2

    .line 11
    shl-int/lit8 v2, v1, 0x10

    .line 12
    .line 13
    xor-int/2addr v1, v2

    .line 14
    ushr-int/lit8 v2, v1, 0x7

    .line 15
    .line 16
    and-int/lit8 v1, v1, 0x7f

    .line 17
    .line 18
    iget v3, v0, Lt/o;->d:I

    .line 19
    .line 20
    and-int v4, v2, v3

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    :goto_0
    iget-object v7, v0, Lt/o;->a:[J

    .line 24
    .line 25
    shr-int/lit8 v8, v4, 0x3

    .line 26
    .line 27
    and-int/lit8 v9, v4, 0x7

    .line 28
    .line 29
    shl-int/lit8 v9, v9, 0x3

    .line 30
    .line 31
    aget-wide v10, v7, v8

    .line 32
    .line 33
    ushr-long/2addr v10, v9

    .line 34
    const/4 v12, 0x1

    .line 35
    add-int/2addr v8, v12

    .line 36
    aget-wide v13, v7, v8

    .line 37
    .line 38
    rsub-int/lit8 v7, v9, 0x40

    .line 39
    .line 40
    shl-long v7, v13, v7

    .line 41
    .line 42
    int-to-long v13, v9

    .line 43
    neg-long v13, v13

    .line 44
    const/16 v9, 0x3f

    .line 45
    .line 46
    shr-long/2addr v13, v9

    .line 47
    and-long/2addr v7, v13

    .line 48
    or-long/2addr v7, v10

    .line 49
    int-to-long v9, v1

    .line 50
    const-wide v13, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long v15, v9, v13

    .line 56
    .line 57
    move/from16 v17, v6

    .line 58
    .line 59
    xor-long v5, v7, v15

    .line 60
    .line 61
    sub-long v13, v5, v13

    .line 62
    .line 63
    not-long v5, v5

    .line 64
    and-long/2addr v5, v13

    .line 65
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v5, v13

    .line 71
    :goto_1
    const-wide/16 v15, 0x0

    .line 72
    .line 73
    cmp-long v18, v5, v15

    .line 74
    .line 75
    if-eqz v18, :cond_1

    .line 76
    .line 77
    invoke-static {v5, v6}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    shr-int/lit8 v15, v15, 0x3

    .line 82
    .line 83
    add-int/2addr v15, v4

    .line 84
    and-int/2addr v15, v3

    .line 85
    iget-object v11, v0, Lt/o;->b:[I

    .line 86
    .line 87
    aget v11, v11, v15

    .line 88
    .line 89
    move/from16 v19, v12

    .line 90
    .line 91
    move/from16 v12, p1

    .line 92
    .line 93
    if-ne v11, v12, :cond_0

    .line 94
    .line 95
    return v15

    .line 96
    :cond_0
    const-wide/16 v15, 0x1

    .line 97
    .line 98
    sub-long v15, v5, v15

    .line 99
    .line 100
    and-long/2addr v5, v15

    .line 101
    move/from16 v12, v19

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move/from16 v19, v12

    .line 105
    .line 106
    move/from16 v12, p1

    .line 107
    .line 108
    not-long v5, v7

    .line 109
    const/4 v11, 0x6

    .line 110
    shl-long/2addr v5, v11

    .line 111
    and-long/2addr v5, v7

    .line 112
    and-long/2addr v5, v13

    .line 113
    cmp-long v5, v5, v15

    .line 114
    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    invoke-direct {v0, v2}, Lt/F;->k(I)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iget v3, v0, Lt/F;->f:I

    .line 122
    .line 123
    const-wide/16 v4, 0xff

    .line 124
    .line 125
    if-nez v3, :cond_3

    .line 126
    .line 127
    iget-object v3, v0, Lt/o;->a:[J

    .line 128
    .line 129
    shr-int/lit8 v6, v1, 0x3

    .line 130
    .line 131
    aget-wide v6, v3, v6

    .line 132
    .line 133
    and-int/lit8 v3, v1, 0x7

    .line 134
    .line 135
    shl-int/lit8 v3, v3, 0x3

    .line 136
    .line 137
    shr-long/2addr v6, v3

    .line 138
    and-long/2addr v6, v4

    .line 139
    const-wide/16 v11, 0xfe

    .line 140
    .line 141
    cmp-long v3, v6, v11

    .line 142
    .line 143
    if-nez v3, :cond_2

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_2
    invoke-virtual {v0}, Lt/F;->g()V

    .line 147
    .line 148
    .line 149
    invoke-direct {v0, v2}, Lt/F;->k(I)I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    :cond_3
    :goto_2
    iget v2, v0, Lt/o;->e:I

    .line 154
    .line 155
    add-int/lit8 v2, v2, 0x1

    .line 156
    .line 157
    iput v2, v0, Lt/o;->e:I

    .line 158
    .line 159
    iget v2, v0, Lt/F;->f:I

    .line 160
    .line 161
    iget-object v3, v0, Lt/o;->a:[J

    .line 162
    .line 163
    shr-int/lit8 v6, v1, 0x3

    .line 164
    .line 165
    aget-wide v7, v3, v6

    .line 166
    .line 167
    and-int/lit8 v11, v1, 0x7

    .line 168
    .line 169
    shl-int/lit8 v11, v11, 0x3

    .line 170
    .line 171
    shr-long v12, v7, v11

    .line 172
    .line 173
    and-long/2addr v12, v4

    .line 174
    const-wide/16 v14, 0x80

    .line 175
    .line 176
    cmp-long v12, v12, v14

    .line 177
    .line 178
    if-nez v12, :cond_4

    .line 179
    .line 180
    move/from16 v18, v19

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_4
    const/16 v18, 0x0

    .line 184
    .line 185
    :goto_3
    sub-int v2, v2, v18

    .line 186
    .line 187
    iput v2, v0, Lt/F;->f:I

    .line 188
    .line 189
    iget v2, v0, Lt/o;->d:I

    .line 190
    .line 191
    shl-long/2addr v4, v11

    .line 192
    not-long v4, v4

    .line 193
    and-long/2addr v4, v7

    .line 194
    shl-long v7, v9, v11

    .line 195
    .line 196
    or-long/2addr v4, v7

    .line 197
    aput-wide v4, v3, v6

    .line 198
    .line 199
    add-int/lit8 v6, v1, -0x7

    .line 200
    .line 201
    and-int/2addr v6, v2

    .line 202
    and-int/lit8 v2, v2, 0x7

    .line 203
    .line 204
    add-int/2addr v6, v2

    .line 205
    shr-int/lit8 v2, v6, 0x3

    .line 206
    .line 207
    aput-wide v4, v3, v2

    .line 208
    .line 209
    return v1

    .line 210
    :cond_5
    add-int/lit8 v6, v17, 0x8

    .line 211
    .line 212
    add-int/2addr v4, v6

    .line 213
    and-int/2addr v4, v3

    .line 214
    goto/16 :goto_0
.end method

.method private final k(I)I
    .locals 9

    .line 1
    iget v0, p0, Lt/o;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Lt/o;->a:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v4, v2, v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    shr-int/lit8 v1, v1, 0x3

    .line 52
    .line 53
    add-int/2addr p1, v1

    .line 54
    and-int/2addr p1, v0

    .line 55
    return p1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 57
    .line 58
    add-int/2addr p1, v1

    .line 59
    and-int/2addr p1, v0

    .line 60
    goto :goto_0
.end method

.method private final l()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt/o;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lt/d0;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lt/o;->e:I

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    iput v0, p0, Lt/F;->f:I

    .line 13
    .line 14
    return-void
.end method

.method private final m(I)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Lt/d0;->a:[J

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    add-int/lit8 v0, p1, 0xf

    .line 7
    .line 8
    and-int/lit8 v0, v0, -0x8

    .line 9
    .line 10
    shr-int/lit8 v0, v0, 0x3

    .line 11
    .line 12
    new-array v1, v0, [J

    .line 13
    .line 14
    const/4 v6, 0x6

    .line 15
    const/4 v7, 0x0

    .line 16
    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v1 .. v7}, LUd/n;->y([JJIIILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :goto_0
    iput-object v0, p0, Lt/o;->a:[J

    .line 28
    .line 29
    shr-int/lit8 v1, p1, 0x3

    .line 30
    .line 31
    and-int/lit8 p1, p1, 0x7

    .line 32
    .line 33
    shl-int/lit8 p1, p1, 0x3

    .line 34
    .line 35
    aget-wide v2, v0, v1

    .line 36
    .line 37
    const-wide/16 v4, 0xff

    .line 38
    .line 39
    shl-long/2addr v4, p1

    .line 40
    not-long v6, v4

    .line 41
    and-long/2addr v2, v6

    .line 42
    or-long/2addr v2, v4

    .line 43
    aput-wide v2, v0, v1

    .line 44
    .line 45
    invoke-direct {p0}, Lt/F;->l()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private final n(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    invoke-static {p1}, Lt/d0;->d(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput p1, p0, Lt/o;->d:I

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lt/F;->m(I)V

    .line 17
    .line 18
    .line 19
    new-array v0, p1, [I

    .line 20
    .line 21
    iput-object v0, p0, Lt/o;->b:[I

    .line 22
    .line 23
    new-array p1, p1, [Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p1, p0, Lt/o;->c:[Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 6

    .line 1
    iget v0, p0, Lt/o;->d:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lt/o;->e:I

    .line 8
    .line 9
    int-to-long v0, v0

    .line 10
    invoke-static {v0, v1}, LTd/F;->b(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, 0x20

    .line 15
    .line 16
    mul-long/2addr v0, v2

    .line 17
    invoke-static {v0, v1}, LTd/F;->b(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget v2, p0, Lt/o;->d:I

    .line 22
    .line 23
    int-to-long v2, v2

    .line 24
    invoke-static {v2, v3}, LTd/F;->b(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide/16 v4, 0x19

    .line 29
    .line 30
    mul-long/2addr v2, v4

    .line 31
    invoke-static {v2, v3}, LTd/F;->b(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    invoke-static {v0, v1, v2, v3}, Lt/C;->a(JJ)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-gtz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Lt/F;->i()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget v0, p0, Lt/o;->d:I

    .line 46
    .line 47
    invoke-static {v0}, Lt/d0;->c(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0, v0}, Lt/F;->r(I)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final h()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lt/o;->e:I

    .line 3
    .line 4
    iget-object v1, p0, Lt/o;->a:[J

    .line 5
    .line 6
    sget-object v2, Lt/d0;->a:[J

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v6, 0x6

    .line 11
    const/4 v7, 0x0

    .line 12
    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static/range {v1 .. v7}, LUd/n;->y([JJIIILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lt/o;->a:[J

    .line 23
    .line 24
    iget v2, p0, Lt/o;->d:I

    .line 25
    .line 26
    shr-int/lit8 v3, v2, 0x3

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x7

    .line 29
    .line 30
    shl-int/lit8 v2, v2, 0x3

    .line 31
    .line 32
    aget-wide v4, v1, v3

    .line 33
    .line 34
    const-wide/16 v6, 0xff

    .line 35
    .line 36
    shl-long/2addr v6, v2

    .line 37
    not-long v8, v6

    .line 38
    and-long/2addr v4, v8

    .line 39
    or-long/2addr v4, v6

    .line 40
    aput-wide v4, v1, v3

    .line 41
    .line 42
    :cond_0
    iget-object v1, p0, Lt/o;->c:[Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    iget v3, p0, Lt/o;->d:I

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3}, LUd/n;->w([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, Lt/F;->l()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final i()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lt/o;->a:[J

    .line 4
    .line 5
    iget v2, v0, Lt/o;->d:I

    .line 6
    .line 7
    iget-object v3, v0, Lt/o;->b:[I

    .line 8
    .line 9
    iget-object v4, v0, Lt/o;->c:[Ljava/lang/Object;

    .line 10
    .line 11
    add-int/lit8 v5, v2, 0x7

    .line 12
    .line 13
    shr-int/lit8 v5, v5, 0x3

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    move v7, v6

    .line 17
    :goto_0
    if-ge v7, v5, :cond_0

    .line 18
    .line 19
    aget-wide v8, v1, v7

    .line 20
    .line 21
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v8, v10

    .line 27
    not-long v10, v8

    .line 28
    const/4 v12, 0x7

    .line 29
    ushr-long/2addr v8, v12

    .line 30
    add-long/2addr v10, v8

    .line 31
    const-wide v8, -0x101010101010102L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v8, v10

    .line 37
    aput-wide v8, v1, v7

    .line 38
    .line 39
    add-int/lit8 v7, v7, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v1}, LUd/n;->e0([J)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    add-int/lit8 v7, v5, -0x1

    .line 47
    .line 48
    aget-wide v8, v1, v7

    .line 49
    .line 50
    const-wide v10, 0xffffffffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr v8, v10

    .line 56
    const-wide/high16 v12, -0x100000000000000L

    .line 57
    .line 58
    or-long/2addr v8, v12

    .line 59
    aput-wide v8, v1, v7

    .line 60
    .line 61
    aget-wide v7, v1, v6

    .line 62
    .line 63
    aput-wide v7, v1, v5

    .line 64
    .line 65
    move v5, v6

    .line 66
    :goto_1
    if-eq v5, v2, :cond_5

    .line 67
    .line 68
    shr-int/lit8 v7, v5, 0x3

    .line 69
    .line 70
    aget-wide v8, v1, v7

    .line 71
    .line 72
    and-int/lit8 v12, v5, 0x7

    .line 73
    .line 74
    shl-int/lit8 v12, v12, 0x3

    .line 75
    .line 76
    shr-long/2addr v8, v12

    .line 77
    const-wide/16 v13, 0xff

    .line 78
    .line 79
    and-long/2addr v8, v13

    .line 80
    const-wide/16 v15, 0x80

    .line 81
    .line 82
    cmp-long v17, v8, v15

    .line 83
    .line 84
    if-nez v17, :cond_1

    .line 85
    .line 86
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    const-wide/16 v17, 0xfe

    .line 90
    .line 91
    cmp-long v8, v8, v17

    .line 92
    .line 93
    if-eqz v8, :cond_2

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    aget v8, v3, v5

    .line 97
    .line 98
    invoke-static {v8}, Ljava/lang/Integer;->hashCode(I)I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    const v9, -0x3361d2af    # -8.2930312E7f

    .line 103
    .line 104
    .line 105
    mul-int/2addr v8, v9

    .line 106
    shl-int/lit8 v9, v8, 0x10

    .line 107
    .line 108
    xor-int/2addr v8, v9

    .line 109
    ushr-int/lit8 v9, v8, 0x7

    .line 110
    .line 111
    invoke-direct {v0, v9}, Lt/F;->k(I)I

    .line 112
    .line 113
    .line 114
    move-result v17

    .line 115
    and-int/2addr v9, v2

    .line 116
    sub-int v18, v17, v9

    .line 117
    .line 118
    and-int v18, v18, v2

    .line 119
    .line 120
    move/from16 v19, v6

    .line 121
    .line 122
    div-int/lit8 v6, v18, 0x8

    .line 123
    .line 124
    sub-int v9, v5, v9

    .line 125
    .line 126
    and-int/2addr v9, v2

    .line 127
    div-int/lit8 v9, v9, 0x8

    .line 128
    .line 129
    const-wide/high16 v20, -0x8000000000000000L

    .line 130
    .line 131
    if-ne v6, v9, :cond_3

    .line 132
    .line 133
    and-int/lit8 v6, v8, 0x7f

    .line 134
    .line 135
    int-to-long v8, v6

    .line 136
    aget-wide v15, v1, v7

    .line 137
    .line 138
    shl-long/2addr v13, v12

    .line 139
    not-long v13, v13

    .line 140
    and-long/2addr v13, v15

    .line 141
    shl-long/2addr v8, v12

    .line 142
    or-long/2addr v8, v13

    .line 143
    aput-wide v8, v1, v7

    .line 144
    .line 145
    invoke-static {v1}, LUd/n;->e0([J)I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    aget-wide v7, v1, v19

    .line 150
    .line 151
    and-long/2addr v7, v10

    .line 152
    or-long v7, v7, v20

    .line 153
    .line 154
    aput-wide v7, v1, v6

    .line 155
    .line 156
    add-int/lit8 v5, v5, 0x1

    .line 157
    .line 158
    move/from16 v6, v19

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    shr-int/lit8 v6, v17, 0x3

    .line 162
    .line 163
    aget-wide v22, v1, v6

    .line 164
    .line 165
    and-int/lit8 v9, v17, 0x7

    .line 166
    .line 167
    shl-int/lit8 v9, v9, 0x3

    .line 168
    .line 169
    shr-long v24, v22, v9

    .line 170
    .line 171
    and-long v24, v24, v13

    .line 172
    .line 173
    cmp-long v18, v24, v15

    .line 174
    .line 175
    if-nez v18, :cond_4

    .line 176
    .line 177
    and-int/lit8 v8, v8, 0x7f

    .line 178
    .line 179
    move-wide/from16 v24, v10

    .line 180
    .line 181
    int-to-long v10, v8

    .line 182
    move-wide/from16 v26, v13

    .line 183
    .line 184
    shl-long v13, v26, v9

    .line 185
    .line 186
    not-long v13, v13

    .line 187
    and-long v13, v22, v13

    .line 188
    .line 189
    shl-long v8, v10, v9

    .line 190
    .line 191
    or-long/2addr v8, v13

    .line 192
    aput-wide v8, v1, v6

    .line 193
    .line 194
    aget-wide v8, v1, v7

    .line 195
    .line 196
    shl-long v10, v26, v12

    .line 197
    .line 198
    not-long v10, v10

    .line 199
    and-long/2addr v8, v10

    .line 200
    shl-long v10, v15, v12

    .line 201
    .line 202
    or-long/2addr v8, v10

    .line 203
    aput-wide v8, v1, v7

    .line 204
    .line 205
    aget v6, v3, v5

    .line 206
    .line 207
    aput v6, v3, v17

    .line 208
    .line 209
    aput v19, v3, v5

    .line 210
    .line 211
    aget-object v6, v4, v5

    .line 212
    .line 213
    aput-object v6, v4, v17

    .line 214
    .line 215
    const/4 v6, 0x0

    .line 216
    aput-object v6, v4, v5

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_4
    move-wide/from16 v24, v10

    .line 220
    .line 221
    move-wide/from16 v26, v13

    .line 222
    .line 223
    and-int/lit8 v7, v8, 0x7f

    .line 224
    .line 225
    int-to-long v7, v7

    .line 226
    shl-long v10, v26, v9

    .line 227
    .line 228
    not-long v10, v10

    .line 229
    and-long v10, v22, v10

    .line 230
    .line 231
    shl-long/2addr v7, v9

    .line 232
    or-long/2addr v7, v10

    .line 233
    aput-wide v7, v1, v6

    .line 234
    .line 235
    aget v6, v3, v17

    .line 236
    .line 237
    aget v7, v3, v5

    .line 238
    .line 239
    aput v7, v3, v17

    .line 240
    .line 241
    aput v6, v3, v5

    .line 242
    .line 243
    aget-object v6, v4, v17

    .line 244
    .line 245
    aget-object v7, v4, v5

    .line 246
    .line 247
    aput-object v7, v4, v17

    .line 248
    .line 249
    aput-object v6, v4, v5

    .line 250
    .line 251
    add-int/lit8 v5, v5, -0x1

    .line 252
    .line 253
    :goto_3
    invoke-static {v1}, LUd/n;->e0([J)I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    aget-wide v7, v1, v19

    .line 258
    .line 259
    and-long v7, v7, v24

    .line 260
    .line 261
    or-long v7, v7, v20

    .line 262
    .line 263
    aput-wide v7, v1, v6

    .line 264
    .line 265
    add-int/lit8 v5, v5, 0x1

    .line 266
    .line 267
    move/from16 v6, v19

    .line 268
    .line 269
    move-wide/from16 v10, v24

    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :cond_5
    invoke-direct {v0}, Lt/F;->l()V

    .line 274
    .line 275
    .line 276
    return-void
.end method

.method public final o(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lt/F;->j(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lt/o;->c:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v2, v1, v0

    .line 8
    .line 9
    iget-object v3, p0, Lt/o;->b:[I

    .line 10
    .line 11
    aput p1, v3, v0

    .line 12
    .line 13
    aput-object p2, v1, v0

    .line 14
    .line 15
    return-object v2
.end method

.method public final p(I)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->hashCode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, -0x3361d2af    # -8.2930312E7f

    .line 6
    .line 7
    .line 8
    mul-int/2addr v0, v1

    .line 9
    shl-int/lit8 v1, v0, 0x10

    .line 10
    .line 11
    xor-int/2addr v0, v1

    .line 12
    and-int/lit8 v1, v0, 0x7f

    .line 13
    .line 14
    iget v2, p0, Lt/o;->d:I

    .line 15
    .line 16
    ushr-int/lit8 v0, v0, 0x7

    .line 17
    .line 18
    and-int/2addr v0, v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    iget-object v4, p0, Lt/o;->a:[J

    .line 21
    .line 22
    shr-int/lit8 v5, v0, 0x3

    .line 23
    .line 24
    and-int/lit8 v6, v0, 0x7

    .line 25
    .line 26
    shl-int/lit8 v6, v6, 0x3

    .line 27
    .line 28
    aget-wide v7, v4, v5

    .line 29
    .line 30
    ushr-long/2addr v7, v6

    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    aget-wide v9, v4, v5

    .line 34
    .line 35
    rsub-int/lit8 v4, v6, 0x40

    .line 36
    .line 37
    shl-long v4, v9, v4

    .line 38
    .line 39
    int-to-long v9, v6

    .line 40
    neg-long v9, v9

    .line 41
    const/16 v6, 0x3f

    .line 42
    .line 43
    shr-long/2addr v9, v6

    .line 44
    and-long/2addr v4, v9

    .line 45
    or-long/2addr v4, v7

    .line 46
    int-to-long v6, v1

    .line 47
    const-wide v8, 0x101010101010101L

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    mul-long/2addr v6, v8

    .line 53
    xor-long/2addr v6, v4

    .line 54
    sub-long v8, v6, v8

    .line 55
    .line 56
    not-long v6, v6

    .line 57
    and-long/2addr v6, v8

    .line 58
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v6, v8

    .line 64
    :goto_1
    const-wide/16 v10, 0x0

    .line 65
    .line 66
    cmp-long v12, v6, v10

    .line 67
    .line 68
    if-eqz v12, :cond_1

    .line 69
    .line 70
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    shr-int/lit8 v10, v10, 0x3

    .line 75
    .line 76
    add-int/2addr v10, v0

    .line 77
    and-int/2addr v10, v2

    .line 78
    iget-object v11, p0, Lt/o;->b:[I

    .line 79
    .line 80
    aget v11, v11, v10

    .line 81
    .line 82
    if-ne v11, p1, :cond_0

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_0
    const-wide/16 v10, 0x1

    .line 86
    .line 87
    sub-long v10, v6, v10

    .line 88
    .line 89
    and-long/2addr v6, v10

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    not-long v6, v4

    .line 92
    const/4 v12, 0x6

    .line 93
    shl-long/2addr v6, v12

    .line 94
    and-long/2addr v4, v6

    .line 95
    and-long/2addr v4, v8

    .line 96
    cmp-long v4, v4, v10

    .line 97
    .line 98
    if-eqz v4, :cond_3

    .line 99
    .line 100
    const/4 v10, -0x1

    .line 101
    :goto_2
    if-ltz v10, :cond_2

    .line 102
    .line 103
    invoke-virtual {p0, v10}, Lt/F;->q(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_2
    const/4 p1, 0x0

    .line 109
    return-object p1

    .line 110
    :cond_3
    add-int/lit8 v3, v3, 0x8

    .line 111
    .line 112
    add-int/2addr v0, v3

    .line 113
    and-int/2addr v0, v2

    .line 114
    goto :goto_0
.end method

.method public final q(I)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lt/o;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lt/o;->e:I

    .line 6
    .line 7
    iget-object v0, p0, Lt/o;->a:[J

    .line 8
    .line 9
    iget v1, p0, Lt/o;->d:I

    .line 10
    .line 11
    shr-int/lit8 v2, p1, 0x3

    .line 12
    .line 13
    and-int/lit8 v3, p1, 0x7

    .line 14
    .line 15
    shl-int/lit8 v3, v3, 0x3

    .line 16
    .line 17
    aget-wide v4, v0, v2

    .line 18
    .line 19
    const-wide/16 v6, 0xff

    .line 20
    .line 21
    shl-long/2addr v6, v3

    .line 22
    not-long v6, v6

    .line 23
    and-long/2addr v4, v6

    .line 24
    const-wide/16 v6, 0xfe

    .line 25
    .line 26
    shl-long/2addr v6, v3

    .line 27
    or-long v3, v4, v6

    .line 28
    .line 29
    aput-wide v3, v0, v2

    .line 30
    .line 31
    add-int/lit8 v2, p1, -0x7

    .line 32
    .line 33
    and-int/2addr v2, v1

    .line 34
    and-int/lit8 v1, v1, 0x7

    .line 35
    .line 36
    add-int/2addr v2, v1

    .line 37
    shr-int/lit8 v1, v2, 0x3

    .line 38
    .line 39
    aput-wide v3, v0, v1

    .line 40
    .line 41
    iget-object v0, p0, Lt/o;->c:[Ljava/lang/Object;

    .line 42
    .line 43
    aget-object v1, v0, p1

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    aput-object v2, v0, p1

    .line 47
    .line 48
    return-object v1
.end method

.method public final r(I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lt/o;->a:[J

    .line 4
    .line 5
    iget-object v2, v0, Lt/o;->b:[I

    .line 6
    .line 7
    iget-object v3, v0, Lt/o;->c:[Ljava/lang/Object;

    .line 8
    .line 9
    iget v4, v0, Lt/o;->d:I

    .line 10
    .line 11
    invoke-direct/range {p0 .. p1}, Lt/F;->n(I)V

    .line 12
    .line 13
    .line 14
    iget-object v5, v0, Lt/o;->a:[J

    .line 15
    .line 16
    iget-object v6, v0, Lt/o;->b:[I

    .line 17
    .line 18
    iget-object v7, v0, Lt/o;->c:[Ljava/lang/Object;

    .line 19
    .line 20
    iget v8, v0, Lt/o;->d:I

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    :goto_0
    if-ge v9, v4, :cond_1

    .line 24
    .line 25
    shr-int/lit8 v10, v9, 0x3

    .line 26
    .line 27
    aget-wide v10, v1, v10

    .line 28
    .line 29
    and-int/lit8 v12, v9, 0x7

    .line 30
    .line 31
    shl-int/lit8 v12, v12, 0x3

    .line 32
    .line 33
    shr-long/2addr v10, v12

    .line 34
    const-wide/16 v12, 0xff

    .line 35
    .line 36
    and-long/2addr v10, v12

    .line 37
    const-wide/16 v14, 0x80

    .line 38
    .line 39
    cmp-long v10, v10, v14

    .line 40
    .line 41
    if-gez v10, :cond_0

    .line 42
    .line 43
    aget v10, v2, v9

    .line 44
    .line 45
    invoke-static {v10}, Ljava/lang/Integer;->hashCode(I)I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    const v14, -0x3361d2af    # -8.2930312E7f

    .line 50
    .line 51
    .line 52
    mul-int/2addr v11, v14

    .line 53
    shl-int/lit8 v14, v11, 0x10

    .line 54
    .line 55
    xor-int/2addr v11, v14

    .line 56
    ushr-int/lit8 v14, v11, 0x7

    .line 57
    .line 58
    invoke-direct {v0, v14}, Lt/F;->k(I)I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    and-int/lit8 v11, v11, 0x7f

    .line 63
    .line 64
    move-wide v15, v12

    .line 65
    int-to-long v12, v11

    .line 66
    shr-int/lit8 v11, v14, 0x3

    .line 67
    .line 68
    and-int/lit8 v17, v14, 0x7

    .line 69
    .line 70
    shl-int/lit8 v17, v17, 0x3

    .line 71
    .line 72
    aget-wide v18, v5, v11

    .line 73
    .line 74
    move-object/from16 v20, v1

    .line 75
    .line 76
    shl-long v0, v15, v17

    .line 77
    .line 78
    not-long v0, v0

    .line 79
    and-long v0, v18, v0

    .line 80
    .line 81
    shl-long v12, v12, v17

    .line 82
    .line 83
    or-long/2addr v0, v12

    .line 84
    aput-wide v0, v5, v11

    .line 85
    .line 86
    add-int/lit8 v11, v14, -0x7

    .line 87
    .line 88
    and-int/2addr v11, v8

    .line 89
    and-int/lit8 v12, v8, 0x7

    .line 90
    .line 91
    add-int/2addr v11, v12

    .line 92
    shr-int/lit8 v11, v11, 0x3

    .line 93
    .line 94
    aput-wide v0, v5, v11

    .line 95
    .line 96
    aput v10, v6, v14

    .line 97
    .line 98
    aget-object v0, v3, v9

    .line 99
    .line 100
    aput-object v0, v7, v14

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_0
    move-object/from16 v20, v1

    .line 104
    .line 105
    :goto_1
    add-int/lit8 v9, v9, 0x1

    .line 106
    .line 107
    move-object/from16 v0, p0

    .line 108
    .line 109
    move-object/from16 v1, v20

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    return-void
.end method

.method public final s(ILjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lt/F;->j(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lt/o;->b:[I

    .line 6
    .line 7
    aput p1, v1, v0

    .line 8
    .line 9
    iget-object p1, p0, Lt/o;->c:[Ljava/lang/Object;

    .line 10
    .line 11
    aput-object p2, p1, v0

    .line 12
    .line 13
    return-void
.end method
