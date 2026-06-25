.class final Lxa/d0$d;
.super Lxa/d0$b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxa/d0$b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static d()Z
    .locals 1

    .line 1
    invoke-static {}, Lxa/c0;->C()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lxa/c0;->D()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method private static e([BJI)I
    .locals 10

    .line 1
    invoke-static {p0, p1, p2, p3}, Lxa/d0$d;->f([BJI)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int/2addr p3, v0

    .line 6
    int-to-long v0, v0

    .line 7
    add-long/2addr p1, v0

    .line 8
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    :goto_1
    const-wide/16 v2, 0x1

    .line 11
    .line 12
    if-lez p3, :cond_2

    .line 13
    .line 14
    add-long v4, p1, v2

    .line 15
    .line 16
    invoke-static {p0, p1, p2}, Lxa/c0;->s([BJ)B

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ltz v1, :cond_1

    .line 21
    .line 22
    add-int/lit8 p3, p3, -0x1

    .line 23
    .line 24
    move-wide p1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-wide p1, v4

    .line 27
    :cond_2
    if-nez p3, :cond_3

    .line 28
    .line 29
    return v0

    .line 30
    :cond_3
    add-int/lit8 v0, p3, -0x1

    .line 31
    .line 32
    const/16 v4, -0x20

    .line 33
    .line 34
    const/4 v5, -0x1

    .line 35
    const/16 v6, -0x41

    .line 36
    .line 37
    if-ge v1, v4, :cond_7

    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    return v1

    .line 42
    :cond_4
    add-int/lit8 p3, p3, -0x2

    .line 43
    .line 44
    const/16 v0, -0x3e

    .line 45
    .line 46
    if-lt v1, v0, :cond_6

    .line 47
    .line 48
    add-long/2addr v2, p1

    .line 49
    invoke-static {p0, p1, p2}, Lxa/c0;->s([BJ)B

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-le p1, v6, :cond_5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_5
    move-wide p1, v2

    .line 57
    goto :goto_0

    .line 58
    :cond_6
    :goto_2
    return v5

    .line 59
    :cond_7
    const/16 v7, -0x10

    .line 60
    .line 61
    const-wide/16 v8, 0x2

    .line 62
    .line 63
    if-ge v1, v7, :cond_c

    .line 64
    .line 65
    const/4 v7, 0x2

    .line 66
    if-ge v0, v7, :cond_8

    .line 67
    .line 68
    invoke-static {p0, v1, p1, p2, v0}, Lxa/d0$d;->g([BIJI)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0

    .line 73
    :cond_8
    add-int/lit8 p3, p3, -0x3

    .line 74
    .line 75
    add-long/2addr v2, p1

    .line 76
    invoke-static {p0, p1, p2}, Lxa/c0;->s([BJ)B

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-gt v0, v6, :cond_b

    .line 81
    .line 82
    const/16 v7, -0x60

    .line 83
    .line 84
    if-ne v1, v4, :cond_9

    .line 85
    .line 86
    if-lt v0, v7, :cond_b

    .line 87
    .line 88
    :cond_9
    const/16 v4, -0x13

    .line 89
    .line 90
    if-ne v1, v4, :cond_a

    .line 91
    .line 92
    if-ge v0, v7, :cond_b

    .line 93
    .line 94
    :cond_a
    add-long/2addr p1, v8

    .line 95
    invoke-static {p0, v2, v3}, Lxa/c0;->s([BJ)B

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-le v0, v6, :cond_0

    .line 100
    .line 101
    :cond_b
    return v5

    .line 102
    :cond_c
    const/4 v4, 0x3

    .line 103
    if-ge v0, v4, :cond_d

    .line 104
    .line 105
    invoke-static {p0, v1, p1, p2, v0}, Lxa/d0$d;->g([BIJI)I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    return p0

    .line 110
    :cond_d
    add-int/lit8 p3, p3, -0x4

    .line 111
    .line 112
    add-long/2addr v2, p1

    .line 113
    invoke-static {p0, p1, p2}, Lxa/c0;->s([BJ)B

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-gt v0, v6, :cond_e

    .line 118
    .line 119
    shl-int/lit8 v1, v1, 0x1c

    .line 120
    .line 121
    add-int/lit8 v0, v0, 0x70

    .line 122
    .line 123
    add-int/2addr v1, v0

    .line 124
    shr-int/lit8 v0, v1, 0x1e

    .line 125
    .line 126
    if-nez v0, :cond_e

    .line 127
    .line 128
    add-long/2addr v8, p1

    .line 129
    invoke-static {p0, v2, v3}, Lxa/c0;->s([BJ)B

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-gt v0, v6, :cond_e

    .line 134
    .line 135
    const-wide/16 v0, 0x3

    .line 136
    .line 137
    add-long/2addr p1, v0

    .line 138
    invoke-static {p0, v8, v9}, Lxa/c0;->s([BJ)B

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-le v0, v6, :cond_0

    .line 143
    .line 144
    :cond_e
    return v5
.end method

.method private static f([BJI)I
    .locals 8

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ge p3, v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    long-to-int v0, p1

    .line 8
    and-int/lit8 v0, v0, 0x7

    .line 9
    .line 10
    rsub-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    :goto_0
    const-wide/16 v2, 0x1

    .line 13
    .line 14
    if-ge v1, v0, :cond_2

    .line 15
    .line 16
    add-long/2addr v2, p1

    .line 17
    invoke-static {p0, p1, p2}, Lxa/c0;->s([BJ)B

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-gez p1, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    move-wide p1, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    :goto_1
    add-int/lit8 v0, v1, 0x8

    .line 29
    .line 30
    if-gt v0, p3, :cond_4

    .line 31
    .line 32
    sget-wide v4, Lxa/c0;->h:J

    .line 33
    .line 34
    add-long/2addr v4, p1

    .line 35
    invoke-static {p0, v4, v5}, Lxa/c0;->y(Ljava/lang/Object;J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    const-wide v6, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr v4, v6

    .line 45
    const-wide/16 v6, 0x0

    .line 46
    .line 47
    cmp-long v4, v4, v6

    .line 48
    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    const-wide/16 v4, 0x8

    .line 53
    .line 54
    add-long/2addr p1, v4

    .line 55
    move v1, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    :goto_2
    if-ge v1, p3, :cond_6

    .line 58
    .line 59
    add-long v4, p1, v2

    .line 60
    .line 61
    invoke-static {p0, p1, p2}, Lxa/c0;->s([BJ)B

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-gez p1, :cond_5

    .line 66
    .line 67
    return v1

    .line 68
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    move-wide p1, v4

    .line 71
    goto :goto_2

    .line 72
    :cond_6
    return p3
.end method

.method private static g([BIJI)I
    .locals 2

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p4, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p4, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p2, p3}, Lxa/c0;->s([BJ)B

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    const-wide/16 v0, 0x1

    .line 14
    .line 15
    add-long/2addr p2, v0

    .line 16
    invoke-static {p0, p2, p3}, Lxa/c0;->s([BJ)B

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p1, p4, p0}, Lxa/d0;->b(III)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-static {p0, p2, p3}, Lxa/c0;->s([BJ)B

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p1, p0}, Lxa/d0;->a(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    invoke-static {p1}, Lxa/d0;->d(I)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0
.end method


# virtual methods
.method a([BII)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Lxa/q;->b:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, p3, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "\ufffd"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    add-int/2addr p3, p2

    .line 22
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    :goto_0
    return-object v0

    .line 33
    :cond_1
    invoke-static {}, Lxa/r;->d()Lxa/r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    throw p1
.end method

.method c(I[BII)I
    .locals 10

    .line 1
    or-int v0, p3, p4

    .line 2
    .line 3
    array-length v1, p2

    .line 4
    sub-int/2addr v1, p4

    .line 5
    or-int/2addr v0, v1

    .line 6
    if-ltz v0, :cond_11

    .line 7
    .line 8
    int-to-long v0, p3

    .line 9
    int-to-long p3, p4

    .line 10
    if-eqz p1, :cond_10

    .line 11
    .line 12
    cmp-long v2, v0, p3

    .line 13
    .line 14
    if-ltz v2, :cond_0

    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    int-to-byte v2, p1

    .line 18
    const/16 v3, -0x20

    .line 19
    .line 20
    const/4 v4, -0x1

    .line 21
    const/16 v5, -0x41

    .line 22
    .line 23
    const-wide/16 v6, 0x1

    .line 24
    .line 25
    if-ge v2, v3, :cond_3

    .line 26
    .line 27
    const/16 p1, -0x3e

    .line 28
    .line 29
    if-lt v2, p1, :cond_2

    .line 30
    .line 31
    add-long/2addr v6, v0

    .line 32
    invoke-static {p2, v0, v1}, Lxa/c0;->s([BJ)B

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-le p1, v5, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-wide v0, v6

    .line 40
    goto/16 :goto_3

    .line 41
    .line 42
    :cond_2
    :goto_0
    return v4

    .line 43
    :cond_3
    const/16 v8, -0x10

    .line 44
    .line 45
    if-ge v2, v8, :cond_a

    .line 46
    .line 47
    shr-int/lit8 p1, p1, 0x8

    .line 48
    .line 49
    not-int p1, p1

    .line 50
    int-to-byte p1, p1

    .line 51
    if-nez p1, :cond_5

    .line 52
    .line 53
    add-long v8, v0, v6

    .line 54
    .line 55
    invoke-static {p2, v0, v1}, Lxa/c0;->s([BJ)B

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    cmp-long v0, v8, p3

    .line 60
    .line 61
    if-ltz v0, :cond_4

    .line 62
    .line 63
    invoke-static {v2, p1}, Lxa/d0;->a(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :cond_4
    move-wide v0, v8

    .line 69
    :cond_5
    if-gt p1, v5, :cond_9

    .line 70
    .line 71
    const/16 v8, -0x60

    .line 72
    .line 73
    if-ne v2, v3, :cond_6

    .line 74
    .line 75
    if-lt p1, v8, :cond_9

    .line 76
    .line 77
    :cond_6
    const/16 v3, -0x13

    .line 78
    .line 79
    if-ne v2, v3, :cond_7

    .line 80
    .line 81
    if-ge p1, v8, :cond_9

    .line 82
    .line 83
    :cond_7
    add-long v2, v0, v6

    .line 84
    .line 85
    invoke-static {p2, v0, v1}, Lxa/c0;->s([BJ)B

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-le p1, v5, :cond_8

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_8
    move-wide v0, v2

    .line 93
    goto :goto_3

    .line 94
    :cond_9
    :goto_1
    return v4

    .line 95
    :cond_a
    shr-int/lit8 v3, p1, 0x8

    .line 96
    .line 97
    not-int v3, v3

    .line 98
    int-to-byte v3, v3

    .line 99
    if-nez v3, :cond_c

    .line 100
    .line 101
    add-long v8, v0, v6

    .line 102
    .line 103
    invoke-static {p2, v0, v1}, Lxa/c0;->s([BJ)B

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    cmp-long p1, v8, p3

    .line 108
    .line 109
    if-ltz p1, :cond_b

    .line 110
    .line 111
    invoke-static {v2, v3}, Lxa/d0;->a(II)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    return p1

    .line 116
    :cond_b
    const/4 p1, 0x0

    .line 117
    move-wide v0, v8

    .line 118
    goto :goto_2

    .line 119
    :cond_c
    shr-int/lit8 p1, p1, 0x10

    .line 120
    .line 121
    int-to-byte p1, p1

    .line 122
    :goto_2
    if-nez p1, :cond_e

    .line 123
    .line 124
    add-long v8, v0, v6

    .line 125
    .line 126
    invoke-static {p2, v0, v1}, Lxa/c0;->s([BJ)B

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    cmp-long v0, v8, p3

    .line 131
    .line 132
    if-ltz v0, :cond_d

    .line 133
    .line 134
    invoke-static {v2, v3, p1}, Lxa/d0;->b(III)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    return p1

    .line 139
    :cond_d
    move-wide v0, v8

    .line 140
    :cond_e
    if-gt v3, v5, :cond_f

    .line 141
    .line 142
    shl-int/lit8 v2, v2, 0x1c

    .line 143
    .line 144
    add-int/lit8 v3, v3, 0x70

    .line 145
    .line 146
    add-int/2addr v2, v3

    .line 147
    shr-int/lit8 v2, v2, 0x1e

    .line 148
    .line 149
    if-nez v2, :cond_f

    .line 150
    .line 151
    if-gt p1, v5, :cond_f

    .line 152
    .line 153
    add-long v2, v0, v6

    .line 154
    .line 155
    invoke-static {p2, v0, v1}, Lxa/c0;->s([BJ)B

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-le p1, v5, :cond_8

    .line 160
    .line 161
    :cond_f
    return v4

    .line 162
    :cond_10
    :goto_3
    sub-long/2addr p3, v0

    .line 163
    long-to-int p1, p3

    .line 164
    invoke-static {p2, v0, v1, p1}, Lxa/d0$d;->e([BJI)I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    return p1

    .line 169
    :cond_11
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 170
    .line 171
    array-length p2, p2

    .line 172
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p4

    .line 184
    filled-new-array {p2, p3, p4}, [Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    const-string p3, "Array length=%d, index=%d, limit=%d"

    .line 189
    .line 190
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1
.end method
