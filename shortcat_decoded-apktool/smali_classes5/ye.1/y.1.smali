.class public abstract Lye/y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method static synthetic a(LXe/b;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lye/y;->e(LXe/b;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final b(Lye/H;LXe/b;)Lye/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lye/y;->c(Lye/H;LXe/b;)Lye/h;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p1, p0, Lye/e;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p0, Lye/e;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static final c(Lye/H;LXe/b;)Lye/h;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lbf/s;->a(Lye/H;)Lye/H;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v0, :cond_5

    .line 18
    .line 19
    invoke-virtual {p1}, LXe/b;->f()LXe/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p0, v0}, Lye/H;->S(LXe/c;)Lye/V;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p1}, LXe/b;->g()LXe/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, LXe/c;->e()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p0}, Lye/V;->o()Ljf/k;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p1}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, LXe/f;

    .line 44
    .line 45
    sget-object v3, LGe/d;->r:LGe/d;

    .line 46
    .line 47
    invoke-interface {p0, v0, v3}, Ljf/n;->e(LXe/f;LGe/b;)Lye/h;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-nez p0, :cond_0

    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, LXe/f;

    .line 77
    .line 78
    instance-of v1, p0, Lye/e;

    .line 79
    .line 80
    if-nez v1, :cond_1

    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_1
    check-cast p0, Lye/e;

    .line 84
    .line 85
    invoke-interface {p0}, Lye/e;->U()Ljf/k;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    sget-object v1, LGe/d;->r:LGe/d;

    .line 90
    .line 91
    invoke-interface {p0, v0, v1}, Ljf/n;->e(LXe/f;LGe/b;)Lye/h;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    instance-of v0, p0, Lye/e;

    .line 96
    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    check-cast p0, Lye/e;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move-object p0, v2

    .line 103
    :goto_1
    if-eqz p0, :cond_3

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    return-object v2

    .line 107
    :cond_4
    return-object p0

    .line 108
    :cond_5
    invoke-virtual {p1}, LXe/b;->f()LXe/c;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-interface {v0, v3}, Lye/H;->S(LXe/c;)Lye/V;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p1}, LXe/b;->g()LXe/c;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v3}, LXe/c;->e()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-interface {v0}, Lye/V;->o()Ljf/k;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v3}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    check-cast v4, LXe/f;

    .line 133
    .line 134
    sget-object v5, LGe/d;->r:LGe/d;

    .line 135
    .line 136
    invoke-interface {v0, v4, v5}, Ljf/n;->e(LXe/f;LGe/b;)Lye/h;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-nez v0, :cond_7

    .line 141
    .line 142
    :cond_6
    :goto_2
    move-object v0, v2

    .line 143
    goto :goto_5

    .line 144
    :cond_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    invoke-interface {v3, v1, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_a

    .line 161
    .line 162
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    check-cast v4, LXe/f;

    .line 167
    .line 168
    instance-of v5, v0, Lye/e;

    .line 169
    .line 170
    if-nez v5, :cond_8

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_8
    check-cast v0, Lye/e;

    .line 174
    .line 175
    invoke-interface {v0}, Lye/e;->U()Ljf/k;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    sget-object v5, LGe/d;->r:LGe/d;

    .line 180
    .line 181
    invoke-interface {v0, v4, v5}, Ljf/n;->e(LXe/f;LGe/b;)Lye/h;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    instance-of v4, v0, Lye/e;

    .line 186
    .line 187
    if-eqz v4, :cond_9

    .line 188
    .line 189
    check-cast v0, Lye/e;

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_9
    move-object v0, v2

    .line 193
    :goto_4
    if-eqz v0, :cond_6

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_a
    :goto_5
    if-nez v0, :cond_10

    .line 197
    .line 198
    invoke-virtual {p1}, LXe/b;->f()LXe/c;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {p0, v0}, Lye/H;->S(LXe/c;)Lye/V;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p1}, LXe/b;->g()LXe/c;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1}, LXe/c;->e()Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-interface {p0}, Lye/V;->o()Ljf/k;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-static {p1}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, LXe/f;

    .line 223
    .line 224
    sget-object v3, LGe/d;->r:LGe/d;

    .line 225
    .line 226
    invoke-interface {p0, v0, v3}, Ljf/n;->e(LXe/f;LGe/b;)Lye/h;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    if-nez p0, :cond_b

    .line 231
    .line 232
    return-object v2

    .line 233
    :cond_b
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_f

    .line 250
    .line 251
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, LXe/f;

    .line 256
    .line 257
    instance-of v1, p0, Lye/e;

    .line 258
    .line 259
    if-nez v1, :cond_c

    .line 260
    .line 261
    return-object v2

    .line 262
    :cond_c
    check-cast p0, Lye/e;

    .line 263
    .line 264
    invoke-interface {p0}, Lye/e;->U()Ljf/k;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    sget-object v1, LGe/d;->r:LGe/d;

    .line 269
    .line 270
    invoke-interface {p0, v0, v1}, Ljf/n;->e(LXe/f;LGe/b;)Lye/h;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    instance-of v0, p0, Lye/e;

    .line 275
    .line 276
    if-eqz v0, :cond_d

    .line 277
    .line 278
    check-cast p0, Lye/e;

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_d
    move-object p0, v2

    .line 282
    :goto_7
    if-eqz p0, :cond_e

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_e
    return-object v2

    .line 286
    :cond_f
    return-object p0

    .line 287
    :cond_10
    return-object v0
.end method

.method public static final d(Lye/H;LXe/b;Lye/M;)Lye/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "notFoundClasses"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Lye/y;->b(Lye/H;LXe/b;)Lye/e;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, Lye/y$a;->b:Lye/y$a;

    .line 24
    .line 25
    invoke-static {p1, p0}, LCf/l;->p(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, Lye/x;->a:Lye/x;

    .line 30
    .line 31
    invoke-static {p0, v0}, LCf/l;->K(LCf/i;Lkotlin/jvm/functions/Function1;)LCf/i;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, LCf/l;->T(LCf/i;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p2, p1, p0}, Lye/M;->d(LXe/b;Ljava/util/List;)Lye/e;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method private static final e(LXe/b;)I
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public static final f(Lye/H;LXe/b;)Lye/l0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1}, Lye/y;->c(Lye/H;LXe/b;)Lye/h;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p1, p0, Lye/l0;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    check-cast p0, Lye/l0;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method
