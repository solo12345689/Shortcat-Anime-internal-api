.class public final LY/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/Q;
.implements LY/y1;
.implements LY/h1;
.implements LY/N0;
.implements Lk0/r;


# instance fields
.field private final a:LY/y;

.field private final b:LY/d;

.field private final c:Ljava/util/concurrent/atomic/AtomicReference;

.field private final d:Ljava/lang/Object;

.field private final e:Ljava/util/Set;

.field private final f:LY/E1;

.field private final g:Lt/P;

.field private final h:Lt/Q;

.field private final i:Lt/Q;

.field private final j:Lt/P;

.field private final k:LZ/a;

.field private final l:LZ/a;

.field private final m:Lt/P;

.field private n:Lt/P;

.field private o:Z

.field private p:LY/C1;

.field private q:LY/R0;

.field private r:LY/B;

.field private s:I

.field private final t:LY/K;

.field private final u:Lg0/q;

.field private final v:LY/s;

.field private final w:LZd/i;

.field private final x:Z

.field private y:I

.field private z:Lkotlin/jvm/functions/Function2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/y;LY/d;LZd/i;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LY/B;->a:LY/y;

    .line 3
    iput-object p2, p0, LY/B;->b:LY/d;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 7
    new-instance v0, Lt/Q;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lt/Q;->l()Ljava/util/Set;

    move-result-object v7

    iput-object v7, p0, LY/B;->e:Ljava/util/Set;

    .line 8
    new-instance v9, LY/E1;

    invoke-direct {v9}, LY/E1;-><init>()V

    .line 9
    invoke-virtual {p1}, LY/y;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v9}, LY/E1;->i()V

    .line 10
    :cond_0
    invoke-virtual {p1}, LY/y;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v9}, LY/E1;->l()V

    .line 11
    :cond_1
    iput-object v9, p0, LY/B;->f:LY/E1;

    .line 12
    invoke-static {v1, v4, v1}, La0/g;->d(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    move-result-object v0

    iput-object v0, p0, LY/B;->g:Lt/P;

    .line 13
    new-instance v0, Lt/Q;

    invoke-direct {v0, v3, v4, v1}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LY/B;->h:Lt/Q;

    .line 14
    new-instance v0, Lt/Q;

    invoke-direct {v0, v3, v4, v1}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LY/B;->i:Lt/Q;

    .line 15
    invoke-static {v1, v4, v1}, La0/g;->d(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    move-result-object v0

    iput-object v0, p0, LY/B;->j:Lt/P;

    .line 16
    new-instance v10, LZ/a;

    invoke-direct {v10}, LZ/a;-><init>()V

    iput-object v10, p0, LY/B;->k:LZ/a;

    .line 17
    new-instance v6, LZ/a;

    invoke-direct {v6}, LZ/a;-><init>()V

    iput-object v6, p0, LY/B;->l:LZ/a;

    .line 18
    invoke-static {v1, v4, v1}, La0/g;->d(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    move-result-object v0

    iput-object v0, p0, LY/B;->m:Lt/P;

    .line 19
    invoke-static {v1, v4, v1}, La0/g;->d(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    move-result-object v0

    iput-object v0, p0, LY/B;->n:Lt/P;

    .line 20
    new-instance v0, LY/K;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, LY/K;-><init>(Lk0/l;ZLY/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, LY/B;->t:LY/K;

    .line 21
    new-instance v1, Lg0/q;

    invoke-direct {v1}, Lg0/q;-><init>()V

    iput-object v1, p0, LY/B;->u:Lg0/q;

    move-object v4, v7

    move-object v7, v0

    .line 22
    new-instance v0, LY/s;

    move-object v8, p0

    move-object v2, p1

    move-object v1, p2

    move-object v3, v9

    move-object v5, v10

    invoke-direct/range {v0 .. v8}, LY/s;-><init>(LY/d;LY/y;LY/E1;Ljava/util/Set;LZ/a;LZ/a;LY/K;LY/B;)V

    .line 23
    invoke-virtual {p1, v0}, LY/y;->q(LY/m;)V

    iput-object v0, p0, LY/B;->v:LY/s;

    .line 24
    iput-object p3, p0, LY/B;->w:LZd/i;

    .line 25
    instance-of v0, p1, LY/o1;

    iput-boolean v0, p0, LY/B;->x:Z

    .line 26
    sget-object v0, LY/g;->a:LY/g;

    invoke-virtual {v0}, LY/g;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    iput-object v0, p0, LY/B;->z:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public synthetic constructor <init>(LY/y;LY/d;LZd/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 27
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LY/B;-><init>(LY/y;LY/d;LZd/i;)V

    return-void
.end method

.method private final A(Ljava/lang/Object;Z)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LY/B;->g:Lt/P;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_6

    .line 12
    .line 13
    instance-of v3, v2, Lt/Q;

    .line 14
    .line 15
    if-eqz v3, :cond_4

    .line 16
    .line 17
    check-cast v2, Lt/Q;

    .line 18
    .line 19
    iget-object v3, v2, Lt/e0;->b:[Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v2, v2, Lt/e0;->a:[J

    .line 22
    .line 23
    array-length v4, v2

    .line 24
    add-int/lit8 v4, v4, -0x2

    .line 25
    .line 26
    if-ltz v4, :cond_6

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    move v6, v5

    .line 30
    :goto_0
    aget-wide v7, v2, v6

    .line 31
    .line 32
    not-long v9, v7

    .line 33
    const/4 v11, 0x7

    .line 34
    shl-long/2addr v9, v11

    .line 35
    and-long/2addr v9, v7

    .line 36
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v9, v11

    .line 42
    cmp-long v9, v9, v11

    .line 43
    .line 44
    if-eqz v9, :cond_3

    .line 45
    .line 46
    sub-int v9, v6, v4

    .line 47
    .line 48
    not-int v9, v9

    .line 49
    ushr-int/lit8 v9, v9, 0x1f

    .line 50
    .line 51
    const/16 v10, 0x8

    .line 52
    .line 53
    rsub-int/lit8 v9, v9, 0x8

    .line 54
    .line 55
    move v11, v5

    .line 56
    :goto_1
    if-ge v11, v9, :cond_2

    .line 57
    .line 58
    const-wide/16 v12, 0xff

    .line 59
    .line 60
    and-long/2addr v12, v7

    .line 61
    const-wide/16 v14, 0x80

    .line 62
    .line 63
    cmp-long v12, v12, v14

    .line 64
    .line 65
    if-gez v12, :cond_1

    .line 66
    .line 67
    shl-int/lit8 v12, v6, 0x3

    .line 68
    .line 69
    add-int/2addr v12, v11

    .line 70
    aget-object v12, v3, v12

    .line 71
    .line 72
    check-cast v12, LY/f1;

    .line 73
    .line 74
    iget-object v13, v0, LY/B;->m:Lt/P;

    .line 75
    .line 76
    invoke-static {v13, v1, v12}, La0/g;->g(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    if-nez v13, :cond_1

    .line 81
    .line 82
    invoke-virtual {v12, v1}, LY/f1;->v(Ljava/lang/Object;)LY/l0;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    sget-object v14, LY/l0;->a:LY/l0;

    .line 87
    .line 88
    if-eq v13, v14, :cond_1

    .line 89
    .line 90
    invoke-virtual {v12}, LY/f1;->w()Z

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-eqz v13, :cond_0

    .line 95
    .line 96
    if-nez p2, :cond_0

    .line 97
    .line 98
    iget-object v13, v0, LY/B;->i:Lt/Q;

    .line 99
    .line 100
    invoke-virtual {v13, v12}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_0
    iget-object v13, v0, LY/B;->h:Lt/Q;

    .line 105
    .line 106
    invoke-virtual {v13, v12}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    :cond_1
    :goto_2
    shr-long/2addr v7, v10

    .line 110
    add-int/lit8 v11, v11, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    if-ne v9, v10, :cond_6

    .line 114
    .line 115
    :cond_3
    if-eq v6, v4, :cond_6

    .line 116
    .line 117
    add-int/lit8 v6, v6, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    check-cast v2, LY/f1;

    .line 121
    .line 122
    iget-object v3, v0, LY/B;->m:Lt/P;

    .line 123
    .line 124
    invoke-static {v3, v1, v2}, La0/g;->g(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_6

    .line 129
    .line 130
    invoke-virtual {v2, v1}, LY/f1;->v(Ljava/lang/Object;)LY/l0;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sget-object v3, LY/l0;->a:LY/l0;

    .line 135
    .line 136
    if-eq v1, v3, :cond_6

    .line 137
    .line 138
    invoke-virtual {v2}, LY/f1;->w()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    if-nez p2, :cond_5

    .line 145
    .line 146
    iget-object v1, v0, LY/B;->i:Lt/Q;

    .line 147
    .line 148
    invoke-virtual {v1, v2}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_5
    iget-object v1, v0, LY/B;->h:Lt/Q;

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    :cond_6
    return-void
.end method

.method private final B(Ljava/util/Set;Z)V
    .locals 35

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
    instance-of v3, v1, La0/e;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v9, 0x7

    .line 11
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/16 v13, 0x8

    .line 17
    .line 18
    if-eqz v3, :cond_b

    .line 19
    .line 20
    check-cast v1, La0/e;

    .line 21
    .line 22
    invoke-virtual {v1}, La0/e;->b()Lt/e0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v3, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v1, v1, Lt/e0;->a:[J

    .line 29
    .line 30
    array-length v14, v1

    .line 31
    add-int/lit8 v14, v14, -0x2

    .line 32
    .line 33
    if-ltz v14, :cond_a

    .line 34
    .line 35
    const/4 v15, 0x0

    .line 36
    const-wide/16 v16, 0x80

    .line 37
    .line 38
    :goto_0
    aget-wide v5, v1, v15

    .line 39
    .line 40
    const-wide/16 v18, 0xff

    .line 41
    .line 42
    not-long v7, v5

    .line 43
    shl-long/2addr v7, v9

    .line 44
    and-long/2addr v7, v5

    .line 45
    and-long/2addr v7, v10

    .line 46
    cmp-long v7, v7, v10

    .line 47
    .line 48
    if-eqz v7, :cond_9

    .line 49
    .line 50
    sub-int v7, v15, v14

    .line 51
    .line 52
    not-int v7, v7

    .line 53
    ushr-int/lit8 v7, v7, 0x1f

    .line 54
    .line 55
    rsub-int/lit8 v7, v7, 0x8

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    :goto_1
    if-ge v8, v7, :cond_8

    .line 59
    .line 60
    and-long v20, v5, v18

    .line 61
    .line 62
    cmp-long v20, v20, v16

    .line 63
    .line 64
    if-gez v20, :cond_7

    .line 65
    .line 66
    shl-int/lit8 v20, v15, 0x3

    .line 67
    .line 68
    add-int v20, v20, v8

    .line 69
    .line 70
    move/from16 v21, v9

    .line 71
    .line 72
    aget-object v9, v3, v20

    .line 73
    .line 74
    move-wide/from16 v22, v10

    .line 75
    .line 76
    instance-of v10, v9, LY/f1;

    .line 77
    .line 78
    if-eqz v10, :cond_0

    .line 79
    .line 80
    check-cast v9, LY/f1;

    .line 81
    .line 82
    invoke-virtual {v9, v4}, LY/f1;->v(Ljava/lang/Object;)LY/l0;

    .line 83
    .line 84
    .line 85
    move-wide/from16 v25, v5

    .line 86
    .line 87
    move/from16 p1, v14

    .line 88
    .line 89
    goto/16 :goto_6

    .line 90
    .line 91
    :cond_0
    invoke-direct {v0, v9, v2}, LY/B;->A(Ljava/lang/Object;Z)V

    .line 92
    .line 93
    .line 94
    iget-object v10, v0, LY/B;->j:Lt/P;

    .line 95
    .line 96
    invoke-virtual {v10, v9}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    if-eqz v9, :cond_5

    .line 101
    .line 102
    instance-of v10, v9, Lt/Q;

    .line 103
    .line 104
    if-eqz v10, :cond_4

    .line 105
    .line 106
    check-cast v9, Lt/Q;

    .line 107
    .line 108
    iget-object v10, v9, Lt/e0;->b:[Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v9, v9, Lt/e0;->a:[J

    .line 111
    .line 112
    array-length v11, v9

    .line 113
    add-int/lit8 v11, v11, -0x2

    .line 114
    .line 115
    if-ltz v11, :cond_5

    .line 116
    .line 117
    move-wide/from16 v25, v5

    .line 118
    .line 119
    const/4 v12, 0x0

    .line 120
    :goto_2
    aget-wide v4, v9, v12

    .line 121
    .line 122
    move v6, v13

    .line 123
    move/from16 p1, v14

    .line 124
    .line 125
    not-long v13, v4

    .line 126
    shl-long v13, v13, v21

    .line 127
    .line 128
    and-long/2addr v13, v4

    .line 129
    and-long v13, v13, v22

    .line 130
    .line 131
    cmp-long v13, v13, v22

    .line 132
    .line 133
    if-eqz v13, :cond_3

    .line 134
    .line 135
    sub-int v13, v12, v11

    .line 136
    .line 137
    not-int v13, v13

    .line 138
    ushr-int/lit8 v13, v13, 0x1f

    .line 139
    .line 140
    rsub-int/lit8 v13, v13, 0x8

    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    :goto_3
    if-ge v14, v13, :cond_2

    .line 144
    .line 145
    and-long v27, v4, v18

    .line 146
    .line 147
    cmp-long v27, v27, v16

    .line 148
    .line 149
    if-gez v27, :cond_1

    .line 150
    .line 151
    shl-int/lit8 v27, v12, 0x3

    .line 152
    .line 153
    add-int v27, v27, v14

    .line 154
    .line 155
    aget-object v27, v10, v27

    .line 156
    .line 157
    move/from16 v28, v6

    .line 158
    .line 159
    move-object/from16 v6, v27

    .line 160
    .line 161
    check-cast v6, LY/U;

    .line 162
    .line 163
    invoke-direct {v0, v6, v2}, LY/B;->A(Ljava/lang/Object;Z)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_1
    move/from16 v28, v6

    .line 168
    .line 169
    :goto_4
    shr-long v4, v4, v28

    .line 170
    .line 171
    add-int/lit8 v14, v14, 0x1

    .line 172
    .line 173
    move/from16 v6, v28

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_2
    if-ne v13, v6, :cond_6

    .line 177
    .line 178
    :cond_3
    if-eq v12, v11, :cond_6

    .line 179
    .line 180
    add-int/lit8 v12, v12, 0x1

    .line 181
    .line 182
    move/from16 v14, p1

    .line 183
    .line 184
    const/16 v13, 0x8

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_4
    move-wide/from16 v25, v5

    .line 188
    .line 189
    move/from16 p1, v14

    .line 190
    .line 191
    check-cast v9, LY/U;

    .line 192
    .line 193
    invoke-direct {v0, v9, v2}, LY/B;->A(Ljava/lang/Object;Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_5
    move-wide/from16 v25, v5

    .line 198
    .line 199
    move/from16 p1, v14

    .line 200
    .line 201
    :cond_6
    :goto_5
    sget-object v4, LTd/L;->a:LTd/L;

    .line 202
    .line 203
    :goto_6
    const/16 v6, 0x8

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_7
    move-wide/from16 v25, v5

    .line 207
    .line 208
    move/from16 v21, v9

    .line 209
    .line 210
    move-wide/from16 v22, v10

    .line 211
    .line 212
    move/from16 p1, v14

    .line 213
    .line 214
    move v6, v13

    .line 215
    :goto_7
    shr-long v4, v25, v6

    .line 216
    .line 217
    add-int/lit8 v8, v8, 0x1

    .line 218
    .line 219
    move/from16 v14, p1

    .line 220
    .line 221
    move v13, v6

    .line 222
    move/from16 v9, v21

    .line 223
    .line 224
    move-wide/from16 v10, v22

    .line 225
    .line 226
    move-wide v5, v4

    .line 227
    const/4 v4, 0x0

    .line 228
    goto/16 :goto_1

    .line 229
    .line 230
    :cond_8
    move/from16 v21, v9

    .line 231
    .line 232
    move-wide/from16 v22, v10

    .line 233
    .line 234
    move v6, v13

    .line 235
    move/from16 p1, v14

    .line 236
    .line 237
    if-ne v7, v6, :cond_12

    .line 238
    .line 239
    move/from16 v14, p1

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_9
    move/from16 v21, v9

    .line 243
    .line 244
    move-wide/from16 v22, v10

    .line 245
    .line 246
    :goto_8
    if-eq v15, v14, :cond_12

    .line 247
    .line 248
    add-int/lit8 v15, v15, 0x1

    .line 249
    .line 250
    move/from16 v9, v21

    .line 251
    .line 252
    move-wide/from16 v10, v22

    .line 253
    .line 254
    const/4 v4, 0x0

    .line 255
    const/16 v13, 0x8

    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_a
    move/from16 v21, v9

    .line 260
    .line 261
    move-wide/from16 v22, v10

    .line 262
    .line 263
    const-wide/16 v16, 0x80

    .line 264
    .line 265
    const-wide/16 v18, 0xff

    .line 266
    .line 267
    goto/16 :goto_c

    .line 268
    .line 269
    :cond_b
    move/from16 v21, v9

    .line 270
    .line 271
    move-wide/from16 v22, v10

    .line 272
    .line 273
    const-wide/16 v16, 0x80

    .line 274
    .line 275
    const-wide/16 v18, 0xff

    .line 276
    .line 277
    check-cast v1, Ljava/lang/Iterable;

    .line 278
    .line 279
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    if-eqz v3, :cond_12

    .line 288
    .line 289
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    instance-of v4, v3, LY/f1;

    .line 294
    .line 295
    if-eqz v4, :cond_c

    .line 296
    .line 297
    check-cast v3, LY/f1;

    .line 298
    .line 299
    const/4 v4, 0x0

    .line 300
    invoke-virtual {v3, v4}, LY/f1;->v(Ljava/lang/Object;)LY/l0;

    .line 301
    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_c
    const/4 v4, 0x0

    .line 305
    invoke-direct {v0, v3, v2}, LY/B;->A(Ljava/lang/Object;Z)V

    .line 306
    .line 307
    .line 308
    iget-object v5, v0, LY/B;->j:Lt/P;

    .line 309
    .line 310
    invoke-virtual {v5, v3}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    if-eqz v3, :cond_11

    .line 315
    .line 316
    instance-of v5, v3, Lt/Q;

    .line 317
    .line 318
    if-eqz v5, :cond_10

    .line 319
    .line 320
    check-cast v3, Lt/Q;

    .line 321
    .line 322
    iget-object v5, v3, Lt/e0;->b:[Ljava/lang/Object;

    .line 323
    .line 324
    iget-object v3, v3, Lt/e0;->a:[J

    .line 325
    .line 326
    array-length v7, v3

    .line 327
    add-int/lit8 v7, v7, -0x2

    .line 328
    .line 329
    if-ltz v7, :cond_11

    .line 330
    .line 331
    const/4 v8, 0x0

    .line 332
    :goto_a
    aget-wide v9, v3, v8

    .line 333
    .line 334
    not-long v11, v9

    .line 335
    shl-long v11, v11, v21

    .line 336
    .line 337
    and-long/2addr v11, v9

    .line 338
    and-long v11, v11, v22

    .line 339
    .line 340
    cmp-long v11, v11, v22

    .line 341
    .line 342
    if-eqz v11, :cond_f

    .line 343
    .line 344
    sub-int v11, v8, v7

    .line 345
    .line 346
    not-int v11, v11

    .line 347
    ushr-int/lit8 v11, v11, 0x1f

    .line 348
    .line 349
    const/16 v6, 0x8

    .line 350
    .line 351
    rsub-int/lit8 v13, v11, 0x8

    .line 352
    .line 353
    const/4 v11, 0x0

    .line 354
    :goto_b
    if-ge v11, v13, :cond_e

    .line 355
    .line 356
    and-long v14, v9, v18

    .line 357
    .line 358
    cmp-long v12, v14, v16

    .line 359
    .line 360
    if-gez v12, :cond_d

    .line 361
    .line 362
    shl-int/lit8 v12, v8, 0x3

    .line 363
    .line 364
    add-int/2addr v12, v11

    .line 365
    aget-object v12, v5, v12

    .line 366
    .line 367
    check-cast v12, LY/U;

    .line 368
    .line 369
    invoke-direct {v0, v12, v2}, LY/B;->A(Ljava/lang/Object;Z)V

    .line 370
    .line 371
    .line 372
    :cond_d
    const/16 v6, 0x8

    .line 373
    .line 374
    shr-long/2addr v9, v6

    .line 375
    add-int/lit8 v11, v11, 0x1

    .line 376
    .line 377
    goto :goto_b

    .line 378
    :cond_e
    const/16 v6, 0x8

    .line 379
    .line 380
    if-ne v13, v6, :cond_11

    .line 381
    .line 382
    :cond_f
    if-eq v8, v7, :cond_11

    .line 383
    .line 384
    add-int/lit8 v8, v8, 0x1

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_10
    check-cast v3, LY/U;

    .line 388
    .line 389
    invoke-direct {v0, v3, v2}, LY/B;->A(Ljava/lang/Object;Z)V

    .line 390
    .line 391
    .line 392
    :cond_11
    sget-object v3, LTd/L;->a:LTd/L;

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_12
    :goto_c
    iget-object v1, v0, LY/B;->i:Lt/Q;

    .line 396
    .line 397
    iget-object v3, v0, LY/B;->h:Lt/Q;

    .line 398
    .line 399
    const-string v4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    .line 400
    .line 401
    const-string v5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    .line 402
    .line 403
    if-eqz v2, :cond_22

    .line 404
    .line 405
    invoke-virtual {v1}, Lt/e0;->e()Z

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    if-eqz v2, :cond_22

    .line 410
    .line 411
    iget-object v2, v0, LY/B;->g:Lt/P;

    .line 412
    .line 413
    iget-object v8, v2, Lt/c0;->a:[J

    .line 414
    .line 415
    array-length v9, v8

    .line 416
    add-int/lit8 v9, v9, -0x2

    .line 417
    .line 418
    if-ltz v9, :cond_21

    .line 419
    .line 420
    const/4 v10, 0x0

    .line 421
    :goto_d
    aget-wide v11, v8, v10

    .line 422
    .line 423
    not-long v13, v11

    .line 424
    shl-long v13, v13, v21

    .line 425
    .line 426
    and-long/2addr v13, v11

    .line 427
    and-long v13, v13, v22

    .line 428
    .line 429
    cmp-long v13, v13, v22

    .line 430
    .line 431
    if-eqz v13, :cond_20

    .line 432
    .line 433
    sub-int v13, v10, v9

    .line 434
    .line 435
    not-int v13, v13

    .line 436
    ushr-int/lit8 v13, v13, 0x1f

    .line 437
    .line 438
    const/16 v6, 0x8

    .line 439
    .line 440
    rsub-int/lit8 v13, v13, 0x8

    .line 441
    .line 442
    const/4 v14, 0x0

    .line 443
    :goto_e
    if-ge v14, v13, :cond_1f

    .line 444
    .line 445
    and-long v24, v11, v18

    .line 446
    .line 447
    cmp-long v15, v24, v16

    .line 448
    .line 449
    if-gez v15, :cond_1e

    .line 450
    .line 451
    shl-int/lit8 v15, v10, 0x3

    .line 452
    .line 453
    add-int/2addr v15, v14

    .line 454
    iget-object v6, v2, Lt/c0;->b:[Ljava/lang/Object;

    .line 455
    .line 456
    aget-object v6, v6, v15

    .line 457
    .line 458
    iget-object v6, v2, Lt/c0;->c:[Ljava/lang/Object;

    .line 459
    .line 460
    aget-object v6, v6, v15

    .line 461
    .line 462
    instance-of v7, v6, Lt/Q;

    .line 463
    .line 464
    if-eqz v7, :cond_1a

    .line 465
    .line 466
    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    move-object v7, v6

    .line 470
    check-cast v7, Lt/Q;

    .line 471
    .line 472
    iget-object v6, v7, Lt/e0;->b:[Ljava/lang/Object;

    .line 473
    .line 474
    move-object/from16 v24, v6

    .line 475
    .line 476
    iget-object v6, v7, Lt/e0;->a:[J

    .line 477
    .line 478
    move-object/from16 v25, v8

    .line 479
    .line 480
    array-length v8, v6

    .line 481
    add-int/lit8 v8, v8, -0x2

    .line 482
    .line 483
    if-ltz v8, :cond_18

    .line 484
    .line 485
    move-object/from16 v26, v6

    .line 486
    .line 487
    move-wide/from16 v29, v11

    .line 488
    .line 489
    const/4 v6, 0x0

    .line 490
    :goto_f
    aget-wide v11, v26, v6

    .line 491
    .line 492
    move/from16 p2, v9

    .line 493
    .line 494
    move/from16 v27, v10

    .line 495
    .line 496
    not-long v9, v11

    .line 497
    shl-long v9, v9, v21

    .line 498
    .line 499
    and-long/2addr v9, v11

    .line 500
    and-long v9, v9, v22

    .line 501
    .line 502
    cmp-long v9, v9, v22

    .line 503
    .line 504
    if-eqz v9, :cond_17

    .line 505
    .line 506
    sub-int v9, v6, v8

    .line 507
    .line 508
    not-int v9, v9

    .line 509
    ushr-int/lit8 v9, v9, 0x1f

    .line 510
    .line 511
    const/16 v28, 0x8

    .line 512
    .line 513
    rsub-int/lit8 v9, v9, 0x8

    .line 514
    .line 515
    const/4 v10, 0x0

    .line 516
    :goto_10
    if-ge v10, v9, :cond_16

    .line 517
    .line 518
    and-long v31, v11, v18

    .line 519
    .line 520
    cmp-long v31, v31, v16

    .line 521
    .line 522
    if-gez v31, :cond_15

    .line 523
    .line 524
    shl-int/lit8 v31, v6, 0x3

    .line 525
    .line 526
    move/from16 v32, v10

    .line 527
    .line 528
    add-int v10, v31, v32

    .line 529
    .line 530
    aget-object v31, v24, v10

    .line 531
    .line 532
    move-wide/from16 v33, v11

    .line 533
    .line 534
    move-object/from16 v11, v31

    .line 535
    .line 536
    check-cast v11, LY/f1;

    .line 537
    .line 538
    invoke-virtual {v1, v11}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v12

    .line 542
    if-nez v12, :cond_13

    .line 543
    .line 544
    invoke-virtual {v3, v11}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v11

    .line 548
    if-eqz v11, :cond_14

    .line 549
    .line 550
    :cond_13
    invoke-virtual {v7, v10}, Lt/Q;->A(I)V

    .line 551
    .line 552
    .line 553
    :cond_14
    :goto_11
    const/16 v10, 0x8

    .line 554
    .line 555
    goto :goto_12

    .line 556
    :cond_15
    move/from16 v32, v10

    .line 557
    .line 558
    move-wide/from16 v33, v11

    .line 559
    .line 560
    goto :goto_11

    .line 561
    :goto_12
    shr-long v11, v33, v10

    .line 562
    .line 563
    add-int/lit8 v28, v32, 0x1

    .line 564
    .line 565
    move/from16 v10, v28

    .line 566
    .line 567
    goto :goto_10

    .line 568
    :cond_16
    const/16 v10, 0x8

    .line 569
    .line 570
    if-ne v9, v10, :cond_19

    .line 571
    .line 572
    :cond_17
    if-eq v6, v8, :cond_19

    .line 573
    .line 574
    add-int/lit8 v6, v6, 0x1

    .line 575
    .line 576
    move/from16 v9, p2

    .line 577
    .line 578
    move/from16 v10, v27

    .line 579
    .line 580
    goto :goto_f

    .line 581
    :cond_18
    move/from16 p2, v9

    .line 582
    .line 583
    move/from16 v27, v10

    .line 584
    .line 585
    move-wide/from16 v29, v11

    .line 586
    .line 587
    :cond_19
    invoke-virtual {v7}, Lt/e0;->d()Z

    .line 588
    .line 589
    .line 590
    move-result v6

    .line 591
    goto :goto_14

    .line 592
    :cond_1a
    move-object/from16 v25, v8

    .line 593
    .line 594
    move/from16 p2, v9

    .line 595
    .line 596
    move/from16 v27, v10

    .line 597
    .line 598
    move-wide/from16 v29, v11

    .line 599
    .line 600
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    check-cast v6, LY/f1;

    .line 604
    .line 605
    invoke-virtual {v1, v6}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v7

    .line 609
    if-nez v7, :cond_1c

    .line 610
    .line 611
    invoke-virtual {v3, v6}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    if-eqz v6, :cond_1b

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :cond_1b
    const/4 v6, 0x0

    .line 619
    goto :goto_14

    .line 620
    :cond_1c
    :goto_13
    const/4 v6, 0x1

    .line 621
    :goto_14
    if-eqz v6, :cond_1d

    .line 622
    .line 623
    invoke-virtual {v2, v15}, Lt/P;->v(I)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    :cond_1d
    :goto_15
    const/16 v6, 0x8

    .line 627
    .line 628
    goto :goto_16

    .line 629
    :cond_1e
    move-object/from16 v25, v8

    .line 630
    .line 631
    move/from16 p2, v9

    .line 632
    .line 633
    move/from16 v27, v10

    .line 634
    .line 635
    move-wide/from16 v29, v11

    .line 636
    .line 637
    goto :goto_15

    .line 638
    :goto_16
    shr-long v11, v29, v6

    .line 639
    .line 640
    add-int/lit8 v14, v14, 0x1

    .line 641
    .line 642
    move/from16 v9, p2

    .line 643
    .line 644
    move-object/from16 v8, v25

    .line 645
    .line 646
    move/from16 v10, v27

    .line 647
    .line 648
    goto/16 :goto_e

    .line 649
    .line 650
    :cond_1f
    move-object/from16 v25, v8

    .line 651
    .line 652
    move/from16 p2, v9

    .line 653
    .line 654
    move/from16 v27, v10

    .line 655
    .line 656
    const/16 v6, 0x8

    .line 657
    .line 658
    if-ne v13, v6, :cond_21

    .line 659
    .line 660
    move/from16 v9, p2

    .line 661
    .line 662
    move/from16 v7, v27

    .line 663
    .line 664
    goto :goto_17

    .line 665
    :cond_20
    move-object/from16 v25, v8

    .line 666
    .line 667
    move v7, v10

    .line 668
    :goto_17
    if-eq v7, v9, :cond_21

    .line 669
    .line 670
    add-int/lit8 v10, v7, 0x1

    .line 671
    .line 672
    move-object/from16 v8, v25

    .line 673
    .line 674
    goto/16 :goto_d

    .line 675
    .line 676
    :cond_21
    invoke-virtual {v1}, Lt/Q;->m()V

    .line 677
    .line 678
    .line 679
    invoke-direct {v0}, LY/B;->D()V

    .line 680
    .line 681
    .line 682
    return-void

    .line 683
    :cond_22
    invoke-virtual {v3}, Lt/e0;->e()Z

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    if-eqz v1, :cond_31

    .line 688
    .line 689
    iget-object v1, v0, LY/B;->g:Lt/P;

    .line 690
    .line 691
    iget-object v2, v1, Lt/c0;->a:[J

    .line 692
    .line 693
    array-length v7, v2

    .line 694
    add-int/lit8 v7, v7, -0x2

    .line 695
    .line 696
    if-ltz v7, :cond_30

    .line 697
    .line 698
    const/4 v8, 0x0

    .line 699
    :goto_18
    aget-wide v9, v2, v8

    .line 700
    .line 701
    not-long v11, v9

    .line 702
    shl-long v11, v11, v21

    .line 703
    .line 704
    and-long/2addr v11, v9

    .line 705
    and-long v11, v11, v22

    .line 706
    .line 707
    cmp-long v11, v11, v22

    .line 708
    .line 709
    if-eqz v11, :cond_2f

    .line 710
    .line 711
    sub-int v11, v8, v7

    .line 712
    .line 713
    not-int v11, v11

    .line 714
    ushr-int/lit8 v11, v11, 0x1f

    .line 715
    .line 716
    const/16 v6, 0x8

    .line 717
    .line 718
    rsub-int/lit8 v13, v11, 0x8

    .line 719
    .line 720
    const/4 v11, 0x0

    .line 721
    :goto_19
    if-ge v11, v13, :cond_2e

    .line 722
    .line 723
    and-long v14, v9, v18

    .line 724
    .line 725
    cmp-long v12, v14, v16

    .line 726
    .line 727
    if-gez v12, :cond_23

    .line 728
    .line 729
    const/4 v12, 0x1

    .line 730
    goto :goto_1a

    .line 731
    :cond_23
    const/4 v12, 0x0

    .line 732
    :goto_1a
    if-eqz v12, :cond_2d

    .line 733
    .line 734
    shl-int/lit8 v12, v8, 0x3

    .line 735
    .line 736
    add-int/2addr v12, v11

    .line 737
    iget-object v14, v1, Lt/c0;->b:[Ljava/lang/Object;

    .line 738
    .line 739
    aget-object v14, v14, v12

    .line 740
    .line 741
    iget-object v14, v1, Lt/c0;->c:[Ljava/lang/Object;

    .line 742
    .line 743
    aget-object v14, v14, v12

    .line 744
    .line 745
    instance-of v15, v14, Lt/Q;

    .line 746
    .line 747
    if-eqz v15, :cond_2b

    .line 748
    .line 749
    invoke-static {v14, v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    check-cast v14, Lt/Q;

    .line 753
    .line 754
    iget-object v15, v14, Lt/e0;->b:[Ljava/lang/Object;

    .line 755
    .line 756
    iget-object v6, v14, Lt/e0;->a:[J

    .line 757
    .line 758
    array-length v0, v6

    .line 759
    add-int/lit8 v0, v0, -0x2

    .line 760
    .line 761
    move-object/from16 v24, v2

    .line 762
    .line 763
    move-object/from16 v25, v5

    .line 764
    .line 765
    if-ltz v0, :cond_29

    .line 766
    .line 767
    move-object/from16 v26, v6

    .line 768
    .line 769
    const/4 v2, 0x0

    .line 770
    :goto_1b
    aget-wide v5, v26, v2

    .line 771
    .line 772
    move-wide/from16 v29, v9

    .line 773
    .line 774
    not-long v9, v5

    .line 775
    shl-long v9, v9, v21

    .line 776
    .line 777
    and-long/2addr v9, v5

    .line 778
    and-long v9, v9, v22

    .line 779
    .line 780
    cmp-long v9, v9, v22

    .line 781
    .line 782
    if-eqz v9, :cond_28

    .line 783
    .line 784
    sub-int v9, v2, v0

    .line 785
    .line 786
    not-int v9, v9

    .line 787
    ushr-int/lit8 v9, v9, 0x1f

    .line 788
    .line 789
    const/16 v28, 0x8

    .line 790
    .line 791
    rsub-int/lit8 v9, v9, 0x8

    .line 792
    .line 793
    const/4 v10, 0x0

    .line 794
    :goto_1c
    if-ge v10, v9, :cond_27

    .line 795
    .line 796
    and-long v31, v5, v18

    .line 797
    .line 798
    cmp-long v27, v31, v16

    .line 799
    .line 800
    if-gez v27, :cond_24

    .line 801
    .line 802
    const/16 v27, 0x1

    .line 803
    .line 804
    goto :goto_1d

    .line 805
    :cond_24
    const/16 v27, 0x0

    .line 806
    .line 807
    :goto_1d
    if-eqz v27, :cond_26

    .line 808
    .line 809
    shl-int/lit8 v27, v2, 0x3

    .line 810
    .line 811
    move-wide/from16 v31, v5

    .line 812
    .line 813
    add-int v5, v27, v10

    .line 814
    .line 815
    aget-object v6, v15, v5

    .line 816
    .line 817
    check-cast v6, LY/f1;

    .line 818
    .line 819
    invoke-virtual {v3, v6}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v6

    .line 823
    if-eqz v6, :cond_25

    .line 824
    .line 825
    invoke-virtual {v14, v5}, Lt/Q;->A(I)V

    .line 826
    .line 827
    .line 828
    :cond_25
    :goto_1e
    const/16 v6, 0x8

    .line 829
    .line 830
    goto :goto_1f

    .line 831
    :cond_26
    move-wide/from16 v31, v5

    .line 832
    .line 833
    goto :goto_1e

    .line 834
    :goto_1f
    shr-long v27, v31, v6

    .line 835
    .line 836
    add-int/lit8 v10, v10, 0x1

    .line 837
    .line 838
    move-wide/from16 v5, v27

    .line 839
    .line 840
    goto :goto_1c

    .line 841
    :cond_27
    const/16 v6, 0x8

    .line 842
    .line 843
    if-ne v9, v6, :cond_2a

    .line 844
    .line 845
    :cond_28
    if-eq v2, v0, :cond_2a

    .line 846
    .line 847
    add-int/lit8 v2, v2, 0x1

    .line 848
    .line 849
    move-wide/from16 v9, v29

    .line 850
    .line 851
    goto :goto_1b

    .line 852
    :cond_29
    move-wide/from16 v29, v9

    .line 853
    .line 854
    :cond_2a
    invoke-virtual {v14}, Lt/e0;->d()Z

    .line 855
    .line 856
    .line 857
    move-result v0

    .line 858
    goto :goto_20

    .line 859
    :cond_2b
    move-object/from16 v24, v2

    .line 860
    .line 861
    move-object/from16 v25, v5

    .line 862
    .line 863
    move-wide/from16 v29, v9

    .line 864
    .line 865
    invoke-static {v14, v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    check-cast v14, LY/f1;

    .line 869
    .line 870
    invoke-virtual {v3, v14}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    :goto_20
    if-eqz v0, :cond_2c

    .line 875
    .line 876
    invoke-virtual {v1, v12}, Lt/P;->v(I)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    :cond_2c
    :goto_21
    const/16 v6, 0x8

    .line 880
    .line 881
    goto :goto_22

    .line 882
    :cond_2d
    move-object/from16 v24, v2

    .line 883
    .line 884
    move-object/from16 v25, v5

    .line 885
    .line 886
    move-wide/from16 v29, v9

    .line 887
    .line 888
    goto :goto_21

    .line 889
    :goto_22
    shr-long v9, v29, v6

    .line 890
    .line 891
    add-int/lit8 v11, v11, 0x1

    .line 892
    .line 893
    move-object/from16 v0, p0

    .line 894
    .line 895
    move-object/from16 v2, v24

    .line 896
    .line 897
    move-object/from16 v5, v25

    .line 898
    .line 899
    goto/16 :goto_19

    .line 900
    .line 901
    :cond_2e
    move-object/from16 v24, v2

    .line 902
    .line 903
    move-object/from16 v25, v5

    .line 904
    .line 905
    const/16 v6, 0x8

    .line 906
    .line 907
    if-ne v13, v6, :cond_30

    .line 908
    .line 909
    goto :goto_23

    .line 910
    :cond_2f
    move-object/from16 v24, v2

    .line 911
    .line 912
    move-object/from16 v25, v5

    .line 913
    .line 914
    const/16 v6, 0x8

    .line 915
    .line 916
    :goto_23
    if-eq v8, v7, :cond_30

    .line 917
    .line 918
    add-int/lit8 v8, v8, 0x1

    .line 919
    .line 920
    move-object/from16 v0, p0

    .line 921
    .line 922
    move-object/from16 v2, v24

    .line 923
    .line 924
    move-object/from16 v5, v25

    .line 925
    .line 926
    goto/16 :goto_18

    .line 927
    .line 928
    :cond_30
    invoke-direct/range {p0 .. p0}, LY/B;->D()V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v3}, Lt/Q;->m()V

    .line 932
    .line 933
    .line 934
    :cond_31
    return-void
.end method

.method private final C(LZ/a;)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LY/B;->u:Lg0/q;

    .line 4
    .line 5
    iget-object v2, v1, LY/B;->e:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v3, v1, LY/B;->v:LY/s;

    .line 8
    .line 9
    invoke-virtual {v3}, LY/s;->K0()Lk0/h;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v0, v2, v3}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual/range {p1 .. p1}, LZ/a;->c()Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :try_start_1
    iget-object v0, v1, LY/B;->l:LZ/a;

    .line 23
    .line 24
    invoke-virtual {v0}, LZ/a;->c()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, v1, LY/B;->q:LY/R0;

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, v1, LY/B;->u:Lg0/q;

    .line 35
    .line 36
    invoke-virtual {v0}, Lg0/q;->j()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    iget-object v0, v1, LY/B;->u:Lg0/q;

    .line 43
    .line 44
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_1
    iget-object v2, v1, LY/B;->u:Lg0/q;

    .line 49
    .line 50
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    :try_start_2
    const-string v0, "Compose:applyChanges"

    .line 55
    .line 56
    sget-object v2, Lg0/x;->a:Lg0/x;

    .line 57
    .line 58
    invoke-virtual {v2, v0}, Lg0/x;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 62
    :try_start_3
    iget-object v0, v1, LY/B;->q:LY/R0;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, LY/R0;->c()LY/r1;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    goto/16 :goto_e

    .line 75
    .line 76
    :cond_2
    iget-object v0, v1, LY/B;->b:LY/d;

    .line 77
    .line 78
    :goto_2
    iget-object v4, v1, LY/B;->q:LY/R0;

    .line 79
    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4}, LY/R0;->d()Lg0/q;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    if-nez v4, :cond_4

    .line 87
    .line 88
    :cond_3
    iget-object v4, v1, LY/B;->u:Lg0/q;

    .line 89
    .line 90
    :cond_4
    invoke-interface {v0}, LY/d;->j()V

    .line 91
    .line 92
    .line 93
    iget-object v5, v1, LY/B;->f:LY/E1;

    .line 94
    .line 95
    invoke-virtual {v5}, LY/E1;->G()LY/H1;

    .line 96
    .line 97
    .line 98
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    const/4 v6, 0x0

    .line 100
    :try_start_4
    iget-object v7, v1, LY/B;->v:LY/s;

    .line 101
    .line 102
    invoke-virtual {v7}, LY/s;->K0()Lk0/h;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    move-object/from16 v8, p1

    .line 107
    .line 108
    invoke-virtual {v8, v0, v5, v4, v7}, LZ/a;->b(LY/d;LY/H1;LY/u1;LZ/f;)V

    .line 109
    .line 110
    .line 111
    sget-object v4, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 112
    .line 113
    const/4 v4, 0x1

    .line 114
    :try_start_5
    invoke-virtual {v5, v4}, LY/H1;->J(Z)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v0}, LY/d;->f()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 118
    .line 119
    .line 120
    :try_start_6
    invoke-virtual {v2, v3}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v1, LY/B;->u:Lg0/q;

    .line 124
    .line 125
    invoke-virtual {v0}, Lg0/q;->m()V

    .line 126
    .line 127
    .line 128
    iget-object v0, v1, LY/B;->u:Lg0/q;

    .line 129
    .line 130
    invoke-virtual {v0}, Lg0/q;->n()V

    .line 131
    .line 132
    .line 133
    iget-boolean v0, v1, LY/B;->o:Z

    .line 134
    .line 135
    if-eqz v0, :cond_12

    .line 136
    .line 137
    const-string v0, "Compose:unobserve"

    .line 138
    .line 139
    invoke-virtual {v2, v0}, Lg0/x;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 143
    :try_start_7
    iput-boolean v6, v1, LY/B;->o:Z

    .line 144
    .line 145
    iget-object v0, v1, LY/B;->g:Lt/P;

    .line 146
    .line 147
    iget-object v3, v0, Lt/c0;->a:[J

    .line 148
    .line 149
    array-length v5, v3

    .line 150
    add-int/lit8 v5, v5, -0x2

    .line 151
    .line 152
    if-ltz v5, :cond_11

    .line 153
    .line 154
    move v7, v6

    .line 155
    :goto_3
    aget-wide v8, v3, v7

    .line 156
    .line 157
    not-long v10, v8

    .line 158
    const/4 v12, 0x7

    .line 159
    shl-long/2addr v10, v12

    .line 160
    and-long/2addr v10, v8

    .line 161
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    and-long/2addr v10, v13

    .line 167
    cmp-long v10, v10, v13

    .line 168
    .line 169
    if-eqz v10, :cond_10

    .line 170
    .line 171
    sub-int v10, v7, v5

    .line 172
    .line 173
    not-int v10, v10

    .line 174
    ushr-int/lit8 v10, v10, 0x1f

    .line 175
    .line 176
    const/16 v11, 0x8

    .line 177
    .line 178
    rsub-int/lit8 v10, v10, 0x8

    .line 179
    .line 180
    move v15, v6

    .line 181
    :goto_4
    if-ge v15, v10, :cond_f

    .line 182
    .line 183
    const-wide/16 v16, 0xff

    .line 184
    .line 185
    and-long v18, v8, v16

    .line 186
    .line 187
    const-wide/16 v20, 0x80

    .line 188
    .line 189
    cmp-long v18, v18, v20

    .line 190
    .line 191
    if-gez v18, :cond_e

    .line 192
    .line 193
    shl-int/lit8 v18, v7, 0x3

    .line 194
    .line 195
    add-int v4, v18, v15

    .line 196
    .line 197
    move/from16 v18, v12

    .line 198
    .line 199
    iget-object v12, v0, Lt/c0;->b:[Ljava/lang/Object;

    .line 200
    .line 201
    aget-object v12, v12, v4

    .line 202
    .line 203
    iget-object v12, v0, Lt/c0;->c:[Ljava/lang/Object;

    .line 204
    .line 205
    aget-object v12, v12, v4

    .line 206
    .line 207
    move-wide/from16 v22, v13

    .line 208
    .line 209
    instance-of v13, v12, Lt/Q;

    .line 210
    .line 211
    if-eqz v13, :cond_b

    .line 212
    .line 213
    const-string v13, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    .line 214
    .line 215
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    check-cast v12, Lt/Q;

    .line 219
    .line 220
    iget-object v13, v12, Lt/e0;->b:[Ljava/lang/Object;

    .line 221
    .line 222
    iget-object v14, v12, Lt/e0;->a:[J

    .line 223
    .line 224
    array-length v6, v14

    .line 225
    add-int/lit8 v6, v6, -0x2

    .line 226
    .line 227
    if-ltz v6, :cond_9

    .line 228
    .line 229
    move-wide/from16 v25, v8

    .line 230
    .line 231
    move/from16 v24, v11

    .line 232
    .line 233
    const/4 v11, 0x0

    .line 234
    :goto_5
    aget-wide v8, v14, v11

    .line 235
    .line 236
    move-object/from16 v27, v13

    .line 237
    .line 238
    move-object/from16 v28, v14

    .line 239
    .line 240
    not-long v13, v8

    .line 241
    shl-long v13, v13, v18

    .line 242
    .line 243
    and-long/2addr v13, v8

    .line 244
    and-long v13, v13, v22

    .line 245
    .line 246
    cmp-long v13, v13, v22

    .line 247
    .line 248
    if-eqz v13, :cond_8

    .line 249
    .line 250
    sub-int v13, v11, v6

    .line 251
    .line 252
    not-int v13, v13

    .line 253
    ushr-int/lit8 v13, v13, 0x1f

    .line 254
    .line 255
    rsub-int/lit8 v13, v13, 0x8

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    :goto_6
    if-ge v14, v13, :cond_7

    .line 259
    .line 260
    and-long v29, v8, v16

    .line 261
    .line 262
    cmp-long v29, v29, v20

    .line 263
    .line 264
    if-gez v29, :cond_5

    .line 265
    .line 266
    shl-int/lit8 v29, v11, 0x3

    .line 267
    .line 268
    move-object/from16 v30, v3

    .line 269
    .line 270
    add-int v3, v29, v14

    .line 271
    .line 272
    aget-object v29, v27, v3

    .line 273
    .line 274
    check-cast v29, LY/f1;

    .line 275
    .line 276
    invoke-virtual/range {v29 .. v29}, LY/f1;->u()Z

    .line 277
    .line 278
    .line 279
    move-result v29

    .line 280
    if-nez v29, :cond_6

    .line 281
    .line 282
    invoke-virtual {v12, v3}, Lt/Q;->A(I)V

    .line 283
    .line 284
    .line 285
    goto :goto_7

    .line 286
    :catchall_2
    move-exception v0

    .line 287
    goto/16 :goto_c

    .line 288
    .line 289
    :cond_5
    move-object/from16 v30, v3

    .line 290
    .line 291
    :cond_6
    :goto_7
    shr-long v8, v8, v24

    .line 292
    .line 293
    add-int/lit8 v14, v14, 0x1

    .line 294
    .line 295
    move-object/from16 v3, v30

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_7
    move-object/from16 v30, v3

    .line 299
    .line 300
    move/from16 v3, v24

    .line 301
    .line 302
    if-ne v13, v3, :cond_a

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_8
    move-object/from16 v30, v3

    .line 306
    .line 307
    :goto_8
    if-eq v11, v6, :cond_a

    .line 308
    .line 309
    add-int/lit8 v11, v11, 0x1

    .line 310
    .line 311
    move-object/from16 v13, v27

    .line 312
    .line 313
    move-object/from16 v14, v28

    .line 314
    .line 315
    move-object/from16 v3, v30

    .line 316
    .line 317
    const/16 v24, 0x8

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_9
    move-object/from16 v30, v3

    .line 321
    .line 322
    move-wide/from16 v25, v8

    .line 323
    .line 324
    :cond_a
    invoke-virtual {v12}, Lt/e0;->d()Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    goto :goto_9

    .line 329
    :cond_b
    move-object/from16 v30, v3

    .line 330
    .line 331
    move-wide/from16 v25, v8

    .line 332
    .line 333
    const-string v3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    .line 334
    .line 335
    invoke-static {v12, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    check-cast v12, LY/f1;

    .line 339
    .line 340
    invoke-virtual {v12}, LY/f1;->u()Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-nez v3, :cond_c

    .line 345
    .line 346
    const/4 v3, 0x1

    .line 347
    goto :goto_9

    .line 348
    :cond_c
    const/4 v3, 0x0

    .line 349
    :goto_9
    if-eqz v3, :cond_d

    .line 350
    .line 351
    invoke-virtual {v0, v4}, Lt/P;->v(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    :cond_d
    const/16 v3, 0x8

    .line 355
    .line 356
    goto :goto_a

    .line 357
    :cond_e
    move-object/from16 v30, v3

    .line 358
    .line 359
    move-wide/from16 v25, v8

    .line 360
    .line 361
    move/from16 v18, v12

    .line 362
    .line 363
    move-wide/from16 v22, v13

    .line 364
    .line 365
    move v3, v11

    .line 366
    :goto_a
    shr-long v8, v25, v3

    .line 367
    .line 368
    add-int/lit8 v15, v15, 0x1

    .line 369
    .line 370
    move v11, v3

    .line 371
    move/from16 v12, v18

    .line 372
    .line 373
    move-wide/from16 v13, v22

    .line 374
    .line 375
    move-object/from16 v3, v30

    .line 376
    .line 377
    const/4 v4, 0x1

    .line 378
    const/4 v6, 0x0

    .line 379
    goto/16 :goto_4

    .line 380
    .line 381
    :cond_f
    move-object/from16 v30, v3

    .line 382
    .line 383
    move v3, v11

    .line 384
    if-ne v10, v3, :cond_11

    .line 385
    .line 386
    goto :goto_b

    .line 387
    :cond_10
    move-object/from16 v30, v3

    .line 388
    .line 389
    :goto_b
    if-eq v7, v5, :cond_11

    .line 390
    .line 391
    add-int/lit8 v7, v7, 0x1

    .line 392
    .line 393
    move-object/from16 v3, v30

    .line 394
    .line 395
    const/4 v4, 0x1

    .line 396
    const/4 v6, 0x0

    .line 397
    goto/16 :goto_3

    .line 398
    .line 399
    :cond_11
    invoke-direct {v1}, LY/B;->D()V

    .line 400
    .line 401
    .line 402
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 403
    .line 404
    :try_start_8
    sget-object v0, Lg0/x;->a:Lg0/x;

    .line 405
    .line 406
    invoke-virtual {v0, v2}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    goto :goto_d

    .line 410
    :catchall_3
    move-exception v0

    .line 411
    goto :goto_f

    .line 412
    :goto_c
    sget-object v3, Lg0/x;->a:Lg0/x;

    .line 413
    .line 414
    invoke-virtual {v3, v2}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 418
    :cond_12
    :goto_d
    :try_start_9
    iget-object v0, v1, LY/B;->l:LZ/a;

    .line 419
    .line 420
    invoke-virtual {v0}, LZ/a;->c()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-eqz v0, :cond_0

    .line 425
    .line 426
    iget-object v0, v1, LY/B;->q:LY/R0;

    .line 427
    .line 428
    if-nez v0, :cond_0

    .line 429
    .line 430
    iget-object v0, v1, LY/B;->u:Lg0/q;

    .line 431
    .line 432
    invoke-virtual {v0}, Lg0/q;->j()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 433
    .line 434
    .line 435
    goto/16 :goto_0

    .line 436
    .line 437
    :catchall_4
    move-exception v0

    .line 438
    iget-object v2, v1, LY/B;->u:Lg0/q;

    .line 439
    .line 440
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 441
    .line 442
    .line 443
    throw v0

    .line 444
    :catchall_5
    move-exception v0

    .line 445
    const/4 v2, 0x0

    .line 446
    :try_start_a
    invoke-virtual {v5, v2}, LY/H1;->J(Z)V

    .line 447
    .line 448
    .line 449
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 450
    :goto_e
    :try_start_b
    sget-object v2, Lg0/x;->a:Lg0/x;

    .line 451
    .line 452
    invoke-virtual {v2, v3}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 456
    :goto_f
    :try_start_c
    iget-object v2, v1, LY/B;->l:LZ/a;

    .line 457
    .line 458
    invoke-virtual {v2}, LZ/a;->c()Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    if-eqz v2, :cond_13

    .line 463
    .line 464
    iget-object v2, v1, LY/B;->q:LY/R0;

    .line 465
    .line 466
    if-nez v2, :cond_13

    .line 467
    .line 468
    iget-object v2, v1, LY/B;->u:Lg0/q;

    .line 469
    .line 470
    invoke-virtual {v2}, Lg0/q;->j()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 471
    .line 472
    .line 473
    goto :goto_10

    .line 474
    :catchall_6
    move-exception v0

    .line 475
    goto :goto_11

    .line 476
    :cond_13
    :goto_10
    iget-object v2, v1, LY/B;->u:Lg0/q;

    .line 477
    .line 478
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 479
    .line 480
    .line 481
    throw v0

    .line 482
    :goto_11
    iget-object v2, v1, LY/B;->u:Lg0/q;

    .line 483
    .line 484
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 485
    .line 486
    .line 487
    throw v0
.end method

.method private final D()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LY/B;->j:Lt/P;

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
    const/4 v8, 0x7

    .line 11
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/16 v12, 0x8

    .line 17
    .line 18
    if-ltz v3, :cond_c

    .line 19
    .line 20
    const/4 v14, 0x0

    .line 21
    const-wide/16 v15, 0x80

    .line 22
    .line 23
    :goto_0
    aget-wide v4, v2, v14

    .line 24
    .line 25
    const-wide/16 v17, 0xff

    .line 26
    .line 27
    not-long v6, v4

    .line 28
    shl-long/2addr v6, v8

    .line 29
    and-long/2addr v6, v4

    .line 30
    and-long/2addr v6, v9

    .line 31
    cmp-long v6, v6, v9

    .line 32
    .line 33
    if-eqz v6, :cond_b

    .line 34
    .line 35
    sub-int v6, v14, v3

    .line 36
    .line 37
    not-int v6, v6

    .line 38
    ushr-int/lit8 v6, v6, 0x1f

    .line 39
    .line 40
    rsub-int/lit8 v6, v6, 0x8

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    :goto_1
    if-ge v7, v6, :cond_a

    .line 44
    .line 45
    and-long v19, v4, v17

    .line 46
    .line 47
    cmp-long v19, v19, v15

    .line 48
    .line 49
    if-gez v19, :cond_9

    .line 50
    .line 51
    shl-int/lit8 v19, v14, 0x3

    .line 52
    .line 53
    move/from16 v20, v8

    .line 54
    .line 55
    add-int v8, v19, v7

    .line 56
    .line 57
    move-wide/from16 v21, v9

    .line 58
    .line 59
    iget-object v9, v1, Lt/c0;->b:[Ljava/lang/Object;

    .line 60
    .line 61
    aget-object v9, v9, v8

    .line 62
    .line 63
    iget-object v9, v1, Lt/c0;->c:[Ljava/lang/Object;

    .line 64
    .line 65
    aget-object v9, v9, v8

    .line 66
    .line 67
    instance-of v10, v9, Lt/Q;

    .line 68
    .line 69
    if-eqz v10, :cond_6

    .line 70
    .line 71
    const-string v10, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    .line 72
    .line 73
    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    check-cast v9, Lt/Q;

    .line 77
    .line 78
    iget-object v10, v9, Lt/e0;->b:[Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v11, v9, Lt/e0;->a:[J

    .line 81
    .line 82
    array-length v13, v11

    .line 83
    add-int/lit8 v13, v13, -0x2

    .line 84
    .line 85
    if-ltz v13, :cond_4

    .line 86
    .line 87
    move-wide/from16 v23, v15

    .line 88
    .line 89
    const/4 v15, 0x0

    .line 90
    move/from16 v16, v12

    .line 91
    .line 92
    :goto_2
    move/from16 v25, v13

    .line 93
    .line 94
    aget-wide v12, v11, v15

    .line 95
    .line 96
    move-wide/from16 v26, v4

    .line 97
    .line 98
    not-long v4, v12

    .line 99
    shl-long v4, v4, v20

    .line 100
    .line 101
    and-long/2addr v4, v12

    .line 102
    and-long v4, v4, v21

    .line 103
    .line 104
    cmp-long v4, v4, v21

    .line 105
    .line 106
    if-eqz v4, :cond_3

    .line 107
    .line 108
    sub-int v4, v15, v25

    .line 109
    .line 110
    not-int v4, v4

    .line 111
    ushr-int/lit8 v4, v4, 0x1f

    .line 112
    .line 113
    rsub-int/lit8 v4, v4, 0x8

    .line 114
    .line 115
    const/4 v5, 0x0

    .line 116
    :goto_3
    if-ge v5, v4, :cond_2

    .line 117
    .line 118
    and-long v28, v12, v17

    .line 119
    .line 120
    cmp-long v28, v28, v23

    .line 121
    .line 122
    if-gez v28, :cond_0

    .line 123
    .line 124
    shl-int/lit8 v28, v15, 0x3

    .line 125
    .line 126
    move-object/from16 v29, v2

    .line 127
    .line 128
    add-int v2, v28, v5

    .line 129
    .line 130
    aget-object v28, v10, v2

    .line 131
    .line 132
    move/from16 v30, v5

    .line 133
    .line 134
    move-object/from16 v5, v28

    .line 135
    .line 136
    check-cast v5, LY/U;

    .line 137
    .line 138
    move/from16 v28, v7

    .line 139
    .line 140
    invoke-static {v0}, LY/B;->z(LY/B;)Lt/P;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-static {v7, v5}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_1

    .line 149
    .line 150
    invoke-virtual {v9, v2}, Lt/Q;->A(I)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_0
    move-object/from16 v29, v2

    .line 155
    .line 156
    move/from16 v30, v5

    .line 157
    .line 158
    move/from16 v28, v7

    .line 159
    .line 160
    :cond_1
    :goto_4
    shr-long v12, v12, v16

    .line 161
    .line 162
    add-int/lit8 v5, v30, 0x1

    .line 163
    .line 164
    move/from16 v7, v28

    .line 165
    .line 166
    move-object/from16 v2, v29

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_2
    move-object/from16 v29, v2

    .line 170
    .line 171
    move/from16 v28, v7

    .line 172
    .line 173
    move/from16 v2, v16

    .line 174
    .line 175
    if-ne v4, v2, :cond_5

    .line 176
    .line 177
    :goto_5
    move/from16 v13, v25

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_3
    move-object/from16 v29, v2

    .line 181
    .line 182
    move/from16 v28, v7

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :goto_6
    if-eq v15, v13, :cond_5

    .line 186
    .line 187
    add-int/lit8 v15, v15, 0x1

    .line 188
    .line 189
    move-wide/from16 v4, v26

    .line 190
    .line 191
    move/from16 v7, v28

    .line 192
    .line 193
    move-object/from16 v2, v29

    .line 194
    .line 195
    const/16 v16, 0x8

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_4
    move-object/from16 v29, v2

    .line 199
    .line 200
    move-wide/from16 v26, v4

    .line 201
    .line 202
    move/from16 v28, v7

    .line 203
    .line 204
    move-wide/from16 v23, v15

    .line 205
    .line 206
    :cond_5
    invoke-virtual {v9}, Lt/e0;->d()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    goto :goto_7

    .line 211
    :cond_6
    move-object/from16 v29, v2

    .line 212
    .line 213
    move-wide/from16 v26, v4

    .line 214
    .line 215
    move/from16 v28, v7

    .line 216
    .line 217
    move-wide/from16 v23, v15

    .line 218
    .line 219
    const-string v2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    .line 220
    .line 221
    invoke-static {v9, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    check-cast v9, LY/U;

    .line 225
    .line 226
    invoke-static {v0}, LY/B;->z(LY/B;)Lt/P;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-static {v2, v9}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-nez v2, :cond_7

    .line 235
    .line 236
    const/4 v2, 0x1

    .line 237
    goto :goto_7

    .line 238
    :cond_7
    const/4 v2, 0x0

    .line 239
    :goto_7
    if-eqz v2, :cond_8

    .line 240
    .line 241
    invoke-virtual {v1, v8}, Lt/P;->v(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    :cond_8
    const/16 v2, 0x8

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_9
    move-object/from16 v29, v2

    .line 248
    .line 249
    move-wide/from16 v26, v4

    .line 250
    .line 251
    move/from16 v28, v7

    .line 252
    .line 253
    move/from16 v20, v8

    .line 254
    .line 255
    move-wide/from16 v21, v9

    .line 256
    .line 257
    move-wide/from16 v23, v15

    .line 258
    .line 259
    move v2, v12

    .line 260
    :goto_8
    shr-long v4, v26, v2

    .line 261
    .line 262
    add-int/lit8 v7, v28, 0x1

    .line 263
    .line 264
    move v12, v2

    .line 265
    move/from16 v8, v20

    .line 266
    .line 267
    move-wide/from16 v9, v21

    .line 268
    .line 269
    move-wide/from16 v15, v23

    .line 270
    .line 271
    move-object/from16 v2, v29

    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :cond_a
    move-object/from16 v29, v2

    .line 276
    .line 277
    move/from16 v20, v8

    .line 278
    .line 279
    move-wide/from16 v21, v9

    .line 280
    .line 281
    move v2, v12

    .line 282
    move-wide/from16 v23, v15

    .line 283
    .line 284
    if-ne v6, v2, :cond_d

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_b
    move-object/from16 v29, v2

    .line 288
    .line 289
    move/from16 v20, v8

    .line 290
    .line 291
    move-wide/from16 v21, v9

    .line 292
    .line 293
    move-wide/from16 v23, v15

    .line 294
    .line 295
    :goto_9
    if-eq v14, v3, :cond_d

    .line 296
    .line 297
    add-int/lit8 v14, v14, 0x1

    .line 298
    .line 299
    move/from16 v8, v20

    .line 300
    .line 301
    move-wide/from16 v9, v21

    .line 302
    .line 303
    move-wide/from16 v15, v23

    .line 304
    .line 305
    move-object/from16 v2, v29

    .line 306
    .line 307
    const/16 v12, 0x8

    .line 308
    .line 309
    goto/16 :goto_0

    .line 310
    .line 311
    :cond_c
    move/from16 v20, v8

    .line 312
    .line 313
    move-wide/from16 v21, v9

    .line 314
    .line 315
    const-wide/16 v17, 0xff

    .line 316
    .line 317
    const-wide/16 v23, 0x80

    .line 318
    .line 319
    :cond_d
    iget-object v1, v0, LY/B;->i:Lt/Q;

    .line 320
    .line 321
    invoke-virtual {v1}, Lt/e0;->e()Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    if-eqz v1, :cond_12

    .line 326
    .line 327
    iget-object v1, v0, LY/B;->i:Lt/Q;

    .line 328
    .line 329
    iget-object v2, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 330
    .line 331
    iget-object v3, v1, Lt/e0;->a:[J

    .line 332
    .line 333
    array-length v4, v3

    .line 334
    add-int/lit8 v4, v4, -0x2

    .line 335
    .line 336
    if-ltz v4, :cond_12

    .line 337
    .line 338
    const/4 v5, 0x0

    .line 339
    :goto_a
    aget-wide v6, v3, v5

    .line 340
    .line 341
    not-long v8, v6

    .line 342
    shl-long v8, v8, v20

    .line 343
    .line 344
    and-long/2addr v8, v6

    .line 345
    and-long v8, v8, v21

    .line 346
    .line 347
    cmp-long v8, v8, v21

    .line 348
    .line 349
    if-eqz v8, :cond_11

    .line 350
    .line 351
    sub-int v8, v5, v4

    .line 352
    .line 353
    not-int v8, v8

    .line 354
    ushr-int/lit8 v8, v8, 0x1f

    .line 355
    .line 356
    const/16 v16, 0x8

    .line 357
    .line 358
    rsub-int/lit8 v12, v8, 0x8

    .line 359
    .line 360
    const/4 v8, 0x0

    .line 361
    :goto_b
    if-ge v8, v12, :cond_10

    .line 362
    .line 363
    and-long v9, v6, v17

    .line 364
    .line 365
    cmp-long v9, v9, v23

    .line 366
    .line 367
    if-gez v9, :cond_e

    .line 368
    .line 369
    const/4 v9, 0x1

    .line 370
    goto :goto_c

    .line 371
    :cond_e
    const/4 v9, 0x0

    .line 372
    :goto_c
    if-eqz v9, :cond_f

    .line 373
    .line 374
    shl-int/lit8 v9, v5, 0x3

    .line 375
    .line 376
    add-int/2addr v9, v8

    .line 377
    aget-object v10, v2, v9

    .line 378
    .line 379
    check-cast v10, LY/f1;

    .line 380
    .line 381
    invoke-virtual {v10}, LY/f1;->w()Z

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    if-nez v10, :cond_f

    .line 386
    .line 387
    invoke-virtual {v1, v9}, Lt/Q;->A(I)V

    .line 388
    .line 389
    .line 390
    :cond_f
    const/16 v9, 0x8

    .line 391
    .line 392
    shr-long/2addr v6, v9

    .line 393
    add-int/lit8 v8, v8, 0x1

    .line 394
    .line 395
    goto :goto_b

    .line 396
    :cond_10
    const/16 v9, 0x8

    .line 397
    .line 398
    if-ne v12, v9, :cond_12

    .line 399
    .line 400
    goto :goto_d

    .line 401
    :cond_11
    const/16 v9, 0x8

    .line 402
    .line 403
    :goto_d
    if-eq v5, v4, :cond_12

    .line 404
    .line 405
    add-int/lit8 v5, v5, 0x1

    .line 406
    .line 407
    goto :goto_a

    .line 408
    :cond_12
    return-void
.end method

.method private final E()Z
    .locals 4

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, LY/B;->y:I

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v1, v3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v2

    .line 12
    :goto_0
    if-eqz v3, :cond_1

    .line 13
    .line 14
    iput v2, p0, LY/B;->y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_1
    monitor-exit v0

    .line 20
    return v3

    .line 21
    :goto_2
    monitor-exit v0

    .line 22
    throw v1
.end method

.method private final F(Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    iput-object p1, p0, LY/B;->z:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    iget-object v0, p0, LY/B;->a:LY/y;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, LY/y;->a(LY/Q;Lkotlin/jvm/functions/Function2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final G(ZLkotlin/jvm/functions/Function2;)LY/Q0;
    .locals 10

    .line 1
    iget-object v0, p0, LY/B;->q:LY/R0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "A pausable composition is in progress"

    .line 11
    .line 12
    invoke-static {v0}, LY/V0;->b(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v3, p0, LY/B;->a:LY/y;

    .line 16
    .line 17
    iget-object v4, p0, LY/B;->v:LY/s;

    .line 18
    .line 19
    iget-object v5, p0, LY/B;->e:Ljava/util/Set;

    .line 20
    .line 21
    iget-object v8, p0, LY/B;->b:LY/d;

    .line 22
    .line 23
    iget-object v9, p0, LY/B;->d:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v1, LY/R0;

    .line 26
    .line 27
    move-object v2, p0

    .line 28
    move v7, p1

    .line 29
    move-object v6, p2

    .line 30
    invoke-direct/range {v1 .. v9}, LY/R0;-><init>(LY/B;LY/y;LY/s;Ljava/util/Set;Lkotlin/jvm/functions/Function2;ZLY/d;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, v2, LY/B;->q:LY/R0;

    .line 34
    .line 35
    return-object v1
.end method

.method private final H(Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->v:LY/s;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/s;->z1()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LY/B;->F(Lkotlin/jvm/functions/Function2;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, LY/B;->v:LY/s;

    .line 10
    .line 11
    invoke-virtual {p1}, LY/s;->x0()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final I()V
    .locals 5

    .line 1
    iget-object v0, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-static {}, LY/C;->c()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-static {}, LY/C;->c()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    instance-of v1, v0, Ljava/util/Set;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    check-cast v0, Ljava/util/Set;

    .line 29
    .line 30
    invoke-direct {p0, v0, v2}, LY/B;->B(Ljava/util/Set;Z)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    instance-of v1, v0, [Ljava/lang/Object;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    check-cast v0, [Ljava/util/Set;

    .line 39
    .line 40
    array-length v1, v0

    .line 41
    const/4 v3, 0x0

    .line 42
    :goto_0
    if-ge v3, v1, :cond_3

    .line 43
    .line 44
    aget-object v4, v0, v3

    .line 45
    .line 46
    invoke-direct {p0, v4, v2}, LY/B;->B(Ljava/util/Set;Z)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v1, "corrupt pendingModifications drain: "

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 72
    .line 73
    .line 74
    new-instance v0, LTd/k;

    .line 75
    .line 76
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    const-string v0, "pending composition has not been applied"

    .line 81
    .line 82
    invoke-static {v0}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 83
    .line 84
    .line 85
    new-instance v0, LTd/k;

    .line 86
    .line 87
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :cond_3
    return-void
.end method

.method private final J()V
    .locals 5

    .line 1
    iget-object v0, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {}, LY/C;->c()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_3

    .line 17
    .line 18
    instance-of v1, v0, Ljava/util/Set;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Ljava/util/Set;

    .line 24
    .line 25
    invoke-direct {p0, v0, v2}, LY/B;->B(Ljava/util/Set;Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    instance-of v1, v0, [Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    check-cast v0, [Ljava/util/Set;

    .line 34
    .line 35
    array-length v1, v0

    .line 36
    move v3, v2

    .line 37
    :goto_0
    if-ge v3, v1, :cond_3

    .line 38
    .line 39
    aget-object v4, v0, v3

    .line 40
    .line 41
    invoke-direct {p0, v4, v2}, LY/B;->B(Ljava/util/Set;Z)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-nez v0, :cond_2

    .line 48
    .line 49
    const-string v0, "calling recordModificationsOf and applyChanges concurrently is not supported"

    .line 50
    .line 51
    invoke-static {v0}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 52
    .line 53
    .line 54
    new-instance v0, LTd/k;

    .line 55
    .line 56
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v1, "corrupt pendingModifications drain: "

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 80
    .line 81
    .line 82
    new-instance v0, LTd/k;

    .line 83
    .line 84
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_3
    return-void
.end method

.method private final K()V
    .locals 5

    .line 1
    iget-object v0, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {}, LY/C;->c()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    instance-of v1, v0, Ljava/util/Set;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    check-cast v0, Ljava/util/Set;

    .line 30
    .line 31
    invoke-direct {p0, v0, v2}, LY/B;->B(Ljava/util/Set;Z)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    instance-of v1, v0, [Ljava/lang/Object;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    check-cast v0, [Ljava/util/Set;

    .line 40
    .line 41
    array-length v1, v0

    .line 42
    move v3, v2

    .line 43
    :goto_0
    if-ge v3, v1, :cond_3

    .line 44
    .line 45
    aget-object v4, v0, v3

    .line 46
    .line 47
    invoke-direct {p0, v4, v2}, LY/B;->B(Ljava/util/Set;Z)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v1, "corrupt pendingModifications drain: "

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 73
    .line 74
    .line 75
    new-instance v0, LTd/k;

    .line 76
    .line 77
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_3
    :goto_1
    return-void
.end method

.method private final L()V
    .locals 4

    .line 1
    iget v0, p0, LY/B;->y:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v3, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v1

    .line 10
    :goto_0
    if-nez v3, :cond_4

    .line 11
    .line 12
    if-eq v0, v2, :cond_3

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    if-eq v0, v3, :cond_2

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    if-eq v0, v3, :cond_1

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string v0, "The composition is disposed"

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    const-string v0, "A previous pausable composition for this composition was cancelled. This composition must be disposed."

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    const-string v0, "The composition should be activated before setting content."

    .line 30
    .line 31
    :goto_1
    invoke-static {v0}, LY/V0;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_4
    iget-object v0, p0, LY/B;->q:LY/R0;

    .line 35
    .line 36
    if-nez v0, :cond_5

    .line 37
    .line 38
    move v1, v2

    .line 39
    :cond_5
    if-nez v1, :cond_6

    .line 40
    .line 41
    const-string v0, "A pausable composition is in progress"

    .line 42
    .line 43
    invoke-static {v0}, LY/V0;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_6
    return-void
.end method

.method private final N()Z
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->v:LY/s;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/s;->G0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private final Q(LY/f1;LY/b;Ljava/lang/Object;)LY/l0;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v1, LY/B;->d:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v4

    .line 12
    :try_start_0
    iget-object v5, v1, LY/B;->r:LY/B;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    if-eqz v5, :cond_1

    .line 16
    .line 17
    iget-object v7, v1, LY/B;->f:LY/E1;

    .line 18
    .line 19
    iget v8, v1, LY/B;->s:I

    .line 20
    .line 21
    invoke-virtual {v7, v8, v2}, LY/E1;->B(ILY/b;)Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v5, v6

    .line 29
    :goto_0
    move-object v6, v5

    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_1
    :goto_1
    if-nez v6, :cond_b

    .line 35
    .line 36
    invoke-direct {v1, v0, v3}, LY/B;->X(LY/f1;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    sget-object v0, LY/l0;->d:LY/l0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    monitor-exit v4

    .line 45
    return-object v0

    .line 46
    :cond_2
    if-nez v3, :cond_3

    .line 47
    .line 48
    :try_start_1
    iget-object v5, v1, LY/B;->n:Lt/P;

    .line 49
    .line 50
    sget-object v7, LY/A1;->a:LY/A1;

    .line 51
    .line 52
    invoke-static {v5, v0, v7}, La0/g;->i(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_3
    instance-of v5, v3, LY/U;

    .line 58
    .line 59
    if-nez v5, :cond_4

    .line 60
    .line 61
    iget-object v5, v1, LY/B;->n:Lt/P;

    .line 62
    .line 63
    sget-object v7, LY/A1;->a:LY/A1;

    .line 64
    .line 65
    invoke-static {v5, v0, v7}, La0/g;->i(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_4
    iget-object v5, v1, LY/B;->n:Lt/P;

    .line 71
    .line 72
    invoke-virtual {v5, v0}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-eqz v5, :cond_a

    .line 77
    .line 78
    instance-of v7, v5, Lt/Q;

    .line 79
    .line 80
    if-eqz v7, :cond_9

    .line 81
    .line 82
    check-cast v5, Lt/Q;

    .line 83
    .line 84
    iget-object v7, v5, Lt/e0;->b:[Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v5, v5, Lt/e0;->a:[J

    .line 87
    .line 88
    array-length v8, v5

    .line 89
    add-int/lit8 v8, v8, -0x2

    .line 90
    .line 91
    if-ltz v8, :cond_a

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    :goto_2
    aget-wide v11, v5, v10

    .line 95
    .line 96
    not-long v13, v11

    .line 97
    const/4 v15, 0x7

    .line 98
    shl-long/2addr v13, v15

    .line 99
    and-long/2addr v13, v11

    .line 100
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v13, v15

    .line 106
    cmp-long v13, v13, v15

    .line 107
    .line 108
    if-eqz v13, :cond_8

    .line 109
    .line 110
    sub-int v13, v10, v8

    .line 111
    .line 112
    not-int v13, v13

    .line 113
    ushr-int/lit8 v13, v13, 0x1f

    .line 114
    .line 115
    const/16 v14, 0x8

    .line 116
    .line 117
    rsub-int/lit8 v13, v13, 0x8

    .line 118
    .line 119
    const/4 v15, 0x0

    .line 120
    :goto_3
    if-ge v15, v13, :cond_7

    .line 121
    .line 122
    const-wide/16 v16, 0xff

    .line 123
    .line 124
    and-long v16, v11, v16

    .line 125
    .line 126
    const-wide/16 v18, 0x80

    .line 127
    .line 128
    cmp-long v16, v16, v18

    .line 129
    .line 130
    if-gez v16, :cond_5

    .line 131
    .line 132
    shl-int/lit8 v16, v10, 0x3

    .line 133
    .line 134
    add-int v16, v16, v15

    .line 135
    .line 136
    aget-object v9, v7, v16

    .line 137
    .line 138
    move/from16 v16, v14

    .line 139
    .line 140
    sget-object v14, LY/A1;->a:LY/A1;

    .line 141
    .line 142
    if-ne v9, v14, :cond_6

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    move/from16 v16, v14

    .line 146
    .line 147
    :cond_6
    shr-long v11, v11, v16

    .line 148
    .line 149
    add-int/lit8 v15, v15, 0x1

    .line 150
    .line 151
    move/from16 v14, v16

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    move v9, v14

    .line 155
    if-ne v13, v9, :cond_a

    .line 156
    .line 157
    :cond_8
    if-eq v10, v8, :cond_a

    .line 158
    .line 159
    add-int/lit8 v10, v10, 0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_9
    sget-object v7, LY/A1;->a:LY/A1;

    .line 163
    .line 164
    if-ne v5, v7, :cond_a

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_a
    iget-object v5, v1, LY/B;->n:Lt/P;

    .line 168
    .line 169
    invoke-static {v5, v0, v3}, La0/g;->a(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 170
    .line 171
    .line 172
    :cond_b
    :goto_4
    monitor-exit v4

    .line 173
    if-eqz v6, :cond_c

    .line 174
    .line 175
    invoke-direct {v6, v0, v2, v3}, LY/B;->Q(LY/f1;LY/b;Ljava/lang/Object;)LY/l0;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0

    .line 180
    :cond_c
    iget-object v0, v1, LY/B;->a:LY/y;

    .line 181
    .line 182
    invoke-virtual {v0, v1}, LY/y;->m(LY/Q;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, LY/B;->q()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_d

    .line 190
    .line 191
    sget-object v0, LY/l0;->c:LY/l0;

    .line 192
    .line 193
    return-object v0

    .line 194
    :cond_d
    sget-object v0, LY/l0;->b:LY/l0;

    .line 195
    .line 196
    return-object v0

    .line 197
    :goto_5
    monitor-exit v4

    .line 198
    throw v0
.end method

.method private final R(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget-object v0, p0, LY/B;->g:Lt/P;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    instance-of v1, v0, Lt/Q;

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    check-cast v0, Lt/Q;

    .line 14
    .line 15
    iget-object v1, v0, Lt/e0;->b:[Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, v0, Lt/e0;->a:[J

    .line 18
    .line 19
    array-length v2, v0

    .line 20
    add-int/lit8 v2, v2, -0x2

    .line 21
    .line 22
    if-ltz v2, :cond_4

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_0
    aget-wide v5, v0, v4

    .line 27
    .line 28
    not-long v7, v5

    .line 29
    const/4 v9, 0x7

    .line 30
    shl-long/2addr v7, v9

    .line 31
    and-long/2addr v7, v5

    .line 32
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v7, v9

    .line 38
    cmp-long v7, v7, v9

    .line 39
    .line 40
    if-eqz v7, :cond_2

    .line 41
    .line 42
    sub-int v7, v4, v2

    .line 43
    .line 44
    not-int v7, v7

    .line 45
    ushr-int/lit8 v7, v7, 0x1f

    .line 46
    .line 47
    const/16 v8, 0x8

    .line 48
    .line 49
    rsub-int/lit8 v7, v7, 0x8

    .line 50
    .line 51
    move v9, v3

    .line 52
    :goto_1
    if-ge v9, v7, :cond_1

    .line 53
    .line 54
    const-wide/16 v10, 0xff

    .line 55
    .line 56
    and-long/2addr v10, v5

    .line 57
    const-wide/16 v12, 0x80

    .line 58
    .line 59
    cmp-long v10, v10, v12

    .line 60
    .line 61
    if-gez v10, :cond_0

    .line 62
    .line 63
    shl-int/lit8 v10, v4, 0x3

    .line 64
    .line 65
    add-int/2addr v10, v9

    .line 66
    aget-object v10, v1, v10

    .line 67
    .line 68
    check-cast v10, LY/f1;

    .line 69
    .line 70
    invoke-virtual {v10, p1}, LY/f1;->v(Ljava/lang/Object;)LY/l0;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    sget-object v12, LY/l0;->d:LY/l0;

    .line 75
    .line 76
    if-ne v11, v12, :cond_0

    .line 77
    .line 78
    iget-object v11, p0, LY/B;->m:Lt/P;

    .line 79
    .line 80
    invoke-static {v11, p1, v10}, La0/g;->a(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    shr-long/2addr v5, v8

    .line 84
    add-int/lit8 v9, v9, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    if-ne v7, v8, :cond_4

    .line 88
    .line 89
    :cond_2
    if-eq v4, v2, :cond_4

    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    check-cast v0, LY/f1;

    .line 95
    .line 96
    invoke-virtual {v0, p1}, LY/f1;->v(Ljava/lang/Object;)LY/l0;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    sget-object v2, LY/l0;->d:LY/l0;

    .line 101
    .line 102
    if-ne v1, v2, :cond_4

    .line 103
    .line 104
    iget-object v1, p0, LY/B;->m:Lt/P;

    .line 105
    .line 106
    invoke-static {v1, p1, v0}, La0/g;->a(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    return-void
.end method

.method private final S()Lk0/l;
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->t:LY/K;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/K;->a()Lk0/l;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method private final W()Lt/P;
    .locals 3

    .line 1
    iget-object v0, p0, LY/B;->n:Lt/P;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v1, v2, v1}, La0/g;->d(Lt/P;ILkotlin/jvm/internal/DefaultConstructorMarker;)Lt/P;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, p0, LY/B;->n:Lt/P;

    .line 10
    .line 11
    return-object v0
.end method

.method private final X(LY/f1;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LY/B;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LY/B;->v:LY/s;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, LY/s;->B1(LY/f1;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public static final synthetic z(LY/B;)Lt/P;
    .locals 0

    .line 1
    iget-object p0, p0, LY/B;->g:Lt/P;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final M(LY/b;)Ljava/util/List;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LY/B;->n:Lt/P;

    .line 6
    .line 7
    invoke-static {v2}, La0/g;->f(Lt/P;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-lez v2, :cond_d

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, LY/B;->f:LY/E1;

    .line 19
    .line 20
    iget-object v4, v0, LY/B;->n:Lt/P;

    .line 21
    .line 22
    iget-object v5, v4, Lt/c0;->a:[J

    .line 23
    .line 24
    array-length v6, v5

    .line 25
    add-int/lit8 v6, v6, -0x2

    .line 26
    .line 27
    if-ltz v6, :cond_c

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    :goto_0
    aget-wide v9, v5, v8

    .line 31
    .line 32
    not-long v11, v9

    .line 33
    const/4 v13, 0x7

    .line 34
    shl-long/2addr v11, v13

    .line 35
    and-long/2addr v11, v9

    .line 36
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v11, v14

    .line 42
    cmp-long v11, v11, v14

    .line 43
    .line 44
    if-eqz v11, :cond_b

    .line 45
    .line 46
    sub-int v11, v8, v6

    .line 47
    .line 48
    not-int v11, v11

    .line 49
    ushr-int/lit8 v11, v11, 0x1f

    .line 50
    .line 51
    const/16 v12, 0x8

    .line 52
    .line 53
    rsub-int/lit8 v11, v11, 0x8

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    :goto_1
    if-ge v7, v11, :cond_a

    .line 57
    .line 58
    const-wide/16 v16, 0xff

    .line 59
    .line 60
    and-long v18, v9, v16

    .line 61
    .line 62
    const-wide/16 v20, 0x80

    .line 63
    .line 64
    cmp-long v18, v18, v20

    .line 65
    .line 66
    if-gez v18, :cond_9

    .line 67
    .line 68
    shl-int/lit8 v18, v8, 0x3

    .line 69
    .line 70
    move/from16 v19, v13

    .line 71
    .line 72
    add-int v13, v18, v7

    .line 73
    .line 74
    move-wide/from16 v22, v14

    .line 75
    .line 76
    iget-object v14, v4, Lt/c0;->b:[Ljava/lang/Object;

    .line 77
    .line 78
    aget-object v14, v14, v13

    .line 79
    .line 80
    iget-object v15, v4, Lt/c0;->c:[Ljava/lang/Object;

    .line 81
    .line 82
    aget-object v15, v15, v13

    .line 83
    .line 84
    move/from16 v18, v12

    .line 85
    .line 86
    const-string v12, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap"

    .line 87
    .line 88
    invoke-static {v14, v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    instance-of v12, v15, Lt/Q;

    .line 92
    .line 93
    if-eqz v12, :cond_6

    .line 94
    .line 95
    const-string v12, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"

    .line 96
    .line 97
    invoke-static {v15, v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    check-cast v15, Lt/Q;

    .line 101
    .line 102
    iget-object v12, v15, Lt/e0;->b:[Ljava/lang/Object;

    .line 103
    .line 104
    iget-object v0, v15, Lt/e0;->a:[J

    .line 105
    .line 106
    move-object/from16 v24, v5

    .line 107
    .line 108
    array-length v5, v0

    .line 109
    add-int/lit8 v5, v5, -0x2

    .line 110
    .line 111
    if-ltz v5, :cond_4

    .line 112
    .line 113
    move-object/from16 v25, v0

    .line 114
    .line 115
    move-wide/from16 v26, v9

    .line 116
    .line 117
    const/4 v0, 0x0

    .line 118
    :goto_2
    aget-wide v9, v25, v0

    .line 119
    .line 120
    move/from16 v28, v6

    .line 121
    .line 122
    move/from16 v29, v7

    .line 123
    .line 124
    not-long v6, v9

    .line 125
    shl-long v6, v6, v19

    .line 126
    .line 127
    and-long/2addr v6, v9

    .line 128
    and-long v6, v6, v22

    .line 129
    .line 130
    cmp-long v6, v6, v22

    .line 131
    .line 132
    if-eqz v6, :cond_3

    .line 133
    .line 134
    sub-int v6, v0, v5

    .line 135
    .line 136
    not-int v6, v6

    .line 137
    ushr-int/lit8 v6, v6, 0x1f

    .line 138
    .line 139
    rsub-int/lit8 v6, v6, 0x8

    .line 140
    .line 141
    const/4 v7, 0x0

    .line 142
    :goto_3
    if-ge v7, v6, :cond_2

    .line 143
    .line 144
    and-long v30, v9, v16

    .line 145
    .line 146
    cmp-long v30, v30, v20

    .line 147
    .line 148
    if-gez v30, :cond_0

    .line 149
    .line 150
    shl-int/lit8 v30, v0, 0x3

    .line 151
    .line 152
    move/from16 v31, v7

    .line 153
    .line 154
    add-int v7, v30, v31

    .line 155
    .line 156
    move-wide/from16 v32, v9

    .line 157
    .line 158
    aget-object v9, v12, v7

    .line 159
    .line 160
    move-object v10, v14

    .line 161
    check-cast v10, LY/f1;

    .line 162
    .line 163
    move-object/from16 v30, v12

    .line 164
    .line 165
    invoke-virtual {v10}, LY/f1;->h()LY/b;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    if-eqz v12, :cond_1

    .line 170
    .line 171
    invoke-virtual {v3, v1, v12}, LY/E1;->D(LY/b;LY/b;)Z

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    if-eqz v12, :cond_1

    .line 176
    .line 177
    invoke-static {v10, v9}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    invoke-virtual {v15, v7}, Lt/Q;->A(I)V

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_0
    move/from16 v31, v7

    .line 189
    .line 190
    move-wide/from16 v32, v9

    .line 191
    .line 192
    move-object/from16 v30, v12

    .line 193
    .line 194
    :cond_1
    :goto_4
    shr-long v9, v32, v18

    .line 195
    .line 196
    add-int/lit8 v7, v31, 0x1

    .line 197
    .line 198
    move-object/from16 v12, v30

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_2
    move-object/from16 v30, v12

    .line 202
    .line 203
    move/from16 v7, v18

    .line 204
    .line 205
    if-ne v6, v7, :cond_5

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_3
    move-object/from16 v30, v12

    .line 209
    .line 210
    :goto_5
    if-eq v0, v5, :cond_5

    .line 211
    .line 212
    add-int/lit8 v0, v0, 0x1

    .line 213
    .line 214
    move/from16 v6, v28

    .line 215
    .line 216
    move/from16 v7, v29

    .line 217
    .line 218
    move-object/from16 v12, v30

    .line 219
    .line 220
    const/16 v18, 0x8

    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_4
    move/from16 v28, v6

    .line 224
    .line 225
    move/from16 v29, v7

    .line 226
    .line 227
    move-wide/from16 v26, v9

    .line 228
    .line 229
    :cond_5
    invoke-virtual {v15}, Lt/e0;->d()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    goto :goto_6

    .line 234
    :cond_6
    move-object/from16 v24, v5

    .line 235
    .line 236
    move/from16 v28, v6

    .line 237
    .line 238
    move/from16 v29, v7

    .line 239
    .line 240
    move-wide/from16 v26, v9

    .line 241
    .line 242
    const-string v0, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"

    .line 243
    .line 244
    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    check-cast v14, LY/f1;

    .line 248
    .line 249
    invoke-virtual {v14}, LY/f1;->h()LY/b;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-eqz v0, :cond_7

    .line 254
    .line 255
    invoke-virtual {v3, v1, v0}, LY/E1;->D(LY/b;LY/b;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_7

    .line 260
    .line 261
    invoke-static {v14, v15}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    const/4 v0, 0x1

    .line 269
    goto :goto_6

    .line 270
    :cond_7
    const/4 v0, 0x0

    .line 271
    :goto_6
    if-eqz v0, :cond_8

    .line 272
    .line 273
    invoke-virtual {v4, v13}, Lt/P;->v(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    :cond_8
    const/16 v7, 0x8

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_9
    move-object/from16 v24, v5

    .line 280
    .line 281
    move/from16 v28, v6

    .line 282
    .line 283
    move/from16 v29, v7

    .line 284
    .line 285
    move-wide/from16 v26, v9

    .line 286
    .line 287
    move/from16 v19, v13

    .line 288
    .line 289
    move-wide/from16 v22, v14

    .line 290
    .line 291
    move v7, v12

    .line 292
    :goto_7
    shr-long v9, v26, v7

    .line 293
    .line 294
    add-int/lit8 v0, v29, 0x1

    .line 295
    .line 296
    move v12, v7

    .line 297
    move/from16 v13, v19

    .line 298
    .line 299
    move-wide/from16 v14, v22

    .line 300
    .line 301
    move-object/from16 v5, v24

    .line 302
    .line 303
    move/from16 v6, v28

    .line 304
    .line 305
    move v7, v0

    .line 306
    move-object/from16 v0, p0

    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    :cond_a
    move-object/from16 v24, v5

    .line 311
    .line 312
    move/from16 v28, v6

    .line 313
    .line 314
    move v7, v12

    .line 315
    if-ne v11, v7, :cond_c

    .line 316
    .line 317
    move/from16 v6, v28

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_b
    move-object/from16 v24, v5

    .line 321
    .line 322
    :goto_8
    if-eq v8, v6, :cond_c

    .line 323
    .line 324
    add-int/lit8 v8, v8, 0x1

    .line 325
    .line 326
    move-object/from16 v0, p0

    .line 327
    .line 328
    move-object/from16 v5, v24

    .line 329
    .line 330
    goto/16 :goto_0

    .line 331
    .line 332
    :cond_c
    return-object v2

    .line 333
    :cond_d
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0
.end method

.method public final O()LY/K;
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->t:LY/K;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()LY/E1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->f:LY/E1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final T(Lt/e0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LY/B;->q:LY/R0;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LY/B;->u:Lg0/q;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lg0/q;->q(Lt/e0;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    iput p1, p0, LY/B;->y:I

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final U(LY/U;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->g:Lt/P;

    .line 2
    .line 3
    invoke-static {v0, p1}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LY/B;->j:Lt/P;

    .line 10
    .line 11
    invoke-static {v0, p1}, La0/g;->h(Lt/P;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final V(Ljava/lang/Object;LY/f1;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->g:Lt/P;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, La0/g;->g(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Y()V
    .locals 3

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, LY/B;->K()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, LY/B;->W()Lt/P;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    iget-object v2, p0, LY/B;->v:LY/s;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, LY/s;->D1(Lt/P;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v2

    .line 21
    :try_start_2
    iput-object v1, p0, LY/B;->n:Lt/P;

    .line 22
    .line 23
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception v1

    .line 25
    monitor-exit v0

    .line 26
    throw v1
.end method

.method public a(Ljava/lang/Object;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, LY/B;->N()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_6

    .line 10
    .line 11
    iget-object v2, v0, LY/B;->v:LY/s;

    .line 12
    .line 13
    invoke-virtual {v2}, LY/s;->I0()LY/f1;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_6

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v2, v3}, LY/f1;->O(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, LY/f1;->z(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v0}, LY/B;->S()Lk0/l;

    .line 28
    .line 29
    .line 30
    if-nez v4, :cond_6

    .line 31
    .line 32
    instance-of v4, v1, Li0/V;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    move-object v4, v1

    .line 37
    check-cast v4, Li0/V;

    .line 38
    .line 39
    invoke-static {v3}, Li0/h;->a(I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-virtual {v4, v5}, Li0/V;->s(I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v4, v0, LY/B;->g:Lt/P;

    .line 47
    .line 48
    invoke-static {v4, v1, v2}, La0/g;->a(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    instance-of v4, v1, LY/U;

    .line 52
    .line 53
    if-eqz v4, :cond_6

    .line 54
    .line 55
    move-object v4, v1

    .line 56
    check-cast v4, LY/U;

    .line 57
    .line 58
    invoke-interface {v4}, LY/U;->o()LY/U$a;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-object v6, v0, LY/B;->j:Lt/P;

    .line 63
    .line 64
    invoke-static {v6, v1}, La0/g;->h(Lt/P;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v5}, LY/U$a;->b()Lt/T;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget-object v7, v6, Lt/T;->b:[Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v6, v6, Lt/T;->a:[J

    .line 74
    .line 75
    array-length v8, v6

    .line 76
    add-int/lit8 v8, v8, -0x2

    .line 77
    .line 78
    if-ltz v8, :cond_5

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    :goto_0
    aget-wide v11, v6, v10

    .line 82
    .line 83
    not-long v13, v11

    .line 84
    const/4 v15, 0x7

    .line 85
    shl-long/2addr v13, v15

    .line 86
    and-long/2addr v13, v11

    .line 87
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    and-long/2addr v13, v15

    .line 93
    cmp-long v13, v13, v15

    .line 94
    .line 95
    if-eqz v13, :cond_4

    .line 96
    .line 97
    sub-int v13, v10, v8

    .line 98
    .line 99
    not-int v13, v13

    .line 100
    ushr-int/lit8 v13, v13, 0x1f

    .line 101
    .line 102
    const/16 v14, 0x8

    .line 103
    .line 104
    rsub-int/lit8 v13, v13, 0x8

    .line 105
    .line 106
    const/4 v15, 0x0

    .line 107
    :goto_1
    if-ge v15, v13, :cond_3

    .line 108
    .line 109
    const-wide/16 v16, 0xff

    .line 110
    .line 111
    and-long v16, v11, v16

    .line 112
    .line 113
    const-wide/16 v18, 0x80

    .line 114
    .line 115
    cmp-long v16, v16, v18

    .line 116
    .line 117
    if-gez v16, :cond_2

    .line 118
    .line 119
    shl-int/lit8 v16, v10, 0x3

    .line 120
    .line 121
    add-int v16, v16, v15

    .line 122
    .line 123
    aget-object v16, v7, v16

    .line 124
    .line 125
    move/from16 v17, v3

    .line 126
    .line 127
    move-object/from16 v3, v16

    .line 128
    .line 129
    check-cast v3, Li0/U;

    .line 130
    .line 131
    instance-of v9, v3, Li0/V;

    .line 132
    .line 133
    if-eqz v9, :cond_1

    .line 134
    .line 135
    move-object v9, v3

    .line 136
    check-cast v9, Li0/V;

    .line 137
    .line 138
    move/from16 v18, v14

    .line 139
    .line 140
    invoke-static/range {v17 .. v17}, Li0/h;->a(I)I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    invoke-virtual {v9, v14}, Li0/V;->s(I)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_1
    move/from16 v18, v14

    .line 149
    .line 150
    :goto_2
    iget-object v9, v0, LY/B;->j:Lt/P;

    .line 151
    .line 152
    invoke-static {v9, v3, v1}, La0/g;->a(Lt/P;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_2
    move/from16 v17, v3

    .line 157
    .line 158
    move/from16 v18, v14

    .line 159
    .line 160
    :goto_3
    shr-long v11, v11, v18

    .line 161
    .line 162
    add-int/lit8 v15, v15, 0x1

    .line 163
    .line 164
    move/from16 v3, v17

    .line 165
    .line 166
    move/from16 v14, v18

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_3
    move/from16 v17, v3

    .line 170
    .line 171
    move v3, v14

    .line 172
    if-ne v13, v3, :cond_5

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_4
    move/from16 v17, v3

    .line 176
    .line 177
    :goto_4
    if-eq v10, v8, :cond_5

    .line 178
    .line 179
    add-int/lit8 v10, v10, 0x1

    .line 180
    .line 181
    move/from16 v3, v17

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_5
    invoke-interface {v5}, LY/U$a;->a()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v2, v4, v1}, LY/f1;->y(LY/U;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_6
    return-void
.end method

.method public b(Lkotlin/jvm/functions/Function2;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :try_start_1
    invoke-direct {p0}, LY/B;->I()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, LY/B;->W()Lt/P;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 11
    :try_start_2
    iget-object v2, p0, LY/B;->v:LY/s;

    .line 12
    .line 13
    iget-object v3, p0, LY/B;->p:LY/C1;

    .line 14
    .line 15
    invoke-virtual {v2, v1, p1, v3}, LY/s;->k0(Lt/P;Lkotlin/jvm/functions/Function2;LY/C1;)V

    .line 16
    .line 17
    .line 18
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 19
    .line 20
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :catchall_1
    move-exception p1

    .line 25
    :try_start_4
    iput-object v1, p0, LY/B;->n:Lt/P;

    .line 26
    .line 27
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 28
    :catchall_2
    move-exception p1

    .line 29
    :try_start_5
    monitor-exit v0

    .line 30
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 31
    :goto_0
    :try_start_6
    iget-object v0, p0, LY/B;->e:Ljava/util/Set;

    .line 32
    .line 33
    check-cast v0, Ljava/util/Collection;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, LY/B;->u:Lg0/q;

    .line 42
    .line 43
    iget-object v1, p0, LY/B;->e:Ljava/util/Set;

    .line 44
    .line 45
    iget-object v2, p0, LY/B;->v:LY/s;

    .line 46
    .line 47
    invoke-virtual {v2}, LY/s;->K0()Lk0/h;

    .line 48
    .line 49
    .line 50
    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 51
    :try_start_7
    invoke-virtual {v0, v1, v2}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lg0/q;->j()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 55
    .line 56
    .line 57
    :try_start_8
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_3
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :catchall_4
    move-exception p1

    .line 64
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_0
    :goto_1
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 69
    :goto_2
    invoke-virtual {p0}, LY/B;->v()V

    .line 70
    .line 71
    .line 72
    throw p1
.end method

.method public c()V
    .locals 5

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/B;->l:LZ/a;

    .line 5
    .line 6
    invoke-virtual {v1}, LZ/a;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LY/B;->l:LZ/a;

    .line 13
    .line 14
    invoke-direct {p0, v1}, LY/B;->C(LZ/a;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    iget-object v2, p0, LY/B;->e:Ljava/util/Set;

    .line 25
    .line 26
    check-cast v2, Ljava/util/Collection;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, LY/B;->u:Lg0/q;

    .line 35
    .line 36
    iget-object v3, p0, LY/B;->e:Ljava/util/Set;

    .line 37
    .line 38
    iget-object v4, p0, LY/B;->v:LY/s;

    .line 39
    .line 40
    invoke-virtual {v4}, LY/s;->K0()Lk0/h;

    .line 41
    .line 42
    .line 43
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    :try_start_2
    invoke-virtual {v2, v3, v4}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lg0/q;->j()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 48
    .line 49
    .line 50
    :try_start_3
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception v1

    .line 55
    goto :goto_3

    .line 56
    :catchall_2
    move-exception v1

    .line 57
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_1
    :goto_2
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :goto_3
    :try_start_4
    invoke-virtual {p0}, LY/B;->v()V

    .line 63
    .line 64
    .line 65
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 66
    :catchall_3
    move-exception v1

    .line 67
    monitor-exit v0

    .line 68
    throw v1
.end method

.method public d(Lkotlin/jvm/functions/Function2;)LY/Q0;
    .locals 1

    .line 1
    invoke-direct {p0}, LY/B;->E()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0, p1}, LY/B;->G(ZLkotlin/jvm/functions/Function2;)LY/Q0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public deactivate()V
    .locals 9

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/B;->q:LY/R0;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    move v1, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v2

    .line 13
    :goto_0
    if-nez v1, :cond_1

    .line 14
    .line 15
    const-string v1, "Deactivate is not supported while pausable composition is in progress"

    .line 16
    .line 17
    invoke-static {v1}, LY/V0;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :cond_1
    :goto_1
    iget-object v1, p0, LY/B;->f:LY/E1;

    .line 25
    .line 26
    invoke-virtual {v1}, LY/E1;->u()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-lez v1, :cond_2

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move v1, v2

    .line 35
    :goto_2
    if-nez v1, :cond_3

    .line 36
    .line 37
    iget-object v4, p0, LY/B;->e:Ljava/util/Set;

    .line 38
    .line 39
    check-cast v4, Ljava/util/Collection;

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_5

    .line 46
    .line 47
    :cond_3
    const-string v4, "Compose:deactivate"

    .line 48
    .line 49
    sget-object v5, Lg0/x;->a:Lg0/x;

    .line 50
    .line 51
    invoke-virtual {v5, v4}, Lg0/x;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :try_start_1
    iget-object v6, p0, LY/B;->u:Lg0/q;

    .line 56
    .line 57
    iget-object v7, p0, LY/B;->e:Ljava/util/Set;

    .line 58
    .line 59
    iget-object v8, p0, LY/B;->v:LY/s;

    .line 60
    .line 61
    invoke-virtual {v8}, LY/s;->K0()Lk0/h;

    .line 62
    .line 63
    .line 64
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 65
    :try_start_2
    invoke-virtual {v6, v7, v8}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 66
    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iget-object v1, p0, LY/B;->b:LY/d;

    .line 71
    .line 72
    invoke-interface {v1}, LY/d;->j()V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, LY/B;->f:LY/E1;

    .line 76
    .line 77
    invoke-virtual {v1}, LY/E1;->G()LY/H1;

    .line 78
    .line 79
    .line 80
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    :try_start_3
    iget-object v7, p0, LY/B;->u:Lg0/q;

    .line 82
    .line 83
    invoke-static {v1, v7}, LY/w;->v(LY/H1;LY/u1;)V

    .line 84
    .line 85
    .line 86
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 87
    .line 88
    :try_start_4
    invoke-virtual {v1, v3}, LY/H1;->J(Z)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, LY/B;->b:LY/d;

    .line 92
    .line 93
    invoke-interface {v1}, LY/d;->f()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Lg0/q;->m()V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :catchall_1
    move-exception v1

    .line 101
    goto :goto_4

    .line 102
    :catchall_2
    move-exception v3

    .line 103
    invoke-virtual {v1, v2}, LY/H1;->J(Z)V

    .line 104
    .line 105
    .line 106
    throw v3

    .line 107
    :cond_4
    :goto_3
    invoke-virtual {v6}, Lg0/q;->j()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 108
    .line 109
    .line 110
    :try_start_5
    invoke-virtual {v6}, Lg0/q;->i()V

    .line 111
    .line 112
    .line 113
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 114
    .line 115
    :try_start_6
    invoke-virtual {v5, v4}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    iget-object v1, p0, LY/B;->g:Lt/P;

    .line 119
    .line 120
    invoke-static {v1}, La0/g;->b(Lt/P;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, LY/B;->j:Lt/P;

    .line 124
    .line 125
    invoke-static {v1}, La0/g;->b(Lt/P;)V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, LY/B;->n:Lt/P;

    .line 129
    .line 130
    invoke-static {v1}, La0/g;->b(Lt/P;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, LY/B;->k:LZ/a;

    .line 134
    .line 135
    invoke-virtual {v1}, LZ/a;->a()V

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, LY/B;->l:LZ/a;

    .line 139
    .line 140
    invoke-virtual {v1}, LZ/a;->a()V

    .line 141
    .line 142
    .line 143
    iget-object v1, p0, LY/B;->v:LY/s;

    .line 144
    .line 145
    invoke-virtual {v1}, LY/s;->q0()V

    .line 146
    .line 147
    .line 148
    iput v3, p0, LY/B;->y:I

    .line 149
    .line 150
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 151
    .line 152
    monitor-exit v0

    .line 153
    return-void

    .line 154
    :catchall_3
    move-exception v1

    .line 155
    goto :goto_5

    .line 156
    :goto_4
    :try_start_7
    invoke-virtual {v6}, Lg0/q;->i()V

    .line 157
    .line 158
    .line 159
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 160
    :goto_5
    :try_start_8
    sget-object v2, Lg0/x;->a:Lg0/x;

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 166
    :goto_6
    monitor-exit v0

    .line 167
    throw v1
.end method

.method public dispose()V
    .locals 7

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/B;->v:LY/s;

    .line 5
    .line 6
    invoke-virtual {v1}, LY/s;->V0()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."

    .line 13
    .line 14
    invoke-static {v1}, LY/V0;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    :goto_0
    iget v1, p0, LY/B;->y:I

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    iput v2, p0, LY/B;->y:I

    .line 27
    .line 28
    sget-object v1, LY/g;->a:LY/g;

    .line 29
    .line 30
    invoke-virtual {v1}, LY/g;->a()Lkotlin/jvm/functions/Function2;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, LY/B;->z:Lkotlin/jvm/functions/Function2;

    .line 35
    .line 36
    iget-object v1, p0, LY/B;->v:LY/s;

    .line 37
    .line 38
    invoke-virtual {v1}, LY/s;->J0()LZ/a;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-direct {p0, v1}, LY/B;->C(LZ/a;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v1, p0, LY/B;->f:LY/E1;

    .line 48
    .line 49
    invoke-virtual {v1}, LY/E1;->u()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x1

    .line 55
    if-lez v1, :cond_2

    .line 56
    .line 57
    move v1, v3

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v1, v2

    .line 60
    :goto_1
    if-nez v1, :cond_3

    .line 61
    .line 62
    iget-object v4, p0, LY/B;->e:Ljava/util/Set;

    .line 63
    .line 64
    check-cast v4, Ljava/util/Collection;

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_5

    .line 71
    .line 72
    :cond_3
    iget-object v4, p0, LY/B;->u:Lg0/q;

    .line 73
    .line 74
    iget-object v5, p0, LY/B;->e:Ljava/util/Set;

    .line 75
    .line 76
    iget-object v6, p0, LY/B;->v:LY/s;

    .line 77
    .line 78
    invoke-virtual {v6}, LY/s;->K0()Lk0/h;

    .line 79
    .line 80
    .line 81
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    :try_start_1
    invoke-virtual {v4, v5, v6}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 83
    .line 84
    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    iget-object v1, p0, LY/B;->b:LY/d;

    .line 88
    .line 89
    invoke-interface {v1}, LY/d;->j()V

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, LY/B;->f:LY/E1;

    .line 93
    .line 94
    invoke-virtual {v1}, LY/E1;->G()LY/H1;

    .line 95
    .line 96
    .line 97
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    :try_start_2
    iget-object v5, p0, LY/B;->u:Lg0/q;

    .line 99
    .line 100
    invoke-static {v1, v5}, LY/w;->O(LY/H1;LY/u1;)V

    .line 101
    .line 102
    .line 103
    sget-object v2, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    .line 105
    :try_start_3
    invoke-virtual {v1, v3}, LY/H1;->J(Z)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, LY/B;->b:LY/d;

    .line 109
    .line 110
    invoke-interface {v1}, LY/d;->clear()V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, LY/B;->b:LY/d;

    .line 114
    .line 115
    invoke-interface {v1}, LY/d;->f()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4}, Lg0/q;->m()V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_1
    move-exception v1

    .line 123
    goto :goto_3

    .line 124
    :catchall_2
    move-exception v3

    .line 125
    invoke-virtual {v1, v2}, LY/H1;->J(Z)V

    .line 126
    .line 127
    .line 128
    throw v3

    .line 129
    :cond_4
    :goto_2
    invoke-virtual {v4}, Lg0/q;->j()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 130
    .line 131
    .line 132
    :try_start_4
    invoke-virtual {v4}, Lg0/q;->i()V

    .line 133
    .line 134
    .line 135
    :cond_5
    iget-object v1, p0, LY/B;->v:LY/s;

    .line 136
    .line 137
    invoke-virtual {v1}, LY/s;->r0()V

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :goto_3
    invoke-virtual {v4}, Lg0/q;->i()V

    .line 142
    .line 143
    .line 144
    throw v1

    .line 145
    :cond_6
    :goto_4
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 146
    .line 147
    monitor-exit v0

    .line 148
    iget-object v0, p0, LY/B;->a:LY/y;

    .line 149
    .line 150
    invoke-virtual {v0, p0}, LY/y;->v(LY/Q;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :goto_5
    monitor-exit v0

    .line 155
    throw v1
.end method

.method public e()Z
    .locals 2

    .line 1
    iget v0, p0, LY/B;->y:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public f(Lie/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->v:LY/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LY/s;->b1(Lie/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(LY/f1;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, LY/B;->o:Z

    .line 3
    .line 4
    invoke-direct {p0}, LY/B;->S()Lk0/l;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public h(Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LY/B;->E()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, LY/B;->L()V

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p1}, LY/B;->H(Lkotlin/jvm/functions/Function2;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-direct {p0, p1}, LY/B;->F(Lkotlin/jvm/functions/Function2;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public i(LY/C1;)LY/C1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->p:LY/C1;

    .line 2
    .line 3
    iput-object p1, p0, LY/B;->p:LY/C1;

    .line 4
    .line 5
    return-object v0
.end method

.method public j(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Lkotlin/Pair;

    .line 14
    .line 15
    invoke-virtual {v3}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, LY/y0;

    .line 20
    .line 21
    invoke-virtual {v3}, LY/y0;->b()LY/Q;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v3, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v1, 0x1

    .line 36
    :goto_1
    if-nez v1, :cond_2

    .line 37
    .line 38
    const-string v0, "Check failed"

    .line 39
    .line 40
    invoke-static {v0}, LY/w;->t(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :try_start_0
    iget-object v0, p0, LY/B;->v:LY/s;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, LY/s;->R0(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    :try_start_1
    iget-object v0, p0, LY/B;->e:Ljava/util/Set;

    .line 53
    .line 54
    check-cast v0, Ljava/util/Collection;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, LY/B;->u:Lg0/q;

    .line 63
    .line 64
    iget-object v1, p0, LY/B;->e:Ljava/util/Set;

    .line 65
    .line 66
    iget-object v2, p0, LY/B;->v:LY/s;

    .line 67
    .line 68
    invoke-virtual {v2}, LY/s;->K0()Lk0/h;

    .line 69
    .line 70
    .line 71
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    :try_start_2
    invoke-virtual {v0, v1, v2}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lg0/q;->j()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 76
    .line 77
    .line 78
    :try_start_3
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_1
    move-exception p1

    .line 83
    goto :goto_3

    .line 84
    :catchall_2
    move-exception p1

    .line 85
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_3
    :goto_2
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    :goto_3
    invoke-virtual {p0}, LY/B;->v()V

    .line 91
    .line 92
    .line 93
    throw p1
.end method

.method public k()Z
    .locals 5

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/B;->q:LY/R0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, LY/R0;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, LY/R0;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_4

    .line 22
    :cond_0
    :try_start_1
    invoke-direct {p0}, LY/B;->I()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    :try_start_2
    invoke-direct {p0}, LY/B;->W()Lt/P;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    :try_start_3
    iget-object v2, p0, LY/B;->v:LY/s;

    .line 30
    .line 31
    iget-object v3, p0, LY/B;->p:LY/C1;

    .line 32
    .line 33
    invoke-virtual {v2, v1, v3}, LY/s;->d1(Lt/P;LY/C1;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    invoke-direct {p0}, LY/B;->J()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_1
    move-exception v2

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    monitor-exit v0

    .line 46
    return v2

    .line 47
    :goto_1
    :try_start_4
    iput-object v1, p0, LY/B;->n:Lt/P;

    .line 48
    .line 49
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 50
    :catchall_2
    move-exception v1

    .line 51
    :try_start_5
    iget-object v2, p0, LY/B;->e:Ljava/util/Set;

    .line 52
    .line 53
    check-cast v2, Ljava/util/Collection;

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    iget-object v2, p0, LY/B;->u:Lg0/q;

    .line 62
    .line 63
    iget-object v3, p0, LY/B;->e:Ljava/util/Set;

    .line 64
    .line 65
    iget-object v4, p0, LY/B;->v:LY/s;

    .line 66
    .line 67
    invoke-virtual {v4}, LY/s;->K0()Lk0/h;

    .line 68
    .line 69
    .line 70
    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 71
    :try_start_6
    invoke-virtual {v2, v3, v4}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lg0/q;->j()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 75
    .line 76
    .line 77
    :try_start_7
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catchall_3
    move-exception v1

    .line 82
    goto :goto_3

    .line 83
    :catchall_4
    move-exception v1

    .line 84
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 85
    .line 86
    .line 87
    throw v1

    .line 88
    :cond_2
    :goto_2
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 89
    :goto_3
    :try_start_8
    invoke-virtual {p0}, LY/B;->v()V

    .line 90
    .line 91
    .line 92
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 93
    :goto_4
    monitor-exit v0

    .line 94
    throw v1
.end method

.method public l(Ljava/util/Set;)Z
    .locals 14

    .line 1
    instance-of v0, p1, La0/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    check-cast p1, La0/e;

    .line 8
    .line 9
    invoke-virtual {p1}, La0/e;->b()Lt/e0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p1, Lt/e0;->b:[Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p1, p1, Lt/e0;->a:[J

    .line 16
    .line 17
    array-length v3, p1

    .line 18
    add-int/lit8 v3, v3, -0x2

    .line 19
    .line 20
    if-ltz v3, :cond_7

    .line 21
    .line 22
    move v4, v1

    .line 23
    :goto_0
    aget-wide v5, p1, v4

    .line 24
    .line 25
    not-long v7, v5

    .line 26
    const/4 v9, 0x7

    .line 27
    shl-long/2addr v7, v9

    .line 28
    and-long/2addr v7, v5

    .line 29
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v7, v9

    .line 35
    cmp-long v7, v7, v9

    .line 36
    .line 37
    if-eqz v7, :cond_3

    .line 38
    .line 39
    sub-int v7, v4, v3

    .line 40
    .line 41
    not-int v7, v7

    .line 42
    ushr-int/lit8 v7, v7, 0x1f

    .line 43
    .line 44
    const/16 v8, 0x8

    .line 45
    .line 46
    rsub-int/lit8 v7, v7, 0x8

    .line 47
    .line 48
    move v9, v1

    .line 49
    :goto_1
    if-ge v9, v7, :cond_2

    .line 50
    .line 51
    const-wide/16 v10, 0xff

    .line 52
    .line 53
    and-long/2addr v10, v5

    .line 54
    const-wide/16 v12, 0x80

    .line 55
    .line 56
    cmp-long v10, v10, v12

    .line 57
    .line 58
    if-gez v10, :cond_1

    .line 59
    .line 60
    shl-int/lit8 v10, v4, 0x3

    .line 61
    .line 62
    add-int/2addr v10, v9

    .line 63
    aget-object v10, v0, v10

    .line 64
    .line 65
    iget-object v11, p0, LY/B;->g:Lt/P;

    .line 66
    .line 67
    invoke-static {v11, v10}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    if-nez v11, :cond_0

    .line 72
    .line 73
    iget-object v11, p0, LY/B;->j:Lt/P;

    .line 74
    .line 75
    invoke-static {v11, v10}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-eqz v10, :cond_1

    .line 80
    .line 81
    :cond_0
    return v2

    .line 82
    :cond_1
    shr-long/2addr v5, v8

    .line 83
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    if-ne v7, v8, :cond_7

    .line 87
    .line 88
    :cond_3
    if-eq v4, v3, :cond_7

    .line 89
    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    check-cast p1, Ljava/lang/Iterable;

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v3, p0, LY/B;->g:Lt/P;

    .line 110
    .line 111
    invoke-static {v3, v0}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_6

    .line 116
    .line 117
    iget-object v3, p0, LY/B;->j:Lt/P;

    .line 118
    .line 119
    invoke-static {v3, v0}, La0/g;->e(Lt/P;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    :cond_6
    return v2

    .line 126
    :cond_7
    return v1
.end method

.method public m(LY/Q;ILie/a;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    if-ltz p2, :cond_0

    .line 10
    .line 11
    check-cast p1, LY/B;

    .line 12
    .line 13
    iput-object p1, p0, LY/B;->r:LY/B;

    .line 14
    .line 15
    iput p2, p0, LY/B;->s:I

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    const/4 p2, 0x0

    .line 19
    :try_start_0
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iput-object p2, p0, LY/B;->r:LY/B;

    .line 24
    .line 25
    iput p1, p0, LY/B;->s:I

    .line 26
    .line 27
    return-object p3

    .line 28
    :catchall_0
    move-exception p3

    .line 29
    iput-object p2, p0, LY/B;->r:LY/B;

    .line 30
    .line 31
    iput p1, p0, LY/B;->s:I

    .line 32
    .line 33
    throw p3

    .line 34
    :cond_0
    invoke-interface {p3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public n(LY/x0;)V
    .locals 3

    .line 1
    iget-object v0, p0, LY/B;->u:Lg0/q;

    .line 2
    .line 3
    iget-object v1, p0, LY/B;->e:Ljava/util/Set;

    .line 4
    .line 5
    iget-object v2, p0, LY/B;->v:LY/s;

    .line 6
    .line 7
    invoke-virtual {v2}, LY/s;->K0()Lk0/h;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    :try_start_0
    invoke-virtual {v0, v1, v2}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, LY/x0;->a()LY/E1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, LY/E1;->G()LY/H1;

    .line 19
    .line 20
    .line 21
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :try_start_1
    iget-object v1, p0, LY/B;->u:Lg0/q;

    .line 23
    .line 24
    invoke-static {p1, v1}, LY/w;->O(LY/H1;LY/u1;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    :try_start_2
    invoke-virtual {p1, v1}, LY/H1;->J(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lg0/q;->m()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    :catchall_1
    move-exception v1

    .line 43
    const/4 v2, 0x0

    .line 44
    :try_start_3
    invoke-virtual {p1, v2}, LY/H1;->J(Z)V

    .line 45
    .line 46
    .line 47
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 48
    :goto_0
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public o(Ljava/util/Set;)V
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    invoke-static {}, LY/C;->c()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    instance-of v1, v0, Ljava/util/Set;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    new-array v1, v1, [Ljava/util/Set;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    aput-object v0, v1, v2

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object p1, v1, v2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    instance-of v1, v0, [Ljava/lang/Object;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    const-string v1, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, [Ljava/util/Set;

    .line 45
    .line 46
    invoke-static {v1, p1}, LUd/n;->D([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v1, "corrupt pendingModifications: "

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_4
    :goto_0
    move-object v1, p1

    .line 81
    :goto_1
    iget-object v2, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 82
    .line 83
    invoke-static {v2, v0, v1}, Lw/Y;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_0

    .line 88
    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    iget-object p1, p0, LY/B;->d:Ljava/lang/Object;

    .line 92
    .line 93
    monitor-enter p1

    .line 94
    :try_start_0
    invoke-direct {p0}, LY/B;->J()V

    .line 95
    .line 96
    .line 97
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    monitor-exit p1

    .line 100
    return-void

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    monitor-exit p1

    .line 103
    throw v0

    .line 104
    :cond_5
    return-void
.end method

.method public p()V
    .locals 5

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/B;->k:LZ/a;

    .line 5
    .line 6
    invoke-direct {p0, v1}, LY/B;->C(LZ/a;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, LY/B;->J()V

    .line 10
    .line 11
    .line 12
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    :try_start_1
    iget-object v2, p0, LY/B;->e:Ljava/util/Set;

    .line 18
    .line 19
    check-cast v2, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    iget-object v2, p0, LY/B;->u:Lg0/q;

    .line 28
    .line 29
    iget-object v3, p0, LY/B;->e:Ljava/util/Set;

    .line 30
    .line 31
    iget-object v4, p0, LY/B;->v:LY/s;

    .line 32
    .line 33
    invoke-virtual {v4}, LY/s;->K0()Lk0/h;

    .line 34
    .line 35
    .line 36
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    :try_start_2
    invoke-virtual {v2, v3, v4}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lg0/q;->j()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 41
    .line 42
    .line 43
    :try_start_3
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_1
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :catchall_2
    move-exception v1

    .line 50
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_0
    :goto_0
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 55
    :goto_1
    :try_start_4
    invoke-virtual {p0}, LY/B;->v()V

    .line 56
    .line 57
    .line 58
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 59
    :catchall_3
    move-exception v1

    .line 60
    monitor-exit v0

    .line 61
    throw v1
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, LY/B;->v:LY/s;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/s;->V0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public r(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LY/B;->E()Z

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LY/B;->L()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, LY/B;->H(Lkotlin/jvm/functions/Function2;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public s(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, LY/B;->R(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LY/B;->j:Lt/P;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Lt/c0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_4

    .line 14
    .line 15
    instance-of v1, p1, Lt/Q;

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    check-cast p1, Lt/Q;

    .line 20
    .line 21
    iget-object v1, p1, Lt/e0;->b:[Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p1, Lt/e0;->a:[J

    .line 24
    .line 25
    array-length v2, p1

    .line 26
    add-int/lit8 v2, v2, -0x2

    .line 27
    .line 28
    if-ltz v2, :cond_4

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    move v4, v3

    .line 32
    :goto_0
    aget-wide v5, p1, v4

    .line 33
    .line 34
    not-long v7, v5

    .line 35
    const/4 v9, 0x7

    .line 36
    shl-long/2addr v7, v9

    .line 37
    and-long/2addr v7, v5

    .line 38
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v7, v9

    .line 44
    cmp-long v7, v7, v9

    .line 45
    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    sub-int v7, v4, v2

    .line 49
    .line 50
    not-int v7, v7

    .line 51
    ushr-int/lit8 v7, v7, 0x1f

    .line 52
    .line 53
    const/16 v8, 0x8

    .line 54
    .line 55
    rsub-int/lit8 v7, v7, 0x8

    .line 56
    .line 57
    move v9, v3

    .line 58
    :goto_1
    if-ge v9, v7, :cond_1

    .line 59
    .line 60
    const-wide/16 v10, 0xff

    .line 61
    .line 62
    and-long/2addr v10, v5

    .line 63
    const-wide/16 v12, 0x80

    .line 64
    .line 65
    cmp-long v10, v10, v12

    .line 66
    .line 67
    if-gez v10, :cond_0

    .line 68
    .line 69
    shl-int/lit8 v10, v4, 0x3

    .line 70
    .line 71
    add-int/2addr v10, v9

    .line 72
    aget-object v10, v1, v10

    .line 73
    .line 74
    check-cast v10, LY/U;

    .line 75
    .line 76
    invoke-direct {p0, v10}, LY/B;->R(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_0
    :goto_2
    shr-long/2addr v5, v8

    .line 83
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    if-ne v7, v8, :cond_4

    .line 87
    .line 88
    :cond_2
    if-eq v4, v2, :cond_4

    .line 89
    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    check-cast p1, LY/U;

    .line 94
    .line 95
    invoke-direct {p0, p1}, LY/B;->R(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    monitor-exit v0

    .line 101
    return-void

    .line 102
    :goto_3
    monitor-exit v0

    .line 103
    throw p1
.end method

.method public t()Z
    .locals 2

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/B;->n:Lt/P;

    .line 5
    .line 6
    invoke-static {v1}, La0/g;->f(Lt/P;)I

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    monitor-exit v0

    .line 16
    return v1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0

    .line 19
    throw v1
.end method

.method public u(Lkotlin/jvm/functions/Function2;)LY/Q0;
    .locals 1

    .line 1
    invoke-direct {p0}, LY/B;->E()Z

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LY/B;->L()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, v0, p1}, LY/B;->G(ZLkotlin/jvm/functions/Function2;)LY/Q0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public v()V
    .locals 3

    .line 1
    iget-object v0, p0, LY/B;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LY/B;->k:LZ/a;

    .line 8
    .line 9
    invoke-virtual {v0}, LZ/a;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LY/B;->l:LZ/a;

    .line 13
    .line 14
    invoke-virtual {v0}, LZ/a;->a()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LY/B;->e:Ljava/util/Set;

    .line 18
    .line 19
    check-cast v0, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, LY/B;->u:Lg0/q;

    .line 28
    .line 29
    iget-object v1, p0, LY/B;->e:Ljava/util/Set;

    .line 30
    .line 31
    iget-object v2, p0, LY/B;->v:LY/s;

    .line 32
    .line 33
    invoke-virtual {v2}, LY/s;->K0()Lk0/h;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :try_start_0
    invoke-virtual {v0, v1, v2}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lg0/q;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    invoke-virtual {v0}, Lg0/q;->i()V

    .line 49
    .line 50
    .line 51
    throw v1

    .line 52
    :cond_0
    return-void
.end method

.method public w(LY/f1;Ljava/lang/Object;)LY/l0;
    .locals 3

    .line 1
    invoke-virtual {p1}, LY/f1;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, LY/f1;->F(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, LY/f1;->h()LY/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    invoke-virtual {v0}, LY/b;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v2, p0, LY/B;->f:LY/E1;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, LY/E1;->I(LY/b;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v0

    .line 35
    :try_start_0
    iget-object v2, p0, LY/B;->r:LY/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    monitor-exit v0

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-direct {v2, p1, p2}, LY/B;->X(LY/f1;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-ne p1, v1, :cond_2

    .line 45
    .line 46
    sget-object p1, LY/l0;->d:LY/l0;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_2
    sget-object p1, LY/l0;->a:LY/l0;

    .line 50
    .line 51
    return-object p1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    monitor-exit v0

    .line 54
    throw p1

    .line 55
    :cond_3
    invoke-virtual {p1}, LY/f1;->i()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    sget-object p1, LY/l0;->a:LY/l0;

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_4
    invoke-direct {p0, p1, v0, p2}, LY/B;->Q(LY/f1;LY/b;Ljava/lang/Object;)LY/l0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object p2, LY/l0;->a:LY/l0;

    .line 69
    .line 70
    if-eq p1, p2, :cond_5

    .line 71
    .line 72
    invoke-direct {p0}, LY/B;->S()Lk0/l;

    .line 73
    .line 74
    .line 75
    :cond_5
    return-object p1

    .line 76
    :cond_6
    :goto_0
    sget-object p1, LY/l0;->a:LY/l0;

    .line 77
    .line 78
    return-object p1
.end method

.method public x()V
    .locals 5

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/B;->v:LY/s;

    .line 5
    .line 6
    invoke-virtual {v1}, LY/s;->h0()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LY/B;->e:Ljava/util/Set;

    .line 10
    .line 11
    check-cast v1, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, LY/B;->u:Lg0/q;

    .line 20
    .line 21
    iget-object v2, p0, LY/B;->e:Ljava/util/Set;

    .line 22
    .line 23
    iget-object v3, p0, LY/B;->v:LY/s;

    .line 24
    .line 25
    invoke-virtual {v3}, LY/s;->K0()Lk0/h;

    .line 26
    .line 27
    .line 28
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :try_start_1
    invoke-virtual {v1, v2, v3}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lg0/q;->j()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    .line 35
    :try_start_2
    invoke-virtual {v1}, Lg0/q;->i()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    goto :goto_1

    .line 41
    :catchall_1
    move-exception v2

    .line 42
    invoke-virtual {v1}, Lg0/q;->i()V

    .line 43
    .line 44
    .line 45
    throw v2

    .line 46
    :cond_0
    :goto_0
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :goto_1
    :try_start_3
    iget-object v2, p0, LY/B;->e:Ljava/util/Set;

    .line 51
    .line 52
    check-cast v2, Ljava/util/Collection;

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_1

    .line 59
    .line 60
    iget-object v2, p0, LY/B;->u:Lg0/q;

    .line 61
    .line 62
    iget-object v3, p0, LY/B;->e:Ljava/util/Set;

    .line 63
    .line 64
    iget-object v4, p0, LY/B;->v:LY/s;

    .line 65
    .line 66
    invoke-virtual {v4}, LY/s;->K0()Lk0/h;

    .line 67
    .line 68
    .line 69
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 70
    :try_start_4
    invoke-virtual {v2, v3, v4}, Lg0/q;->r(Ljava/util/Set;Lk0/f;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lg0/q;->j()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 74
    .line 75
    .line 76
    :try_start_5
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_2
    move-exception v1

    .line 81
    goto :goto_3

    .line 82
    :catchall_3
    move-exception v1

    .line 83
    invoke-virtual {v2}, Lg0/q;->i()V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_1
    :goto_2
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 88
    :goto_3
    :try_start_6
    invoke-virtual {p0}, LY/B;->v()V

    .line 89
    .line 90
    .line 91
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 92
    :catchall_4
    move-exception v1

    .line 93
    monitor-exit v0

    .line 94
    throw v1
.end method

.method public y()V
    .locals 6

    .line 1
    iget-object v0, p0, LY/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LY/B;->f:LY/E1;

    .line 5
    .line 6
    invoke-virtual {v1}, LY/E1;->v()[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_2

    .line 13
    .line 14
    aget-object v4, v1, v3

    .line 15
    .line 16
    instance-of v5, v4, LY/f1;

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    check-cast v4, LY/f1;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    const/4 v4, 0x0

    .line 26
    :goto_1
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, LY/f1;->invalidate()V

    .line 29
    .line 30
    .line 31
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    sget-object v1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :goto_2
    monitor-exit v0

    .line 39
    throw v1
.end method
