.class final Li0/L$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;

.field private b:Ljava/lang/Object;

.field private c:Lt/K;

.field private d:I

.field private final e:Lt/P;

.field private final f:Lt/P;

.field private final g:Lt/Q;

.field private final h:La0/c;

.field private final i:LY/V;

.field private j:I

.field private final k:Lt/P;

.field private final l:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/L$a;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Li0/L$a;->d:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {p1, v0, p1}, La0/g;->d(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, Li0/L$a;->e:Lt/P;

    .line 16
    .line 17
    new-instance v1, Lt/P;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, v2, v0, p1}, Lt/P;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Li0/L$a;->f:Lt/P;

    .line 24
    .line 25
    new-instance v1, Lt/Q;

    .line 26
    .line 27
    invoke-direct {v1, v2, v0, p1}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Li0/L$a;->g:Lt/Q;

    .line 31
    .line 32
    new-instance v1, La0/c;

    .line 33
    .line 34
    const/16 v3, 0x10

    .line 35
    .line 36
    new-array v3, v3, [LY/U;

    .line 37
    .line 38
    invoke-direct {v1, v3, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Li0/L$a;->h:La0/c;

    .line 42
    .line 43
    new-instance v1, Li0/L$a$a;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Li0/L$a$a;-><init>(Li0/L$a;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Li0/L$a;->i:LY/V;

    .line 49
    .line 50
    invoke-static {p1, v0, p1}, La0/g;->d(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Li0/L$a;->k:Lt/P;

    .line 55
    .line 56
    new-instance p1, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Li0/L$a;->l:Ljava/util/HashMap;

    .line 62
    .line 63
    return-void
.end method

.method public static final synthetic a(Li0/L$a;)I
    .locals 0

    .line 1
    iget p0, p0, Li0/L$a;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic b(Li0/L$a;I)V
    .locals 0

    .line 1
    iput p1, p0, Li0/L$a;->j:I

    .line 2
    .line 3
    return-void
.end method

.method private final d(Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Li0/L$a;->d:I

    .line 4
    .line 5
    iget-object v2, v0, Li0/L$a;->c:Lt/K;

    .line 6
    .line 7
    if-eqz v2, :cond_6

    .line 8
    .line 9
    iget-object v3, v2, Lt/T;->a:[J

    .line 10
    .line 11
    array-length v4, v3

    .line 12
    add-int/lit8 v4, v4, -0x2

    .line 13
    .line 14
    if-ltz v4, :cond_6

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    move v6, v5

    .line 18
    :goto_0
    aget-wide v7, v3, v6

    .line 19
    .line 20
    not-long v9, v7

    .line 21
    const/4 v11, 0x7

    .line 22
    shl-long/2addr v9, v11

    .line 23
    and-long/2addr v9, v7

    .line 24
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v9, v11

    .line 30
    cmp-long v9, v9, v11

    .line 31
    .line 32
    if-eqz v9, :cond_5

    .line 33
    .line 34
    sub-int v9, v6, v4

    .line 35
    .line 36
    not-int v9, v9

    .line 37
    ushr-int/lit8 v9, v9, 0x1f

    .line 38
    .line 39
    const/16 v10, 0x8

    .line 40
    .line 41
    rsub-int/lit8 v9, v9, 0x8

    .line 42
    .line 43
    move v11, v5

    .line 44
    :goto_1
    if-ge v11, v9, :cond_4

    .line 45
    .line 46
    const-wide/16 v12, 0xff

    .line 47
    .line 48
    and-long/2addr v12, v7

    .line 49
    const-wide/16 v14, 0x80

    .line 50
    .line 51
    cmp-long v12, v12, v14

    .line 52
    .line 53
    if-gez v12, :cond_2

    .line 54
    .line 55
    shl-int/lit8 v12, v6, 0x3

    .line 56
    .line 57
    add-int/2addr v12, v11

    .line 58
    iget-object v13, v2, Lt/T;->b:[Ljava/lang/Object;

    .line 59
    .line 60
    aget-object v13, v13, v12

    .line 61
    .line 62
    iget-object v14, v2, Lt/T;->c:[I

    .line 63
    .line 64
    aget v14, v14, v12

    .line 65
    .line 66
    if-eq v14, v1, :cond_0

    .line 67
    .line 68
    const/4 v14, 0x1

    .line 69
    goto :goto_2

    .line 70
    :cond_0
    move v14, v5

    .line 71
    :goto_2
    move-object/from16 v15, p1

    .line 72
    .line 73
    if-eqz v14, :cond_1

    .line 74
    .line 75
    invoke-direct {v0, v15, v13}, Li0/L$a;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    if-eqz v14, :cond_3

    .line 79
    .line 80
    invoke-virtual {v2, v12}, Lt/K;->s(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    move-object/from16 v15, p1

    .line 85
    .line 86
    :cond_3
    :goto_3
    shr-long/2addr v7, v10

    .line 87
    add-int/lit8 v11, v11, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object/from16 v15, p1

    .line 91
    .line 92
    if-ne v9, v10, :cond_6

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move-object/from16 v15, p1

    .line 96
    .line 97
    :goto_4
    if-eq v6, v4, :cond_6

    .line 98
    .line 99
    add-int/lit8 v6, v6, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_6
    return-void
.end method

.method private final l(Ljava/lang/Object;ILjava/lang/Object;Lt/K;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Li0/L$a;->j:I

    .line 8
    .line 9
    if-lez v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    const/4 v3, -0x1

    .line 14
    move-object/from16 v4, p4

    .line 15
    .line 16
    invoke-virtual {v4, v1, v2, v3}, Lt/K;->q(Ljava/lang/Object;II)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    instance-of v5, v1, LY/U;

    .line 21
    .line 22
    const/4 v6, 0x2

    .line 23
    if-eqz v5, :cond_7

    .line 24
    .line 25
    if-eq v4, v2, :cond_7

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, LY/U;

    .line 29
    .line 30
    invoke-interface {v2}, LY/U;->o()LY/U$a;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v5, v0, Li0/L$a;->l:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-interface {v2}, LY/U$a;->a()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-interface {v5, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, LY/U$a;->b()Lt/T;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v5, v0, Li0/L$a;->k:Lt/P;

    .line 48
    .line 49
    invoke-static {v5, v1}, La0/g;->h(Lt/P;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v7, v2, Lt/T;->b:[Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v2, v2, Lt/T;->a:[J

    .line 55
    .line 56
    array-length v8, v2

    .line 57
    sub-int/2addr v8, v6

    .line 58
    if-ltz v8, :cond_5

    .line 59
    .line 60
    const/4 v10, 0x0

    .line 61
    :goto_0
    aget-wide v11, v2, v10

    .line 62
    .line 63
    not-long v13, v11

    .line 64
    const/4 v15, 0x7

    .line 65
    shl-long/2addr v13, v15

    .line 66
    and-long/2addr v13, v11

    .line 67
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v13, v15

    .line 73
    cmp-long v13, v13, v15

    .line 74
    .line 75
    if-eqz v13, :cond_4

    .line 76
    .line 77
    sub-int v13, v10, v8

    .line 78
    .line 79
    not-int v13, v13

    .line 80
    ushr-int/lit8 v13, v13, 0x1f

    .line 81
    .line 82
    const/16 v14, 0x8

    .line 83
    .line 84
    rsub-int/lit8 v13, v13, 0x8

    .line 85
    .line 86
    const/4 v15, 0x0

    .line 87
    :goto_1
    if-ge v15, v13, :cond_3

    .line 88
    .line 89
    const-wide/16 v16, 0xff

    .line 90
    .line 91
    and-long v16, v11, v16

    .line 92
    .line 93
    const-wide/16 v18, 0x80

    .line 94
    .line 95
    cmp-long v16, v16, v18

    .line 96
    .line 97
    if-gez v16, :cond_2

    .line 98
    .line 99
    shl-int/lit8 v16, v10, 0x3

    .line 100
    .line 101
    add-int v16, v16, v15

    .line 102
    .line 103
    aget-object v16, v7, v16

    .line 104
    .line 105
    move/from16 p4, v6

    .line 106
    .line 107
    move-object/from16 v6, v16

    .line 108
    .line 109
    check-cast v6, Li0/U;

    .line 110
    .line 111
    instance-of v9, v6, Li0/V;

    .line 112
    .line 113
    if-eqz v9, :cond_1

    .line 114
    .line 115
    move-object v9, v6

    .line 116
    check-cast v9, Li0/V;

    .line 117
    .line 118
    invoke-static/range {p4 .. p4}, Li0/h;->a(I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-virtual {v9, v3}, Li0/V;->s(I)V

    .line 123
    .line 124
    .line 125
    :cond_1
    invoke-static {v5, v6, v1}, La0/g;->a(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move/from16 p4, v6

    .line 130
    .line 131
    :goto_2
    shr-long/2addr v11, v14

    .line 132
    add-int/lit8 v15, v15, 0x1

    .line 133
    .line 134
    move/from16 v6, p4

    .line 135
    .line 136
    const/4 v3, -0x1

    .line 137
    goto :goto_1

    .line 138
    :cond_3
    move/from16 p4, v6

    .line 139
    .line 140
    if-ne v13, v14, :cond_6

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_4
    move/from16 p4, v6

    .line 144
    .line 145
    :goto_3
    if-eq v10, v8, :cond_6

    .line 146
    .line 147
    add-int/lit8 v10, v10, 0x1

    .line 148
    .line 149
    move/from16 v6, p4

    .line 150
    .line 151
    const/4 v3, -0x1

    .line 152
    goto :goto_0

    .line 153
    :cond_5
    move/from16 p4, v6

    .line 154
    .line 155
    :cond_6
    const/4 v2, -0x1

    .line 156
    goto :goto_4

    .line 157
    :cond_7
    move/from16 p4, v6

    .line 158
    .line 159
    move v2, v3

    .line 160
    :goto_4
    if-ne v4, v2, :cond_9

    .line 161
    .line 162
    instance-of v2, v1, Li0/V;

    .line 163
    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    move-object v2, v1

    .line 167
    check-cast v2, Li0/V;

    .line 168
    .line 169
    invoke-static/range {p4 .. p4}, Li0/h;->a(I)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-virtual {v2, v3}, Li0/V;->s(I)V

    .line 174
    .line 175
    .line 176
    :cond_8
    iget-object v2, v0, Li0/L$a;->e:Lt/P;

    .line 177
    .line 178
    move-object/from16 v3, p3

    .line 179
    .line 180
    invoke-static {v2, v1, v3}, La0/g;->a(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_9
    :goto_5
    return-void
.end method

.method private final m(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/L$a;->e:Lt/P;

    .line 2
    .line 3
    invoke-static {v0, p2, p1}, La0/g;->g(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    instance-of p1, p2, LY/U;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Li0/L$a;->e:Lt/P;

    .line 11
    .line 12
    invoke-static {p1, p2}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Li0/L$a;->k:Lt/P;

    .line 19
    .line 20
    invoke-static {p1, p2}, La0/g;->h(Lt/P;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Li0/L$a;->l:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Li0/L$a;->e:Lt/P;

    .line 2
    .line 3
    invoke-static {v0}, La0/g;->b(Lt/P;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li0/L$a;->f:Lt/P;

    .line 7
    .line 8
    invoke-virtual {v0}, Lt/P;->k()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li0/L$a;->k:Lt/P;

    .line 12
    .line 13
    invoke-static {v0}, La0/g;->b(Lt/P;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Li0/L$a;->l:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li0/L$a;->f:Lt/P;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lt/P;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lt/K;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget-object v3, v2, Lt/T;->b:[Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v4, v2, Lt/T;->c:[I

    .line 19
    .line 20
    iget-object v2, v2, Lt/T;->a:[J

    .line 21
    .line 22
    array-length v5, v2

    .line 23
    add-int/lit8 v5, v5, -0x2

    .line 24
    .line 25
    if-ltz v5, :cond_4

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    move v7, v6

    .line 29
    :goto_0
    aget-wide v8, v2, v7

    .line 30
    .line 31
    not-long v10, v8

    .line 32
    const/4 v12, 0x7

    .line 33
    shl-long/2addr v10, v12

    .line 34
    and-long/2addr v10, v8

    .line 35
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v10, v12

    .line 41
    cmp-long v10, v10, v12

    .line 42
    .line 43
    if-eqz v10, :cond_3

    .line 44
    .line 45
    sub-int v10, v7, v5

    .line 46
    .line 47
    not-int v10, v10

    .line 48
    ushr-int/lit8 v10, v10, 0x1f

    .line 49
    .line 50
    const/16 v11, 0x8

    .line 51
    .line 52
    rsub-int/lit8 v10, v10, 0x8

    .line 53
    .line 54
    move v12, v6

    .line 55
    :goto_1
    if-ge v12, v10, :cond_2

    .line 56
    .line 57
    const-wide/16 v13, 0xff

    .line 58
    .line 59
    and-long/2addr v13, v8

    .line 60
    const-wide/16 v15, 0x80

    .line 61
    .line 62
    cmp-long v13, v13, v15

    .line 63
    .line 64
    if-gez v13, :cond_1

    .line 65
    .line 66
    shl-int/lit8 v13, v7, 0x3

    .line 67
    .line 68
    add-int/2addr v13, v12

    .line 69
    aget-object v14, v3, v13

    .line 70
    .line 71
    aget v13, v4, v13

    .line 72
    .line 73
    invoke-direct {v0, v1, v14}, Li0/L$a;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    shr-long/2addr v8, v11

    .line 77
    add-int/lit8 v12, v12, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    if-ne v10, v11, :cond_4

    .line 81
    .line 82
    :cond_3
    if-eq v7, v5, :cond_4

    .line 83
    .line 84
    add-int/lit8 v7, v7, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    :goto_2
    return-void
.end method

.method public final f()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/L$a;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li0/L$a;->f:Lt/P;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/c0;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final h()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li0/L$a;->g:Lt/Q;

    .line 4
    .line 5
    iget-object v2, v0, Li0/L$a;->a:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v3, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v1, Lt/e0;->a:[J

    .line 10
    .line 11
    array-length v5, v4

    .line 12
    add-int/lit8 v5, v5, -0x2

    .line 13
    .line 14
    if-ltz v5, :cond_3

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    move v7, v6

    .line 18
    :goto_0
    aget-wide v8, v4, v7

    .line 19
    .line 20
    not-long v10, v8

    .line 21
    const/4 v12, 0x7

    .line 22
    shl-long/2addr v10, v12

    .line 23
    and-long/2addr v10, v8

    .line 24
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v10, v12

    .line 30
    cmp-long v10, v10, v12

    .line 31
    .line 32
    if-eqz v10, :cond_2

    .line 33
    .line 34
    sub-int v10, v7, v5

    .line 35
    .line 36
    not-int v10, v10

    .line 37
    ushr-int/lit8 v10, v10, 0x1f

    .line 38
    .line 39
    const/16 v11, 0x8

    .line 40
    .line 41
    rsub-int/lit8 v10, v10, 0x8

    .line 42
    .line 43
    move v12, v6

    .line 44
    :goto_1
    if-ge v12, v10, :cond_1

    .line 45
    .line 46
    const-wide/16 v13, 0xff

    .line 47
    .line 48
    and-long/2addr v13, v8

    .line 49
    const-wide/16 v15, 0x80

    .line 50
    .line 51
    cmp-long v13, v13, v15

    .line 52
    .line 53
    if-gez v13, :cond_0

    .line 54
    .line 55
    shl-int/lit8 v13, v7, 0x3

    .line 56
    .line 57
    add-int/2addr v13, v12

    .line 58
    aget-object v13, v3, v13

    .line 59
    .line 60
    invoke-interface {v2, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_0
    shr-long/2addr v8, v11

    .line 64
    add-int/lit8 v12, v12, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    if-ne v10, v11, :cond_3

    .line 68
    .line 69
    :cond_2
    if-eq v7, v5, :cond_3

    .line 70
    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-virtual {v1}, Lt/Q;->m()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final i(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lie/a;)V
    .locals 5

    .line 1
    iget-object v0, p0, Li0/L$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Li0/L$a;->c:Lt/K;

    .line 4
    .line 5
    iget v2, p0, Li0/L$a;->d:I

    .line 6
    .line 7
    iput-object p1, p0, Li0/L$a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v3, p0, Li0/L$a;->f:Lt/P;

    .line 10
    .line 11
    invoke-virtual {v3, p1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lt/K;

    .line 16
    .line 17
    iput-object p1, p0, Li0/L$a;->c:Lt/K;

    .line 18
    .line 19
    iget p1, p0, Li0/L$a;->d:I

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    if-ne p1, v3, :cond_0

    .line 23
    .line 24
    invoke-static {}, Li0/v;->M()Li0/l;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Li0/l;->i()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Li0/L$a;->d:I

    .line 37
    .line 38
    :cond_0
    iget-object p1, p0, Li0/L$a;->i:LY/V;

    .line 39
    .line 40
    invoke-static {}, LY/U1;->b()La0/c;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :try_start_0
    invoke-virtual {v3, p1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    sget-object p1, Li0/l;->e:Li0/l$a;

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-virtual {p1, p2, v4, p3}, Li0/l$a;->g(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lie/a;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, La0/c;->p()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    add-int/lit8 p1, p1, -0x1

    .line 58
    .line 59
    invoke-virtual {v3, p1}, La0/c;->y(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Li0/L$a;->b:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1}, Li0/L$a;->d(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Li0/L$a;->b:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v1, p0, Li0/L$a;->c:Lt/K;

    .line 73
    .line 74
    iput v2, p0, Li0/L$a;->d:I

    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    invoke-virtual {v3}, La0/c;->p()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    add-int/lit8 p2, p2, -0x1

    .line 83
    .line 84
    invoke-virtual {v3, p2}, La0/c;->y(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public final j(Ljava/util/Set;)Z
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li0/L$a;->k:Lt/P;

    .line 6
    .line 7
    iget-object v3, v0, Li0/L$a;->l:Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v4, v0, Li0/L$a;->e:Lt/P;

    .line 10
    .line 11
    iget-object v5, v0, Li0/L$a;->g:Lt/Q;

    .line 12
    .line 13
    instance-of v6, v1, La0/e;

    .line 14
    .line 15
    const-string v7, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"

    .line 16
    .line 17
    const/4 v13, 0x2

    .line 18
    const-wide/16 v16, 0x80

    .line 19
    .line 20
    const/16 v8, 0x8

    .line 21
    .line 22
    const/16 v18, 0x0

    .line 23
    .line 24
    if-eqz v6, :cond_22

    .line 25
    .line 26
    check-cast v1, La0/e;

    .line 27
    .line 28
    invoke-virtual {v1}, La0/e;->b()Lt/e0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v6, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 33
    .line 34
    iget-object v1, v1, Lt/e0;->a:[J

    .line 35
    .line 36
    array-length v9, v1

    .line 37
    sub-int/2addr v9, v13

    .line 38
    if-ltz v9, :cond_21

    .line 39
    .line 40
    move/from16 v22, v13

    .line 41
    .line 42
    move/from16 v10, v18

    .line 43
    .line 44
    move v11, v10

    .line 45
    const-wide/16 v19, 0xff

    .line 46
    .line 47
    const/16 v21, 0x7

    .line 48
    .line 49
    :goto_0
    aget-wide v12, v1, v10

    .line 50
    .line 51
    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    not-long v14, v12

    .line 57
    shl-long v14, v14, v21

    .line 58
    .line 59
    and-long/2addr v14, v12

    .line 60
    and-long v14, v14, v23

    .line 61
    .line 62
    cmp-long v14, v14, v23

    .line 63
    .line 64
    if-eqz v14, :cond_20

    .line 65
    .line 66
    sub-int v14, v10, v9

    .line 67
    .line 68
    not-int v14, v14

    .line 69
    ushr-int/lit8 v14, v14, 0x1f

    .line 70
    .line 71
    rsub-int/lit8 v14, v14, 0x8

    .line 72
    .line 73
    move/from16 v15, v18

    .line 74
    .line 75
    :goto_1
    if-ge v15, v14, :cond_1f

    .line 76
    .line 77
    and-long v25, v12, v19

    .line 78
    .line 79
    cmp-long v25, v25, v16

    .line 80
    .line 81
    if-gez v25, :cond_1e

    .line 82
    .line 83
    shl-int/lit8 v25, v10, 0x3

    .line 84
    .line 85
    add-int v25, v25, v15

    .line 86
    .line 87
    move/from16 v26, v8

    .line 88
    .line 89
    aget-object v8, v6, v25

    .line 90
    .line 91
    move-object/from16 v25, v1

    .line 92
    .line 93
    instance-of v1, v8, Li0/V;

    .line 94
    .line 95
    if-eqz v1, :cond_0

    .line 96
    .line 97
    move-object v1, v8

    .line 98
    check-cast v1, Li0/V;

    .line 99
    .line 100
    move-object/from16 p1, v6

    .line 101
    .line 102
    invoke-static/range {v22 .. v22}, Li0/h;->a(I)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-virtual {v1, v6}, Li0/V;->q(I)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_1

    .line 111
    .line 112
    move-object/from16 v39, v7

    .line 113
    .line 114
    move/from16 v31, v9

    .line 115
    .line 116
    move/from16 v32, v10

    .line 117
    .line 118
    move-wide/from16 v29, v12

    .line 119
    .line 120
    move/from16 v38, v14

    .line 121
    .line 122
    goto/16 :goto_11

    .line 123
    .line 124
    :cond_0
    move-object/from16 p1, v6

    .line 125
    .line 126
    :cond_1
    invoke-static {v2, v8}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_18

    .line 131
    .line 132
    invoke-virtual {v2, v8}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_17

    .line 137
    .line 138
    instance-of v6, v1, Lt/Q;

    .line 139
    .line 140
    if-eqz v6, :cond_f

    .line 141
    .line 142
    check-cast v1, Lt/Q;

    .line 143
    .line 144
    iget-object v6, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 145
    .line 146
    iget-object v1, v1, Lt/e0;->a:[J

    .line 147
    .line 148
    move-object/from16 v27, v6

    .line 149
    .line 150
    array-length v6, v1

    .line 151
    add-int/lit8 v6, v6, -0x2

    .line 152
    .line 153
    if-ltz v6, :cond_17

    .line 154
    .line 155
    move-object/from16 v28, v1

    .line 156
    .line 157
    move-wide/from16 v29, v12

    .line 158
    .line 159
    move/from16 v1, v18

    .line 160
    .line 161
    move v13, v11

    .line 162
    :goto_2
    aget-wide v11, v28, v1

    .line 163
    .line 164
    move/from16 v31, v9

    .line 165
    .line 166
    move/from16 v32, v10

    .line 167
    .line 168
    not-long v9, v11

    .line 169
    shl-long v9, v9, v21

    .line 170
    .line 171
    and-long/2addr v9, v11

    .line 172
    and-long v9, v9, v23

    .line 173
    .line 174
    cmp-long v9, v9, v23

    .line 175
    .line 176
    if-eqz v9, :cond_d

    .line 177
    .line 178
    sub-int v9, v1, v6

    .line 179
    .line 180
    not-int v9, v9

    .line 181
    ushr-int/lit8 v9, v9, 0x1f

    .line 182
    .line 183
    rsub-int/lit8 v9, v9, 0x8

    .line 184
    .line 185
    move/from16 v10, v18

    .line 186
    .line 187
    :goto_3
    if-ge v10, v9, :cond_b

    .line 188
    .line 189
    and-long v33, v11, v19

    .line 190
    .line 191
    cmp-long v33, v33, v16

    .line 192
    .line 193
    if-gez v33, :cond_a

    .line 194
    .line 195
    shl-int/lit8 v33, v1, 0x3

    .line 196
    .line 197
    add-int v33, v33, v10

    .line 198
    .line 199
    aget-object v33, v27, v33

    .line 200
    .line 201
    move/from16 v34, v10

    .line 202
    .line 203
    move-object/from16 v10, v33

    .line 204
    .line 205
    check-cast v10, LY/U;

    .line 206
    .line 207
    invoke-static {v10, v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    move-wide/from16 v35, v11

    .line 211
    .line 212
    invoke-virtual {v3, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    invoke-interface {v10}, LY/U;->d()LY/T1;

    .line 217
    .line 218
    .line 219
    move-result-object v12

    .line 220
    if-nez v12, :cond_2

    .line 221
    .line 222
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    :cond_2
    invoke-interface {v10}, LY/U;->o()LY/U$a;

    .line 227
    .line 228
    .line 229
    move-result-object v33

    .line 230
    move/from16 v37, v13

    .line 231
    .line 232
    invoke-interface/range {v33 .. v33}, LY/U$a;->a()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v13

    .line 236
    invoke-interface {v12, v13, v11}, LY/T1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    if-nez v11, :cond_9

    .line 241
    .line 242
    invoke-virtual {v4, v10}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    if-eqz v10, :cond_7

    .line 247
    .line 248
    instance-of v11, v10, Lt/Q;

    .line 249
    .line 250
    if-eqz v11, :cond_6

    .line 251
    .line 252
    check-cast v10, Lt/Q;

    .line 253
    .line 254
    iget-object v11, v10, Lt/e0;->b:[Ljava/lang/Object;

    .line 255
    .line 256
    iget-object v10, v10, Lt/e0;->a:[J

    .line 257
    .line 258
    array-length v12, v10

    .line 259
    add-int/lit8 v12, v12, -0x2

    .line 260
    .line 261
    if-ltz v12, :cond_7

    .line 262
    .line 263
    move-object/from16 v33, v10

    .line 264
    .line 265
    move/from16 v38, v14

    .line 266
    .line 267
    move/from16 v10, v18

    .line 268
    .line 269
    :goto_4
    aget-wide v13, v33, v10

    .line 270
    .line 271
    move-object/from16 v39, v7

    .line 272
    .line 273
    move-object/from16 v40, v8

    .line 274
    .line 275
    not-long v7, v13

    .line 276
    shl-long v7, v7, v21

    .line 277
    .line 278
    and-long/2addr v7, v13

    .line 279
    and-long v7, v7, v23

    .line 280
    .line 281
    cmp-long v7, v7, v23

    .line 282
    .line 283
    if-eqz v7, :cond_5

    .line 284
    .line 285
    sub-int v7, v10, v12

    .line 286
    .line 287
    not-int v7, v7

    .line 288
    ushr-int/lit8 v7, v7, 0x1f

    .line 289
    .line 290
    rsub-int/lit8 v8, v7, 0x8

    .line 291
    .line 292
    move/from16 v7, v18

    .line 293
    .line 294
    :goto_5
    if-ge v7, v8, :cond_4

    .line 295
    .line 296
    and-long v41, v13, v19

    .line 297
    .line 298
    cmp-long v41, v41, v16

    .line 299
    .line 300
    if-gez v41, :cond_3

    .line 301
    .line 302
    shl-int/lit8 v37, v10, 0x3

    .line 303
    .line 304
    add-int v37, v37, v7

    .line 305
    .line 306
    move/from16 v41, v7

    .line 307
    .line 308
    aget-object v7, v11, v37

    .line 309
    .line 310
    invoke-virtual {v5, v7}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    const/16 v37, 0x1

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_3
    move/from16 v41, v7

    .line 317
    .line 318
    :goto_6
    shr-long v13, v13, v26

    .line 319
    .line 320
    add-int/lit8 v7, v41, 0x1

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_4
    move/from16 v7, v26

    .line 324
    .line 325
    if-ne v8, v7, :cond_8

    .line 326
    .line 327
    :cond_5
    if-eq v10, v12, :cond_8

    .line 328
    .line 329
    add-int/lit8 v10, v10, 0x1

    .line 330
    .line 331
    move-object/from16 v7, v39

    .line 332
    .line 333
    move-object/from16 v8, v40

    .line 334
    .line 335
    const/16 v26, 0x8

    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_6
    move-object/from16 v39, v7

    .line 339
    .line 340
    move-object/from16 v40, v8

    .line 341
    .line 342
    move/from16 v38, v14

    .line 343
    .line 344
    invoke-virtual {v5, v10}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    const/4 v13, 0x1

    .line 348
    goto :goto_7

    .line 349
    :cond_7
    move-object/from16 v39, v7

    .line 350
    .line 351
    move-object/from16 v40, v8

    .line 352
    .line 353
    move/from16 v38, v14

    .line 354
    .line 355
    :cond_8
    move/from16 v13, v37

    .line 356
    .line 357
    :goto_7
    sget-object v7, LTd/L;->a:LTd/L;

    .line 358
    .line 359
    goto :goto_8

    .line 360
    :cond_9
    move-object/from16 v39, v7

    .line 361
    .line 362
    move-object/from16 v40, v8

    .line 363
    .line 364
    move/from16 v38, v14

    .line 365
    .line 366
    iget-object v7, v0, Li0/L$a;->h:La0/c;

    .line 367
    .line 368
    invoke-virtual {v7, v10}, La0/c;->c(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move/from16 v13, v37

    .line 372
    .line 373
    :goto_8
    const/16 v7, 0x8

    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_a
    move-object/from16 v39, v7

    .line 377
    .line 378
    move-object/from16 v40, v8

    .line 379
    .line 380
    move/from16 v34, v10

    .line 381
    .line 382
    move-wide/from16 v35, v11

    .line 383
    .line 384
    move/from16 v37, v13

    .line 385
    .line 386
    move/from16 v38, v14

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :goto_9
    shr-long v11, v35, v7

    .line 390
    .line 391
    add-int/lit8 v10, v34, 0x1

    .line 392
    .line 393
    move/from16 v26, v7

    .line 394
    .line 395
    move/from16 v14, v38

    .line 396
    .line 397
    move-object/from16 v7, v39

    .line 398
    .line 399
    move-object/from16 v8, v40

    .line 400
    .line 401
    goto/16 :goto_3

    .line 402
    .line 403
    :cond_b
    move-object/from16 v39, v7

    .line 404
    .line 405
    move-object/from16 v40, v8

    .line 406
    .line 407
    move/from16 v37, v13

    .line 408
    .line 409
    move/from16 v38, v14

    .line 410
    .line 411
    move/from16 v7, v26

    .line 412
    .line 413
    if-ne v9, v7, :cond_c

    .line 414
    .line 415
    move/from16 v13, v37

    .line 416
    .line 417
    goto :goto_a

    .line 418
    :cond_c
    move/from16 v11, v37

    .line 419
    .line 420
    goto/16 :goto_d

    .line 421
    .line 422
    :cond_d
    move-object/from16 v39, v7

    .line 423
    .line 424
    move-object/from16 v40, v8

    .line 425
    .line 426
    move/from16 v38, v14

    .line 427
    .line 428
    :goto_a
    if-eq v1, v6, :cond_e

    .line 429
    .line 430
    add-int/lit8 v1, v1, 0x1

    .line 431
    .line 432
    move/from16 v9, v31

    .line 433
    .line 434
    move/from16 v10, v32

    .line 435
    .line 436
    move/from16 v14, v38

    .line 437
    .line 438
    move-object/from16 v7, v39

    .line 439
    .line 440
    move-object/from16 v8, v40

    .line 441
    .line 442
    const/16 v26, 0x8

    .line 443
    .line 444
    goto/16 :goto_2

    .line 445
    .line 446
    :cond_e
    move v11, v13

    .line 447
    goto/16 :goto_d

    .line 448
    .line 449
    :cond_f
    move-object/from16 v39, v7

    .line 450
    .line 451
    move-object/from16 v40, v8

    .line 452
    .line 453
    move/from16 v31, v9

    .line 454
    .line 455
    move/from16 v32, v10

    .line 456
    .line 457
    move-wide/from16 v29, v12

    .line 458
    .line 459
    move/from16 v38, v14

    .line 460
    .line 461
    check-cast v1, LY/U;

    .line 462
    .line 463
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v6

    .line 467
    invoke-interface {v1}, LY/U;->d()LY/T1;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    if-nez v7, :cond_10

    .line 472
    .line 473
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 474
    .line 475
    .line 476
    move-result-object v7

    .line 477
    :cond_10
    invoke-interface {v1}, LY/U;->o()LY/U$a;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    invoke-interface {v8}, LY/U$a;->a()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v8

    .line 485
    invoke-interface {v7, v8, v6}, LY/T1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-nez v6, :cond_16

    .line 490
    .line 491
    invoke-virtual {v4, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    if-eqz v1, :cond_15

    .line 496
    .line 497
    instance-of v6, v1, Lt/Q;

    .line 498
    .line 499
    if-eqz v6, :cond_14

    .line 500
    .line 501
    check-cast v1, Lt/Q;

    .line 502
    .line 503
    iget-object v6, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 504
    .line 505
    iget-object v1, v1, Lt/e0;->a:[J

    .line 506
    .line 507
    array-length v7, v1

    .line 508
    add-int/lit8 v7, v7, -0x2

    .line 509
    .line 510
    if-ltz v7, :cond_15

    .line 511
    .line 512
    move/from16 v8, v18

    .line 513
    .line 514
    :goto_b
    aget-wide v9, v1, v8

    .line 515
    .line 516
    not-long v12, v9

    .line 517
    shl-long v12, v12, v21

    .line 518
    .line 519
    and-long/2addr v12, v9

    .line 520
    and-long v12, v12, v23

    .line 521
    .line 522
    cmp-long v12, v12, v23

    .line 523
    .line 524
    if-eqz v12, :cond_13

    .line 525
    .line 526
    sub-int v12, v8, v7

    .line 527
    .line 528
    not-int v12, v12

    .line 529
    ushr-int/lit8 v12, v12, 0x1f

    .line 530
    .line 531
    const/16 v26, 0x8

    .line 532
    .line 533
    rsub-int/lit8 v12, v12, 0x8

    .line 534
    .line 535
    move/from16 v13, v18

    .line 536
    .line 537
    :goto_c
    if-ge v13, v12, :cond_12

    .line 538
    .line 539
    and-long v27, v9, v19

    .line 540
    .line 541
    cmp-long v14, v27, v16

    .line 542
    .line 543
    if-gez v14, :cond_11

    .line 544
    .line 545
    shl-int/lit8 v11, v8, 0x3

    .line 546
    .line 547
    add-int/2addr v11, v13

    .line 548
    aget-object v11, v6, v11

    .line 549
    .line 550
    invoke-virtual {v5, v11}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    const/4 v11, 0x1

    .line 554
    :cond_11
    const/16 v14, 0x8

    .line 555
    .line 556
    shr-long/2addr v9, v14

    .line 557
    add-int/lit8 v13, v13, 0x1

    .line 558
    .line 559
    goto :goto_c

    .line 560
    :cond_12
    const/16 v14, 0x8

    .line 561
    .line 562
    if-ne v12, v14, :cond_15

    .line 563
    .line 564
    :cond_13
    if-eq v8, v7, :cond_15

    .line 565
    .line 566
    add-int/lit8 v8, v8, 0x1

    .line 567
    .line 568
    goto :goto_b

    .line 569
    :cond_14
    invoke-virtual {v5, v1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    const/4 v11, 0x1

    .line 573
    :cond_15
    sget-object v1, LTd/L;->a:LTd/L;

    .line 574
    .line 575
    goto :goto_d

    .line 576
    :cond_16
    iget-object v6, v0, Li0/L$a;->h:La0/c;

    .line 577
    .line 578
    invoke-virtual {v6, v1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    goto :goto_d

    .line 582
    :cond_17
    move-object/from16 v39, v7

    .line 583
    .line 584
    move-object/from16 v40, v8

    .line 585
    .line 586
    move/from16 v31, v9

    .line 587
    .line 588
    move/from16 v32, v10

    .line 589
    .line 590
    move-wide/from16 v29, v12

    .line 591
    .line 592
    move/from16 v38, v14

    .line 593
    .line 594
    :goto_d
    move-object/from16 v1, v40

    .line 595
    .line 596
    goto :goto_e

    .line 597
    :cond_18
    move-object/from16 v39, v7

    .line 598
    .line 599
    move/from16 v31, v9

    .line 600
    .line 601
    move/from16 v32, v10

    .line 602
    .line 603
    move-wide/from16 v29, v12

    .line 604
    .line 605
    move/from16 v38, v14

    .line 606
    .line 607
    move-object v1, v8

    .line 608
    :goto_e
    invoke-virtual {v4, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    if-eqz v1, :cond_1d

    .line 613
    .line 614
    instance-of v6, v1, Lt/Q;

    .line 615
    .line 616
    if-eqz v6, :cond_1c

    .line 617
    .line 618
    check-cast v1, Lt/Q;

    .line 619
    .line 620
    iget-object v6, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 621
    .line 622
    iget-object v1, v1, Lt/e0;->a:[J

    .line 623
    .line 624
    array-length v7, v1

    .line 625
    add-int/lit8 v7, v7, -0x2

    .line 626
    .line 627
    if-ltz v7, :cond_1d

    .line 628
    .line 629
    move/from16 v8, v18

    .line 630
    .line 631
    :goto_f
    aget-wide v9, v1, v8

    .line 632
    .line 633
    not-long v12, v9

    .line 634
    shl-long v12, v12, v21

    .line 635
    .line 636
    and-long/2addr v12, v9

    .line 637
    and-long v12, v12, v23

    .line 638
    .line 639
    cmp-long v12, v12, v23

    .line 640
    .line 641
    if-eqz v12, :cond_1b

    .line 642
    .line 643
    sub-int v12, v8, v7

    .line 644
    .line 645
    not-int v12, v12

    .line 646
    ushr-int/lit8 v12, v12, 0x1f

    .line 647
    .line 648
    const/16 v26, 0x8

    .line 649
    .line 650
    rsub-int/lit8 v12, v12, 0x8

    .line 651
    .line 652
    move/from16 v13, v18

    .line 653
    .line 654
    :goto_10
    if-ge v13, v12, :cond_1a

    .line 655
    .line 656
    and-long v27, v9, v19

    .line 657
    .line 658
    cmp-long v14, v27, v16

    .line 659
    .line 660
    if-gez v14, :cond_19

    .line 661
    .line 662
    shl-int/lit8 v11, v8, 0x3

    .line 663
    .line 664
    add-int/2addr v11, v13

    .line 665
    aget-object v11, v6, v11

    .line 666
    .line 667
    invoke-virtual {v5, v11}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    const/4 v11, 0x1

    .line 671
    :cond_19
    const/16 v14, 0x8

    .line 672
    .line 673
    shr-long/2addr v9, v14

    .line 674
    add-int/lit8 v13, v13, 0x1

    .line 675
    .line 676
    goto :goto_10

    .line 677
    :cond_1a
    const/16 v14, 0x8

    .line 678
    .line 679
    if-ne v12, v14, :cond_1d

    .line 680
    .line 681
    :cond_1b
    if-eq v8, v7, :cond_1d

    .line 682
    .line 683
    add-int/lit8 v8, v8, 0x1

    .line 684
    .line 685
    goto :goto_f

    .line 686
    :cond_1c
    invoke-virtual {v5, v1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    const/4 v11, 0x1

    .line 690
    :cond_1d
    :goto_11
    const/16 v14, 0x8

    .line 691
    .line 692
    goto :goto_12

    .line 693
    :cond_1e
    move-object/from16 v25, v1

    .line 694
    .line 695
    move-object/from16 p1, v6

    .line 696
    .line 697
    move-object/from16 v39, v7

    .line 698
    .line 699
    move/from16 v31, v9

    .line 700
    .line 701
    move/from16 v32, v10

    .line 702
    .line 703
    move-wide/from16 v29, v12

    .line 704
    .line 705
    move/from16 v38, v14

    .line 706
    .line 707
    move v14, v8

    .line 708
    :goto_12
    shr-long v12, v29, v14

    .line 709
    .line 710
    add-int/lit8 v15, v15, 0x1

    .line 711
    .line 712
    move-object/from16 v6, p1

    .line 713
    .line 714
    move v8, v14

    .line 715
    move-object/from16 v1, v25

    .line 716
    .line 717
    move/from16 v9, v31

    .line 718
    .line 719
    move/from16 v10, v32

    .line 720
    .line 721
    move/from16 v14, v38

    .line 722
    .line 723
    move-object/from16 v7, v39

    .line 724
    .line 725
    goto/16 :goto_1

    .line 726
    .line 727
    :cond_1f
    move/from16 p1, v14

    .line 728
    .line 729
    move v14, v8

    .line 730
    move/from16 v8, p1

    .line 731
    .line 732
    move-object/from16 v25, v1

    .line 733
    .line 734
    move-object/from16 p1, v6

    .line 735
    .line 736
    move-object/from16 v39, v7

    .line 737
    .line 738
    move/from16 v31, v9

    .line 739
    .line 740
    move/from16 v32, v10

    .line 741
    .line 742
    if-ne v8, v14, :cond_3f

    .line 743
    .line 744
    move/from16 v9, v31

    .line 745
    .line 746
    move/from16 v1, v32

    .line 747
    .line 748
    goto :goto_13

    .line 749
    :cond_20
    move-object/from16 v25, v1

    .line 750
    .line 751
    move-object/from16 p1, v6

    .line 752
    .line 753
    move-object/from16 v39, v7

    .line 754
    .line 755
    move v1, v10

    .line 756
    :goto_13
    if-eq v1, v9, :cond_3f

    .line 757
    .line 758
    add-int/lit8 v10, v1, 0x1

    .line 759
    .line 760
    move-object/from16 v6, p1

    .line 761
    .line 762
    move-object/from16 v1, v25

    .line 763
    .line 764
    move-object/from16 v7, v39

    .line 765
    .line 766
    const/16 v8, 0x8

    .line 767
    .line 768
    goto/16 :goto_0

    .line 769
    .line 770
    :cond_21
    move/from16 v11, v18

    .line 771
    .line 772
    goto/16 :goto_24

    .line 773
    .line 774
    :cond_22
    move-object/from16 v39, v7

    .line 775
    .line 776
    move/from16 v22, v13

    .line 777
    .line 778
    const-wide/16 v19, 0xff

    .line 779
    .line 780
    const/16 v21, 0x7

    .line 781
    .line 782
    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    check-cast v1, Ljava/lang/Iterable;

    .line 788
    .line 789
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    move/from16 v11, v18

    .line 794
    .line 795
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 796
    .line 797
    .line 798
    move-result v6

    .line 799
    if-eqz v6, :cond_3f

    .line 800
    .line 801
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v6

    .line 805
    instance-of v7, v6, Li0/V;

    .line 806
    .line 807
    if-eqz v7, :cond_24

    .line 808
    .line 809
    move-object v7, v6

    .line 810
    check-cast v7, Li0/V;

    .line 811
    .line 812
    invoke-static/range {v22 .. v22}, Li0/h;->a(I)I

    .line 813
    .line 814
    .line 815
    move-result v8

    .line 816
    invoke-virtual {v7, v8}, Li0/V;->q(I)Z

    .line 817
    .line 818
    .line 819
    move-result v7

    .line 820
    if-nez v7, :cond_24

    .line 821
    .line 822
    move-object/from16 p1, v1

    .line 823
    .line 824
    move-object/from16 v25, v2

    .line 825
    .line 826
    :cond_23
    const/16 v14, 0x8

    .line 827
    .line 828
    goto/16 :goto_23

    .line 829
    .line 830
    :cond_24
    invoke-static {v2, v6}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    move-result v7

    .line 834
    if-eqz v7, :cond_38

    .line 835
    .line 836
    invoke-virtual {v2, v6}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v7

    .line 840
    if-eqz v7, :cond_38

    .line 841
    .line 842
    instance-of v8, v7, Lt/Q;

    .line 843
    .line 844
    if-eqz v8, :cond_30

    .line 845
    .line 846
    check-cast v7, Lt/Q;

    .line 847
    .line 848
    iget-object v8, v7, Lt/e0;->b:[Ljava/lang/Object;

    .line 849
    .line 850
    iget-object v7, v7, Lt/e0;->a:[J

    .line 851
    .line 852
    array-length v9, v7

    .line 853
    add-int/lit8 v9, v9, -0x2

    .line 854
    .line 855
    if-ltz v9, :cond_38

    .line 856
    .line 857
    move/from16 v10, v18

    .line 858
    .line 859
    :goto_15
    aget-wide v12, v7, v10

    .line 860
    .line 861
    not-long v14, v12

    .line 862
    shl-long v14, v14, v21

    .line 863
    .line 864
    and-long/2addr v14, v12

    .line 865
    and-long v14, v14, v23

    .line 866
    .line 867
    cmp-long v14, v14, v23

    .line 868
    .line 869
    if-eqz v14, :cond_2f

    .line 870
    .line 871
    sub-int v14, v10, v9

    .line 872
    .line 873
    not-int v14, v14

    .line 874
    ushr-int/lit8 v14, v14, 0x1f

    .line 875
    .line 876
    const/16 v26, 0x8

    .line 877
    .line 878
    rsub-int/lit8 v14, v14, 0x8

    .line 879
    .line 880
    move/from16 v15, v18

    .line 881
    .line 882
    :goto_16
    if-ge v15, v14, :cond_2e

    .line 883
    .line 884
    and-long v27, v12, v19

    .line 885
    .line 886
    cmp-long v25, v27, v16

    .line 887
    .line 888
    if-gez v25, :cond_2d

    .line 889
    .line 890
    shl-int/lit8 v25, v10, 0x3

    .line 891
    .line 892
    add-int v25, v25, v15

    .line 893
    .line 894
    aget-object v25, v8, v25

    .line 895
    .line 896
    move-object/from16 p1, v1

    .line 897
    .line 898
    move-object/from16 v1, v25

    .line 899
    .line 900
    check-cast v1, LY/U;

    .line 901
    .line 902
    move-object/from16 v25, v2

    .line 903
    .line 904
    move-object/from16 v2, v39

    .line 905
    .line 906
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    invoke-interface {v1}, LY/U;->d()LY/T1;

    .line 914
    .line 915
    .line 916
    move-result-object v27

    .line 917
    if-nez v27, :cond_25

    .line 918
    .line 919
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 920
    .line 921
    .line 922
    move-result-object v27

    .line 923
    :cond_25
    move-object/from16 v28, v7

    .line 924
    .line 925
    move-object/from16 v7, v27

    .line 926
    .line 927
    invoke-interface {v1}, LY/U;->o()LY/U$a;

    .line 928
    .line 929
    .line 930
    move-result-object v27

    .line 931
    move-object/from16 v29, v8

    .line 932
    .line 933
    invoke-interface/range {v27 .. v27}, LY/U$a;->a()Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v8

    .line 937
    invoke-interface {v7, v8, v2}, LY/T1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 938
    .line 939
    .line 940
    move-result v2

    .line 941
    if-nez v2, :cond_2c

    .line 942
    .line 943
    invoke-virtual {v4, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    if-eqz v1, :cond_2b

    .line 948
    .line 949
    instance-of v2, v1, Lt/Q;

    .line 950
    .line 951
    if-eqz v2, :cond_2a

    .line 952
    .line 953
    check-cast v1, Lt/Q;

    .line 954
    .line 955
    iget-object v2, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 956
    .line 957
    iget-object v1, v1, Lt/e0;->a:[J

    .line 958
    .line 959
    array-length v7, v1

    .line 960
    add-int/lit8 v7, v7, -0x2

    .line 961
    .line 962
    if-ltz v7, :cond_2b

    .line 963
    .line 964
    move-wide/from16 v30, v12

    .line 965
    .line 966
    move/from16 v8, v18

    .line 967
    .line 968
    move v13, v11

    .line 969
    :goto_17
    aget-wide v11, v1, v8

    .line 970
    .line 971
    move-object/from16 v32, v1

    .line 972
    .line 973
    move-object/from16 v27, v2

    .line 974
    .line 975
    not-long v1, v11

    .line 976
    shl-long v1, v1, v21

    .line 977
    .line 978
    and-long/2addr v1, v11

    .line 979
    and-long v1, v1, v23

    .line 980
    .line 981
    cmp-long v1, v1, v23

    .line 982
    .line 983
    if-eqz v1, :cond_28

    .line 984
    .line 985
    sub-int v1, v8, v7

    .line 986
    .line 987
    not-int v1, v1

    .line 988
    ushr-int/lit8 v1, v1, 0x1f

    .line 989
    .line 990
    const/16 v26, 0x8

    .line 991
    .line 992
    rsub-int/lit8 v1, v1, 0x8

    .line 993
    .line 994
    move/from16 v2, v18

    .line 995
    .line 996
    :goto_18
    if-ge v2, v1, :cond_27

    .line 997
    .line 998
    and-long v33, v11, v19

    .line 999
    .line 1000
    cmp-long v33, v33, v16

    .line 1001
    .line 1002
    if-gez v33, :cond_26

    .line 1003
    .line 1004
    shl-int/lit8 v13, v8, 0x3

    .line 1005
    .line 1006
    add-int/2addr v13, v2

    .line 1007
    aget-object v13, v27, v13

    .line 1008
    .line 1009
    invoke-virtual {v5, v13}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    const/4 v13, 0x1

    .line 1013
    :cond_26
    move/from16 v26, v2

    .line 1014
    .line 1015
    const/16 v2, 0x8

    .line 1016
    .line 1017
    shr-long/2addr v11, v2

    .line 1018
    add-int/lit8 v26, v26, 0x1

    .line 1019
    .line 1020
    move/from16 v2, v26

    .line 1021
    .line 1022
    goto :goto_18

    .line 1023
    :cond_27
    const/16 v2, 0x8

    .line 1024
    .line 1025
    if-ne v1, v2, :cond_29

    .line 1026
    .line 1027
    :cond_28
    if-eq v8, v7, :cond_29

    .line 1028
    .line 1029
    add-int/lit8 v8, v8, 0x1

    .line 1030
    .line 1031
    move-object/from16 v2, v27

    .line 1032
    .line 1033
    move-object/from16 v1, v32

    .line 1034
    .line 1035
    goto :goto_17

    .line 1036
    :cond_29
    move v11, v13

    .line 1037
    goto :goto_19

    .line 1038
    :cond_2a
    move-wide/from16 v30, v12

    .line 1039
    .line 1040
    invoke-virtual {v5, v1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    const/4 v11, 0x1

    .line 1044
    goto :goto_19

    .line 1045
    :cond_2b
    move-wide/from16 v30, v12

    .line 1046
    .line 1047
    :goto_19
    sget-object v1, LTd/L;->a:LTd/L;

    .line 1048
    .line 1049
    goto :goto_1a

    .line 1050
    :cond_2c
    move-wide/from16 v30, v12

    .line 1051
    .line 1052
    iget-object v2, v0, Li0/L$a;->h:La0/c;

    .line 1053
    .line 1054
    invoke-virtual {v2, v1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 1055
    .line 1056
    .line 1057
    :goto_1a
    const/16 v7, 0x8

    .line 1058
    .line 1059
    goto :goto_1b

    .line 1060
    :cond_2d
    move-object/from16 p1, v1

    .line 1061
    .line 1062
    move-object/from16 v25, v2

    .line 1063
    .line 1064
    move-object/from16 v28, v7

    .line 1065
    .line 1066
    move-object/from16 v29, v8

    .line 1067
    .line 1068
    move-wide/from16 v30, v12

    .line 1069
    .line 1070
    goto :goto_1a

    .line 1071
    :goto_1b
    shr-long v12, v30, v7

    .line 1072
    .line 1073
    add-int/lit8 v15, v15, 0x1

    .line 1074
    .line 1075
    move-object/from16 v1, p1

    .line 1076
    .line 1077
    move-object/from16 v2, v25

    .line 1078
    .line 1079
    move-object/from16 v7, v28

    .line 1080
    .line 1081
    move-object/from16 v8, v29

    .line 1082
    .line 1083
    goto/16 :goto_16

    .line 1084
    .line 1085
    :cond_2e
    move-object/from16 p1, v1

    .line 1086
    .line 1087
    move-object/from16 v25, v2

    .line 1088
    .line 1089
    move-object/from16 v28, v7

    .line 1090
    .line 1091
    move-object/from16 v29, v8

    .line 1092
    .line 1093
    const/16 v7, 0x8

    .line 1094
    .line 1095
    if-ne v14, v7, :cond_39

    .line 1096
    .line 1097
    goto :goto_1c

    .line 1098
    :cond_2f
    move-object/from16 p1, v1

    .line 1099
    .line 1100
    move-object/from16 v25, v2

    .line 1101
    .line 1102
    move-object/from16 v28, v7

    .line 1103
    .line 1104
    move-object/from16 v29, v8

    .line 1105
    .line 1106
    :goto_1c
    if-eq v10, v9, :cond_39

    .line 1107
    .line 1108
    add-int/lit8 v10, v10, 0x1

    .line 1109
    .line 1110
    move-object/from16 v1, p1

    .line 1111
    .line 1112
    move-object/from16 v2, v25

    .line 1113
    .line 1114
    move-object/from16 v7, v28

    .line 1115
    .line 1116
    move-object/from16 v8, v29

    .line 1117
    .line 1118
    goto/16 :goto_15

    .line 1119
    .line 1120
    :cond_30
    move-object/from16 p1, v1

    .line 1121
    .line 1122
    move-object/from16 v25, v2

    .line 1123
    .line 1124
    check-cast v7, LY/U;

    .line 1125
    .line 1126
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v1

    .line 1130
    invoke-interface {v7}, LY/U;->d()LY/T1;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    if-nez v2, :cond_31

    .line 1135
    .line 1136
    invoke-static {}, LY/U1;->q()LY/T1;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    :cond_31
    invoke-interface {v7}, LY/U;->o()LY/U$a;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v8

    .line 1144
    invoke-interface {v8}, LY/U$a;->a()Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v8

    .line 1148
    invoke-interface {v2, v8, v1}, LY/T1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1149
    .line 1150
    .line 1151
    move-result v1

    .line 1152
    if-nez v1, :cond_37

    .line 1153
    .line 1154
    invoke-virtual {v4, v7}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v1

    .line 1158
    if-eqz v1, :cond_36

    .line 1159
    .line 1160
    instance-of v2, v1, Lt/Q;

    .line 1161
    .line 1162
    if-eqz v2, :cond_35

    .line 1163
    .line 1164
    check-cast v1, Lt/Q;

    .line 1165
    .line 1166
    iget-object v2, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 1167
    .line 1168
    iget-object v1, v1, Lt/e0;->a:[J

    .line 1169
    .line 1170
    array-length v7, v1

    .line 1171
    add-int/lit8 v7, v7, -0x2

    .line 1172
    .line 1173
    if-ltz v7, :cond_36

    .line 1174
    .line 1175
    move/from16 v8, v18

    .line 1176
    .line 1177
    :goto_1d
    aget-wide v9, v1, v8

    .line 1178
    .line 1179
    not-long v12, v9

    .line 1180
    shl-long v12, v12, v21

    .line 1181
    .line 1182
    and-long/2addr v12, v9

    .line 1183
    and-long v12, v12, v23

    .line 1184
    .line 1185
    cmp-long v12, v12, v23

    .line 1186
    .line 1187
    if-eqz v12, :cond_34

    .line 1188
    .line 1189
    sub-int v12, v8, v7

    .line 1190
    .line 1191
    not-int v12, v12

    .line 1192
    ushr-int/lit8 v12, v12, 0x1f

    .line 1193
    .line 1194
    const/16 v26, 0x8

    .line 1195
    .line 1196
    rsub-int/lit8 v12, v12, 0x8

    .line 1197
    .line 1198
    move/from16 v13, v18

    .line 1199
    .line 1200
    :goto_1e
    if-ge v13, v12, :cond_33

    .line 1201
    .line 1202
    and-long v14, v9, v19

    .line 1203
    .line 1204
    cmp-long v14, v14, v16

    .line 1205
    .line 1206
    if-gez v14, :cond_32

    .line 1207
    .line 1208
    shl-int/lit8 v11, v8, 0x3

    .line 1209
    .line 1210
    add-int/2addr v11, v13

    .line 1211
    aget-object v11, v2, v11

    .line 1212
    .line 1213
    invoke-virtual {v5, v11}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    const/4 v11, 0x1

    .line 1217
    :cond_32
    const/16 v14, 0x8

    .line 1218
    .line 1219
    shr-long/2addr v9, v14

    .line 1220
    add-int/lit8 v13, v13, 0x1

    .line 1221
    .line 1222
    goto :goto_1e

    .line 1223
    :cond_33
    const/16 v14, 0x8

    .line 1224
    .line 1225
    if-ne v12, v14, :cond_36

    .line 1226
    .line 1227
    :cond_34
    if-eq v8, v7, :cond_36

    .line 1228
    .line 1229
    add-int/lit8 v8, v8, 0x1

    .line 1230
    .line 1231
    goto :goto_1d

    .line 1232
    :cond_35
    invoke-virtual {v5, v1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 1233
    .line 1234
    .line 1235
    const/4 v11, 0x1

    .line 1236
    :cond_36
    sget-object v1, LTd/L;->a:LTd/L;

    .line 1237
    .line 1238
    goto :goto_1f

    .line 1239
    :cond_37
    iget-object v1, v0, Li0/L$a;->h:La0/c;

    .line 1240
    .line 1241
    invoke-virtual {v1, v7}, La0/c;->c(Ljava/lang/Object;)Z

    .line 1242
    .line 1243
    .line 1244
    goto :goto_1f

    .line 1245
    :cond_38
    move-object/from16 p1, v1

    .line 1246
    .line 1247
    move-object/from16 v25, v2

    .line 1248
    .line 1249
    :cond_39
    :goto_1f
    invoke-virtual {v4, v6}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    if-eqz v1, :cond_23

    .line 1254
    .line 1255
    instance-of v2, v1, Lt/Q;

    .line 1256
    .line 1257
    if-eqz v2, :cond_3d

    .line 1258
    .line 1259
    check-cast v1, Lt/Q;

    .line 1260
    .line 1261
    iget-object v2, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 1262
    .line 1263
    iget-object v1, v1, Lt/e0;->a:[J

    .line 1264
    .line 1265
    array-length v6, v1

    .line 1266
    add-int/lit8 v6, v6, -0x2

    .line 1267
    .line 1268
    if-ltz v6, :cond_23

    .line 1269
    .line 1270
    move/from16 v7, v18

    .line 1271
    .line 1272
    :goto_20
    aget-wide v8, v1, v7

    .line 1273
    .line 1274
    not-long v12, v8

    .line 1275
    shl-long v12, v12, v21

    .line 1276
    .line 1277
    and-long/2addr v12, v8

    .line 1278
    and-long v12, v12, v23

    .line 1279
    .line 1280
    cmp-long v10, v12, v23

    .line 1281
    .line 1282
    if-eqz v10, :cond_3c

    .line 1283
    .line 1284
    sub-int v10, v7, v6

    .line 1285
    .line 1286
    not-int v10, v10

    .line 1287
    ushr-int/lit8 v10, v10, 0x1f

    .line 1288
    .line 1289
    const/16 v26, 0x8

    .line 1290
    .line 1291
    rsub-int/lit8 v10, v10, 0x8

    .line 1292
    .line 1293
    move/from16 v12, v18

    .line 1294
    .line 1295
    :goto_21
    if-ge v12, v10, :cond_3b

    .line 1296
    .line 1297
    and-long v13, v8, v19

    .line 1298
    .line 1299
    cmp-long v13, v13, v16

    .line 1300
    .line 1301
    if-gez v13, :cond_3a

    .line 1302
    .line 1303
    shl-int/lit8 v11, v7, 0x3

    .line 1304
    .line 1305
    add-int/2addr v11, v12

    .line 1306
    aget-object v11, v2, v11

    .line 1307
    .line 1308
    invoke-virtual {v5, v11}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 1309
    .line 1310
    .line 1311
    const/4 v11, 0x1

    .line 1312
    :cond_3a
    const/16 v14, 0x8

    .line 1313
    .line 1314
    shr-long/2addr v8, v14

    .line 1315
    add-int/lit8 v12, v12, 0x1

    .line 1316
    .line 1317
    goto :goto_21

    .line 1318
    :cond_3b
    const/16 v14, 0x8

    .line 1319
    .line 1320
    if-ne v10, v14, :cond_3e

    .line 1321
    .line 1322
    goto :goto_22

    .line 1323
    :cond_3c
    const/16 v14, 0x8

    .line 1324
    .line 1325
    :goto_22
    if-eq v7, v6, :cond_3e

    .line 1326
    .line 1327
    add-int/lit8 v7, v7, 0x1

    .line 1328
    .line 1329
    goto :goto_20

    .line 1330
    :cond_3d
    const/16 v14, 0x8

    .line 1331
    .line 1332
    invoke-virtual {v5, v1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    const/4 v11, 0x1

    .line 1336
    :cond_3e
    :goto_23
    move-object/from16 v1, p1

    .line 1337
    .line 1338
    move-object/from16 v2, v25

    .line 1339
    .line 1340
    goto/16 :goto_14

    .line 1341
    .line 1342
    :cond_3f
    :goto_24
    iget-object v1, v0, Li0/L$a;->h:La0/c;

    .line 1343
    .line 1344
    invoke-virtual {v1}, La0/c;->p()I

    .line 1345
    .line 1346
    .line 1347
    move-result v1

    .line 1348
    if-eqz v1, :cond_41

    .line 1349
    .line 1350
    iget-object v1, v0, Li0/L$a;->h:La0/c;

    .line 1351
    .line 1352
    iget-object v2, v1, La0/c;->a:[Ljava/lang/Object;

    .line 1353
    .line 1354
    invoke-virtual {v1}, La0/c;->p()I

    .line 1355
    .line 1356
    .line 1357
    move-result v1

    .line 1358
    move/from16 v3, v18

    .line 1359
    .line 1360
    :goto_25
    if-ge v3, v1, :cond_40

    .line 1361
    .line 1362
    aget-object v4, v2, v3

    .line 1363
    .line 1364
    check-cast v4, LY/U;

    .line 1365
    .line 1366
    invoke-virtual {v0, v4}, Li0/L$a;->o(LY/U;)V

    .line 1367
    .line 1368
    .line 1369
    add-int/lit8 v3, v3, 0x1

    .line 1370
    .line 1371
    goto :goto_25

    .line 1372
    :cond_40
    iget-object v1, v0, Li0/L$a;->h:La0/c;

    .line 1373
    .line 1374
    invoke-virtual {v1}, La0/c;->i()V

    .line 1375
    .line 1376
    .line 1377
    :cond_41
    return v11
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Li0/L$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Li0/L$a;->d:I

    .line 7
    .line 8
    iget-object v2, p0, Li0/L$a;->c:Lt/K;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    new-instance v2, Lt/K;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-direct {v2, v5, v3, v4}, Lt/K;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, Li0/L$a;->c:Lt/K;

    .line 21
    .line 22
    iget-object v3, p0, Li0/L$a;->f:Lt/P;

    .line 23
    .line 24
    invoke-virtual {v3, v0, v2}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v3, LTd/L;->a:LTd/L;

    .line 28
    .line 29
    :cond_0
    invoke-direct {p0, p1, v1, v0, v2}, Li0/L$a;->l(Ljava/lang/Object;ILjava/lang/Object;Lt/K;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final n(Lkotlin/jvm/functions/Function1;)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Li0/L$a;->f:Lt/P;

    .line 4
    .line 5
    iget-object v2, v1, Lt/c0;->a:[J

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    add-int/lit8 v3, v3, -0x2

    .line 9
    .line 10
    if-ltz v3, :cond_9

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    :goto_0
    aget-wide v6, v2, v5

    .line 14
    .line 15
    not-long v8, v6

    .line 16
    const/4 v10, 0x7

    .line 17
    shl-long/2addr v8, v10

    .line 18
    and-long/2addr v8, v6

    .line 19
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v8, v11

    .line 25
    cmp-long v8, v8, v11

    .line 26
    .line 27
    if-eqz v8, :cond_8

    .line 28
    .line 29
    sub-int v8, v5, v3

    .line 30
    .line 31
    not-int v8, v8

    .line 32
    ushr-int/lit8 v8, v8, 0x1f

    .line 33
    .line 34
    const/16 v9, 0x8

    .line 35
    .line 36
    rsub-int/lit8 v8, v8, 0x8

    .line 37
    .line 38
    const/4 v13, 0x0

    .line 39
    :goto_1
    if-ge v13, v8, :cond_7

    .line 40
    .line 41
    const-wide/16 v14, 0xff

    .line 42
    .line 43
    and-long v16, v6, v14

    .line 44
    .line 45
    const-wide/16 v18, 0x80

    .line 46
    .line 47
    cmp-long v16, v16, v18

    .line 48
    .line 49
    if-gez v16, :cond_6

    .line 50
    .line 51
    shl-int/lit8 v16, v5, 0x3

    .line 52
    .line 53
    add-int v4, v16, v13

    .line 54
    .line 55
    move/from16 v16, v10

    .line 56
    .line 57
    iget-object v10, v1, Lt/c0;->b:[Ljava/lang/Object;

    .line 58
    .line 59
    aget-object v10, v10, v4

    .line 60
    .line 61
    move-wide/from16 v20, v11

    .line 62
    .line 63
    iget-object v11, v1, Lt/c0;->c:[Ljava/lang/Object;

    .line 64
    .line 65
    aget-object v11, v11, v4

    .line 66
    .line 67
    check-cast v11, Lt/K;

    .line 68
    .line 69
    move-object/from16 v12, p1

    .line 70
    .line 71
    invoke-interface {v12, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v22

    .line 75
    check-cast v22, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v23

    .line 81
    if-eqz v23, :cond_3

    .line 82
    .line 83
    move-wide/from16 v23, v14

    .line 84
    .line 85
    iget-object v14, v11, Lt/T;->b:[Ljava/lang/Object;

    .line 86
    .line 87
    iget-object v15, v11, Lt/T;->c:[I

    .line 88
    .line 89
    iget-object v11, v11, Lt/T;->a:[J

    .line 90
    .line 91
    move/from16 v25, v9

    .line 92
    .line 93
    array-length v9, v11

    .line 94
    add-int/lit8 v9, v9, -0x2

    .line 95
    .line 96
    if-ltz v9, :cond_3

    .line 97
    .line 98
    move-object/from16 v26, v2

    .line 99
    .line 100
    move-wide/from16 v27, v6

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    :goto_2
    aget-wide v6, v11, v2

    .line 104
    .line 105
    move-object/from16 v29, v11

    .line 106
    .line 107
    not-long v11, v6

    .line 108
    shl-long v11, v11, v16

    .line 109
    .line 110
    and-long/2addr v11, v6

    .line 111
    and-long v11, v11, v20

    .line 112
    .line 113
    cmp-long v11, v11, v20

    .line 114
    .line 115
    if-eqz v11, :cond_2

    .line 116
    .line 117
    sub-int v11, v2, v9

    .line 118
    .line 119
    not-int v11, v11

    .line 120
    ushr-int/lit8 v11, v11, 0x1f

    .line 121
    .line 122
    rsub-int/lit8 v11, v11, 0x8

    .line 123
    .line 124
    const/4 v12, 0x0

    .line 125
    :goto_3
    if-ge v12, v11, :cond_1

    .line 126
    .line 127
    and-long v30, v6, v23

    .line 128
    .line 129
    cmp-long v30, v30, v18

    .line 130
    .line 131
    if-gez v30, :cond_0

    .line 132
    .line 133
    shl-int/lit8 v30, v2, 0x3

    .line 134
    .line 135
    add-int v30, v30, v12

    .line 136
    .line 137
    move-wide/from16 v31, v6

    .line 138
    .line 139
    aget-object v6, v14, v30

    .line 140
    .line 141
    aget v7, v15, v30

    .line 142
    .line 143
    invoke-direct {v0, v10, v6}, Li0/L$a;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_0
    move-wide/from16 v31, v6

    .line 148
    .line 149
    :goto_4
    shr-long v6, v31, v25

    .line 150
    .line 151
    add-int/lit8 v12, v12, 0x1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_1
    move/from16 v6, v25

    .line 155
    .line 156
    if-ne v11, v6, :cond_4

    .line 157
    .line 158
    :cond_2
    if-eq v2, v9, :cond_4

    .line 159
    .line 160
    add-int/lit8 v2, v2, 0x1

    .line 161
    .line 162
    move-object/from16 v12, p1

    .line 163
    .line 164
    move-object/from16 v11, v29

    .line 165
    .line 166
    const/16 v25, 0x8

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    move-object/from16 v26, v2

    .line 170
    .line 171
    move-wide/from16 v27, v6

    .line 172
    .line 173
    :cond_4
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_5

    .line 178
    .line 179
    invoke-virtual {v1, v4}, Lt/P;->v(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_5
    const/16 v6, 0x8

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_6
    move-object/from16 v26, v2

    .line 186
    .line 187
    move-wide/from16 v27, v6

    .line 188
    .line 189
    move/from16 v16, v10

    .line 190
    .line 191
    move-wide/from16 v20, v11

    .line 192
    .line 193
    move v6, v9

    .line 194
    :goto_5
    shr-long v9, v27, v6

    .line 195
    .line 196
    add-int/lit8 v13, v13, 0x1

    .line 197
    .line 198
    move-wide v11, v9

    .line 199
    move v9, v6

    .line 200
    move-wide v6, v11

    .line 201
    move/from16 v10, v16

    .line 202
    .line 203
    move-wide/from16 v11, v20

    .line 204
    .line 205
    move-object/from16 v2, v26

    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :cond_7
    move-object/from16 v26, v2

    .line 210
    .line 211
    move v6, v9

    .line 212
    if-ne v8, v6, :cond_9

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_8
    move-object/from16 v26, v2

    .line 216
    .line 217
    :goto_6
    if-eq v5, v3, :cond_9

    .line 218
    .line 219
    add-int/lit8 v5, v5, 0x1

    .line 220
    .line 221
    move-object/from16 v2, v26

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_9
    return-void
.end method

.method public final o(LY/U;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li0/L$a;->f:Lt/P;

    .line 6
    .line 7
    invoke-static {}, Li0/v;->M()Li0/l;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Li0/l;->i()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget-object v4, v0, Li0/L$a;->e:Lt/P;

    .line 20
    .line 21
    invoke-virtual {v4, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_6

    .line 26
    .line 27
    instance-of v5, v4, Lt/Q;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x1

    .line 31
    const/4 v8, 0x0

    .line 32
    if-eqz v5, :cond_4

    .line 33
    .line 34
    check-cast v4, Lt/Q;

    .line 35
    .line 36
    iget-object v5, v4, Lt/e0;->b:[Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v4, v4, Lt/e0;->a:[J

    .line 39
    .line 40
    array-length v9, v4

    .line 41
    add-int/lit8 v9, v9, -0x2

    .line 42
    .line 43
    if-ltz v9, :cond_6

    .line 44
    .line 45
    move v10, v8

    .line 46
    :goto_0
    aget-wide v11, v4, v10

    .line 47
    .line 48
    not-long v13, v11

    .line 49
    const/4 v15, 0x7

    .line 50
    shl-long/2addr v13, v15

    .line 51
    and-long/2addr v13, v11

    .line 52
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v13, v15

    .line 58
    cmp-long v13, v13, v15

    .line 59
    .line 60
    if-eqz v13, :cond_3

    .line 61
    .line 62
    sub-int v13, v10, v9

    .line 63
    .line 64
    not-int v13, v13

    .line 65
    ushr-int/lit8 v13, v13, 0x1f

    .line 66
    .line 67
    const/16 v14, 0x8

    .line 68
    .line 69
    rsub-int/lit8 v13, v13, 0x8

    .line 70
    .line 71
    move v15, v8

    .line 72
    :goto_1
    if-ge v15, v13, :cond_2

    .line 73
    .line 74
    const-wide/16 v16, 0xff

    .line 75
    .line 76
    and-long v16, v11, v16

    .line 77
    .line 78
    const-wide/16 v18, 0x80

    .line 79
    .line 80
    cmp-long v16, v16, v18

    .line 81
    .line 82
    if-gez v16, :cond_1

    .line 83
    .line 84
    shl-int/lit8 v16, v10, 0x3

    .line 85
    .line 86
    add-int v16, v16, v15

    .line 87
    .line 88
    move/from16 v17, v14

    .line 89
    .line 90
    aget-object v14, v5, v16

    .line 91
    .line 92
    invoke-virtual {v2, v14}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v16

    .line 96
    check-cast v16, Lt/K;

    .line 97
    .line 98
    move-object/from16 v18, v4

    .line 99
    .line 100
    if-nez v16, :cond_0

    .line 101
    .line 102
    new-instance v4, Lt/K;

    .line 103
    .line 104
    invoke-direct {v4, v8, v7, v6}, Lt/K;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v14, v4}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sget-object v16, LTd/L;->a:LTd/L;

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_0
    move-object/from16 v4, v16

    .line 114
    .line 115
    :goto_2
    invoke-direct {v0, v1, v3, v14, v4}, Li0/L$a;->l(Ljava/lang/Object;ILjava/lang/Object;Lt/K;)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_1
    move-object/from16 v18, v4

    .line 120
    .line 121
    move/from16 v17, v14

    .line 122
    .line 123
    :goto_3
    shr-long v11, v11, v17

    .line 124
    .line 125
    add-int/lit8 v15, v15, 0x1

    .line 126
    .line 127
    move/from16 v14, v17

    .line 128
    .line 129
    move-object/from16 v4, v18

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    move-object/from16 v18, v4

    .line 133
    .line 134
    move v4, v14

    .line 135
    if-ne v13, v4, :cond_6

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_3
    move-object/from16 v18, v4

    .line 139
    .line 140
    :goto_4
    if-eq v10, v9, :cond_6

    .line 141
    .line 142
    add-int/lit8 v10, v10, 0x1

    .line 143
    .line 144
    move-object/from16 v4, v18

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_4
    invoke-virtual {v2, v4}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    check-cast v5, Lt/K;

    .line 152
    .line 153
    if-nez v5, :cond_5

    .line 154
    .line 155
    new-instance v5, Lt/K;

    .line 156
    .line 157
    invoke-direct {v5, v8, v7, v6}, Lt/K;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4, v5}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    sget-object v2, LTd/L;->a:LTd/L;

    .line 164
    .line 165
    :cond_5
    invoke-direct {v0, v1, v3, v4, v5}, Li0/L$a;->l(Ljava/lang/Object;ILjava/lang/Object;Lt/K;)V

    .line 166
    .line 167
    .line 168
    :cond_6
    return-void
.end method
