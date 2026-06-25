.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aL\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0013\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "text",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Ls0/r0;",
        "color",
        "LU0/Y0;",
        "style",
        "LY0/L;",
        "fontWeight",
        "Lg1/j;",
        "textAlign",
        "LTd/L;",
        "AutoResizedText-W72HBGU",
        "(Ljava/lang/String;Landroidx/compose/ui/e;JLU0/Y0;LY0/L;ILY/m;II)V",
        "AutoResizedText",
        "resizedTextStyle",
        "",
        "shouldDraw",
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
.method public static final AutoResizedText-W72HBGU(Ljava/lang/String;Landroidx/compose/ui/e;JLU0/Y0;LY0/L;ILY/m;II)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p8

    .line 4
    .line 5
    const-string v2, "text"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v2, 0x73af1e31

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p7

    .line 14
    .line 15
    invoke-interface {v3, v2}, LY/m;->g(I)LY/m;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    and-int/lit8 v4, p9, 0x1

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    or-int/lit8 v4, v1, 0x6

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v4, v1, 0x6

    .line 27
    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    invoke-interface {v3, v0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v4, 0x2

    .line 39
    :goto_0
    or-int/2addr v4, v1

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v4, v1

    .line 42
    :goto_1
    and-int/lit8 v6, p9, 0x2

    .line 43
    .line 44
    if-eqz v6, :cond_4

    .line 45
    .line 46
    or-int/lit8 v4, v4, 0x30

    .line 47
    .line 48
    :cond_3
    move-object/from16 v7, p1

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_4
    and-int/lit8 v7, v1, 0x30

    .line 52
    .line 53
    if-nez v7, :cond_3

    .line 54
    .line 55
    move-object/from16 v7, p1

    .line 56
    .line 57
    invoke-interface {v3, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_5

    .line 62
    .line 63
    const/16 v8, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_5
    const/16 v8, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v4, v8

    .line 69
    :goto_3
    and-int/lit8 v8, p9, 0x4

    .line 70
    .line 71
    if-eqz v8, :cond_7

    .line 72
    .line 73
    or-int/lit16 v4, v4, 0x180

    .line 74
    .line 75
    :cond_6
    move-wide/from16 v9, p2

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_7
    and-int/lit16 v9, v1, 0x180

    .line 79
    .line 80
    if-nez v9, :cond_6

    .line 81
    .line 82
    move-wide/from16 v9, p2

    .line 83
    .line 84
    invoke-interface {v3, v9, v10}, LY/m;->d(J)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-eqz v11, :cond_8

    .line 89
    .line 90
    const/16 v11, 0x100

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_8
    const/16 v11, 0x80

    .line 94
    .line 95
    :goto_4
    or-int/2addr v4, v11

    .line 96
    :goto_5
    and-int/lit16 v11, v1, 0xc00

    .line 97
    .line 98
    if-nez v11, :cond_b

    .line 99
    .line 100
    and-int/lit8 v11, p9, 0x8

    .line 101
    .line 102
    if-nez v11, :cond_9

    .line 103
    .line 104
    move-object/from16 v11, p4

    .line 105
    .line 106
    invoke-interface {v3, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    if-eqz v13, :cond_a

    .line 111
    .line 112
    const/16 v13, 0x800

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_9
    move-object/from16 v11, p4

    .line 116
    .line 117
    :cond_a
    const/16 v13, 0x400

    .line 118
    .line 119
    :goto_6
    or-int/2addr v4, v13

    .line 120
    goto :goto_7

    .line 121
    :cond_b
    move-object/from16 v11, p4

    .line 122
    .line 123
    :goto_7
    and-int/lit8 v13, p9, 0x10

    .line 124
    .line 125
    if-eqz v13, :cond_d

    .line 126
    .line 127
    or-int/lit16 v4, v4, 0x6000

    .line 128
    .line 129
    :cond_c
    move-object/from16 v14, p5

    .line 130
    .line 131
    goto :goto_9

    .line 132
    :cond_d
    and-int/lit16 v14, v1, 0x6000

    .line 133
    .line 134
    if-nez v14, :cond_c

    .line 135
    .line 136
    move-object/from16 v14, p5

    .line 137
    .line 138
    invoke-interface {v3, v14}, LY/m;->U(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    if-eqz v15, :cond_e

    .line 143
    .line 144
    const/16 v15, 0x4000

    .line 145
    .line 146
    goto :goto_8

    .line 147
    :cond_e
    const/16 v15, 0x2000

    .line 148
    .line 149
    :goto_8
    or-int/2addr v4, v15

    .line 150
    :goto_9
    const/high16 v15, 0x30000

    .line 151
    .line 152
    and-int/2addr v15, v1

    .line 153
    if-nez v15, :cond_11

    .line 154
    .line 155
    and-int/lit8 v15, p9, 0x20

    .line 156
    .line 157
    if-nez v15, :cond_f

    .line 158
    .line 159
    move/from16 v15, p6

    .line 160
    .line 161
    invoke-interface {v3, v15}, LY/m;->c(I)Z

    .line 162
    .line 163
    .line 164
    move-result v16

    .line 165
    if-eqz v16, :cond_10

    .line 166
    .line 167
    const/high16 v16, 0x20000

    .line 168
    .line 169
    goto :goto_a

    .line 170
    :cond_f
    move/from16 v15, p6

    .line 171
    .line 172
    :cond_10
    const/high16 v16, 0x10000

    .line 173
    .line 174
    :goto_a
    or-int v4, v4, v16

    .line 175
    .line 176
    goto :goto_b

    .line 177
    :cond_11
    move/from16 v15, p6

    .line 178
    .line 179
    :goto_b
    const v16, 0x12493

    .line 180
    .line 181
    .line 182
    and-int v12, v4, v16

    .line 183
    .line 184
    const v5, 0x12492

    .line 185
    .line 186
    .line 187
    if-ne v12, v5, :cond_13

    .line 188
    .line 189
    invoke-interface {v3}, LY/m;->i()Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-nez v5, :cond_12

    .line 194
    .line 195
    goto :goto_c

    .line 196
    :cond_12
    invoke-interface {v3}, LY/m;->K()V

    .line 197
    .line 198
    .line 199
    move-object/from16 v21, v3

    .line 200
    .line 201
    move-object v2, v7

    .line 202
    move-wide v3, v9

    .line 203
    move-object v5, v11

    .line 204
    move-object v6, v14

    .line 205
    move v7, v15

    .line 206
    goto/16 :goto_12

    .line 207
    .line 208
    :cond_13
    :goto_c
    invoke-interface {v3}, LY/m;->G()V

    .line 209
    .line 210
    .line 211
    and-int/lit8 v5, v1, 0x1

    .line 212
    .line 213
    const v12, -0x70001

    .line 214
    .line 215
    .line 216
    if-eqz v5, :cond_17

    .line 217
    .line 218
    invoke-interface {v3}, LY/m;->N()Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_14

    .line 223
    .line 224
    goto :goto_d

    .line 225
    :cond_14
    invoke-interface {v3}, LY/m;->K()V

    .line 226
    .line 227
    .line 228
    and-int/lit8 v5, p9, 0x8

    .line 229
    .line 230
    if-eqz v5, :cond_15

    .line 231
    .line 232
    and-int/lit16 v4, v4, -0x1c01

    .line 233
    .line 234
    :cond_15
    and-int/lit8 v5, p9, 0x20

    .line 235
    .line 236
    if-eqz v5, :cond_16

    .line 237
    .line 238
    and-int/2addr v4, v12

    .line 239
    :cond_16
    move v5, v4

    .line 240
    move-object v4, v7

    .line 241
    move-object v7, v14

    .line 242
    move/from16 v25, v15

    .line 243
    .line 244
    goto :goto_e

    .line 245
    :cond_17
    :goto_d
    if-eqz v6, :cond_18

    .line 246
    .line 247
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 248
    .line 249
    move-object v7, v5

    .line 250
    :cond_18
    if-eqz v8, :cond_19

    .line 251
    .line 252
    sget-object v5, Ls0/r0;->b:Ls0/r0$a;

    .line 253
    .line 254
    invoke-virtual {v5}, Ls0/r0$a;->j()J

    .line 255
    .line 256
    .line 257
    move-result-wide v5

    .line 258
    move-wide v9, v5

    .line 259
    :cond_19
    and-int/lit8 v5, p9, 0x8

    .line 260
    .line 261
    if-eqz v5, :cond_1a

    .line 262
    .line 263
    sget-object v5, LU/D;->a:LU/D;

    .line 264
    .line 265
    sget v6, LU/D;->b:I

    .line 266
    .line 267
    invoke-virtual {v5, v3, v6}, LU/D;->c(LY/m;I)LU/o0;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-virtual {v5}, LU/o0;->d()LU0/Y0;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    and-int/lit16 v4, v4, -0x1c01

    .line 276
    .line 277
    move-object v11, v5

    .line 278
    :cond_1a
    if-eqz v13, :cond_1b

    .line 279
    .line 280
    sget-object v5, LY0/L;->b:LY0/L$a;

    .line 281
    .line 282
    invoke-virtual {v5}, LY0/L$a;->b()LY0/L;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    move-object v14, v5

    .line 287
    :cond_1b
    and-int/lit8 v5, p9, 0x20

    .line 288
    .line 289
    if-eqz v5, :cond_16

    .line 290
    .line 291
    sget-object v5, Lg1/j;->b:Lg1/j$a;

    .line 292
    .line 293
    invoke-virtual {v5}, Lg1/j$a;->a()I

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    and-int/2addr v4, v12

    .line 298
    move/from16 v25, v5

    .line 299
    .line 300
    move v5, v4

    .line 301
    move-object v4, v7

    .line 302
    move-object v7, v14

    .line 303
    :goto_e
    invoke-interface {v3}, LY/m;->y()V

    .line 304
    .line 305
    .line 306
    invoke-static {}, LY/w;->L()Z

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    if-eqz v6, :cond_1c

    .line 311
    .line 312
    const/4 v6, -0x1

    .line 313
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.composables.AutoResizedText (AutoResizedText.kt:29)"

    .line 314
    .line 315
    invoke-static {v2, v5, v6, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 316
    .line 317
    .line 318
    :cond_1c
    const v2, 0x22c0a08b

    .line 319
    .line 320
    .line 321
    invoke-interface {v3, v2}, LY/m;->V(I)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    sget-object v6, LY/m;->a:LY/m$a;

    .line 329
    .line 330
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    const/4 v12, 0x0

    .line 335
    if-ne v2, v8, :cond_1d

    .line 336
    .line 337
    const/4 v8, 0x2

    .line 338
    invoke-static {v11, v12, v8, v12}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-interface {v3, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_1d
    check-cast v2, LY/C0;

    .line 346
    .line 347
    invoke-interface {v3}, LY/m;->O()V

    .line 348
    .line 349
    .line 350
    const v8, 0x22c0a92b

    .line 351
    .line 352
    .line 353
    invoke-interface {v3, v8}, LY/m;->V(I)V

    .line 354
    .line 355
    .line 356
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    if-ne v8, v13, :cond_1e

    .line 365
    .line 366
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 367
    .line 368
    const/4 v13, 0x2

    .line 369
    invoke-static {v8, v12, v13, v12}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    invoke-interface {v3, v8}, LY/m;->u(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    :cond_1e
    check-cast v8, LY/C0;

    .line 377
    .line 378
    invoke-interface {v3}, LY/m;->O()V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v11}, LU0/Y0;->n()J

    .line 382
    .line 383
    .line 384
    move-result-wide v12

    .line 385
    const v14, 0x22c0ca62

    .line 386
    .line 387
    .line 388
    invoke-interface {v3, v14}, LY/m;->V(I)V

    .line 389
    .line 390
    .line 391
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v14

    .line 395
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v15

    .line 399
    if-ne v14, v15, :cond_1f

    .line 400
    .line 401
    new-instance v14, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$1$1;

    .line 402
    .line 403
    invoke-direct {v14, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$1$1;-><init>(LY/C0;)V

    .line 404
    .line 405
    .line 406
    invoke-interface {v3, v14}, LY/m;->u(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    :cond_1f
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 410
    .line 411
    invoke-interface {v3}, LY/m;->O()V

    .line 412
    .line 413
    .line 414
    invoke-static {v4, v14}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;

    .line 415
    .line 416
    .line 417
    move-result-object v14

    .line 418
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->AutoResizedText_W72HBGU$lambda$1(LY/C0;)LU0/Y0;

    .line 419
    .line 420
    .line 421
    move-result-object v20

    .line 422
    invoke-static/range {v25 .. v25}, Lg1/j;->h(I)Lg1/j;

    .line 423
    .line 424
    .line 425
    move-result-object v15

    .line 426
    const v0, 0x22c0e34b

    .line 427
    .line 428
    .line 429
    invoke-interface {v3, v0}, LY/m;->V(I)V

    .line 430
    .line 431
    .line 432
    and-int/lit16 v0, v5, 0x1c00

    .line 433
    .line 434
    xor-int/lit16 v0, v0, 0xc00

    .line 435
    .line 436
    const/16 v1, 0x800

    .line 437
    .line 438
    if-le v0, v1, :cond_20

    .line 439
    .line 440
    invoke-interface {v3, v11}, LY/m;->U(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-nez v0, :cond_21

    .line 445
    .line 446
    :cond_20
    and-int/lit16 v0, v5, 0xc00

    .line 447
    .line 448
    if-ne v0, v1, :cond_22

    .line 449
    .line 450
    :cond_21
    const/4 v0, 0x1

    .line 451
    goto :goto_f

    .line 452
    :cond_22
    const/4 v0, 0x0

    .line 453
    :goto_f
    invoke-interface {v3, v12, v13}, LY/m;->d(J)Z

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    or-int/2addr v0, v1

    .line 458
    invoke-interface {v3}, LY/m;->D()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    if-nez v0, :cond_24

    .line 463
    .line 464
    invoke-virtual {v6}, LY/m$a;->a()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    if-ne v1, v0, :cond_23

    .line 469
    .line 470
    goto :goto_10

    .line 471
    :cond_23
    move-object/from16 v26, v11

    .line 472
    .line 473
    goto :goto_11

    .line 474
    :cond_24
    :goto_10
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;

    .line 475
    .line 476
    move-object/from16 p1, v0

    .line 477
    .line 478
    move-object/from16 p5, v2

    .line 479
    .line 480
    move-object/from16 p6, v8

    .line 481
    .line 482
    move-object/from16 p2, v11

    .line 483
    .line 484
    move-wide/from16 p3, v12

    .line 485
    .line 486
    invoke-direct/range {p1 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$2$1;-><init>(LU0/Y0;JLY/C0;LY/C0;)V

    .line 487
    .line 488
    .line 489
    move-object/from16 v1, p1

    .line 490
    .line 491
    move-object/from16 v26, p2

    .line 492
    .line 493
    invoke-interface {v3, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    :goto_11
    move-object/from16 v19, v1

    .line 497
    .line 498
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 499
    .line 500
    invoke-interface {v3}, LY/m;->O()V

    .line 501
    .line 502
    .line 503
    and-int/lit16 v0, v5, 0x38e

    .line 504
    .line 505
    shl-int/lit8 v1, v5, 0x3

    .line 506
    .line 507
    const/high16 v2, 0x70000

    .line 508
    .line 509
    and-int/2addr v1, v2

    .line 510
    or-int/2addr v0, v1

    .line 511
    shl-int/lit8 v1, v5, 0xc

    .line 512
    .line 513
    const/high16 v2, 0x70000000

    .line 514
    .line 515
    and-int/2addr v1, v2

    .line 516
    or-int v22, v0, v1

    .line 517
    .line 518
    const/16 v23, 0x180

    .line 519
    .line 520
    const/16 v24, 0x6dd8

    .line 521
    .line 522
    move-object v0, v4

    .line 523
    const-wide/16 v4, 0x0

    .line 524
    .line 525
    const/4 v6, 0x0

    .line 526
    const/4 v8, 0x0

    .line 527
    move-object/from16 v21, v3

    .line 528
    .line 529
    move-wide v2, v9

    .line 530
    const-wide/16 v9, 0x0

    .line 531
    .line 532
    const/4 v11, 0x0

    .line 533
    move-object v1, v14

    .line 534
    const-wide/16 v13, 0x0

    .line 535
    .line 536
    move-object v12, v15

    .line 537
    const/4 v15, 0x0

    .line 538
    const/16 v16, 0x0

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/16 v18, 0x0

    .line 543
    .line 544
    move-object/from16 v27, v0

    .line 545
    .line 546
    move-object/from16 v0, p0

    .line 547
    .line 548
    invoke-static/range {v0 .. v24}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 549
    .line 550
    .line 551
    invoke-static {}, LY/w;->L()Z

    .line 552
    .line 553
    .line 554
    move-result v0

    .line 555
    if-eqz v0, :cond_25

    .line 556
    .line 557
    invoke-static {}, LY/w;->T()V

    .line 558
    .line 559
    .line 560
    :cond_25
    move-wide v3, v2

    .line 561
    move-object v6, v7

    .line 562
    move/from16 v7, v25

    .line 563
    .line 564
    move-object/from16 v5, v26

    .line 565
    .line 566
    move-object/from16 v2, v27

    .line 567
    .line 568
    :goto_12
    invoke-interface/range {v21 .. v21}, LY/m;->k()LY/B1;

    .line 569
    .line 570
    .line 571
    move-result-object v10

    .line 572
    if-eqz v10, :cond_26

    .line 573
    .line 574
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$3;

    .line 575
    .line 576
    move-object/from16 v1, p0

    .line 577
    .line 578
    move/from16 v8, p8

    .line 579
    .line 580
    move/from16 v9, p9

    .line 581
    .line 582
    invoke-direct/range {v0 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt$AutoResizedText$3;-><init>(Ljava/lang/String;Landroidx/compose/ui/e;JLU0/Y0;LY0/L;III)V

    .line 583
    .line 584
    .line 585
    invoke-interface {v10, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 586
    .line 587
    .line 588
    :cond_26
    return-void
.end method

.method private static final AutoResizedText_W72HBGU$lambda$1(LY/C0;)LU0/Y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")",
            "LU0/Y0;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, LU0/Y0;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final AutoResizedText_W72HBGU$lambda$2(LY/C0;LU0/Y0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "LU0/Y0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final AutoResizedText_W72HBGU$lambda$4(LY/C0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final AutoResizedText_W72HBGU$lambda$5(LY/C0;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/C0;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic access$AutoResizedText_W72HBGU$lambda$1(LY/C0;)LU0/Y0;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->AutoResizedText_W72HBGU$lambda$1(LY/C0;)LU0/Y0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$AutoResizedText_W72HBGU$lambda$2(LY/C0;LU0/Y0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->AutoResizedText_W72HBGU$lambda$2(LY/C0;LU0/Y0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$AutoResizedText_W72HBGU$lambda$4(LY/C0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->AutoResizedText_W72HBGU$lambda$4(LY/C0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$AutoResizedText_W72HBGU$lambda$5(LY/C0;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/AutoResizedTextKt;->AutoResizedText_W72HBGU$lambda$5(LY/C0;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
