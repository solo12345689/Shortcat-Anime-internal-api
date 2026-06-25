.class public abstract Lexpo/modules/video/player/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/video/player/a$a;,
        Lexpo/modules/video/player/a$b;,
        Lexpo/modules/video/player/a$c;,
        Lexpo/modules/video/player/a$d;,
        Lexpo/modules/video/player/a$e;,
        Lexpo/modules/video/player/a$f;,
        Lexpo/modules/video/player/a$g;,
        Lexpo/modules/video/player/a$h;,
        Lexpo/modules/video/player/a$i;,
        Lexpo/modules/video/player/a$j;,
        Lexpo/modules/video/player/a$k;,
        Lexpo/modules/video/player/a$l;,
        Lexpo/modules/video/player/a$m;,
        Lexpo/modules/video/player/a$n;,
        Lexpo/modules/video/player/a$o;,
        Lexpo/modules/video/player/a$p;,
        Lexpo/modules/video/player/a$q;,
        Lexpo/modules/video/player/a$r;,
        Lexpo/modules/video/player/a$s;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lexpo/modules/video/records/VideoEventPayload;

.field private final c:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lexpo/modules/video/player/a;->a:Ljava/lang/String;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lexpo/modules/video/player/a;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/video/player/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lexpo/modules/video/player/VideoPlayer;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "player"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listeners"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p0, Lexpo/modules/video/player/a$k;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_e

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, LHd/b;

    .line 30
    .line 31
    move-object v1, p0

    .line 32
    check-cast v1, Lexpo/modules/video/player/a$k;

    .line 33
    .line 34
    invoke-virtual {v1}, Lexpo/modules/video/player/a$k;->h()Lexpo/modules/video/enums/PlayerStatus;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1}, Lexpo/modules/video/player/a$k;->g()Lexpo/modules/video/enums/PlayerStatus;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v1}, Lexpo/modules/video/player/a$k;->e()Lexpo/modules/video/records/PlaybackError;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v0, p1, v2, v3, v1}, LHd/b;->onStatusChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    instance-of v0, p0, Lexpo/modules/video/player/a$e;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_e

    .line 63
    .line 64
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, LHd/b;

    .line 69
    .line 70
    move-object v1, p0

    .line 71
    check-cast v1, Lexpo/modules/video/player/a$e;

    .line 72
    .line 73
    invoke-virtual {v1}, Lexpo/modules/video/player/a$e;->g()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {v1}, Lexpo/modules/video/player/a$e;->f()Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v0, p1, v2, v1}, LHd/b;->onIsPlayingChanged(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    instance-of v0, p0, Lexpo/modules/video/player/a$s;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_e

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, LHd/b;

    .line 104
    .line 105
    move-object v1, p0

    .line 106
    check-cast v1, Lexpo/modules/video/player/a$s;

    .line 107
    .line 108
    invoke-virtual {v1}, Lexpo/modules/video/player/a$s;->g()F

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-virtual {v1}, Lexpo/modules/video/player/a$s;->f()Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {v0, p1, v2, v1}, LHd/b;->onVolumeChanged(Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_2
    instance-of v0, p0, Lexpo/modules/video/player/a$j;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_e

    .line 133
    .line 134
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, LHd/b;

    .line 139
    .line 140
    move-object v1, p0

    .line 141
    check-cast v1, Lexpo/modules/video/player/a$j;

    .line 142
    .line 143
    invoke-virtual {v1}, Lexpo/modules/video/player/a$j;->g()Lexpo/modules/video/records/VideoSource;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v1}, Lexpo/modules/video/player/a$j;->f()Lexpo/modules/video/records/VideoSource;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-interface {v0, p1, v2, v1}, LHd/b;->onSourceChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_3
    instance-of v0, p0, Lexpo/modules/video/player/a$g;

    .line 156
    .line 157
    if-eqz v0, :cond_4

    .line 158
    .line 159
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_e

    .line 168
    .line 169
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, LHd/b;

    .line 174
    .line 175
    move-object v1, p0

    .line 176
    check-cast v1, Lexpo/modules/video/player/a$g;

    .line 177
    .line 178
    invoke-virtual {v1}, Lexpo/modules/video/player/a$g;->g()F

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    invoke-virtual {v1}, Lexpo/modules/video/player/a$g;->f()Ljava/lang/Float;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-interface {v0, p1, v2, v1}, LHd/b;->onPlaybackRateChanged(Lexpo/modules/video/player/VideoPlayer;FLjava/lang/Float;)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_4
    instance-of v0, p0, Lexpo/modules/video/player/a$p;

    .line 191
    .line 192
    if-eqz v0, :cond_5

    .line 193
    .line 194
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_e

    .line 203
    .line 204
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, LHd/b;

    .line 209
    .line 210
    move-object v1, p0

    .line 211
    check-cast v1, Lexpo/modules/video/player/a$p;

    .line 212
    .line 213
    invoke-virtual {v1}, Lexpo/modules/video/player/a$p;->e()Lq2/h0;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-interface {v0, p1, v1}, LHd/b;->onTracksChanged(Lexpo/modules/video/player/VideoPlayer;Lq2/h0;)V

    .line 218
    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_5
    instance-of v0, p0, Lexpo/modules/video/player/a$o;

    .line 222
    .line 223
    if-eqz v0, :cond_6

    .line 224
    .line 225
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_e

    .line 234
    .line 235
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, LHd/b;

    .line 240
    .line 241
    move-object v1, p0

    .line 242
    check-cast v1, Lexpo/modules/video/player/a$o;

    .line 243
    .line 244
    invoke-virtual {v1}, Lexpo/modules/video/player/a$o;->e()Lq2/d0;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-interface {v0, p1, v1}, LHd/b;->onTrackSelectionParametersChanged(Lexpo/modules/video/player/VideoPlayer;Lq2/d0;)V

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_6
    instance-of v0, p0, Lexpo/modules/video/player/a$n;

    .line 253
    .line 254
    if-eqz v0, :cond_7

    .line 255
    .line 256
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_e

    .line 265
    .line 266
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v0, LHd/b;

    .line 271
    .line 272
    move-object v1, p0

    .line 273
    check-cast v1, Lexpo/modules/video/player/a$n;

    .line 274
    .line 275
    invoke-virtual {v1}, Lexpo/modules/video/player/a$n;->f()Lexpo/modules/video/records/TimeUpdate;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-interface {v0, p1, v1}, LHd/b;->onTimeUpdate(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/TimeUpdate;)V

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_7
    instance-of v0, p0, Lexpo/modules/video/player/a$h;

    .line 284
    .line 285
    if-eqz v0, :cond_8

    .line 286
    .line 287
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_e

    .line 296
    .line 297
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    check-cast v0, LHd/b;

    .line 302
    .line 303
    invoke-interface {v0, p1}, LHd/b;->onPlayedToEnd(Lexpo/modules/video/player/VideoPlayer;)V

    .line 304
    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_8
    instance-of v0, p0, Lexpo/modules/video/player/a$f;

    .line 308
    .line 309
    if-eqz v0, :cond_9

    .line 310
    .line 311
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    :goto_9
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_e

    .line 320
    .line 321
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, LHd/b;

    .line 326
    .line 327
    move-object v1, p0

    .line 328
    check-cast v1, Lexpo/modules/video/player/a$f;

    .line 329
    .line 330
    invoke-virtual {v1}, Lexpo/modules/video/player/a$f;->f()Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    invoke-virtual {v1}, Lexpo/modules/video/player/a$f;->g()Ljava/lang/Boolean;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-interface {v0, p1, v2, v1}, LHd/b;->onMutedChanged(Lexpo/modules/video/player/VideoPlayer;ZLjava/lang/Boolean;)V

    .line 339
    .line 340
    .line 341
    goto :goto_9

    .line 342
    :cond_9
    instance-of v0, p0, Lexpo/modules/video/player/a$a;

    .line 343
    .line 344
    if-eqz v0, :cond_a

    .line 345
    .line 346
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    :goto_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_e

    .line 355
    .line 356
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, LHd/b;

    .line 361
    .line 362
    move-object v1, p0

    .line 363
    check-cast v1, Lexpo/modules/video/player/a$a;

    .line 364
    .line 365
    invoke-virtual {v1}, Lexpo/modules/video/player/a$a;->e()Lexpo/modules/video/enums/AudioMixingMode;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual {v1}, Lexpo/modules/video/player/a$a;->f()Lexpo/modules/video/enums/AudioMixingMode;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-interface {v0, p1, v2, v1}, LHd/b;->onAudioMixingModeChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V

    .line 374
    .line 375
    .line 376
    goto :goto_a

    .line 377
    :cond_a
    instance-of v0, p0, Lexpo/modules/video/player/a$r;

    .line 378
    .line 379
    if-eqz v0, :cond_b

    .line 380
    .line 381
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    :goto_b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    if-eqz v0, :cond_e

    .line 390
    .line 391
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, LHd/b;

    .line 396
    .line 397
    move-object v1, p0

    .line 398
    check-cast v1, Lexpo/modules/video/player/a$r;

    .line 399
    .line 400
    invoke-virtual {v1}, Lexpo/modules/video/player/a$r;->g()Lexpo/modules/video/records/VideoTrack;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-virtual {v1}, Lexpo/modules/video/player/a$r;->f()Lexpo/modules/video/records/VideoTrack;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-interface {v0, p1, v2, v1}, LHd/b;->onVideoTrackChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V

    .line 409
    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_b
    instance-of v0, p0, Lexpo/modules/video/player/a$i;

    .line 413
    .line 414
    if-eqz v0, :cond_c

    .line 415
    .line 416
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object p2

    .line 420
    :goto_c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-eqz v0, :cond_e

    .line 425
    .line 426
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    check-cast v0, LHd/b;

    .line 431
    .line 432
    invoke-interface {v0, p1}, LHd/b;->onRenderedFirstFrame(Lexpo/modules/video/player/VideoPlayer;)V

    .line 433
    .line 434
    .line 435
    goto :goto_c

    .line 436
    :cond_c
    instance-of v0, p0, Lexpo/modules/video/player/a$q;

    .line 437
    .line 438
    if-eqz v0, :cond_d

    .line 439
    .line 440
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 441
    .line 442
    .line 443
    move-result-object p2

    .line 444
    :goto_d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-eqz v0, :cond_e

    .line 449
    .line 450
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    move-object v1, v0

    .line 455
    check-cast v1, LHd/b;

    .line 456
    .line 457
    move-object v0, p0

    .line 458
    check-cast v0, Lexpo/modules/video/player/a$q;

    .line 459
    .line 460
    invoke-virtual {v0}, Lexpo/modules/video/player/a$q;->j()Lexpo/modules/video/records/VideoSource;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    invoke-virtual {v0}, Lexpo/modules/video/player/a$q;->h()D

    .line 465
    .line 466
    .line 467
    move-result-wide v4

    .line 468
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    invoke-virtual {v0}, Lexpo/modules/video/player/a$q;->g()Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    invoke-virtual {v0}, Lexpo/modules/video/player/a$q;->f()Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v6

    .line 480
    invoke-virtual {v0}, Lexpo/modules/video/player/a$q;->e()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    move-object v2, p1

    .line 485
    invoke-interface/range {v1 .. v7}, LHd/b;->onVideoSourceLoaded(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 486
    .line 487
    .line 488
    goto :goto_d

    .line 489
    :cond_d
    move-object v2, p1

    .line 490
    instance-of p1, p0, Lexpo/modules/video/player/a$m;

    .line 491
    .line 492
    if-eqz p1, :cond_e

    .line 493
    .line 494
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object p1

    .line 498
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result p2

    .line 502
    if-eqz p2, :cond_e

    .line 503
    .line 504
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p2

    .line 508
    check-cast p2, LHd/b;

    .line 509
    .line 510
    move-object v0, p0

    .line 511
    check-cast v0, Lexpo/modules/video/player/a$m;

    .line 512
    .line 513
    invoke-virtual {v0}, Lexpo/modules/video/player/a$m;->e()Lexpo/modules/video/VideoView;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-virtual {v0}, Lexpo/modules/video/player/a$m;->f()Lexpo/modules/video/VideoView;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-interface {p2, v2, v1, v0}, LHd/b;->onTargetViewChanged(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)V

    .line 522
    .line 523
    .line 524
    goto :goto_e

    .line 525
    :cond_e
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/a;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public c()Lexpo/modules/video/records/VideoEventPayload;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a;->b:Lexpo/modules/video/records/VideoEventPayload;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
.end method
