.class abstract Ldh/o;
.super Ljava/lang/Object;


# direct methods
.method public static a([BILdh/e;)I
    .locals 5

    .line 1
    invoke-virtual {p2}, Ldh/e;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    shl-int v0, v1, v0

    .line 7
    .line 8
    sub-int/2addr v0, v1

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    mul-int/lit8 v3, p1, 0x8

    .line 12
    .line 13
    invoke-virtual {p2}, Ldh/e;->h()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    div-int/2addr v3, v4

    .line 18
    if-ge v1, v3, :cond_0

    .line 19
    .line 20
    add-int/2addr v2, v0

    .line 21
    invoke-virtual {p2}, Ldh/e;->h()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-static {p0, v1, v3}, Ldh/o;->b([BII)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sub-int/2addr v2, v3

    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p2}, Ldh/e;->c()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    shl-int p0, v2, p0

    .line 38
    .line 39
    return p0
.end method

.method public static b([BII)I
    .locals 3

    .line 1
    mul-int v0, p1, p2

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    div-int/2addr v0, v1

    .line 6
    div-int/2addr v1, p2

    .line 7
    not-int p1, p1

    .line 8
    const/4 v2, 0x1

    .line 9
    sub-int/2addr v1, v2

    .line 10
    and-int/2addr p1, v1

    .line 11
    mul-int/2addr p1, p2

    .line 12
    shl-int p2, v2, p2

    .line 13
    .line 14
    sub-int/2addr p2, v2

    .line 15
    aget-byte p0, p0, v0

    .line 16
    .line 17
    ushr-int/2addr p0, p1

    .line 18
    and-int/2addr p0, p2

    .line 19
    return p0
.end method

.method public static c(Ldh/f;[B[B)Ldh/g;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ldh/f;->c()Ldh/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ldh/e;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Ldh/e;->e()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {v1}, Ldh/e;->h()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    mul-int v5, v3, v2

    .line 20
    .line 21
    new-array v5, v5, [B

    .line 22
    .line 23
    invoke-static {v1}, Ldh/b;->c(Ldh/e;)LFg/j;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual/range {p0 .. p0}, Ldh/f;->a()Ldh/q;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v0, v2, v1}, Ldh/o;->a([BILdh/e;)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    ushr-int/lit8 v9, v8, 0x8

    .line 36
    .line 37
    and-int/lit16 v9, v9, 0xff

    .line 38
    .line 39
    int-to-byte v9, v9

    .line 40
    aput-byte v9, v0, v2

    .line 41
    .line 42
    add-int/lit8 v9, v2, 0x1

    .line 43
    .line 44
    int-to-byte v8, v8

    .line 45
    aput-byte v8, v0, v9

    .line 46
    .line 47
    invoke-static {}, Ldh/a;->f()Ldh/a;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-virtual/range {p0 .. p0}, Ldh/f;->b()[B

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-virtual {v8, v9}, Ldh/a;->d([B)Ldh/a;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual/range {p0 .. p0}, Ldh/f;->d()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    invoke-virtual {v8, v9}, Ldh/a;->i(I)Ldh/a;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    add-int/lit8 v9, v2, 0x17

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    invoke-virtual {v8, v10, v9}, Ldh/a;->g(II)Ldh/a;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v8}, Ldh/a;->b()[B

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v7, v10}, Ldh/q;->d(I)V

    .line 79
    .line 80
    .line 81
    move v11, v10

    .line 82
    :goto_0
    if-ge v11, v3, :cond_2

    .line 83
    .line 84
    int-to-short v12, v11

    .line 85
    const/16 v13, 0x14

    .line 86
    .line 87
    invoke-static {v12, v8, v13}, LOh/g;->k(S[BI)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v12, v3, -0x1

    .line 91
    .line 92
    if-ge v11, v12, :cond_0

    .line 93
    .line 94
    const/4 v12, 0x1

    .line 95
    goto :goto_1

    .line 96
    :cond_0
    move v12, v10

    .line 97
    :goto_1
    const/16 v13, 0x17

    .line 98
    .line 99
    invoke-virtual {v7, v8, v12, v13}, Ldh/q;->b([BZI)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v11, v4}, Ldh/o;->b([BII)I

    .line 103
    .line 104
    .line 105
    move-result v12

    .line 106
    move v14, v10

    .line 107
    :goto_2
    if-ge v14, v12, :cond_1

    .line 108
    .line 109
    const/16 p0, 0x16

    .line 110
    .line 111
    int-to-byte v15, v14

    .line 112
    aput-byte v15, v8, p0

    .line 113
    .line 114
    invoke-interface {v6, v8, v10, v9}, LFg/j;->update([BII)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v6, v8, v13}, LFg/j;->a([BI)I

    .line 118
    .line 119
    .line 120
    add-int/lit8 v14, v14, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_1
    mul-int v12, v2, v11

    .line 124
    .line 125
    invoke-static {v8, v13, v5, v12, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v11, v11, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_2
    new-instance v0, Ldh/g;

    .line 132
    .line 133
    move-object/from16 v2, p2

    .line 134
    .line 135
    invoke-direct {v0, v1, v2, v5}, Ldh/g;-><init>(Ldh/e;[B[B)V

    .line 136
    .line 137
    .line 138
    return-object v0
.end method

.method static d(Ldh/e;[BI[B)[B
    .locals 10

    .line 1
    invoke-static {p0}, Ldh/b;->c(Ldh/e;)LFg/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ldh/a;->f()Ldh/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, p1}, Ldh/a;->d([B)Ldh/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p2}, Ldh/a;->i(I)Ldh/a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/16 v2, -0x7f80

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ldh/a;->h(I)Ldh/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    const/16 v3, 0x16

    .line 25
    .line 26
    invoke-virtual {v1, v2, v3}, Ldh/a;->g(II)Ldh/a;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ldh/a;->b()[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    array-length v4, v1

    .line 35
    invoke-interface {v0, v1, v2, v4}, LFg/j;->update([BII)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Ldh/b;->c(Ldh/e;)LFg/j;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {}, Ldh/a;->f()Ldh/a;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4, p1}, Ldh/a;->d([B)Ldh/a;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4, p2}, Ldh/a;->i(I)Ldh/a;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-interface {v1}, LFg/j;->d()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/16 v6, 0x17

    .line 59
    .line 60
    add-int/2addr v5, v6

    .line 61
    invoke-virtual {v4, v2, v5}, Ldh/a;->g(II)Ldh/a;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ldh/a;->b()[B

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    new-instance v5, Ldh/q;

    .line 70
    .line 71
    invoke-static {p0}, Ldh/b;->c(Ldh/e;)LFg/j;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-direct {v5, p1, p3, v7}, Ldh/q;-><init>([B[BLFg/j;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, p2}, Ldh/q;->e(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v2}, Ldh/q;->d(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ldh/e;->e()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-virtual {p0}, Ldh/e;->d()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-virtual {p0}, Ldh/e;->h()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    const/4 p3, 0x1

    .line 97
    shl-int p0, p3, p0

    .line 98
    .line 99
    sub-int/2addr p0, p3

    .line 100
    move v7, v2

    .line 101
    :goto_0
    if-ge v7, p1, :cond_2

    .line 102
    .line 103
    add-int/lit8 v8, p1, -0x1

    .line 104
    .line 105
    if-ge v7, v8, :cond_0

    .line 106
    .line 107
    move v8, p3

    .line 108
    goto :goto_1

    .line 109
    :cond_0
    move v8, v2

    .line 110
    :goto_1
    invoke-virtual {v5, v4, v8, v6}, Ldh/q;->b([BZI)V

    .line 111
    .line 112
    .line 113
    int-to-short v8, v7

    .line 114
    const/16 v9, 0x14

    .line 115
    .line 116
    invoke-static {v8, v4, v9}, LOh/g;->k(S[BI)V

    .line 117
    .line 118
    .line 119
    move v8, v2

    .line 120
    :goto_2
    if-ge v8, p0, :cond_1

    .line 121
    .line 122
    int-to-byte v9, v8

    .line 123
    aput-byte v9, v4, v3

    .line 124
    .line 125
    array-length v9, v4

    .line 126
    invoke-interface {v1, v4, v2, v9}, LFg/j;->update([BII)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v1, v4, v6}, LFg/j;->a([BI)I

    .line 130
    .line 131
    .line 132
    add-int/lit8 v8, v8, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_1
    invoke-interface {v0, v4, v6, p2}, LFg/j;->update([BII)V

    .line 136
    .line 137
    .line 138
    add-int/lit8 v7, v7, 0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_2
    invoke-interface {v0}, LFg/j;->d()I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    new-array p0, p0, [B

    .line 146
    .line 147
    invoke-interface {v0, p0, v2}, LFg/j;->a([BI)I

    .line 148
    .line 149
    .line 150
    return-object p0
.end method
