.class final LY/X1$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY/X1;->d(Lie/a;)LJf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:I

.field g:I

.field private synthetic h:Ljava/lang/Object;

.field final synthetic i:Lie/a;


# direct methods
.method constructor <init>(Lie/a;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/X1$b;->i:Lie/a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic a(LIf/g;Ljava/util/Set;Li0/l;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LY/X1$b;->s(LIf/g;Ljava/util/Set;Li0/l;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Lt/Q;Ljava/lang/Object;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY/X1$b;->k(Lt/Q;Ljava/lang/Object;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final k(Lt/Q;Ljava/lang/Object;)LTd/L;
    .locals 2

    .line 1
    instance-of v0, p1, Li0/V;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Li0/V;

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    invoke-static {v1}, Li0/h;->a(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, v1}, Li0/V;->s(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    sget-object p0, LTd/L;->a:LTd/L;

    .line 20
    .line 21
    return-object p0
.end method

.method private static final s(LIf/g;Ljava/util/Set;Li0/l;)LTd/L;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    instance-of v1, v0, La0/e;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, La0/e;

    .line 10
    .line 11
    invoke-virtual {v1}, La0/e;->b()Lt/e0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v3, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v1, v1, Lt/e0;->a:[J

    .line 18
    .line 19
    array-length v4, v1

    .line 20
    add-int/lit8 v4, v4, -0x2

    .line 21
    .line 22
    if-ltz v4, :cond_7

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    move v6, v5

    .line 26
    :goto_0
    aget-wide v7, v1, v6

    .line 27
    .line 28
    not-long v9, v7

    .line 29
    const/4 v11, 0x7

    .line 30
    shl-long/2addr v9, v11

    .line 31
    and-long/2addr v9, v7

    .line 32
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v9, v11

    .line 38
    cmp-long v9, v9, v11

    .line 39
    .line 40
    if-eqz v9, :cond_2

    .line 41
    .line 42
    sub-int v9, v6, v4

    .line 43
    .line 44
    not-int v9, v9

    .line 45
    ushr-int/lit8 v9, v9, 0x1f

    .line 46
    .line 47
    const/16 v10, 0x8

    .line 48
    .line 49
    rsub-int/lit8 v9, v9, 0x8

    .line 50
    .line 51
    move v11, v5

    .line 52
    :goto_1
    if-ge v11, v9, :cond_1

    .line 53
    .line 54
    const-wide/16 v12, 0xff

    .line 55
    .line 56
    and-long/2addr v12, v7

    .line 57
    const-wide/16 v14, 0x80

    .line 58
    .line 59
    cmp-long v12, v12, v14

    .line 60
    .line 61
    if-gez v12, :cond_0

    .line 62
    .line 63
    shl-int/lit8 v12, v6, 0x3

    .line 64
    .line 65
    add-int/2addr v12, v11

    .line 66
    aget-object v12, v3, v12

    .line 67
    .line 68
    instance-of v13, v12, Li0/V;

    .line 69
    .line 70
    if-eqz v13, :cond_6

    .line 71
    .line 72
    check-cast v12, Li0/V;

    .line 73
    .line 74
    invoke-static {v2}, Li0/h;->a(I)I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    invoke-virtual {v12, v13}, Li0/V;->q(I)Z

    .line 79
    .line 80
    .line 81
    move-result v12

    .line 82
    if-eqz v12, :cond_0

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_0
    shr-long/2addr v7, v10

    .line 86
    add-int/lit8 v11, v11, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    if-ne v9, v10, :cond_7

    .line 90
    .line 91
    :cond_2
    if-eq v6, v4, :cond_7

    .line 92
    .line 93
    add-int/lit8 v6, v6, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    move-object v1, v0

    .line 97
    check-cast v1, Ljava/lang/Iterable;

    .line 98
    .line 99
    instance-of v3, v1, Ljava/util/Collection;

    .line 100
    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    move-object v3, v1

    .line 104
    check-cast v3, Ljava/util/Collection;

    .line 105
    .line 106
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_7

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    instance-of v4, v3, Li0/V;

    .line 128
    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    check-cast v3, Li0/V;

    .line 132
    .line 133
    invoke-static {v2}, Li0/h;->a(I)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-virtual {v3, v4}, Li0/V;->q(I)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    :cond_6
    :goto_2
    invoke-interface/range {p0 .. p1}, LIf/w;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_7
    :goto_3
    sget-object v0, LTd/L;->a:LTd/L;

    .line 147
    .line 148
    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, LY/X1$b;

    .line 2
    .line 3
    iget-object v1, p0, LY/X1$b;->i:Lie/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LY/X1$b;-><init>(Lie/a;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LY/X1$b;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LJf/f;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LY/X1$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LY/X1$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LY/X1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LJf/f;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LY/X1$b;->invoke(LJf/f;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LY/X1$b;->g:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_0

    .line 14
    .line 15
    if-eq v1, v3, :cond_2

    .line 16
    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, LY/X1$b;->e:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v6, p0, LY/X1$b;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, Li0/g;

    .line 24
    .line 25
    iget-object v7, p0, LY/X1$b;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, LIf/g;

    .line 28
    .line 29
    iget-object v8, p0, LY/X1$b;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iget-object v9, p0, LY/X1$b;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v9, Lt/Q;

    .line 36
    .line 37
    iget-object v10, p0, LY/X1$b;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v10, LJf/f;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto/16 :goto_7

    .line 48
    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget v1, p0, LY/X1$b;->f:I

    .line 58
    .line 59
    iget-object v6, p0, LY/X1$b;->e:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v7, p0, LY/X1$b;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v7, Li0/g;

    .line 64
    .line 65
    iget-object v8, p0, LY/X1$b;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v8, LIf/g;

    .line 68
    .line 69
    iget-object v9, p0, LY/X1$b;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    iget-object v10, p0, LY/X1$b;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v10, Lt/Q;

    .line 76
    .line 77
    iget-object v11, p0, LY/X1$b;->h:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v11, LJf/f;

    .line 80
    .line 81
    :try_start_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :catchall_1
    move-exception p1

    .line 87
    move-object v6, v7

    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_3
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, LY/X1$b;->h:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v10, p1

    .line 96
    check-cast v10, LJf/f;

    .line 97
    .line 98
    new-instance v9, Lt/Q;

    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    invoke-direct {v9, v4, v5, p1}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 102
    .line 103
    .line 104
    new-instance v8, LY/Y1;

    .line 105
    .line 106
    invoke-direct {v8, v9}, LY/Y1;-><init>(Lt/Q;)V

    .line 107
    .line 108
    .line 109
    const v1, 0x7fffffff

    .line 110
    .line 111
    .line 112
    const/4 v6, 0x6

    .line 113
    invoke-static {v1, p1, p1, v6, p1}, LIf/j;->b(ILIf/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LIf/g;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    sget-object p1, Li0/l;->e:Li0/l$a;

    .line 118
    .line 119
    new-instance v1, LY/Z1;

    .line 120
    .line 121
    invoke-direct {v1, v7}, LY/Z1;-><init>(LIf/g;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1}, Li0/l$a;->h(Lkotlin/jvm/functions/Function2;)Li0/g;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    :try_start_2
    invoke-virtual {p1, v8}, Li0/l$a;->o(Lkotlin/jvm/functions/Function1;)Li0/l;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object v1, p0, LY/X1$b;->i:Lie/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    :try_start_3
    invoke-virtual {p1}, Li0/l;->l()Li0/l;

    .line 135
    .line 136
    .line 137
    move-result-object v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 138
    :try_start_4
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 142
    :try_start_5
    invoke-virtual {p1, v11}, Li0/l;->s(Li0/l;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 143
    .line 144
    .line 145
    :try_start_6
    invoke-virtual {p1}, Li0/l;->d()V

    .line 146
    .line 147
    .line 148
    iput-object v10, p0, LY/X1$b;->h:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v9, p0, LY/X1$b;->a:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v8, p0, LY/X1$b;->b:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v7, p0, LY/X1$b;->c:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v6, p0, LY/X1$b;->d:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object v1, p0, LY/X1$b;->e:Ljava/lang/Object;

    .line 159
    .line 160
    iput v5, p0, LY/X1$b;->g:I

    .line 161
    .line 162
    invoke-interface {v10, v1, p0}, LJf/f;->emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ne p1, v0, :cond_4

    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_4
    :goto_0
    iput-object v10, p0, LY/X1$b;->h:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v9, p0, LY/X1$b;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v8, p0, LY/X1$b;->b:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v7, p0, LY/X1$b;->c:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v6, p0, LY/X1$b;->d:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v1, p0, LY/X1$b;->e:Ljava/lang/Object;

    .line 181
    .line 182
    iput v4, p0, LY/X1$b;->f:I

    .line 183
    .line 184
    iput v3, p0, LY/X1$b;->g:I

    .line 185
    .line 186
    invoke-interface {v7, p0}, LIf/v;->a(LZd/e;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 190
    if-ne p1, v0, :cond_5

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_5
    move-object v11, v10

    .line 194
    move-object v10, v9

    .line 195
    move-object v9, v8

    .line 196
    move-object v8, v7

    .line 197
    move-object v7, v6

    .line 198
    move-object v6, v1

    .line 199
    move v1, v4

    .line 200
    :goto_1
    :try_start_7
    check-cast p1, Ljava/util/Set;

    .line 201
    .line 202
    :cond_6
    if-nez v1, :cond_8

    .line 203
    .line 204
    invoke-static {v10, p1}, LY/X1;->a(Lt/Q;Ljava/util/Set;)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_7

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_7
    move v1, v4

    .line 212
    goto :goto_3

    .line 213
    :cond_8
    :goto_2
    move v1, v5

    .line 214
    :goto_3
    invoke-interface {v8}, LIf/v;->f()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {p1}, LIf/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p1, Ljava/util/Set;

    .line 223
    .line 224
    if-nez p1, :cond_6

    .line 225
    .line 226
    if-eqz v1, :cond_9

    .line 227
    .line 228
    invoke-virtual {v10}, Lt/Q;->m()V

    .line 229
    .line 230
    .line 231
    sget-object p1, Li0/l;->e:Li0/l$a;

    .line 232
    .line 233
    invoke-virtual {p1, v9}, Li0/l$a;->o(Lkotlin/jvm/functions/Function1;)Li0/l;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iget-object v1, p0, LY/X1$b;->i:Lie/a;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 238
    .line 239
    :try_start_8
    invoke-virtual {p1}, Li0/l;->l()Li0/l;

    .line 240
    .line 241
    .line 242
    move-result-object v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 243
    :try_start_9
    invoke-interface {v1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 247
    :try_start_a
    invoke-virtual {p1, v12}, Li0/l;->s(Li0/l;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 248
    .line 249
    .line 250
    :try_start_b
    invoke-virtual {p1}, Li0/l;->d()V

    .line 251
    .line 252
    .line 253
    invoke-static {v1, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-nez p1, :cond_9

    .line 258
    .line 259
    iput-object v11, p0, LY/X1$b;->h:Ljava/lang/Object;

    .line 260
    .line 261
    iput-object v10, p0, LY/X1$b;->a:Ljava/lang/Object;

    .line 262
    .line 263
    iput-object v9, p0, LY/X1$b;->b:Ljava/lang/Object;

    .line 264
    .line 265
    iput-object v8, p0, LY/X1$b;->c:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v7, p0, LY/X1$b;->d:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v1, p0, LY/X1$b;->e:Ljava/lang/Object;

    .line 270
    .line 271
    iput v2, p0, LY/X1$b;->g:I

    .line 272
    .line 273
    invoke-interface {v11, v1, p0}, LJf/f;->emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 277
    if-ne p1, v0, :cond_a

    .line 278
    .line 279
    :goto_4
    return-object v0

    .line 280
    :catchall_2
    move-exception v0

    .line 281
    goto :goto_5

    .line 282
    :catchall_3
    move-exception v0

    .line 283
    :try_start_c
    invoke-virtual {p1, v12}, Li0/l;->s(Li0/l;)V

    .line 284
    .line 285
    .line 286
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 287
    :goto_5
    :try_start_d
    invoke-virtual {p1}, Li0/l;->d()V

    .line 288
    .line 289
    .line 290
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 291
    :cond_9
    move-object v1, v6

    .line 292
    :cond_a
    move-object v6, v7

    .line 293
    move-object v7, v8

    .line 294
    move-object v8, v9

    .line 295
    move-object v9, v10

    .line 296
    move-object v10, v11

    .line 297
    goto :goto_0

    .line 298
    :catchall_4
    move-exception v0

    .line 299
    goto :goto_6

    .line 300
    :catchall_5
    move-exception v0

    .line 301
    :try_start_e
    invoke-virtual {p1, v11}, Li0/l;->s(Li0/l;)V

    .line 302
    .line 303
    .line 304
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 305
    :goto_6
    :try_start_f
    invoke-virtual {p1}, Li0/l;->d()V

    .line 306
    .line 307
    .line 308
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 309
    :goto_7
    invoke-interface {v6}, Li0/g;->dispose()V

    .line 310
    .line 311
    .line 312
    throw p1
.end method
