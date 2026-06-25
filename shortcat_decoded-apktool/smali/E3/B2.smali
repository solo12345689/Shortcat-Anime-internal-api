.class LE3/B2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/A$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/B2$e;,
        LE3/B2$d;,
        LE3/B2$c;,
        LE3/B2$b;
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field private final b:LE3/A;

.field private final c:LE3/Y6;

.field private final d:Lt2/v;

.field private final e:LE3/B2$c;

.field private final f:Lt2/h;

.field private final g:LP9/u;

.field private final h:Landroid/os/Bundle;

.field private final i:J

.field private j:LF3/j;

.field private k:LF3/e;

.field private l:Z

.field private m:Z

.field private n:LE3/B2$e;

.field private o:LE3/B2$e;

.field private p:Z

.field private q:LE3/B2$d;

.field private r:J

.field private s:J


# direct methods
.method public constructor <init>(Landroid/content/Context;LE3/A;LE3/Y6;Landroid/os/Bundle;Landroid/os/Looper;Lt2/h;J)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE3/B2$e;

    .line 5
    .line 6
    invoke-direct {v0}, LE3/B2$e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE3/B2;->n:LE3/B2$e;

    .line 10
    .line 11
    new-instance v0, LE3/B2$e;

    .line 12
    .line 13
    invoke-direct {v0}, LE3/B2$e;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LE3/B2;->o:LE3/B2$e;

    .line 17
    .line 18
    new-instance v0, LE3/B2$d;

    .line 19
    .line 20
    invoke-direct {v0}, LE3/B2$d;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 24
    .line 25
    new-instance v0, Lt2/v;

    .line 26
    .line 27
    sget-object v1, Lt2/j;->a:Lt2/j;

    .line 28
    .line 29
    new-instance v2, LE3/u2;

    .line 30
    .line 31
    invoke-direct {v2, p0}, LE3/u2;-><init>(LE3/B2;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, p5, v1, v2}, Lt2/v;-><init>(Landroid/os/Looper;Lt2/j;Lt2/v$b;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, LE3/B2;->d:Lt2/v;

    .line 38
    .line 39
    iput-object p1, p0, LE3/B2;->a:Landroid/content/Context;

    .line 40
    .line 41
    iput-object p2, p0, LE3/B2;->b:LE3/A;

    .line 42
    .line 43
    new-instance p1, LE3/B2$c;

    .line 44
    .line 45
    invoke-direct {p1, p0, p5}, LE3/B2$c;-><init>(LE3/B2;Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, LE3/B2;->e:LE3/B2$c;

    .line 49
    .line 50
    iput-object p3, p0, LE3/B2;->c:LE3/Y6;

    .line 51
    .line 52
    iput-object p4, p0, LE3/B2;->h:Landroid/os/Bundle;

    .line 53
    .line 54
    iput-object p6, p0, LE3/B2;->f:Lt2/h;

    .line 55
    .line 56
    iput-wide p7, p0, LE3/B2;->i:J

    .line 57
    .line 58
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    iput-wide p1, p0, LE3/B2;->r:J

    .line 64
    .line 65
    iput-wide p1, p0, LE3/B2;->s:J

    .line 66
    .line 67
    invoke-static {}, LP9/u;->A()LP9/u;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, LE3/B2;->g:LP9/u;

    .line 72
    .line 73
    return-void
.end method

.method static synthetic A1(Ljava/util/concurrent/Future;)V
    .locals 0

    .line 1
    invoke-static {p0}, LE3/B2;->W1(Ljava/util/concurrent/Future;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private B1(Ljava/util/List;I)V
    .locals 7

    .line 1
    new-instance v4, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    invoke-direct {v2, v6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, LE3/v2;

    .line 13
    .line 14
    move-object v1, p0

    .line 15
    move-object v3, p1

    .line 16
    move v5, p2

    .line 17
    invoke-direct/range {v0 .. v5}, LE3/v2;-><init>(LE3/B2;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/List;Ljava/util/List;I)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-ge v6, p1, :cond_1

    .line 25
    .line 26
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lq2/C;

    .line 31
    .line 32
    iget-object p1, p1, Lq2/C;->e:Lq2/I;

    .line 33
    .line 34
    iget-object p1, p1, Lq2/I;->k:[B

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    iget-object p2, v1, LE3/B2;->f:Lt2/h;

    .line 47
    .line 48
    invoke-interface {p2, p1}, Lt2/h;->c([B)Lcom/google/common/util/concurrent/p;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object p2, p2, LE3/A;->e:Landroid/os/Handler;

    .line 60
    .line 61
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    new-instance v2, LC2/V;

    .line 65
    .line 66
    invoke-direct {v2, p2}, LC2/V;-><init>(Landroid/os/Handler;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0, v2}, Lcom/google/common/util/concurrent/p;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    return-void
.end method

.method private static C1(ZLE3/B2$e;LE3/B2$d;LE3/B2$e;Ljava/lang/String;JZIJLjava/lang/String;ZLandroid/content/Context;)LE3/B2$d;
    .locals 53

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p7

    .line 8
    .line 9
    move/from16 v4, p8

    .line 10
    .line 11
    move-wide/from16 v5, p9

    .line 12
    .line 13
    move-object/from16 v7, p13

    .line 14
    .line 15
    iget-object v8, v0, LE3/B2$e;->d:Ljava/util/List;

    .line 16
    .line 17
    iget-object v9, v2, LE3/B2$e;->d:Ljava/util/List;

    .line 18
    .line 19
    if-eq v8, v9, :cond_0

    .line 20
    .line 21
    const/4 v8, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v8, 0x0

    .line 24
    :goto_0
    if-eqz v8, :cond_1

    .line 25
    .line 26
    invoke-static {v9}, LE3/O6;->F(Ljava/util/List;)LE3/O6;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-object v9, v1, LE3/B2$d;->a:LE3/M6;

    .line 32
    .line 33
    iget-object v9, v9, LE3/M6;->j:Lq2/Y;

    .line 34
    .line 35
    check-cast v9, LE3/O6;

    .line 36
    .line 37
    invoke-virtual {v9}, LE3/O6;->y()LE3/O6;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    :goto_1
    iget-object v12, v0, LE3/B2$e;->c:LF3/m;

    .line 42
    .line 43
    iget-object v13, v2, LE3/B2$e;->c:LF3/m;

    .line 44
    .line 45
    if-ne v12, v13, :cond_3

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/4 v12, 0x0

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    :goto_2
    const/4 v12, 0x1

    .line 53
    :goto_3
    iget-object v13, v0, LE3/B2$e;->b:LF3/v;

    .line 54
    .line 55
    invoke-static {v13}, LE3/B2;->O1(LF3/v;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v13

    .line 59
    iget-object v15, v2, LE3/B2$e;->b:LF3/v;

    .line 60
    .line 61
    const/16 v16, 0x1

    .line 62
    .line 63
    invoke-static {v15}, LE3/B2;->O1(LF3/v;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v10

    .line 67
    cmp-long v13, v13, v10

    .line 68
    .line 69
    if-nez v13, :cond_5

    .line 70
    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    const/4 v13, 0x0

    .line 75
    goto :goto_5

    .line 76
    :cond_5
    :goto_4
    move/from16 v13, v16

    .line 77
    .line 78
    :goto_5
    iget-object v14, v2, LE3/B2$e;->c:LF3/m;

    .line 79
    .line 80
    invoke-static {v14}, LE3/t;->j(LF3/m;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v14

    .line 84
    move/from16 v17, v8

    .line 85
    .line 86
    const-string v8, "MCImplLegacy"

    .line 87
    .line 88
    if-nez v12, :cond_6

    .line 89
    .line 90
    if-nez v13, :cond_6

    .line 91
    .line 92
    if-eqz v17, :cond_7

    .line 93
    .line 94
    :cond_6
    move/from16 v17, v12

    .line 95
    .line 96
    goto :goto_7

    .line 97
    :cond_7
    iget-object v4, v1, LE3/B2$d;->a:LE3/M6;

    .line 98
    .line 99
    iget-object v10, v4, LE3/M6;->c:LE3/W6;

    .line 100
    .line 101
    iget-object v10, v10, LE3/W6;->a:Lq2/P$e;

    .line 102
    .line 103
    iget v10, v10, Lq2/P$e;->c:I

    .line 104
    .line 105
    iget-object v4, v4, LE3/M6;->z:Lq2/I;

    .line 106
    .line 107
    move-object/from16 v18, v4

    .line 108
    .line 109
    :goto_6
    move-object/from16 v17, v9

    .line 110
    .line 111
    move/from16 v19, v10

    .line 112
    .line 113
    goto/16 :goto_b

    .line 114
    .line 115
    :goto_7
    iget-object v12, v2, LE3/B2$e;->d:Ljava/util/List;

    .line 116
    .line 117
    invoke-static {v12, v10, v11}, LE3/B2;->N1(Ljava/util/List;J)I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    iget-object v11, v2, LE3/B2$e;->c:LF3/m;

    .line 122
    .line 123
    if-eqz v11, :cond_8

    .line 124
    .line 125
    move/from16 p0, v16

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_8
    const/16 p0, 0x0

    .line 129
    .line 130
    :goto_8
    const/4 v12, -0x1

    .line 131
    if-eqz p0, :cond_9

    .line 132
    .line 133
    if-eqz v17, :cond_9

    .line 134
    .line 135
    invoke-static {v11, v4}, LE3/t;->C(LF3/m;I)Lq2/I;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    goto :goto_9

    .line 140
    :cond_9
    if-nez p0, :cond_b

    .line 141
    .line 142
    if-eqz v13, :cond_b

    .line 143
    .line 144
    if-ne v10, v12, :cond_a

    .line 145
    .line 146
    sget-object v11, Lq2/I;->K:Lq2/I;

    .line 147
    .line 148
    goto :goto_9

    .line 149
    :cond_a
    iget-object v11, v2, LE3/B2$e;->d:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    check-cast v11, LF3/n$h;

    .line 156
    .line 157
    invoke-virtual {v11}, LF3/n$h;->c()LF3/l;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v11, v4}, LE3/t;->A(LF3/l;I)Lq2/I;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    goto :goto_9

    .line 166
    :cond_b
    iget-object v11, v1, LE3/B2$d;->a:LE3/M6;

    .line 167
    .line 168
    iget-object v11, v11, LE3/M6;->z:Lq2/I;

    .line 169
    .line 170
    :goto_9
    if-ne v10, v12, :cond_e

    .line 171
    .line 172
    if-eqz v17, :cond_e

    .line 173
    .line 174
    if-eqz p0, :cond_c

    .line 175
    .line 176
    const-string v10, "Adding a fake MediaItem at the end of the list because there\'s no QueueItem with the active queue id and current Timeline should have currently playing MediaItem."

    .line 177
    .line 178
    invoke-static {v8, v10}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    iget-object v10, v2, LE3/B2$e;->c:LF3/m;

    .line 182
    .line 183
    invoke-static {v10, v4}, LE3/t;->w(LF3/m;I)Lq2/C;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v9, v4, v14, v15}, LE3/O6;->A(Lq2/C;J)LE3/O6;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v9}, LE3/O6;->t()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    add-int/lit8 v4, v4, -0x1

    .line 196
    .line 197
    move v10, v4

    .line 198
    goto :goto_a

    .line 199
    :cond_c
    invoke-virtual {v9}, LE3/O6;->z()LE3/O6;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    :cond_d
    const/4 v10, 0x0

    .line 204
    goto :goto_a

    .line 205
    :cond_e
    if-eq v10, v12, :cond_d

    .line 206
    .line 207
    invoke-virtual {v9}, LE3/O6;->z()LE3/O6;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    if-eqz p0, :cond_f

    .line 212
    .line 213
    invoke-virtual {v9, v10}, LE3/O6;->G(I)Lq2/C;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    invoke-static {v12}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    check-cast v12, Lq2/C;

    .line 222
    .line 223
    iget-object v12, v12, Lq2/C;->a:Ljava/lang/String;

    .line 224
    .line 225
    iget-object v13, v2, LE3/B2$e;->c:LF3/m;

    .line 226
    .line 227
    invoke-static {v12, v13, v4}, LE3/t;->y(Ljava/lang/String;LF3/m;I)Lq2/C;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v9, v10, v4, v14, v15}, LE3/O6;->C(ILq2/C;J)LE3/O6;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    :cond_f
    :goto_a
    move-object/from16 v18, v11

    .line 236
    .line 237
    goto/16 :goto_6

    .line 238
    .line 239
    :goto_b
    iget-object v4, v2, LE3/B2$e;->a:LF3/j$e;

    .line 240
    .line 241
    if-eqz v4, :cond_10

    .line 242
    .line 243
    invoke-virtual {v4}, LF3/j$e;->e()I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    goto :goto_c

    .line 248
    :cond_10
    const/4 v11, 0x0

    .line 249
    :goto_c
    iget-object v4, v2, LE3/B2$e;->b:LF3/v;

    .line 250
    .line 251
    move-wide/from16 v9, p5

    .line 252
    .line 253
    invoke-static {v4, v11, v9, v10, v3}, LE3/t;->O(LF3/v;IJZ)Lq2/P$b;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    iget-object v9, v0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 258
    .line 259
    iget-object v10, v2, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 260
    .line 261
    if-ne v9, v10, :cond_11

    .line 262
    .line 263
    iget-object v9, v1, LE3/B2$d;->a:LE3/M6;

    .line 264
    .line 265
    iget-object v9, v9, LE3/M6;->m:Lq2/I;

    .line 266
    .line 267
    :goto_d
    move-object/from16 v20, v9

    .line 268
    .line 269
    goto :goto_e

    .line 270
    :cond_11
    invoke-static {v10}, LE3/t;->D(Ljava/lang/CharSequence;)Lq2/I;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    goto :goto_d

    .line 275
    :goto_e
    iget v9, v2, LE3/B2$e;->f:I

    .line 276
    .line 277
    invoke-static {v9}, LE3/t;->T(I)I

    .line 278
    .line 279
    .line 280
    move-result v21

    .line 281
    iget v9, v2, LE3/B2$e;->g:I

    .line 282
    .line 283
    invoke-static {v9}, LE3/t;->Y(I)Z

    .line 284
    .line 285
    .line 286
    move-result v22

    .line 287
    iget-object v0, v0, LE3/B2$e;->b:LF3/v;

    .line 288
    .line 289
    iget-object v9, v2, LE3/B2$e;->b:LF3/v;

    .line 290
    .line 291
    if-ne v0, v9, :cond_13

    .line 292
    .line 293
    if-eqz p12, :cond_12

    .line 294
    .line 295
    goto :goto_10

    .line 296
    :cond_12
    iget-object v0, v1, LE3/B2$d;->b:LE3/U6;

    .line 297
    .line 298
    iget-object v3, v1, LE3/B2$d;->d:LP9/u;

    .line 299
    .line 300
    :goto_f
    move-object/from16 v23, v0

    .line 301
    .line 302
    move-object/from16 v25, v3

    .line 303
    .line 304
    goto :goto_11

    .line 305
    :cond_13
    :goto_10
    invoke-static {v9, v3}, LE3/t;->U(LF3/v;Z)LE3/U6;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    iget-object v3, v2, LE3/B2$e;->b:LF3/v;

    .line 310
    .line 311
    iget-object v9, v2, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 312
    .line 313
    invoke-static {v3, v4, v9}, LE3/t;->s(LF3/v;Lq2/P$b;Landroid/os/Bundle;)LP9/u;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    goto :goto_f

    .line 318
    :goto_11
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 319
    .line 320
    invoke-static {v0, v7}, LE3/t;->H(LF3/v;Landroid/content/Context;)Lq2/N;

    .line 321
    .line 322
    .line 323
    move-result-object v27

    .line 324
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 325
    .line 326
    invoke-static {v0, v7}, LE3/t;->W(LF3/v;Landroid/content/Context;)LE3/V6;

    .line 327
    .line 328
    .line 329
    move-result-object v28

    .line 330
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 331
    .line 332
    iget-object v3, v2, LE3/B2$e;->c:LF3/m;

    .line 333
    .line 334
    invoke-static {v0, v3, v5, v6}, LE3/t;->g(LF3/v;LF3/m;J)J

    .line 335
    .line 336
    .line 337
    move-result-wide v31

    .line 338
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 339
    .line 340
    iget-object v3, v2, LE3/B2$e;->c:LF3/m;

    .line 341
    .line 342
    invoke-static {v0, v3, v5, v6}, LE3/t;->e(LF3/v;LF3/m;J)J

    .line 343
    .line 344
    .line 345
    move-result-wide v33

    .line 346
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 347
    .line 348
    iget-object v3, v2, LE3/B2$e;->c:LF3/m;

    .line 349
    .line 350
    invoke-static {v0, v3, v5, v6}, LE3/t;->d(LF3/v;LF3/m;J)I

    .line 351
    .line 352
    .line 353
    move-result v35

    .line 354
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 355
    .line 356
    iget-object v3, v2, LE3/B2$e;->c:LF3/m;

    .line 357
    .line 358
    invoke-static {v0, v3, v5, v6}, LE3/t;->Z(LF3/v;LF3/m;J)J

    .line 359
    .line 360
    .line 361
    move-result-wide v36

    .line 362
    iget-object v0, v2, LE3/B2$e;->c:LF3/m;

    .line 363
    .line 364
    invoke-static {v0}, LE3/t;->p(LF3/m;)Z

    .line 365
    .line 366
    .line 367
    move-result v38

    .line 368
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 369
    .line 370
    invoke-static {v0}, LE3/t;->J(LF3/v;)Lq2/O;

    .line 371
    .line 372
    .line 373
    move-result-object v39

    .line 374
    iget-object v0, v2, LE3/B2$e;->a:LF3/j$e;

    .line 375
    .line 376
    invoke-static {v0}, LE3/t;->b(LF3/j$e;)Lq2/c;

    .line 377
    .line 378
    .line 379
    move-result-object v40

    .line 380
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 381
    .line 382
    invoke-static {v0}, LE3/t;->G(LF3/v;)Z

    .line 383
    .line 384
    .line 385
    move-result v41

    .line 386
    :try_start_0
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 387
    .line 388
    iget-object v3, v2, LE3/B2$e;->c:LF3/m;

    .line 389
    .line 390
    invoke-static {v0, v3, v5, v6}, LE3/t;->K(LF3/v;LF3/m;J)I

    .line 391
    .line 392
    .line 393
    move-result v0
    :try_end_0
    .catch LE3/t$b; {:try_start_0 .. :try_end_0} :catch_0

    .line 394
    :goto_12
    move/from16 v42, v0

    .line 395
    .line 396
    goto :goto_13

    .line 397
    :catch_0
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 398
    .line 399
    invoke-virtual {v0}, LF3/v;->o()I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    move-object/from16 v3, p4

    .line 408
    .line 409
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    const-string v3, "Received invalid playback state %s from package %s. Keeping the previous state."

    .line 414
    .line 415
    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-static {v8, v0}, Lt2/w;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    iget-object v0, v1, LE3/B2$d;->a:LE3/M6;

    .line 423
    .line 424
    iget v0, v0, LE3/M6;->y:I

    .line 425
    .line 426
    goto :goto_12

    .line 427
    :goto_13
    iget-object v0, v2, LE3/B2$e;->b:LF3/v;

    .line 428
    .line 429
    invoke-static {v0}, LE3/t;->o(LF3/v;)Z

    .line 430
    .line 431
    .line 432
    move-result v43

    .line 433
    iget-object v0, v2, LE3/B2$e;->a:LF3/j$e;

    .line 434
    .line 435
    move-object/from16 v3, p11

    .line 436
    .line 437
    invoke-static {v0, v3}, LE3/t;->h(LF3/j$e;Ljava/lang/String;)Lq2/p;

    .line 438
    .line 439
    .line 440
    move-result-object v44

    .line 441
    iget-object v0, v2, LE3/B2$e;->a:LF3/j$e;

    .line 442
    .line 443
    invoke-static {v0}, LE3/t;->i(LF3/j$e;)I

    .line 444
    .line 445
    .line 446
    move-result v45

    .line 447
    iget-object v0, v2, LE3/B2$e;->a:LF3/j$e;

    .line 448
    .line 449
    invoke-static {v0}, LE3/t;->m(LF3/j$e;)Z

    .line 450
    .line 451
    .line 452
    move-result v46

    .line 453
    iget-object v0, v1, LE3/B2$d;->a:LE3/M6;

    .line 454
    .line 455
    iget-wide v5, v0, LE3/M6;->A:J

    .line 456
    .line 457
    iget-wide v7, v0, LE3/M6;->B:J

    .line 458
    .line 459
    iget-wide v0, v0, LE3/M6;->C:J

    .line 460
    .line 461
    iget-object v2, v2, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 462
    .line 463
    move-wide/from16 v51, v0

    .line 464
    .line 465
    move-object/from16 v26, v2

    .line 466
    .line 467
    move-object/from16 v24, v4

    .line 468
    .line 469
    move-wide/from16 v47, v5

    .line 470
    .line 471
    move-wide/from16 v49, v7

    .line 472
    .line 473
    move-wide/from16 v29, v14

    .line 474
    .line 475
    invoke-static/range {v17 .. v52}, LE3/B2;->K1(LE3/O6;Lq2/I;ILq2/I;IZLE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;Lq2/N;LE3/V6;JJJIJZLq2/O;Lq2/c;ZIZLq2/p;IZJJJ)LE3/B2$d;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    return-object v0
.end method

.method private static D1(III)I
    .locals 0

    .line 1
    if-ge p0, p1, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    add-int/2addr p0, p2

    .line 5
    return p0
.end method

.method private static E1(III)I
    .locals 1

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    if-ge p0, p2, :cond_1

    .line 7
    .line 8
    const/4 p0, -0x1

    .line 9
    return p0

    .line 10
    :cond_1
    sub-int/2addr p0, v0

    .line 11
    return p0
.end method

.method private static F1(LE3/B2$e;LE3/B2$d;LE3/B2$e;LE3/B2$d;J)Landroid/util/Pair;
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p1, LE3/B2$d;->a:LE3/M6;

    .line 12
    .line 13
    iget-object v2, v2, LE3/M6;->j:Lq2/Y;

    .line 14
    .line 15
    invoke-virtual {v2}, Lq2/Y;->u()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p3, LE3/B2$d;->a:LE3/M6;

    .line 20
    .line 21
    iget-object v3, v3, LE3/M6;->j:Lq2/Y;

    .line 22
    .line 23
    invoke-virtual {v3}, Lq2/Y;->u()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    :cond_0
    move-object v0, v4

    .line 33
    move-object v1, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object p1, p1, LE3/B2$d;->a:LE3/M6;

    .line 41
    .line 42
    invoke-virtual {p1}, LE3/M6;->C()Lq2/C;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lq2/C;

    .line 51
    .line 52
    iget-object v2, p3, LE3/B2$d;->a:LE3/M6;

    .line 53
    .line 54
    iget-object v2, v2, LE3/M6;->j:Lq2/Y;

    .line 55
    .line 56
    check-cast v2, LE3/O6;

    .line 57
    .line 58
    invoke-virtual {v2, p1}, LE3/O6;->x(Lq2/C;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    const/4 p0, 0x4

    .line 65
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    iget-object v0, p3, LE3/B2$d;->a:LE3/M6;

    .line 71
    .line 72
    invoke-virtual {v0}, LE3/M6;->C()Lq2/C;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1, v0}, Lq2/C;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    const/4 v0, 0x1

    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    iget-object p1, p0, LE3/B2$e;->b:LF3/v;

    .line 84
    .line 85
    iget-object p0, p0, LE3/B2$e;->c:LF3/m;

    .line 86
    .line 87
    invoke-static {p1, p0, p4, p5}, LE3/t;->g(LF3/v;LF3/m;J)J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    iget-object v2, p2, LE3/B2$e;->b:LF3/v;

    .line 92
    .line 93
    iget-object p2, p2, LE3/B2$e;->c:LF3/m;

    .line 94
    .line 95
    invoke-static {v2, p2, p4, p5}, LE3/t;->g(LF3/v;LF3/m;J)J

    .line 96
    .line 97
    .line 98
    move-result-wide p4

    .line 99
    const-wide/16 v2, 0x0

    .line 100
    .line 101
    cmp-long p2, p4, v2

    .line 102
    .line 103
    if-nez p2, :cond_4

    .line 104
    .line 105
    iget-object p2, p3, LE3/B2$d;->a:LE3/M6;

    .line 106
    .line 107
    iget p2, p2, LE3/M6;->h:I

    .line 108
    .line 109
    if-ne p2, v0, :cond_4

    .line 110
    .line 111
    move-object v0, v1

    .line 112
    goto :goto_0

    .line 113
    :cond_4
    sub-long/2addr p0, p4

    .line 114
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    .line 115
    .line 116
    .line 117
    move-result-wide p0

    .line 118
    const-wide/16 p2, 0x64

    .line 119
    .line 120
    cmp-long p0, p0, p2

    .line 121
    .line 122
    if-lez p0, :cond_0

    .line 123
    .line 124
    const/4 p0, 0x5

    .line 125
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    move-object v0, v4

    .line 130
    goto :goto_0

    .line 131
    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_0
    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0
.end method

.method private G1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE3/q2;

    .line 6
    .line 7
    invoke-direct {v1, p0}, LE3/q2;-><init>(LE3/B2;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private H1(LF3/n$j;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE3/j2;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LE3/j2;-><init>(LE3/B2;LF3/n$j;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LE3/A;->k1(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p1, p1, LE3/A;->e:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, LE3/t2;

    .line 20
    .line 21
    invoke-direct {v0, p0}, LE3/t2;-><init>(LE3/B2;)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v1, 0x1f4

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private static I1(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p0}, LE3/L6;->h(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static J1(LF3/v;)LF3/v;
    .locals 9

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, LF3/v;->k()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v0, v0, v1

    .line 11
    .line 12
    if-gtz v0, :cond_1

    .line 13
    .line 14
    const-string v0, "MCImplLegacy"

    .line 15
    .line 16
    const-string v1, "Adjusting playback speed to 1.0f because negative playback speed isn\'t supported."

    .line 17
    .line 18
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, LF3/v$c;

    .line 22
    .line 23
    invoke-direct {v2, p0}, LF3/v$c;-><init>(LF3/v;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LF3/v;->o()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p0}, LF3/v;->m()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    const/high16 v6, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-virtual {p0}, LF3/v;->j()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    invoke-virtual/range {v2 .. v8}, LF3/v$c;->h(IJFJ)LF3/v$c;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, LF3/v$c;->b()LF3/v;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :cond_1
    return-object p0
.end method

.method private static K1(LE3/O6;Lq2/I;ILq2/I;IZLE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;Lq2/N;LE3/V6;JJJIJZLq2/O;Lq2/c;ZIZLq2/p;IZJJJ)LE3/B2$d;
    .locals 35

    move/from16 v0, p2

    move-object/from16 v11, p0

    .line 1
    invoke-virtual {v11, v0}, LE3/O6;->G(I)Lq2/C;

    move-result-object v1

    move-wide/from16 v2, p14

    move/from16 v14, p21

    .line 2
    invoke-static {v0, v1, v2, v3, v14}, LE3/B2;->L1(ILq2/C;JZ)Lq2/P$e;

    move-result-object v13

    .line 3
    new-instance v12, LE3/W6;

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v15

    const-wide v24, -0x7fffffffffffffffL    # -4.9E-324

    move-wide/from16 v26, p12

    move-wide/from16 v28, p16

    move-wide/from16 v17, p12

    move-wide/from16 v19, p16

    move/from16 v21, p18

    move-wide/from16 v22, p19

    invoke-direct/range {v12 .. v29}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 5
    new-instance v0, LE3/M6;

    sget-object v4, LE3/W6;->k:Lq2/P$e;

    sget-object v10, Lq2/l0;->e:Lq2/l0;

    sget-object v16, Ls2/e;->d:Ls2/e;

    sget-object v33, Lq2/h0;->b:Lq2/h0;

    sget-object v34, Lq2/d0;->F:Lq2/d0;

    const/4 v2, 0x0

    const/4 v6, 0x0

    move-object v3, v12

    const/4 v12, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object v5, v4

    move-object/from16 v26, p1

    move-object/from16 v13, p3

    move/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v1, p10

    move-object/from16 v7, p22

    move-object/from16 v15, p23

    move/from16 v20, p24

    move/from16 v23, p25

    move/from16 v24, p26

    move-object/from16 v17, p27

    move/from16 v18, p28

    move/from16 v19, p29

    move-wide/from16 v27, p30

    move-wide/from16 v29, p32

    move-wide/from16 v31, p34

    invoke-direct/range {v0 .. v34}, LE3/M6;-><init>(Lq2/N;ILE3/W6;Lq2/P$e;Lq2/P$e;ILq2/O;IZLq2/l0;Lq2/Y;ILq2/I;FLq2/c;Ls2/e;Lq2/p;IZZIIIZZLq2/I;JJJLq2/h0;Lq2/d0;)V

    .line 6
    new-instance v1, LE3/B2$d;

    move-object/from16 p14, p6

    move-object/from16 p15, p7

    move-object/from16 p16, p8

    move-object/from16 p17, p9

    move-object/from16 p18, p11

    move-object/from16 p13, v0

    move-object/from16 p12, v1

    invoke-direct/range {p12 .. p18}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    move-object/from16 v0, p12

    return-object v0
.end method

.method private static L1(ILq2/C;JZ)Lq2/P$e;
    .locals 12

    .line 1
    new-instance v0, Lq2/P$e;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    move v10, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v10, v1

    .line 10
    :goto_0
    if-eqz p4, :cond_1

    .line 11
    .line 12
    move v11, v2

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    move v11, v1

    .line 15
    :goto_1
    const/4 v1, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move v5, p0

    .line 18
    move-wide v8, p2

    .line 19
    move v2, p0

    .line 20
    move-object v3, p1

    .line 21
    move-wide v6, p2

    .line 22
    invoke-direct/range {v0 .. v11}, Lq2/P$e;-><init>(Ljava/lang/Object;ILq2/C;Ljava/lang/Object;IJJII)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method private static M1(Lq2/P$e;ZJJIJ)LE3/W6;
    .locals 18

    .line 1
    new-instance v0, LE3/W6;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    move-wide/from16 v14, p2

    .line 13
    .line 14
    move-wide/from16 v16, p4

    .line 15
    .line 16
    move-object/from16 v1, p0

    .line 17
    .line 18
    move/from16 v2, p1

    .line 19
    .line 20
    move-wide/from16 v5, p2

    .line 21
    .line 22
    move-wide/from16 v7, p4

    .line 23
    .line 24
    move/from16 v9, p6

    .line 25
    .line 26
    move-wide/from16 v10, p7

    .line 27
    .line 28
    invoke-direct/range {v0 .. v17}, LE3/W6;-><init>(Lq2/P$e;ZJJJIJJJJ)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method private static N1(Ljava/util/List;J)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    const-wide/16 v1, -0x1

    .line 5
    .line 6
    cmp-long v1, p1, v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, LF3/n$h;

    .line 23
    .line 24
    invoke-virtual {v2}, LF3/n$h;->d()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    cmp-long v2, v2, p1

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :goto_1
    return v0
.end method

.method private static O1(LF3/v;)J
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, -0x1

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    invoke-virtual {p0}, LF3/v;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method private static R1(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 4
    .line 5
    :cond_0
    return-object p0
.end method

.method private static S1(LF3/j;)Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    invoke-virtual {p0}, LF3/j;->f()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/media/session/MediaController;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/media/session/MediaController;->getPlaybackInfo()Landroid/media/session/MediaController$PlaybackInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    return-object v2

    .line 22
    :cond_1
    invoke-static {p0}, LE3/Y1;->a(Landroid/media/session/MediaController$PlaybackInfo;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method private T1(Ljava/util/List;Ljava/util/List;I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/google/common/util/concurrent/p;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-static {v1}, Lcom/google/common/util/concurrent/j;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :catch_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :catch_1
    move-exception v1

    .line 26
    :goto_1
    const-string v2, "MCImplLegacy"

    .line 27
    .line 28
    const-string v3, "Failed to get bitmap"

    .line 29
    .line 30
    invoke-static {v2, v3, v1}, Lt2/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_2
    iget-object v2, p0, LE3/B2;->j:LF3/j;

    .line 35
    .line 36
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lq2/C;

    .line 41
    .line 42
    invoke-static {v3, v1}, LE3/t;->t(Lq2/C;Landroid/graphics/Bitmap;)LF3/l;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    add-int v3, p3, v0

    .line 47
    .line 48
    invoke-virtual {v2, v1, v3}, LF3/j;->a(LF3/l;I)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-void
.end method

.method private U1(ZLE3/B2$e;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, LE3/B2;->l:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-boolean v1, v0, LE3/B2;->m:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v3, v0, LE3/B2;->n:LE3/B2$e;

    .line 14
    .line 15
    iget-object v4, v0, LE3/B2;->q:LE3/B2$d;

    .line 16
    .line 17
    iget-object v1, v0, LE3/B2;->j:LF3/j;

    .line 18
    .line 19
    invoke-virtual {v1}, LF3/j;->h()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v1, v0, LE3/B2;->j:LF3/j;

    .line 24
    .line 25
    invoke-virtual {v1}, LF3/j;->e()J

    .line 26
    .line 27
    .line 28
    move-result-wide v7

    .line 29
    iget-object v1, v0, LE3/B2;->j:LF3/j;

    .line 30
    .line 31
    invoke-virtual {v1}, LF3/j;->r()Z

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    iget-object v1, v0, LE3/B2;->j:LF3/j;

    .line 36
    .line 37
    invoke-virtual {v1}, LF3/j;->m()I

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    invoke-virtual {v0}, LE3/B2;->Q1()LE3/A;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, LE3/A;->f1()J

    .line 46
    .line 47
    .line 48
    move-result-wide v11

    .line 49
    iget-object v1, v0, LE3/B2;->j:LF3/j;

    .line 50
    .line 51
    invoke-static {v1}, LE3/B2;->S1(LF3/j;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    iget-boolean v14, v0, LE3/B2;->p:Z

    .line 56
    .line 57
    iget-object v15, v0, LE3/B2;->a:Landroid/content/Context;

    .line 58
    .line 59
    move/from16 v2, p1

    .line 60
    .line 61
    move-object/from16 v5, p2

    .line 62
    .line 63
    invoke-static/range {v2 .. v15}, LE3/B2;->C1(ZLE3/B2$e;LE3/B2$d;LE3/B2$e;Ljava/lang/String;JZIJLjava/lang/String;ZLandroid/content/Context;)LE3/B2$d;

    .line 64
    .line 65
    .line 66
    move-result-object v19

    .line 67
    iget-object v1, v0, LE3/B2;->n:LE3/B2$e;

    .line 68
    .line 69
    iget-object v2, v0, LE3/B2;->q:LE3/B2$d;

    .line 70
    .line 71
    invoke-virtual {v0}, LE3/B2;->Q1()LE3/A;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3}, LE3/A;->f1()J

    .line 76
    .line 77
    .line 78
    move-result-wide v20

    .line 79
    move-object/from16 v18, p2

    .line 80
    .line 81
    move-object/from16 v16, v1

    .line 82
    .line 83
    move-object/from16 v17, v2

    .line 84
    .line 85
    invoke-static/range {v16 .. v21}, LE3/B2;->F1(LE3/B2$e;LE3/B2$d;LE3/B2$e;LE3/B2$d;J)Landroid/util/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v5, v2

    .line 92
    check-cast v5, Ljava/lang/Integer;

    .line 93
    .line 94
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v6, v1

    .line 97
    check-cast v6, Ljava/lang/Integer;

    .line 98
    .line 99
    const/4 v3, 0x1

    .line 100
    move/from16 v1, p1

    .line 101
    .line 102
    move-object/from16 v2, p2

    .line 103
    .line 104
    move-object/from16 v4, v19

    .line 105
    .line 106
    invoke-direct/range {v0 .. v6}, LE3/B2;->d2(ZLE3/B2$e;ZLE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 107
    .line 108
    .line 109
    iget-boolean v1, v0, LE3/B2;->p:Z

    .line 110
    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    iput-boolean v1, v0, LE3/B2;->p:Z

    .line 115
    .line 116
    invoke-virtual {v0}, LE3/B2;->Q1()LE3/A;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    new-instance v2, LE3/s2;

    .line 121
    .line 122
    move-object/from16 v5, p2

    .line 123
    .line 124
    invoke-direct {v2, v0, v5}, LE3/s2;-><init>(LE3/B2;LE3/B2$e;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, LE3/A;->i1(Lt2/n;)V

    .line 128
    .line 129
    .line 130
    :cond_1
    :goto_0
    return-void
.end method

.method private V1()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lq2/Y;->u()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0
.end method

.method private static W1(Ljava/util/concurrent/Future;)V
    .locals 0

    .line 1
    return-void
.end method

.method private X1()V
    .locals 11

    .line 1
    new-instance v0, Lq2/Y$d;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/Y$d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LE3/B2;->Y1()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, LE3/B2;->V1()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    invoke-static {v1}, Lt2/a;->g(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LE3/B2;->q:LE3/B2$d;

    .line 26
    .line 27
    iget-object v1, v1, LE3/B2$d;->a:LE3/M6;

    .line 28
    .line 29
    iget-object v3, v1, LE3/M6;->j:Lq2/Y;

    .line 30
    .line 31
    check-cast v3, LE3/O6;

    .line 32
    .line 33
    iget-object v1, v1, LE3/M6;->c:LE3/W6;

    .line 34
    .line 35
    iget-object v1, v1, LE3/W6;->a:Lq2/P$e;

    .line 36
    .line 37
    iget v1, v1, Lq2/P$e;->c:I

    .line 38
    .line 39
    invoke-virtual {v3, v1, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v4, v4, Lq2/Y$d;->c:Lq2/C;

    .line 44
    .line 45
    invoke-virtual {v3, v1}, LE3/O6;->H(I)J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    const-wide/16 v7, -0x1

    .line 50
    .line 51
    cmp-long v5, v5, v7

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    iget-object v4, p0, LE3/B2;->q:LE3/B2$d;

    .line 56
    .line 57
    iget-object v4, v4, LE3/B2$d;->a:LE3/M6;

    .line 58
    .line 59
    iget-boolean v4, v4, LE3/M6;->t:Z

    .line 60
    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    iget-object v4, p0, LE3/B2;->j:LF3/j;

    .line 64
    .line 65
    invoke-virtual {v4}, LF3/j;->p()LF3/j$f;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, LF3/j$f;->c()V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_1
    iget-object v4, p0, LE3/B2;->j:LF3/j;

    .line 75
    .line 76
    invoke-virtual {v4}, LF3/j;->p()LF3/j$f;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4}, LF3/j$f;->g()V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_2
    iget-object v5, v4, Lq2/C;->h:Lq2/C$i;

    .line 86
    .line 87
    iget-object v6, v5, Lq2/C$i;->a:Landroid/net/Uri;

    .line 88
    .line 89
    if-eqz v6, :cond_4

    .line 90
    .line 91
    iget-object v5, p0, LE3/B2;->q:LE3/B2$d;

    .line 92
    .line 93
    iget-object v5, v5, LE3/B2$d;->a:LE3/M6;

    .line 94
    .line 95
    iget-boolean v5, v5, LE3/M6;->t:Z

    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    iget-object v5, p0, LE3/B2;->j:LF3/j;

    .line 100
    .line 101
    invoke-virtual {v5}, LF3/j;->p()LF3/j$f;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    iget-object v4, v4, Lq2/C;->h:Lq2/C$i;

    .line 106
    .line 107
    iget-object v6, v4, Lq2/C$i;->a:Landroid/net/Uri;

    .line 108
    .line 109
    iget-object v4, v4, Lq2/C$i;->c:Landroid/os/Bundle;

    .line 110
    .line 111
    invoke-static {v4}, LE3/B2;->R1(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v5, v6, v4}, LF3/j$f;->f(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_1

    .line 119
    .line 120
    :cond_3
    iget-object v5, p0, LE3/B2;->j:LF3/j;

    .line 121
    .line 122
    invoke-virtual {v5}, LF3/j;->p()LF3/j$f;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    iget-object v4, v4, Lq2/C;->h:Lq2/C$i;

    .line 127
    .line 128
    iget-object v6, v4, Lq2/C$i;->a:Landroid/net/Uri;

    .line 129
    .line 130
    iget-object v4, v4, Lq2/C$i;->c:Landroid/os/Bundle;

    .line 131
    .line 132
    invoke-static {v4}, LE3/B2;->R1(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v5, v6, v4}, LF3/j$f;->j(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    iget-object v5, v5, Lq2/C$i;->b:Ljava/lang/String;

    .line 141
    .line 142
    if-eqz v5, :cond_6

    .line 143
    .line 144
    iget-object v5, p0, LE3/B2;->q:LE3/B2$d;

    .line 145
    .line 146
    iget-object v5, v5, LE3/B2$d;->a:LE3/M6;

    .line 147
    .line 148
    iget-boolean v5, v5, LE3/M6;->t:Z

    .line 149
    .line 150
    if-eqz v5, :cond_5

    .line 151
    .line 152
    iget-object v5, p0, LE3/B2;->j:LF3/j;

    .line 153
    .line 154
    invoke-virtual {v5}, LF3/j;->p()LF3/j$f;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    iget-object v4, v4, Lq2/C;->h:Lq2/C$i;

    .line 159
    .line 160
    iget-object v6, v4, Lq2/C$i;->b:Ljava/lang/String;

    .line 161
    .line 162
    iget-object v4, v4, Lq2/C$i;->c:Landroid/os/Bundle;

    .line 163
    .line 164
    invoke-static {v4}, LE3/B2;->R1(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v5, v6, v4}, LF3/j$f;->e(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_5
    iget-object v5, p0, LE3/B2;->j:LF3/j;

    .line 173
    .line 174
    invoke-virtual {v5}, LF3/j;->p()LF3/j$f;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    iget-object v4, v4, Lq2/C;->h:Lq2/C$i;

    .line 179
    .line 180
    iget-object v6, v4, Lq2/C$i;->b:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v4, v4, Lq2/C$i;->c:Landroid/os/Bundle;

    .line 183
    .line 184
    invoke-static {v4}, LE3/B2;->R1(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v5, v6, v4}, LF3/j$f;->i(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_6
    iget-object v5, p0, LE3/B2;->q:LE3/B2$d;

    .line 193
    .line 194
    iget-object v5, v5, LE3/B2$d;->a:LE3/M6;

    .line 195
    .line 196
    iget-boolean v5, v5, LE3/M6;->t:Z

    .line 197
    .line 198
    if-eqz v5, :cond_7

    .line 199
    .line 200
    iget-object v5, p0, LE3/B2;->j:LF3/j;

    .line 201
    .line 202
    invoke-virtual {v5}, LF3/j;->p()LF3/j$f;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    iget-object v6, v4, Lq2/C;->a:Ljava/lang/String;

    .line 207
    .line 208
    iget-object v4, v4, Lq2/C;->h:Lq2/C$i;

    .line 209
    .line 210
    iget-object v4, v4, Lq2/C$i;->c:Landroid/os/Bundle;

    .line 211
    .line 212
    invoke-static {v4}, LE3/B2;->R1(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v5, v6, v4}, LF3/j$f;->d(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_7
    iget-object v5, p0, LE3/B2;->j:LF3/j;

    .line 221
    .line 222
    invoke-virtual {v5}, LF3/j;->p()LF3/j$f;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    iget-object v6, v4, Lq2/C;->a:Ljava/lang/String;

    .line 227
    .line 228
    iget-object v4, v4, Lq2/C;->h:Lq2/C$i;

    .line 229
    .line 230
    iget-object v4, v4, Lq2/C$i;->c:Landroid/os/Bundle;

    .line 231
    .line 232
    invoke-static {v4}, LE3/B2;->R1(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v5, v6, v4}, LF3/j$f;->h(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 237
    .line 238
    .line 239
    :goto_1
    iget-object v4, p0, LE3/B2;->q:LE3/B2$d;

    .line 240
    .line 241
    iget-object v4, v4, LE3/B2$d;->a:LE3/M6;

    .line 242
    .line 243
    iget-object v4, v4, LE3/M6;->c:LE3/W6;

    .line 244
    .line 245
    iget-object v4, v4, LE3/W6;->a:Lq2/P$e;

    .line 246
    .line 247
    iget-wide v4, v4, Lq2/P$e;->g:J

    .line 248
    .line 249
    const-wide/16 v9, 0x0

    .line 250
    .line 251
    cmp-long v4, v4, v9

    .line 252
    .line 253
    if-eqz v4, :cond_8

    .line 254
    .line 255
    iget-object v4, p0, LE3/B2;->j:LF3/j;

    .line 256
    .line 257
    invoke-virtual {v4}, LF3/j;->p()LF3/j$f;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    iget-object v5, p0, LE3/B2;->q:LE3/B2$d;

    .line 262
    .line 263
    iget-object v5, v5, LE3/B2$d;->a:LE3/M6;

    .line 264
    .line 265
    iget-object v5, v5, LE3/M6;->c:LE3/W6;

    .line 266
    .line 267
    iget-object v5, v5, LE3/W6;->a:Lq2/P$e;

    .line 268
    .line 269
    iget-wide v5, v5, Lq2/P$e;->g:J

    .line 270
    .line 271
    invoke-virtual {v4, v5, v6}, LF3/j$f;->l(J)V

    .line 272
    .line 273
    .line 274
    :cond_8
    invoke-virtual {p0}, LE3/B2;->p0()Lq2/P$b;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    const/16 v5, 0x14

    .line 279
    .line 280
    invoke-virtual {v4, v5}, Lq2/P$b;->c(I)Z

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-eqz v4, :cond_c

    .line 285
    .line 286
    new-instance v4, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .line 290
    .line 291
    move v5, v2

    .line 292
    :goto_2
    invoke-virtual {v3}, LE3/O6;->t()I

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    if-ge v5, v6, :cond_b

    .line 297
    .line 298
    if-eq v5, v1, :cond_a

    .line 299
    .line 300
    invoke-virtual {v3, v5}, LE3/O6;->H(I)J

    .line 301
    .line 302
    .line 303
    move-result-wide v9

    .line 304
    cmp-long v6, v9, v7

    .line 305
    .line 306
    if-eqz v6, :cond_9

    .line 307
    .line 308
    goto :goto_3

    .line 309
    :cond_9
    invoke-virtual {v3, v5, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    iget-object v6, v6, Lq2/Y$d;->c:Lq2/C;

    .line 314
    .line 315
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    :cond_a
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_b
    invoke-direct {p0, v4, v2}, LE3/B2;->B1(Ljava/util/List;I)V

    .line 322
    .line 323
    .line 324
    :cond_c
    return-void
.end method

.method private Y1()Z
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget v0, v0, LE3/M6;->y:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private a2(IJ)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    if-ltz v1, :cond_0

    .line 10
    .line 11
    move v6, v4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v6, v5

    .line 14
    :goto_0
    invoke-static {v6}, Lt2/a;->a(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, LE3/B2;->K0()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    iget-object v7, v0, LE3/B2;->q:LE3/B2$d;

    .line 22
    .line 23
    iget-object v7, v7, LE3/B2$d;->a:LE3/M6;

    .line 24
    .line 25
    iget-object v7, v7, LE3/M6;->j:Lq2/Y;

    .line 26
    .line 27
    invoke-virtual {v7}, Lq2/Y;->u()Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-nez v8, :cond_1

    .line 32
    .line 33
    invoke-virtual {v7}, Lq2/Y;->t()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    if-ge v1, v8, :cond_2

    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, LE3/B2;->D()Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_3

    .line 44
    .line 45
    :cond_2
    return-void

    .line 46
    :cond_3
    const/4 v8, 0x2

    .line 47
    const/4 v9, 0x0

    .line 48
    if-eq v1, v6, :cond_5

    .line 49
    .line 50
    iget-object v10, v0, LE3/B2;->q:LE3/B2$d;

    .line 51
    .line 52
    iget-object v10, v10, LE3/B2$d;->a:LE3/M6;

    .line 53
    .line 54
    iget-object v10, v10, LE3/M6;->j:Lq2/Y;

    .line 55
    .line 56
    check-cast v10, LE3/O6;

    .line 57
    .line 58
    invoke-virtual {v10, v1}, LE3/O6;->H(I)J

    .line 59
    .line 60
    .line 61
    move-result-wide v10

    .line 62
    const-wide/16 v12, -0x1

    .line 63
    .line 64
    cmp-long v12, v10, v12

    .line 65
    .line 66
    if-eqz v12, :cond_4

    .line 67
    .line 68
    iget-object v6, v0, LE3/B2;->j:LF3/j;

    .line 69
    .line 70
    invoke-virtual {v6}, LF3/j;->p()LF3/j$f;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v6, v10, v11}, LF3/j$f;->s(J)V

    .line 75
    .line 76
    .line 77
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    goto :goto_1

    .line 82
    :cond_4
    new-instance v10, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v11, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex="

    .line 88
    .line 89
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v10, "MCImplLegacy"

    .line 100
    .line 101
    invoke-static {v10, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    move v1, v6

    .line 105
    move-object v6, v9

    .line 106
    :goto_1
    invoke-virtual {v0}, LE3/B2;->getCurrentPosition()J

    .line 107
    .line 108
    .line 109
    move-result-wide v10

    .line 110
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    cmp-long v14, v2, v12

    .line 116
    .line 117
    if-nez v14, :cond_6

    .line 118
    .line 119
    move-object v14, v9

    .line 120
    move-wide v2, v10

    .line 121
    goto :goto_2

    .line 122
    :cond_6
    iget-object v14, v0, LE3/B2;->j:LF3/j;

    .line 123
    .line 124
    invoke-virtual {v14}, LF3/j;->p()LF3/j$f;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    invoke-virtual {v14, v2, v3}, LF3/j$f;->l(J)V

    .line 129
    .line 130
    .line 131
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    :goto_2
    if-nez v6, :cond_9

    .line 136
    .line 137
    move-wide v15, v12

    .line 138
    invoke-virtual {v0}, LE3/B2;->I0()J

    .line 139
    .line 140
    .line 141
    move-result-wide v12

    .line 142
    invoke-virtual {v0}, LE3/B2;->getDuration()J

    .line 143
    .line 144
    .line 145
    move-result-wide v17

    .line 146
    cmp-long v10, v2, v10

    .line 147
    .line 148
    if-gez v10, :cond_7

    .line 149
    .line 150
    move-wide v10, v2

    .line 151
    goto :goto_3

    .line 152
    :cond_7
    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 153
    .line 154
    .line 155
    move-result-wide v10

    .line 156
    :goto_3
    cmp-long v12, v17, v15

    .line 157
    .line 158
    if-nez v12, :cond_8

    .line 159
    .line 160
    move v12, v5

    .line 161
    goto :goto_4

    .line 162
    :cond_8
    const-wide/16 v12, 0x64

    .line 163
    .line 164
    mul-long/2addr v12, v10

    .line 165
    div-long v12, v12, v17

    .line 166
    .line 167
    long-to-int v12, v12

    .line 168
    :goto_4
    sub-long v15, v10, v2

    .line 169
    .line 170
    move-wide/from16 v21, v10

    .line 171
    .line 172
    move/from16 v23, v12

    .line 173
    .line 174
    move-wide/from16 v24, v15

    .line 175
    .line 176
    move-wide/from16 v19, v17

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_9
    move-wide v15, v12

    .line 180
    const-wide/16 v10, 0x0

    .line 181
    .line 182
    move/from16 v23, v5

    .line 183
    .line 184
    move-wide/from16 v21, v10

    .line 185
    .line 186
    move-wide/from16 v24, v21

    .line 187
    .line 188
    move-wide/from16 v19, v15

    .line 189
    .line 190
    :goto_5
    invoke-virtual {v7}, Lq2/Y;->u()Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-nez v10, :cond_a

    .line 195
    .line 196
    new-instance v10, Lq2/Y$d;

    .line 197
    .line 198
    invoke-direct {v10}, Lq2/Y$d;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7, v1, v10}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    iget-object v7, v7, Lq2/Y$d;->c:Lq2/C;

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_a
    move-object v7, v9

    .line 209
    :goto_6
    invoke-static {v1, v7, v2, v3, v5}, LE3/B2;->L1(ILq2/C;JZ)Lq2/P$e;

    .line 210
    .line 211
    .line 212
    move-result-object v17

    .line 213
    iget-object v1, v0, LE3/B2;->q:LE3/B2$d;

    .line 214
    .line 215
    iget-object v1, v1, LE3/B2$d;->a:LE3/M6;

    .line 216
    .line 217
    const/16 v18, 0x0

    .line 218
    .line 219
    invoke-static/range {v17 .. v25}, LE3/B2;->M1(Lq2/P$e;ZJJIJ)LE3/W6;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v1, v2}, LE3/M6;->s(LE3/W6;)LE3/M6;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iget v2, v1, LE3/M6;->y:I

    .line 228
    .line 229
    if-eq v2, v4, :cond_b

    .line 230
    .line 231
    invoke-virtual {v1, v8, v9}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    :cond_b
    move-object v8, v1

    .line 236
    new-instance v7, LE3/B2$d;

    .line 237
    .line 238
    iget-object v1, v0, LE3/B2;->q:LE3/B2$d;

    .line 239
    .line 240
    iget-object v9, v1, LE3/B2$d;->b:LE3/U6;

    .line 241
    .line 242
    iget-object v10, v1, LE3/B2$d;->c:Lq2/P$b;

    .line 243
    .line 244
    iget-object v11, v1, LE3/B2$d;->d:LP9/u;

    .line 245
    .line 246
    iget-object v12, v1, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    invoke-direct/range {v7 .. v13}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v0, v7, v14, v6}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 253
    .line 254
    .line 255
    return-void
.end method

.method public static synthetic b(LE3/B2$d;Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->t:Z

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    invoke-interface {p1, p0, v0}, Lq2/P$d;->s0(ZI)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic b1(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-object p0, p0, LE3/M6;->g:Lq2/O;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->n(Lq2/O;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic c1(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->v:Z

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->y0(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic d(Lq2/N;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->H(Lq2/N;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d1(LE3/B2;LE3/B2$d;LE3/A$c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, LE3/B2$d;->d:LP9/u;

    .line 6
    .line 7
    invoke-interface {p2, v0, v1}, LE3/A$c;->O(LE3/A;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LE3/B2;->W1(Ljava/util/concurrent/Future;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p1, LE3/B2$d;->d:LP9/u;

    .line 19
    .line 20
    invoke-interface {p2, v0, v1}, LE3/A$c;->K(LE3/A;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object p1, p1, LE3/B2$d;->d:LP9/u;

    .line 28
    .line 29
    invoke-interface {p2, p0, p1}, LE3/A$c;->G(LE3/A;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private d2(ZLE3/B2$e;ZLE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/B2;->n:LE3/B2$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2;->q:LE3/B2$d;

    .line 4
    .line 5
    if-eq v0, p2, :cond_0

    .line 6
    .line 7
    new-instance v2, LE3/B2$e;

    .line 8
    .line 9
    invoke-direct {v2, p2}, LE3/B2$e;-><init>(LE3/B2$e;)V

    .line 10
    .line 11
    .line 12
    iput-object v2, p0, LE3/B2;->n:LE3/B2$e;

    .line 13
    .line 14
    :cond_0
    if-eqz p3, :cond_1

    .line 15
    .line 16
    iget-object p3, p0, LE3/B2;->n:LE3/B2$e;

    .line 17
    .line 18
    iput-object p3, p0, LE3/B2;->o:LE3/B2$e;

    .line 19
    .line 20
    :cond_1
    iput-object p4, p0, LE3/B2;->q:LE3/B2$d;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, LE3/A;->h1()V

    .line 29
    .line 30
    .line 31
    iget-object p1, v1, LE3/B2$d;->d:LP9/u;

    .line 32
    .line 33
    iget-object p2, p4, LE3/B2$d;->d:LP9/u;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p1, p1, LE3/A;->e:Landroid/os/Handler;

    .line 46
    .line 47
    new-instance p2, LE3/w2;

    .line 48
    .line 49
    invoke-direct {p2, p0, p4}, LE3/w2;-><init>(LE3/B2;LE3/B2$d;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void

    .line 56
    :cond_3
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 57
    .line 58
    iget-object p1, p1, LE3/M6;->j:Lq2/Y;

    .line 59
    .line 60
    iget-object p3, p4, LE3/B2$d;->a:LE3/M6;

    .line 61
    .line 62
    iget-object p3, p3, LE3/M6;->j:Lq2/Y;

    .line 63
    .line 64
    invoke-virtual {p1, p3}, Lq2/Y;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 71
    .line 72
    new-instance p3, LE3/f2;

    .line 73
    .line 74
    invoke-direct {p3, p4}, LE3/f2;-><init>(LE3/B2$d;)V

    .line 75
    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-virtual {p1, v2, p3}, Lt2/v;->h(ILt2/v$a;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    iget-object p1, v0, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 82
    .line 83
    iget-object p3, p2, LE3/B2$e;->e:Ljava/lang/CharSequence;

    .line 84
    .line 85
    invoke-static {p1, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 92
    .line 93
    new-instance p3, LE3/h2;

    .line 94
    .line 95
    invoke-direct {p3, p4}, LE3/h2;-><init>(LE3/B2$d;)V

    .line 96
    .line 97
    .line 98
    const/16 v2, 0xf

    .line 99
    .line 100
    invoke-virtual {p1, v2, p3}, Lt2/v;->h(ILt2/v$a;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    if-eqz p5, :cond_6

    .line 104
    .line 105
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 106
    .line 107
    new-instance p3, LE3/i2;

    .line 108
    .line 109
    invoke-direct {p3, v1, p4, p5}, LE3/i2;-><init>(LE3/B2$d;LE3/B2$d;Ljava/lang/Integer;)V

    .line 110
    .line 111
    .line 112
    const/16 p5, 0xb

    .line 113
    .line 114
    invoke-virtual {p1, p5, p3}, Lt2/v;->h(ILt2/v$a;)V

    .line 115
    .line 116
    .line 117
    :cond_6
    if-eqz p6, :cond_7

    .line 118
    .line 119
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 120
    .line 121
    new-instance p3, LE3/k2;

    .line 122
    .line 123
    invoke-direct {p3, p4, p6}, LE3/k2;-><init>(LE3/B2$d;Ljava/lang/Integer;)V

    .line 124
    .line 125
    .line 126
    const/4 p5, 0x1

    .line 127
    invoke-virtual {p1, p5, p3}, Lt2/v;->h(ILt2/v$a;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    iget-object p1, v0, LE3/B2$e;->b:LF3/v;

    .line 131
    .line 132
    iget-object p3, p2, LE3/B2$e;->b:LF3/v;

    .line 133
    .line 134
    invoke-static {p1, p3}, LE3/L6;->a(LF3/v;LF3/v;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_8

    .line 139
    .line 140
    iget-object p1, p2, LE3/B2$e;->b:LF3/v;

    .line 141
    .line 142
    iget-object p3, p0, LE3/B2;->a:Landroid/content/Context;

    .line 143
    .line 144
    invoke-static {p1, p3}, LE3/t;->H(LF3/v;Landroid/content/Context;)Lq2/N;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    iget-object p3, p0, LE3/B2;->d:Lt2/v;

    .line 149
    .line 150
    new-instance p5, LE3/l2;

    .line 151
    .line 152
    invoke-direct {p5, p1}, LE3/l2;-><init>(Lq2/N;)V

    .line 153
    .line 154
    .line 155
    const/16 p6, 0xa

    .line 156
    .line 157
    invoke-virtual {p3, p6, p5}, Lt2/v;->h(ILt2/v$a;)V

    .line 158
    .line 159
    .line 160
    if-eqz p1, :cond_8

    .line 161
    .line 162
    iget-object p3, p0, LE3/B2;->d:Lt2/v;

    .line 163
    .line 164
    new-instance p5, LE3/m2;

    .line 165
    .line 166
    invoke-direct {p5, p1}, LE3/m2;-><init>(Lq2/N;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p3, p6, p5}, Lt2/v;->h(ILt2/v$a;)V

    .line 170
    .line 171
    .line 172
    :cond_8
    iget-object p1, v0, LE3/B2$e;->c:LF3/m;

    .line 173
    .line 174
    iget-object p2, p2, LE3/B2$e;->c:LF3/m;

    .line 175
    .line 176
    if-eq p1, p2, :cond_9

    .line 177
    .line 178
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 179
    .line 180
    new-instance p2, LE3/n2;

    .line 181
    .line 182
    invoke-direct {p2, p0}, LE3/n2;-><init>(LE3/B2;)V

    .line 183
    .line 184
    .line 185
    const/16 p3, 0xe

    .line 186
    .line 187
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 188
    .line 189
    .line 190
    :cond_9
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 191
    .line 192
    iget p1, p1, LE3/M6;->y:I

    .line 193
    .line 194
    iget-object p2, p4, LE3/B2$d;->a:LE3/M6;

    .line 195
    .line 196
    iget p2, p2, LE3/M6;->y:I

    .line 197
    .line 198
    if-eq p1, p2, :cond_a

    .line 199
    .line 200
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 201
    .line 202
    new-instance p2, LE3/o2;

    .line 203
    .line 204
    invoke-direct {p2, p4}, LE3/o2;-><init>(LE3/B2$d;)V

    .line 205
    .line 206
    .line 207
    const/4 p3, 0x4

    .line 208
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 209
    .line 210
    .line 211
    :cond_a
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 212
    .line 213
    iget-boolean p1, p1, LE3/M6;->t:Z

    .line 214
    .line 215
    iget-object p2, p4, LE3/B2$d;->a:LE3/M6;

    .line 216
    .line 217
    iget-boolean p2, p2, LE3/M6;->t:Z

    .line 218
    .line 219
    if-eq p1, p2, :cond_b

    .line 220
    .line 221
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 222
    .line 223
    new-instance p2, LE3/p2;

    .line 224
    .line 225
    invoke-direct {p2, p4}, LE3/p2;-><init>(LE3/B2$d;)V

    .line 226
    .line 227
    .line 228
    const/4 p3, 0x5

    .line 229
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 230
    .line 231
    .line 232
    :cond_b
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 233
    .line 234
    iget-boolean p1, p1, LE3/M6;->v:Z

    .line 235
    .line 236
    iget-object p2, p4, LE3/B2$d;->a:LE3/M6;

    .line 237
    .line 238
    iget-boolean p2, p2, LE3/M6;->v:Z

    .line 239
    .line 240
    if-eq p1, p2, :cond_c

    .line 241
    .line 242
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 243
    .line 244
    new-instance p2, LE3/x2;

    .line 245
    .line 246
    invoke-direct {p2, p4}, LE3/x2;-><init>(LE3/B2$d;)V

    .line 247
    .line 248
    .line 249
    const/4 p3, 0x7

    .line 250
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 251
    .line 252
    .line 253
    :cond_c
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 254
    .line 255
    iget-object p1, p1, LE3/M6;->g:Lq2/O;

    .line 256
    .line 257
    iget-object p2, p4, LE3/B2$d;->a:LE3/M6;

    .line 258
    .line 259
    iget-object p2, p2, LE3/M6;->g:Lq2/O;

    .line 260
    .line 261
    invoke-virtual {p1, p2}, Lq2/O;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-nez p1, :cond_d

    .line 266
    .line 267
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 268
    .line 269
    new-instance p2, LE3/y2;

    .line 270
    .line 271
    invoke-direct {p2, p4}, LE3/y2;-><init>(LE3/B2$d;)V

    .line 272
    .line 273
    .line 274
    const/16 p3, 0xc

    .line 275
    .line 276
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 277
    .line 278
    .line 279
    :cond_d
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 280
    .line 281
    iget p1, p1, LE3/M6;->h:I

    .line 282
    .line 283
    iget-object p2, p4, LE3/B2$d;->a:LE3/M6;

    .line 284
    .line 285
    iget p2, p2, LE3/M6;->h:I

    .line 286
    .line 287
    if-eq p1, p2, :cond_e

    .line 288
    .line 289
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 290
    .line 291
    new-instance p2, LE3/z2;

    .line 292
    .line 293
    invoke-direct {p2, p4}, LE3/z2;-><init>(LE3/B2$d;)V

    .line 294
    .line 295
    .line 296
    const/16 p3, 0x8

    .line 297
    .line 298
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 299
    .line 300
    .line 301
    :cond_e
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 302
    .line 303
    iget-boolean p1, p1, LE3/M6;->i:Z

    .line 304
    .line 305
    iget-object p2, p4, LE3/B2$d;->a:LE3/M6;

    .line 306
    .line 307
    iget-boolean p2, p2, LE3/M6;->i:Z

    .line 308
    .line 309
    if-eq p1, p2, :cond_f

    .line 310
    .line 311
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 312
    .line 313
    new-instance p2, LE3/A2;

    .line 314
    .line 315
    invoke-direct {p2, p4}, LE3/A2;-><init>(LE3/B2$d;)V

    .line 316
    .line 317
    .line 318
    const/16 p3, 0x9

    .line 319
    .line 320
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 321
    .line 322
    .line 323
    :cond_f
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 324
    .line 325
    iget-object p1, p1, LE3/M6;->o:Lq2/c;

    .line 326
    .line 327
    iget-object p2, p4, LE3/B2$d;->a:LE3/M6;

    .line 328
    .line 329
    iget-object p2, p2, LE3/M6;->o:Lq2/c;

    .line 330
    .line 331
    invoke-virtual {p1, p2}, Lq2/c;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    if-nez p1, :cond_10

    .line 336
    .line 337
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 338
    .line 339
    new-instance p2, LE3/Z1;

    .line 340
    .line 341
    invoke-direct {p2, p4}, LE3/Z1;-><init>(LE3/B2$d;)V

    .line 342
    .line 343
    .line 344
    const/16 p3, 0x14

    .line 345
    .line 346
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 347
    .line 348
    .line 349
    :cond_10
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 350
    .line 351
    iget-object p1, p1, LE3/M6;->q:Lq2/p;

    .line 352
    .line 353
    iget-object p2, p4, LE3/B2$d;->a:LE3/M6;

    .line 354
    .line 355
    iget-object p2, p2, LE3/M6;->q:Lq2/p;

    .line 356
    .line 357
    invoke-virtual {p1, p2}, Lq2/p;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result p1

    .line 361
    if-nez p1, :cond_11

    .line 362
    .line 363
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 364
    .line 365
    new-instance p2, LE3/a2;

    .line 366
    .line 367
    invoke-direct {p2, p4}, LE3/a2;-><init>(LE3/B2$d;)V

    .line 368
    .line 369
    .line 370
    const/16 p3, 0x1d

    .line 371
    .line 372
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 373
    .line 374
    .line 375
    :cond_11
    iget-object p1, v1, LE3/B2$d;->a:LE3/M6;

    .line 376
    .line 377
    iget p2, p1, LE3/M6;->r:I

    .line 378
    .line 379
    iget-object p3, p4, LE3/B2$d;->a:LE3/M6;

    .line 380
    .line 381
    iget p5, p3, LE3/M6;->r:I

    .line 382
    .line 383
    if-ne p2, p5, :cond_12

    .line 384
    .line 385
    iget-boolean p1, p1, LE3/M6;->s:Z

    .line 386
    .line 387
    iget-boolean p2, p3, LE3/M6;->s:Z

    .line 388
    .line 389
    if-eq p1, p2, :cond_13

    .line 390
    .line 391
    :cond_12
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 392
    .line 393
    new-instance p2, LE3/b2;

    .line 394
    .line 395
    invoke-direct {p2, p4}, LE3/b2;-><init>(LE3/B2$d;)V

    .line 396
    .line 397
    .line 398
    const/16 p3, 0x1e

    .line 399
    .line 400
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 401
    .line 402
    .line 403
    :cond_13
    iget-object p1, v1, LE3/B2$d;->c:Lq2/P$b;

    .line 404
    .line 405
    iget-object p2, p4, LE3/B2$d;->c:Lq2/P$b;

    .line 406
    .line 407
    invoke-virtual {p1, p2}, Lq2/P$b;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result p1

    .line 411
    if-nez p1, :cond_14

    .line 412
    .line 413
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 414
    .line 415
    new-instance p2, LE3/c2;

    .line 416
    .line 417
    invoke-direct {p2, p4}, LE3/c2;-><init>(LE3/B2$d;)V

    .line 418
    .line 419
    .line 420
    const/16 p3, 0xd

    .line 421
    .line 422
    invoke-virtual {p1, p3, p2}, Lt2/v;->h(ILt2/v$a;)V

    .line 423
    .line 424
    .line 425
    :cond_14
    iget-object p1, v1, LE3/B2$d;->b:LE3/U6;

    .line 426
    .line 427
    iget-object p2, p4, LE3/B2$d;->b:LE3/U6;

    .line 428
    .line 429
    invoke-virtual {p1, p2}, LE3/U6;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    if-nez p1, :cond_15

    .line 434
    .line 435
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    new-instance p2, LE3/d2;

    .line 440
    .line 441
    invoke-direct {p2, p0, p4}, LE3/d2;-><init>(LE3/B2;LE3/B2$d;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {p1, p2}, LE3/A;->i1(Lt2/n;)V

    .line 445
    .line 446
    .line 447
    :cond_15
    iget-object p1, v1, LE3/B2$d;->d:LP9/u;

    .line 448
    .line 449
    iget-object p2, p4, LE3/B2$d;->d:LP9/u;

    .line 450
    .line 451
    invoke-virtual {p1, p2}, LP9/u;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result p1

    .line 455
    if-nez p1, :cond_16

    .line 456
    .line 457
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    new-instance p2, LE3/e2;

    .line 462
    .line 463
    invoke-direct {p2, p0, p4}, LE3/e2;-><init>(LE3/B2;LE3/B2$d;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {p1, p2}, LE3/A;->i1(Lt2/n;)V

    .line 467
    .line 468
    .line 469
    :cond_16
    iget-object p1, p4, LE3/B2$d;->f:LE3/V6;

    .line 470
    .line 471
    if-eqz p1, :cond_17

    .line 472
    .line 473
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    new-instance p2, LE3/g2;

    .line 478
    .line 479
    invoke-direct {p2, p0, p4}, LE3/g2;-><init>(LE3/B2;LE3/B2$d;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {p1, p2}, LE3/A;->i1(Lt2/n;)V

    .line 483
    .line 484
    .line 485
    :cond_17
    iget-object p1, p0, LE3/B2;->d:Lt2/v;

    .line 486
    .line 487
    invoke-virtual {p1}, Lt2/v;->f()V

    .line 488
    .line 489
    .line 490
    return-void
.end method

.method public static synthetic e1(LE3/B2$d;Ljava/lang/Integer;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    invoke-virtual {p0}, LE3/M6;->C()Lq2/C;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-interface {p2, p0, p1}, Lq2/P$d;->E(Lq2/C;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 7

    .line 1
    iget-object v2, p0, LE3/B2;->n:LE3/B2$e;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move-object v4, p1

    .line 7
    move-object v5, p2

    .line 8
    move-object v6, p3

    .line 9
    invoke-direct/range {v0 .. v6}, LE3/B2;->d2(ZLE3/B2$e;ZLE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic f(LE3/B2;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, LF3/e;

    .line 5
    .line 6
    iget-object v1, p0, LE3/B2;->a:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v2, p0, LE3/B2;->c:LE3/Y6;

    .line 9
    .line 10
    invoke-virtual {v2}, LE3/Y6;->b()Landroid/content/ComponentName;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, LE3/B2$b;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct {v3, p0, v4}, LE3/B2$b;-><init>(LE3/B2;LE3/B2$a;)V

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, LE3/B2;->b:LE3/A;

    .line 21
    .line 22
    invoke-virtual {v4}, LE3/A;->d1()Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-direct {v0, v1, v2, v3, v4}, LF3/e;-><init>(Landroid/content/Context;Landroid/content/ComponentName;LF3/e$b;Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LE3/B2;->k:LF3/e;

    .line 30
    .line 31
    invoke-virtual {v0}, LF3/e;->a()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static synthetic f1(LE3/B2;LE3/B2$d;LE3/A$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p1, p1, LE3/B2$d;->b:LE3/U6;

    .line 6
    .line 7
    invoke-interface {p2, p0, p1}, LE3/A$c;->i0(LE3/A;LE3/U6;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic g(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-boolean p0, p0, LE3/M6;->i:Z

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->M(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic g1(LE3/B2;LE3/B2$e;LE3/A$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p1, p1, LE3/B2$e;->h:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-interface {p2, p0, p1}, LE3/A$c;->a0(LE3/A;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic h(LE3/B2;LF3/n$j;)V
    .locals 2

    .line 1
    new-instance v0, LF3/j;

    .line 2
    .line 3
    iget-object v1, p0, LE3/B2;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LF3/j;-><init>(Landroid/content/Context;LF3/n$j;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LE3/B2;->j:LF3/j;

    .line 9
    .line 10
    iget-object p1, p0, LE3/B2;->e:LE3/B2$c;

    .line 11
    .line 12
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p0, p0, LE3/A;->e:Landroid/os/Handler;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p0}, LF3/j;->s(LF3/j$a;Landroid/os/Handler;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic h1(LE3/B2;LE3/B2$d;LE3/A$c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p1, p1, LE3/B2$d;->f:LE3/V6;

    .line 6
    .line 7
    invoke-interface {p2, p0, p1}, LE3/A$c;->U(LE3/A;LE3/V6;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic i(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-object p0, p0, LE3/M6;->q:Lq2/p;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->n0(Lq2/p;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic i1(LE3/B2;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/List;Ljava/util/List;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, p3, p2, p4}, LE3/B2;->T1(Ljava/util/List;Ljava/util/List;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public static synthetic j(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->c:Lq2/P$b;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lq2/P$d;->I(Lq2/P$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic j1(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget p0, p0, LE3/M6;->y:I

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->J(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic k(Lq2/N;Lq2/P$d;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lq2/P$d;->t0(Lq2/N;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k1(LE3/B2;Lq2/P$d;Lq2/t;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lq2/P$c;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Lq2/P$c;-><init>(Lq2/t;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p0, v0}, Lq2/P$d;->X(Lq2/P;Lq2/P$c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic l(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-object p0, p0, LE3/M6;->m:Lq2/I;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->c0(Lq2/I;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic l1(LE3/B2;LE3/B2$d;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE3/r2;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LE3/r2;-><init>(LE3/B2;LE3/B2$d;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, LE3/A;->i1(Lt2/n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic m(LE3/B2$d;Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget v0, p0, LE3/M6;->r:I

    .line 4
    .line 5
    iget-boolean p0, p0, LE3/M6;->s:Z

    .line 6
    .line 7
    invoke-interface {p1, v0, p0}, Lq2/P$d;->P(IZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic m1(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget p0, p0, LE3/M6;->h:I

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->F(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic n(LE3/B2$d;LE3/B2$d;Ljava/lang/Integer;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-object p0, p0, LE3/M6;->c:LE3/W6;

    .line 4
    .line 5
    iget-object p0, p0, LE3/W6;->a:Lq2/P$e;

    .line 6
    .line 7
    iget-object p1, p1, LE3/B2$d;->a:LE3/M6;

    .line 8
    .line 9
    iget-object p1, p1, LE3/M6;->c:LE3/W6;

    .line 10
    .line 11
    iget-object p1, p1, LE3/W6;->a:Lq2/P$e;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-interface {p3, p0, p1, p2}, Lq2/P$d;->m0(Lq2/P$e;Lq2/P$e;I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic n1(LE3/B2$d;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-object p0, p0, LE3/M6;->o:Lq2/c;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lq2/P$d;->e0(Lq2/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic o(LE3/B2;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/B2;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 6
    .line 7
    invoke-virtual {v0}, LF3/j;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LE3/B2;->Z1()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static synthetic o1(LE3/B2$d;Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 2
    .line 3
    iget-object v0, p0, LE3/M6;->j:Lq2/Y;

    .line 4
    .line 5
    iget p0, p0, LE3/M6;->k:I

    .line 6
    .line 7
    invoke-interface {p1, v0, p0}, Lq2/P$d;->S(Lq2/Y;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic p1(LE3/B2;Lq2/P$d;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object p0, p0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object p0, p0, LE3/M6;->z:Lq2/I;

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lq2/P$d;->V(Lq2/I;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method static synthetic q1(LE3/B2;LF3/n$j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/B2;->H1(LF3/n$j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(LE3/B2;LE3/B2$d;LE3/A$c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, LE3/B2$d;->d:LP9/u;

    .line 6
    .line 7
    invoke-interface {p2, v0, v1}, LE3/A$c;->O(LE3/A;Ljava/util/List;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LE3/B2;->W1(Ljava/util/concurrent/Future;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p1, LE3/B2$d;->d:LP9/u;

    .line 19
    .line 20
    invoke-interface {p2, v0, v1}, LE3/A$c;->K(LE3/A;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object p1, p1, LE3/B2$d;->d:LP9/u;

    .line 28
    .line 29
    invoke-interface {p2, p0, p1}, LE3/A$c;->G(LE3/A;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method static synthetic r1(LE3/B2;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LE3/B2;->m:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic s1(LE3/B2;)LE3/B2$e;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2;->o:LE3/B2$e;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic t1(LE3/B2;LE3/B2$e;)LE3/B2$e;
    .locals 0

    .line 1
    iput-object p1, p0, LE3/B2;->o:LE3/B2$e;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic u1(LE3/B2;)LF3/j;
    .locals 0

    .line 1
    iget-object p0, p0, LE3/B2;->j:LF3/j;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic v1(LF3/v;)LF3/v;
    .locals 0

    .line 1
    invoke-static {p0}, LE3/B2;->J1(LF3/v;)LF3/v;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic w1(LE3/B2;ZLE3/B2$e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LE3/B2;->U1(ZLE3/B2$e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic x1(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LE3/B2;->I1(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic y1(LE3/B2;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LE3/B2;->p:Z

    .line 2
    .line 3
    return p1
.end method

.method static synthetic z1(LE3/B2;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LE3/B2;->i:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/B2;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public A0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/B2;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public B(Landroid/view/Surface;)V
    .locals 1

    .line 1
    const-string p1, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support setting Surface"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public B0()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    return v0
.end method

.method public C(Lq2/I;)V
    .locals 1

    .line 1
    const-string p1, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support setting playlist metadata"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public C0(ILq2/C;)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-static {p2}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p0, p1, v0, p2}, LE3/B2;->Q(IILjava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public D()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 6
    .line 7
    iget-boolean v0, v0, LE3/W6;->b:Z

    .line 8
    .line 9
    return v0
.end method

.method public D0(Ljava/util/List;IJ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LE3/B2;->G()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v1, LE3/O6;->g:LE3/O6;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, LE3/O6;->D(ILjava/util/List;)LE3/O6;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v4, p3, v4

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    const-wide/16 v4, 0x0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-wide/from16 v4, p3

    .line 35
    .line 36
    :goto_0
    iget-object v6, v0, LE3/B2;->q:LE3/B2$d;

    .line 37
    .line 38
    iget-object v6, v6, LE3/B2$d;->a:LE3/M6;

    .line 39
    .line 40
    invoke-interface/range {p1 .. p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lq2/C;

    .line 45
    .line 46
    move/from16 v7, p2

    .line 47
    .line 48
    invoke-static {v7, v3, v4, v5, v2}, LE3/B2;->L1(ILq2/C;JZ)Lq2/P$e;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const/4 v13, 0x0

    .line 53
    const-wide/16 v14, 0x0

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    const-wide/16 v11, 0x0

    .line 62
    .line 63
    invoke-static/range {v7 .. v15}, LE3/B2;->M1(Lq2/P$e;ZJJIJ)LE3/W6;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v6, v1, v3, v2}, LE3/M6;->w(Lq2/Y;LE3/W6;I)LE3/M6;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    new-instance v7, LE3/B2$d;

    .line 72
    .line 73
    iget-object v1, v0, LE3/B2;->q:LE3/B2$d;

    .line 74
    .line 75
    iget-object v9, v1, LE3/B2$d;->b:LE3/U6;

    .line 76
    .line 77
    iget-object v10, v1, LE3/B2$d;->c:Lq2/P$b;

    .line 78
    .line 79
    iget-object v11, v1, LE3/B2$d;->d:LP9/u;

    .line 80
    .line 81
    iget-object v12, v1, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    invoke-direct/range {v7 .. v13}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 85
    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-direct {v0, v7, v1, v1}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {v0}, LE3/B2;->Y1()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    invoke-direct {v0}, LE3/B2;->X1()V

    .line 98
    .line 99
    .line 100
    :cond_2
    return-void
.end method

.method public E()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 6
    .line 7
    iget-wide v0, v0, LE3/W6;->g:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public E0(I)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-direct {p0, p1, v0, v1}, LE3/B2;->a2(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public F(ZI)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LE3/B2;->P0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LE3/B2;->m0()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-instance v1, LE3/B2$d;

    .line 12
    .line 13
    iget-object v2, p0, LE3/B2;->q:LE3/B2$d;

    .line 14
    .line 15
    iget-object v2, v2, LE3/B2$d;->a:LE3/M6;

    .line 16
    .line 17
    invoke-virtual {v2, v0, p1}, LE3/M6;->d(IZ)LE3/M6;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 22
    .line 23
    iget-object v3, v0, LE3/B2$d;->b:LE3/U6;

    .line 24
    .line 25
    iget-object v4, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 26
    .line 27
    iget-object v5, v0, LE3/B2$d;->d:LP9/u;

    .line 28
    .line 29
    iget-object v6, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-direct/range {v1 .. v7}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, v1, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    if-eqz p1, :cond_1

    .line 40
    .line 41
    const/16 p1, -0x64

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/16 p1, 0x64

    .line 45
    .line 46
    :goto_0
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 47
    .line 48
    invoke-virtual {v0, p1, p2}, LF3/j;->b(II)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public F0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/M6;->B:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public G()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7fffffff

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, LE3/B2;->T(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public G0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/B2;->getCurrentPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public H(Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->d:Lt2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt2/v;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public H0(ILjava/util/List;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-static {v1}, Lt2/a;->a(Z)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-object v1, p0, LE3/B2;->q:LE3/B2$d;

    .line 18
    .line 19
    iget-object v1, v1, LE3/B2$d;->a:LE3/M6;

    .line 20
    .line 21
    iget-object v1, v1, LE3/M6;->j:Lq2/Y;

    .line 22
    .line 23
    check-cast v1, LE3/O6;

    .line 24
    .line 25
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, p2}, LE3/B2;->c2(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    invoke-virtual {p0}, LE3/B2;->h0()Lq2/Y;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Lq2/Y;->t()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {v1, p1, p2}, LE3/O6;->D(ILjava/util/List;)LE3/O6;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0}, LE3/B2;->K0()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v2, p1, v3}, LE3/B2;->D1(III)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iget-object v3, p0, LE3/B2;->q:LE3/B2$d;

    .line 64
    .line 65
    iget-object v3, v3, LE3/B2$d;->a:LE3/M6;

    .line 66
    .line 67
    invoke-virtual {v3, v1, v2, v0}, LE3/M6;->v(Lq2/Y;II)LE3/M6;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    new-instance v4, LE3/B2$d;

    .line 72
    .line 73
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 74
    .line 75
    iget-object v6, v0, LE3/B2$d;->b:LE3/U6;

    .line 76
    .line 77
    iget-object v7, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 78
    .line 79
    iget-object v8, v0, LE3/B2$d;->d:LP9/u;

    .line 80
    .line 81
    iget-object v9, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    invoke-direct/range {v4 .. v10}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    invoke-direct {p0, v4, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p0}, LE3/B2;->Y1()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-direct {p0, p2, p1}, LE3/B2;->B1(Ljava/util/List;I)V

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_1
    return-void
.end method

.method public I()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 6
    .line 7
    iget v0, v0, LE3/W6;->f:I

    .line 8
    .line 9
    return v0
.end method

.method public I0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 6
    .line 7
    iget-wide v0, v0, LE3/W6;->e:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public J()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LF3/j$f;->r()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public J0()Lq2/I;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->m:Lq2/I;

    .line 6
    .line 7
    return-object v0
.end method

.method public K()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LE3/B2;->K0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-direct {p0, v0, v1, v2}, LE3/B2;->a2(IJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public K0()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 6
    .line 7
    iget-object v0, v0, LE3/W6;->a:Lq2/P$e;

    .line 8
    .line 9
    iget v0, v0, Lq2/P$e;->c:I

    .line 10
    .line 11
    return v0
.end method

.method public L(Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE3/B2;->c2(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public L0(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    const-string p1, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support clearing SurfaceView"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public M()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, LE3/B2;->X(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public M0(II)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p2}, LE3/B2;->N0(III)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public N(I)V
    .locals 10

    .line 1
    invoke-virtual {p0}, LE3/B2;->m0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LE3/B2;->getDeviceInfo()Lq2/p;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lq2/p;->c:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    add-int/lit8 v3, v0, 0x1

    .line 15
    .line 16
    if-gt v3, v1, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, LE3/B2;->P0()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v3, LE3/B2$d;

    .line 23
    .line 24
    iget-object v4, p0, LE3/B2;->q:LE3/B2$d;

    .line 25
    .line 26
    iget-object v4, v4, LE3/B2$d;->a:LE3/M6;

    .line 27
    .line 28
    add-int/2addr v0, v2

    .line 29
    invoke-virtual {v4, v0, v1}, LE3/M6;->d(IZ)LE3/M6;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 34
    .line 35
    iget-object v5, v0, LE3/B2$d;->b:LE3/U6;

    .line 36
    .line 37
    iget-object v6, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 38
    .line 39
    iget-object v7, v0, LE3/B2$d;->d:LP9/u;

    .line 40
    .line 41
    iget-object v8, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    invoke-direct/range {v3 .. v9}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, v3, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 52
    .line 53
    invoke-virtual {v0, v2, p1}, LF3/j;->b(II)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public N0(III)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    if-gt p1, p2, :cond_0

    .line 5
    .line 6
    if-ltz p3, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v0

    .line 11
    :goto_0
    invoke-static {v1}, Lt2/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LE3/B2;->q:LE3/B2$d;

    .line 15
    .line 16
    iget-object v1, v1, LE3/B2$d;->a:LE3/M6;

    .line 17
    .line 18
    iget-object v1, v1, LE3/M6;->j:Lq2/Y;

    .line 19
    .line 20
    check-cast v1, LE3/O6;

    .line 21
    .line 22
    invoke-virtual {v1}, LE3/O6;->t()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    sub-int v3, p2, p1

    .line 31
    .line 32
    sub-int v4, v2, v3

    .line 33
    .line 34
    add-int/lit8 v5, v4, -0x1

    .line 35
    .line 36
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-ge p1, v2, :cond_4

    .line 41
    .line 42
    if-eq p1, p2, :cond_4

    .line 43
    .line 44
    if-ne p1, p3, :cond_1

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_1
    invoke-virtual {p0}, LE3/B2;->K0()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v2, p1, p2}, LE3/B2;->E1(III)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    const/4 v4, -0x1

    .line 57
    if-ne v2, v4, :cond_2

    .line 58
    .line 59
    invoke-static {p1, v0, v5}, Lt2/a0;->r(III)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v5, "Currently playing item will be removed and added back to mimic move. Assumes item at "

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v5, " would be the new current item"

    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    const-string v5, "MCImplLegacy"

    .line 86
    .line 87
    invoke-static {v5, v4}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-static {v2, p3, v3}, LE3/B2;->D1(III)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-virtual {v1, p1, p2, p3}, LE3/O6;->B(III)LE3/O6;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    iget-object v1, p0, LE3/B2;->q:LE3/B2$d;

    .line 99
    .line 100
    iget-object v1, v1, LE3/B2$d;->a:LE3/M6;

    .line 101
    .line 102
    invoke-virtual {v1, p2, v2, v0}, LE3/M6;->v(Lq2/Y;II)LE3/M6;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    new-instance v4, LE3/B2$d;

    .line 107
    .line 108
    iget-object p2, p0, LE3/B2;->q:LE3/B2$d;

    .line 109
    .line 110
    iget-object v6, p2, LE3/B2$d;->b:LE3/U6;

    .line 111
    .line 112
    iget-object v7, p2, LE3/B2$d;->c:Lq2/P$b;

    .line 113
    .line 114
    iget-object v8, p2, LE3/B2$d;->d:LP9/u;

    .line 115
    .line 116
    iget-object v9, p2, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 117
    .line 118
    const/4 v10, 0x0

    .line 119
    invoke-direct/range {v4 .. v10}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 120
    .line 121
    .line 122
    const/4 p2, 0x0

    .line 123
    invoke-direct {p0, v4, p2, p2}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {p0}, LE3/B2;->Y1()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_4

    .line 131
    .line 132
    new-instance p2, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    move v1, v0

    .line 138
    :goto_1
    if-ge v1, v3, :cond_3

    .line 139
    .line 140
    iget-object v2, p0, LE3/B2;->n:LE3/B2$e;

    .line 141
    .line 142
    iget-object v2, v2, LE3/B2$e;->d:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, LF3/n$h;

    .line 149
    .line 150
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    iget-object v2, p0, LE3/B2;->j:LF3/j;

    .line 154
    .line 155
    iget-object v4, p0, LE3/B2;->n:LE3/B2$e;

    .line 156
    .line 157
    iget-object v4, v4, LE3/B2$e;->d:Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    check-cast v4, LF3/n$h;

    .line 164
    .line 165
    invoke-virtual {v4}, LF3/n$h;->c()LF3/l;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v2, v4}, LF3/j;->t(LF3/l;)V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v1, v1, 0x1

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-ge v0, p1, :cond_4

    .line 180
    .line 181
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, LF3/n$h;

    .line 186
    .line 187
    iget-object v1, p0, LE3/B2;->j:LF3/j;

    .line 188
    .line 189
    invoke-virtual {p1}, LF3/n$h;->c()LF3/l;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    add-int v2, v0, p3

    .line 194
    .line 195
    invoke-virtual {v1, p1, v2}, LF3/j;->a(LF3/l;I)V

    .line 196
    .line 197
    .line 198
    add-int/lit8 v0, v0, 0x1

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_4
    :goto_3
    return-void
.end method

.method public O(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    const-string p1, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support setting SurfaceView"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public O0(Ljava/util/List;)V
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0, p1}, LE3/B2;->H0(ILjava/util/List;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public P(Lq2/d0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public P0()Z
    .locals 3

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v1, v0, LE3/M6;->q:Lq2/p;

    .line 6
    .line 7
    iget v1, v1, Lq2/p;->a:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-boolean v0, v0, LE3/M6;->s:Z

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, LF3/j;->i()LF3/j$e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LE3/t;->m(LF3/j$e;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public P1()LF3/e;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->k:LF3/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public Q(IILjava/util/List;)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    if-gt p1, p2, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 12
    .line 13
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 14
    .line 15
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 16
    .line 17
    check-cast v0, LE3/O6;

    .line 18
    .line 19
    invoke-virtual {v0}, LE3/O6;->t()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-le p1, v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p0, p2, p3}, LE3/B2;->H0(ILjava/util/List;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, LE3/B2;->T(II)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public Q0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-boolean v0, v0, LE3/M6;->i:Z

    .line 6
    .line 7
    return v0
.end method

.method Q1()LE3/A;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->b:LE3/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public R(I)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, LE3/B2;->T(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public R0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/B2;->I0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public S()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->c:LE3/Y6;

    .line 2
    .line 3
    invoke-virtual {v0}, LE3/Y6;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LE3/B2;->c:LE3/Y6;

    .line 10
    .line 11
    invoke-virtual {v0}, LE3/Y6;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lt2/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, LF3/n$j;

    .line 20
    .line 21
    invoke-direct {p0, v0}, LE3/B2;->H1(LF3/n$j;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-direct {p0}, LE3/B2;->G1()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public S0(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LE3/B2;->z0(II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public T(II)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-lt p2, p1, :cond_0

    .line 6
    .line 7
    move v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v2, v0

    .line 10
    :goto_0
    invoke-static {v2}, Lt2/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, LE3/B2;->h0()Lq2/Y;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lq2/Y;->t()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, v2, :cond_3

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_1
    iget-object v2, p0, LE3/B2;->q:LE3/B2$d;

    .line 32
    .line 33
    iget-object v2, v2, LE3/B2$d;->a:LE3/M6;

    .line 34
    .line 35
    iget-object v2, v2, LE3/M6;->j:Lq2/Y;

    .line 36
    .line 37
    check-cast v2, LE3/O6;

    .line 38
    .line 39
    invoke-virtual {v2, p1, p2}, LE3/O6;->E(II)LE3/O6;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p0}, LE3/B2;->K0()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v3, p1, p2}, LE3/B2;->E1(III)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, -0x1

    .line 52
    if-ne v3, v4, :cond_2

    .line 53
    .line 54
    invoke-virtual {v2}, LE3/O6;->t()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    sub-int/2addr v3, v1

    .line 59
    invoke-static {p1, v0, v3}, Lt2/a0;->r(III)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v4, "Currently playing item is removed. Assumes item at "

    .line 69
    .line 70
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v4, " is the new current item"

    .line 77
    .line 78
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v4, "MCImplLegacy"

    .line 86
    .line 87
    invoke-static {v4, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    iget-object v1, p0, LE3/B2;->q:LE3/B2$d;

    .line 91
    .line 92
    iget-object v1, v1, LE3/B2$d;->a:LE3/M6;

    .line 93
    .line 94
    invoke-virtual {v1, v2, v3, v0}, LE3/M6;->v(Lq2/Y;II)LE3/M6;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    new-instance v4, LE3/B2$d;

    .line 99
    .line 100
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 101
    .line 102
    iget-object v6, v0, LE3/B2$d;->b:LE3/U6;

    .line 103
    .line 104
    iget-object v7, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 105
    .line 106
    iget-object v8, v0, LE3/B2$d;->d:LP9/u;

    .line 107
    .line 108
    iget-object v9, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 109
    .line 110
    const/4 v10, 0x0

    .line 111
    invoke-direct/range {v4 .. v10}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-direct {p0, v4, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0}, LE3/B2;->Y1()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    :goto_1
    if-ge p1, p2, :cond_3

    .line 125
    .line 126
    iget-object v0, p0, LE3/B2;->n:LE3/B2$e;

    .line 127
    .line 128
    iget-object v0, v0, LE3/B2$e;->d:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-ge p1, v0, :cond_3

    .line 135
    .line 136
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 137
    .line 138
    iget-object v1, p0, LE3/B2;->n:LE3/B2$e;

    .line 139
    .line 140
    iget-object v1, v1, LE3/B2$e;->d:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, LF3/n$h;

    .line 147
    .line 148
    invoke-virtual {v1}, LF3/n$h;->c()LF3/l;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, LF3/j;->t(LF3/l;)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 p1, p1, 0x1

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    :goto_2
    return-void
.end method

.method public T0()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LF3/j$f;->a()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public U()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LF3/j$f;->r()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public U0()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LF3/j$f;->k()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public V(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v1, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-boolean v0, v1, LE3/M6;->t:Z

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-wide v2, p0, LE3/B2;->r:J

    .line 11
    .line 12
    iget-wide v4, p0, LE3/B2;->s:J

    .line 13
    .line 14
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LE3/A;->f1()J

    .line 19
    .line 20
    .line 21
    move-result-wide v6

    .line 22
    invoke-static/range {v1 .. v7}, LE3/L6;->e(LE3/M6;JJJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, p0, LE3/B2;->r:J

    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iput-wide v0, p0, LE3/B2;->s:J

    .line 33
    .line 34
    new-instance v2, LE3/B2$d;

    .line 35
    .line 36
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 37
    .line 38
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-virtual {v0, p1, v1, v3}, LE3/M6;->j(ZII)LE3/M6;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 47
    .line 48
    iget-object v4, v0, LE3/B2$d;->b:LE3/U6;

    .line 49
    .line 50
    iget-object v5, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 51
    .line 52
    iget-object v6, v0, LE3/B2$d;->d:LP9/u;

    .line 53
    .line 54
    iget-object v7, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-direct/range {v2 .. v8}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, v2, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, LE3/B2;->Y1()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    invoke-direct {p0}, LE3/B2;->V1()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    iget-object p1, p0, LE3/B2;->j:LF3/j;

    .line 79
    .line 80
    invoke-virtual {p1}, LF3/j;->p()LF3/j$f;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, LF3/j$f;->c()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    iget-object p1, p0, LE3/B2;->j:LF3/j;

    .line 89
    .line 90
    invoke-virtual {p1}, LF3/j;->p()LF3/j$f;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, LF3/j$f;->b()V

    .line 95
    .line 96
    .line 97
    :cond_2
    :goto_0
    return-void
.end method

.method public V0()Lq2/I;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    invoke-virtual {v0}, LE3/M6;->C()Lq2/C;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lq2/I;->K:Lq2/I;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, v0, Lq2/C;->e:Lq2/I;

    .line 15
    .line 16
    return-object v0
.end method

.method public W()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LF3/j$f;->q()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public W0(Lq2/c;Z)V
    .locals 0

    .line 1
    const-string p1, "MCImplLegacy"

    .line 2
    .line 3
    const-string p2, "Legacy session doesn\'t support setting audio attributes remotely"

    .line 4
    .line 5
    invoke-static {p1, p2}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public X(I)V
    .locals 9

    .line 1
    invoke-virtual {p0}, LE3/B2;->m0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LE3/B2;->getDeviceInfo()Lq2/p;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lq2/p;->b:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LE3/B2;->P0()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    new-instance v2, LE3/B2$d;

    .line 20
    .line 21
    iget-object v3, p0, LE3/B2;->q:LE3/B2$d;

    .line 22
    .line 23
    iget-object v3, v3, LE3/B2$d;->a:LE3/M6;

    .line 24
    .line 25
    invoke-virtual {v3, v0, v1}, LE3/M6;->d(IZ)LE3/M6;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 30
    .line 31
    iget-object v4, v0, LE3/B2$d;->b:LE3/U6;

    .line 32
    .line 33
    iget-object v5, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 34
    .line 35
    iget-object v6, v0, LE3/B2$d;->d:LP9/u;

    .line 36
    .line 37
    iget-object v7, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    invoke-direct/range {v2 .. v8}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, v2, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 48
    .line 49
    const/4 v1, -0x1

    .line 50
    invoke-virtual {v0, v1, p1}, LF3/j;->b(II)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public X0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/M6;->A:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public Y()Lq2/h0;
    .locals 1

    .line 1
    sget-object v0, Lq2/h0;->b:Lq2/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y0()LE3/U6;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->b:LE3/U6;

    .line 4
    .line 5
    return-object v0
.end method

.method public Z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/B2;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public Z0(LE3/T6;Landroid/os/Bundle;)Lcom/google/common/util/concurrent/p;
    .locals 3

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->b:LE3/U6;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LE3/U6;->c(LE3/T6;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 12
    .line 13
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object p1, p1, LE3/T6;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, LF3/j$f;->m(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, LE3/X6;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {p1, p2}, LE3/X6;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/google/common/util/concurrent/j;->d(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-static {}, Lcom/google/common/util/concurrent/w;->J()Lcom/google/common/util/concurrent/w;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, LE3/B2$a;

    .line 38
    .line 39
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v2, v2, LE3/A;->e:Landroid/os/Handler;

    .line 44
    .line 45
    invoke-direct {v1, p0, v2, v0}, LE3/B2$a;-><init>(LE3/B2;Landroid/os/Handler;Lcom/google/common/util/concurrent/w;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, LE3/B2;->j:LF3/j;

    .line 49
    .line 50
    iget-object p1, p1, LE3/T6;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2, p1, p2, v1}, LF3/j;->u(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method Z1()V
    .locals 10

    .line 1
    iget-boolean v0, p0, LE3/B2;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, LE3/B2;->m:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LE3/B2;->m:Z

    .line 12
    .line 13
    new-instance v1, LE3/B2$e;

    .line 14
    .line 15
    iget-object v2, p0, LE3/B2;->j:LF3/j;

    .line 16
    .line 17
    invoke-virtual {v2}, LF3/j;->i()LF3/j$e;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, LE3/B2;->j:LF3/j;

    .line 22
    .line 23
    invoke-virtual {v3}, LF3/j;->j()LF3/v;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, LE3/B2;->J1(LF3/v;)LF3/v;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, p0, LE3/B2;->j:LF3/j;

    .line 32
    .line 33
    invoke-virtual {v4}, LF3/j;->g()LF3/m;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v5, p0, LE3/B2;->j:LF3/j;

    .line 38
    .line 39
    invoke-virtual {v5}, LF3/j;->k()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {v5}, LE3/B2;->I1(Ljava/util/List;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v6, p0, LE3/B2;->j:LF3/j;

    .line 48
    .line 49
    invoke-virtual {v6}, LF3/j;->l()Ljava/lang/CharSequence;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    iget-object v7, p0, LE3/B2;->j:LF3/j;

    .line 54
    .line 55
    invoke-virtual {v7}, LF3/j;->n()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget-object v8, p0, LE3/B2;->j:LF3/j;

    .line 60
    .line 61
    invoke-virtual {v8}, LF3/j;->o()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    iget-object v9, p0, LE3/B2;->j:LF3/j;

    .line 66
    .line 67
    invoke-virtual {v9}, LF3/j;->d()Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-direct/range {v1 .. v9}, LE3/B2$e;-><init>(LF3/j$e;LF3/v;LF3/m;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, v0, v1}, LE3/B2;->U1(ZLE3/B2$e;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    return-void
.end method

.method public a()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LE3/B2;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LE3/B2;->l:Z

    .line 8
    .line 9
    iget-object v0, p0, LE3/B2;->k:LF3/e;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, LF3/e;->b()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, LE3/B2;->k:LF3/e;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v2, p0, LE3/B2;->e:LE3/B2$c;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, LF3/j;->w(LF3/j$a;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LE3/B2;->e:LE3/B2$c;

    .line 29
    .line 30
    invoke-virtual {v0}, LE3/B2$c;->r()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, LE3/B2;->j:LF3/j;

    .line 34
    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, LE3/B2;->m:Z

    .line 37
    .line 38
    iget-object v0, p0, LE3/B2;->d:Lt2/v;

    .line 39
    .line 40
    invoke-virtual {v0}, Lt2/v;->i()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public a0(Lq2/P$d;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->d:Lt2/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt2/v;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a1()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->h:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object v0
.end method

.method public b0()Ls2/e;
    .locals 2

    .line 1
    const-string v0, "MCImplLegacy"

    .line 2
    .line 3
    const-string v1, "Session doesn\'t support getting Cue"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Ls2/e;->d:Ls2/e;

    .line 9
    .line 10
    return-object v0
.end method

.method public b2(Lq2/C;)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, LE3/B2;->f0(Lq2/C;J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c()Lq2/O;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->g:Lq2/O;

    .line 6
    .line 7
    return-object v0
.end method

.method public c0()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    return v0
.end method

.method public c2(Ljava/util/List;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, v0, v1, v2}, LE3/B2;->D0(Ljava/util/List;IJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d0(Lq2/C;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE3/B2;->b2(Lq2/C;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e(Lq2/O;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LE3/B2;->c()Lq2/O;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lq2/O;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v1, LE3/B2$d;

    .line 12
    .line 13
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 14
    .line 15
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LE3/M6;->k(Lq2/O;)LE3/M6;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 22
    .line 23
    iget-object v3, v0, LE3/B2$d;->b:LE3/U6;

    .line 24
    .line 25
    iget-object v4, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 26
    .line 27
    iget-object v5, v0, LE3/B2$d;->d:LP9/u;

    .line 28
    .line 29
    iget-object v6, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-direct/range {v1 .. v7}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, v1, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 40
    .line 41
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget p1, p1, Lq2/O;->a:F

    .line 46
    .line 47
    invoke-virtual {v0, p1}, LF3/j$f;->n(F)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public e0(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, LE3/B2;->F(ZI)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public f0(Lq2/C;J)V
    .locals 1

    .line 1
    invoke-static {p1}, LP9/u;->B(Ljava/lang/Object;)LP9/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0, p2, p3}, LE3/B2;->D0(Ljava/util/List;IJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g0()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getCurrentPosition()J
    .locals 8

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v1, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-wide v2, p0, LE3/B2;->r:J

    .line 6
    .line 7
    iget-wide v4, p0, LE3/B2;->s:J

    .line 8
    .line 9
    invoke-virtual {p0}, LE3/B2;->Q1()LE3/A;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LE3/A;->f1()J

    .line 14
    .line 15
    .line 16
    move-result-wide v6

    .line 17
    invoke-static/range {v1 .. v7}, LE3/L6;->e(LE3/M6;JJJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p0, LE3/B2;->r:J

    .line 22
    .line 23
    return-wide v0
.end method

.method public getDeviceInfo()Lq2/p;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->q:Lq2/p;

    .line 6
    .line 7
    return-object v0
.end method

.method public getDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->c:LE3/W6;

    .line 6
    .line 7
    iget-wide v0, v0, LE3/W6;->d:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public h0()Lq2/Y;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->j:Lq2/Y;

    .line 6
    .line 7
    return-object v0
.end method

.method public i0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, LE3/B2;->N(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public isPlaying()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-boolean v0, v0, LE3/M6;->v:Z

    .line 6
    .line 7
    return v0
.end method

.method public j0()Lq2/d0;
    .locals 1

    .line 1
    sget-object v0, Lq2/d0;->F:Lq2/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public k0()V
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LF3/j$f;->q()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public l0(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    const-string p1, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support setting TextureView"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public m0()I
    .locals 3

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v1, v0, LE3/M6;->q:Lq2/p;

    .line 6
    .line 7
    iget v1, v1, Lq2/p;->a:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget v0, v0, LE3/M6;->r:I

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, LF3/j;->i()LF3/j$e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, LE3/t;->i(LF3/j$e;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public n0()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public o0(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LE3/B2;->a2(IJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public p()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget v0, v0, LE3/M6;->y:I

    .line 6
    .line 7
    return v0
.end method

.method public p0()Lq2/P$b;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 4
    .line 5
    return-object v0
.end method

.method public pause()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LE3/B2;->V(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public q0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-boolean v0, v0, LE3/M6;->t:Z

    .line 6
    .line 7
    return v0
.end method

.method public r0(Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LE3/B2;->Q0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LE3/B2$d;

    .line 8
    .line 9
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 10
    .line 11
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LE3/M6;->t(Z)LE3/M6;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 18
    .line 19
    iget-object v3, v0, LE3/B2$d;->b:LE3/U6;

    .line 20
    .line 21
    iget-object v4, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 22
    .line 23
    iget-object v5, v0, LE3/B2$d;->d:LP9/u;

    .line 24
    .line 25
    iget-object v6, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-direct/range {v1 .. v7}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, v1, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 36
    .line 37
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {p1}, LE3/t;->M(Z)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {v0, p1}, LF3/j$f;->p(I)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public s()V
    .locals 10

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget v1, v0, LE3/M6;->y:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    new-instance v3, LE3/B2$d;

    .line 12
    .line 13
    iget-object v1, v0, LE3/M6;->j:Lq2/Y;

    .line 14
    .line 15
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v1, 0x2

    .line 24
    :goto_0
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v1, v2}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 30
    .line 31
    iget-object v5, v0, LE3/B2$d;->b:LE3/U6;

    .line 32
    .line 33
    iget-object v6, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 34
    .line 35
    iget-object v7, v0, LE3/B2$d;->d:LP9/u;

    .line 36
    .line 37
    iget-object v8, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    invoke-direct/range {v3 .. v9}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v3, v2, v2}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, LE3/B2;->V1()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-direct {p0}, LE3/B2;->X1()V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_1
    return-void
.end method

.method public s0()J
    .locals 2

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-wide v0, v0, LE3/M6;->C:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public stop()V
    .locals 12

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget v1, v0, LE3/M6;->y:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v1, v0, LE3/M6;->c:LE3/W6;

    .line 12
    .line 13
    iget-object v3, v1, LE3/W6;->a:Lq2/P$e;

    .line 14
    .line 15
    iget-wide v5, v1, LE3/W6;->d:J

    .line 16
    .line 17
    iget-wide v7, v3, Lq2/P$e;->g:J

    .line 18
    .line 19
    invoke-static {v7, v8, v5, v6}, LE3/L6;->c(JJ)I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    const-wide/16 v10, 0x0

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static/range {v3 .. v11}, LE3/B2;->M1(Lq2/P$e;ZJJIJ)LE3/W6;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, LE3/M6;->s(LE3/W6;)LE3/M6;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, LE3/B2;->q:LE3/B2$d;

    .line 35
    .line 36
    iget-object v1, v1, LE3/B2$d;->a:LE3/M6;

    .line 37
    .line 38
    iget v3, v1, LE3/M6;->y:I

    .line 39
    .line 40
    if-eq v3, v2, :cond_1

    .line 41
    .line 42
    iget-object v1, v1, LE3/M6;->a:Lq2/N;

    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, LE3/M6;->l(ILq2/N;)LE3/M6;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_1
    move-object v2, v0

    .line 49
    new-instance v1, LE3/B2$d;

    .line 50
    .line 51
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 52
    .line 53
    iget-object v3, v0, LE3/B2$d;->b:LE3/U6;

    .line 54
    .line 55
    iget-object v4, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 56
    .line 57
    iget-object v5, v0, LE3/B2$d;->d:LP9/u;

    .line 58
    .line 59
    iget-object v6, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-direct/range {v1 .. v7}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-direct {p0, v1, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 70
    .line 71
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, LF3/j$f;->t()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public t(F)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LE3/B2;->c()Lq2/O;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lq2/O;->a:F

    .line 6
    .line 7
    cmpl-float v0, p1, v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, LE3/B2$d;

    .line 12
    .line 13
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 14
    .line 15
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 16
    .line 17
    new-instance v2, Lq2/O;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lq2/O;-><init>(F)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, LE3/M6;->k(Lq2/O;)LE3/M6;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 27
    .line 28
    iget-object v3, v0, LE3/B2$d;->b:LE3/U6;

    .line 29
    .line 30
    iget-object v4, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 31
    .line 32
    iget-object v5, v0, LE3/B2$d;->d:LP9/u;

    .line 33
    .line 34
    iget-object v6, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-direct/range {v1 .. v7}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, v1, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 45
    .line 46
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, p1}, LF3/j$f;->n(F)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public t0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LE3/B2;->getDuration()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public u()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, LE3/B2;->V(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public u0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/B2;->K0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public v(I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LE3/B2;->x()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LE3/B2$d;

    .line 8
    .line 9
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 10
    .line 11
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LE3/M6;->p(I)LE3/M6;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 18
    .line 19
    iget-object v3, v0, LE3/B2$d;->b:LE3/U6;

    .line 20
    .line 21
    iget-object v4, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 22
    .line 23
    iget-object v5, v0, LE3/B2$d;->d:LP9/u;

    .line 24
    .line 25
    iget-object v6, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-direct/range {v1 .. v7}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, v1, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 36
    .line 37
    invoke-virtual {v0}, LF3/j;->p()LF3/j$f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {p1}, LE3/t;->L(I)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {v0, p1}, LF3/j$f;->o(I)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public v0(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    const-string p1, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support clearing TextureView"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w(F)V
    .locals 1

    .line 1
    const-string p1, "MCImplLegacy"

    .line 2
    .line 3
    const-string v0, "Session doesn\'t support setting player volume"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w0()Lq2/l0;
    .locals 2

    .line 1
    const-string v0, "MCImplLegacy"

    .line 2
    .line 3
    const-string v1, "Session doesn\'t support getting VideoSize"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lq2/l0;->e:Lq2/l0;

    .line 9
    .line 10
    return-object v0
.end method

.method public x()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget v0, v0, LE3/M6;->h:I

    .line 6
    .line 7
    return v0
.end method

.method public x0()F
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    return v0
.end method

.method public y()Lq2/N;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->a:Lq2/N;

    .line 6
    .line 7
    return-object v0
.end method

.method public y0()Lq2/c;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 2
    .line 3
    iget-object v0, v0, LE3/B2$d;->a:LE3/M6;

    .line 4
    .line 5
    iget-object v0, v0, LE3/M6;->o:Lq2/c;

    .line 6
    .line 7
    return-object v0
.end method

.method public z(J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE3/B2;->K0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0, p1, p2}, LE3/B2;->a2(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public z0(II)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LE3/B2;->getDeviceInfo()Lq2/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lq2/p;->b:I

    .line 6
    .line 7
    iget v0, v0, Lq2/p;->c:I

    .line 8
    .line 9
    if-gt v1, p1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-gt p1, v0, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, LE3/B2;->P0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v1, LE3/B2$d;

    .line 20
    .line 21
    iget-object v2, p0, LE3/B2;->q:LE3/B2$d;

    .line 22
    .line 23
    iget-object v2, v2, LE3/B2$d;->a:LE3/M6;

    .line 24
    .line 25
    invoke-virtual {v2, p1, v0}, LE3/M6;->d(IZ)LE3/M6;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v0, p0, LE3/B2;->q:LE3/B2$d;

    .line 30
    .line 31
    iget-object v3, v0, LE3/B2$d;->b:LE3/U6;

    .line 32
    .line 33
    iget-object v4, v0, LE3/B2$d;->c:Lq2/P$b;

    .line 34
    .line 35
    iget-object v5, v0, LE3/B2$d;->d:LP9/u;

    .line 36
    .line 37
    iget-object v6, v0, LE3/B2$d;->e:Landroid/os/Bundle;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-direct/range {v1 .. v7}, LE3/B2$d;-><init>(LE3/M6;LE3/U6;Lq2/P$b;LP9/u;Landroid/os/Bundle;LE3/V6;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, v1, v0, v0}, LE3/B2;->e2(LE3/B2$d;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v0, p0, LE3/B2;->j:LF3/j;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2}, LF3/j;->v(II)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
