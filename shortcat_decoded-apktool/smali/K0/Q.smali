.class public final LK0/Q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LK0/J;

.field private final b:LK0/p;

.field private final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LK0/J;LK0/p;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/Q;->a:LK0/J;

    .line 5
    .line 6
    iput-object p2, p0, LK0/Q;->b:LK0/p;

    .line 7
    .line 8
    iput-object p3, p0, LK0/Q;->c:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method

.method private final b(LK0/J;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, LK0/J;->A0()LK0/J;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, LK0/J;->f0()LK0/J$e;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v2, v1

    .line 14
    :goto_0
    invoke-virtual {p1}, LK0/J;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, LK0/J;->B0()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const v6, 0x7fffffff

    .line 27
    .line 28
    .line 29
    if-eq v3, v6, :cond_f

    .line 30
    .line 31
    if-eqz v0, :cond_f

    .line 32
    .line 33
    invoke-virtual {v0}, LK0/J;->p()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-ne v3, v5, :cond_f

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p1}, LK0/J;->m0()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    iget-object v3, p0, LK0/Q;->c:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    move v7, v4

    .line 52
    :goto_1
    if-ge v7, v6, :cond_3

    .line 53
    .line 54
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    move-object v9, v8

    .line 59
    check-cast v9, LK0/W$a;

    .line 60
    .line 61
    invoke-virtual {v9}, LK0/W$a;->a()LK0/J;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-static {v10, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-eqz v10, :cond_2

    .line 70
    .line 71
    invoke-virtual {v9}, LK0/W$a;->c()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-nez v9, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move-object v8, v1

    .line 82
    :goto_2
    if-eqz v8, :cond_4

    .line 83
    .line 84
    return v5

    .line 85
    :cond_4
    invoke-virtual {p1}, LK0/J;->z()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_5

    .line 90
    .line 91
    return v5

    .line 92
    :cond_5
    invoke-virtual {p1}, LK0/J;->m0()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_a

    .line 97
    .line 98
    iget-object v1, p0, LK0/Q;->b:LK0/p;

    .line 99
    .line 100
    invoke-virtual {v1, p1}, LK0/p;->e(LK0/J;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_9

    .line 105
    .line 106
    invoke-virtual {p1}, LK0/J;->f0()LK0/J$e;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    sget-object v1, LK0/J$e;->b:LK0/J$e;

    .line 111
    .line 112
    if-eq p1, v1, :cond_9

    .line 113
    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    invoke-virtual {v0}, LK0/J;->m0()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-ne p1, v5, :cond_6

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    if-eqz v0, :cond_7

    .line 124
    .line 125
    invoke-virtual {v0}, LK0/J;->h0()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-ne p1, v5, :cond_7

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    sget-object p1, LK0/J$e;->a:LK0/J$e;

    .line 133
    .line 134
    if-ne v2, p1, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    return v4

    .line 138
    :cond_9
    :goto_3
    return v5

    .line 139
    :cond_a
    invoke-virtual {p1}, LK0/J;->e0()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_f

    .line 144
    .line 145
    iget-object v1, p0, LK0/Q;->b:LK0/p;

    .line 146
    .line 147
    invoke-virtual {v1, p1}, LK0/p;->e(LK0/J;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_e

    .line 152
    .line 153
    if-eqz v0, :cond_e

    .line 154
    .line 155
    invoke-virtual {v0}, LK0/J;->m0()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_e

    .line 160
    .line 161
    invoke-virtual {v0}, LK0/J;->e0()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_e

    .line 166
    .line 167
    sget-object v0, LK0/J$e;->a:LK0/J$e;

    .line 168
    .line 169
    if-eq v2, v0, :cond_e

    .line 170
    .line 171
    sget-object v0, LK0/J$e;->c:LK0/J$e;

    .line 172
    .line 173
    if-eq v2, v0, :cond_e

    .line 174
    .line 175
    iget-object v0, p0, LK0/Q;->c:Ljava/util/List;

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    move v2, v4

    .line 182
    :goto_4
    if-ge v2, v1, :cond_c

    .line 183
    .line 184
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    check-cast v3, LK0/W$a;

    .line 189
    .line 190
    invoke-virtual {v3}, LK0/W$a;->a()LK0/J;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-static {v3, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_b

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_c
    invoke-virtual {p1}, LK0/J;->f0()LK0/J$e;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    sget-object v0, LK0/J$e;->a:LK0/J$e;

    .line 209
    .line 210
    if-ne p1, v0, :cond_d

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_d
    return v4

    .line 214
    :cond_e
    :goto_5
    return v5

    .line 215
    :cond_f
    invoke-virtual {p1}, LK0/J;->Y0()Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_18

    .line 226
    .line 227
    invoke-virtual {p1}, LK0/J;->h0()Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_12

    .line 232
    .line 233
    iget-object v3, p0, LK0/Q;->c:Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    move v7, v4

    .line 240
    :goto_6
    if-ge v7, v6, :cond_11

    .line 241
    .line 242
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    move-object v9, v8

    .line 247
    check-cast v9, LK0/W$a;

    .line 248
    .line 249
    invoke-virtual {v9}, LK0/W$a;->a()LK0/J;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    invoke-static {v10, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-eqz v10, :cond_10

    .line 258
    .line 259
    invoke-virtual {v9}, LK0/W$a;->c()Z

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    if-eqz v9, :cond_10

    .line 264
    .line 265
    move-object v1, v8

    .line 266
    goto :goto_7

    .line 267
    :cond_10
    add-int/lit8 v7, v7, 0x1

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_11
    :goto_7
    if-eqz v1, :cond_12

    .line 271
    .line 272
    return v5

    .line 273
    :cond_12
    invoke-virtual {p1}, LK0/J;->h0()Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_16

    .line 278
    .line 279
    iget-object v1, p0, LK0/Q;->b:LK0/p;

    .line 280
    .line 281
    invoke-virtual {v1, p1, v5}, LK0/p;->f(LK0/J;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-nez v1, :cond_15

    .line 286
    .line 287
    if-eqz v0, :cond_13

    .line 288
    .line 289
    invoke-virtual {v0}, LK0/J;->h0()Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-ne v1, v5, :cond_13

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_13
    sget-object v1, LK0/J$e;->b:LK0/J$e;

    .line 297
    .line 298
    if-eq v2, v1, :cond_15

    .line 299
    .line 300
    if-eqz v0, :cond_14

    .line 301
    .line 302
    invoke-virtual {v0}, LK0/J;->m0()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-ne v0, v5, :cond_14

    .line 307
    .line 308
    invoke-virtual {p1}, LK0/J;->j0()LK0/J;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-eqz p1, :cond_14

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_14
    return v4

    .line 320
    :cond_15
    :goto_8
    return v5

    .line 321
    :cond_16
    invoke-virtual {p1}, LK0/J;->g0()Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    if-eqz v1, :cond_18

    .line 326
    .line 327
    iget-object v1, p0, LK0/Q;->b:LK0/p;

    .line 328
    .line 329
    invoke-virtual {v1, p1, v5}, LK0/p;->f(LK0/J;Z)Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-nez v1, :cond_18

    .line 334
    .line 335
    if-eqz v0, :cond_18

    .line 336
    .line 337
    invoke-virtual {v0}, LK0/J;->h0()Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-nez v1, :cond_18

    .line 342
    .line 343
    invoke-virtual {v0}, LK0/J;->g0()Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-nez v1, :cond_18

    .line 348
    .line 349
    sget-object v1, LK0/J$e;->b:LK0/J$e;

    .line 350
    .line 351
    if-eq v2, v1, :cond_18

    .line 352
    .line 353
    sget-object v1, LK0/J$e;->d:LK0/J$e;

    .line 354
    .line 355
    if-eq v2, v1, :cond_18

    .line 356
    .line 357
    invoke-virtual {v0}, LK0/J;->e0()Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_17

    .line 362
    .line 363
    invoke-virtual {p1}, LK0/J;->j0()LK0/J;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    if-eqz p1, :cond_17

    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_17
    return v4

    .line 375
    :cond_18
    :goto_9
    return v5
.end method

.method private final c(LK0/J;)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LK0/Q;->b(LK0/J;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, LK0/J;->P()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    move v2, v1

    .line 18
    :goto_0
    if-ge v2, v0, :cond_2

    .line 19
    .line 20
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, LK0/J;

    .line 25
    .line 26
    invoke-direct {p0, v3}, LK0/Q;->c(LK0/J;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 p1, 0x1

    .line 37
    return p1
.end method

.method private final d()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Tree state:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "append(...)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LK0/Q;->a:LK0/J;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {p0, v0, v1, v2}, LK0/Q;->e(LK0/Q;Ljava/lang/StringBuilder;LK0/J;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

.method private static final e(LK0/Q;Ljava/lang/StringBuilder;LK0/J;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p2}, LK0/Q;->f(LK0/J;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-lez v1, :cond_1

    .line 11
    .line 12
    move v1, v2

    .line 13
    :goto_0
    if-ge v1, p3, :cond_0

    .line 14
    .line 15
    const-string v3, ".."

    .line 16
    .line 17
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, "append(...)"

    .line 27
    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/16 v1, 0xa

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 p3, p3, 0x1

    .line 40
    .line 41
    :cond_1
    invoke-virtual {p2}, LK0/J;->P()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :goto_1
    if-ge v2, v0, :cond_2

    .line 50
    .line 51
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, LK0/J;

    .line 56
    .line 57
    invoke-static {p0, p1, v1, p3}, LK0/Q;->e(LK0/Q;Ljava/lang/StringBuilder;LK0/J;I)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    return-void
.end method

.method private final f(LK0/J;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const/16 v2, 0x5b

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, LK0/J;->f0()LK0/J$e;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v2, 0x5d

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, LK0/J;->p()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    const-string v1, "[!isPlaced]"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v3, "[measuredByParent="

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, LK0/J;->o0()LK0/J$g;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-direct {p0, p1}, LK0/Q;->b(LK0/J;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_1

    .line 81
    .line 82
    const-string p1, "[INCONSISTENT]"

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LK0/Q;->a:LK0/J;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LK0/Q;->c(LK0/J;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-direct {p0}, LK0/Q;->d()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "Inconsistency found!"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method
