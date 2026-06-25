.class public final Lcom/facebook/react/views/scroll/w;
.super Lcom/facebook/react/views/scroll/v;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final j:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "scrollView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/v;-><init>(Landroid/view/ViewGroup;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/views/scroll/w;->j:Ljava/util/Collection;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method protected k()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/w;->j:Ljava/util/Collection;

    .line 2
    .line 3
    return-object v0
.end method

.method protected p(Lcom/facebook/react/views/scroll/r;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->j()Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v1, "VirtualViewContainerStateClassic:"

    .line 21
    .line 22
    const-string v2, "updateModes"

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_9

    .line 31
    .line 32
    invoke-static {}, Lh7/b;->B()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_9

    .line 37
    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "scrollView visibleRect is empty"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v0, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    neg-int v3, v3

    .line 83
    int-to-double v3, v3

    .line 84
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->h()D

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    mul-double/2addr v3, v5

    .line 89
    double-to-int v3, v3

    .line 90
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    neg-int v4, v4

    .line 99
    int-to-double v4, v4

    .line 100
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->h()D

    .line 101
    .line 102
    .line 103
    move-result-wide v6

    .line 104
    mul-double/2addr v4, v6

    .line 105
    double-to-int v4, v4

    .line 106
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Rect;->inset(II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->e()D

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    const-wide/16 v5, 0x0

    .line 114
    .line 115
    cmpl-double v0, v3, v5

    .line 116
    .line 117
    if-lez v0, :cond_1

    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->f()Landroid/graphics/Rect;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v0, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->f()Landroid/graphics/Rect;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    neg-int v3, v3

    .line 143
    int-to-double v3, v3

    .line 144
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->e()D

    .line 145
    .line 146
    .line 147
    move-result-wide v7

    .line 148
    mul-double/2addr v3, v7

    .line 149
    double-to-int v3, v3

    .line 150
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    neg-int v4, v4

    .line 159
    int-to-double v7, v4

    .line 160
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->e()D

    .line 161
    .line 162
    .line 163
    move-result-wide v9

    .line 164
    mul-double/2addr v7, v9

    .line 165
    double-to-int v4, v7

    .line 166
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Rect;->inset(II)V

    .line 167
    .line 168
    .line 169
    :cond_1
    if-eqz p1, :cond_2

    .line 170
    .line 171
    invoke-static {p1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    goto :goto_0

    .line 176
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/w;->k()Ljava/util/Collection;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Ljava/lang/Iterable;

    .line 181
    .line 182
    invoke-static {p1}, LUd/u;->e1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, Ljava/util/Collection;

    .line 187
    .line 188
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 189
    .line 190
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_9

    .line 199
    .line 200
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Lcom/facebook/react/views/scroll/r;

    .line 205
    .line 206
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/r;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    sget-object v4, LQ7/a;->d:LQ7/a;

    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->d()Landroid/graphics/Rect;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-static {v3, v8}, Lcom/facebook/react/views/scroll/t;->b(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    if-eqz v8, :cond_6

    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->l()Landroid/graphics/Rect;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->g()Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    if-eqz v4, :cond_5

    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->j()Landroid/view/ViewGroup;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v4}, Landroid/view/View;->hasWindowFocus()Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-eqz v4, :cond_4

    .line 245
    .line 246
    sget-object v4, LQ7/a;->b:LQ7/a;

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_4
    sget-object v4, LQ7/a;->c:LQ7/a;

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_5
    sget-object v4, LQ7/a;->b:LQ7/a;

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_6
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    invoke-static {v3, v8}, Lcom/facebook/react/views/scroll/t;->b(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-eqz v8, :cond_7

    .line 264
    .line 265
    sget-object v4, LQ7/a;->c:LQ7/a;

    .line 266
    .line 267
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->i()Landroid/graphics/Rect;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    goto :goto_2

    .line 272
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->e()D

    .line 273
    .line 274
    .line 275
    move-result-wide v8

    .line 276
    cmpl-double v8, v8, v5

    .line 277
    .line 278
    if-lez v8, :cond_8

    .line 279
    .line 280
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/v;->f()Landroid/graphics/Rect;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-static {v3, v8}, Lcom/facebook/react/views/scroll/t;->b(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    if-eqz v8, :cond_8

    .line 289
    .line 290
    const/4 v4, 0x0

    .line 291
    :cond_8
    :goto_2
    if-eqz v4, :cond_3

    .line 292
    .line 293
    invoke-interface {v0, v4, v7}, Lcom/facebook/react/views/scroll/r;->i(LQ7/a;Landroid/graphics/Rect;)V

    .line 294
    .line 295
    .line 296
    invoke-static {}, Lcom/facebook/react/views/scroll/t;->a()Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-eqz v8, :cond_3

    .line 301
    .line 302
    invoke-static {}, Lh7/b;->B()Z

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    if-eqz v8, :cond_3

    .line 307
    .line 308
    new-instance v8, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/r;->getVirtualViewID()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    new-instance v9, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    const-string v10, "virtualView="

    .line 333
    .line 334
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v0, " mode="

    .line 341
    .line 342
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    const-string v0, "  rect="

    .line 349
    .line 350
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    const-string v0, " thresholdRect="

    .line 357
    .line 358
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-static {v8, v0}, Lz5/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_1

    .line 372
    .line 373
    :cond_9
    return-void
.end method
