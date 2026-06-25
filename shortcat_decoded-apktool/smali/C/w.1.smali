.class public final LC/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LC/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC/w;

    .line 2
    .line 3
    invoke-direct {v0}, LC/w;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC/w;->a:LC/w;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;II)I
    .locals 10

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    mul-int/2addr v0, p3

    .line 16
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v1

    .line 26
    move v5, v3

    .line 27
    move v4, v2

    .line 28
    :goto_0
    const v6, 0x7fffffff

    .line 29
    .line 30
    .line 31
    if-ge v3, v0, :cond_4

    .line 32
    .line 33
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, LI0/l;

    .line 38
    .line 39
    invoke-static {v7}, LC/C;->c(LI0/l;)LC/F;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-static {v8}, LC/C;->e(LC/F;)F

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    cmpg-float v9, v8, v2

    .line 48
    .line 49
    if-nez v9, :cond_2

    .line 50
    .line 51
    if-ne p2, v6, :cond_1

    .line 52
    .line 53
    move v8, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sub-int v8, p2, p3

    .line 56
    .line 57
    :goto_1
    invoke-interface {v7, v6}, LI0/l;->q0(I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    add-int/2addr p3, v6

    .line 66
    invoke-interface {v7, v6}, LI0/l;->I(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    cmpl-float v6, v8, v2

    .line 76
    .line 77
    if-lez v6, :cond_3

    .line 78
    .line 79
    add-float/2addr v4, v8

    .line 80
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    cmpg-float v0, v4, v2

    .line 84
    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    move p2, v1

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    if-ne p2, v6, :cond_6

    .line 90
    .line 91
    move p2, v6

    .line 92
    goto :goto_3

    .line 93
    :cond_6
    sub-int/2addr p2, p3

    .line 94
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    int-to-float p2, p2

    .line 99
    div-float/2addr p2, v4

    .line 100
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    :goto_4
    if-ge v1, p3, :cond_9

    .line 109
    .line 110
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, LI0/l;

    .line 115
    .line 116
    invoke-static {v0}, LC/C;->c(LI0/l;)LC/F;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v3}, LC/C;->e(LC/F;)F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    cmpl-float v4, v3, v2

    .line 125
    .line 126
    if-lez v4, :cond_8

    .line 127
    .line 128
    if-eq p2, v6, :cond_7

    .line 129
    .line 130
    int-to-float v4, p2

    .line 131
    mul-float/2addr v4, v3

    .line 132
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move v3, v6

    .line 138
    :goto_5
    invoke-interface {v0, v3}, LI0/l;->I(I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move v5, v0

    .line 147
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    return v5
.end method

.method public final b(Ljava/util/List;II)I
    .locals 9

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v1

    .line 15
    move v4, v3

    .line 16
    move v5, v2

    .line 17
    :goto_0
    if-ge v1, v0, :cond_3

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, LI0/l;

    .line 24
    .line 25
    invoke-static {v6}, LC/C;->c(LI0/l;)LC/F;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {v7}, LC/C;->e(LC/F;)F

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-interface {v6, p2}, LI0/l;->q0(I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    cmpg-float v8, v7, v2

    .line 38
    .line 39
    if-nez v8, :cond_1

    .line 40
    .line 41
    add-int/2addr v4, v6

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    cmpl-float v8, v7, v2

    .line 44
    .line 45
    if-lez v8, :cond_2

    .line 46
    .line 47
    add-float/2addr v5, v7

    .line 48
    int-to-float v6, v6

    .line 49
    div-float/2addr v6, v7

    .line 50
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    int-to-float p2, v3

    .line 62
    mul-float/2addr p2, v5

    .line 63
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    add-int/2addr p2, v4

    .line 68
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    mul-int/2addr p1, p3

    .line 75
    add-int/2addr p2, p1

    .line 76
    return p2
.end method

.method public final c(Ljava/util/List;II)I
    .locals 10

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    mul-int/2addr v0, p3

    .line 16
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v1

    .line 26
    move v5, v3

    .line 27
    move v4, v2

    .line 28
    :goto_0
    const v6, 0x7fffffff

    .line 29
    .line 30
    .line 31
    if-ge v3, v0, :cond_4

    .line 32
    .line 33
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, LI0/l;

    .line 38
    .line 39
    invoke-static {v7}, LC/C;->c(LI0/l;)LC/F;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-static {v8}, LC/C;->e(LC/F;)F

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    cmpg-float v9, v8, v2

    .line 48
    .line 49
    if-nez v9, :cond_2

    .line 50
    .line 51
    if-ne p2, v6, :cond_1

    .line 52
    .line 53
    move v8, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sub-int v8, p2, p3

    .line 56
    .line 57
    :goto_1
    invoke-interface {v7, v6}, LI0/l;->q0(I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    add-int/2addr p3, v6

    .line 66
    invoke-interface {v7, v6}, LI0/l;->Z(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    cmpl-float v6, v8, v2

    .line 76
    .line 77
    if-lez v6, :cond_3

    .line 78
    .line 79
    add-float/2addr v4, v8

    .line 80
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    cmpg-float v0, v4, v2

    .line 84
    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    move p2, v1

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    if-ne p2, v6, :cond_6

    .line 90
    .line 91
    move p2, v6

    .line 92
    goto :goto_3

    .line 93
    :cond_6
    sub-int/2addr p2, p3

    .line 94
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    int-to-float p2, p2

    .line 99
    div-float/2addr p2, v4

    .line 100
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    :goto_4
    if-ge v1, p3, :cond_9

    .line 109
    .line 110
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, LI0/l;

    .line 115
    .line 116
    invoke-static {v0}, LC/C;->c(LI0/l;)LC/F;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v3}, LC/C;->e(LC/F;)F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    cmpl-float v4, v3, v2

    .line 125
    .line 126
    if-lez v4, :cond_8

    .line 127
    .line 128
    if-eq p2, v6, :cond_7

    .line 129
    .line 130
    int-to-float v4, p2

    .line 131
    mul-float/2addr v4, v3

    .line 132
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move v3, v6

    .line 138
    :goto_5
    invoke-interface {v0, v3}, LI0/l;->Z(I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move v5, v0

    .line 147
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    return v5
.end method

.method public final d(Ljava/util/List;II)I
    .locals 9

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v1

    .line 15
    move v4, v3

    .line 16
    move v5, v2

    .line 17
    :goto_0
    if-ge v1, v0, :cond_3

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, LI0/l;

    .line 24
    .line 25
    invoke-static {v6}, LC/C;->c(LI0/l;)LC/F;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {v7}, LC/C;->e(LC/F;)F

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-interface {v6, p2}, LI0/l;->l0(I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    cmpg-float v8, v7, v2

    .line 38
    .line 39
    if-nez v8, :cond_1

    .line 40
    .line 41
    add-int/2addr v4, v6

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    cmpl-float v8, v7, v2

    .line 44
    .line 45
    if-lez v8, :cond_2

    .line 46
    .line 47
    add-float/2addr v5, v7

    .line 48
    int-to-float v6, v6

    .line 49
    div-float/2addr v6, v7

    .line 50
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    int-to-float p2, v3

    .line 62
    mul-float/2addr p2, v5

    .line 63
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    add-int/2addr p2, v4

    .line 68
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    mul-int/2addr p1, p3

    .line 75
    add-int/2addr p2, p1

    .line 76
    return p2
.end method

.method public final e(Ljava/util/List;II)I
    .locals 9

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v1

    .line 15
    move v4, v3

    .line 16
    move v5, v2

    .line 17
    :goto_0
    if-ge v1, v0, :cond_3

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, LI0/l;

    .line 24
    .line 25
    invoke-static {v6}, LC/C;->c(LI0/l;)LC/F;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {v7}, LC/C;->e(LC/F;)F

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-interface {v6, p2}, LI0/l;->I(I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    cmpg-float v8, v7, v2

    .line 38
    .line 39
    if-nez v8, :cond_1

    .line 40
    .line 41
    add-int/2addr v4, v6

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    cmpl-float v8, v7, v2

    .line 44
    .line 45
    if-lez v8, :cond_2

    .line 46
    .line 47
    add-float/2addr v5, v7

    .line 48
    int-to-float v6, v6

    .line 49
    div-float/2addr v6, v7

    .line 50
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    int-to-float p2, v3

    .line 62
    mul-float/2addr p2, v5

    .line 63
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    add-int/2addr p2, v4

    .line 68
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    mul-int/2addr p1, p3

    .line 75
    add-int/2addr p2, p1

    .line 76
    return p2
.end method

.method public final f(Ljava/util/List;II)I
    .locals 10

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    mul-int/2addr v0, p3

    .line 16
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v1

    .line 26
    move v5, v3

    .line 27
    move v4, v2

    .line 28
    :goto_0
    const v6, 0x7fffffff

    .line 29
    .line 30
    .line 31
    if-ge v3, v0, :cond_4

    .line 32
    .line 33
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, LI0/l;

    .line 38
    .line 39
    invoke-static {v7}, LC/C;->c(LI0/l;)LC/F;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-static {v8}, LC/C;->e(LC/F;)F

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    cmpg-float v9, v8, v2

    .line 48
    .line 49
    if-nez v9, :cond_2

    .line 50
    .line 51
    if-ne p2, v6, :cond_1

    .line 52
    .line 53
    move v8, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sub-int v8, p2, p3

    .line 56
    .line 57
    :goto_1
    invoke-interface {v7, v6}, LI0/l;->I(I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    add-int/2addr p3, v6

    .line 66
    invoke-interface {v7, v6}, LI0/l;->q0(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    cmpl-float v6, v8, v2

    .line 76
    .line 77
    if-lez v6, :cond_3

    .line 78
    .line 79
    add-float/2addr v4, v8

    .line 80
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    cmpg-float v0, v4, v2

    .line 84
    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    move p2, v1

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    if-ne p2, v6, :cond_6

    .line 90
    .line 91
    move p2, v6

    .line 92
    goto :goto_3

    .line 93
    :cond_6
    sub-int/2addr p2, p3

    .line 94
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    int-to-float p2, p2

    .line 99
    div-float/2addr p2, v4

    .line 100
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    :goto_4
    if-ge v1, p3, :cond_9

    .line 109
    .line 110
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, LI0/l;

    .line 115
    .line 116
    invoke-static {v0}, LC/C;->c(LI0/l;)LC/F;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v3}, LC/C;->e(LC/F;)F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    cmpl-float v4, v3, v2

    .line 125
    .line 126
    if-lez v4, :cond_8

    .line 127
    .line 128
    if-eq p2, v6, :cond_7

    .line 129
    .line 130
    int-to-float v4, p2

    .line 131
    mul-float/2addr v4, v3

    .line 132
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move v3, v6

    .line 138
    :goto_5
    invoke-interface {v0, v3}, LI0/l;->q0(I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move v5, v0

    .line 147
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    return v5
.end method

.method public final g(Ljava/util/List;II)I
    .locals 9

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v1

    .line 15
    move v4, v3

    .line 16
    move v5, v2

    .line 17
    :goto_0
    if-ge v1, v0, :cond_3

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, LI0/l;

    .line 24
    .line 25
    invoke-static {v6}, LC/C;->c(LI0/l;)LC/F;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {v7}, LC/C;->e(LC/F;)F

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-interface {v6, p2}, LI0/l;->Z(I)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    cmpg-float v8, v7, v2

    .line 38
    .line 39
    if-nez v8, :cond_1

    .line 40
    .line 41
    add-int/2addr v4, v6

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    cmpl-float v8, v7, v2

    .line 44
    .line 45
    if-lez v8, :cond_2

    .line 46
    .line 47
    add-float/2addr v5, v7

    .line 48
    int-to-float v6, v6

    .line 49
    div-float/2addr v6, v7

    .line 50
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    int-to-float p2, v3

    .line 62
    mul-float/2addr p2, v5

    .line 63
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    add-int/2addr p2, v4

    .line 68
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    mul-int/2addr p1, p3

    .line 75
    add-int/2addr p2, p1

    .line 76
    return p2
.end method

.method public final h(Ljava/util/List;II)I
    .locals 10

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    mul-int/2addr v0, p3

    .line 16
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v1

    .line 26
    move v5, v3

    .line 27
    move v4, v2

    .line 28
    :goto_0
    const v6, 0x7fffffff

    .line 29
    .line 30
    .line 31
    if-ge v3, v0, :cond_4

    .line 32
    .line 33
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    check-cast v7, LI0/l;

    .line 38
    .line 39
    invoke-static {v7}, LC/C;->c(LI0/l;)LC/F;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-static {v8}, LC/C;->e(LC/F;)F

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    cmpg-float v9, v8, v2

    .line 48
    .line 49
    if-nez v9, :cond_2

    .line 50
    .line 51
    if-ne p2, v6, :cond_1

    .line 52
    .line 53
    move v8, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sub-int v8, p2, p3

    .line 56
    .line 57
    :goto_1
    invoke-interface {v7, v6}, LI0/l;->I(I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    add-int/2addr p3, v6

    .line 66
    invoke-interface {v7, v6}, LI0/l;->l0(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    cmpl-float v6, v8, v2

    .line 76
    .line 77
    if-lez v6, :cond_3

    .line 78
    .line 79
    add-float/2addr v4, v8

    .line 80
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    cmpg-float v0, v4, v2

    .line 84
    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    move p2, v1

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    if-ne p2, v6, :cond_6

    .line 90
    .line 91
    move p2, v6

    .line 92
    goto :goto_3

    .line 93
    :cond_6
    sub-int/2addr p2, p3

    .line 94
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    int-to-float p2, p2

    .line 99
    div-float/2addr p2, v4

    .line 100
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    :goto_4
    if-ge v1, p3, :cond_9

    .line 109
    .line 110
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, LI0/l;

    .line 115
    .line 116
    invoke-static {v0}, LC/C;->c(LI0/l;)LC/F;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v3}, LC/C;->e(LC/F;)F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    cmpl-float v4, v3, v2

    .line 125
    .line 126
    if-lez v4, :cond_8

    .line 127
    .line 128
    if-eq p2, v6, :cond_7

    .line 129
    .line 130
    int-to-float v4, p2

    .line 131
    mul-float/2addr v4, v3

    .line 132
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move v3, v6

    .line 138
    :goto_5
    invoke-interface {v0, v3}, LI0/l;->l0(I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    move v5, v0

    .line 147
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    return v5
.end method
