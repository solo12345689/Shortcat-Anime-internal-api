.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aa\u0010\u0010\u001a\u00020\u000e2\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000cH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
        "associatedPurchaseInformation",
        "",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
        "supportedPaths",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "localization",
        "",
        "contactEmail",
        "",
        "addContactButton",
        "addCreateTicketButton",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction;",
        "LTd/L;",
        "onAction",
        "ManageSubscriptionsButtonsView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;LY/m;II)V",
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
.method public static final ManageSubscriptionsButtonsView(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;LY/m;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            ">;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v7, p6

    .line 10
    .line 11
    move/from16 v8, p8

    .line 12
    .line 13
    const-string v0, "supportedPaths"

    .line 14
    .line 15
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "localization"

    .line 19
    .line 20
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "onAction"

    .line 24
    .line 25
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const v0, -0x7cfe98b8

    .line 29
    .line 30
    .line 31
    move-object/from16 v5, p7

    .line 32
    .line 33
    invoke-interface {v5, v0}, LY/m;->g(I)LY/m;

    .line 34
    .line 35
    .line 36
    move-result-object v14

    .line 37
    and-int/lit8 v5, p9, 0x1

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    or-int/lit8 v5, v8, 0x6

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    and-int/lit8 v5, v8, 0x6

    .line 46
    .line 47
    if-nez v5, :cond_2

    .line 48
    .line 49
    invoke-interface {v14, v1}, LY/m;->F(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    const/4 v5, 0x4

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v5, v6

    .line 58
    :goto_0
    or-int/2addr v5, v8

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v5, v8

    .line 61
    :goto_1
    and-int/lit8 v9, p9, 0x2

    .line 62
    .line 63
    if-eqz v9, :cond_3

    .line 64
    .line 65
    or-int/lit8 v5, v5, 0x30

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    and-int/lit8 v9, v8, 0x30

    .line 69
    .line 70
    if-nez v9, :cond_5

    .line 71
    .line 72
    invoke-interface {v14, v2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_4

    .line 77
    .line 78
    const/16 v9, 0x20

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const/16 v9, 0x10

    .line 82
    .line 83
    :goto_2
    or-int/2addr v5, v9

    .line 84
    :cond_5
    :goto_3
    and-int/lit8 v9, p9, 0x4

    .line 85
    .line 86
    if-eqz v9, :cond_6

    .line 87
    .line 88
    or-int/lit16 v5, v5, 0x180

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_6
    and-int/lit16 v9, v8, 0x180

    .line 92
    .line 93
    if-nez v9, :cond_8

    .line 94
    .line 95
    invoke-interface {v14, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_7

    .line 100
    .line 101
    const/16 v9, 0x100

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_7
    const/16 v9, 0x80

    .line 105
    .line 106
    :goto_4
    or-int/2addr v5, v9

    .line 107
    :cond_8
    :goto_5
    and-int/lit8 v9, p9, 0x8

    .line 108
    .line 109
    if-eqz v9, :cond_9

    .line 110
    .line 111
    or-int/lit16 v5, v5, 0xc00

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_9
    and-int/lit16 v9, v8, 0xc00

    .line 115
    .line 116
    if-nez v9, :cond_b

    .line 117
    .line 118
    invoke-interface {v14, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_a

    .line 123
    .line 124
    const/16 v9, 0x800

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_a
    const/16 v9, 0x400

    .line 128
    .line 129
    :goto_6
    or-int/2addr v5, v9

    .line 130
    :cond_b
    :goto_7
    and-int/lit8 v9, p9, 0x10

    .line 131
    .line 132
    if-eqz v9, :cond_d

    .line 133
    .line 134
    or-int/lit16 v5, v5, 0x6000

    .line 135
    .line 136
    :cond_c
    move/from16 v11, p4

    .line 137
    .line 138
    goto :goto_9

    .line 139
    :cond_d
    and-int/lit16 v11, v8, 0x6000

    .line 140
    .line 141
    if-nez v11, :cond_c

    .line 142
    .line 143
    move/from16 v11, p4

    .line 144
    .line 145
    invoke-interface {v14, v11}, LY/m;->a(Z)Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v12, :cond_e

    .line 150
    .line 151
    const/16 v12, 0x4000

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_e
    const/16 v12, 0x2000

    .line 155
    .line 156
    :goto_8
    or-int/2addr v5, v12

    .line 157
    :goto_9
    and-int/lit8 v12, p9, 0x20

    .line 158
    .line 159
    const/high16 v13, 0x30000

    .line 160
    .line 161
    if-eqz v12, :cond_10

    .line 162
    .line 163
    or-int/2addr v5, v13

    .line 164
    :cond_f
    move/from16 v13, p5

    .line 165
    .line 166
    goto :goto_b

    .line 167
    :cond_10
    and-int/2addr v13, v8

    .line 168
    if-nez v13, :cond_f

    .line 169
    .line 170
    move/from16 v13, p5

    .line 171
    .line 172
    invoke-interface {v14, v13}, LY/m;->a(Z)Z

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    if-eqz v15, :cond_11

    .line 177
    .line 178
    const/high16 v15, 0x20000

    .line 179
    .line 180
    goto :goto_a

    .line 181
    :cond_11
    const/high16 v15, 0x10000

    .line 182
    .line 183
    :goto_a
    or-int/2addr v5, v15

    .line 184
    :goto_b
    and-int/lit8 v15, p9, 0x40

    .line 185
    .line 186
    const/high16 v16, 0x180000

    .line 187
    .line 188
    move/from16 p7, v12

    .line 189
    .line 190
    if-eqz v15, :cond_12

    .line 191
    .line 192
    or-int v5, v5, v16

    .line 193
    .line 194
    goto :goto_d

    .line 195
    :cond_12
    and-int v15, v8, v16

    .line 196
    .line 197
    if-nez v15, :cond_14

    .line 198
    .line 199
    invoke-interface {v14, v7}, LY/m;->F(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    if-eqz v15, :cond_13

    .line 204
    .line 205
    const/high16 v15, 0x100000

    .line 206
    .line 207
    goto :goto_c

    .line 208
    :cond_13
    const/high16 v15, 0x80000

    .line 209
    .line 210
    :goto_c
    or-int/2addr v5, v15

    .line 211
    :cond_14
    :goto_d
    const v15, 0x92493

    .line 212
    .line 213
    .line 214
    and-int/2addr v15, v5

    .line 215
    const v10, 0x92492

    .line 216
    .line 217
    .line 218
    if-ne v15, v10, :cond_16

    .line 219
    .line 220
    invoke-interface {v14}, LY/m;->i()Z

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    if-nez v10, :cond_15

    .line 225
    .line 226
    goto :goto_e

    .line 227
    :cond_15
    invoke-interface {v14}, LY/m;->K()V

    .line 228
    .line 229
    .line 230
    move v5, v11

    .line 231
    move v6, v13

    .line 232
    goto/16 :goto_17

    .line 233
    .line 234
    :cond_16
    :goto_e
    const/4 v10, 0x0

    .line 235
    if-eqz v9, :cond_17

    .line 236
    .line 237
    move/from16 v17, v10

    .line 238
    .line 239
    goto :goto_f

    .line 240
    :cond_17
    move/from16 v17, v11

    .line 241
    .line 242
    :goto_f
    if-eqz p7, :cond_18

    .line 243
    .line 244
    move/from16 v18, v10

    .line 245
    .line 246
    goto :goto_10

    .line 247
    :cond_18
    move/from16 v18, v13

    .line 248
    .line 249
    :goto_10
    invoke-static {}, LY/w;->L()Z

    .line 250
    .line 251
    .line 252
    move-result v9

    .line 253
    if-eqz v9, :cond_19

    .line 254
    .line 255
    const/4 v9, -0x1

    .line 256
    const-string v11, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ManageSubscriptionsButtonsView (ManageSubscriptionsButtonsView.kt:28)"

    .line 257
    .line 258
    invoke-static {v0, v5, v9, v11}, LY/w;->U(IIILjava/lang/String;)V

    .line 259
    .line 260
    .line 261
    :cond_19
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 262
    .line 263
    sget-object v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;

    .line 264
    .line 265
    invoke-virtual {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterUIConstants;->getManagementViewHorizontalPadding-D9Ej5fM()F

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    const/4 v11, 0x0

    .line 270
    const/4 v13, 0x0

    .line 271
    invoke-static {v0, v9, v11, v6, v13}, Landroidx/compose/foundation/layout/p;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 272
    .line 273
    .line 274
    move-result-object v19

    .line 275
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;

    .line 276
    .line 277
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getBUTTONS_TOP_PADDING-D9Ej5fM()F

    .line 278
    .line 279
    .line 280
    move-result v21

    .line 281
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getBUTTONS_BOTTOM_PADDING-D9Ej5fM()F

    .line 282
    .line 283
    .line 284
    move-result v23

    .line 285
    const/16 v24, 0x5

    .line 286
    .line 287
    const/16 v25, 0x0

    .line 288
    .line 289
    const/16 v20, 0x0

    .line 290
    .line 291
    const/16 v22, 0x0

    .line 292
    .line 293
    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/p;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    sget-object v9, LC/b;->a:LC/b;

    .line 298
    .line 299
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterConstants$Layout;->getBUTTONS_SPACING-D9Ej5fM()F

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    invoke-virtual {v9, v0}, LC/b;->o(F)LC/b$f;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    sget-object v9, Ll0/e;->a:Ll0/e$a;

    .line 308
    .line 309
    invoke-virtual {v9}, Ll0/e$a;->k()Ll0/e$b;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    const/4 v11, 0x6

    .line 314
    invoke-static {v0, v9, v14, v11}, LC/g;->a(LC/b$m;Ll0/e$b;LY/m;I)LI0/B;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-static {v14, v10}, LY/h;->a(LY/m;I)I

    .line 319
    .line 320
    .line 321
    move-result v9

    .line 322
    invoke-interface {v14}, LY/m;->r()LY/I;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    invoke-static {v14, v6}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    sget-object v15, LK0/g;->M:LK0/g$a;

    .line 331
    .line 332
    invoke-virtual {v15}, LK0/g$a;->a()Lie/a;

    .line 333
    .line 334
    .line 335
    move-result-object v12

    .line 336
    invoke-interface {v14}, LY/m;->j()LY/d;

    .line 337
    .line 338
    .line 339
    move-result-object v19

    .line 340
    if-nez v19, :cond_1a

    .line 341
    .line 342
    invoke-static {}, LY/h;->d()V

    .line 343
    .line 344
    .line 345
    :cond_1a
    invoke-interface {v14}, LY/m;->I()V

    .line 346
    .line 347
    .line 348
    invoke-interface {v14}, LY/m;->e()Z

    .line 349
    .line 350
    .line 351
    move-result v19

    .line 352
    if-eqz v19, :cond_1b

    .line 353
    .line 354
    invoke-interface {v14, v12}, LY/m;->h(Lie/a;)V

    .line 355
    .line 356
    .line 357
    goto :goto_11

    .line 358
    :cond_1b
    invoke-interface {v14}, LY/m;->s()V

    .line 359
    .line 360
    .line 361
    :goto_11
    invoke-static {v14}, LY/m2;->b(LY/m;)LY/m;

    .line 362
    .line 363
    .line 364
    move-result-object v12

    .line 365
    invoke-virtual {v15}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 366
    .line 367
    .line 368
    move-result-object v10

    .line 369
    invoke-static {v12, v0, v10}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v15}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-static {v12, v11, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v15}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-interface {v12}, LY/m;->e()Z

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    if-nez v10, :cond_1c

    .line 388
    .line 389
    invoke-interface {v12}, LY/m;->D()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object v11

    .line 397
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    if-nez v10, :cond_1d

    .line 402
    .line 403
    :cond_1c
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v10

    .line 407
    invoke-interface {v12, v10}, LY/m;->u(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 411
    .line 412
    .line 413
    move-result-object v9

    .line 414
    invoke-interface {v12, v9, v0}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 415
    .line 416
    .line 417
    :cond_1d
    invoke-virtual {v15}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-static {v12, v6, v0}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 422
    .line 423
    .line 424
    sget-object v0, LC/j;->a:LC/j;

    .line 425
    .line 426
    const v0, 0x55b55f7a

    .line 427
    .line 428
    .line 429
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 430
    .line 431
    .line 432
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;

    .line 433
    .line 434
    invoke-virtual {v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;->sortPathsByButtonPriority(Ljava/util/List;)Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    const/high16 v9, 0x380000

    .line 447
    .line 448
    const/4 v10, 0x3

    .line 449
    if-eqz v6, :cond_21

    .line 450
    .line 451
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    check-cast v6, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 456
    .line 457
    new-instance v12, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PathButtonPressed;

    .line 458
    .line 459
    invoke-direct {v12, v6, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PathButtonPressed;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 460
    .line 461
    .line 462
    move v15, v9

    .line 463
    invoke-virtual {v6}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getTitle()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    sget-object v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;

    .line 468
    .line 469
    invoke-virtual {v11, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;->getButtonStyleForPath(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;

    .line 474
    .line 475
    move/from16 p5, v15

    .line 476
    .line 477
    const/4 v15, 0x0

    .line 478
    invoke-direct {v11, v15, v15, v10, v13}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 479
    .line 480
    .line 481
    const v10, 0x6922d004

    .line 482
    .line 483
    .line 484
    invoke-interface {v14, v10}, LY/m;->V(I)V

    .line 485
    .line 486
    .line 487
    and-int v10, v5, p5

    .line 488
    .line 489
    const/high16 v13, 0x100000

    .line 490
    .line 491
    if-ne v10, v13, :cond_1e

    .line 492
    .line 493
    const/4 v10, 0x1

    .line 494
    goto :goto_13

    .line 495
    :cond_1e
    move v10, v15

    .line 496
    :goto_13
    invoke-interface {v14, v12}, LY/m;->F(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v20

    .line 500
    or-int v10, v10, v20

    .line 501
    .line 502
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v13

    .line 506
    if-nez v10, :cond_1f

    .line 507
    .line 508
    sget-object v10, LY/m;->a:LY/m$a;

    .line 509
    .line 510
    invoke-virtual {v10}, LY/m$a;->a()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v10

    .line 514
    if-ne v13, v10, :cond_20

    .line 515
    .line 516
    :cond_1f
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$1$1$1;

    .line 517
    .line 518
    invoke-direct {v13, v7, v12}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/actions/CustomerCenterAction$PathButtonPressed;)V

    .line 519
    .line 520
    .line 521
    invoke-interface {v14, v13}, LY/m;->u(Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    :cond_20
    move-object v10, v13

    .line 525
    check-cast v10, Lie/a;

    .line 526
    .line 527
    invoke-interface {v14}, LY/m;->O()V

    .line 528
    .line 529
    .line 530
    move v12, v15

    .line 531
    const/4 v15, 0x0

    .line 532
    const/16 v13, 0x800

    .line 533
    .line 534
    const/16 v16, 0x8

    .line 535
    .line 536
    move/from16 v20, v12

    .line 537
    .line 538
    const/4 v12, 0x0

    .line 539
    move-object/from16 p7, v0

    .line 540
    .line 541
    move-object v13, v6

    .line 542
    move/from16 v6, v20

    .line 543
    .line 544
    const/4 v0, 0x0

    .line 545
    invoke-static/range {v9 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V

    .line 546
    .line 547
    .line 548
    move-object v13, v0

    .line 549
    move-object/from16 v0, p7

    .line 550
    .line 551
    goto :goto_12

    .line 552
    :cond_21
    move/from16 p5, v9

    .line 553
    .line 554
    move-object v0, v13

    .line 555
    const/4 v6, 0x0

    .line 556
    invoke-interface {v14}, LY/m;->O()V

    .line 557
    .line 558
    .line 559
    if-eqz v18, :cond_25

    .line 560
    .line 561
    const v9, 0x60fd3e98

    .line 562
    .line 563
    .line 564
    invoke-interface {v14, v9}, LY/m;->V(I)V

    .line 565
    .line 566
    .line 567
    sget-object v9, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->CONTACT_SUPPORT:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 568
    .line 569
    invoke-virtual {v3, v9}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v9

    .line 573
    sget-object v13, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;->OUTLINED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;

    .line 574
    .line 575
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;

    .line 576
    .line 577
    invoke-direct {v11, v6, v6, v10, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 578
    .line 579
    .line 580
    const v0, 0x55b59c42

    .line 581
    .line 582
    .line 583
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 584
    .line 585
    .line 586
    and-int v0, v5, p5

    .line 587
    .line 588
    const/high16 v12, 0x100000

    .line 589
    .line 590
    if-ne v0, v12, :cond_22

    .line 591
    .line 592
    const/4 v10, 0x1

    .line 593
    goto :goto_14

    .line 594
    :cond_22
    move v10, v6

    .line 595
    :goto_14
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    if-nez v10, :cond_23

    .line 600
    .line 601
    sget-object v5, LY/m;->a:LY/m$a;

    .line 602
    .line 603
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v5

    .line 607
    if-ne v0, v5, :cond_24

    .line 608
    .line 609
    :cond_23
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$2$1;

    .line 610
    .line 611
    invoke-direct {v0, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$2$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 612
    .line 613
    .line 614
    invoke-interface {v14, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    :cond_24
    move-object v10, v0

    .line 618
    check-cast v10, Lie/a;

    .line 619
    .line 620
    invoke-interface {v14}, LY/m;->O()V

    .line 621
    .line 622
    .line 623
    const/16 v15, 0x6000

    .line 624
    .line 625
    const/16 v16, 0x8

    .line 626
    .line 627
    const/4 v12, 0x0

    .line 628
    invoke-static/range {v9 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V

    .line 629
    .line 630
    .line 631
    invoke-interface {v14}, LY/m;->O()V

    .line 632
    .line 633
    .line 634
    goto :goto_16

    .line 635
    :cond_25
    const/high16 v12, 0x100000

    .line 636
    .line 637
    if-eqz v17, :cond_2a

    .line 638
    .line 639
    if-eqz v4, :cond_2a

    .line 640
    .line 641
    const v9, 0x610463f5

    .line 642
    .line 643
    .line 644
    invoke-interface {v14, v9}, LY/m;->V(I)V

    .line 645
    .line 646
    .line 647
    sget-object v9, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->CONTACT_SUPPORT:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 648
    .line 649
    invoke-virtual {v3, v9}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    sget-object v13, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;->OUTLINED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;

    .line 654
    .line 655
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;

    .line 656
    .line 657
    invoke-direct {v11, v6, v6, v10, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 658
    .line 659
    .line 660
    const v0, 0x55b5d745

    .line 661
    .line 662
    .line 663
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 664
    .line 665
    .line 666
    and-int v0, v5, p5

    .line 667
    .line 668
    if-ne v0, v12, :cond_26

    .line 669
    .line 670
    const/4 v10, 0x1

    .line 671
    goto :goto_15

    .line 672
    :cond_26
    move v10, v6

    .line 673
    :goto_15
    and-int/lit16 v0, v5, 0x1c00

    .line 674
    .line 675
    const/16 v5, 0x800

    .line 676
    .line 677
    if-ne v0, v5, :cond_27

    .line 678
    .line 679
    const/4 v6, 0x1

    .line 680
    :cond_27
    or-int v0, v10, v6

    .line 681
    .line 682
    invoke-interface {v14}, LY/m;->D()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    if-nez v0, :cond_28

    .line 687
    .line 688
    sget-object v0, LY/m;->a:LY/m$a;

    .line 689
    .line 690
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    if-ne v5, v0, :cond_29

    .line 695
    .line 696
    :cond_28
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$3$1;

    .line 697
    .line 698
    invoke-direct {v5, v7, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$1$3$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    invoke-interface {v14, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    :cond_29
    move-object v10, v5

    .line 705
    check-cast v10, Lie/a;

    .line 706
    .line 707
    invoke-interface {v14}, LY/m;->O()V

    .line 708
    .line 709
    .line 710
    const/16 v15, 0x6000

    .line 711
    .line 712
    const/16 v16, 0x8

    .line 713
    .line 714
    const/4 v12, 0x0

    .line 715
    invoke-static/range {v9 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonKt;->SettingsButton(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V

    .line 716
    .line 717
    .line 718
    invoke-interface {v14}, LY/m;->O()V

    .line 719
    .line 720
    .line 721
    goto :goto_16

    .line 722
    :cond_2a
    const v0, 0x610a97dc

    .line 723
    .line 724
    .line 725
    invoke-interface {v14, v0}, LY/m;->V(I)V

    .line 726
    .line 727
    .line 728
    invoke-interface {v14}, LY/m;->O()V

    .line 729
    .line 730
    .line 731
    :goto_16
    invoke-interface {v14}, LY/m;->x()V

    .line 732
    .line 733
    .line 734
    invoke-static {}, LY/w;->L()Z

    .line 735
    .line 736
    .line 737
    move-result v0

    .line 738
    if-eqz v0, :cond_2b

    .line 739
    .line 740
    invoke-static {}, LY/w;->T()V

    .line 741
    .line 742
    .line 743
    :cond_2b
    move/from16 v5, v17

    .line 744
    .line 745
    move/from16 v6, v18

    .line 746
    .line 747
    :goto_17
    invoke-interface {v14}, LY/m;->k()LY/B1;

    .line 748
    .line 749
    .line 750
    move-result-object v10

    .line 751
    if-eqz v10, :cond_2c

    .line 752
    .line 753
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$2;

    .line 754
    .line 755
    move/from16 v9, p9

    .line 756
    .line 757
    invoke-direct/range {v0 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/views/ManageSubscriptionsButtonsViewKt$ManageSubscriptionsButtonsView$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/util/List;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;II)V

    .line 758
    .line 759
    .line 760
    invoke-interface {v10, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 761
    .line 762
    .line 763
    :cond_2c
    return-void
.end method
