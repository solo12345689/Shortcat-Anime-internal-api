.class public final LY0/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/h2;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:LY0/q0;

.field private final c:LY0/n;

.field private final d:Lkotlin/jvm/functions/Function1;

.field private final e:LY0/U;

.field private final f:LY/C0;

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/Object;LY0/q0;LY0/n;Lkotlin/jvm/functions/Function1;LY0/U;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY0/m;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p3, p0, LY0/m;->b:LY0/q0;

    .line 7
    .line 8
    iput-object p4, p0, LY0/m;->c:LY0/n;

    .line 9
    .line 10
    iput-object p5, p0, LY0/m;->d:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iput-object p6, p0, LY0/m;->e:LY0/U;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const/4 p3, 0x2

    .line 16
    invoke-static {p2, p1, p3, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LY0/m;->f:LY/C0;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, LY0/m;->g:Z

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic i(LY0/m;)LY0/U;
    .locals 0

    .line 1
    iget-object p0, p0, LY0/m;->e:LY0/U;

    .line 2
    .line 3
    return-object p0
.end method

.method private setValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY0/m;->f:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LY0/m;->f:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY0/m;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n(LZd/e;)Ljava/lang/Object;
    .locals 14

    .line 1
    instance-of v0, p1, LY0/m$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LY0/m$a;

    .line 7
    .line 8
    iget v1, v0, LY0/m$a;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LY0/m$a;->g:I

    .line 18
    .line 19
    :goto_0
    move-object p1, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, LY0/m$a;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, LY0/m$a;-><init>(LY0/m;LZd/e;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p1, LY0/m$a;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v2, p1, LY0/m$a;->g:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x1

    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    iget v2, p1, LY0/m$a;->d:I

    .line 46
    .line 47
    iget v7, p1, LY0/m$a;->c:I

    .line 48
    .line 49
    iget-object v8, p1, LY0/m$a;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Ljava/util/List;

    .line 52
    .line 53
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    iget v2, p1, LY0/m$a;->d:I

    .line 70
    .line 71
    iget v7, p1, LY0/m$a;->c:I

    .line 72
    .line 73
    iget-object v8, p1, LY0/m$a;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v8, LY0/t;

    .line 76
    .line 77
    iget-object v9, p1, LY0/m$a;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v9, Ljava/util/List;

    .line 80
    .line 81
    :try_start_1
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    .line 84
    move-object v13, v9

    .line 85
    move-object v9, v8

    .line 86
    move-object v8, v13

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :try_start_2
    iget-object v0, p0, LY0/m;->a:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 94
    .line 95
    .line 96
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    move-object v12, p1

    .line 98
    move p1, v6

    .line 99
    :goto_2
    if-ge p1, v2, :cond_8

    .line 100
    .line 101
    :try_start_3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    move-object v8, v7

    .line 106
    check-cast v8, LY0/t;

    .line 107
    .line 108
    invoke-interface {v8}, LY0/t;->a()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    sget-object v9, LY0/F;->a:LY0/F$a;

    .line 113
    .line 114
    invoke-virtual {v9}, LY0/F$a;->a()I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    invoke-static {v7, v9}, LY0/F;->e(II)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_7

    .line 123
    .line 124
    iget-object v7, p0, LY0/m;->c:LY0/n;

    .line 125
    .line 126
    iget-object v9, p0, LY0/m;->e:LY0/U;

    .line 127
    .line 128
    new-instance v11, LY0/m$b;

    .line 129
    .line 130
    invoke-direct {v11, p0, v8, v3}, LY0/m$b;-><init>(LY0/m;LY0/t;LZd/e;)V

    .line 131
    .line 132
    .line 133
    iput-object v0, v12, LY0/m$a;->a:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v8, v12, LY0/m$a;->b:Ljava/lang/Object;

    .line 136
    .line 137
    iput p1, v12, LY0/m$a;->c:I

    .line 138
    .line 139
    iput v2, v12, LY0/m$a;->d:I

    .line 140
    .line 141
    iput v5, v12, LY0/m$a;->g:I

    .line 142
    .line 143
    const/4 v10, 0x0

    .line 144
    invoke-virtual/range {v7 .. v12}, LY0/n;->g(LY0/t;LY0/U;ZLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 148
    if-ne v7, v1, :cond_4

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_4
    move-object v9, v8

    .line 152
    move-object v8, v0

    .line 153
    move-object v0, v7

    .line 154
    move v7, p1

    .line 155
    move-object p1, v12

    .line 156
    :goto_3
    if-eqz v0, :cond_5

    .line 157
    .line 158
    :try_start_4
    iget-object v1, p0, LY0/m;->b:LY0/q0;

    .line 159
    .line 160
    invoke-virtual {v1}, LY0/q0;->e()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    iget-object v2, p0, LY0/m;->b:LY0/q0;

    .line 165
    .line 166
    invoke-virtual {v2}, LY0/q0;->f()LY0/L;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget-object v3, p0, LY0/m;->b:LY0/q0;

    .line 171
    .line 172
    invoke-virtual {v3}, LY0/q0;->d()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    invoke-static {v1, v0, v9, v2, v3}, LY0/J;->a(ILjava/lang/Object;LY0/t;LY0/L;I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-direct {p0, v0}, LY0/m;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 184
    .line 185
    invoke-interface {p1}, LZd/e;->getContext()LZd/i;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p1}, LGf/F0;->n(LZd/i;)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    iput-boolean v6, p0, LY0/m;->g:Z

    .line 194
    .line 195
    iget-object v1, p0, LY0/m;->d:Lkotlin/jvm/functions/Function1;

    .line 196
    .line 197
    new-instance v2, LY0/t0$b;

    .line 198
    .line 199
    invoke-virtual {p0}, LY0/m;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-direct {v2, v3, p1}, LY0/t0$b;-><init>(Ljava/lang/Object;Z)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    return-object v0

    .line 210
    :cond_5
    :try_start_5
    iput-object v8, p1, LY0/m$a;->a:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object v3, p1, LY0/m$a;->b:Ljava/lang/Object;

    .line 213
    .line 214
    iput v7, p1, LY0/m$a;->c:I

    .line 215
    .line 216
    iput v2, p1, LY0/m$a;->d:I

    .line 217
    .line 218
    iput v4, p1, LY0/m$a;->g:I

    .line 219
    .line 220
    invoke-static {p1}, LGf/j1;->a(LZd/e;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 224
    if-ne v0, v1, :cond_6

    .line 225
    .line 226
    :goto_4
    return-object v1

    .line 227
    :cond_6
    :goto_5
    move-object v12, p1

    .line 228
    move p1, v7

    .line 229
    move-object v0, v8

    .line 230
    goto :goto_6

    .line 231
    :catchall_1
    move-exception v0

    .line 232
    move-object p1, v12

    .line 233
    goto :goto_7

    .line 234
    :cond_7
    :goto_6
    add-int/2addr p1, v5

    .line 235
    goto/16 :goto_2

    .line 236
    .line 237
    :cond_8
    invoke-interface {v12}, LZd/e;->getContext()LZd/i;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-static {p1}, LGf/F0;->n(LZd/i;)Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    iput-boolean v6, p0, LY0/m;->g:Z

    .line 246
    .line 247
    iget-object v0, p0, LY0/m;->d:Lkotlin/jvm/functions/Function1;

    .line 248
    .line 249
    new-instance v1, LY0/t0$b;

    .line 250
    .line 251
    invoke-virtual {p0}, LY0/m;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-direct {v1, v2, p1}, LY0/t0$b;-><init>(Ljava/lang/Object;Z)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    sget-object p1, LTd/L;->a:LTd/L;

    .line 262
    .line 263
    return-object p1

    .line 264
    :goto_7
    invoke-interface {p1}, LZd/e;->getContext()LZd/i;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-static {p1}, LGf/F0;->n(LZd/i;)Z

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    iput-boolean v6, p0, LY0/m;->g:Z

    .line 273
    .line 274
    iget-object v1, p0, LY0/m;->d:Lkotlin/jvm/functions/Function1;

    .line 275
    .line 276
    new-instance v2, LY0/t0$b;

    .line 277
    .line 278
    invoke-virtual {p0}, LY0/m;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-direct {v2, v3, p1}, LY0/t0$b;-><init>(Ljava/lang/Object;Z)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    throw v0
.end method

.method public final p(LY0/t;LZd/e;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, LY0/m$c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LY0/m$c;

    .line 7
    .line 8
    iget v1, v0, LY0/m$c;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LY0/m$c;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LY0/m$c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LY0/m$c;-><init>(LY0/m;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LY0/m$c;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LY0/m$c;->d:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, LY0/m$c;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, LY0/t;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :catch_0
    move-exception p2

    .line 48
    goto :goto_1

    .line 49
    :catch_1
    move-exception p1

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    new-instance p2, LY0/m$d;

    .line 63
    .line 64
    invoke-direct {p2, p0, p1, v4}, LY0/m$d;-><init>(LY0/m;LY0/t;LZd/e;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, v0, LY0/m$c;->a:Ljava/lang/Object;

    .line 68
    .line 69
    iput v3, v0, LY0/m$c;->d:I

    .line 70
    .line 71
    const-wide/16 v2, 0x3a98

    .line 72
    .line 73
    invoke-static {v2, v3, p2, v0}, LGf/d1;->d(JLkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    if-ne p1, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    return-object p1

    .line 81
    :goto_1
    invoke-interface {v0}, LZd/e;->getContext()LZd/i;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v2, LGf/L;->J:LGf/L$b;

    .line 86
    .line 87
    invoke-interface {v1, v2}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, LGf/L;

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-interface {v0}, LZd/e;->getContext()LZd/i;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v5, "Unable to load font "

    .line 107
    .line 108
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {v2, p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, v0, v2}, LGf/L;->z(LZd/i;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :goto_2
    invoke-interface {v0}, LZd/e;->getContext()LZd/i;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-static {p2}, LGf/F0;->n(LZd/i;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    :cond_4
    :goto_3
    return-object v4

    .line 136
    :cond_5
    throw p1
.end method
