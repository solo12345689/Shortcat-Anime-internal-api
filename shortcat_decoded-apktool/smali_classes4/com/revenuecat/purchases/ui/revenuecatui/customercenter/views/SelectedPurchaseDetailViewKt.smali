.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aU\u0010\u000f\u001a\u00020\r2\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "contactEmail",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "localization",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
        "purchaseInformation",
        "",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
        "supportedPaths",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;",
        "LTd/L;",
        "onAction",
        "SelectedPurchaseDetailView",
        "(Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V",
        "SelectedPurchaseDetailViewPreview",
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
.method public static final SelectedPurchaseDetailView(Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            ">;",
            "Landroidx/compose/ui/e;",
            "Lkotlin/jvm/functions/Function1;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v9, p3

    .line 6
    .line 7
    move-object/from16 v10, p5

    .line 8
    .line 9
    move/from16 v11, p7

    .line 10
    .line 11
    const-string v1, "localization"

    .line 12
    .line 13
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "purchaseInformation"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "supportedPaths"

    .line 22
    .line 23
    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "onAction"

    .line 27
    .line 28
    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v1, -0x72880525

    .line 32
    .line 33
    .line 34
    move-object/from16 v3, p6

    .line 35
    .line 36
    invoke-interface {v3, v1}, LY/m;->g(I)LY/m;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    and-int/lit8 v3, p8, 0x1

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    or-int/lit8 v3, v11, 0x6

    .line 45
    .line 46
    move-object/from16 v12, p0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    and-int/lit8 v3, v11, 0x6

    .line 50
    .line 51
    move-object/from16 v12, p0

    .line 52
    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    invoke-interface {v7, v12}, LY/m;->U(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    const/4 v3, 0x4

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 v3, 0x2

    .line 64
    :goto_0
    or-int/2addr v3, v11

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v3, v11

    .line 67
    :goto_1
    and-int/lit8 v5, p8, 0x2

    .line 68
    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    or-int/lit8 v3, v3, 0x30

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    and-int/lit8 v5, v11, 0x30

    .line 75
    .line 76
    if-nez v5, :cond_5

    .line 77
    .line 78
    invoke-interface {v7, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_4

    .line 83
    .line 84
    const/16 v5, 0x20

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    const/16 v5, 0x10

    .line 88
    .line 89
    :goto_2
    or-int/2addr v3, v5

    .line 90
    :cond_5
    :goto_3
    and-int/lit8 v5, p8, 0x4

    .line 91
    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    or-int/lit16 v3, v3, 0x180

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_6
    and-int/lit16 v5, v11, 0x180

    .line 98
    .line 99
    if-nez v5, :cond_8

    .line 100
    .line 101
    invoke-interface {v7, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_7

    .line 106
    .line 107
    const/16 v5, 0x100

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_7
    const/16 v5, 0x80

    .line 111
    .line 112
    :goto_4
    or-int/2addr v3, v5

    .line 113
    :cond_8
    :goto_5
    and-int/lit8 v5, p8, 0x8

    .line 114
    .line 115
    if-eqz v5, :cond_9

    .line 116
    .line 117
    or-int/lit16 v3, v3, 0xc00

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_9
    and-int/lit16 v5, v11, 0xc00

    .line 121
    .line 122
    if-nez v5, :cond_b

    .line 123
    .line 124
    invoke-interface {v7, v9}, LY/m;->F(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_a

    .line 129
    .line 130
    const/16 v5, 0x800

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_a
    const/16 v5, 0x400

    .line 134
    .line 135
    :goto_6
    or-int/2addr v3, v5

    .line 136
    :cond_b
    :goto_7
    and-int/lit8 v5, p8, 0x10

    .line 137
    .line 138
    if-eqz v5, :cond_d

    .line 139
    .line 140
    or-int/lit16 v3, v3, 0x6000

    .line 141
    .line 142
    :cond_c
    move-object/from16 v6, p4

    .line 143
    .line 144
    goto :goto_9

    .line 145
    :cond_d
    and-int/lit16 v6, v11, 0x6000

    .line 146
    .line 147
    if-nez v6, :cond_c

    .line 148
    .line 149
    move-object/from16 v6, p4

    .line 150
    .line 151
    invoke-interface {v7, v6}, LY/m;->U(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_e

    .line 156
    .line 157
    const/16 v8, 0x4000

    .line 158
    .line 159
    goto :goto_8

    .line 160
    :cond_e
    const/16 v8, 0x2000

    .line 161
    .line 162
    :goto_8
    or-int/2addr v3, v8

    .line 163
    :goto_9
    and-int/lit8 v8, p8, 0x20

    .line 164
    .line 165
    const/high16 v13, 0x30000

    .line 166
    .line 167
    if-eqz v8, :cond_10

    .line 168
    .line 169
    or-int/2addr v3, v13

    .line 170
    :cond_f
    :goto_a
    move v13, v3

    .line 171
    goto :goto_c

    .line 172
    :cond_10
    and-int v8, v11, v13

    .line 173
    .line 174
    if-nez v8, :cond_f

    .line 175
    .line 176
    invoke-interface {v7, v10}, LY/m;->F(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    if-eqz v8, :cond_11

    .line 181
    .line 182
    const/high16 v8, 0x20000

    .line 183
    .line 184
    goto :goto_b

    .line 185
    :cond_11
    const/high16 v8, 0x10000

    .line 186
    .line 187
    :goto_b
    or-int/2addr v3, v8

    .line 188
    goto :goto_a

    .line 189
    :goto_c
    const v3, 0x12493

    .line 190
    .line 191
    .line 192
    and-int/2addr v3, v13

    .line 193
    const v8, 0x12492

    .line 194
    .line 195
    .line 196
    if-ne v3, v8, :cond_13

    .line 197
    .line 198
    invoke-interface {v7}, LY/m;->i()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-nez v3, :cond_12

    .line 203
    .line 204
    goto :goto_d

    .line 205
    :cond_12
    invoke-interface {v7}, LY/m;->K()V

    .line 206
    .line 207
    .line 208
    move-object v5, v6

    .line 209
    move-object v6, v7

    .line 210
    goto/16 :goto_11

    .line 211
    .line 212
    :cond_13
    :goto_d
    if-eqz v5, :cond_14

    .line 213
    .line 214
    sget-object v3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 215
    .line 216
    move-object v14, v3

    .line 217
    goto :goto_e

    .line 218
    :cond_14
    move-object v14, v6

    .line 219
    :goto_e
    invoke-static {}, LY/w;->L()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_15

    .line 224
    .line 225
    const/4 v3, -0x1

    .line 226
    const-string v5, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailView (SelectedPurchaseDetailView.kt:30)"

    .line 227
    .line 228
    invoke-static {v1, v13, v3, v5}, LY/w;->U(IIILjava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_15
    const/4 v1, 0x0

    .line 232
    const/4 v15, 0x1

    .line 233
    const/4 v3, 0x0

    .line 234
    invoke-static {v14, v1, v15, v3}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 235
    .line 236
    .line 237
    move-result-object v16

    .line 238
    const/4 v5, 0x0

    .line 239
    invoke-static {v5, v7, v5, v15}, Landroidx/compose/foundation/m;->c(ILY/m;II)Landroidx/compose/foundation/o;

    .line 240
    .line 241
    .line 242
    move-result-object v17

    .line 243
    const/16 v21, 0xe

    .line 244
    .line 245
    const/16 v22, 0x0

    .line 246
    .line 247
    const/16 v18, 0x0

    .line 248
    .line 249
    const/16 v19, 0x0

    .line 250
    .line 251
    const/16 v20, 0x0

    .line 252
    .line 253
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/m;->f(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLz/n;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 254
    .line 255
    .line 256
    move-result-object v23

    .line 257
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;

    .line 258
    .line 259
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getTOP_PADDING_AFTER_TOP_BAR-D9Ej5fM()F

    .line 260
    .line 261
    .line 262
    move-result v25

    .line 263
    const/16 v28, 0xd

    .line 264
    .line 265
    const/16 v29, 0x0

    .line 266
    .line 267
    const/16 v24, 0x0

    .line 268
    .line 269
    const/16 v26, 0x0

    .line 270
    .line 271
    const/16 v27, 0x0

    .line 272
    .line 273
    invoke-static/range {v23 .. v29}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    sget-object v16, Ll0/e;->a:Ll0/e$a;

    .line 278
    .line 279
    invoke-virtual/range {v16 .. v16}, Ll0/e$a;->g()Ll0/e$b;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    sget-object v16, LC/b;->a:LC/b;

    .line 284
    .line 285
    invoke-virtual/range {v16 .. v16}, LC/b;->h()LC/b$m;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    const/16 v3, 0x30

    .line 290
    .line 291
    invoke-static {v1, v4, v7, v3}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-static {v7, v5}, LY/h;->a(LY/m;I)I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    invoke-interface {v7}, LY/m;->r()LY/I;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-static {v7, v8}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    sget-object v17, LK0/g;->M:LK0/g$a;

    .line 308
    .line 309
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->a()Lie/a;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-interface {v7}, LY/m;->j()LY/d;

    .line 314
    .line 315
    .line 316
    move-result-object v19

    .line 317
    if-nez v19, :cond_16

    .line 318
    .line 319
    invoke-static {}, LY/h;->d()V

    .line 320
    .line 321
    .line 322
    :cond_16
    invoke-interface {v7}, LY/m;->I()V

    .line 323
    .line 324
    .line 325
    invoke-interface {v7}, LY/m;->e()Z

    .line 326
    .line 327
    .line 328
    move-result v19

    .line 329
    if-eqz v19, :cond_17

    .line 330
    .line 331
    invoke-interface {v7, v5}, LY/m;->h(Lie/a;)V

    .line 332
    .line 333
    .line 334
    goto :goto_f

    .line 335
    :cond_17
    invoke-interface {v7}, LY/m;->s()V

    .line 336
    .line 337
    .line 338
    :goto_f
    invoke-static {v7}, LY/m2;->b(LY/m;)LY/m;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    invoke-static {v5, v1, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-static {v5, v4, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-interface {v5}, LY/m;->e()Z

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    if-nez v4, :cond_18

    .line 365
    .line 366
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v15

    .line 374
    invoke-static {v4, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    if-nez v4, :cond_19

    .line 379
    .line 380
    :cond_18
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    invoke-interface {v5, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-interface {v5, v3, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 392
    .line 393
    .line 394
    :cond_19
    invoke-virtual/range {v17 .. v17}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    invoke-static {v5, v8, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 399
    .line 400
    .line 401
    sget-object v1, LC/j;->a:LC/j;

    .line 402
    .line 403
    sget-object v1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    const/4 v4, 0x0

    .line 407
    const/4 v15, 0x1

    .line 408
    invoke-static {v1, v4, v15, v3}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getHORIZONTAL_PADDING-D9Ej5fM()F

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    const/4 v6, 0x2

    .line 417
    invoke-static {v1, v5, v4, v6, v3}, Landroidx/compose/foundation/layout/p;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;->SINGLE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;

    .line 422
    .line 423
    shr-int/lit8 v16, v13, 0x6

    .line 424
    .line 425
    and-int/lit8 v4, v16, 0xe

    .line 426
    .line 427
    const v5, 0x36d80

    .line 428
    .line 429
    .line 430
    or-int/2addr v4, v5

    .line 431
    and-int/lit8 v5, v13, 0x70

    .line 432
    .line 433
    or-int/2addr v4, v5

    .line 434
    const/4 v8, 0x0

    .line 435
    move-object v6, v7

    .line 436
    move v7, v4

    .line 437
    const/4 v4, 0x1

    .line 438
    const/4 v5, 0x0

    .line 439
    move-object/from16 v18, v2

    .line 440
    .line 441
    move-object v2, v1

    .line 442
    move-object/from16 v1, v18

    .line 443
    .line 444
    const/16 v18, 0x0

    .line 445
    .line 446
    invoke-static/range {v0 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/PurchaseInformationCardViewKt;->PurchaseInformationCardView(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ButtonPosition;ZLie/a;LY/m;II)V

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {p2 .. p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getStore()Lcom/revenuecat/purchases/Store;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    sget-object v1, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 454
    .line 455
    if-eq v0, v1, :cond_1a

    .line 456
    .line 457
    move v4, v15

    .line 458
    goto :goto_10

    .line 459
    :cond_1a
    move/from16 v4, v18

    .line 460
    .line 461
    :goto_10
    and-int/lit8 v0, v16, 0x7e

    .line 462
    .line 463
    shl-int/lit8 v1, v13, 0x3

    .line 464
    .line 465
    and-int/lit16 v2, v1, 0x380

    .line 466
    .line 467
    or-int/2addr v0, v2

    .line 468
    shl-int/lit8 v2, v13, 0x9

    .line 469
    .line 470
    and-int/lit16 v2, v2, 0x1c00

    .line 471
    .line 472
    or-int/2addr v0, v2

    .line 473
    const/high16 v2, 0x380000

    .line 474
    .line 475
    and-int/2addr v1, v2

    .line 476
    or-int v8, v0, v1

    .line 477
    .line 478
    const/16 v9, 0x20

    .line 479
    .line 480
    const/4 v5, 0x0

    .line 481
    move-object/from16 v2, p1

    .line 482
    .line 483
    move-object/from16 v0, p2

    .line 484
    .line 485
    move-object/from16 v1, p3

    .line 486
    .line 487
    move-object v7, v6

    .line 488
    move-object v6, v10

    .line 489
    move-object v3, v12

    .line 490
    invoke-static/range {v0 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt;->ManageSubscriptionsButtonsView(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;LY/m;II)V

    .line 491
    .line 492
    .line 493
    move-object v6, v7

    .line 494
    invoke-interface {v6}, LY/m;->x()V

    .line 495
    .line 496
    .line 497
    invoke-static {}, LY/w;->L()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-eqz v0, :cond_1b

    .line 502
    .line 503
    invoke-static {}, LY/w;->T()V

    .line 504
    .line 505
    .line 506
    :cond_1b
    move-object v5, v14

    .line 507
    :goto_11
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 508
    .line 509
    .line 510
    move-result-object v9

    .line 511
    if-eqz v9, :cond_1c

    .line 512
    .line 513
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt$SelectedPurchaseDetailView$2;

    .line 514
    .line 515
    move-object/from16 v1, p0

    .line 516
    .line 517
    move-object/from16 v2, p1

    .line 518
    .line 519
    move-object/from16 v3, p2

    .line 520
    .line 521
    move-object/from16 v4, p3

    .line 522
    .line 523
    move-object/from16 v6, p5

    .line 524
    .line 525
    move/from16 v8, p8

    .line 526
    .line 527
    move v7, v11

    .line 528
    invoke-direct/range {v0 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt$SelectedPurchaseDetailView$2;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;II)V

    .line 529
    .line 530
    .line 531
    invoke-interface {v9, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 532
    .line 533
    .line 534
    :cond_1c
    return-void
.end method

.method private static final SelectedPurchaseDetailViewPreview(LY/m;I)V
    .locals 4

    .line 1
    const v0, -0x712708f6

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {p0}, LY/m;->i()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, LY/m;->K()V

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
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewPreview (SelectedPurchaseDetailView.kt:67)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v0, v3, v3, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->customerCenterData$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getScreens()Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    sget-object v3, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;->MANAGEMENT:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;

    .line 47
    .line 48
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    check-cast v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterConfigTestData;->getPurchaseInformationMonthlyRenewing()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt$SelectedPurchaseDetailViewPreview$1;

    .line 62
    .line 63
    invoke-direct {v3, v1, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt$SelectedPurchaseDetailViewPreview$1;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;)V

    .line 64
    .line 65
    .line 66
    const/16 v0, 0x36

    .line 67
    .line 68
    const v1, 0x661fb049

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    invoke-static {v1, v2, v3, p0, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v1, 0x6

    .line 77
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/theme/CustomerCenterPreviewThemeKt;->CustomerCenterPreviewTheme(Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 78
    .line 79
    .line 80
    invoke-static {}, LY/w;->L()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-static {}, LY/w;->T()V

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-eqz p0, :cond_4

    .line 94
    .line 95
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt$SelectedPurchaseDetailViewPreview$2;

    .line 96
    .line 97
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt$SelectedPurchaseDetailViewPreview$2;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    return-void
.end method

.method public static final synthetic access$SelectedPurchaseDetailViewPreview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/SelectedPurchaseDetailViewKt;->SelectedPurchaseDetailViewPreview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
