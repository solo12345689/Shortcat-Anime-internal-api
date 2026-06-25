.class final LY/o1$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY/o1;->G0(Lie/o;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LY/o1;

.field final synthetic e:Lie/o;

.field final synthetic f:LY/t0;


# direct methods
.method constructor <init>(LY/o1;Lie/o;LY/t0;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/o1$f;->d:LY/o1;

    .line 2
    .line 3
    iput-object p2, p0, LY/o1$f;->e:Lie/o;

    .line 4
    .line 5
    iput-object p3, p0, LY/o1$f;->f:LY/t0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(LY/o1;Ljava/util/Set;Li0/l;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/o1$f;->i(LY/o1;Ljava/util/Set;Li0/l;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final i(LY/o1;Ljava/util/Set;Li0/l;)LTd/L;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static/range {p0 .. p0}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    invoke-static/range {p0 .. p0}, LY/o1;->Q(LY/o1;)LJf/u;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, LY/o1$d;

    .line 17
    .line 18
    sget-object v3, LY/o1$d;->e:LY/o1$d;

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ltz v2, :cond_7

    .line 25
    .line 26
    invoke-static/range {p0 .. p0}, LY/o1;->N(LY/o1;)Lt/Q;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    instance-of v3, v0, La0/e;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v3, :cond_4

    .line 34
    .line 35
    check-cast v0, La0/e;

    .line 36
    .line 37
    invoke-virtual {v0}, La0/e;->b()Lt/e0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v3, v0, Lt/e0;->b:[Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v0, v0, Lt/e0;->a:[J

    .line 44
    .line 45
    array-length v5, v0

    .line 46
    add-int/lit8 v5, v5, -0x2

    .line 47
    .line 48
    if-ltz v5, :cond_6

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    move v7, v6

    .line 52
    :goto_0
    aget-wide v8, v0, v7

    .line 53
    .line 54
    not-long v10, v8

    .line 55
    const/4 v12, 0x7

    .line 56
    shl-long/2addr v10, v12

    .line 57
    and-long/2addr v10, v8

    .line 58
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    and-long/2addr v10, v12

    .line 64
    cmp-long v10, v10, v12

    .line 65
    .line 66
    if-eqz v10, :cond_3

    .line 67
    .line 68
    sub-int v10, v7, v5

    .line 69
    .line 70
    not-int v10, v10

    .line 71
    ushr-int/lit8 v10, v10, 0x1f

    .line 72
    .line 73
    const/16 v11, 0x8

    .line 74
    .line 75
    rsub-int/lit8 v10, v10, 0x8

    .line 76
    .line 77
    move v12, v6

    .line 78
    :goto_1
    if-ge v12, v10, :cond_2

    .line 79
    .line 80
    const-wide/16 v13, 0xff

    .line 81
    .line 82
    and-long/2addr v13, v8

    .line 83
    const-wide/16 v15, 0x80

    .line 84
    .line 85
    cmp-long v13, v13, v15

    .line 86
    .line 87
    if-gez v13, :cond_1

    .line 88
    .line 89
    shl-int/lit8 v13, v7, 0x3

    .line 90
    .line 91
    add-int/2addr v13, v12

    .line 92
    aget-object v13, v3, v13

    .line 93
    .line 94
    instance-of v14, v13, Li0/V;

    .line 95
    .line 96
    if-eqz v14, :cond_0

    .line 97
    .line 98
    move-object v14, v13

    .line 99
    check-cast v14, Li0/V;

    .line 100
    .line 101
    invoke-static {v4}, Li0/h;->a(I)I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    invoke-virtual {v14, v15}, Li0/V;->q(I)Z

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    if-nez v14, :cond_0

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    goto :goto_5

    .line 114
    :cond_0
    invoke-virtual {v2, v13}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_1
    :goto_2
    shr-long/2addr v8, v11

    .line 118
    add-int/lit8 v12, v12, 0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    if-ne v10, v11, :cond_6

    .line 122
    .line 123
    :cond_3
    if-eq v7, v5, :cond_6

    .line 124
    .line 125
    add-int/lit8 v7, v7, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    check-cast v0, Ljava/lang/Iterable;

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_6

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    instance-of v5, v3, Li0/V;

    .line 145
    .line 146
    if-eqz v5, :cond_5

    .line 147
    .line 148
    move-object v5, v3

    .line 149
    check-cast v5, Li0/V;

    .line 150
    .line 151
    invoke-static {v4}, Li0/h;->a(I)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-virtual {v5, v6}, Li0/V;->q(I)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-nez v5, :cond_5

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    invoke-virtual {v2, v3}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    invoke-static/range {p0 .. p0}, LY/o1;->D(LY/o1;)LGf/n;

    .line 167
    .line 168
    .line 169
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    goto :goto_4

    .line 171
    :cond_7
    const/4 v0, 0x0

    .line 172
    :goto_4
    monitor-exit v1

    .line 173
    if-eqz v0, :cond_8

    .line 174
    .line 175
    sget-object v1, LTd/u;->b:LTd/u$a;

    .line 176
    .line 177
    sget-object v1, LTd/L;->a:LTd/L;

    .line 178
    .line 179
    invoke-static {v1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-interface {v0, v1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_8
    sget-object v0, LTd/L;->a:LTd/L;

    .line 187
    .line 188
    return-object v0

    .line 189
    :goto_5
    monitor-exit v1

    .line 190
    throw v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 4

    .line 1
    new-instance v0, LY/o1$f;

    .line 2
    .line 3
    iget-object v1, p0, LY/o1$f;->d:LY/o1;

    .line 4
    .line 5
    iget-object v2, p0, LY/o1$f;->e:Lie/o;

    .line 6
    .line 7
    iget-object v3, p0, LY/o1$f;->f:LY/t0;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, LY/o1$f;-><init>(LY/o1;Lie/o;LY/t0;LZd/e;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LY/o1$f;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LY/o1$f;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LY/o1$f;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LY/o1$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LY/o1$f;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LY/o1$f;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LY/o1$f;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Li0/g;

    .line 16
    .line 17
    iget-object v1, p0, LY/o1$f;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LGf/C0;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, LY/o1$f;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, LGf/O;

    .line 42
    .line 43
    invoke-interface {p1}, LGf/O;->getCoroutineContext()LZd/i;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, LGf/F0;->k(LZd/i;)LGf/C0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object p1, p0, LY/o1$f;->d:LY/o1;

    .line 52
    .line 53
    invoke-static {p1, v1}, LY/o1;->X(LY/o1;LGf/C0;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Li0/l;->e:Li0/l$a;

    .line 57
    .line 58
    iget-object v4, p0, LY/o1$f;->d:LY/o1;

    .line 59
    .line 60
    new-instance v5, LY/p1;

    .line 61
    .line 62
    invoke-direct {v5, v4}, LY/p1;-><init>(LY/o1;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v5}, Li0/l$a;->h(Lkotlin/jvm/functions/Function2;)Li0/g;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v4, LY/o1;->C:LY/o1$a;

    .line 70
    .line 71
    iget-object v5, p0, LY/o1$f;->d:LY/o1;

    .line 72
    .line 73
    invoke-static {v5}, LY/o1;->K(LY/o1;)LY/o1$c;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v4, v5}, LY/o1$a;->a(LY/o1$a;LY/o1$c;)V

    .line 78
    .line 79
    .line 80
    :try_start_1
    iget-object v4, p0, LY/o1$f;->d:LY/o1;

    .line 81
    .line 82
    invoke-static {v4}, LY/o1;->R(LY/o1;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    const/4 v6, 0x0

    .line 91
    :goto_0
    if-ge v6, v5, :cond_2

    .line 92
    .line 93
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, LY/Q;

    .line 98
    .line 99
    invoke-interface {v7}, LY/Q;->y()V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    move-object v8, v0

    .line 107
    move-object v0, p1

    .line 108
    move-object p1, v8

    .line 109
    goto :goto_4

    .line 110
    :cond_2
    new-instance v4, LY/o1$f$a;

    .line 111
    .line 112
    iget-object v5, p0, LY/o1$f;->e:Lie/o;

    .line 113
    .line 114
    iget-object v6, p0, LY/o1$f;->f:LY/t0;

    .line 115
    .line 116
    invoke-direct {v4, v5, v6, v2}, LY/o1$f$a;-><init>(Lie/o;LY/t0;LZd/e;)V

    .line 117
    .line 118
    .line 119
    iput-object v1, p0, LY/o1$f;->c:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object p1, p0, LY/o1$f;->a:Ljava/lang/Object;

    .line 122
    .line 123
    iput v3, p0, LY/o1$f;->b:I

    .line 124
    .line 125
    invoke-static {v4, p0}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    if-ne v3, v0, :cond_3

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_3
    move-object v0, p1

    .line 133
    :goto_1
    invoke-interface {v0}, Li0/g;->dispose()V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, LY/o1$f;->d:LY/o1;

    .line 137
    .line 138
    invoke-static {p1}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object v0, p0, LY/o1$f;->d:LY/o1;

    .line 143
    .line 144
    monitor-enter p1

    .line 145
    :try_start_2
    invoke-static {v0}, LY/o1;->L(LY/o1;)LGf/C0;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    if-ne v3, v1, :cond_4

    .line 150
    .line 151
    invoke-static {v0, v2}, LY/o1;->a0(LY/o1;LGf/C0;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :catchall_2
    move-exception v0

    .line 156
    goto :goto_3

    .line 157
    :cond_4
    :goto_2
    invoke-static {v0}, LY/o1;->D(LY/o1;)LGf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 158
    .line 159
    .line 160
    monitor-exit p1

    .line 161
    sget-object p1, LY/o1;->C:LY/o1$a;

    .line 162
    .line 163
    iget-object v0, p0, LY/o1$f;->d:LY/o1;

    .line 164
    .line 165
    invoke-static {v0}, LY/o1;->K(LY/o1;)LY/o1$c;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p1, v0}, LY/o1$a;->b(LY/o1$a;LY/o1$c;)V

    .line 170
    .line 171
    .line 172
    sget-object p1, LTd/L;->a:LTd/L;

    .line 173
    .line 174
    return-object p1

    .line 175
    :goto_3
    monitor-exit p1

    .line 176
    throw v0

    .line 177
    :goto_4
    invoke-interface {v0}, Li0/g;->dispose()V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, LY/o1$f;->d:LY/o1;

    .line 181
    .line 182
    invoke-static {v0}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v3, p0, LY/o1$f;->d:LY/o1;

    .line 187
    .line 188
    monitor-enter v0

    .line 189
    :try_start_3
    invoke-static {v3}, LY/o1;->L(LY/o1;)LGf/C0;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    if-ne v4, v1, :cond_5

    .line 194
    .line 195
    invoke-static {v3, v2}, LY/o1;->a0(LY/o1;LGf/C0;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :catchall_3
    move-exception p1

    .line 200
    goto :goto_6

    .line 201
    :cond_5
    :goto_5
    invoke-static {v3}, LY/o1;->D(LY/o1;)LGf/n;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 202
    .line 203
    .line 204
    monitor-exit v0

    .line 205
    sget-object v0, LY/o1;->C:LY/o1$a;

    .line 206
    .line 207
    iget-object v1, p0, LY/o1$f;->d:LY/o1;

    .line 208
    .line 209
    invoke-static {v1}, LY/o1;->K(LY/o1;)LY/o1$c;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v0, v1}, LY/o1$a;->b(LY/o1$a;LY/o1$c;)V

    .line 214
    .line 215
    .line 216
    throw p1

    .line 217
    :goto_6
    monitor-exit v0

    .line 218
    throw p1
.end method
