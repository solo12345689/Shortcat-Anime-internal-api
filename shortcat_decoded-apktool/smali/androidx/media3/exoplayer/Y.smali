.class final Landroidx/media3/exoplayer/Y;
.super Lq2/h;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/media3/exoplayer/ExoPlayer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/Y$c;,
        Landroidx/media3/exoplayer/Y$d;,
        Landroidx/media3/exoplayer/Y$b;,
        Landroidx/media3/exoplayer/Y$e;
    }
.end annotation


# instance fields
.field private final A:Landroidx/media3/exoplayer/Y$d;

.field private final B:Landroidx/media3/exoplayer/d;

.field private final C:Landroidx/media3/exoplayer/e1;

.field private final D:Landroidx/media3/exoplayer/j1;

.field private final E:Landroidx/media3/exoplayer/m1;

.field private final F:J

.field private final G:Landroidx/media3/exoplayer/g1;

.field private final H:Lt2/g;

.field private I:I

.field private J:Z

.field private K:I

.field private L:I

.field private M:Z

.field private N:Z

.field private O:LP9/w;

.field private P:LA2/P;

.field private Q:LA2/Q;

.field private R:LM2/e0;

.field private S:Landroidx/media3/exoplayer/ExoPlayer$c;

.field private T:Z

.field private U:Lq2/P$b;

.field private V:Lq2/I;

.field private W:Lq2/I;

.field private X:Lq2/x;

.field private Y:Lq2/x;

.field private Z:Ljava/lang/Object;

.field private a0:Landroid/view/Surface;

.field final b:LP2/H;

.field private b0:Landroid/view/SurfaceHolder;

.field final c:Lq2/P$b;

.field private c0:LT2/l;

.field private final d:Lt2/m;

.field private d0:Z

.field private final e:Landroid/content/Context;

.field private e0:Landroid/view/TextureView;

.field private final f:Lq2/P;

.field private f0:I

