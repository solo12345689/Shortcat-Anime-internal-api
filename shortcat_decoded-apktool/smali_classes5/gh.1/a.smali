.class abstract Lgh/a;
.super Ljava/lang/Object;


# direct methods
.method private static a([BI)J
    .locals 5

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    int-to-long v0, v0

    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    aget-byte v2, p0, v2

    .line 9
    .line 10
    and-int/lit16 v2, v2, 0xff

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const/16 v4, 0x8

    .line 14
    .line 15
    shl-long/2addr v2, v4

    .line 16
    or-long/2addr v0, v2

    .line 17
    add-int/lit8 p1, p1, 0x2

    .line 18
    .line 19
    aget-byte p0, p0, p1

    .line 20
    .line 21
    and-int/lit16 p0, p0, 0xff

    .line 22
    .line 23
    int-to-long p0, p0

    .line 24
    const/16 v2, 0x10

    .line 25
    .line 26
    shl-long/2addr p0, v2

    .line 27
    or-long/2addr p0, v0

    .line 28
    return-wide p0
.end method

.method private static b([BI)J
    .locals 5

    .line 1
    aget-byte v0, p0, p1

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0xff

    .line 4
    .line 5
    int-to-long v0, v0

    .line 6
    add-int/lit8 v2, p1, 0x1

    .line 7
    .line 8
    aget-byte v2, p0, v2

    .line 9
    .line 10
    and-int/lit16 v2, v2, 0xff

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const/16 v4, 0x8

    .line 14
    .line 15
    shl-long/2addr v2, v4

    .line 16
    or-long/2addr v0, v2

    .line 17
    add-int/lit8 v2, p1, 0x2

    .line 18
    .line 19
    aget-byte v2, p0, v2

    .line 20
    .line 21
    and-int/lit16 v2, v2, 0xff

    .line 22
    .line 23
    int-to-long v2, v2

    .line 24
    const/16 v4, 0x10

    .line 25
    .line 26
    shl-long/2addr v2, v4

    .line 27
    or-long/2addr v0, v2

    .line 28
    add-int/lit8 p1, p1, 0x3

    .line 29
    .line 30
    aget-byte p0, p0, p1

    .line 31
    .line 32
    and-int/lit16 p0, p0, 0xff

    .line 33
    .line 34
    int-to-long p0, p0

    .line 35
    const/16 v2, 0x18

    .line 36
    .line 37
    shl-long/2addr p0, v2

    .line 38
    or-long/2addr p0, v0

    .line 39
    return-wide p0
.end method

.method public static c(Lgh/i;[BI)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x3

    .line 4
    if-eq p2, v2, :cond_1

    .line 5
    .line 6
    move v2, v0

    .line 7
    :goto_0
    const/16 v3, 0x20

    .line 8
    .line 9
    if-ge v2, v3, :cond_3

    .line 10
    .line 11
    mul-int/lit8 v3, v2, 0x4

    .line 12
    .line 13
    invoke-static {p1, v3}, Lgh/a;->b([BI)J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide/32 v5, 0x55555555

    .line 18
    .line 19
    .line 20
    and-long v7, v3, v5

    .line 21
    .line 22
    shr-long/2addr v3, v1

    .line 23
    and-long/2addr v3, v5

    .line 24
    add-long/2addr v7, v3

    .line 25
    move v3, v0

    .line 26
    :goto_1
    const/16 v4, 0x8

    .line 27
    .line 28
    if-ge v3, v4, :cond_0

    .line 29
    .line 30
    mul-int/lit8 v4, v3, 0x4

    .line 31
    .line 32
    shr-long v5, v7, v4

    .line 33
    .line 34
    const-wide/16 v9, 0x3

    .line 35
    .line 36
    and-long/2addr v5, v9

    .line 37
    long-to-int v5, v5

    .line 38
    int-to-short v5, v5

    .line 39
    add-int/2addr v4, p2

    .line 40
    shr-long v11, v7, v4

    .line 41
    .line 42
    and-long/2addr v9, v11

    .line 43
    long-to-int v4, v9

    .line 44
    int-to-short v4, v4

    .line 45
    mul-int/lit8 v6, v2, 0x8

    .line 46
    .line 47
    add-int/2addr v6, v3

    .line 48
    sub-int/2addr v5, v4

    .line 49
    int-to-short v4, v5

    .line 50
    invoke-virtual {p0, v6, v4}, Lgh/i;->j(IS)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move p2, v0

    .line 60
    :goto_2
    const/16 v3, 0x40

    .line 61
    .line 62
    if-ge p2, v3, :cond_3

    .line 63
    .line 64
    mul-int/lit8 v3, p2, 0x3

    .line 65
    .line 66
    invoke-static {p1, v3}, Lgh/a;->a([BI)J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    const-wide/32 v5, 0x249249

    .line 71
    .line 72
    .line 73
    and-long v7, v3, v5

    .line 74
    .line 75
    shr-long v9, v3, v1

    .line 76
    .line 77
    and-long/2addr v9, v5

    .line 78
    add-long/2addr v7, v9

    .line 79
    const/4 v9, 0x2

    .line 80
    shr-long/2addr v3, v9

    .line 81
    and-long/2addr v3, v5

    .line 82
    add-long/2addr v7, v3

    .line 83
    move v3, v0

    .line 84
    :goto_3
    const/4 v4, 0x4

    .line 85
    if-ge v3, v4, :cond_2

    .line 86
    .line 87
    mul-int/lit8 v4, v3, 0x6

    .line 88
    .line 89
    shr-long v5, v7, v4

    .line 90
    .line 91
    const-wide/16 v9, 0x7

    .line 92
    .line 93
    and-long/2addr v5, v9

    .line 94
    long-to-int v5, v5

    .line 95
    int-to-short v5, v5

    .line 96
    add-int/2addr v4, v2

    .line 97
    shr-long v11, v7, v4

    .line 98
    .line 99
    and-long/2addr v9, v11

    .line 100
    long-to-int v4, v9

    .line 101
    int-to-short v4, v4

    .line 102
    mul-int/lit8 v6, p2, 0x4

    .line 103
    .line 104
    add-int/2addr v6, v3

    .line 105
    sub-int/2addr v5, v4

    .line 106
    int-to-short v4, v5

    .line 107
    invoke-virtual {p0, v6, v4}, Lgh/i;->j(IS)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    return-void
.end method
