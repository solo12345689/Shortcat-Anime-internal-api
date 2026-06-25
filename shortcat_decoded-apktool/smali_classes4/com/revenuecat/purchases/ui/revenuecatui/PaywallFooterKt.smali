.class public final Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a9\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a9\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
        "options",
        "",
        "condensed",
        "Lkotlin/Function1;",
        "LC/A;",
        "LTd/L;",
        "mainContent",
        "PaywallFooter",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;ZLie/o;LY/m;II)V",
        "OriginalTemplatePaywallFooter",
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
.method public static final OriginalTemplatePaywallFooter(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;ZLie/o;LY/m;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
            "Z",
            "Lie/o;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p4

    .line 4
    .line 5
    const/4 v0, 0x6

    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v2, "options"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v2, -0x2559f3c3

    .line 16
    .line 17
    .line 18
    move-object/from16 v3, p3

    .line 19
    .line 20
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    and-int/lit8 v5, p5, 0x1

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    or-int/lit8 v5, v4, 0x6

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    and-int/lit8 v5, v4, 0x6

    .line 32
    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    invoke-interface {v3, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    const/4 v5, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v5, 0x2

    .line 44
    :goto_0
    or-int/2addr v5, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v5, v4

    .line 47
    :goto_1
    and-int/lit8 v6, p5, 0x2

    .line 48
    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    or-int/lit8 v5, v5, 0x30

    .line 52
    .line 53
    :cond_3
    move/from16 v7, p1

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    and-int/lit8 v7, v4, 0x30

    .line 57
    .line 58
    if-nez v7, :cond_3

    .line 59
    .line 60
    move/from16 v7, p1

    .line 61
    .line 62
    invoke-interface {v3, v7}, LY/m;->a(Z)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_5

    .line 67
    .line 68
    const/16 v8, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    const/16 v8, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v5, v8

    .line 74
    :goto_3
    and-int/lit8 v8, p5, 0x4

    .line 75
    .line 76
    if-eqz v8, :cond_7

    .line 77
    .line 78
    or-int/lit16 v5, v5, 0x180

    .line 79
    .line 80
    :cond_6
    move-object/from16 v9, p2

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_7
    and-int/lit16 v9, v4, 0x180

    .line 84
    .line 85
    if-nez v9, :cond_6

    .line 86
    .line 87
    move-object/from16 v9, p2

    .line 88
    .line 89
    invoke-interface {v3, v9}, LY/m;->F(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-eqz v10, :cond_8

    .line 94
    .line 95
    const/16 v10, 0x100

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_8
    const/16 v10, 0x80

    .line 99
    .line 100
    :goto_4
    or-int/2addr v5, v10

    .line 101
    :goto_5
    and-int/lit16 v10, v5, 0x93

    .line 102
    .line 103
    const/16 v11, 0x92

    .line 104
    .line 105
    if-ne v10, v11, :cond_b

    .line 106
    .line 107
    invoke-interface {v3}, LY/m;->i()Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-nez v10, :cond_9

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_9
    invoke-interface {v3}, LY/m;->K()V

    .line 115
    .line 116
    .line 117
    :cond_a
    :goto_6
    move-object v0, v3

    .line 118
    move v2, v7

    .line 119
    move-object v3, v9

    .line 120
    goto/16 :goto_c

    .line 121
    .line 122
    :cond_b
    :goto_7
    const/4 v10, 0x0

    .line 123
    if-eqz v6, :cond_c

    .line 124
    .line 125
    move v7, v10

    .line 126
    :cond_c
    const/4 v6, 0x0

    .line 127
    if-eqz v8, :cond_d

    .line 128
    .line 129
    move-object v9, v6

    .line 130
    :cond_d
    invoke-static {}, LY/w;->L()Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-eqz v8, :cond_e

    .line 135
    .line 136
    const/4 v8, -0x1

    .line 137
    const-string v11, "com.revenuecat.purchases.ui.revenuecatui.OriginalTemplatePaywallFooter (PaywallFooter.kt:54)"

    .line 138
    .line 139
    invoke-static {v2, v5, v8, v11}, LY/w;->U(IIILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_e
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1;

    .line 143
    .line 144
    invoke-direct {v2, v7, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$paywallComposable$1;-><init>(ZLcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;)V

    .line 145
    .line 146
    .line 147
    const/16 v8, 0x36

    .line 148
    .line 149
    const v11, -0x75b530ca

    .line 150
    .line 151
    .line 152
    const/4 v12, 0x1

    .line 153
    invoke-static {v11, v12, v2, v3, v8}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const/4 v8, 0x3

    .line 158
    const/4 v11, 0x0

    .line 159
    if-nez v9, :cond_13

    .line 160
    .line 161
    const v5, -0x2255c5ee

    .line 162
    .line 163
    .line 164
    invoke-interface {v3, v5}, LY/m;->V(I)V

    .line 165
    .line 166
    .line 167
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 168
    .line 169
    invoke-static {v5, v11, v12, v6}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-static {v5, v6, v10, v8, v6}, Landroidx/compose/foundation/layout/s;->z(Landroidx/compose/ui/e;Ll0/e$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    sget-object v6, Ll0/e;->a:Ll0/e$a;

    .line 178
    .line 179
    invoke-virtual {v6}, Ll0/e$a;->o()Ll0/e;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-static {v6, v10}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-static {v3, v10}, LY/h;->a(LY/m;I)I

    .line 188
    .line 189
    .line 190
    move-result v8

    .line 191
    invoke-interface {v3}, LY/m;->r()LY/I;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-static {v3, v5}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    sget-object v11, LK0/g;->M:LK0/g$a;

    .line 200
    .line 201
    invoke-virtual {v11}, LK0/g$a;->a()Lie/a;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    invoke-interface {v3}, LY/m;->j()LY/d;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    if-nez v13, :cond_f

    .line 210
    .line 211
    invoke-static {}, LY/h;->d()V

    .line 212
    .line 213
    .line 214
    :cond_f
    invoke-interface {v3}, LY/m;->I()V

    .line 215
    .line 216
    .line 217
    invoke-interface {v3}, LY/m;->e()Z

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    if-eqz v13, :cond_10

    .line 222
    .line 223
    invoke-interface {v3, v12}, LY/m;->h(Lie/a;)V

    .line 224
    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_10
    invoke-interface {v3}, LY/m;->s()V

    .line 228
    .line 229
    .line 230
    :goto_8
    invoke-static {v3}, LY/m2;->b(LY/m;)LY/m;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    invoke-virtual {v11}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    invoke-static {v12, v6, v13}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v11}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-static {v12, v10, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v11}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-interface {v12}, LY/m;->e()Z

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    if-nez v10, :cond_11

    .line 257
    .line 258
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-nez v10, :cond_12

    .line 271
    .line 272
    :cond_11
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-interface {v12, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    invoke-interface {v12, v8, v6}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 284
    .line 285
    .line 286
    :cond_12
    invoke-virtual {v11}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-static {v12, v5, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 291
    .line 292
    .line 293
    sget-object v5, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 294
    .line 295
    invoke-interface {v2, v3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    invoke-interface {v3}, LY/m;->x()V

    .line 299
    .line 300
    .line 301
    invoke-interface {v3}, LY/m;->O()V

    .line 302
    .line 303
    .line 304
    goto/16 :goto_b

    .line 305
    .line 306
    :cond_13
    const v13, -0x22539a79

    .line 307
    .line 308
    .line 309
    invoke-interface {v3, v13}, LY/m;->V(I)V

    .line 310
    .line 311
    .line 312
    sget-object v13, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 313
    .line 314
    invoke-static {v13, v11, v12, v6}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 315
    .line 316
    .line 317
    move-result-object v14

    .line 318
    sget-object v15, LC/b;->a:LC/b;

    .line 319
    .line 320
    sget-object v16, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;

    .line 321
    .line 322
    move/from16 p1, v8

    .line 323
    .line 324
    invoke-virtual/range {v16 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultCornerRadius-D9Ej5fM()F

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    neg-float v8, v8

    .line 329
    invoke-static {v8}, Li1/h;->n(F)F

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    invoke-virtual {v15, v8}, LC/b;->o(F)LC/b$f;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    sget-object v15, Ll0/e;->a:Ll0/e$a;

    .line 338
    .line 339
    invoke-virtual {v15}, Ll0/e$a;->k()Ll0/e$b;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    invoke-static {v8, v6, v3, v10}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    invoke-static {v3, v10}, LY/h;->a(LY/m;I)I

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    invoke-interface {v3}, LY/m;->r()LY/I;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    invoke-static {v3, v14}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 356
    .line 357
    .line 358
    move-result-object v14

    .line 359
    sget-object v17, LK0/g;->M:LK0/g$a;

    .line 360
    .line 361
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->a()Lie/a;

    .line 362
    .line 363
    .line 364
    move-result-object v11

    .line 365
    invoke-interface {v3}, LY/m;->j()LY/d;

    .line 366
    .line 367
    .line 368
    move-result-object v18

    .line 369
    if-nez v18, :cond_14

    .line 370
    .line 371
    invoke-static {}, LY/h;->d()V

    .line 372
    .line 373
    .line 374
    :cond_14
    invoke-interface {v3}, LY/m;->I()V

    .line 375
    .line 376
    .line 377
    invoke-interface {v3}, LY/m;->e()Z

    .line 378
    .line 379
    .line 380
    move-result v18

    .line 381
    if-eqz v18, :cond_15

    .line 382
    .line 383
    invoke-interface {v3, v11}, LY/m;->h(Lie/a;)V

    .line 384
    .line 385
    .line 386
    goto :goto_9

    .line 387
    :cond_15
    invoke-interface {v3}, LY/m;->s()V

    .line 388
    .line 389
    .line 390
    :goto_9
    invoke-static {v3}, LY/m2;->b(LY/m;)LY/m;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 395
    .line 396
    .line 397
    move-result-object v12

    .line 398
    invoke-static {v11, v6, v12}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    invoke-static {v11, v10, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    invoke-interface {v11}, LY/m;->e()Z

    .line 413
    .line 414
    .line 415
    move-result v10

    .line 416
    if-nez v10, :cond_16

    .line 417
    .line 418
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v10

    .line 422
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 423
    .line 424
    .line 425
    move-result-object v12

    .line 426
    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v10

    .line 430
    if-nez v10, :cond_17

    .line 431
    .line 432
    :cond_16
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v10

    .line 436
    invoke-interface {v11, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    invoke-interface {v11, v8, v6}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 444
    .line 445
    .line 446
    :cond_17
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    invoke-static {v11, v14, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 451
    .line 452
    .line 453
    sget-object v19, LC/j;->a:LC/j;

    .line 454
    .line 455
    const/4 v6, 0x0

    .line 456
    const/4 v8, 0x0

    .line 457
    const/4 v10, 0x1

    .line 458
    invoke-static {v13, v6, v10, v8}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 459
    .line 460
    .line 461
    move-result-object v20

    .line 462
    const/16 v23, 0x2

    .line 463
    .line 464
    const/16 v24, 0x0

    .line 465
    .line 466
    const/high16 v21, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/16 v22, 0x0

    .line 469
    .line 470
    invoke-static/range {v19 .. v24}, LC/i;->c(LC/i;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    invoke-virtual {v15}, Ll0/e$a;->o()Ll0/e;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    const/4 v10, 0x0

    .line 479
    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    invoke-static {v3, v10}, LY/h;->a(LY/m;I)I

    .line 484
    .line 485
    .line 486
    move-result v10

    .line 487
    invoke-interface {v3}, LY/m;->r()LY/I;

    .line 488
    .line 489
    .line 490
    move-result-object v11

    .line 491
    invoke-static {v3, v6}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 492
    .line 493
    .line 494
    move-result-object v6

    .line 495
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->a()Lie/a;

    .line 496
    .line 497
    .line 498
    move-result-object v12

    .line 499
    invoke-interface {v3}, LY/m;->j()LY/d;

    .line 500
    .line 501
    .line 502
    move-result-object v13

    .line 503
    if-nez v13, :cond_18

    .line 504
    .line 505
    invoke-static {}, LY/h;->d()V

    .line 506
    .line 507
    .line 508
    :cond_18
    invoke-interface {v3}, LY/m;->I()V

    .line 509
    .line 510
    .line 511
    invoke-interface {v3}, LY/m;->e()Z

    .line 512
    .line 513
    .line 514
    move-result v13

    .line 515
    if-eqz v13, :cond_19

    .line 516
    .line 517
    invoke-interface {v3, v12}, LY/m;->h(Lie/a;)V

    .line 518
    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_19
    invoke-interface {v3}, LY/m;->s()V

    .line 522
    .line 523
    .line 524
    :goto_a
    invoke-static {v3}, LY/m2;->b(LY/m;)LY/m;

    .line 525
    .line 526
    .line 527
    move-result-object v12

    .line 528
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 529
    .line 530
    .line 531
    move-result-object v13

    .line 532
    invoke-static {v12, v8, v13}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 536
    .line 537
    .line 538
    move-result-object v8

    .line 539
    invoke-static {v12, v11, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    invoke-interface {v12}, LY/m;->e()Z

    .line 547
    .line 548
    .line 549
    move-result v11

    .line 550
    if-nez v11, :cond_1a

    .line 551
    .line 552
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v11

    .line 556
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 557
    .line 558
    .line 559
    move-result-object v13

    .line 560
    invoke-static {v11, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v11

    .line 564
    if-nez v11, :cond_1b

    .line 565
    .line 566
    :cond_1a
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 567
    .line 568
    .line 569
    move-result-object v11

    .line 570
    invoke-interface {v12, v11}, LY/m;->u(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 574
    .line 575
    .line 576
    move-result-object v10

    .line 577
    invoke-interface {v12, v10, v8}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 578
    .line 579
    .line 580
    :cond_1b
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    invoke-static {v12, v6, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 585
    .line 586
    .line 587
    sget-object v6, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 588
    .line 589
    invoke-virtual/range {v16 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/UIConstant;->getDefaultCornerRadius-D9Ej5fM()F

    .line 590
    .line 591
    .line 592
    move-result v13

    .line 593
    const/4 v14, 0x7

    .line 594
    const/4 v15, 0x0

    .line 595
    const/4 v10, 0x0

    .line 596
    const/4 v11, 0x0

    .line 597
    const/4 v12, 0x0

    .line 598
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/p;->e(FFFFILjava/lang/Object;)LC/A;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    shr-int/lit8 v5, v5, 0x3

    .line 603
    .line 604
    and-int/lit8 v5, v5, 0x70

    .line 605
    .line 606
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 607
    .line 608
    .line 609
    move-result-object v5

    .line 610
    invoke-interface {v9, v6, v3, v5}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    invoke-interface {v3}, LY/m;->x()V

    .line 614
    .line 615
    .line 616
    invoke-interface {v2, v3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    invoke-interface {v3}, LY/m;->x()V

    .line 620
    .line 621
    .line 622
    invoke-interface {v3}, LY/m;->O()V

    .line 623
    .line 624
    .line 625
    :goto_b
    invoke-static {}, LY/w;->L()Z

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    if-eqz v0, :cond_a

    .line 630
    .line 631
    invoke-static {}, LY/w;->T()V

    .line 632
    .line 633
    .line 634
    goto/16 :goto_6

    .line 635
    .line 636
    :goto_c
    invoke-interface {v0}, LY/m;->k()LY/B1;

    .line 637
    .line 638
    .line 639
    move-result-object v6

    .line 640
    if-eqz v6, :cond_1c

    .line 641
    .line 642
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$3;

    .line 643
    .line 644
    move/from16 v5, p5

    .line 645
    .line 646
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$OriginalTemplatePaywallFooter$3;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;ZLie/o;II)V

    .line 647
    .line 648
    .line 649
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 650
    .line 651
    .line 652
    :cond_1c
    return-void
.end method

.method public static final PaywallFooter(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;ZLie/o;LY/m;II)V
    .locals 11
    .annotation runtime LTd/e;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;",
            "Z",
            "Lie/o;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move v6, p4

    .line 2
    const-string v1, "options"

    .line 3
    .line 4
    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const v1, -0x7530670e    # -1.9990907E-32f

    .line 8
    .line 9
    .line 10
    invoke-interface {p3, v1}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    and-int/lit8 v2, p5, 0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    or-int/lit8 v2, v6, 0x6

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    and-int/lit8 v2, v6, 0x6

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v3, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v2, 0x2

    .line 34
    :goto_0
    or-int/2addr v2, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v2, v6

    .line 37
    :goto_1
    and-int/lit8 v4, p5, 0x2

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    or-int/lit8 v2, v2, 0x30

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    and-int/lit8 v5, v6, 0x30

    .line 45
    .line 46
    if-nez v5, :cond_5

    .line 47
    .line 48
    invoke-interface {v3, p1}, LY/m;->a(Z)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_4

    .line 53
    .line 54
    const/16 v7, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_4
    const/16 v7, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v2, v7

    .line 60
    :cond_5
    :goto_3
    and-int/lit8 v7, p5, 0x4

    .line 61
    .line 62
    if-eqz v7, :cond_6

    .line 63
    .line 64
    or-int/lit16 v2, v2, 0x180

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_6
    and-int/lit16 v8, v6, 0x180

    .line 68
    .line 69
    if-nez v8, :cond_8

    .line 70
    .line 71
    invoke-interface {v3, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_7

    .line 76
    .line 77
    const/16 v9, 0x100

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_7
    const/16 v9, 0x80

    .line 81
    .line 82
    :goto_4
    or-int/2addr v2, v9

    .line 83
    :cond_8
    :goto_5
    and-int/lit16 v9, v2, 0x93

    .line 84
    .line 85
    const/16 v10, 0x92

    .line 86
    .line 87
    if-ne v9, v10, :cond_a

    .line 88
    .line 89
    invoke-interface {v3}, LY/m;->i()Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-nez v9, :cond_9

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_9
    invoke-interface {v3}, LY/m;->K()V

    .line 97
    .line 98
    .line 99
    move v2, p1

    .line 100
    move-object v0, v3

    .line 101
    move-object v3, p2

    .line 102
    goto :goto_9

    .line 103
    :cond_a
    :goto_6
    if-eqz v4, :cond_b

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    goto :goto_7

    .line 107
    :cond_b
    move v4, p1

    .line 108
    :goto_7
    if-eqz v7, :cond_c

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    goto :goto_8

    .line 112
    :cond_c
    move-object v5, p2

    .line 113
    :goto_8
    invoke-static {}, LY/w;->L()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_d

    .line 118
    .line 119
    const/4 v7, -0x1

    .line 120
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.PaywallFooter (PaywallFooter.kt:34)"

    .line 121
    .line 122
    invoke-static {v1, v2, v7, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_d
    and-int/lit16 v1, v2, 0x3fe

    .line 126
    .line 127
    move-object v2, v5

    .line 128
    const/4 v5, 0x0

    .line 129
    move v0, v4

    .line 130
    move v4, v1

    .line 131
    move v1, v0

    .line 132
    move-object v0, p0

    .line 133
    invoke-static/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt;->OriginalTemplatePaywallFooter(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;ZLie/o;LY/m;II)V

    .line 134
    .line 135
    .line 136
    invoke-static {}, LY/w;->L()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_e

    .line 141
    .line 142
    invoke-static {}, LY/w;->T()V

    .line 143
    .line 144
    .line 145
    :cond_e
    move-object v0, v3

    .line 146
    move-object v3, v2

    .line 147
    move v2, v1

    .line 148
    :goto_9
    invoke-interface {v0}, LY/m;->k()LY/B1;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    if-eqz v7, :cond_f

    .line 153
    .line 154
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$PaywallFooter$1;

    .line 155
    .line 156
    move-object v1, p0

    .line 157
    move/from16 v5, p5

    .line 158
    .line 159
    move v4, v6

    .line 160
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/PaywallFooterKt$PaywallFooter$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;ZLie/o;II)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v7, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    :cond_f
    return-void
.end method
