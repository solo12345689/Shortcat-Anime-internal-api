.class public final Lw/E0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/y0;


# instance fields
.field private final a:Lt/m;

.field private final b:Lt/o;

.field private final c:I

.field private final d:I

.field private final e:Lw/D;

.field private final f:I

.field private g:[I

.field private h:[F

.field private i:Lw/q;

.field private j:Lw/q;

.field private k:Lw/q;

.field private l:Lw/q;

.field private m:[F

.field private n:[F

.field private o:Lw/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(Lt/m;Lt/o;IILw/D;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lw/E0;->a:Lt/m;

    .line 4
    iput-object p2, p0, Lw/E0;->b:Lt/o;

    .line 5
    iput p3, p0, Lw/E0;->c:I

    .line 6
    iput p4, p0, Lw/E0;->d:I

    .line 7
    iput-object p5, p0, Lw/E0;->e:Lw/D;

    .line 8
    iput p6, p0, Lw/E0;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Lt/m;Lt/o;IILw/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lw/E0;-><init>(Lt/m;Lt/o;IILw/D;I)V

    return-void
.end method

.method private final h(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lw/E0;->a:Lt/m;

    .line 2
    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move v1, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lw/P;->b(Lt/m;IIIILjava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, -0x1

    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x2

    .line 16
    .line 17
    neg-int p1, p1

    .line 18
    :cond_0
    return p1
.end method

.method private final i(I)F
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lw/E0;->h(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, v0, p1, v1}, Lw/E0;->j(IIZ)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method private final j(IIZ)F
    .locals 4

    .line 1
    iget-object v0, p0, Lw/E0;->a:Lt/m;

    .line 2
    .line 3
    iget v1, v0, Lt/m;->b:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    if-lt p1, v1, :cond_0

    .line 10
    .line 11
    int-to-float p1, p2

    .line 12
    :goto_0
    long-to-float p2, v2

    .line 13
    div-float/2addr p1, p2

    .line 14
    return p1

    .line 15
    :cond_0
    invoke-virtual {v0, p1}, Lt/m;->b(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lw/E0;->a:Lt/m;

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lt/m;->b(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ne p2, v0, :cond_1

    .line 28
    .line 29
    int-to-float p1, v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    sub-int/2addr p1, v0

    .line 32
    iget-object v1, p0, Lw/E0;->b:Lt/o;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lt/o;->c(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lw/D0;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1}, Lw/D0;->b()Lw/D;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    :cond_2
    iget-object v1, p0, Lw/E0;->e:Lw/D;

    .line 49
    .line 50
    :cond_3
    sub-int/2addr p2, v0

    .line 51
    int-to-float p2, p2

    .line 52
    int-to-float p1, p1

    .line 53
    div-float/2addr p2, p1

    .line 54
    invoke-interface {v1, p2}, Lw/D;->a(F)F

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-eqz p3, :cond_4

    .line 59
    .line 60
    return p2

    .line 61
    :cond_4
    mul-float/2addr p1, p2

    .line 62
    int-to-float p2, v0

    .line 63
    add-float/2addr p1, p2

    .line 64
    goto :goto_0
.end method

.method private final k(Lw/q;Lw/q;Lw/q;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lw/E0;->o:Lw/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget-object v3, p0, Lw/E0;->i:Lw/q;

    .line 11
    .line 12
    if-nez v3, :cond_5

    .line 13
    .line 14
    invoke-static {p1}, Lw/r;->g(Lw/q;)Lw/q;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iput-object v3, p0, Lw/E0;->i:Lw/q;

    .line 19
    .line 20
    invoke-static {p3}, Lw/r;->g(Lw/q;)Lw/q;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    iput-object p3, p0, Lw/E0;->j:Lw/q;

    .line 25
    .line 26
    iget-object p3, p0, Lw/E0;->a:Lt/m;

    .line 27
    .line 28
    invoke-virtual {p3}, Lt/m;->c()I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    new-array v3, p3, [F

    .line 33
    .line 34
    move v4, v1

    .line 35
    :goto_1
    if-ge v4, p3, :cond_1

    .line 36
    .line 37
    iget-object v5, p0, Lw/E0;->a:Lt/m;

    .line 38
    .line 39
    invoke-virtual {v5, v4}, Lt/m;->b(I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    int-to-float v5, v5

    .line 44
    const-wide/16 v6, 0x3e8

    .line 45
    .line 46
    long-to-float v6, v6

    .line 47
    div-float/2addr v5, v6

    .line 48
    aput v5, v3, v4

    .line 49
    .line 50
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iput-object v3, p0, Lw/E0;->h:[F

    .line 54
    .line 55
    iget-object p3, p0, Lw/E0;->a:Lt/m;

    .line 56
    .line 57
    invoke-virtual {p3}, Lt/m;->c()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    new-array v3, p3, [I

    .line 62
    .line 63
    move v4, v1

    .line 64
    :goto_2
    if-ge v4, p3, :cond_4

    .line 65
    .line 66
    iget-object v5, p0, Lw/E0;->b:Lt/o;

    .line 67
    .line 68
    iget-object v6, p0, Lw/E0;->a:Lt/m;

    .line 69
    .line 70
    invoke-virtual {v6, v4}, Lt/m;->b(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v5, v6}, Lt/o;->c(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Lw/D0;

    .line 79
    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    invoke-virtual {v5}, Lw/D0;->a()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    goto :goto_3

    .line 87
    :cond_2
    iget v5, p0, Lw/E0;->f:I

    .line 88
    .line 89
    :goto_3
    sget-object v6, Lw/t;->a:Lw/t$a;

    .line 90
    .line 91
    invoke-virtual {v6}, Lw/t$a;->a()I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-static {v5, v6}, Lw/t;->c(II)Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-nez v6, :cond_3

    .line 100
    .line 101
    move v0, v2

    .line 102
    :cond_3
    aput v5, v3, v4

    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    iput-object v3, p0, Lw/E0;->g:[I

    .line 108
    .line 109
    :cond_5
    if-nez v0, :cond_6

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    iget-object p3, p0, Lw/E0;->o:Lw/u;

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    if-eqz p3, :cond_a

    .line 116
    .line 117
    iget-object p3, p0, Lw/E0;->k:Lw/q;

    .line 118
    .line 119
    if-nez p3, :cond_7

    .line 120
    .line 121
    const-string p3, "lastInitialValue"

    .line 122
    .line 123
    invoke-static {p3}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object p3, v0

    .line 127
    :cond_7
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    if-eqz p3, :cond_a

    .line 132
    .line 133
    iget-object p3, p0, Lw/E0;->l:Lw/q;

    .line 134
    .line 135
    if-nez p3, :cond_8

    .line 136
    .line 137
    const-string p3, "lastTargetValue"

    .line 138
    .line 139
    invoke-static {p3}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    move-object p3, v0

    .line 143
    :cond_8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    if-nez p3, :cond_9

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_9
    :goto_4
    return-void

    .line 151
    :cond_a
    :goto_5
    iput-object p1, p0, Lw/E0;->k:Lw/q;

    .line 152
    .line 153
    iput-object p2, p0, Lw/E0;->l:Lw/q;

    .line 154
    .line 155
    invoke-virtual {p1}, Lw/q;->b()I

    .line 156
    .line 157
    .line 158
    move-result p3

    .line 159
    rem-int/lit8 p3, p3, 0x2

    .line 160
    .line 161
    invoke-virtual {p1}, Lw/q;->b()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    add-int/2addr p3, v2

    .line 166
    new-array v2, p3, [F

    .line 167
    .line 168
    iput-object v2, p0, Lw/E0;->m:[F

    .line 169
    .line 170
    new-array v2, p3, [F

    .line 171
    .line 172
    iput-object v2, p0, Lw/E0;->n:[F

    .line 173
    .line 174
    iget-object v2, p0, Lw/E0;->a:Lt/m;

    .line 175
    .line 176
    invoke-virtual {v2}, Lt/m;->c()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    new-array v3, v2, [[F

    .line 181
    .line 182
    move v4, v1

    .line 183
    :goto_6
    if-ge v4, v2, :cond_11

    .line 184
    .line 185
    iget-object v5, p0, Lw/E0;->a:Lt/m;

    .line 186
    .line 187
    invoke-virtual {v5, v4}, Lt/m;->b(I)I

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-nez v5, :cond_d

    .line 192
    .line 193
    iget-object v6, p0, Lw/E0;->b:Lt/o;

    .line 194
    .line 195
    invoke-virtual {v6, v5}, Lt/o;->a(I)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-nez v6, :cond_b

    .line 200
    .line 201
    new-array v5, p3, [F

    .line 202
    .line 203
    move v6, v1

    .line 204
    :goto_7
    if-ge v6, p3, :cond_10

    .line 205
    .line 206
    invoke-virtual {p1, v6}, Lw/q;->a(I)F

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    aput v7, v5, v6

    .line 211
    .line 212
    add-int/lit8 v6, v6, 0x1

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_b
    new-array v6, p3, [F

    .line 216
    .line 217
    iget-object v7, p0, Lw/E0;->b:Lt/o;

    .line 218
    .line 219
    invoke-virtual {v7, v5}, Lt/o;->c(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    check-cast v5, Lw/D0;

    .line 227
    .line 228
    invoke-virtual {v5}, Lw/D0;->c()Lw/q;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    move v7, v1

    .line 233
    :goto_8
    if-ge v7, p3, :cond_c

    .line 234
    .line 235
    invoke-virtual {v5, v7}, Lw/q;->a(I)F

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    aput v8, v6, v7

    .line 240
    .line 241
    add-int/lit8 v7, v7, 0x1

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :cond_c
    move-object v5, v6

    .line 245
    goto :goto_c

    .line 246
    :cond_d
    invoke-virtual {p0}, Lw/E0;->c()I

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-ne v5, v6, :cond_f

    .line 251
    .line 252
    iget-object v6, p0, Lw/E0;->b:Lt/o;

    .line 253
    .line 254
    invoke-virtual {v6, v5}, Lt/o;->a(I)Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-nez v6, :cond_e

    .line 259
    .line 260
    new-array v5, p3, [F

    .line 261
    .line 262
    move v6, v1

    .line 263
    :goto_9
    if-ge v6, p3, :cond_10

    .line 264
    .line 265
    invoke-virtual {p2, v6}, Lw/q;->a(I)F

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    aput v7, v5, v6

    .line 270
    .line 271
    add-int/lit8 v6, v6, 0x1

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_e
    new-array v6, p3, [F

    .line 275
    .line 276
    iget-object v7, p0, Lw/E0;->b:Lt/o;

    .line 277
    .line 278
    invoke-virtual {v7, v5}, Lt/o;->c(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    check-cast v5, Lw/D0;

    .line 286
    .line 287
    invoke-virtual {v5}, Lw/D0;->c()Lw/q;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    move v7, v1

    .line 292
    :goto_a
    if-ge v7, p3, :cond_c

    .line 293
    .line 294
    invoke-virtual {v5, v7}, Lw/q;->a(I)F

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    aput v8, v6, v7

    .line 299
    .line 300
    add-int/lit8 v7, v7, 0x1

    .line 301
    .line 302
    goto :goto_a

    .line 303
    :cond_f
    new-array v6, p3, [F

    .line 304
    .line 305
    iget-object v7, p0, Lw/E0;->b:Lt/o;

    .line 306
    .line 307
    invoke-virtual {v7, v5}, Lt/o;->c(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    invoke-static {v5}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    check-cast v5, Lw/D0;

    .line 315
    .line 316
    invoke-virtual {v5}, Lw/D0;->c()Lw/q;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    move v7, v1

    .line 321
    :goto_b
    if-ge v7, p3, :cond_c

    .line 322
    .line 323
    invoke-virtual {v5, v7}, Lw/q;->a(I)F

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    aput v8, v6, v7

    .line 328
    .line 329
    add-int/lit8 v7, v7, 0x1

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_10
    :goto_c
    aput-object v5, v3, v4

    .line 333
    .line 334
    add-int/lit8 v4, v4, 0x1

    .line 335
    .line 336
    goto/16 :goto_6

    .line 337
    .line 338
    :cond_11
    new-instance p1, Lw/u;

    .line 339
    .line 340
    iget-object p2, p0, Lw/E0;->g:[I

    .line 341
    .line 342
    if-nez p2, :cond_12

    .line 343
    .line 344
    const-string p2, "modes"

    .line 345
    .line 346
    invoke-static {p2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    move-object p2, v0

    .line 350
    :cond_12
    iget-object p3, p0, Lw/E0;->h:[F

    .line 351
    .line 352
    if-nez p3, :cond_13

    .line 353
    .line 354
    const-string p3, "times"

    .line 355
    .line 356
    invoke-static {p3}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    goto :goto_d

    .line 360
    :cond_13
    move-object v0, p3

    .line 361
    :goto_d
    invoke-direct {p1, p2, v0, v3}, Lw/u;-><init>([I[F[[F)V

    .line 362
    .line 363
    .line 364
    iput-object p1, p0, Lw/E0;->o:Lw/u;

    .line 365
    .line 366
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lw/E0;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public d(JLw/q;Lw/q;Lw/q;)Lw/q;
    .locals 5

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    invoke-static {p0, p1, p2}, Lw/w0;->b(Lw/y0;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    long-to-int p1, p1

    .line 10
    iget-object p2, p0, Lw/E0;->b:Lt/o;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Lt/o;->a(I)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, Lw/E0;->b:Lt/o;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    check-cast p1, Lw/D0;

    .line 28
    .line 29
    invoke-virtual {p1}, Lw/D0;->c()Lw/q;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    invoke-virtual {p0}, Lw/E0;->c()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-lt p1, p2, :cond_1

    .line 39
    .line 40
    return-object p4

    .line 41
    :cond_1
    if-gtz p1, :cond_2

    .line 42
    .line 43
    return-object p3

    .line 44
    :cond_2
    invoke-direct {p0, p3, p4, p5}, Lw/E0;->k(Lw/q;Lw/q;Lw/q;)V

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, Lw/E0;->o:Lw/u;

    .line 48
    .line 49
    const/4 p5, 0x0

    .line 50
    const-string v0, "valueVector"

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    if-eqz p2, :cond_a

    .line 54
    .line 55
    invoke-direct {p0, p1}, Lw/E0;->i(I)F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-object p2, p0, Lw/E0;->o:Lw/u;

    .line 60
    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    const-string p2, "arcSpline"

    .line 64
    .line 65
    invoke-static {p2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    move-object p2, v1

    .line 69
    :cond_3
    iget-object p3, p0, Lw/E0;->m:[F

    .line 70
    .line 71
    const-string p4, "posArray"

    .line 72
    .line 73
    if-nez p3, :cond_4

    .line 74
    .line 75
    invoke-static {p4}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    move-object p3, v1

    .line 79
    :cond_4
    invoke-virtual {p2, p1, p3}, Lw/u;->a(F[F)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lw/E0;->m:[F

    .line 83
    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    invoke-static {p4}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    move-object p1, v1

    .line 90
    :cond_5
    array-length p1, p1

    .line 91
    :goto_0
    if-ge p5, p1, :cond_8

    .line 92
    .line 93
    iget-object p2, p0, Lw/E0;->i:Lw/q;

    .line 94
    .line 95
    if-nez p2, :cond_6

    .line 96
    .line 97
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    move-object p2, v1

    .line 101
    :cond_6
    iget-object p3, p0, Lw/E0;->m:[F

    .line 102
    .line 103
    if-nez p3, :cond_7

    .line 104
    .line 105
    invoke-static {p4}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    move-object p3, v1

    .line 109
    :cond_7
    aget p3, p3, p5

    .line 110
    .line 111
    invoke-virtual {p2, p5, p3}, Lw/q;->e(IF)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 p5, p5, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_8
    iget-object p1, p0, Lw/E0;->i:Lw/q;

    .line 118
    .line 119
    if-nez p1, :cond_9

    .line 120
    .line 121
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return-object v1

    .line 125
    :cond_9
    return-object p1

    .line 126
    :cond_a
    invoke-direct {p0, p1}, Lw/E0;->h(I)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    const/4 v2, 0x1

    .line 131
    invoke-direct {p0, p2, p1, v2}, Lw/E0;->j(IIZ)F

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iget-object v3, p0, Lw/E0;->a:Lt/m;

    .line 136
    .line 137
    invoke-virtual {v3, p2}, Lt/m;->b(I)I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    iget-object v4, p0, Lw/E0;->b:Lt/o;

    .line 142
    .line 143
    invoke-virtual {v4, v3}, Lt/o;->a(I)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eqz v4, :cond_b

    .line 148
    .line 149
    iget-object p3, p0, Lw/E0;->b:Lt/o;

    .line 150
    .line 151
    invoke-virtual {p3, v3}, Lt/o;->c(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    check-cast p3, Lw/D0;

    .line 159
    .line 160
    invoke-virtual {p3}, Lw/D0;->c()Lw/q;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    :cond_b
    iget-object v3, p0, Lw/E0;->a:Lt/m;

    .line 165
    .line 166
    add-int/2addr p2, v2

    .line 167
    invoke-virtual {v3, p2}, Lt/m;->b(I)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    iget-object v2, p0, Lw/E0;->b:Lt/o;

    .line 172
    .line 173
    invoke-virtual {v2, p2}, Lt/o;->a(I)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_c

    .line 178
    .line 179
    iget-object p4, p0, Lw/E0;->b:Lt/o;

    .line 180
    .line 181
    invoke-virtual {p4, p2}, Lt/o;->c(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {p2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    check-cast p2, Lw/D0;

    .line 189
    .line 190
    invoke-virtual {p2}, Lw/D0;->c()Lw/q;

    .line 191
    .line 192
    .line 193
    move-result-object p4

    .line 194
    :cond_c
    iget-object p2, p0, Lw/E0;->i:Lw/q;

    .line 195
    .line 196
    if-nez p2, :cond_d

    .line 197
    .line 198
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    move-object p2, v1

    .line 202
    :cond_d
    invoke-virtual {p2}, Lw/q;->b()I

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    :goto_1
    if-ge p5, p2, :cond_f

    .line 207
    .line 208
    iget-object v2, p0, Lw/E0;->i:Lw/q;

    .line 209
    .line 210
    if-nez v2, :cond_e

    .line 211
    .line 212
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    move-object v2, v1

    .line 216
    :cond_e
    invoke-virtual {p3, p5}, Lw/q;->a(I)F

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    invoke-virtual {p4, p5}, Lw/q;->a(I)F

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    invoke-static {v3, v4, p1}, Lw/u0;->k(FFF)F

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    invoke-virtual {v2, p5, v3}, Lw/q;->e(IF)V

    .line 229
    .line 230
    .line 231
    add-int/lit8 p5, p5, 0x1

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_f
    iget-object p1, p0, Lw/E0;->i:Lw/q;

    .line 235
    .line 236
    if-nez p1, :cond_10

    .line 237
    .line 238
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-object v1

    .line 242
    :cond_10
    return-object p1
.end method

.method public e(JLw/q;Lw/q;Lw/q;)Lw/q;
    .locals 10

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    invoke-static {p0, p1, p2}, Lw/w0;->b(Lw/y0;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    cmp-long v0, p1, v0

    .line 12
    .line 13
    if-gez v0, :cond_0

    .line 14
    .line 15
    return-object p5

    .line 16
    :cond_0
    invoke-direct {p0, p3, p4, p5}, Lw/E0;->k(Lw/q;Lw/q;Lw/q;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lw/E0;->o:Lw/u;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const-string v7, "velocityVector"

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    if-eqz v0, :cond_8

    .line 26
    .line 27
    long-to-int p1, p1

    .line 28
    invoke-direct {p0, p1}, Lw/E0;->i(I)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object p2, p0, Lw/E0;->o:Lw/u;

    .line 33
    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    const-string p2, "arcSpline"

    .line 37
    .line 38
    invoke-static {p2}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    move-object p2, v8

    .line 42
    :cond_1
    iget-object p3, p0, Lw/E0;->n:[F

    .line 43
    .line 44
    const-string v0, "slopeArray"

    .line 45
    .line 46
    if-nez p3, :cond_2

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    move-object p3, v8

    .line 52
    :cond_2
    invoke-virtual {p2, p1, p3}, Lw/u;->b(F[F)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lw/E0;->n:[F

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move-object p1, v8

    .line 63
    :cond_3
    array-length p1, p1

    .line 64
    :goto_0
    if-ge v6, p1, :cond_6

    .line 65
    .line 66
    iget-object p2, p0, Lw/E0;->j:Lw/q;

    .line 67
    .line 68
    if-nez p2, :cond_4

    .line 69
    .line 70
    invoke-static {v7}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    move-object p2, v8

    .line 74
    :cond_4
    iget-object p3, p0, Lw/E0;->n:[F

    .line 75
    .line 76
    if-nez p3, :cond_5

    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object p3, v8

    .line 82
    :cond_5
    aget p3, p3, v6

    .line 83
    .line 84
    invoke-virtual {p2, v6, p3}, Lw/q;->e(IF)V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    iget-object p1, p0, Lw/E0;->j:Lw/q;

    .line 91
    .line 92
    if-nez p1, :cond_7

    .line 93
    .line 94
    invoke-static {v7}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v8

    .line 98
    :cond_7
    return-object p1

    .line 99
    :cond_8
    const-wide/16 v0, 0x1

    .line 100
    .line 101
    sub-long v1, p1, v0

    .line 102
    .line 103
    move-object v0, p0

    .line 104
    move-object v3, p3

    .line 105
    move-object v4, p4

    .line 106
    move-object v5, p5

    .line 107
    invoke-static/range {v0 .. v5}, Lw/w0;->d(Lw/v0;JLw/q;Lw/q;Lw/q;)Lw/q;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    move-wide v1, p1

    .line 112
    invoke-static/range {v0 .. v5}, Lw/w0;->d(Lw/v0;JLw/q;Lw/q;Lw/q;)Lw/q;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {v9}, Lw/q;->b()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    :goto_1
    if-ge v6, p2, :cond_a

    .line 121
    .line 122
    iget-object p3, p0, Lw/E0;->j:Lw/q;

    .line 123
    .line 124
    if-nez p3, :cond_9

    .line 125
    .line 126
    invoke-static {v7}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    move-object p3, v8

    .line 130
    :cond_9
    invoke-virtual {v9, v6}, Lw/q;->a(I)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    invoke-virtual {p1, v6}, Lw/q;->a(I)F

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    sub-float/2addr v1, v2

    .line 139
    const/high16 v2, 0x447a0000    # 1000.0f

    .line 140
    .line 141
    mul-float/2addr v1, v2

    .line 142
    invoke-virtual {p3, v6, v1}, Lw/q;->e(IF)V

    .line 143
    .line 144
    .line 145
    add-int/lit8 v6, v6, 0x1

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_a
    iget-object p1, p0, Lw/E0;->j:Lw/q;

    .line 149
    .line 150
    if-nez p1, :cond_b

    .line 151
    .line 152
    invoke-static {v7}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-object v8

    .line 156
    :cond_b
    return-object p1
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lw/E0;->d:I

    .line 2
    .line 3
    return v0
.end method
