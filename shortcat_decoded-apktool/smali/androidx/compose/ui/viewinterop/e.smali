.class public abstract Landroidx/compose/ui/viewinterop/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/viewinterop/e$g;->a:Landroidx/compose/ui/viewinterop/e$g;

    .line 2
    .line 3
    sput-object v0, Landroidx/compose/ui/viewinterop/e;->a:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LY/m;II)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p6

    .line 4
    .line 5
    const v0, -0xabaf393

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p5

    .line 9
    .line 10
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    and-int/lit8 v3, p7, 0x1

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v6, 0x6

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v3, v6, 0x6

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v3, 0x2

    .line 34
    :goto_0
    or-int/2addr v3, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v3, v6

    .line 37
    :goto_1
    and-int/lit8 v4, p7, 0x2

    .line 38
    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    or-int/lit8 v3, v3, 0x30

    .line 42
    .line 43
    :cond_3
    move-object/from16 v5, p1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_4
    and-int/lit8 v5, v6, 0x30

    .line 47
    .line 48
    if-nez v5, :cond_3

    .line 49
    .line 50
    move-object/from16 v5, p1

    .line 51
    .line 52
    invoke-interface {v2, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_5

    .line 57
    .line 58
    const/16 v7, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    const/16 v7, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v7

    .line 64
    :goto_3
    and-int/lit8 v7, p7, 0x4

    .line 65
    .line 66
    if-eqz v7, :cond_7

    .line 67
    .line 68
    or-int/lit16 v3, v3, 0x180

    .line 69
    .line 70
    :cond_6
    move-object/from16 v8, p2

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    and-int/lit16 v8, v6, 0x180

    .line 74
    .line 75
    if-nez v8, :cond_6

    .line 76
    .line 77
    move-object/from16 v8, p2

    .line 78
    .line 79
    invoke-interface {v2, v8}, LY/m;->F(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_8

    .line 84
    .line 85
    const/16 v9, 0x100

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_8
    const/16 v9, 0x80

    .line 89
    .line 90
    :goto_4
    or-int/2addr v3, v9

    .line 91
    :goto_5
    and-int/lit8 v9, p7, 0x8

    .line 92
    .line 93
    if-eqz v9, :cond_a

    .line 94
    .line 95
    or-int/lit16 v3, v3, 0xc00

    .line 96
    .line 97
    :cond_9
    move-object/from16 v10, p3

    .line 98
    .line 99
    goto :goto_7

    .line 100
    :cond_a
    and-int/lit16 v10, v6, 0xc00

    .line 101
    .line 102
    if-nez v10, :cond_9

    .line 103
    .line 104
    move-object/from16 v10, p3

    .line 105
    .line 106
    invoke-interface {v2, v10}, LY/m;->F(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eqz v11, :cond_b

    .line 111
    .line 112
    const/16 v11, 0x800

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_b
    const/16 v11, 0x400

    .line 116
    .line 117
    :goto_6
    or-int/2addr v3, v11

    .line 118
    :goto_7
    and-int/lit8 v11, p7, 0x10

    .line 119
    .line 120
    if-eqz v11, :cond_d

    .line 121
    .line 122
    or-int/lit16 v3, v3, 0x6000

    .line 123
    .line 124
    :cond_c
    move-object/from16 v12, p4

    .line 125
    .line 126
    goto :goto_9

    .line 127
    :cond_d
    and-int/lit16 v12, v6, 0x6000

    .line 128
    .line 129
    if-nez v12, :cond_c

    .line 130
    .line 131
    move-object/from16 v12, p4

    .line 132
    .line 133
    invoke-interface {v2, v12}, LY/m;->F(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-eqz v13, :cond_e

    .line 138
    .line 139
    const/16 v13, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_e
    const/16 v13, 0x2000

    .line 143
    .line 144
    :goto_8
    or-int/2addr v3, v13

    .line 145
    :goto_9
    and-int/lit16 v13, v3, 0x2493

    .line 146
    .line 147
    const/16 v14, 0x2492

    .line 148
    .line 149
    const/4 v15, 0x0

    .line 150
    if-eq v13, v14, :cond_f

    .line 151
    .line 152
    const/4 v13, 0x1

    .line 153
    goto :goto_a

    .line 154
    :cond_f
    move v13, v15

    .line 155
    :goto_a
    and-int/lit8 v14, v3, 0x1

    .line 156
    .line 157
    invoke-interface {v2, v13, v14}, LY/m;->p(ZI)Z

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    if-eqz v13, :cond_1b

    .line 162
    .line 163
    if-eqz v4, :cond_10

    .line 164
    .line 165
    sget-object v4, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 166
    .line 167
    goto :goto_b

    .line 168
    :cond_10
    move-object v4, v5

    .line 169
    :goto_b
    if-eqz v7, :cond_11

    .line 170
    .line 171
    const/4 v5, 0x0

    .line 172
    move-object v8, v5

    .line 173
    :cond_11
    if-eqz v9, :cond_12

    .line 174
    .line 175
    sget-object v5, Landroidx/compose/ui/viewinterop/e;->a:Lkotlin/jvm/functions/Function1;

    .line 176
    .line 177
    move-object v10, v5

    .line 178
    :cond_12
    if-eqz v11, :cond_13

    .line 179
    .line 180
    sget-object v5, Landroidx/compose/ui/viewinterop/e;->a:Lkotlin/jvm/functions/Function1;

    .line 181
    .line 182
    move-object v12, v5

    .line 183
    :cond_13
    invoke-static {}, LY/w;->L()Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-eqz v5, :cond_14

    .line 188
    .line 189
    const/4 v5, -0x1

    .line 190
    const-string v7, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)"

    .line 191
    .line 192
    invoke-static {v0, v3, v5, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_14
    invoke-static {v2, v15}, LY/h;->b(LY/m;I)J

    .line 196
    .line 197
    .line 198
    move-result-wide v13

    .line 199
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 200
    .line 201
    .line 202
    move-result v17

    .line 203
    invoke-static {v4}, Landroidx/compose/ui/viewinterop/f;->e(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v2, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 208
    .line 209
    .line 210
    move-result-object v16

    .line 211
    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-interface {v2, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    move-object/from16 v18, v0

    .line 220
    .line 221
    check-cast v18, Li1/d;

    .line 222
    .line 223
    invoke-static {}, Landroidx/compose/ui/platform/w0;->k()LY/b1;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-interface {v2, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    move-object/from16 v21, v0

    .line 232
    .line 233
    check-cast v21, Li1/t;

    .line 234
    .line 235
    invoke-interface {v2}, LY/m;->r()LY/I;

    .line 236
    .line 237
    .line 238
    move-result-object v22

    .line 239
    invoke-static {}, Lj2/c;->c()LY/b1;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-interface {v2, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    move-object/from16 v19, v0

    .line 248
    .line 249
    check-cast v19, Landroidx/lifecycle/r;

    .line 250
    .line 251
    invoke-static {}, LQ3/b;->c()LY/b1;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-interface {v2, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    move-object/from16 v20, v0

    .line 260
    .line 261
    check-cast v20, LP3/i;

    .line 262
    .line 263
    if-eqz v8, :cond_17

    .line 264
    .line 265
    const v0, 0x4e512e78    # 8.7737088E8f

    .line 266
    .line 267
    .line 268
    invoke-interface {v2, v0}, LY/m;->V(I)V

    .line 269
    .line 270
    .line 271
    and-int/lit8 v0, v3, 0xe

    .line 272
    .line 273
    invoke-static {v1, v2, v0}, Landroidx/compose/ui/viewinterop/e;->c(Lkotlin/jvm/functions/Function1;LY/m;I)Lie/a;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-interface {v2}, LY/m;->j()LY/d;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    instance-of v3, v3, LK0/K0;

    .line 282
    .line 283
    if-nez v3, :cond_15

    .line 284
    .line 285
    invoke-static {}, LY/h;->d()V

    .line 286
    .line 287
    .line 288
    :cond_15
    invoke-interface {v2}, LY/m;->I()V

    .line 289
    .line 290
    .line 291
    invoke-interface {v2}, LY/m;->e()Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_16

    .line 296
    .line 297
    invoke-interface {v2, v0}, LY/m;->h(Lie/a;)V

    .line 298
    .line 299
    .line 300
    goto :goto_c

    .line 301
    :cond_16
    invoke-interface {v2}, LY/m;->s()V

    .line 302
    .line 303
    .line 304
    :goto_c
    invoke-static {v2}, LY/m2;->b(LY/m;)LY/m;

    .line 305
    .line 306
    .line 307
    move-result-object v15

    .line 308
    invoke-static/range {v15 .. v22}, Landroidx/compose/ui/viewinterop/e;->f(LY/m;Landroidx/compose/ui/e;ILi1/d;Landroidx/lifecycle/r;LP3/i;Li1/t;LY/I;)V

    .line 309
    .line 310
    .line 311
    sget-object v0, Landroidx/compose/ui/viewinterop/e$a;->a:Landroidx/compose/ui/viewinterop/e$a;

    .line 312
    .line 313
    invoke-static {v15, v8, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 314
    .line 315
    .line 316
    sget-object v0, Landroidx/compose/ui/viewinterop/e$b;->a:Landroidx/compose/ui/viewinterop/e$b;

    .line 317
    .line 318
    invoke-static {v15, v12, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 319
    .line 320
    .line 321
    sget-object v0, Landroidx/compose/ui/viewinterop/e$c;->a:Landroidx/compose/ui/viewinterop/e$c;

    .line 322
    .line 323
    invoke-static {v15, v10, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v2}, LY/m;->x()V

    .line 327
    .line 328
    .line 329
    invoke-interface {v2}, LY/m;->O()V

    .line 330
    .line 331
    .line 332
    goto :goto_e

    .line 333
    :cond_17
    const v0, 0x4e5e438f    # 9.3224237E8f

    .line 334
    .line 335
    .line 336
    invoke-interface {v2, v0}, LY/m;->V(I)V

    .line 337
    .line 338
    .line 339
    and-int/lit8 v0, v3, 0xe

    .line 340
    .line 341
    invoke-static {v1, v2, v0}, Landroidx/compose/ui/viewinterop/e;->c(Lkotlin/jvm/functions/Function1;LY/m;I)Lie/a;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-interface {v2}, LY/m;->j()LY/d;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    instance-of v3, v3, LK0/K0;

    .line 350
    .line 351
    if-nez v3, :cond_18

    .line 352
    .line 353
    invoke-static {}, LY/h;->d()V

    .line 354
    .line 355
    .line 356
    :cond_18
    invoke-interface {v2}, LY/m;->l()V

    .line 357
    .line 358
    .line 359
    invoke-interface {v2}, LY/m;->e()Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-eqz v3, :cond_19

    .line 364
    .line 365
    invoke-interface {v2, v0}, LY/m;->h(Lie/a;)V

    .line 366
    .line 367
    .line 368
    goto :goto_d

    .line 369
    :cond_19
    invoke-interface {v2}, LY/m;->s()V

    .line 370
    .line 371
    .line 372
    :goto_d
    invoke-static {v2}, LY/m2;->b(LY/m;)LY/m;

    .line 373
    .line 374
    .line 375
    move-result-object v15

    .line 376
    invoke-static/range {v15 .. v22}, Landroidx/compose/ui/viewinterop/e;->f(LY/m;Landroidx/compose/ui/e;ILi1/d;Landroidx/lifecycle/r;LP3/i;Li1/t;LY/I;)V

    .line 377
    .line 378
    .line 379
    sget-object v0, Landroidx/compose/ui/viewinterop/e$d;->a:Landroidx/compose/ui/viewinterop/e$d;

    .line 380
    .line 381
    invoke-static {v15, v12, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 382
    .line 383
    .line 384
    sget-object v0, Landroidx/compose/ui/viewinterop/e$e;->a:Landroidx/compose/ui/viewinterop/e$e;

    .line 385
    .line 386
    invoke-static {v15, v10, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {v2}, LY/m;->x()V

    .line 390
    .line 391
    .line 392
    invoke-interface {v2}, LY/m;->O()V

    .line 393
    .line 394
    .line 395
    :goto_e
    invoke-static {}, LY/w;->L()Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-eqz v0, :cond_1a

    .line 400
    .line 401
    invoke-static {}, LY/w;->T()V

    .line 402
    .line 403
    .line 404
    :cond_1a
    :goto_f
    move-object v3, v8

    .line 405
    move-object v5, v12

    .line 406
    goto :goto_10

    .line 407
    :cond_1b
    invoke-interface {v2}, LY/m;->K()V

    .line 408
    .line 409
    .line 410
    move-object v4, v5

    .line 411
    goto :goto_f

    .line 412
    :goto_10
    invoke-interface {v2}, LY/m;->k()LY/B1;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    if-eqz v8, :cond_1c

    .line 417
    .line 418
    new-instance v0, Landroidx/compose/ui/viewinterop/e$f;

    .line 419
    .line 420
    move/from16 v7, p7

    .line 421
    .line 422
    move-object v2, v4

    .line 423
    move-object v4, v10

    .line 424
    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/viewinterop/e$f;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    .line 425
    .line 426
    .line 427
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 428
    .line 429
    .line 430
    :cond_1c
    return-void
.end method

.method public static final synthetic b(LK0/J;)Landroidx/compose/ui/viewinterop/i;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/e;->e(LK0/J;)Landroidx/compose/ui/viewinterop/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Lkotlin/jvm/functions/Function1;LY/m;I)Lie/a;
    .locals 10

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
    const-string v1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)"

    .line 9
    .line 10
    const v2, 0x7907de51

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-static {p1, v0}, LY/h;->b(LY/m;I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LY/b1;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {p1, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    move-object v4, v1

    .line 34
    check-cast v4, Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {p1, v0}, LY/h;->e(LY/m;I)LY/y;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-static {}, Lh0/s;->g()LY/b1;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {p1, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v7, v1

    .line 49
    check-cast v7, Lh0/p;

    .line 50
    .line 51
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->k()LY/b1;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {p1, v1}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v9, v1

    .line 60
    check-cast v9, Landroid/view/View;

    .line 61
    .line 62
    invoke-interface {p1, v4}, LY/m;->F(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    and-int/lit8 v2, p2, 0xe

    .line 67
    .line 68
    xor-int/lit8 v2, v2, 0x6

    .line 69
    .line 70
    const/4 v3, 0x4

    .line 71
    if-le v2, v3, :cond_1

    .line 72
    .line 73
    invoke-interface {p1, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    :cond_1
    and-int/lit8 p2, p2, 0x6

    .line 80
    .line 81
    if-ne p2, v3, :cond_3

    .line 82
    .line 83
    :cond_2
    const/4 v0, 0x1

    .line 84
    :cond_3
    or-int p2, v1, v0

    .line 85
    .line 86
    invoke-interface {p1, v6}, LY/m;->F(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    or-int/2addr p2, v0

    .line 91
    invoke-interface {p1, v7}, LY/m;->F(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    or-int/2addr p2, v0

    .line 96
    invoke-interface {p1, v8}, LY/m;->c(I)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    or-int/2addr p2, v0

    .line 101
    invoke-interface {p1, v9}, LY/m;->F(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    or-int/2addr p2, v0

    .line 106
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-nez p2, :cond_4

    .line 111
    .line 112
    sget-object p2, LY/m;->a:LY/m$a;

    .line 113
    .line 114
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    if-ne v0, p2, :cond_5

    .line 119
    .line 120
    :cond_4
    new-instance v3, Landroidx/compose/ui/viewinterop/e$h;

    .line 121
    .line 122
    move-object v5, p0

    .line 123
    invoke-direct/range {v3 .. v9}, Landroidx/compose/ui/viewinterop/e$h;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;LY/y;Lh0/p;ILandroid/view/View;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    move-object v0, v3

    .line 130
    :cond_5
    check-cast v0, Lie/a;

    .line 131
    .line 132
    invoke-static {}, LY/w;->L()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_6

    .line 137
    .line 138
    invoke-static {}, LY/w;->T()V

    .line 139
    .line 140
    .line 141
    :cond_6
    return-object v0
.end method

.method public static final d()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/viewinterop/e;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final e(LK0/J;)Landroidx/compose/ui/viewinterop/i;
    .locals 0

    .line 1
    invoke-virtual {p0}, LK0/J;->a0()Landroidx/compose/ui/viewinterop/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    check-cast p0, Landroidx/compose/ui/viewinterop/i;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "Required value was null."

    .line 11
    .line 12
    invoke-static {p0}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 13
    .line 14
    .line 15
    new-instance p0, LTd/k;

    .line 16
    .line 17
    invoke-direct {p0}, LTd/k;-><init>()V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private static final f(LY/m;Landroidx/compose/ui/e;ILi1/d;Landroidx/lifecycle/r;LP3/i;Li1/t;LY/I;)V
    .locals 2

    .line 1
    sget-object v0, LK0/g;->M:LK0/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p0, p7, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 8
    .line 9
    .line 10
    sget-object p7, Landroidx/compose/ui/viewinterop/e$i;->a:Landroidx/compose/ui/viewinterop/e$i;

    .line 11
    .line 12
    invoke-static {p0, p1, p7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Landroidx/compose/ui/viewinterop/e$j;->a:Landroidx/compose/ui/viewinterop/e$j;

    .line 16
    .line 17
    invoke-static {p0, p3, p1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Landroidx/compose/ui/viewinterop/e$k;->a:Landroidx/compose/ui/viewinterop/e$k;

    .line 21
    .line 22
    invoke-static {p0, p4, p1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Landroidx/compose/ui/viewinterop/e$l;->a:Landroidx/compose/ui/viewinterop/e$l;

    .line 26
    .line 27
    invoke-static {p0, p5, p1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Landroidx/compose/ui/viewinterop/e$m;->a:Landroidx/compose/ui/viewinterop/e$m;

    .line 31
    .line 32
    invoke-static {p0, p6, p1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p0}, LY/m;->e()Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-nez p3, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, LY/m;->D()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-nez p3, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-void

    .line 61
    :cond_1
    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-interface {p0, p3}, LY/m;->u(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p0, p2, p1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
