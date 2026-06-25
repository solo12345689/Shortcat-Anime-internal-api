.class public final Lw/u;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/u$a;,
        Lw/u$b;
    }
.end annotation


# static fields
.field public static final c:Lw/u$b;

.field public static final d:I


# instance fields
.field private final a:[[Lw/u$a;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw/u$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lw/u$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw/u;->c:Lw/u$b;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lw/u;->d:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>([I[F[[F)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    iput-boolean v2, v0, Lw/u;->b:Z

    .line 10
    .line 11
    array-length v3, v1

    .line 12
    sub-int/2addr v3, v2

    .line 13
    new-array v4, v3, [[Lw/u$a;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    move v7, v2

    .line 17
    move v8, v7

    .line 18
    move v6, v5

    .line 19
    :goto_0
    if-ge v6, v3, :cond_5

    .line 20
    .line 21
    aget v9, p1, v6

    .line 22
    .line 23
    const/4 v10, 0x3

    .line 24
    const/4 v11, 0x2

    .line 25
    if-eqz v9, :cond_0

    .line 26
    .line 27
    if-eq v9, v2, :cond_3

    .line 28
    .line 29
    if-eq v9, v11, :cond_2

    .line 30
    .line 31
    if-eq v9, v10, :cond_1

    .line 32
    .line 33
    const/4 v10, 0x4

    .line 34
    if-eq v9, v10, :cond_0

    .line 35
    .line 36
    const/4 v10, 0x5

    .line 37
    if-eq v9, v10, :cond_0

    .line 38
    .line 39
    move v13, v8

    .line 40
    goto :goto_3

    .line 41
    :cond_0
    move v13, v10

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    if-ne v7, v2, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :goto_1
    move v13, v7

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    :goto_2
    move v7, v11

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move v7, v2

    .line 51
    goto :goto_1

    .line 52
    :goto_3
    aget-object v8, p3, v6

    .line 53
    .line 54
    array-length v9, v8

    .line 55
    div-int/2addr v9, v11

    .line 56
    array-length v8, v8

    .line 57
    rem-int/2addr v8, v11

    .line 58
    add-int/2addr v9, v8

    .line 59
    new-array v8, v9, [Lw/u$a;

    .line 60
    .line 61
    move v10, v5

    .line 62
    :goto_4
    if-ge v10, v9, :cond_4

    .line 63
    .line 64
    mul-int/lit8 v11, v10, 0x2

    .line 65
    .line 66
    new-instance v12, Lw/u$a;

    .line 67
    .line 68
    aget v14, v1, v6

    .line 69
    .line 70
    add-int/lit8 v15, v6, 0x1

    .line 71
    .line 72
    move/from16 v16, v15

    .line 73
    .line 74
    aget v15, v1, v16

    .line 75
    .line 76
    aget-object v17, p3, v6

    .line 77
    .line 78
    move/from16 v18, v16

    .line 79
    .line 80
    aget v16, v17, v11

    .line 81
    .line 82
    add-int/lit8 v19, v11, 0x1

    .line 83
    .line 84
    aget v17, v17, v19

    .line 85
    .line 86
    aget-object v18, p3, v18

    .line 87
    .line 88
    aget v11, v18, v11

    .line 89
    .line 90
    aget v19, v18, v19

    .line 91
    .line 92
    move/from16 v18, v11

    .line 93
    .line 94
    invoke-direct/range {v12 .. v19}, Lw/u$a;-><init>(IFFFFFF)V

    .line 95
    .line 96
    .line 97
    aput-object v12, v8, v10

    .line 98
    .line 99
    add-int/lit8 v10, v10, 0x1

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    aput-object v8, v4, v6

    .line 103
    .line 104
    add-int/lit8 v6, v6, 0x1

    .line 105
    .line 106
    move v8, v13

    .line 107
    goto :goto_0

    .line 108
    :cond_5
    iput-object v4, v0, Lw/u;->a:[[Lw/u$a;

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final a(F[F)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lw/u;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 8
    .line 9
    aget-object v0, v0, v2

    .line 10
    .line 11
    aget-object v0, v0, v2

    .line 12
    .line 13
    invoke-virtual {v0}, Lw/u$a;->l()F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    cmpg-float v0, p1, v0

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 22
    .line 23
    array-length v3, v0

    .line 24
    sub-int/2addr v3, v1

    .line 25
    aget-object v0, v0, v3

    .line 26
    .line 27
    aget-object v0, v0, v2

    .line 28
    .line 29
    invoke-virtual {v0}, Lw/u$a;->m()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    cmpl-float v0, p1, v0

    .line 34
    .line 35
    if-lez v0, :cond_5

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 38
    .line 39
    array-length v3, v0

    .line 40
    sub-int/2addr v3, v1

    .line 41
    aget-object v0, v0, v3

    .line 42
    .line 43
    aget-object v0, v0, v2

    .line 44
    .line 45
    invoke-virtual {v0}, Lw/u$a;->m()F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    cmpl-float v0, p1, v0

    .line 50
    .line 51
    if-lez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 54
    .line 55
    array-length v3, v0

    .line 56
    sub-int/2addr v3, v1

    .line 57
    array-length v4, v0

    .line 58
    sub-int/2addr v4, v1

    .line 59
    aget-object v0, v0, v4

    .line 60
    .line 61
    aget-object v0, v0, v2

    .line 62
    .line 63
    invoke-virtual {v0}, Lw/u$a;->m()F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 69
    .line 70
    aget-object v0, v0, v2

    .line 71
    .line 72
    aget-object v0, v0, v2

    .line 73
    .line 74
    invoke-virtual {v0}, Lw/u$a;->l()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    move v3, v2

    .line 79
    :goto_0
    sub-float/2addr p1, v0

    .line 80
    move v1, v2

    .line 81
    :goto_1
    array-length v4, p2

    .line 82
    if-ge v2, v4, :cond_a

    .line 83
    .line 84
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 85
    .line 86
    aget-object v4, v4, v3

    .line 87
    .line 88
    aget-object v4, v4, v1

    .line 89
    .line 90
    invoke-virtual {v4}, Lw/u$a;->n()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 97
    .line 98
    aget-object v4, v4, v3

    .line 99
    .line 100
    aget-object v4, v4, v1

    .line 101
    .line 102
    invoke-virtual {v4, v0}, Lw/u$a;->j(F)F

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    iget-object v5, p0, Lw/u;->a:[[Lw/u$a;

    .line 107
    .line 108
    aget-object v5, v5, v3

    .line 109
    .line 110
    aget-object v5, v5, v1

    .line 111
    .line 112
    invoke-virtual {v5}, Lw/u$a;->h()F

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    mul-float/2addr v5, p1

    .line 117
    add-float/2addr v4, v5

    .line 118
    aput v4, p2, v2

    .line 119
    .line 120
    add-int/lit8 v4, v2, 0x1

    .line 121
    .line 122
    iget-object v5, p0, Lw/u;->a:[[Lw/u$a;

    .line 123
    .line 124
    aget-object v5, v5, v3

    .line 125
    .line 126
    aget-object v5, v5, v1

    .line 127
    .line 128
    invoke-virtual {v5, v0}, Lw/u$a;->k(F)F

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    iget-object v6, p0, Lw/u;->a:[[Lw/u$a;

    .line 133
    .line 134
    aget-object v6, v6, v3

    .line 135
    .line 136
    aget-object v6, v6, v1

    .line 137
    .line 138
    invoke-virtual {v6}, Lw/u$a;->i()F

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    mul-float/2addr v6, p1

    .line 143
    add-float/2addr v5, v6

    .line 144
    aput v5, p2, v4

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_2
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 148
    .line 149
    aget-object v4, v4, v3

    .line 150
    .line 151
    aget-object v4, v4, v1

    .line 152
    .line 153
    invoke-virtual {v4, v0}, Lw/u$a;->p(F)V

    .line 154
    .line 155
    .line 156
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 157
    .line 158
    aget-object v4, v4, v3

    .line 159
    .line 160
    aget-object v4, v4, v1

    .line 161
    .line 162
    invoke-virtual {v4}, Lw/u$a;->f()F

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    iget-object v5, p0, Lw/u;->a:[[Lw/u$a;

    .line 167
    .line 168
    aget-object v5, v5, v3

    .line 169
    .line 170
    aget-object v5, v5, v1

    .line 171
    .line 172
    invoke-virtual {v5}, Lw/u$a;->d()F

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    mul-float/2addr v5, p1

    .line 177
    add-float/2addr v4, v5

    .line 178
    aput v4, p2, v2

    .line 179
    .line 180
    add-int/lit8 v4, v2, 0x1

    .line 181
    .line 182
    iget-object v5, p0, Lw/u;->a:[[Lw/u$a;

    .line 183
    .line 184
    aget-object v5, v5, v3

    .line 185
    .line 186
    aget-object v5, v5, v1

    .line 187
    .line 188
    invoke-virtual {v5}, Lw/u$a;->g()F

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    iget-object v6, p0, Lw/u;->a:[[Lw/u$a;

    .line 193
    .line 194
    aget-object v6, v6, v3

    .line 195
    .line 196
    aget-object v6, v6, v1

    .line 197
    .line 198
    invoke-virtual {v6}, Lw/u$a;->e()F

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    mul-float/2addr v6, p1

    .line 203
    add-float/2addr v5, v6

    .line 204
    aput v5, p2, v4

    .line 205
    .line 206
    :goto_2
    add-int/lit8 v2, v2, 0x2

    .line 207
    .line 208
    add-int/lit8 v1, v1, 0x1

    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :cond_3
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 213
    .line 214
    aget-object v0, v0, v2

    .line 215
    .line 216
    aget-object v0, v0, v2

    .line 217
    .line 218
    invoke-virtual {v0}, Lw/u$a;->l()F

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    cmpg-float v0, p1, v0

    .line 223
    .line 224
    if-gez v0, :cond_4

    .line 225
    .line 226
    iget-object p1, p0, Lw/u;->a:[[Lw/u$a;

    .line 227
    .line 228
    aget-object p1, p1, v2

    .line 229
    .line 230
    aget-object p1, p1, v2

    .line 231
    .line 232
    invoke-virtual {p1}, Lw/u$a;->l()F

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    :cond_4
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 237
    .line 238
    array-length v3, v0

    .line 239
    sub-int/2addr v3, v1

    .line 240
    aget-object v0, v0, v3

    .line 241
    .line 242
    aget-object v0, v0, v2

    .line 243
    .line 244
    invoke-virtual {v0}, Lw/u$a;->m()F

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    cmpl-float v0, p1, v0

    .line 249
    .line 250
    if-lez v0, :cond_5

    .line 251
    .line 252
    iget-object p1, p0, Lw/u;->a:[[Lw/u$a;

    .line 253
    .line 254
    array-length v0, p1

    .line 255
    sub-int/2addr v0, v1

    .line 256
    aget-object p1, p1, v0

    .line 257
    .line 258
    aget-object p1, p1, v2

    .line 259
    .line 260
    invoke-virtual {p1}, Lw/u$a;->m()F

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    :cond_5
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 265
    .line 266
    array-length v0, v0

    .line 267
    move v3, v2

    .line 268
    move v4, v3

    .line 269
    :goto_3
    if-ge v3, v0, :cond_a

    .line 270
    .line 271
    move v5, v2

    .line 272
    move v6, v5

    .line 273
    :goto_4
    array-length v7, p2

    .line 274
    if-ge v5, v7, :cond_8

    .line 275
    .line 276
    iget-object v7, p0, Lw/u;->a:[[Lw/u$a;

    .line 277
    .line 278
    aget-object v7, v7, v3

    .line 279
    .line 280
    aget-object v7, v7, v6

    .line 281
    .line 282
    invoke-virtual {v7}, Lw/u$a;->m()F

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    cmpg-float v7, p1, v7

    .line 287
    .line 288
    if-gtz v7, :cond_7

    .line 289
    .line 290
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 291
    .line 292
    aget-object v4, v4, v3

    .line 293
    .line 294
    aget-object v4, v4, v6

    .line 295
    .line 296
    invoke-virtual {v4}, Lw/u$a;->n()Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    if-eqz v4, :cond_6

    .line 301
    .line 302
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 303
    .line 304
    aget-object v4, v4, v3

    .line 305
    .line 306
    aget-object v4, v4, v6

    .line 307
    .line 308
    invoke-virtual {v4, p1}, Lw/u$a;->j(F)F

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    aput v4, p2, v5

    .line 313
    .line 314
    add-int/lit8 v4, v5, 0x1

    .line 315
    .line 316
    iget-object v7, p0, Lw/u;->a:[[Lw/u$a;

    .line 317
    .line 318
    aget-object v7, v7, v3

    .line 319
    .line 320
    aget-object v7, v7, v6

    .line 321
    .line 322
    invoke-virtual {v7, p1}, Lw/u$a;->k(F)F

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    aput v7, p2, v4

    .line 327
    .line 328
    :goto_5
    move v4, v1

    .line 329
    goto :goto_6

    .line 330
    :cond_6
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 331
    .line 332
    aget-object v4, v4, v3

    .line 333
    .line 334
    aget-object v4, v4, v6

    .line 335
    .line 336
    invoke-virtual {v4, p1}, Lw/u$a;->p(F)V

    .line 337
    .line 338
    .line 339
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 340
    .line 341
    aget-object v4, v4, v3

    .line 342
    .line 343
    aget-object v4, v4, v6

    .line 344
    .line 345
    invoke-virtual {v4}, Lw/u$a;->f()F

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    aput v4, p2, v5

    .line 350
    .line 351
    add-int/lit8 v4, v5, 0x1

    .line 352
    .line 353
    iget-object v7, p0, Lw/u;->a:[[Lw/u$a;

    .line 354
    .line 355
    aget-object v7, v7, v3

    .line 356
    .line 357
    aget-object v7, v7, v6

    .line 358
    .line 359
    invoke-virtual {v7}, Lw/u$a;->g()F

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    aput v7, p2, v4

    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_7
    :goto_6
    add-int/lit8 v5, v5, 0x2

    .line 367
    .line 368
    add-int/lit8 v6, v6, 0x1

    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_8
    if-eqz v4, :cond_9

    .line 372
    .line 373
    goto :goto_7

    .line 374
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 375
    .line 376
    goto :goto_3

    .line 377
    :cond_a
    :goto_7
    return-void
.end method

.method public final b(F[F)V
    .locals 8

    .line 1
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    invoke-virtual {v0}, Lw/u$a;->l()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    cmpg-float v0, p1, v0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-gez v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lw/u;->a:[[Lw/u$a;

    .line 18
    .line 19
    aget-object p1, p1, v1

    .line 20
    .line 21
    aget-object p1, p1, v1

    .line 22
    .line 23
    invoke-virtual {p1}, Lw/u$a;->l()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 29
    .line 30
    array-length v3, v0

    .line 31
    sub-int/2addr v3, v2

    .line 32
    aget-object v0, v0, v3

    .line 33
    .line 34
    aget-object v0, v0, v1

    .line 35
    .line 36
    invoke-virtual {v0}, Lw/u$a;->m()F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    cmpl-float v0, p1, v0

    .line 41
    .line 42
    if-lez v0, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, Lw/u;->a:[[Lw/u$a;

    .line 45
    .line 46
    array-length v0, p1

    .line 47
    sub-int/2addr v0, v2

    .line 48
    aget-object p1, p1, v0

    .line 49
    .line 50
    aget-object p1, p1, v1

    .line 51
    .line 52
    invoke-virtual {p1}, Lw/u$a;->m()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    :cond_1
    :goto_0
    iget-object v0, p0, Lw/u;->a:[[Lw/u$a;

    .line 57
    .line 58
    array-length v0, v0

    .line 59
    move v3, v1

    .line 60
    move v4, v3

    .line 61
    :goto_1
    if-ge v3, v0, :cond_6

    .line 62
    .line 63
    move v5, v1

    .line 64
    move v6, v5

    .line 65
    :goto_2
    array-length v7, p2

    .line 66
    if-ge v5, v7, :cond_4

    .line 67
    .line 68
    iget-object v7, p0, Lw/u;->a:[[Lw/u$a;

    .line 69
    .line 70
    aget-object v7, v7, v3

    .line 71
    .line 72
    aget-object v7, v7, v6

    .line 73
    .line 74
    invoke-virtual {v7}, Lw/u$a;->m()F

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    cmpg-float v7, p1, v7

    .line 79
    .line 80
    if-gtz v7, :cond_3

    .line 81
    .line 82
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 83
    .line 84
    aget-object v4, v4, v3

    .line 85
    .line 86
    aget-object v4, v4, v6

    .line 87
    .line 88
    invoke-virtual {v4}, Lw/u$a;->n()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 95
    .line 96
    aget-object v4, v4, v3

    .line 97
    .line 98
    aget-object v4, v4, v6

    .line 99
    .line 100
    invoke-virtual {v4}, Lw/u$a;->h()F

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    aput v4, p2, v5

    .line 105
    .line 106
    add-int/lit8 v4, v5, 0x1

    .line 107
    .line 108
    iget-object v7, p0, Lw/u;->a:[[Lw/u$a;

    .line 109
    .line 110
    aget-object v7, v7, v3

    .line 111
    .line 112
    aget-object v7, v7, v6

    .line 113
    .line 114
    invoke-virtual {v7}, Lw/u$a;->i()F

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    aput v7, p2, v4

    .line 119
    .line 120
    :goto_3
    move v4, v2

    .line 121
    goto :goto_4

    .line 122
    :cond_2
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 123
    .line 124
    aget-object v4, v4, v3

    .line 125
    .line 126
    aget-object v4, v4, v6

    .line 127
    .line 128
    invoke-virtual {v4, p1}, Lw/u$a;->p(F)V

    .line 129
    .line 130
    .line 131
    iget-object v4, p0, Lw/u;->a:[[Lw/u$a;

    .line 132
    .line 133
    aget-object v4, v4, v3

    .line 134
    .line 135
    aget-object v4, v4, v6

    .line 136
    .line 137
    invoke-virtual {v4}, Lw/u$a;->d()F

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    aput v4, p2, v5

    .line 142
    .line 143
    add-int/lit8 v4, v5, 0x1

    .line 144
    .line 145
    iget-object v7, p0, Lw/u;->a:[[Lw/u$a;

    .line 146
    .line 147
    aget-object v7, v7, v3

    .line 148
    .line 149
    aget-object v7, v7, v6

    .line 150
    .line 151
    invoke-virtual {v7}, Lw/u$a;->e()F

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    aput v7, p2, v4

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_3
    :goto_4
    add-int/lit8 v5, v5, 0x2

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    if-eqz v4, :cond_5

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_6
    :goto_5
    return-void
.end method
