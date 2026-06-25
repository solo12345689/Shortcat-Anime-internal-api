.class public final LU2/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU2/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU2/m$a;
    }
.end annotation


# static fields
.field private static final s:[I

.field private static final t:LU2/m$a;

.field private static final u:LU2/m$a;


# instance fields
.field private b:Z

.field private c:Z

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:LP9/u;

.field private n:I

.field private o:Z

.field private p:Lr3/r$a;

.field private q:I

.field private r:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LU2/m;->s:[I

    .line 9
    .line 10
    new-instance v0, LU2/m$a;

    .line 11
    .line 12
    new-instance v1, LU2/k;

    .line 13
    .line 14
    invoke-direct {v1}, LU2/k;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, LU2/m$a;-><init>(LU2/m$a$a;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LU2/m;->t:LU2/m$a;

    .line 21
    .line 22
    new-instance v0, LU2/m$a;

    .line 23
    .line 24
    new-instance v1, LU2/l;

    .line 25
    .line 26
    invoke-direct {v1}, LU2/l;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, LU2/m$a;-><init>(LU2/m$a$a;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, LU2/m;->u:LU2/m$a;

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, LU2/m;->k:I

    .line 6
    .line 7
    const v1, 0x1b8a0

    .line 8
    .line 9
    .line 10
    iput v1, p0, LU2/m;->n:I

    .line 11
    .line 12
    new-instance v1, Lr3/g;

    .line 13
    .line 14
    invoke-direct {v1}, Lr3/g;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, LU2/m;->p:Lr3/r$a;

    .line 18
    .line 19
    iput-boolean v0, p0, LU2/m;->o:Z

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic g()Ljava/lang/reflect/Constructor;
    .locals 1

    .line 1
    invoke-static {}, LU2/m;->l()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic h()Ljava/lang/reflect/Constructor;
    .locals 1

    .line 1
    invoke-static {}, LU2/m;->m()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private i(ILjava/util/List;)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    goto :goto_0

    .line 7
    :pswitch_1
    new-instance p1, LX2/a;

    .line 8
    .line 9
    invoke-direct {p1}, LX2/a;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_2
    iget p1, p0, LU2/m;->h:I

    .line 17
    .line 18
    and-int/lit8 v0, p1, 0x2

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    and-int/lit8 p1, p1, 0x4

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Lb3/a;

    .line 27
    .line 28
    invoke-direct {p1}, Lb3/a;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_3
    new-instance p1, LY2/a;

    .line 36
    .line 37
    invoke-direct {p1}, LY2/a;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_4
    new-instance p1, LD3/a;

    .line 45
    .line 46
    invoke-direct {p1}, LD3/a;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_5
    new-instance p1, Lq3/a;

    .line 54
    .line 55
    invoke-direct {p1}, Lq3/a;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_6
    new-instance p1, LW2/b;

    .line 63
    .line 64
    iget-boolean v0, p0, LU2/m;->o:Z

    .line 65
    .line 66
    xor-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    iget-object v1, p0, LU2/m;->p:Lr3/r$a;

    .line 69
    .line 70
    invoke-direct {p1, v0, v1}, LW2/b;-><init>(ILr3/r$a;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_7
    sget-object p1, LU2/m;->u:LU2/m$a;

    .line 78
    .line 79
    new-array v0, v1, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, LU2/m$a;->a([Ljava/lang/Object;)LU2/p;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_0

    .line 86
    .line 87
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_0
    :goto_0
    return-void

    .line 91
    :pswitch_8
    new-instance p1, Lc3/a;

    .line 92
    .line 93
    iget v0, p0, LU2/m;->r:I

    .line 94
    .line 95
    invoke-direct {p1, v0}, Lc3/a;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_9
    new-instance p1, LC3/b;

    .line 103
    .line 104
    invoke-direct {p1}, LC3/b;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_a
    iget-object p1, p0, LU2/m;->m:LP9/u;

    .line 112
    .line 113
    if-nez p1, :cond_1

    .line 114
    .line 115
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, p0, LU2/m;->m:LP9/u;

    .line 120
    .line 121
    :cond_1
    new-instance v0, LB3/K;

    .line 122
    .line 123
    iget v1, p0, LU2/m;->k:I

    .line 124
    .line 125
    iget-boolean p1, p0, LU2/m;->o:Z

    .line 126
    .line 127
    xor-int/lit8 v2, p1, 0x1

    .line 128
    .line 129
    iget-object v3, p0, LU2/m;->p:Lr3/r$a;

    .line 130
    .line 131
    new-instance v4, Lt2/O;

    .line 132
    .line 133
    const-wide/16 v5, 0x0

    .line 134
    .line 135
    invoke-direct {v4, v5, v6}, Lt2/O;-><init>(J)V

    .line 136
    .line 137
    .line 138
    new-instance v5, LB3/j;

    .line 139
    .line 140
    iget p1, p0, LU2/m;->l:I

    .line 141
    .line 142
    iget-object v6, p0, LU2/m;->m:LP9/u;

    .line 143
    .line 144
    invoke-direct {v5, p1, v6}, LB3/j;-><init>(ILjava/util/List;)V

    .line 145
    .line 146
    .line 147
    iget v6, p0, LU2/m;->n:I

    .line 148
    .line 149
    invoke-direct/range {v0 .. v6}, LB3/K;-><init>(IILr3/r$a;Lt2/O;LB3/L$c;I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_b
    new-instance p1, LB3/C;

    .line 157
    .line 158
    invoke-direct {p1}, LB3/C;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_c
    new-instance p1, Lp3/d;

    .line 166
    .line 167
    invoke-direct {p1}, Lp3/d;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :pswitch_d
    new-instance p1, Lo3/h;

    .line 175
    .line 176
    iget-object v0, p0, LU2/m;->p:Lr3/r$a;

    .line 177
    .line 178
    iget v2, p0, LU2/m;->i:I

    .line 179
    .line 180
    iget v3, p0, LU2/m;->q:I

    .line 181
    .line 182
    invoke-static {v3}, Lo3/h;->k(I)I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    or-int/2addr v2, v3

    .line 187
    iget-boolean v3, p0, LU2/m;->o:Z

    .line 188
    .line 189
    if-eqz v3, :cond_2

    .line 190
    .line 191
    move v3, v1

    .line 192
    goto :goto_1

    .line 193
    :cond_2
    const/16 v3, 0x20

    .line 194
    .line 195
    :goto_1
    or-int/2addr v2, v3

    .line 196
    invoke-direct {p1, v0, v2}, Lo3/h;-><init>(Lr3/r$a;I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    new-instance p1, Lo3/n;

    .line 203
    .line 204
    iget-object v0, p0, LU2/m;->p:Lr3/r$a;

    .line 205
    .line 206
    iget v2, p0, LU2/m;->h:I

    .line 207
    .line 208
    iget v3, p0, LU2/m;->q:I

    .line 209
    .line 210
    invoke-static {v3}, Lo3/n;->t(I)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    or-int/2addr v2, v3

    .line 215
    iget-boolean v3, p0, LU2/m;->o:Z

    .line 216
    .line 217
    if-eqz v3, :cond_3

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_3
    const/16 v1, 0x10

    .line 221
    .line 222
    :goto_2
    or-int/2addr v1, v2

    .line 223
    invoke-direct {p1, v0, v1}, Lo3/n;-><init>(Lr3/r$a;I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :pswitch_e
    new-instance p1, Ln3/f;

    .line 231
    .line 232
    iget v2, p0, LU2/m;->j:I

    .line 233
    .line 234
    iget-boolean v3, p0, LU2/m;->b:Z

    .line 235
    .line 236
    or-int/2addr v2, v3

    .line 237
    iget-boolean v3, p0, LU2/m;->c:Z

    .line 238
    .line 239
    if-eqz v3, :cond_4

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_4
    move v0, v1

    .line 243
    :goto_3
    or-int/2addr v0, v2

    .line 244
    invoke-direct {p1, v0}, Ln3/f;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_f
    new-instance p1, Lm3/e;

    .line 252
    .line 253
    iget-object v2, p0, LU2/m;->p:Lr3/r$a;

    .line 254
    .line 255
    iget v3, p0, LU2/m;->g:I

    .line 256
    .line 257
    iget-boolean v4, p0, LU2/m;->o:Z

    .line 258
    .line 259
    if-eqz v4, :cond_5

    .line 260
    .line 261
    move v0, v1

    .line 262
    :cond_5
    or-int/2addr v0, v3

    .line 263
    invoke-direct {p1, v2, v0}, Lm3/e;-><init>(Lr3/r$a;I)V

    .line 264
    .line 265
    .line 266
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :pswitch_10
    new-instance p1, La3/c;

    .line 271
    .line 272
    invoke-direct {p1}, La3/c;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_11
    sget-object p1, LU2/m;->t:LU2/m$a;

    .line 280
    .line 281
    iget v0, p0, LU2/m;->f:I

    .line 282
    .line 283
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {p1, v0}, LU2/m$a;->a([Ljava/lang/Object;)LU2/p;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    if-eqz p1, :cond_6

    .line 296
    .line 297
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :cond_6
    new-instance p1, LZ2/d;

    .line 302
    .line 303
    iget v0, p0, LU2/m;->f:I

    .line 304
    .line 305
    invoke-direct {p1, v0}, LZ2/d;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_12
    new-instance p1, LV2/b;

    .line 313
    .line 314
    iget v2, p0, LU2/m;->e:I

    .line 315
    .line 316
    iget-boolean v3, p0, LU2/m;->b:Z

    .line 317
    .line 318
    or-int/2addr v2, v3

    .line 319
    iget-boolean v3, p0, LU2/m;->c:Z

    .line 320
    .line 321
    if-eqz v3, :cond_7

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_7
    move v0, v1

    .line 325
    :goto_4
    or-int/2addr v0, v2

    .line 326
    invoke-direct {p1, v0}, LV2/b;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_13
    new-instance p1, LB3/h;

    .line 334
    .line 335
    iget v2, p0, LU2/m;->d:I

    .line 336
    .line 337
    iget-boolean v3, p0, LU2/m;->b:Z

    .line 338
    .line 339
    or-int/2addr v2, v3

    .line 340
    iget-boolean v3, p0, LU2/m;->c:Z

    .line 341
    .line 342
    if-eqz v3, :cond_8

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_8
    move v0, v1

    .line 346
    :goto_5
    or-int/2addr v0, v2

    .line 347
    invoke-direct {p1, v0}, LB3/h;-><init>(I)V

    .line 348
    .line 349
    .line 350
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :pswitch_14
    new-instance p1, LB3/e;

    .line 355
    .line 356
    invoke-direct {p1}, LB3/e;-><init>()V

    .line 357
    .line 358
    .line 359
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :pswitch_15
    new-instance p1, LB3/b;

    .line 364
    .line 365
    invoke-direct {p1}, LB3/b;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    nop

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static l()Ljava/lang/reflect/Constructor;
    .locals 4

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    const-string v1, "androidx.media3.decoder.flac.FlacLibrary"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "isAvailable"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const-string v0, "androidx.media3.decoder.flac.FlacExtractor"

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-class v1, LU2/p;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_0
    return-object v3
.end method

.method private static m()Ljava/lang/reflect/Constructor;
    .locals 2

    .line 1
    const-string v0, "androidx.media3.decoder.midi.MidiExtractor"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, LU2/p;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Lr3/r$a;)LU2/u;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LU2/m;->o(Lr3/r$a;)LU2/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(I)LU2/u;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LU2/m;->j(I)LU2/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(Z)LU2/u;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LU2/m;->k(Z)LU2/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public declared-synchronized d(Landroid/net/Uri;Ljava/util/Map;)[LU2/p;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    sget-object v1, LU2/m;->s:[I

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lq2/s;->b(Ljava/util/Map;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v2, -0x1

    .line 15
    if-eq p2, v2, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, p2, v0}, LU2/m;->i(ILjava/util/List;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    :goto_0
    invoke-static {p1}, Lq2/s;->c(Landroid/net/Uri;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eq p1, v2, :cond_1

    .line 28
    .line 29
    if-eq p1, p2, :cond_1

    .line 30
    .line 31
    invoke-direct {p0, p1, v0}, LU2/m;->i(ILjava/util/List;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    array-length v2, v1

    .line 35
    const/4 v3, 0x0

    .line 36
    move v4, v3

    .line 37
    :goto_1
    if-ge v4, v2, :cond_3

    .line 38
    .line 39
    aget v5, v1, v4

    .line 40
    .line 41
    if-eq v5, p2, :cond_2

    .line 42
    .line 43
    if-eq v5, p1, :cond_2

    .line 44
    .line 45
    invoke-direct {p0, v5, v0}, LU2/m;->i(ILjava/util/List;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    new-array p1, v3, [LU2/p;

    .line 52
    .line 53
    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, [LU2/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    return-object p1

    .line 61
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw p1
.end method

.method public declared-synchronized f()[LU2/p;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, LU2/m;->d(Landroid/net/Uri;Ljava/util/Map;)[LU2/p;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method

.method public declared-synchronized j(I)LU2/m;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, LU2/m;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized k(Z)LU2/m;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, LU2/m;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized n(I)LU2/m;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput p1, p0, LU2/m;->r:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public declared-synchronized o(Lr3/r$a;)LU2/m;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, LU2/m;->p:Lr3/r$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method
