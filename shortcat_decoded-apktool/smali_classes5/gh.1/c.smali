.class Lgh/c;
.super Ljava/lang/Object;


# instance fields
.field private a:Lgh/b;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Lgh/l;

.field public final i:I


# direct methods
.method public constructor <init>(Lgh/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgh/c;->a:Lgh/b;

    .line 5
    .line 6
    invoke-virtual {p1}, Lgh/b;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lgh/c;->b:I

    .line 11
    .line 12
    invoke-virtual {p1}, Lgh/b;->k()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lgh/c;->c:I

    .line 17
    .line 18
    invoke-virtual {p1}, Lgh/b;->i()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lgh/c;->d:I

    .line 23
    .line 24
    invoke-virtual {p1}, Lgh/b;->d()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lgh/c;->e:I

    .line 29
    .line 30
    invoke-virtual {p1}, Lgh/b;->j()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lgh/c;->f:I

    .line 35
    .line 36
    invoke-virtual {p1}, Lgh/b;->h()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lgh/c;->g:I

    .line 41
    .line 42
    invoke-virtual {p1}, Lgh/b;->l()Lgh/l;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lgh/c;->h:Lgh/l;

    .line 47
    .line 48
    iget p1, p1, Lgh/l;->a:I

    .line 49
    .line 50
    add-int/lit16 v0, p1, 0x1d8

    .line 51
    .line 52
    div-int/2addr v0, p1

    .line 53
    iput v0, p0, Lgh/c;->i:I

    .line 54
    .line 55
    return-void
.end method

.method private static e(Lgh/i;II[BI)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge v0, p2, :cond_2

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    if-gt v2, p4, :cond_2

    .line 8
    .line 9
    aget-byte v3, p3, v1

    .line 10
    .line 11
    and-int/lit16 v3, v3, 0xff

    .line 12
    .line 13
    int-to-short v3, v3

    .line 14
    add-int/lit8 v4, v1, 0x1

    .line 15
    .line 16
    aget-byte v4, p3, v4

    .line 17
    .line 18
    and-int/lit16 v5, v4, 0xff

    .line 19
    .line 20
    int-to-short v5, v5

    .line 21
    shl-int/lit8 v5, v5, 0x8

    .line 22
    .line 23
    or-int/2addr v3, v5

    .line 24
    and-int/lit16 v3, v3, 0xfff

    .line 25
    .line 26
    int-to-short v3, v3

    .line 27
    and-int/lit16 v4, v4, 0xff

    .line 28
    .line 29
    int-to-short v4, v4

    .line 30
    shr-int/lit8 v4, v4, 0x4

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x2

    .line 33
    .line 34
    aget-byte v1, p3, v1

    .line 35
    .line 36
    and-int/lit16 v1, v1, 0xff

    .line 37
    .line 38
    int-to-short v1, v1

    .line 39
    shl-int/lit8 v1, v1, 0x4

    .line 40
    .line 41
    or-int/2addr v1, v4

    .line 42
    and-int/lit16 v1, v1, 0xfff

    .line 43
    .line 44
    int-to-short v1, v1

    .line 45
    const/16 v4, 0xd01

    .line 46
    .line 47
    if-ge v3, v4, :cond_0

    .line 48
    .line 49
    add-int v5, p1, v0

    .line 50
    .line 51
    invoke-virtual {p0, v5, v3}, Lgh/i;->j(IS)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    :cond_0
    if-ge v0, p2, :cond_1

    .line 57
    .line 58
    if-ge v1, v4, :cond_1

    .line 59
    .line 60
    add-int v3, p1, v0

    .line 61
    .line 62
    invoke-virtual {p0, v3, v1}, Lgh/i;->j(IS)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    :cond_1
    move v1, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return v0
.end method


# virtual methods
.method a([B)[[B
    .locals 9

    .line 1
    new-instance v0, Lgh/j;

    .line 2
    .line 3
    iget-object v1, p0, Lgh/c;->a:Lgh/b;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lgh/j;-><init>(Lgh/b;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lgh/j;

    .line 9
    .line 10
    iget-object v2, p0, Lgh/c;->a:Lgh/b;

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lgh/j;-><init>(Lgh/b;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lgh/j;

    .line 16
    .line 17
    iget-object v3, p0, Lgh/c;->a:Lgh/b;

    .line 18
    .line 19
    invoke-direct {v2, v3}, Lgh/j;-><init>(Lgh/b;)V

    .line 20
    .line 21
    .line 22
    const/16 v3, 0x40

    .line 23
    .line 24
    new-array v3, v3, [B

    .line 25
    .line 26
    iget-object v4, p0, Lgh/c;->h:Lgh/l;

    .line 27
    .line 28
    iget v5, p0, Lgh/c;->b:I

    .line 29
    .line 30
    int-to-byte v5, v5

    .line 31
    invoke-static {p1, v5}, LOh/a;->a([BB)[B

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v4, v3, p1}, Lgh/l;->a([B[B)V

    .line 36
    .line 37
    .line 38
    const/16 p1, 0x20

    .line 39
    .line 40
    new-array v4, p1, [B

    .line 41
    .line 42
    new-array v5, p1, [B

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-static {v3, v6, v4, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    .line 47
    .line 48
    invoke-static {v3, p1, v5, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    iget p1, p0, Lgh/c;->b:I

    .line 52
    .line 53
    new-array p1, p1, [Lgh/j;

    .line 54
    .line 55
    move v3, v6

    .line 56
    :goto_0
    iget v7, p0, Lgh/c;->b:I

    .line 57
    .line 58
    if-ge v3, v7, :cond_0

    .line 59
    .line 60
    new-instance v7, Lgh/j;

    .line 61
    .line 62
    iget-object v8, p0, Lgh/c;->a:Lgh/b;

    .line 63
    .line 64
    invoke-direct {v7, v8}, Lgh/j;-><init>(Lgh/b;)V

    .line 65
    .line 66
    .line 67
    aput-object v7, p1, v3

    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p0, p1, v4, v6}, Lgh/c;->b([Lgh/j;[BZ)V

    .line 73
    .line 74
    .line 75
    move v3, v6

    .line 76
    move v7, v3

    .line 77
    :goto_1
    iget v8, p0, Lgh/c;->b:I

    .line 78
    .line 79
    if-ge v3, v8, :cond_1

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Lgh/j;->b(I)Lgh/i;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-virtual {v8, v5, v7}, Lgh/i;->g([BB)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v7, v7, 0x1

    .line 89
    .line 90
    int-to-byte v7, v7

    .line 91
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    move v3, v6

    .line 95
    :goto_2
    iget v8, p0, Lgh/c;->b:I

    .line 96
    .line 97
    if-ge v3, v8, :cond_2

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Lgh/j;->b(I)Lgh/i;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v8, v5, v7}, Lgh/i;->g([BB)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v7, v7, 0x1

    .line 107
    .line 108
    int-to-byte v7, v7

    .line 109
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    invoke-virtual {v0}, Lgh/j;->d()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lgh/j;->d()V

    .line 116
    .line 117
    .line 118
    :goto_3
    iget v3, p0, Lgh/c;->b:I

    .line 119
    .line 120
    if-ge v6, v3, :cond_3

    .line 121
    .line 122
    invoke-virtual {v1, v6}, Lgh/j;->b(I)Lgh/i;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    aget-object v5, p1, v6

    .line 127
    .line 128
    iget-object v7, p0, Lgh/c;->a:Lgh/b;

    .line 129
    .line 130
    invoke-static {v3, v5, v0, v7}, Lgh/j;->c(Lgh/i;Lgh/j;Lgh/j;Lgh/b;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v6}, Lgh/j;->b(I)Lgh/i;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3}, Lgh/i;->d()V

    .line 138
    .line 139
    .line 140
    add-int/lit8 v6, v6, 0x1

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_3
    invoke-virtual {v1, v2}, Lgh/j;->a(Lgh/j;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Lgh/j;->e()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, v1, v4}, Lgh/c;->c(Lgh/j;[B)[B

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p0, v0}, Lgh/c;->d(Lgh/j;)[B

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    filled-new-array {p1, v0}, [[B

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1
.end method

.method public b([Lgh/j;[BZ)V
    .locals 10

    .line 1
    iget v0, p0, Lgh/c;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lgh/c;->h:Lgh/l;

    .line 4
    .line 5
    iget v1, v1, Lgh/l;->a:I

    .line 6
    .line 7
    mul-int/2addr v0, v1

    .line 8
    add-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    iget v3, p0, Lgh/c;->b:I

    .line 15
    .line 16
    if-ge v2, v3, :cond_4

    .line 17
    .line 18
    move v3, v1

    .line 19
    :goto_1
    iget v4, p0, Lgh/c;->b:I

    .line 20
    .line 21
    if-ge v3, v4, :cond_3

    .line 22
    .line 23
    iget-object v4, p0, Lgh/c;->h:Lgh/l;

    .line 24
    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    int-to-byte v5, v2

    .line 28
    int-to-byte v6, v3

    .line 29
    :goto_2
    invoke-virtual {v4, p2, v5, v6}, Lgh/l;->d([BBB)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    int-to-byte v5, v3

    .line 34
    int-to-byte v6, v2

    .line 35
    goto :goto_2

    .line 36
    :goto_3
    iget-object v4, p0, Lgh/c;->h:Lgh/l;

    .line 37
    .line 38
    iget v5, v4, Lgh/l;->a:I

    .line 39
    .line 40
    iget v6, p0, Lgh/c;->i:I

    .line 41
    .line 42
    mul-int/2addr v5, v6

    .line 43
    invoke-virtual {v4, v0, v1, v5}, Lgh/l;->e([BII)V

    .line 44
    .line 45
    .line 46
    iget v4, p0, Lgh/c;->i:I

    .line 47
    .line 48
    iget-object v5, p0, Lgh/c;->h:Lgh/l;

    .line 49
    .line 50
    iget v5, v5, Lgh/l;->a:I

    .line 51
    .line 52
    mul-int/2addr v4, v5

    .line 53
    aget-object v5, p1, v2

    .line 54
    .line 55
    invoke-virtual {v5, v3}, Lgh/j;->b(I)Lgh/i;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const/16 v6, 0x100

    .line 60
    .line 61
    invoke-static {v5, v1, v6, v0, v4}, Lgh/c;->e(Lgh/i;II[BI)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    :goto_4
    if-ge v5, v6, :cond_2

    .line 66
    .line 67
    rem-int/lit8 v7, v4, 0x3

    .line 68
    .line 69
    move v8, v1

    .line 70
    :goto_5
    if-ge v8, v7, :cond_1

    .line 71
    .line 72
    sub-int v9, v4, v7

    .line 73
    .line 74
    add-int/2addr v9, v8

    .line 75
    aget-byte v9, v0, v9

    .line 76
    .line 77
    aput-byte v9, v0, v8

    .line 78
    .line 79
    add-int/lit8 v8, v8, 0x1

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_1
    iget-object v4, p0, Lgh/c;->h:Lgh/l;

    .line 83
    .line 84
    iget v8, v4, Lgh/l;->a:I

    .line 85
    .line 86
    mul-int/lit8 v8, v8, 0x2

    .line 87
    .line 88
    invoke-virtual {v4, v0, v7, v8}, Lgh/l;->e([BII)V

    .line 89
    .line 90
    .line 91
    iget-object v4, p0, Lgh/c;->h:Lgh/l;

    .line 92
    .line 93
    iget v4, v4, Lgh/l;->a:I

    .line 94
    .line 95
    add-int/2addr v4, v7

    .line 96
    aget-object v7, p1, v2

    .line 97
    .line 98
    invoke-virtual {v7, v3}, Lgh/j;->b(I)Lgh/i;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    rsub-int v8, v5, 0x100

    .line 103
    .line 104
    invoke-static {v7, v5, v8, v0, v4}, Lgh/c;->e(Lgh/i;II[BI)I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    add-int/2addr v5, v7

    .line 109
    goto :goto_4

    .line 110
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_4
    return-void
.end method

.method public c(Lgh/j;[B)[B
    .locals 3

    .line 1
    iget v0, p0, Lgh/c;->c:I

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    invoke-virtual {p1}, Lgh/j;->f()[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v1, p0, Lgh/c;->d:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    iget p1, p0, Lgh/c;->d:I

    .line 16
    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    invoke-static {p2, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public d(Lgh/j;)[B
    .locals 0

    .line 1
    invoke-virtual {p1}, Lgh/j;->f()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
