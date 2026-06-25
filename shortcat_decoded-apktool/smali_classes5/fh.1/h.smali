.class Lfh/h;
.super Ljava/lang/Object;


# instance fields
.field private final a:I

.field private b:[I

.field private final c:Lfh/a;

.field private final d:Lfh/n;


# direct methods
.method public constructor <init>(Lfh/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x100

    .line 5
    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    iput-object v0, p0, Lfh/h;->b:[I

    .line 9
    .line 10
    iput-object p1, p0, Lfh/h;->c:Lfh/a;

    .line 11
    .line 12
    invoke-virtual {p1}, Lfh/a;->a()Lfh/n;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lfh/h;->d:Lfh/n;

    .line 17
    .line 18
    iget p1, p1, Lfh/n;->a:I

    .line 19
    .line 20
    add-int/lit16 v0, p1, 0x2ff

    .line 21
    .line 22
    div-int/2addr v0, p1

    .line 23
    iput v0, p0, Lfh/h;->a:I

    .line 24
    .line 25
    return-void
.end method

.method private static q(Lfh/h;II[BII)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    :goto_0
    if-ge v0, p2, :cond_4

    .line 4
    .line 5
    if-ge v1, p4, :cond_4

    .line 6
    .line 7
    aget-byte v2, p3, v1

    .line 8
    .line 9
    and-int/lit8 v3, v2, 0xf

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    and-int/lit16 v2, v2, 0xff

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    shr-int/2addr v2, v4

    .line 17
    const/4 v5, 0x2

    .line 18
    if-ne p5, v5, :cond_2

    .line 19
    .line 20
    const/16 v4, 0xf

    .line 21
    .line 22
    if-ge v3, v4, :cond_1

    .line 23
    .line 24
    mul-int/lit16 v6, v3, 0xcd

    .line 25
    .line 26
    shr-int/lit8 v6, v6, 0xa

    .line 27
    .line 28
    mul-int/lit8 v6, v6, 0x5

    .line 29
    .line 30
    sub-int/2addr v3, v6

    .line 31
    add-int v6, p1, v0

    .line 32
    .line 33
    rsub-int/lit8 v3, v3, 0x2

    .line 34
    .line 35
    invoke-virtual {p0, v6, v3}, Lfh/h;->s(II)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    :cond_1
    if-ge v2, v4, :cond_0

    .line 41
    .line 42
    if-ge v0, p2, :cond_0

    .line 43
    .line 44
    mul-int/lit16 v3, v2, 0xcd

    .line 45
    .line 46
    shr-int/lit8 v3, v3, 0xa

    .line 47
    .line 48
    mul-int/lit8 v3, v3, 0x5

    .line 49
    .line 50
    sub-int/2addr v2, v3

    .line 51
    add-int v3, p1, v0

    .line 52
    .line 53
    sub-int/2addr v5, v2

    .line 54
    invoke-virtual {p0, v3, v5}, Lfh/h;->s(II)V

    .line 55
    .line 56
    .line 57
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    if-ne p5, v4, :cond_0

    .line 61
    .line 62
    const/16 v4, 0x9

    .line 63
    .line 64
    if-ge v3, v4, :cond_3

    .line 65
    .line 66
    add-int v5, p1, v0

    .line 67
    .line 68
    rsub-int/lit8 v3, v3, 0x4

    .line 69
    .line 70
    invoke-virtual {p0, v5, v3}, Lfh/h;->s(II)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    :cond_3
    if-ge v2, v4, :cond_0

    .line 76
    .line 77
    if-ge v0, p2, :cond_0

    .line 78
    .line 79
    add-int v3, p1, v0

    .line 80
    .line 81
    rsub-int/lit8 v2, v2, 0x4

    .line 82
    .line 83
    invoke-virtual {p0, v3, v2}, Lfh/h;->s(II)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    return v0
.end method

.method private static r(Lfh/h;II[BI)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    :goto_0
    if-ge v0, p2, :cond_1

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    if-gt v2, p4, :cond_1

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    aget-byte v3, p3, v1

    .line 12
    .line 13
    and-int/lit16 v3, v3, 0xff

    .line 14
    .line 15
    add-int/lit8 v4, v1, 0x2

    .line 16
    .line 17
    aget-byte v2, p3, v2

    .line 18
    .line 19
    and-int/lit16 v2, v2, 0xff

    .line 20
    .line 21
    shl-int/lit8 v2, v2, 0x8

    .line 22
    .line 23
    or-int/2addr v2, v3

    .line 24
    add-int/lit8 v1, v1, 0x3

    .line 25
    .line 26
    aget-byte v3, p3, v4

    .line 27
    .line 28
    and-int/lit16 v3, v3, 0xff

    .line 29
    .line 30
    shl-int/lit8 v3, v3, 0x10

    .line 31
    .line 32
    or-int/2addr v2, v3

    .line 33
    const v3, 0x7fffff

    .line 34
    .line 35
    .line 36
    and-int/2addr v2, v3

    .line 37
    const v3, 0x7fe001

    .line 38
    .line 39
    .line 40
    if-ge v2, v3, :cond_0

    .line 41
    .line 42
    add-int v3, p1, v0

    .line 43
    .line 44
    invoke-virtual {p0, v3, v2}, Lfh/h;->s(II)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return v0
.end method


# virtual methods
.method public a(Lfh/h;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x100

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lfh/h;->d(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1, v0}, Lfh/h;->d(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-int/2addr v1, v2

    .line 15
    invoke-virtual {p0, v0, v1}, Lfh/h;->s(II)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x100

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lfh/h;->d(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lfh/l;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, v0, v1}, Lfh/h;->s(II)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method c(Lfh/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lfh/h;->b:[I

    .line 2
    .line 3
    iget-object p1, p1, Lfh/h;->b:[I

    .line 4
    .line 5
    const/16 v1, 0x100

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/h;->b:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public e()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/h;->b:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public f()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfh/h;->e()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lfh/f;->a([I)[I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lfh/h;->t([I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public g(Lfh/j;Lfh/j;)V
    .locals 4

    .line 1
    new-instance v0, Lfh/h;

    .line 2
    .line 3
    iget-object v1, p0, Lfh/h;->c:Lfh/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfh/h;-><init>(Lfh/a;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Lfh/j;->b(I)Lfh/h;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p2, v1}, Lfh/j;->b(I)Lfh/h;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v2, v1}, Lfh/h;->h(Lfh/h;Lfh/h;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    :goto_0
    iget-object v2, p0, Lfh/h;->c:Lfh/a;

    .line 22
    .line 23
    invoke-virtual {v2}, Lfh/a;->g()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ge v1, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lfh/j;->b(I)Lfh/h;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p2, v1}, Lfh/j;->b(I)Lfh/h;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0, v2, v3}, Lfh/h;->h(Lfh/h;Lfh/h;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lfh/h;->a(Lfh/h;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void
.end method

.method public h(Lfh/h;Lfh/h;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x100

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lfh/h;->d(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-long v1, v1

    .line 11
    invoke-virtual {p2, v0}, Lfh/h;->d(I)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    int-to-long v3, v3

    .line 16
    mul-long/2addr v1, v3

    .line 17
    invoke-static {v1, v2}, Lfh/l;->b(J)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0, v0, v1}, Lfh/h;->s(II)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public i([BI)[B
    .locals 13

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    iget-object v1, p0, Lfh/h;->c:Lfh/a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lfh/a;->e()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x4

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x2

    .line 15
    if-ne v1, v5, :cond_0

    .line 16
    .line 17
    move v1, v3

    .line 18
    :goto_0
    const/16 v6, 0x20

    .line 19
    .line 20
    if-ge v1, v6, :cond_1

    .line 21
    .line 22
    iget-object v6, p0, Lfh/h;->c:Lfh/a;

    .line 23
    .line 24
    invoke-virtual {v6}, Lfh/a;->e()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    mul-int/lit8 v7, v1, 0x8

    .line 29
    .line 30
    invoke-virtual {p0, v7}, Lfh/h;->d(I)I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    sub-int/2addr v6, v8

    .line 35
    int-to-byte v6, v6

    .line 36
    aput-byte v6, v0, v3

    .line 37
    .line 38
    iget-object v6, p0, Lfh/h;->c:Lfh/a;

    .line 39
    .line 40
    invoke-virtual {v6}, Lfh/a;->e()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    add-int/lit8 v8, v7, 0x1

    .line 45
    .line 46
    invoke-virtual {p0, v8}, Lfh/h;->d(I)I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    sub-int/2addr v6, v8

    .line 51
    int-to-byte v6, v6

    .line 52
    aput-byte v6, v0, v4

    .line 53
    .line 54
    iget-object v6, p0, Lfh/h;->c:Lfh/a;

    .line 55
    .line 56
    invoke-virtual {v6}, Lfh/a;->e()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    add-int/lit8 v8, v7, 0x2

    .line 61
    .line 62
    invoke-virtual {p0, v8}, Lfh/h;->d(I)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    sub-int/2addr v6, v8

    .line 67
    int-to-byte v6, v6

    .line 68
    aput-byte v6, v0, v5

    .line 69
    .line 70
    iget-object v6, p0, Lfh/h;->c:Lfh/a;

    .line 71
    .line 72
    invoke-virtual {v6}, Lfh/a;->e()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    add-int/lit8 v8, v7, 0x3

    .line 77
    .line 78
    invoke-virtual {p0, v8}, Lfh/h;->d(I)I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    sub-int/2addr v6, v8

    .line 83
    int-to-byte v6, v6

    .line 84
    const/4 v8, 0x3

    .line 85
    aput-byte v6, v0, v8

    .line 86
    .line 87
    iget-object v6, p0, Lfh/h;->c:Lfh/a;

    .line 88
    .line 89
    invoke-virtual {v6}, Lfh/a;->e()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    add-int/lit8 v9, v7, 0x4

    .line 94
    .line 95
    invoke-virtual {p0, v9}, Lfh/h;->d(I)I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    sub-int/2addr v6, v9

    .line 100
    int-to-byte v6, v6

    .line 101
    aput-byte v6, v0, v2

    .line 102
    .line 103
    iget-object v6, p0, Lfh/h;->c:Lfh/a;

    .line 104
    .line 105
    invoke-virtual {v6}, Lfh/a;->e()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    add-int/lit8 v9, v7, 0x5

    .line 110
    .line 111
    invoke-virtual {p0, v9}, Lfh/h;->d(I)I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    sub-int/2addr v6, v9

    .line 116
    int-to-byte v6, v6

    .line 117
    const/4 v9, 0x5

    .line 118
    aput-byte v6, v0, v9

    .line 119
    .line 120
    iget-object v6, p0, Lfh/h;->c:Lfh/a;

    .line 121
    .line 122
    invoke-virtual {v6}, Lfh/a;->e()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    add-int/lit8 v10, v7, 0x6

    .line 127
    .line 128
    invoke-virtual {p0, v10}, Lfh/h;->d(I)I

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    sub-int/2addr v6, v10

    .line 133
    int-to-byte v6, v6

    .line 134
    const/4 v10, 0x6

    .line 135
    aput-byte v6, v0, v10

    .line 136
    .line 137
    iget-object v6, p0, Lfh/h;->c:Lfh/a;

    .line 138
    .line 139
    invoke-virtual {v6}, Lfh/a;->e()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    const/4 v11, 0x7

    .line 144
    add-int/2addr v7, v11

    .line 145
    invoke-virtual {p0, v7}, Lfh/h;->d(I)I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    sub-int/2addr v6, v7

    .line 150
    int-to-byte v6, v6

    .line 151
    aput-byte v6, v0, v11

    .line 152
    .line 153
    mul-int/lit8 v6, v1, 0x3

    .line 154
    .line 155
    add-int/2addr v6, p2

    .line 156
    aget-byte v7, v0, v3

    .line 157
    .line 158
    aget-byte v12, v0, v4

    .line 159
    .line 160
    shl-int/2addr v12, v8

    .line 161
    or-int/2addr v7, v12

    .line 162
    aget-byte v12, v0, v5

    .line 163
    .line 164
    shl-int/2addr v12, v10

    .line 165
    or-int/2addr v7, v12

    .line 166
    int-to-byte v7, v7

    .line 167
    aput-byte v7, p1, v6

    .line 168
    .line 169
    add-int/lit8 v7, v6, 0x1

    .line 170
    .line 171
    aget-byte v12, v0, v5

    .line 172
    .line 173
    shr-int/2addr v12, v5

    .line 174
    aget-byte v8, v0, v8

    .line 175
    .line 176
    shl-int/2addr v8, v4

    .line 177
    or-int/2addr v8, v12

    .line 178
    aget-byte v12, v0, v2

    .line 179
    .line 180
    shl-int/2addr v12, v2

    .line 181
    or-int/2addr v8, v12

    .line 182
    aget-byte v12, v0, v9

    .line 183
    .line 184
    shl-int/2addr v12, v11

    .line 185
    or-int/2addr v8, v12

    .line 186
    int-to-byte v8, v8

    .line 187
    aput-byte v8, p1, v7

    .line 188
    .line 189
    add-int/2addr v6, v5

    .line 190
    aget-byte v7, v0, v9

    .line 191
    .line 192
    shr-int/2addr v7, v4

    .line 193
    aget-byte v8, v0, v10

    .line 194
    .line 195
    shl-int/2addr v8, v5

    .line 196
    or-int/2addr v7, v8

    .line 197
    aget-byte v8, v0, v11

    .line 198
    .line 199
    shl-int/2addr v8, v9

    .line 200
    or-int/2addr v7, v8

    .line 201
    int-to-byte v7, v7

    .line 202
    aput-byte v7, p1, v6

    .line 203
    .line 204
    add-int/lit8 v1, v1, 0x1

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_0
    iget-object v1, p0, Lfh/h;->c:Lfh/a;

    .line 209
    .line 210
    invoke-virtual {v1}, Lfh/a;->e()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-ne v1, v2, :cond_2

    .line 215
    .line 216
    move v1, v3

    .line 217
    :goto_1
    const/16 v5, 0x80

    .line 218
    .line 219
    if-ge v1, v5, :cond_1

    .line 220
    .line 221
    iget-object v5, p0, Lfh/h;->c:Lfh/a;

    .line 222
    .line 223
    invoke-virtual {v5}, Lfh/a;->e()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    mul-int/lit8 v6, v1, 0x2

    .line 228
    .line 229
    invoke-virtual {p0, v6}, Lfh/h;->d(I)I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    sub-int/2addr v5, v7

    .line 234
    int-to-byte v5, v5

    .line 235
    aput-byte v5, v0, v3

    .line 236
    .line 237
    iget-object v5, p0, Lfh/h;->c:Lfh/a;

    .line 238
    .line 239
    invoke-virtual {v5}, Lfh/a;->e()I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    add-int/2addr v6, v4

    .line 244
    invoke-virtual {p0, v6}, Lfh/h;->d(I)I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    sub-int/2addr v5, v6

    .line 249
    int-to-byte v5, v5

    .line 250
    aput-byte v5, v0, v4

    .line 251
    .line 252
    add-int v6, p2, v1

    .line 253
    .line 254
    aget-byte v7, v0, v3

    .line 255
    .line 256
    shl-int/2addr v5, v2

    .line 257
    or-int/2addr v5, v7

    .line 258
    int-to-byte v5, v5

    .line 259
    aput-byte v5, p1, v6

    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x1

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_1
    return-object p1

    .line 265
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 266
    .line 267
    const-string p2, "Eta needs to be 2 or 4!"

    .line 268
    .line 269
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw p1
.end method

.method public j([BI)V
    .locals 13

    .line 1
    iget-object v0, p0, Lfh/h;->c:Lfh/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfh/a;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lfh/h;->c:Lfh/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lfh/a;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x4

    .line 15
    const/4 v4, 0x2

    .line 16
    if-ne v1, v4, :cond_0

    .line 17
    .line 18
    :goto_0
    const/16 v1, 0x20

    .line 19
    .line 20
    if-ge v2, v1, :cond_1

    .line 21
    .line 22
    mul-int/lit8 v1, v2, 0x3

    .line 23
    .line 24
    add-int/2addr v1, p2

    .line 25
    mul-int/lit8 v5, v2, 0x8

    .line 26
    .line 27
    aget-byte v6, p1, v1

    .line 28
    .line 29
    and-int/lit8 v6, v6, 0x7

    .line 30
    .line 31
    invoke-virtual {p0, v5, v6}, Lfh/h;->s(II)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v6, v5, 0x1

    .line 35
    .line 36
    aget-byte v7, p1, v1

    .line 37
    .line 38
    and-int/lit16 v7, v7, 0xff

    .line 39
    .line 40
    shr-int/lit8 v7, v7, 0x3

    .line 41
    .line 42
    and-int/lit8 v7, v7, 0x7

    .line 43
    .line 44
    invoke-virtual {p0, v6, v7}, Lfh/h;->s(II)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v7, v5, 0x2

    .line 48
    .line 49
    aget-byte v8, p1, v1

    .line 50
    .line 51
    and-int/lit16 v8, v8, 0xff

    .line 52
    .line 53
    shr-int/lit8 v8, v8, 0x6

    .line 54
    .line 55
    add-int/lit8 v9, v1, 0x1

    .line 56
    .line 57
    aget-byte v10, p1, v9

    .line 58
    .line 59
    and-int/lit16 v10, v10, 0xff

    .line 60
    .line 61
    shl-int/2addr v10, v4

    .line 62
    and-int/lit8 v10, v10, 0x7

    .line 63
    .line 64
    or-int/2addr v8, v10

    .line 65
    invoke-virtual {p0, v7, v8}, Lfh/h;->s(II)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v8, v5, 0x3

    .line 69
    .line 70
    aget-byte v10, p1, v9

    .line 71
    .line 72
    and-int/lit16 v10, v10, 0xff

    .line 73
    .line 74
    shr-int/lit8 v10, v10, 0x1

    .line 75
    .line 76
    and-int/lit8 v10, v10, 0x7

    .line 77
    .line 78
    invoke-virtual {p0, v8, v10}, Lfh/h;->s(II)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v10, v5, 0x4

    .line 82
    .line 83
    aget-byte v11, p1, v9

    .line 84
    .line 85
    and-int/lit16 v11, v11, 0xff

    .line 86
    .line 87
    shr-int/2addr v11, v3

    .line 88
    and-int/lit8 v11, v11, 0x7

    .line 89
    .line 90
    invoke-virtual {p0, v10, v11}, Lfh/h;->s(II)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v11, v5, 0x5

    .line 94
    .line 95
    aget-byte v9, p1, v9

    .line 96
    .line 97
    and-int/lit16 v9, v9, 0xff

    .line 98
    .line 99
    shr-int/lit8 v9, v9, 0x7

    .line 100
    .line 101
    add-int/2addr v1, v4

    .line 102
    aget-byte v12, p1, v1

    .line 103
    .line 104
    and-int/lit16 v12, v12, 0xff

    .line 105
    .line 106
    shl-int/lit8 v12, v12, 0x1

    .line 107
    .line 108
    and-int/lit8 v12, v12, 0x7

    .line 109
    .line 110
    or-int/2addr v9, v12

    .line 111
    invoke-virtual {p0, v11, v9}, Lfh/h;->s(II)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v9, v5, 0x6

    .line 115
    .line 116
    aget-byte v12, p1, v1

    .line 117
    .line 118
    and-int/lit16 v12, v12, 0xff

    .line 119
    .line 120
    shr-int/2addr v12, v4

    .line 121
    and-int/lit8 v12, v12, 0x7

    .line 122
    .line 123
    invoke-virtual {p0, v9, v12}, Lfh/h;->s(II)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v12, v5, 0x7

    .line 127
    .line 128
    aget-byte v1, p1, v1

    .line 129
    .line 130
    and-int/lit16 v1, v1, 0xff

    .line 131
    .line 132
    shr-int/lit8 v1, v1, 0x5

    .line 133
    .line 134
    and-int/lit8 v1, v1, 0x7

    .line 135
    .line 136
    invoke-virtual {p0, v12, v1}, Lfh/h;->s(II)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v5}, Lfh/h;->d(I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    sub-int v1, v0, v1

    .line 144
    .line 145
    invoke-virtual {p0, v5, v1}, Lfh/h;->s(II)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v6}, Lfh/h;->d(I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    sub-int v1, v0, v1

    .line 153
    .line 154
    invoke-virtual {p0, v6, v1}, Lfh/h;->s(II)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v7}, Lfh/h;->d(I)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    sub-int v1, v0, v1

    .line 162
    .line 163
    invoke-virtual {p0, v7, v1}, Lfh/h;->s(II)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v8}, Lfh/h;->d(I)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    sub-int v1, v0, v1

    .line 171
    .line 172
    invoke-virtual {p0, v8, v1}, Lfh/h;->s(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v10}, Lfh/h;->d(I)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    sub-int v1, v0, v1

    .line 180
    .line 181
    invoke-virtual {p0, v10, v1}, Lfh/h;->s(II)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v11}, Lfh/h;->d(I)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    sub-int v1, v0, v1

    .line 189
    .line 190
    invoke-virtual {p0, v11, v1}, Lfh/h;->s(II)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v9}, Lfh/h;->d(I)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    sub-int v1, v0, v1

    .line 198
    .line 199
    invoke-virtual {p0, v9, v1}, Lfh/h;->s(II)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v12}, Lfh/h;->d(I)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    sub-int v1, v0, v1

    .line 207
    .line 208
    invoke-virtual {p0, v12, v1}, Lfh/h;->s(II)V

    .line 209
    .line 210
    .line 211
    add-int/lit8 v2, v2, 0x1

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_0
    iget-object v1, p0, Lfh/h;->c:Lfh/a;

    .line 216
    .line 217
    invoke-virtual {v1}, Lfh/a;->e()I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-ne v1, v3, :cond_1

    .line 222
    .line 223
    :goto_1
    const/16 v1, 0x80

    .line 224
    .line 225
    if-ge v2, v1, :cond_1

    .line 226
    .line 227
    mul-int/lit8 v1, v2, 0x2

    .line 228
    .line 229
    add-int v4, p2, v2

    .line 230
    .line 231
    aget-byte v5, p1, v4

    .line 232
    .line 233
    and-int/lit8 v5, v5, 0xf

    .line 234
    .line 235
    invoke-virtual {p0, v1, v5}, Lfh/h;->s(II)V

    .line 236
    .line 237
    .line 238
    add-int/lit8 v5, v1, 0x1

    .line 239
    .line 240
    aget-byte v4, p1, v4

    .line 241
    .line 242
    and-int/lit16 v4, v4, 0xff

    .line 243
    .line 244
    shr-int/2addr v4, v3

    .line 245
    invoke-virtual {p0, v5, v4}, Lfh/h;->s(II)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, v1}, Lfh/h;->d(I)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    sub-int v4, v0, v4

    .line 253
    .line 254
    invoke-virtual {p0, v1, v4}, Lfh/h;->s(II)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0, v5}, Lfh/h;->d(I)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    sub-int v1, v0, v1

    .line 262
    .line 263
    invoke-virtual {p0, v5, v1}, Lfh/h;->s(II)V

    .line 264
    .line 265
    .line 266
    add-int/lit8 v2, v2, 0x1

    .line 267
    .line 268
    goto :goto_1

    .line 269
    :cond_1
    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/h;->b:[I

    .line 2
    .line 3
    invoke-static {v0}, Lfh/f;->b([I)[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lfh/h;->t([I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public l([BI)[B
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/16 v2, 0x20

    .line 4
    .line 5
    if-ge v1, v2, :cond_0

    .line 6
    .line 7
    mul-int/lit8 v2, v1, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Lfh/h;->d(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    rsub-int v4, v3, 0x1000

    .line 14
    .line 15
    add-int/lit8 v3, v2, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, v3}, Lfh/h;->d(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    rsub-int v5, v3, 0x1000

    .line 22
    .line 23
    add-int/lit8 v3, v2, 0x2

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Lfh/h;->d(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    rsub-int v6, v3, 0x1000

    .line 30
    .line 31
    add-int/lit8 v3, v2, 0x3

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Lfh/h;->d(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    rsub-int v7, v3, 0x1000

    .line 38
    .line 39
    add-int/lit8 v3, v2, 0x4

    .line 40
    .line 41
    invoke-virtual {p0, v3}, Lfh/h;->d(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    rsub-int v8, v3, 0x1000

    .line 46
    .line 47
    add-int/lit8 v3, v2, 0x5

    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lfh/h;->d(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    rsub-int v9, v3, 0x1000

    .line 54
    .line 55
    add-int/lit8 v3, v2, 0x6

    .line 56
    .line 57
    invoke-virtual {p0, v3}, Lfh/h;->d(I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    rsub-int v10, v3, 0x1000

    .line 62
    .line 63
    const/4 v3, 0x7

    .line 64
    add-int/2addr v2, v3

    .line 65
    invoke-virtual {p0, v2}, Lfh/h;->d(I)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    rsub-int v11, v2, 0x1000

    .line 70
    .line 71
    filled-new-array/range {v4 .. v11}, [I

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    mul-int/lit8 v4, v1, 0xd

    .line 76
    .line 77
    add-int/2addr v4, p2

    .line 78
    aget v5, v2, v0

    .line 79
    .line 80
    int-to-byte v6, v5

    .line 81
    aput-byte v6, p1, v4

    .line 82
    .line 83
    add-int/lit8 v6, v4, 0x1

    .line 84
    .line 85
    shr-int/lit8 v5, v5, 0x8

    .line 86
    .line 87
    int-to-byte v5, v5

    .line 88
    aput-byte v5, p1, v6

    .line 89
    .line 90
    const/4 v7, 0x1

    .line 91
    aget v7, v2, v7

    .line 92
    .line 93
    shl-int/lit8 v8, v7, 0x5

    .line 94
    .line 95
    int-to-byte v8, v8

    .line 96
    or-int/2addr v5, v8

    .line 97
    int-to-byte v5, v5

    .line 98
    aput-byte v5, p1, v6

    .line 99
    .line 100
    add-int/lit8 v5, v4, 0x2

    .line 101
    .line 102
    shr-int/lit8 v6, v7, 0x3

    .line 103
    .line 104
    int-to-byte v6, v6

    .line 105
    aput-byte v6, p1, v5

    .line 106
    .line 107
    add-int/lit8 v5, v4, 0x3

    .line 108
    .line 109
    shr-int/lit8 v6, v7, 0xb

    .line 110
    .line 111
    int-to-byte v6, v6

    .line 112
    aput-byte v6, p1, v5

    .line 113
    .line 114
    const/4 v7, 0x2

    .line 115
    aget v7, v2, v7

    .line 116
    .line 117
    shl-int/lit8 v8, v7, 0x2

    .line 118
    .line 119
    int-to-byte v8, v8

    .line 120
    or-int/2addr v6, v8

    .line 121
    int-to-byte v6, v6

    .line 122
    aput-byte v6, p1, v5

    .line 123
    .line 124
    add-int/lit8 v5, v4, 0x4

    .line 125
    .line 126
    const/4 v6, 0x6

    .line 127
    shr-int/2addr v7, v6

    .line 128
    int-to-byte v7, v7

    .line 129
    aput-byte v7, p1, v5

    .line 130
    .line 131
    const/4 v8, 0x3

    .line 132
    aget v8, v2, v8

    .line 133
    .line 134
    shl-int/lit8 v9, v8, 0x7

    .line 135
    .line 136
    int-to-byte v9, v9

    .line 137
    or-int/2addr v7, v9

    .line 138
    int-to-byte v7, v7

    .line 139
    aput-byte v7, p1, v5

    .line 140
    .line 141
    add-int/lit8 v5, v4, 0x5

    .line 142
    .line 143
    shr-int/lit8 v7, v8, 0x1

    .line 144
    .line 145
    int-to-byte v7, v7

    .line 146
    aput-byte v7, p1, v5

    .line 147
    .line 148
    add-int/lit8 v5, v4, 0x6

    .line 149
    .line 150
    shr-int/lit8 v7, v8, 0x9

    .line 151
    .line 152
    int-to-byte v7, v7

    .line 153
    aput-byte v7, p1, v5

    .line 154
    .line 155
    const/4 v8, 0x4

    .line 156
    aget v8, v2, v8

    .line 157
    .line 158
    shl-int/lit8 v9, v8, 0x4

    .line 159
    .line 160
    int-to-byte v9, v9

    .line 161
    or-int/2addr v7, v9

    .line 162
    int-to-byte v7, v7

    .line 163
    aput-byte v7, p1, v5

    .line 164
    .line 165
    add-int/lit8 v5, v4, 0x7

    .line 166
    .line 167
    shr-int/lit8 v7, v8, 0x4

    .line 168
    .line 169
    int-to-byte v7, v7

    .line 170
    aput-byte v7, p1, v5

    .line 171
    .line 172
    add-int/lit8 v5, v4, 0x8

    .line 173
    .line 174
    shr-int/lit8 v7, v8, 0xc

    .line 175
    .line 176
    int-to-byte v7, v7

    .line 177
    aput-byte v7, p1, v5

    .line 178
    .line 179
    const/4 v8, 0x5

    .line 180
    aget v9, v2, v8

    .line 181
    .line 182
    shl-int/lit8 v10, v9, 0x1

    .line 183
    .line 184
    int-to-byte v10, v10

    .line 185
    or-int/2addr v7, v10

    .line 186
    int-to-byte v7, v7

    .line 187
    aput-byte v7, p1, v5

    .line 188
    .line 189
    add-int/lit8 v5, v4, 0x9

    .line 190
    .line 191
    shr-int/lit8 v7, v9, 0x7

    .line 192
    .line 193
    int-to-byte v7, v7

    .line 194
    aput-byte v7, p1, v5

    .line 195
    .line 196
    aget v6, v2, v6

    .line 197
    .line 198
    shl-int/lit8 v9, v6, 0x6

    .line 199
    .line 200
    int-to-byte v9, v9

    .line 201
    or-int/2addr v7, v9

    .line 202
    int-to-byte v7, v7

    .line 203
    aput-byte v7, p1, v5

    .line 204
    .line 205
    add-int/lit8 v5, v4, 0xa

    .line 206
    .line 207
    shr-int/lit8 v7, v6, 0x2

    .line 208
    .line 209
    int-to-byte v7, v7

    .line 210
    aput-byte v7, p1, v5

    .line 211
    .line 212
    add-int/lit8 v5, v4, 0xb

    .line 213
    .line 214
    shr-int/lit8 v6, v6, 0xa

    .line 215
    .line 216
    int-to-byte v6, v6

    .line 217
    aput-byte v6, p1, v5

    .line 218
    .line 219
    aget v2, v2, v3

    .line 220
    .line 221
    shl-int/lit8 v3, v2, 0x3

    .line 222
    .line 223
    int-to-byte v3, v3

    .line 224
    or-int/2addr v3, v6

    .line 225
    int-to-byte v3, v3

    .line 226
    aput-byte v3, p1, v5

    .line 227
    .line 228
    add-int/lit8 v4, v4, 0xc

    .line 229
    .line 230
    shr-int/2addr v2, v8

    .line 231
    int-to-byte v2, v2

    .line 232
    aput-byte v2, p1, v4

    .line 233
    .line 234
    add-int/lit8 v1, v1, 0x1

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :cond_0
    return-object p1
.end method

.method public m([BI)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x20

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    mul-int/lit8 v1, v0, 0xd

    .line 7
    .line 8
    add-int/2addr v1, p2

    .line 9
    mul-int/lit8 v2, v0, 0x8

    .line 10
    .line 11
    aget-byte v3, p1, v1

    .line 12
    .line 13
    and-int/lit16 v3, v3, 0xff

    .line 14
    .line 15
    add-int/lit8 v4, v1, 0x1

    .line 16
    .line 17
    aget-byte v5, p1, v4

    .line 18
    .line 19
    and-int/lit16 v5, v5, 0xff

    .line 20
    .line 21
    shl-int/lit8 v5, v5, 0x8

    .line 22
    .line 23
    or-int/2addr v3, v5

    .line 24
    and-int/lit16 v3, v3, 0x1fff

    .line 25
    .line 26
    invoke-virtual {p0, v2, v3}, Lfh/h;->s(II)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v2, 0x1

    .line 30
    .line 31
    aget-byte v4, p1, v4

    .line 32
    .line 33
    and-int/lit16 v4, v4, 0xff

    .line 34
    .line 35
    shr-int/lit8 v4, v4, 0x5

    .line 36
    .line 37
    add-int/lit8 v5, v1, 0x2

    .line 38
    .line 39
    aget-byte v5, p1, v5

    .line 40
    .line 41
    and-int/lit16 v5, v5, 0xff

    .line 42
    .line 43
    shl-int/lit8 v5, v5, 0x3

    .line 44
    .line 45
    or-int/2addr v4, v5

    .line 46
    add-int/lit8 v5, v1, 0x3

    .line 47
    .line 48
    aget-byte v6, p1, v5

    .line 49
    .line 50
    and-int/lit16 v6, v6, 0xff

    .line 51
    .line 52
    shl-int/lit8 v6, v6, 0xb

    .line 53
    .line 54
    or-int/2addr v4, v6

    .line 55
    and-int/lit16 v4, v4, 0x1fff

    .line 56
    .line 57
    invoke-virtual {p0, v3, v4}, Lfh/h;->s(II)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v4, v2, 0x2

    .line 61
    .line 62
    aget-byte v5, p1, v5

    .line 63
    .line 64
    and-int/lit16 v5, v5, 0xff

    .line 65
    .line 66
    shr-int/lit8 v5, v5, 0x2

    .line 67
    .line 68
    add-int/lit8 v6, v1, 0x4

    .line 69
    .line 70
    aget-byte v7, p1, v6

    .line 71
    .line 72
    and-int/lit16 v7, v7, 0xff

    .line 73
    .line 74
    shl-int/lit8 v7, v7, 0x6

    .line 75
    .line 76
    or-int/2addr v5, v7

    .line 77
    and-int/lit16 v5, v5, 0x1fff

    .line 78
    .line 79
    invoke-virtual {p0, v4, v5}, Lfh/h;->s(II)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v5, v2, 0x3

    .line 83
    .line 84
    aget-byte v6, p1, v6

    .line 85
    .line 86
    and-int/lit16 v6, v6, 0xff

    .line 87
    .line 88
    shr-int/lit8 v6, v6, 0x7

    .line 89
    .line 90
    add-int/lit8 v7, v1, 0x5

    .line 91
    .line 92
    aget-byte v7, p1, v7

    .line 93
    .line 94
    and-int/lit16 v7, v7, 0xff

    .line 95
    .line 96
    shl-int/lit8 v7, v7, 0x1

    .line 97
    .line 98
    or-int/2addr v6, v7

    .line 99
    add-int/lit8 v7, v1, 0x6

    .line 100
    .line 101
    aget-byte v8, p1, v7

    .line 102
    .line 103
    and-int/lit16 v8, v8, 0xff

    .line 104
    .line 105
    shl-int/lit8 v8, v8, 0x9

    .line 106
    .line 107
    or-int/2addr v6, v8

    .line 108
    and-int/lit16 v6, v6, 0x1fff

    .line 109
    .line 110
    invoke-virtual {p0, v5, v6}, Lfh/h;->s(II)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v6, v2, 0x4

    .line 114
    .line 115
    aget-byte v7, p1, v7

    .line 116
    .line 117
    and-int/lit16 v7, v7, 0xff

    .line 118
    .line 119
    shr-int/lit8 v7, v7, 0x4

    .line 120
    .line 121
    add-int/lit8 v8, v1, 0x7

    .line 122
    .line 123
    aget-byte v8, p1, v8

    .line 124
    .line 125
    and-int/lit16 v8, v8, 0xff

    .line 126
    .line 127
    shl-int/lit8 v8, v8, 0x4

    .line 128
    .line 129
    or-int/2addr v7, v8

    .line 130
    add-int/lit8 v8, v1, 0x8

    .line 131
    .line 132
    aget-byte v9, p1, v8

    .line 133
    .line 134
    and-int/lit16 v9, v9, 0xff

    .line 135
    .line 136
    shl-int/lit8 v9, v9, 0xc

    .line 137
    .line 138
    or-int/2addr v7, v9

    .line 139
    and-int/lit16 v7, v7, 0x1fff

    .line 140
    .line 141
    invoke-virtual {p0, v6, v7}, Lfh/h;->s(II)V

    .line 142
    .line 143
    .line 144
    add-int/lit8 v7, v2, 0x5

    .line 145
    .line 146
    aget-byte v8, p1, v8

    .line 147
    .line 148
    and-int/lit16 v8, v8, 0xff

    .line 149
    .line 150
    shr-int/lit8 v8, v8, 0x1

    .line 151
    .line 152
    add-int/lit8 v9, v1, 0x9

    .line 153
    .line 154
    aget-byte v10, p1, v9

    .line 155
    .line 156
    and-int/lit16 v10, v10, 0xff

    .line 157
    .line 158
    shl-int/lit8 v10, v10, 0x7

    .line 159
    .line 160
    or-int/2addr v8, v10

    .line 161
    and-int/lit16 v8, v8, 0x1fff

    .line 162
    .line 163
    invoke-virtual {p0, v7, v8}, Lfh/h;->s(II)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v8, v2, 0x6

    .line 167
    .line 168
    aget-byte v9, p1, v9

    .line 169
    .line 170
    and-int/lit16 v9, v9, 0xff

    .line 171
    .line 172
    shr-int/lit8 v9, v9, 0x6

    .line 173
    .line 174
    add-int/lit8 v10, v1, 0xa

    .line 175
    .line 176
    aget-byte v10, p1, v10

    .line 177
    .line 178
    and-int/lit16 v10, v10, 0xff

    .line 179
    .line 180
    shl-int/lit8 v10, v10, 0x2

    .line 181
    .line 182
    or-int/2addr v9, v10

    .line 183
    add-int/lit8 v10, v1, 0xb

    .line 184
    .line 185
    aget-byte v11, p1, v10

    .line 186
    .line 187
    and-int/lit16 v11, v11, 0xff

    .line 188
    .line 189
    shl-int/lit8 v11, v11, 0xa

    .line 190
    .line 191
    or-int/2addr v9, v11

    .line 192
    and-int/lit16 v9, v9, 0x1fff

    .line 193
    .line 194
    invoke-virtual {p0, v8, v9}, Lfh/h;->s(II)V

    .line 195
    .line 196
    .line 197
    add-int/lit8 v9, v2, 0x7

    .line 198
    .line 199
    aget-byte v10, p1, v10

    .line 200
    .line 201
    and-int/lit16 v10, v10, 0xff

    .line 202
    .line 203
    shr-int/lit8 v10, v10, 0x3

    .line 204
    .line 205
    add-int/lit8 v1, v1, 0xc

    .line 206
    .line 207
    aget-byte v1, p1, v1

    .line 208
    .line 209
    and-int/lit16 v1, v1, 0xff

    .line 210
    .line 211
    shl-int/lit8 v1, v1, 0x5

    .line 212
    .line 213
    or-int/2addr v1, v10

    .line 214
    and-int/lit16 v1, v1, 0x1fff

    .line 215
    .line 216
    invoke-virtual {p0, v9, v1}, Lfh/h;->s(II)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v2}, Lfh/h;->d(I)I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    rsub-int v1, v1, 0x1000

    .line 224
    .line 225
    invoke-virtual {p0, v2, v1}, Lfh/h;->s(II)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v3}, Lfh/h;->d(I)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    rsub-int v1, v1, 0x1000

    .line 233
    .line 234
    invoke-virtual {p0, v3, v1}, Lfh/h;->s(II)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, v4}, Lfh/h;->d(I)I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    rsub-int v1, v1, 0x1000

    .line 242
    .line 243
    invoke-virtual {p0, v4, v1}, Lfh/h;->s(II)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0, v5}, Lfh/h;->d(I)I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    rsub-int v1, v1, 0x1000

    .line 251
    .line 252
    invoke-virtual {p0, v5, v1}, Lfh/h;->s(II)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v6}, Lfh/h;->d(I)I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    rsub-int v1, v1, 0x1000

    .line 260
    .line 261
    invoke-virtual {p0, v6, v1}, Lfh/h;->s(II)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0, v7}, Lfh/h;->d(I)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    rsub-int v1, v1, 0x1000

    .line 269
    .line 270
    invoke-virtual {p0, v7, v1}, Lfh/h;->s(II)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, v8}, Lfh/h;->d(I)I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    rsub-int v1, v1, 0x1000

    .line 278
    .line 279
    invoke-virtual {p0, v8, v1}, Lfh/h;->s(II)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0, v9}, Lfh/h;->d(I)I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    rsub-int v1, v1, 0x1000

    .line 287
    .line 288
    invoke-virtual {p0, v9, v1}, Lfh/h;->s(II)V

    .line 289
    .line 290
    .line 291
    add-int/lit8 v0, v0, 0x1

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_0
    return-void
.end method

.method public n()[B
    .locals 9

    .line 1
    const/16 v0, 0x140

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    const/16 v2, 0x40

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    mul-int/lit8 v2, v1, 0x5

    .line 11
    .line 12
    iget-object v3, p0, Lfh/h;->b:[I

    .line 13
    .line 14
    mul-int/lit8 v4, v1, 0x4

    .line 15
    .line 16
    aget v5, v3, v4

    .line 17
    .line 18
    int-to-byte v6, v5

    .line 19
    aput-byte v6, v0, v2

    .line 20
    .line 21
    add-int/lit8 v6, v2, 0x1

    .line 22
    .line 23
    shr-int/lit8 v5, v5, 0x8

    .line 24
    .line 25
    add-int/lit8 v7, v4, 0x1

    .line 26
    .line 27
    aget v7, v3, v7

    .line 28
    .line 29
    shl-int/lit8 v8, v7, 0x2

    .line 30
    .line 31
    or-int/2addr v5, v8

    .line 32
    int-to-byte v5, v5

    .line 33
    aput-byte v5, v0, v6

    .line 34
    .line 35
    add-int/lit8 v5, v2, 0x2

    .line 36
    .line 37
    shr-int/lit8 v6, v7, 0x6

    .line 38
    .line 39
    add-int/lit8 v7, v4, 0x2

    .line 40
    .line 41
    aget v7, v3, v7

    .line 42
    .line 43
    shl-int/lit8 v8, v7, 0x4

    .line 44
    .line 45
    or-int/2addr v6, v8

    .line 46
    int-to-byte v6, v6

    .line 47
    aput-byte v6, v0, v5

    .line 48
    .line 49
    add-int/lit8 v5, v2, 0x3

    .line 50
    .line 51
    shr-int/lit8 v6, v7, 0x4

    .line 52
    .line 53
    add-int/lit8 v4, v4, 0x3

    .line 54
    .line 55
    aget v3, v3, v4

    .line 56
    .line 57
    shl-int/lit8 v4, v3, 0x6

    .line 58
    .line 59
    or-int/2addr v4, v6

    .line 60
    int-to-byte v4, v4

    .line 61
    aput-byte v4, v0, v5

    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x4

    .line 64
    .line 65
    shr-int/lit8 v3, v3, 0x2

    .line 66
    .line 67
    int-to-byte v3, v3

    .line 68
    aput-byte v3, v0, v2

    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    return-object v0
.end method

.method public o(Lfh/h;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/16 v2, 0x100

    .line 4
    .line 5
    if-ge v1, v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lfh/h;->d(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, Lfh/m;->a(I)[I

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    aget v3, v2, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1, v3}, Lfh/h;->s(II)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    aget v2, v2, v3

    .line 22
    .line 23
    invoke-virtual {p1, v1, v2}, Lfh/h;->s(II)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public p()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/16 v1, 0x100

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lfh/h;->d(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lfh/l;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p0, v0, v1}, Lfh/h;->s(II)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public s(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/h;->b:[I

    .line 2
    .line 3
    aput p2, v0, p1

    .line 4
    .line 5
    return-void
.end method

.method public t([I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfh/h;->b:[I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "["

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lfh/h;->b:[I

    .line 13
    .line 14
    array-length v3, v2

    .line 15
    if-ge v1, v3, :cond_1

    .line 16
    .line 17
    aget v2, v2, v1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lfh/h;->b:[I

    .line 23
    .line 24
    array-length v2, v2

    .line 25
    add-int/lit8 v2, v2, -0x1

    .line 26
    .line 27
    if-eq v1, v2, :cond_0

    .line 28
    .line 29
    const-string v2, ", "

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v1, "]"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method

.method public u([BS)V
    .locals 6

    .line 1
    iget v0, p0, Lfh/h;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lfh/h;->d:Lfh/n;

    .line 4
    .line 5
    iget v2, v1, Lfh/n;->a:I

    .line 6
    .line 7
    mul-int/2addr v0, v2

    .line 8
    add-int/lit8 v2, v0, 0x2

    .line 9
    .line 10
    new-array v2, v2, [B

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, Lfh/n;->a([BS)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lfh/h;->d:Lfh/n;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-virtual {p1, v2, p2, v0}, Lfh/n;->b([BII)V

    .line 19
    .line 20
    .line 21
    const/16 p1, 0x100

    .line 22
    .line 23
    invoke-static {p0, p2, p1, v2, v0}, Lfh/h;->r(Lfh/h;II[BI)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :goto_0
    if-ge v1, p1, :cond_1

    .line 28
    .line 29
    rem-int/lit8 v3, v0, 0x3

    .line 30
    .line 31
    move v4, p2

    .line 32
    :goto_1
    if-ge v4, v3, :cond_0

    .line 33
    .line 34
    sub-int v5, v0, v3

    .line 35
    .line 36
    add-int/2addr v5, v4

    .line 37
    aget-byte v5, v2, v5

    .line 38
    .line 39
    aput-byte v5, v2, v4

    .line 40
    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    iget-object v0, p0, Lfh/h;->d:Lfh/n;

    .line 45
    .line 46
    iget v4, v0, Lfh/n;->a:I

    .line 47
    .line 48
    invoke-virtual {v0, v2, v3, v4}, Lfh/n;->b([BII)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lfh/h;->d:Lfh/n;

    .line 52
    .line 53
    iget v0, v0, Lfh/n;->a:I

    .line 54
    .line 55
    add-int/2addr v0, v3

    .line 56
    rsub-int v3, v1, 0x100

    .line 57
    .line 58
    invoke-static {p0, v1, v3, v2, v0}, Lfh/h;->r(Lfh/h;II[BI)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    add-int/2addr v1, v3

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public v([BS)V
    .locals 7

    .line 1
    iget-object v0, p0, Lfh/h;->c:Lfh/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfh/a;->e()I

    .line 4
    .line 5
    .line 6
    move-result v6

    .line 7
    iget-object v0, p0, Lfh/h;->c:Lfh/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lfh/a;->e()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lfh/h;->d:Lfh/n;

    .line 17
    .line 18
    iget v0, v0, Lfh/n;->b:I

    .line 19
    .line 20
    add-int/lit16 v1, v0, 0x87

    .line 21
    .line 22
    :goto_0
    div-int/2addr v1, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v0, p0, Lfh/h;->c:Lfh/a;

    .line 25
    .line 26
    invoke-virtual {v0}, Lfh/a;->e()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x4

    .line 31
    if-ne v0, v1, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lfh/h;->d:Lfh/n;

    .line 34
    .line 35
    iget v0, v0, Lfh/n;->b:I

    .line 36
    .line 37
    add-int/lit16 v1, v0, 0xe2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    iget-object v0, p0, Lfh/h;->d:Lfh/n;

    .line 41
    .line 42
    iget v2, v0, Lfh/n;->b:I

    .line 43
    .line 44
    mul-int v5, v1, v2

    .line 45
    .line 46
    new-array v4, v5, [B

    .line 47
    .line 48
    invoke-virtual {v0, p1, p2}, Lfh/n;->c([BS)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lfh/h;->d:Lfh/n;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    invoke-virtual {p1, v4, p2, v5}, Lfh/n;->d([BII)V

    .line 55
    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    const/16 v3, 0x100

    .line 59
    .line 60
    move-object v1, p0

    .line 61
    invoke-static/range {v1 .. v6}, Lfh/h;->q(Lfh/h;II[BII)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    move v2, p1

    .line 66
    :goto_2
    const/16 p1, 0x100

    .line 67
    .line 68
    if-ge v2, p1, :cond_1

    .line 69
    .line 70
    iget-object p1, v1, Lfh/h;->d:Lfh/n;

    .line 71
    .line 72
    iget v0, p1, Lfh/n;->b:I

    .line 73
    .line 74
    invoke-virtual {p1, v4, p2, v0}, Lfh/n;->d([BII)V

    .line 75
    .line 76
    .line 77
    rsub-int v3, v2, 0x100

    .line 78
    .line 79
    iget-object p1, v1, Lfh/h;->d:Lfh/n;

    .line 80
    .line 81
    iget v5, p1, Lfh/n;->b:I

    .line 82
    .line 83
    invoke-static/range {v1 .. v6}, Lfh/h;->q(Lfh/h;II[BII)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    add-int/2addr v2, p1

    .line 88
    move-object v1, p0

    .line 89
    goto :goto_2

    .line 90
    :cond_1
    return-void

    .line 91
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 92
    .line 93
    const-string p2, "Wrong Dilithium Eta!"

    .line 94
    .line 95
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
.end method
