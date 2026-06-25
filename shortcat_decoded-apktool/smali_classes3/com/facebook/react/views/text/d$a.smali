.class public final Lcom/facebook/react/views/text/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/text/d$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/views/text/d$a;Lcom/facebook/react/views/text/d;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/r;ZLjava/util/Map;I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/facebook/react/views/text/d$a;->b(Lcom/facebook/react/views/text/d;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/r;ZLjava/util/Map;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b(Lcom/facebook/react/views/text/d;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/r;ZLjava/util/Map;I)V
    .locals 19

    .line 1
    move-object/from16 v8, p4

    .line 2
    .line 3
    move/from16 v9, p7

    .line 4
    .line 5
    if-eqz v8, :cond_1

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/views/text/d;->w()Lcom/facebook/react/views/text/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v8, v0}, Lcom/facebook/react/views/text/r;->a(Lcom/facebook/react/views/text/r;)Lcom/facebook/react/views/text/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    move-object v4, v0

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/views/text/d;->w()Lcom/facebook/react/views/text/r;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/P;->getChildCount()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    const/4 v0, 0x0

    .line 30
    move v11, v0

    .line 31
    :goto_3
    if-ge v11, v10, :cond_8

    .line 32
    .line 33
    move-object/from16 v12, p1

    .line 34
    .line 35
    invoke-virtual {v12, v11}, Lcom/facebook/react/uimanager/P;->getChildAt(I)Lcom/facebook/react/uimanager/P;

    .line 36
    .line 37
    .line 38
    move-result-object v13

    .line 39
    const-string v0, "getChildAt(...)"

    .line 40
    .line 41
    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    instance-of v0, v13, Lcom/facebook/react/views/text/d;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    move-object v1, v13

    .line 49
    check-cast v1, Lcom/facebook/react/views/text/d;

    .line 50
    .line 51
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    move-object/from16 v0, p0

    .line 56
    .line 57
    move-object/from16 v2, p2

    .line 58
    .line 59
    move-object/from16 v3, p3

    .line 60
    .line 61
    move/from16 v5, p5

    .line 62
    .line 63
    move-object/from16 v6, p6

    .line 64
    .line 65
    invoke-direct/range {v0 .. v7}, Lcom/facebook/react/views/text/d$a;->b(Lcom/facebook/react/views/text/d;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/r;ZLjava/util/Map;I)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_2
    move-object/from16 v2, p2

    .line 71
    .line 72
    move-object/from16 v3, p3

    .line 73
    .line 74
    move-object/from16 v6, p6

    .line 75
    .line 76
    instance-of v0, v13, LO7/a;

    .line 77
    .line 78
    const-string v1, "0"

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 83
    .line 84
    .line 85
    new-instance v0, LP7/p;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/lit8 v1, v1, -0x1

    .line 92
    .line 93
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    move-object v7, v13

    .line 98
    check-cast v7, LO7/a;

    .line 99
    .line 100
    invoke-virtual {v7}, LO7/a;->f()LP7/r;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-direct {v0, v1, v5, v7}, LP7/p;-><init>(IILP7/k;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_3
    if-eqz p5, :cond_7

    .line 112
    .line 113
    invoke-interface {v13}, Lcom/facebook/react/uimanager/O;->getReactTag()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-interface {v13}, Lcom/facebook/react/uimanager/O;->getStyleWidth()Lcom/facebook/yoga/YogaValue;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-interface {v13}, Lcom/facebook/react/uimanager/O;->getStyleHeight()Lcom/facebook/yoga/YogaValue;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    iget-object v14, v5, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    .line 126
    .line 127
    sget-object v15, Lcom/facebook/yoga/w;->c:Lcom/facebook/yoga/w;

    .line 128
    .line 129
    if-ne v14, v15, :cond_5

    .line 130
    .line 131
    iget-object v14, v7, Lcom/facebook/yoga/YogaValue;->b:Lcom/facebook/yoga/w;

    .line 132
    .line 133
    if-eq v14, v15, :cond_4

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_4
    iget v5, v5, Lcom/facebook/yoga/YogaValue;->a:F

    .line 137
    .line 138
    iget v7, v7, Lcom/facebook/yoga/YogaValue;->a:F

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_5
    :goto_4
    invoke-interface {v13}, Lcom/facebook/react/uimanager/O;->calculateLayout()V

    .line 142
    .line 143
    .line 144
    invoke-interface {v13}, Lcom/facebook/react/uimanager/O;->getLayoutWidth()F

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-interface {v13}, Lcom/facebook/react/uimanager/O;->getLayoutHeight()F

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    :goto_5
    invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 153
    .line 154
    .line 155
    new-instance v1, LP7/p;

    .line 156
    .line 157
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    add-int/lit8 v14, v14, -0x1

    .line 162
    .line 163
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    new-instance v2, LP7/s;

    .line 168
    .line 169
    float-to-int v5, v5

    .line 170
    float-to-int v7, v7

    .line 171
    invoke-direct {v2, v0, v5, v7}, LP7/s;-><init>(III)V

    .line 172
    .line 173
    .line 174
    invoke-direct {v1, v14, v15, v2}, LP7/p;-><init>(IILP7/k;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    if-eqz v6, :cond_6

    .line 181
    .line 182
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-interface {v6, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    :goto_6
    invoke-interface {v13}, Lcom/facebook/react/uimanager/O;->markUpdateSeen()V

    .line 190
    .line 191
    .line 192
    add-int/lit8 v11, v11, 0x1

    .line 193
    .line 194
    goto/16 :goto_3

    .line 195
    .line 196
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 197
    .line 198
    const-string v1, "Required value was null."

    .line 199
    .line 200
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v0

    .line 204
    :cond_7
    new-instance v0, Lcom/facebook/react/uimanager/o;

    .line 205
    .line 206
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    new-instance v2, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v3, "Unexpected view type nested under a <Text> or <TextInput> node: "

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/o;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v0

    .line 231
    :cond_8
    move-object/from16 v12, p1

    .line 232
    .line 233
    move-object/from16 v3, p3

    .line 234
    .line 235
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-lt v0, v9, :cond_19

    .line 240
    .line 241
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->D()Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-eqz v1, :cond_9

    .line 246
    .line 247
    new-instance v1, LP7/p;

    .line 248
    .line 249
    new-instance v2, LP7/g;

    .line 250
    .line 251
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->i()I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    invoke-direct {v2, v5}, LP7/g;-><init>(I)V

    .line 256
    .line 257
    .line 258
    invoke-direct {v1, v9, v0, v2}, LP7/p;-><init>(IILP7/k;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    :cond_9
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->C()Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_a

    .line 269
    .line 270
    new-instance v1, LP7/p;

    .line 271
    .line 272
    new-instance v2, LP7/e;

    .line 273
    .line 274
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->h()I

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    invoke-direct {v2, v5}, LP7/e;-><init>(I)V

    .line 279
    .line 280
    .line 281
    invoke-direct {v1, v9, v0, v2}, LP7/p;-><init>(IILP7/k;)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    :cond_a
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->u()Lcom/facebook/react/uimanager/D$d;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-eqz v1, :cond_b

    .line 292
    .line 293
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->u()Lcom/facebook/react/uimanager/D$d;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    sget-object v2, Lcom/facebook/react/uimanager/D$d;->y:Lcom/facebook/react/uimanager/D$d;

    .line 298
    .line 299
    if-ne v1, v2, :cond_c

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_b
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->f()Lcom/facebook/react/uimanager/D$b;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    sget-object v2, Lcom/facebook/react/uimanager/D$b;->f:Lcom/facebook/react/uimanager/D$b;

    .line 307
    .line 308
    if-ne v1, v2, :cond_c

    .line 309
    .line 310
    :goto_7
    new-instance v1, LP7/p;

    .line 311
    .line 312
    new-instance v2, LP7/f;

    .line 313
    .line 314
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/P;->getReactTag()I

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    invoke-direct {v2, v5}, LP7/f;-><init>(I)V

    .line 319
    .line 320
    .line 321
    invoke-direct {v1, v9, v0, v2}, LP7/p;-><init>(IILP7/k;)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    :cond_c
    invoke-virtual {v4}, Lcom/facebook/react/views/text/r;->d()F

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-nez v2, :cond_e

    .line 336
    .line 337
    if-eqz v8, :cond_d

    .line 338
    .line 339
    invoke-virtual {v8}, Lcom/facebook/react/views/text/r;->d()F

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    cmpg-float v2, v2, v1

    .line 344
    .line 345
    if-nez v2, :cond_d

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_d
    new-instance v2, LP7/p;

    .line 349
    .line 350
    new-instance v5, LP7/a;

    .line 351
    .line 352
    invoke-direct {v5, v1}, LP7/a;-><init>(F)V

    .line 353
    .line 354
    .line 355
    invoke-direct {v2, v9, v0, v5}, LP7/p;-><init>(IILP7/k;)V

    .line 356
    .line 357
    .line 358
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    :cond_e
    :goto_8
    invoke-virtual {v4}, Lcom/facebook/react/views/text/r;->c()I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v8, :cond_f

    .line 366
    .line 367
    invoke-virtual {v8}, Lcom/facebook/react/views/text/r;->c()I

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eq v2, v1, :cond_10

    .line 372
    .line 373
    :cond_f
    new-instance v2, LP7/p;

    .line 374
    .line 375
    new-instance v5, LP7/d;

    .line 376
    .line 377
    invoke-direct {v5, v1}, LP7/d;-><init>(I)V

    .line 378
    .line 379
    .line 380
    invoke-direct {v2, v9, v0, v5}, LP7/p;-><init>(IILP7/k;)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    :cond_10
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->m()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    const/4 v2, -0x1

    .line 391
    if-ne v1, v2, :cond_11

    .line 392
    .line 393
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->n()I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-ne v1, v2, :cond_11

    .line 398
    .line 399
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->k()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    if-eqz v1, :cond_12

    .line 404
    .line 405
    :cond_11
    new-instance v1, LP7/p;

    .line 406
    .line 407
    new-instance v13, LP7/c;

    .line 408
    .line 409
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->m()I

    .line 410
    .line 411
    .line 412
    move-result v14

    .line 413
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->n()I

    .line 414
    .line 415
    .line 416
    move-result v15

    .line 417
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->l()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v16

    .line 421
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->k()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v17

    .line 425
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/P;->getThemedContext()Lcom/facebook/react/uimanager/b0;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    const-string v5, "getAssets(...)"

    .line 434
    .line 435
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    move-object/from16 v18, v2

    .line 439
    .line 440
    invoke-direct/range {v13 .. v18}, LP7/c;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 441
    .line 442
    .line 443
    invoke-direct {v1, v9, v0, v13}, LP7/p;-><init>(IILP7/k;)V

    .line 444
    .line 445
    .line 446
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    :cond_12
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->F()Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-eqz v1, :cond_13

    .line 454
    .line 455
    new-instance v1, LP7/p;

    .line 456
    .line 457
    new-instance v2, LP7/o;

    .line 458
    .line 459
    invoke-direct {v2}, LP7/o;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-direct {v1, v9, v0, v2}, LP7/p;-><init>(IILP7/k;)V

    .line 463
    .line 464
    .line 465
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    :cond_13
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->E()Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-eqz v1, :cond_14

    .line 473
    .line 474
    new-instance v1, LP7/p;

    .line 475
    .line 476
    new-instance v2, LP7/l;

    .line 477
    .line 478
    invoke-direct {v2}, LP7/l;-><init>()V

    .line 479
    .line 480
    .line 481
    invoke-direct {v1, v9, v0, v2}, LP7/p;-><init>(IILP7/k;)V

    .line 482
    .line 483
    .line 484
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    :cond_14
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->z()F

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    const/4 v2, 0x0

    .line 492
    cmpg-float v1, v1, v2

    .line 493
    .line 494
    if-nez v1, :cond_15

    .line 495
    .line 496
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->A()F

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    cmpg-float v1, v1, v2

    .line 501
    .line 502
    if-nez v1, :cond_15

    .line 503
    .line 504
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->B()F

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    cmpg-float v1, v1, v2

    .line 509
    .line 510
    if-nez v1, :cond_15

    .line 511
    .line 512
    goto :goto_9

    .line 513
    :cond_15
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->y()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-eqz v1, :cond_16

    .line 522
    .line 523
    new-instance v1, LP7/p;

    .line 524
    .line 525
    new-instance v2, LP7/q;

    .line 526
    .line 527
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->z()F

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->A()F

    .line 532
    .line 533
    .line 534
    move-result v6

    .line 535
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->B()F

    .line 536
    .line 537
    .line 538
    move-result v7

    .line 539
    invoke-virtual {v12}, Lcom/facebook/react/views/text/d;->y()I

    .line 540
    .line 541
    .line 542
    move-result v10

    .line 543
    invoke-direct {v2, v5, v6, v7, v10}, LP7/q;-><init>(FFFI)V

    .line 544
    .line 545
    .line 546
    invoke-direct {v1, v9, v0, v2}, LP7/p;-><init>(IILP7/k;)V

    .line 547
    .line 548
    .line 549
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    :cond_16
    :goto_9
    invoke-virtual {v4}, Lcom/facebook/react/views/text/r;->e()F

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    if-nez v2, :cond_18

    .line 561
    .line 562
    if-eqz v8, :cond_17

    .line 563
    .line 564
    invoke-virtual {v8}, Lcom/facebook/react/views/text/r;->e()F

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    cmpg-float v2, v2, v1

    .line 569
    .line 570
    if-nez v2, :cond_17

    .line 571
    .line 572
    goto :goto_a

    .line 573
    :cond_17
    new-instance v2, LP7/p;

    .line 574
    .line 575
    new-instance v4, LP7/b;

    .line 576
    .line 577
    invoke-direct {v4, v1}, LP7/b;-><init>(F)V

    .line 578
    .line 579
    .line 580
    invoke-direct {v2, v9, v0, v4}, LP7/p;-><init>(IILP7/k;)V

    .line 581
    .line 582
    .line 583
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    :cond_18
    :goto_a
    new-instance v1, LP7/p;

    .line 587
    .line 588
    new-instance v2, LP7/m;

    .line 589
    .line 590
    invoke-virtual {v12}, Lcom/facebook/react/uimanager/P;->getReactTag()I

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    invoke-direct {v2, v4}, LP7/m;-><init>(I)V

    .line 595
    .line 596
    .line 597
    invoke-direct {v1, v9, v0, v2}, LP7/p;-><init>(IILP7/k;)V

    .line 598
    .line 599
    .line 600
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    :cond_19
    return-void
.end method
