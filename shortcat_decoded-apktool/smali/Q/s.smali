.class public abstract LQ/s;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(LE0/b;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LQ/s;->e(LE0/b;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Landroidx/compose/ui/platform/A1;LE0/C;LE0/C;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LQ/s;->f(Landroidx/compose/ui/platform/A1;LE0/C;LE0/C;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic c(LE0/b;LQ/h;LQ/d;LE0/q;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LQ/s;->h(LE0/b;LQ/h;LQ/d;LE0/q;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(LE0/b;LK/J;LE0/q;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LQ/s;->j(LE0/b;LK/J;LE0/q;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final e(LE0/b;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, LQ/s$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LQ/s$a;

    .line 7
    .line 8
    iget v1, v0, LQ/s$a;->c:I

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
    iput v1, v0, LQ/s$a;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LQ/s$a;

    .line 21
    .line 22
    invoke-direct {v0, p1}, LQ/s$a;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LQ/s$a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LQ/s$a;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, LQ/s$a;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, LE0/b;

    .line 41
    .line 42
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :goto_1
    sget-object p1, LE0/s;->b:LE0/s;

    .line 58
    .line 59
    iput-object p0, v0, LQ/s$a;->a:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, v0, LQ/s$a;->c:I

    .line 62
    .line 63
    invoke-interface {p0, p1, v0}, LE0/b;->p0(LE0/s;LZd/e;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_2
    check-cast p1, LE0/q;

    .line 71
    .line 72
    invoke-virtual {p1}, LE0/q;->c()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const/4 v5, 0x0

    .line 81
    :goto_3
    if-ge v5, v4, :cond_5

    .line 82
    .line 83
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, LE0/C;

    .line 88
    .line 89
    invoke-static {v6}, LE0/r;->b(LE0/C;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-nez v6, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    return-object p1
.end method

.method private static final f(Landroidx/compose/ui/platform/A1;LE0/C;LE0/C;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, LE0/C;->n()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, v0}, Lz/j;->h(Landroidx/compose/ui/platform/A1;I)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p1}, LE0/C;->h()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p2}, LE0/C;->h()J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    invoke-static {v0, v1, p1, p2}, Lr0/f;->p(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    invoke-static {p1, p2}, Lr0/f;->k(J)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    cmpg-float p0, p1, p0

    .line 26
    .line 27
    if-gez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public static final g(LE0/q;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LE0/q;->c()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    move v2, v1

    .line 11
    :goto_0
    if-ge v2, v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, LE0/C;

    .line 18
    .line 19
    invoke-virtual {v3}, LE0/C;->n()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sget-object v4, LE0/Q;->a:LE0/Q$a;

    .line 24
    .line 25
    invoke-virtual {v4}, LE0/Q$a;->b()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v3, v4}, LE0/Q;->g(II)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    return v1

    .line 36
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p0, 0x1

    .line 40
    return p0
.end method

.method private static final h(LE0/b;LQ/h;LQ/d;LE0/q;LZd/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, LQ/s$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, LQ/s$b;

    .line 7
    .line 8
    iget v1, v0, LQ/s$b;->d:I

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
    iput v1, v0, LQ/s$b;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LQ/s$b;

    .line 21
    .line 22
    invoke-direct {v0, p4}, LQ/s$b;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, LQ/s$b;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LQ/s$b;->d:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, LQ/s$b;->b:Ljava/lang/Object;

    .line 43
    .line 44
    move-object p1, p0

    .line 45
    check-cast p1, LQ/h;

    .line 46
    .line 47
    iget-object p0, v0, LQ/s$b;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, LE0/b;

    .line 50
    .line 51
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p0

    .line 64
    :cond_2
    iget-object p0, v0, LQ/s$b;->b:Ljava/lang/Object;

    .line 65
    .line 66
    move-object p1, p0

    .line 67
    check-cast p1, LQ/h;

    .line 68
    .line 69
    iget-object p0, v0, LQ/s$b;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, LE0/b;

    .line 72
    .line 73
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {p4}, LTd/v;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, p3}, LQ/d;->d(LE0/q;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p3}, LE0/q;->c()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    check-cast p4, LE0/C;

    .line 92
    .line 93
    invoke-static {p3}, LQ/H;->b(LE0/q;)Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-eqz p3, :cond_7

    .line 98
    .line 99
    invoke-virtual {p4}, LE0/C;->h()J

    .line 100
    .line 101
    .line 102
    move-result-wide p2

    .line 103
    invoke-interface {p1, p2, p3}, LQ/h;->e(J)Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eqz p2, :cond_d

    .line 108
    .line 109
    invoke-virtual {p4}, LE0/C;->f()J

    .line 110
    .line 111
    .line 112
    move-result-wide p2

    .line 113
    new-instance p4, LQ/s$c;

    .line 114
    .line 115
    invoke-direct {p4, p1}, LQ/s$c;-><init>(LQ/h;)V

    .line 116
    .line 117
    .line 118
    iput-object p0, v0, LQ/s$b;->a:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, v0, LQ/s$b;->b:Ljava/lang/Object;

    .line 121
    .line 122
    iput v5, v0, LQ/s$b;->d:I

    .line 123
    .line 124
    invoke-static {p0, p2, p3, p4, v0}, Lz/j;->f(LE0/b;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p4

    .line 128
    if-ne p4, v1, :cond_4

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_4
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_6

    .line 138
    .line 139
    invoke-interface {p0}, LE0/b;->F0()LE0/q;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, LE0/q;->c()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    :goto_2
    if-ge v3, p2, :cond_6

    .line 152
    .line 153
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    check-cast p3, LE0/C;

    .line 158
    .line 159
    invoke-static {p3}, LE0/r;->c(LE0/C;)Z

    .line 160
    .line 161
    .line 162
    move-result p4

    .line 163
    if-eqz p4, :cond_5

    .line 164
    .line 165
    invoke-virtual {p3}, LE0/C;->a()V

    .line 166
    .line 167
    .line 168
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_6
    invoke-interface {p1}, LQ/h;->a()V

    .line 172
    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_7
    invoke-virtual {p2}, LQ/d;->a()I

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-eq p2, v5, :cond_9

    .line 180
    .line 181
    if-eq p2, v4, :cond_8

    .line 182
    .line 183
    sget-object p2, LQ/q;->a:LQ/q$a;

    .line 184
    .line 185
    invoke-virtual {p2}, LQ/q$a;->m()LQ/q;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    goto :goto_3

    .line 190
    :cond_8
    sget-object p2, LQ/q;->a:LQ/q$a;

    .line 191
    .line 192
    invoke-virtual {p2}, LQ/q$a;->n()LQ/q;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    goto :goto_3

    .line 197
    :cond_9
    sget-object p2, LQ/q;->a:LQ/q$a;

    .line 198
    .line 199
    invoke-virtual {p2}, LQ/q$a;->l()LQ/q;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    :goto_3
    invoke-virtual {p4}, LE0/C;->h()J

    .line 204
    .line 205
    .line 206
    move-result-wide v5

    .line 207
    invoke-interface {p1, v5, v6, p2}, LQ/h;->d(JLQ/q;)Z

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    if-eqz p3, :cond_d

    .line 212
    .line 213
    invoke-virtual {p4}, LE0/C;->f()J

    .line 214
    .line 215
    .line 216
    move-result-wide p3

    .line 217
    new-instance v2, LQ/s$d;

    .line 218
    .line 219
    invoke-direct {v2, p1, p2}, LQ/s$d;-><init>(LQ/h;LQ/q;)V

    .line 220
    .line 221
    .line 222
    iput-object p0, v0, LQ/s$b;->a:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object p1, v0, LQ/s$b;->b:Ljava/lang/Object;

    .line 225
    .line 226
    iput v4, v0, LQ/s$b;->d:I

    .line 227
    .line 228
    invoke-static {p0, p3, p4, v2, v0}, Lz/j;->f(LE0/b;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p4

    .line 232
    if-ne p4, v1, :cond_a

    .line 233
    .line 234
    :goto_4
    return-object v1

    .line 235
    :cond_a
    :goto_5
    check-cast p4, Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 238
    .line 239
    .line 240
    move-result p2

    .line 241
    if-eqz p2, :cond_c

    .line 242
    .line 243
    invoke-interface {p0}, LE0/b;->F0()LE0/q;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-virtual {p0}, LE0/q;->c()Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    :goto_6
    if-ge v3, p2, :cond_c

    .line 256
    .line 257
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p3

    .line 261
    check-cast p3, LE0/C;

    .line 262
    .line 263
    invoke-static {p3}, LE0/r;->c(LE0/C;)Z

    .line 264
    .line 265
    .line 266
    move-result p4

    .line 267
    if-eqz p4, :cond_b

    .line 268
    .line 269
    invoke-virtual {p3}, LE0/C;->a()V

    .line 270
    .line 271
    .line 272
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_c
    invoke-interface {p1}, LQ/h;->a()V

    .line 276
    .line 277
    .line 278
    :cond_d
    :goto_7
    sget-object p0, LTd/L;->a:LTd/L;

    .line 279
    .line 280
    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/e;LQ/h;LK/J;)Landroidx/compose/ui/e;
    .locals 2

    .line 1
    new-instance v0, LQ/s$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p2, v1}, LQ/s$e;-><init>(LQ/h;LK/J;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1, p2, v0}, LE0/V;->c(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private static final j(LE0/b;LK/J;LE0/q;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, LQ/s$f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LQ/s$f;

    .line 7
    .line 8
    iget v1, v0, LQ/s$f;->e:I

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
    iput v1, v0, LQ/s$f;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LQ/s$f;

    .line 21
    .line 22
    invoke-direct {v0, p3}, LQ/s$f;-><init>(LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LQ/s$f;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LQ/s$f;->e:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, LQ/s$f;->b:Ljava/lang/Object;

    .line 42
    .line 43
    move-object p1, p0

    .line 44
    check-cast p1, LK/J;

    .line 45
    .line 46
    iget-object p0, v0, LQ/s$f;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, LE0/b;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catch_0
    move-exception p0

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_2
    iget-object p0, v0, LQ/s$f;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, LE0/C;

    .line 68
    .line 69
    iget-object p1, v0, LQ/s$f;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, LK/J;

    .line 72
    .line 73
    iget-object p2, v0, LQ/s$f;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p2, LE0/b;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    .line 79
    .line 80
    move-object v7, p2

    .line 81
    move-object p2, p0

    .line 82
    move-object p0, v7

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :try_start_2
    invoke-virtual {p2}, LE0/q;->c()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p2}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, LE0/C;

    .line 96
    .line 97
    invoke-virtual {p2}, LE0/C;->f()J

    .line 98
    .line 99
    .line 100
    move-result-wide v5

    .line 101
    iput-object p0, v0, LQ/s$f;->a:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p1, v0, LQ/s$f;->b:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p2, v0, LQ/s$f;->c:Ljava/lang/Object;

    .line 106
    .line 107
    iput v4, v0, LQ/s$f;->e:I

    .line 108
    .line 109
    invoke-static {p0, v5, v6, v0}, Lz/j;->c(LE0/b;JLZd/e;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    if-ne p3, v1, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    :goto_1
    check-cast p3, LE0/C;

    .line 117
    .line 118
    if-eqz p3, :cond_9

    .line 119
    .line 120
    invoke-interface {p0}, LE0/b;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2, p2, p3}, LQ/s;->f(Landroidx/compose/ui/platform/A1;LE0/C;LE0/C;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_9

    .line 129
    .line 130
    invoke-virtual {p3}, LE0/C;->h()J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    invoke-interface {p1, v4, v5}, LK/J;->c(J)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3}, LE0/C;->f()J

    .line 138
    .line 139
    .line 140
    move-result-wide p2

    .line 141
    new-instance v2, LQ/s$g;

    .line 142
    .line 143
    invoke-direct {v2, p1}, LQ/s$g;-><init>(LK/J;)V

    .line 144
    .line 145
    .line 146
    iput-object p0, v0, LQ/s$f;->a:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object p1, v0, LQ/s$f;->b:Ljava/lang/Object;

    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    iput-object v4, v0, LQ/s$f;->c:Ljava/lang/Object;

    .line 152
    .line 153
    iput v3, v0, LQ/s$f;->e:I

    .line 154
    .line 155
    invoke-static {p0, p2, p3, v2, v0}, Lz/j;->f(LE0/b;JLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    if-ne p3, v1, :cond_5

    .line 160
    .line 161
    :goto_2
    return-object v1

    .line 162
    :cond_5
    :goto_3
    check-cast p3, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_8

    .line 169
    .line 170
    invoke-interface {p0}, LE0/b;->F0()LE0/q;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, LE0/q;->c()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    const/4 p3, 0x0

    .line 183
    :goto_4
    if-ge p3, p2, :cond_7

    .line 184
    .line 185
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, LE0/C;

    .line 190
    .line 191
    invoke-static {v0}, LE0/r;->c(LE0/C;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_6

    .line 196
    .line 197
    invoke-virtual {v0}, LE0/C;->a()V

    .line 198
    .line 199
    .line 200
    :cond_6
    add-int/lit8 p3, p3, 0x1

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_7
    invoke-interface {p1}, LK/J;->a()V

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_8
    invoke-interface {p1}, LK/J;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 208
    .line 209
    .line 210
    :cond_9
    :goto_5
    sget-object p0, LTd/L;->a:LTd/L;

    .line 211
    .line 212
    return-object p0

    .line 213
    :goto_6
    invoke-interface {p1}, LK/J;->onCancel()V

    .line 214
    .line 215
    .line 216
    throw p0
.end method

.method public static final k(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;
    .locals 3

    .line 1
    const v0, 0x845fed

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, LQ/s$h;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p1, v2}, LQ/s$h;-><init>(Lkotlin/jvm/functions/Function1;LZd/e;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0, v1}, LE0/V;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/e;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
