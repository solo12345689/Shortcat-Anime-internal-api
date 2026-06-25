.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/IconImageKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a6\u0010\n\u001a\u00020\u00072\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\r"
    }
    d2 = {
        "Landroid/net/Uri;",
        "uri",
        "Li1/h;",
        "maxWidth",
        "iconCornerRadius",
        "Landroidx/compose/ui/e;",
        "childModifier",
        "LTd/L;",
        "IconImage-djqs-MU",
        "(Landroid/net/Uri;FFLandroidx/compose/ui/e;LY/m;II)V",
        "IconImage",
        "IconImagePreview",
        "(LY/m;I)V",
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
.method public static final IconImage-djqs-MU(Landroid/net/Uri;FFLandroidx/compose/ui/e;LY/m;II)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v5, p5

    .line 6
    .line 7
    const v0, -0x12c1d45e

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p4

    .line 11
    .line 12
    invoke-interface {v3, v0}, LY/m;->g(I)LY/m;

    .line 13
    .line 14
    .line 15
    move-result-object v14

    .line 16
    and-int/lit8 v3, p6, 0x1

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    or-int/lit8 v3, v5, 0x6

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v5, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    invoke-interface {v14, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v3, v4

    .line 37
    :goto_0
    or-int/2addr v3, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v3, v5

    .line 40
    :goto_1
    and-int/lit8 v6, p6, 0x2

    .line 41
    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    or-int/lit8 v3, v3, 0x30

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    and-int/lit8 v6, v5, 0x30

    .line 48
    .line 49
    if-nez v6, :cond_5

    .line 50
    .line 51
    invoke-interface {v14, v2}, LY/m;->b(F)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_4

    .line 56
    .line 57
    const/16 v6, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v6, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v3, v6

    .line 63
    :cond_5
    :goto_3
    and-int/lit8 v6, p6, 0x4

    .line 64
    .line 65
    if-eqz v6, :cond_7

    .line 66
    .line 67
    or-int/lit16 v3, v3, 0x180

    .line 68
    .line 69
    :cond_6
    move/from16 v6, p2

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_7
    and-int/lit16 v6, v5, 0x180

    .line 73
    .line 74
    if-nez v6, :cond_6

    .line 75
    .line 76
    move/from16 v6, p2

    .line 77
    .line 78
    invoke-interface {v14, v6}, LY/m;->b(F)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_8

    .line 83
    .line 84
    const/16 v7, 0x100

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_8
    const/16 v7, 0x80

    .line 88
    .line 89
    :goto_4
    or-int/2addr v3, v7

    .line 90
    :goto_5
    and-int/lit8 v7, p6, 0x8

    .line 91
    .line 92
    if-eqz v7, :cond_a

    .line 93
    .line 94
    or-int/lit16 v3, v3, 0xc00

    .line 95
    .line 96
    :cond_9
    move-object/from16 v8, p3

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_a
    and-int/lit16 v8, v5, 0xc00

    .line 100
    .line 101
    if-nez v8, :cond_9

    .line 102
    .line 103
    move-object/from16 v8, p3

    .line 104
    .line 105
    invoke-interface {v14, v8}, LY/m;->U(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-eqz v9, :cond_b

    .line 110
    .line 111
    const/16 v9, 0x800

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_b
    const/16 v9, 0x400

    .line 115
    .line 116
    :goto_6
    or-int/2addr v3, v9

    .line 117
    :goto_7
    and-int/lit16 v9, v3, 0x493

    .line 118
    .line 119
    const/16 v10, 0x492

    .line 120
    .line 121
    if-ne v9, v10, :cond_d

    .line 122
    .line 123
    invoke-interface {v14}, LY/m;->i()Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-nez v9, :cond_c

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_c
    invoke-interface {v14}, LY/m;->K()V

    .line 131
    .line 132
    .line 133
    move-object v4, v8

    .line 134
    goto/16 :goto_e

    .line 135
    .line 136
    :cond_d
    :goto_8
    if-eqz v7, :cond_e

    .line 137
    .line 138
    sget-object v7, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 139
    .line 140
    goto :goto_9

    .line 141
    :cond_e
    move-object v7, v8

    .line 142
    :goto_9
    invoke-static {}, LY/w;->L()Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_f

    .line 147
    .line 148
    const/4 v8, -0x1

    .line 149
    const-string v9, "com.revenuecat.purchases.ui.revenuecatui.composables.IconImage (IconImage.kt:28)"

    .line 150
    .line 151
    invoke-static {v0, v3, v8, v9}, LY/w;->U(IIILjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_f
    if-nez v1, :cond_10

    .line 155
    .line 156
    move-object v0, v7

    .line 157
    goto/16 :goto_d

    .line 158
    .line 159
    :cond_10
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 160
    .line 161
    const/4 v3, 0x0

    .line 162
    const/4 v8, 0x1

    .line 163
    const/4 v9, 0x0

    .line 164
    invoke-static {v0, v3, v2, v8, v9}, Landroidx/compose/foundation/layout/s;->x(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    sget-object v10, LC/b;->a:LC/b;

    .line 169
    .line 170
    invoke-virtual {v10}, LC/b;->h()LC/b$m;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    sget-object v11, Ll0/e;->a:Ll0/e$a;

    .line 175
    .line 176
    invoke-virtual {v11}, Ll0/e$a;->k()Ll0/e$b;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    const/4 v12, 0x0

    .line 181
    invoke-static {v10, v11, v14, v12}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-static {v14, v12}, LY/h;->a(LY/m;I)I

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    invoke-interface {v14}, LY/m;->r()LY/I;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    invoke-static {v14, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sget-object v15, LK0/g;->M:LK0/g$a;

    .line 198
    .line 199
    invoke-virtual {v15}, LK0/g$a;->a()Lie/a;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-interface {v14}, LY/m;->j()LY/d;

    .line 204
    .line 205
    .line 206
    move-result-object v16

    .line 207
    if-nez v16, :cond_11

    .line 208
    .line 209
    invoke-static {}, LY/h;->d()V

    .line 210
    .line 211
    .line 212
    :cond_11
    invoke-interface {v14}, LY/m;->I()V

    .line 213
    .line 214
    .line 215
    invoke-interface {v14}, LY/m;->e()Z

    .line 216
    .line 217
    .line 218
    move-result v16

    .line 219
    if-eqz v16, :cond_12

    .line 220
    .line 221
    invoke-interface {v14, v3}, LY/m;->h(Lie/a;)V

    .line 222
    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_12
    invoke-interface {v14}, LY/m;->s()V

    .line 226
    .line 227
    .line 228
    :goto_a
    invoke-static {v14}, LY/m2;->b(LY/m;)LY/m;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v15}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-static {v3, v10, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v15}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    invoke-static {v3, v13, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v15}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    invoke-interface {v3}, LY/m;->e()Z

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    if-nez v10, :cond_13

    .line 255
    .line 256
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    if-nez v10, :cond_14

    .line 269
    .line 270
    :cond_13
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    invoke-interface {v3, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    invoke-interface {v3, v10, v8}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    :cond_14
    invoke-virtual {v15}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    invoke-static {v3, v0, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 289
    .line 290
    .line 291
    sget-object v0, LC/j;->a:LC/j;

    .line 292
    .line 293
    const/high16 v0, 0x3f800000    # 1.0f

    .line 294
    .line 295
    invoke-static {v7, v0, v12, v4, v9}, Landroidx/compose/foundation/layout/c;->b(Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const/4 v3, 0x0

    .line 300
    const/4 v8, 0x1

    .line 301
    invoke-static {v0, v3, v2, v8, v9}, Landroidx/compose/foundation/layout/s;->x(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-static {v6}, LJ/i;->d(F)LJ/h;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-static {v0, v3}, Lp0/g;->a(Landroidx/compose/ui/e;Ls0/E1;)Landroidx/compose/ui/e;

    .line 310
    .line 311
    .line 312
    move-result-object v15

    .line 313
    invoke-static {v14, v12}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/HelperFunctionsKt;->isInPreviewMode(LY/m;I)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_15

    .line 318
    .line 319
    const v0, 0x6ecc9dfd

    .line 320
    .line 321
    .line 322
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 323
    .line 324
    .line 325
    sget-object v0, LU/D;->a:LU/D;

    .line 326
    .line 327
    sget v3, LU/D;->b:I

    .line 328
    .line 329
    invoke-virtual {v0, v14, v3}, LU/D;->a(LY/m;I)LU/l;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v0}, LU/l;->C()J

    .line 334
    .line 335
    .line 336
    move-result-wide v16

    .line 337
    const/16 v19, 0x2

    .line 338
    .line 339
    const/16 v20, 0x0

    .line 340
    .line 341
    const/16 v18, 0x0

    .line 342
    .line 343
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/s;->r(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0, v14, v12}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;LY/m;I)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v14}, LY/m;->O()V

    .line 355
    .line 356
    .line 357
    :goto_b
    move-object v0, v7

    .line 358
    goto :goto_c

    .line 359
    :cond_15
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    const-string v3, "uri.toString()"

    .line 364
    .line 365
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    sget-object v8, Lcom/revenuecat/purchases/paywalls/PaywallData;->Companion:Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;

    .line 369
    .line 370
    invoke-static {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/extensions/PaywallDataExtensionsKt;->getDefaultAppIconPlaceholder(Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v8

    .line 374
    invoke-static {v0, v8, v12, v4, v9}, LDf/r;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    if-eqz v0, :cond_16

    .line 379
    .line 380
    const v0, 0x6ed0e757

    .line 381
    .line 382
    .line 383
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 384
    .line 385
    .line 386
    invoke-static {v15, v14, v12, v12}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AppIconKt;->AppIcon(Landroidx/compose/ui/e;LY/m;II)V

    .line 387
    .line 388
    .line 389
    invoke-interface {v14}, LY/m;->O()V

    .line 390
    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_16
    const v0, 0x6ed1f8a6

    .line 394
    .line 395
    .line 396
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    sget-object v0, LI0/f;->a:LI0/f$a;

    .line 407
    .line 408
    invoke-virtual {v0}, LI0/f$a;->a()LI0/f;

    .line 409
    .line 410
    .line 411
    move-result-object v9

    .line 412
    move-object v8, v7

    .line 413
    move-object v7, v15

    .line 414
    const/16 v15, 0xc00

    .line 415
    .line 416
    const/16 v16, 0xf4

    .line 417
    .line 418
    move-object v0, v8

    .line 419
    const/4 v8, 0x0

    .line 420
    const/4 v10, 0x0

    .line 421
    const/4 v11, 0x0

    .line 422
    const/4 v12, 0x0

    .line 423
    const/4 v13, 0x0

    .line 424
    invoke-static/range {v6 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt;->RemoteImage(Ljava/lang/String;Landroidx/compose/ui/e;Ljava/lang/String;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V

    .line 425
    .line 426
    .line 427
    invoke-interface {v14}, LY/m;->O()V

    .line 428
    .line 429
    .line 430
    :goto_c
    invoke-interface {v14}, LY/m;->x()V

    .line 431
    .line 432
    .line 433
    :goto_d
    invoke-static {}, LY/w;->L()Z

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-eqz v3, :cond_17

    .line 438
    .line 439
    invoke-static {}, LY/w;->T()V

    .line 440
    .line 441
    .line 442
    :cond_17
    move-object v4, v0

    .line 443
    :goto_e
    invoke-interface {v14}, LY/m;->k()LY/B1;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    if-eqz v7, :cond_18

    .line 448
    .line 449
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IconImageKt$IconImage$2;

    .line 450
    .line 451
    move/from16 v3, p2

    .line 452
    .line 453
    move/from16 v6, p6

    .line 454
    .line 455
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IconImageKt$IconImage$2;-><init>(Landroid/net/Uri;FFLandroidx/compose/ui/e;II)V

    .line 456
    .line 457
    .line 458
    invoke-interface {v7, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 459
    .line 460
    .line 461
    :cond_18
    return-void
.end method

.method private static final IconImagePreview(LY/m;I)V
    .locals 8

    .line 1
    const v0, 0x19c6ad0b

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v5

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v5}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v5}, LY/m;->K()V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, -0x1

    .line 28
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.composables.IconImagePreview (IconImage.kt:56)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    const-string p0, "https://assets.pawwalls.com/icon.jpg"

    .line 34
    .line 35
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/16 p0, 0x8c

    .line 40
    .line 41
    int-to-float p0, p0

    .line 42
    invoke-static {p0}, Li1/h;->n(F)F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/16 p0, 0x10

    .line 47
    .line 48
    int-to-float p0, p0

    .line 49
    invoke-static {p0}, Li1/h;->n(F)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/16 v6, 0x1b0

    .line 54
    .line 55
    const/16 v7, 0x8

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static/range {v1 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IconImageKt;->IconImage-djqs-MU(Landroid/net/Uri;FFLandroidx/compose/ui/e;LY/m;II)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, LY/w;->L()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-static {}, LY/w;->T()V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    invoke-interface {v5}, LY/m;->k()LY/B1;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IconImageKt$IconImagePreview$1;

    .line 77
    .line 78
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IconImageKt$IconImagePreview$1;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public static final synthetic access$IconImagePreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/IconImageKt;->IconImagePreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
