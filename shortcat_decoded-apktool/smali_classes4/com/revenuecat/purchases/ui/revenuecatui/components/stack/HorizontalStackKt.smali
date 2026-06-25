.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aH\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0010\u00b2\u0006\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "size",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;",
        "dimension",
        "Li1/h;",
        "spacing",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScope;",
        "LTd/L;",
        "content",
        "HorizontalStack-TN_CM5M",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V",
        "HorizontalStack",
        "latestContent",
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
.method public static final HorizontalStack-TN_CM5M(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LY/m;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
            "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;",
            "F",
            "Landroidx/compose/ui/e;",
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
    move/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p4

    .line 8
    .line 9
    move/from16 v9, p6

    .line 10
    .line 11
    const/4 v4, 0x6

    .line 12
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v10

    .line 16
    const-string v4, "size"

    .line 17
    .line 18
    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v4, "dimension"

    .line 22
    .line 23
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v4, "content"

    .line 27
    .line 28
    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v4, 0x61939556

    .line 32
    .line 33
    .line 34
    move-object/from16 v5, p5

    .line 35
    .line 36
    invoke-interface {v5, v4}, LY/m;->g(I)LY/m;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    and-int/lit8 v5, p7, 0x1

    .line 41
    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    or-int/lit8 v5, v9, 0x6

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    and-int/lit8 v5, v9, 0x6

    .line 48
    .line 49
    if-nez v5, :cond_2

    .line 50
    .line 51
    invoke-interface {v11, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    const/4 v5, 0x4

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const/4 v5, 0x2

    .line 60
    :goto_0
    or-int/2addr v5, v9

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move v5, v9

    .line 63
    :goto_1
    and-int/lit8 v6, p7, 0x2

    .line 64
    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    or-int/lit8 v5, v5, 0x30

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_3
    and-int/lit8 v6, v9, 0x30

    .line 71
    .line 72
    if-nez v6, :cond_5

    .line 73
    .line 74
    invoke-interface {v11, v2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_4

    .line 79
    .line 80
    const/16 v6, 0x20

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/16 v6, 0x10

    .line 84
    .line 85
    :goto_2
    or-int/2addr v5, v6

    .line 86
    :cond_5
    :goto_3
    and-int/lit8 v6, p7, 0x4

    .line 87
    .line 88
    if-eqz v6, :cond_6

    .line 89
    .line 90
    or-int/lit16 v5, v5, 0x180

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_6
    and-int/lit16 v6, v9, 0x180

    .line 94
    .line 95
    if-nez v6, :cond_8

    .line 96
    .line 97
    invoke-interface {v11, v3}, LY/m;->b(F)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_7

    .line 102
    .line 103
    const/16 v6, 0x100

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_7
    const/16 v6, 0x80

    .line 107
    .line 108
    :goto_4
    or-int/2addr v5, v6

    .line 109
    :cond_8
    :goto_5
    and-int/lit8 v6, p7, 0x8

    .line 110
    .line 111
    if-eqz v6, :cond_a

    .line 112
    .line 113
    or-int/lit16 v5, v5, 0xc00

    .line 114
    .line 115
    :cond_9
    move-object/from16 v8, p3

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_a
    and-int/lit16 v8, v9, 0xc00

    .line 119
    .line 120
    if-nez v8, :cond_9

    .line 121
    .line 122
    move-object/from16 v8, p3

    .line 123
    .line 124
    invoke-interface {v11, v8}, LY/m;->U(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    if-eqz v12, :cond_b

    .line 129
    .line 130
    const/16 v12, 0x800

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_b
    const/16 v12, 0x400

    .line 134
    .line 135
    :goto_6
    or-int/2addr v5, v12

    .line 136
    :goto_7
    and-int/lit8 v12, p7, 0x10

    .line 137
    .line 138
    if-eqz v12, :cond_c

    .line 139
    .line 140
    or-int/lit16 v5, v5, 0x6000

    .line 141
    .line 142
    goto :goto_9

    .line 143
    :cond_c
    and-int/lit16 v12, v9, 0x6000

    .line 144
    .line 145
    if-nez v12, :cond_e

    .line 146
    .line 147
    invoke-interface {v11, v0}, LY/m;->F(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    if-eqz v12, :cond_d

    .line 152
    .line 153
    const/16 v12, 0x4000

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_d
    const/16 v12, 0x2000

    .line 157
    .line 158
    :goto_8
    or-int/2addr v5, v12

    .line 159
    :cond_e
    :goto_9
    and-int/lit16 v12, v5, 0x2493

    .line 160
    .line 161
    const/16 v13, 0x2492

    .line 162
    .line 163
    if-ne v12, v13, :cond_10

    .line 164
    .line 165
    invoke-interface {v11}, LY/m;->i()Z

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    if-nez v12, :cond_f

    .line 170
    .line 171
    goto :goto_a

    .line 172
    :cond_f
    invoke-interface {v11}, LY/m;->K()V

    .line 173
    .line 174
    .line 175
    move-object v4, v8

    .line 176
    goto/16 :goto_e

    .line 177
    .line 178
    :cond_10
    :goto_a
    if-eqz v6, :cond_11

    .line 179
    .line 180
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 181
    .line 182
    move-object v12, v6

    .line 183
    goto :goto_b

    .line 184
    :cond_11
    move-object v12, v8

    .line 185
    :goto_b
    invoke-static {}, LY/w;->L()Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-eqz v6, :cond_12

    .line 190
    .line 191
    const/4 v6, -0x1

    .line 192
    const-string v8, "com.revenuecat.purchases.ui.revenuecatui.components.stack.HorizontalStack (HorizontalStack.kt:34)"

    .line 193
    .line 194
    invoke-static {v4, v5, v6, v8}, LY/w;->U(IIILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_12
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;->getAlignment()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-static {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/AlignmentKt;->toAlignment(Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;)Ll0/e$c;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;->getDistribution()Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-static {v6, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/DistributionKt;->toHorizontalArrangement-3ABfNKs(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;F)LC/b$e;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    const/4 v8, 0x0

    .line 214
    invoke-static {v6, v4, v11, v8}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-static {v11, v8}, LY/h;->a(LY/m;I)I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    invoke-interface {v11}, LY/m;->r()LY/I;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    invoke-static {v11, v12}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    sget-object v15, LK0/g;->M:LK0/g$a;

    .line 231
    .line 232
    invoke-virtual {v15}, LK0/g$a;->a()Lie/a;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-interface {v11}, LY/m;->j()LY/d;

    .line 237
    .line 238
    .line 239
    move-result-object v16

    .line 240
    if-nez v16, :cond_13

    .line 241
    .line 242
    invoke-static {}, LY/h;->d()V

    .line 243
    .line 244
    .line 245
    :cond_13
    invoke-interface {v11}, LY/m;->I()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v11}, LY/m;->e()Z

    .line 249
    .line 250
    .line 251
    move-result v16

    .line 252
    if-eqz v16, :cond_14

    .line 253
    .line 254
    invoke-interface {v11, v8}, LY/m;->h(Lie/a;)V

    .line 255
    .line 256
    .line 257
    goto :goto_c

    .line 258
    :cond_14
    invoke-interface {v11}, LY/m;->s()V

    .line 259
    .line 260
    .line 261
    :goto_c
    invoke-static {v11}, LY/m2;->b(LY/m;)LY/m;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-virtual {v15}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-static {v8, v4, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v15}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-static {v8, v13, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v15}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-interface {v8}, LY/m;->e()Z

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    if-nez v7, :cond_15

    .line 288
    .line 289
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v13

    .line 297
    invoke-static {v7, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    if-nez v7, :cond_16

    .line 302
    .line 303
    :cond_15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-interface {v8, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-interface {v8, v6, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 315
    .line 316
    .line 317
    :cond_16
    invoke-virtual {v15}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-static {v8, v14, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 322
    .line 323
    .line 324
    sget-object v13, LC/J;->a:LC/J;

    .line 325
    .line 326
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$fillSpaceSpacer$1;

    .line 327
    .line 328
    invoke-direct {v4, v13}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$fillSpaceSpacer$1;-><init>(LC/I;)V

    .line 329
    .line 330
    .line 331
    const v6, -0x339e0e9f    # -5.9229572E7f

    .line 332
    .line 333
    .line 334
    const/4 v14, 0x1

    .line 335
    const/16 v15, 0x36

    .line 336
    .line 337
    invoke-static {v6, v14, v4, v11, v15}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    shr-int/lit8 v4, v5, 0xc

    .line 342
    .line 343
    and-int/lit8 v4, v4, 0xe

    .line 344
    .line 345
    invoke-static {v0, v11, v4}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    .line 346
    .line 347
    .line 348
    move-result-object v16

    .line 349
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;->getDistribution()Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    invoke-static/range {v16 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt;->HorizontalStack_TN_CM5M$lambda$2$lambda$0(LY/h2;)Lkotlin/jvm/functions/Function1;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    const v8, -0x1a449c14

    .line 358
    .line 359
    .line 360
    invoke-interface {v11, v8}, LY/m;->V(I)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v11, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    and-int/lit16 v5, v5, 0x380

    .line 368
    .line 369
    const/16 v8, 0x100

    .line 370
    .line 371
    if-ne v5, v8, :cond_17

    .line 372
    .line 373
    move v8, v14

    .line 374
    goto :goto_d

    .line 375
    :cond_17
    const/4 v8, 0x0

    .line 376
    :goto_d
    or-int/2addr v4, v8

    .line 377
    invoke-interface {v11, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    or-int/2addr v4, v5

    .line 382
    invoke-interface {v11}, LY/m;->D()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    if-nez v4, :cond_18

    .line 387
    .line 388
    sget-object v4, LY/m;->a:LY/m$a;

    .line 389
    .line 390
    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    if-ne v5, v4, :cond_19

    .line 395
    .line 396
    :cond_18
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;

    .line 397
    .line 398
    invoke-virtual {v2}, Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;->getDistribution()Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-virtual {v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    const/4 v8, 0x0

    .line 407
    move/from16 v5, p2

    .line 408
    .line 409
    invoke-direct/range {v3 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;FLie/o;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 410
    .line 411
    .line 412
    invoke-static/range {v16 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt;->HorizontalStack_TN_CM5M$lambda$2$lambda$0(LY/h2;)Lkotlin/jvm/functions/Function1;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    invoke-interface {v11, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    move-object v5, v3

    .line 423
    :cond_19
    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;

    .line 424
    .line 425
    invoke-interface {v11}, LY/m;->O()V

    .line 426
    .line 427
    .line 428
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;

    .line 429
    .line 430
    invoke-direct {v3, v5, v2, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;Lie/o;)V

    .line 431
    .line 432
    .line 433
    const v4, -0x704c1d83

    .line 434
    .line 435
    .line 436
    invoke-static {v4, v14, v3, v11, v15}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-interface {v3, v11, v10}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackScopeImpl;->getRowContent()Lie/o;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    invoke-interface {v4, v13, v11, v10}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    invoke-interface {v3, v11, v10}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    invoke-interface {v11}, LY/m;->x()V

    .line 454
    .line 455
    .line 456
    invoke-static {}, LY/w;->L()Z

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    if-eqz v3, :cond_1a

    .line 461
    .line 462
    invoke-static {}, LY/w;->T()V

    .line 463
    .line 464
    .line 465
    :cond_1a
    move-object v4, v12

    .line 466
    :goto_e
    invoke-interface {v11}, LY/m;->k()LY/B1;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    if-eqz v8, :cond_1b

    .line 471
    .line 472
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;

    .line 473
    .line 474
    move/from16 v3, p2

    .line 475
    .line 476
    move-object/from16 v5, p4

    .line 477
    .line 478
    move/from16 v7, p7

    .line 479
    .line 480
    move v6, v9

    .line 481
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/HorizontalStackKt$HorizontalStack$2;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;FLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;II)V

    .line 482
    .line 483
    .line 484
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 485
    .line 486
    .line 487
    :cond_1b
    return-void
.end method

.method private static final HorizontalStack_TN_CM5M$lambda$2$lambda$0(LY/h2;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    return-object p0
.end method
