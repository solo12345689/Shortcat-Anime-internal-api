.class public final Lof/m;
.super LBe/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lye/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lof/m$a;,
        Lof/m$b;,
        Lof/m$c;
    }
.end annotation


# instance fields
.field private final f:LSe/c;

.field private final g:LUe/a;

.field private final h:Lye/h0;

.field private final i:LXe/b;

.field private final j:Lye/E;

.field private final k:Lye/u;

.field private final l:Lye/f;

.field private final m:Lmf/p;

.field private final n:Z

.field private final o:Ljf/l;

.field private final p:Lof/m$b;

.field private final q:Lye/f0;

.field private final r:Lof/m$c;

.field private final s:Lye/m;

.field private final t:Lpf/j;

.field private final u:Lpf/i;

.field private final v:Lpf/j;

.field private final w:Lpf/i;

.field private final x:Lpf/j;

.field private final y:Lmf/N$a;

.field private final z:Lze/h;


# direct methods
.method public constructor <init>(Lmf/p;LSe/c;LUe/d;LUe/a;Lye/h0;)V
    .locals 9

    .line 1
    const-string v0, "outerContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "classProto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "nameResolver"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "metadataVersion"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "sourceElement"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p2}, LSe/c;->J0()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p3, v1}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, LXe/b;->h()LXe/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {p0, v0, v1}, LBe/a;-><init>(Lpf/n;LXe/f;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lof/m;->f:LSe/c;

    .line 46
    .line 47
    iput-object p4, p0, Lof/m;->g:LUe/a;

    .line 48
    .line 49
    iput-object p5, p0, Lof/m;->h:Lye/h0;

    .line 50
    .line 51
    invoke-virtual {p2}, LSe/c;->J0()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {p3, v0}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lof/m;->i:LXe/b;

    .line 60
    .line 61
    sget-object v0, Lmf/O;->a:Lmf/O;

    .line 62
    .line 63
    sget-object v1, LUe/b;->e:LUe/b$d;

    .line 64
    .line 65
    invoke-virtual {p2}, LSe/c;->I0()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {v1, v2}, LUe/b$d;->d(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, LSe/l;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lmf/O;->b(LSe/l;)Lye/E;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, Lof/m;->j:Lye/E;

    .line 80
    .line 81
    sget-object v1, LUe/b;->d:LUe/b$d;

    .line 82
    .line 83
    invoke-virtual {p2}, LSe/c;->I0()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-virtual {v1, v2}, LUe/b$d;->d(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, LSe/y;

    .line 92
    .line 93
    invoke-static {v0, v1}, Lmf/P;->a(Lmf/O;LSe/y;)Lye/u;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p0, Lof/m;->k:Lye/u;

    .line 98
    .line 99
    sget-object v1, LUe/b;->f:LUe/b$d;

    .line 100
    .line 101
    invoke-virtual {p2}, LSe/c;->I0()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {v1, v2}, LUe/b$d;->d(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, LSe/c$c;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Lmf/O;->a(LSe/c$c;)Lye/f;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p0, Lof/m;->l:Lye/f;

    .line 116
    .line 117
    invoke-virtual {p2}, LSe/c;->l1()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const-string v1, "getTypeParameterList(...)"

    .line 122
    .line 123
    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v5, LUe/h;

    .line 127
    .line 128
    invoke-virtual {p2}, LSe/c;->m1()LSe/u;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "getTypeTable(...)"

    .line 133
    .line 134
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v5, v1}, LUe/h;-><init>(LSe/u;)V

    .line 138
    .line 139
    .line 140
    sget-object v1, LUe/i;->b:LUe/i$a;

    .line 141
    .line 142
    invoke-virtual {p2}, LSe/c;->o1()LSe/x;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v4, "getVersionRequirementTable(...)"

    .line 147
    .line 148
    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, LUe/i$a;->a(LSe/x;)LUe/i;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    move-object v2, p0

    .line 156
    move-object v1, p1

    .line 157
    move-object v4, p3

    .line 158
    move-object v7, p4

    .line 159
    invoke-virtual/range {v1 .. v7}, Lmf/p;->a(Lye/m;Ljava/util/List;LUe/d;LUe/h;LUe/i;LUe/a;)Lmf/p;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iput-object p1, v2, Lof/m;->m:Lmf/p;

    .line 164
    .line 165
    sget-object p3, LUe/b;->m:LUe/b$b;

    .line 166
    .line 167
    invoke-virtual {p2}, LSe/c;->I0()I

    .line 168
    .line 169
    .line 170
    move-result p4

    .line 171
    invoke-virtual {p3, p4}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    const-string p4, "get(...)"

    .line 176
    .line 177
    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result p3

    .line 184
    iput-boolean p3, v2, Lof/m;->n:Z

    .line 185
    .line 186
    sget-object p4, Lye/f;->d:Lye/f;

    .line 187
    .line 188
    if-ne v0, p4, :cond_2

    .line 189
    .line 190
    if-nez p3, :cond_1

    .line 191
    .line 192
    invoke-virtual {p1}, Lmf/p;->c()Lmf/n;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    invoke-virtual {p3}, Lmf/n;->i()Lmf/v;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    invoke-interface {p3}, Lmf/v;->a()Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p3

    .line 210
    if-eqz p3, :cond_0

    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_0
    const/4 p3, 0x0

    .line 214
    goto :goto_1

    .line 215
    :cond_1
    :goto_0
    const/4 p3, 0x1

    .line 216
    :goto_1
    new-instance v3, Ljf/q;

    .line 217
    .line 218
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-direct {v3, v4, p0, p3}, Ljf/q;-><init>(Lpf/n;Lye/e;Z)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_2
    sget-object v3, Ljf/k$b;->b:Ljf/k$b;

    .line 227
    .line 228
    :goto_2
    iput-object v3, v2, Lof/m;->o:Ljf/l;

    .line 229
    .line 230
    new-instance p3, Lof/m$b;

    .line 231
    .line 232
    invoke-direct {p3, p0}, Lof/m$b;-><init>(Lof/m;)V

    .line 233
    .line 234
    .line 235
    iput-object p3, v2, Lof/m;->p:Lof/m$b;

    .line 236
    .line 237
    sget-object p3, Lye/f0;->e:Lye/f0$a;

    .line 238
    .line 239
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {p1}, Lmf/p;->c()Lmf/n;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-virtual {v4}, Lmf/n;->n()Lrf/p;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-interface {v4}, Lrf/p;->d()Lrf/g;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    new-instance v5, Lof/m$f;

    .line 256
    .line 257
    invoke-direct {v5, p0}, Lof/m$f;-><init>(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p3, p0, v3, v4, v5}, Lye/f0$a;->a(Lye/e;Lpf/n;Lrf/g;Lkotlin/jvm/functions/Function1;)Lye/f0;

    .line 261
    .line 262
    .line 263
    move-result-object p3

    .line 264
    iput-object p3, v2, Lof/m;->q:Lye/f0;

    .line 265
    .line 266
    const/4 p3, 0x0

    .line 267
    if-ne v0, p4, :cond_3

    .line 268
    .line 269
    new-instance p4, Lof/m$c;

    .line 270
    .line 271
    invoke-direct {p4, p0}, Lof/m$c;-><init>(Lof/m;)V

    .line 272
    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_3
    move-object p4, p3

    .line 276
    :goto_3
    iput-object p4, v2, Lof/m;->r:Lof/m$c;

    .line 277
    .line 278
    invoke-virtual {v1}, Lmf/p;->e()Lye/m;

    .line 279
    .line 280
    .line 281
    move-result-object p4

    .line 282
    iput-object p4, v2, Lof/m;->s:Lye/m;

    .line 283
    .line 284
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    new-instance v1, Lof/d;

    .line 289
    .line 290
    invoke-direct {v1, p0}, Lof/d;-><init>(Lof/m;)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v0, v1}, Lpf/n;->g(Lie/a;)Lpf/j;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    iput-object v0, v2, Lof/m;->t:Lpf/j;

    .line 298
    .line 299
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    new-instance v1, Lof/e;

    .line 304
    .line 305
    invoke-direct {v1, p0}, Lof/e;-><init>(Lof/m;)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v0, v1}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    iput-object v0, v2, Lof/m;->u:Lpf/i;

    .line 313
    .line 314
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    new-instance v1, Lof/f;

    .line 319
    .line 320
    invoke-direct {v1, p0}, Lof/f;-><init>(Lof/m;)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v0, v1}, Lpf/n;->g(Lie/a;)Lpf/j;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iput-object v0, v2, Lof/m;->v:Lpf/j;

    .line 328
    .line 329
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    new-instance v1, Lof/g;

    .line 334
    .line 335
    invoke-direct {v1, p0}, Lof/g;-><init>(Lof/m;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v0, v1}, Lpf/n;->c(Lie/a;)Lpf/i;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iput-object v0, v2, Lof/m;->w:Lpf/i;

    .line 343
    .line 344
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    new-instance v1, Lof/h;

    .line 349
    .line 350
    invoke-direct {v1, p0}, Lof/h;-><init>(Lof/m;)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v0, v1}, Lpf/n;->g(Lie/a;)Lpf/j;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iput-object v0, v2, Lof/m;->x:Lpf/j;

    .line 358
    .line 359
    new-instance v3, Lmf/N$a;

    .line 360
    .line 361
    invoke-virtual {p1}, Lmf/p;->g()LUe/d;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-virtual {p1}, Lmf/p;->j()LUe/h;

    .line 366
    .line 367
    .line 368
    move-result-object v6

    .line 369
    instance-of v0, p4, Lof/m;

    .line 370
    .line 371
    if-eqz v0, :cond_4

    .line 372
    .line 373
    check-cast p4, Lof/m;

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_4
    move-object p4, p3

    .line 377
    :goto_4
    if-eqz p4, :cond_5

    .line 378
    .line 379
    iget-object p3, p4, Lof/m;->y:Lmf/N$a;

    .line 380
    .line 381
    :cond_5
    move-object v4, p2

    .line 382
    move-object v8, p3

    .line 383
    move-object v7, p5

    .line 384
    invoke-direct/range {v3 .. v8}, Lmf/N$a;-><init>(LSe/c;LUe/d;LUe/h;Lye/h0;Lmf/N$a;)V

    .line 385
    .line 386
    .line 387
    iput-object v3, v2, Lof/m;->y:Lmf/N$a;

    .line 388
    .line 389
    sget-object p2, LUe/b;->c:LUe/b$b;

    .line 390
    .line 391
    invoke-virtual {v4}, LSe/c;->I0()I

    .line 392
    .line 393
    .line 394
    move-result p3

    .line 395
    invoke-virtual {p2, p3}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 396
    .line 397
    .line 398
    move-result-object p2

    .line 399
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 400
    .line 401
    .line 402
    move-result p2

    .line 403
    if-nez p2, :cond_6

    .line 404
    .line 405
    sget-object p1, Lze/h;->k0:Lze/h$a;

    .line 406
    .line 407
    invoke-virtual {p1}, Lze/h$a;->b()Lze/h;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    goto :goto_5

    .line 412
    :cond_6
    new-instance p2, Lof/T;

    .line 413
    .line 414
    invoke-virtual {p1}, Lmf/p;->h()Lpf/n;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    new-instance p3, Lof/i;

    .line 419
    .line 420
    invoke-direct {p3, p0}, Lof/i;-><init>(Lof/m;)V

    .line 421
    .line 422
    .line 423
    invoke-direct {p2, p1, p3}, Lof/T;-><init>(Lpf/n;Lie/a;)V

    .line 424
    .line 425
    .line 426
    move-object p1, p2

    .line 427
    :goto_5
    iput-object p1, v2, Lof/m;->z:Lze/h;

    .line 428
    .line 429
    return-void
