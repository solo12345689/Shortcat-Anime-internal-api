.class public abstract LU/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LY/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LU/E$a;->a:LU/E$a;

    .line 2
    .line 3
    invoke-static {v0}, LY/H;->j(Lie/a;)LY/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LU/E;->a:LY/b1;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(LU/l;LU/U;LU/o0;Lkotlin/jvm/functions/Function2;LY/m;II)V
    .locals 18

    .line 1
    move-object/from16 v4, p3

    .line 2
    .line 3
    move/from16 v5, p5

    .line 4
    .line 5
    const v0, -0x7ec9fb7e

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p4

    .line 9
    .line 10
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v10

    .line 14
    and-int/lit8 v1, v5, 0x6

    .line 15
    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    and-int/lit8 v1, p6, 0x1

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    move-object/from16 v1, p0

    .line 23
    .line 24
    invoke-interface {v10, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object/from16 v1, p0

    .line 33
    .line 34
    :cond_1
    const/4 v2, 0x2

    .line 35
    :goto_0
    or-int/2addr v2, v5

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object/from16 v1, p0

    .line 38
    .line 39
    move v2, v5

    .line 40
    :goto_1
    and-int/lit8 v3, v5, 0x30

    .line 41
    .line 42
    if-nez v3, :cond_5

    .line 43
    .line 44
    and-int/lit8 v3, p6, 0x2

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    move-object/from16 v3, p1

    .line 49
    .line 50
    invoke-interface {v10, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_4

    .line 55
    .line 56
    const/16 v6, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move-object/from16 v3, p1

    .line 60
    .line 61
    :cond_4
    const/16 v6, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v2, v6

    .line 64
    goto :goto_3

    .line 65
    :cond_5
    move-object/from16 v3, p1

    .line 66
    .line 67
    :goto_3
    and-int/lit16 v6, v5, 0x180

    .line 68
    .line 69
    if-nez v6, :cond_8

    .line 70
    .line 71
    and-int/lit8 v6, p6, 0x4

    .line 72
    .line 73
    if-nez v6, :cond_6

    .line 74
    .line 75
    move-object/from16 v6, p2

    .line 76
    .line 77
    invoke-interface {v10, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_7

    .line 82
    .line 83
    const/16 v7, 0x100

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    move-object/from16 v6, p2

    .line 87
    .line 88
    :cond_7
    const/16 v7, 0x80

    .line 89
    .line 90
    :goto_4
    or-int/2addr v2, v7

    .line 91
    goto :goto_5

    .line 92
    :cond_8
    move-object/from16 v6, p2

    .line 93
    .line 94
    :goto_5
    and-int/lit8 v7, p6, 0x8

    .line 95
    .line 96
    if-eqz v7, :cond_9

    .line 97
    .line 98
    or-int/lit16 v2, v2, 0xc00

    .line 99
    .line 100
    goto :goto_7

    .line 101
    :cond_9
    and-int/lit16 v7, v5, 0xc00

    .line 102
    .line 103
    if-nez v7, :cond_b

    .line 104
    .line 105
    invoke-interface {v10, v4}, LY/m;->F(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    if-eqz v7, :cond_a

    .line 110
    .line 111
    const/16 v7, 0x800

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_a
    const/16 v7, 0x400

    .line 115
    .line 116
    :goto_6
    or-int/2addr v2, v7

    .line 117
    :cond_b
    :goto_7
    and-int/lit16 v7, v2, 0x493

    .line 118
    .line 119
    const/16 v8, 0x492

    .line 120
    .line 121
    if-ne v7, v8, :cond_d

    .line 122
    .line 123
    invoke-interface {v10}, LY/m;->i()Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-nez v7, :cond_c

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_c
    invoke-interface {v10}, LY/m;->K()V

    .line 131
    .line 132
    .line 133
    move-object v2, v3

    .line 134
    move-object v3, v6

    .line 135
    goto/16 :goto_c

    .line 136
    .line 137
    :cond_d
    :goto_8
    invoke-interface {v10}, LY/m;->G()V

    .line 138
    .line 139
    .line 140
    and-int/lit8 v7, v5, 0x1

    .line 141
    .line 142
    if-eqz v7, :cond_12

    .line 143
    .line 144
    invoke-interface {v10}, LY/m;->N()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-eqz v7, :cond_e

    .line 149
    .line 150
    goto :goto_a

    .line 151
    :cond_e
    invoke-interface {v10}, LY/m;->K()V

    .line 152
    .line 153
    .line 154
    and-int/lit8 v7, p6, 0x1

    .line 155
    .line 156
    if-eqz v7, :cond_f

    .line 157
    .line 158
    and-int/lit8 v2, v2, -0xf

    .line 159
    .line 160
    :cond_f
    and-int/lit8 v7, p6, 0x2

    .line 161
    .line 162
    if-eqz v7, :cond_10

    .line 163
    .line 164
    and-int/lit8 v2, v2, -0x71

    .line 165
    .line 166
    :cond_10
    and-int/lit8 v7, p6, 0x4

    .line 167
    .line 168
    if-eqz v7, :cond_11

    .line 169
    .line 170
    :goto_9
    and-int/lit16 v2, v2, -0x381

    .line 171
    .line 172
    :cond_11
    move v13, v2

    .line 173
    move-object v2, v6

    .line 174
    goto :goto_b

    .line 175
    :cond_12
    :goto_a
    and-int/lit8 v7, p6, 0x1

    .line 176
    .line 177
    const/4 v8, 0x6

    .line 178
    if-eqz v7, :cond_13

    .line 179
    .line 180
    sget-object v1, LU/D;->a:LU/D;

    .line 181
    .line 182
    invoke-virtual {v1, v10, v8}, LU/D;->a(LY/m;I)LU/l;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    and-int/lit8 v2, v2, -0xf

    .line 187
    .line 188
    :cond_13
    and-int/lit8 v7, p6, 0x2

    .line 189
    .line 190
    if-eqz v7, :cond_14

    .line 191
    .line 192
    sget-object v3, LU/D;->a:LU/D;

    .line 193
    .line 194
    invoke-virtual {v3, v10, v8}, LU/D;->b(LY/m;I)LU/U;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    and-int/lit8 v2, v2, -0x71

    .line 199
    .line 200
    :cond_14
    and-int/lit8 v7, p6, 0x4

    .line 201
    .line 202
    if-eqz v7, :cond_11

    .line 203
    .line 204
    sget-object v6, LU/D;->a:LU/D;

    .line 205
    .line 206
    invoke-virtual {v6, v10, v8}, LU/D;->c(LY/m;I)LU/o0;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    goto :goto_9

    .line 211
    :goto_b
    invoke-interface {v10}, LY/m;->y()V

    .line 212
    .line 213
    .line 214
    invoke-static {}, LY/w;->L()Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    if-eqz v6, :cond_15

    .line 219
    .line 220
    const/4 v6, -0x1

    .line 221
    const-string v7, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:55)"

    .line 222
    .line 223
    invoke-static {v0, v13, v6, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :cond_15
    const/4 v11, 0x0

    .line 227
    const/4 v12, 0x7

    .line 228
    const/4 v6, 0x0

    .line 229
    const/4 v7, 0x0

    .line 230
    const-wide/16 v8, 0x0

    .line 231
    .line 232
    invoke-static/range {v6 .. v12}, Landroidx/compose/material3/a;->d(ZFJLY/m;II)Lx/G;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    and-int/lit8 v6, v13, 0xe

    .line 237
    .line 238
    invoke-static {v1, v10, v6}, LU/E;->b(LU/l;LY/m;I)LQ/J;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-static {}, LU/m;->g()LY/b1;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-virtual {v7, v1}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 247
    .line 248
    .line 249
    move-result-object v11

    .line 250
    invoke-static {}, Landroidx/compose/foundation/j;->a()LY/b1;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    invoke-virtual {v7, v0}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    invoke-static {}, LT/n;->d()LY/b1;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    sget-object v7, LU/n;->b:LU/n;

    .line 263
    .line 264
    invoke-virtual {v0, v7}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    invoke-static {}, LU/V;->c()LY/b1;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0, v3}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    invoke-static {}, LQ/K;->b()LY/b1;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0, v6}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 281
    .line 282
    .line 283
    move-result-object v15

    .line 284
    invoke-static {}, LU/p0;->b()LY/b1;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0, v2}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    .line 289
    .line 290
    .line 291
    move-result-object v16

    .line 292
    filled-new-array/range {v11 .. v16}, [LY/c1;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    new-instance v6, LU/E$b;

    .line 297
    .line 298
    invoke-direct {v6, v2, v4}, LU/E$b;-><init>(LU/o0;Lkotlin/jvm/functions/Function2;)V

    .line 299
    .line 300
    .line 301
    const/16 v7, 0x36

    .line 302
    .line 303
    const v8, -0x3f9276be

    .line 304
    .line 305
    .line 306
    const/4 v9, 0x1

    .line 307
    invoke-static {v8, v9, v6, v10, v7}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    sget v7, LY/c1;->i:I

    .line 312
    .line 313
    or-int/lit8 v7, v7, 0x30

    .line 314
    .line 315
    invoke-static {v0, v6, v10, v7}, LY/H;->d([LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 316
    .line 317
    .line 318
    invoke-static {}, LY/w;->L()Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-eqz v0, :cond_16

    .line 323
    .line 324
    invoke-static {}, LY/w;->T()V

    .line 325
    .line 326
    .line 327
    :cond_16
    move-object/from16 v17, v3

    .line 328
    .line 329
    move-object v3, v2

    .line 330
    move-object/from16 v2, v17

    .line 331
    .line 332
    :goto_c
    invoke-interface {v10}, LY/m;->k()LY/B1;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    if-eqz v7, :cond_17

    .line 337
    .line 338
    new-instance v0, LU/E$c;

    .line 339
    .line 340
    move/from16 v6, p6

    .line 341
    .line 342
    invoke-direct/range {v0 .. v6}, LU/E$c;-><init>(LU/l;LU/U;LU/o0;Lkotlin/jvm/functions/Function2;II)V

    .line 343
    .line 344
    .line 345
    invoke-interface {v7, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 346
    .line 347
    .line 348
    :cond_17
    return-void
.end method

.method public static final b(LU/l;LY/m;I)LQ/J;
    .locals 11

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)"

    .line 9
    .line 10
    const v2, 0x6f3fd9d8

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, LU/l;->C()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-interface {p1, v3, v4}, LY/m;->d(J)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    sget-object p0, LY/m;->a:LY/m$a;

    .line 31
    .line 32
    invoke-virtual {p0}, LY/m$a;->a()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-ne p2, p0, :cond_2

    .line 37
    .line 38
    :cond_1
    new-instance p0, LQ/J;

    .line 39
    .line 40
    const/16 v9, 0xe

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    const v5, 0x3ecccccd    # 0.4f

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-static/range {v3 .. v10}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    const/4 v8, 0x0

    .line 54
    move-wide v4, v3

    .line 55
    move-object v3, p0

    .line 56
    invoke-direct/range {v3 .. v8}, LQ/J;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object p2, v3

    .line 63
    :cond_2
    check-cast p2, LQ/J;

    .line 64
    .line 65
    invoke-static {}, LY/w;->L()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    invoke-static {}, LY/w;->T()V

    .line 72
    .line 73
    .line 74
    :cond_3
    return-object p2
.end method
