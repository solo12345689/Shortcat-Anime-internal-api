.class public abstract Ly/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Landroidx/compose/ui/window/t;

.field private static final b:Ly/b;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Landroidx/compose/ui/window/t;

    .line 2
    .line 3
    const/16 v5, 0xe

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/window/t;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ly/k;->a:Landroidx/compose/ui/window/t;

    .line 14
    .line 15
    new-instance v1, Ly/b;

    .line 16
    .line 17
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 18
    .line 19
    invoke-virtual {v0}, Ls0/r0$a;->k()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v8

    .line 35
    const/16 v14, 0xe

    .line 36
    .line 37
    const/4 v15, 0x0

    .line 38
    const v10, 0x3ec28f5c    # 0.38f

    .line 39
    .line 40
    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v12, 0x0

    .line 43
    const/4 v13, 0x0

    .line 44
    invoke-static/range {v8 .. v15}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v8

    .line 48
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 49
    .line 50
    .line 51
    move-result-wide v10

    .line 52
    const/16 v16, 0xe

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    const v12, 0x3ec28f5c    # 0.38f

    .line 57
    .line 58
    .line 59
    const/4 v14, 0x0

    .line 60
    const/4 v15, 0x0

    .line 61
    invoke-static/range {v10 .. v17}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v10

    .line 65
    const/4 v12, 0x0

    .line 66
    invoke-direct/range {v1 .. v12}, Ly/b;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    .line 68
    .line 69
    sput-object v1, Ly/k;->b:Ly/b;

    .line 70
    .line 71
    return-void
.end method