.end method

.method public static final synthetic K0(Lof/m;)LXe/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lof/m;->i:LXe/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic L0(Lof/m;)Lof/m$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lof/m;->r:Lof/m$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic M0(Lof/m;)Lof/m$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lof/m;->p:Lof/m$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic N0(Lof/m;LXe/f;)Lqf/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lof/m;->j1(LXe/f;)Lqf/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic O0(Lof/m;)Lye/d;
    .locals 0

    .line 1
    invoke-static {p0}, Lof/m;->l1(Lof/m;)Lye/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic P0(Lof/m;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, Lof/m;->c1(Lof/m;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic Q0(Lof/m;)Lye/e;
    .locals 0

    .line 1
    invoke-static {p0}, Lof/m;->V0(Lof/m;)Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic R0(Lof/m;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, Lof/m;->m1(Lof/m;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic S0(Lof/m;)Lye/r0;
    .locals 0

    .line 1
    invoke-static {p0}, Lof/m;->n1(Lof/m;)Lye/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic T0(Lof/m;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lof/m;->U0(Lof/m;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final U0(Lof/m;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->m:Lmf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/p;->c()Lmf/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lmf/n;->d()Lmf/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lof/m;->y:Lmf/N$a;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Lmf/h;->j(Lmf/N$a;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, LUd/u;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static final V0(Lof/m;)Lye/e;
    .locals 0

    .line 1
    invoke-direct {p0}, Lof/m;->W0()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final W0()Lye/e;
    .locals 4

    .line 1
    iget-object v0, p0, Lof/m;->f:LSe/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LSe/c;->p1()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    iget-object v0, p0, Lof/m;->m:Lmf/p;

    .line 12
    .line 13
    invoke-virtual {v0}, Lmf/p;->g()LUe/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, Lof/m;->f:LSe/c;

    .line 18
    .line 19
    invoke-virtual {v2}, LSe/c;->t0()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v0, v2}, Lmf/L;->b(LUe/d;I)LXe/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p0}, Lof/m;->f1()Lof/m$a;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, LGe/d;->r:LGe/d;

    .line 32
    .line 33
    invoke-virtual {v2, v0, v3}, Lof/m$a;->e(LXe/f;LGe/b;)Lye/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    instance-of v2, v0, Lye/e;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    check-cast v0, Lye/e;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    return-object v1
.end method

.method private final X0()Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-direct {p0}, Lof/m;->Z0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lof/m;->D()Lye/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, LUd/u;->q(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lof/m;->m:Lmf/p;

    .line 18
    .line 19
    invoke-virtual {v1}, Lmf/p;->c()Lmf/n;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lmf/n;->c()LAe/a;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1, p0}, LAe/a;->d(Lye/e;)Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-static {v0, v1}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method

.method private final Y0()Lye/d;
    .locals 5

    .line 1
    iget-object v0, p0, Lof/m;->l:Lye/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lye/f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lye/h0;->a:Lye/h0;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lbf/h;->l(Lye/e;Lye/h0;)LBe/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, LBe/a;->p()Lqf/d0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, LBe/s;->g1(Lqf/S;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    iget-object v0, p0, Lof/m;->f:LSe/c;

    .line 24
    .line 25
    invoke-virtual {v0}, LSe/c;->y0()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "getConstructorList(...)"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v3, v1

    .line 50
    check-cast v3, LSe/e;

    .line 51
    .line 52
    sget-object v4, LUe/b;->n:LUe/b$b;

    .line 53
    .line 54
    invoke-virtual {v3}, LSe/e;->O()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v4, v3}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v1, v2

    .line 70
    :goto_0
    check-cast v1, LSe/e;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, Lof/m;->m:Lmf/p;

    .line 75
    .line 76
    invoke-virtual {v0}, Lmf/p;->f()Lmf/K;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-virtual {v0, v1, v2}, Lmf/K;->r(LSe/e;Z)Lye/d;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :cond_3
    return-object v2
.end method

.method private final Z0()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, Lof/m;->f:LSe/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LSe/c;->y0()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getConstructorList(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, LSe/e;

    .line 33
    .line 34
    sget-object v4, LUe/b;->n:LUe/b$b;

    .line 35
    .line 36
    invoke-virtual {v3}, LSe/e;->O()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v4, v3}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "get(...)"

    .line 45
    .line 46
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    const/16 v2, 0xa

    .line 62
    .line 63
    invoke-static {v1, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, LSe/e;

    .line 85
    .line 86
    iget-object v3, p0, Lof/m;->m:Lmf/p;

    .line 87
    .line 88
    invoke-virtual {v3}, Lmf/p;->f()Lmf/K;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    invoke-virtual {v3, v2, v4}, Lmf/K;->r(LSe/e;Z)Lye/d;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    return-object v0
.end method

.method private final a1()Ljava/util/Collection;
    .locals 5

    .line 1
    iget-object v0, p0, Lof/m;->j:Lye/E;

    .line 2
    .line 3
    sget-object v1, Lye/E;->c:Lye/E;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lof/m;->f:LSe/c;

    .line 13
    .line 14
    invoke-virtual {v0}, LSe/c;->b1()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/Integer;

    .line 47
    .line 48
    iget-object v3, p0, Lof/m;->m:Lmf/p;

    .line 49
    .line 50
    invoke-virtual {v3}, Lmf/p;->c()Lmf/n;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget-object v4, p0, Lof/m;->m:Lmf/p;

    .line 55
    .line 56
    invoke-virtual {v4}, Lmf/p;->g()LUe/d;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v4, v2}, Lmf/L;->a(LUe/d;I)LXe/b;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v3, v2}, Lmf/n;->b(LXe/b;)Lye/e;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    return-object v1

    .line 82
    :cond_3
    sget-object v0, Lbf/a;->a:Lbf/a;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-virtual {v0, p0, v1}, Lbf/a;->a(Lye/e;Z)Ljava/util/Collection;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0
.end method

.method private final b1()Lye/r0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lof/m;->isInline()Z

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
    invoke-virtual {p0}, Lof/m;->s()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    iget-object v0, p0, Lof/m;->f:LSe/c;

    .line 16
    .line 17
    iget-object v2, p0, Lof/m;->m:Lmf/p;

    .line 18
    .line 19
    invoke-virtual {v2}, Lmf/p;->g()LUe/d;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lof/m;->m:Lmf/p;

    .line 24
    .line 25
    invoke-virtual {v3}, Lmf/p;->j()LUe/h;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v4, Lof/m$d;

    .line 30
    .line 31
    iget-object v5, p0, Lof/m;->m:Lmf/p;

    .line 32
    .line 33
    invoke-virtual {v5}, Lmf/p;->i()Lmf/X;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-direct {v4, v5}, Lof/m$d;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v5, Lof/m$e;

    .line 41
    .line 42
    invoke-direct {v5, p0}, Lof/m$e;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v2, v3, v4, v5}, Lmf/Z;->b(LSe/c;LUe/d;LUe/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lye/r0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_1
    iget-object v0, p0, Lof/m;->g:LUe/a;

    .line 53
    .line 54
    const/4 v2, 0x5

    .line 55
    const/4 v3, 0x1

    .line 56
    invoke-virtual {v0, v3, v2, v3}, LUe/a;->c(III)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Lof/m;->D()Lye/d;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-interface {v0}, Lye/a;->j()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "getValueParameters(...)"

    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lye/t0;

    .line 82
    .line 83
    invoke-interface {v0}, Lye/J;->getName()LXe/f;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "getName(...)"

    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, v0}, Lof/m;->j1(LXe/f;)Lqf/d0;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    new-instance v2, Lye/A;

    .line 99
    .line 100
    invoke-direct {v2, v0, v1}, Lye/A;-><init>(LXe/f;Luf/j;)V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v2, "Value class has no underlying property: "

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v2, "Inline class has no primary constructor: "

    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_4
    return-object v1
.end method

.method private static final c1(Lof/m;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-direct {p0}, Lof/m;->X0()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final f1()Lof/m$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lof/m;->q:Lye/f0;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->m:Lmf/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Lmf/p;->c()Lmf/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lmf/n;->n()Lrf/p;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Lrf/p;->d()Lrf/g;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lye/f0;->c(Lrf/g;)Ljf/k;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lof/m$a;

    .line 22
    .line 23
    return-object v0
.end method

.method private final j1(LXe/f;)Lqf/d0;
    .locals 5

    .line 1
    invoke-direct {p0}, Lof/m;->f1()Lof/m$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LGe/d;->r:LGe/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Lof/m$a;->a(LXe/f;LGe/b;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    move-object v2, v0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    move-object v4, v3

    .line 31
    check-cast v4, Lye/Z;

    .line 32
    .line 33
    invoke-interface {v4}, Lye/a;->O()Lye/c0;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    :goto_1
    move-object v2, v0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const/4 v1, 0x1

    .line 44
    move-object v2, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    if-nez v1, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_2
    check-cast v2, Lye/Z;

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-interface {v2}, Lye/s0;->getType()Lqf/S;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_4
    check-cast v0, Lqf/d0;

    .line 58
    .line 59
    return-object v0
.end method

.method private static final l1(Lof/m;)Lye/d;
    .locals 0

    .line 1
    invoke-direct {p0}, Lof/m;->Y0()Lye/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final m1(Lof/m;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-direct {p0}, Lof/m;->a1()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final n1(Lof/m;)Lye/r0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lof/m;->b1()Lye/r0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public A()Z
    .locals 2

    .line 1
    sget-object v0, LUe/b;->g:LUe/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->f:LSe/c;

    .line 4
    .line 5
    invoke-virtual {v1}, LSe/c;->I0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public D()Lye/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->t:Lpf/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lye/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public I0()Z
    .locals 2

    .line 1
    sget-object v0, LUe/b;->h:LUe/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->f:LSe/c;

    .line 4
    .line 5
    invoke-virtual {v1}, LSe/c;->I0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public V()Lye/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->x:Lpf/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lye/r0;

    .line 8
    .line 9
    return-object v0
.end method

.method public Y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public Z()Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, Lof/m;->f:LSe/c;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->m:Lmf/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Lmf/p;->j()LUe/h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, LUe/g;->b(LSe/c;LUe/h;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {v0, v2}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, LSe/r;

    .line 39
    .line 40
    iget-object v3, p0, Lof/m;->m:Lmf/p;

    .line 41
    .line 42
    invoke-virtual {v3}, Lmf/p;->i()Lmf/X;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3, v2}, Lmf/X;->u(LSe/r;)Lqf/S;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, LBe/N;

    .line 51
    .line 52
    invoke-virtual {p0}, LBe/a;->J0()Lye/c0;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v5, Lkf/b;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct {v5, p0, v2, v6, v6}, Lkf/b;-><init>(Lye/e;Lqf/S;LXe/f;Lkf/g;)V

    .line 60
    .line 61
    .line 62
    sget-object v2, Lze/h;->k0:Lze/h$a;

    .line 63
    .line 64
    invoke-virtual {v2}, Lze/h$a;->b()Lze/h;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v3, v4, v5, v2}, LBe/N;-><init>(Lye/m;Lkf/g;Lze/h;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    return-object v1
.end method

.method public b()Lye/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->s:Lye/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public c0()Z
    .locals 2

    .line 1
    sget-object v0, LUe/b;->f:LUe/b$d;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->f:LSe/c;

    .line 4
    .line 5
    invoke-virtual {v1}, LSe/c;->I0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, LUe/b$d;->d(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, LSe/c$c;->h:LSe/c$c;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final d1()Lmf/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->m:Lmf/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e1()LSe/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->f:LSe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public g0()Z
    .locals 2

    .line 1
    sget-object v0, LUe/b;->l:LUe/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->f:LSe/c;

    .line 4
    .line 5
    invoke-virtual {v1}, LSe/c;->I0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public final g1()LUe/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->g:LUe/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAnnotations()Lze/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->z:Lze/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVisibility()Lye/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->k:Lye/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Lye/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->l:Lye/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public h1()Ljf/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->o:Ljf/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->u:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i1()Lmf/N$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->y:Lmf/N$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public isExternal()Z
    .locals 2

    .line 1
    sget-object v0, LUe/b;->i:LUe/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->f:LSe/c;

    .line 4
    .line 5
    invoke-virtual {v1}, LSe/c;->I0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public isInline()Z
    .locals 3

    .line 1
    sget-object v0, LUe/b;->k:LUe/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->f:LSe/c;

    .line 4
    .line 5
    invoke-virtual {v1}, LSe/c;->I0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lof/m;->g:LUe/a;

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v2, v1, v2}, LUe/a;->e(III)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method protected j0(Lrf/g;)Ljf/k;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lof/m;->q:Lye/f0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lye/f0;->c(Lrf/g;)Ljf/k;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public k()Lye/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->h:Lye/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k1(LXe/f;)Z
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lof/m;->f1()Lof/m$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lof/w;->t()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
.end method

.method public l()Lqf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->p:Lof/m$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public m0()Z
    .locals 2

    .line 1
    sget-object v0, LUe/b;->j:LUe/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->f:LSe/c;

    .line 4
    .line 5
    invoke-virtual {v1}, LSe/c;->I0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "get(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
.end method

.method public bridge synthetic o0()Ljf/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lof/m;->h1()Ljf/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public p0()Lye/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->v:Lpf/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lye/e;

    .line 8
    .line 9
    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->m:Lmf/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmf/p;->i()Lmf/X;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lmf/X;->m()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public r()Lye/E;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->j:Lye/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Z
    .locals 4

    .line 1
    sget-object v0, LUe/b;->k:LUe/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Lof/m;->f:LSe/c;

    .line 4
    .line 5
    invoke-virtual {v1}, LSe/c;->I0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, LUe/b$b;->f(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lof/m;->g:LUe/a;

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    const/4 v2, 0x2

    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-virtual {v0, v3, v1, v2}, LUe/a;->c(III)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return v3

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "deserialized "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lof/m;->m0()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v1, "expect "

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v1, ""

    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "class "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LBe/a;->getName()LXe/f;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
.end method

.method public z()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/m;->w:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    return-object v0
.end method
