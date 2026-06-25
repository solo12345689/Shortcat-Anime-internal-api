.class public final LS0/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public a:[J

.field public b:[J

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xc0

    .line 5
    .line 6
    new-array v1, v0, [J

    .line 7
    .line 8
    iput-object v1, p0, LS0/a;->a:[J

    .line 9
    .line 10
    new-array v0, v0, [J

    .line 11
    .line 12
    iput-object v0, p0, LS0/a;->b:[J

    .line 13
    .line 14
    return-void
.end method

.method private final h(II[J)V
    .locals 0

    .line 1
    mul-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x3

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const-string p3, "copyOf(...)"

    .line 14
    .line 15
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, LS0/a;->a:[J

    .line 19
    .line 20
    iget-object p2, p0, LS0/a;->b:[J

    .line 21
    .line 22
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LS0/a;->b:[J

    .line 30
    .line 31
    return-void
.end method

.method private final k(JII)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LS0/a;->a:[J

    .line 4
    .line 5
    iget-object v2, v0, LS0/a;->b:[J

    .line 6
    .line 7
    invoke-virtual {v0}, LS0/a;->c()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    aput-wide p1, v2, v4

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    :cond_0
    if-lez v4, :cond_4

    .line 16
    .line 17
    add-int/lit8 v4, v4, -0x1

    .line 18
    .line 19
    aget-wide v5, v2, v4

    .line 20
    .line 21
    long-to-int v7, v5

    .line 22
    const v8, 0x3ffffff

    .line 23
    .line 24
    .line 25
    and-int/2addr v7, v8

    .line 26
    const/16 v9, 0x1a

    .line 27
    .line 28
    shr-long v10, v5, v9

    .line 29
    .line 30
    long-to-int v10, v10

    .line 31
    and-int/2addr v10, v8

    .line 32
    const/16 v11, 0x34

    .line 33
    .line 34
    shr-long/2addr v5, v11

    .line 35
    long-to-int v5, v5

    .line 36
    const/16 v6, 0x1ff

    .line 37
    .line 38
    and-int/2addr v5, v6

    .line 39
    if-ne v5, v6, :cond_1

    .line 40
    .line 41
    move v5, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    add-int/2addr v5, v10

    .line 44
    :goto_0
    if-ltz v10, :cond_4

    .line 45
    .line 46
    :goto_1
    array-length v12, v1

    .line 47
    add-int/lit8 v12, v12, -0x2

    .line 48
    .line 49
    if-ge v10, v12, :cond_0

    .line 50
    .line 51
    if-ge v10, v5, :cond_0

    .line 52
    .line 53
    add-int/lit8 v12, v10, 0x2

    .line 54
    .line 55
    aget-wide v13, v1, v12

    .line 56
    .line 57
    move/from16 p1, v8

    .line 58
    .line 59
    move/from16 p2, v9

    .line 60
    .line 61
    shr-long v8, v13, p2

    .line 62
    .line 63
    long-to-int v8, v8

    .line 64
    and-int v8, v8, p1

    .line 65
    .line 66
    if-ne v8, v7, :cond_2

    .line 67
    .line 68
    aget-wide v8, v1, v10

    .line 69
    .line 70
    add-int/lit8 v15, v10, 0x1

    .line 71
    .line 72
    move/from16 v16, v11

    .line 73
    .line 74
    move/from16 v17, v12

    .line 75
    .line 76
    aget-wide v11, v1, v15

    .line 77
    .line 78
    const/16 v18, 0x20

    .line 79
    .line 80
    move/from16 v19, v7

    .line 81
    .line 82
    shr-long v6, v8, v18

    .line 83
    .line 84
    long-to-int v6, v6

    .line 85
    add-int v6, v6, p3

    .line 86
    .line 87
    long-to-int v7, v8

    .line 88
    add-int v7, v7, p4

    .line 89
    .line 90
    int-to-long v8, v6

    .line 91
    shl-long v8, v8, v18

    .line 92
    .line 93
    int-to-long v6, v7

    .line 94
    const-wide v20, 0xffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    and-long v6, v6, v20

    .line 100
    .line 101
    or-long/2addr v6, v8

    .line 102
    aput-wide v6, v1, v10

    .line 103
    .line 104
    shr-long v6, v11, v18

    .line 105
    .line 106
    long-to-int v6, v6

    .line 107
    add-int v6, v6, p3

    .line 108
    .line 109
    long-to-int v7, v11

    .line 110
    add-int v7, v7, p4

    .line 111
    .line 112
    int-to-long v8, v6

    .line 113
    shl-long v8, v8, v18

    .line 114
    .line 115
    int-to-long v6, v7

    .line 116
    and-long v6, v6, v20

    .line 117
    .line 118
    or-long/2addr v6, v8

    .line 119
    aput-wide v6, v1, v15

    .line 120
    .line 121
    const-wide/high16 v6, 0x2000000000000000L

    .line 122
    .line 123
    or-long/2addr v6, v13

    .line 124
    aput-wide v6, v1, v17

    .line 125
    .line 126
    shr-long v6, v13, v16

    .line 127
    .line 128
    long-to-int v6, v6

    .line 129
    const/16 v7, 0x1ff

    .line 130
    .line 131
    and-int/2addr v6, v7

    .line 132
    if-lez v6, :cond_3

    .line 133
    .line 134
    add-int/lit8 v6, v4, 0x1

    .line 135
    .line 136
    add-int/lit8 v8, v10, 0x3

    .line 137
    .line 138
    const-wide v11, -0xffffffc000001L

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    and-long/2addr v11, v13

    .line 144
    and-int v8, v8, p1

    .line 145
    .line 146
    int-to-long v8, v8

    .line 147
    shl-long v8, v8, p2

    .line 148
    .line 149
    or-long/2addr v8, v11

    .line 150
    aput-wide v8, v2, v4

    .line 151
    .line 152
    move v4, v6

    .line 153
    goto :goto_2

    .line 154
    :cond_2
    move/from16 v19, v7

    .line 155
    .line 156
    move/from16 v16, v11

    .line 157
    .line 158
    move v7, v6

    .line 159
    :cond_3
    :goto_2
    add-int/lit8 v10, v10, 0x3

    .line 160
    .line 161
    move/from16 v8, p1

    .line 162
    .line 163
    move/from16 v9, p2

    .line 164
    .line 165
    move v6, v7

    .line 166
    move/from16 v11, v16

    .line 167
    .line 168
    move/from16 v7, v19

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_4
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget-object v0, p0, LS0/a;->a:[J

    .line 2
    .line 3
    iget v1, p0, LS0/a;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :goto_0
    array-length v3, v0

    .line 7
    add-int/lit8 v3, v3, -0x2

    .line 8
    .line 9
    if-ge v2, v3, :cond_0

    .line 10
    .line 11
    if-ge v2, v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v3, v2, 0x2

    .line 14
    .line 15
    aget-wide v4, v0, v3

    .line 16
    .line 17
    const-wide v6, -0x2000000000000001L    # -2.681561585988519E154

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v4, v6

    .line 23
    aput-wide v4, v0, v3

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 10

    .line 1
    iget-object v0, p0, LS0/a;->a:[J

    .line 2
    .line 3
    iget v1, p0, LS0/a;->c:I

    .line 4
    .line 5
    iget-object v2, p0, LS0/a;->b:[J

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move v4, v3

    .line 9
    :goto_0
    array-length v5, v0

    .line 10
    add-int/lit8 v5, v5, -0x2

    .line 11
    .line 12
    if-ge v3, v5, :cond_1

    .line 13
    .line 14
    array-length v5, v2

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    if-ge v4, v5, :cond_1

    .line 18
    .line 19
    if-ge v3, v1, :cond_1

    .line 20
    .line 21
    add-int/lit8 v5, v3, 0x2

    .line 22
    .line 23
    aget-wide v6, v0, v5

    .line 24
    .line 25
    const-wide v8, 0x1fffffffffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    cmp-long v6, v6, v8

    .line 31
    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    aget-wide v6, v0, v3

    .line 35
    .line 36
    aput-wide v6, v2, v4

    .line 37
    .line 38
    add-int/lit8 v6, v4, 0x1

    .line 39
    .line 40
    add-int/lit8 v7, v3, 0x1

    .line 41
    .line 42
    aget-wide v7, v0, v7

    .line 43
    .line 44
    aput-wide v7, v2, v6

    .line 45
    .line 46
    add-int/lit8 v6, v4, 0x2

    .line 47
    .line 48
    aget-wide v7, v0, v5

    .line 49
    .line 50
    aput-wide v7, v2, v6

    .line 51
    .line 52
    add-int/lit8 v4, v4, 0x3

    .line 53
    .line 54
    :cond_0
    add-int/lit8 v3, v3, 0x3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iput v4, p0, LS0/a;->c:I

    .line 58
    .line 59
    iput-object v2, p0, LS0/a;->a:[J

    .line 60
    .line 61
    iput-object v0, p0, LS0/a;->b:[J

    .line 62
    .line 63
    return-void
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, LS0/a;->c:I

    .line 2
    .line 3
    div-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    return v0
.end method

.method public final d(IIIIIIZZ)V
    .locals 8

    .line 1
    iget-object v0, p0, LS0/a;->a:[J

    .line 2
    .line 3
    iget v1, p0, LS0/a;->c:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    iput v2, p0, LS0/a;->c:I

    .line 8
    .line 9
    array-length v3, v0

    .line 10
    if-gt v3, v2, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, v3, v1, v0}, LS0/a;->h(II[J)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, LS0/a;->a:[J

    .line 16
    .line 17
    int-to-long v2, p2

    .line 18
    const/16 p2, 0x20

    .line 19
    .line 20
    shl-long/2addr v2, p2

    .line 21
    int-to-long v4, p3

    .line 22
    const-wide v6, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v4, v6

    .line 28
    or-long/2addr v2, v4

    .line 29
    aput-wide v2, v0, v1

    .line 30
    .line 31
    add-int/lit8 p3, v1, 0x1

    .line 32
    .line 33
    int-to-long v2, p4

    .line 34
    shl-long/2addr v2, p2

    .line 35
    int-to-long v4, p5

    .line 36
    and-long/2addr v4, v6

    .line 37
    or-long/2addr v2, v4

    .line 38
    aput-wide v2, v0, p3

    .line 39
    .line 40
    add-int/lit8 p2, v1, 0x2

    .line 41
    .line 42
    move/from16 p3, p8

    .line 43
    .line 44
    int-to-long p3, p3

    .line 45
    const/16 v2, 0x3f

    .line 46
    .line 47
    shl-long/2addr p3, v2

    .line 48
    int-to-long v2, p7

    .line 49
    const/16 v4, 0x3e

    .line 50
    .line 51
    shl-long/2addr v2, v4

    .line 52
    or-long/2addr p3, v2

    .line 53
    const/4 v2, 0x1

    .line 54
    int-to-long v2, v2

    .line 55
    const/16 v4, 0x3d

    .line 56
    .line 57
    shl-long/2addr v2, v4

    .line 58
    or-long/2addr p3, v2

    .line 59
    const/4 v2, 0x0

    .line 60
    int-to-long v2, v2

    .line 61
    const/16 v4, 0x34

    .line 62
    .line 63
    shl-long/2addr v2, v4

    .line 64
    or-long/2addr p3, v2

    .line 65
    const v2, 0x3ffffff

    .line 66
    .line 67
    .line 68
    and-int v3, p6, v2

    .line 69
    .line 70
    int-to-long v5, v3

    .line 71
    const/16 v7, 0x1a

    .line 72
    .line 73
    shl-long/2addr v5, v7

    .line 74
    or-long/2addr p3, v5

    .line 75
    and-int/2addr p1, v2

    .line 76
    int-to-long v5, p1

    .line 77
    or-long/2addr p3, v5

    .line 78
    aput-wide p3, v0, p2

    .line 79
    .line 80
    if-gez p6, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    add-int/lit8 p1, v1, -0x3

    .line 84
    .line 85
    :goto_0
    if-ltz p1, :cond_3

    .line 86
    .line 87
    add-int/lit8 p2, p1, 0x2

    .line 88
    .line 89
    aget-wide p3, v0, p2

    .line 90
    .line 91
    long-to-int v5, p3

    .line 92
    and-int/2addr v5, v2

    .line 93
    if-ne v5, v3, :cond_2

    .line 94
    .line 95
    sub-int/2addr v1, p1

    .line 96
    const-wide v2, -0x1ff0000000000001L    # -5.363123171977038E154

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    and-long/2addr p3, v2

    .line 102
    and-int/lit16 p1, v1, 0x1ff

    .line 103
    .line 104
    int-to-long v1, p1

    .line 105
    shl-long/2addr v1, v4

    .line 106
    or-long/2addr p3, v1

    .line 107
    aput-wide p3, v0, p2

    .line 108
    .line 109
    return-void

    .line 110
    :cond_2
    add-int/lit8 p1, p1, -0x3

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    :goto_1
    return-void
.end method

.method public final e(I)V
    .locals 8

    .line 1
    const v0, 0x3ffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget-object v1, p0, LS0/a;->a:[J

    .line 6
    .line 7
    iget v2, p0, LS0/a;->c:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    array-length v4, v1

    .line 11
    add-int/lit8 v4, v4, -0x2

    .line 12
    .line 13
    if-ge v3, v4, :cond_1

    .line 14
    .line 15
    if-ge v3, v2, :cond_1

    .line 16
    .line 17
    add-int/lit8 v4, v3, 0x2

    .line 18
    .line 19
    aget-wide v5, v1, v4

    .line 20
    .line 21
    long-to-int v7, v5

    .line 22
    and-int/2addr v7, v0

    .line 23
    if-ne v7, p1, :cond_0

    .line 24
    .line 25
    const-wide/high16 v2, 0x2000000000000000L

    .line 26
    .line 27
    or-long/2addr v2, v5

    .line 28
    aput-wide v2, v1, v4

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final f(IIIII)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x3ffffff

    .line 8
    .line 9
    .line 10
    and-int v4, p1, v3

    .line 11
    .line 12
    iget-object v5, v0, LS0/a;->a:[J

    .line 13
    .line 14
    iget v6, v0, LS0/a;->c:I

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    :goto_0
    array-length v9, v5

    .line 18
    add-int/lit8 v9, v9, -0x2

    .line 19
    .line 20
    if-ge v8, v9, :cond_4

    .line 21
    .line 22
    if-ge v8, v6, :cond_4

    .line 23
    .line 24
    add-int/lit8 v9, v8, 0x2

    .line 25
    .line 26
    aget-wide v10, v5, v9

    .line 27
    .line 28
    long-to-int v12, v10

    .line 29
    and-int/2addr v12, v3

    .line 30
    if-ne v12, v4, :cond_3

    .line 31
    .line 32
    aget-wide v12, v5, v8

    .line 33
    .line 34
    int-to-long v14, v1

    .line 35
    const/16 v4, 0x20

    .line 36
    .line 37
    shl-long/2addr v14, v4

    .line 38
    move/from16 v16, v3

    .line 39
    .line 40
    move/from16 p1, v4

    .line 41
    .line 42
    int-to-long v3, v2

    .line 43
    const-wide v17, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long v3, v3, v17

    .line 49
    .line 50
    or-long/2addr v3, v14

    .line 51
    aput-wide v3, v5, v8

    .line 52
    .line 53
    add-int/lit8 v3, v8, 0x1

    .line 54
    .line 55
    move/from16 v14, p4

    .line 56
    .line 57
    int-to-long v14, v14

    .line 58
    shl-long v14, v14, p1

    .line 59
    .line 60
    move/from16 v4, p5

    .line 61
    .line 62
    move/from16 v20, v8

    .line 63
    .line 64
    const/16 v19, 0x0

    .line 65
    .line 66
    int-to-long v7, v4

    .line 67
    and-long v6, v7, v17

    .line 68
    .line 69
    or-long/2addr v6, v14

    .line 70
    aput-wide v6, v5, v3

    .line 71
    .line 72
    const-wide/high16 v3, 0x2000000000000000L

    .line 73
    .line 74
    or-long/2addr v3, v10

    .line 75
    aput-wide v3, v5, v9

    .line 76
    .line 77
    shr-long v3, v12, p1

    .line 78
    .line 79
    long-to-int v3, v3

    .line 80
    sub-int/2addr v1, v3

    .line 81
    long-to-int v3, v12

    .line 82
    sub-int/2addr v2, v3

    .line 83
    const/4 v3, 0x1

    .line 84
    if-eqz v1, :cond_0

    .line 85
    .line 86
    move v4, v3

    .line 87
    goto :goto_1

    .line 88
    :cond_0
    move/from16 v4, v19

    .line 89
    .line 90
    :goto_1
    if-eqz v2, :cond_1

    .line 91
    .line 92
    move v7, v3

    .line 93
    goto :goto_2

    .line 94
    :cond_1
    move/from16 v7, v19

    .line 95
    .line 96
    :goto_2
    or-int/2addr v4, v7

    .line 97
    if-eqz v4, :cond_2

    .line 98
    .line 99
    add-int/lit8 v8, v20, 0x3

    .line 100
    .line 101
    const-wide v4, -0xffffffc000001L

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v4, v10

    .line 107
    and-int v6, v8, v16

    .line 108
    .line 109
    int-to-long v6, v6

    .line 110
    const/16 v8, 0x1a

    .line 111
    .line 112
    shl-long/2addr v6, v8

    .line 113
    or-long/2addr v4, v6

    .line 114
    invoke-direct {v0, v4, v5, v1, v2}, LS0/a;->k(JII)V

    .line 115
    .line 116
    .line 117
    :cond_2
    return v3

    .line 118
    :cond_3
    move/from16 v14, p4

    .line 119
    .line 120
    move/from16 v16, v3

    .line 121
    .line 122
    move/from16 v20, v8

    .line 123
    .line 124
    const/16 v19, 0x0

    .line 125
    .line 126
    add-int/lit8 v8, v20, 0x3

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_4
    const/16 v19, 0x0

    .line 130
    .line 131
    return v19
.end method

.method public final g(I)Z
    .locals 8

    .line 1
    const v0, 0x3ffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget-object v1, p0, LS0/a;->a:[J

    .line 6
    .line 7
    iget v2, p0, LS0/a;->c:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    array-length v5, v1

    .line 12
    add-int/lit8 v5, v5, -0x2

    .line 13
    .line 14
    if-ge v4, v5, :cond_1

    .line 15
    .line 16
    if-ge v4, v2, :cond_1

    .line 17
    .line 18
    add-int/lit8 v5, v4, 0x2

    .line 19
    .line 20
    aget-wide v6, v1, v5

    .line 21
    .line 22
    long-to-int v6, v6

    .line 23
    and-int/2addr v6, v0

    .line 24
    if-ne v6, p1, :cond_0

    .line 25
    .line 26
    const-wide/16 v2, -0x1

    .line 27
    .line 28
    aput-wide v2, v1, v4

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    add-int/2addr v4, p1

    .line 32
    aput-wide v2, v1, v4

    .line 33
    .line 34
    const-wide v2, 0x1fffffffffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    aput-wide v2, v1, v5

    .line 40
    .line 41
    return p1

    .line 42
    :cond_0
    add-int/lit8 v4, v4, 0x3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return v3
.end method

.method public final i(IIIII)Z
    .locals 10

    .line 1
    const v0, 0x3ffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget-object v1, p0, LS0/a;->a:[J

    .line 6
    .line 7
    iget v2, p0, LS0/a;->c:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    array-length v5, v1

    .line 12
    add-int/lit8 v5, v5, -0x2

    .line 13
    .line 14
    if-ge v4, v5, :cond_1

    .line 15
    .line 16
    if-ge v4, v2, :cond_1

    .line 17
    .line 18
    add-int/lit8 v5, v4, 0x2

    .line 19
    .line 20
    aget-wide v6, v1, v5

    .line 21
    .line 22
    long-to-int v8, v6

    .line 23
    and-int/2addr v8, v0

    .line 24
    if-ne v8, p1, :cond_0

    .line 25
    .line 26
    int-to-long p1, p2

    .line 27
    const/16 v0, 0x20

    .line 28
    .line 29
    shl-long/2addr p1, v0

    .line 30
    int-to-long v2, p3

    .line 31
    const-wide v8, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v2, v8

    .line 37
    or-long/2addr p1, v2

    .line 38
    aput-wide p1, v1, v4

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    add-int/2addr v4, p1

    .line 42
    int-to-long p2, p4

    .line 43
    shl-long/2addr p2, v0

    .line 44
    int-to-long p4, p5

    .line 45
    and-long/2addr p4, v8

    .line 46
    or-long/2addr p2, p4

    .line 47
    aput-wide p2, v1, v4

    .line 48
    .line 49
    const-wide/high16 p2, 0x2000000000000000L

    .line 50
    .line 51
    or-long/2addr p2, v6

    .line 52
    aput-wide p2, v1, v5

    .line 53
    .line 54
    return p1

    .line 55
    :cond_0
    add-int/lit8 v4, v4, 0x3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return v3
.end method

.method public final j(IZZ)Z
    .locals 9

    .line 1
    const v0, 0x3ffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget-object v1, p0, LS0/a;->a:[J

    .line 6
    .line 7
    iget v2, p0, LS0/a;->c:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    array-length v5, v1

    .line 12
    add-int/lit8 v5, v5, -0x2

    .line 13
    .line 14
    if-ge v4, v5, :cond_1

    .line 15
    .line 16
    if-ge v4, v2, :cond_1

    .line 17
    .line 18
    add-int/lit8 v5, v4, 0x2

    .line 19
    .line 20
    aget-wide v6, v1, v5

    .line 21
    .line 22
    long-to-int v8, v6

    .line 23
    and-int/2addr v8, v0

    .line 24
    if-ne v8, p1, :cond_0

    .line 25
    .line 26
    const-wide v2, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v2, v6

    .line 32
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 33
    .line 34
    int-to-long p1, p2

    .line 35
    mul-long/2addr p1, v6

    .line 36
    or-long/2addr p1, v2

    .line 37
    const-wide/high16 v2, -0x8000000000000000L

    .line 38
    .line 39
    int-to-long v6, p3

    .line 40
    mul-long/2addr v6, v2

    .line 41
    or-long/2addr p1, v6

    .line 42
    aput-wide p1, v1, v5

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_0
    add-int/lit8 v4, v4, 0x3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return v3
.end method

.method public final l(ILie/p;)Z
    .locals 7

    .line 1
    const v0, 0x3ffffff

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget-object v1, p0, LS0/a;->a:[J

    .line 6
    .line 7
    iget v2, p0, LS0/a;->c:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    array-length v5, v1

    .line 12
    add-int/lit8 v5, v5, -0x2

    .line 13
    .line 14
    if-ge v4, v5, :cond_1

    .line 15
    .line 16
    if-ge v4, v2, :cond_1

    .line 17
    .line 18
    add-int/lit8 v5, v4, 0x2

    .line 19
    .line 20
    aget-wide v5, v1, v5

    .line 21
    .line 22
    long-to-int v5, v5

    .line 23
    and-int/2addr v5, v0

    .line 24
    if-ne v5, p1, :cond_0

    .line 25
    .line 26
    aget-wide v2, v1, v4

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    add-int/2addr v4, p1

    .line 30
    aget-wide v0, v1, v4

    .line 31
    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    shr-long v5, v2, v4

    .line 35
    .line 36
    long-to-int v5, v5

    .line 37
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    long-to-int v2, v2

    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    shr-long v3, v0, v4

    .line 47
    .line 48
    long-to-int v3, v3

    .line 49
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    long-to-int v0, v0

    .line 54
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {p2, v5, v2, v3, v0}, Lie/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return p1

    .line 62
    :cond_0
    add-int/lit8 v4, v4, 0x3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return v3
.end method
