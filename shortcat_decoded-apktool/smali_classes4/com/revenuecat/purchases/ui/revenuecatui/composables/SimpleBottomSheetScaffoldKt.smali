.class public final Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001aH\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\u0008\u0000\u0010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001b\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u000b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;",
        "sheetState",
        "Landroidx/compose/ui/e;",
        "modifier",
        "Lkotlin/Function0;",
        "LTd/L;",
        "content",
        "SimpleBottomSheetScaffold",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V",
        "",
        "show",
        "Li1/h;",
        "radius",
        "onClick",
        "Scrim-EUb7tLY",
        "(ZFLie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V",
        "Scrim",
        "T",
        "Lw/r0;",
        "blurAnimationSpec",
        "()Lw/r0;",
        "SimpleBottomSheetScaffold_Preview",
        "(LY/m;I)V",
        "",
        "ALPHA_SCRIM",
        "F",
        "targetRadius",
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


# static fields
.field private static final ALPHA_SCRIM:F = 0.6f


# direct methods
.method private static final Scrim-EUb7tLY(ZFLie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZF",
            "Lie/a;",
            "Landroidx/compose/ui/e;",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p2

    .line 4
    .line 5
    move-object/from16 v10, p4

    .line 6
    .line 7
    move/from16 v11, p6

    .line 8
    .line 9
    const v1, -0x1e3ea97c

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p5

    .line 13
    .line 14
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    and-int/lit8 v2, p7, 0x1

    .line 19
    .line 20
    const/4 v12, 0x2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    or-int/lit8 v2, v11, 0x6

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v2, v11, 0x6

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v6, v0}, LY/m;->a(Z)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v2, v12

    .line 39
    :goto_0
    or-int/2addr v2, v11

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v2, v11

    .line 42
    :goto_1
    and-int/lit8 v3, p7, 0x2

    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    or-int/lit8 v2, v2, 0x30

    .line 47
    .line 48
    move/from16 v13, p1

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    and-int/lit8 v3, v11, 0x30

    .line 52
    .line 53
    move/from16 v13, p1

    .line 54
    .line 55
    if-nez v3, :cond_5

    .line 56
    .line 57
    invoke-interface {v6, v13}, LY/m;->b(F)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    const/16 v3, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v3, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v2, v3

    .line 69
    :cond_5
    :goto_3
    and-int/lit8 v3, p7, 0x4

    .line 70
    .line 71
    if-eqz v3, :cond_6

    .line 72
    .line 73
    or-int/lit16 v2, v2, 0x180

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    and-int/lit16 v3, v11, 0x180

    .line 77
    .line 78
    if-nez v3, :cond_8

    .line 79
    .line 80
    invoke-interface {v6, v9}, LY/m;->F(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_7

    .line 85
    .line 86
    const/16 v3, 0x100

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    const/16 v3, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr v2, v3

    .line 92
    :cond_8
    :goto_5
    and-int/lit8 v3, p7, 0x8

    .line 93
    .line 94
    if-eqz v3, :cond_a

    .line 95
    .line 96
    or-int/lit16 v2, v2, 0xc00

    .line 97
    .line 98
    :cond_9
    move-object/from16 v4, p3

    .line 99
    .line 100
    goto :goto_7

    .line 101
    :cond_a
    and-int/lit16 v4, v11, 0xc00

    .line 102
    .line 103
    if-nez v4, :cond_9

    .line 104
    .line 105
    move-object/from16 v4, p3

    .line 106
    .line 107
    invoke-interface {v6, v4}, LY/m;->U(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_b

    .line 112
    .line 113
    const/16 v5, 0x800

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_b
    const/16 v5, 0x400

    .line 117
    .line 118
    :goto_6
    or-int/2addr v2, v5

    .line 119
    :goto_7
    and-int/lit8 v5, p7, 0x10

    .line 120
    .line 121
    if-eqz v5, :cond_d

    .line 122
    .line 123
    or-int/lit16 v2, v2, 0x6000

    .line 124
    .line 125
    :cond_c
    :goto_8
    move v14, v2

    .line 126
    goto :goto_a

    .line 127
    :cond_d
    and-int/lit16 v5, v11, 0x6000

    .line 128
    .line 129
    if-nez v5, :cond_c

    .line 130
    .line 131
    invoke-interface {v6, v10}, LY/m;->F(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_e

    .line 136
    .line 137
    const/16 v5, 0x4000

    .line 138
    .line 139
    goto :goto_9

    .line 140
    :cond_e
    const/16 v5, 0x2000

    .line 141
    .line 142
    :goto_9
    or-int/2addr v2, v5

    .line 143
    goto :goto_8

    .line 144
    :goto_a
    and-int/lit16 v2, v14, 0x2493

    .line 145
    .line 146
    const/16 v5, 0x2492

    .line 147
    .line 148
    if-ne v2, v5, :cond_10

    .line 149
    .line 150
    invoke-interface {v6}, LY/m;->i()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-nez v2, :cond_f

    .line 155
    .line 156
    goto :goto_b

    .line 157
    :cond_f
    invoke-interface {v6}, LY/m;->K()V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_f

    .line 161
    .line 162
    :cond_10
    :goto_b
    if-eqz v3, :cond_11

    .line 163
    .line 164
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 165
    .line 166
    move-object v15, v2

    .line 167
    goto :goto_c

    .line 168
    :cond_11
    move-object v15, v4

    .line 169
    :goto_c
    invoke-static {}, LY/w;->L()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_12

    .line 174
    .line 175
    const/4 v2, -0x1

    .line 176
    const-string v3, "com.revenuecat.purchases.ui.revenuecatui.composables.Scrim (SimpleBottomSheetScaffold.kt:110)"

    .line 177
    .line 178
    invoke-static {v1, v14, v2, v3}, LY/w;->U(IIILjava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_12
    const/4 v1, 0x0

    .line 182
    if-eqz v0, :cond_13

    .line 183
    .line 184
    move v2, v13

    .line 185
    goto :goto_d

    .line 186
    :cond_13
    int-to-float v2, v1

    .line 187
    invoke-static {v2}, Li1/h;->n(F)F

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    :goto_d
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->blurAnimationSpec()Lw/r0;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    const/4 v7, 0x0

    .line 196
    const/16 v8, 0xc

    .line 197
    .line 198
    const/4 v4, 0x0

    .line 199
    const/4 v5, 0x0

    .line 200
    invoke-static/range {v2 .. v8}, Lw/c;->c(FLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->Scrim_EUb7tLY$lambda$2(LY/h2;)F

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    const/4 v3, 0x0

    .line 209
    invoke-static {v15, v2, v3, v12, v3}, Lp0/b;->c(Landroidx/compose/ui/e;FLp0/c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    .line 214
    .line 215
    invoke-virtual {v4}, Ll0/e$a;->o()Ll0/e;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v6, v1}, LY/h;->a(LY/m;I)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-interface {v6}, LY/m;->r()LY/I;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-static {v6, v2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    sget-object v7, LK0/g;->M:LK0/g$a;

    .line 236
    .line 237
    invoke-virtual {v7}, LK0/g$a;->a()Lie/a;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-interface {v6}, LY/m;->j()LY/d;

    .line 242
    .line 243
    .line 244
    move-result-object v16

    .line 245
    if-nez v16, :cond_14

    .line 246
    .line 247
    invoke-static {}, LY/h;->d()V

    .line 248
    .line 249
    .line 250
    :cond_14
    invoke-interface {v6}, LY/m;->I()V

    .line 251
    .line 252
    .line 253
    invoke-interface {v6}, LY/m;->e()Z

    .line 254
    .line 255
    .line 256
    move-result v16

    .line 257
    if-eqz v16, :cond_15

    .line 258
    .line 259
    invoke-interface {v6, v8}, LY/m;->h(Lie/a;)V

    .line 260
    .line 261
    .line 262
    goto :goto_e

    .line 263
    :cond_15
    invoke-interface {v6}, LY/m;->s()V

    .line 264
    .line 265
    .line 266
    :goto_e
    invoke-static {v6}, LY/m2;->b(LY/m;)LY/m;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    invoke-virtual {v7}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v8, v4, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-static {v8, v5, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-interface {v8}, LY/m;->e()Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-nez v4, :cond_16

    .line 293
    .line 294
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez v4, :cond_17

    .line 307
    .line 308
    :cond_16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    invoke-interface {v8, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-interface {v8, v1, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 320
    .line 321
    .line 322
    :cond_17
    invoke-virtual {v7}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-static {v8, v2, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 327
    .line 328
    .line 329
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 330
    .line 331
    shr-int/lit8 v2, v14, 0xc

    .line 332
    .line 333
    and-int/lit8 v2, v2, 0xe

    .line 334
    .line 335
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-interface {v10, v6, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    sget-object v2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 343
    .line 344
    invoke-interface {v1, v2}, LC/c;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->blurAnimationSpec()Lw/r0;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    const/4 v4, 0x0

    .line 353
    const/4 v5, 0x0

    .line 354
    invoke-static {v3, v4, v12, v5}, Landroidx/compose/animation/f;->m(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-static {}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->blurAnimationSpec()Lw/r0;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    invoke-static {v7, v4, v12, v5}, Landroidx/compose/animation/f;->o(Lw/G;FILjava/lang/Object;)Landroidx/compose/animation/j;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$Scrim$1$1;

    .line 367
    .line 368
    invoke-direct {v5, v1, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$Scrim$1$1;-><init>(LC/c;Lie/a;)V

    .line 369
    .line 370
    .line 371
    const/16 v1, 0x36

    .line 372
    .line 373
    const v7, 0x3b6ac462

    .line 374
    .line 375
    .line 376
    const/4 v8, 0x1

    .line 377
    invoke-static {v7, v8, v5, v6, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    const/high16 v1, 0x30000

    .line 382
    .line 383
    and-int/lit8 v7, v14, 0xe

    .line 384
    .line 385
    or-int/2addr v7, v1

    .line 386
    const/16 v8, 0x10

    .line 387
    .line 388
    move-object v1, v2

    .line 389
    move-object v2, v3

    .line 390
    move-object v3, v4

    .line 391
    const/4 v4, 0x0

    .line 392
    invoke-static/range {v0 .. v8}, Lv/d;->e(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v6}, LY/m;->x()V

    .line 396
    .line 397
    .line 398
    invoke-static {}, LY/w;->L()Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_18

    .line 403
    .line 404
    invoke-static {}, LY/w;->T()V

    .line 405
    .line 406
    .line 407
    :cond_18
    move-object v4, v15

    .line 408
    :goto_f
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    if-eqz v8, :cond_19

    .line 413
    .line 414
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$Scrim$2;

    .line 415
    .line 416
    move/from16 v1, p0

    .line 417
    .line 418
    move/from16 v7, p7

    .line 419
    .line 420
    move-object v3, v9

    .line 421
    move-object v5, v10

    .line 422
    move v6, v11

    .line 423
    move v2, v13

    .line 424
    invoke-direct/range {v0 .. v7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$Scrim$2;-><init>(ZFLie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;II)V

    .line 425
    .line 426
    .line 427
    invoke-interface {v8, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 428
    .line 429
    .line 430
    :cond_19
    return-void
.end method

.method private static final Scrim_EUb7tLY$lambda$2(LY/h2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY/h2;",
            ")F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Li1/h;

    .line 6
    .line 7
    invoke-virtual {p0}, Li1/h;->t()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final SimpleBottomSheetScaffold(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;",
            "Landroidx/compose/ui/e;",
            "Lkotlin/jvm/functions/Function2;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const-string v0, "sheetState"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "content"

    .line 13
    .line 14
    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x2f94e92e

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p3

    .line 21
    .line 22
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    and-int/lit8 v2, p5, 0x1

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    or-int/lit8 v2, v4, 0x6

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    and-int/lit8 v2, v4, 0x6

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    invoke-interface {v10, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    move v2, v5

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v2, 0x2

    .line 47
    :goto_0
    or-int/2addr v2, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v2, v4

    .line 50
    :goto_1
    and-int/lit8 v6, p5, 0x2

    .line 51
    .line 52
    if-eqz v6, :cond_4

    .line 53
    .line 54
    or-int/lit8 v2, v2, 0x30

    .line 55
    .line 56
    :cond_3
    move-object/from16 v7, p1

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    and-int/lit8 v7, v4, 0x30

    .line 60
    .line 61
    if-nez v7, :cond_3

    .line 62
    .line 63
    move-object/from16 v7, p1

    .line 64
    .line 65
    invoke-interface {v10, v7}, LY/m;->U(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_5

    .line 70
    .line 71
    const/16 v8, 0x20

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    const/16 v8, 0x10

    .line 75
    .line 76
    :goto_2
    or-int/2addr v2, v8

    .line 77
    :goto_3
    and-int/lit8 v8, p5, 0x4

    .line 78
    .line 79
    if-eqz v8, :cond_6

    .line 80
    .line 81
    or-int/lit16 v2, v2, 0x180

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_6
    and-int/lit16 v8, v4, 0x180

    .line 85
    .line 86
    if-nez v8, :cond_8

    .line 87
    .line 88
    invoke-interface {v10, v3}, LY/m;->F(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_7

    .line 93
    .line 94
    const/16 v8, 0x100

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_7
    const/16 v8, 0x80

    .line 98
    .line 99
    :goto_4
    or-int/2addr v2, v8

    .line 100
    :cond_8
    :goto_5
    and-int/lit16 v8, v2, 0x93

    .line 101
    .line 102
    const/16 v9, 0x92

    .line 103
    .line 104
    if-ne v8, v9, :cond_a

    .line 105
    .line 106
    invoke-interface {v10}, LY/m;->i()Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-nez v8, :cond_9

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_9
    invoke-interface {v10}, LY/m;->K()V

    .line 114
    .line 115
    .line 116
    move-object v2, v7

    .line 117
    goto/16 :goto_9

    .line 118
    .line 119
    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    .line 120
    .line 121
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 122
    .line 123
    move-object v14, v6

    .line 124
    goto :goto_7

    .line 125
    :cond_b
    move-object v14, v7

    .line 126
    :goto_7
    invoke-static {}, LY/w;->L()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_c

    .line 131
    .line 132
    const/4 v6, -0x1

    .line 133
    const-string v7, "com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffold (SimpleBottomSheetScaffold.kt:47)"

    .line 134
    .line 135
    invoke-static {v0, v2, v6, v7}, LY/w;->U(IIILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_c
    sget-object v0, Ll0/e;->a:Ll0/e$a;

    .line 139
    .line 140
    invoke-virtual {v0}, Ll0/e$a;->o()Ll0/e;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    const/4 v7, 0x0

    .line 145
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {v10, v7}, LY/h;->a(LY/m;I)I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    invoke-interface {v10}, LY/m;->r()LY/I;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-static {v10, v14}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    sget-object v12, LK0/g;->M:LK0/g$a;

    .line 162
    .line 163
    invoke-virtual {v12}, LK0/g$a;->a()Lie/a;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-interface {v10}, LY/m;->j()LY/d;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    if-nez v15, :cond_d

    .line 172
    .line 173
    invoke-static {}, LY/h;->d()V

    .line 174
    .line 175
    .line 176
    :cond_d
    invoke-interface {v10}, LY/m;->I()V

    .line 177
    .line 178
    .line 179
    invoke-interface {v10}, LY/m;->e()Z

    .line 180
    .line 181
    .line 182
    move-result v15

    .line 183
    if-eqz v15, :cond_e

    .line 184
    .line 185
    invoke-interface {v10, v13}, LY/m;->h(Lie/a;)V

    .line 186
    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_e
    invoke-interface {v10}, LY/m;->s()V

    .line 190
    .line 191
    .line 192
    :goto_8
    invoke-static {v10}, LY/m2;->b(LY/m;)LY/m;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    invoke-virtual {v12}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    invoke-static {v13, v6, v15}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-static {v13, v9, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    invoke-interface {v13}, LY/m;->e()Z

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    if-nez v9, :cond_f

    .line 219
    .line 220
    invoke-interface {v13}, LY/m;->D()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v15

    .line 228
    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    if-nez v9, :cond_10

    .line 233
    .line 234
    :cond_f
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-interface {v13, v9}, LY/m;->u(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-interface {v13, v8, v6}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 246
    .line 247
    .line 248
    :cond_10
    invoke-virtual {v12}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-static {v13, v11, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 253
    .line 254
    .line 255
    sget-object v13, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 256
    .line 257
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;->getBackgroundBlur()Z

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    const/16 v8, 0xa

    .line 262
    .line 263
    int-to-float v8, v8

    .line 264
    invoke-static {v8}, Li1/h;->n(F)F

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    const v9, -0x12cf40c5

    .line 269
    .line 270
    .line 271
    invoke-interface {v10, v9}, LY/m;->V(I)V

    .line 272
    .line 273
    .line 274
    and-int/lit8 v2, v2, 0xe

    .line 275
    .line 276
    const/4 v15, 0x1

    .line 277
    if-ne v2, v5, :cond_11

    .line 278
    .line 279
    move v7, v15

    .line 280
    :cond_11
    invoke-interface {v10}, LY/m;->D()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    if-nez v7, :cond_12

    .line 285
    .line 286
    sget-object v5, LY/m;->a:LY/m$a;

    .line 287
    .line 288
    invoke-virtual {v5}, LY/m$a;->a()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    if-ne v2, v5, :cond_13

    .line 293
    .line 294
    :cond_12
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$1$1;

    .line 295
    .line 296
    invoke-direct {v2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v10, v2}, LY/m;->u(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :cond_13
    move-object v7, v2

    .line 303
    check-cast v7, Lie/a;

    .line 304
    .line 305
    invoke-interface {v10}, LY/m;->O()V

    .line 306
    .line 307
    .line 308
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$2;

    .line 309
    .line 310
    invoke-direct {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$2;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 311
    .line 312
    .line 313
    const v5, 0x2959be4b

    .line 314
    .line 315
    .line 316
    const/16 v9, 0x36

    .line 317
    .line 318
    invoke-static {v5, v15, v2, v10, v9}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    const/16 v11, 0x6030

    .line 323
    .line 324
    const/16 v12, 0x8

    .line 325
    .line 326
    move v5, v6

    .line 327
    move v6, v8

    .line 328
    const/4 v8, 0x0

    .line 329
    move/from16 v16, v9

    .line 330
    .line 331
    move-object v9, v2

    .line 332
    move/from16 v2, v16

    .line 333
    .line 334
    invoke-static/range {v5 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->Scrim-EUb7tLY(ZFLie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;->getVisible()Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    sget-object v6, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 342
    .line 343
    invoke-virtual {v0}, Ll0/e$a;->b()Ll0/e;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-interface {v13, v6, v0}, LC/c;->b(Landroidx/compose/ui/e;Ll0/e;)Landroidx/compose/ui/e;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$3;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$3;

    .line 352
    .line 353
    const/4 v7, 0x0

    .line 354
    invoke-static {v7, v0, v15, v7}, Landroidx/compose/animation/f;->z(Lw/G;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/h;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    sget-object v8, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$4;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$4;

    .line 359
    .line 360
    invoke-static {v7, v8, v15, v7}, Landroidx/compose/animation/f;->E(Lw/G;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/j;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5;

    .line 365
    .line 366
    invoke-direct {v7, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;)V

    .line 367
    .line 368
    .line 369
    const v9, 0x5e12db0c

    .line 370
    .line 371
    .line 372
    invoke-static {v9, v15, v7, v10, v2}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    const v12, 0x30d80

    .line 377
    .line 378
    .line 379
    const/16 v13, 0x10

    .line 380
    .line 381
    const/4 v9, 0x0

    .line 382
    move-object v7, v0

    .line 383
    move-object v11, v10

    .line 384
    move-object v10, v2

    .line 385
    invoke-static/range {v5 .. v13}, Lv/d;->e(ZLandroidx/compose/ui/e;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lie/o;LY/m;II)V

    .line 386
    .line 387
    .line 388
    move-object v10, v11

    .line 389
    invoke-interface {v10}, LY/m;->x()V

    .line 390
    .line 391
    .line 392
    invoke-static {}, LY/w;->L()Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_14

    .line 397
    .line 398
    invoke-static {}, LY/w;->T()V

    .line 399
    .line 400
    .line 401
    :cond_14
    move-object v2, v14

    .line 402
    :goto_9
    invoke-interface {v10}, LY/m;->k()LY/B1;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    if-eqz v6, :cond_15

    .line 407
    .line 408
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$2;

    .line 409
    .line 410
    move/from16 v5, p5

    .line 411
    .line 412
    invoke-direct/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;II)V

    .line 413
    .line 414
    .line 415
    invoke-interface {v6, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 416
    .line 417
    .line 418
    :cond_15
    return-void
.end method

.method private static final SimpleBottomSheetScaffold_Preview(LY/m;I)V
    .locals 12

    .line 1
    const v0, -0xfe0d62a

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, LY/m;->g(I)LY/m;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-interface {v4}, LY/m;->i()Z

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
    invoke-interface {v4}, LY/m;->K()V

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
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffold_Preview (SimpleBottomSheetScaffold.kt:147)"

    .line 29
    .line 30
    invoke-static {v0, p1, p0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;

    .line 34
    .line 35
    invoke-direct {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt;->getLambda-2$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const/4 v9, 0x4

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v6, 0x1

    .line 47
    const/4 v8, 0x0

    .line 48
    move-object v5, v1

    .line 49
    invoke-static/range {v5 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;->show$default(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;ZLkotlin/jvm/functions/Function2;Lie/a;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-static {v0, v5, v2, v3}, Landroidx/compose/foundation/layout/s;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 62
    .line 63
    invoke-virtual {v0}, Ls0/r0$a;->e()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    const/4 v10, 0x2

    .line 68
    const/4 v11, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ComposableSingletons$SimpleBottomSheetScaffoldKt;->getLambda-3$revenuecatui_defaultsBc8Release()Lkotlin/jvm/functions/Function2;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const/16 v5, 0x1b0

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    invoke-static/range {v1 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->SimpleBottomSheetScaffold(Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleSheetState;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 82
    .line 83
    .line 84
    invoke-static {}, LY/w;->L()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_3

    .line 89
    .line 90
    invoke-static {}, LY/w;->T()V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_1
    invoke-interface {v4}, LY/m;->k()LY/B1;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-eqz p0, :cond_4

    .line 98
    .line 99
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold_Preview$1;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold_Preview$1;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void
.end method

.method public static final synthetic access$Scrim-EUb7tLY(ZFLie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->Scrim-EUb7tLY(ZFLie/a;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SimpleBottomSheetScaffold_Preview(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/SimpleBottomSheetScaffoldKt;->SimpleBottomSheetScaffold_Preview(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final blurAnimationSpec()Lw/r0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lw/r0;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1, v0}, Lw/j;->j(IILw/D;ILjava/lang/Object;)Lw/r0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method
