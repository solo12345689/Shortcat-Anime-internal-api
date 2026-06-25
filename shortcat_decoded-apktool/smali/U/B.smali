.class public abstract LU/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 2
    .line 3
    sget-object v1, LX/g;->a:LX/g;

    .line 4
    .line 5
    invoke-virtual {v1}, LX/g;->a()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/s;->r(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, LU/B;->a:Landroidx/compose/ui/e;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Lw0/b;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move/from16 v10, p6

    .line 6
    .line 7
    const v0, -0x7faffaf9

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p5

    .line 11
    .line 12
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    and-int/lit8 v2, p7, 0x1

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    or-int/lit8 v2, v10, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v2, v10, 0x6

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v11, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v2, 0x2

    .line 36
    :goto_0
    or-int/2addr v2, v10

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v2, v10

    .line 39
    :goto_1
    and-int/lit8 v3, p7, 0x2

    .line 40
    .line 41
    const/16 v4, 0x20

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    or-int/lit8 v2, v2, 0x30

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    and-int/lit8 v3, v10, 0x30

    .line 49
    .line 50
    if-nez v3, :cond_5

    .line 51
    .line 52
    invoke-interface {v11, v9}, LY/m;->U(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    move v3, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v3, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v2, v3

    .line 63
    :cond_5
    :goto_3
    and-int/lit8 v3, p7, 0x4

    .line 64
    .line 65
    if-eqz v3, :cond_7

    .line 66
    .line 67
    or-int/lit16 v2, v2, 0x180

    .line 68
    .line 69
    :cond_6
    move-object/from16 v5, p2

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_7
    and-int/lit16 v5, v10, 0x180

    .line 73
    .line 74
    if-nez v5, :cond_6

    .line 75
    .line 76
    move-object/from16 v5, p2

    .line 77
    .line 78
    invoke-interface {v11, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_8

    .line 83
    .line 84
    const/16 v6, 0x100

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_8
    const/16 v6, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v2, v6

    .line 90
    :goto_5
    and-int/lit16 v6, v10, 0xc00

    .line 91
    .line 92
    const/16 v7, 0x800

    .line 93
    .line 94
    if-nez v6, :cond_a

    .line 95
    .line 96
    and-int/lit8 v6, p7, 0x8

    .line 97
    .line 98
    move-wide/from16 v12, p3

    .line 99
    .line 100
    if-nez v6, :cond_9

    .line 101
    .line 102
    invoke-interface {v11, v12, v13}, LY/m;->d(J)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_9

    .line 107
    .line 108
    move v6, v7

    .line 109
    goto :goto_6

    .line 110
    :cond_9
    const/16 v6, 0x400

    .line 111
    .line 112
    :goto_6
    or-int/2addr v2, v6

    .line 113
    goto :goto_7

    .line 114
    :cond_a
    move-wide/from16 v12, p3

    .line 115
    .line 116
    :goto_7
    and-int/lit16 v6, v2, 0x493

    .line 117
    .line 118
    const/16 v8, 0x492

    .line 119
    .line 120
    if-ne v6, v8, :cond_c

    .line 121
    .line 122
    invoke-interface {v11}, LY/m;->i()Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-nez v6, :cond_b

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_b
    invoke-interface {v11}, LY/m;->K()V

    .line 130
    .line 131
    .line 132
    move-object v3, v5

    .line 133
    move-wide v4, v12

    .line 134
    goto/16 :goto_11

    .line 135
    .line 136
    :cond_c
    :goto_8
    invoke-interface {v11}, LY/m;->G()V

    .line 137
    .line 138
    .line 139
    and-int/lit8 v6, v10, 0x1

    .line 140
    .line 141
    if-eqz v6, :cond_f

    .line 142
    .line 143
    invoke-interface {v11}, LY/m;->N()Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_d

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_d
    invoke-interface {v11}, LY/m;->K()V

    .line 151
    .line 152
    .line 153
    and-int/lit8 v3, p7, 0x8

    .line 154
    .line 155
    if-eqz v3, :cond_e

    .line 156
    .line 157
    and-int/lit16 v2, v2, -0x1c01

    .line 158
    .line 159
    :cond_e
    move-wide v14, v12

    .line 160
    move-object v12, v5

    .line 161
    goto :goto_b

    .line 162
    :cond_f
    :goto_9
    if-eqz v3, :cond_10

    .line 163
    .line 164
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 165
    .line 166
    goto :goto_a

    .line 167
    :cond_10
    move-object v3, v5

    .line 168
    :goto_a
    and-int/lit8 v5, p7, 0x8

    .line 169
    .line 170
    if-eqz v5, :cond_11

    .line 171
    .line 172
    invoke-static {}, LU/s;->a()LY/b1;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-interface {v11, v5}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    check-cast v5, Ls0/r0;

    .line 181
    .line 182
    invoke-virtual {v5}, Ls0/r0;->A()J

    .line 183
    .line 184
    .line 185
    move-result-wide v5

    .line 186
    and-int/lit16 v2, v2, -0x1c01

    .line 187
    .line 188
    move-object v12, v3

    .line 189
    move-wide v14, v5

    .line 190
    goto :goto_b

    .line 191
    :cond_11
    move-wide v14, v12

    .line 192
    move-object v12, v3

    .line 193
    :goto_b
    invoke-interface {v11}, LY/m;->y()V

    .line 194
    .line 195
    .line 196
    invoke-static {}, LY/w;->L()Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-eqz v3, :cond_12

    .line 201
    .line 202
    const/4 v3, -0x1

    .line 203
    const-string v5, "androidx.compose.material3.Icon (Icon.kt:143)"

    .line 204
    .line 205
    invoke-static {v0, v2, v3, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :cond_12
    and-int/lit16 v0, v2, 0x1c00

    .line 209
    .line 210
    xor-int/lit16 v0, v0, 0xc00

    .line 211
    .line 212
    const/4 v3, 0x0

    .line 213
    if-le v0, v7, :cond_13

    .line 214
    .line 215
    invoke-interface {v11, v14, v15}, LY/m;->d(J)Z

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-nez v0, :cond_14

    .line 220
    .line 221
    :cond_13
    and-int/lit16 v0, v2, 0xc00

    .line 222
    .line 223
    if-ne v0, v7, :cond_15

    .line 224
    .line 225
    :cond_14
    const/4 v0, 0x1

    .line 226
    goto :goto_c

    .line 227
    :cond_15
    move v0, v3

    .line 228
    :goto_c
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    const/4 v7, 0x0

    .line 233
    if-nez v0, :cond_16

    .line 234
    .line 235
    sget-object v0, LY/m;->a:LY/m$a;

    .line 236
    .line 237
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    if-ne v6, v0, :cond_18

    .line 242
    .line 243
    :cond_16
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 244
    .line 245
    invoke-virtual {v0}, Ls0/r0$a;->j()J

    .line 246
    .line 247
    .line 248
    move-result-wide v5

    .line 249
    invoke-static {v14, v15, v5, v6}, Ls0/r0;->s(JJ)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_17

    .line 254
    .line 255
    move-object v6, v7

    .line 256
    goto :goto_d

    .line 257
    :cond_17
    sget-object v13, Landroidx/compose/ui/graphics/d;->b:Landroidx/compose/ui/graphics/d$a;

    .line 258
    .line 259
    const/16 v17, 0x2

    .line 260
    .line 261
    const/16 v18, 0x0

    .line 262
    .line 263
    const/16 v16, 0x0

    .line 264
    .line 265
    invoke-static/range {v13 .. v18}, Landroidx/compose/ui/graphics/d$a;->b(Landroidx/compose/ui/graphics/d$a;JIILjava/lang/Object;)Landroidx/compose/ui/graphics/d;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    move-object v6, v0

    .line 270
    :goto_d
    invoke-interface {v11, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_18
    check-cast v6, Landroidx/compose/ui/graphics/d;

    .line 274
    .line 275
    const v0, -0x7fd87200

    .line 276
    .line 277
    .line 278
    invoke-interface {v11, v0}, LY/m;->V(I)V

    .line 279
    .line 280
    .line 281
    if-eqz v9, :cond_1c

    .line 282
    .line 283
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 284
    .line 285
    and-int/lit8 v2, v2, 0x70

    .line 286
    .line 287
    if-ne v2, v4, :cond_19

    .line 288
    .line 289
    const/4 v2, 0x1

    .line 290
    goto :goto_e

    .line 291
    :cond_19
    move v2, v3

    .line 292
    :goto_e
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    if-nez v2, :cond_1a

    .line 297
    .line 298
    sget-object v2, LY/m;->a:LY/m$a;

    .line 299
    .line 300
    invoke-virtual {v2}, LY/m$a;->a()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    if-ne v4, v2, :cond_1b

    .line 305
    .line 306
    :cond_1a
    new-instance v4, LU/B$c;

    .line 307
    .line 308
    invoke-direct {v4, v9}, LU/B$c;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v11, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_1b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 315
    .line 316
    const/4 v2, 0x1

    .line 317
    invoke-static {v0, v3, v4, v2, v7}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    :goto_f
    move-object v13, v0

    .line 322
    goto :goto_10

    .line 323
    :cond_1c
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 324
    .line 325
    goto :goto_f

    .line 326
    :goto_10
    invoke-interface {v11}, LY/m;->O()V

    .line 327
    .line 328
    .line 329
    invoke-static {v12}, Landroidx/compose/ui/graphics/f;->f(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {v0, v1}, LU/B;->c(Landroidx/compose/ui/e;Lw0/b;)Landroidx/compose/ui/e;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    sget-object v2, LI0/f;->a:LI0/f$a;

    .line 338
    .line 339
    invoke-virtual {v2}, LI0/f$a;->b()LI0/f;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    const/16 v7, 0x16

    .line 344
    .line 345
    const/4 v8, 0x0

    .line 346
    const/4 v2, 0x0

    .line 347
    move v5, v3

    .line 348
    const/4 v3, 0x0

    .line 349
    move/from16 v16, v5

    .line 350
    .line 351
    const/4 v5, 0x0

    .line 352
    move/from16 v9, v16

    .line 353
    .line 354
    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/draw/d;->b(Landroidx/compose/ui/e;Lw0/b;ZLl0/e;LI0/f;FLandroidx/compose/ui/graphics/d;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-interface {v0, v13}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v0, v11, v9}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 363
    .line 364
    .line 365
    invoke-static {}, LY/w;->L()Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_1d

    .line 370
    .line 371
    invoke-static {}, LY/w;->T()V

    .line 372
    .line 373
    .line 374
    :cond_1d
    move-object v3, v12

    .line 375
    move-wide v4, v14

    .line 376
    :goto_11
    invoke-interface {v11}, LY/m;->k()LY/B1;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    if-eqz v8, :cond_1e

    .line 381
    .line 382
    new-instance v0, LU/B$b;

    .line 383
    .line 384
    move-object/from16 v1, p0

    .line 385
    .line 386
    move-object/from16 v2, p1

    .line 387
    .line 388
    move/from16 v7, p7

    .line 389
    .line 390
    move v6, v10

    .line 391
    invoke-direct/range {v0 .. v7}, LU/B$b;-><init>(Lw0/b;Ljava/lang/String;Landroidx/compose/ui/e;JII)V

    .line 392
    .line 393
    .line 394
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 395
    .line 396
    .line 397
    :cond_1e
    return-void
.end method

.method public static final b(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V
    .locals 15

    .line 1
    move/from16 v6, p6

    .line 2
    .line 3
    const v0, -0x79033cc

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p5

    .line 7
    .line 8
    invoke-interface {v1, v0}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v12

    .line 12
    and-int/lit8 v1, p7, 0x1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    or-int/lit8 v1, v6, 0x6

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    and-int/lit8 v1, v6, 0x6

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v12, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x2

    .line 32
    :goto_0
    or-int/2addr v1, v6

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v1, v6

    .line 35
    :goto_1
    and-int/lit8 v2, p7, 0x2

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    or-int/lit8 v1, v1, 0x30

    .line 40
    .line 41
    move-object/from16 v8, p1

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    and-int/lit8 v2, v6, 0x30

    .line 45
    .line 46
    move-object/from16 v8, p1

    .line 47
    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    invoke-interface {v12, v8}, LY/m;->U(Ljava/lang/Object;)Z

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
    invoke-interface {v12, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_8

    .line 82
    .line 83
    const/16 v4, 0x100

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_8
    const/16 v4, 0x80

    .line 87
    .line 88
    :goto_4
    or-int/2addr v1, v4

    .line 89
    :goto_5
    and-int/lit16 v4, v6, 0xc00

    .line 90
    .line 91
    if-nez v4, :cond_b

    .line 92
    .line 93
    and-int/lit8 v4, p7, 0x8

    .line 94
    .line 95
    if-nez v4, :cond_9

    .line 96
    .line 97
    move-wide/from16 v4, p3

    .line 98
    .line 99
    invoke-interface {v12, v4, v5}, LY/m;->d(J)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_a

    .line 104
    .line 105
    const/16 v7, 0x800

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_9
    move-wide/from16 v4, p3

    .line 109
    .line 110
    :cond_a
    const/16 v7, 0x400

    .line 111
    .line 112
    :goto_6
    or-int/2addr v1, v7

    .line 113
    goto :goto_7

    .line 114
    :cond_b
    move-wide/from16 v4, p3

    .line 115
    .line 116
    :goto_7
    and-int/lit16 v7, v1, 0x493

    .line 117
    .line 118
    const/16 v9, 0x492

    .line 119
    .line 120
    if-ne v7, v9, :cond_d

    .line 121
    .line 122
    invoke-interface {v12}, LY/m;->i()Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_c

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_c
    invoke-interface {v12}, LY/m;->K()V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_d

    .line 133
    .line 134
    :cond_d
    :goto_8
    invoke-interface {v12}, LY/m;->G()V

    .line 135
    .line 136
    .line 137
    and-int/lit8 v7, v6, 0x1

    .line 138
    .line 139
    if-eqz v7, :cond_10

    .line 140
    .line 141
    invoke-interface {v12}, LY/m;->N()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-eqz v7, :cond_e

    .line 146
    .line 147
    goto :goto_a

    .line 148
    :cond_e
    invoke-interface {v12}, LY/m;->K()V

    .line 149
    .line 150
    .line 151
    and-int/lit8 v2, p7, 0x8

    .line 152
    .line 153
    if-eqz v2, :cond_f

    .line 154
    .line 155
    and-int/lit16 v1, v1, -0x1c01

    .line 156
    .line 157
    :cond_f
    move-object v9, v3

    .line 158
    :goto_9
    move-wide v10, v4

    .line 159
    goto :goto_c

    .line 160
    :cond_10
    :goto_a
    if-eqz v2, :cond_11

    .line 161
    .line 162
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 163
    .line 164
    goto :goto_b

    .line 165
    :cond_11
    move-object v2, v3

    .line 166
    :goto_b
    and-int/lit8 v3, p7, 0x8

    .line 167
    .line 168
    if-eqz v3, :cond_12

    .line 169
    .line 170
    invoke-static {}, LU/s;->a()LY/b1;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-interface {v12, v3}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Ls0/r0;

    .line 179
    .line 180
    invoke-virtual {v3}, Ls0/r0;->A()J

    .line 181
    .line 182
    .line 183
    move-result-wide v3

    .line 184
    and-int/lit16 v1, v1, -0x1c01

    .line 185
    .line 186
    move-object v9, v2

    .line 187
    move-wide v10, v3

    .line 188
    goto :goto_c

    .line 189
    :cond_12
    move-object v9, v2

    .line 190
    goto :goto_9

    .line 191
    :goto_c
    invoke-interface {v12}, LY/m;->y()V

    .line 192
    .line 193
    .line 194
    invoke-static {}, LY/w;->L()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_13

    .line 199
    .line 200
    const/4 v2, -0x1

    .line 201
    const-string v3, "androidx.compose.material3.Icon (Icon.kt:70)"

    .line 202
    .line 203
    invoke-static {v0, v1, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_13
    and-int/lit8 v0, v1, 0xe

    .line 207
    .line 208
    invoke-static {p0, v12, v0}, Lx0/q;->g(Lx0/d;LY/m;I)Landroidx/compose/ui/graphics/vector/VectorPainter;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    sget v0, Landroidx/compose/ui/graphics/vector/VectorPainter;->n:I

    .line 213
    .line 214
    and-int/lit8 v2, v1, 0x70

    .line 215
    .line 216
    or-int/2addr v0, v2

    .line 217
    and-int/lit16 v2, v1, 0x380

    .line 218
    .line 219
    or-int/2addr v0, v2

    .line 220
    and-int/lit16 v1, v1, 0x1c00

    .line 221
    .line 222
    or-int v13, v0, v1

    .line 223
    .line 224
    const/4 v14, 0x0

    .line 225
    invoke-static/range {v7 .. v14}, LU/B;->a(Lw0/b;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V

    .line 226
    .line 227
    .line 228
    invoke-static {}, LY/w;->L()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_14

    .line 233
    .line 234
    invoke-static {}, LY/w;->T()V

    .line 235
    .line 236
    .line 237
    :cond_14
    move-object v3, v9

    .line 238
    move-wide v4, v10

    .line 239
    :goto_d
    invoke-interface {v12}, LY/m;->k()LY/B1;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    if-eqz v8, :cond_15

    .line 244
    .line 245
    new-instance v0, LU/B$a;

    .line 246
    .line 247
    move-object v1, p0

    .line 248
    move-object/from16 v2, p1

    .line 249
    .line 250
    move/from16 v7, p7

    .line 251
    .line 252
    invoke-direct/range {v0 .. v7}, LU/B$a;-><init>(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JII)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 256
    .line 257
    .line 258
    :cond_15
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lw0/b;)Landroidx/compose/ui/e;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lw0/b;->k()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Lr0/l;->b:Lr0/l$a;

    .line 6
    .line 7
    invoke-virtual {v2}, Lr0/l$a;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-static {v0, v1, v2, v3}, Lr0/l;->f(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lw0/b;->k()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {v0, v1}, LU/B;->d(J)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    sget-object p1, LU/B;->a:Landroidx/compose/ui/e;

    .line 32
    .line 33
    :goto_1
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method private static final d(J)Z
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lr0/l;->i(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0, p1}, Lr0/l;->g(J)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method