.field private final g:[Landroidx/media3/exoplayer/N0;

.field private g0:I

.field private final h:[Landroidx/media3/exoplayer/N0;

.field private h0:Lt2/K;

.field private final i:LP2/G;

.field private i0:LA2/b;

.field private final j:Lt2/s;

.field private j0:LA2/b;

.field private final k:Landroidx/media3/exoplayer/o0$f;

.field private k0:Lq2/c;

.field private final l:Landroidx/media3/exoplayer/o0;

.field private l0:F

.field private final m:Lt2/v;

.field private m0:Z

.field private final n:Ljava/util/concurrent/CopyOnWriteArraySet;

.field private n0:Ls2/e;

.field private final o:Lq2/Y$b;

.field private o0:Z

.field private final p:Ljava/util/List;

.field private p0:Z

.field private final q:Z

.field private q0:I

.field private final r:LM2/D$a;

.field private r0:Z

.field private final s:LB2/a;

.field private s0:Z

.field private final t:Landroid/os/Looper;

.field private t0:Lq2/p;

.field private final u:LQ2/d;

.field private u0:Lq2/l0;

.field private final v:J

.field private v0:Lq2/I;

.field private final w:J

.field private w0:Landroidx/media3/exoplayer/K0;

.field private final x:J

.field private x0:I

.field private final y:Lt2/j;

.field private y0:I

.field private final z:Landroidx/media3/exoplayer/Y$c;

.field private z0:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, Lq2/H;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroidx/media3/exoplayer/ExoPlayer$b;Lq2/P;)V
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    invoke-direct {v1}, Lq2/h;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lt2/m;

    .line 9
    .line 10
    invoke-direct {v2}, Lt2/m;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->d:Lt2/m;

    .line 14
    .line 15
    :try_start_0
    const-string v2, "ExoPlayerImpl"

    .line 16
    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v4, "Init "

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v4, " ["

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v4, "AndroidXMedia3/1.8.0"

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v4, "] ["

    .line 49
    .line 50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    sget-object v4, Lt2/a0;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v4, "]"

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v2, v3}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->e:Landroid/content/Context;

    .line 77
    .line 78
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->i:LO9/f;

    .line 79
    .line 80
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->b:Lt2/j;

    .line 81
    .line 82
    invoke-interface {v2, v3}, LO9/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, LB2/a;

    .line 87
    .line 88
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 89
    .line 90
    iget v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->k:I

    .line 91
    .line 92
    iput v2, v1, Landroidx/media3/exoplayer/Y;->q0:I

    .line 93
    .line 94
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->l:Lq2/c;

    .line 95
    .line 96
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->k0:Lq2/c;

    .line 97
    .line 98
    iget v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->r:I

    .line 99
    .line 100
    iput v2, v1, Landroidx/media3/exoplayer/Y;->f0:I

    .line 101
    .line 102
    iget v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->s:I

    .line 103
    .line 104
    iput v2, v1, Landroidx/media3/exoplayer/Y;->g0:I

    .line 105
    .line 106
    iget-boolean v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->p:Z

    .line 107
    .line 108
    iput-boolean v2, v1, Landroidx/media3/exoplayer/Y;->m0:Z

    .line 109
    .line 110
    iget-wide v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->B:J

    .line 111
    .line 112
    iput-wide v2, v1, Landroidx/media3/exoplayer/Y;->F:J

    .line 113
    .line 114
    new-instance v6, Landroidx/media3/exoplayer/Y$c;

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    invoke-direct {v6, v1, v2}, Landroidx/media3/exoplayer/Y$c;-><init>(Landroidx/media3/exoplayer/Y;Landroidx/media3/exoplayer/Y$a;)V

    .line 118
    .line 119
    .line 120
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 121
    .line 122
    new-instance v3, Landroidx/media3/exoplayer/Y$d;

    .line 123
    .line 124
    invoke-direct {v3, v2}, Landroidx/media3/exoplayer/Y$d;-><init>(Landroidx/media3/exoplayer/Y$a;)V

    .line 125
    .line 126
    .line 127
    iput-object v3, v1, Landroidx/media3/exoplayer/Y;->A:Landroidx/media3/exoplayer/Y$d;

    .line 128
    .line 129
    new-instance v5, Landroid/os/Handler;

    .line 130
    .line 131
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 132
    .line 133
    invoke-direct {v5, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 134
    .line 135
    .line 136
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->d:LO9/t;

    .line 137
    .line 138
    invoke-interface {v3}, LO9/t;->get()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    move-object v4, v3

    .line 143
    check-cast v4, LA2/O;

    .line 144
    .line 145
    move-object v7, v6

    .line 146
    move-object v8, v6

    .line 147
    move-object v9, v6

    .line 148
    invoke-interface/range {v4 .. v9}, LA2/O;->b(Landroid/os/Handler;LS2/K;LC2/y;LO2/h;LK2/b;)[Landroidx/media3/exoplayer/N0;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    iput-object v3, v1, Landroidx/media3/exoplayer/Y;->g:[Landroidx/media3/exoplayer/N0;

    .line 153
    .line 154
    array-length v6, v3

    .line 155
    const/4 v14, 0x0

    .line 156
    if-lez v6, :cond_0

    .line 157
    .line 158
    const/4 v6, 0x1

    .line 159
    goto :goto_0

    .line 160
    :cond_0
    move v6, v14

    .line 161
    :goto_0
    invoke-static {v6}, Lt2/a;->g(Z)V

    .line 162
    .line 163
    .line 164
    array-length v3, v3

    .line 165
    new-array v3, v3, [Landroidx/media3/exoplayer/N0;

    .line 166
    .line 167
    iput-object v3, v1, Landroidx/media3/exoplayer/Y;->h:[Landroidx/media3/exoplayer/N0;

    .line 168
    .line 169
    move v3, v14

    .line 170
    :goto_1
    iget-object v6, v1, Landroidx/media3/exoplayer/Y;->h:[Landroidx/media3/exoplayer/N0;

    .line 171
    .line 172
    array-length v7, v6

    .line 173
    if-ge v3, v7, :cond_1

    .line 174
    .line 175
    iget-object v7, v1, Landroidx/media3/exoplayer/Y;->g:[Landroidx/media3/exoplayer/N0;

    .line 176
    .line 177
    aget-object v8, v7, v3

    .line 178
    .line 179
    iget-object v10, v1, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 180
    .line 181
    move-object v11, v10

    .line 182
    move-object v12, v10

    .line 183
    move-object v13, v10

    .line 184
    move-object v7, v4

    .line 185
    move-object v9, v5

    .line 186
    invoke-interface/range {v7 .. v13}, LA2/O;->a(Landroidx/media3/exoplayer/N0;Landroid/os/Handler;LS2/K;LC2/y;LO2/h;LK2/b;)Landroidx/media3/exoplayer/N0;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    aput-object v4, v6, v3

    .line 191
    .line 192
    add-int/lit8 v3, v3, 0x1

    .line 193
    .line 194
    move-object v4, v7

    .line 195
    goto :goto_1

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    goto/16 :goto_7

    .line 198
    .line 199
    :cond_1
    iget-object v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->f:LO9/t;

    .line 200
    .line 201
    invoke-interface {v3}, LO9/t;->get()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    check-cast v3, LP2/G;

    .line 206
    .line 207
    iput-object v3, v1, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 208
    .line 209
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->e:LO9/t;

    .line 210
    .line 211
    invoke-interface {v4}, LO9/t;->get()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    check-cast v4, LM2/D$a;

    .line 216
    .line 217
    iput-object v4, v1, Landroidx/media3/exoplayer/Y;->r:LM2/D$a;

    .line 218
    .line 219
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->h:LO9/t;

    .line 220
    .line 221
    invoke-interface {v4}, LO9/t;->get()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, LQ2/d;

    .line 226
    .line 227
    iput-object v4, v1, Landroidx/media3/exoplayer/Y;->u:LQ2/d;

    .line 228
    .line 229
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->t:Z

    .line 230
    .line 231
    iput-boolean v5, v1, Landroidx/media3/exoplayer/Y;->q:Z

    .line 232
    .line 233
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->u:LA2/Q;

    .line 234
    .line 235
    iput-object v5, v1, Landroidx/media3/exoplayer/Y;->Q:LA2/Q;

    .line 236
    .line 237
    iget-wide v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->w:J

    .line 238
    .line 239
    iput-wide v5, v1, Landroidx/media3/exoplayer/Y;->v:J

    .line 240
    .line 241
    iget-wide v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->x:J

    .line 242
    .line 243
    iput-wide v5, v1, Landroidx/media3/exoplayer/Y;->w:J

    .line 244
    .line 245
    iget-wide v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->y:J

    .line 246
    .line 247
    iput-wide v5, v1, Landroidx/media3/exoplayer/Y;->x:J

    .line 248
    .line 249
    iget-object v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->v:LA2/P;

    .line 250
    .line 251
    iput-object v5, v1, Landroidx/media3/exoplayer/Y;->P:LA2/P;

    .line 252
    .line 253
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->C:Z

    .line 254
    .line 255
    iput-boolean v5, v1, Landroidx/media3/exoplayer/Y;->T:Z

    .line 256
    .line 257
    iget-object v9, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 258
    .line 259
    iput-object v9, v1, Landroidx/media3/exoplayer/Y;->t:Landroid/os/Looper;

    .line 260
    .line 261
    iget-object v10, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->b:Lt2/j;

    .line 262
    .line 263
    iput-object v10, v1, Landroidx/media3/exoplayer/Y;->y:Lt2/j;

    .line 264
    .line 265
    if-nez p2, :cond_2

    .line 266
    .line 267
    move-object v5, v1

    .line 268
    goto :goto_2

    .line 269
    :cond_2
    move-object/from16 v5, p2

    .line 270
    .line 271
    :goto_2
    iput-object v5, v1, Landroidx/media3/exoplayer/Y;->f:Lq2/P;

    .line 272
    .line 273
    new-instance v6, Lt2/v;

    .line 274
    .line 275
    new-instance v7, Landroidx/media3/exoplayer/D;

    .line 276
    .line 277
    invoke-direct {v7, v1}, Landroidx/media3/exoplayer/D;-><init>(Landroidx/media3/exoplayer/Y;)V

    .line 278
    .line 279
    .line 280
    invoke-direct {v6, v9, v10, v7}, Lt2/v;-><init>(Landroid/os/Looper;Lt2/j;Lt2/v$b;)V

    .line 281
    .line 282
    .line 283
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 284
    .line 285
    new-instance v6, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 286
    .line 287
    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 288
    .line 289
    .line 290
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 291
    .line 292
    new-instance v6, Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 295
    .line 296
    .line 297
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 298
    .line 299
    new-instance v6, LM2/e0$a;

    .line 300
    .line 301
    invoke-direct {v6, v14}, LM2/e0$a;-><init>(I)V

    .line 302
    .line 303
    .line 304
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 305
    .line 306
    sget-object v6, Landroidx/media3/exoplayer/ExoPlayer$c;->b:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 307
    .line 308
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->S:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 309
    .line 310
    new-instance v6, LP2/H;

    .line 311
    .line 312
    iget-object v7, v1, Landroidx/media3/exoplayer/Y;->g:[Landroidx/media3/exoplayer/N0;

    .line 313
    .line 314
    array-length v8, v7

    .line 315
    new-array v8, v8, [LA2/N;

    .line 316
    .line 317
    array-length v7, v7

    .line 318
    new-array v7, v7, [LP2/A;

    .line 319
    .line 320
    sget-object v11, Lq2/h0;->b:Lq2/h0;

    .line 321
    .line 322
    invoke-direct {v6, v8, v7, v11, v2}, LP2/H;-><init>([LA2/N;[LP2/A;Lq2/h0;Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->b:LP2/H;

    .line 326
    .line 327
    new-instance v7, Lq2/Y$b;

    .line 328
    .line 329
    invoke-direct {v7}, Lq2/Y$b;-><init>()V

    .line 330
    .line 331
    .line 332
    iput-object v7, v1, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 333
    .line 334
    new-instance v7, Lq2/P$b$a;

    .line 335
    .line 336
    invoke-direct {v7}, Lq2/P$b$a;-><init>()V

    .line 337
    .line 338
    .line 339
    const/16 v8, 0x14

    .line 340
    .line 341
    new-array v8, v8, [I

    .line 342
    .line 343
    fill-array-data v8, :array_0

    .line 344
    .line 345
    .line 346
    invoke-virtual {v7, v8}, Lq2/P$b$a;->c([I)Lq2/P$b$a;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-virtual {v3}, LP2/G;->h()Z

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    const/16 v11, 0x1d

    .line 355
    .line 356
    invoke-virtual {v7, v11, v8}, Lq2/P$b$a;->e(IZ)Lq2/P$b$a;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    iget-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->q:Z

    .line 361
    .line 362
    const/16 v11, 0x17

    .line 363
    .line 364
    invoke-virtual {v7, v11, v8}, Lq2/P$b$a;->e(IZ)Lq2/P$b$a;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    iget-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->q:Z

    .line 369
    .line 370
    const/16 v11, 0x19

    .line 371
    .line 372
    invoke-virtual {v7, v11, v8}, Lq2/P$b$a;->e(IZ)Lq2/P$b$a;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    iget-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->q:Z

    .line 377
    .line 378
    const/16 v11, 0x21

    .line 379
    .line 380
    invoke-virtual {v7, v11, v8}, Lq2/P$b$a;->e(IZ)Lq2/P$b$a;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    iget-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->q:Z

    .line 385
    .line 386
    const/16 v11, 0x1a

    .line 387
    .line 388
    invoke-virtual {v7, v11, v8}, Lq2/P$b$a;->e(IZ)Lq2/P$b$a;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    iget-boolean v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->q:Z

    .line 393
    .line 394
    const/16 v11, 0x22

    .line 395
    .line 396
    invoke-virtual {v7, v11, v8}, Lq2/P$b$a;->e(IZ)Lq2/P$b$a;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    invoke-virtual {v7}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    iput-object v7, v1, Landroidx/media3/exoplayer/Y;->c:Lq2/P$b;

    .line 405
    .line 406
    new-instance v8, Lq2/P$b$a;

    .line 407
    .line 408
    invoke-direct {v8}, Lq2/P$b$a;-><init>()V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v8, v7}, Lq2/P$b$a;->b(Lq2/P$b;)Lq2/P$b$a;

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    const/4 v13, 0x4

    .line 416
    invoke-virtual {v7, v13}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    const/16 v8, 0xa

    .line 421
    .line 422
    invoke-virtual {v7, v8}, Lq2/P$b$a;->a(I)Lq2/P$b$a;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    invoke-virtual {v7}, Lq2/P$b$a;->f()Lq2/P$b;

    .line 427
    .line 428
    .line 429
    move-result-object v7

    .line 430
    iput-object v7, v1, Landroidx/media3/exoplayer/Y;->U:Lq2/P$b;

    .line 431
    .line 432
    invoke-interface {v10, v9, v2}, Lt2/j;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lt2/s;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    iput-object v7, v1, Landroidx/media3/exoplayer/Y;->j:Lt2/s;

    .line 437
    .line 438
    new-instance v7, Landroidx/media3/exoplayer/F;

    .line 439
    .line 440
    invoke-direct {v7, v1}, Landroidx/media3/exoplayer/F;-><init>(Landroidx/media3/exoplayer/Y;)V

    .line 441
    .line 442
    .line 443
    iput-object v7, v1, Landroidx/media3/exoplayer/Y;->k:Landroidx/media3/exoplayer/o0$f;

    .line 444
    .line 445
    invoke-static {v6}, Landroidx/media3/exoplayer/K0;->k(LP2/H;)Landroidx/media3/exoplayer/K0;

    .line 446
    .line 447
    .line 448
    move-result-object v8

    .line 449
    iput-object v8, v1, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 450
    .line 451
    iget-object v8, v1, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 452
    .line 453
    invoke-interface {v8, v5, v9}, LB2/a;->p0(Lq2/P;Landroid/os/Looper;)V

    .line 454
    .line 455
    .line 456
    new-instance v5, LB2/K1;

    .line 457
    .line 458
    iget-object v8, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->H:Ljava/lang/String;

    .line 459
    .line 460
    invoke-direct {v5, v8}, LB2/K1;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    new-instance v16, Landroidx/media3/exoplayer/o0;

    .line 464
    .line 465
    iget-object v8, v1, Landroidx/media3/exoplayer/Y;->e:Landroid/content/Context;

    .line 466
    .line 467
    iget-object v11, v1, Landroidx/media3/exoplayer/Y;->g:[Landroidx/media3/exoplayer/N0;

    .line 468
    .line 469
    iget-object v12, v1, Landroidx/media3/exoplayer/Y;->h:[Landroidx/media3/exoplayer/N0;

    .line 470
    .line 471
    iget-object v13, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->g:LO9/t;

    .line 472
    .line 473
    invoke-interface {v13}, LO9/t;->get()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v13

    .line 477
    move-object/from16 v22, v13

    .line 478
    .line 479
    check-cast v22, Landroidx/media3/exoplayer/p0;

    .line 480
    .line 481
    iget v13, v1, Landroidx/media3/exoplayer/Y;->I:I

    .line 482
    .line 483
    iget-boolean v2, v1, Landroidx/media3/exoplayer/Y;->J:Z

    .line 484
    .line 485
    iget-object v15, v1, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 486
    .line 487
    iget-object v14, v1, Landroidx/media3/exoplayer/Y;->Q:LA2/Q;

    .line 488
    .line 489
    move/from16 v25, v2

    .line 490
    .line 491
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->z:LA2/K;

    .line 492
    .line 493
    move-object/from16 v28, v2

    .line 494
    .line 495
    move-object/from16 v20, v3

    .line 496
    .line 497
    iget-wide v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->A:J

    .line 498
    .line 499
    move-wide/from16 v29, v2

    .line 500
    .line 501
    iget-boolean v2, v1, Landroidx/media3/exoplayer/Y;->T:Z

    .line 502
    .line 503
    iget-boolean v3, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->I:Z

    .line 504
    .line 505
    move/from16 v31, v2

    .line 506
    .line 507
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->E:LA2/M;

    .line 508
    .line 509
    move-object/from16 v37, v2

    .line 510
    .line 511
    iget-object v2, v1, Landroidx/media3/exoplayer/Y;->S:Landroidx/media3/exoplayer/ExoPlayer$c;

    .line 512
    .line 513
    move-object/from16 v38, v2

    .line 514
    .line 515
    iget-object v2, v1, Landroidx/media3/exoplayer/Y;->A:Landroidx/media3/exoplayer/Y$d;

    .line 516
    .line 517
    move-object/from16 v39, v2

    .line 518
    .line 519
    move/from16 v32, v3

    .line 520
    .line 521
    move-object/from16 v23, v4

    .line 522
    .line 523
    move-object/from16 v36, v5

    .line 524
    .line 525
    move-object/from16 v21, v6

    .line 526
    .line 527
    move-object/from16 v35, v7

    .line 528
    .line 529
    move-object/from16 v17, v8

    .line 530
    .line 531
    move-object/from16 v33, v9

    .line 532
    .line 533
    move-object/from16 v34, v10

    .line 534
    .line 535
    move-object/from16 v18, v11

    .line 536
    .line 537
    move-object/from16 v19, v12

    .line 538
    .line 539
    move/from16 v24, v13

    .line 540
    .line 541
    move-object/from16 v27, v14

    .line 542
    .line 543
    move-object/from16 v26, v15

    .line 544
    .line 545
    invoke-direct/range {v16 .. v39}, Landroidx/media3/exoplayer/o0;-><init>(Landroid/content/Context;[Landroidx/media3/exoplayer/N0;[Landroidx/media3/exoplayer/N0;LP2/G;LP2/H;Landroidx/media3/exoplayer/p0;LQ2/d;IZLB2/a;LA2/Q;LA2/K;JZZLandroid/os/Looper;Lt2/j;Landroidx/media3/exoplayer/o0$f;LB2/K1;LA2/M;Landroidx/media3/exoplayer/ExoPlayer$c;LS2/u;)V

    .line 546
    .line 547
    .line 548
    move-object/from16 v3, v16

    .line 549
    .line 550
    move-object/from16 v4, v23

    .line 551
    .line 552
    move-object/from16 v9, v33

    .line 553
    .line 554
    move-object/from16 v2, v36

    .line 555
    .line 556
    iput-object v3, v1, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 557
    .line 558
    invoke-virtual {v3}, Landroidx/media3/exoplayer/o0;->Q()Landroid/os/Looper;

    .line 559
    .line 560
    .line 561
    move-result-object v10

    .line 562
    const/high16 v5, 0x3f800000    # 1.0f

    .line 563
    .line 564
    iput v5, v1, Landroidx/media3/exoplayer/Y;->l0:F

    .line 565
    .line 566
    const/4 v5, 0x0

    .line 567
    iput v5, v1, Landroidx/media3/exoplayer/Y;->I:I

    .line 568
    .line 569
    sget-object v5, Lq2/I;->K:Lq2/I;

    .line 570
    .line 571
    iput-object v5, v1, Landroidx/media3/exoplayer/Y;->V:Lq2/I;

    .line 572
    .line 573
    iput-object v5, v1, Landroidx/media3/exoplayer/Y;->W:Lq2/I;

    .line 574
    .line 575
    iput-object v5, v1, Landroidx/media3/exoplayer/Y;->v0:Lq2/I;

    .line 576
    .line 577
    const/4 v5, -0x1

    .line 578
    iput v5, v1, Landroidx/media3/exoplayer/Y;->x0:I

    .line 579
    .line 580
    sget-object v5, Ls2/e;->d:Ls2/e;

    .line 581
    .line 582
    iput-object v5, v1, Landroidx/media3/exoplayer/Y;->n0:Ls2/e;

    .line 583
    .line 584
    const/4 v5, 0x1

    .line 585
    iput-boolean v5, v1, Landroidx/media3/exoplayer/Y;->o0:Z

    .line 586
    .line 587
    iget-object v5, v1, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 588
    .line 589
    invoke-virtual {v1, v5}, Landroidx/media3/exoplayer/Y;->a0(Lq2/P$d;)V

    .line 590
    .line 591
    .line 592
    new-instance v5, Landroid/os/Handler;

    .line 593
    .line 594
    invoke-direct {v5, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 595
    .line 596
    .line 597
    iget-object v6, v1, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 598
    .line 599
    invoke-interface {v4, v5, v6}, LQ2/d;->i(Landroid/os/Handler;LQ2/d$a;)V

    .line 600
    .line 601
    .line 602
    iget-object v4, v1, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 603
    .line 604
    invoke-virtual {v1, v4}, Landroidx/media3/exoplayer/Y;->q2(Landroidx/media3/exoplayer/ExoPlayer$a;)V

    .line 605
    .line 606
    .line 607
    iget-wide v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->c:J

    .line 608
    .line 609
    const-wide/16 v6, 0x0

    .line 610
    .line 611
    cmp-long v6, v4, v6

    .line 612
    .line 613
    if-lez v6, :cond_3

    .line 614
    .line 615
    invoke-virtual {v3, v4, v5}, Landroidx/media3/exoplayer/o0;->J(J)V

    .line 616
    .line 617
    .line 618
    :cond_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 619
    .line 620
    const/16 v5, 0x1f

    .line 621
    .line 622
    if-lt v4, v5, :cond_4

    .line 623
    .line 624
    iget-object v4, v1, Landroidx/media3/exoplayer/Y;->e:Landroid/content/Context;

    .line 625
    .line 626
    iget-boolean v5, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->D:Z

    .line 627
    .line 628
    invoke-static {v4, v1, v5, v2}, Landroidx/media3/exoplayer/Y$b;->b(Landroid/content/Context;Landroidx/media3/exoplayer/Y;ZLB2/K1;)V

    .line 629
    .line 630
    .line 631
    :cond_4
    new-instance v6, Lt2/g;

    .line 632
    .line 633
    const/16 v40, 0x0

    .line 634
    .line 635
    invoke-static/range {v40 .. v40}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 636
    .line 637
    .line 638
    move-result-object v7

    .line 639
    new-instance v11, Landroidx/media3/exoplayer/G;

    .line 640
    .line 641
    invoke-direct {v11, v1}, Landroidx/media3/exoplayer/G;-><init>(Landroidx/media3/exoplayer/Y;)V

    .line 642
    .line 643
    .line 644
    move-object v8, v10

    .line 645
    move-object/from16 v10, v34

    .line 646
    .line 647
    invoke-direct/range {v6 .. v11}, Lt2/g;-><init>(Ljava/lang/Object;Landroid/os/Looper;Landroid/os/Looper;Lt2/j;Lt2/g$a;)V

    .line 648
    .line 649
    .line 650
    move-object/from16 v34, v10

    .line 651
    .line 652
    move-object v10, v8

    .line 653
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->H:Lt2/g;

    .line 654
    .line 655
    new-instance v2, Landroidx/media3/exoplayer/H;

    .line 656
    .line 657
    invoke-direct {v2, v1}, Landroidx/media3/exoplayer/H;-><init>(Landroidx/media3/exoplayer/Y;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v6, v2}, Lt2/g;->e(Ljava/lang/Runnable;)V

    .line 661
    .line 662
    .line 663
    new-instance v16, Landroidx/media3/exoplayer/d;

    .line 664
    .line 665
    iget-object v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 666
    .line 667
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->j:Landroid/os/Looper;

    .line 668
    .line 669
    iget-object v5, v1, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 670
    .line 671
    move-object/from16 v17, v2

    .line 672
    .line 673
    move-object/from16 v19, v4

    .line 674
    .line 675
    move-object/from16 v20, v5

    .line 676
    .line 677
    move-object/from16 v18, v10

    .line 678
    .line 679
    move-object/from16 v21, v34

    .line 680
    .line 681
    invoke-direct/range {v16 .. v21}, Landroidx/media3/exoplayer/d;-><init>(Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Landroidx/media3/exoplayer/d$b;Lt2/j;)V

    .line 682
    .line 683
    .line 684
    move-object/from16 v2, v16

    .line 685
    .line 686
    move-object/from16 v10, v18

    .line 687
    .line 688
    move-object/from16 v34, v21

    .line 689
    .line 690
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->B:Landroidx/media3/exoplayer/d;

    .line 691
    .line 692
    iget-boolean v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->o:Z

    .line 693
    .line 694
    invoke-virtual {v2, v4}, Landroidx/media3/exoplayer/d;->d(Z)V

    .line 695
    .line 696
    .line 697
    iget-boolean v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->G:Z

    .line 698
    .line 699
    if-eqz v2, :cond_5

    .line 700
    .line 701
    iget-object v6, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->J:Landroidx/media3/exoplayer/g1;

    .line 702
    .line 703
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->G:Landroidx/media3/exoplayer/g1;

    .line 704
    .line 705
    new-instance v7, Landroidx/media3/exoplayer/I;

    .line 706
    .line 707
    invoke-direct {v7, v1}, Landroidx/media3/exoplayer/I;-><init>(Landroidx/media3/exoplayer/Y;)V

    .line 708
    .line 709
    .line 710
    iget-object v8, v1, Landroidx/media3/exoplayer/Y;->e:Landroid/content/Context;

    .line 711
    .line 712
    move-object/from16 v11, v34

    .line 713
    .line 714
    invoke-interface/range {v6 .. v11}, Landroidx/media3/exoplayer/g1;->a(Landroidx/media3/exoplayer/g1$a;Landroid/content/Context;Landroid/os/Looper;Landroid/os/Looper;Lt2/j;)V

    .line 715
    .line 716
    .line 717
    move-object/from16 v34, v11

    .line 718
    .line 719
    goto :goto_3

    .line 720
    :cond_5
    const/4 v2, 0x0

    .line 721
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->G:Landroidx/media3/exoplayer/g1;

    .line 722
    .line 723
    :goto_3
    iget-boolean v2, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->q:Z

    .line 724
    .line 725
    if-eqz v2, :cond_6

    .line 726
    .line 727
    new-instance v6, Landroidx/media3/exoplayer/e1;

    .line 728
    .line 729
    iget-object v7, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 730
    .line 731
    iget-object v8, v1, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 732
    .line 733
    iget-object v2, v1, Landroidx/media3/exoplayer/Y;->k0:Lq2/c;

    .line 734
    .line 735
    invoke-virtual {v2}, Lq2/c;->c()I

    .line 736
    .line 737
    .line 738
    move-result v2

    .line 739
    move-object v11, v9

    .line 740
    move-object/from16 v12, v34

    .line 741
    .line 742
    move v9, v2

    .line 743
    invoke-direct/range {v6 .. v12}, Landroidx/media3/exoplayer/e1;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/e1$b;ILandroid/os/Looper;Landroid/os/Looper;Lt2/j;)V

    .line 744
    .line 745
    .line 746
    move-object v8, v10

    .line 747
    move-object v10, v12

    .line 748
    iput-object v6, v1, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 749
    .line 750
    goto :goto_4

    .line 751
    :cond_6
    move-object v8, v10

    .line 752
    move-object/from16 v10, v34

    .line 753
    .line 754
    const/4 v2, 0x0

    .line 755
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 756
    .line 757
    :goto_4
    new-instance v2, Landroidx/media3/exoplayer/j1;

    .line 758
    .line 759
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 760
    .line 761
    invoke-direct {v2, v4, v8, v10}, Landroidx/media3/exoplayer/j1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lt2/j;)V

    .line 762
    .line 763
    .line 764
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->D:Landroidx/media3/exoplayer/j1;

    .line 765
    .line 766
    iget v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->n:I

    .line 767
    .line 768
    if-eqz v4, :cond_7

    .line 769
    .line 770
    const/4 v4, 0x1

    .line 771
    goto :goto_5

    .line 772
    :cond_7
    move/from16 v4, v40

    .line 773
    .line 774
    :goto_5
    invoke-virtual {v2, v4}, Landroidx/media3/exoplayer/j1;->c(Z)V

    .line 775
    .line 776
    .line 777
    new-instance v2, Landroidx/media3/exoplayer/m1;

    .line 778
    .line 779
    iget-object v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->a:Landroid/content/Context;

    .line 780
    .line 781
    invoke-direct {v2, v4, v8, v10}, Landroidx/media3/exoplayer/m1;-><init>(Landroid/content/Context;Landroid/os/Looper;Lt2/j;)V

    .line 782
    .line 783
    .line 784
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->E:Landroidx/media3/exoplayer/m1;

    .line 785
    .line 786
    iget v4, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->n:I

    .line 787
    .line 788
    const/4 v5, 0x2

    .line 789
    if-ne v4, v5, :cond_8

    .line 790
    .line 791
    const/4 v14, 0x1

    .line 792
    goto :goto_6

    .line 793
    :cond_8
    move/from16 v14, v40

    .line 794
    .line 795
    :goto_6
    invoke-virtual {v2, v14}, Landroidx/media3/exoplayer/m1;->c(Z)V

    .line 796
    .line 797
    .line 798
    sget-object v2, Lq2/p;->e:Lq2/p;

    .line 799
    .line 800
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->t0:Lq2/p;

    .line 801
    .line 802
    sget-object v2, Lq2/l0;->e:Lq2/l0;

    .line 803
    .line 804
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->u0:Lq2/l0;

    .line 805
    .line 806
    sget-object v2, Lt2/K;->c:Lt2/K;

    .line 807
    .line 808
    iput-object v2, v1, Landroidx/media3/exoplayer/Y;->h0:Lt2/K;

    .line 809
    .line 810
    iget-object v2, v1, Landroidx/media3/exoplayer/Y;->P:LA2/P;

    .line 811
    .line 812
    invoke-virtual {v3, v2}, Landroidx/media3/exoplayer/o0;->C1(LA2/P;)V

    .line 813
    .line 814
    .line 815
    iget-object v2, v1, Landroidx/media3/exoplayer/Y;->k0:Lq2/c;

    .line 816
    .line 817
    iget-boolean v0, v0, Landroidx/media3/exoplayer/ExoPlayer$b;->m:Z

    .line 818
    .line 819
    invoke-virtual {v3, v2, v0}, Landroidx/media3/exoplayer/o0;->l1(Lq2/c;Z)V

    .line 820
    .line 821
    .line 822
    iget-object v0, v1, Landroidx/media3/exoplayer/Y;->k0:Lq2/c;

    .line 823
    .line 824
    const/4 v2, 0x3

    .line 825
    const/4 v3, 0x1

    .line 826
    invoke-direct {v1, v3, v2, v0}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    iget v0, v1, Landroidx/media3/exoplayer/Y;->f0:I

    .line 830
    .line 831
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    const/4 v2, 0x4

    .line 836
    invoke-direct {v1, v5, v2, v0}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    iget v0, v1, Landroidx/media3/exoplayer/Y;->g0:I

    .line 840
    .line 841
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    const/4 v2, 0x5

    .line 846
    invoke-direct {v1, v5, v2, v0}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    iget-boolean v0, v1, Landroidx/media3/exoplayer/Y;->m0:Z

    .line 850
    .line 851
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    const/16 v2, 0x9

    .line 856
    .line 857
    const/4 v3, 0x1

    .line 858
    invoke-direct {v1, v3, v2, v0}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    iget-object v0, v1, Landroidx/media3/exoplayer/Y;->A:Landroidx/media3/exoplayer/Y$d;

    .line 862
    .line 863
    const/4 v2, 0x6

    .line 864
    const/16 v3, 0x8

    .line 865
    .line 866
    invoke-direct {v1, v2, v3, v0}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    iget v0, v1, Landroidx/media3/exoplayer/Y;->q0:I

    .line 870
    .line 871
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    const/16 v2, 0x10

    .line 876
    .line 877
    invoke-direct {v1, v2, v0}, Landroidx/media3/exoplayer/Y;->c3(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 878
    .line 879
    .line 880
    iget-object v0, v1, Landroidx/media3/exoplayer/Y;->d:Lt2/m;

    .line 881
    .line 882
    invoke-virtual {v0}, Lt2/m;->f()Z

    .line 883
    .line 884
    .line 885
    return-void

    .line 886
    :goto_7
    iget-object v2, v1, Landroidx/media3/exoplayer/Y;->d:Lt2/m;

    .line 887
    .line 888
    invoke-virtual {v2}, Lt2/m;->f()Z

    .line 889
    .line 890
    .line 891
    throw v0

    .line 892
    nop

    .line 893
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method public static synthetic A1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/K0;->f:Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->H(Lq2/N;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static A2(Landroidx/media3/exoplayer/e1;)Lq2/p;
    .locals 3

    .line 1
    new-instance v0, Lq2/p$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lq2/p$b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/media3/exoplayer/e1;->u()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    invoke-virtual {v0, v2}, Lq2/p$b;->g(I)Lq2/p$b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/media3/exoplayer/e1;->t()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    :cond_1
    invoke-virtual {v0, v1}, Lq2/p$b;->f(I)Lq2/p$b;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Lq2/p$b;->e()Lq2/p;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static synthetic B1(Lq2/c;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->e0(Lq2/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private B2()Lq2/Y;
    .locals 3

    .line 1
    new-instance v0, Landroidx/media3/exoplayer/M0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/M0;-><init>(Ljava/util/Collection;LM2/e0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static synthetic C1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/K0;->l:Z

    .line 2
    .line 3
    iget p0, p0, Landroidx/media3/exoplayer/K0;->e:I

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Lq2/P$d;->k0(ZI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private C2(Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->r:LM2/D$a;

    .line 14
    .line 15
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lq2/C;

    .line 20
    .line 21
    invoke-interface {v2, v3}, LM2/D$a;->e(Lq2/C;)LM2/D;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method public static synthetic D1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 2
    .line 3
    iget-object p0, p0, LP2/H;->d:Lq2/h0;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->g0(Lq2/h0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private D2(Landroidx/media3/exoplayer/L0$b;)Landroidx/media3/exoplayer/L0;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->I2(Landroidx/media3/exoplayer/K0;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Landroidx/media3/exoplayer/L0;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 12
    .line 13
    iget-object v4, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :cond_0
    move v5, v0

    .line 20
    iget-object v6, p0, Landroidx/media3/exoplayer/Y;->y:Lt2/j;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroidx/media3/exoplayer/o0;->Q()Landroid/os/Looper;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    move-object v3, p1

    .line 27
    invoke-direct/range {v1 .. v7}, Landroidx/media3/exoplayer/L0;-><init>(Landroidx/media3/exoplayer/L0$a;Landroidx/media3/exoplayer/L0$b;Lq2/Y;ILt2/j;Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method

.method public static synthetic E1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/K0;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->y0(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private E2(Landroidx/media3/exoplayer/K0;Landroidx/media3/exoplayer/K0;ZIZZ)Landroid/util/Pair;
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 7
    .line 8
    iget-object v2, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 9
    .line 10
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    new-instance p1, Landroid/util/Pair;

    .line 23
    .line 24
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-direct {p1, p2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x3

    .line 39
    if-eq v3, v4, :cond_1

    .line 40
    .line 41
    new-instance p1, Landroid/util/Pair;

    .line 42
    .line 43
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    iget-object v3, p2, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 54
    .line 55
    iget-object v3, v3, LM2/D$b;->a:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v4, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 58
    .line 59
    invoke-virtual {v1, v3, v4}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget v3, v3, Lq2/Y$b;->c:I

    .line 64
    .line 65
    iget-object v4, p0, Lq2/h;->a:Lq2/Y$d;

    .line 66
    .line 67
    invoke-virtual {v1, v3, v4}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v1, v1, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v3, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 74
    .line 75
    iget-object v3, v3, LM2/D$b;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v4, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 78
    .line 79
    invoke-virtual {v2, v3, v4}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget v3, v3, Lq2/Y$b;->c:I

    .line 84
    .line 85
    iget-object v4, p0, Lq2/h;->a:Lq2/Y$d;

    .line 86
    .line 87
    invoke-virtual {v2, v3, v4}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-object v2, v2, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    const/4 v2, 0x2

    .line 98
    const/4 v3, 0x1

    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    if-eqz p3, :cond_2

    .line 102
    .line 103
    if-nez p4, :cond_2

    .line 104
    .line 105
    move v5, v3

    .line 106
    goto :goto_0

    .line 107
    :cond_2
    if-eqz p3, :cond_3

    .line 108
    .line 109
    if-ne p4, v3, :cond_3

    .line 110
    .line 111
    move v5, v2

    .line 112
    goto :goto_0

    .line 113
    :cond_3
    if-eqz p5, :cond_4

    .line 114
    .line 115
    :goto_0
    new-instance p1, Landroid/util/Pair;

    .line 116
    .line 117
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_5
    if-eqz p3, :cond_6

    .line 134
    .line 135
    if-nez p4, :cond_6

    .line 136
    .line 137
    iget-object p2, p2, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 138
    .line 139
    iget-wide v4, p2, LM2/D$b;->d:J

    .line 140
    .line 141
    iget-object p1, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 142
    .line 143
    iget-wide p1, p1, LM2/D$b;->d:J

    .line 144
    .line 145
    cmp-long p1, v4, p1

    .line 146
    .line 147
    if-gez p1, :cond_6

    .line 148
    .line 149
    new-instance p1, Landroid/util/Pair;

    .line 150
    .line 151
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 152
    .line 153
    const/4 p3, 0x0

    .line 154
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_6
    if-eqz p3, :cond_7

    .line 163
    .line 164
    if-ne p4, v3, :cond_7

    .line 165
    .line 166
    if-eqz p6, :cond_7

    .line 167
    .line 168
    new-instance p1, Landroid/util/Pair;

    .line 169
    .line 170
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_7
    new-instance p1, Landroid/util/Pair;

    .line 181
    .line 182
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-direct {p1, p2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    return-object p1
.end method

.method public static synthetic F1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/K0;->l:Z

    .line 2
    .line 3
    iget p0, p0, Landroidx/media3/exoplayer/K0;->m:I

    .line 4
    .line 5
    invoke-interface {p1, v0, p0}, Lq2/P$d;->s0(ZI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic G1(Landroidx/media3/exoplayer/Y;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->W2(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private G2(Landroidx/media3/exoplayer/K0;)J
    .locals 4

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LM2/D$b;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 10
    .line 11
    iget-object v1, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 12
    .line 13
    iget-object v1, v1, LM2/D$b;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 18
    .line 19
    .line 20
    iget-wide v0, p1, Landroidx/media3/exoplayer/K0;->c:J

    .line 21
    .line 22
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->I2(Landroidx/media3/exoplayer/K0;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v1, p0, Lq2/h;->a:Lq2/Y$d;

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lq2/Y$d;->c()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0

    .line 48
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 49
    .line 50
    invoke-virtual {v0}, Lq2/Y$b;->n()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    iget-wide v2, p1, Landroidx/media3/exoplayer/K0;->c:J

    .line 55
    .line 56
    invoke-static {v2, v3}, Lt2/a0;->F1(J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    add-long/2addr v0, v2

    .line 61
    return-wide v0

    .line 62
    :cond_1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->H2(Landroidx/media3/exoplayer/K0;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    return-wide v0
.end method

.method public static synthetic H1(Landroidx/media3/exoplayer/Y;Landroidx/media3/exoplayer/o0$e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->O2(Landroidx/media3/exoplayer/o0$e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private H2(Landroidx/media3/exoplayer/K0;)J
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Landroidx/media3/exoplayer/Y;->z0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Lt2/a0;->V0(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-boolean v0, p1, Landroidx/media3/exoplayer/K0;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/media3/exoplayer/K0;->m()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p1, Landroidx/media3/exoplayer/K0;->s:J

    .line 26
    .line 27
    :goto_0
    iget-object v2, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 28
    .line 29
    invoke-virtual {v2}, LM2/D$b;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    iget-object v2, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 39
    .line 40
    invoke-direct {p0, v2, p1, v0, v1}, Landroidx/media3/exoplayer/Y;->X2(Lq2/Y;LM2/D$b;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0
.end method

.method public static synthetic I1(ILq2/P$e;Lq2/P$e;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0}, Lq2/P$d;->Y(I)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, p1, p2, p0}, Lq2/P$d;->m0(Lq2/P$e;Lq2/P$e;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private I2(Landroidx/media3/exoplayer/K0;)I
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Landroidx/media3/exoplayer/Y;->x0:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 15
    .line 16
    iget-object p1, p1, LM2/D$b;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, Lq2/Y$b;->c:I

    .line 25
    .line 26
    return p1
.end method

.method public static synthetic J1(FLq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->d0(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private J2(Lq2/Y;Lq2/Y;IJ)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lq2/Y;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v10, -0x1

    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v7}, Lq2/Y;->u()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v12, v0, Lq2/h;->a:Lq2/Y$d;

    .line 25
    .line 26
    iget-object v13, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 27
    .line 28
    invoke-static/range {p4 .. p5}, Lt2/a0;->V0(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v15

    .line 32
    move-object/from16 v11, p1

    .line 33
    .line 34
    move/from16 v14, p3

    .line 35
    .line 36
    invoke-virtual/range {v11 .. v16}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/util/Pair;

    .line 45
    .line 46
    iget-object v5, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v7, v5}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eq v2, v10, :cond_1

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_1
    iget-object v1, v0, Lq2/h;->a:Lq2/Y$d;

    .line 56
    .line 57
    iget-object v2, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 58
    .line 59
    iget v3, v0, Landroidx/media3/exoplayer/Y;->I:I

    .line 60
    .line 61
    iget-boolean v4, v0, Landroidx/media3/exoplayer/Y;->J:Z

    .line 62
    .line 63
    move-object/from16 v6, p1

    .line 64
    .line 65
    invoke-static/range {v1 .. v7}, Landroidx/media3/exoplayer/o0;->a1(Lq2/Y$d;Lq2/Y$b;IZLjava/lang/Object;Lq2/Y;Lq2/Y;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eq v1, v10, :cond_2

    .line 70
    .line 71
    iget-object v2, v0, Lq2/h;->a:Lq2/Y$d;

    .line 72
    .line 73
    invoke-virtual {v7, v1, v2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Lq2/Y$d;->c()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    invoke-direct {v0, v7, v1, v2, v3}, Landroidx/media3/exoplayer/Y;->S2(Lq2/Y;IJ)Landroid/util/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    return-object v1

    .line 86
    :cond_2
    invoke-direct {v0, v7, v10, v8, v9}, Landroidx/media3/exoplayer/Y;->S2(Lq2/Y;IJ)Landroid/util/Pair;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    return-object v1

    .line 91
    :cond_3
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lq2/Y;->u()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    invoke-virtual {v7}, Lq2/Y;->u()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    const/4 v1, 0x0

    .line 106
    :goto_1
    if-eqz v1, :cond_5

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move/from16 v10, p3

    .line 110
    .line 111
    :goto_2
    if-eqz v1, :cond_6

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    move-wide/from16 v8, p4

    .line 115
    .line 116
    :goto_3
    invoke-direct {v0, v7, v10, v8, v9}, Landroidx/media3/exoplayer/Y;->S2(Lq2/Y;IJ)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    return-object v1
.end method

.method public static synthetic K1(Lq2/P$d;)V
    .locals 2

    .line 1
    new-instance v0, LA2/I;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LA2/I;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/16 v1, 0x3eb

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/s;->k(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p0, v0}, Lq2/P$d;->H(Lq2/N;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic L1(Landroidx/media3/exoplayer/Y;Landroidx/media3/exoplayer/o0$e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->j:Lt2/s;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/exoplayer/K;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Landroidx/media3/exoplayer/K;-><init>(Landroidx/media3/exoplayer/Y;Landroidx/media3/exoplayer/o0$e;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lt2/s;->i(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private L2(J)Lq2/P$e;
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->K0()I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 8
    .line 9
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 16
    .line 17
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 18
    .line 19
    iget-object v1, v1, LM2/D$b;->a:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 22
    .line 23
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v3}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 29
    .line 30
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 37
    .line 38
    iget-object v3, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 39
    .line 40
    iget-object v4, p0, Lq2/h;->a:Lq2/Y$d;

    .line 41
    .line 42
    invoke-virtual {v3, v2, v4}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v3, v3, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v4, p0, Lq2/h;->a:Lq2/Y$d;

    .line 49
    .line 50
    iget-object v4, v4, Lq2/Y$d;->c:Lq2/C;

    .line 51
    .line 52
    move-object v5, v4

    .line 53
    move-object v4, v1

    .line 54
    move-object v1, v3

    .line 55
    move-object v3, v5

    .line 56
    :goto_0
    move v5, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    const/4 v1, 0x0

    .line 59
    const/4 v0, -0x1

    .line 60
    move-object v3, v1

    .line 61
    move-object v4, v3

    .line 62
    goto :goto_0

    .line 63
    :goto_1
    invoke-static {p1, p2}, Lt2/a0;->F1(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    new-instance v0, Lq2/P$e;

    .line 68
    .line 69
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 70
    .line 71
    iget-object p1, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 72
    .line 73
    invoke-virtual {p1}, LM2/D$b;->b()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 80
    .line 81
    invoke-static {p1}, Landroidx/media3/exoplayer/Y;->N2(Landroidx/media3/exoplayer/K0;)J

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    invoke-static {p1, p2}, Lt2/a0;->F1(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide p1

    .line 89
    move-wide v8, p1

    .line 90
    goto :goto_2

    .line 91
    :cond_1
    move-wide v8, v6

    .line 92
    :goto_2
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 93
    .line 94
    iget-object p1, p1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 95
    .line 96
    iget v10, p1, LM2/D$b;->b:I

    .line 97
    .line 98
    iget v11, p1, LM2/D$b;->c:I

    .line 99
    .line 100
    invoke-direct/range {v0 .. v11}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 101
    .line 102
    .line 103
    return-object v0
.end method

.method public static synthetic M1(Landroidx/media3/exoplayer/Y;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/Y;->V2(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private M2(ILandroidx/media3/exoplayer/K0;I)Lq2/P$e;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lq2/Y$b;

    .line 6
    .line 7
    invoke-direct {v2}, Lq2/Y$b;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 11
    .line 12
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, -0x1

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 20
    .line 21
    iget-object v3, v3, LM2/D$b;->a:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v5, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 24
    .line 25
    invoke-virtual {v5, v3, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 26
    .line 27
    .line 28
    iget v5, v2, Lq2/Y$b;->c:I

    .line 29
    .line 30
    iget-object v6, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 31
    .line 32
    invoke-virtual {v6, v3}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iget-object v7, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 37
    .line 38
    iget-object v8, v0, Lq2/h;->a:Lq2/Y$d;

    .line 39
    .line 40
    invoke-virtual {v7, v5, v8}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iget-object v7, v7, Lq2/Y$d;->a:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v8, v0, Lq2/h;->a:Lq2/Y$d;

    .line 47
    .line 48
    iget-object v8, v8, Lq2/Y$d;->c:Lq2/C;

    .line 49
    .line 50
    move-object v9, v3

    .line 51
    move v10, v6

    .line 52
    move-object v6, v7

    .line 53
    move v7, v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v3, 0x0

    .line 56
    move/from16 v7, p3

    .line 57
    .line 58
    move-object v6, v3

    .line 59
    move-object v8, v6

    .line 60
    move-object v9, v8

    .line 61
    move v10, v4

    .line 62
    :goto_0
    if-nez p1, :cond_3

    .line 63
    .line 64
    iget-object v3, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 65
    .line 66
    invoke-virtual {v3}, LM2/D$b;->b()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    iget-object v3, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 73
    .line 74
    iget v4, v3, LM2/D$b;->b:I

    .line 75
    .line 76
    iget v3, v3, LM2/D$b;->c:I

    .line 77
    .line 78
    invoke-virtual {v2, v4, v3}, Lq2/Y$b;->c(II)J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    invoke-static {v1}, Landroidx/media3/exoplayer/Y;->N2(Landroidx/media3/exoplayer/K0;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    goto :goto_2

    .line 87
    :cond_1
    iget-object v3, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 88
    .line 89
    iget v3, v3, LM2/D$b;->e:I

    .line 90
    .line 91
    if-eq v3, v4, :cond_2

    .line 92
    .line 93
    iget-object v2, v0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 94
    .line 95
    invoke-static {v2}, Landroidx/media3/exoplayer/Y;->N2(Landroidx/media3/exoplayer/K0;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    :goto_1
    move-wide v4, v2

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    iget-wide v3, v2, Lq2/Y$b;->e:J

    .line 102
    .line 103
    iget-wide v11, v2, Lq2/Y$b;->d:J

    .line 104
    .line 105
    add-long v2, v3, v11

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    iget-object v3, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 109
    .line 110
    invoke-virtual {v3}, LM2/D$b;->b()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_4

    .line 115
    .line 116
    iget-wide v2, v1, Landroidx/media3/exoplayer/K0;->s:J

    .line 117
    .line 118
    invoke-static {v1}, Landroidx/media3/exoplayer/Y;->N2(Landroidx/media3/exoplayer/K0;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    iget-wide v2, v2, Lq2/Y$b;->e:J

    .line 124
    .line 125
    iget-wide v4, v1, Landroidx/media3/exoplayer/K0;->s:J

    .line 126
    .line 127
    add-long/2addr v2, v4

    .line 128
    goto :goto_1

    .line 129
    :goto_2
    new-instance v11, Lq2/P$e;

    .line 130
    .line 131
    invoke-static {v2, v3}, Lt2/a0;->F1(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v2

    .line 135
    invoke-static {v4, v5}, Lt2/a0;->F1(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v13

    .line 139
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 140
    .line 141
    iget v15, v1, LM2/D$b;->b:I

    .line 142
    .line 143
    iget v1, v1, LM2/D$b;->c:I

    .line 144
    .line 145
    move/from16 v16, v1

    .line 146
    .line 147
    move-object v5, v11

    .line 148
    move-wide v11, v2

    .line 149
    invoke-direct/range {v5 .. v16}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 150
    .line 151
    .line 152
    return-object v5
.end method

.method public static synthetic N1(Landroidx/media3/exoplayer/K0;ILq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 2
    .line 3
    invoke-interface {p2, p0, p1}, Lq2/P$d;->S(Lq2/Y;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static N2(Landroidx/media3/exoplayer/K0;)J
    .locals 6

    .line 1
    new-instance v0, Lq2/Y$d;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/Y$d;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lq2/Y$b;

    .line 7
    .line 8
    invoke-direct {v1}, Lq2/Y$b;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 12
    .line 13
    iget-object v3, p0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 14
    .line 15
    iget-object v3, v3, LM2/D$b;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, Landroidx/media3/exoplayer/K0;->c:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v2, v2, v4

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 32
    .line 33
    iget v1, v1, Lq2/Y$b;->c:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lq2/Y$d;->d()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    return-wide v0

    .line 44
    :cond_0
    invoke-virtual {v1}, Lq2/Y$b;->o()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    iget-wide v2, p0, Landroidx/media3/exoplayer/K0;->c:J

    .line 49
    .line 50
    add-long/2addr v0, v2

    .line 51
    return-wide v0
.end method

.method public static synthetic O1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/K0;->f:Landroidx/media3/exoplayer/s;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->t0(Lq2/N;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private O2(Landroidx/media3/exoplayer/o0$e;)V
    .locals 12

    .line 1
    iget v2, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 2
    .line 3
    iget v3, p1, Landroidx/media3/exoplayer/o0$e;->c:I

    .line 4
    .line 5
    sub-int/2addr v2, v3

    .line 6
    iput v2, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 7
    .line 8
    iget-boolean v3, p1, Landroidx/media3/exoplayer/o0$e;->d:Z

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iget v3, p1, Landroidx/media3/exoplayer/o0$e;->e:I

    .line 14
    .line 15
    iput v3, p0, Landroidx/media3/exoplayer/Y;->L:I

    .line 16
    .line 17
    iput-boolean v4, p0, Landroidx/media3/exoplayer/Y;->M:Z

    .line 18
    .line 19
    :cond_0
    if-nez v2, :cond_a

    .line 20
    .line 21
    iget-object v2, p1, Landroidx/media3/exoplayer/o0$e;->b:Landroidx/media3/exoplayer/K0;

    .line 22
    .line 23
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 24
    .line 25
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 26
    .line 27
    iget-object v3, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 28
    .line 29
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v5, 0x0

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    iput v3, p0, Landroidx/media3/exoplayer/Y;->x0:I

    .line 44
    .line 45
    const-wide/16 v6, 0x0

    .line 46
    .line 47
    iput-wide v6, p0, Landroidx/media3/exoplayer/Y;->z0:J

    .line 48
    .line 49
    iput v5, p0, Landroidx/media3/exoplayer/Y;->y0:I

    .line 50
    .line 51
    :cond_1
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    move-object v3, v2

    .line 58
    check-cast v3, Landroidx/media3/exoplayer/M0;

    .line 59
    .line 60
    invoke-virtual {v3}, Landroidx/media3/exoplayer/M0;->K()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    iget-object v7, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-ne v6, v7, :cond_2

    .line 75
    .line 76
    move v6, v4

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v6, v5

    .line 79
    :goto_0
    invoke-static {v6}, Lt2/a;->g(Z)V

    .line 80
    .line 81
    .line 82
    move v6, v5

    .line 83
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-ge v6, v7, :cond_3

    .line 88
    .line 89
    iget-object v7, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Landroidx/media3/exoplayer/Y$e;

    .line 96
    .line 97
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Lq2/Y;

    .line 102
    .line 103
    invoke-virtual {v7, v8}, Landroidx/media3/exoplayer/Y$e;->c(Lq2/Y;)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    iget-boolean v3, p0, Landroidx/media3/exoplayer/Y;->M:Z

    .line 110
    .line 111
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    if-eqz v3, :cond_9

    .line 117
    .line 118
    iget-object v3, p1, Landroidx/media3/exoplayer/o0$e;->b:Landroidx/media3/exoplayer/K0;

    .line 119
    .line 120
    iget-object v3, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 121
    .line 122
    iget-object v8, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 123
    .line 124
    iget-object v8, v8, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 125
    .line 126
    invoke-virtual {v3, v8}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    iget-object v3, p1, Landroidx/media3/exoplayer/o0$e;->b:Landroidx/media3/exoplayer/K0;

    .line 133
    .line 134
    iget-wide v8, v3, Landroidx/media3/exoplayer/K0;->d:J

    .line 135
    .line 136
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 137
    .line 138
    iget-wide v10, v3, Landroidx/media3/exoplayer/K0;->s:J

    .line 139
    .line 140
    cmp-long v3, v8, v10

    .line 141
    .line 142
    if-eqz v3, :cond_4

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    move v4, v5

    .line 146
    :cond_5
    :goto_2
    if-eqz v4, :cond_8

    .line 147
    .line 148
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-nez v3, :cond_7

    .line 153
    .line 154
    iget-object v3, p1, Landroidx/media3/exoplayer/o0$e;->b:Landroidx/media3/exoplayer/K0;

    .line 155
    .line 156
    iget-object v3, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 157
    .line 158
    invoke-virtual {v3}, LM2/D$b;->b()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_6

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_6
    iget-object v3, p1, Landroidx/media3/exoplayer/o0$e;->b:Landroidx/media3/exoplayer/K0;

    .line 166
    .line 167
    iget-object v6, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 168
    .line 169
    iget-wide v7, v3, Landroidx/media3/exoplayer/K0;->d:J

    .line 170
    .line 171
    invoke-direct {p0, v2, v6, v7, v8}, Landroidx/media3/exoplayer/Y;->X2(Lq2/Y;LM2/D$b;J)J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    :goto_3
    move-wide v6, v2

    .line 176
    goto :goto_5

    .line 177
    :cond_7
    :goto_4
    iget-object v2, p1, Landroidx/media3/exoplayer/o0$e;->b:Landroidx/media3/exoplayer/K0;

    .line 178
    .line 179
    iget-wide v2, v2, Landroidx/media3/exoplayer/K0;->d:J

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_8
    :goto_5
    move v3, v4

    .line 183
    goto :goto_6

    .line 184
    :cond_9
    move v3, v5

    .line 185
    :goto_6
    iput-boolean v5, p0, Landroidx/media3/exoplayer/Y;->M:Z

    .line 186
    .line 187
    iget-object v1, p1, Landroidx/media3/exoplayer/o0$e;->b:Landroidx/media3/exoplayer/K0;

    .line 188
    .line 189
    iget v4, p0, Landroidx/media3/exoplayer/Y;->L:I

    .line 190
    .line 191
    move-wide v5, v6

    .line 192
    const/4 v7, -0x1

    .line 193
    const/4 v8, 0x0

    .line 194
    const/4 v2, 0x1

    .line 195
    move-object v0, p0

    .line 196
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 197
    .line 198
    .line 199
    :cond_a
    return-void
.end method

.method static synthetic P1(Landroidx/media3/exoplayer/Y;Lq2/x;)Lq2/x;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->Y:Lq2/x;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic Q1(Landroidx/media3/exoplayer/Y;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/Y;->m0:Z

    .line 2
    .line 3
    return p0
.end method

.method private static Q2(Landroidx/media3/exoplayer/K0;I)Landroidx/media3/exoplayer/K0;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/K0;->h(I)Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/K0;->b(Z)Landroidx/media3/exoplayer/K0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method static synthetic R1(Landroidx/media3/exoplayer/Y;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/exoplayer/Y;->m0:Z

    .line 2
    .line 3
    return p1
.end method

.method private R2(Landroidx/media3/exoplayer/K0;Lq2/Y;Landroid/util/Pair;)Landroidx/media3/exoplayer/K0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    move v3, v4

    .line 20
    :goto_1
    invoke-static {v3}, Lt2/a;->a(Z)V

    .line 21
    .line 22
    .line 23
    move-object/from16 v3, p1

    .line 24
    .line 25
    iget-object v5, v3, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 26
    .line 27
    invoke-direct/range {p0 .. p1}, Landroidx/media3/exoplayer/Y;->G2(Landroidx/media3/exoplayer/K0;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    invoke-virtual/range {p1 .. p2}, Landroidx/media3/exoplayer/K0;->j(Lq2/Y;)Landroidx/media3/exoplayer/K0;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-static {}, Landroidx/media3/exoplayer/K0;->l()LM2/D$b;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    iget-wide v1, v0, Landroidx/media3/exoplayer/Y;->z0:J

    .line 46
    .line 47
    invoke-static {v1, v2}, Lt2/a0;->V0(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v10

    .line 51
    sget-object v18, LM2/n0;->d:LM2/n0;

    .line 52
    .line 53
    iget-object v1, v0, Landroidx/media3/exoplayer/Y;->b:LP2/H;

    .line 54
    .line 55
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 56
    .line 57
    .line 58
    move-result-object v20

    .line 59
    const-wide/16 v16, 0x0

    .line 60
    .line 61
    move-wide v12, v10

    .line 62
    move-wide v14, v10

    .line 63
    move-object/from16 v19, v1

    .line 64
    .line 65
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/K0;->d(LM2/D$b;JJJJLM2/n0;LP2/H;Ljava/util/List;)Landroidx/media3/exoplayer/K0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, v9}, Landroidx/media3/exoplayer/K0;->c(LM2/D$b;)Landroidx/media3/exoplayer/K0;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-wide v2, v1, Landroidx/media3/exoplayer/K0;->s:J

    .line 74
    .line 75
    iput-wide v2, v1, Landroidx/media3/exoplayer/K0;->q:J

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_2
    iget-object v3, v8, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 79
    .line 80
    iget-object v3, v3, LM2/D$b;->a:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static {v2}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    check-cast v9, Landroid/util/Pair;

    .line 87
    .line 88
    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-nez v9, :cond_3

    .line 95
    .line 96
    new-instance v10, LM2/D$b;

    .line 97
    .line 98
    iget-object v11, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-direct {v10, v11}, LM2/D$b;-><init>(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    iget-object v10, v8, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 105
    .line 106
    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Ljava/lang/Long;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v11

    .line 114
    invoke-static {v6, v7}, Lt2/a0;->V0(J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    invoke-virtual {v5}, Lq2/Y;->u()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_4

    .line 123
    .line 124
    iget-object v2, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 125
    .line 126
    invoke-virtual {v5, v3, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Lq2/Y$b;->o()J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    sub-long/2addr v6, v2

    .line 135
    :cond_4
    if-eqz v9, :cond_5

    .line 136
    .line 137
    cmp-long v2, v11, v6

    .line 138
    .line 139
    if-gez v2, :cond_6

    .line 140
    .line 141
    :cond_5
    move v1, v9

    .line 142
    move-object v9, v10

    .line 143
    move-wide v10, v11

    .line 144
    goto/16 :goto_6

    .line 145
    .line 146
    :cond_6
    if-nez v2, :cond_a

    .line 147
    .line 148
    iget-object v2, v8, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 149
    .line 150
    iget-object v2, v2, LM2/D$b;->a:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    const/4 v3, -0x1

    .line 157
    if-eq v2, v3, :cond_8

    .line 158
    .line 159
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 160
    .line 161
    invoke-virtual {v1, v2, v3}, Lq2/Y;->j(ILq2/Y$b;)Lq2/Y$b;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget v2, v2, Lq2/Y$b;->c:I

    .line 166
    .line 167
    iget-object v3, v10, LM2/D$b;->a:Ljava/lang/Object;

    .line 168
    .line 169
    iget-object v4, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 170
    .line 171
    invoke-virtual {v1, v3, v4}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    iget v3, v3, Lq2/Y$b;->c:I

    .line 176
    .line 177
    if-eq v2, v3, :cond_7

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_7
    return-object v8

    .line 181
    :cond_8
    :goto_3
    iget-object v2, v10, LM2/D$b;->a:Ljava/lang/Object;

    .line 182
    .line 183
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 184
    .line 185
    invoke-virtual {v1, v2, v3}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10}, LM2/D$b;->b()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_9

    .line 193
    .line 194
    iget-object v1, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 195
    .line 196
    iget v2, v10, LM2/D$b;->b:I

    .line 197
    .line 198
    iget v3, v10, LM2/D$b;->c:I

    .line 199
    .line 200
    invoke-virtual {v1, v2, v3}, Lq2/Y$b;->c(II)J

    .line 201
    .line 202
    .line 203
    move-result-wide v1

    .line 204
    :goto_4
    move-object v9, v10

    .line 205
    goto :goto_5

    .line 206
    :cond_9
    iget-object v1, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 207
    .line 208
    iget-wide v1, v1, Lq2/Y$b;->d:J

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :goto_5
    iget-wide v10, v8, Landroidx/media3/exoplayer/K0;->s:J

    .line 212
    .line 213
    iget-wide v12, v8, Landroidx/media3/exoplayer/K0;->s:J

    .line 214
    .line 215
    iget-wide v14, v8, Landroidx/media3/exoplayer/K0;->d:J

    .line 216
    .line 217
    iget-wide v3, v8, Landroidx/media3/exoplayer/K0;->s:J

    .line 218
    .line 219
    sub-long v16, v1, v3

    .line 220
    .line 221
    iget-object v3, v8, Landroidx/media3/exoplayer/K0;->h:LM2/n0;

    .line 222
    .line 223
    iget-object v4, v8, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 224
    .line 225
    iget-object v5, v8, Landroidx/media3/exoplayer/K0;->j:Ljava/util/List;

    .line 226
    .line 227
    move-object/from16 v18, v3

    .line 228
    .line 229
    move-object/from16 v19, v4

    .line 230
    .line 231
    move-object/from16 v20, v5

    .line 232
    .line 233
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/K0;->d(LM2/D$b;JJJJLM2/n0;LP2/H;Ljava/util/List;)Landroidx/media3/exoplayer/K0;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v3, v9}, Landroidx/media3/exoplayer/K0;->c(LM2/D$b;)Landroidx/media3/exoplayer/K0;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    iput-wide v1, v3, Landroidx/media3/exoplayer/K0;->q:J

    .line 242
    .line 243
    return-object v3

    .line 244
    :cond_a
    move-object v9, v10

    .line 245
    invoke-virtual {v9}, LM2/D$b;->b()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    xor-int/2addr v1, v4

    .line 250
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 251
    .line 252
    .line 253
    iget-wide v1, v8, Landroidx/media3/exoplayer/K0;->r:J

    .line 254
    .line 255
    sub-long v3, v11, v6

    .line 256
    .line 257
    sub-long/2addr v1, v3

    .line 258
    const-wide/16 v3, 0x0

    .line 259
    .line 260
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v16

    .line 264
    iget-wide v1, v8, Landroidx/media3/exoplayer/K0;->q:J

    .line 265
    .line 266
    iget-object v3, v8, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 267
    .line 268
    iget-object v4, v8, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 269
    .line 270
    invoke-virtual {v3, v4}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_b

    .line 275
    .line 276
    add-long v1, v11, v16

    .line 277
    .line 278
    :cond_b
    iget-object v3, v8, Landroidx/media3/exoplayer/K0;->h:LM2/n0;

    .line 279
    .line 280
    iget-object v4, v8, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 281
    .line 282
    iget-object v5, v8, Landroidx/media3/exoplayer/K0;->j:Ljava/util/List;

    .line 283
    .line 284
    move-wide v10, v11

    .line 285
    move-wide v12, v10

    .line 286
    move-wide v14, v10

    .line 287
    move-object/from16 v18, v3

    .line 288
    .line 289
    move-object/from16 v19, v4

    .line 290
    .line 291
    move-object/from16 v20, v5

    .line 292
    .line 293
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/K0;->d(LM2/D$b;JJJJLM2/n0;LP2/H;Ljava/util/List;)Landroidx/media3/exoplayer/K0;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    iput-wide v1, v3, Landroidx/media3/exoplayer/K0;->q:J

    .line 298
    .line 299
    return-object v3

    .line 300
    :goto_6
    invoke-virtual {v9}, LM2/D$b;->b()Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    xor-int/2addr v2, v4

    .line 305
    invoke-static {v2}, Lt2/a;->g(Z)V

    .line 306
    .line 307
    .line 308
    if-nez v1, :cond_c

    .line 309
    .line 310
    sget-object v2, LM2/n0;->d:LM2/n0;

    .line 311
    .line 312
    :goto_7
    move-object/from16 v18, v2

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_c
    iget-object v2, v8, Landroidx/media3/exoplayer/K0;->h:LM2/n0;

    .line 316
    .line 317
    goto :goto_7

    .line 318
    :goto_8
    if-nez v1, :cond_d

    .line 319
    .line 320
    iget-object v2, v0, Landroidx/media3/exoplayer/Y;->b:LP2/H;

    .line 321
    .line 322
    :goto_9
    move-object/from16 v19, v2

    .line 323
    .line 324
    goto :goto_a

    .line 325
    :cond_d
    iget-object v2, v8, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 326
    .line 327
    goto :goto_9

    .line 328
    :goto_a
    if-nez v1, :cond_e

    .line 329
    .line 330
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    :goto_b
    move-object/from16 v20, v1

    .line 335
    .line 336
    goto :goto_c

    .line 337
    :cond_e
    iget-object v1, v8, Landroidx/media3/exoplayer/K0;->j:Ljava/util/List;

    .line 338
    .line 339
    goto :goto_b

    .line 340
    :goto_c
    const-wide/16 v16, 0x0

    .line 341
    .line 342
    move-wide v12, v10

    .line 343
    move-wide v14, v10

    .line 344
    invoke-virtual/range {v8 .. v20}, Landroidx/media3/exoplayer/K0;->d(LM2/D$b;JJJJLM2/n0;LP2/H;Ljava/util/List;)Landroidx/media3/exoplayer/K0;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v1, v9}, Landroidx/media3/exoplayer/K0;->c(LM2/D$b;)Landroidx/media3/exoplayer/K0;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    iput-wide v10, v1, Landroidx/media3/exoplayer/K0;->q:J

    .line 353
    .line 354
    return-object v1
.end method

.method static synthetic S1(Landroidx/media3/exoplayer/Y;)Lt2/g;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->H:Lt2/g;

    .line 2
    .line 3
    return-object p0
.end method

.method private S2(Lq2/Y;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lq2/Y;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iput p2, p0, Landroidx/media3/exoplayer/Y;->x0:I

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p1, p3, p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-wide/16 p3, 0x0

    .line 19
    .line 20
    :cond_0
    iput-wide p3, p0, Landroidx/media3/exoplayer/Y;->z0:J

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, Landroidx/media3/exoplayer/Y;->y0:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1
    const/4 v0, -0x1

    .line 28
    if-eq p2, v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Lq2/Y;->t()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lt p2, v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_0
    move v3, p2

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    :goto_1
    iget-boolean p2, p0, Landroidx/media3/exoplayer/Y;->J:Z

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lq2/Y;->e(Z)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iget-object p3, p0, Lq2/h;->a:Lq2/Y$d;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-virtual {p3}, Lq2/Y$d;->c()J

    .line 52
    .line 53
    .line 54
    move-result-wide p3

    .line 55
    goto :goto_0

    .line 56
    :goto_2
    iget-object v1, p0, Lq2/h;->a:Lq2/Y$d;

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 59
    .line 60
    invoke-static {p3, p4}, Lt2/a0;->V0(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    move-object v0, p1

    .line 65
    invoke-virtual/range {v0 .. v5}, Lq2/Y;->n(Lq2/Y$d;Lq2/Y$b;IJ)Landroid/util/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method static synthetic T1(Landroidx/media3/exoplayer/Y;Ls2/e;)Ls2/e;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->n0:Ls2/e;

    .line 2
    .line 3
    return-object p1
.end method

.method private T2(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->h0:Lt2/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/K;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->h0:Lt2/K;

    .line 10
    .line 11
    invoke-virtual {v0}, Lt2/K;->a()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    new-instance v0, Lt2/K;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2}, Lt2/K;-><init>(II)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->h0:Lt2/K;

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 27
    .line 28
    new-instance v1, Landroidx/media3/exoplayer/z;

    .line 29
    .line 30
    invoke-direct {v1, p1, p2}, Landroidx/media3/exoplayer/z;-><init>(II)V

    .line 31
    .line 32
    .line 33
    const/16 v2, 0x18

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lt2/v;->k(ILt2/v$a;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lt2/K;

    .line 39
    .line 40
    invoke-direct {v0, p1, p2}, Lt2/K;-><init>(II)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x2

    .line 44
    const/16 p2, 0xe

    .line 45
    .line 46
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method static synthetic U1(Landroidx/media3/exoplayer/Y;)Lq2/I;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->v0:Lq2/I;

    .line 2
    .line 3
    return-object p0
.end method

.method private U2()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/media3/exoplayer/K0;->l:Z

    .line 4
    .line 5
    iget v0, v0, Landroidx/media3/exoplayer/K0;->m:I

    .line 6
    .line 7
    invoke-direct {p0, v1, v0}, Landroidx/media3/exoplayer/Y;->o3(ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method static synthetic V1(Landroidx/media3/exoplayer/Y;Lq2/I;)Lq2/I;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->v0:Lq2/I;

    .line 2
    .line 3
    return-object p1
.end method

.method private V2(II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x1

    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p0, p1, v1, v0}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 23
    .line 24
    new-instance v0, Landroidx/media3/exoplayer/N;

    .line 25
    .line 26
    invoke-direct {v0, p2}, Landroidx/media3/exoplayer/N;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/16 p2, 0x15

    .line 30
    .line 31
    invoke-virtual {p1, p2, v0}, Lt2/v;->k(ILt2/v$a;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method static synthetic W1(Landroidx/media3/exoplayer/Y;)Lq2/I;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->v2()Lq2/I;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private W2(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/Y;->s0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p1, :cond_2

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 9
    .line 10
    iget p1, p1, Landroidx/media3/exoplayer/K0;->n:I

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    if-ne p1, v0, :cond_1

    .line 14
    .line 15
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->U2()V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    return-void

    .line 19
    :cond_2
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->U2()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method static synthetic X1(Landroidx/media3/exoplayer/Y;)Lq2/I;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->V:Lq2/I;

    .line 2
    .line 3
    return-object p0
.end method

.method private X2(Lq2/Y;LM2/D$b;J)J
    .locals 1

    .line 1
    iget-object p2, p2, LM2/D$b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 9
    .line 10
    invoke-virtual {p1}, Lq2/Y$b;->o()J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    add-long/2addr p3, p1

    .line 15
    return-wide p3
.end method

.method static synthetic Y1(Landroidx/media3/exoplayer/Y;Lq2/I;)Lq2/I;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->V:Lq2/I;

    .line 2
    .line 3
    return-object p1
.end method

.method private Y2(Landroidx/media3/exoplayer/K0;II)Landroidx/media3/exoplayer/K0;
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->I2(Landroidx/media3/exoplayer/K0;)I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->G2(Landroidx/media3/exoplayer/K0;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    iget-object v1, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 18
    .line 19
    const/4 v7, 0x1

    .line 20
    add-int/2addr v0, v7

    .line 21
    iput v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 22
    .line 23
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/Y;->Z2(II)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->B2()Lq2/Y;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/Y;->J2(Lq2/Y;Lq2/Y;IJ)Landroid/util/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p0, p1, v2, v1}, Landroidx/media3/exoplayer/Y;->R2(Landroidx/media3/exoplayer/K0;Lq2/Y;Landroid/util/Pair;)Landroidx/media3/exoplayer/K0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget v1, p1, Landroidx/media3/exoplayer/K0;->e:I

    .line 40
    .line 41
    if-eq v1, v7, :cond_0

    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    if-eq v1, v2, :cond_0

    .line 45
    .line 46
    if-ge p2, p3, :cond_0

    .line 47
    .line 48
    if-ne p3, v6, :cond_0

    .line 49
    .line 50
    iget-object v1, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 51
    .line 52
    invoke-virtual {v1}, Lq2/Y;->t()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-lt v3, v1, :cond_0

    .line 57
    .line 58
    invoke-static {p1, v2}, Landroidx/media3/exoplayer/Y;->Q2(Landroidx/media3/exoplayer/K0;I)Landroidx/media3/exoplayer/K0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :cond_0
    iget-object v1, v0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 63
    .line 64
    iget-object v2, v0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 65
    .line 66
    invoke-virtual {v1, p2, p3, v2}, Landroidx/media3/exoplayer/o0;->P0(IILM2/e0;)V

    .line 67
    .line 68
    .line 69
    return-object p1
.end method

.method static synthetic Z1(Landroidx/media3/exoplayer/Y;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/media3/exoplayer/Y;->d0:Z

    .line 2
    .line 3
    return p0
.end method

.method private Z2(II)V
    .locals 2

    .line 1
    add-int/lit8 v0, p2, -0x1

    .line 2
    .line 3
    :goto_0
    if-lt v0, p1, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, LM2/e0;->a(II)LM2/e0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 20
    .line 21
    return-void
.end method

.method static synthetic a2(Landroidx/media3/exoplayer/Y;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private a3()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->c0:LT2/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->A:Landroidx/media3/exoplayer/Y$d;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->D2(Landroidx/media3/exoplayer/L0$b;)Landroidx/media3/exoplayer/L0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/16 v2, 0x2710

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroidx/media3/exoplayer/L0;->m(I)Landroidx/media3/exoplayer/L0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/L0;->l(Ljava/lang/Object;)Landroidx/media3/exoplayer/L0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroidx/media3/exoplayer/L0;->k()Landroidx/media3/exoplayer/L0;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->c0:LT2/l;

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, LT2/l;->g(LT2/l$b;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Landroidx/media3/exoplayer/Y;->c0:LT2/l;

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->e0:Landroid/view/TextureView;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 43
    .line 44
    if-eq v0, v2, :cond_1

    .line 45
    .line 46
    const-string v0, "ExoPlayerImpl"

    .line 47
    .line 48
    const-string v2, "SurfaceTextureListener already unset or replaced."

    .line 49
    .line 50
    invoke-static {v0, v2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->e0:Landroid/view/TextureView;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iput-object v1, p0, Landroidx/media3/exoplayer/Y;->e0:Landroid/view/TextureView;

    .line 60
    .line 61
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->b0:Landroid/view/SurfaceHolder;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 66
    .line 67
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Landroidx/media3/exoplayer/Y;->b0:Landroid/view/SurfaceHolder;

    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method static synthetic b2(Landroidx/media3/exoplayer/Y;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private b3(IILjava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->g:[Landroidx/media3/exoplayer/N0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, -0x1

    .line 7
    if-ge v3, v1, :cond_2

    .line 8
    .line 9
    aget-object v5, v0, v3

    .line 10
    .line 11
    if-eq p1, v4, :cond_0

    .line 12
    .line 13
    invoke-interface {v5}, Landroidx/media3/exoplayer/N0;->f()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ne v4, p1, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-direct {p0, v5}, Landroidx/media3/exoplayer/Y;->D2(Landroidx/media3/exoplayer/L0$b;)Landroidx/media3/exoplayer/L0;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4, p2}, Landroidx/media3/exoplayer/L0;->m(I)Landroidx/media3/exoplayer/L0;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4, p3}, Landroidx/media3/exoplayer/L0;->l(Ljava/lang/Object;)Landroidx/media3/exoplayer/L0;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Landroidx/media3/exoplayer/L0;->k()Landroidx/media3/exoplayer/L0;

    .line 32
    .line 33
    .line 34
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->h:[Landroidx/media3/exoplayer/N0;

    .line 38
    .line 39
    array-length v1, v0

    .line 40
    :goto_1
    if-ge v2, v1, :cond_5

    .line 41
    .line 42
    aget-object v3, v0, v2

    .line 43
    .line 44
    if-eqz v3, :cond_4

    .line 45
    .line 46
    if-eq p1, v4, :cond_3

    .line 47
    .line 48
    invoke-interface {v3}, Landroidx/media3/exoplayer/N0;->f()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-ne v5, p1, :cond_4

    .line 53
    .line 54
    :cond_3
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/Y;->D2(Landroidx/media3/exoplayer/L0$b;)Landroidx/media3/exoplayer/L0;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3, p2}, Landroidx/media3/exoplayer/L0;->m(I)Landroidx/media3/exoplayer/L0;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3, p3}, Landroidx/media3/exoplayer/L0;->l(Ljava/lang/Object;)Landroidx/media3/exoplayer/L0;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Landroidx/media3/exoplayer/L0;->k()Landroidx/media3/exoplayer/L0;

    .line 67
    .line 68
    .line 69
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    return-void
.end method

.method static synthetic c2(Landroidx/media3/exoplayer/Y;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->i3(Landroid/graphics/SurfaceTexture;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private c3(ILjava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method static synthetic d2(Landroidx/media3/exoplayer/Y;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/Y;->o3(ZI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic e2(Landroidx/media3/exoplayer/Y;)Landroidx/media3/exoplayer/e1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f2(Landroidx/media3/exoplayer/e1;)Lq2/p;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/Y;->A2(Landroidx/media3/exoplayer/e1;)Lq2/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic g2(Landroidx/media3/exoplayer/Y;)Lq2/p;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->t0:Lq2/p;

    .line 2
    .line 3
    return-object p0
.end method

.method private g3(Ljava/util/List;IJZ)V
    .locals 14

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 4
    .line 5
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/Y;->I2(Landroidx/media3/exoplayer/K0;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->getCurrentPosition()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget v5, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    add-int/2addr v5, v6

    .line 17
    iput v5, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 18
    .line 19
    iget-object v5, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v7, 0x0

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iget-object v5, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-direct {p0, v7, v5}, Landroidx/media3/exoplayer/Y;->Z2(II)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-direct {p0, v7, p1}, Landroidx/media3/exoplayer/Y;->s2(ILjava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->B2()Lq2/Y;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5}, Lq2/Y;->u()Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-nez v8, :cond_1

    .line 50
    .line 51
    invoke-virtual {v5}, Lq2/Y;->t()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-ge v1, v8, :cond_2

    .line 56
    .line 57
    :cond_1
    move-wide/from16 v10, p3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance v2, Lq2/A;

    .line 61
    .line 62
    move-wide/from16 v10, p3

    .line 63
    .line 64
    invoke-direct {v2, v5, v1, v10, v11}, Lq2/A;-><init>(Lq2/Y;IJ)V

    .line 65
    .line 66
    .line 67
    throw v2

    .line 68
    :goto_0
    const/4 v8, -0x1

    .line 69
    if-eqz p5, :cond_3

    .line 70
    .line 71
    iget-boolean v1, p0, Landroidx/media3/exoplayer/Y;->J:Z

    .line 72
    .line 73
    invoke-virtual {v5, v1}, Lq2/Y;->e(Z)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :goto_1
    move v10, v1

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    if-ne v1, v8, :cond_4

    .line 85
    .line 86
    move v10, v2

    .line 87
    move-wide v2, v3

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-wide v2, v10

    .line 90
    goto :goto_1

    .line 91
    :goto_2
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 92
    .line 93
    invoke-direct {p0, v5, v10, v2, v3}, Landroidx/media3/exoplayer/Y;->S2(Lq2/Y;IJ)Landroid/util/Pair;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-direct {p0, v1, v5, v4}, Landroidx/media3/exoplayer/Y;->R2(Landroidx/media3/exoplayer/K0;Lq2/Y;Landroid/util/Pair;)Landroidx/media3/exoplayer/K0;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget v4, v1, Landroidx/media3/exoplayer/K0;->e:I

    .line 102
    .line 103
    if-eq v10, v8, :cond_7

    .line 104
    .line 105
    if-eq v4, v6, :cond_7

    .line 106
    .line 107
    invoke-virtual {v5}, Lq2/Y;->u()Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-nez v4, :cond_6

    .line 112
    .line 113
    invoke-virtual {v5}, Lq2/Y;->t()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-lt v10, v4, :cond_5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    const/4 v4, 0x2

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    :goto_3
    const/4 v4, 0x4

    .line 123
    :cond_7
    :goto_4
    invoke-static {v1, v4}, Landroidx/media3/exoplayer/Y;->Q2(Landroidx/media3/exoplayer/K0;I)Landroidx/media3/exoplayer/K0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v8, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 128
    .line 129
    invoke-static {v2, v3}, Lt2/a0;->V0(J)J

    .line 130
    .line 131
    .line 132
    move-result-wide v11

    .line 133
    iget-object v13, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 134
    .line 135
    invoke-virtual/range {v8 .. v13}, Landroidx/media3/exoplayer/o0;->q1(Ljava/util/List;IJLM2/e0;)V

    .line 136
    .line 137
    .line 138
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 139
    .line 140
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 141
    .line 142
    iget-object v2, v2, LM2/D$b;->a:Ljava/lang/Object;

    .line 143
    .line 144
    iget-object v3, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 145
    .line 146
    iget-object v3, v3, LM2/D$b;->a:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-nez v2, :cond_8

    .line 153
    .line 154
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 155
    .line 156
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 157
    .line 158
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-nez v2, :cond_8

    .line 163
    .line 164
    move v3, v6

    .line 165
    goto :goto_5

    .line 166
    :cond_8
    move v3, v7

    .line 167
    :goto_5
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/Y;->H2(Landroidx/media3/exoplayer/K0;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v5

    .line 171
    const/4 v7, -0x1

    .line 172
    const/4 v8, 0x0

    .line 173
    const/4 v2, 0x0

    .line 174
    const/4 v4, 0x4

    .line 175
    move-object v0, p0

    .line 176
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method static synthetic h2(Landroidx/media3/exoplayer/Y;Lq2/p;)Lq2/p;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->t0:Lq2/p;

    .line 2
    .line 3
    return-object p1
.end method

.method private h3(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/Y;->d0:Z

    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->b0:Landroid/view/SurfaceHolder;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 7
    .line 8
    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->b0:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->b0:Landroid/view/SurfaceHolder;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-direct {p0, v0, v0}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method static synthetic i2(Landroidx/media3/exoplayer/Y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->r3()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private i3(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/Surface;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->a0:Landroid/view/Surface;

    .line 10
    .line 11
    return-void
.end method

.method static synthetic j2(Landroidx/media3/exoplayer/Y;LA2/b;)LA2/b;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->i0:LA2/b;

    .line 2
    .line 3
    return-object p1
.end method

.method private j3(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-wide v1, p0, Landroidx/media3/exoplayer/Y;->F:J

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    :goto_1
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 21
    .line 22
    invoke-virtual {v3, p1, v1, v2}, Landroidx/media3/exoplayer/o0;->L1(Ljava/lang/Object;J)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->Z:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->a0:Landroid/view/Surface;

    .line 31
    .line 32
    if-ne v0, v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->a0:Landroid/view/Surface;

    .line 39
    .line 40
    :cond_2
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->Z:Ljava/lang/Object;

    .line 41
    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    new-instance p1, LA2/I;

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-direct {p1, v0}, LA2/I;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const/16 v0, 0x3eb

    .line 51
    .line 52
    invoke-static {p1, v0}, Landroidx/media3/exoplayer/s;->k(Ljava/lang/RuntimeException;I)Landroidx/media3/exoplayer/s;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->l3(Landroidx/media3/exoplayer/s;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method static synthetic k2(Landroidx/media3/exoplayer/Y;)LB2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic l1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->n(Lq2/O;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method static synthetic l2(Landroidx/media3/exoplayer/Y;Lq2/x;)Lq2/x;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->X:Lq2/x;

    .line 2
    .line 3
    return-object p1
.end method

.method private l3(Landroidx/media3/exoplayer/s;)V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/K0;->c(LM2/D$b;)Landroidx/media3/exoplayer/K0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 10
    .line 11
    iput-wide v1, v0, Landroidx/media3/exoplayer/K0;->q:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Landroidx/media3/exoplayer/K0;->r:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/Y;->Q2(Landroidx/media3/exoplayer/K0;I)Landroidx/media3/exoplayer/K0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/K0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/K0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/media3/exoplayer/o0;->V1()V

    .line 37
    .line 38
    .line 39
    const/4 v9, -0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x5

    .line 44
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    move-object v2, p0

    .line 50
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static synthetic m1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/K0;->g:Z

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lq2/P$d;->D(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Landroidx/media3/exoplayer/K0;->g:Z

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lq2/P$d;->b0(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method static synthetic m2(Landroidx/media3/exoplayer/Y;Lq2/l0;)Lq2/l0;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->u0:Lq2/l0;

    .line 2
    .line 3
    return-object p1
.end method

.method private m3()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->U:Lq2/P$b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->f:Lq2/P;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->c:Lq2/P$b;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lt2/a0;->Q(Lq2/P;Lq2/P$b;)Lq2/P$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Landroidx/media3/exoplayer/Y;->U:Lq2/P$b;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lq2/P$b;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 20
    .line 21
    new-instance v1, Landroidx/media3/exoplayer/L;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Landroidx/media3/exoplayer/L;-><init>(Landroidx/media3/exoplayer/Y;)V

    .line 24
    .line 25
    .line 26
    const/16 v2, 0xd

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public static synthetic n1(Lq2/I;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->V(Lq2/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic n2(Landroidx/media3/exoplayer/Y;)Lt2/v;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 2
    .line 3
    return-object p0
.end method

.method private n3(IILjava/util/List;)V
    .locals 9

    .line 1
    iget v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Landroidx/media3/exoplayer/o0;->a2(IILjava/util/List;)V

    .line 10
    .line 11
    .line 12
    move v0, p1

    .line 13
    :goto_0
    if-ge v0, p2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/media3/exoplayer/Y$e;

    .line 22
    .line 23
    new-instance v2, LM2/k0;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/media3/exoplayer/Y$e;->a()Lq2/Y;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sub-int v4, v0, p1

    .line 30
    .line 31
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lq2/C;

    .line 36
    .line 37
    invoke-direct {v2, v3, v4}, LM2/k0;-><init>(Lq2/Y;Lq2/C;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroidx/media3/exoplayer/Y$e;->c(Lq2/Y;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->B2()Lq2/Y;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroidx/media3/exoplayer/K0;->j(Lq2/Y;)Landroidx/media3/exoplayer/K0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v7, -0x1

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x4

    .line 61
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    move-object v0, p0

    .line 67
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static synthetic o1(ZLq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->M(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic o2(Landroidx/media3/exoplayer/Y;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->Z:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method private o3(ZI)V
    .locals 11

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->z2(Z)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 6
    .line 7
    iget-boolean v2, v1, Landroidx/media3/exoplayer/K0;->l:Z

    .line 8
    .line 9
    if-ne v2, p1, :cond_0

    .line 10
    .line 11
    iget v2, v1, Landroidx/media3/exoplayer/K0;->n:I

    .line 12
    .line 13
    if-ne v2, v0, :cond_0

    .line 14
    .line 15
    iget v2, v1, Landroidx/media3/exoplayer/K0;->m:I

    .line 16
    .line 17
    if-ne v2, p2, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget v2, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    iput v2, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 25
    .line 26
    iget-boolean v2, v1, Landroidx/media3/exoplayer/K0;->p:Z

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/media3/exoplayer/K0;->a()Landroidx/media3/exoplayer/K0;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_1
    invoke-virtual {v1, p1, p2, v0}, Landroidx/media3/exoplayer/K0;->e(ZII)Landroidx/media3/exoplayer/K0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 39
    .line 40
    invoke-virtual {v1, p1, p2, v0}, Landroidx/media3/exoplayer/o0;->t1(ZII)V

    .line 41
    .line 42
    .line 43
    const/4 v9, -0x1

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x5

    .line 48
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    move-object v2, p0

    .line 54
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static synthetic p1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/K0;->n:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->C(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method static synthetic p2(Landroidx/media3/exoplayer/Y;LA2/b;)LA2/b;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->j0:LA2/b;

    .line 2
    .line 3
    return-object p1
.end method

.method private p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 6
    .line 7
    iput-object v1, v0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 8
    .line 9
    iget-object v3, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 10
    .line 11
    iget-object v4, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Lq2/Y;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    xor-int/lit8 v5, v7, 0x1

    .line 18
    .line 19
    move/from16 v3, p3

    .line 20
    .line 21
    move/from16 v4, p4

    .line 22
    .line 23
    move/from16 v6, p8

    .line 24
    .line 25
    invoke-direct/range {v0 .. v6}, Landroidx/media3/exoplayer/Y;->E2(Landroidx/media3/exoplayer/K0;Landroidx/media3/exoplayer/K0;ZIZZ)Landroid/util/Pair;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v3, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const/4 v6, 0x0

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v8, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 49
    .line 50
    invoke-virtual {v8}, Lq2/Y;->u()Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-nez v8, :cond_0

    .line 55
    .line 56
    iget-object v6, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 57
    .line 58
    iget-object v8, v1, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 59
    .line 60
    iget-object v8, v8, LM2/D$b;->a:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v9, v0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 63
    .line 64
    invoke-virtual {v6, v8, v9}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget v6, v6, Lq2/Y$b;->c:I

    .line 69
    .line 70
    iget-object v8, v1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 71
    .line 72
    iget-object v9, v0, Lq2/h;->a:Lq2/Y$d;

    .line 73
    .line 74
    invoke-virtual {v8, v6, v9}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    iget-object v6, v6, Lq2/Y$d;->c:Lq2/C;

    .line 79
    .line 80
    :cond_0
    sget-object v8, Lq2/I;->K:Lq2/I;

    .line 81
    .line 82
    iput-object v8, v0, Landroidx/media3/exoplayer/Y;->v0:Lq2/I;

    .line 83
    .line 84
    :cond_1
    if-nez v3, :cond_2

    .line 85
    .line 86
    iget-object v8, v2, Landroidx/media3/exoplayer/K0;->j:Ljava/util/List;

    .line 87
    .line 88
    iget-object v9, v1, Landroidx/media3/exoplayer/K0;->j:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v8, v9}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-nez v8, :cond_3

    .line 95
    .line 96
    :cond_2
    iget-object v8, v0, Landroidx/media3/exoplayer/Y;->v0:Lq2/I;

    .line 97
    .line 98
    invoke-virtual {v8}, Lq2/I;->a()Lq2/I$b;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    iget-object v9, v1, Landroidx/media3/exoplayer/K0;->j:Ljava/util/List;

    .line 103
    .line 104
    invoke-virtual {v8, v9}, Lq2/I$b;->M(Ljava/util/List;)Lq2/I$b;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v8}, Lq2/I$b;->J()Lq2/I;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    iput-object v8, v0, Landroidx/media3/exoplayer/Y;->v0:Lq2/I;

    .line 113
    .line 114
    :cond_3
    invoke-direct {v0}, Landroidx/media3/exoplayer/Y;->v2()Lq2/I;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    iget-object v9, v0, Landroidx/media3/exoplayer/Y;->V:Lq2/I;

    .line 119
    .line 120
    invoke-virtual {v8, v9}, Lq2/I;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    iput-object v8, v0, Landroidx/media3/exoplayer/Y;->V:Lq2/I;

    .line 125
    .line 126
    iget-boolean v8, v2, Landroidx/media3/exoplayer/K0;->l:Z

    .line 127
    .line 128
    iget-boolean v10, v1, Landroidx/media3/exoplayer/K0;->l:Z

    .line 129
    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v12, 0x1

    .line 132
    if-eq v8, v10, :cond_4

    .line 133
    .line 134
    move v8, v12

    .line 135
    goto :goto_0

    .line 136
    :cond_4
    move v8, v11

    .line 137
    :goto_0
    iget v10, v2, Landroidx/media3/exoplayer/K0;->e:I

    .line 138
    .line 139
    iget v13, v1, Landroidx/media3/exoplayer/K0;->e:I

    .line 140
    .line 141
    if-eq v10, v13, :cond_5

    .line 142
    .line 143
    move v10, v12

    .line 144
    goto :goto_1

    .line 145
    :cond_5
    move v10, v11

    .line 146
    :goto_1
    if-nez v10, :cond_6

    .line 147
    .line 148
    if-eqz v8, :cond_7

    .line 149
    .line 150
    :cond_6
    invoke-direct {v0}, Landroidx/media3/exoplayer/Y;->r3()V

    .line 151
    .line 152
    .line 153
    :cond_7
    iget-boolean v13, v2, Landroidx/media3/exoplayer/K0;->g:Z

    .line 154
    .line 155
    iget-boolean v14, v1, Landroidx/media3/exoplayer/K0;->g:Z

    .line 156
    .line 157
    if-eq v13, v14, :cond_8

    .line 158
    .line 159
    move v13, v12

    .line 160
    goto :goto_2

    .line 161
    :cond_8
    move v13, v11

    .line 162
    :goto_2
    if-eqz v13, :cond_9

    .line 163
    .line 164
    invoke-direct {v0, v14}, Landroidx/media3/exoplayer/Y;->q3(Z)V

    .line 165
    .line 166
    .line 167
    :cond_9
    if-nez v7, :cond_a

    .line 168
    .line 169
    iget-object v7, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 170
    .line 171
    new-instance v14, Landroidx/media3/exoplayer/t;

    .line 172
    .line 173
    move/from16 v15, p2

    .line 174
    .line 175
    invoke-direct {v14, v1, v15}, Landroidx/media3/exoplayer/t;-><init>(Landroidx/media3/exoplayer/K0;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v11, v14}, Lt2/v;->h(ILt2/v$a;)V

    .line 179
    .line 180
    .line 181
    :cond_a
    if-eqz p3, :cond_b

    .line 182
    .line 183
    move/from16 v7, p7

    .line 184
    .line 185
    invoke-direct {v0, v4, v2, v7}, Landroidx/media3/exoplayer/Y;->M2(ILandroidx/media3/exoplayer/K0;I)Lq2/P$e;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    move-wide/from16 v14, p5

    .line 190
    .line 191
    invoke-direct {v0, v14, v15}, Landroidx/media3/exoplayer/Y;->L2(J)Lq2/P$e;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    iget-object v14, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 196
    .line 197
    new-instance v15, Landroidx/media3/exoplayer/T;

    .line 198
    .line 199
    invoke-direct {v15, v4, v7, v11}, Landroidx/media3/exoplayer/T;-><init>(ILq2/P$e;Lq2/P$e;)V

    .line 200
    .line 201
    .line 202
    const/16 v4, 0xb

    .line 203
    .line 204
    invoke-virtual {v14, v4, v15}, Lt2/v;->h(ILt2/v$a;)V

    .line 205
    .line 206
    .line 207
    :cond_b
    if-eqz v3, :cond_c

    .line 208
    .line 209
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 210
    .line 211
    new-instance v4, Landroidx/media3/exoplayer/U;

    .line 212
    .line 213
    invoke-direct {v4, v6, v5}, Landroidx/media3/exoplayer/U;-><init>(Lq2/C;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v12, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 217
    .line 218
    .line 219
    :cond_c
    iget-object v3, v2, Landroidx/media3/exoplayer/K0;->f:Landroidx/media3/exoplayer/s;

    .line 220
    .line 221
    iget-object v4, v1, Landroidx/media3/exoplayer/K0;->f:Landroidx/media3/exoplayer/s;

    .line 222
    .line 223
    if-eq v3, v4, :cond_d

    .line 224
    .line 225
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 226
    .line 227
    new-instance v4, Landroidx/media3/exoplayer/V;

    .line 228
    .line 229
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/V;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 230
    .line 231
    .line 232
    const/16 v5, 0xa

    .line 233
    .line 234
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 235
    .line 236
    .line 237
    iget-object v3, v1, Landroidx/media3/exoplayer/K0;->f:Landroidx/media3/exoplayer/s;

    .line 238
    .line 239
    if-eqz v3, :cond_d

    .line 240
    .line 241
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 242
    .line 243
    new-instance v4, Landroidx/media3/exoplayer/W;

    .line 244
    .line 245
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/W;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 249
    .line 250
    .line 251
    :cond_d
    iget-object v3, v2, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 252
    .line 253
    iget-object v4, v1, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 254
    .line 255
    if-eq v3, v4, :cond_e

    .line 256
    .line 257
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 258
    .line 259
    iget-object v4, v4, LP2/H;->e:Ljava/lang/Object;

    .line 260
    .line 261
    invoke-virtual {v3, v4}, LP2/G;->i(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 265
    .line 266
    new-instance v4, Landroidx/media3/exoplayer/X;

    .line 267
    .line 268
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/X;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 269
    .line 270
    .line 271
    const/4 v5, 0x2

    .line 272
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 273
    .line 274
    .line 275
    :cond_e
    if-nez v9, :cond_f

    .line 276
    .line 277
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->V:Lq2/I;

    .line 278
    .line 279
    iget-object v4, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 280
    .line 281
    new-instance v5, Landroidx/media3/exoplayer/u;

    .line 282
    .line 283
    invoke-direct {v5, v3}, Landroidx/media3/exoplayer/u;-><init>(Lq2/I;)V

    .line 284
    .line 285
    .line 286
    const/16 v3, 0xe

    .line 287
    .line 288
    invoke-virtual {v4, v3, v5}, Lt2/v;->h(ILt2/v$a;)V

    .line 289
    .line 290
    .line 291
    :cond_f
    if-eqz v13, :cond_10

    .line 292
    .line 293
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 294
    .line 295
    new-instance v4, Landroidx/media3/exoplayer/v;

    .line 296
    .line 297
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/v;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 298
    .line 299
    .line 300
    const/4 v5, 0x3

    .line 301
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 302
    .line 303
    .line 304
    :cond_10
    if-nez v10, :cond_11

    .line 305
    .line 306
    if-eqz v8, :cond_12

    .line 307
    .line 308
    :cond_11
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 309
    .line 310
    new-instance v4, Landroidx/media3/exoplayer/w;

    .line 311
    .line 312
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/w;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 313
    .line 314
    .line 315
    const/4 v5, -0x1

    .line 316
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 317
    .line 318
    .line 319
    :cond_12
    if-eqz v10, :cond_13

    .line 320
    .line 321
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 322
    .line 323
    new-instance v4, Landroidx/media3/exoplayer/x;

    .line 324
    .line 325
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/x;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 326
    .line 327
    .line 328
    const/4 v5, 0x4

    .line 329
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 330
    .line 331
    .line 332
    :cond_13
    if-nez v8, :cond_14

    .line 333
    .line 334
    iget v3, v2, Landroidx/media3/exoplayer/K0;->m:I

    .line 335
    .line 336
    iget v4, v1, Landroidx/media3/exoplayer/K0;->m:I

    .line 337
    .line 338
    if-eq v3, v4, :cond_15

    .line 339
    .line 340
    :cond_14
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 341
    .line 342
    new-instance v4, Landroidx/media3/exoplayer/E;

    .line 343
    .line 344
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/E;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 345
    .line 346
    .line 347
    const/4 v5, 0x5

    .line 348
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 349
    .line 350
    .line 351
    :cond_15
    iget v3, v2, Landroidx/media3/exoplayer/K0;->n:I

    .line 352
    .line 353
    iget v4, v1, Landroidx/media3/exoplayer/K0;->n:I

    .line 354
    .line 355
    if-eq v3, v4, :cond_16

    .line 356
    .line 357
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 358
    .line 359
    new-instance v4, Landroidx/media3/exoplayer/P;

    .line 360
    .line 361
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/P;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 362
    .line 363
    .line 364
    const/4 v5, 0x6

    .line 365
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 366
    .line 367
    .line 368
    :cond_16
    invoke-virtual {v2}, Landroidx/media3/exoplayer/K0;->n()Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    invoke-virtual {v1}, Landroidx/media3/exoplayer/K0;->n()Z

    .line 373
    .line 374
    .line 375
    move-result v4

    .line 376
    if-eq v3, v4, :cond_17

    .line 377
    .line 378
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 379
    .line 380
    new-instance v4, Landroidx/media3/exoplayer/Q;

    .line 381
    .line 382
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/Q;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 383
    .line 384
    .line 385
    const/4 v5, 0x7

    .line 386
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 387
    .line 388
    .line 389
    :cond_17
    iget-object v3, v2, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 390
    .line 391
    iget-object v4, v1, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 392
    .line 393
    invoke-virtual {v3, v4}, Lq2/O;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    if-nez v3, :cond_18

    .line 398
    .line 399
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 400
    .line 401
    new-instance v4, Landroidx/media3/exoplayer/S;

    .line 402
    .line 403
    invoke-direct {v4, v1}, Landroidx/media3/exoplayer/S;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 404
    .line 405
    .line 406
    const/16 v5, 0xc

    .line 407
    .line 408
    invoke-virtual {v3, v5, v4}, Lt2/v;->h(ILt2/v$a;)V

    .line 409
    .line 410
    .line 411
    :cond_18
    invoke-direct {v0}, Landroidx/media3/exoplayer/Y;->m3()V

    .line 412
    .line 413
    .line 414
    iget-object v3, v0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 415
    .line 416
    invoke-virtual {v3}, Lt2/v;->f()V

    .line 417
    .line 418
    .line 419
    iget-boolean v2, v2, Landroidx/media3/exoplayer/K0;->p:Z

    .line 420
    .line 421
    iget-boolean v3, v1, Landroidx/media3/exoplayer/K0;->p:Z

    .line 422
    .line 423
    if-eq v2, v3, :cond_19

    .line 424
    .line 425
    iget-object v2, v0, Landroidx/media3/exoplayer/Y;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 426
    .line 427
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-eqz v3, :cond_19

    .line 436
    .line 437
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    check-cast v3, Landroidx/media3/exoplayer/ExoPlayer$a;

    .line 442
    .line 443
    iget-boolean v4, v1, Landroidx/media3/exoplayer/K0;->p:Z

    .line 444
    .line 445
    invoke-interface {v3, v4}, Landroidx/media3/exoplayer/ExoPlayer$a;->G(Z)V

    .line 446
    .line 447
    .line 448
    goto :goto_3

    .line 449
    :cond_19
    return-void
.end method

.method public static synthetic q1(Landroidx/media3/exoplayer/K0;Lq2/P$d;)V
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/exoplayer/K0;->e:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->J(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private q3(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic r1(ILq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->F(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static r2(Lq2/d0;LP9/w;)Lq2/d0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lq2/d0;->I()Lq2/d0$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, LP9/w;->l()LP9/X;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {p0, v0, v1}, Lq2/d0$c;->V(IZ)Lq2/d0$c;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lq2/d0$c;->G()Lq2/d0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method private r3()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, v2, :cond_3

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_1

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->P2()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->D:Landroidx/media3/exoplayer/j1;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->q0()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    move v1, v2

    .line 40
    :cond_2
    invoke-virtual {v3, v1}, Landroidx/media3/exoplayer/j1;->d(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->E:Landroidx/media3/exoplayer/m1;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->q0()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/m1;->d(Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->D:Landroidx/media3/exoplayer/j1;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/j1;->d(Z)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->E:Landroidx/media3/exoplayer/m1;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/m1;->d(Z)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static synthetic s1(Landroidx/media3/exoplayer/Y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->H:Lt2/g;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->e:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {p0}, Lt2/a0;->L(Landroid/content/Context;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v0, p0}, Lt2/g;->g(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private s2(ILjava/util/List;)Ljava/util/List;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Landroidx/media3/exoplayer/J0$c;

    .line 14
    .line 15
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, LM2/D;

    .line 20
    .line 21
    iget-boolean v4, p0, Landroidx/media3/exoplayer/Y;->q:Z

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Landroidx/media3/exoplayer/J0$c;-><init>(LM2/D;Z)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 30
    .line 31
    add-int v4, v1, p1

    .line 32
    .line 33
    new-instance v5, Landroidx/media3/exoplayer/Y$e;

    .line 34
    .line 35
    iget-object v6, v2, Landroidx/media3/exoplayer/J0$c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v2, Landroidx/media3/exoplayer/J0$c;->a:LM2/A;

    .line 38
    .line 39
    invoke-direct {v5, v6, v2}, Landroidx/media3/exoplayer/Y$e;-><init>(Ljava/lang/Object;LM2/A;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p2, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-interface {p2, p1, v1}, LM2/e0;->g(II)LM2/e0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 59
    .line 60
    return-object v0
.end method

.method private s3()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->d:Lt2/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/m;->b()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->m()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->m()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 45
    .line 46
    invoke-static {v1, v0}, Lt2/a0;->I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-boolean v1, p0, Landroidx/media3/exoplayer/Y;->o0:Z

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    iget-boolean v1, p0, Landroidx/media3/exoplayer/Y;->p0:Z

    .line 55
    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 63
    .line 64
    .line 65
    :goto_0
    const-string v2, "ExoPlayerImpl"

    .line 66
    .line 67
    invoke-static {v2, v0, v1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    iput-boolean v0, p0, Landroidx/media3/exoplayer/Y;->p0:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_2
    return-void
.end method

.method public static synthetic t1(Lq2/C;ILq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lq2/P$d;->E(Lq2/C;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic u1(Landroidx/media3/exoplayer/Y;Lq2/P$d;Lq2/t;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->f:Lq2/P;

    .line 2
    .line 3
    new-instance v0, Lq2/P$c;

    .line 4
    .line 5
    invoke-direct {v0, p2}, Lq2/P$c;-><init>(Lq2/t;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0, v0}, Lq2/P$d;->X(Lq2/P;Lq2/P$c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private u2(Landroidx/media3/exoplayer/K0;ILjava/util/List;)Landroidx/media3/exoplayer/K0;
    .locals 6

    .line 1
    iget-object v1, p1, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 2
    .line 3
    iget v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    iput v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 8
    .line 9
    invoke-direct {p0, p2, p3}, Landroidx/media3/exoplayer/Y;->s2(ILjava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->B2()Lq2/Y;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->I2(Landroidx/media3/exoplayer/K0;)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->G2(Landroidx/media3/exoplayer/K0;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    move-object v0, p0

    .line 26
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/Y;->J2(Lq2/Y;Lq2/Y;IJ)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p0, p1, v2, v1}, Landroidx/media3/exoplayer/Y;->R2(Landroidx/media3/exoplayer/K0;Lq2/Y;Landroid/util/Pair;)Landroidx/media3/exoplayer/K0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object v1, v0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 35
    .line 36
    iget-object v2, v0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 37
    .line 38
    invoke-virtual {v1, p2, p3, v2}, Landroidx/media3/exoplayer/o0;->v(ILjava/util/List;LM2/e0;)V

    .line 39
    .line 40
    .line 41
    return-object p1
.end method

.method public static synthetic v1(ILq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->d(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private v2()Lq2/I;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->h0()Lq2/Y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->v0:Lq2/I;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->K0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lq2/h;->a:Lq2/Y$d;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Lq2/Y$d;->c:Lq2/C;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->v0:Lq2/I;

    .line 27
    .line 28
    invoke-virtual {v1}, Lq2/I;->a()Lq2/I$b;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v0, v0, Lq2/C;->e:Lq2/I;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lq2/I$b;->L(Lq2/I;)Lq2/I$b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lq2/I$b;->J()Lq2/I;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method

.method public static synthetic w1(Landroidx/media3/exoplayer/Y;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->U:Lq2/P$b;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->I(Lq2/P$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private w2(IILjava/util/List;)Z
    .locals 4

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move v0, p1

    .line 12
    :goto_0
    if-ge v0, p2, :cond_2

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/media3/exoplayer/Y$e;

    .line 21
    .line 22
    invoke-static {v1}, Landroidx/media3/exoplayer/Y$e;->b(Landroidx/media3/exoplayer/Y$e;)LM2/D;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sub-int v3, v0, p1

    .line 27
    .line 28
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lq2/C;

    .line 33
    .line 34
    invoke-interface {v1, v3}, LM2/D;->e(Lq2/C;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p1, 0x1

    .line 45
    return p1
.end method

.method public static synthetic x1(Landroidx/media3/exoplayer/Y;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/exoplayer/Y;->W:Lq2/I;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->c0(Lq2/I;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic y1(Lq2/d0;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->Z(Lq2/d0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z1(IILq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lq2/P$d;->W(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private z2(Z)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/exoplayer/Y;->N:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->G:Landroidx/media3/exoplayer/g1;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Landroidx/media3/exoplayer/g1;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    return p1

    .line 19
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 20
    .line 21
    iget v0, v0, Landroidx/media3/exoplayer/K0;->n:I

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    const/4 p1, 0x0

    .line 30
    return p1
.end method


# virtual methods
.method public A(LB2/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 2
    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LB2/b;

    .line 8
    .line 9
    invoke-interface {v0, p1}, LB2/a;->f0(LB2/b;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public B(Landroid/view/Surface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->a3()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    :goto_0
    invoke-direct {p0, p1, p1}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public B0()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->D()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 13
    .line 14
    iget v0, v0, LM2/D$b;->c:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public C(Lq2/I;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->W:Lq2/I;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lq2/I;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->W:Lq2/I;

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 19
    .line 20
    new-instance v0, Landroidx/media3/exoplayer/M;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/M;-><init>(Landroidx/media3/exoplayer/Y;)V

    .line 23
    .line 24
    .line 25
    const/16 v1, 0xf

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Lt2/v;->k(ILt2/v$a;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public D()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 7
    .line 8
    invoke-virtual {v0}, LM2/D$b;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public D0(Ljava/util/List;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->C2(Ljava/util/List;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/media3/exoplayer/Y;->e3(Ljava/util/List;IJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public E()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-wide v0, v0, Landroidx/media3/exoplayer/K0;->r:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public F(ZI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/e1;->A(ZI)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public F0()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/Y;->w:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public F2()Lt2/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->y:Lt2/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public G0()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->G2(Landroidx/media3/exoplayer/K0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public H(Lq2/P$d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 5
    .line 6
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lq2/P$d;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lt2/v;->j(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public H0(ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/Y;->C2(Ljava/util/List;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/Y;->t2(ILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public I0()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->D()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 11
    .line 12
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, LM2/D$b;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 23
    .line 24
    iget-wide v0, v0, Landroidx/media3/exoplayer/K0;->q:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    return-wide v0

    .line 31
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->getDuration()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->R0()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0
.end method

.method public J0()Lq2/I;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->W:Lq2/I;

    .line 5
    .line 6
    return-object v0
.end method

.method public K0()I
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->I2(Landroidx/media3/exoplayer/K0;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    return v0
.end method

.method public K2()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/media3/exoplayer/o0;->Q()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public L(Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->C2(Ljava/util/List;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/Y;->f3(Ljava/util/List;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public L0(Landroid/view/SurfaceView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/Y;->y2(Landroid/view/SurfaceHolder;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public M()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/e1;->r(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public N(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/e1;->w(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public N0(III)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v3, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-gt p1, p2, :cond_0

    .line 8
    .line 9
    if-ltz p3, :cond_0

    .line 10
    .line 11
    move v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v4, 0x0

    .line 14
    :goto_0
    invoke-static {v4}, Lt2/a;->a(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    sub-int v1, v7, p1

    .line 28
    .line 29
    sub-int v1, v4, v1

    .line 30
    .line 31
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-ge p1, v4, :cond_2

    .line 36
    .line 37
    if-eq p1, v7, :cond_2

    .line 38
    .line 39
    if-ne p1, v8, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->h0()Lq2/Y;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v2, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 47
    .line 48
    add-int/2addr v2, v3

    .line 49
    iput v2, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 50
    .line 51
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v2, p1, v7, v8}, Lt2/a0;->U0(Ljava/util/List;III)V

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 57
    .line 58
    invoke-interface {v2, p1, v7, v8}, LM2/e0;->h(III)LM2/e0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iput-object v2, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 63
    .line 64
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->B2()Lq2/Y;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v9, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 69
    .line 70
    invoke-direct {p0, v9}, Landroidx/media3/exoplayer/Y;->I2(Landroidx/media3/exoplayer/K0;)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    iget-object v4, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 75
    .line 76
    invoke-direct {p0, v4}, Landroidx/media3/exoplayer/Y;->G2(Landroidx/media3/exoplayer/K0;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    move-object v0, p0

    .line 81
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/Y;->J2(Lq2/Y;Lq2/Y;IJ)Landroid/util/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-direct {p0, v9, v2, v1}, Landroidx/media3/exoplayer/Y;->R2(Landroidx/media3/exoplayer/K0;Lq2/Y;Landroid/util/Pair;)Landroidx/media3/exoplayer/K0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 90
    .line 91
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->R:LM2/e0;

    .line 92
    .line 93
    invoke-virtual {v2, p1, v7, v8, v3}, Landroidx/media3/exoplayer/o0;->E0(IIILM2/e0;)V

    .line 94
    .line 95
    .line 96
    const/4 v7, -0x1

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v2, 0x0

    .line 99
    const/4 v3, 0x0

    .line 100
    const/4 v4, 0x5

    .line 101
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-direct/range {v0 .. v8}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_1
    return-void
.end method

.method public O(Landroid/view/SurfaceView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, LS2/t;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->a3()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->h3(Landroid/view/SurfaceHolder;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v0, p1, LT2/l;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->a3()V

    .line 27
    .line 28
    .line 29
    move-object v0, p1

    .line 30
    check-cast v0, LT2/l;

    .line 31
    .line 32
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->c0:LT2/l;

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->A:Landroidx/media3/exoplayer/Y$d;

    .line 35
    .line 36
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->D2(Landroidx/media3/exoplayer/L0$b;)Landroidx/media3/exoplayer/L0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/16 v1, 0x2710

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/L0;->m(I)Landroidx/media3/exoplayer/L0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->c0:LT2/l;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/L0;->l(Ljava/lang/Object;)Landroidx/media3/exoplayer/L0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroidx/media3/exoplayer/L0;->k()Landroidx/media3/exoplayer/L0;

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->c0:LT2/l;

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, LT2/l;->d(LT2/l$b;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->c0:LT2/l;

    .line 63
    .line 64
    invoke-virtual {v0}, LT2/l;->getVideoSurface()Landroid/view/Surface;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->h3(Landroid/view/SurfaceHolder;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    if-nez p1, :cond_2

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/Y;->k3(Landroid/view/SurfaceHolder;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public P(Lq2/d0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 5
    .line 6
    invoke-virtual {v0}, LP2/G;->h()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->j0()Lq2/d0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-boolean v1, p0, Landroidx/media3/exoplayer/Y;->N:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p1, Lq2/d0;->E:LP9/w;

    .line 22
    .line 23
    iput-object v1, p0, Landroidx/media3/exoplayer/Y;->O:LP9/w;

    .line 24
    .line 25
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->P:LA2/P;

    .line 26
    .line 27
    iget-object v1, v1, LA2/P;->a:LP9/w;

    .line 28
    .line 29
    invoke-static {p1, v1}, Landroidx/media3/exoplayer/Y;->r2(Lq2/d0;LP9/w;)Lq2/d0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, p1

    .line 35
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 36
    .line 37
    invoke-virtual {v2}, LP2/G;->c()Lq2/d0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Lq2/d0;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 48
    .line 49
    invoke-virtual {v2, v1}, LP2/G;->m(Lq2/d0;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0, p1}, Lq2/d0;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 59
    .line 60
    new-instance v1, Landroidx/media3/exoplayer/J;

    .line 61
    .line 62
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/J;-><init>(Lq2/d0;)V

    .line 63
    .line 64
    .line 65
    const/16 p1, 0x13

    .line 66
    .line 67
    invoke-virtual {v0, p1, v1}, Lt2/v;->k(ILt2/v$a;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_1
    return-void
.end method

.method public P0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/e1;->x()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public P2()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/media3/exoplayer/K0;->p:Z

    .line 7
    .line 8
    return v0
.end method

.method public Q(IILjava/util/List;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    if-lt p2, p1, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v0

    .line 13
    :goto_0
    invoke-static {v2}, Lt2/a;->a(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-le p1, v2, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/Y;->w2(IILjava/util/List;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroidx/media3/exoplayer/Y;->n3(IILjava/util/List;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-direct {p0, p3}, Landroidx/media3/exoplayer/Y;->C2(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    iget p1, p0, Landroidx/media3/exoplayer/Y;->x0:I

    .line 52
    .line 53
    const/4 p2, -0x1

    .line 54
    if-ne p1, p2, :cond_3

    .line 55
    .line 56
    move v0, v1

    .line 57
    :cond_3
    invoke-virtual {p0, p3, v0}, Landroidx/media3/exoplayer/Y;->f3(Ljava/util/List;Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 62
    .line 63
    invoke-direct {p0, v0, p2, p3}, Landroidx/media3/exoplayer/Y;->u2(Landroidx/media3/exoplayer/K0;ILjava/util/List;)Landroidx/media3/exoplayer/K0;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-direct {p0, p3, p1, p2}, Landroidx/media3/exoplayer/Y;->Y2(Landroidx/media3/exoplayer/K0;II)Landroidx/media3/exoplayer/K0;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-object p1, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 72
    .line 73
    iget-object p1, p1, LM2/D$b;->a:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object p2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 76
    .line 77
    iget-object p2, p2, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 78
    .line 79
    iget-object p2, p2, LM2/D$b;->a:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    xor-int/lit8 v5, p1, 0x1

    .line 86
    .line 87
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/Y;->H2(Landroidx/media3/exoplayer/K0;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v7

    .line 91
    const/4 v9, -0x1

    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v6, 0x4

    .line 95
    move-object v2, p0

    .line 96
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public Q0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/Y;->J:Z

    .line 5
    .line 6
    return v0
.end method

.method public R0()J
    .locals 5

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 7
    .line 8
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, Landroidx/media3/exoplayer/Y;->z0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 20
    .line 21
    iget-wide v1, v1, LM2/D$b;->d:J

    .line 22
    .line 23
    iget-object v3, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 24
    .line 25
    iget-wide v3, v3, LM2/D$b;->d:J

    .line 26
    .line 27
    cmp-long v1, v1, v3

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->K0()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Lq2/h;->a:Lq2/Y$d;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lq2/Y$d;->e()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    return-wide v0

    .line 48
    :cond_1
    iget-wide v0, v0, Landroidx/media3/exoplayer/K0;->q:J

    .line 49
    .line 50
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 51
    .line 52
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 53
    .line 54
    invoke-virtual {v2}, LM2/D$b;->b()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 61
    .line 62
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 63
    .line 64
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 65
    .line 66
    iget-object v0, v0, LM2/D$b;->a:Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 75
    .line 76
    iget-object v1, v1, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 77
    .line 78
    iget v1, v1, LM2/D$b;->b:I

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lq2/Y$b;->g(I)J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    const-wide/high16 v3, -0x8000000000000000L

    .line 85
    .line 86
    cmp-long v3, v1, v3

    .line 87
    .line 88
    if-nez v3, :cond_2

    .line 89
    .line 90
    iget-wide v0, v0, Lq2/Y$b;->d:J

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    move-wide v0, v1

    .line 94
    :cond_3
    :goto_0
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 95
    .line 96
    iget-object v3, v2, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 97
    .line 98
    iget-object v2, v2, Landroidx/media3/exoplayer/K0;->k:LM2/D$b;

    .line 99
    .line 100
    invoke-direct {p0, v3, v2, v0, v1}, Landroidx/media3/exoplayer/Y;->X2(Lq2/Y;LM2/D$b;J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    return-wide v0
.end method

.method public S(LM2/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/Y;->d3(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public S0(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, p1, v1}, Landroidx/media3/exoplayer/e1;->C(II)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public T(II)V
    .locals 11

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-lt p2, p1, :cond_0

    .line 8
    .line 9
    move v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, Lt2/a;->a(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, v1, :cond_2

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 31
    .line 32
    invoke-direct {p0, v1, p1, p2}, Landroidx/media3/exoplayer/Y;->Y2(Landroidx/media3/exoplayer/K0;II)Landroidx/media3/exoplayer/K0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object p1, v3, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 37
    .line 38
    iget-object p1, p1, LM2/D$b;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 41
    .line 42
    iget-object p2, p2, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 43
    .line 44
    iget-object p2, p2, LM2/D$b;->a:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    xor-int/lit8 v5, p1, 0x1

    .line 51
    .line 52
    invoke-direct {p0, v3}, Landroidx/media3/exoplayer/Y;->H2(Landroidx/media3/exoplayer/K0;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    const/4 v9, -0x1

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v6, 0x4

    .line 60
    move-object v2, p0

    .line 61
    invoke-direct/range {v2 .. v10}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    return-void
.end method

.method public V(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/Y;->o3(ZI)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public V0()Lq2/I;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->V:Lq2/I;

    .line 5
    .line 6
    return-object v0
.end method

.method public W0(Lq2/c;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/Y;->s0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->k0:Lq2/c;

    .line 10
    .line 11
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->k0:Lq2/c;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Lq2/c;->c()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/e1;->B(I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 36
    .line 37
    new-instance v1, Landroidx/media3/exoplayer/O;

    .line 38
    .line 39
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/O;-><init>(Lq2/c;)V

    .line 40
    .line 41
    .line 42
    const/16 p1, 0x14

    .line 43
    .line 44
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->k0:Lq2/c;

    .line 50
    .line 51
    invoke-virtual {p1, v0, p2}, Landroidx/media3/exoplayer/o0;->l1(Lq2/c;Z)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 55
    .line 56
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public X(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/e1;->r(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public X0()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/Y;->v:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public Y()Lq2/h0;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->i:LP2/H;

    .line 7
    .line 8
    iget-object v0, v0, LP2/H;->d:Lq2/h0;

    .line 9
    .line 10
    return-object v0
.end method

.method public a()V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Release "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " ["

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "AndroidXMedia3/1.8.0"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "] ["

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object v2, Lt2/a0;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lq2/H;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "]"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "ExoPlayerImpl"

    .line 62
    .line 63
    invoke-static {v1, v0}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->B:Landroidx/media3/exoplayer/d;

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/d;->d(Z)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/media3/exoplayer/e1;->z()V

    .line 80
    .line 81
    .line 82
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->D:Landroidx/media3/exoplayer/j1;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/j1;->d(Z)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->E:Landroidx/media3/exoplayer/m1;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/m1;->d(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->G:Landroidx/media3/exoplayer/g1;

    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    invoke-interface {v0}, Landroidx/media3/exoplayer/g1;->disable()V

    .line 97
    .line 98
    .line 99
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/media3/exoplayer/o0;->L0()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_2

    .line 106
    .line 107
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 108
    .line 109
    new-instance v1, Landroidx/media3/exoplayer/A;

    .line 110
    .line 111
    invoke-direct {v1}, Landroidx/media3/exoplayer/A;-><init>()V

    .line 112
    .line 113
    .line 114
    const/16 v2, 0xa

    .line 115
    .line 116
    invoke-virtual {v0, v2, v1}, Lt2/v;->k(ILt2/v$a;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 120
    .line 121
    invoke-virtual {v0}, Lt2/v;->i()V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->j:Lt2/s;

    .line 125
    .line 126
    const/4 v1, 0x0

    .line 127
    invoke-interface {v0, v1}, Lt2/s;->f(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->u:LQ2/d;

    .line 131
    .line 132
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 133
    .line 134
    invoke-interface {v0, v2}, LQ2/d;->f(LQ2/d$a;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 138
    .line 139
    iget-boolean v2, v0, Landroidx/media3/exoplayer/K0;->p:Z

    .line 140
    .line 141
    if-eqz v2, :cond_3

    .line 142
    .line 143
    invoke-virtual {v0}, Landroidx/media3/exoplayer/K0;->a()Landroidx/media3/exoplayer/K0;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 148
    .line 149
    :cond_3
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 150
    .line 151
    const/4 v2, 0x1

    .line 152
    invoke-static {v0, v2}, Landroidx/media3/exoplayer/Y;->Q2(Landroidx/media3/exoplayer/K0;I)Landroidx/media3/exoplayer/K0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 157
    .line 158
    iget-object v3, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Landroidx/media3/exoplayer/K0;->c(LM2/D$b;)Landroidx/media3/exoplayer/K0;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 165
    .line 166
    iget-wide v3, v0, Landroidx/media3/exoplayer/K0;->s:J

    .line 167
    .line 168
    iput-wide v3, v0, Landroidx/media3/exoplayer/K0;->q:J

    .line 169
    .line 170
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 171
    .line 172
    const-wide/16 v3, 0x0

    .line 173
    .line 174
    iput-wide v3, v0, Landroidx/media3/exoplayer/K0;->r:J

    .line 175
    .line 176
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 177
    .line 178
    invoke-interface {v0}, LB2/a;->a()V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->a3()V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->a0:Landroid/view/Surface;

    .line 185
    .line 186
    if-eqz v0, :cond_4

    .line 187
    .line 188
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 189
    .line 190
    .line 191
    iput-object v1, p0, Landroidx/media3/exoplayer/Y;->a0:Landroid/view/Surface;

    .line 192
    .line 193
    :cond_4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/Y;->r0:Z

    .line 194
    .line 195
    if-nez v0, :cond_5

    .line 196
    .line 197
    sget-object v0, Ls2/e;->d:Ls2/e;

    .line 198
    .line 199
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->n0:Ls2/e;

    .line 200
    .line 201
    iput-boolean v2, p0, Landroidx/media3/exoplayer/Y;->s0:Z

    .line 202
    .line 203
    return-void

    .line 204
    :cond_5
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    throw v1
.end method

.method public a0(Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 2
    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lq2/P$d;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lt2/v;->c(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b0()Ls2/e;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->n0:Ls2/e;

    .line 5
    .line 6
    return-object v0
.end method

.method public c()Lq2/O;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 7
    .line 8
    return-object v0
.end method

.method public c0()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->D()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 13
    .line 14
    iget v0, v0, LM2/D$b;->b:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public d(LA2/Q;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, LA2/Q;->g:LA2/Q;

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->Q:LA2/Q;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LA2/Q;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->Q:LA2/Q;

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/o0;->E1(LA2/Q;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public d3(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, p1, v0}, Landroidx/media3/exoplayer/Y;->f3(Ljava/util/List;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(Lq2/O;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lq2/O;->d:Lq2/O;

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->o:Lq2/O;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lq2/O;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/K0;->g(Lq2/O;)Landroidx/media3/exoplayer/K0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iput v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/o0;->v1(Lq2/O;)V

    .line 34
    .line 35
    .line 36
    const/4 v8, -0x1

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x5

    .line 41
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    move-object v1, p0

    .line 47
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public e0(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, p1, v1}, Landroidx/media3/exoplayer/e1;->A(ZI)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method protected e1(IJIZ)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 p4, -0x1

    .line 5
    if-ne p1, p4, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 p4, 0x1

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    move v0, p4

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 18
    .line 19
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 20
    .line 21
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Lq2/Y;->t()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lt p1, v1, :cond_2

    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    :cond_2
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 35
    .line 36
    invoke-interface {v1}, LB2/a;->L()V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 40
    .line 41
    add-int/2addr v1, p4

    .line 42
    iput v1, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->D()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    const-string p1, "ExoPlayerImpl"

    .line 51
    .line 52
    const-string p2, "seekTo ignored because an ad is playing"

    .line 53
    .line 54
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Landroidx/media3/exoplayer/o0$e;

    .line 58
    .line 59
    iget-object p2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 60
    .line 61
    invoke-direct {p1, p2}, Landroidx/media3/exoplayer/o0$e;-><init>(Landroidx/media3/exoplayer/K0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p4}, Landroidx/media3/exoplayer/o0$e;->b(I)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Landroidx/media3/exoplayer/Y;->k:Landroidx/media3/exoplayer/o0$f;

    .line 68
    .line 69
    invoke-interface {p2, p1}, Landroidx/media3/exoplayer/o0$f;->a(Landroidx/media3/exoplayer/o0$e;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iget-object p4, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 74
    .line 75
    iget v1, p4, Landroidx/media3/exoplayer/K0;->e:I

    .line 76
    .line 77
    const/4 v2, 0x3

    .line 78
    if-eq v1, v2, :cond_4

    .line 79
    .line 80
    const/4 v2, 0x4

    .line 81
    if-ne v1, v2, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_5

    .line 88
    .line 89
    :cond_4
    iget-object p4, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    invoke-static {p4, v1}, Landroidx/media3/exoplayer/Y;->Q2(Landroidx/media3/exoplayer/K0;I)Landroidx/media3/exoplayer/K0;

    .line 93
    .line 94
    .line 95
    move-result-object p4

    .line 96
    :cond_5
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->K0()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    invoke-direct {p0, v0, p1, p2, p3}, Landroidx/media3/exoplayer/Y;->S2(Lq2/Y;IJ)Landroid/util/Pair;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {p0, p4, v0, v1}, Landroidx/media3/exoplayer/Y;->R2(Landroidx/media3/exoplayer/K0;Lq2/Y;Landroid/util/Pair;)Landroidx/media3/exoplayer/K0;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object p4, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 109
    .line 110
    invoke-static {p2, p3}, Lt2/a0;->V0(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide p2

    .line 114
    invoke-virtual {p4, v0, p1, p2, p3}, Landroidx/media3/exoplayer/o0;->c1(Lq2/Y;IJ)V

    .line 115
    .line 116
    .line 117
    const/4 v5, 0x1

    .line 118
    invoke-direct {p0, v2}, Landroidx/media3/exoplayer/Y;->H2(Landroidx/media3/exoplayer/K0;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v6

    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x1

    .line 124
    move-object v1, p0

    .line 125
    move v9, p5

    .line 126
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public e3(Ljava/util/List;IJ)V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v5, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move v2, p2

    .line 8
    move-wide v3, p3

    .line 9
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/Y;->g3(Ljava/util/List;IJZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public f()Lt2/K;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->h0:Lt2/K;

    .line 5
    .line 6
    return-object v0
.end method

.method public f3(Ljava/util/List;Z)V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move v5, p2

    .line 13
    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/Y;->g3(Ljava/util/List;IJZ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public g0()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget v0, v0, Landroidx/media3/exoplayer/K0;->n:I

    .line 7
    .line 8
    return v0
.end method

.method public getCurrentPosition()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->H2(Landroidx/media3/exoplayer/K0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public getDeviceInfo()Lq2/p;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->t0:Lq2/p;

    .line 5
    .line 6
    return-object v0
.end method

.method public getDuration()J
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->D()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 11
    .line 12
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 15
    .line 16
    iget-object v2, v1, LM2/D$b;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Lq2/Y;->l(Ljava/lang/Object;Lq2/Y$b;)Lq2/Y$b;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->o:Lq2/Y$b;

    .line 24
    .line 25
    iget v2, v1, LM2/D$b;->b:I

    .line 26
    .line 27
    iget v1, v1, LM2/D$b;->c:I

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lq2/Y$b;->c(II)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {v0, v1}, Lt2/a0;->F1(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_0
    invoke-virtual {p0}, Lq2/h;->t0()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0
.end method

.method public h0()Lq2/Y;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 7
    .line 8
    return-object v0
.end method

.method public i0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/e1;->w(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public isScrubbingModeEnabled()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/Y;->N:Z

    .line 5
    .line 6
    return v0
.end method

.method public j()Lq2/x;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->X:Lq2/x;

    .line 5
    .line 6
    return-object v0
.end method

.method public j0()Lq2/d0;
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 5
    .line 6
    invoke-virtual {v0}, LP2/G;->c()Lq2/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-boolean v1, p0, Landroidx/media3/exoplayer/Y;->N:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lq2/d0;->I()Lq2/d0$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->O:LP9/w;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lq2/d0$c;->N(Ljava/util/Set;)Lq2/d0$c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lq2/d0$c;->G()Lq2/d0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    return-object v0
.end method

.method public k3(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->x2()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->a3()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Landroidx/media3/exoplayer/Y;->d0:Z

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->b0:Landroid/view/SurfaceHolder;

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    const/4 p1, 0x0

    .line 55
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-direct {p0, p1, p1}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public l0(Landroid/view/TextureView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->x2()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->a3()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->e0:Landroid/view/TextureView;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "ExoPlayerImpl"

    .line 22
    .line 23
    const-string v1, "Replacing existing SurfaceTextureListener."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->z:Landroidx/media3/exoplayer/Y$c;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v0, v1

    .line 46
    :goto_0
    if-nez v0, :cond_3

    .line 47
    .line 48
    invoke-direct {p0, v1}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-direct {p0, p1, p1}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->i3(Landroid/graphics/SurfaceTexture;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public m()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->t:Landroid/os/Looper;

    .line 2
    .line 3
    return-object v0
.end method

.method public m0()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/media3/exoplayer/e1;->v()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public n(LA2/P;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->P:LA2/P;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LA2/P;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->P:LA2/P;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/media3/exoplayer/Y;->P:LA2/P;

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroidx/media3/exoplayer/o0;->C1(LA2/P;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/media3/exoplayer/Y;->N:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 27
    .line 28
    invoke-virtual {v1}, LP2/G;->h()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, LA2/P;->a:LP9/w;

    .line 35
    .line 36
    iget-object v1, p1, LA2/P;->a:LP9/w;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, LP9/w;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->j0()Lq2/d0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p1, p1, LA2/P;->a:LP9/w;

    .line 49
    .line 50
    invoke-static {v0, p1}, Landroidx/media3/exoplayer/Y;->r2(Lq2/d0;LP9/w;)Lq2/d0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 55
    .line 56
    invoke-virtual {v0}, LP2/G;->c()Lq2/d0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1, v0}, Lq2/d0;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, LP2/G;->m(Lq2/d0;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_0
    return-void
.end method

.method public o(LB2/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->s:LB2/a;

    .line 5
    .line 6
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, LB2/b;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LB2/a;->Q(LB2/b;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public p()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget v0, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 7
    .line 8
    return v0
.end method

.method public p0()Lq2/P$b;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->U:Lq2/P$b;

    .line 5
    .line 6
    return-object v0
.end method

.method public q()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/media3/exoplayer/K0;->g:Z

    .line 7
    .line 8
    return v0
.end method

.method public q0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/media3/exoplayer/K0;->l:Z

    .line 7
    .line 8
    return v0
.end method

.method public q2(Landroidx/media3/exoplayer/ExoPlayer$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r0(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/Y;->J:Z

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-boolean p1, p0, Landroidx/media3/exoplayer/Y;->J:Z

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/o0;->G1(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 16
    .line 17
    new-instance v1, Landroidx/media3/exoplayer/C;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/C;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x9

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->m3()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 31
    .line 32
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public s()V
    .locals 12

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget v1, v0, Landroidx/media3/exoplayer/K0;->e:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/K0;->f(Landroidx/media3/exoplayer/s;)Landroidx/media3/exoplayer/K0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 18
    .line 19
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    :goto_0
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/Y;->Q2(Landroidx/media3/exoplayer/K0;I)Landroidx/media3/exoplayer/K0;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 33
    .line 34
    add-int/2addr v0, v2

    .line 35
    iput v0, p0, Landroidx/media3/exoplayer/Y;->K:I

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/media3/exoplayer/o0;->J0()V

    .line 40
    .line 41
    .line 42
    const/4 v10, -0x1

    .line 43
    const/4 v11, 0x0

    .line 44
    const/4 v5, 0x1

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x5

    .line 47
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    move-object v3, p0

    .line 53
    invoke-direct/range {v3 .. v11}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public s0()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/exoplayer/Y;->x:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/16 v1, 0xf

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, p1}, Landroidx/media3/exoplayer/Y;->b3(IILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setScrubbingModeEnabled(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/media3/exoplayer/Y;->N:Z

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean p1, p0, Landroidx/media3/exoplayer/Y;->N:Z

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->P:LA2/P;

    .line 12
    .line 13
    iget-object v0, v0, LA2/P;->a:LP9/w;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 22
    .line 23
    invoke-virtual {v0}, LP2/G;->h()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 30
    .line 31
    invoke-virtual {v0}, LP2/G;->c()Lq2/d0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object v1, v0, Lq2/d0;->E:LP9/w;

    .line 38
    .line 39
    iput-object v1, p0, Landroidx/media3/exoplayer/Y;->O:LP9/w;

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/media3/exoplayer/Y;->P:LA2/P;

    .line 42
    .line 43
    iget-object v1, v1, LA2/P;->a:LP9/w;

    .line 44
    .line 45
    invoke-static {v0, v1}, Landroidx/media3/exoplayer/Y;->r2(Lq2/d0;LP9/w;)Lq2/d0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0}, Lq2/d0;->I()Lq2/d0$c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->O:LP9/w;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lq2/d0$c;->N(Ljava/util/Set;)Lq2/d0$c;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lq2/d0$c;->G()Lq2/d0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/4 v2, 0x0

    .line 65
    iput-object v2, p0, Landroidx/media3/exoplayer/Y;->O:LP9/w;

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v1, v0}, Lq2/d0;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_2

    .line 72
    .line 73
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->i:LP2/G;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, LP2/G;->m(Lq2/d0;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/o0;->A1(Z)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->U2()V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public stop()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->l3(Landroidx/media3/exoplayer/s;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ls2/e;

    .line 9
    .line 10
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 15
    .line 16
    iget-wide v2, v2, Landroidx/media3/exoplayer/K0;->s:J

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3}, Ls2/e;-><init>(Ljava/util/List;J)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/media3/exoplayer/Y;->n0:Ls2/e;

    .line 22
    .line 23
    return-void
.end method

.method public t2(ILjava/util/List;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    move v2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    :goto_0
    invoke-static {v2}, Lt2/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v2, p0, Landroidx/media3/exoplayer/Y;->p:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget p1, p0, Landroidx/media3/exoplayer/Y;->x0:I

    .line 33
    .line 34
    const/4 v2, -0x1

    .line 35
    if-ne p1, v2, :cond_1

    .line 36
    .line 37
    move v0, v1

    .line 38
    :cond_1
    invoke-virtual {p0, p2, v0}, Landroidx/media3/exoplayer/Y;->f3(Ljava/util/List;Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 43
    .line 44
    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/Y;->u2(Landroidx/media3/exoplayer/K0;ILjava/util/List;)Landroidx/media3/exoplayer/K0;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const/4 v8, -0x1

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x5

    .line 53
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    move-object v1, p0

    .line 59
    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/Y;->p3(Landroidx/media3/exoplayer/K0;IZIJIZ)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public u0()I
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 7
    .line 8
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v0, p0, Landroidx/media3/exoplayer/Y;->y0:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/media3/exoplayer/K0;->a:Lq2/Y;

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->b:LM2/D$b;

    .line 22
    .line 23
    iget-object v0, v0, LM2/D$b;->a:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lq2/Y;->f(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public v(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/Y;->I:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Landroidx/media3/exoplayer/Y;->I:I

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/o0;->y1(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 16
    .line 17
    new-instance v1, Landroidx/media3/exoplayer/B;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/B;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, Lt2/v;->h(ILt2/v$a;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->m3()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 31
    .line 32
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public v0(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->e0:Landroid/view/TextureView;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->x2()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public w(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lt2/a0;->q(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Landroidx/media3/exoplayer/Y;->l0:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, Landroidx/media3/exoplayer/Y;->l0:F

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->l:Landroidx/media3/exoplayer/o0;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/o0;->N1(F)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->m:Lt2/v;

    .line 26
    .line 27
    new-instance v1, Landroidx/media3/exoplayer/y;

    .line 28
    .line 29
    invoke-direct {v1, p1}, Landroidx/media3/exoplayer/y;-><init>(F)V

    .line 30
    .line 31
    .line 32
    const/16 p1, 0x16

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Lt2/v;->k(ILt2/v$a;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public w0()Lq2/l0;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->u0:Lq2/l0;

    .line 5
    .line 6
    return-object v0
.end method

.method public x()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/Y;->I:I

    .line 5
    .line 6
    return v0
.end method

.method public x0()F
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/media3/exoplayer/Y;->l0:F

    .line 5
    .line 6
    return v0
.end method

.method public x2()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->a3()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/Y;->j3(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0, v0}, Landroidx/media3/exoplayer/Y;->T2(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public y()Landroidx/media3/exoplayer/s;
    .locals 1

    .line 2
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 3
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->w0:Landroidx/media3/exoplayer/K0;

    iget-object v0, v0, Landroidx/media3/exoplayer/K0;->f:Landroidx/media3/exoplayer/s;

    return-object v0
.end method

.method public bridge synthetic y()Lq2/N;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->y()Landroidx/media3/exoplayer/s;

    move-result-object v0

    return-object v0
.end method

.method public y0()Lq2/c;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->k0:Lq2/c;

    .line 5
    .line 6
    return-object v0
.end method

.method public y2(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->b0:Landroid/view/SurfaceHolder;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/exoplayer/Y;->x2()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public z0(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/media3/exoplayer/Y;->s3()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/exoplayer/Y;->C:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroidx/media3/exoplayer/e1;->C(II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
