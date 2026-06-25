.class public abstract Landroidx/work/impl/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static synthetic a(Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;Lie/a;Li4/u;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/work/impl/I;->d(Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;Lie/a;Li4/u;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Landroidx/work/impl/WorkDatabase;Ln4/u;Ln4/u;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Landroidx/work/impl/I;->g(Landroidx/work/impl/WorkDatabase;Ln4/u;Ln4/u;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final c(Landroidx/work/impl/E;Ljava/lang/String;Li4/u;)Li4/l;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "workRequest"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v4, Landroidx/work/impl/o;

    .line 17
    .line 18
    invoke-direct {v4}, Landroidx/work/impl/o;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v5, Landroidx/work/impl/I$a;

    .line 22
    .line 23
    invoke-direct {v5, p2, p0, p1, v4}, Landroidx/work/impl/I$a;-><init>(Li4/u;Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/work/impl/E;->w()Lp4/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Lp4/b;->b()Lp4/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Landroidx/work/impl/G;

    .line 35
    .line 36
    move-object v2, p0

    .line 37
    move-object v3, p1

    .line 38
    move-object v6, p2

    .line 39
    invoke-direct/range {v1 .. v6}, Landroidx/work/impl/G;-><init>(Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;Lie/a;Li4/u;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    return-object v4
.end method

.method private static final d(Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;Lie/a;Li4/u;)V
    .locals 42

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "$this_enqueueUniquelyNamedPeriodic"

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "$name"

    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "$operation"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v2, "$enqueueNew"

    .line 23
    .line 24
    move-object/from16 v4, p3

    .line 25
    .line 26
    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v2, "$workRequest"

    .line 30
    .line 31
    move-object/from16 v5, p4

    .line 32
    .line 33
    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v2, v0}, Ln4/v;->o(Ljava/lang/String;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    const/4 v8, 0x1

    .line 53
    if-le v7, v8, :cond_0

    .line 54
    .line 55
    const-string v0, "Can\'t apply UPDATE policy to the chains of work."

    .line 56
    .line 57
    invoke-static {v1, v0}, Landroidx/work/impl/I;->e(Landroidx/work/impl/o;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    invoke-static {v6}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Ln4/u$b;

    .line 66
    .line 67
    if-nez v6, :cond_1

    .line 68
    .line 69
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    iget-object v7, v6, Ln4/u$b;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v2, v7}, Ln4/v;->h(Ljava/lang/String;)Ln4/u;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    if-nez v7, :cond_2

    .line 80
    .line 81
    new-instance v2, Li4/l$b$a;

    .line 82
    .line 83
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    new-instance v4, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v5, "WorkSpec with "

    .line 91
    .line 92
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v5, v6, Ln4/u$b;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v5, ", that matches a name \""

    .line 101
    .line 102
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, "\", wasn\'t found"

    .line 109
    .line 110
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v2, v3}, Li4/l$b$a;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v2}, Landroidx/work/impl/o;->a(Li4/l$b;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_2
    invoke-virtual {v7}, Ln4/u;->j()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_3

    .line 132
    .line 133
    const-string v0, "Can\'t update OneTimeWorker to Periodic Worker. Update operation must preserve worker\'s type."

    .line 134
    .line 135
    invoke-static {v1, v0}, Landroidx/work/impl/I;->e(Landroidx/work/impl/o;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_3
    iget-object v0, v6, Ln4/u$b;->b:Li4/s;

    .line 140
    .line 141
    sget-object v7, Li4/s;->f:Li4/s;

    .line 142
    .line 143
    if-ne v0, v7, :cond_4

    .line 144
    .line 145
    iget-object v0, v6, Ln4/u$b;->a:Ljava/lang/String;

    .line 146
    .line 147
    invoke-interface {v2, v0}, Ln4/v;->a(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v4}, Lie/a;->invoke()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_4
    invoke-virtual {v5}, Li4/u;->d()Ln4/u;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v7, v6, Ln4/u$b;->a:Ljava/lang/String;

    .line 159
    .line 160
    const v34, 0xffffe

    .line 161
    .line 162
    .line 163
    const/16 v35, 0x0

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    const/4 v9, 0x0

    .line 167
    const/4 v10, 0x0

    .line 168
    const/4 v11, 0x0

    .line 169
    const/4 v12, 0x0

    .line 170
    const-wide/16 v13, 0x0

    .line 171
    .line 172
    const-wide/16 v15, 0x0

    .line 173
    .line 174
    const-wide/16 v17, 0x0

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    const/16 v20, 0x0

    .line 179
    .line 180
    const/16 v21, 0x0

    .line 181
    .line 182
    const-wide/16 v22, 0x0

    .line 183
    .line 184
    const-wide/16 v24, 0x0

    .line 185
    .line 186
    const-wide/16 v26, 0x0

    .line 187
    .line 188
    const-wide/16 v28, 0x0

    .line 189
    .line 190
    const/16 v30, 0x0

    .line 191
    .line 192
    const/16 v31, 0x0

    .line 193
    .line 194
    const/16 v32, 0x0

    .line 195
    .line 196
    const/16 v33, 0x0

    .line 197
    .line 198
    move-object v6, v0

    .line 199
    invoke-static/range {v6 .. v35}, Ln4/u;->e(Ln4/u;Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;IIILjava/lang/Object;)Ln4/u;

    .line 200
    .line 201
    .line 202
    move-result-object v40

    .line 203
    :try_start_0
    invoke-virtual {v3}, Landroidx/work/impl/E;->s()Landroidx/work/impl/r;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v2, "processor"

    .line 208
    .line 209
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    const-string v4, "workDatabase"

    .line 217
    .line 218
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3}, Landroidx/work/impl/E;->o()Landroidx/work/a;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    const-string v6, "configuration"

    .line 226
    .line 227
    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3}, Landroidx/work/impl/E;->t()Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    const-string v6, "schedulers"

    .line 235
    .line 236
    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5}, Li4/u;->c()Ljava/util/Set;

    .line 240
    .line 241
    .line 242
    move-result-object v41

    .line 243
    move-object/from16 v36, v0

    .line 244
    .line 245
    move-object/from16 v37, v2

    .line 246
    .line 247
    move-object/from16 v39, v3

    .line 248
    .line 249
    move-object/from16 v38, v4

    .line 250
    .line 251
    invoke-static/range {v36 .. v41}, Landroidx/work/impl/I;->f(Landroidx/work/impl/r;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Ln4/u;Ljava/util/Set;)Li4/t$a;

    .line 252
    .line 253
    .line 254
    sget-object v0, Li4/l;->a:Li4/l$b$c;

    .line 255
    .line 256
    invoke-virtual {v1, v0}, Landroidx/work/impl/o;->a(Li4/l$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :catchall_0
    move-exception v0

    .line 261
    new-instance v2, Li4/l$b$a;

    .line 262
    .line 263
    invoke-direct {v2, v0}, Li4/l$b$a;-><init>(Ljava/lang/Throwable;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v2}, Landroidx/work/impl/o;->a(Li4/l$b;)V

    .line 267
    .line 268
    .line 269
    return-void
.end method

.method private static final e(Landroidx/work/impl/o;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Li4/l$b$a;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Li4/l$b$a;-><init>(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/work/impl/o;->a(Li4/l$b;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final f(Landroidx/work/impl/r;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Ln4/u;Ljava/util/Set;)Li4/t$a;
    .locals 8

    .line 1
    iget-object v5, p4, Ln4/u;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, v5}, Ln4/v;->h(Ljava/lang/String;)Ln4/u;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    if-eqz v3, :cond_5

    .line 12
    .line 13
    iget-object v0, v3, Ln4/u;->b:Li4/s;

    .line 14
    .line 15
    invoke-virtual {v0}, Li4/s;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object p0, Li4/t$a;->a:Li4/t$a;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-virtual {v3}, Ln4/u;->j()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p4}, Ln4/u;->j()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    xor-int/2addr v0, v1

    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    invoke-virtual {p0, v5}, Landroidx/work/impl/r;->k(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-nez v7, :cond_1

    .line 40
    .line 41
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroidx/work/impl/t;

    .line 56
    .line 57
    invoke-interface {v0, v5}, Landroidx/work/impl/t;->c(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v0, Landroidx/work/impl/H;

    .line 62
    .line 63
    move-object v1, p1

    .line 64
    move-object v4, p3

    .line 65
    move-object v2, p4

    .line 66
    move-object v6, p5

    .line 67
    invoke-direct/range {v0 .. v7}, Landroidx/work/impl/H;-><init>(Landroidx/work/impl/WorkDatabase;Ln4/u;Ln4/u;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0}, LM3/q;->A(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    if-nez v7, :cond_2

    .line 74
    .line 75
    invoke-static {p2, v1, v4}, Landroidx/work/impl/u;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    if-eqz v7, :cond_3

    .line 79
    .line 80
    sget-object p0, Li4/t$a;->c:Li4/t$a;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_3
    sget-object p0, Li4/t$a;->b:Li4/t$a;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_4
    move-object v2, p4

    .line 87
    sget-object p0, Landroidx/work/impl/I$b;->a:Landroidx/work/impl/I$b;

    .line 88
    .line 89
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 90
    .line 91
    new-instance p2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string p3, "Can\'t update "

    .line 97
    .line 98
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    check-cast p3, Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p3, " Worker to "

    .line 111
    .line 112
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p0, " Worker. Update operation must preserve worker\'s type."

    .line 125
    .line 126
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 138
    .line 139
    new-instance p1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string p2, "Worker with "

    .line 145
    .line 146
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string p2, " doesn\'t exist"

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p0
.end method

.method private static final g(Landroidx/work/impl/WorkDatabase;Ln4/u;Ln4/u;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 36

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    const-string v4, "$workDatabase"

    .line 10
    .line 11
    move-object/from16 v5, p0

    .line 12
    .line 13
    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v4, "$newWorkSpec"

    .line 17
    .line 18
    move-object/from16 v6, p1

    .line 19
    .line 20
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v4, "$oldWorkSpec"

    .line 24
    .line 25
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "$schedulers"

    .line 29
    .line 30
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "$workSpecId"

    .line 34
    .line 35
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v4, "$tags"

    .line 39
    .line 40
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->J()Ln4/v;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->K()Ln4/z;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    iget-object v8, v0, Ln4/u;->b:Li4/s;

    .line 52
    .line 53
    iget v9, v0, Ln4/u;->k:I

    .line 54
    .line 55
    iget-wide v10, v0, Ln4/u;->n:J

    .line 56
    .line 57
    invoke-virtual {v0}, Ln4/u;->f()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/lit8 v33, v0, 0x1

    .line 62
    .line 63
    const v34, 0x7dbfd

    .line 64
    .line 65
    .line 66
    const/16 v35, 0x0

    .line 67
    .line 68
    move-object v0, v7

    .line 69
    const/4 v7, 0x0

    .line 70
    move/from16 v20, v9

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    move-wide/from16 v24, v10

    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const-wide/16 v13, 0x0

    .line 79
    .line 80
    const-wide/16 v15, 0x0

    .line 81
    .line 82
    const-wide/16 v17, 0x0

    .line 83
    .line 84
    const/16 v19, 0x0

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const-wide/16 v22, 0x0

    .line 89
    .line 90
    const-wide/16 v26, 0x0

    .line 91
    .line 92
    const-wide/16 v28, 0x0

    .line 93
    .line 94
    const/16 v30, 0x0

    .line 95
    .line 96
    const/16 v31, 0x0

    .line 97
    .line 98
    const/16 v32, 0x0

    .line 99
    .line 100
    invoke-static/range {v6 .. v35}, Ln4/u;->e(Ln4/u;Ljava/lang/String;Li4/s;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLi4/b;ILi4/a;JJJJZLi4/m;IIILjava/lang/Object;)Ln4/u;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v1, v6}, Lo4/d;->b(Ljava/util/List;Ln4/u;)Ln4/u;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-interface {v4, v1}, Ln4/v;->w(Ln4/u;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v2}, Ln4/z;->b(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0, v2, v3}, Ln4/z;->c(Ljava/lang/String;Ljava/util/Set;)V

    .line 115
    .line 116
    .line 117
    if-nez p6, :cond_0

    .line 118
    .line 119
    const-wide/16 v0, -0x1

    .line 120
    .line 121
    invoke-interface {v4, v2, v0, v1}, Ln4/v;->n(Ljava/lang/String;J)I

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->I()Ln4/r;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0, v2}, Ln4/r;->a(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_0
    return-void
.end method
