.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a3\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001\u00a2\u0006\u0004\u0008\u0002\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u0001H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u000f\u0010\r\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000c\u001a\u000f\u0010\u000e\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000c\u001a\u000f\u0010\u000f\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000c\u001a\u000f\u0010\u0010\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000c\u001a\u000f\u0010\u0011\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u000c\u001a\u000f\u0010\u0012\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/e;",
        "Lcom/revenuecat/purchases/paywalls/components/properties/Size;",
        "size",
        "Ll0/e$b;",
        "horizontalAlignment",
        "Ll0/e$c;",
        "verticalAlignment",
        "(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;)Landroidx/compose/ui/e;",
        "LTd/L;",
        "Size_Preview",
        "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V",
        "Size_Preview_FitFit",
        "(LY/m;I)V",
        "Size_Preview_FillFill",
        "Size_Preview_FillFit",
        "Size_Preview_FitFill",
        "Size_Preview_FixedFixed",
        "Size_Preview_HorizontalAlignment",
        "Size_Preview_VerticalAlignment",
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
.method private static final Size_Preview(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    const v0, 0xdb19cba

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p1

    .line 9
    .line 10
    invoke-interface {v2, v0}, LY/m;->g(I)LY/m;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    and-int/lit8 v2, v6, 0x6

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v7, v1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v2, v3

    .line 28
    :goto_0
    or-int/2addr v2, v6

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v2, v6

    .line 31
    :goto_1
    and-int/lit8 v4, v2, 0x3

    .line 32
    .line 33
    if-ne v4, v3, :cond_3

    .line 34
    .line 35
    invoke-interface {v7}, LY/m;->i()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-interface {v7}, LY/m;->K()V

    .line 43
    .line 44
    .line 45
    move-object/from16 v28, v7

    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_3
    :goto_2
    invoke-static {}, LY/w;->L()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    const/4 v3, -0x1

    .line 56
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview (Size.kt:59)"

    .line 57
    .line 58
    invoke-static {v0, v2, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_4
    sget-object v8, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 62
    .line 63
    const/16 v0, 0xc8

    .line 64
    .line 65
    int-to-float v0, v0

    .line 66
    invoke-static {v0}, Li1/h;->n(F)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/s;->m(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v14, Ll0/e;->a:Ll0/e$a;

    .line 75
    .line 76
    invoke-virtual {v14}, Ll0/e$a;->e()Ll0/e;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const/4 v15, 0x0

    .line 81
    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v7, v15}, LY/h;->a(LY/m;I)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-interface {v7}, LY/m;->r()LY/I;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {v7, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v16, LK0/g;->M:LK0/g$a;

    .line 98
    .line 99
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->a()Lie/a;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-interface {v7}, LY/m;->j()LY/d;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    if-nez v9, :cond_5

    .line 108
    .line 109
    invoke-static {}, LY/h;->d()V

    .line 110
    .line 111
    .line 112
    :cond_5
    invoke-interface {v7}, LY/m;->I()V

    .line 113
    .line 114
    .line 115
    invoke-interface {v7}, LY/m;->e()Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_6

    .line 120
    .line 121
    invoke-interface {v7, v5}, LY/m;->h(Lie/a;)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    invoke-interface {v7}, LY/m;->s()V

    .line 126
    .line 127
    .line 128
    :goto_3
    invoke-static {v7}, LY/m2;->b(LY/m;)LY/m;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-static {v5, v2, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-static {v5, v4, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-interface {v5}, LY/m;->e()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_7

    .line 155
    .line 156
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    invoke-static {v4, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-nez v4, :cond_8

    .line 169
    .line 170
    :cond_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-interface {v5, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-interface {v5, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {v5, v0, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    sget-object v0, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 192
    .line 193
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 194
    .line 195
    invoke-virtual {v0}, Ls0/r0$a;->h()J

    .line 196
    .line 197
    .line 198
    move-result-wide v9

    .line 199
    const/4 v12, 0x2

    .line 200
    const/4 v13, 0x0

    .line 201
    const/4 v11, 0x0

    .line 202
    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const/4 v4, 0x6

    .line 207
    const/4 v5, 0x0

    .line 208
    const/4 v2, 0x0

    .line 209
    const/4 v3, 0x0

    .line 210
    invoke-static/range {v0 .. v5}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v14}, Ll0/e$a;->e()Ll0/e;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-static {v7, v15}, LY/h;->a(LY/m;I)I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    invoke-interface {v7}, LY/m;->r()LY/I;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-static {v7, v0}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->a()Lie/a;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-interface {v7}, LY/m;->j()LY/d;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    if-nez v8, :cond_9

    .line 243
    .line 244
    invoke-static {}, LY/h;->d()V

    .line 245
    .line 246
    .line 247
    :cond_9
    invoke-interface {v7}, LY/m;->I()V

    .line 248
    .line 249
    .line 250
    invoke-interface {v7}, LY/m;->e()Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-eqz v8, :cond_a

    .line 255
    .line 256
    invoke-interface {v7, v5}, LY/m;->h(Lie/a;)V

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_a
    invoke-interface {v7}, LY/m;->s()V

    .line 261
    .line 262
    .line 263
    :goto_4
    invoke-static {v7}, LY/m2;->b(LY/m;)LY/m;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-static {v5, v2, v8}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-static {v5, v4, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-interface {v5}, LY/m;->e()Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-nez v4, :cond_b

    .line 290
    .line 291
    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    invoke-static {v4, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-nez v4, :cond_c

    .line 304
    .line 305
    :cond_b
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-interface {v5, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-interface {v5, v3, v2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 317
    .line 318
    .line 319
    :cond_c
    invoke-virtual/range {v16 .. v16}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-static {v5, v0, v2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    const/16 v30, 0x0

    .line 327
    .line 328
    const v31, 0x1fffe

    .line 329
    .line 330
    .line 331
    move-object/from16 v28, v7

    .line 332
    .line 333
    const-string v7, "Hello world!"

    .line 334
    .line 335
    const/4 v8, 0x0

    .line 336
    const-wide/16 v9, 0x0

    .line 337
    .line 338
    const-wide/16 v11, 0x0

    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const/4 v14, 0x0

    .line 342
    const/4 v15, 0x0

    .line 343
    const-wide/16 v16, 0x0

    .line 344
    .line 345
    const/16 v18, 0x0

    .line 346
    .line 347
    const/16 v19, 0x0

    .line 348
    .line 349
    const-wide/16 v20, 0x0

    .line 350
    .line 351
    const/16 v22, 0x0

    .line 352
    .line 353
    const/16 v23, 0x0

    .line 354
    .line 355
    const/16 v24, 0x0

    .line 356
    .line 357
    const/16 v25, 0x0

    .line 358
    .line 359
    const/16 v26, 0x0

    .line 360
    .line 361
    const/16 v27, 0x0

    .line 362
    .line 363
    const/16 v29, 0x6

    .line 364
    .line 365
    invoke-static/range {v7 .. v31}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 366
    .line 367
    .line 368
    invoke-interface/range {v28 .. v28}, LY/m;->x()V

    .line 369
    .line 370
    .line 371
    invoke-interface/range {v28 .. v28}, LY/m;->x()V

    .line 372
    .line 373
    .line 374
    invoke-static {}, LY/w;->L()Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    if-eqz v0, :cond_d

    .line 379
    .line 380
    invoke-static {}, LY/w;->T()V

    .line 381
    .line 382
    .line 383
    :cond_d
    :goto_5
    invoke-interface/range {v28 .. v28}, LY/m;->k()LY/B1;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    if-eqz v0, :cond_e

    .line 388
    .line 389
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview$2;

    .line 390
    .line 391
    invoke-direct {v2, v1, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview$2;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/Size;I)V

    .line 392
    .line 393
    .line 394
    invoke-interface {v0, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 395
    .line 396
    .line 397
    :cond_e
    return-void
.end method

.method private static final Size_Preview_FillFill(LY/m;I)V
    .locals 3

    .line 1
    const v0, -0x41ce8610

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FillFill (Size.kt:85)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 36
    .line 37
    invoke-direct {v0, v1, v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x6

    .line 41
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, LY/w;->L()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-static {}, LY/w;->T()V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FillFill$1;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FillFill$1;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method private static final Size_Preview_FillFit(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x3f020b2a

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FillFit (Size.kt:91)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 36
    .line 37
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x6

    .line 43
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, LY/w;->L()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-static {}, LY/w;->T()V

    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FillFit$1;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FillFit$1;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    return-void
.end method

.method private static final Size_Preview_FitFill(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x1bb285d0

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FitFill (Size.kt:97)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 36
    .line 37
    sget-object v2, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x6

    .line 43
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, LY/w;->L()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-static {}, LY/w;->T()V

    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FitFill$1;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FitFill$1;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    return-void
.end method

.method private static final Size_Preview_FitFit(LY/m;I)V
    .locals 3

    .line 1
    const v0, 0x2940034a

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FitFit (Size.kt:79)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 34
    .line 35
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 36
    .line 37
    invoke-direct {v0, v1, v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x6

    .line 41
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, LY/w;->L()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-static {}, LY/w;->T()V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-eqz p0, :cond_4

    .line 58
    .line 59
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FitFit$1;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FitFit$1;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method private static final Size_Preview_FixedFixed(LY/m;I)V
    .locals 5

    .line 1
    const v0, -0x2b78a216

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
    const-string v2, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_FixedFixed (Size.kt:103)"

    .line 29
    .line 30
    invoke-static {v0, p1, v1, v2}, LY/w;->U(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    new-instance v0, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 34
    .line 35
    new-instance v1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 36
    .line 37
    const/16 v2, 0x32

    .line 38
    .line 39
    invoke-static {v2}, LTd/D;->b(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-direct {v1, v3, v4}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 48
    .line 49
    invoke-static {v2}, LTd/D;->b(I)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-direct {v3, v2, v4}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1, v3}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-static {v0, p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {}, LY/w;->L()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-static {}, LY/w;->T()V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_1
    invoke-interface {p0}, LY/m;->k()LY/B1;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FixedFixed$1;

    .line 79
    .line 80
    invoke-direct {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_FixedFixed$1;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, v0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    return-void
.end method

.method private static final Size_Preview_HorizontalAlignment(LY/m;I)V
    .locals 27

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x4c2bea45

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v2}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v2}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    move-object/from16 v23, v2

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    const/4 v3, -0x1

    .line 35
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_HorizontalAlignment (Size.kt:109)"

    .line 36
    .line 37
    invoke-static {v1, v0, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 41
    .line 42
    const/16 v1, 0xc8

    .line 43
    .line 44
    int-to-float v1, v1

    .line 45
    invoke-static {v1}, Li1/h;->n(F)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/s;->m(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    .line 54
    .line 55
    invoke-virtual {v3}, Ll0/e$a;->e()Ll0/e;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const/4 v11, 0x0

    .line 60
    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v2, v11}, LY/h;->a(LY/m;I)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-interface {v2}, LY/m;->r()LY/I;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-static {v2, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sget-object v12, LK0/g;->M:LK0/g$a;

    .line 77
    .line 78
    invoke-virtual {v12}, LK0/g$a;->a()Lie/a;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-interface {v2}, LY/m;->j()LY/d;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    if-nez v9, :cond_3

    .line 87
    .line 88
    invoke-static {}, LY/h;->d()V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-interface {v2}, LY/m;->I()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v2}, LY/m;->e()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    invoke-interface {v2, v8}, LY/m;->h(Lie/a;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    invoke-interface {v2}, LY/m;->s()V

    .line 105
    .line 106
    .line 107
    :goto_1
    invoke-static {v2}, LY/m2;->b(LY/m;)LY/m;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v12}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-static {v8, v4, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {v8, v7, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-interface {v8}, LY/m;->e()Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-nez v7, :cond_5

    .line 134
    .line 135
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-nez v7, :cond_6

    .line 148
    .line 149
    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-interface {v8, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-interface {v8, v6, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    :cond_6
    invoke-virtual {v12}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v8, v1, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 171
    .line 172
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 173
    .line 174
    invoke-virtual {v1}, Ls0/r0$a;->h()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v9, 0x2

    .line 179
    const/4 v10, 0x0

    .line 180
    const/4 v8, 0x0

    .line 181
    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const/16 v4, 0x96

    .line 186
    .line 187
    int-to-float v4, v4

    .line 188
    invoke-static {v4}, Li1/h;->n(F)F

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/s;->q(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    new-instance v6, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 197
    .line 198
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 199
    .line 200
    invoke-direct {v6, v1, v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Ll0/e$a;->j()Ll0/e$b;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    const/4 v9, 0x4

    .line 208
    invoke-static/range {v5 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v3}, Ll0/e$a;->e()Ll0/e;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-static {v2, v11}, LY/h;->a(LY/m;I)I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    invoke-interface {v2}, LY/m;->r()LY/I;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-static {v2, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v12}, LK0/g$a;->a()Lie/a;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-interface {v2}, LY/m;->j()LY/d;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    if-nez v7, :cond_7

    .line 241
    .line 242
    invoke-static {}, LY/h;->d()V

    .line 243
    .line 244
    .line 245
    :cond_7
    invoke-interface {v2}, LY/m;->I()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v2}, LY/m;->e()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_8

    .line 253
    .line 254
    invoke-interface {v2, v6}, LY/m;->h(Lie/a;)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_8
    invoke-interface {v2}, LY/m;->s()V

    .line 259
    .line 260
    .line 261
    :goto_2
    invoke-static {v2}, LY/m2;->b(LY/m;)LY/m;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-virtual {v12}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-static {v6, v3, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static {v6, v5, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-interface {v6}, LY/m;->e()Z

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-nez v5, :cond_9

    .line 288
    .line 289
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-nez v5, :cond_a

    .line 302
    .line 303
    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    invoke-interface {v6, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-interface {v6, v4, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 315
    .line 316
    .line 317
    :cond_a
    invoke-virtual {v12}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-static {v6, v1, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 322
    .line 323
    .line 324
    const/16 v25, 0x0

    .line 325
    .line 326
    const v26, 0x1fffe

    .line 327
    .line 328
    .line 329
    move-object/from16 v23, v2

    .line 330
    .line 331
    const-string v2, "Hello world!"

    .line 332
    .line 333
    const/4 v3, 0x0

    .line 334
    const-wide/16 v4, 0x0

    .line 335
    .line 336
    const-wide/16 v6, 0x0

    .line 337
    .line 338
    const/4 v8, 0x0

    .line 339
    const/4 v9, 0x0

    .line 340
    const/4 v10, 0x0

    .line 341
    const-wide/16 v11, 0x0

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const/4 v14, 0x0

    .line 345
    const-wide/16 v15, 0x0

    .line 346
    .line 347
    const/16 v17, 0x0

    .line 348
    .line 349
    const/16 v18, 0x0

    .line 350
    .line 351
    const/16 v19, 0x0

    .line 352
    .line 353
    const/16 v20, 0x0

    .line 354
    .line 355
    const/16 v21, 0x0

    .line 356
    .line 357
    const/16 v22, 0x0

    .line 358
    .line 359
    const/16 v24, 0x6

    .line 360
    .line 361
    invoke-static/range {v2 .. v26}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 362
    .line 363
    .line 364
    invoke-interface/range {v23 .. v23}, LY/m;->x()V

    .line 365
    .line 366
    .line 367
    invoke-interface/range {v23 .. v23}, LY/m;->x()V

    .line 368
    .line 369
    .line 370
    invoke-static {}, LY/w;->L()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_b

    .line 375
    .line 376
    invoke-static {}, LY/w;->T()V

    .line 377
    .line 378
    .line 379
    :cond_b
    :goto_3
    invoke-interface/range {v23 .. v23}, LY/m;->k()LY/B1;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    if-eqz v1, :cond_c

    .line 384
    .line 385
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_HorizontalAlignment$2;

    .line 386
    .line 387
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_HorizontalAlignment$2;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 391
    .line 392
    .line 393
    :cond_c
    return-void
.end method

.method private static final Size_Preview_VerticalAlignment(LY/m;I)V
    .locals 27

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, 0x1addbde9

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, LY/m;->g(I)LY/m;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v2}, LY/m;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {v2}, LY/m;->K()V

    .line 22
    .line 23
    .line 24
    move-object/from16 v23, v2

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    const/4 v3, -0x1

    .line 35
    const-string v4, "com.revenuecat.purchases.ui.revenuecatui.components.modifier.Size_Preview_VerticalAlignment (Size.kt:132)"

    .line 36
    .line 37
    invoke-static {v1, v0, v3, v4}, LY/w;->U(IIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    sget-object v5, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 41
    .line 42
    const/16 v1, 0xc8

    .line 43
    .line 44
    int-to-float v1, v1

    .line 45
    invoke-static {v1}, Li1/h;->n(F)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/s;->m(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v3, Ll0/e;->a:Ll0/e$a;

    .line 54
    .line 55
    invoke-virtual {v3}, Ll0/e$a;->e()Ll0/e;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const/4 v11, 0x0

    .line 60
    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v2, v11}, LY/h;->a(LY/m;I)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-interface {v2}, LY/m;->r()LY/I;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-static {v2, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sget-object v12, LK0/g;->M:LK0/g$a;

    .line 77
    .line 78
    invoke-virtual {v12}, LK0/g$a;->a()Lie/a;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-interface {v2}, LY/m;->j()LY/d;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    if-nez v9, :cond_3

    .line 87
    .line 88
    invoke-static {}, LY/h;->d()V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-interface {v2}, LY/m;->I()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v2}, LY/m;->e()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_4

    .line 99
    .line 100
    invoke-interface {v2, v8}, LY/m;->h(Lie/a;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    invoke-interface {v2}, LY/m;->s()V

    .line 105
    .line 106
    .line 107
    :goto_1
    invoke-static {v2}, LY/m2;->b(LY/m;)LY/m;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v12}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-static {v8, v4, v9}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {v8, v7, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-interface {v8}, LY/m;->e()Z

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-nez v7, :cond_5

    .line 134
    .line 135
    invoke-interface {v8}, LY/m;->D()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-static {v7, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-nez v7, :cond_6

    .line 148
    .line 149
    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-interface {v8, v7}, LY/m;->u(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-interface {v8, v6, v4}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    :cond_6
    invoke-virtual {v12}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v8, v1, v4}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    sget-object v1, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    .line 171
    .line 172
    sget-object v1, Ls0/r0;->b:Ls0/r0$a;

    .line 173
    .line 174
    invoke-virtual {v1}, Ls0/r0$a;->h()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v9, 0x2

    .line 179
    const/4 v10, 0x0

    .line 180
    const/4 v8, 0x0

    .line 181
    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLs0/E1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const/16 v4, 0x96

    .line 186
    .line 187
    int-to-float v4, v4

    .line 188
    invoke-static {v4}, Li1/h;->n(F)F

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/s;->l(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    new-instance v6, Lcom/revenuecat/purchases/paywalls/components/properties/Size;

    .line 197
    .line 198
    sget-object v1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;->INSTANCE:Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 199
    .line 200
    invoke-direct {v6, v1, v1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;-><init>(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Ll0/e$a;->a()Ll0/e$c;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    const/4 v7, 0x0

    .line 208
    invoke-static/range {v5 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v3}, Ll0/e$a;->e()Ll0/e;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-static {v2, v11}, LY/h;->a(LY/m;I)I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    invoke-interface {v2}, LY/m;->r()LY/I;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-static {v2, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v12}, LK0/g$a;->a()Lie/a;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-interface {v2}, LY/m;->j()LY/d;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    if-nez v7, :cond_7

    .line 241
    .line 242
    invoke-static {}, LY/h;->d()V

    .line 243
    .line 244
    .line 245
    :cond_7
    invoke-interface {v2}, LY/m;->I()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v2}, LY/m;->e()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_8

    .line 253
    .line 254
    invoke-interface {v2, v6}, LY/m;->h(Lie/a;)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_8
    invoke-interface {v2}, LY/m;->s()V

    .line 259
    .line 260
    .line 261
    :goto_2
    invoke-static {v2}, LY/m2;->b(LY/m;)LY/m;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-virtual {v12}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-static {v6, v3, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static {v6, v5, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-interface {v6}, LY/m;->e()Z

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-nez v5, :cond_9

    .line 288
    .line 289
    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-nez v5, :cond_a

    .line 302
    .line 303
    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    invoke-interface {v6, v5}, LY/m;->u(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-interface {v6, v4, v3}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 315
    .line 316
    .line 317
    :cond_a
    invoke-virtual {v12}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-static {v6, v1, v3}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 322
    .line 323
    .line 324
    const/16 v25, 0x0

    .line 325
    .line 326
    const v26, 0x1fffe

    .line 327
    .line 328
    .line 329
    move-object/from16 v23, v2

    .line 330
    .line 331
    const-string v2, "Hello world!"

    .line 332
    .line 333
    const/4 v3, 0x0

    .line 334
    const-wide/16 v4, 0x0

    .line 335
    .line 336
    const-wide/16 v6, 0x0

    .line 337
    .line 338
    const/4 v8, 0x0

    .line 339
    const/4 v9, 0x0

    .line 340
    const/4 v10, 0x0

    .line 341
    const-wide/16 v11, 0x0

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const/4 v14, 0x0

    .line 345
    const-wide/16 v15, 0x0

    .line 346
    .line 347
    const/16 v17, 0x0

    .line 348
    .line 349
    const/16 v18, 0x0

    .line 350
    .line 351
    const/16 v19, 0x0

    .line 352
    .line 353
    const/16 v20, 0x0

    .line 354
    .line 355
    const/16 v21, 0x0

    .line 356
    .line 357
    const/16 v22, 0x0

    .line 358
    .line 359
    const/16 v24, 0x6

    .line 360
    .line 361
    invoke-static/range {v2 .. v26}, LU/j0;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLY0/H;LY0/L;LY0/u;JLg1/k;Lg1/j;JIZIILkotlin/jvm/functions/Function1;LU0/Y0;LY/m;III)V

    .line 362
    .line 363
    .line 364
    invoke-interface/range {v23 .. v23}, LY/m;->x()V

    .line 365
    .line 366
    .line 367
    invoke-interface/range {v23 .. v23}, LY/m;->x()V

    .line 368
    .line 369
    .line 370
    invoke-static {}, LY/w;->L()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_b

    .line 375
    .line 376
    invoke-static {}, LY/w;->T()V

    .line 377
    .line 378
    .line 379
    :cond_b
    :goto_3
    invoke-interface/range {v23 .. v23}, LY/m;->k()LY/B1;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    if-eqz v1, :cond_c

    .line 384
    .line 385
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_VerticalAlignment$2;

    .line 386
    .line 387
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt$Size_Preview_VerticalAlignment$2;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v1, v2}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 391
    .line 392
    .line 393
    :cond_c
    return-void
.end method

.method public static final synthetic access$Size_Preview(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview(Lcom/revenuecat/purchases/paywalls/components/properties/Size;LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Size_Preview_FillFill(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview_FillFill(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Size_Preview_FillFit(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview_FillFit(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Size_Preview_FitFill(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview_FitFill(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Size_Preview_FitFit(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview_FitFit(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Size_Preview_FixedFixed(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview_FixedFixed(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Size_Preview_HorizontalAlignment(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview_HorizontalAlignment(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$Size_Preview_VerticalAlignment(LY/m;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->Size_Preview_VerticalAlignment(LY/m;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic size(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;)Landroidx/compose/ui/e;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "size"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getWidth()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    sget-object p2, Ll0/e;->a:Ll0/e$a;

    .line 29
    .line 30
    invoke-virtual {p2}, Ll0/e$a;->g()Ll0/e$b;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    :cond_0
    invoke-static {v0, p2, v5, v4, v6}, Landroidx/compose/foundation/layout/s;->D(Landroidx/compose/ui/e;Ll0/e$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    instance-of p2, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 40
    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 44
    .line 45
    invoke-static {p2, v3, v2, v6}, Landroidx/compose/foundation/layout/s;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    instance-of p2, v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 51
    .line 52
    if-eqz p2, :cond_7

    .line 53
    .line 54
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 55
    .line 56
    check-cast v0, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;->getValue-pVg5ArA()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    int-to-float v0, v0

    .line 63
    invoke-static {v0}, Li1/h;->n(F)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/s;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :goto_0
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/properties/Size;->getHeight()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    instance-of v0, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 80
    .line 81
    if-nez p3, :cond_3

    .line 82
    .line 83
    sget-object p3, Ll0/e;->a:Ll0/e$a;

    .line 84
    .line 85
    invoke-virtual {p3}, Ll0/e$a;->i()Ll0/e$c;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    :cond_3
    invoke-static {p1, p3, v5, v4, v6}, Landroidx/compose/foundation/layout/s;->z(Landroidx/compose/ui/e;Ll0/e$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    instance-of p3, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;

    .line 95
    .line 96
    if-eqz p3, :cond_5

    .line 97
    .line 98
    sget-object p1, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 99
    .line 100
    invoke-static {p1, v3, v2, v6}, Landroidx/compose/foundation/layout/s;->d(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    goto :goto_1

    .line 105
    :cond_5
    instance-of p3, p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 106
    .line 107
    if-eqz p3, :cond_6

    .line 108
    .line 109
    sget-object p3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 110
    .line 111
    check-cast p1, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;->getValue-pVg5ArA()I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    int-to-float p1, p1

    .line 118
    invoke-static {p1}, Li1/h;->n(F)F

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/s;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :goto_1
    invoke-interface {p0, p2}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :cond_6
    new-instance p0, LTd/r;

    .line 136
    .line 137
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 138
    .line 139
    .line 140
    throw p0

    .line 141
    :cond_7
    new-instance p0, LTd/r;

    .line 142
    .line 143
    invoke-direct {p0}, LTd/r;-><init>()V

    .line 144
    .line 145
    .line 146
    throw p0
.end method

.method public static synthetic size$default(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;ILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/SizeKt;->size(Landroidx/compose/ui/e;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ll0/e$b;Ll0/e$c;)Landroidx/compose/ui/e;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
