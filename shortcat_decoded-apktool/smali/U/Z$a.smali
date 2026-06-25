.class final LU/Z$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/Z;->a(LU/W;Landroidx/compose/ui/e;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/W;

.field final synthetic b:LU/W;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:LU/x;


# direct methods
.method constructor <init>(LU/W;LU/W;Ljava/util/List;LU/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/Z$a;->a:LU/W;

    .line 2
    .line 3
    iput-object p2, p0, LU/Z$a;->b:LU/W;

    .line 4
    .line 5
    iput-object p3, p0, LU/Z$a;->c:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, LU/Z$a;->d:LU/x;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function2;LY/m;I)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    and-int/lit8 v2, p3, 0x6

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    invoke-interface {v5, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x2

    .line 20
    :goto_0
    or-int v2, p3, v2

    .line 21
    .line 22
    move v8, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move/from16 v8, p3

    .line 25
    .line 26
    :goto_1
    and-int/lit8 v2, v8, 0x13

    .line 27
    .line 28
    const/16 v3, 0x12

    .line 29
    .line 30
    if-ne v2, v3, :cond_3

    .line 31
    .line 32
    invoke-interface {v5}, LY/m;->i()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    invoke-interface {v5}, LY/m;->K()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    const/4 v2, -0x1

    .line 50
    const-string v3, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)"

    .line 51
    .line 52
    const v4, -0x62a075c5

    .line 53
    .line 54
    .line 55
    invoke-static {v4, v8, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    iget-object v2, v0, LU/Z$a;->a:LU/W;

    .line 59
    .line 60
    iget-object v3, v0, LU/Z$a;->b:LU/W;

    .line 61
    .line 62
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/16 v2, 0x4b

    .line 67
    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    const/16 v4, 0x96

    .line 71
    .line 72
    move v9, v4

    .line 73
    goto :goto_3

    .line 74
    :cond_5
    move v9, v2

    .line 75
    :goto_3
    const/4 v10, 0x1

    .line 76
    const/4 v11, 0x0

    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    iget-object v4, v0, LU/Z$a;->c:Ljava/util/List;

    .line 80
    .line 81
    invoke-static {v4}, Lk1/a;->b(Ljava/util/List;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eq v4, v10, :cond_6

    .line 90
    .line 91
    move v12, v2

    .line 92
    goto :goto_4

    .line 93
    :cond_6
    move v12, v11

    .line 94
    :goto_4
    invoke-static {}, Lw/F;->e()Lw/D;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v9, v12, v2}, Lw/j;->i(IILw/D;)Lw/r0;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iget-object v4, v0, LU/Z$a;->a:LU/W;

    .line 103
    .line 104
    invoke-interface {v5, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    iget-object v6, v0, LU/Z$a;->d:LU/x;

    .line 109
    .line 110
    invoke-interface {v5, v6}, LY/m;->F(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    or-int/2addr v4, v6

    .line 115
    iget-object v6, v0, LU/Z$a;->a:LU/W;

    .line 116
    .line 117
    iget-object v7, v0, LU/Z$a;->d:LU/x;

    .line 118
    .line 119
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    if-nez v4, :cond_7

    .line 124
    .line 125
    sget-object v4, LY/m;->a:LY/m$a;

    .line 126
    .line 127
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    if-ne v13, v4, :cond_8

    .line 132
    .line 133
    :cond_7
    new-instance v13, LU/Z$a$b;

    .line 134
    .line 135
    invoke-direct {v13, v6, v7}, LU/Z$a$b;-><init>(LU/W;LU/x;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v5, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_8
    move-object v4, v13

    .line 142
    check-cast v4, Lie/a;

    .line 143
    .line 144
    const/4 v6, 0x0

    .line 145
    const/4 v7, 0x0

    .line 146
    invoke-static/range {v2 .. v7}, LU/Z;->d(Lw/i;ZLie/a;LY/m;II)LY/h2;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-static {}, Lw/F;->d()Lw/D;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v9, v12, v4}, Lw/j;->i(IILw/D;)Lw/r0;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v4, v3, v5, v11}, LU/Z;->e(Lw/i;ZLY/m;I)LY/h2;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    sget-object v12, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 163
    .line 164
    invoke-interface {v3}, LY/h2;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    check-cast v4, Ljava/lang/Number;

    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    invoke-interface {v3}, LY/h2;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    invoke-interface {v2}, LY/h2;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Ljava/lang/Number;

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    const v33, 0x1fff8

    .line 195
    .line 196
    .line 197
    const/16 v34, 0x0

    .line 198
    .line 199
    const/16 v16, 0x0

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    const/16 v18, 0x0

    .line 204
    .line 205
    const/16 v19, 0x0

    .line 206
    .line 207
    const/16 v20, 0x0

    .line 208
    .line 209
    const/16 v21, 0x0

    .line 210
    .line 211
    const/16 v22, 0x0

    .line 212
    .line 213
    const-wide/16 v23, 0x0

    .line 214
    .line 215
    const/16 v25, 0x0

    .line 216
    .line 217
    const/16 v26, 0x0

    .line 218
    .line 219
    const/16 v27, 0x0

    .line 220
    .line 221
    const-wide/16 v28, 0x0

    .line 222
    .line 223
    const-wide/16 v30, 0x0

    .line 224
    .line 225
    const/16 v32, 0x0

    .line 226
    .line 227
    invoke-static/range {v12 .. v34}, Landroidx/compose/ui/graphics/f;->c(Landroidx/compose/ui/e;FFFFFFFFFFJLs0/E1;ZLs0/u1;JJIILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    iget-object v3, v0, LU/Z$a;->a:LU/W;

    .line 232
    .line 233
    invoke-interface {v5, v3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    iget-object v4, v0, LU/Z$a;->a:LU/W;

    .line 238
    .line 239
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    if-nez v3, :cond_9

    .line 244
    .line 245
    sget-object v3, LY/m;->a:LY/m$a;

    .line 246
    .line 247
    invoke-virtual {v3}, LY/m$a;->a()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    if-ne v6, v3, :cond_a

    .line 252
    .line 253
    :cond_9
    new-instance v6, LU/Z$a$a;

    .line 254
    .line 255
    invoke-direct {v6, v4}, LU/Z$a$a;-><init>(LU/W;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v5, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 262
    .line 263
    const/4 v3, 0x0

    .line 264
    invoke-static {v2, v11, v6, v10, v3}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    .line 269
    .line 270
    invoke-virtual {v3}, Ll0/e$a;->o()Ll0/e;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-static {v5, v11}, LY/h;->a(LY/m;I)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-interface {v5}, LY/m;->r()LY/I;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    invoke-static {v5, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    sget-object v7, LK0/g;->M:LK0/g$a;

    .line 291
    .line 292
    invoke-virtual {v7}, LK0/g$a;->a()Lie/a;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    invoke-interface {v5}, LY/m;->j()LY/d;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    if-nez v10, :cond_b

    .line 301
    .line 302
    invoke-static {}, LY/h;->d()V

    .line 303
    .line 304
    .line 305
    :cond_b
    invoke-interface {v5}, LY/m;->I()V

    .line 306
    .line 307
    .line 308
    invoke-interface {v5}, LY/m;->e()Z

    .line 309
    .line 310
    .line 311
    move-result v10

    .line 312
    if-eqz v10, :cond_c

    .line 313
    .line 314
    invoke-interface {v5, v9}, LY/m;->h(Lie/a;)V

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_c
    invoke-interface {v5}, LY/m;->s()V

    .line 319
    .line 320
    .line 321
    :goto_5
    invoke-static {v5}, LY/m2;->b(LY/m;)LY/m;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-virtual {v7}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    invoke-static {v9, v3, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v7}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-static {v9, v6, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v7}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-interface {v9}, LY/m;->e()Z

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    if-nez v6, :cond_d

    .line 348
    .line 349
    invoke-interface {v9}, LY/m;->D()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    if-nez v6, :cond_e

    .line 362
    .line 363
    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    invoke-interface {v9, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-interface {v9, v4, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 375
    .line 376
    .line 377
    :cond_e
    invoke-virtual {v7}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    invoke-static {v9, v2, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 382
    .line 383
    .line 384
    sget-object v2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 385
    .line 386
    and-int/lit8 v2, v8, 0xe

    .line 387
    .line 388
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-interface {v1, v5, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    invoke-interface {v5}, LY/m;->x()V

    .line 396
    .line 397
    .line 398
    invoke-static {}, LY/w;->L()Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_f

    .line 403
    .line 404
    invoke-static {}, LY/w;->T()V

    .line 405
    .line 406
    .line 407
    :cond_f
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    check-cast p2, LY/m;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p0, p1, p2, p3}, LU/Z$a;->a(Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 12
    .line 13
    .line 14
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method
