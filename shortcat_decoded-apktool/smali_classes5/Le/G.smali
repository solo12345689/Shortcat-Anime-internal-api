.class public final LLe/G;
.super LLe/b0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLe/G$a;,
        LLe/G$b;
    }
.end annotation


# instance fields
.field private final n:LOe/u;

.field private final o:LLe/D;

.field private final p:Lpf/j;

.field private final q:Lpf/h;


# direct methods
.method public constructor <init>(LKe/k;LOe/u;LLe/D;)V
    .locals 1

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "jPackage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ownerDescriptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, LLe/b0;-><init>(LKe/k;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LLe/G;->n:LOe/u;

    .line 20
    .line 21
    iput-object p3, p0, LLe/G;->o:LLe/D;

    .line 22
    .line 23
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    new-instance p3, LLe/E;

    .line 28
    .line 29
    invoke-direct {p3, p1, p0}, LLe/E;-><init>(LKe/k;LLe/G;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, p3}, Lpf/n;->g(Lie/a;)Lpf/j;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, LLe/G;->p:Lpf/j;

    .line 37
    .line 38
    invoke-virtual {p1}, LKe/k;->e()Lpf/n;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    new-instance p3, LLe/F;

    .line 43
    .line 44
    invoke-direct {p3, p0, p1}, LLe/F;-><init>(LLe/G;LKe/k;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2, p3}, Lpf/n;->d(Lkotlin/jvm/functions/Function1;)Lpf/h;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, LLe/G;->q:Lpf/h;

    .line 52
    .line 53
    return-void
.end method

