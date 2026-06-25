.class final LE3/I6;
.super LE3/r$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/I6$b;,
        LE3/I6$e;,
        LE3/I6$c;,
        LE3/I6$d;,
        LE3/I6$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:LE3/g;

.field private final c:Ljava/util/Set;

.field private d:LP9/r;

.field private e:I


# direct methods
.method public constructor <init>(LE3/I3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LE3/r$a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    new-instance v0, LE3/g;

    .line 12
    .line 13
    invoke-direct {v0, p1}, LE3/g;-><init>(LE3/I3;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LE3/I6;->b:LE3/g;

    .line 17
    .line 18
    new-instance p1, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, LE3/I6;->c:Ljava/util/Set;

    .line 28
    .line 29
    invoke-static {}, LP9/r;->v()LP9/r;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, LE3/I6;->d:LP9/r;

    .line 34
    .line 35
    return-void
.end method

.method public static synthetic A4(FLE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->w(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private A5(Lq2/d0;)Lq2/d0;
    .locals 5

    .line 1
    iget-object v0, p1, Lq2/d0;->D:LP9/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LP9/v;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1}, Lq2/d0;->I()Lq2/d0$c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lq2/d0$c;->H()Lq2/d0$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object p1, p1, Lq2/d0;->D:LP9/v;

    .line 19
    .line 20
    invoke-virtual {p1}, LP9/v;->p()LP9/s;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, LP9/s;->l()LP9/X;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lq2/b0;

    .line 39
    .line 40
    iget-object v2, v1, Lq2/b0;->a:Lq2/a0;

    .line 41
    .line 42
    iget-object v3, p0, LE3/I6;->d:LP9/r;

    .line 43
    .line 44
    invoke-virtual {v3}, LP9/r;->u()LP9/r;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v2, v2, Lq2/a0;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, LP9/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lq2/a0;

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    iget-object v3, v1, Lq2/b0;->a:Lq2/a0;

    .line 59
    .line 60
    iget v3, v3, Lq2/a0;->a:I

    .line 61
    .line 62
    iget v4, v2, Lq2/a0;->a:I

    .line 63
    .line 64
    if-ne v3, v4, :cond_1

    .line 65
    .line 66
    new-instance v3, Lq2/b0;

    .line 67
    .line 68
    iget-object v1, v1, Lq2/b0;->b:LP9/u;

    .line 69
    .line 70
    invoke-direct {v3, v2, v1}, Lq2/b0;-><init>(Lq2/a0;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Lq2/d0$c;->F(Lq2/b0;)Lq2/d0$c;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v0, v1}, Lq2/d0$c;->F(Lq2/b0;)Lq2/d0$c;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-virtual {v0}, Lq2/d0$c;->G()Lq2/d0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method

.method public static synthetic B4(LE3/I6;LE3/h3$g;LE3/I3;LE3/q;)V
    .locals 18

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/16 v16, 0x0

    .line 11
    .line 12
    :try_start_0
    iget-object v1, v3, LE3/I6;->c:Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v1, v15}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, LE3/I3;->t0()Z

    .line 18
    .line 19
    .line 20
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-static/range {p3 .. p3}, LE3/a7;->a(LE3/q;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    :try_start_1
    invoke-virtual {v15}, LE3/h3$g;->c()LE3/h3$f;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, LE3/I6$a;

    .line 32
    .line 33
    invoke-static {v1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, LE3/I6$a;

    .line 38
    .line 39
    invoke-virtual {v1}, LE3/I6$a;->H()Landroid/os/IBinder;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v15}, LE3/I3;->x0(LE3/h3$g;)LE3/h3$e;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-boolean v4, v2, LE3/h3$e;->a:Z

    .line 48
    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {v15}, LE3/h3$g;->h()Z

    .line 52
    .line 53
    .line 54
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    if-nez v4, :cond_1

    .line 56
    .line 57
    invoke-static/range {p3 .. p3}, LE3/a7;->a(LE3/q;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    move-object/from16 v15, p3

    .line 63
    .line 64
    goto/16 :goto_8

    .line 65
    .line 66
    :cond_1
    :try_start_2
    iget-boolean v4, v2, LE3/h3$e;->a:Z

    .line 67
    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    sget-object v2, LE3/U6;->b:LE3/U6;

    .line 71
    .line 72
    sget-object v4, Lq2/P$b;->b:Lq2/P$b;

    .line 73
    .line 74
    invoke-static {v2, v4}, LE3/h3$e;->a(LE3/U6;Lq2/P$b;)LE3/h3$e;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :cond_2
    iget-object v4, v3, LE3/I6;->b:LE3/g;

    .line 79
    .line 80
    invoke-virtual {v4, v15}, LE3/g;->p(LE3/h3$g;)Z

    .line 81
    .line 82
    .line 83
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    const-string v5, "MediaSessionStub"

    .line 85
    .line 86
    if-eqz v4, :cond_3

    .line 87
    .line 88
    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v6, "Controller "

    .line 94
    .line 95
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v6, " has sent connection request multiple times"

    .line 102
    .line 103
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {v5, v4}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    iget-object v4, v3, LE3/I6;->b:LE3/g;

    .line 114
    .line 115
    iget-object v6, v2, LE3/h3$e;->b:LE3/U6;

    .line 116
    .line 117
    iget-object v7, v2, LE3/h3$e;->c:Lq2/P$b;

    .line 118
    .line 119
    invoke-virtual {v4, v1, v15, v6, v7}, LE3/g;->e(Ljava/lang/Object;LE3/h3$g;LE3/U6;Lq2/P$b;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, v3, LE3/I6;->b:LE3/g;

    .line 123
    .line 124
    invoke-virtual {v1, v15}, LE3/g;->n(LE3/h3$g;)LE3/S6;

    .line 125
    .line 126
    .line 127
    move-result-object v17

    .line 128
    if-nez v17, :cond_4

    .line 129
    .line 130
    const-string v0, "Ignoring connection request from unknown controller info"

    .line 131
    .line 132
    invoke-static {v5, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 133
    .line 134
    .line 135
    invoke-static/range {p3 .. p3}, LE3/a7;->a(LE3/q;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_4
    :try_start_4
    invoke-virtual {v0}, LE3/I3;->j0()LE3/N6;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v0}, LE3/I3;->i0()LE3/M6;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v0}, LE3/I3;->h0()Lq2/N;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    if-nez v5, :cond_5

    .line 152
    .line 153
    iget-object v5, v2, LE3/h3$e;->c:Lq2/P$b;

    .line 154
    .line 155
    :goto_0
    move-object v9, v5

    .line 156
    goto :goto_1

    .line 157
    :cond_5
    iget-object v6, v3, LE3/I6;->b:LE3/g;

    .line 158
    .line 159
    iget-object v7, v2, LE3/h3$e;->c:Lq2/P$b;

    .line 160
    .line 161
    invoke-virtual {v6, v15, v5, v7}, LE3/g;->v(LE3/h3$g;Lq2/N;Lq2/P$b;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v4, v5}, LE3/I3;->Q(LE3/M6;Lq2/N;)LE3/M6;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    iget-object v5, v2, LE3/h3$e;->c:Lq2/P$b;

    .line 169
    .line 170
    invoke-static {v5}, LE3/I3;->P(Lq2/P$b;)Lq2/P$b;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-static {v5}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    check-cast v5, Lq2/P$b;

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :goto_1
    invoke-virtual {v3, v4}, LE3/I6;->d5(LE3/M6;)LE3/M6;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    invoke-virtual {v0}, LE3/I3;->g0()Landroid/media/session/MediaSession$Token;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    new-instance v0, LE3/m;

    .line 190
    .line 191
    iget-object v4, v2, LE3/h3$e;->g:Landroid/app/PendingIntent;

    .line 192
    .line 193
    if-eqz v4, :cond_6

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_6
    invoke-virtual/range {p2 .. p2}, LE3/I3;->k0()Landroid/app/PendingIntent;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    :goto_2
    iget-object v5, v2, LE3/h3$e;->d:LP9/u;

    .line 201
    .line 202
    if-eqz v5, :cond_7

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_7
    invoke-virtual/range {p2 .. p2}, LE3/I3;->b0()LP9/u;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    :goto_3
    iget-object v6, v2, LE3/h3$e;->e:LP9/u;

    .line 210
    .line 211
    if-eqz v6, :cond_8

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_8
    invoke-virtual/range {p2 .. p2}, LE3/I3;->e0()LP9/u;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    :goto_4
    invoke-virtual/range {p2 .. p2}, LE3/I3;->Z()LP9/u;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    iget-object v8, v2, LE3/h3$e;->b:LE3/U6;

    .line 223
    .line 224
    invoke-virtual {v1}, LE3/N6;->p0()Lq2/P$b;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    invoke-virtual/range {p2 .. p2}, LE3/I3;->m0()LE3/Y6;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v1}, LE3/Y6;->c()Landroid/os/Bundle;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    iget-object v1, v2, LE3/h3$e;->f:Landroid/os/Bundle;

    .line 237
    .line 238
    if-eqz v1, :cond_9

    .line 239
    .line 240
    :goto_5
    move-object v12, v1

    .line 241
    goto :goto_6

    .line 242
    :cond_9
    invoke-virtual/range {p2 .. p2}, LE3/I3;->l0()Landroid/os/Bundle;

    .line 243
    .line 244
    .line 245
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 246
    goto :goto_5

    .line 247
    :goto_6
    const v1, 0x3c14dd2c

    .line 248
    .line 249
    .line 250
    const/4 v2, 0x5

    .line 251
    move-object/from16 v15, p3

    .line 252
    .line 253
    :try_start_5
    invoke-direct/range {v0 .. v14}, LE3/m;-><init>(IILE3/r;Landroid/app/PendingIntent;LP9/u;LP9/u;LP9/u;LE3/U6;Lq2/P$b;Lq2/P$b;Landroid/os/Bundle;Landroid/os/Bundle;LE3/M6;Landroid/media/session/MediaSession$Token;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {p2 .. p2}, LE3/I3;->t0()Z

    .line 257
    .line 258
    .line 259
    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 260
    if-eqz v1, :cond_a

    .line 261
    .line 262
    invoke-static {v15}, LE3/a7;->a(LE3/q;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_a
    :try_start_6
    invoke-virtual/range {v17 .. v17}, LE3/S6;->c()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    instance-of v2, v15, LE3/X2;

    .line 271
    .line 272
    if-eqz v2, :cond_b

    .line 273
    .line 274
    invoke-virtual {v0}, LE3/m;->f()Landroid/os/Bundle;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    goto :goto_7

    .line 279
    :catchall_1
    move-exception v0

    .line 280
    goto :goto_8

    .line 281
    :cond_b
    invoke-virtual/range {p1 .. p1}, LE3/h3$g;->e()I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    invoke-virtual {v0, v2}, LE3/m;->e(I)Landroid/os/Bundle;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    :goto_7
    invoke-interface {v15, v1, v0}, LE3/q;->k0(ILandroid/os/Bundle;)V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 290
    .line 291
    .line 292
    const/16 v16, 0x1

    .line 293
    .line 294
    :catch_0
    if-eqz v16, :cond_c

    .line 295
    .line 296
    move-object/from16 v0, p1

    .line 297
    .line 298
    move-object/from16 v1, p2

    .line 299
    .line 300
    :try_start_7
    invoke-virtual {v1, v0}, LE3/I3;->G0(LE3/h3$g;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 301
    .line 302
    .line 303
    :cond_c
    if-nez v16, :cond_d

    .line 304
    .line 305
    invoke-static {v15}, LE3/a7;->a(LE3/q;)V

    .line 306
    .line 307
    .line 308
    :cond_d
    return-void

    .line 309
    :goto_8
    if-nez v16, :cond_e

    .line 310
    .line 311
    invoke-static {v15}, LE3/a7;->a(LE3/q;)V

    .line 312
    .line 313
    .line 314
    :cond_e
    throw v0
.end method

.method public static synthetic C4(Lq2/O;LE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->e(Lq2/O;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic D4(ZLE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->V(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic E4(LE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/N6;->K()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic F4(Lt2/n;LE3/N6;LE3/h3$g;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lt2/n;->accept(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic G3(Lq2/I;LE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->C(Lq2/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic G4(IILE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/N6;->M0(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic H3(LE3/I6;LE3/q;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I6;->b:LE3/g;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, LE3/g;->u(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic H4(JLE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/N6;->z(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I3(FLE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->t(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I4(Ljava/util/List;IJLE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 3

    .line 1
    const/4 p6, -0x1

    .line 2
    if-ne p1, p6, :cond_0

    .line 3
    .line 4
    invoke-virtual {p4}, LE3/I3;->j0()LE3/N6;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, LE3/N6;->K0()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, p1

    .line 14
    :goto_0
    if-ne p1, p6, :cond_1

    .line 15
    .line 16
    invoke-virtual {p4}, LE3/I3;->j0()LE3/N6;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, LE3/N6;->getCurrentPosition()J

    .line 21
    .line 22
    .line 23
    move-result-wide p2

    .line 24
    :cond_1
    move-object p1, p5

    .line 25
    move-wide v1, p2

    .line 26
    move-object p2, p0

    .line 27
    move-object p0, p4

    .line 28
    move p3, v0

    .line 29
    move-wide p4, v1

    .line 30
    invoke-virtual/range {p0 .. p5}, LE3/I3;->H0(LE3/h3$g;Ljava/util/List;IJ)Lcom/google/common/util/concurrent/p;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static synthetic J3(LE3/I6;ILE3/N6;LE3/h3$g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p2, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2, p0}, LE3/N6;->E0(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic J4(Ljava/lang/String;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static synthetic K3(Ljava/lang/String;LE3/Y2;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static synthetic K4(Ljava/lang/String;IILE3/Y2;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static synthetic L3(LE3/I3;LE3/h3$g;LE3/I6$d;LE3/h3$i;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/I3;->X()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE3/E6;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p3}, LE3/E6;-><init>(LE3/I3;LE3/I6$d;LE3/h3$i;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v1}, LE3/I3;->L(LE3/h3$g;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p1, LE3/X6;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, LE3/X6;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p0, p1}, Lt2/a0;->h1(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static synthetic L4(LE3/I6$e;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    new-instance v0, LE3/C6;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, LE3/C6;-><init>(LE3/I3;LE3/h3$g;I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p3, p0, v0}, LE3/I6;->i5(LE3/I3;LE3/h3$g;ILE3/I6$e;Lt2/n;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic M3(LE3/h3$g;ILcom/google/common/util/concurrent/p;)V
    .locals 2

    .line 1
    const-string v0, "MediaSessionStub"

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, LE3/w;

    .line 8
    .line 9
    const-string v1, "LibraryResult must not be null"

    .line 10
    .line 11
    invoke-static {p2, v1}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, LE3/w;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :catch_0
    move-exception p2

    .line 19
    goto :goto_0

    .line 20
    :catch_1
    move-exception p2

    .line 21
    goto :goto_0

    .line 22
    :catch_2
    move-exception p2

    .line 23
    goto :goto_1

    .line 24
    :goto_0
    const-string v1, "Library operation failed"

    .line 25
    .line 26
    invoke-static {v0, v1, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    const/4 p2, -0x1

    .line 30
    invoke-static {p2}, LE3/w;->c(I)LE3/w;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    goto :goto_2

    .line 35
    :goto_1
    const-string v1, "Library operation cancelled"

    .line 36
    .line 37
    invoke-static {v0, v1, p2}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    invoke-static {p2}, LE3/w;->c(I)LE3/w;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :goto_2
    invoke-static {p0, p1, p2}, LE3/I6;->t5(LE3/h3$g;ILE3/w;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static synthetic M4(Lq2/S;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p0}, LE3/I3;->J0(LE3/h3$g;Lq2/S;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic N3(LE3/I6;ILE3/N6;LE3/h3$g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p2, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2, p0}, LE3/N6;->R(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic N4(LE3/N6;LE3/h3$g;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, LE3/N6;->O0(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic O3(ILE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->X(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic O4(LE3/I6;IILE3/N6;LE3/h3$g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p4, p3, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p4, p3, p2}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p3, p1, p0}, LE3/N6;->T(II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic P3(LE3/Y2;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static synthetic P4(LE3/I6;IILE3/N6;LE3/h3$g;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p4, p3, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p4, p3, p2}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p3, p1, p0, p5}, LE3/N6;->Q(IILjava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic Q3(LE3/I3;LE3/I6$d;LE3/h3$i;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/I3;->t0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p1, p0, p2}, LE3/I6$d;->a(LE3/N6;LE3/h3$i;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static synthetic Q4(LE3/T6;Landroid/os/Bundle;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-virtual {p2, p3, p0, p1}, LE3/I3;->y0(LE3/h3$g;LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic R3(ZLE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->e0(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic R4(LE3/I6$e;LE3/I3;LE3/h3$g;I)V
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2, p3}, LE3/I6$e;->a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic S3(Ljava/lang/String;Lq2/S;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-virtual {p2, p3, p0, p1}, LE3/I3;->I0(LE3/h3$g;Ljava/lang/String;Lq2/S;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic S4(Lq2/c;ZLE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lq2/y;->W0(Lq2/c;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic T3(ZILE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/N6;->F(ZI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic T4(LE3/I6$b;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    invoke-virtual {p1}, LE3/I3;->t0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/google/common/util/concurrent/j;->e()Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p1}, LE3/I3;->j0()LE3/N6;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p0, v0, p2}, LE3/I6$b;->a(LE3/N6;LE3/h3$g;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, LE3/X6;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, v0}, LE3/X6;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2, p3, p0}, LE3/I6;->v5(LE3/I3;LE3/h3$g;ILE3/X6;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/google/common/util/concurrent/j;->e()Lcom/google/common/util/concurrent/p;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static synthetic U3(Lq2/C;JLE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-static {p0}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move-wide v0, p1

    .line 6
    move-object p1, p4

    .line 7
    move-wide p4, v0

    .line 8
    move-object p2, p0

    .line 9
    move-object p0, p3

    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-virtual/range {p0 .. p5}, LE3/I3;->H0(LE3/h3$g;Ljava/util/List;IJ)Lcom/google/common/util/concurrent/p;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static synthetic U4(LE3/I6;LE3/h3$g;LE3/N6;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LE3/I3;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, LE3/I3;->t0()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p2, 0x0

    .line 19
    invoke-virtual {p0, p1, p2}, LE3/I3;->p0(LE3/h3$g;Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic V3(LE3/I6$e;LE3/I6$d;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    invoke-virtual {p2}, LE3/I3;->t0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p0, LE3/X6;

    .line 8
    .line 9
    const/16 p1, -0x64

    .line 10
    .line 11
    invoke-direct {p0, p1}, LE3/X6;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-interface {p0, p2, p3, p4}, LE3/I6$e;->a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/common/util/concurrent/p;

    .line 24
    .line 25
    new-instance p4, LE3/w6;

    .line 26
    .line 27
    invoke-direct {p4, p2, p3, p1}, LE3/w6;-><init>(LE3/I3;LE3/h3$g;LE3/I6$d;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p4}, Lt2/a0;->D1(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/d;)Lcom/google/common/util/concurrent/p;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static synthetic V4(LE3/I6;Lq2/d0;LE3/N6;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/I6;->A5(Lq2/d0;)Lq2/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2, p0}, LE3/N6;->P(Lq2/d0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic W3(ILE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->S0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic W4(LE3/I6;ILE3/N6;LE3/h3$g;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p2, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2, p0, p4}, LE3/N6;->H0(ILjava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic X3(Ljava/util/List;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p0}, LE3/I3;->w0(LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic X4(LE3/I3;LE3/I6$c;LE3/h3$g;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/I3;->t0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LE3/I3;->j0()LE3/N6;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p1, p0, p2, p3}, LE3/I6$c;->a(LE3/N6;LE3/h3$g;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static synthetic Y3(ILE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->N(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic Y4(LE3/I3;Lcom/google/common/util/concurrent/w;Lt2/n;Lcom/google/common/util/concurrent/p;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/I3;->t0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/google/common/util/concurrent/w;->F(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_0
    invoke-interface {p2, p3}, Lt2/n;->accept(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/google/common/util/concurrent/w;->F(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    invoke-virtual {p1, p0}, Lcom/google/common/util/concurrent/w;->G(Ljava/lang/Throwable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static synthetic Z3(Lq2/C;ZLE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 6

    .line 1
    invoke-static {p0}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    :goto_0
    move v3, p0

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p2}, LE3/I3;->j0()LE3/N6;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, LE3/N6;->K0()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    if-eqz p1, :cond_1

    .line 20
    .line 21
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    :goto_2
    move-wide v4, p0

    .line 27
    move-object v0, p2

    .line 28
    move-object v1, p3

    .line 29
    goto :goto_3

    .line 30
    :cond_1
    invoke-virtual {p2}, LE3/I3;->j0()LE3/N6;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, LE3/N6;->getCurrentPosition()J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    goto :goto_2

    .line 39
    :goto_3
    invoke-virtual/range {v0 .. v5}, LE3/I3;->H0(LE3/h3$g;Ljava/util/List;IJ)Lcom/google/common/util/concurrent/p;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static synthetic a4(LE3/N6;LE3/h3$g;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, LE3/N6;->O0(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private a5(LE3/q;IILE3/I6$e;)V
    .locals 6

    .line 1
    const/4 v3, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v4, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, LE3/I6;->b5(LE3/q;ILE3/T6;ILE3/I6$e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic b4(Lq2/C;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-static {p0}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p2, p0}, LE3/I3;->w0(LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private b5(LE3/q;ILE3/T6;ILE3/I6$e;)V
    .locals 11

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    :try_start_0
    iget-object v0, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v7, v0

    .line 12
    check-cast v7, LE3/I3;

    .line 13
    .line 14
    if-eqz v7, :cond_2

    .line 15
    .line 16
    invoke-virtual {v7}, LE3/I3;->t0()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 30
    .line 31
    .line 32
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    :try_start_1
    invoke-virtual {v7}, LE3/I3;->X()Landroid/os/Handler;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v3, LE3/n6;

    .line 44
    .line 45
    move-object v4, p0

    .line 46
    move v8, p2

    .line 47
    move-object v6, p3

    .line 48
    move v9, p4

    .line 49
    move-object/from16 v10, p5

    .line 50
    .line 51
    invoke-direct/range {v3 .. v10}, LE3/n6;-><init>(LE3/I6;LE3/h3$g;LE3/T6;LE3/I3;IILE3/I6$e;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v3}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :goto_1
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method

.method public static synthetic c4(LE3/I3;LE3/h3$g;LE3/I6$c;Ljava/util/List;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/I3;->X()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE3/F6;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p1, p3}, LE3/F6;-><init>(LE3/I3;LE3/I6$c;LE3/h3$g;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v1}, LE3/I3;->L(LE3/h3$g;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p1, LE3/X6;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, LE3/X6;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p0, p1}, Lt2/a0;->h1(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method private c5(LE3/q;ILE3/T6;LE3/I6$e;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, LE3/I6;->b5(LE3/q;ILE3/T6;ILE3/I6$e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic d4(LE3/I6;ILE3/N6;LE3/h3$g;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, p3, p2, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lq2/C;

    .line 21
    .line 22
    invoke-virtual {p2, p0, p1}, LE3/N6;->C0(ILq2/C;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-direct {p0, p3, p2, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr p1, v1

    .line 31
    invoke-direct {p0, p3, p2, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p2, v0, p0, p4}, LE3/N6;->Q(IILjava/util/List;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic e(LE3/I6;LE3/h3$g;LE3/T6;LE3/I3;IILE3/I6$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE3/g;->p(LE3/h3$g;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, -0x4

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, LE3/I6;->b:LE3/g;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, LE3/g;->s(LE3/h3$g;LE3/T6;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    new-instance p0, LE3/X6;

    .line 22
    .line 23
    invoke-direct {p0, v0}, LE3/X6;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p3, p1, p4, p0}, LE3/I6;->v5(LE3/I3;LE3/h3$g;ILE3/X6;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object p0, p0, LE3/I6;->b:LE3/g;

    .line 31
    .line 32
    invoke-virtual {p0, p1, p5}, LE3/g;->r(LE3/h3$g;I)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    new-instance p0, LE3/X6;

    .line 39
    .line 40
    invoke-direct {p0, v0}, LE3/X6;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p3, p1, p4, p0}, LE3/I6;->v5(LE3/I3;LE3/h3$g;ILE3/X6;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-interface {p6, p3, p1, p4}, LE3/I6$e;->a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static synthetic e4(LE3/I6$e;LE3/I6$c;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    invoke-virtual {p2}, LE3/I3;->t0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p0, LE3/X6;

    .line 8
    .line 9
    const/16 p1, -0x64

    .line 10
    .line 11
    invoke-direct {p0, p1}, LE3/X6;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-interface {p0, p2, p3, p4}, LE3/I6$e;->a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/google/common/util/concurrent/p;

    .line 24
    .line 25
    new-instance p4, LE3/B6;

    .line 26
    .line 27
    invoke-direct {p4, p2, p3, p1}, LE3/B6;-><init>(LE3/I3;LE3/h3$g;LE3/I6$c;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p4}, Lt2/a0;->D1(Lcom/google/common/util/concurrent/p;Lcom/google/common/util/concurrent/d;)Lcom/google/common/util/concurrent/p;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method private e5(Lq2/a0;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, LE3/I6;->e:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    iput v2, p0, LE3/I6;->e:I

    .line 11
    .line 12
    invoke-static {v1}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "-"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p1, p1, Lq2/a0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public static synthetic f4(Lq2/C;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-static {p0}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p2, p0}, LE3/I3;->w0(LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static synthetic g4(Ljava/util/List;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p0}, LE3/I3;->w0(LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static g5(LE3/I6$e;LE3/I6$c;)LE3/I6$e;
    .locals 1

    .line 1
    new-instance v0, LE3/u6;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LE3/u6;-><init>(LE3/I6$e;LE3/I6$c;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic h(Landroid/view/Surface;LE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->B(Landroid/view/Surface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h4(LE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/N6;->i0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static h5(LE3/I6$e;LE3/I6$d;)LE3/I6$e;
    .locals 1

    .line 1
    new-instance v0, LE3/q6;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LE3/q6;-><init>(LE3/I6$e;LE3/I6$d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic i4(LE3/I6$e;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2, p3}, LE3/I6$e;->a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    return-object p0
.end method

.method private static i5(LE3/I3;LE3/h3$g;ILE3/I6$e;Lt2/n;)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/I3;->t0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/google/common/util/concurrent/j;->e()Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-interface {p3, p0, p1, p2}, LE3/I6$e;->a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 17
    .line 18
    invoke-static {}, Lcom/google/common/util/concurrent/w;->J()Lcom/google/common/util/concurrent/w;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    new-instance p3, LE3/D6;

    .line 23
    .line 24
    invoke-direct {p3, p0, p2, p4, p1}, LE3/D6;-><init>(LE3/I3;Lcom/google/common/util/concurrent/w;Lt2/n;Lcom/google/common/util/concurrent/p;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/google/common/util/concurrent/s;->a()Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p1, p3, p0}, Lcom/google/common/util/concurrent/p;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 32
    .line 33
    .line 34
    return-object p2
.end method

.method public static synthetic j4(LE3/I6$e;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    new-instance v0, LE3/v6;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3}, LE3/v6;-><init>(LE3/h3$g;I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, p3, p0, v0}, LE3/I6;->i5(LE3/I3;LE3/h3$g;ILE3/I6$e;Lt2/n;)Lcom/google/common/util/concurrent/p;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private j5(LE3/h3$g;LE3/N6;I)I
    .locals 2

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-virtual {p2, v0}, LE3/N6;->k(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LE3/I6;->b:LE3/g;

    .line 10
    .line 11
    invoke-virtual {v1, p1, v0}, LE3/g;->q(LE3/h3$g;I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 18
    .line 19
    const/16 v1, 0x10

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, LE3/g;->q(LE3/h3$g;I)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2}, LE3/N6;->K0()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    add-int/2addr p3, p1

    .line 32
    :cond_0
    return p3
.end method

.method public static synthetic k4(Ljava/lang/String;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static synthetic l4(LE3/I6;IJLE3/N6;LE3/h3$g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p5, p4, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p4, p0, p2, p3}, LE3/N6;->o0(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic m4(Ljava/util/List;ZLE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p4, -0x1

    .line 4
    :goto_0
    move v3, p4

    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p2}, LE3/I3;->j0()LE3/N6;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    invoke-virtual {p4}, LE3/N6;->K0()I

    .line 11
    .line 12
    .line 13
    move-result p4

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :goto_2
    move-object v2, p0

    .line 23
    move-wide v4, v0

    .line 24
    move-object v0, p2

    .line 25
    move-object v1, p3

    .line 26
    goto :goto_3

    .line 27
    :cond_1
    invoke-virtual {p2}, LE3/I3;->j0()LE3/N6;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, LE3/N6;->getCurrentPosition()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    goto :goto_2

    .line 36
    :goto_3
    invoke-virtual/range {v0 .. v5}, LE3/I3;->H0(LE3/h3$g;Ljava/util/List;IJ)Lcom/google/common/util/concurrent/p;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method private m5(LE3/q;IILE3/I6$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, LE3/I6;->n5(LE3/h3$g;IILE3/I6$e;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static synthetic n4(LE3/I3;LE3/h3$g;ILcom/google/common/util/concurrent/p;)V
    .locals 2

    .line 1
    const-string v0, "MediaSessionStub"

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    check-cast p3, LE3/X6;

    .line 8
    .line 9
    const-string v1, "SessionResult must not be null"

    .line 10
    .line 11
    invoke-static {p3, v1}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    check-cast p3, LE3/X6;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :catch_0
    move-exception p3

    .line 19
    goto :goto_0

    .line 20
    :catch_1
    move-exception p3

    .line 21
    goto :goto_0

    .line 22
    :catch_2
    move-exception p3

    .line 23
    goto :goto_2

    .line 24
    :goto_0
    const-string v1, "Session operation failed"

    .line 25
    .line 26
    invoke-static {v0, v1, p3}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, LE3/X6;

    .line 30
    .line 31
    invoke-virtual {p3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    instance-of p3, p3, Ljava/lang/UnsupportedOperationException;

    .line 36
    .line 37
    if-eqz p3, :cond_0

    .line 38
    .line 39
    const/4 p3, -0x6

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 p3, -0x1

    .line 42
    :goto_1
    invoke-direct {v0, p3}, LE3/X6;-><init>(I)V

    .line 43
    .line 44
    .line 45
    move-object p3, v0

    .line 46
    goto :goto_3

    .line 47
    :goto_2
    const-string v1, "Session operation cancelled"

    .line 48
    .line 49
    invoke-static {v0, v1, p3}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    new-instance p3, LE3/X6;

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-direct {p3, v0}, LE3/X6;-><init>(I)V

    .line 56
    .line 57
    .line 58
    :goto_3
    invoke-static {p0, p1, p2, p3}, LE3/I6;->v5(LE3/I3;LE3/h3$g;ILE3/X6;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private n5(LE3/h3$g;IILE3/I6$e;)V
    .locals 10

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    :try_start_0
    iget-object v0, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v7, v0

    .line 12
    check-cast v7, LE3/I3;

    .line 13
    .line 14
    if-eqz v7, :cond_1

    .line 15
    .line 16
    invoke-virtual {v7}, LE3/I3;->t0()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v7}, LE3/I3;->X()Landroid/os/Handler;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v3, LE3/o6;

    .line 28
    .line 29
    move-object v4, p0

    .line 30
    move-object v5, p1

    .line 31
    move v8, p2

    .line 32
    move v6, p3

    .line 33
    move-object v9, p4

    .line 34
    invoke-direct/range {v3 .. v9}, LE3/o6;-><init>(LE3/I6;LE3/h3$g;ILE3/I3;ILE3/I6$e;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v3}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_1
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public static synthetic o4(LE3/I6;ILE3/N6;LE3/h3$g;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p2, p1}, LE3/I6;->j5(LE3/h3$g;LE3/N6;I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2, p0, p4}, LE3/N6;->H0(ILjava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic p4(LP9/u;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p0}, LE3/I3;->w0(LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic q4(LE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/N6;->M()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r4(IIILE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p0, p1, p2}, LE3/N6;->N0(III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic s4(Lq2/C;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    invoke-static {p0}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p2, p0}, LE3/I3;->w0(LE3/h3$g;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static synthetic t4(ILE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->v(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static t5(LE3/h3$g;ILE3/w;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, LE3/h3$g;->c()LE3/h3$f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LE3/h3$f;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, LE3/h3$f;->v(ILE3/w;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v0, "Failed to send result to browser "

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p2, "MediaSessionStub"

    .line 34
    .line 35
    invoke-static {p2, p0, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static synthetic u4(ZLE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LE3/N6;->r0(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static u5(LE3/I6$e;)LE3/I6$e;
    .locals 1

    .line 1
    new-instance v0, LE3/s6;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/s6;-><init>(LE3/I6$e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic v4(Ljava/lang/String;LE3/Y2;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method private static v5(LE3/I3;LE3/h3$g;ILE3/X6;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1}, LE3/h3$g;->c()LE3/h3$f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LE3/h3$f;

    .line 10
    .line 11
    invoke-interface {v0, p2, p3}, LE3/h3$f;->l(ILE3/X6;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LE3/I3;->T0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception p0

    .line 19
    new-instance p2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string p3, "Failed to send result to controller "

    .line 25
    .line 26
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, "MediaSessionStub"

    .line 37
    .line 38
    invoke-static {p2, p1, p0}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static synthetic w4(IILE3/N6;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, LE3/N6;->z0(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static w5(LE3/I6$b;)LE3/I6$e;
    .locals 1

    .line 1
    new-instance v0, LE3/m6;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/m6;-><init>(LE3/I6$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic x4(Ljava/lang/String;IILE3/Y2;LE3/Z2;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method private static x5(Lt2/n;)LE3/I6$e;
    .locals 1

    .line 1
    new-instance v0, LE3/r6;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/r6;-><init>(Lt2/n;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LE3/I6;->w5(LE3/I6$b;)LE3/I6$e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic y4(LE3/I6;LE3/h3$g;ILE3/I3;ILE3/I6$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LE3/g;->q(LE3/h3$g;I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p0, LE3/X6;

    .line 10
    .line 11
    const/4 p2, -0x4

    .line 12
    invoke-direct {p0, p2}, LE3/X6;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p1, p4, p0}, LE3/I6;->v5(LE3/I3;LE3/h3$g;ILE3/X6;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p3, p1, p2}, LE3/I3;->E0(LE3/h3$g;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance p0, LE3/X6;

    .line 26
    .line 27
    invoke-direct {p0, v0}, LE3/X6;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p3, p1, p4, p0}, LE3/I6;->v5(LE3/I3;LE3/h3$g;ILE3/X6;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    const/16 v0, 0x1b

    .line 35
    .line 36
    if-ne p2, v0, :cond_2

    .line 37
    .line 38
    new-instance v0, LE3/x6;

    .line 39
    .line 40
    invoke-direct {v0, p5, p3, p1, p4}, LE3/x6;-><init>(LE3/I6$e;LE3/I3;LE3/h3$g;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p1, v0}, LE3/I3;->L(LE3/h3$g;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, LE3/I6;->b:LE3/g;

    .line 51
    .line 52
    new-instance p3, LE3/y6;

    .line 53
    .line 54
    invoke-direct {p3}, LE3/y6;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, p2, p3}, LE3/g;->f(LE3/h3$g;ILE3/g$a;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object p0, p0, LE3/I6;->b:LE3/g;

    .line 62
    .line 63
    new-instance v0, LE3/z6;

    .line 64
    .line 65
    invoke-direct {v0, p5, p3, p1, p4}, LE3/z6;-><init>(LE3/I6$e;LE3/I3;LE3/h3$g;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1, p2, v0}, LE3/g;->f(LE3/h3$g;ILE3/g$a;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method private static y5(LE3/I6$e;)LE3/I6$e;
    .locals 1

    .line 1
    new-instance v0, LE3/t6;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LE3/t6;-><init>(LE3/I6$e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic z4(LE3/I6;LE3/h3$g;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/I6;->b:LE3/g;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LE3/g;->h(LE3/h3$g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A1(LE3/q;ILandroid/os/IBinder;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, LE3/I6;->Q2(LE3/q;ILandroid/os/IBinder;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public B2(LE3/q;IIII)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-ltz p3, :cond_1

    .line 4
    .line 5
    if-lt p4, p3, :cond_1

    .line 6
    .line 7
    if-gez p5, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LE3/G5;

    .line 11
    .line 12
    invoke-direct {v0, p3, p4, p5}, LE3/G5;-><init>(III)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/16 p4, 0x14

    .line 20
    .line 21
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public B3(LE3/q;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/e6;

    .line 5
    .line 6
    invoke-direct {v0}, LE3/e6;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public C2(LE3/q;IIILandroid/os/IBinder;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p5, :cond_1

    .line 4
    .line 5
    if-ltz p3, :cond_1

    .line 6
    .line 7
    if-ge p4, p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    new-instance v0, LE3/u;

    .line 11
    .line 12
    invoke-direct {v0}, LE3/u;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p5}, Lq2/j;->a(Landroid/os/IBinder;)LP9/u;

    .line 16
    .line 17
    .line 18
    move-result-object p5

    .line 19
    invoke-static {v0, p5}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 20
    .line 21
    .line 22
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    new-instance v0, LE3/f5;

    .line 24
    .line 25
    invoke-direct {v0, p5}, LE3/f5;-><init>(LP9/u;)V

    .line 26
    .line 27
    .line 28
    new-instance p5, LE3/g5;

    .line 29
    .line 30
    invoke-direct {p5, p0, p3, p4}, LE3/g5;-><init>(LE3/I6;II)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p5}, LE3/I6;->g5(LE3/I6$e;LE3/I6$c;)LE3/I6$e;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    const/16 p4, 0x14

    .line 42
    .line 43
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception p1

    .line 48
    const-string p2, "MediaSessionStub"

    .line 49
    .line 50
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 51
    .line 52
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_0
    return-void
.end method

.method public E0(LE3/q;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/k6;

    .line 5
    .line 6
    invoke-direct {v0}, LE3/k6;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x14

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public F3(LE3/q;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, LE3/I6;->k5(LE3/h3$g;I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public G2(LE3/q;III)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-ltz p3, :cond_1

    .line 4
    .line 5
    if-ge p4, p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, LE3/b5;

    .line 9
    .line 10
    invoke-direct {v0, p0, p3, p4}, LE3/b5;-><init>(LE3/I6;II)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, LE3/I6;->w5(LE3/I6$b;)LE3/I6$e;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    const/16 p4, 0x14

    .line 18
    .line 19
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public I(LE3/q;II)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, LE3/p6;

    .line 7
    .line 8
    invoke-direct {v0, p0, p3}, LE3/p6;-><init>(LE3/I6;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LE3/I6;->w5(LE3/I6$b;)LE3/I6$e;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    const/16 v0, 0x14

    .line 16
    .line 17
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public I1(LE3/q;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/p5;

    .line 5
    .line 6
    invoke-direct {v0}, LE3/p5;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public J2(LE3/q;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/q5;

    .line 5
    .line 6
    invoke-direct {v0}, LE3/q5;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x1a

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public K0(LE3/q;III)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, LE3/N5;

    .line 7
    .line 8
    invoke-direct {v0, p3, p4}, LE3/N5;-><init>(II)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    const/16 p4, 0x21

    .line 16
    .line 17
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public M1(LE3/q;ILjava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string p1, "MediaSessionStub"

    .line 11
    .line 12
    const-string p2, "unsubscribe(): Ignoring empty parentId"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    new-instance v0, LE3/c5;

    .line 19
    .line 20
    invoke-direct {v0, p3}, LE3/c5;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, LE3/I6;->u5(LE3/I6$e;)LE3/I6$e;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    const v0, 0xc352

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public N(LE3/q;III)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-ltz p3, :cond_1

    .line 4
    .line 5
    if-gez p4, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, LE3/h6;

    .line 9
    .line 10
    invoke-direct {v0, p3, p4}, LE3/h6;-><init>(II)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    const/16 p4, 0x14

    .line 18
    .line 19
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public N0(LE3/q;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    :try_start_0
    iget-object v2, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, LE3/I3;

    .line 15
    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    invoke-virtual {v2}, LE3/I3;->t0()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v3, p0, LE3/I6;->b:LE3/g;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v3, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v2}, LE3/I3;->X()Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v3, LE3/E5;

    .line 42
    .line 43
    invoke-direct {v3, p0, p1}, LE3/E5;-><init>(LE3/I6;LE3/h3$g;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_0
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    :goto_1
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_2
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public N2(LE3/q;IILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_1

    .line 4
    .line 5
    if-gez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p4}, Lq2/C;->b(Landroid/os/Bundle;)Lq2/C;

    .line 9
    .line 10
    .line 11
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    new-instance v0, LE3/n5;

    .line 13
    .line 14
    invoke-direct {v0, p4}, LE3/n5;-><init>(Lq2/C;)V

    .line 15
    .line 16
    .line 17
    new-instance p4, LE3/o5;

    .line 18
    .line 19
    invoke-direct {p4, p0, p3}, LE3/o5;-><init>(LE3/I6;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, p4}, LE3/I6;->g5(LE3/I6$e;LE3/I6$c;)LE3/I6$e;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    const/16 p4, 0x14

    .line 31
    .line 32
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception p1

    .line 37
    const-string p2, "MediaSessionStub"

    .line 38
    .line 39
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 40
    .line 41
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void
.end method

.method public O0(LE3/q;ILandroid/os/Bundle;)V
    .locals 11

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_4

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, LE3/h;->a(Landroid/os/Bundle;)LE3/h;

    .line 7
    .line 8
    .line 9
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget v0, p2, LE3/h;->d:I

    .line 26
    .line 27
    :goto_0
    :try_start_1
    new-instance v4, LF3/q$b;

    .line 28
    .line 29
    iget-object v3, p2, LE3/h;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v4, v3, v0, p3}, LF3/q$b;-><init>(Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    iget-object p3, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    check-cast p3, LE3/I3;

    .line 41
    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    invoke-virtual {p3}, LE3/I3;->a0()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-static {p3}, LF3/q;->a(Landroid/content/Context;)LF3/q;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-virtual {p3, v4}, LF3/q;->b(LF3/q$b;)Z

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    if-eqz p3, :cond_2

    .line 57
    .line 58
    const/4 p3, 0x1

    .line 59
    :goto_1
    move v7, p3

    .line 60
    goto :goto_2

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    goto :goto_3

    .line 64
    :cond_2
    const/4 p3, 0x0

    .line 65
    goto :goto_1

    .line 66
    :goto_2
    new-instance v3, LE3/h3$g;

    .line 67
    .line 68
    iget v5, p2, LE3/h;->a:I

    .line 69
    .line 70
    iget v6, p2, LE3/h;->b:I

    .line 71
    .line 72
    new-instance v8, LE3/I6$a;

    .line 73
    .line 74
    invoke-direct {v8, p1, v6}, LE3/I6$a;-><init>(LE3/q;I)V

    .line 75
    .line 76
    .line 77
    iget-object v9, p2, LE3/h;->e:Landroid/os/Bundle;

    .line 78
    .line 79
    iget v10, p2, LE3/h;->f:I

    .line 80
    .line 81
    invoke-direct/range {v3 .. v10}, LE3/h3$g;-><init>(LF3/q$b;IIZLE3/h3$f;Landroid/os/Bundle;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1, v3}, LE3/I6;->Z4(LE3/q;LE3/h3$g;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :goto_3
    invoke-static {v1, v2}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :catch_0
    move-exception v0

    .line 96
    move-object p1, v0

    .line 97
    const-string p2, "MediaSessionStub"

    .line 98
    .line 99
    const-string p3, "Ignoring malformed Bundle for ConnectionRequest"

    .line 100
    .line 101
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    :goto_4
    return-void
.end method

.method public O1(LE3/q;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, LE3/I6;->s5(LE3/h3$g;I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public P(LE3/q;ILjava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string p1, "MediaSessionStub"

    .line 11
    .line 12
    const-string p2, "getItem(): Ignoring empty mediaId"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    new-instance v0, LE3/J5;

    .line 19
    .line 20
    invoke-direct {v0, p3}, LE3/J5;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, LE3/I6;->u5(LE3/I6$e;)LE3/I6$e;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    const v0, 0xc354

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public Q0(LE3/q;II)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/x5;

    .line 5
    .line 6
    invoke-direct {v0, p3}, LE3/x5;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/16 v0, 0x22

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public Q2(LE3/q;ILandroid/os/IBinder;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, LE3/u;

    .line 7
    .line 8
    invoke-direct {v0}, LE3/u;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p3}, Lq2/j;->a(Landroid/os/IBinder;)LP9/u;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {v0, p3}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 16
    .line 17
    .line 18
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    new-instance v0, LE3/A6;

    .line 20
    .line 21
    invoke-direct {v0, p3, p4}, LE3/A6;-><init>(Ljava/util/List;Z)V

    .line 22
    .line 23
    .line 24
    new-instance p3, LE3/G6;

    .line 25
    .line 26
    invoke-direct {p3}, LE3/G6;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p3}, LE3/I6;->h5(LE3/I6$e;LE3/I6$d;)LE3/I6$e;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    const/16 p4, 0x14

    .line 38
    .line 39
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catch_0
    move-exception p1

    .line 44
    const-string p2, "MediaSessionStub"

    .line 45
    .line 46
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 47
    .line 48
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method

.method public R2(LE3/q;II)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/D5;

    .line 5
    .line 6
    invoke-direct {v0, p3}, LE3/D5;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/16 v0, 0x22

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public S1(LE3/q;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, LE3/I6;->z5(LE3/h3$g;I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public T0(LE3/q;ILjava/lang/String;IILandroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "MediaSessionStub"

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string p1, "getSearchResult(): Ignoring empty query"

    .line 13
    .line 14
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    if-gez p4, :cond_2

    .line 19
    .line 20
    const-string p1, "getSearchResult(): Ignoring negative page"

    .line 21
    .line 22
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    const/4 v0, 0x1

    .line 27
    if-ge p5, v0, :cond_3

    .line 28
    .line 29
    const-string p1, "getSearchResult(): Ignoring pageSize less than 1"

    .line 30
    .line 31
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_3
    if-nez p6, :cond_4

    .line 36
    .line 37
    const/4 p6, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_4
    :try_start_0
    invoke-static {p6}, LE3/Y2;->a(Landroid/os/Bundle;)LE3/Y2;

    .line 40
    .line 41
    .line 42
    move-result-object p6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    new-instance v0, LE3/V5;

    .line 44
    .line 45
    invoke-direct {v0, p3, p4, p5, p6}, LE3/V5;-><init>(Ljava/lang/String;IILE3/Y2;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, LE3/I6;->u5(LE3/I6$e;)LE3/I6$e;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    const p4, 0xc356

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catch_0
    move-exception p1

    .line 60
    const-string p2, "Ignoring malformed Bundle for LibraryParams"

    .line 61
    .line 62
    invoke-static {v1, p2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public T2(LE3/q;IILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_1

    .line 4
    .line 5
    if-gez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p4}, Lq2/C;->b(Landroid/os/Bundle;)Lq2/C;

    .line 9
    .line 10
    .line 11
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    new-instance v0, LE3/r5;

    .line 13
    .line 14
    invoke-direct {v0, p4}, LE3/r5;-><init>(Lq2/C;)V

    .line 15
    .line 16
    .line 17
    new-instance p4, LE3/s5;

    .line 18
    .line 19
    invoke-direct {p4, p0, p3}, LE3/s5;-><init>(LE3/I6;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, p4}, LE3/I6;->g5(LE3/I6$e;LE3/I6$c;)LE3/I6$e;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    const/16 p4, 0x14

    .line 31
    .line 32
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception p1

    .line 37
    const-string p2, "MediaSessionStub"

    .line 38
    .line 39
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 40
    .line 41
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void
.end method

.method public U(LE3/q;IZI)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/c6;

    .line 5
    .line 6
    invoke-direct {v0, p3, p4}, LE3/c6;-><init>(ZI)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/16 p4, 0x22

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public V(LE3/q;II)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x2

    .line 5
    if-eq p3, v0, :cond_1

    .line 6
    .line 7
    if-eqz p3, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p3, v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    new-instance v0, LE3/O5;

    .line 14
    .line 15
    invoke-direct {v0, p3}, LE3/O5;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    const/16 v0, 0xf

    .line 23
    .line 24
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public V1(LE3/q;IZ)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/X5;

    .line 5
    .line 6
    invoke-direct {v0, p3}, LE3/X5;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/16 v0, 0xe

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public V2(LE3/q;I)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    :try_start_0
    iget-object p2, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, LE3/I3;

    .line 15
    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2}, LE3/I3;->t0()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p2}, LE3/I3;->X()Landroid/os/Handler;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    new-instance v2, LE3/e5;

    .line 30
    .line 31
    invoke-direct {v2, p0, p1}, LE3/e5;-><init>(LE3/I6;LE3/q;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2, v2}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :goto_1
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public W(LE3/q;ILandroid/os/IBinder;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, LE3/u;

    .line 7
    .line 8
    invoke-direct {v0}, LE3/u;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p3}, Lq2/j;->a(Landroid/os/IBinder;)LP9/u;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {v0, p3}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 16
    .line 17
    .line 18
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    new-instance v0, LE3/Q5;

    .line 20
    .line 21
    invoke-direct {v0, p3}, LE3/Q5;-><init>(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    new-instance p3, LE3/R5;

    .line 25
    .line 26
    invoke-direct {p3}, LE3/R5;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p3}, LE3/I6;->g5(LE3/I6$e;LE3/I6$c;)LE3/I6$e;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    const/16 v0, 0x14

    .line 38
    .line 39
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catch_0
    move-exception p1

    .line 44
    const-string p2, "MediaSessionStub"

    .line 45
    .line 46
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 47
    .line 48
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method

.method public W1(LE3/q;ILjava/lang/String;IILandroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "MediaSessionStub"

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string p1, "getChildren(): Ignoring empty parentId"

    .line 13
    .line 14
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    if-gez p4, :cond_2

    .line 19
    .line 20
    const-string p1, "getChildren(): Ignoring negative page"

    .line 21
    .line 22
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    const/4 v0, 0x1

    .line 27
    if-ge p5, v0, :cond_3

    .line 28
    .line 29
    const-string p1, "getChildren(): Ignoring pageSize less than 1"

    .line 30
    .line 31
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_3
    if-nez p6, :cond_4

    .line 36
    .line 37
    const/4 p6, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_4
    :try_start_0
    invoke-static {p6}, LE3/Y2;->a(Landroid/os/Bundle;)LE3/Y2;

    .line 40
    .line 41
    .line 42
    move-result-object p6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    new-instance v0, LE3/d5;

    .line 44
    .line 45
    invoke-direct {v0, p3, p4, p5, p6}, LE3/d5;-><init>(Ljava/lang/String;IILE3/Y2;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, LE3/I6;->u5(LE3/I6$e;)LE3/I6$e;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    const p4, 0xc353

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catch_0
    move-exception p1

    .line 60
    const-string p2, "Ignoring malformed Bundle for LibraryParams"

    .line 61
    .line 62
    invoke-static {v1, p2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public X0(LE3/q;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, LE3/I6;->p5(LE3/h3$g;I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public X1(LE3/q;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-eqz p3, :cond_2

    .line 4
    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v1, "MediaSessionStub"

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string p1, "setRatingWithMediaId(): Ignoring empty mediaId"

    .line 17
    .line 18
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :try_start_0
    invoke-static {p4}, Lq2/S;->a(Landroid/os/Bundle;)Lq2/S;

    .line 23
    .line 24
    .line 25
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    new-instance v0, LE3/M5;

    .line 27
    .line 28
    invoke-direct {v0, p3, p4}, LE3/M5;-><init>(Ljava/lang/String;Lq2/S;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    const p4, 0x9c4a

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception p1

    .line 43
    const-string p2, "Ignoring malformed Bundle for Rating"

    .line 44
    .line 45
    invoke-static {v1, p2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public X2(LE3/q;IIJ)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, LE3/k5;

    .line 7
    .line 8
    invoke-direct {v0, p0, p3, p4, p5}, LE3/k5;-><init>(LE3/I6;IJ)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LE3/I6;->w5(LE3/I6$b;)LE3/I6$e;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    const/16 p4, 0xa

    .line 16
    .line 17
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public Y(LE3/q;ILandroid/os/Bundle;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lq2/C;->b(Landroid/os/Bundle;)Lq2/C;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, LE3/y5;

    .line 11
    .line 12
    invoke-direct {v0, p3, p4}, LE3/y5;-><init>(Lq2/C;Z)V

    .line 13
    .line 14
    .line 15
    new-instance p3, LE3/G6;

    .line 16
    .line 17
    invoke-direct {p3}, LE3/G6;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p3}, LE3/I6;->h5(LE3/I6$e;LE3/I6$d;)LE3/I6$e;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    const/16 p4, 0x1f

    .line 29
    .line 30
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception p1

    .line 35
    const-string p2, "MediaSessionStub"

    .line 36
    .line 37
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 38
    .line 39
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
.end method

.method public Y0(LE3/q;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lq2/C;->b(Landroid/os/Bundle;)Lq2/C;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, LE3/S5;

    .line 11
    .line 12
    invoke-direct {v0, p3}, LE3/S5;-><init>(Lq2/C;)V

    .line 13
    .line 14
    .line 15
    new-instance p3, LE3/U5;

    .line 16
    .line 17
    invoke-direct {p3}, LE3/U5;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p3}, LE3/I6;->g5(LE3/I6$e;LE3/I6$c;)LE3/I6$e;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    const/16 v0, 0x14

    .line 29
    .line 30
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception p1

    .line 35
    const-string p2, "MediaSessionStub"

    .line 36
    .line 37
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 38
    .line 39
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
.end method

.method public Z(LE3/q;ILandroid/view/Surface;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/Z5;

    .line 5
    .line 6
    invoke-direct {v0, p3}, LE3/Z5;-><init>(Landroid/view/Surface;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/16 v0, 0x1b

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public Z0(LE3/q;ILandroid/os/Bundle;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, LE3/X6;->a(Landroid/os/Bundle;)LE3/X6;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    :try_start_1
    iget-object v2, p0, LE3/I6;->b:LE3/g;

    .line 15
    .line 16
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v2, p1}, LE3/g;->o(Ljava/lang/Object;)LE3/S6;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :try_start_2
    invoke-virtual {p1, p2, p3}, LE3/S6;->e(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :catch_0
    move-exception p1

    .line 43
    const-string p2, "MediaSessionStub"

    .line 44
    .line 45
    const-string p3, "Ignoring malformed Bundle for SessionResult"

    .line 46
    .line 47
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    return-void
.end method

.method public Z1(LE3/q;ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p3, :cond_1

    .line 4
    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p3}, LE3/T6;->a(Landroid/os/Bundle;)LE3/T6;

    .line 9
    .line 10
    .line 11
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    new-instance v0, LE3/v5;

    .line 13
    .line 14
    invoke-direct {v0, p3, p4}, LE3/v5;-><init>(LE3/T6;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-direct {p0, p1, p2, p3, p4}, LE3/I6;->c5(LE3/q;ILE3/T6;LE3/I6$e;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    const-string p2, "MediaSessionStub"

    .line 27
    .line 28
    const-string p3, "Ignoring malformed Bundle for SessionCommand"

    .line 29
    .line 30
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public Z4(LE3/q;LE3/h3$g;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LE3/I3;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0}, LE3/I3;->t0()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v1, p0, LE3/I6;->c:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, LE3/I3;->X()Landroid/os/Handler;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, LE3/I5;

    .line 33
    .line 34
    invoke-direct {v2, p0, p2, v0, p1}, LE3/I5;-><init>(LE3/I6;LE3/h3$g;LE3/I3;LE3/q;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    :goto_0
    invoke-static {p1}, LE3/a7;->a(LE3/q;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    :goto_1
    invoke-static {p1}, LE3/a7;->a(LE3/q;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public b1(LE3/q;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, LE3/I6;->Y(LE3/q;ILandroid/os/Bundle;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public b3(LE3/q;ILandroid/os/Bundle;J)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lq2/C;->b(Landroid/os/Bundle;)Lq2/C;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, LE3/f6;

    .line 11
    .line 12
    invoke-direct {v0, p3, p4, p5}, LE3/f6;-><init>(Lq2/C;J)V

    .line 13
    .line 14
    .line 15
    new-instance p3, LE3/G6;

    .line 16
    .line 17
    invoke-direct {p3}, LE3/G6;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p3}, LE3/I6;->h5(LE3/I6$e;LE3/I6$d;)LE3/I6$e;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    const/16 p4, 0x1f

    .line 29
    .line 30
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception p1

    .line 35
    const-string p2, "MediaSessionStub"

    .line 36
    .line 37
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 38
    .line 39
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
.end method

.method public c0(LE3/q;IZ)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/u5;

    .line 5
    .line 6
    invoke-direct {v0, p3}, LE3/u5;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/16 v0, 0x1a

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c3(LE3/q;IILandroid/os/IBinder;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_1

    .line 4
    .line 5
    if-gez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, LE3/u;

    .line 9
    .line 10
    invoke-direct {v0}, LE3/u;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p4}, Lq2/j;->a(Landroid/os/IBinder;)LP9/u;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-static {v0, p4}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 18
    .line 19
    .line 20
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    new-instance v0, LE3/A5;

    .line 22
    .line 23
    invoke-direct {v0, p4}, LE3/A5;-><init>(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    new-instance p4, LE3/B5;

    .line 27
    .line 28
    invoke-direct {p4, p0, p3}, LE3/B5;-><init>(LE3/I6;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p4}, LE3/I6;->g5(LE3/I6$e;LE3/I6$c;)LE3/I6$e;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    const/16 p4, 0x14

    .line 40
    .line 41
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_0
    move-exception p1

    .line 46
    const-string p2, "MediaSessionStub"

    .line 47
    .line 48
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 49
    .line 50
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void
.end method

.method public d1(LE3/q;IF)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpl-float v0, p3, v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, LE3/j5;

    .line 10
    .line 11
    invoke-direct {v0, p3}, LE3/j5;-><init>(F)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    const/16 v0, 0xd

    .line 19
    .line 20
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public d2(LE3/q;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, LE3/I6;->r5(LE3/h3$g;I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method d5(LE3/M6;)LE3/M6;
    .locals 7

    .line 1
    iget-object v0, p1, LE3/M6;->D:Lq2/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq2/h0;->b()LP9/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, LP9/u;->t()LP9/u$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, LP9/r;->q()LP9/r$a;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lq2/h0$a;

    .line 27
    .line 28
    invoke-virtual {v4}, Lq2/h0$a;->c()Lq2/a0;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, p0, LE3/I6;->d:LP9/r;

    .line 33
    .line 34
    invoke-virtual {v6, v5}, LP9/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Ljava/lang/String;

    .line 39
    .line 40
    if-nez v6, :cond_0

    .line 41
    .line 42
    invoke-direct {p0, v5}, LE3/I6;->e5(Lq2/a0;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    :cond_0
    invoke-virtual {v2, v5, v6}, LP9/r$a;->m(Ljava/lang/Object;Ljava/lang/Object;)LP9/r$a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v6}, Lq2/h0$a;->a(Ljava/lang/String;)Lq2/h0$a;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v1, v4}, LP9/u$a;->h(Ljava/lang/Object;)LP9/u$a;

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v2}, LP9/r$a;->l()LP9/r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, LE3/I6;->d:LP9/r;

    .line 64
    .line 65
    new-instance v0, Lq2/h0;

    .line 66
    .line 67
    invoke-virtual {v1}, LP9/u$a;->k()LP9/u;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v0, v1}, Lq2/h0;-><init>(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, LE3/M6;->b(Lq2/h0;)LE3/M6;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v0, p1, LE3/M6;->E:Lq2/d0;

    .line 79
    .line 80
    iget-object v0, v0, Lq2/d0;->D:LP9/v;

    .line 81
    .line 82
    invoke-virtual {v0}, LP9/v;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_2
    iget-object v0, p1, LE3/M6;->E:Lq2/d0;

    .line 90
    .line 91
    invoke-virtual {v0}, Lq2/d0;->I()Lq2/d0$c;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Lq2/d0$c;->H()Lq2/d0$c;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v1, p1, LE3/M6;->E:Lq2/d0;

    .line 100
    .line 101
    iget-object v1, v1, Lq2/d0;->D:LP9/v;

    .line 102
    .line 103
    invoke-virtual {v1}, LP9/v;->p()LP9/s;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, LP9/s;->l()LP9/X;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_4

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Lq2/b0;

    .line 122
    .line 123
    iget-object v3, v2, Lq2/b0;->a:Lq2/a0;

    .line 124
    .line 125
    iget-object v4, p0, LE3/I6;->d:LP9/r;

    .line 126
    .line 127
    invoke-virtual {v4, v3}, LP9/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Ljava/lang/String;

    .line 132
    .line 133
    if-eqz v4, :cond_3

    .line 134
    .line 135
    new-instance v5, Lq2/b0;

    .line 136
    .line 137
    invoke-virtual {v3, v4}, Lq2/a0;->a(Ljava/lang/String;)Lq2/a0;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    iget-object v2, v2, Lq2/b0;->b:LP9/u;

    .line 142
    .line 143
    invoke-direct {v5, v3, v2}, Lq2/b0;-><init>(Lq2/a0;Ljava/util/List;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v5}, Lq2/d0$c;->F(Lq2/b0;)Lq2/d0$c;

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    invoke-virtual {v0, v2}, Lq2/d0$c;->F(Lq2/b0;)Lq2/d0$c;

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_4
    invoke-virtual {v0}, Lq2/d0$c;->G()Lq2/d0;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p1, v0}, LE3/M6;->x(Lq2/d0;)LE3/M6;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1
.end method

.method public e0(LE3/q;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lq2/I;->b(Landroid/os/Bundle;)Lq2/I;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, LE3/d6;

    .line 11
    .line 12
    invoke-direct {v0, p3}, LE3/d6;-><init>(Lq2/I;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/16 v0, 0x13

    .line 20
    .line 21
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    const-string p2, "MediaSessionStub"

    .line 27
    .line 28
    const-string p3, "Ignoring malformed Bundle for MediaMetadata"

    .line 29
    .line 30
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public f3(LE3/q;ILandroid/os/Bundle;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lq2/c;->a(Landroid/os/Bundle;)Lq2/c;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, LE3/P5;

    .line 11
    .line 12
    invoke-direct {v0, p3, p4}, LE3/P5;-><init>(Lq2/c;Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/16 p4, 0x23

    .line 20
    .line 21
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    const-string p2, "MediaSessionStub"

    .line 27
    .line 28
    const-string p3, "Ignoring malformed Bundle for AudioAttributes"

    .line 29
    .line 30
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public f5()LE3/g;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public g3(LE3/q;II)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, LE3/h5;

    .line 7
    .line 8
    invoke-direct {v0, p0, p3}, LE3/h5;-><init>(LE3/I6;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LE3/I6;->w5(LE3/I6$b;)LE3/I6$e;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    const/16 v0, 0xa

    .line 16
    .line 17
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public h1(LE3/q;IF)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpl-float v0, p3, v0

    .line 5
    .line 6
    if-ltz v0, :cond_1

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    cmpg-float v0, p3, v0

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, LE3/W5;

    .line 16
    .line 17
    invoke-direct {v0, p3}, LE3/W5;-><init>(F)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    const/16 v0, 0x18

    .line 25
    .line 26
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public h2(LE3/q;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lq2/S;->a(Landroid/os/Bundle;)Lq2/S;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, LE3/H6;

    .line 11
    .line 12
    invoke-direct {v0, p3}, LE3/H6;-><init>(Lq2/S;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const v0, 0x9c4a

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    const-string p2, "MediaSessionStub"

    .line 28
    .line 29
    const-string p3, "Ignoring malformed Bundle for Rating"

    .line 30
    .line 31
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
.end method

.method public h3(LE3/q;ILandroid/os/IBinder;IJ)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p3, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p4, v0, :cond_0

    .line 7
    .line 8
    if-gez p4, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    new-instance v0, LE3/u;

    .line 12
    .line 13
    invoke-direct {v0}, LE3/u;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p3}, Lq2/j;->a(Landroid/os/IBinder;)LP9/u;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-static {v0, p3}, Lt2/i;->d(LO9/f;Ljava/util/List;)LP9/u;

    .line 21
    .line 22
    .line 23
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    new-instance v0, LE3/H5;

    .line 25
    .line 26
    invoke-direct {v0, p3, p4, p5, p6}, LE3/H5;-><init>(Ljava/util/List;IJ)V

    .line 27
    .line 28
    .line 29
    new-instance p3, LE3/G6;

    .line 30
    .line 31
    invoke-direct {p3}, LE3/G6;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p3}, LE3/I6;->h5(LE3/I6$e;LE3/I6$d;)LE3/I6$e;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-static {p3}, LE3/I6;->y5(LE3/I6$e;)LE3/I6$e;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    const/16 p4, 0x14

    .line 43
    .line 44
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p1

    .line 49
    const-string p2, "MediaSessionStub"

    .line 50
    .line 51
    const-string p3, "Ignoring malformed Bundle for MediaItem"

    .line 52
    .line 53
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    return-void
.end method

.method public i0(LE3/q;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lq2/d0;->J(Landroid/os/Bundle;)Lq2/d0;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, LE3/m5;

    .line 11
    .line 12
    invoke-direct {v0, p0, p3}, LE3/m5;-><init>(LE3/I6;Lq2/d0;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/16 v0, 0x1d

    .line 20
    .line 21
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    const-string p2, "MediaSessionStub"

    .line 27
    .line 28
    const-string p3, "Ignoring malformed Bundle for TrackSelectionParameters"

    .line 29
    .line 30
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public i1(LE3/q;II)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-gez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, LE3/i6;

    .line 7
    .line 8
    invoke-direct {v0, p3}, LE3/i6;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    const/16 v0, 0x19

    .line 16
    .line 17
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public j2(LE3/q;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "MediaSessionStub"

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string p1, "search(): Ignoring empty query"

    .line 13
    .line 14
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    if-nez p4, :cond_2

    .line 19
    .line 20
    const/4 p4, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    :try_start_0
    invoke-static {p4}, LE3/Y2;->a(Landroid/os/Bundle;)LE3/Y2;

    .line 23
    .line 24
    .line 25
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :goto_0
    new-instance v0, LE3/l6;

    .line 27
    .line 28
    invoke-direct {v0, p3, p4}, LE3/l6;-><init>(Ljava/lang/String;LE3/Y2;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LE3/I6;->u5(LE3/I6$e;)LE3/I6$e;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    const p4, 0xc355

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception p1

    .line 43
    const-string p2, "Ignoring malformed Bundle for LibraryParams"

    .line 44
    .line 45
    invoke-static {v1, p2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public k5(LE3/h3$g;I)V
    .locals 2

    .line 1
    new-instance v0, LE3/l5;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/l5;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->n5(LE3/h3$g;IILE3/I6$e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public l5(LE3/h3$g;I)V
    .locals 2

    .line 1
    new-instance v0, LE3/C5;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LE3/C5;-><init>(LE3/I6;LE3/h3$g;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->n5(LE3/h3$g;IILE3/I6$e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public m1(LE3/q;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/T5;

    .line 5
    .line 6
    invoke-direct {v0}, LE3/T5;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x1a

    .line 14
    .line 15
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public n2(LE3/q;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, LE3/I6;->q5(LE3/h3$g;I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public o5()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/g;->j()LP9/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LE3/h3$g;

    .line 23
    .line 24
    iget-object v3, p0, LE3/I6;->b:LE3/g;

    .line 25
    .line 26
    invoke-virtual {v3, v1}, LE3/g;->t(LE3/h3$g;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, LE3/h3$g;->c()LE3/h3$f;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-interface {v1, v2}, LE3/h3$f;->b(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, LE3/I6;->c:Ljava/util/Set;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, LE3/h3$g;

    .line 56
    .line 57
    invoke-virtual {v1}, LE3/h3$g;->c()LE3/h3$f;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-interface {v1, v2}, LE3/h3$f;->b(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    iget-object v0, p0, LE3/I6;->c:Ljava/util/Set;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, LE3/I6;->a:Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public p5(LE3/h3$g;I)V
    .locals 2

    .line 1
    new-instance v0, LE3/t5;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/t5;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v1, 0xb

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->n5(LE3/h3$g;IILE3/I6$e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public q0(LE3/q;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "MediaSessionStub"

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string p1, "subscribe(): Ignoring empty parentId"

    .line 13
    .line 14
    invoke-static {v1, p1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    if-nez p4, :cond_2

    .line 19
    .line 20
    const/4 p4, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    :try_start_0
    invoke-static {p4}, LE3/Y2;->a(Landroid/os/Bundle;)LE3/Y2;

    .line 23
    .line 24
    .line 25
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :goto_0
    new-instance v0, LE3/g6;

    .line 27
    .line 28
    invoke-direct {v0, p3, p4}, LE3/g6;-><init>(Ljava/lang/String;LE3/Y2;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LE3/I6;->u5(LE3/I6$e;)LE3/I6$e;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    const p4, 0xc351

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception p1

    .line 43
    const-string p2, "Ignoring malformed Bundle for LibraryParams"

    .line 44
    .line 45
    invoke-static {v1, p2, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public q1(LE3/q;I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LE3/I6;->b:LE3/g;

    .line 5
    .line 6
    invoke-interface {p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, LE3/g;->k(Ljava/lang/Object;)LE3/h3$g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, LE3/I6;->l5(LE3/h3$g;I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public q3(LE3/q;IZ)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/i5;

    .line 5
    .line 6
    invoke-direct {v0, p3}, LE3/i5;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public q5(LE3/h3$g;I)V
    .locals 2

    .line 1
    new-instance v0, LE3/K5;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/K5;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v1, 0xc

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->n5(LE3/h3$g;IILE3/I6$e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public r2(LE3/q;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/F5;

    .line 5
    .line 6
    invoke-direct {v0}, LE3/F5;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public r3(LE3/q;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-static {p3}, Lq2/O;->a(Landroid/os/Bundle;)Lq2/O;

    .line 7
    .line 8
    .line 9
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    new-instance v0, LE3/w5;

    .line 11
    .line 12
    invoke-direct {v0, p3}, LE3/w5;-><init>(Lq2/O;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/16 v0, 0xd

    .line 20
    .line 21
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception p1

    .line 26
    const-string p2, "MediaSessionStub"

    .line 27
    .line 28
    const-string p3, "Ignoring malformed Bundle for PlaybackParameters"

    .line 29
    .line 30
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public r5(LE3/h3$g;I)V
    .locals 2

    .line 1
    new-instance v0, LE3/L5;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/L5;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->n5(LE3/h3$g;IILE3/I6$e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public s5(LE3/h3$g;I)V
    .locals 2

    .line 1
    new-instance v0, LE3/z5;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/z5;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x7

    .line 11
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->n5(LE3/h3$g;IILE3/I6$e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public t0(LE3/q;I)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/b6;

    .line 5
    .line 6
    invoke-direct {v0}, LE3/b6;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public v1(LE3/q;IJ)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, LE3/j6;

    .line 5
    .line 6
    invoke-direct {v0, p3, p4}, LE3/j6;-><init>(J)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/4 p4, 0x5

    .line 14
    invoke-direct {p0, p1, p2, p4, p3}, LE3/I6;->m5(LE3/q;IILE3/I6$e;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public x1(LE3/q;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-nez p3, :cond_1

    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_1
    :try_start_0
    invoke-static {p3}, LE3/Y2;->a(Landroid/os/Bundle;)LE3/Y2;

    .line 9
    .line 10
    .line 11
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    :goto_0
    new-instance v0, LE3/a6;

    .line 13
    .line 14
    invoke-direct {v0, p3}, LE3/a6;-><init>(LE3/Y2;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, LE3/I6;->u5(LE3/I6$e;)LE3/I6$e;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    const v0, 0xc350

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1, p2, v0, p3}, LE3/I6;->a5(LE3/q;IILE3/I6$e;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    move-exception p1

    .line 29
    const-string p2, "MediaSessionStub"

    .line 30
    .line 31
    const-string p3, "Ignoring malformed Bundle for LibraryParams"

    .line 32
    .line 33
    invoke-static {p2, p3, p1}, Lt2/w;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public z5(LE3/h3$g;I)V
    .locals 2

    .line 1
    new-instance v0, LE3/Y5;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/Y5;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LE3/I6;->x5(Lt2/n;)LE3/I6$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {p0, p1, p2, v1, v0}, LE3/I6;->n5(LE3/h3$g;IILE3/I6$e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