.method public static final a(Ly/b;Landroidx/compose/ui/e;Lie/o;LY/m;II)V
    .locals 23

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move/from16 v4, p4

    .line 4
    .line 5
    const v0, -0x36e94d1d

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p3

    .line 9
    .line 10
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v2, p5, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v2, v4, 0x6

    .line 19
    .line 20
    move v5, v2

    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v2, v4, 0x6

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    move-object/from16 v2, p0

    .line 29
    .line 30
    invoke-interface {v1, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    const/4 v5, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v5, 0x2

    .line 39
    :goto_0
    or-int/2addr v5, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v2, p0

    .line 42
    .line 43
    move v5, v4

    .line 44
    :goto_1
    and-int/lit8 v6, p5, 0x2

    .line 45
    .line 46
    if-eqz v6, :cond_4

    .line 47
    .line 48
    or-int/lit8 v5, v5, 0x30

    .line 49
    .line 50
    :cond_3
    move-object/from16 v7, p1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    and-int/lit8 v7, v4, 0x30

    .line 54
    .line 55
    if-nez v7, :cond_3

    .line 56
    .line 57
    move-object/from16 v7, p1

    .line 58
    .line 59
    invoke-interface {v1, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_5

    .line 64
    .line 65
    const/16 v8, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    const/16 v8, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v5, v8

    .line 71
    :goto_3
    and-int/lit8 v8, p5, 0x4

    .line 72
    .line 73
    if-eqz v8, :cond_6

    .line 74
    .line 75
    or-int/lit16 v5, v5, 0x180

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_6
    and-int/lit16 v8, v4, 0x180

    .line 79
    .line 80
    if-nez v8, :cond_8

    .line 81
    .line 82
    invoke-interface {v1, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_7

    .line 87
    .line 88
    const/16 v8, 0x100

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_7
    const/16 v8, 0x80

    .line 92
    .line 93
    :goto_4
    or-int/2addr v5, v8

    .line 94
    :cond_8
    :goto_5
    and-int/lit16 v8, v5, 0x93

    .line 95
    .line 96
    const/16 v9, 0x92

    .line 97
    .line 98
    if-ne v8, v9, :cond_a

    .line 99
    .line 100
    invoke-interface {v1}, LY/m;->i()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-nez v8, :cond_9

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_9
    invoke-interface {v1}, LY/m;->K()V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_8

    .line 111
    .line 112
    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    .line 113
    .line 114
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 115
    .line 116
    move-object v7, v6

    .line 117
    :cond_b
    invoke-static {}, LY/w;->L()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_c

    .line 122
    .line 123
    const/4 v6, -0x1

    .line 124
    const-string v8, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:144)"

    .line 125
    .line 126
    invoke-static {v0, v5, v6, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_c
    sget-object v0, Ly/h;->a:Ly/h;

    .line 130
    .line 131
    invoke-virtual {v0}, Ly/h;->h()F

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    invoke-virtual {v0}, Ly/h;->c()F

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-static {v6}, LJ/i;->d(F)LJ/h;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    const/16 v15, 0x1c

    .line 144
    .line 145
    const/16 v16, 0x0

    .line 146
    .line 147
    const/4 v10, 0x0

    .line 148
    const-wide/16 v11, 0x0

    .line 149
    .line 150
    const-wide/16 v13, 0x0

    .line 151
    .line 152
    invoke-static/range {v7 .. v16}, Lp0/l;->b(Landroidx/compose/ui/e;FLs0/E1;ZJJILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 153
    .line 154
    .line 155
    move-result-object v17

    .line 156
    invoke-virtual {v2}, Ly/b;->a()J

    .line 157
    .line 158
    .line 159
    move-result-wide v18

    .line 160
    const/16 v21, 0x2

    .line 161
    .line 162
    const/16 v22, 0x0

    .line 163
    .line 164
    const/16 v20, 0x0

    .line 165
    .line 166
    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    sget-object v8, LC/x;->b:LC/x;

    .line 171
    .line 172
    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/k;->b(Landroidx/compose/ui/e;LC/x;)Landroidx/compose/ui/e;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v0}, Ly/h;->i()F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    const/4 v8, 0x0

    .line 181
    const/4 v9, 0x0

    .line 182
    const/4 v10, 0x1

    .line 183
    invoke-static {v6, v9, v0, v10, v8}, Landroidx/compose/foundation/layout/p;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    const/4 v0, 0x0

    .line 188
    invoke-static {v0, v1, v0, v10}, Landroidx/compose/foundation/m;->c(ILY/m;II)Landroidx/compose/foundation/o;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    const/16 v16, 0xe

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    const/4 v15, 0x0

    .line 199
    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/m;->f(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLz/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    shl-int/lit8 v5, v5, 0x3

    .line 204
    .line 205
    and-int/lit16 v5, v5, 0x1c00

    .line 206
    .line 207
    sget-object v8, LC/b;->a:LC/b;

    .line 208
    .line 209
    invoke-virtual {v8}, LC/b;->h()LC/b$m;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    sget-object v9, Ll0/e;->a:Ll0/e$a;

    .line 214
    .line 215
    invoke-virtual {v9}, Ll0/e$a;->k()Ll0/e$b;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    invoke-static {v8, v9, v1, v0}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    invoke-static {v1, v0}, LY/h;->a(LY/m;I)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    invoke-interface {v1}, LY/m;->r()LY/I;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-static {v1, v6}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    sget-object v10, LK0/g;->M:LK0/g$a;

    .line 236
    .line 237
    invoke-virtual {v10}, LK0/g$a;->a()Lie/a;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    invoke-interface {v1}, LY/m;->j()LY/d;

    .line 242
    .line 243
    .line 244
    move-result-object v12

    .line 245
    if-nez v12, :cond_d

    .line 246
    .line 247
    invoke-static {}, LY/h;->d()V

    .line 248
    .line 249
    .line 250
    :cond_d
    invoke-interface {v1}, LY/m;->I()V

    .line 251
    .line 252
    .line 253
    invoke-interface {v1}, LY/m;->e()Z

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    if-eqz v12, :cond_e

    .line 258
    .line 259
    invoke-interface {v1, v11}, LY/m;->h(Lie/a;)V

    .line 260
    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_e
    invoke-interface {v1}, LY/m;->s()V

    .line 264
    .line 265
    .line 266
    :goto_7
    invoke-static {v1}, LY/m2;->b(LY/m;)LY/m;

    .line 267
    .line 268
    .line 269
    move-result-object v11

    .line 270
    invoke-virtual {v10}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 271
    .line 272
    .line 273
    move-result-object v12

    .line 274
    invoke-static {v11, v8, v12}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v10}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-static {v11, v9, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v10}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    invoke-interface {v11}, LY/m;->e()Z

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    if-nez v9, :cond_f

    .line 293
    .line 294
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v9

    .line 298
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v12

    .line 302
    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    if-nez v9, :cond_10

    .line 307
    .line 308
    :cond_f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    invoke-interface {v11, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-interface {v11, v0, v8}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 320
    .line 321
    .line 322
    :cond_10
    invoke-virtual {v10}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-static {v11, v6, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 327
    .line 328
    .line 329
    sget-object v0, LC/j;->a:LC/j;

    .line 330
    .line 331
    shr-int/lit8 v5, v5, 0x6

    .line 332
    .line 333
    and-int/lit8 v5, v5, 0x70

    .line 334
    .line 335
    or-int/lit8 v5, v5, 0x6

    .line 336
    .line 337
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    invoke-interface {v3, v0, v1, v5}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    invoke-interface {v1}, LY/m;->x()V

    .line 345
    .line 346
    .line 347
    invoke-static {}, LY/w;->L()Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_11

    .line 352
    .line 353
    invoke-static {}, LY/w;->T()V

    .line 354
    .line 355
    .line 356
    :cond_11
    :goto_8
    invoke-interface {v1}, LY/m;->k()LY/B1;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    if-eqz v6, :cond_12

    .line 361
    .line 362
    new-instance v0, Ly/k$a;

    .line 363
    .line 364
    move/from16 v5, p5

    .line 365
    .line 366
    move-object v1, v2

    .line 367
    move-object v2, v7

    .line 368
    invoke-direct/range {v0 .. v5}, Ly/k$a;-><init>(Ly/b;Landroidx/compose/ui/e;Lie/o;II)V

    .line 369
    .line 370
    .line 371
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 372
    .line 373
    .line 374
    :cond_12
    return-void
.end method

.method public static final b(Ljava/lang/String;ZLy/b;Landroidx/compose/ui/e;Lie/o;Lie/a;LY/m;II)V
    .locals 22

    .line 1
    move/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p5

    .line 4
    .line 5
    move/from16 v8, p7

    .line 6
    .line 7
    const v0, 0x2f25fb7f

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p6

    .line 11
    .line 12
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    and-int/lit8 v2, p8, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v8, 0x6

    .line 21
    .line 22
    move v3, v2

    .line 23
    move-object/from16 v2, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v2, v8, 0x6

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    move-object/from16 v2, p0

    .line 31
    .line 32
    invoke-interface {v9, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v3, 0x2

    .line 41
    :goto_0
    or-int/2addr v3, v8

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object/from16 v2, p0

    .line 44
    .line 45
    move v3, v8

    .line 46
    :goto_1
    and-int/lit8 v4, p8, 0x2

    .line 47
    .line 48
    const/16 v5, 0x20

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    or-int/lit8 v3, v3, 0x30

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    and-int/lit8 v4, v8, 0x30

    .line 56
    .line 57
    if-nez v4, :cond_5

    .line 58
    .line 59
    invoke-interface {v9, v1}, LY/m;->a(Z)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    move v4, v5

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    const/16 v4, 0x10

    .line 68
    .line 69
    :goto_2
    or-int/2addr v3, v4

    .line 70
    :cond_5
    :goto_3
    and-int/lit8 v4, p8, 0x4

    .line 71
    .line 72
    if-eqz v4, :cond_6

    .line 73
    .line 74
    or-int/lit16 v3, v3, 0x180

    .line 75
    .line 76
    move-object/from16 v11, p2

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_6
    and-int/lit16 v4, v8, 0x180

    .line 80
    .line 81
    move-object/from16 v11, p2

    .line 82
    .line 83
    if-nez v4, :cond_8

    .line 84
    .line 85
    invoke-interface {v9, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_7

    .line 90
    .line 91
    const/16 v4, 0x100

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_7
    const/16 v4, 0x80

    .line 95
    .line 96
    :goto_4
    or-int/2addr v3, v4

    .line 97
    :cond_8
    :goto_5
    and-int/lit8 v4, p8, 0x8

    .line 98
    .line 99
    if-eqz v4, :cond_a

    .line 100
    .line 101
    or-int/lit16 v3, v3, 0xc00

    .line 102
    .line 103
    :cond_9
    move-object/from16 v6, p3

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_a
    and-int/lit16 v6, v8, 0xc00

    .line 107
    .line 108
    if-nez v6, :cond_9

    .line 109
    .line 110
    move-object/from16 v6, p3

    .line 111
    .line 112
    invoke-interface {v9, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-eqz v12, :cond_b

    .line 117
    .line 118
    const/16 v12, 0x800

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_b
    const/16 v12, 0x400

    .line 122
    .line 123
    :goto_6
    or-int/2addr v3, v12

    .line 124
    :goto_7
    and-int/lit8 v12, p8, 0x10

    .line 125
    .line 126
    if-eqz v12, :cond_d

    .line 127
    .line 128
    or-int/lit16 v3, v3, 0x6000

    .line 129
    .line 130
    :cond_c
    move-object/from16 v13, p4

    .line 131
    .line 132
    goto :goto_9

    .line 133
    :cond_d
    and-int/lit16 v13, v8, 0x6000

    .line 134
    .line 135
    if-nez v13, :cond_c

    .line 136
    .line 137
    move-object/from16 v13, p4

    .line 138
    .line 139
    invoke-interface {v9, v13}, LY/m;->F(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    if-eqz v14, :cond_e

    .line 144
    .line 145
    const/16 v14, 0x4000

    .line 146
    .line 147
    goto :goto_8

    .line 148
    :cond_e
    const/16 v14, 0x2000

    .line 149
    .line 150
    :goto_8
    or-int/2addr v3, v14

    .line 151
    :goto_9
    and-int/lit8 v14, p8, 0x20

    .line 152
    .line 153
    const/high16 v15, 0x20000

    .line 154
    .line 155
    const/high16 v16, 0x30000

    .line 156
    .line 157
    if-eqz v14, :cond_10

    .line 158
    .line 159
    or-int v3, v3, v16

    .line 160
    .line 161
    :cond_f
    :goto_a
    move v14, v3

    .line 162
    goto :goto_c

    .line 163
    :cond_10
    and-int v14, v8, v16

    .line 164
    .line 165
    if-nez v14, :cond_f

    .line 166
    .line 167
    invoke-interface {v9, v7}, LY/m;->F(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v14

    .line 171
    if-eqz v14, :cond_11

    .line 172
    .line 173
    move v14, v15

    .line 174
    goto :goto_b

    .line 175
    :cond_11
    const/high16 v14, 0x10000

    .line 176
    .line 177
    :goto_b
    or-int/2addr v3, v14

    .line 178
    goto :goto_a

    .line 179
    :goto_c
    const v3, 0x12493

    .line 180
    .line 181
    .line 182
    and-int/2addr v3, v14

    .line 183
    const v10, 0x12492

    .line 184
    .line 185
    .line 186
    if-ne v3, v10, :cond_13

    .line 187
    .line 188
    invoke-interface {v9}, LY/m;->i()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez v3, :cond_12

    .line 193
    .line 194
    goto :goto_d

    .line 195
    :cond_12
    invoke-interface {v9}, LY/m;->K()V

    .line 196
    .line 197
    .line 198
    move-object v4, v6

    .line 199
    move-object/from16 v18, v9

    .line 200
    .line 201
    move-object v5, v13

    .line 202
    goto/16 :goto_18

    .line 203
    .line 204
    :cond_13
    :goto_d
    if-eqz v4, :cond_14

    .line 205
    .line 206
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 207
    .line 208
    goto :goto_e

    .line 209
    :cond_14
    move-object v3, v6

    .line 210
    :goto_e
    if-eqz v12, :cond_15

    .line 211
    .line 212
    const/4 v12, 0x0

    .line 213
    goto :goto_f

    .line 214
    :cond_15
    move-object v12, v13

    .line 215
    :goto_f
    invoke-static {}, LY/w;->L()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_16

    .line 220
    .line 221
    const/4 v4, -0x1

    .line 222
    const-string v6, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:181)"

    .line 223
    .line 224
    invoke-static {v0, v14, v4, v6}, LY/w;->U(IIILjava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :cond_16
    sget-object v13, Ly/h;->a:Ly/h;

    .line 228
    .line 229
    invoke-virtual {v13}, Ly/h;->f()Ll0/e$c;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    sget-object v4, LC/b;->a:LC/b;

    .line 234
    .line 235
    invoke-virtual {v13}, Ly/h;->d()F

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    invoke-virtual {v4, v6}, LC/b;->o(F)LC/b$f;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    and-int/lit8 v6, v14, 0x70

    .line 244
    .line 245
    const/4 v10, 0x1

    .line 246
    if-ne v6, v5, :cond_17

    .line 247
    .line 248
    move v5, v10

    .line 249
    goto :goto_10

    .line 250
    :cond_17
    const/4 v5, 0x0

    .line 251
    :goto_10
    const/high16 v6, 0x70000

    .line 252
    .line 253
    and-int/2addr v6, v14

    .line 254
    if-ne v6, v15, :cond_18

    .line 255
    .line 256
    move v6, v10

    .line 257
    goto :goto_11

    .line 258
    :cond_18
    const/4 v6, 0x0

    .line 259
    :goto_11
    or-int/2addr v5, v6

    .line 260
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    if-nez v5, :cond_19

    .line 265
    .line 266
    sget-object v5, LY/m;->a:LY/m$a;

    .line 267
    .line 268
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    if-ne v6, v5, :cond_1a

    .line 273
    .line 274
    :cond_19
    new-instance v6, Ly/k$b;

    .line 275
    .line 276
    invoke-direct {v6, v1, v7}, Ly/k$b;-><init>(ZLie/a;)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v9, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_1a
    check-cast v6, Lie/a;

    .line 283
    .line 284
    const/4 v5, 0x4

    .line 285
    move-object v15, v4

    .line 286
    move-object v4, v6

    .line 287
    const/4 v6, 0x0

    .line 288
    move-object/from16 v16, v0

    .line 289
    .line 290
    move-object v0, v3

    .line 291
    const/4 v3, 0x0

    .line 292
    move-object/from16 v21, v15

    .line 293
    .line 294
    move-object/from16 v15, v16

    .line 295
    .line 296
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    const/4 v1, 0x0

    .line 301
    const/4 v2, 0x0

    .line 302
    invoke-static {v3, v1, v10, v2}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-virtual {v13}, Ly/h;->b()F

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    invoke-virtual {v13}, Ly/h;->a()F

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    invoke-virtual {v13}, Ly/h;->g()F

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    invoke-virtual {v13}, Ly/h;->g()F

    .line 319
    .line 320
    .line 321
    move-result v10

    .line 322
    invoke-static {v3, v4, v6, v5, v10}, Landroidx/compose/foundation/layout/s;->t(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-virtual {v13}, Ly/h;->d()F

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    const/4 v5, 0x2

    .line 331
    invoke-static {v3, v4, v1, v5, v2}, Landroidx/compose/foundation/layout/p;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    const/16 v2, 0x36

    .line 336
    .line 337
    move-object/from16 v3, v21

    .line 338
    .line 339
    invoke-static {v3, v15, v9, v2}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    const/4 v3, 0x0

    .line 344
    invoke-static {v9, v3}, LY/h;->a(LY/m;I)I

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    invoke-interface {v9}, LY/m;->r()LY/I;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-static {v9, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    sget-object v5, LK0/g;->M:LK0/g$a;

    .line 357
    .line 358
    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    invoke-interface {v9}, LY/m;->j()LY/d;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    if-nez v10, :cond_1b

    .line 367
    .line 368
    invoke-static {}, LY/h;->d()V

    .line 369
    .line 370
    .line 371
    :cond_1b
    invoke-interface {v9}, LY/m;->I()V

    .line 372
    .line 373
    .line 374
    invoke-interface {v9}, LY/m;->e()Z

    .line 375
    .line 376
    .line 377
    move-result v10

    .line 378
    if-eqz v10, :cond_1c

    .line 379
    .line 380
    invoke-interface {v9, v6}, LY/m;->h(Lie/a;)V

    .line 381
    .line 382
    .line 383
    goto :goto_12

    .line 384
    :cond_1c
    invoke-interface {v9}, LY/m;->s()V

    .line 385
    .line 386
    .line 387
    :goto_12
    invoke-static {v9}, LY/m2;->b(LY/m;)LY/m;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 392
    .line 393
    .line 394
    move-result-object v10

    .line 395
    invoke-static {v6, v2, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-static {v6, v3, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-interface {v6}, LY/m;->e()Z

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-nez v3, :cond_1d

    .line 414
    .line 415
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v10

    .line 423
    invoke-static {v3, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    if-nez v3, :cond_1e

    .line 428
    .line 429
    :cond_1d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    invoke-interface {v6, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-interface {v6, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 441
    .line 442
    .line 443
    :cond_1e
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-static {v6, v1, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 448
    .line 449
    .line 450
    sget-object v1, LC/J;->a:LC/J;

    .line 451
    .line 452
    if-nez v12, :cond_1f

    .line 453
    .line 454
    const v2, 0x210e0ccd

    .line 455
    .line 456
    .line 457
    invoke-interface {v9, v2}, LY/m;->V(I)V

    .line 458
    .line 459
    .line 460
    :goto_13
    invoke-interface {v9}, LY/m;->O()V

    .line 461
    .line 462
    .line 463
    goto/16 :goto_16

    .line 464
    .line 465
    :cond_1f
    const v2, 0x210e0cce

    .line 466
    .line 467
    .line 468
    invoke-interface {v9, v2}, LY/m;->V(I)V

    .line 469
    .line 470
    .line 471
    sget-object v15, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 472
    .line 473
    invoke-virtual {v13}, Ly/h;->e()F

    .line 474
    .line 475
    .line 476
    move-result v16

    .line 477
    invoke-virtual {v13}, Ly/h;->e()F

    .line 478
    .line 479
    .line 480
    move-result v18

    .line 481
    invoke-virtual {v13}, Ly/h;->e()F

    .line 482
    .line 483
    .line 484
    move-result v19

    .line 485
    const/16 v20, 0x2

    .line 486
    .line 487
    const/16 v21, 0x0

    .line 488
    .line 489
    const/16 v17, 0x0

    .line 490
    .line 491
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/s;->p(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    .line 496
    .line 497
    invoke-virtual {v3}, Ll0/e$a;->o()Ll0/e;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    const/4 v4, 0x0

    .line 502
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    invoke-static {v9, v4}, LY/h;->a(LY/m;I)I

    .line 507
    .line 508
    .line 509
    move-result v6

    .line 510
    invoke-interface {v9}, LY/m;->r()LY/I;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    invoke-static {v9, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    .line 519
    .line 520
    .line 521
    move-result-object v10

    .line 522
    invoke-interface {v9}, LY/m;->j()LY/d;

    .line 523
    .line 524
    .line 525
    move-result-object v15

    .line 526
    if-nez v15, :cond_20

    .line 527
    .line 528
    invoke-static {}, LY/h;->d()V

    .line 529
    .line 530
    .line 531
    :cond_20
    invoke-interface {v9}, LY/m;->I()V

    .line 532
    .line 533
    .line 534
    invoke-interface {v9}, LY/m;->e()Z

    .line 535
    .line 536
    .line 537
    move-result v15

    .line 538
    if-eqz v15, :cond_21

    .line 539
    .line 540
    invoke-interface {v9, v10}, LY/m;->h(Lie/a;)V

    .line 541
    .line 542
    .line 543
    goto :goto_14

    .line 544
    :cond_21
    invoke-interface {v9}, LY/m;->s()V

    .line 545
    .line 546
    .line 547
    :goto_14
    invoke-static {v9}, LY/m2;->b(LY/m;)LY/m;

    .line 548
    .line 549
    .line 550
    move-result-object v10

    .line 551
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 552
    .line 553
    .line 554
    move-result-object v15

    .line 555
    invoke-static {v10, v3, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    invoke-static {v10, v4, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    invoke-interface {v10}, LY/m;->e()Z

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    if-nez v4, :cond_22

    .line 574
    .line 575
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object v15

    .line 583
    invoke-static {v4, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-nez v4, :cond_23

    .line 588
    .line 589
    :cond_22
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    invoke-interface {v10, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    invoke-interface {v10, v4, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 601
    .line 602
    .line 603
    :cond_23
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    invoke-static {v10, v2, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 608
    .line 609
    .line 610
    sget-object v2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 611
    .line 612
    if-eqz p1, :cond_24

    .line 613
    .line 614
    invoke-virtual {v11}, Ly/b;->d()J

    .line 615
    .line 616
    .line 617
    move-result-wide v2

    .line 618
    goto :goto_15

    .line 619
    :cond_24
    invoke-virtual {v11}, Ly/b;->b()J

    .line 620
    .line 621
    .line 622
    move-result-wide v2

    .line 623
    :goto_15
    invoke-static {v2, v3}, Ls0/r0;->m(J)Ls0/r0;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    const/4 v3, 0x0

    .line 628
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 629
    .line 630
    .line 631
    move-result-object v3

    .line 632
    invoke-interface {v12, v2, v9, v3}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    invoke-interface {v9}, LY/m;->x()V

    .line 636
    .line 637
    .line 638
    goto/16 :goto_13

    .line 639
    .line 640
    :goto_16
    if-eqz p1, :cond_25

    .line 641
    .line 642
    invoke-virtual {v11}, Ly/b;->e()J

    .line 643
    .line 644
    .line 645
    move-result-wide v2

    .line 646
    goto :goto_17

    .line 647
    :cond_25
    invoke-virtual {v11}, Ly/b;->c()J

    .line 648
    .line 649
    .line 650
    move-result-wide v2

    .line 651
    :goto_17
    invoke-virtual {v13, v2, v3}, Ly/h;->j(J)LU0/Y0;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 656
    .line 657
    const/high16 v4, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/4 v5, 0x1

    .line 660
    invoke-interface {v1, v3, v4, v5}, LC/I;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    .line 661
    .line 662
    .line 663
    move-result-object v10

    .line 664
    and-int/lit8 v1, v14, 0xe

    .line 665
    .line 666
    const/high16 v3, 0x180000

    .line 667
    .line 668
    or-int v19, v1, v3

    .line 669
    .line 670
    const/16 v20, 0x1b8

    .line 671
    .line 672
    move-object v13, v12

    .line 673
    const/4 v12, 0x0

    .line 674
    move-object v1, v13

    .line 675
    const/4 v13, 0x0

    .line 676
    const/4 v14, 0x0

    .line 677
    const/4 v15, 0x1

    .line 678
    const/16 v16, 0x0

    .line 679
    .line 680
    const/16 v17, 0x0

    .line 681
    .line 682
    move-object v11, v2

    .line 683
    move-object/from16 v18, v9

    .line 684
    .line 685
    move-object/from16 v9, p0

    .line 686
    .line 687
    invoke-static/range {v9 .. v20}, LK/d;->b(Ljava/lang/String;Landroidx/compose/ui/e;LU0/Y0;Lkotlin/jvm/functions/Function1;IZIILs0/t0;LY/m;II)V

    .line 688
    .line 689
    .line 690
    invoke-interface/range {v18 .. v18}, LY/m;->x()V

    .line 691
    .line 692
    .line 693
    invoke-static {}, LY/w;->L()Z

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    if-eqz v2, :cond_26

    .line 698
    .line 699
    invoke-static {}, LY/w;->T()V

    .line 700
    .line 701
    .line 702
    :cond_26
    move-object v4, v0

    .line 703
    move-object v5, v1

    .line 704
    :goto_18
    invoke-interface/range {v18 .. v18}, LY/m;->k()LY/B1;

    .line 705
    .line 706
    .line 707
    move-result-object v9

    .line 708
    if-eqz v9, :cond_27

    .line 709
    .line 710
    new-instance v0, Ly/k$c;

    .line 711
    .line 712
    move-object/from16 v1, p0

    .line 713
    .line 714
    move/from16 v2, p1

    .line 715
    .line 716
    move-object/from16 v3, p2

    .line 717
    .line 718
    move-object v6, v7

    .line 719
    move v7, v8

    .line 720
    move/from16 v8, p8

    .line 721
    .line 722
    invoke-direct/range {v0 .. v8}, Ly/k$c;-><init>(Ljava/lang/String;ZLy/b;Landroidx/compose/ui/e;Lie/o;Lie/a;II)V

    .line 723
    .line 724
    .line 725
    invoke-interface {v9, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 726
    .line 727
    .line 728
    :cond_27
    return-void
.end method

.method public static final c(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V
    .locals 9

    .line 1
    const v0, 0x2a7121cd

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v6

    .line 8
    and-int/lit8 p4, p6, 0x1

    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    or-int/lit8 p4, p5, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    and-int/lit8 p4, p5, 0x6

    .line 16
    .line 17
    if-nez p4, :cond_2

    .line 18
    .line 19
    invoke-interface {v6, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-eqz p4, :cond_1

    .line 24
    .line 25
    const/4 p4, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p4, 0x2

    .line 28
    :goto_0
    or-int/2addr p4, p5

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move p4, p5

    .line 31
    :goto_1
    and-int/lit8 v1, p6, 0x2

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    or-int/lit8 p4, p4, 0x30

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v1, p5, 0x30

    .line 39
    .line 40
    if-nez v1, :cond_5

    .line 41
    .line 42
    invoke-interface {v6, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    const/16 v1, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    const/16 v1, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr p4, v1

    .line 54
    :cond_5
    :goto_3
    and-int/lit8 v1, p6, 0x4

    .line 55
    .line 56
    if-eqz v1, :cond_6

    .line 57
    .line 58
    or-int/lit16 p4, p4, 0x180

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_6
    and-int/lit16 v2, p5, 0x180

    .line 62
    .line 63
    if-nez v2, :cond_8

    .line 64
    .line 65
    invoke-interface {v6, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_7

    .line 70
    .line 71
    const/16 v2, 0x100

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    const/16 v2, 0x80

    .line 75
    .line 76
    :goto_4
    or-int/2addr p4, v2

    .line 77
    :cond_8
    :goto_5
    and-int/lit8 v2, p6, 0x8

    .line 78
    .line 79
    if-eqz v2, :cond_9

    .line 80
    .line 81
    or-int/lit16 p4, p4, 0xc00

    .line 82
    .line 83
    goto :goto_7

    .line 84
    :cond_9
    and-int/lit16 v2, p5, 0xc00

    .line 85
    .line 86
    if-nez v2, :cond_b

    .line 87
    .line 88
    invoke-interface {v6, p3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_a

    .line 93
    .line 94
    const/16 v2, 0x800

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_a
    const/16 v2, 0x400

    .line 98
    .line 99
    :goto_6
    or-int/2addr p4, v2

    .line 100
    :cond_b
    :goto_7
    and-int/lit16 v2, p4, 0x493

    .line 101
    .line 102
    const/16 v3, 0x492

    .line 103
    .line 104
    if-ne v2, v3, :cond_d

    .line 105
    .line 106
    invoke-interface {v6}, LY/m;->i()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-nez v2, :cond_c

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_c
    invoke-interface {v6}, LY/m;->K()V

    .line 114
    .line 115
    .line 116
    move-object p4, p3

    .line 117
    move-object p3, p2

    .line 118
    move-object p2, p1

    .line 119
    move-object p1, p0

    .line 120
    goto :goto_9

    .line 121
    :cond_d
    :goto_8
    if-eqz v1, :cond_e

    .line 122
    .line 123
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 124
    .line 125
    :cond_e
    move-object v3, p2

    .line 126
    invoke-static {}, LY/w;->L()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_f

    .line 131
    .line 132
    const/4 p2, -0x1

    .line 133
    const-string v1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)"

    .line 134
    .line 135
    invoke-static {v0, p4, p2, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_f
    const/4 p2, 0x0

    .line 139
    const/4 v0, 0x3

    .line 140
    invoke-static {p2, p2, v6, p2, v0}, Ly/k;->e(IILY/m;II)Ly/b;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    and-int/lit16 p2, p4, 0x3fe

    .line 145
    .line 146
    const v1, 0xe000

    .line 147
    .line 148
    .line 149
    shl-int/2addr p4, v0

    .line 150
    and-int/2addr p4, v1

    .line 151
    or-int v7, p2, p4

    .line 152
    .line 153
    const/4 v8, 0x0

    .line 154
    move-object v1, p0

    .line 155
    move-object v2, p1

    .line 156
    move-object v5, p3

    .line 157
    invoke-static/range {v1 .. v8}, Ly/k;->d(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/e;Ly/b;Lkotlin/jvm/functions/Function1;LY/m;II)V

    .line 158
    .line 159
    .line 160
    move-object p1, v1

    .line 161
    move-object p2, v2

    .line 162
    move-object p4, v5

    .line 163
    invoke-static {}, LY/w;->L()Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_10

    .line 168
    .line 169
    invoke-static {}, LY/w;->T()V

    .line 170
    .line 171
    .line 172
    :cond_10
    move-object p3, v3

    .line 173
    :goto_9
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_11

    .line 178
    .line 179
    new-instance p0, Ly/k$d;

    .line 180
    .line 181
    invoke-direct/range {p0 .. p6}, Ly/k$d;-><init>(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;II)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v0, p0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    :cond_11
    return-void
.end method

.method public static final d(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/e;Ly/b;Lkotlin/jvm/functions/Function1;LY/m;II)V
    .locals 14

    .line 1
    move-object/from16 v4, p3

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p6

    .line 6
    .line 7
    const v0, 0x56425b5b

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p5

    .line 11
    .line 12
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    and-int/lit8 v1, p7, 0x1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    or-int/lit8 v1, v6, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v1, v6, 0x6

    .line 24
    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v11, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v1, 0x2

    .line 36
    :goto_0
    or-int/2addr v1, v6

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v1, v6

    .line 39
    :goto_1
    and-int/lit8 v2, p7, 0x2

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    or-int/lit8 v1, v1, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v2, v6, 0x30

    .line 47
    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    invoke-interface {v11, p1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    const/16 v2, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const/16 v2, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v1, v2

    .line 62
    :cond_5
    :goto_3
    and-int/lit8 v2, p7, 0x4

    .line 63
    .line 64
    if-eqz v2, :cond_7

    .line 65
    .line 66
    or-int/lit16 v1, v1, 0x180

    .line 67
    .line 68
    :cond_6
    move-object/from16 v3, p2

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_7
    and-int/lit16 v3, v6, 0x180

    .line 72
    .line 73
    if-nez v3, :cond_6

    .line 74
    .line 75
    move-object/from16 v3, p2

    .line 76
    .line 77
    invoke-interface {v11, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_8

    .line 82
    .line 83
    const/16 v7, 0x100

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_8
    const/16 v7, 0x80

    .line 87
    .line 88
    :goto_4
    or-int/2addr v1, v7

    .line 89
    :goto_5
    and-int/lit8 v7, p7, 0x8

    .line 90
    .line 91
    if-eqz v7, :cond_9

    .line 92
    .line 93
    or-int/lit16 v1, v1, 0xc00

    .line 94
    .line 95
    goto :goto_7

    .line 96
    :cond_9
    and-int/lit16 v7, v6, 0xc00

    .line 97
    .line 98
    if-nez v7, :cond_b

    .line 99
    .line 100
    invoke-interface {v11, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_a

    .line 105
    .line 106
    const/16 v7, 0x800

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_a
    const/16 v7, 0x400

    .line 110
    .line 111
    :goto_6
    or-int/2addr v1, v7

    .line 112
    :cond_b
    :goto_7
    and-int/lit8 v7, p7, 0x10

    .line 113
    .line 114
    if-eqz v7, :cond_c

    .line 115
    .line 116
    or-int/lit16 v1, v1, 0x6000

    .line 117
    .line 118
    goto :goto_9

    .line 119
    :cond_c
    and-int/lit16 v7, v6, 0x6000

    .line 120
    .line 121
    if-nez v7, :cond_e

    .line 122
    .line 123
    invoke-interface {v11, v5}, LY/m;->F(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_d

    .line 128
    .line 129
    const/16 v7, 0x4000

    .line 130
    .line 131
    goto :goto_8

    .line 132
    :cond_d
    const/16 v7, 0x2000

    .line 133
    .line 134
    :goto_8
    or-int/2addr v1, v7

    .line 135
    :cond_e
    :goto_9
    and-int/lit16 v7, v1, 0x2493

    .line 136
    .line 137
    const/16 v8, 0x2492

    .line 138
    .line 139
    if-ne v7, v8, :cond_10

    .line 140
    .line 141
    invoke-interface {v11}, LY/m;->i()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_f

    .line 146
    .line 147
    goto :goto_a

    .line 148
    :cond_f
    invoke-interface {v11}, LY/m;->K()V

    .line 149
    .line 150
    .line 151
    goto :goto_c

    .line 152
    :cond_10
    :goto_a
    if-eqz v2, :cond_11

    .line 153
    .line 154
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 155
    .line 156
    goto :goto_b

    .line 157
    :cond_11
    move-object v2, v3

    .line 158
    :goto_b
    invoke-static {}, LY/w;->L()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_12

    .line 163
    .line 164
    const/4 v3, -0x1

    .line 165
    const-string v7, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:121)"

    .line 166
    .line 167
    invoke-static {v0, v1, v3, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :cond_12
    sget-object v9, Ly/k;->a:Landroidx/compose/ui/window/t;

    .line 171
    .line 172
    new-instance v0, Ly/k$e;

    .line 173
    .line 174
    invoke-direct {v0, v4, v2, v5}, Ly/k$e;-><init>(Ly/b;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)V

    .line 175
    .line 176
    .line 177
    const/16 v3, 0x36

    .line 178
    .line 179
    const v7, 0x2f709e7d

    .line 180
    .line 181
    .line 182
    const/4 v8, 0x1

    .line 183
    invoke-static {v7, v8, v0, v11, v3}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    and-int/lit8 v0, v1, 0xe

    .line 188
    .line 189
    or-int/lit16 v0, v0, 0xd80

    .line 190
    .line 191
    and-int/lit8 v1, v1, 0x70

    .line 192
    .line 193
    or-int v12, v0, v1

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    move-object v7, p0

    .line 197
    move-object v8, p1

    .line 198
    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/window/t;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 199
    .line 200
    .line 201
    invoke-static {}, LY/w;->L()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_13

    .line 206
    .line 207
    invoke-static {}, LY/w;->T()V

    .line 208
    .line 209
    .line 210
    :cond_13
    move-object v3, v2

    .line 211
    :goto_c
    invoke-interface {v11}, LY/m;->k()LY/B1;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    if-eqz v8, :cond_14

    .line 216
    .line 217
    new-instance v0, Ly/k$f;

    .line 218
    .line 219
    move-object v1, p0

    .line 220
    move-object v2, p1

    .line 221
    move/from16 v7, p7

    .line 222
    .line 223
    invoke-direct/range {v0 .. v7}, Ly/k$f;-><init>(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/e;Ly/b;Lkotlin/jvm/functions/Function1;II)V

    .line 224
    .line 225
    .line 226
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    :cond_14
    return-void
.end method

.method public static final e(IILY/m;II)Ly/b;
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    and-int/lit8 v1, p4, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const v1, 0x1030086

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move/from16 v1, p0

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v2, p4, 0x2

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    const v2, 0x1030080

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move/from16 v2, p1

    .line 22
    .line 23
    :goto_1
    invoke-static {}, LY/w;->L()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    const/4 v3, -0x1

    .line 30
    const-string v4, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)"

    .line 31
    .line 32
    const v5, 0x64b3ce0e

    .line 33
    .line 34
    .line 35
    move/from16 v6, p3

    .line 36
    .line 37
    invoke-static {v5, v6, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LY/b1;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v0, v3}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Landroid/content/Context;

    .line 49
    .line 50
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f()LY/b1;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-interface {v0, v4}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Landroid/content/res/Configuration;

    .line 59
    .line 60
    invoke-interface {v0, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-interface {v0, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    or-int/2addr v4, v5

    .line 69
    invoke-interface {v0}, LY/m;->D()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    if-nez v4, :cond_3

    .line 74
    .line 75
    sget-object v4, LY/m;->a:LY/m$a;

    .line 76
    .line 77
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-ne v5, v4, :cond_4

    .line 82
    .line 83
    :cond_3
    sget-object v4, Ly/k;->b:Ly/b;

    .line 84
    .line 85
    invoke-virtual {v4}, Ly/b;->a()J

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    const v7, 0x1010031

    .line 90
    .line 91
    .line 92
    invoke-static {v3, v1, v7, v5, v6}, Ly/k;->h(Landroid/content/Context;IIJ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v9

    .line 96
    const v1, 0x1010036

    .line 97
    .line 98
    .line 99
    invoke-static {v3, v2, v1}, Ly/k;->i(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v4}, Ly/b;->e()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    invoke-static {v1, v2, v3}, Ly/k;->g(Landroid/content/res/ColorStateList;J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v11

    .line 111
    invoke-virtual {v4}, Ly/b;->c()J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    invoke-static {v1, v2, v3}, Ly/k;->f(Landroid/content/res/ColorStateList;J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v15

    .line 119
    new-instance v8, Ly/b;

    .line 120
    .line 121
    const/16 v19, 0x0

    .line 122
    .line 123
    move-wide v13, v11

    .line 124
    move-wide/from16 v17, v15

    .line 125
    .line 126
    invoke-direct/range {v8 .. v19}, Ly/b;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    move-object v5, v8

    .line 133
    :cond_4
    check-cast v5, Ly/b;

    .line 134
    .line 135
    invoke-static {}, LY/w;->L()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    invoke-static {}, LY/w;->T()V

    .line 142
    .line 143
    .line 144
    :cond_5
    return-object v5
.end method

.method private static final f(Landroid/content/res/ColorStateList;J)J
    .locals 2

    .line 1
    invoke-static {p1, p2}, Ls0/s0;->k(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const v1, -0x101009e

    .line 8
    .line 9
    .line 10
    filled-new-array {v1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    if-eqz p0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v1, v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ls0/s0;->b(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    return-wide p0

    .line 42
    :cond_2
    :goto_1
    return-wide p1
.end method

.method private static final g(Landroid/content/res/ColorStateList;J)J
    .locals 2

    .line 1
    invoke-static {p1, p2}, Ls0/s0;->k(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const v1, 0x101009e

    .line 8
    .line 9
    .line 10
    filled-new-array {v1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    if-eqz p0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v1, v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ls0/s0;->b(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    return-wide p0

    .line 42
    :cond_2
    :goto_1
    return-wide p1
.end method

.method private static final h(Landroid/content/Context;IIJ)J
    .locals 0

    .line 1
    filled-new-array {p2}, [I

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p3, p4}, Ls0/s0;->k(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    if-ne p2, p1, :cond_0

    .line 22
    .line 23
    return-wide p3

    .line 24
    :cond_0
    invoke-static {p2}, Ls0/s0;->b(I)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method private static final i(Landroid/content/Context;II)Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    filled-new-array {p2}, [I

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method