.method static synthetic g0(LKe/k;LLe/G;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LLe/G;->o0(LKe/k;LLe/G;)Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic h0(LLe/G;LKe/k;LLe/G$a;)Lye/e;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LLe/G;->i0(LLe/G;LKe/k;LLe/G$a;)Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final i0(LLe/G;LKe/k;LLe/G$a;)Lye/e;
    .locals 15

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, LXe/b;

    .line 9
    .line 10
    invoke-virtual {p0}, LLe/G;->n0()LLe/D;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LBe/H;->f()LXe/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v1}, LLe/G$a;->b()LXe/f;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-direct {v2, v0, v3}, LXe/b;-><init>(LXe/c;LXe/f;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, LLe/G$a;->a()LOe/g;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual/range {p1 .. p1}, LKe/k;->a()LKe/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, LKe/d;->j()LQe/v;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v1}, LLe/G$a;->a()LOe/g;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-direct {p0}, LLe/G;->m0()LUe/c;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-interface {v0, v3, v4}, LQe/v;->a(LOe/g;LUe/c;)LQe/v$a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual/range {p1 .. p1}, LKe/k;->a()LKe/d;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, LKe/d;->j()LQe/v;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p0}, LLe/G;->m0()LUe/c;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v0, v2, v3}, LQe/v;->c(LXe/b;LUe/c;)LQe/v$a;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_0
    const/4 v7, 0x0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0}, LQe/v$a;->a()LQe/x;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move-object v0, v7

    .line 77
    :goto_1
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-interface {v0}, LQe/x;->g()LXe/b;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move-object v3, v7

    .line 85
    :goto_2
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-virtual {v3}, LXe/b;->j()Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-nez v4, :cond_3

    .line 92
    .line 93
    invoke-virtual {v3}, LXe/b;->i()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    :cond_3
    return-object v7

    .line 100
    :cond_4
    invoke-direct {p0, v0}, LLe/G;->p0(LQe/x;)LLe/G$b;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    instance-of v3, v0, LLe/G$b$a;

    .line 105
    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    check-cast v0, LLe/G$b$a;

    .line 109
    .line 110
    invoke-virtual {v0}, LLe/G$b$a;->a()Lye/e;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_5
    instance-of v3, v0, LLe/G$b$c;

    .line 116
    .line 117
    if-eqz v3, :cond_6

    .line 118
    .line 119
    return-object v7

    .line 120
    :cond_6
    instance-of v0, v0, LLe/G$b$b;

    .line 121
    .line 122
    if-eqz v0, :cond_d

    .line 123
    .line 124
    invoke-virtual {v1}, LLe/G$a;->a()LOe/g;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v0, :cond_7

    .line 129
    .line 130
    invoke-virtual/range {p1 .. p1}, LKe/k;->a()LKe/d;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, LKe/d;->d()LHe/u;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v1, LHe/u$a;

    .line 139
    .line 140
    const/4 v5, 0x4

    .line 141
    const/4 v6, 0x0

    .line 142
    const/4 v3, 0x0

    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-direct/range {v1 .. v6}, LHe/u$a;-><init>(LXe/b;[BLOe/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 145
    .line 146
    .line 147
    invoke-interface {v0, v1}, LHe/u;->b(LHe/u$a;)LOe/g;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :cond_7
    move-object v11, v0

    .line 152
    if-eqz v11, :cond_8

    .line 153
    .line 154
    invoke-interface {v11}, LOe/g;->K()LOe/D;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    goto :goto_3

    .line 159
    :cond_8
    move-object v0, v7

    .line 160
    :goto_3
    sget-object v1, LOe/D;->b:LOe/D;

    .line 161
    .line 162
    if-eq v0, v1, :cond_c

    .line 163
    .line 164
    if-eqz v11, :cond_9

    .line 165
    .line 166
    invoke-interface {v11}, LOe/g;->f()LXe/c;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    goto :goto_4

    .line 171
    :cond_9
    move-object v0, v7

    .line 172
    :goto_4
    if-eqz v0, :cond_b

    .line 173
    .line 174
    invoke-virtual {v0}, LXe/c;->c()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-nez v1, :cond_b

    .line 179
    .line 180
    invoke-virtual {v0}, LXe/c;->d()LXe/c;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {p0}, LLe/G;->n0()LLe/D;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, LBe/H;->f()LXe/c;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_a

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_a
    new-instance v8, LLe/n;

    .line 200
    .line 201
    invoke-virtual {p0}, LLe/G;->n0()LLe/D;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    const/16 v13, 0x8

    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const/4 v12, 0x0

    .line 209
    move-object/from16 v9, p1

    .line 210
    .line 211
    invoke-direct/range {v8 .. v14}, LLe/n;-><init>(LKe/k;Lye/m;LOe/g;Lye/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {p1 .. p1}, LKe/k;->a()LKe/d;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {p0}, LKe/d;->e()LHe/v;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-interface {p0, v8}, LHe/v;->a(LJe/c;)V

    .line 223
    .line 224
    .line 225
    return-object v8

    .line 226
    :cond_b
    :goto_5
    return-object v7

    .line 227
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 228
    .line 229
    new-instance v1, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const-string v3, "Couldn\'t find kotlin binary class for light class created by kotlin binary file\nJavaClass: "

    .line 235
    .line 236
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v3, "\nClassId: "

    .line 243
    .line 244
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v3, "\nfindKotlinClass(JavaClass) = "

    .line 251
    .line 252
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {p1 .. p1}, LKe/k;->a()LKe/d;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v3}, LKe/d;->j()LQe/v;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-direct {p0}, LLe/G;->m0()LUe/c;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-static {v3, v11, v4}, LQe/w;->a(LQe/v;LOe/g;LUe/c;)LQe/x;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string v3, "\nfindKotlinClass(ClassId) = "

    .line 275
    .line 276
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {p1 .. p1}, LKe/k;->a()LKe/d;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-virtual {v3}, LKe/d;->j()LQe/v;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-direct {p0}, LLe/G;->m0()LUe/c;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-static {v3, v2, p0}, LQe/w;->b(LQe/v;LXe/b;LUe/c;)LQe/x;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const/16 p0, 0xa

    .line 299
    .line 300
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :cond_d
    new-instance p0, LTd/r;

    .line 312
    .line 313
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 314
    .line 315
    .line 316
    throw p0
.end method

.method private final j0(LXe/f;LOe/g;)Lye/e;
    .locals 3

    .line 1
    sget-object v0, LXe/h;->a:LXe/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LXe/h;->a(LXe/f;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    iget-object v0, p0, LLe/G;->p:Lpf/j;

    .line 12
    .line 13
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/util/Set;

    .line 18
    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, LXe/f;->b()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_1
    iget-object v0, p0, LLe/G;->q:Lpf/h;

    .line 35
    .line 36
    new-instance v1, LLe/G$a;

    .line 37
    .line 38
    invoke-direct {v1, p1, p2}, LLe/G$a;-><init>(LXe/f;LOe/g;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lye/e;

    .line 46
    .line 47
    return-object p1
.end method

.method private final m0()LUe/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LKe/d;->b()LQe/n;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LQe/n;->f()Lmf/n;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lmf/n;->g()Lmf/o;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lmf/o;->d()LUe/c;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method private static final o0(LKe/k;LLe/G;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-virtual {p0}, LKe/k;->a()LKe/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, LKe/d;->d()LHe/u;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, LLe/G;->n0()LLe/D;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, LBe/H;->f()LXe/c;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p0, p1}, LHe/u;->c(LXe/c;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final p0(LQe/x;)LLe/G$b;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LLe/G$b$b;->a:LLe/G$b$b;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-interface {p1}, LQe/x;->d()LRe/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, LRe/a;->c()LRe/a$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, LRe/a$a;->e:LRe/a$a;

    .line 15
    .line 16
    if-ne v0, v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, LLe/U;->L()LKe/k;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, LKe/k;->a()LKe/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, LKe/d;->b()LQe/n;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, LQe/n;->n(LQe/x;)Lye/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance v0, LLe/G$b$a;

    .line 37
    .line 38
    invoke-direct {v0, p1}, LLe/G$b$a;-><init>(Lye/e;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    sget-object p1, LLe/G$b$b;->a:LLe/G$b$b;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_2
    sget-object p1, LLe/G$b$c;->a:LLe/G$b$c;

    .line 46
    .line 47
    return-object p1
.end method


# virtual methods
.method protected B(Ljava/util/Collection;LXe/f;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "name"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected D(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 0

    .line 1
    const-string p2, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public bridge synthetic R()Lye/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LLe/G;->n0()LLe/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public a(LXe/f;LGe/b;)Ljava/util/Collection;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "location"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public bridge synthetic e(LXe/f;LGe/b;)Lye/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LLe/G;->l0(LXe/f;LGe/b;)Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 4

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Ljf/d;->c:Ljf/d$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljf/d$a;->c()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0}, Ljf/d$a;->e()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    or-int/2addr v0, v1

    .line 22
    invoke-virtual {p1, v0}, Ljf/d;->a(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p0}, LLe/U;->K()Lpf/i;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/Iterable;

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move-object v2, v1

    .line 63
    check-cast v2, Lye/m;

    .line 64
    .line 65
    instance-of v3, v2, Lye/e;

    .line 66
    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    check-cast v2, Lye/e;

    .line 70
    .line 71
    invoke-interface {v2}, Lye/J;->getName()LXe/f;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const-string v3, "getName(...)"

    .line 76
    .line 77
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    return-object v0
.end method

.method public final k0(LOe/g;)Lye/e;
    .locals 1

    .line 1
    const-string v0, "javaClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LOe/t;->getName()LXe/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0, p1}, LLe/G;->j0(LXe/f;LOe/g;)Lye/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public l0(LXe/f;LGe/b;)Lye/e;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-direct {p0, p1, p2}, LLe/G;->j0(LXe/f;LOe/g;)Lye/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method protected n0()LLe/D;
    .locals 1

    .line 1
    iget-object v0, p0, LLe/G;->o:LLe/D;

    .line 2
    .line 3
    return-object v0
.end method

.method protected v(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 3

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljf/d;->c:Ljf/d$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljf/d$a;->e()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Ljf/d;->a(I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    iget-object p1, p0, LLe/G;->p:Lpf/j;

    .line 24
    .line 25
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/util/Set;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    check-cast p1, Ljava/lang/Iterable;

    .line 34
    .line 35
    new-instance p2, Ljava/util/HashSet;

    .line 36
    .line 37
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-object p2

    .line 65
    :cond_2
    iget-object p1, p0, LLe/G;->n:LOe/u;

    .line 66
    .line 67
    if-nez p2, :cond_3

    .line 68
    .line 69
    invoke-static {}, LAf/i;->k()Lkotlin/jvm/functions/Function1;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :cond_3
    invoke-interface {p1, p2}, LOe/u;->F(Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Ljava/lang/Iterable;

    .line 78
    .line 79
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 80
    .line 81
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, LOe/g;

    .line 99
    .line 100
    invoke-interface {v0}, LOe/g;->K()LOe/D;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v2, LOe/D;->a:LOe/D;

    .line 105
    .line 106
    if-ne v1, v2, :cond_5

    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    invoke-interface {v0}, LOe/t;->getName()LXe/f;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_2
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    return-object p2
.end method

.method protected x(Ljf/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 0

    .line 1
    const-string p2, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LUd/a0;->d()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method protected z()LLe/c;
    .locals 1

    .line 1
    sget-object v0, LLe/c$a;->a:LLe/c$a;

    .line 2
    .line 3
    return-object v0
.end method
