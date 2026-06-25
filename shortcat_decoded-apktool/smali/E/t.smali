.class public abstract LE/t;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private static final a(Ljava/util/List;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method private static final b(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLC/b$m;LC/b$e;ZLi1/d;)Ljava/util/List;
    .locals 11

    .line 1
    move v0, p4

    .line 2
    move-object/from16 v1, p9

    .line 3
    .line 4
    move/from16 v2, p11

    .line 5
    .line 6
    if-eqz p8, :cond_0

    .line 7
    .line 8
    move v5, v0

    .line 9
    :goto_0
    move/from16 v3, p6

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move v5, p3

    .line 13
    goto :goto_0

    .line 14
    :goto_1
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    move/from16 v6, p5

    .line 20
    .line 21
    if-ge v6, v3, :cond_1

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    move v3, v4

    .line 26
    :goto_2
    if-eqz v3, :cond_3

    .line 27
    .line 28
    if-nez p7, :cond_2

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string p1, "non-zero firstLineScrollOffset"

    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :cond_3
    :goto_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    move v7, v4

    .line 44
    move v8, v7

    .line 45
    :goto_4
    if-ge v7, v6, :cond_4

    .line 46
    .line 47
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    check-cast v9, LE/x;

    .line 52
    .line 53
    invoke-virtual {v9}, LE/x;->b()[LE/v;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    array-length v9, v9

    .line 58
    add-int/2addr v8, v9

    .line 59
    add-int/lit8 v7, v7, 0x1

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    new-instance v9, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    if-eqz v3, :cond_f

    .line 68
    .line 69
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_e

    .line 74
    .line 75
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_e

    .line 80
    .line 81
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    new-array v6, p1, [I

    .line 86
    .line 87
    move v3, v4

    .line 88
    :goto_5
    if-ge v3, p1, :cond_5

    .line 89
    .line 90
    invoke-static {v3, v2, p1}, LE/t;->c(IZI)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    check-cast v7, LE/x;

    .line 99
    .line 100
    invoke-virtual {v7}, LE/x;->c()I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    aput v7, v6, v3

    .line 105
    .line 106
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_5
    new-array v8, p1, [I

    .line 110
    .line 111
    move v3, v4

    .line 112
    :goto_6
    if-ge v3, p1, :cond_6

    .line 113
    .line 114
    aput v4, v8, v3

    .line 115
    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_6
    if-eqz p8, :cond_8

    .line 120
    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    move-object/from16 v4, p12

    .line 124
    .line 125
    invoke-interface {v1, v4, v5, v6, v8}, LC/b$m;->c(Li1/d;I[I[I)V

    .line 126
    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    const-string p1, "null verticalArrangement"

    .line 132
    .line 133
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_8
    move-object/from16 v4, p12

    .line 138
    .line 139
    if-eqz p10, :cond_d

    .line 140
    .line 141
    sget-object v7, Li1/t;->a:Li1/t;

    .line 142
    .line 143
    move-object/from16 v3, p10

    .line 144
    .line 145
    invoke-interface/range {v3 .. v8}, LC/b$e;->b(Li1/d;I[ILi1/t;[I)V

    .line 146
    .line 147
    .line 148
    :goto_7
    invoke-static {v8}, LUd/n;->a0([I)Loe/f;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v2, :cond_9

    .line 153
    .line 154
    invoke-static {v1}, Loe/j;->u(Loe/d;)Loe/d;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    :cond_9
    invoke-virtual {v1}, Loe/d;->f()I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    invoke-virtual {v1}, Loe/d;->i()I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    invoke-virtual {v1}, Loe/d;->l()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-lez v1, :cond_a

    .line 171
    .line 172
    if-le v3, v4, :cond_b

    .line 173
    .line 174
    :cond_a
    if-gez v1, :cond_13

    .line 175
    .line 176
    if-gt v4, v3, :cond_13

    .line 177
    .line 178
    :cond_b
    :goto_8
    aget v6, v8, v3

    .line 179
    .line 180
    invoke-static {v3, v2, p1}, LE/t;->c(IZI)I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    check-cast v7, LE/x;

    .line 189
    .line 190
    if-eqz v2, :cond_c

    .line 191
    .line 192
    sub-int v6, v5, v6

    .line 193
    .line 194
    invoke-virtual {v7}, LE/x;->c()I

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    sub-int/2addr v6, v10

    .line 199
    :cond_c
    invoke-virtual {v7, v6, p3, p4}, LE/x;->f(III)[LE/v;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-static {v9, v6}, LE/t;->a(Ljava/util/List;[Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    if-eq v3, v4, :cond_13

    .line 207
    .line 208
    add-int/2addr v3, v1

    .line 209
    goto :goto_8

    .line 210
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 211
    .line 212
    const-string p1, "null horizontalArrangement"

    .line 213
    .line 214
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p0

    .line 218
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 219
    .line 220
    const-string p1, "no items"

    .line 221
    .line 222
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p0

    .line 226
    :cond_f
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    add-int/lit8 v1, v1, -0x1

    .line 231
    .line 232
    if-ltz v1, :cond_11

    .line 233
    .line 234
    move/from16 v2, p7

    .line 235
    .line 236
    :goto_9
    add-int/lit8 v3, v1, -0x1

    .line 237
    .line 238
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, LE/v;

    .line 243
    .line 244
    invoke-virtual {v1}, LE/v;->l()I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    sub-int/2addr v2, v5

    .line 249
    invoke-virtual {v1, v2, v4, p3, p4}, LE/v;->k(IIII)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    if-gez v3, :cond_10

    .line 256
    .line 257
    goto :goto_a

    .line 258
    :cond_10
    move v1, v3

    .line 259
    goto :goto_9

    .line 260
    :cond_11
    :goto_a
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    move/from16 v1, p7

    .line 265
    .line 266
    move v2, v4

    .line 267
    :goto_b
    if-ge v2, p1, :cond_12

    .line 268
    .line 269
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, LE/x;

    .line 274
    .line 275
    invoke-virtual {v3, v1, p3, p4}, LE/x;->f(III)[LE/v;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-static {v9, v5}, LE/t;->a(Ljava/util/List;[Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3}, LE/x;->d()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    add-int/2addr v1, v3

    .line 287
    add-int/lit8 v2, v2, 0x1

    .line 288
    .line 289
    goto :goto_b

    .line 290
    :cond_12
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result p0

    .line 294
    move p1, v4

    .line 295
    :goto_c
    if-ge p1, p0, :cond_13

    .line 296
    .line 297
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    check-cast v3, LE/v;

    .line 302
    .line 303
    invoke-virtual {v3, v1, v4, p3, p4}, LE/v;->k(IIII)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    invoke-virtual {v3}, LE/v;->l()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    add-int/2addr v1, v3

    .line 314
    add-int/lit8 p1, p1, 0x1

    .line 315
    .line 316
    goto :goto_c

    .line 317
    :cond_13
    return-object v9
.end method

.method private static final c(IZI)I
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    sub-int/2addr p2, p0

    .line 5
    add-int/lit8 p2, p2, -0x1

    .line 6
    .line 7
    return p2
.end method

.method public static final d(ILE/y;LE/w;IIIIIIFJZLC/b$m;LC/b$e;ZLi1/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;LGf/O;LY/C0;Ls0/Z0;Lkotlin/jvm/functions/Function1;Lie/o;)LE/u;
    .locals 40

    move/from16 v14, p0

    move-object/from16 v0, p1

    move/from16 v6, p3

    move/from16 v1, p4

    move-wide/from16 v2, p10

    move-object/from16 v4, p19

    move-object/from16 v13, p24

    if-ltz v1, :cond_2d

    if-ltz p5, :cond_2c

    if-gtz v14, :cond_2

    .line 1
    invoke-static {v2, v3}, Li1/b;->n(J)I

    move-result v16

    .line 2
    invoke-static {v2, v3}, Li1/b;->m(J)I

    move-result v17

    .line 3
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual/range {p2 .. p2}, LE/w;->e()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v19

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/4 v15, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, p2

    move/from16 v21, p12

    move-object/from16 v14, p17

    move/from16 v23, p18

    move-object/from16 v27, p20

    move-object/from16 v28, p22

    .line 5
    invoke-virtual/range {v14 .. v28}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LF/x;ZZIZIILGf/O;Ls0/Z0;)V

    .line 6
    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h()J

    move-result-wide v4

    .line 7
    sget-object v0, Li1/r;->b:Li1/r$a;

    invoke-virtual {v0}, Li1/r$a;->a()J

    move-result-wide v7

    invoke-static {v4, v5, v7, v8}, Li1/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    invoke-static {v4, v5}, Li1/r;->g(J)I

    move-result v0

    invoke-static {v2, v3, v0}, Li1/c;->g(JI)I

    move-result v16

    .line 9
    invoke-static {v4, v5}, Li1/r;->f(J)I

    move-result v0

    invoke-static {v2, v3, v0}, Li1/c;->f(JI)I

    move-result v17

    .line 10
    :cond_0
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, LE/t$a;->a:LE/t$a;

    invoke-interface {v13, v0, v2, v3}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, LI0/C;

    .line 11
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v29

    neg-int v0, v1

    add-int v31, v6, p5

    if-eqz p12, :cond_1

    .line 12
    sget-object v1, Lz/q;->a:Lz/q;

    :goto_0
    move-object/from16 v34, v1

    goto :goto_1

    :cond_1
    sget-object v1, Lz/q;->b:Lz/q;

    goto :goto_0

    .line 13
    :goto_1
    new-instance v18, LE/u;

    const/16 v24, 0x0

    const/16 v32, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v35, p5

    move/from16 v36, p6

    move/from16 v33, p15

    move-object/from16 v26, p16

    move/from16 v27, p18

    move-object/from16 v25, p20

    move-object/from16 v28, p23

    move/from16 v30, v0

    invoke-direct/range {v18 .. v36}, LE/u;-><init>(LE/x;IZFLI0/C;ZLGf/O;Li1/d;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLz/q;II)V

    return-object v18

    .line 14
    :cond_2
    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v5

    sub-int v7, p8, v5

    const/4 v15, 0x0

    if-nez p7, :cond_3

    if-gez v7, :cond_3

    add-int/2addr v5, v7

    move v7, v15

    .line 15
    :cond_3
    new-instance v8, LUd/m;

    invoke-direct {v8}, LUd/m;-><init>()V

    neg-int v9, v1

    if-gez p6, :cond_4

    move/from16 v10, p6

    goto :goto_2

    :cond_4
    move v10, v15

    :goto_2
    add-int/2addr v10, v9

    add-int/2addr v7, v10

    move v11, v7

    move/from16 v7, p7

    :goto_3
    if-gez v11, :cond_5

    if-lez v7, :cond_5

    add-int/lit8 v7, v7, -0x1

    .line 16
    invoke-virtual {v0, v7}, LE/y;->c(I)LE/x;

    move-result-object v12

    .line 17
    invoke-virtual {v8, v15, v12}, LUd/m;->add(ILjava/lang/Object;)V

    .line 18
    invoke-virtual {v12}, LE/x;->d()I

    move-result v12

    add-int/2addr v11, v12

    goto :goto_3

    :cond_5
    if-ge v11, v10, :cond_6

    add-int/2addr v5, v11

    move v11, v10

    :cond_6
    sub-int/2addr v11, v10

    add-int v12, v6, p5

    move/from16 p7, v5

    .line 19
    invoke-static {v12, v15}, Loe/j;->e(II)I

    move-result v5

    neg-int v15, v11

    move/from16 v17, v7

    move/from16 v18, v17

    move/from16 v19, v9

    move v7, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 20
    :goto_4
    invoke-virtual {v8}, LUd/h;->size()I

    move-result v9

    const/16 v33, 0x1

    if-ge v15, v9, :cond_8

    if-lt v7, v5, :cond_7

    .line 21
    invoke-virtual {v8, v15}, LUd/h;->remove(I)Ljava/lang/Object;

    move/from16 v16, v33

    goto :goto_4

    :cond_7
    add-int/lit8 v18, v18, 0x1

    .line 22
    invoke-virtual {v8, v15}, LUd/m;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LE/x;

    invoke-virtual {v9}, LE/x;->d()I

    move-result v9

    add-int/2addr v7, v9

    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_8
    move/from16 v9, v18

    :goto_5
    if-ge v9, v14, :cond_d

    if-lt v7, v5, :cond_9

    if-lez v7, :cond_9

    .line 23
    invoke-virtual {v8}, LUd/m;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_d

    .line 24
    :cond_9
    invoke-virtual {v0, v9}, LE/y;->c(I)LE/x;

    move-result-object v15

    .line 25
    invoke-virtual {v15}, LE/x;->e()Z

    move-result v18

    if-eqz v18, :cond_a

    goto :goto_7

    .line 26
    :cond_a
    invoke-virtual {v15}, LE/x;->d()I

    move-result v18

    add-int v7, v7, v18

    if-gt v7, v10, :cond_b

    .line 27
    invoke-virtual {v15}, LE/x;->b()[LE/v;

    move-result-object v18

    invoke-static/range {v18 .. v18}, LUd/n;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, LE/v;

    move/from16 v20, v5

    invoke-virtual/range {v18 .. v18}, LE/v;->getIndex()I

    move-result v5

    move/from16 v18, v7

    add-int/lit8 v7, v14, -0x1

    if-eq v5, v7, :cond_c

    add-int/lit8 v5, v9, 0x1

    .line 28
    invoke-virtual {v15}, LE/x;->d()I

    move-result v7

    sub-int/2addr v11, v7

    move/from16 v17, v5

    move/from16 v16, v33

    goto :goto_6

    :cond_b
    move/from16 v20, v5

    move/from16 v18, v7

    .line 29
    :cond_c
    invoke-virtual {v8, v15}, LUd/m;->add(Ljava/lang/Object;)Z

    :goto_6
    add-int/lit8 v9, v9, 0x1

    move/from16 v7, v18

    move/from16 v5, v20

    goto :goto_5

    :cond_d
    :goto_7
    if-ge v7, v6, :cond_10

    sub-int v5, v6, v7

    sub-int/2addr v11, v5

    add-int/2addr v7, v5

    :goto_8
    if-ge v11, v1, :cond_e

    if-lez v17, :cond_e

    add-int/lit8 v9, v17, -0x1

    .line 30
    invoke-virtual {v0, v9}, LE/y;->c(I)LE/x;

    move-result-object v10

    const/4 v15, 0x0

    .line 31
    invoke-virtual {v8, v15, v10}, LUd/m;->add(ILjava/lang/Object;)V

    .line 32
    invoke-virtual {v10}, LE/x;->d()I

    move-result v10

    add-int/2addr v11, v10

    move/from16 v17, v9

    goto :goto_8

    :cond_e
    add-int v5, p7, v5

    if-gez v11, :cond_f

    add-int/2addr v5, v11

    add-int/2addr v7, v11

    move v15, v7

    const/4 v7, 0x0

    goto :goto_a

    :cond_f
    :goto_9
    move v15, v7

    move v7, v11

    goto :goto_a

    :cond_10
    move/from16 v5, p7

    goto :goto_9

    .line 33
    :goto_a
    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 34
    invoke-static {v9}, Lke/a;->a(I)I

    move-result v9

    invoke-static {v5}, Lke/a;->a(I)I

    move-result v10

    if-ne v9, v10, :cond_11

    .line 35
    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 36
    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v10

    if-lt v9, v10, :cond_11

    int-to-float v5, v5

    goto :goto_b

    :cond_11
    move/from16 v5, p9

    :goto_b
    if-ltz v7, :cond_2b

    neg-int v9, v7

    .line 37
    invoke-virtual {v8}, LUd/m;->first()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v17, v10

    check-cast v17, LE/x;

    .line 38
    invoke-virtual/range {v17 .. v17}, LE/x;->b()[LE/v;

    move-result-object v10

    invoke-static {v10}, LUd/n;->Y([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LE/v;

    if-eqz v10, :cond_12

    invoke-virtual {v10}, LE/v;->getIndex()I

    move-result v10

    goto :goto_c

    :cond_12
    const/4 v10, 0x0

    .line 39
    :goto_c
    invoke-virtual {v8}, LUd/m;->t()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LE/x;

    if-eqz v11, :cond_13

    invoke-virtual {v11}, LE/x;->b()[LE/v;

    move-result-object v11

    if-eqz v11, :cond_13

    invoke-static {v11}, LUd/n;->C0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LE/v;

    if-eqz v11, :cond_13

    invoke-virtual {v11}, LE/v;->getIndex()I

    move-result v11

    :goto_d
    move/from16 v18, v9

    goto :goto_e

    :cond_13
    const/4 v11, 0x0

    goto :goto_d

    .line 40
    :goto_e
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    const/16 v20, 0x0

    move-object/from16 v21, v20

    const/4 v1, 0x0

    :goto_f
    if-ge v1, v9, :cond_16

    .line 41
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    .line 42
    check-cast v22, Ljava/lang/Number;

    move/from16 v23, v1

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ltz v1, :cond_15

    if-ge v1, v10, :cond_15

    move/from16 v22, v10

    .line 43
    invoke-virtual {v0, v1}, LE/y;->d(I)I

    move-result v10

    move/from16 p7, v1

    move/from16 v25, v11

    move/from16 v24, v12

    const/4 v1, 0x0

    .line 44
    invoke-virtual {v0, v1, v10}, LE/y;->a(II)J

    move-result-wide v11

    move v1, v9

    const/4 v9, 0x0

    move-object v13, v8

    move/from16 v8, p7

    move-object/from16 p7, v13

    move/from16 v34, v19

    move/from16 v37, v22

    move/from16 v35, v24

    move/from16 v13, v25

    move/from16 v19, v1

    move v1, v7

    move-object/from16 v7, p2

    .line 45
    invoke-virtual/range {v7 .. v12}, LE/w;->c(IIIJ)LE/v;

    move-result-object v8

    if-nez v21, :cond_14

    .line 46
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    :cond_14
    move-object/from16 v7, v21

    .line 47
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v21, v7

    goto :goto_10

    :cond_15
    move v1, v7

    move-object/from16 p7, v8

    move/from16 v37, v10

    move v13, v11

    move/from16 v35, v12

    move/from16 v34, v19

    move/from16 v19, v9

    :goto_10
    add-int/lit8 v7, v23, 0x1

    move v8, v7

    move v7, v1

    move v1, v8

    move-object/from16 v8, p7

    move v11, v13

    move/from16 v9, v19

    move/from16 v19, v34

    move/from16 v12, v35

    move/from16 v10, v37

    move-object/from16 v13, p24

    goto :goto_f

    :cond_16
    move v1, v7

    move-object/from16 p7, v8

    move/from16 v37, v10

    move v13, v11

    move/from16 v35, v12

    move/from16 v34, v19

    if-nez v21, :cond_17

    .line 48
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v21

    .line 49
    :cond_17
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_11
    if-ge v8, v7, :cond_1a

    .line 50
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 51
    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    add-int/lit8 v11, v13, 0x1

    if-gt v11, v9, :cond_19

    if-ge v9, v14, :cond_19

    .line 52
    invoke-virtual {v0, v9}, LE/y;->d(I)I

    move-result v10

    const/4 v11, 0x0

    .line 53
    invoke-virtual {v0, v11, v10}, LE/y;->a(II)J

    move-result-wide v22

    move v12, v8

    move v8, v9

    const/4 v9, 0x0

    move/from16 v19, v7

    move/from16 v36, v11

    move-object/from16 v7, p2

    move-wide/from16 v38, v22

    move/from16 v22, v12

    move-wide/from16 v11, v38

    .line 54
    invoke-virtual/range {v7 .. v12}, LE/w;->c(IIIJ)LE/v;

    move-result-object v8

    if-nez v20, :cond_18

    .line 55
    new-instance v20, Ljava/util/ArrayList;

    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    :cond_18
    move-object/from16 v7, v20

    .line 56
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v20, v7

    goto :goto_12

    :cond_19
    move/from16 v19, v7

    move/from16 v22, v8

    const/16 v36, 0x0

    :goto_12
    add-int/lit8 v8, v22, 0x1

    move/from16 v7, v19

    goto :goto_11

    :cond_1a
    const/16 v36, 0x0

    if-nez v20, :cond_1b

    .line 57
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v20

    :cond_1b
    if-gtz p4, :cond_1d

    if-gez p6, :cond_1c

    goto :goto_13

    :cond_1c
    move-object/from16 v4, p7

    move/from16 v29, v1

    goto :goto_15

    .line 58
    :cond_1d
    :goto_13
    invoke-virtual/range {p7 .. p7}, LUd/h;->size()I

    move-result v0

    move v7, v1

    move/from16 v1, v36

    :goto_14
    move-object/from16 v4, p7

    if-ge v1, v0, :cond_1e

    .line 59
    invoke-virtual {v4, v1}, LUd/m;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LE/x;

    invoke-virtual {v8}, LE/x;->d()I

    move-result v8

    if-eqz v7, :cond_1e

    if-gt v8, v7, :cond_1e

    .line 60
    invoke-static {v4}, LUd/u;->o(Ljava/util/List;)I

    move-result v9

    if-eq v1, v9, :cond_1e

    sub-int/2addr v7, v8

    add-int/lit8 v1, v1, 0x1

    .line 61
    invoke-virtual {v4, v1}, LUd/m;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v17, v8

    check-cast v17, LE/x;

    move-object/from16 p7, v4

    goto :goto_14

    :cond_1e
    move/from16 v29, v7

    :goto_15
    if-eqz p12, :cond_1f

    .line 62
    invoke-static {v2, v3}, Li1/b;->l(J)I

    move-result v0

    goto :goto_16

    .line 63
    :cond_1f
    invoke-static {v2, v3, v15}, Li1/c;->g(JI)I

    move-result v0

    :goto_16
    if-eqz p12, :cond_20

    .line 64
    invoke-static {v2, v3, v15}, Li1/c;->f(JI)I

    move-result v1

    :goto_17
    move/from16 v8, p12

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move/from16 v11, p15

    move-object/from16 v12, p16

    move/from16 p7, v13

    move/from16 v7, v18

    move v13, v5

    move v5, v15

    move-wide v14, v2

    move-object/from16 v2, v20

    move v3, v0

    move-object v0, v4

    move v4, v1

    move-object/from16 v1, v21

    goto :goto_18

    .line 65
    :cond_20
    invoke-static {v2, v3}, Li1/b;->k(J)I

    move-result v1

    goto :goto_17

    .line 66
    :goto_18
    invoke-static/range {v0 .. v12}, LE/t;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLC/b$m;LC/b$e;ZLi1/d;)Ljava/util/List;

    move-result-object v22

    move/from16 v21, v4

    move/from16 v30, v5

    float-to-int v0, v13

    .line 67
    invoke-virtual/range {p2 .. p2}, LE/w;->e()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v23

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v24, p2

    move/from16 v25, p12

    move-object/from16 v18, p17

    move/from16 v27, p18

    move-object/from16 v31, p20

    move-object/from16 v32, p22

    move/from16 v19, v0

    move/from16 v20, v3

    .line 68
    invoke-virtual/range {v18 .. v32}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LF/x;ZZIZIILGf/O;Ls0/Z0;)V

    move/from16 v0, v21

    move-object/from16 v4, v22

    .line 69
    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h()J

    move-result-wide v7

    .line 70
    sget-object v9, Li1/r;->b:Li1/r$a;

    invoke-virtual {v9}, Li1/r$a;->a()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Li1/r;->e(JJ)Z

    move-result v9

    if-nez v9, :cond_24

    if-eqz p12, :cond_21

    move v9, v0

    goto :goto_19

    :cond_21
    move v9, v3

    .line 71
    :goto_19
    invoke-static {v7, v8}, Li1/r;->g(J)I

    move-result v10

    invoke-static {v3, v10}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v14, v15, v3}, Li1/c;->g(JI)I

    move-result v3

    .line 72
    invoke-static {v7, v8}, Li1/r;->f(J)I

    move-result v7

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v14, v15, v0}, Li1/c;->f(JI)I

    move-result v21

    if-eqz p12, :cond_22

    move/from16 v0, v21

    goto :goto_1a

    :cond_22
    move v0, v3

    :goto_1a
    if-eq v0, v9, :cond_23

    .line 73
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    move/from16 v15, v36

    :goto_1b
    if-ge v15, v7, :cond_23

    .line 74
    invoke-interface {v4, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 75
    check-cast v8, LE/v;

    .line 76
    invoke-virtual {v8, v0}, LE/v;->u(I)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_1b

    :cond_23
    :goto_1c
    move v0, v3

    goto :goto_1d

    :cond_24
    move/from16 v21, v0

    goto :goto_1c

    :goto_1d
    add-int/lit8 v3, p0, -0x1

    move/from16 v11, p7

    if-ne v11, v3, :cond_26

    if-le v5, v6, :cond_25

    goto :goto_1e

    :cond_25
    move/from16 v3, v36

    goto :goto_1f

    :cond_26
    :goto_1e
    move/from16 v3, v33

    .line 77
    :goto_1f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, LE/t$b;

    move-object/from16 v7, p21

    invoke-direct {v6, v4, v7}, LE/t$b;-><init>(Ljava/util/List;LY/C0;)V

    move-object/from16 v7, p24

    invoke-interface {v7, v0, v5, v6}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LI0/C;

    .line 78
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_27

    move-object v11, v4

    goto :goto_21

    .line 79
    :cond_27
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v15, v36

    :goto_20
    if-ge v15, v1, :cond_29

    .line 81
    invoke-interface {v4, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 82
    move-object v6, v2

    check-cast v6, LE/v;

    .line 83
    invoke-virtual {v6}, LE/v;->getIndex()I

    move-result v6

    move/from16 v10, v37

    if-gt v10, v6, :cond_28

    if-gt v6, v11, :cond_28

    .line 84
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_28
    add-int/lit8 v15, v15, 0x1

    move/from16 v37, v10

    goto :goto_20

    :cond_29
    move-object v11, v0

    :goto_21
    if-eqz p12, :cond_2a

    .line 85
    sget-object v0, Lz/q;->a:Lz/q;

    goto :goto_22

    :cond_2a
    sget-object v0, Lz/q;->b:Lz/q;

    .line 86
    :goto_22
    new-instance v1, LE/u;

    move/from16 v14, p0

    move/from16 v18, p6

    move/from16 v15, p15

    move-object/from16 v8, p16

    move/from16 v9, p18

    move-object/from16 v7, p20

    move-object/from16 v10, p23

    move v4, v13

    move/from16 v6, v16

    move/from16 v2, v29

    move/from16 v12, v34

    move/from16 v13, v35

    move-object/from16 v16, v0

    move-object v0, v1

    move-object/from16 v1, v17

    move/from16 v17, p5

    invoke-direct/range {v0 .. v18}, LE/u;-><init>(LE/x;IZFLI0/C;ZLGf/O;Li1/d;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLz/q;II)V

    return-object v0

    .line 87
    :cond_2b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative initial offset"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 88
    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative afterContentPadding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_2d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative beforeContentPadding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
