.class abstract Lfh/g;
.super Ljava/lang/Object;


# direct methods
.method static a(Lfh/i;Lfh/a;)[B
    .locals 6

    .line 1
    invoke-virtual {p1}, Lfh/a;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x20

    .line 6
    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    invoke-virtual {p1}, Lfh/a;->f()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v2, v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Lfh/i;->c(I)Lfh/h;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Lfh/h;->n()[B

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    mul-int/lit16 v4, v2, 0x140

    .line 26
    .line 27
    const/16 v5, 0x140

    .line 28
    .line 29
    invoke-static {v3, v1, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-object v0
.end method

.method static b([B[B[BLfh/i;Lfh/j;Lfh/i;Lfh/a;)[[B
    .locals 4

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [[B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-object p0, v0, v1

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    aput-object p2, v0, p0

    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    aput-object p1, v0, p0

    .line 12
    .line 13
    invoke-virtual {p6}, Lfh/a;->g()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-virtual {p6}, Lfh/a;->h()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    mul-int/2addr p0, p1

    .line 22
    new-array p0, p0, [B

    .line 23
    .line 24
    const/4 p1, 0x3

    .line 25
    aput-object p0, v0, p1

    .line 26
    .line 27
    move p0, v1

    .line 28
    :goto_0
    invoke-virtual {p6}, Lfh/a;->g()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-ge p0, p2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p4, p0}, Lfh/j;->b(I)Lfh/h;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    aget-object v2, v0, p1

    .line 39
    .line 40
    invoke-virtual {p6}, Lfh/a;->h()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    mul-int/2addr v3, p0

    .line 45
    invoke-virtual {p2, v2, v3}, Lfh/h;->i([BI)[B

    .line 46
    .line 47
    .line 48
    add-int/lit8 p0, p0, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p6}, Lfh/a;->f()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {p6}, Lfh/a;->h()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    mul-int/2addr p0, p1

    .line 60
    new-array p0, p0, [B

    .line 61
    .line 62
    const/4 p1, 0x4

    .line 63
    aput-object p0, v0, p1

    .line 64
    .line 65
    move p0, v1

    .line 66
    :goto_1
    invoke-virtual {p6}, Lfh/a;->f()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-ge p0, p2, :cond_1

    .line 71
    .line 72
    invoke-virtual {p5, p0}, Lfh/i;->c(I)Lfh/h;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    aget-object p4, v0, p1

    .line 77
    .line 78
    invoke-virtual {p6}, Lfh/a;->h()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    mul-int/2addr v2, p0

    .line 83
    invoke-virtual {p2, p4, v2}, Lfh/h;->i([BI)[B

    .line 84
    .line 85
    .line 86
    add-int/lit8 p0, p0, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {p6}, Lfh/a;->f()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    mul-int/lit16 p0, p0, 0x1a0

    .line 94
    .line 95
    new-array p0, p0, [B

    .line 96
    .line 97
    const/4 p1, 0x5

    .line 98
    aput-object p0, v0, p1

    .line 99
    .line 100
    :goto_2
    invoke-virtual {p6}, Lfh/a;->f()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-ge v1, p0, :cond_2

    .line 105
    .line 106
    invoke-virtual {p3, v1}, Lfh/i;->c(I)Lfh/h;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    aget-object p2, v0, p1

    .line 111
    .line 112
    mul-int/lit16 p4, v1, 0x1a0

    .line 113
    .line 114
    invoke-virtual {p0, p2, p4}, Lfh/h;->l([BI)[B

    .line 115
    .line 116
    .line 117
    add-int/lit8 v1, v1, 0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    return-object v0
.end method

.method static c(Lfh/i;Lfh/j;Lfh/i;[B[B[BLfh/a;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p6}, Lfh/a;->g()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Lfh/j;->b(I)Lfh/h;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p6}, Lfh/a;->h()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    mul-int/2addr v3, v1

    .line 18
    invoke-virtual {v2, p4, v3}, Lfh/h;->j([BI)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v0

    .line 25
    :goto_1
    invoke-virtual {p6}, Lfh/a;->f()I

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-ge p1, p4, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Lfh/i;->c(I)Lfh/h;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    invoke-virtual {p6}, Lfh/a;->h()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    mul-int/2addr v1, p1

    .line 40
    invoke-virtual {p4, p5, v1}, Lfh/h;->j([BI)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_2
    invoke-virtual {p6}, Lfh/a;->f()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-ge v0, p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lfh/i;->c(I)Lfh/h;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    mul-int/lit16 p2, v0, 0x1a0

    .line 57
    .line 58
    invoke-virtual {p1, p3, p2}, Lfh/h;->m([BI)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    return-void
.end method
