.class final LY/o1$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY/o1;->N0(LZd/e;)Ljava/lang/Object;
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

.field f:Ljava/lang/Object;

.field g:Ljava/lang/Object;

.field h:Ljava/lang/Object;

.field i:I

.field synthetic j:Ljava/lang/Object;

.field final synthetic k:LY/o1;


# direct methods
.method constructor <init>(LY/o1;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY/o1$g;->k:LY/o1;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic a(LY/o1;Lt/Q;Lt/Q;Ljava/util/List;Ljava/util/List;Lt/Q;Ljava/util/List;Lt/Q;Ljava/util/Set;J)LTd/L;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, LY/o1$g;->t(LY/o1;Lt/Q;Lt/Q;Ljava/util/List;Ljava/util/List;Lt/Q;Ljava/util/List;Lt/Q;Ljava/util/Set;J)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final k(LY/o1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt/Q;Lt/Q;Lt/Q;Lt/Q;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    invoke-static {v0}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    monitor-enter v4

    .line 14
    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->clear()V

    .line 15
    .line 16
    .line 17
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    .line 20
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->size()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    const/4 v7, 0x0

    .line 25
    :goto_0
    if-ge v7, v5, :cond_0

    .line 26
    .line 27
    move-object/from16 v8, p3

    .line 28
    .line 29
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    check-cast v9, LY/Q;

    .line 34
    .line 35
    invoke-interface {v9}, LY/Q;->v()V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v9}, LY/o1;->W(LY/o1;LY/Q;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v7, v7, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :cond_0
    move-object/from16 v8, p3

    .line 48
    .line 49
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 50
    .line 51
    .line 52
    iget-object v5, v1, Lt/e0;->b:[Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v7, v1, Lt/e0;->a:[J

    .line 55
    .line 56
    array-length v8, v7

    .line 57
    add-int/lit8 v8, v8, -0x2

    .line 58
    .line 59
    const/16 v6, 0x8

    .line 60
    .line 61
    const-wide/16 p2, 0x80

    .line 62
    .line 63
    if-ltz v8, :cond_4

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    const-wide/16 v16, 0xff

    .line 67
    .line 68
    :goto_1
    aget-wide v11, v7, v9

    .line 69
    .line 70
    const/4 v10, 0x7

    .line 71
    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    not-long v13, v11

    .line 77
    shl-long/2addr v13, v10

    .line 78
    and-long/2addr v13, v11

    .line 79
    and-long v13, v13, v18

    .line 80
    .line 81
    cmp-long v13, v13, v18

    .line 82
    .line 83
    if-eqz v13, :cond_3

    .line 84
    .line 85
    sub-int v13, v9, v8

    .line 86
    .line 87
    not-int v13, v13

    .line 88
    ushr-int/lit8 v13, v13, 0x1f

    .line 89
    .line 90
    rsub-int/lit8 v13, v13, 0x8

    .line 91
    .line 92
    const/4 v14, 0x0

    .line 93
    :goto_2
    if-ge v14, v13, :cond_2

    .line 94
    .line 95
    and-long v20, v11, v16

    .line 96
    .line 97
    cmp-long v15, v20, p2

    .line 98
    .line 99
    if-gez v15, :cond_1

    .line 100
    .line 101
    shl-int/lit8 v15, v9, 0x3

    .line 102
    .line 103
    add-int/2addr v15, v14

    .line 104
    aget-object v15, v5, v15

    .line 105
    .line 106
    check-cast v15, LY/Q;

    .line 107
    .line 108
    invoke-interface {v15}, LY/Q;->v()V

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v15}, LY/o1;->W(LY/o1;LY/Q;)V

    .line 112
    .line 113
    .line 114
    :cond_1
    shr-long/2addr v11, v6

    .line 115
    add-int/lit8 v14, v14, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_2
    if-ne v13, v6, :cond_5

    .line 119
    .line 120
    :cond_3
    if-eq v9, v8, :cond_5

    .line 121
    .line 122
    add-int/lit8 v9, v9, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    const/4 v10, 0x7

    .line 126
    const-wide/16 v16, 0xff

    .line 127
    .line 128
    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-virtual {v1}, Lt/Q;->m()V

    .line 134
    .line 135
    .line 136
    iget-object v1, v2, Lt/e0;->b:[Ljava/lang/Object;

    .line 137
    .line 138
    iget-object v5, v2, Lt/e0;->a:[J

    .line 139
    .line 140
    array-length v7, v5

    .line 141
    add-int/lit8 v7, v7, -0x2

    .line 142
    .line 143
    if-ltz v7, :cond_9

    .line 144
    .line 145
    const/4 v8, 0x0

    .line 146
    :goto_3
    aget-wide v11, v5, v8

    .line 147
    .line 148
    not-long v13, v11

    .line 149
    shl-long/2addr v13, v10

    .line 150
    and-long/2addr v13, v11

    .line 151
    and-long v13, v13, v18

    .line 152
    .line 153
    cmp-long v9, v13, v18

    .line 154
    .line 155
    if-eqz v9, :cond_8

    .line 156
    .line 157
    sub-int v9, v8, v7

    .line 158
    .line 159
    not-int v9, v9

    .line 160
    ushr-int/lit8 v9, v9, 0x1f

    .line 161
    .line 162
    rsub-int/lit8 v9, v9, 0x8

    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    :goto_4
    if-ge v13, v9, :cond_7

    .line 166
    .line 167
    and-long v14, v11, v16

    .line 168
    .line 169
    cmp-long v14, v14, p2

    .line 170
    .line 171
    if-gez v14, :cond_6

    .line 172
    .line 173
    shl-int/lit8 v14, v8, 0x3

    .line 174
    .line 175
    add-int/2addr v14, v13

    .line 176
    aget-object v14, v1, v14

    .line 177
    .line 178
    check-cast v14, LY/Q;

    .line 179
    .line 180
    invoke-interface {v14}, LY/Q;->x()V

    .line 181
    .line 182
    .line 183
    :cond_6
    shr-long/2addr v11, v6

    .line 184
    add-int/lit8 v13, v13, 0x1

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_7
    if-ne v9, v6, :cond_9

    .line 188
    .line 189
    :cond_8
    if-eq v8, v7, :cond_9

    .line 190
    .line 191
    add-int/lit8 v8, v8, 0x1

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_9
    invoke-virtual {v2}, Lt/Q;->m()V

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {p6 .. p6}, Lt/Q;->m()V

    .line 198
    .line 199
    .line 200
    iget-object v1, v3, Lt/e0;->b:[Ljava/lang/Object;

    .line 201
    .line 202
    iget-object v2, v3, Lt/e0;->a:[J

    .line 203
    .line 204
    array-length v5, v2

    .line 205
    add-int/lit8 v5, v5, -0x2

    .line 206
    .line 207
    if-ltz v5, :cond_d

    .line 208
    .line 209
    const/4 v7, 0x0

    .line 210
    :goto_5
    aget-wide v8, v2, v7

    .line 211
    .line 212
    not-long v11, v8

    .line 213
    shl-long/2addr v11, v10

    .line 214
    and-long/2addr v11, v8

    .line 215
    and-long v11, v11, v18

    .line 216
    .line 217
    cmp-long v11, v11, v18

    .line 218
    .line 219
    if-eqz v11, :cond_c

    .line 220
    .line 221
    sub-int v11, v7, v5

    .line 222
    .line 223
    not-int v11, v11

    .line 224
    ushr-int/lit8 v11, v11, 0x1f

    .line 225
    .line 226
    rsub-int/lit8 v11, v11, 0x8

    .line 227
    .line 228
    const/4 v12, 0x0

    .line 229
    :goto_6
    if-ge v12, v11, :cond_b

    .line 230
    .line 231
    and-long v13, v8, v16

    .line 232
    .line 233
    cmp-long v13, v13, p2

    .line 234
    .line 235
    if-gez v13, :cond_a

    .line 236
    .line 237
    shl-int/lit8 v13, v7, 0x3

    .line 238
    .line 239
    add-int/2addr v13, v12

    .line 240
    aget-object v13, v1, v13

    .line 241
    .line 242
    check-cast v13, LY/Q;

    .line 243
    .line 244
    invoke-interface {v13}, LY/Q;->v()V

    .line 245
    .line 246
    .line 247
    invoke-static {v0, v13}, LY/o1;->W(LY/o1;LY/Q;)V

    .line 248
    .line 249
    .line 250
    :cond_a
    shr-long/2addr v8, v6

    .line 251
    add-int/lit8 v12, v12, 0x1

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_b
    if-ne v11, v6, :cond_d

    .line 255
    .line 256
    :cond_c
    if-eq v7, v5, :cond_d

    .line 257
    .line 258
    add-int/lit8 v7, v7, 0x1

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_d
    invoke-virtual {v3}, Lt/Q;->m()V

    .line 262
    .line 263
    .line 264
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 265
    .line 266
    monitor-exit v4

    .line 267
    return-void

    .line 268
    :goto_7
    monitor-exit v4

    .line 269
    throw v0
.end method

.method private static final s(Ljava/util/List;LY/o1;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-static {p1}, LY/o1;->J(LY/o1;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, LY/y0;

    .line 25
    .line 26
    invoke-interface {p0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-static {p1}, LY/o1;->J(LY/o1;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Ljava/util/List;->clear()V

    .line 39
    .line 40
    .line 41
    sget-object p0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit v0

    .line 46
    throw p0
.end method

.method private static final t(LY/o1;Lt/Q;Lt/Q;Ljava/util/List;Ljava/util/List;Lt/Q;Ljava/util/List;Lt/Q;Ljava/util/Set;J)LTd/L;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    move-object/from16 v8, p6

    .line 6
    .line 7
    move-object/from16 v9, p7

    .line 8
    .line 9
    invoke-static {v1}, LY/o1;->H(LY/o1;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "Recomposer:animation"

    .line 16
    .line 17
    sget-object v2, Lg0/x;->a:Lg0/x;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Lg0/x;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :try_start_0
    invoke-static {v1}, LY/o1;->F(LY/o1;)LY/e;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-wide/from16 v4, p9

    .line 28
    .line 29
    invoke-virtual {v0, v4, v5}, LY/e;->p(J)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 33
    .line 34
    invoke-virtual {v0}, Li0/l$a;->m()V

    .line 35
    .line 36
    .line 37
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    sget-object v1, Lg0/x;->a:Lg0/x;

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_0
    :goto_0
    const-string v0, "Recomposer:recompose"

    .line 51
    .line 52
    sget-object v2, Lg0/x;->a:Lg0/x;

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Lg0/x;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    :try_start_1
    invoke-static {v1}, LY/o1;->V(LY/o1;)Z

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 66
    :try_start_2
    invoke-static {v1}, LY/o1;->G(LY/o1;)La0/c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v3, v0, La0/c;->a:[Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {v0}, La0/c;->p()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v4, 0x0

    .line 77
    move v5, v4

    .line 78
    :goto_1
    if-ge v5, v0, :cond_1

    .line 79
    .line 80
    aget-object v6, v3, v5

    .line 81
    .line 82
    check-cast v6, LY/Q;

    .line 83
    .line 84
    invoke-interface {v7, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    add-int/lit8 v5, v5, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    move-exception v0

    .line 91
    goto/16 :goto_21

    .line 92
    .line 93
    :cond_1
    invoke-static {v1}, LY/o1;->G(LY/o1;)La0/c;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, La0/c;->i()V

    .line 98
    .line 99
    .line 100
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    .line 102
    :try_start_3
    monitor-exit v2

    .line 103
    invoke-virtual/range {p1 .. p1}, Lt/Q;->m()V

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {p2 .. p2}, Lt/Q;->m()V

    .line 107
    .line 108
    .line 109
    :goto_2
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    const/4 v2, 0x0

    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    invoke-interface/range {p4 .. p4}, Ljava/util/Collection;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    :cond_2
    move-object/from16 v11, p4

    .line 123
    .line 124
    move-object/from16 v12, p5

    .line 125
    .line 126
    move-object v9, v7

    .line 127
    move-object v13, v8

    .line 128
    move-object/from16 v7, p1

    .line 129
    .line 130
    move-object/from16 v8, p2

    .line 131
    .line 132
    goto/16 :goto_14

    .line 133
    .line 134
    :cond_3
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 135
    .line 136
    invoke-virtual {v0}, Li0/l$a;->c()Li0/l;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    instance-of v3, v0, Li0/d;

    .line 141
    .line 142
    if-eqz v3, :cond_4

    .line 143
    .line 144
    new-instance v11, Li0/Y;

    .line 145
    .line 146
    move-object v12, v0

    .line 147
    check-cast v12, Li0/d;

    .line 148
    .line 149
    const/4 v15, 0x1

    .line 150
    const/16 v16, 0x0

    .line 151
    .line 152
    const/4 v13, 0x0

    .line 153
    const/4 v14, 0x0

    .line 154
    invoke-direct/range {v11 .. v16}, Li0/Y;-><init>(Li0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :catchall_2
    move-exception v0

    .line 159
    goto/16 :goto_22

    .line 160
    .line 161
    :cond_4
    new-instance v11, Li0/Z;

    .line 162
    .line 163
    const/4 v3, 0x1

    .line 164
    invoke-direct {v11, v0, v2, v3, v4}, Li0/Z;-><init>(Li0/l;Lkotlin/jvm/functions/Function1;ZZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 165
    .line 166
    .line 167
    :goto_3
    :try_start_4
    invoke-virtual {v11}, Li0/l;->l()Li0/l;

    .line 168
    .line 169
    .line 170
    move-result-object v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 171
    :try_start_5
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_7

    .line 176
    .line 177
    invoke-virtual {v1}, LY/o1;->m0()J

    .line 178
    .line 179
    .line 180
    move-result-wide v5

    .line 181
    const-wide/16 v13, 0x1

    .line 182
    .line 183
    add-long/2addr v5, v13

    .line 184
    invoke-static {v1, v5, v6}, LY/o1;->Y(LY/o1;J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 185
    .line 186
    .line 187
    :try_start_6
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    move v3, v4

    .line 192
    :goto_4
    if-ge v3, v0, :cond_5

    .line 193
    .line 194
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, LY/Q;

    .line 199
    .line 200
    invoke-virtual {v9, v5}, Lt/Q;->h(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    add-int/lit8 v3, v3, 0x1

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :catchall_3
    move-exception v0

    .line 207
    move-object v2, v0

    .line 208
    goto :goto_6

    .line 209
    :cond_5
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    move v3, v4

    .line 214
    :goto_5
    if-ge v3, v0, :cond_6

    .line 215
    .line 216
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    check-cast v5, LY/Q;

    .line 221
    .line 222
    invoke-interface {v5}, LY/Q;->p()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 223
    .line 224
    .line 225
    add-int/lit8 v3, v3, 0x1

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_6
    :try_start_7
    invoke-interface {v8}, Ljava/util/List;->clear()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 229
    .line 230
    .line 231
    :cond_7
    move-object/from16 v7, p5

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :catchall_4
    move-exception v0

    .line 235
    goto/16 :goto_12

    .line 236
    .line 237
    :goto_6
    const/4 v5, 0x6

    .line 238
    const/4 v6, 0x0

    .line 239
    const/4 v3, 0x0

    .line 240
    const/4 v4, 0x0

    .line 241
    :try_start_8
    invoke-static/range {v1 .. v6}, LY/o1;->D0(LY/o1;Ljava/lang/Throwable;LY/Q;ZILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    move-object/from16 v1, p0

    .line 245
    .line 246
    move-object/from16 v3, p4

    .line 247
    .line 248
    move-object/from16 v5, p5

    .line 249
    .line 250
    move-object v2, v7

    .line 251
    move-object v4, v8

    .line 252
    move-object v6, v9

    .line 253
    move-object/from16 v7, p1

    .line 254
    .line 255
    move-object/from16 v8, p2

    .line 256
    .line 257
    invoke-static/range {v1 .. v8}, LY/o1$g;->k(LY/o1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt/Q;Lt/Q;Lt/Q;Lt/Q;)V

    .line 258
    .line 259
    .line 260
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 261
    .line 262
    :try_start_9
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->clear()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 263
    .line 264
    .line 265
    :try_start_a
    invoke-virtual {v11, v12}, Li0/l;->s(Li0/l;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 266
    .line 267
    .line 268
    :try_start_b
    invoke-virtual {v11}, Li0/l;->d()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 269
    .line 270
    .line 271
    sget-object v1, Lg0/x;->a:Lg0/x;

    .line 272
    .line 273
    invoke-virtual {v1, v10}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    return-object v0

    .line 277
    :catchall_5
    move-exception v0

    .line 278
    goto/16 :goto_13

    .line 279
    .line 280
    :catchall_6
    move-exception v0

    .line 281
    :try_start_c
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->clear()V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :goto_7
    invoke-virtual {v7}, Lt/e0;->e()Z

    .line 286
    .line 287
    .line 288
    move-result v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 289
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    const/16 v3, 0x8

    .line 295
    .line 296
    if-eqz v0, :cond_d

    .line 297
    .line 298
    :try_start_d
    invoke-virtual {v9, v7}, Lt/Q;->x(Lt/e0;)V

    .line 299
    .line 300
    .line 301
    iget-object v0, v7, Lt/e0;->b:[Ljava/lang/Object;

    .line 302
    .line 303
    iget-object v8, v7, Lt/e0;->a:[J

    .line 304
    .line 305
    const/16 p8, 0x7

    .line 306
    .line 307
    array-length v1, v8

    .line 308
    add-int/lit8 v1, v1, -0x2

    .line 309
    .line 310
    const-wide/16 v17, 0x80

    .line 311
    .line 312
    if-ltz v1, :cond_b

    .line 313
    .line 314
    :goto_8
    aget-wide v5, v8, v4

    .line 315
    .line 316
    const-wide/16 v19, 0xff

    .line 317
    .line 318
    not-long v13, v5

    .line 319
    shl-long v13, v13, p8

    .line 320
    .line 321
    and-long/2addr v13, v5

    .line 322
    and-long/2addr v13, v15

    .line 323
    cmp-long v13, v13, v15

    .line 324
    .line 325
    if-eqz v13, :cond_a

    .line 326
    .line 327
    sub-int v13, v4, v1

    .line 328
    .line 329
    not-int v13, v13

    .line 330
    ushr-int/lit8 v13, v13, 0x1f

    .line 331
    .line 332
    rsub-int/lit8 v13, v13, 0x8

    .line 333
    .line 334
    const/4 v14, 0x0

    .line 335
    :goto_9
    if-ge v14, v13, :cond_9

    .line 336
    .line 337
    and-long v21, v5, v19

    .line 338
    .line 339
    cmp-long v21, v21, v17

    .line 340
    .line 341
    if-gez v21, :cond_8

    .line 342
    .line 343
    shl-int/lit8 v21, v4, 0x3

    .line 344
    .line 345
    add-int v21, v21, v14

    .line 346
    .line 347
    aget-object v21, v0, v21

    .line 348
    .line 349
    check-cast v21, LY/Q;

    .line 350
    .line 351
    invoke-interface/range {v21 .. v21}, LY/Q;->c()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 352
    .line 353
    .line 354
    goto :goto_a

    .line 355
    :catchall_7
    move-exception v0

    .line 356
    move-object v2, v0

    .line 357
    goto :goto_b

    .line 358
    :cond_8
    :goto_a
    shr-long/2addr v5, v3

    .line 359
    add-int/lit8 v14, v14, 0x1

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_9
    if-ne v13, v3, :cond_c

    .line 363
    .line 364
    :cond_a
    if-eq v4, v1, :cond_c

    .line 365
    .line 366
    add-int/lit8 v4, v4, 0x1

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_b
    const-wide/16 v19, 0xff

    .line 370
    .line 371
    :cond_c
    :try_start_e
    invoke-virtual {v7}, Lt/Q;->m()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 372
    .line 373
    .line 374
    goto :goto_c

    .line 375
    :goto_b
    const/4 v5, 0x6

    .line 376
    const/4 v6, 0x0

    .line 377
    const/4 v3, 0x0

    .line 378
    const/4 v4, 0x0

    .line 379
    move-object/from16 v1, p0

    .line 380
    .line 381
    :try_start_f
    invoke-static/range {v1 .. v6}, LY/o1;->D0(LY/o1;Ljava/lang/Throwable;LY/Q;ZILjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v8, p2

    .line 385
    .line 386
    move-object/from16 v2, p3

    .line 387
    .line 388
    move-object/from16 v3, p4

    .line 389
    .line 390
    move-object/from16 v4, p6

    .line 391
    .line 392
    move-object v5, v7

    .line 393
    move-object v6, v9

    .line 394
    move-object/from16 v7, p1

    .line 395
    .line 396
    invoke-static/range {v1 .. v8}, LY/o1$g;->k(LY/o1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt/Q;Lt/Q;Lt/Q;Lt/Q;)V

    .line 397
    .line 398
    .line 399
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 400
    .line 401
    :try_start_10
    invoke-virtual/range {p5 .. p5}, Lt/Q;->m()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 402
    .line 403
    .line 404
    :try_start_11
    invoke-virtual {v11, v12}, Li0/l;->s(Li0/l;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 405
    .line 406
    .line 407
    :try_start_12
    invoke-virtual {v11}, Li0/l;->d()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 408
    .line 409
    .line 410
    sget-object v1, Lg0/x;->a:Lg0/x;

    .line 411
    .line 412
    invoke-virtual {v1, v10}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :catchall_8
    move-exception v0

    .line 417
    :try_start_13
    invoke-virtual/range {p5 .. p5}, Lt/Q;->m()V

    .line 418
    .line 419
    .line 420
    throw v0

    .line 421
    :cond_d
    const/16 p8, 0x7

    .line 422
    .line 423
    const-wide/16 v17, 0x80

    .line 424
    .line 425
    const-wide/16 v19, 0xff

    .line 426
    .line 427
    :goto_c
    invoke-virtual {v9}, Lt/e0;->e()Z

    .line 428
    .line 429
    .line 430
    move-result v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    .line 431
    if-eqz v0, :cond_12

    .line 432
    .line 433
    :try_start_14
    iget-object v0, v9, Lt/e0;->b:[Ljava/lang/Object;

    .line 434
    .line 435
    iget-object v1, v9, Lt/e0;->a:[J

    .line 436
    .line 437
    array-length v4, v1

    .line 438
    add-int/lit8 v4, v4, -0x2

    .line 439
    .line 440
    if-ltz v4, :cond_11

    .line 441
    .line 442
    const/4 v5, 0x0

    .line 443
    :goto_d
    aget-wide v6, v1, v5

    .line 444
    .line 445
    not-long v13, v6

    .line 446
    shl-long v13, v13, p8

    .line 447
    .line 448
    and-long/2addr v13, v6

    .line 449
    and-long/2addr v13, v15

    .line 450
    cmp-long v8, v13, v15

    .line 451
    .line 452
    if-eqz v8, :cond_10

    .line 453
    .line 454
    sub-int v8, v5, v4

    .line 455
    .line 456
    not-int v8, v8

    .line 457
    ushr-int/lit8 v8, v8, 0x1f

    .line 458
    .line 459
    rsub-int/lit8 v8, v8, 0x8

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    :goto_e
    if-ge v13, v8, :cond_f

    .line 463
    .line 464
    and-long v21, v6, v19

    .line 465
    .line 466
    cmp-long v14, v21, v17

    .line 467
    .line 468
    if-gez v14, :cond_e

    .line 469
    .line 470
    shl-int/lit8 v14, v5, 0x3

    .line 471
    .line 472
    add-int/2addr v14, v13

    .line 473
    aget-object v14, v0, v14

    .line 474
    .line 475
    check-cast v14, LY/Q;

    .line 476
    .line 477
    invoke-interface {v14}, LY/Q;->x()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    .line 478
    .line 479
    .line 480
    goto :goto_f

    .line 481
    :catchall_9
    move-exception v0

    .line 482
    move-object v2, v0

    .line 483
    goto :goto_10

    .line 484
    :cond_e
    :goto_f
    shr-long/2addr v6, v3

    .line 485
    add-int/lit8 v13, v13, 0x1

    .line 486
    .line 487
    goto :goto_e

    .line 488
    :cond_f
    if-ne v8, v3, :cond_11

    .line 489
    .line 490
    :cond_10
    if-eq v5, v4, :cond_11

    .line 491
    .line 492
    add-int/lit8 v5, v5, 0x1

    .line 493
    .line 494
    goto :goto_d

    .line 495
    :cond_11
    :try_start_15
    invoke-virtual {v9}, Lt/Q;->m()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    .line 496
    .line 497
    .line 498
    :cond_12
    move-object/from16 v1, p0

    .line 499
    .line 500
    move-object/from16 v7, p1

    .line 501
    .line 502
    move-object/from16 v8, p2

    .line 503
    .line 504
    goto :goto_11

    .line 505
    :goto_10
    const/4 v5, 0x6

    .line 506
    const/4 v6, 0x0

    .line 507
    const/4 v3, 0x0

    .line 508
    const/4 v4, 0x0

    .line 509
    move-object/from16 v1, p0

    .line 510
    .line 511
    :try_start_16
    invoke-static/range {v1 .. v6}, LY/o1;->D0(LY/o1;Ljava/lang/Throwable;LY/Q;ZILjava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    move-object/from16 v7, p1

    .line 515
    .line 516
    move-object/from16 v8, p2

    .line 517
    .line 518
    move-object/from16 v2, p3

    .line 519
    .line 520
    move-object/from16 v3, p4

    .line 521
    .line 522
    move-object/from16 v5, p5

    .line 523
    .line 524
    move-object/from16 v4, p6

    .line 525
    .line 526
    move-object v6, v9

    .line 527
    invoke-static/range {v1 .. v8}, LY/o1$g;->k(LY/o1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt/Q;Lt/Q;Lt/Q;Lt/Q;)V

    .line 528
    .line 529
    .line 530
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    .line 531
    .line 532
    :try_start_17
    invoke-virtual/range {p7 .. p7}, Lt/Q;->m()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_4

    .line 533
    .line 534
    .line 535
    :try_start_18
    invoke-virtual {v11, v12}, Li0/l;->s(Li0/l;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_5

    .line 536
    .line 537
    .line 538
    :try_start_19
    invoke-virtual {v11}, Li0/l;->d()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    .line 539
    .line 540
    .line 541
    sget-object v1, Lg0/x;->a:Lg0/x;

    .line 542
    .line 543
    invoke-virtual {v1, v10}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    return-object v0

    .line 547
    :catchall_a
    move-exception v0

    .line 548
    :try_start_1a
    invoke-virtual/range {p7 .. p7}, Lt/Q;->m()V

    .line 549
    .line 550
    .line 551
    throw v0

    .line 552
    :goto_11
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    .line 553
    .line 554
    :try_start_1b
    invoke-virtual {v11, v12}, Li0/l;->s(Li0/l;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_5

    .line 555
    .line 556
    .line 557
    :try_start_1c
    invoke-virtual {v11}, Li0/l;->d()V

    .line 558
    .line 559
    .line 560
    invoke-static {v1}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    monitor-enter v3
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    .line 565
    :try_start_1d
    invoke-static {v1}, LY/o1;->D(LY/o1;)LGf/n;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_b

    .line 566
    .line 567
    .line 568
    :try_start_1e
    monitor-exit v3

    .line 569
    sget-object v0, Li0/l;->e:Li0/l$a;

    .line 570
    .line 571
    invoke-virtual {v0}, Li0/l$a;->f()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v8}, Lt/Q;->m()V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v7}, Lt/Q;->m()V

    .line 578
    .line 579
    .line 580
    invoke-static {v1, v2}, LY/o1;->Z(LY/o1;Ljava/util/Set;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_2

    .line 581
    .line 582
    .line 583
    sget-object v0, Lg0/x;->a:Lg0/x;

    .line 584
    .line 585
    invoke-virtual {v0, v10}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    sget-object v0, LTd/L;->a:LTd/L;

    .line 589
    .line 590
    return-object v0

    .line 591
    :catchall_b
    move-exception v0

    .line 592
    :try_start_1f
    monitor-exit v3

    .line 593
    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_2

    .line 594
    :goto_12
    :try_start_20
    invoke-virtual {v11, v12}, Li0/l;->s(Li0/l;)V

    .line 595
    .line 596
    .line 597
    throw v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_5

    .line 598
    :goto_13
    :try_start_21
    invoke-virtual {v11}, Li0/l;->d()V

    .line 599
    .line 600
    .line 601
    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_2

    .line 602
    :goto_14
    :try_start_22
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    const/4 v3, 0x0

    .line 607
    :goto_15
    if-ge v3, v0, :cond_14

    .line 608
    .line 609
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    check-cast v4, LY/Q;

    .line 614
    .line 615
    invoke-static {v1, v4, v7}, LY/o1;->U(LY/o1;LY/Q;Lt/Q;)LY/Q;

    .line 616
    .line 617
    .line 618
    move-result-object v5

    .line 619
    if-eqz v5, :cond_13

    .line 620
    .line 621
    invoke-interface {v13, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    sget-object v5, LTd/L;->a:LTd/L;

    .line 625
    .line 626
    goto :goto_16

    .line 627
    :catchall_c
    move-exception v0

    .line 628
    move-object v2, v0

    .line 629
    goto/16 :goto_20

    .line 630
    .line 631
    :cond_13
    :goto_16
    invoke-virtual {v8, v4}, Lt/Q;->h(Ljava/lang/Object;)Z
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_c

    .line 632
    .line 633
    .line 634
    add-int/lit8 v3, v3, 0x1

    .line 635
    .line 636
    goto :goto_15

    .line 637
    :cond_14
    :try_start_23
    invoke-interface {v9}, Ljava/util/List;->clear()V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v7}, Lt/e0;->e()Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-nez v0, :cond_16

    .line 645
    .line 646
    invoke-static {v1}, LY/o1;->G(LY/o1;)La0/c;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, La0/c;->p()I

    .line 651
    .line 652
    .line 653
    move-result v0

    .line 654
    if-eqz v0, :cond_15

    .line 655
    .line 656
    goto :goto_17

    .line 657
    :cond_15
    move-object/from16 v14, p8

    .line 658
    .line 659
    goto/16 :goto_1c

    .line 660
    .line 661
    :cond_16
    :goto_17
    invoke-static {v1}, LY/o1;->O(LY/o1;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    monitor-enter v3
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_2

    .line 666
    :try_start_24
    invoke-static {v1}, LY/o1;->S(LY/o1;)Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    const/4 v5, 0x0

    .line 675
    :goto_18
    if-ge v5, v4, :cond_19

    .line 676
    .line 677
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v6

    .line 681
    check-cast v6, LY/Q;

    .line 682
    .line 683
    invoke-virtual {v8, v6}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v14

    .line 687
    if-nez v14, :cond_17

    .line 688
    .line 689
    move-object/from16 v14, p8

    .line 690
    .line 691
    invoke-interface {v6, v14}, LY/Q;->l(Ljava/util/Set;)Z

    .line 692
    .line 693
    .line 694
    move-result v15

    .line 695
    if-eqz v15, :cond_18

    .line 696
    .line 697
    invoke-interface {v9, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    goto :goto_19

    .line 701
    :catchall_d
    move-exception v0

    .line 702
    goto/16 :goto_1f

    .line 703
    .line 704
    :cond_17
    move-object/from16 v14, p8

    .line 705
    .line 706
    :cond_18
    :goto_19
    add-int/lit8 v5, v5, 0x1

    .line 707
    .line 708
    goto :goto_18

    .line 709
    :cond_19
    move-object/from16 v14, p8

    .line 710
    .line 711
    invoke-static {v1}, LY/o1;->G(LY/o1;)La0/c;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-virtual {v0}, La0/c;->p()I

    .line 716
    .line 717
    .line 718
    move-result v4

    .line 719
    const/4 v5, 0x0

    .line 720
    const/4 v6, 0x0

    .line 721
    :goto_1a
    if-ge v5, v4, :cond_1c

    .line 722
    .line 723
    iget-object v15, v0, La0/c;->a:[Ljava/lang/Object;

    .line 724
    .line 725
    aget-object v15, v15, v5

    .line 726
    .line 727
    check-cast v15, LY/Q;

    .line 728
    .line 729
    invoke-virtual {v8, v15}, Lt/e0;->a(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v16

    .line 733
    if-nez v16, :cond_1a

    .line 734
    .line 735
    invoke-interface {v9, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v16

    .line 739
    if-nez v16, :cond_1a

    .line 740
    .line 741
    invoke-interface {v9, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    add-int/lit8 v6, v6, 0x1

    .line 745
    .line 746
    goto :goto_1b

    .line 747
    :cond_1a
    if-lez v6, :cond_1b

    .line 748
    .line 749
    iget-object v15, v0, La0/c;->a:[Ljava/lang/Object;

    .line 750
    .line 751
    sub-int v16, v5, v6

    .line 752
    .line 753
    aget-object v17, v15, v5

    .line 754
    .line 755
    aput-object v17, v15, v16

    .line 756
    .line 757
    :cond_1b
    :goto_1b
    add-int/lit8 v5, v5, 0x1

    .line 758
    .line 759
    goto :goto_1a

    .line 760
    :cond_1c
    iget-object v5, v0, La0/c;->a:[Ljava/lang/Object;

    .line 761
    .line 762
    sub-int v6, v4, v6

    .line 763
    .line 764
    invoke-static {v5, v2, v6, v4}, LUd/n;->w([Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0, v6}, La0/c;->F(I)V

    .line 768
    .line 769
    .line 770
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_d

    .line 771
    .line 772
    :try_start_25
    monitor-exit v3

    .line 773
    :goto_1c
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 774
    .line 775
    .line 776
    move-result v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_2

    .line 777
    if-eqz v0, :cond_1e

    .line 778
    .line 779
    :try_start_26
    invoke-static {v11, v1}, LY/o1$g;->s(Ljava/util/List;LY/o1;)V

    .line 780
    .line 781
    .line 782
    :goto_1d
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 783
    .line 784
    .line 785
    move-result v0

    .line 786
    if-nez v0, :cond_1d

    .line 787
    .line 788
    invoke-static {v1, v11, v7}, LY/o1;->T(LY/o1;Ljava/util/List;Lt/Q;)Ljava/util/List;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {v12, v0}, Lt/Q;->v(Ljava/lang/Iterable;)V

    .line 793
    .line 794
    .line 795
    invoke-static {v11, v1}, LY/o1$g;->s(Ljava/util/List;LY/o1;)V
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_e

    .line 796
    .line 797
    .line 798
    goto :goto_1d

    .line 799
    :catchall_e
    move-exception v0

    .line 800
    move-object v2, v0

    .line 801
    goto :goto_1e

    .line 802
    :cond_1d
    move-object v7, v9

    .line 803
    move-object v8, v13

    .line 804
    const/4 v4, 0x0

    .line 805
    move-object/from16 v9, p7

    .line 806
    .line 807
    goto/16 :goto_2

    .line 808
    .line 809
    :goto_1e
    const/4 v5, 0x2

    .line 810
    const/4 v6, 0x0

    .line 811
    const/4 v3, 0x0

    .line 812
    const/4 v4, 0x1

    .line 813
    :try_start_27
    invoke-static/range {v1 .. v6}, LY/o1;->D0(LY/o1;Ljava/lang/Throwable;LY/Q;ZILjava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    move-object/from16 v1, p0

    .line 817
    .line 818
    move-object/from16 v6, p7

    .line 819
    .line 820
    move-object v2, v9

    .line 821
    move-object v3, v11

    .line 822
    move-object v5, v12

    .line 823
    move-object v4, v13

    .line 824
    invoke-static/range {v1 .. v8}, LY/o1$g;->k(LY/o1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt/Q;Lt/Q;Lt/Q;Lt/Q;)V

    .line 825
    .line 826
    .line 827
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_2

    .line 828
    .line 829
    sget-object v1, Lg0/x;->a:Lg0/x;

    .line 830
    .line 831
    invoke-virtual {v1, v10}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 832
    .line 833
    .line 834
    return-object v0

    .line 835
    :cond_1e
    move-object/from16 v1, p0

    .line 836
    .line 837
    move-object/from16 v7, p3

    .line 838
    .line 839
    move-object/from16 v8, p6

    .line 840
    .line 841
    move-object/from16 v9, p7

    .line 842
    .line 843
    const/4 v4, 0x0

    .line 844
    goto/16 :goto_2

    .line 845
    .line 846
    :goto_1f
    :try_start_28
    monitor-exit v3

    .line 847
    throw v0
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_2

    .line 848
    :goto_20
    const/4 v5, 0x2

    .line 849
    const/4 v6, 0x0

    .line 850
    const/4 v3, 0x0

    .line 851
    const/4 v4, 0x1

    .line 852
    move-object/from16 v1, p0

    .line 853
    .line 854
    :try_start_29
    invoke-static/range {v1 .. v6}, LY/o1;->D0(LY/o1;Ljava/lang/Throwable;LY/Q;ZILjava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    move-object/from16 v7, p1

    .line 858
    .line 859
    move-object/from16 v8, p2

    .line 860
    .line 861
    move-object/from16 v2, p3

    .line 862
    .line 863
    move-object/from16 v3, p4

    .line 864
    .line 865
    move-object/from16 v5, p5

    .line 866
    .line 867
    move-object/from16 v4, p6

    .line 868
    .line 869
    move-object/from16 v6, p7

    .line 870
    .line 871
    invoke-static/range {v1 .. v8}, LY/o1$g;->k(LY/o1;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt/Q;Lt/Q;Lt/Q;Lt/Q;)V

    .line 872
    .line 873
    .line 874
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_f

    .line 875
    .line 876
    :try_start_2a
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->clear()V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_2

    .line 877
    .line 878
    .line 879
    sget-object v1, Lg0/x;->a:Lg0/x;

    .line 880
    .line 881
    invoke-virtual {v1, v10}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    return-object v0

    .line 885
    :catchall_f
    move-exception v0

    .line 886
    :try_start_2b
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->clear()V

    .line 887
    .line 888
    .line 889
    throw v0

    .line 890
    :goto_21
    monitor-exit v2

    .line 891
    throw v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_2

    .line 892
    :goto_22
    sget-object v1, Lg0/x;->a:Lg0/x;

    .line 893
    .line 894
    invoke-virtual {v1, v10}, Lg0/x;->b(Ljava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    throw v0
.end method


# virtual methods
.method public final i(LGf/O;LY/t0;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, LY/o1$g;

    .line 2
    .line 3
    iget-object v0, p0, LY/o1$g;->k:LY/o1;

    .line 4
    .line 5
    invoke-direct {p1, v0, p3}, LY/o1$g;-><init>(LY/o1;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, LY/o1$g;->j:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, LY/o1$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/O;

    .line 2
    .line 3
    check-cast p2, LY/t0;

    .line 4
    .line 5
    check-cast p3, LZd/e;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, LY/o1$g;->i(LGf/O;LY/t0;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, LY/o1$g;->i:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    if-eq v2, v4, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    iget-object v2, v0, LY/o1$g;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lt/Q;

    .line 20
    .line 21
    iget-object v5, v0, LY/o1$g;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Ljava/util/Set;

    .line 24
    .line 25
    iget-object v6, v0, LY/o1$g;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Lt/Q;

    .line 28
    .line 29
    iget-object v7, v0, LY/o1$g;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v7, Lt/Q;

    .line 32
    .line 33
    iget-object v8, v0, LY/o1$g;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v8, Lt/Q;

    .line 36
    .line 37
    iget-object v9, v0, LY/o1$g;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v9, Ljava/util/List;

    .line 40
    .line 41
    iget-object v10, v0, LY/o1$g;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v10, Ljava/util/List;

    .line 44
    .line 45
    iget-object v11, v0, LY/o1$g;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v11, Ljava/util/List;

    .line 48
    .line 49
    iget-object v12, v0, LY/o1$g;->j:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v12, LY/t0;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v15, v12

    .line 57
    move-object v12, v2

    .line 58
    move-object v2, v15

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_1
    iget-object v2, v0, LY/o1$g;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lt/Q;

    .line 72
    .line 73
    iget-object v5, v0, LY/o1$g;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, Ljava/util/Set;

    .line 76
    .line 77
    iget-object v6, v0, LY/o1$g;->f:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v6, Lt/Q;

    .line 80
    .line 81
    iget-object v7, v0, LY/o1$g;->e:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v7, Lt/Q;

    .line 84
    .line 85
    iget-object v8, v0, LY/o1$g;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v8, Lt/Q;

    .line 88
    .line 89
    iget-object v9, v0, LY/o1$g;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v9, Ljava/util/List;

    .line 92
    .line 93
    iget-object v10, v0, LY/o1$g;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v10, Ljava/util/List;

    .line 96
    .line 97
    iget-object v11, v0, LY/o1$g;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v11, Ljava/util/List;

    .line 100
    .line 101
    iget-object v12, v0, LY/o1$g;->j:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v12, LY/t0;

    .line 104
    .line 105
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object v13, v8

    .line 109
    move-object v8, v2

    .line 110
    move-object v2, v12

    .line 111
    move-object v12, v9

    .line 112
    move-object v9, v11

    .line 113
    move-object v11, v13

    .line 114
    :goto_0
    move-object v14, v5

    .line 115
    move-object v13, v7

    .line 116
    move-object v7, v6

    .line 117
    goto/16 :goto_2

    .line 118
    .line 119
    :cond_2
    invoke-static/range {p1 .. p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object v2, v0, LY/o1$g;->j:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, LY/t0;

    .line 125
    .line 126
    new-instance v5, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    new-instance v6, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    new-instance v7, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-static {}, Lt/f0;->b()Lt/Q;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-static {}, Lt/f0;->b()Lt/Q;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    new-instance v10, Lt/Q;

    .line 150
    .line 151
    const/4 v11, 0x0

    .line 152
    const/4 v12, 0x0

    .line 153
    invoke-direct {v10, v11, v4, v12}, Lt/Q;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v10}, La0/f;->a(Lt/e0;)Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-static {}, Lt/f0;->b()Lt/Q;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    move-object v15, v11

    .line 165
    move-object v11, v5

    .line 166
    move-object v5, v15

    .line 167
    move-object v15, v10

    .line 168
    move-object v10, v6

    .line 169
    move-object v6, v15

    .line 170
    move-object v15, v9

    .line 171
    move-object v9, v7

    .line 172
    move-object v7, v15

    .line 173
    :goto_1
    iget-object v13, v0, LY/o1$g;->k:LY/o1;

    .line 174
    .line 175
    invoke-static {v13}, LY/o1;->M(LY/o1;)Z

    .line 176
    .line 177
    .line 178
    move-result v13

    .line 179
    if-eqz v13, :cond_6

    .line 180
    .line 181
    iget-object v13, v0, LY/o1$g;->k:LY/o1;

    .line 182
    .line 183
    iput-object v2, v0, LY/o1$g;->j:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v11, v0, LY/o1$g;->a:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v10, v0, LY/o1$g;->b:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v9, v0, LY/o1$g;->c:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v8, v0, LY/o1$g;->d:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v7, v0, LY/o1$g;->e:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v6, v0, LY/o1$g;->f:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v5, v0, LY/o1$g;->g:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v12, v0, LY/o1$g;->h:Ljava/lang/Object;

    .line 200
    .line 201
    iput v4, v0, LY/o1$g;->i:I

    .line 202
    .line 203
    invoke-static {v13, v0}, LY/o1;->C(LY/o1;LZd/e;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    if-ne v13, v1, :cond_3

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_3
    move-object v13, v11

    .line 211
    move-object v11, v8

    .line 212
    move-object v8, v12

    .line 213
    move-object v12, v9

    .line 214
    move-object v9, v13

    .line 215
    goto :goto_0

    .line 216
    :goto_2
    iget-object v5, v0, LY/o1$g;->k:LY/o1;

    .line 217
    .line 218
    invoke-static {v5}, LY/o1;->V(LY/o1;)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_5

    .line 223
    .line 224
    iget-object v6, v0, LY/o1$g;->k:LY/o1;

    .line 225
    .line 226
    new-instance v5, LY/q1;

    .line 227
    .line 228
    invoke-direct/range {v5 .. v14}, LY/q1;-><init>(LY/o1;Lt/Q;Lt/Q;Ljava/util/List;Ljava/util/List;Lt/Q;Ljava/util/List;Lt/Q;Ljava/util/Set;)V

    .line 229
    .line 230
    .line 231
    iput-object v2, v0, LY/o1$g;->j:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v9, v0, LY/o1$g;->a:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v10, v0, LY/o1$g;->b:Ljava/lang/Object;

    .line 236
    .line 237
    iput-object v12, v0, LY/o1$g;->c:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v11, v0, LY/o1$g;->d:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v13, v0, LY/o1$g;->e:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v7, v0, LY/o1$g;->f:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v14, v0, LY/o1$g;->g:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v8, v0, LY/o1$g;->h:Ljava/lang/Object;

    .line 248
    .line 249
    iput v3, v0, LY/o1$g;->i:I

    .line 250
    .line 251
    invoke-interface {v2, v5, v0}, LY/t0;->A1(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    if-ne v5, v1, :cond_4

    .line 256
    .line 257
    :goto_3
    return-object v1

    .line 258
    :cond_4
    move-object v5, v12

    .line 259
    move-object v12, v8

    .line 260
    move-object v8, v11

    .line 261
    move-object v11, v9

    .line 262
    move-object v9, v5

    .line 263
    move-object v6, v7

    .line 264
    move-object v7, v13

    .line 265
    move-object v5, v14

    .line 266
    :goto_4
    iget-object v13, v0, LY/o1$g;->k:LY/o1;

    .line 267
    .line 268
    invoke-static {v13}, LY/o1;->E(LY/o1;)V

    .line 269
    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_5
    move-object v5, v12

    .line 273
    move-object v12, v8

    .line 274
    move-object v8, v11

    .line 275
    move-object v11, v9

    .line 276
    move-object v9, v5

    .line 277
    move-object v6, v7

    .line 278
    move-object v7, v13

    .line 279
    move-object v5, v14

    .line 280
    goto :goto_1

    .line 281
    :cond_6
    sget-object v1, LTd/L;->a:LTd/L;

    .line 282
    .line 283
    return-object v1
.end method
