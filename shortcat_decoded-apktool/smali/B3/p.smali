.class public final LB3/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LB3/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB3/p$b;
    }
.end annotation


# instance fields
.field private final a:LB3/G;

.field private final b:Z

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:LB3/w;

.field private final f:LB3/w;

.field private final g:LB3/w;

.field private h:J

.field private final i:[Z

.field private j:Ljava/lang/String;

.field private k:LU2/O;

.field private l:LB3/p$b;

.field private m:Z

.field private n:J

.field private o:Z

.field private final p:Lt2/I;


# direct methods
.method public constructor <init>(LB3/G;ZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB3/p;->a:LB3/G;

    .line 5
    .line 6
    iput-boolean p2, p0, LB3/p;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, LB3/p;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, LB3/p;->d:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p1, 0x3

    .line 13
    new-array p1, p1, [Z

    .line 14
    .line 15
    iput-object p1, p0, LB3/p;->i:[Z

    .line 16
    .line 17
    new-instance p1, LB3/w;

    .line 18
    .line 19
    const/4 p2, 0x7

    .line 20
    const/16 p3, 0x80

    .line 21
    .line 22
    invoke-direct {p1, p2, p3}, LB3/w;-><init>(II)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LB3/p;->e:LB3/w;

    .line 26
    .line 27
    new-instance p1, LB3/w;

    .line 28
    .line 29
    const/16 p2, 0x8

    .line 30
    .line 31
    invoke-direct {p1, p2, p3}, LB3/w;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LB3/p;->f:LB3/w;

    .line 35
    .line 36
    new-instance p1, LB3/w;

    .line 37
    .line 38
    const/4 p2, 0x6

    .line 39
    invoke-direct {p1, p2, p3}, LB3/w;-><init>(II)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, LB3/p;->g:LB3/w;

    .line 43
    .line 44
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    iput-wide p1, p0, LB3/p;->n:J

    .line 50
    .line 51
    new-instance p1, Lt2/I;

    .line 52
    .line 53
    invoke-direct {p1}, Lt2/I;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LB3/p;->p:Lt2/I;

    .line 57
    .line 58
    return-void
.end method

.method private a()V
    .locals 1

    .line 1
    iget-object v0, p0, LB3/p;->k:LU2/O;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB3/p;->l:LB3/p$b;

    .line 7
    .line 8
    invoke-static {v0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private g(JIIJ)V
    .locals 7

    .line 1
    iget-boolean v0, p0, LB3/p;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LB3/p;->l:LB3/p$b;

    .line 6
    .line 7
    invoke-virtual {v0}, LB3/p$b;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 14
    .line 15
    invoke-virtual {v0, p4}, LB3/w;->b(I)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 19
    .line 20
    invoke-virtual {v0, p4}, LB3/w;->b(I)Z

    .line 21
    .line 22
    .line 23
    iget-boolean v0, p0, LB3/p;->m:Z

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 29
    .line 30
    invoke-virtual {v0}, LB3/w;->c()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 37
    .line 38
    invoke-virtual {v0}, LB3/w;->c()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, LB3/p;->e:LB3/w;

    .line 50
    .line 51
    iget-object v3, v2, LB3/w;->d:[B

    .line 52
    .line 53
    iget v2, v2, LB3/w;->e:I

    .line 54
    .line 55
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, LB3/p;->f:LB3/w;

    .line 63
    .line 64
    iget-object v3, v2, LB3/w;->d:[B

    .line 65
    .line 66
    iget v2, v2, LB3/w;->e:I

    .line 67
    .line 68
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, LB3/p;->e:LB3/w;

    .line 76
    .line 77
    iget-object v3, v2, LB3/w;->d:[B

    .line 78
    .line 79
    iget v2, v2, LB3/w;->e:I

    .line 80
    .line 81
    invoke-static {v3, v1, v2}, Lu2/h;->C([BII)Lu2/h$m;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v3, p0, LB3/p;->f:LB3/w;

    .line 86
    .line 87
    iget-object v4, v3, LB3/w;->d:[B

    .line 88
    .line 89
    iget v3, v3, LB3/w;->e:I

    .line 90
    .line 91
    invoke-static {v4, v1, v3}, Lu2/h;->A([BII)Lu2/h$l;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget v3, v2, Lu2/h$m;->a:I

    .line 96
    .line 97
    iget v4, v2, Lu2/h$m;->b:I

    .line 98
    .line 99
    iget v5, v2, Lu2/h$m;->c:I

    .line 100
    .line 101
    invoke-static {v3, v4, v5}, Lt2/k;->f(III)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-object v4, p0, LB3/p;->k:LU2/O;

    .line 106
    .line 107
    new-instance v5, Lq2/x$b;

    .line 108
    .line 109
    invoke-direct {v5}, Lq2/x$b;-><init>()V

    .line 110
    .line 111
    .line 112
    iget-object v6, p0, LB3/p;->j:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Lq2/x$b;->j0(Ljava/lang/String;)Lq2/x$b;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    iget-object v6, p0, LB3/p;->d:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v5, v6}, Lq2/x$b;->W(Ljava/lang/String;)Lq2/x$b;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    const-string v6, "video/avc"

    .line 125
    .line 126
    invoke-virtual {v5, v6}, Lq2/x$b;->y0(Ljava/lang/String;)Lq2/x$b;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v5, v3}, Lq2/x$b;->U(Ljava/lang/String;)Lq2/x$b;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget v5, v2, Lu2/h$m;->f:I

    .line 135
    .line 136
    invoke-virtual {v3, v5}, Lq2/x$b;->F0(I)Lq2/x$b;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget v5, v2, Lu2/h$m;->g:I

    .line 141
    .line 142
    invoke-virtual {v3, v5}, Lq2/x$b;->h0(I)Lq2/x$b;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    new-instance v5, Lq2/l$b;

    .line 147
    .line 148
    invoke-direct {v5}, Lq2/l$b;-><init>()V

    .line 149
    .line 150
    .line 151
    iget v6, v2, Lu2/h$m;->q:I

    .line 152
    .line 153
    invoke-virtual {v5, v6}, Lq2/l$b;->d(I)Lq2/l$b;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    iget v6, v2, Lu2/h$m;->r:I

    .line 158
    .line 159
    invoke-virtual {v5, v6}, Lq2/l$b;->c(I)Lq2/l$b;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    iget v6, v2, Lu2/h$m;->s:I

    .line 164
    .line 165
    invoke-virtual {v5, v6}, Lq2/l$b;->e(I)Lq2/l$b;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iget v6, v2, Lu2/h$m;->i:I

    .line 170
    .line 171
    add-int/lit8 v6, v6, 0x8

    .line 172
    .line 173
    invoke-virtual {v5, v6}, Lq2/l$b;->g(I)Lq2/l$b;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    iget v6, v2, Lu2/h$m;->j:I

    .line 178
    .line 179
    add-int/lit8 v6, v6, 0x8

    .line 180
    .line 181
    invoke-virtual {v5, v6}, Lq2/l$b;->b(I)Lq2/l$b;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v5}, Lq2/l$b;->a()Lq2/l;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v3, v5}, Lq2/x$b;->V(Lq2/l;)Lq2/x$b;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    iget v5, v2, Lu2/h$m;->h:F

    .line 194
    .line 195
    invoke-virtual {v3, v5}, Lq2/x$b;->u0(F)Lq2/x$b;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3, v0}, Lq2/x$b;->k0(Ljava/util/List;)Lq2/x$b;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget v3, v2, Lu2/h$m;->t:I

    .line 204
    .line 205
    invoke-virtual {v0, v3}, Lq2/x$b;->p0(I)Lq2/x$b;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lq2/x$b;->P()Lq2/x;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-interface {v4, v0}, LU2/O;->c(Lq2/x;)V

    .line 214
    .line 215
    .line 216
    const/4 v0, 0x1

    .line 217
    iput-boolean v0, p0, LB3/p;->m:Z

    .line 218
    .line 219
    iget-object v0, p0, LB3/p;->a:LB3/G;

    .line 220
    .line 221
    iget v3, v2, Lu2/h$m;->t:I

    .line 222
    .line 223
    invoke-virtual {v0, v3}, LB3/G;->f(I)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, LB3/p;->l:LB3/p$b;

    .line 227
    .line 228
    invoke-virtual {v0, v2}, LB3/p$b;->f(Lu2/h$m;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, LB3/p;->l:LB3/p$b;

    .line 232
    .line 233
    invoke-virtual {v0, v1}, LB3/p$b;->e(Lu2/h$l;)V

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 237
    .line 238
    invoke-virtual {v0}, LB3/w;->d()V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 242
    .line 243
    invoke-virtual {v0}, LB3/w;->d()V

    .line 244
    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_1
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 248
    .line 249
    invoke-virtual {v0}, LB3/w;->c()Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_2

    .line 254
    .line 255
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 256
    .line 257
    iget-object v2, v0, LB3/w;->d:[B

    .line 258
    .line 259
    iget v0, v0, LB3/w;->e:I

    .line 260
    .line 261
    invoke-static {v2, v1, v0}, Lu2/h;->C([BII)Lu2/h$m;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iget-object v1, p0, LB3/p;->a:LB3/G;

    .line 266
    .line 267
    iget v2, v0, Lu2/h$m;->t:I

    .line 268
    .line 269
    invoke-virtual {v1, v2}, LB3/G;->f(I)V

    .line 270
    .line 271
    .line 272
    iget-object v1, p0, LB3/p;->l:LB3/p$b;

    .line 273
    .line 274
    invoke-virtual {v1, v0}, LB3/p$b;->f(Lu2/h$m;)V

    .line 275
    .line 276
    .line 277
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 278
    .line 279
    invoke-virtual {v0}, LB3/w;->d()V

    .line 280
    .line 281
    .line 282
    goto :goto_0

    .line 283
    :cond_2
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 284
    .line 285
    invoke-virtual {v0}, LB3/w;->c()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_3

    .line 290
    .line 291
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 292
    .line 293
    iget-object v2, v0, LB3/w;->d:[B

    .line 294
    .line 295
    iget v0, v0, LB3/w;->e:I

    .line 296
    .line 297
    invoke-static {v2, v1, v0}, Lu2/h;->A([BII)Lu2/h$l;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    iget-object v1, p0, LB3/p;->l:LB3/p$b;

    .line 302
    .line 303
    invoke-virtual {v1, v0}, LB3/p$b;->e(Lu2/h$l;)V

    .line 304
    .line 305
    .line 306
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 307
    .line 308
    invoke-virtual {v0}, LB3/w;->d()V

    .line 309
    .line 310
    .line 311
    :cond_3
    :goto_0
    iget-object v0, p0, LB3/p;->g:LB3/w;

    .line 312
    .line 313
    invoke-virtual {v0, p4}, LB3/w;->b(I)Z

    .line 314
    .line 315
    .line 316
    move-result p4

    .line 317
    if-eqz p4, :cond_4

    .line 318
    .line 319
    iget-object p4, p0, LB3/p;->g:LB3/w;

    .line 320
    .line 321
    iget-object v0, p4, LB3/w;->d:[B

    .line 322
    .line 323
    iget p4, p4, LB3/w;->e:I

    .line 324
    .line 325
    invoke-static {v0, p4}, Lu2/h;->L([BI)I

    .line 326
    .line 327
    .line 328
    move-result p4

    .line 329
    iget-object v0, p0, LB3/p;->p:Lt2/I;

    .line 330
    .line 331
    iget-object v1, p0, LB3/p;->g:LB3/w;

    .line 332
    .line 333
    iget-object v1, v1, LB3/w;->d:[B

    .line 334
    .line 335
    invoke-virtual {v0, v1, p4}, Lt2/I;->Z([BI)V

    .line 336
    .line 337
    .line 338
    iget-object p4, p0, LB3/p;->p:Lt2/I;

    .line 339
    .line 340
    const/4 v0, 0x4

    .line 341
    invoke-virtual {p4, v0}, Lt2/I;->b0(I)V

    .line 342
    .line 343
    .line 344
    iget-object p4, p0, LB3/p;->a:LB3/G;

    .line 345
    .line 346
    iget-object v0, p0, LB3/p;->p:Lt2/I;

    .line 347
    .line 348
    invoke-virtual {p4, p5, p6, v0}, LB3/G;->c(JLt2/I;)V

    .line 349
    .line 350
    .line 351
    :cond_4
    iget-object p4, p0, LB3/p;->l:LB3/p$b;

    .line 352
    .line 353
    iget-boolean p5, p0, LB3/p;->m:Z

    .line 354
    .line 355
    invoke-virtual {p4, p1, p2, p3, p5}, LB3/p$b;->b(JIZ)Z

    .line 356
    .line 357
    .line 358
    move-result p1

    .line 359
    if-eqz p1, :cond_5

    .line 360
    .line 361
    const/4 p1, 0x0

    .line 362
    iput-boolean p1, p0, LB3/p;->o:Z

    .line 363
    .line 364
    :cond_5
    return-void
.end method

.method private h([BII)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LB3/p;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LB3/p;->l:LB3/p$b;

    .line 6
    .line 7
    invoke-virtual {v0}, LB3/p$b;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, p3}, LB3/w;->a([BII)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3}, LB3/w;->a([BII)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, LB3/p;->g:LB3/w;

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2, p3}, LB3/w;->a([BII)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LB3/p;->l:LB3/p$b;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2, p3}, LB3/p$b;->a([BII)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private i(JIJ)V
    .locals 8

    .line 1
    iget-boolean v0, p0, LB3/p;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LB3/p;->l:LB3/p$b;

    .line 6
    .line 7
    invoke-virtual {v0}, LB3/p$b;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 14
    .line 15
    invoke-virtual {v0, p3}, LB3/w;->e(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 19
    .line 20
    invoke-virtual {v0, p3}, LB3/w;->e(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, LB3/p;->g:LB3/w;

    .line 24
    .line 25
    invoke-virtual {v0, p3}, LB3/w;->e(I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LB3/p;->l:LB3/p$b;

    .line 29
    .line 30
    iget-boolean v7, p0, LB3/p;->o:Z

    .line 31
    .line 32
    move-wide v2, p1

    .line 33
    move v4, p3

    .line 34
    move-wide v5, p4

    .line 35
    invoke-virtual/range {v1 .. v7}, LB3/p$b;->i(JIJZ)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public b(Lt2/I;)V
    .locals 14

    .line 1
    invoke-direct {p0}, LB3/p;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lt2/I;->g()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-virtual {p1}, Lt2/I;->j()I

    .line 9
    .line 10
    .line 11
    move-result v7

    .line 12
    invoke-virtual {p1}, Lt2/I;->f()[B

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    iget-wide v2, p0, LB3/p;->h:J

    .line 17
    .line 18
    invoke-virtual {p1}, Lt2/I;->a()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    int-to-long v4, v4

    .line 23
    add-long/2addr v2, v4

    .line 24
    iput-wide v2, p0, LB3/p;->h:J

    .line 25
    .line 26
    iget-object v2, p0, LB3/p;->k:LU2/O;

    .line 27
    .line 28
    invoke-virtual {p1}, Lt2/I;->a()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-interface {v2, p1, v3}, LU2/O;->f(Lt2/I;I)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v2, p0, LB3/p;->i:[Z

    .line 36
    .line 37
    invoke-static {v8, v1, v7, v2}, Lu2/h;->e([BII[Z)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-ne v2, v7, :cond_0

    .line 42
    .line 43
    invoke-direct {p0, v8, v1, v7}, LB3/p;->h([BII)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-static {v8, v2}, Lu2/h;->j([BI)I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-lez v2, :cond_1

    .line 52
    .line 53
    add-int/lit8 v3, v2, -0x1

    .line 54
    .line 55
    aget-byte v3, v8, v3

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    add-int/lit8 v2, v2, -0x1

    .line 60
    .line 61
    const/4 v3, 0x4

    .line 62
    :goto_1
    move v10, v2

    .line 63
    move v11, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_1
    const/4 v3, 0x3

    .line 66
    goto :goto_1

    .line 67
    :goto_2
    sub-int v2, v10, v1

    .line 68
    .line 69
    if-lez v2, :cond_2

    .line 70
    .line 71
    invoke-direct {p0, v8, v1, v10}, LB3/p;->h([BII)V

    .line 72
    .line 73
    .line 74
    :cond_2
    sub-int v3, v7, v10

    .line 75
    .line 76
    iget-wide v4, p0, LB3/p;->h:J

    .line 77
    .line 78
    int-to-long v12, v3

    .line 79
    sub-long/2addr v4, v12

    .line 80
    if-gez v2, :cond_3

    .line 81
    .line 82
    neg-int v1, v2

    .line 83
    :goto_3
    move-wide v12, v4

    .line 84
    goto :goto_4

    .line 85
    :cond_3
    const/4 v1, 0x0

    .line 86
    goto :goto_3

    .line 87
    :goto_4
    iget-wide v5, p0, LB3/p;->n:J

    .line 88
    .line 89
    move-object v0, p0

    .line 90
    move v4, v1

    .line 91
    move-wide v1, v12

    .line 92
    invoke-direct/range {v0 .. v6}, LB3/p;->g(JIIJ)V

    .line 93
    .line 94
    .line 95
    iget-wide v4, p0, LB3/p;->n:J

    .line 96
    .line 97
    move v3, v9

    .line 98
    invoke-direct/range {v0 .. v5}, LB3/p;->i(JIJ)V

    .line 99
    .line 100
    .line 101
    add-int v1, v10, v11

    .line 102
    .line 103
    goto :goto_0
.end method

.method public c()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LB3/p;->h:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LB3/p;->o:Z

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, p0, LB3/p;->n:J

    .line 14
    .line 15
    iget-object v0, p0, LB3/p;->i:[Z

    .line 16
    .line 17
    invoke-static {v0}, Lu2/h;->c([Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LB3/p;->e:LB3/w;

    .line 21
    .line 22
    invoke-virtual {v0}, LB3/w;->d()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LB3/p;->f:LB3/w;

    .line 26
    .line 27
    invoke-virtual {v0}, LB3/w;->d()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LB3/p;->g:LB3/w;

    .line 31
    .line 32
    invoke-virtual {v0}, LB3/w;->d()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LB3/p;->a:LB3/G;

    .line 36
    .line 37
    invoke-virtual {v0}, LB3/G;->b()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, LB3/p;->l:LB3/p$b;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, LB3/p$b;->g()V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 14

    .line 1
    invoke-direct {p0}, LB3/p;->a()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, LB3/p;->a:LB3/G;

    .line 7
    .line 8
    invoke-virtual {p1}, LB3/G;->e()V

    .line 9
    .line 10
    .line 11
    iget-wide v1, p0, LB3/p;->h:J

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    iget-wide v5, p0, LB3/p;->n:J

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v0, p0

    .line 18
    invoke-direct/range {v0 .. v6}, LB3/p;->g(JIIJ)V

    .line 19
    .line 20
    .line 21
    move-object v7, v0

    .line 22
    iget-wide v8, v7, LB3/p;->h:J

    .line 23
    .line 24
    const/16 v10, 0x9

    .line 25
    .line 26
    iget-wide v11, v7, LB3/p;->n:J

    .line 27
    .line 28
    invoke-direct/range {v7 .. v12}, LB3/p;->i(JIJ)V

    .line 29
    .line 30
    .line 31
    iget-wide v8, v7, LB3/p;->h:J

    .line 32
    .line 33
    const/4 v11, 0x0

    .line 34
    iget-wide v12, v7, LB3/p;->n:J

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    invoke-direct/range {v7 .. v13}, LB3/p;->g(JIIJ)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public e(LU2/r;LB3/L$d;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, LB3/L$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LB3/L$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LB3/p;->j:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, LB3/L$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, LU2/r;->e(II)LU2/O;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, LB3/p;->k:LU2/O;

    .line 20
    .line 21
    new-instance v1, LB3/p$b;

    .line 22
    .line 23
    iget-boolean v2, p0, LB3/p;->b:Z

    .line 24
    .line 25
    iget-boolean v3, p0, LB3/p;->c:Z

    .line 26
    .line 27
    invoke-direct {v1, v0, v2, v3}, LB3/p$b;-><init>(LU2/O;ZZ)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, LB3/p;->l:LB3/p$b;

    .line 31
    .line 32
    iget-object v0, p0, LB3/p;->a:LB3/G;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, LB3/G;->d(LU2/r;LB3/L$d;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public f(JI)V
    .locals 0

    .line 1
    iput-wide p1, p0, LB3/p;->n:J

    .line 2
    .line 3
    iget-boolean p1, p0, LB3/p;->o:Z

    .line 4
    .line 5
    and-int/lit8 p2, p3, 0x2

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    or-int/2addr p1, p2

    .line 13
    iput-boolean p1, p0, LB3/p;->o:Z

    .line 14
    .line 15
    return-void
.end method
