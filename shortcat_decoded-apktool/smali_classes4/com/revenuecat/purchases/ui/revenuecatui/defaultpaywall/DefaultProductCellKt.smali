.class public final Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultProductCellKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aJ\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0011\u00b2\u0006\u000c\u0010\u000f\u001a\u00020\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0010\u001a\u00020\u00028\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/Package;",
        "pkg",
        "Ls0/r0;",
        "accentColor",
        "selectedFontColor",
        "",
        "isSelected",
        "Lkotlin/Function0;",
        "LTd/L;",
        "onSelect",
        "Landroidx/compose/ui/e;",
        "modifier",
        "DefaultProductCell-qi6gXK8",
        "(Lcom/revenuecat/purchases/Package;JJZLie/a;Landroidx/compose/ui/e;LY/m;II)V",
        "DefaultProductCell",
        "backgroundColor",
        "contentColor",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final DefaultProductCell-qi6gXK8(Lcom/revenuecat/purchases/Package;JJZLie/a;Landroidx/compose/ui/e;LY/m;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/Package;",
            "JJZ",
            "Lie/a;",
            "Landroidx/compose/ui/e;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p5

    .line 4
    .line 5
    move-object/from16 v7, p6

    .line 6
    .line 7
    move/from16 v9, p9

    .line 8
    .line 9
    const-string v0, "pkg"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "onSelect"

    .line 15
    .line 16
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, -0x51a624c1

    .line 20
    .line 21
    .line 22
    move-object/from16 v2, p8

    .line 23
    .line 24
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 25
    .line 26
    .line 27
    move-result-object v15

    .line 28
    and-int/lit8 v2, p10, 0x1

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    or-int/lit8 v2, v9, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v2, v9, 0x6

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    invoke-interface {v15, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v2, 0x2

    .line 48
    :goto_0
    or-int/2addr v2, v9

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v2, v9

    .line 51
    :goto_1
    and-int/lit8 v3, p10, 0x2

    .line 52
    .line 53
    const/16 v4, 0x10

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    or-int/lit8 v2, v2, 0x30

    .line 58
    .line 59
    move-wide/from16 v10, p1

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    and-int/lit8 v3, v9, 0x30

    .line 63
    .line 64
    move-wide/from16 v10, p1

    .line 65
    .line 66
    if-nez v3, :cond_5

    .line 67
    .line 68
    invoke-interface {v15, v10, v11}, LY/m;->d(J)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    const/16 v3, 0x20

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move v3, v4

    .line 78
    :goto_2
    or-int/2addr v2, v3

    .line 79
    :cond_5
    :goto_3
    and-int/lit8 v3, p10, 0x4

    .line 80
    .line 81
    if-eqz v3, :cond_6

    .line 82
    .line 83
    or-int/lit16 v2, v2, 0x180

    .line 84
    .line 85
    move-wide/from16 v12, p3

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_6
    and-int/lit16 v3, v9, 0x180

    .line 89
    .line 90
    move-wide/from16 v12, p3

    .line 91
    .line 92
    if-nez v3, :cond_8

    .line 93
    .line 94
    invoke-interface {v15, v12, v13}, LY/m;->d(J)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_7

    .line 99
    .line 100
    const/16 v3, 0x100

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_7
    const/16 v3, 0x80

    .line 104
    .line 105
    :goto_4
    or-int/2addr v2, v3

    .line 106
    :cond_8
    :goto_5
    and-int/lit8 v3, p10, 0x8

    .line 107
    .line 108
    if-eqz v3, :cond_9

    .line 109
    .line 110
    or-int/lit16 v2, v2, 0xc00

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_9
    and-int/lit16 v3, v9, 0xc00

    .line 114
    .line 115
    if-nez v3, :cond_b

    .line 116
    .line 117
    invoke-interface {v15, v6}, LY/m;->a(Z)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_a

    .line 122
    .line 123
    const/16 v3, 0x800

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_a
    const/16 v3, 0x400

    .line 127
    .line 128
    :goto_6
    or-int/2addr v2, v3

    .line 129
    :cond_b
    :goto_7
    and-int/lit8 v3, p10, 0x10

    .line 130
    .line 131
    if-eqz v3, :cond_c

    .line 132
    .line 133
    or-int/lit16 v2, v2, 0x6000

    .line 134
    .line 135
    goto :goto_9

    .line 136
    :cond_c
    and-int/lit16 v3, v9, 0x6000

    .line 137
    .line 138
    if-nez v3, :cond_e

    .line 139
    .line 140
    invoke-interface {v15, v7}, LY/m;->F(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_d

    .line 145
    .line 146
    const/16 v3, 0x4000

    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_d
    const/16 v3, 0x2000

    .line 150
    .line 151
    :goto_8
    or-int/2addr v2, v3

    .line 152
    :cond_e
    :goto_9
    and-int/lit8 v3, p10, 0x20

    .line 153
    .line 154
    const/high16 v5, 0x30000

    .line 155
    .line 156
    if-eqz v3, :cond_10

    .line 157
    .line 158
    or-int/2addr v2, v5

    .line 159
    :cond_f
    move-object/from16 v5, p7

    .line 160
    .line 161
    goto :goto_b

    .line 162
    :cond_10
    and-int/2addr v5, v9

    .line 163
    if-nez v5, :cond_f

    .line 164
    .line 165
    move-object/from16 v5, p7

    .line 166
    .line 167
    invoke-interface {v15, v5}, LY/m;->U(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-eqz v8, :cond_11

    .line 172
    .line 173
    const/high16 v8, 0x20000

    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_11
    const/high16 v8, 0x10000

    .line 177
    .line 178
    :goto_a
    or-int/2addr v2, v8

    .line 179
    :goto_b
    const v8, 0x12493

    .line 180
    .line 181
    .line 182
    and-int/2addr v8, v2

    .line 183
    const v14, 0x12492

    .line 184
    .line 185
    .line 186
    if-ne v8, v14, :cond_13

    .line 187
    .line 188
    invoke-interface {v15}, LY/m;->i()Z

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-nez v8, :cond_12

    .line 193
    .line 194
    goto :goto_c

    .line 195
    :cond_12
    invoke-interface {v15}, LY/m;->K()V

    .line 196
    .line 197
    .line 198
    move-object v8, v5

    .line 199
    goto/16 :goto_15

    .line 200
    .line 201
    :cond_13
    :goto_c
    if-eqz v3, :cond_14

    .line 202
    .line 203
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 204
    .line 205
    goto :goto_d

    .line 206
    :cond_14
    move-object v3, v5

    .line 207
    :goto_d
    invoke-static {}, LY/w;->L()Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_15

    .line 212
    .line 213
    const/4 v5, -0x1

    .line 214
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultProductCell (DefaultProductCell.kt:39)"

    .line 215
    .line 216
    invoke-static {v0, v2, v5, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    :cond_15
    const v0, -0xe6c3760

    .line 220
    .line 221
    .line 222
    invoke-interface {v15, v0}, LY/m;->V(I)V

    .line 223
    .line 224
    .line 225
    if-eqz v6, :cond_16

    .line 226
    .line 227
    move-wide/from16 v16, v10

    .line 228
    .line 229
    goto :goto_e

    .line 230
    :cond_16
    sget-object v0, LU/D;->a:LU/D;

    .line 231
    .line 232
    sget v2, LU/D;->b:I

    .line 233
    .line 234
    invoke-virtual {v0, v15, v2}, LU/D;->a(LY/m;I)LU/l;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, LU/l;->Q()J

    .line 239
    .line 240
    .line 241
    move-result-wide v16

    .line 242
    const/16 v22, 0xe

    .line 243
    .line 244
    const/16 v23, 0x0

    .line 245
    .line 246
    const/high16 v18, 0x3f000000    # 0.5f

    .line 247
    .line 248
    const/16 v19, 0x0

    .line 249
    .line 250
    const/16 v20, 0x0

    .line 251
    .line 252
    const/16 v21, 0x0

    .line 253
    .line 254
    invoke-static/range {v16 .. v23}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 255
    .line 256
    .line 257
    move-result-wide v16

    .line 258
    :goto_e
    invoke-interface {v15}, LY/m;->O()V

    .line 259
    .line 260
    .line 261
    move-wide/from16 v10, v16

    .line 262
    .line 263
    const/16 v16, 0x180

    .line 264
    .line 265
    const/16 v17, 0xa

    .line 266
    .line 267
    const/4 v12, 0x0

    .line 268
    const-string v13, "productCellBackground"

    .line 269
    .line 270
    const/4 v14, 0x0

    .line 271
    invoke-static/range {v10 .. v17}, Lv/v;->a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const v2, -0xe6c1d72

    .line 276
    .line 277
    .line 278
    invoke-interface {v15, v2}, LY/m;->V(I)V

    .line 279
    .line 280
    .line 281
    if-eqz v6, :cond_17

    .line 282
    .line 283
    move-wide/from16 v10, p3

    .line 284
    .line 285
    goto :goto_f

    .line 286
    :cond_17
    sget-object v2, LU/D;->a:LU/D;

    .line 287
    .line 288
    sget v5, LU/D;->b:I

    .line 289
    .line 290
    invoke-virtual {v2, v15, v5}, LU/D;->a(LY/m;I)LU/l;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v2}, LU/l;->w()J

    .line 295
    .line 296
    .line 297
    move-result-wide v12

    .line 298
    move-wide v10, v12

    .line 299
    :goto_f
    invoke-interface {v15}, LY/m;->O()V

    .line 300
    .line 301
    .line 302
    const/16 v16, 0x180

    .line 303
    .line 304
    const/16 v17, 0xa

    .line 305
    .line 306
    const/4 v12, 0x0

    .line 307
    const-string v13, "productCellContent"

    .line 308
    .line 309
    const/4 v14, 0x0

    .line 310
    invoke-static/range {v10 .. v17}, Lv/v;->a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 311
    .line 312
    .line 313
    move-result-object v35

    .line 314
    const/16 v2, 0x230

    .line 315
    .line 316
    int-to-float v2, v2

    .line 317
    invoke-static {v2}, Li1/h;->n(F)F

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    const/4 v5, 0x0

    .line 322
    const/4 v8, 0x1

    .line 323
    const/4 v10, 0x0

    .line 324
    invoke-static {v3, v5, v2, v8, v10}, Landroidx/compose/foundation/layout/s;->x(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-static {v2, v5, v8, v10}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    const/16 v5, 0x12

    .line 333
    .line 334
    int-to-float v5, v5

    .line 335
    invoke-static {v5}, Li1/h;->n(F)F

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    invoke-static {v5}, LJ/i;->d(F)LJ/h;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-static {v2, v5}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 344
    .line 345
    .line 346
    move-result-object v16

    .line 347
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultProductCellKt;->DefaultProductCell_qi6gXK8$lambda$0(LY/h2;)J

    .line 348
    .line 349
    .line 350
    move-result-wide v17

    .line 351
    const/16 v20, 0x2

    .line 352
    .line 353
    const/16 v21, 0x0

    .line 354
    .line 355
    const/16 v19, 0x0

    .line 356
    .line 357
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    sget-object v0, LR0/h;->b:LR0/h$a;

    .line 362
    .line 363
    invoke-virtual {v0}, LR0/h$a;->f()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    invoke-static {v0}, LR0/h;->j(I)LR0/h;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    const/4 v7, 0x2

    .line 372
    const/4 v8, 0x0

    .line 373
    move v0, v4

    .line 374
    const/4 v4, 0x0

    .line 375
    move v10, v0

    .line 376
    move-object v0, v3

    .line 377
    move v3, v6

    .line 378
    move-object/from16 v6, p6

    .line 379
    .line 380
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/selection/a;->c(Landroidx/compose/ui/e;ZZLR0/h;Lie/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/TestTag;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/TestTag;

    .line 385
    .line 386
    invoke-virtual {v1}, Lcom/revenuecat/purchases/Package;->getIdentifier()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    invoke-virtual {v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/TestTag;->selectButtonTestTag(Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-static {v2, v3}, Landroidx/compose/ui/platform/q1;->a(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    int-to-float v3, v10

    .line 399
    invoke-static {v3}, Li1/h;->n(F)F

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/p;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    .line 408
    .line 409
    invoke-virtual {v3}, Ll0/e$a;->i()Ll0/e$c;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    sget-object v4, LC/b;->a:LC/b;

    .line 414
    .line 415
    const/16 v5, 0xc

    .line 416
    .line 417
    int-to-float v5, v5

    .line 418
    invoke-static {v5}, Li1/h;->n(F)F

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    invoke-virtual {v4, v5}, LC/b;->o(F)LC/b$f;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    const/16 v5, 0x36

    .line 427
    .line 428
    invoke-static {v4, v3, v15, v5}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    const/4 v4, 0x0

    .line 433
    invoke-static {v15, v4}, LY/h;->a(LY/m;I)I

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    invoke-interface {v15}, LY/m;->r()LY/I;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    invoke-static {v15, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    sget-object v6, LK0/g;->M:LK0/g$a;

    .line 446
    .line 447
    invoke-virtual {v6}, LK0/g$a;->a()Lie/a;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    invoke-interface {v15}, LY/m;->j()LY/d;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    if-nez v8, :cond_18

    .line 456
    .line 457
    invoke-static {}, LY/h;->d()V

    .line 458
    .line 459
    .line 460
    :cond_18
    invoke-interface {v15}, LY/m;->I()V

    .line 461
    .line 462
    .line 463
    invoke-interface {v15}, LY/m;->e()Z

    .line 464
    .line 465
    .line 466
    move-result v8

    .line 467
    if-eqz v8, :cond_19

    .line 468
    .line 469
    invoke-interface {v15, v7}, LY/m;->h(Lie/a;)V

    .line 470
    .line 471
    .line 472
    goto :goto_10

    .line 473
    :cond_19
    invoke-interface {v15}, LY/m;->s()V

    .line 474
    .line 475
    .line 476
    :goto_10
    invoke-static {v15}, LY/m2;->b(LY/m;)LY/m;

    .line 477
    .line 478
    .line 479
    move-result-object v7

    .line 480
    invoke-virtual {v6}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    invoke-static {v7, v3, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v6}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    invoke-static {v7, v5, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v6}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    invoke-interface {v7}, LY/m;->e()Z

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    if-nez v5, :cond_1a

    .line 503
    .line 504
    invoke-interface {v7}, LY/m;->D()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    if-nez v5, :cond_1b

    .line 517
    .line 518
    :cond_1a
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-interface {v7, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-interface {v7, v4, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 530
    .line 531
    .line 532
    :cond_1b
    invoke-virtual {v6}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    invoke-static {v7, v2, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 537
    .line 538
    .line 539
    sget-object v2, LC/J;->a:LC/J;

    .line 540
    .line 541
    if-eqz p5, :cond_1c

    .line 542
    .line 543
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CheckCircleKt;->getCheckCircle()Lx0/d;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    :goto_11
    move-object v10, v3

    .line 548
    goto :goto_12

    .line 549
    :cond_1c
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/icons/CircleOutlinedKt;->getCircleOutlined()Lx0/d;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    goto :goto_11

    .line 554
    :goto_12
    invoke-static/range {v35 .. v35}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultProductCellKt;->DefaultProductCell_qi6gXK8$lambda$1(LY/h2;)J

    .line 555
    .line 556
    .line 557
    move-result-wide v16

    .line 558
    if-eqz p5, :cond_1d

    .line 559
    .line 560
    const/high16 v3, 0x3f800000    # 1.0f

    .line 561
    .line 562
    :goto_13
    move/from16 v18, v3

    .line 563
    .line 564
    goto :goto_14

    .line 565
    :cond_1d
    const/high16 v3, 0x3f000000    # 0.5f

    .line 566
    .line 567
    goto :goto_13

    .line 568
    :goto_14
    const/16 v22, 0xe

    .line 569
    .line 570
    const/16 v23, 0x0

    .line 571
    .line 572
    const/16 v19, 0x0

    .line 573
    .line 574
    const/16 v20, 0x0

    .line 575
    .line 576
    const/16 v21, 0x0

    .line 577
    .line 578
    invoke-static/range {v16 .. v23}, Ls0/r0;->q(JFFFFILjava/lang/Object;)J

    .line 579
    .line 580
    .line 581
    move-result-wide v13

    .line 582
    const/16 v16, 0x30

    .line 583
    .line 584
    const/16 v17, 0x4

    .line 585
    .line 586
    const/4 v11, 0x0

    .line 587
    const/4 v12, 0x0

    .line 588
    invoke-static/range {v10 .. v17}, LU/B;->b(Lx0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLY/m;II)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    invoke-interface {v3}, Lcom/revenuecat/purchases/models/StoreProduct;->getName()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v10

    .line 599
    sget-object v3, LU/D;->a:LU/D;

    .line 600
    .line 601
    sget v4, LU/D;->b:I

    .line 602
    .line 603
    invoke-virtual {v3, v15, v4}, LU/D;->c(LY/m;I)LU/o0;

    .line 604
    .line 605
    .line 606
    move-result-object v5

    .line 607
    invoke-virtual {v5}, LU/o0;->o()LU0/Y0;

    .line 608
    .line 609
    .line 610
    move-result-object v30

    .line 611
    sget-object v5, LY0/L;->b:LY0/L$a;

    .line 612
    .line 613
    invoke-virtual {v5}, LY0/L$a;->h()LY0/L;

    .line 614
    .line 615
    .line 616
    move-result-object v5

    .line 617
    invoke-static/range {v35 .. v35}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultProductCellKt;->DefaultProductCell_qi6gXK8$lambda$1(LY/h2;)J

    .line 618
    .line 619
    .line 620
    move-result-wide v12

    .line 621
    sget-object v6, Lg1/v;->a:Lg1/v$a;

    .line 622
    .line 623
    invoke-virtual {v6}, Lg1/v$a;->b()I

    .line 624
    .line 625
    .line 626
    move-result v25

    .line 627
    sget-object v17, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 628
    .line 629
    const/16 v20, 0x2

    .line 630
    .line 631
    const/16 v21, 0x0

    .line 632
    .line 633
    const/high16 v18, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/16 v19, 0x0

    .line 636
    .line 637
    move-object/from16 v16, v2

    .line 638
    .line 639
    invoke-static/range {v16 .. v21}, LC/I;->b(LC/I;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    const/16 v33, 0xc30

    .line 644
    .line 645
    const v34, 0xd7d8

    .line 646
    .line 647
    .line 648
    move-object/from16 v31, v15

    .line 649
    .line 650
    const-wide/16 v14, 0x0

    .line 651
    .line 652
    const/16 v16, 0x0

    .line 653
    .line 654
    const/16 v18, 0x0

    .line 655
    .line 656
    const-wide/16 v19, 0x0

    .line 657
    .line 658
    const/16 v22, 0x0

    .line 659
    .line 660
    const-wide/16 v23, 0x0

    .line 661
    .line 662
    const/16 v26, 0x0

    .line 663
    .line 664
    const/16 v27, 0x1

    .line 665
    .line 666
    const/16 v28, 0x0

    .line 667
    .line 668
    const/16 v29, 0x0

    .line 669
    .line 670
    const/high16 v32, 0x30000

    .line 671
    .line 672
    move-object/from16 v17, v5

    .line 673
    .line 674
    invoke-static/range {v10 .. v34}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 675
    .line 676
    .line 677
    move-object/from16 v15, v31

    .line 678
    .line 679
    invoke-virtual {v1}, Lcom/revenuecat/purchases/Package;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    invoke-interface {v2}, Lcom/revenuecat/purchases/models/StoreProduct;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/Price;->getFormatted()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v10

    .line 691
    invoke-virtual {v3, v15, v4}, LU/D;->c(LY/m;I)LU/o0;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    invoke-virtual {v2}, LU/o0;->c()LU0/Y0;

    .line 696
    .line 697
    .line 698
    move-result-object v30

    .line 699
    invoke-static/range {v35 .. v35}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultProductCellKt;->DefaultProductCell_qi6gXK8$lambda$1(LY/h2;)J

    .line 700
    .line 701
    .line 702
    move-result-wide v12

    .line 703
    const/16 v33, 0x0

    .line 704
    .line 705
    const v34, 0xfffa

    .line 706
    .line 707
    .line 708
    const/4 v11, 0x0

    .line 709
    const-wide/16 v14, 0x0

    .line 710
    .line 711
    const/16 v17, 0x0

    .line 712
    .line 713
    const/16 v25, 0x0

    .line 714
    .line 715
    const/16 v27, 0x0

    .line 716
    .line 717
    const/16 v32, 0x0

    .line 718
    .line 719
    invoke-static/range {v10 .. v34}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 720
    .line 721
    .line 722
    move-object/from16 v15, v31

    .line 723
    .line 724
    invoke-interface {v15}, LY/m;->x()V

    .line 725
    .line 726
    .line 727
    invoke-static {}, LY/w;->L()Z

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-eqz v2, :cond_1e

    .line 732
    .line 733
    invoke-static {}, LY/w;->T()V

    .line 734
    .line 735
    .line 736
    :cond_1e
    move-object v8, v0

    .line 737
    :goto_15
    invoke-interface {v15}, LY/m;->k()LY/B1;

    .line 738
    .line 739
    .line 740
    move-result-object v11

    .line 741
    if-eqz v11, :cond_1f

    .line 742
    .line 743
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultProductCellKt$DefaultProductCell$2;

    .line 744
    .line 745
    move-wide/from16 v2, p1

    .line 746
    .line 747
    move-wide/from16 v4, p3

    .line 748
    .line 749
    move/from16 v6, p5

    .line 750
    .line 751
    move-object/from16 v7, p6

    .line 752
    .line 753
    move/from16 v10, p10

    .line 754
    .line 755
    invoke-direct/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultProductCellKt$DefaultProductCell$2;-><init>(Lcom/revenuecat/purchases/Package;JJZLie/a;Landroidx/compose/ui/e;II)V

    .line 756
    .line 757
    .line 758
    invoke-interface {v11, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 759
    .line 760
    .line 761
    :cond_1f
    return-void
.end method

.method private static final DefaultProductCell_qi6gXK8$lambda$0(LY/h2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ls0/r0;->A()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method private static final DefaultProductCell_qi6gXK8$lambda$1(LY/h2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls0/r0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ls0/r0;->A()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method
