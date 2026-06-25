.class public abstract LD/r;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method private static final a(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLC/b$m;LC/b$e;ZLi1/d;)Ljava/util/List;
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
    const-string p1, "non-zero itemsScrollOffset"

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
    new-instance v9, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    add-int/2addr v6, v7

    .line 50
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    add-int/2addr v6, v7

    .line 55
    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    if-eqz v3, :cond_e

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_d

    .line 65
    .line 66
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_d

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    new-array v6, p1, [I

    .line 77
    .line 78
    move v3, v4

    .line 79
    :goto_4
    if-ge v3, p1, :cond_4

    .line 80
    .line 81
    invoke-static {v3, v2, p1}, LD/r;->b(IZI)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, LD/t;

    .line 90
    .line 91
    invoke-virtual {v7}, LD/t;->getSize()I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    aput v7, v6, v3

    .line 96
    .line 97
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    new-array v8, p1, [I

    .line 101
    .line 102
    move v3, v4

    .line 103
    :goto_5
    if-ge v3, p1, :cond_5

    .line 104
    .line 105
    aput v4, v8, v3

    .line 106
    .line 107
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_5
    if-eqz p8, :cond_7

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    move-object/from16 v4, p12

    .line 115
    .line 116
    invoke-interface {v1, v4, v5, v6, v8}, LC/b$m;->c(Li1/d;I[I[I)V

    .line 117
    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    const-string p1, "null verticalArrangement when isVertical == true"

    .line 123
    .line 124
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0

    .line 128
    :cond_7
    move-object/from16 v4, p12

    .line 129
    .line 130
    if-eqz p10, :cond_c

    .line 131
    .line 132
    sget-object v7, Li1/t;->a:Li1/t;

    .line 133
    .line 134
    move-object/from16 v3, p10

    .line 135
    .line 136
    invoke-interface/range {v3 .. v8}, LC/b$e;->b(Li1/d;I[ILi1/t;[I)V

    .line 137
    .line 138
    .line 139
    :goto_6
    invoke-static {v8}, LUd/n;->a0([I)Loe/f;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-nez v2, :cond_8

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_8
    invoke-static {v1}, Loe/j;->u(Loe/d;)Loe/d;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    :goto_7
    invoke-virtual {v1}, Loe/d;->f()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    invoke-virtual {v1}, Loe/d;->i()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-virtual {v1}, Loe/d;->l()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-lez v1, :cond_9

    .line 163
    .line 164
    if-le v3, v4, :cond_a

    .line 165
    .line 166
    :cond_9
    if-gez v1, :cond_11

    .line 167
    .line 168
    if-gt v4, v3, :cond_11

    .line 169
    .line 170
    :cond_a
    :goto_8
    aget v6, v8, v3

    .line 171
    .line 172
    invoke-static {v3, v2, p1}, LD/r;->b(IZI)I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    check-cast v7, LD/t;

    .line 181
    .line 182
    if-eqz v2, :cond_b

    .line 183
    .line 184
    sub-int v6, v5, v6

    .line 185
    .line 186
    invoke-virtual {v7}, LD/t;->getSize()I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    sub-int/2addr v6, v10

    .line 191
    :cond_b
    invoke-virtual {v7, v6, p3, p4}, LD/t;->q(III)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    if-eq v3, v4, :cond_11

    .line 198
    .line 199
    add-int/2addr v3, v1

    .line 200
    goto :goto_8

    .line 201
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 202
    .line 203
    const-string p1, "null horizontalArrangement when isVertical == false"

    .line 204
    .line 205
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p0

    .line 209
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 210
    .line 211
    const-string p1, "no extra items"

    .line 212
    .line 213
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p0

    .line 217
    :cond_e
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    move/from16 v3, p7

    .line 222
    .line 223
    move v2, v4

    .line 224
    :goto_9
    if-ge v2, v1, :cond_f

    .line 225
    .line 226
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    check-cast v5, LD/t;

    .line 231
    .line 232
    invoke-virtual {v5}, LD/t;->l()I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    sub-int/2addr v3, v6

    .line 237
    invoke-virtual {v5, v3, p3, p4}, LD/t;->q(III)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    add-int/lit8 v2, v2, 0x1

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_f
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    move/from16 v1, p7

    .line 251
    .line 252
    move v2, v4

    .line 253
    :goto_a
    if-ge v2, p1, :cond_10

    .line 254
    .line 255
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    check-cast v3, LD/t;

    .line 260
    .line 261
    invoke-virtual {v3, v1, p3, p4}, LD/t;->q(III)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3}, LD/t;->l()I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    add-int/2addr v1, v3

    .line 272
    add-int/lit8 v2, v2, 0x1

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_10
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    :goto_b
    if-ge v4, p0, :cond_11

    .line 280
    .line 281
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    check-cast v2, LD/t;

    .line 286
    .line 287
    invoke-virtual {v2, v1, p3, p4}, LD/t;->q(III)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, LD/t;->l()I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    add-int/2addr v1, v2

    .line 298
    add-int/lit8 v4, v4, 0x1

    .line 299
    .line 300
    goto :goto_b

    .line 301
    :cond_11
    return-object v9
.end method

.method private static final b(IZI)I
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

.method private static final c(Ljava/util/List;LD/u;IILjava/util/List;FZLD/q;)Ljava/util/List;
    .locals 14

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    invoke-static {p0}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LD/t;

    .line 8
    .line 9
    invoke-virtual {v1}, LD/t;->getIndex()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int v1, v1, p3

    .line 14
    .line 15
    add-int/lit8 v2, v0, -0x1

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p0}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, LD/t;

    .line 26
    .line 27
    invoke-virtual {v3}, LD/t;->getIndex()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-gt v3, v1, :cond_1

    .line 35
    .line 36
    move v6, v3

    .line 37
    move-object v3, v4

    .line 38
    :goto_0
    if-nez v3, :cond_0

    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    :cond_0
    const/4 v9, 0x2

    .line 46
    const/4 v10, 0x0

    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    move-object v5, p1

    .line 50
    invoke-static/range {v5 .. v10}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    if-eq v6, v1, :cond_2

    .line 58
    .line 59
    add-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v3, v4

    .line 63
    :cond_2
    const/4 v5, 0x0

    .line 64
    if-eqz p6, :cond_14

    .line 65
    .line 66
    if-eqz p7, :cond_14

    .line 67
    .line 68
    invoke-interface/range {p7 .. p7}, LD/q;->i()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_14

    .line 77
    .line 78
    invoke-interface/range {p7 .. p7}, LD/q;->i()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    add-int/lit8 v7, v7, -0x1

    .line 87
    .line 88
    :goto_1
    const/4 v8, -0x1

    .line 89
    if-ge v8, v7, :cond_5

    .line 90
    .line 91
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, LD/l;

    .line 96
    .line 97
    invoke-interface {v8}, LD/l;->getIndex()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-le v8, v1, :cond_4

    .line 102
    .line 103
    if-eqz v7, :cond_3

    .line 104
    .line 105
    add-int/lit8 v8, v7, -0x1

    .line 106
    .line 107
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, LD/l;

    .line 112
    .line 113
    invoke-interface {v8}, LD/l;->getIndex()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-gt v8, v1, :cond_4

    .line 118
    .line 119
    :cond_3
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, LD/l;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    add-int/lit8 v7, v7, -0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    move-object v6, v4

    .line 130
    :goto_2
    invoke-interface/range {p7 .. p7}, LD/q;->i()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-static {v7}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, LD/l;

    .line 139
    .line 140
    if-eqz v6, :cond_b

    .line 141
    .line 142
    invoke-interface {v6}, LD/l;->getIndex()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-interface {v7}, LD/l;->getIndex()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-gt v6, v2, :cond_b

    .line 155
    .line 156
    move v9, v6

    .line 157
    :goto_3
    if-eqz v3, :cond_8

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    move v8, v5

    .line 164
    :goto_4
    if-ge v8, v6, :cond_7

    .line 165
    .line 166
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    move-object v11, v10

    .line 171
    check-cast v11, LD/t;

    .line 172
    .line 173
    invoke-virtual {v11}, LD/t;->getIndex()I

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    if-ne v11, v9, :cond_6

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_7
    move-object v10, v4

    .line 184
    :goto_5
    check-cast v10, LD/t;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    move-object v10, v4

    .line 188
    :goto_6
    if-nez v10, :cond_a

    .line 189
    .line 190
    if-nez v3, :cond_9

    .line 191
    .line 192
    new-instance v3, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    :cond_9
    const/4 v12, 0x2

    .line 198
    const/4 v13, 0x0

    .line 199
    const-wide/16 v10, 0x0

    .line 200
    .line 201
    move-object v8, p1

    .line 202
    invoke-static/range {v8 .. v13}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    :cond_a
    if-eq v9, v2, :cond_b

    .line 210
    .line 211
    add-int/lit8 v9, v9, 0x1

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_b
    invoke-interface/range {p7 .. p7}, LD/q;->d()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    invoke-interface {v7}, LD/l;->getOffset()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    sub-int/2addr v2, v6

    .line 223
    invoke-interface {v7}, LD/l;->getSize()I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    sub-int/2addr v2, v6

    .line 228
    int-to-float v2, v2

    .line 229
    sub-float v2, v2, p5

    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    cmpl-float v6, v2, v6

    .line 233
    .line 234
    if-lez v6, :cond_14

    .line 235
    .line 236
    invoke-interface {v7}, LD/l;->getIndex()I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    add-int/lit8 v6, v6, 0x1

    .line 241
    .line 242
    move v9, v6

    .line 243
    move v6, v5

    .line 244
    :goto_7
    if-ge v9, v0, :cond_14

    .line 245
    .line 246
    int-to-float v7, v6

    .line 247
    cmpg-float v7, v7, v2

    .line 248
    .line 249
    if-gez v7, :cond_14

    .line 250
    .line 251
    if-gt v9, v1, :cond_e

    .line 252
    .line 253
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    move v8, v5

    .line 258
    :goto_8
    if-ge v8, v7, :cond_d

    .line 259
    .line 260
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    move-object v11, v10

    .line 265
    check-cast v11, LD/t;

    .line 266
    .line 267
    invoke-virtual {v11}, LD/t;->getIndex()I

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    if-ne v11, v9, :cond_c

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_d
    move-object v10, v4

    .line 278
    :goto_9
    check-cast v10, LD/t;

    .line 279
    .line 280
    goto :goto_c

    .line 281
    :cond_e
    if-eqz v3, :cond_11

    .line 282
    .line 283
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    move v8, v5

    .line 288
    :goto_a
    if-ge v8, v7, :cond_10

    .line 289
    .line 290
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    move-object v11, v10

    .line 295
    check-cast v11, LD/t;

    .line 296
    .line 297
    invoke-virtual {v11}, LD/t;->getIndex()I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    if-ne v11, v9, :cond_f

    .line 302
    .line 303
    goto :goto_b

    .line 304
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_10
    move-object v10, v4

    .line 308
    :goto_b
    check-cast v10, LD/t;

    .line 309
    .line 310
    goto :goto_c

    .line 311
    :cond_11
    move-object v10, v4

    .line 312
    :goto_c
    if-eqz v10, :cond_12

    .line 313
    .line 314
    add-int/lit8 v9, v9, 0x1

    .line 315
    .line 316
    invoke-virtual {v10}, LD/t;->l()I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    :goto_d
    add-int/2addr v6, v7

    .line 321
    goto :goto_7

    .line 322
    :cond_12
    if-nez v3, :cond_13

    .line 323
    .line 324
    new-instance v3, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 327
    .line 328
    .line 329
    :cond_13
    const/4 v12, 0x2

    .line 330
    const/4 v13, 0x0

    .line 331
    const-wide/16 v10, 0x0

    .line 332
    .line 333
    move-object v8, p1

    .line 334
    invoke-static/range {v8 .. v13}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    add-int/lit8 v9, v9, 0x1

    .line 342
    .line 343
    invoke-static {v3}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    check-cast v7, LD/t;

    .line 348
    .line 349
    invoke-virtual {v7}, LD/t;->l()I

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    goto :goto_d

    .line 354
    :cond_14
    if-eqz v3, :cond_15

    .line 355
    .line 356
    invoke-static {v3}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    check-cast p0, LD/t;

    .line 361
    .line 362
    invoke-virtual {p0}, LD/t;->getIndex()I

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    if-le p0, v1, :cond_15

    .line 367
    .line 368
    invoke-static {v3}, LUd/u;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    check-cast p0, LD/t;

    .line 373
    .line 374
    invoke-virtual {p0}, LD/t;->getIndex()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    :cond_15
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    :goto_e
    if-ge v5, p0, :cond_18

    .line 383
    .line 384
    move-object/from16 v0, p4

    .line 385
    .line 386
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    check-cast v2, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v9

    .line 396
    if-le v9, v1, :cond_17

    .line 397
    .line 398
    if-nez v3, :cond_16

    .line 399
    .line 400
    new-instance v3, Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 403
    .line 404
    .line 405
    :cond_16
    const/4 v12, 0x2

    .line 406
    const/4 v13, 0x0

    .line 407
    const-wide/16 v10, 0x0

    .line 408
    .line 409
    move-object v8, p1

    .line 410
    invoke-static/range {v8 .. v13}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    :cond_17
    add-int/lit8 v5, v5, 0x1

    .line 418
    .line 419
    goto :goto_e

    .line 420
    :cond_18
    if-nez v3, :cond_19

    .line 421
    .line 422
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    return-object p0

    .line 427
    :cond_19
    return-object v3
.end method

.method private static final d(ILD/u;ILjava/util/List;)Ljava/util/List;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    sub-int p2, p0, p2

    .line 3
    .line 4
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    add-int/lit8 p0, p0, -0x1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-gt p2, p0, :cond_1

    .line 12
    .line 13
    move v2, p0

    .line 14
    :goto_0
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    move-object v0, p0

    .line 22
    :cond_0
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x0

    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    if-eq v2, p2, :cond_2

    .line 35
    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    move-object p1, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, p1

    .line 41
    :cond_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    add-int/lit8 p0, p0, -0x1

    .line 46
    .line 47
    if-ltz p0, :cond_6

    .line 48
    .line 49
    :goto_1
    add-int/lit8 p1, p0, -0x1

    .line 50
    .line 51
    invoke-interface {p3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ge v4, p2, :cond_4

    .line 62
    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    new-instance v0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    :cond_3
    const/4 v7, 0x2

    .line 71
    const/4 v8, 0x0

    .line 72
    const-wide/16 v5, 0x0

    .line 73
    .line 74
    move-object v3, v1

    .line 75
    invoke-static/range {v3 .. v8}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_4
    if-gez p1, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    move p0, p1

    .line 86
    goto :goto_1

    .line 87
    :cond_6
    :goto_2
    if-nez v0, :cond_7

    .line 88
    .line 89
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :cond_7
    return-object v0
.end method

.method public static final e(ILD/u;IIIIIIFJZLjava/util/List;LC/b$m;LC/b$e;ZLi1/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLD/q;LGf/O;LY/C0;Ls0/Z0;Lie/o;)LD/s;
    .locals 39

    move/from16 v15, p0

    move/from16 v8, p2

    move/from16 v13, p3

    move-wide/from16 v9, p9

    move-object/from16 v11, p26

    if-ltz v13, :cond_28

    if-ltz p4, :cond_27

    if-gtz v15, :cond_2

    .line 1
    invoke-static {v9, v10}, Li1/b;->n(J)I

    move-result v16

    .line 2
    invoke-static {v9, v10}, Li1/b;->m(J)I

    move-result v17

    .line 3
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual/range {p1 .. p1}, LD/u;->g()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v19

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/4 v15, 0x0

    const/16 v23, 0x1

    move-object/from16 v20, p1

    move/from16 v21, p11

    move-object/from16 v14, p17

    move/from16 v24, p20

    move/from16 v22, p21

    move-object/from16 v27, p23

    move-object/from16 v28, p25

    .line 5
    invoke-virtual/range {v14 .. v28}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LF/x;ZZIZIILGf/O;Ls0/Z0;)V

    if-nez p21, :cond_0

    .line 6
    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h()J

    move-result-wide v0

    .line 7
    sget-object v2, Li1/r;->b:Li1/r$a;

    invoke-virtual {v2}, Li1/r$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Li1/r;->e(JJ)Z

    move-result v2

    if-nez v2, :cond_0

    .line 8
    invoke-static {v0, v1}, Li1/r;->g(J)I

    move-result v2

    invoke-static {v9, v10, v2}, Li1/c;->g(JI)I

    move-result v16

    .line 9
    invoke-static {v0, v1}, Li1/r;->f(J)I

    move-result v0

    invoke-static {v9, v10, v0}, Li1/c;->f(JI)I

    move-result v17

    .line 10
    :cond_0
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, LD/r$a;->a:LD/r$a;

    invoke-interface {v11, v0, v1, v2}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, LI0/C;

    .line 11
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v30

    neg-int v0, v13

    add-int v32, v8, p4

    if-eqz p11, :cond_1

    .line 12
    sget-object v1, Lz/q;->a:Lz/q;

    :goto_0
    move-object/from16 v35, v1

    goto :goto_1

    :cond_1
    sget-object v1, Lz/q;->b:Lz/q;

    goto :goto_0

    .line 13
    :goto_1
    invoke-virtual/range {p1 .. p1}, LD/u;->f()J

    move-result-wide v28

    .line 14
    new-instance v18, LD/s;

    const/16 v33, 0x0

    const/16 v38, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move/from16 v36, p4

    move/from16 v37, p5

    move/from16 v34, p15

    move-object/from16 v27, p16

    move-object/from16 v26, p23

    move/from16 v31, v0

    invoke-direct/range {v18 .. v38}, LD/s;-><init>(LD/t;IZFLI0/C;FZLGf/O;Li1/d;JLjava/util/List;IIIZLz/q;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v18

    :cond_2
    const/4 v14, 0x0

    move/from16 v0, p6

    if-lt v0, v15, :cond_3

    add-int/lit8 v0, v15, -0x1

    move v1, v14

    goto :goto_2

    :cond_3
    move/from16 v1, p7

    .line 15
    :goto_2
    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_4

    if-gez v1, :cond_4

    add-int/2addr v2, v1

    move v1, v14

    :cond_4
    move v6, v2

    .line 16
    new-instance v7, LUd/m;

    invoke-direct {v7}, LUd/m;-><init>()V

    neg-int v12, v13

    if-gez p5, :cond_5

    move/from16 v2, p5

    goto :goto_3

    :cond_5
    move v2, v14

    :goto_3
    add-int/2addr v2, v12

    add-int/2addr v1, v2

    move v3, v14

    :goto_4
    if-gez v1, :cond_6

    if-lez v0, :cond_6

    add-int/lit8 v0, v0, -0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    move/from16 v16, v2

    move/from16 v17, v3

    const-wide/16 v2, 0x0

    move/from16 p6, v6

    move/from16 v6, v16

    move/from16 v11, v17

    move/from16 v16, v12

    move v12, v1

    move v1, v0

    move-object/from16 v0, p1

    .line 17
    invoke-static/range {v0 .. v5}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    move-result-object v2

    .line 18
    invoke-virtual {v7, v14, v2}, LUd/m;->add(ILjava/lang/Object;)V

    .line 19
    invoke-virtual {v2}, LD/t;->b()I

    move-result v0

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 20
    invoke-virtual {v2}, LD/t;->l()I

    move-result v0

    add-int/2addr v0, v12

    move v2, v1

    move v1, v0

    move v0, v2

    move-object/from16 v11, p26

    move v2, v6

    move/from16 v12, v16

    move/from16 v6, p6

    goto :goto_4

    :cond_6
    move v11, v3

    move/from16 p6, v6

    move/from16 v16, v12

    move v12, v1

    move v6, v2

    if-ge v12, v6, :cond_7

    add-int v1, p6, v12

    move v12, v1

    move v2, v6

    goto :goto_5

    :cond_7
    move v2, v12

    move/from16 v12, p6

    :goto_5
    sub-int/2addr v2, v6

    add-int v1, v8, p4

    .line 21
    invoke-static {v1, v14}, Loe/j;->e(II)I

    move-result v3

    neg-int v4, v2

    move/from16 v17, v0

    move v5, v14

    move/from16 v18, v5

    .line 22
    :goto_6
    invoke-virtual {v7}, LUd/h;->size()I

    move-result v14

    const/16 v29, 0x1

    if-ge v5, v14, :cond_9

    if-lt v4, v3, :cond_8

    .line 23
    invoke-virtual {v7, v5}, LUd/h;->remove(I)Ljava/lang/Object;

    move/from16 v18, v29

    goto :goto_6

    :cond_8
    add-int/lit8 v17, v17, 0x1

    .line 24
    invoke-virtual {v7, v5}, LUd/m;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LD/t;

    invoke-virtual {v14}, LD/t;->l()I

    move-result v14

    add-int/2addr v4, v14

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_9
    move v14, v11

    move v11, v0

    move v0, v14

    move v14, v2

    move v2, v4

    move/from16 v30, v18

    move v4, v1

    move/from16 v1, v17

    :goto_7
    if-ge v1, v15, :cond_b

    if-lt v2, v3, :cond_a

    if-lez v2, :cond_a

    .line 25
    invoke-virtual {v7}, LUd/m;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_b

    :cond_a
    move v5, v4

    goto :goto_8

    :cond_b
    move/from16 v31, v4

    move/from16 p6, v11

    move/from16 p7, v14

    move v11, v0

    move v0, v1

    move v14, v2

    goto :goto_a

    :goto_8
    const/4 v4, 0x2

    move/from16 v17, v5

    const/4 v5, 0x0

    move/from16 v20, v2

    move/from16 v18, v3

    const-wide/16 v2, 0x0

    move/from16 p6, v11

    move/from16 p7, v14

    move/from16 v31, v17

    move/from16 v14, v20

    move v11, v0

    move-object/from16 v0, p1

    .line 26
    invoke-static/range {v0 .. v5}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    move-result-object v2

    move v0, v1

    .line 27
    invoke-virtual {v2}, LD/t;->l()I

    move-result v1

    add-int/2addr v1, v14

    if-gt v1, v6, :cond_c

    add-int/lit8 v3, v15, -0x1

    if-eq v0, v3, :cond_c

    add-int/lit8 v3, v0, 0x1

    .line 28
    invoke-virtual {v2}, LD/t;->l()I

    move-result v2

    sub-int v14, p7, v2

    move/from16 v30, v29

    goto :goto_9

    .line 29
    :cond_c
    invoke-virtual {v2}, LD/t;->b()I

    move-result v3

    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 30
    invoke-virtual {v7, v2}, LUd/m;->add(Ljava/lang/Object;)Z

    move/from16 v14, p7

    move v11, v3

    move/from16 v3, p6

    :goto_9
    add-int/lit8 v0, v0, 0x1

    move v2, v1

    move/from16 v4, v31

    move v1, v0

    move v0, v11

    move v11, v3

    move/from16 v3, v18

    goto :goto_7

    :goto_a
    if-ge v14, v8, :cond_f

    sub-int v6, v8, v14

    sub-int v1, p7, v6

    add-int/2addr v14, v6

    move v2, v1

    move/from16 v1, p6

    :goto_b
    if-ge v2, v13, :cond_d

    if-lez v1, :cond_d

    add-int/lit8 v1, v1, -0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    move/from16 v17, v2

    const-wide/16 v2, 0x0

    move v13, v0

    move-object/from16 v0, p1

    .line 31
    invoke-static/range {v0 .. v5}, LD/u;->e(LD/u;IJILjava/lang/Object;)LD/t;

    move-result-object v2

    const/4 v0, 0x0

    .line 32
    invoke-virtual {v7, v0, v2}, LUd/m;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {v2}, LD/t;->b()I

    move-result v3

    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 34
    invoke-virtual {v2}, LD/t;->l()I

    move-result v2

    add-int v2, v17, v2

    move v0, v13

    move/from16 v13, p3

    goto :goto_b

    :cond_d
    move v13, v0

    move/from16 v17, v2

    const/4 v0, 0x0

    add-int/2addr v6, v12

    if-gez v17, :cond_e

    add-int v6, v6, v17

    add-int v2, v14, v17

    move v14, v0

    move/from16 v26, v2

    goto :goto_c

    :cond_e
    move/from16 v26, v14

    move/from16 v14, v17

    goto :goto_c

    :cond_f
    move v13, v0

    const/4 v0, 0x0

    move/from16 v1, p6

    move v6, v12

    move/from16 v26, v14

    move/from16 v14, p7

    .line 35
    :goto_c
    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 36
    invoke-static {v2}, Lke/a;->a(I)I

    move-result v2

    invoke-static {v6}, Lke/a;->a(I)I

    move-result v3

    if-ne v2, v3, :cond_10

    .line 37
    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 38
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v3

    if-lt v2, v3, :cond_10

    int-to-float v2, v6

    move v5, v2

    goto :goto_d

    :cond_10
    move/from16 v5, p8

    :goto_d
    sub-float v2, p8, v5

    const/4 v3, 0x0

    if-eqz p21, :cond_11

    if-le v6, v12, :cond_11

    cmpg-float v4, v2, v3

    if-gtz v4, :cond_11

    sub-int/2addr v6, v12

    int-to-float v3, v6

    add-float/2addr v3, v2

    :cond_11
    move/from16 v32, v3

    if-ltz v14, :cond_26

    neg-int v12, v14

    .line 39
    invoke-virtual {v7}, LUd/m;->first()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LD/t;

    if-gtz p3, :cond_13

    if-gez p5, :cond_12

    goto :goto_e

    :cond_12
    move-object/from16 v0, p1

    move/from16 v3, p18

    move-object/from16 v4, p19

    move/from16 v25, v14

    move-object v14, v2

    goto :goto_10

    .line 40
    :cond_13
    :goto_e
    invoke-virtual {v7}, LUd/h;->size()I

    move-result v3

    move v4, v0

    :goto_f
    if-ge v4, v3, :cond_12

    .line 41
    invoke-virtual {v7, v4}, LUd/m;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD/t;

    invoke-virtual {v6}, LD/t;->l()I

    move-result v6

    if-eqz v14, :cond_12

    if-gt v6, v14, :cond_12

    .line 42
    invoke-static {v7}, LUd/u;->o(Ljava/util/List;)I

    move-result v0

    if-eq v4, v0, :cond_12

    sub-int/2addr v14, v6

    add-int/lit8 v4, v4, 0x1

    .line 43
    invoke-virtual {v7, v4}, LUd/m;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LD/t;

    const/4 v0, 0x0

    goto :goto_f

    .line 44
    :goto_10
    invoke-static {v1, v0, v3, v4}, LD/r;->d(ILD/u;ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v6, 0x0

    :goto_11
    if-ge v6, v2, :cond_14

    .line 46
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    .line 47
    check-cast v17, LD/t;

    .line 48
    invoke-virtual/range {v17 .. v17}, LD/t;->b()I

    move-result v0

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v11

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p1

    goto :goto_11

    :cond_14
    move/from16 v6, p21

    move v2, v15

    const/16 v19, 0x0

    move-object v15, v1

    move-object v1, v0

    move-object v0, v7

    move-object/from16 v7, p22

    .line 49
    invoke-static/range {v0 .. v7}, LD/r;->c(Ljava/util/List;LD/u;IILjava/util/List;FZLD/q;)Ljava/util/List;

    move-result-object v3

    .line 50
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v2, v19

    :goto_12
    if-ge v2, v1, :cond_15

    .line 51
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 52
    check-cast v4, LD/t;

    .line 53
    invoke-virtual {v4}, LD/t;->b()I

    move-result v4

    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    move-result v11

    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    .line 54
    :cond_15
    invoke-virtual {v0}, LUd/m;->first()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v14, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 55
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_16

    .line 56
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_16

    move/from16 v33, v29

    goto :goto_13

    :cond_16
    move/from16 v33, v19

    :goto_13
    if-eqz p11, :cond_17

    move v1, v11

    goto :goto_14

    :cond_17
    move/from16 v1, v26

    .line 57
    :goto_14
    invoke-static {v9, v10, v1}, Li1/c;->g(JI)I

    move-result v1

    if-eqz p11, :cond_18

    move/from16 v11, v26

    .line 58
    :cond_18
    invoke-static {v9, v10, v11}, Li1/c;->f(JI)I

    move-result v17

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move/from16 v11, p15

    move-object v2, v3

    move v6, v8

    move v7, v12

    move/from16 v34, v16

    move/from16 v4, v17

    move/from16 v8, p11

    move-object/from16 v12, p16

    move v3, v1

    move-object v1, v15

    move v15, v5

    move/from16 v5, v26

    .line 59
    invoke-static/range {v0 .. v12}, LD/r;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLC/b$m;LC/b$e;ZLi1/d;)Ljava/util/List;

    move-result-object v18

    move-object v7, v0

    move/from16 v16, v3

    move v4, v15

    float-to-int v15, v4

    move/from16 v0, v19

    .line 60
    invoke-virtual/range {p1 .. p1}, LD/u;->g()Landroidx/compose/foundation/lazy/layout/c;

    move-result-object v19

    const/16 v23, 0x1

    move-object/from16 v20, p1

    move/from16 v21, p11

    move/from16 v24, p20

    move/from16 v22, p21

    move-object/from16 v27, p23

    move-object/from16 v28, p25

    move-object/from16 v11, p26

    move v8, v0

    move v10, v4

    move-object v12, v14

    move-object/from16 v14, p17

    .line 61
    invoke-virtual/range {v14 .. v28}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->l(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LF/x;ZZIZIILGf/O;Ls0/Z0;)V

    move/from16 v4, v17

    move-object/from16 v0, v18

    move/from16 v14, v22

    move/from16 v15, v26

    if-nez v14, :cond_1c

    .line 62
    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->h()J

    move-result-wide v1

    .line 63
    sget-object v5, Li1/r;->b:Li1/r$a;

    invoke-virtual {v5}, Li1/r$a;->a()J

    move-result-wide v8

    invoke-static {v1, v2, v8, v9}, Li1/r;->e(JJ)Z

    move-result v5

    if-nez v5, :cond_1c

    if-eqz p11, :cond_19

    move v5, v4

    goto :goto_15

    :cond_19
    move v5, v3

    .line 64
    :goto_15
    invoke-static {v1, v2}, Li1/r;->g(J)I

    move-result v8

    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    move-wide/from16 v8, p9

    invoke-static {v8, v9, v3}, Li1/c;->g(JI)I

    move-result v3

    .line 65
    invoke-static {v1, v2}, Li1/r;->f(J)I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v8, v9, v1}, Li1/c;->f(JI)I

    move-result v17

    if-eqz p11, :cond_1a

    move/from16 v1, v17

    goto :goto_16

    :cond_1a
    move v1, v3

    :goto_16
    if-eq v1, v5, :cond_1b

    .line 66
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_17
    if-ge v4, v2, :cond_1b

    .line 67
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 68
    check-cast v5, LD/t;

    .line 69
    invoke-virtual {v5, v1}, LD/t;->r(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_17

    :cond_1b
    move/from16 v5, v17

    :goto_18
    move v4, v3

    goto :goto_19

    :cond_1c
    move v5, v4

    goto :goto_18

    .line 70
    :goto_19
    invoke-interface/range {p12 .. p12}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1d

    move-object/from16 v1, p1

    move/from16 v3, p3

    move-object/from16 v2, p12

    .line 71
    invoke-static/range {v0 .. v5}, LD/i;->a(Ljava/util/List;LD/u;Ljava/util/List;III)LD/t;

    move-result-object v2

    :goto_1a
    move/from16 v9, p0

    goto :goto_1b

    :cond_1d
    const/4 v2, 0x0

    goto :goto_1a

    :goto_1b
    if-lt v13, v9, :cond_1f

    if-le v15, v6, :cond_1e

    goto :goto_1c

    :cond_1e
    const/4 v3, 0x0

    goto :goto_1d

    :cond_1f
    :goto_1c
    move/from16 v3, v29

    .line 72
    :goto_1d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, LD/r$b;

    move-object/from16 v6, p24

    invoke-direct {v5, v0, v2, v14, v6}, LD/r$b;-><init>(Ljava/util/List;LD/t;ZLY/C0;)V

    invoke-interface {v11, v1, v4, v5}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LI0/C;

    if-eqz v33, :cond_20

    move-object/from16 v18, v0

    goto :goto_1f

    .line 73
    :cond_20
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v14, 0x0

    :goto_1e
    if-ge v14, v4, :cond_24

    .line 75
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 76
    move-object v8, v6

    check-cast v8, LD/t;

    .line 77
    invoke-virtual {v8}, LD/t;->getIndex()I

    move-result v11

    invoke-virtual {v7}, LUd/m;->first()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LD/t;

    invoke-virtual {v13}, LD/t;->getIndex()I

    move-result v13

    if-lt v11, v13, :cond_21

    invoke-virtual {v8}, LD/t;->getIndex()I

    move-result v11

    invoke-virtual {v7}, LUd/m;->last()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LD/t;

    invoke-virtual {v13}, LD/t;->getIndex()I

    move-result v13

    if-le v11, v13, :cond_22

    :cond_21
    if-ne v8, v2, :cond_23

    .line 78
    :cond_22
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_23
    add-int/lit8 v14, v14, 0x1

    goto :goto_1e

    :cond_24
    move-object/from16 v18, v1

    :goto_1f
    if-eqz p11, :cond_25

    .line 79
    sget-object v0, Lz/q;->a:Lz/q;

    :goto_20
    move-object/from16 v17, v0

    goto :goto_21

    :cond_25
    sget-object v0, Lz/q;->b:Lz/q;

    goto :goto_20

    .line 80
    :goto_21
    invoke-virtual/range {p1 .. p1}, LD/u;->f()J

    move-result-wide v0

    move v4, v10

    move-wide v10, v0

    .line 81
    new-instance v0, LD/s;

    const/16 v20, 0x0

    move/from16 v19, p5

    move/from16 v16, p15

    move-object/from16 v8, p23

    move v15, v9

    move-object v1, v12

    move-object/from16 v12, v18

    move/from16 v2, v25

    move/from16 v7, v30

    move/from16 v14, v31

    move/from16 v6, v32

    move/from16 v13, v34

    move/from16 v18, p4

    move-object/from16 v9, p16

    invoke-direct/range {v0 .. v20}, LD/s;-><init>(LD/t;IZFLI0/C;FZLGf/O;Li1/d;JLjava/util/List;IIIZLz/q;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 82
    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative currentFirstItemScrollOffset"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid afterContentPadding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid beforeContentPadding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
