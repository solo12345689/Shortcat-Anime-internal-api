.class abstract LRh/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:[I

.field private static final b:[I

.field private static final c:[I

.field private static final d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LRh/e;->a:[I

    .line 9
    .line 10
    const/16 v0, 0x10

    .line 11
    .line 12
    new-array v1, v0, [I

    .line 13
    .line 14
    fill-array-data v1, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v1, LRh/e;->b:[I

    .line 18
    .line 19
    new-array v1, v0, [I

    .line 20
    .line 21
    fill-array-data v1, :array_2

    .line 22
    .line 23
    .line 24
    sput-object v1, LRh/e;->c:[I

    .line 25
    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    fill-array-data v0, :array_3

    .line 29
    .line 30
    .line 31
    sput-object v0, LRh/e;->d:[I

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x0
        0x5
        0x11
        0x6
        0x10
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
    .end array-data

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    :array_1
    .array-data 4
        0x3
        0x2
        0x1
        0x0
        0x3
        0x3
        0x3
        0x3
        0x3
        0x3
        0x2
        0x2
        0x2
        0x2
        0x2
        0x2
    .end array-data

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    :array_2
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        -0x1
        0x1
        -0x2
        0x2
        -0x3
        0x3
        -0x1
        0x1
        -0x2
        0x2
        -0x3
        0x3
    .end array-data

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    :array_3
    .array-data 4
        0x20000
        0x20004
        0x20003
        0x30002
        0x20000
        0x20004
        0x20003
        0x40001
        0x20000
        0x20004
        0x20003
        0x30002
        0x20000
        0x20004
        0x20003
        0x40005
    .end array-data
.end method

.method private static a(LRh/k;)V
    .locals 6

    .line 1
    iget-object v0, p0, LRh/k;->c:LRh/a;

    .line 2
    .line 3
    iget-object v1, p0, LRh/k;->d:[B

    .line 4
    .line 5
    iget v2, p0, LRh/k;->g:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-gtz v2, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, LRh/a;->k(LRh/a;)V

    .line 11
    .line 12
    .line 13
    iput v3, p0, LRh/k;->a:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget v4, p0, LRh/k;->Q:I

    .line 17
    .line 18
    iget v5, p0, LRh/k;->r:I

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget v4, p0, LRh/k;->r:I

    .line 26
    .line 27
    invoke-static {v0, v1, v4, v2}, LRh/a;->c(LRh/a;[BII)V

    .line 28
    .line 29
    .line 30
    iget v1, p0, LRh/k;->g:I

    .line 31
    .line 32
    sub-int/2addr v1, v2

    .line 33
    iput v1, p0, LRh/k;->g:I

    .line 34
    .line 35
    iget v1, p0, LRh/k;->r:I

    .line 36
    .line 37
    add-int/2addr v1, v2

    .line 38
    iput v1, p0, LRh/k;->r:I

    .line 39
    .line 40
    iget v2, p0, LRh/k;->Q:I

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x5

    .line 45
    iput v0, p0, LRh/k;->b:I

    .line 46
    .line 47
    iput v2, p0, LRh/k;->Y:I

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    iput v0, p0, LRh/k;->X:I

    .line 51
    .line 52
    const/16 v0, 0xc

    .line 53
    .line 54
    iput v0, p0, LRh/k;->a:I

    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-static {v0}, LRh/a;->k(LRh/a;)V

    .line 58
    .line 59
    .line 60
    iput v3, p0, LRh/k;->a:I

    .line 61
    .line 62
    return-void
.end method

.method private static b(LRh/k;I)V
    .locals 7

    .line 1
    iget-object v0, p0, LRh/k;->c:LRh/a;

    .line 2
    .line 3
    iget-object v1, p0, LRh/k;->p:[I

    .line 4
    .line 5
    mul-int/lit8 v2, p1, 0x2

    .line 6
    .line 7
    invoke-static {v0}, LRh/a;->d(LRh/a;)V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, LRh/k;->e:[I

    .line 11
    .line 12
    mul-int/lit16 v4, p1, 0x438

    .line 13
    .line 14
    invoke-static {v3, v4, v0}, LRh/e;->r([IILRh/a;)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget-object v5, p0, LRh/k;->n:[I

    .line 19
    .line 20
    iget-object v6, p0, LRh/k;->f:[I

    .line 21
    .line 22
    invoke-static {v6, v4, v0}, LRh/e;->m([IILRh/a;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    aput v0, v5, p1

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    if-ne v3, v0, :cond_0

    .line 30
    .line 31
    add-int/lit8 v3, v2, 0x1

    .line 32
    .line 33
    aget v3, v1, v3

    .line 34
    .line 35
    add-int/2addr v3, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    if-nez v3, :cond_1

    .line 38
    .line 39
    aget v3, v1, v2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    add-int/lit8 v3, v3, -0x2

    .line 43
    .line 44
    :goto_0
    iget-object p0, p0, LRh/k;->o:[I

    .line 45
    .line 46
    aget p0, p0, p1

    .line 47
    .line 48
    if-lt v3, p0, :cond_2

    .line 49
    .line 50
    sub-int/2addr v3, p0

    .line 51
    :cond_2
    add-int/lit8 p0, v2, 0x1

    .line 52
    .line 53
    aget p1, v1, p0

    .line 54
    .line 55
    aput p1, v1, v2

    .line 56
    .line 57
    aput v3, v1, p0

    .line 58
    .line 59
    return-void
.end method

.method private static c(LRh/k;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, LRh/e;->b(LRh/k;I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LRh/k;->l:LRh/h;

    .line 6
    .line 7
    iget-object v0, v0, LRh/h;->c:[I

    .line 8
    .line 9
    iget-object v1, p0, LRh/k;->p:[I

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    aget v1, v1, v2

    .line 13
    .line 14
    aget v0, v0, v1

    .line 15
    .line 16
    iput v0, p0, LRh/k;->F:I

    .line 17
    .line 18
    return-void
.end method

.method private static d(I[BLRh/a;)I
    .locals 8

    .line 1
    invoke-static {p2}, LRh/a;->j(LRh/a;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, LRh/e;->h(LRh/a;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    add-int/2addr v0, v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1, v2, p0}, LRh/m;->a([BII)V

    .line 14
    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    invoke-static {p2, v1}, LRh/a;->i(LRh/a;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v3, v1, :cond_1

    .line 22
    .line 23
    move v3, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v3, v2

    .line 26
    :goto_0
    if-eqz v3, :cond_2

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    invoke-static {p2, v3}, LRh/a;->i(LRh/a;I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    add-int/2addr v3, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v3, v2

    .line 36
    :goto_1
    const/16 v4, 0x438

    .line 37
    .line 38
    new-array v4, v4, [I

    .line 39
    .line 40
    add-int v5, v0, v3

    .line 41
    .line 42
    invoke-static {v5, v4, v2, p2}, LRh/e;->n(I[IILRh/a;)V

    .line 43
    .line 44
    .line 45
    move v5, v2

    .line 46
    :cond_3
    :goto_2
    if-ge v5, p0, :cond_7

    .line 47
    .line 48
    invoke-static {p2}, LRh/a;->j(LRh/a;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, LRh/a;->d(LRh/a;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v4, v2, p2}, LRh/e;->r([IILRh/a;)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    aput-byte v2, p1, v5

    .line 61
    .line 62
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    if-gt v6, v3, :cond_6

    .line 66
    .line 67
    shl-int v7, v1, v6

    .line 68
    .line 69
    invoke-static {p2, v6}, LRh/a;->i(LRh/a;I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    add-int/2addr v7, v6

    .line 74
    :goto_4
    if-eqz v7, :cond_3

    .line 75
    .line 76
    if-ge v5, p0, :cond_5

    .line 77
    .line 78
    aput-byte v2, p1, v5

    .line 79
    .line 80
    add-int/lit8 v5, v5, 0x1

    .line 81
    .line 82
    add-int/lit8 v7, v7, -0x1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    new-instance p0, LRh/c;

    .line 86
    .line 87
    const-string p1, "Corrupted context map"

    .line 88
    .line 89
    invoke-direct {p0, p1}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0

    .line 93
    :cond_6
    sub-int/2addr v6, v3

    .line 94
    int-to-byte v6, v6

    .line 95
    aput-byte v6, p1, v5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_7
    invoke-static {p2, v1}, LRh/a;->i(LRh/a;I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-ne p2, v1, :cond_8

    .line 103
    .line 104
    invoke-static {p1, p0}, LRh/e;->j([BI)V

    .line 105
    .line 106
    .line 107
    :cond_8
    return v0
.end method

.method private static e(LRh/k;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p0, v0}, LRh/e;->b(LRh/k;I)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, LRh/k;->p:[I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    aget v1, v1, v2

    .line 9
    .line 10
    shl-int/lit8 v0, v1, 0x2

    .line 11
    .line 12
    iput v0, p0, LRh/k;->C:I

    .line 13
    .line 14
    return-void
.end method

.method private static f(LRh/k;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, LRh/e;->b(LRh/k;I)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LRh/k;->p:[I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    aget v0, v0, v1

    .line 9
    .line 10
    shl-int/lit8 v2, v0, 0x6

    .line 11
    .line 12
    iput v2, p0, LRh/k;->B:I

    .line 13
    .line 14
    iget-object v3, p0, LRh/k;->A:[B

    .line 15
    .line 16
    aget-byte v2, v3, v2

    .line 17
    .line 18
    and-int/lit16 v2, v2, 0xff

    .line 19
    .line 20
    iput v2, p0, LRh/k;->v:I

    .line 21
    .line 22
    iget-object v3, p0, LRh/k;->k:LRh/h;

    .line 23
    .line 24
    iget-object v3, v3, LRh/h;->c:[I

    .line 25
    .line 26
    aget v2, v3, v2

    .line 27
    .line 28
    iput v2, p0, LRh/k;->w:I

    .line 29
    .line 30
    iget-object v2, p0, LRh/k;->z:[B

    .line 31
    .line 32
    aget-byte v0, v2, v0

    .line 33
    .line 34
    sget-object v2, LRh/d;->b:[I

    .line 35
    .line 36
    aget v3, v2, v0

    .line 37
    .line 38
    iput v3, p0, LRh/k;->D:I

    .line 39
    .line 40
    add-int/2addr v0, v1

    .line 41
    aget v0, v2, v0

    .line 42
    .line 43
    iput v0, p0, LRh/k;->E:I

    .line 44
    .line 45
    return-void
.end method

.method private static g(LRh/a;LRh/k;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, LRh/a;->i(LRh/a;I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v1, v0, :cond_0

    .line 8
    .line 9
    move v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v2

    .line 12
    :goto_0
    iput-boolean v1, p1, LRh/k;->h:Z

    .line 13
    .line 14
    iput v2, p1, LRh/k;->g:I

    .line 15
    .line 16
    iput-boolean v2, p1, LRh/k;->i:Z

    .line 17
    .line 18
    iput-boolean v2, p1, LRh/k;->j:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-static {p0, v0}, LRh/a;->i(LRh/a;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_1
    const/4 v1, 0x2

    .line 31
    invoke-static {p0, v1}, LRh/a;->i(LRh/a;I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x4

    .line 36
    add-int/2addr v3, v4

    .line 37
    const/4 v5, 0x7

    .line 38
    const-string v6, "Exuberant nibble"

    .line 39
    .line 40
    if-ne v3, v5, :cond_6

    .line 41
    .line 42
    iput-boolean v0, p1, LRh/k;->j:Z

    .line 43
    .line 44
    invoke-static {p0, v0}, LRh/a;->i(LRh/a;I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_5

    .line 49
    .line 50
    invoke-static {p0, v1}, LRh/a;->i(LRh/a;I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    goto :goto_6

    .line 57
    :cond_2
    move v3, v2

    .line 58
    :goto_1
    if-ge v3, v1, :cond_9

    .line 59
    .line 60
    const/16 v4, 0x8

    .line 61
    .line 62
    invoke-static {p0, v4}, LRh/a;->i(LRh/a;I)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_4

    .line 67
    .line 68
    add-int/lit8 v5, v3, 0x1

    .line 69
    .line 70
    if-ne v5, v1, :cond_4

    .line 71
    .line 72
    if-gt v1, v0, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    new-instance p0, LRh/c;

    .line 76
    .line 77
    invoke-direct {p0, v6}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :cond_4
    :goto_2
    iget v5, p1, LRh/k;->g:I

    .line 82
    .line 83
    mul-int/lit8 v7, v3, 0x8

    .line 84
    .line 85
    shl-int/2addr v4, v7

    .line 86
    or-int/2addr v4, v5

    .line 87
    iput v4, p1, LRh/k;->g:I

    .line 88
    .line 89
    add-int/lit8 v3, v3, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    new-instance p0, LRh/c;

    .line 93
    .line 94
    const-string p1, "Corrupted reserved bit"

    .line 95
    .line 96
    invoke-direct {p0, p1}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :cond_6
    move v1, v2

    .line 101
    :goto_3
    if-ge v1, v3, :cond_9

    .line 102
    .line 103
    invoke-static {p0, v4}, LRh/a;->i(LRh/a;I)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_8

    .line 108
    .line 109
    add-int/lit8 v7, v1, 0x1

    .line 110
    .line 111
    if-ne v7, v3, :cond_8

    .line 112
    .line 113
    if-gt v3, v4, :cond_7

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_7
    new-instance p0, LRh/c;

    .line 117
    .line 118
    invoke-direct {p0, v6}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_8
    :goto_4
    iget v7, p1, LRh/k;->g:I

    .line 123
    .line 124
    mul-int/lit8 v8, v1, 0x4

    .line 125
    .line 126
    shl-int/2addr v5, v8

    .line 127
    or-int/2addr v5, v7

    .line 128
    iput v5, p1, LRh/k;->g:I

    .line 129
    .line 130
    add-int/lit8 v1, v1, 0x1

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_9
    iget v1, p1, LRh/k;->g:I

    .line 134
    .line 135
    add-int/2addr v1, v0

    .line 136
    iput v1, p1, LRh/k;->g:I

    .line 137
    .line 138
    iget-boolean v1, p1, LRh/k;->h:Z

    .line 139
    .line 140
    if-nez v1, :cond_b

    .line 141
    .line 142
    invoke-static {p0, v0}, LRh/a;->i(LRh/a;I)I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-ne p0, v0, :cond_a

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_a
    move v0, v2

    .line 150
    :goto_5
    iput-boolean v0, p1, LRh/k;->i:Z

    .line 151
    .line 152
    :cond_b
    :goto_6
    return-void
.end method

.method private static h(LRh/a;)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, LRh/a;->i(LRh/a;I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-static {p0, v1}, LRh/a;->i(LRh/a;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    invoke-static {p0, v1}, LRh/a;->i(LRh/a;I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    shl-int/2addr v0, v1

    .line 21
    add-int/2addr p0, v0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method static i(LRh/k;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LRh/k;->a:I

    .line 4
    .line 5
    if-eqz v1, :cond_24

    .line 6
    .line 7
    const/16 v2, 0xb

    .line 8
    .line 9
    if-eq v1, v2, :cond_23

    .line 10
    .line 11
    iget-object v1, v0, LRh/k;->c:LRh/a;

    .line 12
    .line 13
    iget v2, v0, LRh/k;->Q:I

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    sub-int/2addr v2, v3

    .line 17
    iget-object v4, v0, LRh/k;->d:[B

    .line 18
    .line 19
    :goto_0
    iget v5, v0, LRh/k;->a:I

    .line 20
    .line 21
    const-string v6, "Invalid metablock length"

    .line 22
    .line 23
    const/16 v7, 0xa

    .line 24
    .line 25
    if-eq v5, v7, :cond_20

    .line 26
    .line 27
    const/16 v10, 0xc

    .line 28
    .line 29
    if-eq v5, v10, :cond_1d

    .line 30
    .line 31
    const/16 v11, 0x8

    .line 32
    .line 33
    const-string v7, "Invalid backward reference"

    .line 34
    .line 35
    const/4 v8, 0x4

    .line 36
    const/4 v9, 0x7

    .line 37
    const/4 v12, 0x6

    .line 38
    const/4 v13, 0x2

    .line 39
    const/4 v14, 0x3

    .line 40
    const/4 v15, 0x0

    .line 41
    packed-switch v5, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    new-instance v1, LRh/c;

    .line 45
    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v3, "Unexpected state "

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget v0, v0, LRh/k;->a:I

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {v1, v0}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :pswitch_0
    iget v5, v0, LRh/k;->M:I

    .line 70
    .line 71
    if-lt v5, v8, :cond_2

    .line 72
    .line 73
    const/16 v6, 0x18

    .line 74
    .line 75
    if-gt v5, v6, :cond_2

    .line 76
    .line 77
    sget-object v6, LRh/f;->a:[I

    .line 78
    .line 79
    aget v6, v6, v5

    .line 80
    .line 81
    iget v8, v0, LRh/k;->L:I

    .line 82
    .line 83
    iget v9, v0, LRh/k;->s:I

    .line 84
    .line 85
    sub-int/2addr v8, v9

    .line 86
    sub-int/2addr v8, v3

    .line 87
    sget-object v9, LRh/f;->b:[I

    .line 88
    .line 89
    aget v9, v9, v5

    .line 90
    .line 91
    shl-int v12, v3, v9

    .line 92
    .line 93
    sub-int/2addr v12, v3

    .line 94
    and-int/2addr v12, v8

    .line 95
    ushr-int/2addr v8, v9

    .line 96
    mul-int/2addr v12, v5

    .line 97
    add-int/2addr v6, v12

    .line 98
    sget-object v5, LRh/l;->d:[LRh/l;

    .line 99
    .line 100
    array-length v9, v5

    .line 101
    if-ge v8, v9, :cond_1

    .line 102
    .line 103
    move-object v9, v5

    .line 104
    iget v5, v0, LRh/k;->N:I

    .line 105
    .line 106
    move v7, v6

    .line 107
    invoke-static {}, LRh/f;->a()[B

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    move v12, v8

    .line 112
    iget v8, v0, LRh/k;->M:I

    .line 113
    .line 114
    aget-object v9, v9, v12

    .line 115
    .line 116
    invoke-static/range {v4 .. v9}, LRh/l;->b([BI[BIILRh/l;)I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    iget v6, v0, LRh/k;->N:I

    .line 121
    .line 122
    add-int/2addr v6, v5

    .line 123
    iput v6, v0, LRh/k;->N:I

    .line 124
    .line 125
    iget v7, v0, LRh/k;->r:I

    .line 126
    .line 127
    add-int/2addr v7, v5

    .line 128
    iput v7, v0, LRh/k;->r:I

    .line 129
    .line 130
    iget v7, v0, LRh/k;->g:I

    .line 131
    .line 132
    sub-int/2addr v7, v5

    .line 133
    iput v7, v0, LRh/k;->g:I

    .line 134
    .line 135
    iget v5, v0, LRh/k;->Q:I

    .line 136
    .line 137
    if-lt v6, v5, :cond_0

    .line 138
    .line 139
    iput v11, v0, LRh/k;->b:I

    .line 140
    .line 141
    iput v5, v0, LRh/k;->Y:I

    .line 142
    .line 143
    iput v15, v0, LRh/k;->X:I

    .line 144
    .line 145
    iput v10, v0, LRh/k;->a:I

    .line 146
    .line 147
    :goto_1
    move/from16 v18, v3

    .line 148
    .line 149
    goto/16 :goto_a

    .line 150
    .line 151
    :cond_0
    iput v14, v0, LRh/k;->a:I

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_1
    new-instance v0, LRh/c;

    .line 155
    .line 156
    invoke-direct {v0, v7}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_2
    new-instance v0, LRh/c;

    .line 161
    .line 162
    invoke-direct {v0, v7}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :pswitch_1
    iget v5, v0, LRh/k;->Q:I

    .line 167
    .line 168
    iget v6, v0, LRh/k;->N:I

    .line 169
    .line 170
    sub-int/2addr v6, v5

    .line 171
    invoke-static {v4, v5, v4, v15, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 172
    .line 173
    .line 174
    iput v14, v0, LRh/k;->a:I

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :pswitch_2
    move/from16 v18, v3

    .line 178
    .line 179
    goto/16 :goto_7

    .line 180
    .line 181
    :pswitch_3
    invoke-static {v0}, LRh/e;->a(LRh/k;)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :goto_2
    :pswitch_4
    iget v5, v0, LRh/k;->g:I

    .line 186
    .line 187
    if-lez v5, :cond_3

    .line 188
    .line 189
    invoke-static {v1}, LRh/a;->j(LRh/a;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v1, v11}, LRh/a;->i(LRh/a;I)I

    .line 193
    .line 194
    .line 195
    iget v5, v0, LRh/k;->g:I

    .line 196
    .line 197
    sub-int/2addr v5, v3

    .line 198
    iput v5, v0, LRh/k;->g:I

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_3
    iput v3, v0, LRh/k;->a:I

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :pswitch_5
    invoke-static {v0}, LRh/e;->p(LRh/k;)V

    .line 205
    .line 206
    .line 207
    iput v14, v0, LRh/k;->a:I

    .line 208
    .line 209
    :pswitch_6
    iget v5, v0, LRh/k;->g:I

    .line 210
    .line 211
    if-gtz v5, :cond_4

    .line 212
    .line 213
    iput v3, v0, LRh/k;->a:I

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_4
    invoke-static {v1}, LRh/a;->j(LRh/a;)V

    .line 217
    .line 218
    .line 219
    iget-object v5, v0, LRh/k;->n:[I

    .line 220
    .line 221
    aget v5, v5, v3

    .line 222
    .line 223
    if-nez v5, :cond_5

    .line 224
    .line 225
    invoke-static {v0}, LRh/e;->c(LRh/k;)V

    .line 226
    .line 227
    .line 228
    :cond_5
    iget-object v5, v0, LRh/k;->n:[I

    .line 229
    .line 230
    aget v6, v5, v3

    .line 231
    .line 232
    sub-int/2addr v6, v3

    .line 233
    aput v6, v5, v3

    .line 234
    .line 235
    invoke-static {v1}, LRh/a;->d(LRh/a;)V

    .line 236
    .line 237
    .line 238
    iget-object v5, v0, LRh/k;->l:LRh/h;

    .line 239
    .line 240
    iget-object v5, v5, LRh/h;->b:[I

    .line 241
    .line 242
    iget v6, v0, LRh/k;->F:I

    .line 243
    .line 244
    invoke-static {v5, v6, v1}, LRh/e;->r([IILRh/a;)I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    ushr-int/lit8 v6, v5, 0x6

    .line 249
    .line 250
    iput v15, v0, LRh/k;->G:I

    .line 251
    .line 252
    if-lt v6, v13, :cond_6

    .line 253
    .line 254
    add-int/lit8 v6, v6, -0x2

    .line 255
    .line 256
    const/4 v11, -0x1

    .line 257
    iput v11, v0, LRh/k;->G:I

    .line 258
    .line 259
    :cond_6
    sget-object v11, LRh/j;->g:[I

    .line 260
    .line 261
    aget v11, v11, v6

    .line 262
    .line 263
    ushr-int/lit8 v16, v5, 0x3

    .line 264
    .line 265
    and-int/lit8 v16, v16, 0x7

    .line 266
    .line 267
    add-int v11, v11, v16

    .line 268
    .line 269
    sget-object v16, LRh/j;->h:[I

    .line 270
    .line 271
    aget v6, v16, v6

    .line 272
    .line 273
    and-int/lit8 v5, v5, 0x7

    .line 274
    .line 275
    add-int/2addr v6, v5

    .line 276
    sget-object v5, LRh/j;->c:[I

    .line 277
    .line 278
    aget v5, v5, v11

    .line 279
    .line 280
    sget-object v16, LRh/j;->d:[I

    .line 281
    .line 282
    aget v11, v16, v11

    .line 283
    .line 284
    invoke-static {v1, v11}, LRh/a;->i(LRh/a;I)I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    add-int/2addr v5, v11

    .line 289
    iput v5, v0, LRh/k;->y:I

    .line 290
    .line 291
    sget-object v5, LRh/j;->e:[I

    .line 292
    .line 293
    aget v5, v5, v6

    .line 294
    .line 295
    sget-object v11, LRh/j;->f:[I

    .line 296
    .line 297
    aget v6, v11, v6

    .line 298
    .line 299
    invoke-static {v1, v6}, LRh/a;->i(LRh/a;I)I

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    add-int/2addr v5, v6

    .line 304
    iput v5, v0, LRh/k;->M:I

    .line 305
    .line 306
    iput v15, v0, LRh/k;->x:I

    .line 307
    .line 308
    iput v12, v0, LRh/k;->a:I

    .line 309
    .line 310
    :pswitch_7
    iget-boolean v5, v0, LRh/k;->u:Z

    .line 311
    .line 312
    if-eqz v5, :cond_a

    .line 313
    .line 314
    :cond_7
    iget v5, v0, LRh/k;->x:I

    .line 315
    .line 316
    iget v6, v0, LRh/k;->y:I

    .line 317
    .line 318
    if-ge v5, v6, :cond_9

    .line 319
    .line 320
    invoke-static {v1}, LRh/a;->j(LRh/a;)V

    .line 321
    .line 322
    .line 323
    iget-object v5, v0, LRh/k;->n:[I

    .line 324
    .line 325
    aget v5, v5, v15

    .line 326
    .line 327
    if-nez v5, :cond_8

    .line 328
    .line 329
    invoke-static {v0}, LRh/e;->f(LRh/k;)V

    .line 330
    .line 331
    .line 332
    :cond_8
    iget-object v5, v0, LRh/k;->n:[I

    .line 333
    .line 334
    aget v6, v5, v15

    .line 335
    .line 336
    sub-int/2addr v6, v3

    .line 337
    aput v6, v5, v15

    .line 338
    .line 339
    invoke-static {v1}, LRh/a;->d(LRh/a;)V

    .line 340
    .line 341
    .line 342
    iget v5, v0, LRh/k;->r:I

    .line 343
    .line 344
    iget-object v6, v0, LRh/k;->k:LRh/h;

    .line 345
    .line 346
    iget-object v6, v6, LRh/h;->b:[I

    .line 347
    .line 348
    iget v11, v0, LRh/k;->w:I

    .line 349
    .line 350
    invoke-static {v6, v11, v1}, LRh/e;->r([IILRh/a;)I

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    int-to-byte v6, v6

    .line 355
    aput-byte v6, v4, v5

    .line 356
    .line 357
    iget v5, v0, LRh/k;->x:I

    .line 358
    .line 359
    add-int/2addr v5, v3

    .line 360
    iput v5, v0, LRh/k;->x:I

    .line 361
    .line 362
    iget v5, v0, LRh/k;->r:I

    .line 363
    .line 364
    add-int/lit8 v6, v5, 0x1

    .line 365
    .line 366
    iput v6, v0, LRh/k;->r:I

    .line 367
    .line 368
    if-ne v5, v2, :cond_7

    .line 369
    .line 370
    iput v12, v0, LRh/k;->b:I

    .line 371
    .line 372
    iget v5, v0, LRh/k;->Q:I

    .line 373
    .line 374
    iput v5, v0, LRh/k;->Y:I

    .line 375
    .line 376
    iput v15, v0, LRh/k;->X:I

    .line 377
    .line 378
    iput v10, v0, LRh/k;->a:I

    .line 379
    .line 380
    :cond_9
    move/from16 v18, v3

    .line 381
    .line 382
    move/from16 v16, v13

    .line 383
    .line 384
    goto/16 :goto_4

    .line 385
    .line 386
    :cond_a
    iget v5, v0, LRh/k;->r:I

    .line 387
    .line 388
    add-int/lit8 v6, v5, -0x1

    .line 389
    .line 390
    and-int/2addr v6, v2

    .line 391
    aget-byte v6, v4, v6

    .line 392
    .line 393
    and-int/lit16 v6, v6, 0xff

    .line 394
    .line 395
    sub-int/2addr v5, v13

    .line 396
    and-int/2addr v5, v2

    .line 397
    aget-byte v5, v4, v5

    .line 398
    .line 399
    and-int/lit16 v5, v5, 0xff

    .line 400
    .line 401
    :goto_3
    iget v11, v0, LRh/k;->x:I

    .line 402
    .line 403
    move/from16 v16, v13

    .line 404
    .line 405
    iget v13, v0, LRh/k;->y:I

    .line 406
    .line 407
    if-ge v11, v13, :cond_d

    .line 408
    .line 409
    invoke-static {v1}, LRh/a;->j(LRh/a;)V

    .line 410
    .line 411
    .line 412
    iget-object v11, v0, LRh/k;->n:[I

    .line 413
    .line 414
    aget v11, v11, v15

    .line 415
    .line 416
    if-nez v11, :cond_b

    .line 417
    .line 418
    invoke-static {v0}, LRh/e;->f(LRh/k;)V

    .line 419
    .line 420
    .line 421
    :cond_b
    iget-object v11, v0, LRh/k;->A:[B

    .line 422
    .line 423
    iget v13, v0, LRh/k;->B:I

    .line 424
    .line 425
    sget-object v17, LRh/d;->a:[I

    .line 426
    .line 427
    move/from16 v18, v3

    .line 428
    .line 429
    iget v3, v0, LRh/k;->D:I

    .line 430
    .line 431
    add-int/2addr v3, v6

    .line 432
    aget v3, v17, v3

    .line 433
    .line 434
    iget v9, v0, LRh/k;->E:I

    .line 435
    .line 436
    add-int/2addr v9, v5

    .line 437
    aget v5, v17, v9

    .line 438
    .line 439
    or-int/2addr v3, v5

    .line 440
    add-int/2addr v13, v3

    .line 441
    aget-byte v3, v11, v13

    .line 442
    .line 443
    and-int/lit16 v3, v3, 0xff

    .line 444
    .line 445
    iget-object v5, v0, LRh/k;->n:[I

    .line 446
    .line 447
    aget v9, v5, v15

    .line 448
    .line 449
    add-int/lit8 v9, v9, -0x1

    .line 450
    .line 451
    aput v9, v5, v15

    .line 452
    .line 453
    invoke-static {v1}, LRh/a;->d(LRh/a;)V

    .line 454
    .line 455
    .line 456
    iget-object v5, v0, LRh/k;->k:LRh/h;

    .line 457
    .line 458
    iget-object v9, v5, LRh/h;->b:[I

    .line 459
    .line 460
    iget-object v5, v5, LRh/h;->c:[I

    .line 461
    .line 462
    aget v3, v5, v3

    .line 463
    .line 464
    invoke-static {v9, v3, v1}, LRh/e;->r([IILRh/a;)I

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    iget v5, v0, LRh/k;->r:I

    .line 469
    .line 470
    int-to-byte v9, v3

    .line 471
    aput-byte v9, v4, v5

    .line 472
    .line 473
    iget v9, v0, LRh/k;->x:I

    .line 474
    .line 475
    add-int/lit8 v9, v9, 0x1

    .line 476
    .line 477
    iput v9, v0, LRh/k;->x:I

    .line 478
    .line 479
    add-int/lit8 v9, v5, 0x1

    .line 480
    .line 481
    iput v9, v0, LRh/k;->r:I

    .line 482
    .line 483
    if-ne v5, v2, :cond_c

    .line 484
    .line 485
    iput v12, v0, LRh/k;->b:I

    .line 486
    .line 487
    iget v3, v0, LRh/k;->Q:I

    .line 488
    .line 489
    iput v3, v0, LRh/k;->Y:I

    .line 490
    .line 491
    iput v15, v0, LRh/k;->X:I

    .line 492
    .line 493
    iput v10, v0, LRh/k;->a:I

    .line 494
    .line 495
    goto :goto_4

    .line 496
    :cond_c
    move v5, v6

    .line 497
    move/from16 v13, v16

    .line 498
    .line 499
    const/4 v9, 0x7

    .line 500
    move v6, v3

    .line 501
    move/from16 v3, v18

    .line 502
    .line 503
    goto :goto_3

    .line 504
    :cond_d
    move/from16 v18, v3

    .line 505
    .line 506
    :goto_4
    iget v3, v0, LRh/k;->a:I

    .line 507
    .line 508
    if-eq v3, v12, :cond_e

    .line 509
    .line 510
    goto/16 :goto_a

    .line 511
    .line 512
    :cond_e
    iget v3, v0, LRh/k;->g:I

    .line 513
    .line 514
    iget v5, v0, LRh/k;->y:I

    .line 515
    .line 516
    sub-int/2addr v3, v5

    .line 517
    iput v3, v0, LRh/k;->g:I

    .line 518
    .line 519
    if-gtz v3, :cond_f

    .line 520
    .line 521
    iput v14, v0, LRh/k;->a:I

    .line 522
    .line 523
    goto/16 :goto_a

    .line 524
    .line 525
    :cond_f
    iget v3, v0, LRh/k;->G:I

    .line 526
    .line 527
    if-gez v3, :cond_12

    .line 528
    .line 529
    invoke-static {v1}, LRh/a;->j(LRh/a;)V

    .line 530
    .line 531
    .line 532
    iget-object v3, v0, LRh/k;->n:[I

    .line 533
    .line 534
    aget v3, v3, v16

    .line 535
    .line 536
    if-nez v3, :cond_10

    .line 537
    .line 538
    invoke-static {v0}, LRh/e;->e(LRh/k;)V

    .line 539
    .line 540
    .line 541
    :cond_10
    iget-object v3, v0, LRh/k;->n:[I

    .line 542
    .line 543
    aget v5, v3, v16

    .line 544
    .line 545
    add-int/lit8 v5, v5, -0x1

    .line 546
    .line 547
    aput v5, v3, v16

    .line 548
    .line 549
    invoke-static {v1}, LRh/a;->d(LRh/a;)V

    .line 550
    .line 551
    .line 552
    iget-object v3, v0, LRh/k;->m:LRh/h;

    .line 553
    .line 554
    iget-object v5, v3, LRh/h;->b:[I

    .line 555
    .line 556
    iget-object v3, v3, LRh/h;->c:[I

    .line 557
    .line 558
    iget-object v6, v0, LRh/k;->H:[B

    .line 559
    .line 560
    iget v9, v0, LRh/k;->C:I

    .line 561
    .line 562
    iget v11, v0, LRh/k;->M:I

    .line 563
    .line 564
    if-le v11, v8, :cond_11

    .line 565
    .line 566
    move v11, v14

    .line 567
    goto :goto_5

    .line 568
    :cond_11
    add-int/lit8 v11, v11, -0x2

    .line 569
    .line 570
    :goto_5
    add-int/2addr v9, v11

    .line 571
    aget-byte v6, v6, v9

    .line 572
    .line 573
    and-int/lit16 v6, v6, 0xff

    .line 574
    .line 575
    aget v3, v3, v6

    .line 576
    .line 577
    invoke-static {v5, v3, v1}, LRh/e;->r([IILRh/a;)I

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    iput v3, v0, LRh/k;->G:I

    .line 582
    .line 583
    iget v5, v0, LRh/k;->I:I

    .line 584
    .line 585
    if-lt v3, v5, :cond_12

    .line 586
    .line 587
    sub-int/2addr v3, v5

    .line 588
    iget v6, v0, LRh/k;->J:I

    .line 589
    .line 590
    and-int/2addr v6, v3

    .line 591
    iget v9, v0, LRh/k;->K:I

    .line 592
    .line 593
    ushr-int/2addr v3, v9

    .line 594
    iput v3, v0, LRh/k;->G:I

    .line 595
    .line 596
    ushr-int/lit8 v9, v3, 0x1

    .line 597
    .line 598
    add-int/lit8 v9, v9, 0x1

    .line 599
    .line 600
    and-int/lit8 v3, v3, 0x1

    .line 601
    .line 602
    add-int/lit8 v3, v3, 0x2

    .line 603
    .line 604
    shl-int/2addr v3, v9

    .line 605
    sub-int/2addr v3, v8

    .line 606
    add-int/2addr v5, v6

    .line 607
    invoke-static {v1, v9}, LRh/a;->i(LRh/a;I)I

    .line 608
    .line 609
    .line 610
    move-result v6

    .line 611
    add-int/2addr v3, v6

    .line 612
    iget v6, v0, LRh/k;->K:I

    .line 613
    .line 614
    shl-int/2addr v3, v6

    .line 615
    add-int/2addr v5, v3

    .line 616
    iput v5, v0, LRh/k;->G:I

    .line 617
    .line 618
    :cond_12
    iget v3, v0, LRh/k;->G:I

    .line 619
    .line 620
    iget-object v5, v0, LRh/k;->q:[I

    .line 621
    .line 622
    iget v6, v0, LRh/k;->t:I

    .line 623
    .line 624
    invoke-static {v3, v5, v6}, LRh/e;->t(I[II)I

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    iput v3, v0, LRh/k;->L:I

    .line 629
    .line 630
    if-ltz v3, :cond_1a

    .line 631
    .line 632
    iget v5, v0, LRh/k;->s:I

    .line 633
    .line 634
    iget v6, v0, LRh/k;->O:I

    .line 635
    .line 636
    if-eq v5, v6, :cond_13

    .line 637
    .line 638
    iget v5, v0, LRh/k;->r:I

    .line 639
    .line 640
    if-ge v5, v6, :cond_13

    .line 641
    .line 642
    iput v5, v0, LRh/k;->s:I

    .line 643
    .line 644
    goto :goto_6

    .line 645
    :cond_13
    iput v6, v0, LRh/k;->s:I

    .line 646
    .line 647
    :goto_6
    iget v5, v0, LRh/k;->r:I

    .line 648
    .line 649
    iput v5, v0, LRh/k;->N:I

    .line 650
    .line 651
    iget v5, v0, LRh/k;->s:I

    .line 652
    .line 653
    if-le v3, v5, :cond_14

    .line 654
    .line 655
    const/16 v3, 0x9

    .line 656
    .line 657
    iput v3, v0, LRh/k;->a:I

    .line 658
    .line 659
    goto/16 :goto_a

    .line 660
    .line 661
    :cond_14
    iget v5, v0, LRh/k;->G:I

    .line 662
    .line 663
    if-lez v5, :cond_15

    .line 664
    .line 665
    iget-object v5, v0, LRh/k;->q:[I

    .line 666
    .line 667
    iget v6, v0, LRh/k;->t:I

    .line 668
    .line 669
    and-int/lit8 v8, v6, 0x3

    .line 670
    .line 671
    aput v3, v5, v8

    .line 672
    .line 673
    add-int/lit8 v6, v6, 0x1

    .line 674
    .line 675
    iput v6, v0, LRh/k;->t:I

    .line 676
    .line 677
    :cond_15
    iget v3, v0, LRh/k;->M:I

    .line 678
    .line 679
    iget v5, v0, LRh/k;->g:I

    .line 680
    .line 681
    if-gt v3, v5, :cond_19

    .line 682
    .line 683
    iput v15, v0, LRh/k;->x:I

    .line 684
    .line 685
    const/4 v3, 0x7

    .line 686
    iput v3, v0, LRh/k;->a:I

    .line 687
    .line 688
    :goto_7
    iget v3, v0, LRh/k;->r:I

    .line 689
    .line 690
    iget v5, v0, LRh/k;->L:I

    .line 691
    .line 692
    sub-int v5, v3, v5

    .line 693
    .line 694
    and-int/2addr v5, v2

    .line 695
    iget v6, v0, LRh/k;->M:I

    .line 696
    .line 697
    iget v7, v0, LRh/k;->x:I

    .line 698
    .line 699
    sub-int/2addr v6, v7

    .line 700
    add-int v7, v5, v6

    .line 701
    .line 702
    if-ge v7, v2, :cond_18

    .line 703
    .line 704
    add-int v7, v3, v6

    .line 705
    .line 706
    if-ge v7, v2, :cond_18

    .line 707
    .line 708
    :goto_8
    if-ge v15, v6, :cond_16

    .line 709
    .line 710
    add-int/lit8 v7, v3, 0x1

    .line 711
    .line 712
    add-int/lit8 v8, v5, 0x1

    .line 713
    .line 714
    aget-byte v5, v4, v5

    .line 715
    .line 716
    aput-byte v5, v4, v3

    .line 717
    .line 718
    add-int/lit8 v15, v15, 0x1

    .line 719
    .line 720
    move v3, v7

    .line 721
    move v5, v8

    .line 722
    goto :goto_8

    .line 723
    :cond_16
    iget v3, v0, LRh/k;->x:I

    .line 724
    .line 725
    add-int/2addr v3, v6

    .line 726
    iput v3, v0, LRh/k;->x:I

    .line 727
    .line 728
    iget v3, v0, LRh/k;->g:I

    .line 729
    .line 730
    sub-int/2addr v3, v6

    .line 731
    iput v3, v0, LRh/k;->g:I

    .line 732
    .line 733
    iget v3, v0, LRh/k;->r:I

    .line 734
    .line 735
    add-int/2addr v3, v6

    .line 736
    iput v3, v0, LRh/k;->r:I

    .line 737
    .line 738
    :cond_17
    const/4 v3, 0x7

    .line 739
    goto :goto_9

    .line 740
    :cond_18
    iget v3, v0, LRh/k;->x:I

    .line 741
    .line 742
    iget v5, v0, LRh/k;->M:I

    .line 743
    .line 744
    if-ge v3, v5, :cond_17

    .line 745
    .line 746
    iget v5, v0, LRh/k;->r:I

    .line 747
    .line 748
    iget v6, v0, LRh/k;->L:I

    .line 749
    .line 750
    sub-int v6, v5, v6

    .line 751
    .line 752
    and-int/2addr v6, v2

    .line 753
    aget-byte v6, v4, v6

    .line 754
    .line 755
    aput-byte v6, v4, v5

    .line 756
    .line 757
    iget v6, v0, LRh/k;->g:I

    .line 758
    .line 759
    add-int/lit8 v6, v6, -0x1

    .line 760
    .line 761
    iput v6, v0, LRh/k;->g:I

    .line 762
    .line 763
    add-int/lit8 v3, v3, 0x1

    .line 764
    .line 765
    iput v3, v0, LRh/k;->x:I

    .line 766
    .line 767
    add-int/lit8 v3, v5, 0x1

    .line 768
    .line 769
    iput v3, v0, LRh/k;->r:I

    .line 770
    .line 771
    if-ne v5, v2, :cond_18

    .line 772
    .line 773
    const/4 v3, 0x7

    .line 774
    iput v3, v0, LRh/k;->b:I

    .line 775
    .line 776
    iget v5, v0, LRh/k;->Q:I

    .line 777
    .line 778
    iput v5, v0, LRh/k;->Y:I

    .line 779
    .line 780
    iput v15, v0, LRh/k;->X:I

    .line 781
    .line 782
    iput v10, v0, LRh/k;->a:I

    .line 783
    .line 784
    :goto_9
    iget v5, v0, LRh/k;->a:I

    .line 785
    .line 786
    if-ne v5, v3, :cond_1b

    .line 787
    .line 788
    iput v14, v0, LRh/k;->a:I

    .line 789
    .line 790
    goto :goto_a

    .line 791
    :cond_19
    new-instance v0, LRh/c;

    .line 792
    .line 793
    invoke-direct {v0, v7}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    throw v0

    .line 797
    :cond_1a
    new-instance v0, LRh/c;

    .line 798
    .line 799
    const-string v1, "Negative distance"

    .line 800
    .line 801
    invoke-direct {v0, v1}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    throw v0

    .line 805
    :pswitch_8
    move/from16 v18, v3

    .line 806
    .line 807
    iget v2, v0, LRh/k;->g:I

    .line 808
    .line 809
    if-ltz v2, :cond_1c

    .line 810
    .line 811
    invoke-static {v0}, LRh/e;->q(LRh/k;)V

    .line 812
    .line 813
    .line 814
    iget v2, v0, LRh/k;->Q:I

    .line 815
    .line 816
    add-int/lit8 v2, v2, -0x1

    .line 817
    .line 818
    iget-object v4, v0, LRh/k;->d:[B

    .line 819
    .line 820
    :cond_1b
    :goto_a
    move/from16 v3, v18

    .line 821
    .line 822
    goto/16 :goto_0

    .line 823
    .line 824
    :cond_1c
    new-instance v0, LRh/c;

    .line 825
    .line 826
    invoke-direct {v0, v6}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    throw v0

    .line 830
    :cond_1d
    move/from16 v18, v3

    .line 831
    .line 832
    invoke-static {v0}, LRh/e;->u(LRh/k;)Z

    .line 833
    .line 834
    .line 835
    move-result v3

    .line 836
    if-nez v3, :cond_1e

    .line 837
    .line 838
    goto :goto_b

    .line 839
    :cond_1e
    iget v3, v0, LRh/k;->r:I

    .line 840
    .line 841
    iget v5, v0, LRh/k;->O:I

    .line 842
    .line 843
    if-lt v3, v5, :cond_1f

    .line 844
    .line 845
    iput v5, v0, LRh/k;->s:I

    .line 846
    .line 847
    :cond_1f
    and-int/2addr v3, v2

    .line 848
    iput v3, v0, LRh/k;->r:I

    .line 849
    .line 850
    iget v3, v0, LRh/k;->b:I

    .line 851
    .line 852
    iput v3, v0, LRh/k;->a:I

    .line 853
    .line 854
    goto :goto_a

    .line 855
    :cond_20
    move/from16 v18, v3

    .line 856
    .line 857
    if-ne v5, v7, :cond_22

    .line 858
    .line 859
    iget v2, v0, LRh/k;->g:I

    .line 860
    .line 861
    if-ltz v2, :cond_21

    .line 862
    .line 863
    invoke-static {v1}, LRh/a;->g(LRh/a;)V

    .line 864
    .line 865
    .line 866
    iget-object v0, v0, LRh/k;->c:LRh/a;

    .line 867
    .line 868
    move/from16 v1, v18

    .line 869
    .line 870
    invoke-static {v0, v1}, LRh/a;->a(LRh/a;Z)V

    .line 871
    .line 872
    .line 873
    return-void

    .line 874
    :cond_21
    new-instance v0, LRh/c;

    .line 875
    .line 876
    invoke-direct {v0, v6}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    throw v0

    .line 880
    :cond_22
    :goto_b
    return-void

    .line 881
    :cond_23
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 882
    .line 883
    const-string v1, "Can\'t decompress after close"

    .line 884
    .line 885
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    throw v0

    .line 889
    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 890
    .line 891
    const-string v1, "Can\'t decompress until initialized"

    .line 892
    .line 893
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    throw v0

    .line 897
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static j([BI)V
    .locals 4

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v0, :cond_0

    .line 8
    .line 9
    aput v3, v1, v3

    .line 10
    .line 11
    add-int/lit8 v3, v3, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :goto_1
    if-ge v2, p1, :cond_2

    .line 15
    .line 16
    aget-byte v0, p0, v2

    .line 17
    .line 18
    and-int/lit16 v0, v0, 0xff

    .line 19
    .line 20
    aget v3, v1, v0

    .line 21
    .line 22
    int-to-byte v3, v3

    .line 23
    aput-byte v3, p0, v2

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {v1, v0}, LRh/e;->l([II)V

    .line 28
    .line 29
    .line 30
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    return-void
.end method

.method private static k(LRh/k;)V
    .locals 6

    .line 1
    iget v0, p0, LRh/k;->P:I

    .line 2
    .line 3
    int-to-long v1, v0

    .line 4
    iget-wide v3, p0, LRh/k;->R:J

    .line 5
    .line 6
    cmp-long v1, v1, v3

    .line 7
    .line 8
    if-lez v1, :cond_1

    .line 9
    .line 10
    long-to-int v1, v3

    .line 11
    iget-object v2, p0, LRh/k;->S:[B

    .line 12
    .line 13
    array-length v2, v2

    .line 14
    add-int/2addr v1, v2

    .line 15
    :goto_0
    shr-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    if-le v2, v1, :cond_0

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-boolean v1, p0, LRh/k;->h:Z

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x4000

    .line 26
    .line 27
    if-ge v0, v1, :cond_1

    .line 28
    .line 29
    iget v2, p0, LRh/k;->P:I

    .line 30
    .line 31
    if-lt v2, v1, :cond_1

    .line 32
    .line 33
    move v0, v1

    .line 34
    :cond_1
    iget v1, p0, LRh/k;->Q:I

    .line 35
    .line 36
    if-gt v0, v1, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v2, v0, 0x25

    .line 40
    .line 41
    new-array v2, v2, [B

    .line 42
    .line 43
    iget-object v3, p0, LRh/k;->d:[B

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    invoke-static {v3, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    iget-object v1, p0, LRh/k;->S:[B

    .line 53
    .line 54
    array-length v3, v1

    .line 55
    if-eqz v3, :cond_5

    .line 56
    .line 57
    array-length v3, v1

    .line 58
    iget v5, p0, LRh/k;->O:I

    .line 59
    .line 60
    if-le v3, v5, :cond_4

    .line 61
    .line 62
    sub-int/2addr v3, v5

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move v5, v3

    .line 65
    move v3, v4

    .line 66
    :goto_1
    invoke-static {v1, v3, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    .line 68
    .line 69
    iput v5, p0, LRh/k;->r:I

    .line 70
    .line 71
    iput v5, p0, LRh/k;->T:I

    .line 72
    .line 73
    :cond_5
    :goto_2
    iput-object v2, p0, LRh/k;->d:[B

    .line 74
    .line 75
    iput v0, p0, LRh/k;->Q:I

    .line 76
    .line 77
    return-void
.end method

.method private static l([II)V
    .locals 2

    .line 1
    aget v0, p0, p1

    .line 2
    .line 3
    :goto_0
    if-lez p1, :cond_0

    .line 4
    .line 5
    add-int/lit8 v1, p1, -0x1

    .line 6
    .line 7
    aget v1, p0, v1

    .line 8
    .line 9
    aput v1, p0, p1

    .line 10
    .line 11
    add-int/lit8 p1, p1, -0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    aput v0, p0, p1

    .line 16
    .line 17
    return-void
.end method

.method private static m([IILRh/a;)I
    .locals 1

    .line 1
    invoke-static {p2}, LRh/a;->d(LRh/a;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, p2}, LRh/e;->r([IILRh/a;)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    sget-object p1, LRh/j;->b:[I

    .line 9
    .line 10
    aget p1, p1, p0

    .line 11
    .line 12
    sget-object v0, LRh/j;->a:[I

    .line 13
    .line 14
    aget p0, v0, p0

    .line 15
    .line 16
    invoke-static {p2, p1}, LRh/a;->i(LRh/a;I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/2addr p0, p1

    .line 21
    return p0
.end method

.method static n(I[IILRh/a;)V
    .locals 14

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-static {v0}, LRh/a;->j(LRh/a;)V

    .line 4
    .line 5
    .line 6
    new-array v1, p0, [I

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-static {v0, v2}, LRh/a;->i(LRh/a;I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    if-ne v3, v5, :cond_7

    .line 16
    .line 17
    add-int/lit8 v3, p0, -0x1

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    new-array v6, v6, [I

    .line 21
    .line 22
    invoke-static {v0, v2}, LRh/a;->i(LRh/a;I)I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    add-int/2addr v7, v5

    .line 27
    move v8, v4

    .line 28
    :goto_0
    if-eqz v3, :cond_0

    .line 29
    .line 30
    shr-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    add-int/lit8 v8, v8, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v3, v4

    .line 36
    :goto_1
    if-ge v3, v7, :cond_1

    .line 37
    .line 38
    invoke-static {v0, v8}, LRh/a;->i(LRh/a;I)I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    rem-int/2addr v9, p0

    .line 43
    aput v9, v6, v3

    .line 44
    .line 45
    aput v2, v1, v9

    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    aget v3, v6, v4

    .line 51
    .line 52
    aput v5, v1, v3

    .line 53
    .line 54
    if-eq v7, v5, :cond_d

    .line 55
    .line 56
    if-eq v7, v2, :cond_5

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    if-eq v7, v3, :cond_4

    .line 60
    .line 61
    aget v7, v6, v4

    .line 62
    .line 63
    aget v8, v6, v5

    .line 64
    .line 65
    if-eq v7, v8, :cond_2

    .line 66
    .line 67
    aget v9, v6, v2

    .line 68
    .line 69
    if-eq v7, v9, :cond_2

    .line 70
    .line 71
    aget v10, v6, v3

    .line 72
    .line 73
    if-eq v7, v10, :cond_2

    .line 74
    .line 75
    if-eq v8, v9, :cond_2

    .line 76
    .line 77
    if-eq v8, v10, :cond_2

    .line 78
    .line 79
    if-eq v9, v10, :cond_2

    .line 80
    .line 81
    move v7, v5

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move v7, v4

    .line 84
    :goto_2
    invoke-static {v0, v5}, LRh/a;->i(LRh/a;I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-ne v0, v5, :cond_3

    .line 89
    .line 90
    aget v0, v6, v2

    .line 91
    .line 92
    aput v3, v1, v0

    .line 93
    .line 94
    aget v0, v6, v3

    .line 95
    .line 96
    aput v3, v1, v0

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    aget v0, v6, v4

    .line 100
    .line 101
    aput v2, v1, v0

    .line 102
    .line 103
    :goto_3
    move v5, v7

    .line 104
    goto :goto_6

    .line 105
    :cond_4
    aget v0, v6, v4

    .line 106
    .line 107
    aget v3, v6, v5

    .line 108
    .line 109
    if-eq v0, v3, :cond_c

    .line 110
    .line 111
    aget v2, v6, v2

    .line 112
    .line 113
    if-eq v0, v2, :cond_c

    .line 114
    .line 115
    if-eq v3, v2, :cond_c

    .line 116
    .line 117
    move v4, v5

    .line 118
    goto :goto_5

    .line 119
    :cond_5
    aget v0, v6, v4

    .line 120
    .line 121
    aget v2, v6, v5

    .line 122
    .line 123
    if-eq v0, v2, :cond_6

    .line 124
    .line 125
    move v4, v5

    .line 126
    :cond_6
    aput v5, v1, v2

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_7
    const/16 v2, 0x12

    .line 130
    .line 131
    new-array v6, v2, [I

    .line 132
    .line 133
    const/16 v7, 0x20

    .line 134
    .line 135
    move v9, v4

    .line 136
    move v8, v7

    .line 137
    :goto_4
    if-ge v3, v2, :cond_9

    .line 138
    .line 139
    if-lez v8, :cond_9

    .line 140
    .line 141
    sget-object v10, LRh/e;->a:[I

    .line 142
    .line 143
    aget v10, v10, v3

    .line 144
    .line 145
    invoke-static {v0}, LRh/a;->d(LRh/a;)V

    .line 146
    .line 147
    .line 148
    iget-wide v11, v0, LRh/a;->f:J

    .line 149
    .line 150
    iget v13, v0, LRh/a;->g:I

    .line 151
    .line 152
    ushr-long/2addr v11, v13

    .line 153
    long-to-int v11, v11

    .line 154
    and-int/lit8 v11, v11, 0xf

    .line 155
    .line 156
    sget-object v12, LRh/e;->d:[I

    .line 157
    .line 158
    aget v11, v12, v11

    .line 159
    .line 160
    shr-int/lit8 v12, v11, 0x10

    .line 161
    .line 162
    add-int/2addr v13, v12

    .line 163
    iput v13, v0, LRh/a;->g:I

    .line 164
    .line 165
    const v12, 0xffff

    .line 166
    .line 167
    .line 168
    and-int/2addr v11, v12

    .line 169
    aput v11, v6, v10

    .line 170
    .line 171
    if-eqz v11, :cond_8

    .line 172
    .line 173
    shr-int v10, v7, v11

    .line 174
    .line 175
    sub-int/2addr v8, v10

    .line 176
    add-int/lit8 v9, v9, 0x1

    .line 177
    .line 178
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_9
    if-eq v9, v5, :cond_a

    .line 182
    .line 183
    if-nez v8, :cond_b

    .line 184
    .line 185
    :cond_a
    move v4, v5

    .line 186
    :cond_b
    invoke-static {v6, p0, v1, v0}, LRh/e;->o([II[ILRh/a;)V

    .line 187
    .line 188
    .line 189
    :cond_c
    :goto_5
    move v5, v4

    .line 190
    :cond_d
    :goto_6
    if-eqz v5, :cond_e

    .line 191
    .line 192
    const/16 v0, 0x8

    .line 193
    .line 194
    move/from16 v3, p2

    .line 195
    .line 196
    invoke-static {p1, v3, v0, v1, p0}, LRh/g;->a([III[II)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_e
    new-instance p0, LRh/c;

    .line 201
    .line 202
    const-string v0, "Can\'t readHuffmanCode"

    .line 203
    .line 204
    invoke-direct {p0, v0}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p0
.end method

.method private static o([II[ILRh/a;)V
    .locals 10

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    const/16 v2, 0x12

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {v0, v3, v1, p0, v2}, LRh/g;->a([III[II)V

    .line 10
    .line 11
    .line 12
    const/16 p0, 0x8

    .line 13
    .line 14
    const v1, 0x8000

    .line 15
    .line 16
    .line 17
    move v4, v1

    .line 18
    move v2, v3

    .line 19
    move v5, v2

    .line 20
    move v6, v5

    .line 21
    :goto_0
    if-ge v2, p1, :cond_8

    .line 22
    .line 23
    if-lez v4, :cond_8

    .line 24
    .line 25
    invoke-static {p3}, LRh/a;->j(LRh/a;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p3}, LRh/a;->d(LRh/a;)V

    .line 29
    .line 30
    .line 31
    iget-wide v7, p3, LRh/a;->f:J

    .line 32
    .line 33
    iget v9, p3, LRh/a;->g:I

    .line 34
    .line 35
    ushr-long/2addr v7, v9

    .line 36
    long-to-int v7, v7

    .line 37
    and-int/lit8 v7, v7, 0x1f

    .line 38
    .line 39
    aget v7, v0, v7

    .line 40
    .line 41
    shr-int/lit8 v8, v7, 0x10

    .line 42
    .line 43
    add-int/2addr v9, v8

    .line 44
    iput v9, p3, LRh/a;->g:I

    .line 45
    .line 46
    const v8, 0xffff

    .line 47
    .line 48
    .line 49
    and-int/2addr v7, v8

    .line 50
    const/16 v8, 0x10

    .line 51
    .line 52
    if-ge v7, v8, :cond_1

    .line 53
    .line 54
    add-int/lit8 v6, v2, 0x1

    .line 55
    .line 56
    aput v7, p2, v2

    .line 57
    .line 58
    if-eqz v7, :cond_0

    .line 59
    .line 60
    shr-int p0, v1, v7

    .line 61
    .line 62
    sub-int/2addr v4, p0

    .line 63
    move v2, v6

    .line 64
    move p0, v7

    .line 65
    :goto_1
    move v6, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move v2, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    add-int/lit8 v9, v7, -0xe

    .line 70
    .line 71
    if-ne v7, v8, :cond_2

    .line 72
    .line 73
    move v7, p0

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    move v7, v3

    .line 76
    :goto_2
    if-eq v5, v7, :cond_3

    .line 77
    .line 78
    move v6, v3

    .line 79
    move v5, v7

    .line 80
    :cond_3
    if-lez v6, :cond_4

    .line 81
    .line 82
    add-int/lit8 v7, v6, -0x2

    .line 83
    .line 84
    shl-int/2addr v7, v9

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move v7, v6

    .line 87
    :goto_3
    invoke-static {p3, v9}, LRh/a;->i(LRh/a;I)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    add-int/lit8 v8, v8, 0x3

    .line 92
    .line 93
    add-int/2addr v7, v8

    .line 94
    sub-int v6, v7, v6

    .line 95
    .line 96
    add-int v8, v2, v6

    .line 97
    .line 98
    if-gt v8, p1, :cond_7

    .line 99
    .line 100
    move v8, v3

    .line 101
    :goto_4
    if-ge v8, v6, :cond_5

    .line 102
    .line 103
    add-int/lit8 v9, v2, 0x1

    .line 104
    .line 105
    aput v5, p2, v2

    .line 106
    .line 107
    add-int/lit8 v8, v8, 0x1

    .line 108
    .line 109
    move v2, v9

    .line 110
    goto :goto_4

    .line 111
    :cond_5
    if-eqz v5, :cond_6

    .line 112
    .line 113
    rsub-int/lit8 v8, v5, 0xf

    .line 114
    .line 115
    shl-int/2addr v6, v8

    .line 116
    sub-int/2addr v4, v6

    .line 117
    :cond_6
    move v6, v7

    .line 118
    goto :goto_0

    .line 119
    :cond_7
    new-instance p0, LRh/c;

    .line 120
    .line 121
    const-string p1, "symbol + repeatDelta > numSymbols"

    .line 122
    .line 123
    invoke-direct {p0, p1}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :cond_8
    if-nez v4, :cond_9

    .line 128
    .line 129
    sub-int/2addr p1, v2

    .line 130
    invoke-static {p2, v2, p1}, LRh/m;->b([III)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_9
    new-instance p0, LRh/c;

    .line 135
    .line 136
    const-string p1, "Unused space"

    .line 137
    .line 138
    invoke-direct {p0, p1}, LRh/c;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0
.end method

.method private static p(LRh/k;)V
    .locals 12

    .line 1
    iget-object v0, p0, LRh/k;->c:LRh/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x1

    .line 7
    if-ge v2, v3, :cond_1

    .line 8
    .line 9
    iget-object v3, p0, LRh/k;->o:[I

    .line 10
    .line 11
    invoke-static {v0}, LRh/e;->h(LRh/a;)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    add-int/2addr v5, v4

    .line 16
    aput v5, v3, v2

    .line 17
    .line 18
    iget-object v3, p0, LRh/k;->n:[I

    .line 19
    .line 20
    const/high16 v5, 0x10000000

    .line 21
    .line 22
    aput v5, v3, v2

    .line 23
    .line 24
    iget-object v3, p0, LRh/k;->o:[I

    .line 25
    .line 26
    aget v3, v3, v2

    .line 27
    .line 28
    if-le v3, v4, :cond_0

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x2

    .line 31
    .line 32
    iget-object v4, p0, LRh/k;->e:[I

    .line 33
    .line 34
    mul-int/lit16 v5, v2, 0x438

    .line 35
    .line 36
    invoke-static {v3, v4, v5, v0}, LRh/e;->n(I[IILRh/a;)V

    .line 37
    .line 38
    .line 39
    const/16 v3, 0x1a

    .line 40
    .line 41
    iget-object v4, p0, LRh/k;->f:[I

    .line 42
    .line 43
    invoke-static {v3, v4, v5, v0}, LRh/e;->n(I[IILRh/a;)V

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, LRh/k;->n:[I

    .line 47
    .line 48
    iget-object v4, p0, LRh/k;->f:[I

    .line 49
    .line 50
    invoke-static {v4, v5, v0}, LRh/e;->m([IILRh/a;)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    aput v4, v3, v2

    .line 55
    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-static {v0}, LRh/a;->j(LRh/a;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x2

    .line 63
    invoke-static {v0, v2}, LRh/a;->i(LRh/a;I)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    iput v5, p0, LRh/k;->K:I

    .line 68
    .line 69
    const/4 v5, 0x4

    .line 70
    invoke-static {v0, v5}, LRh/a;->i(LRh/a;I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    iget v7, p0, LRh/k;->K:I

    .line 75
    .line 76
    shl-int/2addr v6, v7

    .line 77
    add-int/lit8 v6, v6, 0x10

    .line 78
    .line 79
    iput v6, p0, LRh/k;->I:I

    .line 80
    .line 81
    shl-int v8, v4, v7

    .line 82
    .line 83
    sub-int/2addr v8, v4

    .line 84
    iput v8, p0, LRh/k;->J:I

    .line 85
    .line 86
    const/16 v8, 0x30

    .line 87
    .line 88
    shl-int v7, v8, v7

    .line 89
    .line 90
    add-int/2addr v6, v7

    .line 91
    iget-object v7, p0, LRh/k;->o:[I

    .line 92
    .line 93
    aget v7, v7, v1

    .line 94
    .line 95
    new-array v7, v7, [B

    .line 96
    .line 97
    iput-object v7, p0, LRh/k;->z:[B

    .line 98
    .line 99
    move v7, v1

    .line 100
    :goto_1
    iget-object v8, p0, LRh/k;->o:[I

    .line 101
    .line 102
    aget v8, v8, v1

    .line 103
    .line 104
    if-ge v7, v8, :cond_3

    .line 105
    .line 106
    add-int/lit8 v9, v7, 0x60

    .line 107
    .line 108
    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    :goto_2
    if-ge v7, v8, :cond_2

    .line 113
    .line 114
    iget-object v9, p0, LRh/k;->z:[B

    .line 115
    .line 116
    invoke-static {v0, v2}, LRh/a;->i(LRh/a;I)I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    shl-int/2addr v10, v4

    .line 121
    int-to-byte v10, v10

    .line 122
    aput-byte v10, v9, v7

    .line 123
    .line 124
    add-int/lit8 v7, v7, 0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_2
    invoke-static {v0}, LRh/a;->j(LRh/a;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    shl-int/lit8 v7, v8, 0x6

    .line 132
    .line 133
    new-array v7, v7, [B

    .line 134
    .line 135
    iput-object v7, p0, LRh/k;->A:[B

    .line 136
    .line 137
    shl-int/lit8 v8, v8, 0x6

    .line 138
    .line 139
    invoke-static {v8, v7, v0}, LRh/e;->d(I[BLRh/a;)I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    iput-boolean v4, p0, LRh/k;->u:Z

    .line 144
    .line 145
    move v8, v1

    .line 146
    :goto_3
    iget-object v9, p0, LRh/k;->o:[I

    .line 147
    .line 148
    aget v10, v9, v1

    .line 149
    .line 150
    shl-int/lit8 v10, v10, 0x6

    .line 151
    .line 152
    if-ge v8, v10, :cond_5

    .line 153
    .line 154
    iget-object v10, p0, LRh/k;->A:[B

    .line 155
    .line 156
    aget-byte v10, v10, v8

    .line 157
    .line 158
    shr-int/lit8 v11, v8, 0x6

    .line 159
    .line 160
    if-eq v10, v11, :cond_4

    .line 161
    .line 162
    iput-boolean v1, p0, LRh/k;->u:Z

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_5
    :goto_4
    aget v8, v9, v2

    .line 169
    .line 170
    shl-int/lit8 v9, v8, 0x2

    .line 171
    .line 172
    new-array v9, v9, [B

    .line 173
    .line 174
    iput-object v9, p0, LRh/k;->H:[B

    .line 175
    .line 176
    shl-int/2addr v8, v2

    .line 177
    invoke-static {v8, v9, v0}, LRh/e;->d(I[BLRh/a;)I

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    iget-object v9, p0, LRh/k;->k:LRh/h;

    .line 182
    .line 183
    const/16 v10, 0x100

    .line 184
    .line 185
    invoke-static {v9, v10, v7}, LRh/h;->b(LRh/h;II)V

    .line 186
    .line 187
    .line 188
    iget-object v7, p0, LRh/k;->l:LRh/h;

    .line 189
    .line 190
    iget-object v9, p0, LRh/k;->o:[I

    .line 191
    .line 192
    aget v9, v9, v4

    .line 193
    .line 194
    const/16 v10, 0x2c0

    .line 195
    .line 196
    invoke-static {v7, v10, v9}, LRh/h;->b(LRh/h;II)V

    .line 197
    .line 198
    .line 199
    iget-object v7, p0, LRh/k;->m:LRh/h;

    .line 200
    .line 201
    invoke-static {v7, v6, v8}, LRh/h;->b(LRh/h;II)V

    .line 202
    .line 203
    .line 204
    iget-object v6, p0, LRh/k;->k:LRh/h;

    .line 205
    .line 206
    invoke-static {v6, v0}, LRh/h;->a(LRh/h;LRh/a;)V

    .line 207
    .line 208
    .line 209
    iget-object v6, p0, LRh/k;->l:LRh/h;

    .line 210
    .line 211
    invoke-static {v6, v0}, LRh/h;->a(LRh/h;LRh/a;)V

    .line 212
    .line 213
    .line 214
    iget-object v6, p0, LRh/k;->m:LRh/h;

    .line 215
    .line 216
    invoke-static {v6, v0}, LRh/h;->a(LRh/h;LRh/a;)V

    .line 217
    .line 218
    .line 219
    iput v1, p0, LRh/k;->B:I

    .line 220
    .line 221
    iput v1, p0, LRh/k;->C:I

    .line 222
    .line 223
    sget-object v0, LRh/d;->b:[I

    .line 224
    .line 225
    iget-object v6, p0, LRh/k;->z:[B

    .line 226
    .line 227
    aget-byte v6, v6, v1

    .line 228
    .line 229
    aget v7, v0, v6

    .line 230
    .line 231
    iput v7, p0, LRh/k;->D:I

    .line 232
    .line 233
    add-int/2addr v6, v4

    .line 234
    aget v0, v0, v6

    .line 235
    .line 236
    iput v0, p0, LRh/k;->E:I

    .line 237
    .line 238
    iput v1, p0, LRh/k;->v:I

    .line 239
    .line 240
    iget-object v0, p0, LRh/k;->k:LRh/h;

    .line 241
    .line 242
    iget-object v0, v0, LRh/h;->c:[I

    .line 243
    .line 244
    aget v0, v0, v1

    .line 245
    .line 246
    iput v0, p0, LRh/k;->w:I

    .line 247
    .line 248
    iget-object v0, p0, LRh/k;->l:LRh/h;

    .line 249
    .line 250
    iget-object v0, v0, LRh/h;->c:[I

    .line 251
    .line 252
    aget v0, v0, v1

    .line 253
    .line 254
    iput v0, p0, LRh/k;->F:I

    .line 255
    .line 256
    iget-object p0, p0, LRh/k;->p:[I

    .line 257
    .line 258
    aput v4, p0, v5

    .line 259
    .line 260
    aput v4, p0, v2

    .line 261
    .line 262
    aput v4, p0, v1

    .line 263
    .line 264
    const/4 v0, 0x5

    .line 265
    aput v1, p0, v0

    .line 266
    .line 267
    aput v1, p0, v3

    .line 268
    .line 269
    aput v1, p0, v4

    .line 270
    .line 271
    return-void
.end method

.method private static q(LRh/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, LRh/k;->c:LRh/a;

    .line 2
    .line 3
    iget-boolean v1, p0, LRh/k;->h:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/16 v0, 0xa

    .line 8
    .line 9
    iput v0, p0, LRh/k;->b:I

    .line 10
    .line 11
    iget v0, p0, LRh/k;->r:I

    .line 12
    .line 13
    iput v0, p0, LRh/k;->Y:I

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, LRh/k;->X:I

    .line 17
    .line 18
    const/16 v0, 0xc

    .line 19
    .line 20
    iput v0, p0, LRh/k;->a:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v1, p0, LRh/k;->k:LRh/h;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    iput-object v2, v1, LRh/h;->b:[I

    .line 27
    .line 28
    iput-object v2, v1, LRh/h;->c:[I

    .line 29
    .line 30
    iget-object v1, p0, LRh/k;->l:LRh/h;

    .line 31
    .line 32
    iput-object v2, v1, LRh/h;->b:[I

    .line 33
    .line 34
    iput-object v2, v1, LRh/h;->c:[I

    .line 35
    .line 36
    iget-object v1, p0, LRh/k;->m:LRh/h;

    .line 37
    .line 38
    iput-object v2, v1, LRh/h;->b:[I

    .line 39
    .line 40
    iput-object v2, v1, LRh/h;->c:[I

    .line 41
    .line 42
    invoke-static {v0}, LRh/a;->j(LRh/a;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p0}, LRh/e;->g(LRh/a;LRh/k;)V

    .line 46
    .line 47
    .line 48
    iget v1, p0, LRh/k;->g:I

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-boolean v1, p0, LRh/k;->j:Z

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    iget-boolean v1, p0, LRh/k;->i:Z

    .line 58
    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    iget-boolean v1, p0, LRh/k;->j:Z

    .line 62
    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/4 v0, 0x2

    .line 67
    iput v0, p0, LRh/k;->a:I

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    :goto_0
    invoke-static {v0}, LRh/a;->g(LRh/a;)V

    .line 71
    .line 72
    .line 73
    iget-boolean v0, p0, LRh/k;->j:Z

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    const/4 v0, 0x4

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    const/4 v0, 0x5

    .line 80
    :goto_1
    iput v0, p0, LRh/k;->a:I

    .line 81
    .line 82
    :goto_2
    iget-boolean v0, p0, LRh/k;->j:Z

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    iget-wide v0, p0, LRh/k;->R:J

    .line 88
    .line 89
    iget v2, p0, LRh/k;->g:I

    .line 90
    .line 91
    int-to-long v2, v2

    .line 92
    add-long/2addr v0, v2

    .line 93
    iput-wide v0, p0, LRh/k;->R:J

    .line 94
    .line 95
    iget v0, p0, LRh/k;->Q:I

    .line 96
    .line 97
    iget v1, p0, LRh/k;->P:I

    .line 98
    .line 99
    if-ge v0, v1, :cond_6

    .line 100
    .line 101
    invoke-static {p0}, LRh/e;->k(LRh/k;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    :goto_3
    return-void
.end method

.method private static r([IILRh/a;)I
    .locals 6

    .line 1
    iget-wide v0, p2, LRh/a;->f:J

    .line 2
    .line 3
    iget v2, p2, LRh/a;->g:I

    .line 4
    .line 5
    ushr-long/2addr v0, v2

    .line 6
    long-to-int v0, v0

    .line 7
    and-int/lit16 v1, v0, 0xff

    .line 8
    .line 9
    add-int/2addr p1, v1

    .line 10
    aget v1, p0, p1

    .line 11
    .line 12
    shr-int/lit8 v3, v1, 0x10

    .line 13
    .line 14
    const v4, 0xffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v1, v4

    .line 18
    const/16 v5, 0x8

    .line 19
    .line 20
    if-gt v3, v5, :cond_0

    .line 21
    .line 22
    add-int/2addr v2, v3

    .line 23
    iput v2, p2, LRh/a;->g:I

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    add-int/2addr p1, v1

    .line 27
    const/4 v1, 0x1

    .line 28
    shl-int v3, v1, v3

    .line 29
    .line 30
    sub-int/2addr v3, v1

    .line 31
    and-int/2addr v0, v3

    .line 32
    ushr-int/2addr v0, v5

    .line 33
    add-int/2addr p1, v0

    .line 34
    aget p0, p0, p1

    .line 35
    .line 36
    shr-int/lit8 p1, p0, 0x10

    .line 37
    .line 38
    add-int/2addr p1, v5

    .line 39
    add-int/2addr v2, p1

    .line 40
    iput v2, p2, LRh/a;->g:I

    .line 41
    .line 42
    and-int/2addr p0, v4

    .line 43
    return p0
.end method

.method static s(LRh/k;[B)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    new-array p1, p1, [B

    .line 5
    .line 6
    :cond_0
    iput-object p1, p0, LRh/k;->S:[B

    .line 7
    .line 8
    return-void
.end method

.method private static t(I[II)I
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-ge p0, v0, :cond_0

    .line 4
    .line 5
    sget-object v0, LRh/e;->b:[I

    .line 6
    .line 7
    aget v0, v0, p0

    .line 8
    .line 9
    add-int/2addr p2, v0

    .line 10
    and-int/lit8 p2, p2, 0x3

    .line 11
    .line 12
    aget p1, p1, p2

    .line 13
    .line 14
    sget-object p2, LRh/e;->c:[I

    .line 15
    .line 16
    aget p0, p2, p0

    .line 17
    .line 18
    add-int/2addr p1, p0

    .line 19
    return p1

    .line 20
    :cond_0
    add-int/lit8 p0, p0, -0xf

    .line 21
    .line 22
    return p0
.end method

.method private static u(LRh/k;)Z
    .locals 7

    .line 1
    iget v0, p0, LRh/k;->T:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v2, p0, LRh/k;->X:I

    .line 7
    .line 8
    add-int/2addr v2, v0

    .line 9
    iput v2, p0, LRh/k;->X:I

    .line 10
    .line 11
    iput v1, p0, LRh/k;->T:I

    .line 12
    .line 13
    :cond_0
    iget v0, p0, LRh/k;->V:I

    .line 14
    .line 15
    iget v2, p0, LRh/k;->W:I

    .line 16
    .line 17
    sub-int/2addr v0, v2

    .line 18
    iget v2, p0, LRh/k;->Y:I

    .line 19
    .line 20
    iget v3, p0, LRh/k;->X:I

    .line 21
    .line 22
    sub-int/2addr v2, v3

    .line 23
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, LRh/k;->d:[B

    .line 30
    .line 31
    iget v3, p0, LRh/k;->X:I

    .line 32
    .line 33
    iget-object v4, p0, LRh/k;->Z:[B

    .line 34
    .line 35
    iget v5, p0, LRh/k;->U:I

    .line 36
    .line 37
    iget v6, p0, LRh/k;->W:I

    .line 38
    .line 39
    add-int/2addr v5, v6

    .line 40
    invoke-static {v2, v3, v4, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 41
    .line 42
    .line 43
    iget v2, p0, LRh/k;->W:I

    .line 44
    .line 45
    add-int/2addr v2, v0

    .line 46
    iput v2, p0, LRh/k;->W:I

    .line 47
    .line 48
    iget v2, p0, LRh/k;->X:I

    .line 49
    .line 50
    add-int/2addr v2, v0

    .line 51
    iput v2, p0, LRh/k;->X:I

    .line 52
    .line 53
    :cond_1
    iget v0, p0, LRh/k;->W:I

    .line 54
    .line 55
    iget p0, p0, LRh/k;->V:I

    .line 56
    .line 57
    if-ge v0, p0, :cond_2

    .line 58
    .line 59
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_2
    return v1
.end method
